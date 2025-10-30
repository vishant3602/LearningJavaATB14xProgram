package ex_04_Operators;

public class Lab047_AND_OR_Gate {
    public static void main(String[] args) {
        // || OR gate

        // T || T -> T ->
        // T || F -> T
        // F || T -> T
        // F || F -> F

        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true);  // True
        System.out.println(false || false); // False

        //  And  && // only true && true returns true
        // T && T -> T ->
        // T && F -> F
        // F && T -> F
        // F && F -> F

        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False
    }
}
