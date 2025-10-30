package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        int age = 21;
     //   String result = (age > 18) ? "Yes" : "No";

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        String result = (age > 18) ? (age > 25 ? "He can drink" : "He can go to Goa, but can not drink") : "No";
        System.out.println(result);
    }
}
