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
        CalculateButton.disableProperty().bindBidirectional(viewModel.calculateDisableProperty());

        Param1Label.visibleProperty().bindBidirectional(viewModel.getParam1VisibleProperty());
        Param1TextField.visibleProperty().bindBidirectional(viewModel.getParam1VisibleProperty());
        Param1Label.textProperty().bindBidirectional(viewModel.getParam1Name());

        Param2Label.visibleProperty().bindBidirectional(viewModel.getParam2VisibleProperty());
        Param2TextField.visibleProperty().bindBidirectional(viewModel.getParam2VisibleProperty());
        Param2Label.textProperty().bindBidirectional(viewModel.getParam2Name());

        VolumeResultTextField.textProperty().bindBidirectional(viewModel.resultVolumeProperty());

        VolumeTypeListBox.setItems(viewModel.getVolumeTypeListItemsProperty().getValue());
        VolumeTypeListBox.valueProperty().bindBidirectional(viewModel.getSelectedItemProperty());
    }
}
