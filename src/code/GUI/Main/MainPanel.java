package code.GUI.Main;

import code.GUI.Cell.CellInfoPanel;
import code.GUI.Control.ControlPanel;
import code.GUI.Event.EventPanel;
import code.GUI.Map.Map;
import code.GUI.Map.MapInfoPanel;

import javax.swing.*;

/**
 * Created by DonutsDose-PC on 20.06.2017.
 */

public class MainPanel extends JPanel {

    private static JPanel rightPanel, leftPanel;
    public static Map map;
    public static MapInfoPanel mapInfoPanel;

    public MainPanel() {
        setupView();
        setupPanels();
        setupMap();
        setupLeftPanel();
        setupRightPanel();
        setVisible(true);
    }

    private void setupView() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    }

    private void setupPanels() {
        leftPanel = new JPanel();
        rightPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        add(leftPanel);
        add(rightPanel);
    }

    private void setupLeftPanel() {
        mapInfoPanel = new MapInfoPanel();
        leftPanel.add(mapInfoPanel);
        leftPanel.add(new CellInfoPanel());
        leftPanel.add(new ControlPanel());
        leftPanel.add(new EventPanel());
    }

    private void setupMap() {
        map = new Map();
    }

    private void setupRightPanel() {
        rightPanel.add(map);
    }
}