package ru.agile.SquareConverter.Model;

public class FromSqrMeter {

    private final static double ToKilometerMultiplier = 0.000001;
    private final static double ToHectareMultiplier = 0.0001;
    private final static double ToArMultiplier = 0.01;
    private final static double ToSqrCentimeterMultiplier = 10000;
    private final static double ToSqrMillimeterMultiplier = 1000000;
    private final static double ToSqrYardMultiplier = 1.196;
    private final static double ToSqrFootMultiplier = 10.76;
    private final static double ToSqrInchMultiplier = 1550;
    private final static double ToSqrAcreMultiplier = 0.0002471;
    private final static double ToSqrMileMultiplier = 0.0000003861;

    public double toSqrKilometer(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToKilometerMultiplier * sqrMeterCount;
    }

    public double toHectare(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToHectareMultiplier * sqrMeterCount;
    }

    public double toAr(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToArMultiplier * sqrMeterCount;
    }

    public double toSqrCentimeter(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToSqrCentimeterMultiplier * sqrMeterCount;
    }

    public double toSqrMillimeter(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToSqrMillimeterMultiplier * sqrMeterCount;
    }

    public double toSqrYard(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToSqrYardMultiplier * sqrMeterCount;
    }

    public double toSqrFoot(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToSqrFootMultiplier * sqrMeterCount;
    }

    public double toSqrInch(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToSqrInchMultiplier * sqrMeterCount;
    }

    public double toSqrAcre(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToSqrAcreMultiplier * sqrMeterCount;
    }

    public double toSqrMile(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return ToSqrMileMultiplier * sqrMeterCount;
    }

}
