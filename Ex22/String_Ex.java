package Ex22;

public class String_Ex {
    public static void main(String[] arg){
        String str1 = "abcdefg";
        String str2 = "HIJKLMN";
        String str3 = "opqrstu";
        String str4 = "abcdefg";
        String str5 = " abc def ghi ";

        System.out.println(str1.concat(str2));
        System.out.println(str1.substring(3));
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str1.charAt(3));
        System.out.println(str1.indexOf('c'));

        System.out.println(str1.equals(str4));
        System.out.println(str5.trim());
        System.out.println(str1.replace('a', 'A'));
        System.out.println(str1.replaceAll("abcd", "XXXXXXX"));
        System.out.println(str1);// replace를 한다해도 안에 내용은 바뀌지는 않는다
    }

}
