import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        getMethods("Doğan Güneş");

    }
    public static void getMethods(String value){
        System.out.println(value.toUpperCase());
        System.out.println(value.toLowerCase());
        System.out.println(value.charAt(1));
        System.out.println(value.concat(" DOĞAN GÜNEŞ"));
        System.out.println(value.contains("D"));
        System.out.println(Arrays.stream(value.split(" ",-1)).toList());
        System.out.println(value.endsWith("ş"));
        System.out.println(value.startsWith("Doan"));
        System.out.println(value.trim());
        System.out.println(value.substring(3));
        System.out.println(value.substring(0,4));
        System.out.println(value.subSequence(0,4));
        System.out.println(value.length());
        System.out.println(value.equals("Doğan Güneş"));
        System.out.println(value.replace("Doğan","doğan"));
        System.out.println(value.replaceAll("D","d"));
        System.out.println(value.replaceFirst("D","d"));
        System.out.println(value.compareTo("Doğan Güneş"));
        System.out.println(value.compareToIgnoreCase("doğan güneş"));
        System.out.println(value.valueOf(5.5));


    }
}