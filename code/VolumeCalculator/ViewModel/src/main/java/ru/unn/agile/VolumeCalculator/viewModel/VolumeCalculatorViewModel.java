package ru.unn.agile.VolumeCalculator.viewModel;

/**
 * Created by ponom on 24.11.2016.
 */
public class VolumeCalculatorViewModel {
    private boolean isCalculateButtonDisabled;

    public VolumeCalculatorViewModel() {
        isCalculateButtonDisabled = true;
    }

    public boolean IsCalculateButtonDisabled() {
        return isCalculateButtonDisabled;
    }
}
