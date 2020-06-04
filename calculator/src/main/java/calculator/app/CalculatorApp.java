package calculator.app;

public class CalculatorApp {
    public static void main(String[] args) {
        Expression result = new Parser().parse("x + y");
        int res = result.evaluate(1,2);
        System.out.println(res);

    }
}
