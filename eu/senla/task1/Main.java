package eu.senla.task1;

public class Main {

    static byte a = 12;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;
    static String j;
    static Byte A;
    static Short B;
    static Integer S;
    static Long D;
    static Float E;
    static Double F;
    static Character G;
    static Boolean H;
    static String J;


    public static void main(String[] args) {

        Number number = new Number();
        number.setaByte((byte) 15);
        byte a = number.getaByte();
        System.out.println(a);
        number.setbShort((short) 16);
        short b = number.getbShort();
        System.out.println(b);
        number.setcInt((int) 17);
        int c = number.getcInt();
        System.out.println(c);
        number.setdLong((long) 18);
        long d = number.getdLong();
        System.out.println(d);
        number.seteFloat((float) 19);
        float e = number.geteFloat();
        System.out.println(e);
        number.setfDouble((double) 20);
        double f = number.getfDouble();
        System.out.println(f);
        number.setgChar((char) 'A');
        char g = number.getgChar();
        System.out.println(g);
        number.sethBoolean((boolean) false);
        boolean h = number.ishBoolean();
        System.out.println(h);
        number.setjString((String) "Hello");
        String j = number.getjString();
        System.out.println(j);

        byte a1 = (byte) b;
        System.out.println("a1 " + a1);
        byte a2 = (byte) c;
        System.out.println("a2 " + a2);
        byte a3 = (byte) d;
        System.out.println("a3 " + a3);
        byte a4 = (byte) e;
        System.out.println("a4 " + a4);
        byte a5 = (byte) f;
        System.out.println("a5 " + a5);

        short b1 = (short) a;
        System.out.println("b1 " + b1);
        short b2 = (short) c;
        System.out.println("b2 " + b2);
        short b3 = (short) d;
        System.out.println("b3 " + b3);
        short b4 = (short) e;
        System.out.println("b4 " + b4);
        short b5 = (short) f;
        System.out.println("b5 " + b5);

        int c1 = (int) a;
        System.out.println("c1 " + c1);
        int c2 = (int) b;
        System.out.println("c2 " + c2);
        int c3 = (int) d;
        System.out.println("c3 " + c3);
        int c4 = (int) e;
        System.out.println("c4 " + c4);
        int c5 = (int) f;
        System.out.println("c5 " + c5);

        long d1 = (long) a;
        System.out.println("d1 " + d1);
        long d2 = (long) b;
        System.out.println("d2 " + d2);
        long d3 = (long) c;
        System.out.println("d3 " + d3);
        long d4 = (long) e;
        System.out.println("d4 " + d4);
        long d5 = (long) f;
        System.out.println("d5 " + d5);

        float e1 = (float) a;
        System.out.println("e1 " + e1);
        float e2 = (float) b;
        System.out.println("e2 " + e2);
        float e3 = (float) c;
        System.out.println("e3 " + e3);
        float e4 = (float) d;
        System.out.println("e4 " + e4);
        float e5 = (float) f;
        System.out.println("e5 " + e5);

        double f1 = (double) a;
        System.out.println("f1 " + f1);
        double f2 = (double) b;
        System.out.println("f2 " + f2);
        double f3 = (double) c;
        System.out.println("f3 " + f3);
        double f4 = (double) d;
        System.out.println("f4 " + f4);
        double f5 = (double) e;
        System.out.println("f5 " + f5);

        //char g1 = (char) j; -cannot cast

        //String j1 = (String) g; -cannot cast

        boolean h1 = true;
        System.out.println("h1 " + h1);





    }
}
