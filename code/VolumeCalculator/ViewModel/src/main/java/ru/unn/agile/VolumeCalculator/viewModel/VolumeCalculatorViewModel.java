package ru.unn.agile.VolumeCalculator.viewModel;


import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ru.unn.agile.VolumeCalculator.Model.VolumeCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VolumeCalculatorViewModel {

    private final BooleanProperty isCalculateDisable = new SimpleBooleanProperty(true);
    private final BooleanProperty isParam1Visible = new SimpleBooleanProperty(false);
    private final BooleanProperty isParam2Visible = new SimpleBooleanProperty(false);
    private final StringProperty resultVolume = new SimpleStringProperty("");
    private final StringProperty param1Name = new SimpleStringProperty("Param1");
    private final StringProperty param2Name = new SimpleStringProperty("Param2");
    private final ObjectProperty<EVolumeTypes> selectedVolumeItem = new SimpleObjectProperty<>();
    private final ObjectProperty<ObservableList<EVolumeTypes>> volumeTypeListItems =
            new SimpleObjectProperty<>(FXCollections.observableArrayList(EVolumeTypes.values()));
    private StringProperty param1Value = new SimpleStringProperty();
    private StringProperty param2Value = new SimpleStringProperty();
    private StringProperty validationMsg = new SimpleStringProperty("");


    public VolumeCalculatorViewModel() {

        selectedVolumeItem.addListener(new ChangeListener<EVolumeTypes>() {
            @Override
            public void changed(final ObservableValue<? extends EVolumeTypes> observable, final  EVolumeTypes oldValue, final  EVolumeTypes newValue) {
                setParam1ValueProperty(null);
                setParam2ValueProperty(null);
                setResultVolumeProperty("");
                changeParametersVisible(newValue);
                changeParameterNames(newValue);
            }
        });

        param1Value.addListener(new ParamFieldListener());
        param2Value.addListener(new ParamFieldListener());

    }

    public BooleanProperty getCalculateDisableProperty() {
        return isCalculateDisable;
    }

    public void setCalculateDisableProperty(Boolean value) {
        isCalculateDisable.setValue(value);
    }

    public BooleanProperty getParam1VisibleProperty() {
        return isParam1Visible;
    }

    public BooleanProperty getParam2VisibleProperty() {
        return isParam2Visible;
    }

    public void setParam1VisibleProperty(boolean value) {
        isParam1Visible.setValue(value);
    }

    public void setParam2VisibleProperty(boolean value) {
        isParam2Visible.setValue(value);
    }

    public StringProperty getResultVolumeProperty() {
        return resultVolume;
    }

    public void setResultVolumeProperty(String value) {
        resultVolume.setValue(value);
    }

    public ObjectProperty<ObservableList<EVolumeTypes>> getVolumeTypeListItemsProperty() {
        return volumeTypeListItems;
    }

    public void setSelectedVolumeItem(EVolumeTypes item) {
        selectedVolumeItem.setValue(item);
    }

    public EVolumeTypes getSelectedVolumeItem() {
        return selectedVolumeItem.getValue();
    }

    public StringProperty getParam1Name() {
        return param1Name;
    }

    public StringProperty getParam2Name() {
        return param2Name;
    }

    public void setParam1Name(final String value) {
        param1Name.setValue(value);
    }

    public void setParam2Name(final String value) {
        param2Name.setValue(value);
    }

    public final ObservableList<EVolumeTypes> getVolumeTypeListItems() { return volumeTypeListItems.get(); }

    public ObjectProperty<EVolumeTypes> getSelectedItemProperty() { return selectedVolumeItem; }

    public StringProperty getParam1ValueProperty() {
        return param1Value;
    }

    public StringProperty getParam2ValueProperty() {
        return param2Value;
    }

    public void setParam1ValueProperty(String value) {
        param1Value.setValue(value);
    }

    public void setParam2ValueProperty(String value) {
        param2Value.setValue(value);
    }

    private void changeParametersVisible(EVolumeTypes newValue) {
        switch(newValue) {
            case TETRAHEDRON:
            case CUBE:
            case SPHERE: {
                setParam1VisibleProperty(true);
                setParam2VisibleProperty(false);
            } break;
            case PYRAMID:
            case CYLINDER:
            case CONE: {
                setParam1VisibleProperty(true);
                setParam2VisibleProperty(true);
            } break;
            default: {
                setParam1VisibleProperty(false);
                setParam2VisibleProperty(false);
            }
        }
    }

    private void changeParameterNames(EVolumeTypes newValue) {
        switch (newValue) {
            case CUBE:
            case TETRAHEDRON: {
                setParam1Name("Edge");
            } break;
            case SPHERE: {
                setParam1Name("Radius");
            } break;
            case PYRAMID: {
                setParam1Name("Area");
                setParam2Name("Height");
            } break;
            case CONE:
            case CYLINDER: {
                setParam1Name("Radius");
                setParam2Name("Height");
            } break;
            default: {
                setParam1Name("Param1");
                setParam2Name("Param2");
            }
        }
    }

    public StringProperty getValidationMsgProperty() {
        return validationMsg;
    }

    public void setValidationMsgProperty(String value) {
        validationMsg.setValue(value);
    }

    public void calculate() {
        double param1 = TryParseDouble(getParam1ValueProperty().getValue());
        double param2 = TryParseDouble(getParam2ValueProperty().getValue());
        double result = selectedVolumeItem.get().getVolume(param1, param2);
        setResultVolumeProperty(String.valueOf(result));
    }

    private double TryParseDouble(String s){
        double result = 0;
        try {
            result = Double.parseDouble(s);
        }
        catch (Exception e) {
            return 0;
        }
        return result;
    }

    private class ParamFieldListener implements ChangeListener<String> {

        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            setCalculateDisableProperty(!Validation());
        }
    }

    private boolean Validation() {
        ArrayList<EVolumeTypes> typesWithOneParameter =
                new ArrayList<EVolumeTypes>(Arrays.asList(
                        EVolumeTypes.SPHERE,
                        EVolumeTypes.CUBE,
                        EVolumeTypes.TETRAHEDRON
                        ));

        try {
            if (getParam1ValueProperty().getValue() != null && getParam1ValueProperty().getValue() != "") {
                if (Double.parseDouble(getParam1ValueProperty().getValue()) < 0) {
                    setValidationMsgProperty(getParam1Name().getValue() + " must be positive");
                    return false;
                }
            }
            setValidationMsgProperty("");
            if (typesWithOneParameter.contains(getSelectedVolumeItem())) {
                return true;
            }

        }
        catch (Exception e) {
            setValidationMsgProperty(getParam1Name().getValue() + " is not valid");
            return false;
        }

        try {
            if (getParam2ValueProperty().getValue() != null && getParam2ValueProperty().getValue() != "") {
                if (Double.parseDouble(getParam2ValueProperty().getValue()) < 0) {
                    setValidationMsgProperty(getParam2Name().getValue() + " must be positive");
                    return false;
                }
                setValidationMsgProperty("");
                return true;
            }
        }
        catch (Exception e) {
            setValidationMsgProperty(getParam2Name().getValue() + " is not valid");
            return false;
        }

        setValidationMsgProperty("");
        return false;
    }

}

enum EVolumeTypes {
    CUBE("Cube") {
        @Override
        public double getVolume(double... args) {
            return calculator.getCubeVolume(args[0]);
        }
    },
    CONE("Cone") {
        @Override
        public double getVolume(double... args) {
            return calculator.getConeVolume(args[0], args[1]);
        }
    },
    CYLINDER("Cylinder") {
        @Override
        public double getVolume(double... args) {
            return calculator.getCylinderVolume(args[0], args[1]);
        }
    },
    PYRAMID("Pyramid") {
        @Override
        public double getVolume(double... args) {
            return calculator.getPyramidVolume(args[0], args[1]);
        }
    },
    TETRAHEDRON("Tetrahedron") {
        @Override
        public double getVolume(double... args) {
            return calculator.getTetrahedronVolume(args[0]);
        }
    },
    SPHERE("Sphere") {
        @Override
        public double getVolume(double... args) {
            return calculator.getSphereVolume(args[0]);
        }
    };

    private final String name;
    private final static VolumeCalculator calculator = new VolumeCalculator();
    EVolumeTypes(final String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }

    public abstract double getVolume(double... args);
}
