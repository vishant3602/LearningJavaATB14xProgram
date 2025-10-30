package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 2938384940l;
       // short s = phone_no;  //Narrowing - implicit
        short s = (short) phone_no;  //Narrowing - explicit
        System.out.println(s);

    }
}
