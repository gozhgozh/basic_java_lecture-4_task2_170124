public class Main {
    public static void main(String[] args) {
       // byte to short
        byte b = 126;
        short s = b;
        System.out.println(b);
        //short to int
        int i = s;
        System.out.println(i);
        //int to long
        long l = i;
        System.out.println(i);
        //int to double
        double db = i;
        System.out.println(db);
        //short to float
        float f = s;
        System.out.println(f);
        //float to double;
        double dbl = f;
        System.out.println(dbl);
        // char to int
        char ch = 'A';
        int in = ch;
        System.out.println(in);

        // int to char
        int inback = 66;
        char chback = (char) inback;
        System.out.println(chback);
        // double to float
        double dblback = 126.12121212;
        float flback = (float)dblback;
        System.out.println(flback);
        // float to short
        short shback = (short) flback;
        System.out.println(shback);
        // double to int
        int iback = (int)dblback;
        System.out.println(iback);
        //int to long
        int intback = (int)l;
        System.out.println(intback);
        // int to short
        short sback = (short)intback;
        System.out.println(sback);
        //short to bite
        byte bback = (byte)sback;
        System.out.println(bback);






    }
}