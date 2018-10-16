/*
 * @author Guillermo Montes Martos
 * @author xmonte03
 *
 */

package xmonte03.GUI;

import java.awt.*;
import java.io.*;
import java.awt.datatransfer.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.border.Border;


/**
 * Main windows of the application.
 *
 * @author Guillermo Montes Martos
 * @author xmonte03
 * @version 1.0
 */
public class View extends javax.swing.JFrame implements AWTEventListener {

    /**
     * Basic constructor.
     */
    public View() {
        initComponents();
        this.getToolkit().addAWTEventListener(this, AWTEvent.KEY_EVENT_MASK);
        
        // Base unit button group initialization.
        baseGroup = new ButtonGroup();
        baseGroup.add(binaryMenuRadio);
        baseGroup.add(octalMenuRadio);
        baseGroup.add(decimalMenuRadio);
        baseGroup.add(hexadecimalMenuRadio);
        decimalMenuRadio.setSelected(true);
        aBtn.setEnabled(false);
        bBtn.setEnabled(false);
        cBtn.setEnabled(false);
        dBtn.setEnabled(false);
        eBtn.setEnabled(false);
        fBtn.setEnabled(false);
        
        // Angle button group initialization.
        angleGroup = new ButtonGroup();
        angleGroup.add(radiansMenuRadio);
        angleGroup.add(degreesMenuRadio);
        radiansMenuRadio.setSelected(true);
        
        // App working mode initialization.
        modeGroup = new ButtonGroup();
        modeGroup.add(guidedMenuRadio);
        modeGroup.add(freeMenuRadio);
        modeGroup.add(noobMenuRadio);
        guidedMenuRadio.setSelected(true);
        inputField.setEditable(false);
        inputField.setFocusable(false);
        outputField.setEditable(false);
        
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        
        lastKeyWasEqual = false;
        
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Centering the window
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputField = new javax.swing.JTextField();
        outputField = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        moduloBtn = new javax.swing.JButton();
        mulBtn = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        decimalMarkBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        cosBtn = new javax.swing.JButton();
        logBtn = new javax.swing.JButton();
        expBtn = new javax.swing.JButton();
        lnBtn = new javax.swing.JButton();
        sinBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        cDeleteBtn = new javax.swing.JButton();
        ceBtn = new javax.swing.JButton();
        inputLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        parenthLBtn = new javax.swing.JButton();
        parenthRBtn = new javax.swing.JButton();
        fBtn = new javax.swing.JButton();
        aBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        dBtn = new javax.swing.JButton();
        eBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        copyInputMenuItem = new javax.swing.JMenuItem();
        copyOutputMenuItem = new javax.swing.JMenuItem();
        pasteInputMenuItem = new javax.swing.JMenuItem();
        baseMenu = new javax.swing.JMenu();
        binaryMenuRadio = new javax.swing.JRadioButtonMenuItem();
        octalMenuRadio = new javax.swing.JRadioButtonMenuItem();
        decimalMenuRadio = new javax.swing.JRadioButtonMenuItem();
        hexadecimalMenuRadio = new javax.swing.JRadioButtonMenuItem();
        angleMenu = new javax.swing.JMenu();
        radiansMenuRadio = new javax.swing.JRadioButtonMenuItem();
        degreesMenuRadio = new javax.swing.JRadioButtonMenuItem();
        modeMenu = new javax.swing.JMenu();
        noobMenuRadio = new javax.swing.JRadioButtonMenuItem();
        guidedMenuRadio = new javax.swing.JRadioButtonMenuItem();
        freeMenuRadio = new javax.swing.JRadioButtonMenuItem();
        historyMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        manualMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(414, 519));
        setSize(new java.awt.Dimension(414, 519));

        btn7.setText("7");
        btn7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.setPreferredSize(new java.awt.Dimension(50, 50));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        divBtn.setText("/");
        divBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        divBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBtnActionPerformed(evt);
            }
        });

        moduloBtn.setText("%");
        moduloBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        moduloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloBtnActionPerformed(evt);
            }
        });

        mulBtn.setText("*");
        mulBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        mulBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulBtnActionPerformed(evt);
            }
        });

        subBtn.setText("-");
        subBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        decimalMarkBtn.setText(".");
        decimalMarkBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        decimalMarkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalMarkBtnActionPerformed(evt);
            }
        });

        addBtn.setText("+");
        addBtn.setMaximumSize(new java.awt.Dimension(50, 50));
        addBtn.setMinimumSize(new java.awt.Dimension(50, 50));
        addBtn.setPreferredSize(new java.awt.Dimension(50, 118));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        equalBtn.setText("=");
        equalBtn.setPreferredSize(new java.awt.Dimension(50, 118));
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });

        cosBtn.setText("cos");
        cosBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        cosBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        cosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosBtnActionPerformed(evt);
            }
        });

        logBtn.setText("<html><center>log<sub>2</sub></center></html>");
        logBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        logBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });

        expBtn.setText("<html><center>e<sup>x</sup></center></html>");
        expBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        expBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        expBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        expBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expBtnActionPerformed(evt);
            }
        });

        lnBtn.setText("ln");
        lnBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        lnBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        lnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnBtnActionPerformed(evt);
            }
        });

        sinBtn.setText("sin");
        sinBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        sinBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        sinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinBtnActionPerformed(evt);
            }
        });

        delBtn.setText("DEL");
        delBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        delBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        cDeleteBtn.setText("C");
        cDeleteBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        cDeleteBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        cDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDeleteBtnActionPerformed(evt);
            }
        });

        ceBtn.setText("CE");
        ceBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ceBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        ceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceBtnActionPerformed(evt);
            }
        });

        inputLabel.setText("Input");

        outputLabel.setText("Output");

        parenthLBtn.setText("(");
        parenthLBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        parenthLBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        parenthLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parenthLBtnActionPerformed(evt);
            }
        });

        parenthRBtn.setText(")");
        parenthRBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        parenthRBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        parenthRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parenthRBtnActionPerformed(evt);
            }
        });

        fBtn.setText("F");
        fBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        fBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBtnActionPerformed(evt);
            }
        });

        aBtn.setText("A");
        aBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        aBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBtnActionPerformed(evt);
            }
        });

        bBtn.setText("B");
        bBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        bBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBtnActionPerformed(evt);
            }
        });

        cBtn.setText("C");
        cBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        cBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBtnActionPerformed(evt);
            }
        });

        dBtn.setText("D");
        dBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        dBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnActionPerformed(evt);
            }
        });

        eBtn.setText("E");
        eBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        eBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBtnActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");

        copyInputMenuItem.setText("Copy input to clipboard");
        copyInputMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyInputMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyInputMenuItem);

        copyOutputMenuItem.setText("Copy output to clipboard");
        copyOutputMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyOutputMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyOutputMenuItem);

        pasteInputMenuItem.setText("Paste from clipboard to input");
        pasteInputMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteInputMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteInputMenuItem);

        menuBar.add(editMenu);

        baseMenu.setText("Base");

        binaryMenuRadio.setSelected(true);
        binaryMenuRadio.setText("Binary");
        binaryMenuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryMenuRadioActionPerformed(evt);
            }
        });
        baseMenu.add(binaryMenuRadio);

        octalMenuRadio.setSelected(true);
        octalMenuRadio.setText("Octal");
        octalMenuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octalMenuRadioActionPerformed(evt);
            }
        });
        baseMenu.add(octalMenuRadio);

        decimalMenuRadio.setSelected(true);
        decimalMenuRadio.setText("Decimal");
        decimalMenuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalMenuRadioActionPerformed(evt);
            }
        });
        baseMenu.add(decimalMenuRadio);

        hexadecimalMenuRadio.setSelected(true);
        hexadecimalMenuRadio.setText("Hexadecimal");
        hexadecimalMenuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexadecimalMenuRadioActionPerformed(evt);
            }
        });
        baseMenu.add(hexadecimalMenuRadio);

        menuBar.add(baseMenu);

        angleMenu.setText("Angle");

        radiansMenuRadio.setSelected(true);
        radiansMenuRadio.setText("Radians");
        radiansMenuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiansMenuRadioActionPerformed(evt);
            }
        });
        angleMenu.add(radiansMenuRadio);

        degreesMenuRadio.setSelected(true);
        degreesMenuRadio.setText("Degrees");
        degreesMenuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesMenuRadioActionPerformed(evt);
            }
        });
        angleMenu.add(degreesMenuRadio);

        menuBar.add(angleMenu);

        modeMenu.setText("Mode");

        noobMenuRadio.setSelected(true);
        noobMenuRadio.setText("Noob (basic usic)");
        noobMenuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noobMenuRadioActionPerformed(evt);
            }
        });
        modeMenu.add(noobMenuRadio);

        guidedMenuRadio.setSelected(true);
        guidedMenuRadio.setText("Guided (restricted input)");
        guidedMenuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guidedMenuRadioActionPerformed(evt);
            }
        });
        modeMenu.add(guidedMenuRadio);

        freeMenuRadio.setSelected(true);
        freeMenuRadio.setText("Advanced (free input)");
        freeMenuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freeMenuRadioActionPerformed(evt);
            }
        });
        modeMenu.add(freeMenuRadio);

        menuBar.add(modeMenu);

        historyMenu.setText("History");
        menuBar.add(historyMenu);

        helpMenu.setText("Help");

        manualMenuItem.setText("Manual");
        manualMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(manualMenuItem);

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputLabel)
                            .addComponent(inputLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputField)
                            .addComponent(inputField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cosBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sinBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(moduloBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(decimalMarkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(divBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(mulBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parenthLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parenthRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLabel)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moduloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mulBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(expBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(parenthLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(decimalMarkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(parenthRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        insertOperation("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        insertOperation("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        insertOperation("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        insertOperation("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        insertOperation("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        insertOperation("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        insertOperation("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        insertOperation("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        insertOperation("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBtnActionPerformed
        String s = "/";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_divBtnActionPerformed

    private void moduloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloBtnActionPerformed
        String s = "%";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_moduloBtnActionPerformed

    private void mulBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulBtnActionPerformed
        String s = "*";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_mulBtnActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        String s = "-";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_subBtnActionPerformed

    private void decimalMarkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalMarkBtnActionPerformed
        insertOperation(".");
    }//GEN-LAST:event_decimalMarkBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String s = "+";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_addBtnActionPerformed

    private void cosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosBtnActionPerformed
        String s = "cos(";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_cosBtnActionPerformed

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        String s = "log2(";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_logBtnActionPerformed

    private void expBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expBtnActionPerformed
        String s = "exp(";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_expBtnActionPerformed

    private void lnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnBtnActionPerformed
        String s = "ln(";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_lnBtnActionPerformed

    private void sinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinBtnActionPerformed
        String s = "sin(";
        s = checkIfUsingOuputAsInput(s);
        insertOperation(s);
    }//GEN-LAST:event_sinBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        if (!inputField.getText().isEmpty()) {
            inputField.setText(inputField.getText().substring(0, inputField.getText().length()-1));
            displayInputWarning();
        }
        lastKeyWasEqual = false;
    }//GEN-LAST:event_delBtnActionPerformed

    private void cDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDeleteBtnActionPerformed
        inputField.setText("");
        outputField.setText("");
        Border border = BorderFactory.createLineBorder(Color.red);
        inputField.setBorder(UIManager.getBorder("TextField.border"));
        historyMenu.removeAll();
        lastKeyWasEqual = false;
    }//GEN-LAST:event_cDeleteBtnActionPerformed

    private void ceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceBtnActionPerformed
        inputField.setText("");
        outputField.setText("");
        inputField.setBorder(UIManager.getBorder("TextField.border"));
        lastKeyWasEqual = false;
    }//GEN-LAST:event_ceBtnActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        insertOperation("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        outputField.setText(control.calculate(inputField.getText()));
        String input = inputField.getText();
        input = input.replaceAll("\\s|\\n", "");    // Removing white spaces and break lines
        
        insertHistoryItem(input + "   =   " + outputField.getText());
        lastKeyWasEqual = true;
    }//GEN-LAST:event_equalBtnActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog(this, "App created by Guillermo Montes Martos (xmonte03).\nAll rights reserved.");
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void parenthLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parenthLBtnActionPerformed
        insertOperation("(");
    }//GEN-LAST:event_parenthLBtnActionPerformed

    private void parenthRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parenthRBtnActionPerformed
        insertOperation(")");
    }//GEN-LAST:event_parenthRBtnActionPerformed

    private void binaryMenuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryMenuRadioActionPerformed
        control.setBase(Base.BINARY);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        decimalMarkBtn.setEnabled(false);
        showComplexOperations(false);
        showLetters(false);
    }//GEN-LAST:event_binaryMenuRadioActionPerformed

    private void octalMenuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octalMenuRadioActionPerformed
        control.setBase(Base.OCTAL);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        decimalMarkBtn.setEnabled(false);
        showComplexOperations(false);
        showLetters(false);
    }//GEN-LAST:event_octalMenuRadioActionPerformed

    private void radiansMenuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiansMenuRadioActionPerformed
        control.setAngleUnit(Angle.RADIANS);
    }//GEN-LAST:event_radiansMenuRadioActionPerformed

    private void degreesMenuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesMenuRadioActionPerformed
        control.setAngleUnit(Angle.DEGREES);
    }//GEN-LAST:event_degreesMenuRadioActionPerformed

    private void decimalMenuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalMenuRadioActionPerformed
        control.setBase(Base.DECIMAL);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        decimalMarkBtn.setEnabled(true);
        if(control.getMode()!=Mode.NOOB)
            showComplexOperations(true);
        showLetters(false);
    }//GEN-LAST:event_decimalMenuRadioActionPerformed

    private void hexadecimalMenuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexadecimalMenuRadioActionPerformed
        control.setBase(Base.HEXADECIMAL);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        decimalMarkBtn.setEnabled(false);
        showComplexOperations(false);
        showLetters(true);
    }//GEN-LAST:event_hexadecimalMenuRadioActionPerformed

    private void copyInputMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyInputMenuItemActionPerformed
        if (inputField.getText().length() != 0){
            try {
                StringSelection selection = new StringSelection(inputField.getText());
                clipboard.setContents(selection, selection);
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_copyInputMenuItemActionPerformed

    private void copyOutputMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyOutputMenuItemActionPerformed
        if (outputField.getText().length() != 0){
            try {
                StringSelection selection = new StringSelection(outputField.getText());
                clipboard.setContents(selection, selection);
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_copyOutputMenuItemActionPerformed

    private void pasteInputMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteInputMenuItemActionPerformed
        String data = new String("");
        try {
            data = (String) clipboard.getData(DataFlavor.stringFlavor);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        inputField.setText(data);
        displayInputWarning();
    }//GEN-LAST:event_pasteInputMenuItemActionPerformed

    private void fBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBtnActionPerformed
        insertOperation("F");
    }//GEN-LAST:event_fBtnActionPerformed

    private void aBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBtnActionPerformed
        insertOperation("A");
    }//GEN-LAST:event_aBtnActionPerformed

    private void bBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBtnActionPerformed
        insertOperation("B");
    }//GEN-LAST:event_bBtnActionPerformed

    private void cBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtnActionPerformed
        insertOperation("C");
    }//GEN-LAST:event_cBtnActionPerformed

    private void dBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnActionPerformed
        insertOperation("D");
    }//GEN-LAST:event_dBtnActionPerformed

    private void eBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBtnActionPerformed
        insertOperation("E");
    }//GEN-LAST:event_eBtnActionPerformed

    private void guidedMenuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guidedMenuRadioActionPerformed
        if (control.getMode() == Mode.NOOB && control.getBase() == Base.DECIMAL)
            showComplexOperations(true);
            
        control.setMode(Mode.GUIDED);
        inputField.setEditable(false);
        inputField.setFocusable(false);
        displayInputWarning();
    }//GEN-LAST:event_guidedMenuRadioActionPerformed

    private void freeMenuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freeMenuRadioActionPerformed
        if (control.getMode() == Mode.NOOB) 
            showComplexOperations(true);
        
        control.setMode(Mode.FREE);
        inputField.setEditable(true);
        inputField.setFocusable(true);
        displayInputWarning();
    }//GEN-LAST:event_freeMenuRadioActionPerformed

    private void manualMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualMenuItemActionPerformed
        try{
            java.awt.Desktop.getDesktop().browse(new URI(DOC_URL));
        }
        catch (Exception e) {
            JTextArea text = new JTextArea(e.getMessage() + "\nOpen this URL in your browser: \n" + DOC_URL);
            text.setEditable(false);
            JOptionPane.showMessageDialog(this, text);
        }
    }//GEN-LAST:event_manualMenuItemActionPerformed

    private void noobMenuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noobMenuRadioActionPerformed
        control.setMode(Mode.NOOB);
        showComplexOperations(false);
        inputField.setEditable(false);
        inputField.setFocusable(false);
        displayInputWarning();
    }//GEN-LAST:event_noobMenuRadioActionPerformed
    // <editor-fold defaultstate="collapsed" desc="End Generated Code">
    
    
    /**
     * Sets the controller that will work as midlayer.
     * @param cont Controller instance.
     */
    public void setController(Controller cont){
        control = cont;
    }
    
    
    /**
     * Enables/disables the advaced operation buttons.
     * @param show True is enable, false is disable.
     */
    private void showComplexOperations(boolean show) {
        sinBtn.setEnabled(show);
        cosBtn.setEnabled(show);
        expBtn.setEnabled(show);
        logBtn.setEnabled(show);
        lnBtn.setEnabled(show);
    }
    
    
    /**
     * Enables/disables letter buttons.
     * @param show True is enable, false is disable.
     */
    private void showLetters(boolean show) {
        aBtn.setEnabled(show);
        bBtn.setEnabled(show);
        cBtn.setEnabled(show);
        dBtn.setEnabled(show);
        eBtn.setEnabled(show);
        fBtn.setEnabled(show);
    }
    
    
    /**
     * Sets the correct input/output when making calculationgs in a row.
     * @param op Operation that will use the output of last calculation.
     * @return Operation to set.
     */
    private String checkIfUsingOuputAsInput(String op) {
        if (lastKeyWasEqual) {
            op = (op.contains("("))? op + outputField.getText() + ")" : outputField.getText() + op;
            lastKeyWasEqual = false;
            inputField.setText("");
            outputField.setText("");
        }
        return op;
    }
    
    
    /**
     * Inserts a new formatted base unit operation into the input in the correct position.
     * @param op 
     */
    private void insertOperation(String op) {
        int pos = inputField.getCaretPosition();
        if (opIsNumber(op)){
            switch (control.getBase()) {
                case BINARY:
                        op = ( inputField.getText().length() == 0 || !inputField.getText().substring(pos-1, pos).matches("([0-1])") )? BIN_STR + op : op;
                    break;
                case OCTAL:
                    op = ( inputField.getText().length() == 0 || !inputField.getText().substring(pos-1, pos).matches("([0-7])") )? OCT_STR + op : op;
                    break;
                case HEXADECIMAL:
                    op = ( inputField.getText().length() == 0 || !inputField.getText().substring(pos-1, pos).matches("([0-9a-fA-F]+)") )? HEX_STR + op : op;
                    break;
            }
        }
        inputField.setText(new StringBuilder(inputField.getText()).insert(pos, op).toString());
        inputField.setCaretPosition(pos+op.length());
        displayInputWarning();
    }
    
    
    /**
     * Creates and inserts a new element into the history.
     * @param text String corresponding to the last calculation.
     */
    private void insertHistoryItem(String text) {
        if (historyMenu.getMenuComponentCount() == HISTORY_LIMIT)
            historyMenu.remove(historyMenu.getMenuComponentCount()-1);
            
        JMenuItem item = new JMenuItem(text);
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputField.setText(item.getText().substring(0, item.getText().indexOf("=")-2));
                outputField.setText("");
            }
        });
        historyMenu.insert(item, 0);
    }
    
    
    /**
     * Sets the functionality of the keyboard, adding event and setting action to keys.
     * @param event Event to dispatch.
     */
    @Override
    public void eventDispatched(AWTEvent event) {
        if (event instanceof KeyEvent) {
            KeyEvent key = (KeyEvent) event;
            if (key.getID() == KeyEvent.KEY_PRESSED) { //Handle key presses
                ActionEvent ae = new ActionEvent(event.getSource(), event.getID(), event.paramString());
                
                if (!inputField.isFocusOwner()){
                    switch (key.getKeyCode()) {
                        case KeyEvent.VK_0:
                        case KeyEvent.VK_NUMPAD0:
                            btn0ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_1:
                        case KeyEvent.VK_NUMPAD1:                    
                            btn1ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_2:
                        case KeyEvent.VK_NUMPAD2:                    
                            btn2ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_3:
                        case KeyEvent.VK_NUMPAD3:
                            btn3ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_4:
                        case KeyEvent.VK_NUMPAD4:
                            btn4ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_5:
                        case KeyEvent.VK_NUMPAD5:                    
                            btn5ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_6:
                        case KeyEvent.VK_NUMPAD6:
                            btn6ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_7:
                        case KeyEvent.VK_NUMPAD7:
                            btn7ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_8:
                        case KeyEvent.VK_NUMPAD8:
                            btn8ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_9:
                        case KeyEvent.VK_NUMPAD9:
                            btn9ActionPerformed(ae);
                            break;
                        case KeyEvent.VK_A:
                            aBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_B:
                            bBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_C:
                            cBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_D:
                            dBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_E:
                            eBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_F:
                            fBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_PERIOD:
                        case KeyEvent.VK_DECIMAL:
                            decimalMarkBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_ADD:
                        case KeyEvent.VK_PLUS:
                            addBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_SUBTRACT:
                        case KeyEvent.VK_MINUS:
                            subBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_MULTIPLY:
                        case KeyEvent.VK_ASTERISK:
                            mulBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_SLASH:
                        case KeyEvent.VK_DIVIDE:
                            divBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_BACK_SPACE:
                            delBtnActionPerformed(ae);
                            break;
                        case KeyEvent.VK_DELETE:
                            ceBtnActionPerformed(ae);
                            break;
                    }
                }
                
                if (key.getKeyCode() == KeyEvent.VK_ENTER) {
                    equalBtnActionPerformed(ae);
                }
                
            } // if (key.getID()...PRESSED)
        }
    }
    
    
    /**
     * Checks if a warning should be displayed in the input  and does it in the positive case.
     */
    private void displayInputWarning() {
        switch (control.getMode()){
            case FREE:
                inputField.setBorder(UIManager.getBorder("TextField.border"));
                break;
            case NOOB:
            case GUIDED:
                if (inputField.getText().length()!=0 && !control.checkInput(inputField.getText())) {
                    Border border = BorderFactory.createLineBorder(Color.red);
                    inputField.setBorder(border);
                } else {
                    inputField.setBorder(UIManager.getBorder("TextField.border"));
                }
                break;
        }
    }
    
    
    /**
     * Checks if the operation is a number.
     * @param op Operation to check.
     * @return True if it's a number, false in other case.
     */
    public boolean opIsNumber(String op) {
        if (op.length() == 1) {
            char c = op.toLowerCase().charAt(0);
            switch (control.getBase()) {
                case BINARY:
                    if (c=='0' || c=='1')
                        return true;
                    break;
                case OCTAL:
                    if (c>='0' && c<='7')
                        return true;
                    break;
                case HEXADECIMAL:
                    if ( (c>='0' && c<='9') || (c>='a' && c<='f'))
                        return true;
                    break;
            }
        }
        return false;
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aBtn;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton addBtn;
    private javax.swing.JMenu angleMenu;
    private javax.swing.JButton bBtn;
    private javax.swing.JMenu baseMenu;
    private javax.swing.JRadioButtonMenuItem binaryMenuRadio;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton cBtn;
    private javax.swing.JButton cDeleteBtn;
    private javax.swing.JButton ceBtn;
    private javax.swing.JMenuItem copyInputMenuItem;
    private javax.swing.JMenuItem copyOutputMenuItem;
    private javax.swing.JButton cosBtn;
    private javax.swing.JButton dBtn;
    private javax.swing.JButton decimalMarkBtn;
    private javax.swing.JRadioButtonMenuItem decimalMenuRadio;
    private javax.swing.JRadioButtonMenuItem degreesMenuRadio;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton divBtn;
    private javax.swing.JButton eBtn;
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton equalBtn;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JButton expBtn;
    private javax.swing.JButton fBtn;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JRadioButtonMenuItem freeMenuRadio;
    private javax.swing.JRadioButtonMenuItem guidedMenuRadio;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JRadioButtonMenuItem hexadecimalMenuRadio;
    private javax.swing.JMenu historyMenu;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JButton lnBtn;
    private javax.swing.JButton logBtn;
    private javax.swing.JMenuItem manualMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu modeMenu;
    private javax.swing.JButton moduloBtn;
    private javax.swing.JButton mulBtn;
    private javax.swing.JRadioButtonMenuItem noobMenuRadio;
    private javax.swing.JRadioButtonMenuItem octalMenuRadio;
    private javax.swing.JTextField outputField;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton parenthLBtn;
    private javax.swing.JButton parenthRBtn;
    private javax.swing.JMenuItem pasteInputMenuItem;
    private javax.swing.JRadioButtonMenuItem radiansMenuRadio;
    private javax.swing.JButton sinBtn;
    private javax.swing.JButton subBtn;
    // End of variables declaration//GEN-END:variables
    
    /** Controller of the application */
    private Controller control;
    private ButtonGroup baseGroup;
    private ButtonGroup angleGroup;
    private ButtonGroup modeGroup;
    private Clipboard clipboard;
    private static final int HISTORY_LIMIT = 20;
    private static final String DOC_URL = "http://mathjs.org/docs/expressions/syntax.html";
    private static final String BIN_STR = "0b";
    private static final String OCT_STR = "0o";
    private static final String HEX_STR = "0x";
    private boolean lastKeyWasEqual;

}
