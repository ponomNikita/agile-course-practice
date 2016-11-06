package ru.agile.SquareConverter.Model;

public class FromSqrMeter {

    private final static double TOKILOMETERMULTIPLIER = 0.000001;
    private final static double TOHECTAREMULTIPLIER = 0.0001;
    private final static double TOARMULTIPLIER = 0.01;
    private final static double TOSQRSANTIMETERMULTIPLIER = 10000;
    private final static double TOSQRMILLIMETERMULTIPLIER = 1000000;
    private final static double TOSQRYARDMULTIPLIER = 1.196;
    private final static double TOSQRFOOTMULTIPLIER = 10.76;
    private final static double TOSQRINCHMULTIPLIER = 1550;
    private final static double TOSQRACREMULTIPLIER = 0.0002471;
    private final static double TOSQRMILEMULTIPLIER = 0.0000003861;

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
