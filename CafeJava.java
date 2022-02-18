public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double precioCafeDeFiltro = 3.8; 
        double precioCafeConLeche = 5.4;
        double precioCappucino = 7.6; 
    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = true;
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
         // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
    	
        // 1.) Cindhuri pidio un café. 
        //     Muestrale el mensaje de estado correcto, según el estado de su pedido.
        System.out.println(cliente1 + mensajePendiente);

        // 2.) Noah pidio un cappucino
        //     Verifique el estado de su pedido y hágaselo saber. Si está listo, también dígale su total.
        if (estaListoOrden4) {
            System.out.println(cliente4 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCappucino);
        }
        else {
            System.out.println(cliente4 + mensajePendiente);
        }
        
        // 3.) Sam pidió 2 cafes con leche y le gustaría saber el total por adelantado.
        //      También dígales el estado de su pedido.
        System.out.println(mensajeMostrarTotal + precioCafeConLeche * 2);
        if (estaListoOrden2) {
            System.out.println(cliente2 + mensajeListo);
        }
        else {
            System.out.println(cliente2 + mensajePendiente);
        }


        // 4.) Jimmy acaba de darse cuenta de que le cobraron un café de filtro pero había pedido un café con leche.
        //     Dígale su nuevo total para compensar la diferencia.
        System.out.println(mensajeMostrarTotal + (precioCafeConLeche - precioCafeDeFiltro));

    }

}