import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Frame extends JFrame {

    public Frame() {
        initComponents();
    }

    private void initComponents() {

        BastyPanel = new JPanel();
        EsepteyButton = new JButton();
        jScrollPane1 = new JScrollPane();
        ShifrMatindikTextPane = new JTextPane();
        JumysPanel = new JPanel();
        ch1TextField = new JTextField();
        JaiLabel = new JLabel();
        ch2TextField = new JTextField();
        AlmastyruButton = new JButton();
        AqparattiqPanel = new  JPanel();
        jScrollPane2 = new  JScrollPane();
        SimvoldarTable = new  JTable();
        jScrollPane3 = new  JScrollPane();
        BigrammalarTable = new  JTable();
        jScrollPane4 = new  JScrollPane();
        TrigrammalarTable = new  JTable();

        setPreferredSize(new java.awt.Dimension(600, 300));
        setTitle("Частотный Анализ");

        BastyPanel.setBackground(java.awt.SystemColor.activeCaption);

        EsepteyButton.setText("Есептеу");
        EsepteyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsepteuButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ShifrMatindikTextPane);
        ShifrMatindikTextPane.setText("НЮЛЮШХЦЮСВАХЧЕЮФХЦТАФЮХУАОАИЗССАЗТЖЗСЦФЗЗТФЮЛМММСЮХЗВАЕСЯЪСМ.ЕЗСЬУАХТАЗ.УОАЙЮЕМТШАЕЯЙЗЗТЕЗХЯЦНЧНФЧУСЗ.ЪМШХЦФЮСПМФЮГАХАДЗССАХЦЬБЭЦА.ХЦФЮСЫЯТОЯЗЦХЯЦАЩЦААСЮФЮХУАОАИЗСЮТЩЗЦЫФШНОМПЮЦМЩЗХНМШЛАСЮШГУАЭЦАПЧЛЕЗХЬУФЗНФЮХСАХАЩЗЦЮБЦХЯЛЗОЗСЫЗОЧВЮМЛСА.СЫЗУЧХЦЫСМЛЮХСЗИЗССЫЗВАФСЫЗТЗФЪМСЫМСЗУФАШАЕМПЫЗОЗХЮГЭЦАУАЛТАОЯЗЦНЮИЕАПЧЦЧФМХЦЧХЕЗОЮЦЬЕОЯХЗДЯАЦЕЫШТНЮЛЮШХЦЮСЗПЮНХМПЮОЬСАМСЦЗФЗХСЫПМСЮХЫЙЗССЫПГЦЮНСЮУФМПЗФЕОЯОБДМЦЗОЗ.ЮНЦМТСАВААЦЕЫШЮЛЕЗХЬФЮЛПЗЙЗСАПСАИЗХЦТАВАФСЫШЦФАУОЫИСЫШЦФЮХХМПСАИЗХЦТАУЗЙЗФНЮИЕЮЯМЛНАЦАФЫШСЮУФАЦЯИЗСММПСАВМШТЗНАТШФЮСМЦХТАМЦЮ.СЫГ");

        GroupLayout jPanel1Layout = new  GroupLayout(BastyPanel);
        BastyPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup( GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1,  GroupLayout.PREFERRED_SIZE, 427,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EsepteyButton,  GroupLayout.PREFERRED_SIZE, 128,  GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(EsepteyButton,  GroupLayout.PREFERRED_SIZE, 46,  GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 107, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1))
                                .addContainerGap())
        );

        JumysPanel.setBackground(java.awt.SystemColor.activeCaption);

        ch1TextField.setFont(new java.awt.Font("Times New Roman KZ", 0, 36)); // NOI18N
        ch1TextField.setHorizontalAlignment( JTextField.CENTER);
        //ch1TextField.setText("S");
        ch1TextField.setToolTipText("");

        JaiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JaiLabel.setHorizontalAlignment( SwingConstants.CENTER);
        JaiLabel.setText("----->");
        JaiLabel.setToolTipText("");

        ch2TextField.setFont(new java.awt.Font("Times New Roman KZ", 0, 36)); // NOI18N
        ch2TextField.setHorizontalAlignment( JTextField.CENTER);
        //ch2TextField.setText("S");
        ch2TextField.setToolTipText("");

        AlmastyruButton.setText("Алмастыру");
        AlmastyruButton.setEnabled(false);
        AlmastyruButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmasturyButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new  GroupLayout(JumysPanel);
        JumysPanel.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ch1TextField,  GroupLayout.PREFERRED_SIZE, 50,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JaiLabel)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ch2TextField,  GroupLayout.PREFERRED_SIZE, 50,  GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AlmastyruButton,  GroupLayout.PREFERRED_SIZE, 113,  GroupLayout.PREFERRED_SIZE)
                                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                        .addComponent(ch1TextField,  GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                                .addComponent(JaiLabel,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ch2TextField,  GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                        .addComponent(AlmastyruButton,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        AqparattiqPanel.setBackground(java.awt.SystemColor.activeCaption);
        AqparattiqPanel.setName(""); // NOI18N

        SimvoldarTable.setModel(new  javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {}
        ));
        SimvoldarTable.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(SimvoldarTable);
        SimvoldarTable.getColumnModel().getSelectionModel().setSelectionMode( ListSelectionModel.SINGLE_SELECTION);

        BigrammalarTable.setModel(new  javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {}
        ));
        jScrollPane3.setViewportView(BigrammalarTable);
        BigrammalarTable.getColumnModel().getSelectionModel().setSelectionMode( ListSelectionModel.SINGLE_SELECTION);

        TrigrammalarTable.setModel(new  javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {}
        ));
        jScrollPane4.setViewportView(TrigrammalarTable);
        TrigrammalarTable.getColumnModel().getSelectionModel().setSelectionMode( ListSelectionModel.SINGLE_SELECTION);

        GroupLayout jPanel3Layout = new  GroupLayout(AqparattiqPanel);
        AqparattiqPanel.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane3,  GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane4,  GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2,  GroupLayout.PREFERRED_SIZE, 99,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4,  GroupLayout.PREFERRED_SIZE, 99,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3,  GroupLayout.PREFERRED_SIZE, 99,  GroupLayout.PREFERRED_SIZE)
                                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                        .addComponent(JumysPanel,  GroupLayout.Alignment.TRAILING,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BastyPanel,  GroupLayout.Alignment.TRAILING,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AqparattiqPanel,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BastyPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JumysPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AqparattiqPanel,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {}
            @Override
            public void windowClosed(WindowEvent windowEvent) {}
            @Override
            public void windowIconified(WindowEvent windowEvent) {}
            @Override
            public void windowDeiconified(WindowEvent windowEvent) {}
            @Override
            public void windowActivated(WindowEvent windowEvent) {}
            @Override
            public void windowDeactivated(WindowEvent windowEvent) {}
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                Object[] options = { "Иә", "Жоқ!" };
                int rc = JOptionPane.showOptionDialog( windowEvent.getWindow(), "Терезені жабу керек пе?", "Ескерту", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);
                if (rc == 0) {
                    windowEvent.getWindow().setVisible(false);
                    System.exit(0);
                }
            }
        });

    }// </editor-fold>

    private void EsepteuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AlmastyruButton.setEnabled(true);
        setSize(850,650);
        setLocationRelativeTo(null);
        data = new Derekter(ShifrMatindikTextPane.getText());
        SimvoldarTable = new JTable(data.arrSimvoldar, data.arrBaganAtyBasty){
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
                Component rComp = super.prepareRenderer(renderer, row, col);
                if (row%2==0){
                    rComp.setBackground(Color.cyan);
                }else {
                    rComp.setBackground(Color.WHITE);
                }

                return rComp;
            }
        };
        jScrollPane2.setViewportView(SimvoldarTable);

        BigrammalarTable = new JTable(data.arrBigrammalar, data.arrBaganAtyBasty){
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
                Component rComp = super.prepareRenderer(renderer, row, col);
                if (row%2==0){
                    rComp.setBackground(Color.cyan);
                }else {
                    rComp.setBackground(Color.WHITE);
                }
                return rComp;
            }
        };
        jScrollPane4.setViewportView(BigrammalarTable);
        TrigrammalarTable = new JTable(data.arrTrigrammalar,data.arrBaganAtyBasty){
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
                Component rComp = super.prepareRenderer(renderer, row, col);
                if (row%2==0){
                    rComp.setBackground(Color.cyan);
                }else {
                    rComp.setBackground(Color.WHITE);
                }
                return rComp;
            }
        };
        jScrollPane3.setViewportView(TrigrammalarTable);
        initJumysFrame();
    }

    private void initJumysFrame(){
        JumysFrame = new JFrame();
        JumysFrame.setSize (700,700);
        JumysFrame.setLocationRelativeTo(null);

        JumysFrame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        JumysFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {}
            @Override
            public void windowClosed(WindowEvent windowEvent) {}
            @Override
            public void windowIconified(WindowEvent windowEvent) {}
            @Override
            public void windowDeiconified(WindowEvent windowEvent) {}
            @Override
            public void windowActivated(WindowEvent windowEvent) {}
            @Override
            public void windowDeactivated(WindowEvent windowEvent) {}
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                JumysFrame.setVisible(false);
            }
        });

        JumysTable = new JTable(data.arrJumys, data.arrBaganAtyJumys){
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
                Component rComp = super.prepareRenderer(renderer, row, col);
                if (row%2==0){
                    rComp.setBackground(Color.cyan);
                }else {
                    rComp.setBackground(Color.WHITE);
                }

                return rComp;
            }
        };

        //JumysTable.setBackground(Color.cyan);
        //JumysTable.setSelectionBackground(Color.red);

        JumysScroll = new JScrollPane(JumysTable);
        JumysFrame.getContentPane().add(JumysScroll);
        JumysFrame.setVisible(true);
    }

    private void AlmasturyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (ch1TextField.getText().isEmpty()||ch2TextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Символ енгізіңіз!");
        }
        else {
            char ch1 = ch1TextField.getText().charAt(0);
            char ch2 = ch2TextField.getText().charAt(0);

            for (int i = 0; i < data.qatarSaniJumys; i+=2) {
                for (int j = 0; j < data.baganSaniJumys; j++) {
                    String ch = (String) data.arrJumys[i][j];
                    if (ch.charAt(0)==ch1){
                        data.arrJumys[i+1][j] = String.valueOf(ch2);
                    }
                }
            }
            JumysTable.repaint();
        }
    }

    // Variables declaration - do not modify
    Derekter data;

    private  JFrame JumysFrame;
    private  JButton EsepteyButton;
    private  JButton AlmastyruButton;
    private  JLabel JaiLabel;
    private  JPanel BastyPanel;
    private  JPanel JumysPanel;
    private  JPanel AqparattiqPanel;
    private  JScrollPane jScrollPane1;
    private  JScrollPane jScrollPane2;
    private  JScrollPane jScrollPane3;
    private  JScrollPane jScrollPane4;
    private  JScrollPane JumysScroll;
    private  JTable SimvoldarTable;
    private  JTable BigrammalarTable;
    private  JTable TrigrammalarTable;
    private  JTable JumysTable;
    private  JTextField ch1TextField;
    private  JTextField ch2TextField;
    private  JTextPane ShifrMatindikTextPane;
    // End of variables declaration
}
