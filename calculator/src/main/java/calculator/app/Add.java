package calculator.app;

public class Add extends BinaryOperation {

    public Add(Expression left, Expression right) {
        super(left, right);
    }

    protected int binaryOperation(int x, int y) {
        return 0;
    }
}
