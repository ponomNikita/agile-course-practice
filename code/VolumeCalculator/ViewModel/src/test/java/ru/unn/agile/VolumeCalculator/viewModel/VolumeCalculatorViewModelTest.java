package ru.unn.agile.VolumeCalculator.viewModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ponom on 24.11.2016.
 */
public class VolumeCalculatorViewModelTest {

    private VolumeCalculatorViewModel viewModel;
    @Before
    public void setUp() {
        viewModel = new VolumeCalculatorViewModel();
    }

    @Test
    public void isCalculateButtonDisabledByDefault() {
        assertEquals(true, viewModel.IsCalculateButtonDisabled());
    }
}