package ru.unn.agile.SquareConverter.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareConverterTest {

    ISquareConverter converter;

    @Before
    public void setUp(){
        converter = new SquareConverter();
    }

    @Test
    public void IsFromSqrMeterNotNull() {
        FromSqrMeter result = converter.convertFromSqrMeter();

        assertNotNull(result);
    }

}