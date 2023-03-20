package calculadora;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    double num1, num2;
    String signo;
    String num1Ope, num2Ope;
    Double pot, raiz2;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_resul = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_porc = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_prod = new javax.swing.JButton();
        btn_rest = new javax.swing.JButton();
        btn_sum = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_c1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(227, 242, 253));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 37));

        txtResultado.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 310, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/modolight.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 61, 33));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("•");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("•");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_resul.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        btn_resul.setForeground(new java.awt.Color(0, 0, 0));
        btn_resul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton3.png"))); // NOI18N
        btn_resul.setText("=");
        btn_resul.setAlignmentY(0.0F);
        btn_resul.setBorder(null);
        btn_resul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resul.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_resul.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_resul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resulActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 50, 50));

        btn_9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(0, 0, 0));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setAlignmentY(0.0F);
        btn_9.setBorder(null);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 50));

        btn_porc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        btn_porc.setForeground(new java.awt.Color(0, 0, 0));
        btn_porc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_porc.setText("%");
        btn_porc.setAlignmentY(0.0F);
        btn_porc.setBorder(null);
        btn_porc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_porc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_porc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btn_exp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(0, 0, 0));
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_exp.setText("^");
        btn_exp.setAlignmentY(0.0F);
        btn_exp.setBorder(null);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_div.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        btn_div.setForeground(new java.awt.Color(0, 0, 0));
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_div.setText("÷");
        btn_div.setAlignmentY(0.0F);
        btn_div.setBorder(null);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btn_prod.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        btn_prod.setForeground(new java.awt.Color(0, 0, 0));
        btn_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_prod.setText("X");
        btn_prod.setAlignmentY(0.0F);
        btn_prod.setBorder(null);
        btn_prod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_prod.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_prod.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prodActionPerformed(evt);
            }
        });
        jPanel2.add(btn_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, 50));

        btn_rest.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        btn_rest.setForeground(new java.awt.Color(0, 0, 0));
        btn_rest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_rest.setText("-");
        btn_rest.setAlignmentY(0.0F);
        btn_rest.setBorder(null);
        btn_rest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_rest.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_rest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restActionPerformed(evt);
            }
        });
        jPanel2.add(btn_rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 50, 50));

        btn_sum.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        btn_sum.setForeground(new java.awt.Color(0, 0, 0));
        btn_sum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_sum.setText("+");
        btn_sum.setAlignmentY(0.0F);
        btn_sum.setBorder(null);
        btn_sum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sum.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_sum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 50, 50));

        btn_c.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        btn_c.setForeground(new java.awt.Color(0, 0, 0));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setAlignmentY(0.0F);
        btn_c.setBorder(null);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(0, 0, 0));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setAlignmentY(0.0F);
        btn_7.setBorder(null);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        btn_8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(0, 0, 0));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setAlignmentY(0.0F);
        btn_8.setBorder(null);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 50));

        btn_6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(0, 0, 0));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setAlignmentY(0.0F);
        btn_6.setBorder(null);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 50));

        btn_5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(0, 0, 0));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setAlignmentY(0.0F);
        btn_5.setBorder(null);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 50));

        btn_4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(0, 0, 0));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setAlignmentY(0.0F);
        btn_4.setBorder(null);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        btn_1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(0, 0, 0));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setAlignmentY(0.0F);
        btn_1.setBorder(null);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        btn_2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(0, 0, 0));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setAlignmentY(0.0F);
        btn_2.setBorder(null);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 50, 50));

        btn_3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(0, 0, 0));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setAlignmentY(0.0F);
        btn_3.setBorder(null);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 50, 50));

        btn_0.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(0, 0, 0));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setAlignmentY(0.0F);
        btn_0.setBorder(null);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        btn_punto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(0, 0, 0));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setAlignmentY(0.0F);
        btn_punto.setBorder(null);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, 50));

        btn_c1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        btn_c1.setForeground(new java.awt.Color(0, 0, 0));
        btn_c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_c1.setText("CE");
        btn_c1.setAlignmentY(0.0F);
        btn_c1.setBorder(null);
        btn_c1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton_1.png"))); // NOI18N
        btn_c1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/botonpress.png"))); // NOI18N
        btn_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 340, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
       
        addnumeroOpe("0");
        txtResultado.setText(txtResultado.getText() + "0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        
        addnumeroOpe("1");
        txtResultado.setText(txtResultado.getText() + "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // addnumero("2");
        addnumeroOpe("2");
        txtResultado.setText(txtResultado.getText() + "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        //addnumero("3");
        addnumeroOpe("3");
        txtResultado.setText(txtResultado.getText() + "3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // addnumero("4");
        addnumeroOpe("4");
        txtResultado.setText(txtResultado.getText() + "4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        //  addnumero("5");
        addnumeroOpe("5");
        txtResultado.setText(txtResultado.getText() + "5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        //   addnumero("6");
        addnumeroOpe("6");
        txtResultado.setText(txtResultado.getText() + "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // addnumero("7");
        addnumeroOpe("7");
        txtResultado.setText(txtResultado.getText() + "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // addnumero("8");
        addnumeroOpe("8");
        txtResultado.setText(txtResultado.getText() + "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        //  addnumero("9");
        addnumeroOpe("9");
        txtResultado.setText(txtResultado.getText() + "9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumActionPerformed
        //  addnumero("+");
        addnumeroOpe("+");
        num1Ope = txtOperacion.getText();
        num1 = Double.parseDouble(txtResultado.getText());
        signo = "+";
        txtResultado.setText("");

    }//GEN-LAST:event_btn_sumActionPerformed

    private void btn_restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restActionPerformed
        //  addnumero("-");
        addnumeroOpe("-");
        num1Ope = txtOperacion.getText();
        num1 = Double.parseDouble(txtResultado.getText());
        signo = "-";
        txtResultado.setText("");
    }//GEN-LAST:event_btn_restActionPerformed

    private void btn_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prodActionPerformed
        // addnumero("x");
        addnumeroOpe("x");
        num1Ope = txtOperacion.getText();
        num1 = Double.parseDouble(txtResultado.getText());
        signo = "*";
        txtResultado.setText("");
    }//GEN-LAST:event_btn_prodActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        //  addnumero("÷");
        addnumeroOpe("÷");
        num1Ope = txtOperacion.getText();
        num1 = Double.parseDouble(txtResultado.getText());
        signo = "/";
        txtResultado.setText("");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        addnumeroOpe("^");
        num1Ope = txtOperacion.getText();
        num1 = Double.parseDouble(txtResultado.getText());
        signo = "Math.pow(num1, num2);";
        txtResultado.setText("");
        
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_porcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcActionPerformed
        //  addnumero("%");
        addnumeroOpe("%");
        num1Ope = txtOperacion.getText();
        num1 = Double.parseDouble(txtResultado.getText());
        signo = "%";
        txtResultado.setText("");
    }//GEN-LAST:event_btn_porcActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        addnumero(".");
        addnumeroOpe(".");
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_resulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resulActionPerformed
        num2 = Double.parseDouble(txtResultado.getText());

        switch (signo) {
            case "+":
                txtResultado.setText(Double.toString(num1 + num2));
                break;
            case "-":
                txtResultado.setText(Double.toString(num1 - num2));
                break;
            case "*":
                txtResultado.setText(Double.toString(num1 * num2));
                break;
            case "/":
                txtResultado.setText(Double.toString(num1 / num2));
                break;
            case "Math.pow(num1, num2);":
                pot = Math.pow(num1, num2);
                txtResultado.setText(Double.toString(pot));
                break;
            case "%":
                txtResultado.setText(Double.toString((num1 * num2)/100));
                break;
        }
    }//GEN-LAST:event_btn_resulActionPerformed

    private void btn_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c1ActionPerformed
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length() - 1);
        txtOperacion.setText(texto);

    }//GEN-LAST:event_btn_c1ActionPerformed

    boolean mododark = false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!mododark){
        
        jPanel1.setBackground(Color.decode("#212b41"));
        jPanel2.setBackground(Color.decode("#2e3951"));
        txtOperacion.setForeground(Color.decode("#112ed1"));
        txtResultado.setForeground(Color.decode("#112ed1"));

        CambiarColorBtn2(btn_prod);
        CambiarColorBtn2(btn_sum);
        CambiarColorBtn2(btn_rest);
        CambiarColorBtn2(btn_div);
        CambiarColorBtn2(btn_c);
        CambiarColorBtn2(btn_c1);
        CambiarColorBtn2(btn_porc);
        CambiarColorBtn2(btn_exp);
        
        CambiarColorBtn(btn_1);
        CambiarColorBtn(btn_2);
        CambiarColorBtn(btn_3);
        CambiarColorBtn(btn_4);
        CambiarColorBtn(btn_5);
        CambiarColorBtn(btn_6);
        CambiarColorBtn(btn_7);
        CambiarColorBtn(btn_8);
        CambiarColorBtn(btn_9);
        CambiarColorBtn(btn_0);
        CambiarColorBtn(btn_punto);
        
        jButton1.setIcon(new ImageIcon(getClass().getResource("/imagen/mododark.png")));
        btn_resul.setIcon(new ImageIcon(getClass().getResource("/imagen/btnresuldark1.png")));
        btn_resul.setPressedIcon(new ImageIcon(getClass().getResource("/imagen/btnpressdark.png")));
        btn_resul.setRolloverIcon(new ImageIcon(getClass().getResource("/imagen/btnpressdark1.png")));
        btn_resul.setForeground(Color.white);
        mododark=true;
        }else{
            Calculadora cal = new Calculadora();
            this.dispose();
            cal.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
   
    public void CambiarColorBtn2(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagen/btnpressdark.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/imagen/btnpressdark.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/imagen/btnpressdark1.png")));
        boton.setForeground(Color.white);
    }
    
    public void CambiarColorBtn(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagen/btncambio.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/imagen/btncambio.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/imagen/btnpressdark.png")));
        boton.setForeground(Color.white);
    }

    public void addnumero(String digito) {
        txtResultado.setText(txtResultado.getText() + digito);
    }

    public void addnumeroOpe(String digito) {
        txtOperacion.setText(txtOperacion.getText() + digito);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_c1;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_porc;
    private javax.swing.JButton btn_prod;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_rest;
    private javax.swing.JButton btn_resul;
    private javax.swing.JButton btn_sum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
