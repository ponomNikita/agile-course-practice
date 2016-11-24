package ru.unn.agile.VolumeCalculator.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ru.unn.agile.VolumeCalculator.viewModel.VolumeCalculatorViewModel;

/**
 * Created by ponom on 24.11.2016.
 */
public class VolumeCalculator {
    @FXML
    public ComboBox VolumeTypeListBox;
    @FXML
    public Button CalculateButton;
    @FXML
    public TextField Param1TextField;
    @FXML
    public TextField Param2TextField;
    @FXML
    public Label Param1Label;
    @FXML
    public Label Param2Label;
    @FXML
    public TextField VolumeResultTextField;
    @FXML
    public VolumeCalculatorViewModel viewModel;

    @FXML
    public void initialize() {
        viewModel = new VolumeCalculatorViewModel();
        CalculateButton.setDisable(viewModel.IsCalculateButtonDisabled());
    }
}
