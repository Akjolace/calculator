package calculator.app;

public class Absolute extends UnaryOperation {
    public Absolute(Expression expression) {
        super(expression);
    }

    protected int unaryOperation(int x) {
        return 0;
    }
}
