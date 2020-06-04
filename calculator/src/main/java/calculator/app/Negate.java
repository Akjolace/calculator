package calculator.app;

public class Negate extends UnaryOperation{

    public Negate(Expression expression) {
        super(expression);
    }

    protected int unaryOperation(int x) {
        return 0;
    }
}
