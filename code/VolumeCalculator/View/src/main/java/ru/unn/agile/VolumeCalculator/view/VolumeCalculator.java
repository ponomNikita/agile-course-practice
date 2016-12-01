package ru.unn.agile.VolumeCalculator.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
    public Label validationMsg;

    @FXML
    public void initialize() {
        viewModel = new VolumeCalculatorViewModel();
        CalculateButton.disableProperty().bindBidirectional(viewModel.getCalculateDisableProperty());

        Param1Label.visibleProperty().bindBidirectional(viewModel.getParam1VisibleProperty());
        Param1TextField.visibleProperty().bindBidirectional(viewModel.getParam1VisibleProperty());
        Param1TextField.textProperty().bindBidirectional(viewModel.getParam1ValueProperty());
        Param1Label.textProperty().bindBidirectional(viewModel.getParam1Name());

        Param2Label.visibleProperty().bindBidirectional(viewModel.getParam2VisibleProperty());
        Param2TextField.visibleProperty().bindBidirectional(viewModel.getParam2VisibleProperty());
        Param2TextField.textProperty().bindBidirectional(viewModel.getParam2ValueProperty());
        Param2Label.textProperty().bindBidirectional(viewModel.getParam2Name());

        validationMsg.textProperty().bindBidirectional(viewModel.getValidationMsgProperty());

        VolumeResultTextField.textProperty().bindBidirectional(viewModel.getResultVolumeProperty());

        VolumeTypeListBox.valueProperty().bindBidirectional(viewModel.getSelectedItemProperty());

        CalculateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.calculate();
            }
        });
    }
}
