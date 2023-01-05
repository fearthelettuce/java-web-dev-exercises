package org.launchcode.java.demos.lsn1datatypes;

class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("butt")) {
            return "My butt";
        } else {
            return "Hello, World!";
        }
    }
}
