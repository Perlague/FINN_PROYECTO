package paqueteDefault;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Historia {
    
    public String opcion1, opcion2, opcion3, opcion4;

    public void decision(String eleccion) {
        switch (eleccion) {
            case "exploracionBosque" -> this.exploracionBosque();
            case "rio" -> this.rio();
            case "regresar" -> this.regresar();
            case "arbolParlante" -> this.arbolParlante();
            case "gameOver" -> this.gameOver("GAME OVER");
            case "gnomeOver" -> this.gameOver("Intentas usar a tu nuevo aliado como escudo, pero los ogros son más rápidos ahora que cargas con 40kg más y te vuelves su cena.");
            case "ignorarArbol" -> this.ignorarArbol();
            case "hablarArbol" -> this.hablarArbol();
            case "enfrentamientoOgros" -> this.enfrentamientoOgros();
            case "intentarHablar" -> this.intentarHablar();
            case "pelearOgros" -> this.pelearOgros();
            case "huirOgros" -> this.huirOgros();
            case "despuesPelea" -> this.despuesPelea();
            case "huidaGnomo" -> this.huidaGnomo();
            case "pelearGnomo" -> this.pelearGnomo();
            case "curarse" -> this.curarse();
            case "explotar" -> this.explotar();
            case "cruzarRio" -> this.cruzarRio();
        }
    }

    public void exploracionBosque() {
        Main.areaTexto.setText(
                "Te encuentras en un bosque misterioso.\n"
                + "¿Qué te gustaría hacer?");
        
        Main.boton1.setText("Ir derecho y explorar el bosque");
        opcion1 = "arbolParlante";
        
        Main.boton2.setText("Girar a la derecha hacia un río");
        opcion2 = "rio";
    
        Main.boton3.setText("Regresar al lugar donde despertó");
        opcion3 = "regresar";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void regresar() {
        Main.areaTexto.setText(
                "El bosque se ve diferente ahora; antes de que te des\n" 
                + "cuenta has perdido el rumbo en este bosque\n" 
                + "traicionero e infinito\n"); 
        
        Main.boton1.setText("Fin");
        opcion1 = "gameOver";
        
        Main.boton2.setText("");
        opcion2 = "";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void rio() {
        Main.areaTexto.setText(
                "Te diriges hacia el río y encuentras un puente roto.\n"
                + "¿Qué te gustaría hacer?");
        
        Main.boton1.setText("Intentar cruzar el río");
        opcion1 = "cruzarRio";
        
        Main.boton2.setText("Regresar al bosque");
        opcion2 = "exploracionBosque";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void cruzarRio() {
        Main.areaTexto.setText(
                "La corriente es más fuerte que tú, no logras nadar más de 3 metros cuando eres lanzada de vuelta a la orilla. Considera regresar.");
        
        Main.boton1.setText("Intentar cruzar el río");
        opcion1 = "cruzarRio";
        
        Main.boton2.setText("Regresar al bosque");
        opcion2 = "exploracionBosque";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void arbolParlante() {
        Main.areaTexto.setText(
                "Encuentras un árbol parlante llamado ESTPHER.\n"
                + "El árbol te ofrece sabiduría y guía.");
        
        Main.boton1.setText("Ignorar al árbol y seguir adelante");
        opcion1 = "ignorarArbol";
        
        Main.boton2.setText("Hablar con el árbol");
        opcion2 = "hablarArbol";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void ignorarArbol() {
        Main.areaTexto.setText(
                "Decides ignorar al árbol y seguir adelante.\n"
                + "Te encuentras con un grupo de ogros.");
        
        Main.boton1.setText("Intentar hablar con los ogros");
        opcion1 = "intentarHablar";
        
        Main.boton2.setText("Pelear contra los ogros");
        opcion2 = "pelearOgros";
        
        Main.boton3.setText("Huir de los ogros");
        opcion3 = "huirOgros";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void hablarArbol() {
        Main.areaTexto.setText(
                "ESTPHER revela la identidad de Athena y el peligro que la rodea.\n"
                + "Te encuentras con un grupo de ogros.");
        
        Main.boton1.setText("Intentar hablar con los ogros");
        opcion1 = "intentarHablar";
        
        Main.boton2.setText("Pelear contra los ogros");
        opcion2 = "pelearOgros";
        
        Main.boton3.setText("Huir de los ogros");
        opcion3 = "huirOgros";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void enfrentamientoOgros() {
        Main.areaTexto.setText(
                "Te encuentras con un grupo de ogros.\n"
                + "¿Qué te gustaría hacer?");
        
        Main.boton1.setText("Intentar hablar con los ogros");
        opcion1 = "intentarHablar";
        
        Main.boton2.setText("Pelear contra los ogros");
        opcion2 = "pelearOgros";
        
        Main.boton3.setText("Huir de los ogros");
        opcion3 = "huirOgros";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void intentarHablar() {
        Main.areaTexto.setText(
                "Intentas hablar con los ogros, pero te atacan y te debilitan.\n"
                + "Te ves obligada a pelear.");
        
        Main.boton1.setText("Pelear contra los ogros");
        opcion1 = "pelearOgros";
        
        Main.boton2.setText("");
        opcion2 = "";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void pelearOgros() {
        Main.areaTexto.setText(
                "Athena derrota a los ogros, pero queda herida.\n"
                + "¿Qué te gustaría hacer?");
        
        Main.boton1.setText("Seguir peleando contra los refuerzos");
        opcion1 = "despuesPelea";
        
        Main.boton2.setText("Curarse");
        opcion2 = "curarse";
        
        Main.boton3.setText("Explotar");
        opcion3 = "explotar";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void huirOgros() {
        Main.areaTexto.setText(
                "Athena encuentra a un gnomo aliado mientras huye.\n"
                + "¿Qué te gustaría hacer?");
        
        Main.boton1.setText("Usar al gnomo como escudo y seguir huyendo");
        opcion1 = "gnomeOver";
        
        Main.boton2.setText("Pelear junto al gnomo");
        opcion2 = "pelearGnomo";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void huidaGnomo() {
        Main.areaTexto.setText(
                "Athena y el gnomo están huyendo juntos.\n"
                + "¿Qué te gustaría hacer?");
        
        Main.boton1.setText("Usar al gnomo como escudo y seguir huyendo");
        opcion1 = "gameOver";
        
        Main.boton2.setText("Pelear junto al gnomo");
        opcion2 = "pelearGnomo";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void pelearGnomo() {
        Main.areaTexto.setText(
                "Athena y el gnomo derrotan a los ogros y escapan.\n"
                + "La historia de Athena continúa en otro lugar.");
        
        Main.boton1.setText("Fin");
        opcion1 = "gameOver";
        
        Main.boton2.setText("");
        opcion2 = "";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void despuesPelea() {
        Main.areaTexto.setText(
                "Athena sigue peleando contra los refuerzos.\n"
                + "¿Qué te gustaría hacer?");
        
        Main.boton1.setText("Seguir peleando");
        opcion1 = "seguirPeleando";
        
        Main.boton2.setText("Curarse");
        opcion2 = "curarse";
        
        Main.boton3.setText("Explotar");
        opcion3 = "explotar";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void curarse() {
        Main.areaTexto.setText(
                "Athena se cura, recupera su aliento y logra escabullirse de los Ogros y se prepara para continuar su aventura.\n"
                + "La historia de Athena continúa en otro lugar.");
        
        Main.boton1.setText("Fin");
        opcion1 = "gameOver";
        
        Main.boton2.setText("");
        opcion2 = "";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void explotar() {
        Main.areaTexto.setText(
                "Athena decide explotar, sacrificándose para salvar a otros.\n"
                + "GAME OVER.");
        
        Main.boton1.setText("Reiniciar");
        opcion1 = "gameOver";
        
        Main.boton2.setText("");
        opcion2 = "";
        
        Main.boton3.setText("");
        opcion3 = "";
        
        Main.boton4.setText("");
        opcion4 = "";
    }

    public void gameOver(String mensaje) {
        Main.panelBotones.setVisible(false);
        Main.panelAreaTexto.setVisible(false);
        Main.etiquetaTitulo.setText(mensaje);
        Main.panelTitulo.setVisible(true);
    
        Main.botonInicio.setText("Reiniciar");
        Main.botonInicio.setVisible(true);
    
        // Eliminar todos los ActionListeners previos
        for (ActionListener al : Main.botonInicio.getActionListeners()) {
            Main.botonInicio.removeActionListener(al);
        }
    
        Main.botonInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.dispose(); // Cierra la ventana actual
                Main.main(new String[0]); // Reinicia el juego creando una nueva instancia de la ventana principal
            }
        });
        Main.panelBotonInicio.setVisible(true);
    }
}