package ru.unn.agile.VolumeCalculator.viewModel;

import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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

    //private final SelectedVolumeItemChangeListener listener = new SelectedVolumeItemChangeListener();

    public VolumeCalculatorViewModel() {

        selectedVolumeItem.addListener(new ChangeListener<EVolumeTypes>() {
            @Override
            public void changed(ObservableValue<? extends EVolumeTypes> observable, EVolumeTypes oldValue, EVolumeTypes newValue) {
                changeParametersVisible(newValue);
                changeParameterNames(newValue);
            }
        });
    }

    public BooleanProperty calculateDisableProperty() {
        return isCalculateDisable;
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

    public StringProperty resultVolumeProperty() {
        return resultVolume;
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

    public ObjectProperty<EVolumeTypes> getSelectedItemProperty() { return selectedVolumeItem; }

    private class SelectedVolumeItemChangeListener implements ChangeListener<EVolumeTypes> {

        @Override
        public void changed(ObservableValue<? extends EVolumeTypes> observable, EVolumeTypes oldValue, EVolumeTypes newValue) {
            changeParametersVisible(newValue);
            changeParameterNames(newValue);
        }
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
}

enum EVolumeTypes {
    SPHERE("Sphere"),
    CUBE("Cube"),
    CONE("Cone"),
    CYLINDER("Cylinder"),
    PYRAMID("Pyramid"),
    TETRAHEDRON("Tetrahedron");

    private final String name;
    EVolumeTypes(final String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
