/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library_view;

import unused.Operations;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author milly g
 */
public class Library_frame extends javax.swing.JFrame {
    private Operations op;
    private Client cl;
    private Library_view.PassWordDialog passDialog;
    /**
     * Creates new form Library_frame
     */
    public Library_frame() {
        passDialog = new Library_view.PassWordDialog(this, true);
        passDialog.setVisible(true);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Operations = new javax.swing.JMenu();
        Opmenu = new javax.swing.JMenuItem();
        Settings = new javax.swing.JMenu();
        clientMenu = new javax.swing.JMenuItem();
        BookMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Operations.setText("Operations");
        Operations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationsActionPerformed(evt);
            }
        });

        Opmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Opmenu.setMnemonic('o');
        Opmenu.setText("Operations");
        Opmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpmenuActionPerformed(evt);
            }
        });
        Operations.add(Opmenu);

        jMenuBar1.add(Operations);

        Settings.setText("Settings");

        clientMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, java.awt.event.InputEvent.CTRL_MASK));
        clientMenu.setText("Client");
        clientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientMenuActionPerformed(evt);
            }
        });
        Settings.add(clientMenu);

        BookMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SEPARATER, java.awt.event.InputEvent.CTRL_MASK));
        BookMenu.setText("Book");
        BookMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookMenuActionPerformed(evt);
            }
        });
        Settings.add(BookMenu);

        jMenuBar1.add(Settings);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OperationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperationsActionPerformed
        
    }//GEN-LAST:event_OperationsActionPerformed

    private void clientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientMenuActionPerformed
        // TODO add your handling code here:
       Client CLI = new Client();
       desktop.add(CLI);
       CLI.show();
       
    }//GEN-LAST:event_clientMenuActionPerformed

    private void BookMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookMenuActionPerformed
        // TODO add your handling code here:
        Book_view bk=new Book_view();
        desktop.add(bk);
        bk.show();
       
      

    }//GEN-LAST:event_BookMenuActionPerformed

    private void OpmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpmenuActionPerformed

    op ope=new op();
        desktop.add(ope);
        ope.show();
//        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_OpmenuActionPerformed

    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BookMenu;
    private javax.swing.JMenu Operations;
    private javax.swing.JMenuItem Opmenu;
    private javax.swing.JMenu Settings;
    private javax.swing.JMenuItem clientMenu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
class PassWordDialog extends JDialog {

    private final JLabel jlblUsername = new JLabel("Username");
    private final JLabel jlblPassword = new JLabel("Password");

    private final JTextField jtfUsername = new JTextField(15);
    private final JPasswordField jpfPassword = new JPasswordField();

    private final JButton jbtOk = new JButton("Login");
    private final JButton jbtCancel = new JButton("Cancel");

    private final JLabel jlblStatus = new JLabel(" ");

    public PassWordDialog() {
        this(null, true);
    }

    public PassWordDialog(final JFrame parent, boolean modal) {
        super(parent, modal);

        JPanel p3 = new JPanel(new GridLayout(2, 1));
        p3.add(jlblUsername);
        p3.add(jlblPassword);

        JPanel p4 = new JPanel(new GridLayout(2, 1));
        p4.add(jtfUsername);
        p4.add(jpfPassword);

        JPanel p1 = new JPanel();
        p1.add(p3);
        p1.add(p4);

        JPanel p2 = new JPanel();
        p2.add(jbtOk);
        p2.add(jbtCancel);

        JPanel p5 = new JPanel(new BorderLayout());
        p5.add(p2, BorderLayout.CENTER);
        p5.add(jlblStatus, BorderLayout.NORTH);
        jlblStatus.setForeground(Color.RED);
        jlblStatus.setHorizontalAlignment(SwingConstants.CENTER);

        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p5, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        addWindowListener(new WindowAdapter() {  
            @Override
            public void windowClosing(WindowEvent e) {  
                System.exit(0);  
            }  
        });


        jbtOk.addActionListener((ActionEvent e) -> {
            if ("stackoverflow".equals(String.valueOf(jpfPassword.getPassword()))
                    && "stackoverflow".equals(jtfUsername.getText())) {
                parent.setVisible(true);
                setVisible(false);
            } else {
                jlblStatus.setText("Invalid username or password");
            }
        });
        jbtCancel.addActionListener((ActionEvent e) -> {
            setVisible(false);
            parent.dispose();
            System.exit(0);
        });
    }
}
}
