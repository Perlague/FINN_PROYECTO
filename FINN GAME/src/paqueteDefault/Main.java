package paqueteDefault;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {

    public static Container con;
    
    public static JFrame ventana;
    public static JPanel panelTitulo, 
                  panelBotonInicio, 
                  panelAreaTexto,
                  panelBotones;
    
    public static JLabel etiquetaTitulo;
    
    public static JButton botonInicio,
                   boton1, boton2, boton3, boton4;
    
    public static JTextArea areaTexto;
    
    public static Font fuenteTitulo = 
            new Font("Times New Roman", Font.PLAIN, 50);
    
    public static Font fuenteNormal = 
            new Font("Times New Roman", Font.PLAIN, 28);
    
    public static EscuchaBotonInicio escuchaBotonInicio = new EscuchaBotonInicio();
    public static EscuchaBotones escuchaBotones = new EscuchaBotones();
    
    public static Historia historia = new Historia();
    
    public static String opcion;

    
    public static void main(String[] args) {
        // Creación de la ventana:
        ventana = new JFrame(); // Asegúrate de crear una nueva instancia de JFrame
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());
        ventana.setResizable(false);
        
        // Creación del panel de fondo:
        JPanel panelFondo = new PanelConImagen("/imagenes/fondo.jpg");
        panelFondo.setLayout(null);
        ventana.setContentPane(panelFondo);
        
        con = ventana.getContentPane();
        
        // Creación Título:
        panelTitulo = new JPanel();
        panelTitulo.setBounds(50, 150, 700, 100);
        panelTitulo.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
        
        etiquetaTitulo = new JLabel("FINN: THE GAME");
        etiquetaTitulo.setForeground(Color.white);
        etiquetaTitulo.setFont(fuenteTitulo);
        
        panelTitulo.add(etiquetaTitulo);
        con.add(panelTitulo);
        
        // Creación del Botón Inicio:
        panelBotonInicio = new JPanel();
        panelBotonInicio.setBounds(200, 350, 400, 100);
        panelBotonInicio.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
        
        botonInicio = new JButton("INICIAR");
        botonInicio.setBackground(Color.black);
        botonInicio.setForeground(Color.white);
        botonInicio.setFont(fuenteNormal);
        botonInicio.setFocusPainted(false);
        botonInicio.addActionListener(escuchaBotonInicio);

        panelBotonInicio.add(botonInicio);
        con.add(panelBotonInicio);
        
        ventana.setVisible(true);
    }
    
    static void LayoutPrincipal() {
        // Creación Area de Texto:
        panelAreaTexto = new JPanel();
        panelAreaTexto.setBounds(100, 100, 600, 250);
        panelAreaTexto.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
        
        areaTexto = new JTextArea();
        areaTexto.setBounds(100, 100, 600, 250);
        areaTexto.setBackground(Color.black);
        areaTexto.setForeground(Color.white);
        areaTexto.setLineWrap(true);
        areaTexto.setFont(fuenteNormal);
                
        panelAreaTexto.add(areaTexto);
        con.add(panelAreaTexto);
        
        // Creación Botones
        panelBotones = new JPanel();
        panelBotones.setBounds(200, 350, 400, 150);
        panelBotones.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
        panelBotones.setLayout(new GridLayout(4,1));
        
        boton1 = new JButton();
        boton1.setBackground(Color.black);
        boton1.setForeground(Color.white);
        boton1.setFont(fuenteNormal);
        boton1.setFocusPainted(false);
        panelBotones.add(boton1);
        
        boton1.addActionListener(escuchaBotones);
        boton1.setActionCommand("b1");

        boton2 = new JButton();
        boton2.setBackground(Color.black);
        boton2.setForeground(Color.white);
        boton2.setFont(fuenteNormal);
        boton2.setFocusPainted(false);
        panelBotones.add(boton2);
        
        boton2.addActionListener(escuchaBotones);
        boton2.setActionCommand("b2");
        
        boton3 = new JButton();
        boton3.setBackground(Color.black);
        boton3.setForeground(Color.white);
        boton3.setFont(fuenteNormal);
        boton3.setFocusPainted(false);
        panelBotones.add(boton3);
        
        boton3.addActionListener(escuchaBotones);
        boton3.setActionCommand("b3");
        
        boton4 = new JButton();
        boton4.setBackground(Color.black);
        boton4.setForeground(Color.white);
        boton4.setFont(fuenteNormal);
        boton4.setFocusPainted(false);
        panelBotones.add(boton4);
        
        boton4.addActionListener(escuchaBotones);
        boton4.setActionCommand("b4");
        
        con.add(panelBotones);
        
        historia.exploracionBosque();
    }
    
    public static class EscuchaBotonInicio implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            panelBotonInicio.setVisible(false);
            panelTitulo.setVisible(false);
            LayoutPrincipal();
        }
    }
    
    public static class EscuchaBotones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            opcion = evento.getActionCommand();
            
            switch (opcion) {
                case "b1" -> historia.decision(historia.opcion1);
                case "b2" -> historia.decision(historia.opcion2);
                case "b3" -> historia.decision(historia.opcion3);
                case "b4" -> historia.decision(historia.opcion4);
            } // switch
            
        } // actionPerformed(ActionEvent evento)
        
    } //class EscuchaBotones

}// Clase Main

class PanelConImagen extends JPanel {
    private Image imagen;

    public PanelConImagen(String rutaImagen) {
        this.imagen = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}