package ru.unn.agile.SquareConverter.Model;

public class SquareConverter implements ISquareConverter {

    @Override
    public FromSqrMeter convertFromSqrMeter() {
        return new FromSqrMeter();
    }

}