package SquareConverter.Model;

public class FromSqrMeter {

    private final double toKilometerMultiplier = 0.000001;
    private final double toHectareMultiplier = 0.0001;
    private final double toArMultiplier = 0.01;
    private final double toSqrCentimeterMultiplier = 10000;
    private final double toSqrMillimeterMultiplier = 1000000;
    private final double toSqrYardMultiplier = 1.196;
    private final double toSqrFootMultiplier = 10.76;
    private final double toSqrInchMultiplier = 1550;
    private final double toSqrAcreMultiplier = 0.0002471;
    private final double toSqrMileMultiplier = 0.0000003861;

    public double toSqrKilometer(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toKilometerMultiplier * sqrMeterCount;
    }

    public double toHectare(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toHectareMultiplier * sqrMeterCount;
    }

    public double toAr(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toArMultiplier * sqrMeterCount;
    }

    public double toSqrCentimeter(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toSqrCentimeterMultiplier * sqrMeterCount;
    }

    public double toSqrMillimeter(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toSqrMillimeterMultiplier * sqrMeterCount;
    }

    public double toSqrYard(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toSqrYardMultiplier * sqrMeterCount;
    }

    public double toSqrFoot(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toSqrFootMultiplier * sqrMeterCount;
    }

    public double toSqrInch(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toSqrInchMultiplier * sqrMeterCount;
    }

    public double toSqrAcre(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toSqrAcreMultiplier * sqrMeterCount;
    }

    public double toSqrMile(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return toSqrMileMultiplier * sqrMeterCount;
    }

}
