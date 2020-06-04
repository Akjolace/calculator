package calculator.app;

public class Divide extends BinaryOperation {

    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    protected int binaryOperation(int x, int y) {
        return 0;
    }
}
