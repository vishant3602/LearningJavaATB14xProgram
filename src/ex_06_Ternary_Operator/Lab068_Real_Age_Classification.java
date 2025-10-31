package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        String user_input = args[0];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        // Input - String .. Whatever input we get from argument, it is in String
        // Below is the conversion from String to Int

        int age = Integer.parseInt(user_input);

        String result = age < 18 ? "Minor" : (age > 60 ? "Senior Citizen" : "Adult");
        System.out.println(result);
    }
}
