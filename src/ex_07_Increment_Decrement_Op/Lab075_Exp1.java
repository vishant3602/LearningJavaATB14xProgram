package ex_07_Increment_Decrement_Op;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ ->  A ..... A = 10 .. So, "a" will become 11
        // +
        // ++a -> B .... because of ++a, B = 12 ... so, "a" is also become 12.
    }
}
