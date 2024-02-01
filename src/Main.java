import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        getMethods("Doğan Güneş");

    }
    public static void getMethods(String value){
        System.out.println(value.toUpperCase()); // TÜM KARAKTERLERİ BÜYÜK HARF YAPAR
        System.out.println(value.toLowerCase()); // TÜM KARAKTERLERİ KÜÇÜK HARF YAPAR
        System.out.println(value.charAt(1)); // INDEX OLARAK 1. İNDEX DEĞERİ/KARAKTERİ GETİRİR
        System.out.println(value.concat(" DOĞAN GÜNEŞ")); // STRING DEĞERİN SONUNA EKLER
        System.out.println(value.contains("D")); // BELİRTİLEN DEĞERİ İÇERİYOR MU?
        System.out.println(Arrays.stream(value.split(" ",-1)).toList()); // BELİRTİLEN REGEX İLE AYIRIP ARRAY'E GÖNDERİR
        System.out.println(value.endsWith("ş")); // BELİRTİLEN STRING İLE BİTİYOR MU?
        System.out.println(value.startsWith("Doan")); // BELİRTİLEN STRING İLE BAŞLIYOR MU?
        System.out.println(value.trim()); // BOŞLUK KARAKTERİNİ KALDIRMAYA YARAR
        System.out.println(value.substring(3)); //BELİRTİLEN INDEX DEĞERİNDEN SONRAKİ STRING DEĞERİ ALIR
        System.out.println(value.substring(0,4)); // BELİRTİLEN ARALIKTAKİ INDEX DEĞERLERİNİ İÇEREN STRING DEĞERİ ALIR
        System.out.println(value.subSequence(0,4));
        System.out.println(value.length()); // STRING DEĞERİN UZUNLUĞUNU VERİR
        System.out.println(value.equals("Doğan Güneş")); // STRING İFADELERİN EŞİTLİĞİNİ KONTROL EDER
        System.out.println(value.replace("Doğan","doğan")); // HEDEF DEĞERLE BELİRLENEN DEĞERİN DEĞİŞTİRİLMESİNİ SAĞLAR
        System.out.println(value.replaceAll("D","d")); // BELİRTİLEN REGEX DEĞERİ İLE STRING DEĞERDEKİ TÜM KARAKTERLERİ DEĞİŞTİRİR
        System.out.println(value.replaceFirst("D","d")); // BELİRTİLEN REGEX DEĞERİ İLE STRING DEĞERDEKİ İLK UYUMLU KARAKTERLERİ DEĞİŞTİRİR
        System.out.println(value.compareTo("Doğan Güneş"));
        System.out.println(value.compareToIgnoreCase("doğan güneş"));
        System.out.println(value.valueOf(5.5)); // FAKLI VERİ TİPLERİNİ STRING FORMATA DÖNDÜRÜR.


    }
}