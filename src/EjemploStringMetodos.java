public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Ruben";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Ruben\") = " + nombre.equals("Ruben"));
        System.out.println("nombre.equals(\"ruben\") = " + nombre.equals("Ruben"));
        System.out.println("nombre.equalsIgnoreCase(\"ruben\") = " + nombre.equalsIgnoreCase("ruben"));
        System.out.println("nombre.compareTo(\"Ruben\") = " + nombre.compareTo("Ruben"));
        System.out.println("nombre.compareTo(\"Raul\") = " + nombre.compareTo("Raul"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());

    }
}
