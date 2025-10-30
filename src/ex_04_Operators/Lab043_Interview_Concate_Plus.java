package ex_04_Operators;

public class Lab043_Interview_Concate_Plus {
    public static void main(String[] args) {
        String first_name = "Vishant";
        String last_name = "Khatri";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        //Ans: VishantKhatri1010
        //Here strings are first and then Integer .. so it will consider concatenation for all

        System.out.println(a + b + first_name + last_name);
        // Ans: 20VishantKhatri
        // Here integers are first, so, addition and then concate for string


        // BODMAS - Bracket of Div, mul, add, sub
        System.out.println(first_name + last_name + (a + b));
        // Ans: VishantKhatri20
        // If we want to do addition for integer then need to give bracket.
    }
}
