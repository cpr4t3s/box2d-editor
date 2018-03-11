package aurelienribon.bodyeditor.ui;

import aurelienribon.bodyeditor.Settings;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class RigidBodiesOptionsPanel extends javax.swing.JPanel {
    public RigidBodiesOptionsPanel() {
        initComponents();

		drawImageChk.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {updateOptions();}});
		drawShapeChk.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {updateOptions();}});
		drawPolysChk.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {updateOptions();}});
		debugPhysicsChk.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {updateOptions();}});
		drawGridChk.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {updateOptions();}});
		enableSnapToGridChk.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {updateOptions();}});
		gridGapSpinner.addChangeListener(new ChangeListener() {@Override public void stateChanged(ChangeEvent e) {updateOptions();}});
    }

	private void updateOptions() {
		Settings.isImageDrawn = drawImageChk.isSelected();
		Settings.isShapeDrawn = drawShapeChk.isSelected();
		Settings.isPolygonDrawn = drawPolysChk.isSelected();
		Settings.isPhysicsDebugEnabled = debugPhysicsChk.isSelected();
		Settings.isGridShown = drawGridChk.isSelected();
		Settings.isSnapToGridEnabled = enableSnapToGridChk.isSelected();
		Settings.gridGap = (Float) gridGapSpinner.getValue();
	}

	// -------------------------------------------------------------------------
	// Generated Stuff
	// -------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        drawGridChk = new javax.swing.JCheckBox();
        drawPolysChk = new javax.swing.JCheckBox();
        drawImageChk = new javax.swing.JCheckBox();
        gridGapSpinner = new javax.swing.JSpinner();
        drawShapeChk = new javax.swing.JCheckBox();
        enableSnapToGridChk = new javax.swing.JCheckBox();
        debugPhysicsChk = new javax.swing.JCheckBox();
        // for vertex
        vertexType = new javax.swing.JTextField();
        vertexValue = new javax.swing.JTextField();
        vertexVelocity = new javax.swing.JTextField();
        //
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(2000, 0), new java.awt.Dimension(32767, 32767));

        setOpaque(false);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setOpaque(false);

        drawGridChk.setText("Draw grid with gap");
        drawGridChk.setFocusable(false);
        drawGridChk.setOpaque(false);

        drawPolysChk.setSelected(true);
        drawPolysChk.setText("Draw convex polygons");
        drawPolysChk.setFocusable(false);
        drawPolysChk.setOpaque(false);

        drawImageChk.setSelected(true);
        drawImageChk.setText("Draw background image");
        drawImageChk.setFocusable(false);
        drawImageChk.setOpaque(false);

        gridGapSpinner.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.025f), Float.valueOf(0.001f), Float.valueOf(1.0f), Float.valueOf(0.005f)));
        gridGapSpinner.setFocusable(false);

        drawShapeChk.setSelected(true);
        drawShapeChk.setText("Draw shapes");
        drawShapeChk.setFocusable(false);
        drawShapeChk.setOpaque(false);

        enableSnapToGridChk.setText("Enable snap-to-grid");
        enableSnapToGridChk.setFocusable(false);
        enableSnapToGridChk.setOpaque(false);

        debugPhysicsChk.setText("Debug physics");
        debugPhysicsChk.setFocusable(false);
        debugPhysicsChk.setOpaque(false);
        
        vertexType.setEditable(true);
        vertexType.setFocusable(true);
        vertexType.setMinimumSize(new Dimension(90, 40));
        vertexType.setText("type");
        JLabel typeLabel = new JLabel("Type");
        
        vertexValue.setEditable(true);
        vertexValue.setFocusable(true);
        vertexValue.setMinimumSize(new Dimension(90, 40));
        vertexValue.setText("value");
        JLabel valueLabel = new JLabel("Value");
        
        vertexVelocity.setEditable(true);
        vertexVelocity.setFocusable(true);
        vertexVelocity.setMinimumSize(new Dimension(90, 40));
        vertexVelocity.setText("velocity");
        JLabel velocityLabel = new JLabel("Velocity");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawImageChk)
                    .addComponent(drawShapeChk))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(debugPhysicsChk)
                    .addComponent(drawPolysChk))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enableSnapToGridChk)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(drawGridChk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gridGapSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                    		.addComponent(typeLabel)
                    		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(vertexType))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                    		.addComponent(valueLabel)
                    		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(vertexValue)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                    		.addComponent(velocityLabel)
                    		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(vertexVelocity)))
                    
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drawGridChk)
                            .addComponent(gridGapSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enableSnapToGridChk))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drawImageChk)
                            .addComponent(drawPolysChk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drawShapeChk)
                            .addComponent(debugPhysicsChk)))
                    
                    .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            		.addComponent(typeLabel)
                                    .addComponent(vertexType))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            		.addComponent(valueLabel)
                                    .addComponent(vertexValue)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            		.addComponent(velocityLabel)
                                    .addComponent(vertexVelocity)))
                    
                )
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel6);
        add(filler1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox debugPhysicsChk;
    private javax.swing.JCheckBox drawGridChk;
    private javax.swing.JCheckBox drawImageChk;
    private javax.swing.JCheckBox drawPolysChk;
    private javax.swing.JCheckBox drawShapeChk;
    private javax.swing.JCheckBox enableSnapToGridChk;
    // for vertex
    private javax.swing.JTextField vertexType;
    private javax.swing.JTextField vertexValue;
    private javax.swing.JTextField vertexVelocity;
    //
    private javax.swing.Box.Filler filler1;
    private javax.swing.JSpinner gridGapSpinner;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
