package ru.unn.agile.SquareConverter.Model;

public class FromSqrMeter {

    private static final double TOKILOMETERMULTIPLIER = 0.000001;
    private static final double TOHECTAREMULTIPLIER = 0.0001;
    private static final double TOARMULTIPLIER = 0.01;
    private static final double TOSQRSANTIMETERMULTIPLIER = 10000;
    private static final double TOSQRMILLIMETERMULTIPLIER = 1000000;
    private static final double TOSQRYARDMULTIPLIER = 1.196;
    private static final double TOSQRFOOTMULTIPLIER = 10.76;
    private static final double TOSQRINCHMULTIPLIER = 1550;
    private static final double TOSQRACREMULTIPLIER = 0.0002471;
    private static final double TOSQRMILEMULTIPLIER = 0.0000003861;

    public double toSqrKilometer(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOKILOMETERMULTIPLIER * sqrMeterCount;
    }

    public double toHectare(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOHECTAREMULTIPLIER * sqrMeterCount;
    }

    public double toAr(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOARMULTIPLIER * sqrMeterCount;
    }

    public double toSqrCentimeter(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOSQRSANTIMETERMULTIPLIER * sqrMeterCount;
    }

    public double toSqrMillimeter(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOSQRMILLIMETERMULTIPLIER * sqrMeterCount;
    }

    public double toSqrYard(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOSQRYARDMULTIPLIER * sqrMeterCount;
    }

    public double toSqrFoot(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOSQRFOOTMULTIPLIER * sqrMeterCount;
    }

    public double toSqrInch(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOSQRINCHMULTIPLIER * sqrMeterCount;
    }

    public double toSqrAcre(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOSQRACREMULTIPLIER * sqrMeterCount;
    }

    public double toSqrMile(final double sqrMeterCount) {
        if (sqrMeterCount < 0) {
            throw new IllegalArgumentException("Square must be positive number");
        }

        return TOSQRMILEMULTIPLIER * sqrMeterCount;
    }

}
