package SquareConverter.Model;

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
        double sqrKilometerCount = converter.ToSqrKilometer(1);
        assertEquals(0.000001, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrKilometer(){
        converter.ToSqrKilometer(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrKilometer(){
        try{
            converter.ToSqrKilometer(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToHectare(){
        double sqrKilometerCount = converter.ToHectare(1);
        assertEquals(0.0001, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToHectare(){
        converter.ToHectare(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrHectare(){
        try{
            converter.ToHectare(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToAr(){
        double sqrKilometerCount = converter.ToAr(1);
        assertEquals(0.01, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToAr(){
        converter.ToAr(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrAr(){
        try{
            converter.ToAr(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrCentimeter(){
        double sqrKilometerCount = converter.ToSqrCentimeter(1);
        assertEquals(10000, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrCentimeter(){
        converter.ToSqrCentimeter(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrCentimeter(){
        try{
            converter.ToSqrCentimeter(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrMillimeter(){
        double sqrKilometerCount = converter.ToSqrMillimeter(1);
        assertEquals(1000000, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrMillimeter(){
        converter.ToSqrMillimeter(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrMillimeter(){
        try{
            converter.ToSqrMillimeter(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrYard(){
        double sqrKilometerCount = converter.ToSqrYard(1);
        assertEquals(1.196, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrYard(){
        converter.ToSqrYard(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrYard(){
        try{
            converter.ToSqrYard(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrFoot(){
        double sqrKilometerCount = converter.ToSqrFoot(1);
        assertEquals(10.76, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrFoot(){
        converter.ToSqrFoot(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrFoot(){
        try{
            converter.ToSqrFoot(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrInch(){
        double sqrKilometerCount = converter.ToSqrInch(1);
        assertEquals(1550, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrInch(){
        converter.ToSqrInch(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrInch(){
        try{
            converter.ToSqrInch(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrAcre(){
        double sqrKilometerCount = converter.ToSqrAcre(1);
        assertEquals(0.0002471, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrAcre(){
        converter.ToSqrAcre(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrAcre(){
        try{
            converter.ToSqrAcre(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }

    @Test
    public void canConvertFromSqrMeterToSqrMile(){
        double sqrKilometerCount = converter.ToSqrMile(1);
        assertEquals(0.0000003861, sqrKilometerCount, delta);
    }

    @Test(expected  = IllegalArgumentException.class)
    public void canConvertFromNegativeSqrMeterCountToSqrMile(){
        converter.ToSqrMile(-1);
    }

    @Test
    public void IsCorrectExceptionMessageForToSqrSqrMile(){
        try{
            converter.ToSqrMile(-1);
        }
        catch (IllegalArgumentException e){
            assertThat(e.getMessage(), is("Square must be positive number"));
        }
    }
}