package telran.string.controller;
//sout
public class StringAppl {
    public static void main(String[] args) {
        String str = new String("Hello");
        System.out.println(str);
        char[] chars = { ' ', 'w', 'o', 'r', 'l', 'd'};
        String str1 = new String(chars);
        System.out.println(str1);
        str = str.concat(str1);
        System.out.println(str);
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        String str2 = " world";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str.indexOf('l', 5));
        System.out.println(str.indexOf("lo",4));
        System.out.println(str.lastIndexOf('l', 8));
        System.out.println(str.replace('l', 'L'));
        System.out.println(str.replace("el", "ZZZ"));
        System.out.println(str.substring(3,6));
    }
}