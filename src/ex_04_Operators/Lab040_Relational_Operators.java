package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // Relational operator will always give you boolean (true/false) as a result

        int a = 30;
        int b = 20;
      //  boolean c = a > b;
        boolean c = a < b;
        System.out.println(c);

        int age_ramesh = 55;
        int age_mahesh = 67;
        boolean result = age_ramesh <= age_mahesh;
        System.out.println(result);
    }
}
