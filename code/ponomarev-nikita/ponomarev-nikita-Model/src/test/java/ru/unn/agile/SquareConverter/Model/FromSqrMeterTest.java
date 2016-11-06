package ru.unn.agile.SquareConverter.Model;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

public class FromSqrMeterTest {

    private final double delta = 0.0000000001;

    FromSqrMeter converter;

    @Before
    public void setUp(){
        converter = new FromSqrMeter();
    }

    @Test
    public  void canConvertFromSqrMeterToSqrKilometer(){
        double sqrKilometerCount = converter.toSqrKilometer(1);
        assertEquals(0.000001, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrKilometer(){
        converter.toSqrKilometer(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrKilometer(){
        try{
            converter.toSqrKilometer(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToHectare(){
        double sqrKilometerCount = converter.toHectare(1);
        assertEquals(0.0001, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToHectare(){
        converter.toHectare(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrHectare(){
        try{
            converter.toHectare(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToAr(){
        double sqrKilometerCount = converter.toAr(1);
        assertEquals(0.01, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToAr(){
        converter.toAr(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrAr(){
        try{
            converter.toAr(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrCentimeter(){
        double sqrKilometerCount = converter.toSqrCentimeter(1);
        assertEquals(10000, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrCentimeter(){
        converter.toSqrCentimeter(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrCentimeter(){
        try{
            converter.toSqrCentimeter(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrMillimeter(){
        double sqrKilometerCount = converter.toSqrMillimeter(1);
        assertEquals(1000000, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrMillimeter(){
        converter.toSqrMillimeter(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrMillimeter(){
        try{
            converter.toSqrMillimeter(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrYard(){
        double sqrKilometerCount = converter.toSqrYard(1);
        assertEquals(1.196, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrYard(){
        converter.toSqrYard(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrYard(){
        try{
            converter.toSqrYard(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrFoot(){
        double sqrKilometerCount = converter.toSqrFoot(1);
        assertEquals(10.76, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrFoot(){
        converter.toSqrFoot(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrFoot(){
        try{
            converter.toSqrFoot(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrInch(){
        double sqrKilometerCount = converter.toSqrInch(1);
        assertEquals(1550, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrInch(){
        converter.toSqrInch(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrInch(){
        try{
            converter.toSqrInch(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrAcre(){
        double sqrKilometerCount = converter.toSqrAcre(1);
        assertEquals(0.0002471, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrAcre(){
        converter.toSqrAcre(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrAcre(){
        try{
            converter.toSqrAcre(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrMile(){
        double sqrKilometerCount = converter.toSqrMile(1);
        assertEquals(0.0000003861, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrMile(){
        converter.toSqrMile(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrMile(){
        try{
            converter.toSqrMile(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }
}