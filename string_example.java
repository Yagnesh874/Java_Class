public class string_example {
    public static void main(String[] args) {
        String s1 = "JAVA";
        char ch[] = {'s','t','r','i','n','g'};
        String s2  = new String(ch);
        String s3 = new String("Example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.toLowerCase());
        System.out.println(s3.toUpperCase());
        System.out.println(s1.startsWith("S"));
        System.out.println(s1.endsWith("A"));
        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        int a = 35;
        String s = String.valueOf(a);
        System.out.println(s+10);
        String s4 = "Java is best language compare to another language.Java is best platform to develop the application";
        String rstr  = s4.replace("Java","kava");
        System.out.println(rstr);
        String str = new String("Welcome to java");
        System.out.println(str.substring(3,8));
    }
}
