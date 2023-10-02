package org.example;

public class Main {
    static final int CUENTA = 10_000_000;
    static String trozoTexto = "El patio de mi casa es particular, llueve y se moja como los demás";
    public static void main(String[] args) {
        long tiempo = System.currentTimeMillis();
       /* concatenaString();
        System.out.println("Tiempo concatena String: " + (System.currentTimeMillis() - tiempo) / 1000);
        tiempo = System.currentTimeMillis();*/
        concatenaStringBuilder();
        System.out.println("Tiempo concatena String: " + (System.currentTimeMillis() - tiempo) / 1000);
    }

    private static void concatenaString(){
        String textoTotal="";

        for (int i = 1; i <=CUENTA ; i++) {
            textoTotal += trozoTexto;
        }
        System.out.println("Tamaño del texto total: " + textoTotal.length());
    }

    private static void concatenaStringBuilder(){
        StringBuilder textoTotal = new StringBuilder();
        for (int i = 1; i <= CUENTA; i++) {
            textoTotal.append(trozoTexto);
        }
        String totalTexto = textoTotal.toString();
        System.out.println("Tamaño del texto total: " + totalTexto.length());


    }
}