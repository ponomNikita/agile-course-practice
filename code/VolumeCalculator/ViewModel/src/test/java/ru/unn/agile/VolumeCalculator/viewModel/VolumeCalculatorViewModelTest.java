package ru.unn.agile.VolumeCalculator.viewModel;

import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeCalculatorViewModelTest {

    private VolumeCalculatorViewModel viewModel;
    @Before
    public void setUp() {

        viewModel = new VolumeCalculatorViewModel();
    }

    @Test
    public void isCalculateButtonDisabledByDefault() {
        assertEquals(true, viewModel.calculateDisableProperty().get());
    }

    @Test
    public void isParam1VisibleByDefault() {
        assertEquals(false, viewModel.getParam1VisibleProperty().get());
    }

    @Test
    public void isParam2VisibleByDefault() {
        assertEquals(false, viewModel.getParam2VisibleProperty().get());
    }

    @Test
    public void isResultEmptyByDefault() {
        assertEquals("", viewModel.resultVolumeProperty().get());
    }

    @Test
    public void isCorrectListBoxContent() {
        ObjectProperty<ObservableList<EVolumeTypes>> items =  viewModel.getVolumeTypeListItemsProperty();

        assertEquals(true, items.getValue().contains(EVolumeTypes.CONE));
        assertEquals(true, items.getValue().contains(EVolumeTypes.CUBE));
        assertEquals(true, items.getValue().contains(EVolumeTypes.CYLINDER));
        assertEquals(true, items.getValue().contains(EVolumeTypes.PYRAMID));
        assertEquals(true, items.getValue().contains(EVolumeTypes.SPHERE));
        assertEquals(true, items.getValue().contains(EVolumeTypes.TETRAHEDRON));
    }

    @Test
    public void whenGetSelectedValueItem() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.SPHERE);
        assertEquals(EVolumeTypes.SPHERE, viewModel.getSelectedVolumeItem());
    }

    @Test
    public void whenSphereChosenParameter1Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.SPHERE);
        assertEquals(true, viewModel.getParam1VisibleProperty().get());
    }

    @Test
    public void whenSphereChosenParameter2Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.SPHERE);
        assertEquals(false, viewModel.getParam2VisibleProperty().get());
    }

    @Test
    public void whenCubeChosenParameter1Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CUBE);
        assertEquals(true, viewModel.getParam1VisibleProperty().get());
    }

    @Test
    public void whenCubeChosenParameter2Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CUBE);
        assertEquals(false, viewModel.getParam2VisibleProperty().get());
    }

    @Test
    public void whenConeChosenParameter1Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CONE);
        assertEquals(true, viewModel.getParam1VisibleProperty().get());
    }

    @Test
    public void whenConeChosenParameter2Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CONE);
        assertEquals(true, viewModel.getParam2VisibleProperty().get());
    }

    @Test
    public void whenCylinderChosenParameter1Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CYLINDER);
        assertEquals(true, viewModel.getParam1VisibleProperty().get());
    }

    @Test
    public void whenCylinderChosenParameter2Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CYLINDER);
        assertEquals(true, viewModel.getParam2VisibleProperty().get());
    }

    @Test
    public void whenTetrahedronChosenParameter1Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.TETRAHEDRON);
        assertEquals(true, viewModel.getParam1VisibleProperty().get());
    }

    @Test
    public void whenTetrahedronChosenParameter2Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.TETRAHEDRON);
        assertEquals(false, viewModel.getParam2VisibleProperty().get());
    }

    @Test
    public void whenPyramidChosenParameter1Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.PYRAMID);
        assertEquals(true, viewModel.getParam1VisibleProperty().get());
    }

    @Test
    public void whenPyramidChosenParameter2Visible() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.PYRAMID);
        assertEquals(true, viewModel.getParam2VisibleProperty().get());
    }

    @Test
    public void whenTetrahedronChosenParameter1Name() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.TETRAHEDRON);
        assertEquals("Edge", viewModel.getParam1Name().get());
    }

    @Test
    public void whenCubeChosenParameter1Name() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CUBE);
        assertEquals("Edge", viewModel.getParam1Name().get());
    }

    @Test
    public void whenSphereChosenParameter1Name() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.SPHERE);
        assertEquals("Radius", viewModel.getParam1Name().get());
    }

    @Test
    public void whenPyramidChosenParameter1Name() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.PYRAMID);
        assertEquals("Area", viewModel.getParam1Name().get());
    }

    @Test
    public void whenPyramidChosenParameter2Name() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.PYRAMID);
        assertEquals("Height", viewModel.getParam2Name().get());
    }

    @Test
    public void whenCylinderChosenParameter1Name() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CYLINDER);
        assertEquals("Radius", viewModel.getParam1Name().get());
    }

    @Test
    public void whenCylinderChosenParameter2Name() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CYLINDER);
        assertEquals("Height", viewModel.getParam2Name().get());
    }

    @Test
    public void whenConeChosenParameter1Name() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CONE);
        assertEquals("Radius", viewModel.getParam1Name().get());
    }

    @Test
    public void whenConeChosenParameter2Name() {
        viewModel.setSelectedVolumeItem(EVolumeTypes.CONE);
        assertEquals("Height", viewModel.getParam2Name().get());
    }


}