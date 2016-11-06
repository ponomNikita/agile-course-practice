package SquareConverter.Model;

public class SquareConverter implements ISquareConverter {

    @Override
    public FromSqrMeter ConvertFromSqrMeter() {
        return new FromSqrMeter();
    }

}
