
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.Line;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Highlighter;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        jb_generarcodigo.setEnabled(false);
        jMenu2.setEnabled(false);
        jButton1.setEnabled(false);
        fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        dlm = new DefaultListModel();
        lista.setModel(dlm);
        cargarcomponentes();
        jMenuItem2.setEnabled(false);
        jMenuItem9.setEnabled(false);
        jButton9.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_flujos = new javax.swing.JDialog();
        jb_iniciofin = new javax.swing.JButton();
        jb_decision = new javax.swing.JButton();
        jb_separadorv = new javax.swing.JButton();
        jb_separadorh = new javax.swing.JButton();
        jb_proceso = new javax.swing.JButton();
        jb_datos = new javax.swing.JButton();
        jp_flujo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jb_generarcodigo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jd_UML = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jp_uml = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        pp_menu1 = new javax.swing.JPopupMenu();
        cambiar_color = new javax.swing.JMenuItem();
        eliminar1 = new javax.swing.JMenuItem();
        cambiar_fuente1 = new javax.swing.JMenuItem();
        pp_menu2 = new javax.swing.JPopupMenu();
        cambiar_color2 = new javax.swing.JMenuItem();
        cambiar_texto = new javax.swing.JMenuItem();
        cambiar_fuente = new javax.swing.JMenuItem();
        eliminar2 = new javax.swing.JMenuItem();
        copiar1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jb_crearflujo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jb_crearflujo1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jb_crearuml = new javax.swing.JButton();
        jd_vercodigo = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tp_codigo = new javax.swing.JTextPane();
        jd_fuente = new javax.swing.JDialog();
        combo = new javax.swing.JComboBox<>();
        texto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jd_atributos = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        rb_protected = new javax.swing.JRadioButton();
        rb_private = new javax.swing.JRadioButton();
        rb_public = new javax.swing.JRadioButton();
        rb_int = new javax.swing.JRadioButton();
        rb_double = new javax.swing.JRadioButton();
        rb_string = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        tf_atributo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        bg_enca = new javax.swing.ButtonGroup();
        bg_tipo = new javax.swing.ButtonGroup();
        pp_menu3 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jd_vercodigo1 = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        tp_codigo1 = new javax.swing.JTextPane();
        pp_menu4 = new javax.swing.JPopupMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        pp_menu5 = new javax.swing.JPopupMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        panel_menu = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jd_flujos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_iniciofin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in_fin.png"))); // NOI18N
        jb_iniciofin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_iniciofinMouseClicked(evt);
            }
        });
        jd_flujos.getContentPane().add(jb_iniciofin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, 102, -1));

        jb_decision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if.png"))); // NOI18N
        jb_decision.setToolTipText("");
        jb_decision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_decisionMouseClicked(evt);
            }
        });
        jd_flujos.getContentPane().add(jb_decision, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 102, -1));

        jb_separadorv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        jb_separadorv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_separadorvMouseClicked(evt);
            }
        });
        jb_separadorv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_separadorvActionPerformed(evt);
            }
        });
        jd_flujos.getContentPane().add(jb_separadorv, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 512, 16, -1));

        jb_separadorh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separadorV.png"))); // NOI18N
        jb_separadorh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_separadorhMouseClicked(evt);
            }
        });
        jd_flujos.getContentPane().add(jb_separadorh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 458, 115, -1));

        jb_proceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proceso.png"))); // NOI18N
        jb_proceso.setToolTipText("");
        jb_proceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_procesoMouseClicked(evt);
            }
        });
        jd_flujos.getContentPane().add(jb_proceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 261, 102, 68));

        jb_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos.png"))); // NOI18N
        jb_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_datosMouseClicked(evt);
            }
        });
        jb_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_datosActionPerformed(evt);
            }
        });
        jd_flujos.getContentPane().add(jb_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 103, -1));

        jp_flujo.setBackground(new java.awt.Color(255, 255, 255));
        jp_flujo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jp_flujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_flujoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_flujoLayout = new javax.swing.GroupLayout(jp_flujo);
        jp_flujo.setLayout(jp_flujoLayout);
        jp_flujoLayout.setHorizontalGroup(
            jp_flujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        jp_flujoLayout.setVerticalGroup(
            jp_flujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jd_flujos.getContentPane().add(jp_flujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Procesos");
        jd_flujos.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, -1, -1));

        jLabel4.setText("Inicio o fin");
        jd_flujos.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Conectores");
        jd_flujos.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 381, -1, -1));

        jLabel5.setText("Decision");
        jd_flujos.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel6.setText("Proceso");
        jd_flujos.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 241, -1, -1));

        jLabel7.setText("Datos");
        jd_flujos.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel8.setText("Conector Horizontal");
        jd_flujos.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 433, -1, -1));

        jLabel9.setText("Conector Vertical");
        jd_flujos.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 491, -1, -1));

        jButton12.setText("Limpiar ");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jd_flujos.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 79, -1));

        jb_generarcodigo.setText("Generar Codigo");
        jb_generarcodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_generarcodigoMouseClicked(evt);
            }
        });
        jd_flujos.getContentPane().add(jb_generarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        jButton1.setText("Ver Codigo Generado");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jd_flujos.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo blanco.jpg"))); // NOI18N
        jd_flujos.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

        jButton4.setText("jButton4");
        jd_flujos.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32658, -32256, -1, -1));

        jButton10.setText("jButton10");
        jd_flujos.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32651, -32252, -1, -1));

        jButton11.setText("jButton11");
        jd_flujos.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32596, -32361, -1, -1));

        jMenu1.setText("Archivo");

        jMenuItem3.setText("Cargar Diagrama");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Guardar");

        jMenuItem1.setText("Guardar como PNG");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Guardar como PDF");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("Guardar como Flujo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jd_flujos.setJMenuBar(jMenuBar1);

        jd_UML.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Crear Clase");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jd_UML.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 80));

        jButton9.setText("Ver Codigo");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jd_UML.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 80));

        jp_uml.setBackground(new java.awt.Color(255, 255, 255));
        jp_uml.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jp_uml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_umlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_umlLayout = new javax.swing.GroupLayout(jp_uml);
        jp_uml.setLayout(jp_umlLayout);
        jp_umlLayout.setHorizontalGroup(
            jp_umlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        jp_umlLayout.setVerticalGroup(
            jp_umlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jd_UML.getContentPane().add(jp_uml, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo blanco.jpg"))); // NOI18N
        jd_UML.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        jMenu3.setText("Archivo");

        jMenuItem11.setText("Cargar UML");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Guardar");

        jMenuItem7.setText("Guardar como PNG");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem9.setText("Guardar como PDF");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Guardar como UML");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar2.add(jMenu4);

        jd_UML.setJMenuBar(jMenuBar2);

        cambiar_color.setText("Cambiar Color");
        cambiar_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_colorActionPerformed(evt);
            }
        });
        pp_menu1.add(cambiar_color);

        eliminar1.setText("Eliminar");
        eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar1ActionPerformed(evt);
            }
        });
        pp_menu1.add(eliminar1);

        cambiar_fuente1.setText("Cambiar Fuente");
        cambiar_fuente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_fuente1ActionPerformed(evt);
            }
        });
        pp_menu1.add(cambiar_fuente1);

        cambiar_color2.setText("Cambiar Color");
        cambiar_color2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_color2ActionPerformed(evt);
            }
        });
        pp_menu2.add(cambiar_color2);

        cambiar_texto.setText("Cambiar Texto");
        cambiar_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_textoActionPerformed(evt);
            }
        });
        pp_menu2.add(cambiar_texto);

        cambiar_fuente.setText("Cambiar Fuente");
        cambiar_fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_fuenteActionPerformed(evt);
            }
        });
        pp_menu2.add(cambiar_fuente);

        eliminar2.setText("Eliminar");
        eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar2ActionPerformed(evt);
            }
        });
        pp_menu2.add(eliminar2);

        copiar1.setText("copiar");
        copiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar1ActionPerformed(evt);
            }
        });
        pp_menu2.add(copiar1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(525, 520));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Diagrama de flujo Basico");

        jLabel10.setText("Permite Crear diagramas de flujo, descendentes de");

        jLabel11.setText("seguimiento de informacion, planeamiento de");

        jLabel15.setText("procesos y de prediccion de estructuras. Contiene");

        jLabel16.setText("conectores y vinculos.");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/workflow-33250368-xs.jpg"))); // NOI18N

        jb_crearflujo.setText("Crear");
        jb_crearflujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearflujoMouseClicked(evt);
            }
        });
        jb_crearflujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearflujoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(jb_crearflujo)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_crearflujo)
                        .addGap(143, 143, 143))))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(525, 520));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Diagrama de flujo Basico");
        jPanel4.add(jLabel37);

        jLabel38.setText("Permite Crear diagramas de flujo, descendentes de");
        jPanel4.add(jLabel38);

        jLabel39.setText("seguimiento de informacion, planeamiento de");
        jPanel4.add(jLabel39);

        jLabel40.setText("procesos y de prediccion de estructuras. Contiene");
        jPanel4.add(jLabel40);

        jLabel41.setText("conectores y vinculos.");
        jPanel4.add(jLabel41);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/workflow-33250368-xs.jpg"))); // NOI18N
        jPanel4.add(jLabel42);

        jb_crearflujo1.setText("Crear");
        jb_crearflujo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearflujoMouseClicked(evt);
            }
        });
        jb_crearflujo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearflujoActionPerformed(evt);
            }
        });
        jPanel4.add(jb_crearflujo1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("UML");

        jLabel19.setText("Es un lenguaje grafico para visualizar,");

        jLabel20.setText("especificar, construir y documentar un sistema");

        jLabel21.setText("UML ofrece un estandar para describir un \"Plano\"");

        jLabel22.setText("del sistema.");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_uml.jpg"))); // NOI18N

        jb_crearuml.setText("Crear");
        jb_crearuml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearumlMouseClicked(evt);
            }
        });
        jb_crearuml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearumlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jb_crearuml)
                .addGap(78, 78, 78))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_crearuml)
                        .addGap(153, 153, 153))))
        );

        jScrollPane1.setViewportView(tp_codigo);

        javax.swing.GroupLayout jd_vercodigoLayout = new javax.swing.GroupLayout(jd_vercodigo.getContentPane());
        jd_vercodigo.getContentPane().setLayout(jd_vercodigoLayout);
        jd_vercodigoLayout.setHorizontalGroup(
            jd_vercodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_vercodigoLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jd_vercodigoLayout.setVerticalGroup(
            jd_vercodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_vercodigoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        texto.setText("Texto de prueba");

        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lista);

        jButton2.setText("Aceptar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel35.setText("Tamaño");

        jLabel36.setText("Fuentes");

        jButton8.setText("Elegir Color");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_fuenteLayout = new javax.swing.GroupLayout(jd_fuente.getContentPane());
        jd_fuente.getContentPane().setLayout(jd_fuenteLayout);
        jd_fuenteLayout.setHorizontalGroup(
            jd_fuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_fuenteLayout.createSequentialGroup()
                .addGroup(jd_fuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_fuenteLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_fuenteLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jd_fuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(jd_fuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_fuenteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        jd_fuenteLayout.setVerticalGroup(
            jd_fuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_fuenteLayout.createSequentialGroup()
                .addGroup(jd_fuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_fuenteLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(texto)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_fuenteLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jd_atributos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Encapsulamiento");
        jd_atributos.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Creacion de Atributo");
        jd_atributos.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 200, -1));

        bg_enca.add(rb_protected);
        rb_protected.setText("Protected");
        jd_atributos.getContentPane().add(rb_protected, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 80, -1));

        bg_enca.add(rb_private);
        rb_private.setText("Private");
        jd_atributos.getContentPane().add(rb_private, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        bg_enca.add(rb_public);
        rb_public.setSelected(true);
        rb_public.setText("Public");
        jd_atributos.getContentPane().add(rb_public, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 70, -1));

        bg_tipo.add(rb_int);
        rb_int.setSelected(true);
        rb_int.setText("int");
        jd_atributos.getContentPane().add(rb_int, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 60, -1));

        bg_tipo.add(rb_double);
        rb_double.setText("Double");
        jd_atributos.getContentPane().add(rb_double, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 80, -1));

        bg_tipo.add(rb_string);
        rb_string.setText("String");
        rb_string.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_stringActionPerformed(evt);
            }
        });
        jd_atributos.getContentPane().add(rb_string, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 80, -1));

        jButton5.setText("Crear Atributo");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jd_atributos.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 160, 90));
        jd_atributos.getContentPane().add(tf_atributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 280, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Tipo");
        jd_atributos.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 60, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Nombre Atributo");
        jd_atributos.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo blanco.jpg"))); // NOI18N
        jd_atributos.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 695, 590));

        jMenuItem5.setText("Agregar Atributo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        pp_menu3.add(jMenuItem5);

        jMenuItem6.setText("Cambiar Color");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        pp_menu3.add(jMenuItem6);

        jMenuItem12.setText("Generar Codigo de esta clase");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        pp_menu3.add(jMenuItem12);

        jMenuItem8.setText("Eliminar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        pp_menu3.add(jMenuItem8);

        jMenuItem13.setText("Copiar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        pp_menu3.add(jMenuItem13);

        jScrollPane5.setViewportView(tp_codigo1);

        javax.swing.GroupLayout jd_vercodigo1Layout = new javax.swing.GroupLayout(jd_vercodigo1.getContentPane());
        jd_vercodigo1.getContentPane().setLayout(jd_vercodigo1Layout);
        jd_vercodigo1Layout.setHorizontalGroup(
            jd_vercodigo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_vercodigo1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jd_vercodigo1Layout.setVerticalGroup(
            jd_vercodigo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_vercodigo1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuItem20.setText("Pegar");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        pp_menu4.add(jMenuItem20);

        jMenuItem17.setText("Pegar");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        pp_menu5.add(jMenuItem17);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Visio");
        setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_menu.setBackground(new java.awt.Color(255, 255, 255));
        panel_menu.setForeground(new java.awt.Color(255, 255, 255));
        panel_menu.setToolTipText("");

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 550, 510));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("mini");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 80, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo visio.jpg"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 500, 120));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/workflow-33250368-xs.jpg"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 210));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_uml.jpg"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 290, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_iniciofinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_iniciofinMouseClicked
        final JLabel jl_iof;
        jl_iof = new JLabel();
        jl_iof.setOpaque(true);
        jl_iof.setName("Label");
        jl_iof.setBackground(Color.WHITE);
        iofnum++;
        jp_flujo.add(jl_iof);
        jl_iof.setLocation(10, 200);
        jl_iof.setIcon(new ImageIcon(".\\UML\\in_fin.png"));
        if (iofnum == 1) {
            jl_iof.setText("Inicio");
            labels.add(0, jl_iof);

        } else {
            jl_iof.setText("Fin");
            labels.add(labels.size(), jl_iof);
            jMenu2.setEnabled(true);
            jb_generarcodigo.setEnabled(true);
        }
        jl_iof.setHorizontalTextPosition(SwingConstants.CENTER);
        jl_iof.setSize(100, 65);
        //agrega un label al panel

        //para poder mover un label seleccionado
        jl_iof.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                seleccionado = jl_iof;
                jl_iof.setLocation(jl_iof.getLocation().x + evt.getX() - jl_iof.getWidth() / 2,
                        jl_iof.getLocation().y + evt.getY() - jl_iof.getHeight() / 2);
            }
        });

        //para sacar el pop up menu con las opciones que tiene el label seleccionado
        jl_iof.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                seleccionado = jl_iof;
                if (evt.isMetaDown()) {
                    seleccionado = jl_iof;
                    pp_menu1.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                seleccionado = jl_iof;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                seleccionado = jl_iof;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                seleccionado = jl_iof;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                seleccionado = jl_iof;
            }
        });


    }//GEN-LAST:event_jb_iniciofinMouseClicked

    private void cambiar_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_colorActionPerformed

        seleccionado.setBackground(JColorChooser.showDialog(jd_flujos, "Color?", Color.yellow));

    }//GEN-LAST:event_cambiar_colorActionPerformed

    private void jb_decisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_decisionMouseClicked
        final JLabel jl_if;
        jl_if = new JLabel();
        jl_if.setOpaque(true);
        ifnum++;
        jl_if.setName("decision" + ifnum);
        jl_if.setBackground(Color.WHITE);
        jp_flujo.add(jl_if);
        jl_if.setLocation(10, 200);
        jl_if.setIcon(new ImageIcon(".\\UML\\if.png"));
        jl_if.setText("");
        jl_if.setHorizontalTextPosition(SwingConstants.CENTER);
        jl_if.setSize(100, 65);
        labels.add(jl_if);
        //agrega un label al panel

        //para poder mover un label seleccionado
        jl_if.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                seleccionado = jl_if;
                jl_if.setLocation(jl_if.getLocation().x + evt.getX() - jl_if.getWidth() / 2,
                        jl_if.getLocation().y + evt.getY() - jl_if.getHeight() / 2);
            }
        });

        //para sacar el pop up menu con las opciones que tiene el label seleccionado
        jl_if.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                seleccionado = jl_if;
                if (evt.isMetaDown()) {
                    seleccionado = jl_if;
                    pp_menu2.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                seleccionado = jl_if;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                seleccionado = jl_if;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                seleccionado = jl_if;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                seleccionado = jl_if;
            }
        });
    }//GEN-LAST:event_jb_decisionMouseClicked

    private void cambiar_color2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_color2ActionPerformed
        seleccionado.setBackground(JColorChooser.showDialog(jd_flujos, "Color?", Color.yellow));
    }//GEN-LAST:event_cambiar_color2ActionPerformed

    private void cambiar_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_textoActionPerformed

        String texto;
        texto = JOptionPane.showInputDialog(jd_flujos, "Ingrese el texto");
        seleccionado.setText(texto);
        System.out.println(seleccionado.getText());
    }//GEN-LAST:event_cambiar_textoActionPerformed

    private void jb_procesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_procesoMouseClicked
        final JLabel jl_proceso;
        jl_proceso = new JLabel();
        jl_proceso.setOpaque(true);
        pronum++;
        jl_proceso.setName("proceso" + pronum);
        jl_proceso.setBackground(Color.WHITE);

        jp_flujo.add(jl_proceso);
        jl_proceso.setLocation(10, 200);
            jl_proceso.setIcon(new ImageIcon(".\\UML\\Proceso.png"));
        jl_proceso.setText("");
        labels.add(jl_proceso);
        jl_proceso.setHorizontalTextPosition(SwingConstants.CENTER);
        jl_proceso.setSize(100, 65);
        //agrega un label al panel

        //para poder mover un label seleccionado
        jl_proceso.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                seleccionado = jl_proceso;
                jl_proceso.setLocation(jl_proceso.getLocation().x + evt.getX() - jl_proceso.getWidth() / 2,
                        jl_proceso.getLocation().y + evt.getY() - jl_proceso.getHeight() / 2);
            }
        });

        //para sacar el pop up menu con las opciones que tiene el label seleccionado
        jl_proceso.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                seleccionado = jl_proceso;
                if (evt.isMetaDown()) {
                    seleccionado = jl_proceso;
                    pp_menu2.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                seleccionado = jl_proceso;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                seleccionado = jl_proceso;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                seleccionado = jl_proceso;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                seleccionado = jl_proceso;
            }
        });
    }//GEN-LAST:event_jb_procesoMouseClicked

    private void jb_separadorvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_separadorvMouseClicked
        final JLabel jl_separadorv;
        jl_separadorv = new JLabel();
        jl_separadorv.setOpaque(true);
        jl_separadorv.setName("separador");
        jl_separadorv.setBackground(Color.WHITE);

        jp_flujo.add(jl_separadorv);
        labels.add(jl_separadorv);
        jl_separadorv.setLocation(10, 200);
        jl_separadorv.setIcon(new ImageIcon(".\\UML\\separador.png"));
        jl_separadorv.setText("");
        jl_separadorv.setSize(7, 65);
        //agrega un label al panel

        //para poder mover un label seleccionado
        jl_separadorv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                seleccionado = jl_separadorv;
                jl_separadorv.setLocation(jl_separadorv.getLocation().x + evt.getX() - jl_separadorv.getWidth() / 2,
                        jl_separadorv.getLocation().y + evt.getY() - jl_separadorv.getHeight() / 2);
            }
        });

        //para sacar el pop up menu con las opciones que tiene el label seleccionado
        jl_separadorv.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                seleccionado = jl_separadorv;
                if (evt.isMetaDown()) {
                    seleccionado = jl_separadorv;
                    pp_menu1.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                seleccionado = jl_separadorv;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                seleccionado = jl_separadorv;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                seleccionado = jl_separadorv;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                seleccionado = jl_separadorv;
            }
        });
    }//GEN-LAST:event_jb_separadorvMouseClicked

    private void jb_separadorhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_separadorhMouseClicked
        final JLabel jl_separador;
        jl_separador = new JLabel();
        jl_separador.setOpaque(true);
        jl_separador.setName("separadorh");
        jl_separador.setBackground(Color.WHITE);

        jp_flujo.add(jl_separador);
        labels.add(jl_separador);
        jl_separador.setLocation(10, 200);
        jl_separador.setIcon(new ImageIcon(".\\UML\\separadorV.png"));
        jl_separador.setText("");
        jl_separador.setSize(65, 7);
        //agrega un label al panel

        //para poder mover un label seleccionado
        jl_separador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                seleccionado = jl_separador;
                jl_separador.setLocation(jl_separador.getLocation().x + evt.getX() - jl_separador.getWidth() / 2,
                        jl_separador.getLocation().y + evt.getY() - jl_separador.getHeight() / 2);
            }
        });

        //para sacar el pop up menu con las opciones que tiene el label seleccionado
        jl_separador.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                seleccionado = jl_separador;
                if (evt.isMetaDown()) {
                    seleccionado = jl_separador;
                    pp_menu1.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                seleccionado = jl_separador;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                seleccionado = jl_separador;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                seleccionado = jl_separador;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                seleccionado = jl_separador;
            }
        });
    }//GEN-LAST:event_jb_separadorhMouseClicked

    private void jb_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_datosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_datosActionPerformed

    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed
        try {
            int resp = JOptionPane.showConfirmDialog(jd_UML, "Desea eliminar este elemento?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.OK_OPTION) {
                for (JLabel label : labels) {
                    if (label.getName().equals(seleccionado.getName())) {
                        labels.remove(label);
                        jp_flujo.repaint();
                        jp_flujo.remove(seleccionado);
                        if (seleccionado.getText().equals("Inicio")) {
                            iofnum = 0;
                        }
                    }
                }
                jp_flujo.repaint();
                jp_flujo.remove(seleccionado);
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_eliminar1ActionPerformed

    private void eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar2ActionPerformed
        try {
            int respuesta = JOptionPane.showConfirmDialog(jd_UML, "Desea eliminar este elemento?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (respuesta == JOptionPane.OK_OPTION) {
                for (JLabel label : labels) {
                    if (label.getName().equals(seleccionado.getName())) {
                        labels.remove(label);
                        jp_flujo.repaint();
                        jp_flujo.remove(seleccionado);
                    }
                }

            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_eliminar2ActionPerformed

    private void jb_separadorvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_separadorvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_separadorvActionPerformed

    private void jb_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_datosMouseClicked
        final JLabel jl_datos;
        jl_datos = new JLabel();
        jl_datos.setOpaque(true);
        datosnum++;
        jl_datos.setName("datos" + datosnum);
        jl_datos.setBackground(Color.WHITE);
        jp_flujo.add(jl_datos);
        jl_datos.setLocation(10, 200);
        jl_datos.setIcon(new ImageIcon(".\\UML\\datos.png"));
        jl_datos.setText("");
        labels.add(jl_datos);
        jl_datos.setHorizontalTextPosition(SwingConstants.CENTER);
        jl_datos.setSize(100, 65);
        //agrega un label al panel

        //para poder mover un label seleccionado
        jl_datos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                seleccionado = jl_datos;
                jl_datos.setLocation(jl_datos.getLocation().x + evt.getX() - jl_datos.getWidth() / 2,
                        jl_datos.getLocation().y + evt.getY() - jl_datos.getHeight() / 2);
            }
        });

        //para sacar el pop up menu con las opciones que tiene el label seleccionado
        jl_datos.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                seleccionado = jl_datos;
                if (evt.isMetaDown()) {
                    seleccionado = jl_datos;
                    pp_menu2.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                seleccionado = jl_datos;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                seleccionado = jl_datos;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                seleccionado = jl_datos;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                seleccionado = jl_datos;
            }
        });
    }//GEN-LAST:event_jb_datosMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        panel_menu.removeAll();
        panel_menu.repaint();
        jPanel2.setLocation(5, 5);
        jPanel2.setSize(400, 400);
        panel_menu.add(jPanel2, BorderLayout.CENTER);
        panel_menu.revalidate();
        panel_menu.repaint();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        panel_menu.removeAll();
        panel_menu.repaint();
        jPanel3.setLocation(5, 5);
        jPanel3.setSize(400, 400);
        panel_menu.add(jPanel3, BorderLayout.CENTER);
        panel_menu.revalidate();
        panel_menu.repaint();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jb_crearumlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearumlMouseClicked
        jd_UML.pack();
        jd_UML.setModal(true);
        jd_UML.setLocationRelativeTo(this);
        jd_UML.setVisible(true);
    }//GEN-LAST:event_jb_crearumlMouseClicked

    private void jb_crearumlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearumlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_crearumlActionPerformed

    private void jb_generarcodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_generarcodigoMouseClicked
        File archivo = new File("./archivo.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        for (JLabel label : labels) {
            if (label.getText().equals("Inicio")) {
                try {
                    fw = new FileWriter(archivo, false);
                    bw = new BufferedWriter(fw);
                    bw.write("#include <iostream>");
                    bw.write("\n");
                    bw.write("using namespace std;");
                    bw.write("\n");
                    bw.write("int main(){");
                    bw.write("\n");
                    bw.flush();

                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (label.getName().contains("proceso") && ((label.getText().contains("+")) || (label.getText().contains("-")) || (label.getText().contains("/")) || (label.getText().contains("*")))) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(" " + label.getText());
                    bw.write(";");
                    bw.write("\n");
                    bw.flush();

                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (label.getName().contains("proceso") && !
                    label.getText().contains("\"") && label.getText().contains("imprimir")) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(" " + "cout<<" + label.getText().replace("imprimir", "") + "<<endl");
                    bw.write(";");
                    bw.write("\n");
                    bw.flush();

                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (label.getName().contains("proceso") && label.getText().contains("imprimir") && label.getText().contains("\"")) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(" cout<<" + label.getText().replace("imprimir", "") + "<<endl");
                    bw.write(";");
                    bw.write("\n");
                    bw.flush();

                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (label.getName().contains("proceso") && label.getText().contains("entero")) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(" int" + label.getText().replace("entero", ""));
                    bw.write(";");
                    bw.write("\n");
                    bw.flush();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (label.getName().contains("proceso") && label.getText().contains("real")) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(" double" + label.getText().replace("real", ""));
                    bw.write(";");
                    bw.write("\n");
                    bw.flush();

                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (label.getName().contains("datos")) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(" cin>>" + label.getText() + ";");
                    bw.write("\n");
                    bw.flush();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (label.getText().equals("Fin")) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(" system(\"pause\")");
                    bw.write(";");
                    bw.write("\n");
                    bw.write(" return 0");
                    bw.write(";");
                    bw.write("\n");
                    bw.write("}");

                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        tp_codigo.removeAll();
        String codigo = getArchivo("./archivo.txt");
        tp_codigo.setText(codigo);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(jd_flujos, "Codigo generado exitosamente");
        jButton1.setEnabled(true);


    }//GEN-LAST:event_jb_generarcodigoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jd_vercodigo.pack();
        jd_vercodigo.setModal(true);
        jd_vercodigo.setLocationRelativeTo(jd_flujos);
        jd_vercodigo.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(jd_flujos);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen png", "png");
        jfc.addChoosableFileFilter(filtro);
        if (op == JFileChooser.APPROVE_OPTION) {
            Dimension d = jp_flujo.getSize();
            BufferedImage image = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_RGB);
            jp_flujo.paint(image.getGraphics());
            try {
                
                ImageIO.write(image, "png", new File(jfc.getSelectedFile().getPath() + ".png"));
                ruta = jfc.getSelectedFile().getPath();
                System.out.println(ruta);
                
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(jd_flujos, "Imagen guardada exitosamente");
        }
        jMenuItem2.setEnabled(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cambiar_fuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_fuenteActionPerformed
        jd_fuente.pack();
        jd_fuente.setModal(true);
        jd_fuente.setLocationRelativeTo(jd_flujos);
        jd_fuente.setVisible(true);
    }//GEN-LAST:event_cambiar_fuenteActionPerformed

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        Font f = texto.getFont();
        texto.setFont(new Font(f.getName(), Font.PLAIN, Integer.parseInt(String.valueOf(combo.getSelectedItem()))));
    }//GEN-LAST:event_comboItemStateChanged

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        Font f = texto.getFont();
        texto.setFont(new Font(String.valueOf(dlm.getElementAt(lista.getSelectedIndex())), Font.PLAIN, f.getSize()));
    }//GEN-LAST:event_listaValueChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Font f = texto.getFont();
        seleccionado.setFont(new Font(f.getName(), Font.PLAIN, Integer.parseInt(String.valueOf(combo.getSelectedItem()))));
        seleccionado.setFont(new Font(String.valueOf(dlm.getElementAt(lista.getSelectedIndex())), Font.PLAIN, f.getSize()));
        jd_fuente.dispose();
        JOptionPane.showMessageDialog(jd_flujos, "Cambios realizados exitosamente");
    }//GEN-LAST:event_jButton2MouseClicked

    private void cambiar_fuente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_fuente1ActionPerformed
        jd_fuente.pack();
        jd_fuente.setModal(true);
        jd_fuente.setLocationRelativeTo(jd_flujos);
        jd_fuente.setVisible(true);
    }//GEN-LAST:event_cambiar_fuente1ActionPerformed

    private void jb_crearflujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearflujoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_crearflujoActionPerformed

    private void jb_crearflujoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearflujoMouseClicked
        jd_flujos.pack();
        jd_flujos.setModal(true);
        jd_flujos.setLocationRelativeTo(this);
        jd_flujos.setVisible(true);

    }//GEN-LAST:event_jb_crearflujoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(jd_flujos);
        if (op == JFileChooser.APPROVE_OPTION) {
            try {
                System.out.println(ruta);
                Document document = new Document(PageSize.A4);
                PdfWriter.getInstance(document, new FileOutputStream(jfc.getSelectedFile().getPath() + ".pdf"));
                document.open();
                Image imagen = Image.getInstance(ruta + ".png");
                imagen.scaleAbsolute(500, 500);
                imagen.setAlignment(Element.ALIGN_CENTER);
                document.add(imagen);
                document.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException | IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        JOptionPane.showMessageDialog(jd_flujos, "PDF guardado correctamente");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(jd_flujos);
        if (op == JFileChooser.APPROVE_OPTION) {
            administrarFlujos af = new administrarFlujos(jfc.getSelectedFile().getPath() + ".flujo");
            for (JLabel label : labels) {
                af.getLabels().add(label);
            }
            af.cargarArchivo();
            try {
                af.escribirArchivo();
            } catch (IOException ex) {

            }
            JOptionPane.showMessageDialog(jd_flujos, "Flujo guardado exitosamente");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showOpenDialog(jd_flujos);
        if (op == JFileChooser.APPROVE_OPTION) {
            administrarFlujos af = new administrarFlujos(jfc.getSelectedFile().getPath());
            af.cargarArchivo();
            for (final JLabel label : af.getLabels()) {
                labels.add(label);
                jp_flujo.add(label);
                //para poder mover un label seleccionado
                label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    public void mouseDragged(java.awt.event.MouseEvent evt) {
                        seleccionado = label;
                        label.setLocation(label.getLocation().x + evt.getX() - label.getWidth() / 2,
                                label.getLocation().y + evt.getY() - label.getHeight() / 2);
                    }
                });

                //para sacar el pop up menu con las opciones que tiene el label seleccionado
                label.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent evt) {
                        seleccionado = label;
                        if (evt.isMetaDown()) {
                            seleccionado = label;
                            if (seleccionado.getText().equals("Inicio") || seleccionado.getText().equals("Fin")) {
                                pp_menu1.show(evt.getComponent(), evt.getX(), evt.getY());
                            } else {
                                pp_menu2.show(evt.getComponent(), evt.getX(), evt.getY());
                            }

                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        seleccionado = label;
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        seleccionado = label;
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        seleccionado = label;
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        seleccionado = label;
                    }
                });
            }
            JOptionPane.showMessageDialog(jd_flujos, "Flujo cargado exitosamente");
            jp_flujo.repaint();
            jMenu2.setEnabled(true);
        }
        jb_generarcodigo.setEnabled(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la clase");
        final JPanel clase;
        clase = new JPanel();
        clase.setBackground(Color.BLUE);
        JLabel titulo = new JLabel();
        titulo.setText(nombre);
        clase.add(titulo);
        jp_uml.add(clase);
        titulo.setLocation(10, 100);
        titulo.setOpaque(true);
        titulo.setBackground(Color.WHITE);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        titulo.setSize(100, 65);
        clase.setLocation(10, 200);
        clase.setSize(150, 150);
        claseCreada cc = new claseCreada(clase);
        clases.add(cc);
        cc.getLista().add(titulo);
        
        selec = clase;
        clase.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                selec = clase;
                selec.setLocation(selec.getLocation().x + evt.getX() - selec.getWidth() / 2,
                        selec.getLocation().y + evt.getY() - selec.getHeight() / 2);
            }
        });

        clase.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                selec = clase;
                if (evt.isMetaDown()) {
                    selec = clase;
                    pp_menu3.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                selec = clase;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                selec = clase;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                selec = clase;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                selec = clase;
            }
        });

    }//GEN-LAST:event_jButton3MouseClicked

    private void rb_stringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_stringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_stringActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            int resp = JOptionPane.showConfirmDialog(jd_UML, "Desea eliminar este elemento?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.OK_OPTION) {
                for (claseCreada clase : clases) {
                    if (clase.getClase().equals(selec)) {
                        clases.remove(clase);
                        jp_uml.repaint();
                        jp_uml.remove(selec);
                    }
                }

            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        selec.setBackground(JColorChooser.showDialog(jd_UML, "Color?", Color.yellow));
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jd_atributos.pack();
        jd_atributos.setModal(true);
        jd_atributos.setLocationRelativeTo(jd_UML);
        jd_atributos.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        String enca = "";
        String nombre = "";
        String tipo = "";
        if (rb_public.isSelected()) {
            enca = "public";
        }
        if (rb_private.isSelected()) {
            enca = "private";
        }
        if (rb_protected.isSelected()) {
            enca = "protected";
        }
        if (rb_double.isSelected()) {
            tipo = "double";
        }
        if (rb_int.isSelected()) {
            tipo = "int";
        }
        if (rb_string.isSelected()) {
            tipo = "string";
        }
        nombre = tf_atributo.getText();
        JLabel atributo = new JLabel();
        contpos1 += 100;
        atributo.setText(enca + " " + tipo + " " + nombre);
        atributo.setLocation(selec.getX(), selec.getY() + contpos1);
        atributo.setOpaque(true);
        atributo.setBackground(Color.WHITE);
        atributo.setHorizontalTextPosition(SwingConstants.CENTER);
        atributo.setSize(100, 65);
        for (claseCreada c : clases) {
            if (c.getClase().equals(selec)) {
                selec.add(atributo);
                c.getLista().add(atributo);

            }
        }
        selec.revalidate();
        selec.repaint();
        jp_uml.revalidate();
        jp_uml.repaint();
        jd_atributos.dispose();
        tf_atributo.setText("");
        JOptionPane.showMessageDialog(jd_UML, "Atributo agregado correctamente");

    }//GEN-LAST:event_jButton5MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(jd_UML);
        if (op == JFileChooser.APPROVE_OPTION) {
            try {
                System.out.println(ruta);
                Document document = new Document(PageSize.A4);
                PdfWriter.getInstance(document, new FileOutputStream(jfc.getSelectedFile().getPath() + ".pdf"));
                document.open();
                Image imagen = Image.getInstance(ruta + ".png");
                imagen.scaleAbsolute(500, 500);
                imagen.setAlignment(Element.ALIGN_CENTER);
                document.add(imagen);
                document.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException | IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        JOptionPane.showMessageDialog(jd_UML, "PDF guardado correctamente");
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(jd_UML);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen png", "png");
        jfc.addChoosableFileFilter(filtro);
        if (op == JFileChooser.APPROVE_OPTION) {
            Dimension d = jp_uml.getSize();
            BufferedImage image = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_RGB);
            jp_uml.paint(image.getGraphics());
            try {
                ImageIO.write(image, "png", new File(jfc.getSelectedFile().getPath() + ".png"));
                ruta = jfc.getSelectedFile().getPath();
                System.out.println(ruta);

            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(jd_flujos, "Imagen guardada exitosamente");
        }
        jMenuItem9.setEnabled(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(jd_UML);
        if (op == JFileChooser.APPROVE_OPTION) {
            administrarUML au = new administrarUML(jfc.getSelectedFile().getPath() + ".UML");
            for (claseCreada clase : clases) {
                au.getClases().add(clase);
      
            }
            au.cargarArchivo();
            try {
                au.escribirArchivo();
            } catch (IOException ex) {

            }
            JOptionPane.showMessageDialog(jd_UML, "UML guardado exitosamente");
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showOpenDialog(jd_UML);
        if (op == JFileChooser.APPROVE_OPTION) {
            administrarUML au = new administrarUML(jfc.getSelectedFile().getPath());
            au.cargarArchivo();
            for (final claseCreada clase : au.getClases()) {
                clases.add(clase);
                jp_uml.add(clase.getClase());
              
                clase.getClase().addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    public void mouseDragged(java.awt.event.MouseEvent evt) {
                        selec = clase.getClase();
                        clase.getClase().setLocation(clase.getClase().getLocation().x + evt.getX() - clase.getClase().getWidth() / 2,
                                clase.getClase().getLocation().y + evt.getY() - clase.getClase().getHeight() / 2);
                    }
                    });

                
                clase.getClase().addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent evt) {
                        selec = clase.getClase();
                        if (evt.isMetaDown()) {
                            selec = clase.getClase();
                            pp_menu3.show(evt.getComponent(), evt.getX(), evt.getY());

                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        selec = clase.getClase();
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        selec = clase.getClase();
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        selec = clase.getClase();
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        selec = clase.getClase();
                    }
                });
            }
            JOptionPane.showMessageDialog(jd_UML, "UML cargado exitosamente");
            jp_uml.revalidate();
            jp_uml.repaint();
            
        }

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        texto.setForeground(JColorChooser.showDialog(jd_UML, "Color?", Color.yellow));
        seleccionado.setForeground(texto.getForeground());
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        jd_vercodigo1.pack();
        jd_vercodigo1.setModal(true);
        jd_vercodigo1.setLocationRelativeTo(jd_flujos);
        jd_vercodigo1.setVisible(true);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        File archivo = new File("./archivo1.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        for (claseCreada clase : clases) {
            if (selec.equals(clase.getClase())) {
                try {
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write("#include<iostream>");
                    bw.write("\n");
                    bw.write("#include <string>");
                    bw.write("\n");
                    bw.write("#ifndef" + " " + clase.getLista().get(0).getText().toUpperCase() + "_CPP");
                    bw.write("\n");
                    bw.write("#define" + " " + clase.getLista().get(0).getText().toUpperCase() + "_CPP");
                    bw.write("\n");
                    bw.write("using namespace std;");
                    bw.write("\n");
                    bw.write("class" + " " + clase.getLista().get(0).getText() + "{");
                    bw.write("\n");
                    bw.write(" " + "private:");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("private")) {
                            bw.write("  " + label.getText().replace("private", ""));
                            bw.write(";");
                            bw.write("\n");
                            contatri++;
                        }
                    }
                    bw.write(" " + "protected:");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("protected")) {
                            bw.write("  " + label.getText().replace("protected", ""));
                            bw.write(";");
                            bw.write("\n");
                            contatri++;
                        }
                    }
                    bw.write(" " + "public:");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("public")) {
                            bw.write("  " + label.getText().replace("public", ""));
                            bw.write(";");
                            bw.write("\n");
                            contatri++;
                        }
                    }
                    bw.write("  " + clase.getLista().get(0).getText() + "()" + "{");
                    bw.write("\n");

                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("int")) {
                            if (label.getText().contains("private")) {
                                bw.write("   " + label.getText().replace("private", "").replace("int", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("   " + label.getText().replace("protected", "").replace("int", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("   " + label.getText().replace("public", "").replace("int", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("double")) {
                            if (label.getText().contains("private")) {
                                bw.write("   " + label.getText().replace("private", "").replace("double", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("   " + label.getText().replace("protected", "").replace("double", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("   " + label.getText().replace("public", "").replace("double", "") + "=1");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("string")) {
                            if (label.getText().contains("private")) {
                                bw.write("   " + label.getText().replace("private", "").replace("string", "") + "=\"Hola\"");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("   " + label.getText().replace("protected", "").replace("string", "") + "=\"Hola\"");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("   " + label.getText().replace("public", "").replace("string", "") + "=\"Hola\"");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                    }
                    bw.write("  " + "}");
                    bw.write("\n");
                    bw.write("  " + clase.getLista().get(0).getText());
                    bw.write("(");
                    bw.write("int valor,double decimal,string cadena");
                    bw.write(")");
                    bw.write("{");
                    bw.write("\n");
                    for (JLabel label : clase.getLista()) {
                        if (label.getText().contains("int")) {
                            if (label.getText().contains("private")) {
                                bw.write("    " + label.getText().replace("private", "").replace("int", "") + "=valor");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("    " + label.getText().replace("protected", "").replace("int", "") + "=valor");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("    " + label.getText().replace("public", "").replace("int", "") + "=valor");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("double")) {
                            if (label.getText().contains("private")) {
                                bw.write("    " + label.getText().replace("private", "").replace("double", "") + "=decimal");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("    " + label.getText().replace("protected", "").replace("double", "") + "=decimal");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("    " + label.getText().replace("public", "").replace("double", "") + "=decimal");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                        if (label.getText().contains("string")) {
                            if (label.getText().contains("private")) {
                                bw.write("    " + label.getText().replace("private", "").replace("string", "") + "=cadena");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("protected")) {
                                bw.write("    " + label.getText().replace("protected", "").replace("string", "") + "=cadena");
                                bw.write(";");
                                bw.write("\n");
                            }
                            if (label.getText().contains("public")) {
                                bw.write("    " + label.getText().replace("public", "").replace("string", "") + "=cadena");
                                bw.write(";");
                                bw.write("\n");
                            }
                        }
                    }
                    bw.write(" "+"}");
                    bw.write("\n");
                    bw.write("};");
                    bw.write("\n");
                    bw.write("#endif");
                    bw.write("\n");
                    bw.write("\n");
                    bw.write("#include <iostream>");
                    bw.write("\n");
                    bw.write("#include"+'\"'+clase.getLista().get(0).getText()+".cpp"+'\"');
                    bw.write("\n");
                    bw.write("using namespace std;");
                    bw.write("\n");
                    bw.write("int main(){");
                    bw.write("\n");
                    bw.write(" return 0;");
                    bw.write("\n");
                    bw.write("}");
                    bw.write("\n");
                    bw.write("----------------------------------------------------------------");
                    bw.write("\n");
                    bw.write("\n");
                    bw.flush();

                    try {
                        bw.close();
                        fw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                tp_codigo1.removeAll();
                String codigo = getArchivo("./archivo1.txt");
                tp_codigo1.setText(codigo);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(jd_UML, "Codigo de la clase generado exitosamente");
                jButton9.setEnabled(true);

            }
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        labels.removeAll(labels);
        jp_flujo.removeAll();
        jp_flujo.repaint();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jp_flujoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_flujoMouseClicked
        if(evt.isMetaDown()){
            pp_menu4.show(evt.getComponent(),evt.getX(),evt.getY());
            
        }
    }//GEN-LAST:event_jp_flujoMouseClicked

    private void copiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar1ActionPerformed
        pegar.add(seleccionado);
        JOptionPane.showMessageDialog(jd_flujos,"copiado");
    }//GEN-LAST:event_copiar1ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        for (JLabel label : pegar) { 
            labels.add(label);
            jp_flujo.add(label);
            jp_flujo.repaint();
        }
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        claseCreada cc=new claseCreada(selec);
        pegar1.add(cc.getClase());
        JOptionPane.showMessageDialog(jd_UML,"copiado");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jp_umlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_umlMouseClicked
      if(evt.isMetaDown()){
          pp_menu5.show(evt.getComponent(),evt.getX(),evt.getY());
      }
    }//GEN-LAST:event_jp_umlMouseClicked

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        for (JPanel panel : pegar1) {
            jp_uml.add(panel);
            claseCreada cc=new claseCreada(panel);
            jp_uml.revalidate();
            jp_uml.repaint();
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_enca;
    private javax.swing.ButtonGroup bg_tipo;
    private javax.swing.JMenuItem cambiar_color;
    private javax.swing.JMenuItem cambiar_color2;
    private javax.swing.JMenuItem cambiar_fuente;
    private javax.swing.JMenuItem cambiar_fuente1;
    private javax.swing.JMenuItem cambiar_texto;
    private javax.swing.JComboBox<Integer> combo;
    private javax.swing.JMenuItem copiar1;
    private javax.swing.JMenuItem eliminar1;
    private javax.swing.JMenuItem eliminar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_crearflujo;
    private javax.swing.JButton jb_crearflujo1;
    private javax.swing.JButton jb_crearuml;
    private javax.swing.JButton jb_datos;
    private javax.swing.JButton jb_decision;
    private javax.swing.JButton jb_generarcodigo;
    private javax.swing.JButton jb_iniciofin;
    private javax.swing.JButton jb_proceso;
    private javax.swing.JButton jb_separadorh;
    private javax.swing.JButton jb_separadorv;
    private javax.swing.JDialog jd_UML;
    private javax.swing.JDialog jd_atributos;
    private javax.swing.JDialog jd_flujos;
    private javax.swing.JDialog jd_fuente;
    private javax.swing.JDialog jd_vercodigo;
    private javax.swing.JDialog jd_vercodigo1;
    private javax.swing.JPanel jp_flujo;
    private javax.swing.JPanel jp_uml;
    private javax.swing.JList<String> lista;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPopupMenu pp_menu1;
    private javax.swing.JPopupMenu pp_menu2;
    private javax.swing.JPopupMenu pp_menu3;
    private javax.swing.JPopupMenu pp_menu4;
    private javax.swing.JPopupMenu pp_menu5;
    private javax.swing.JRadioButton rb_double;
    private javax.swing.JRadioButton rb_int;
    private javax.swing.JRadioButton rb_private;
    private javax.swing.JRadioButton rb_protected;
    private javax.swing.JRadioButton rb_public;
    private javax.swing.JRadioButton rb_string;
    private javax.swing.JLabel texto;
    private javax.swing.JTextField tf_atributo;
    public javax.swing.JTextPane tp_codigo;
    public javax.swing.JTextPane tp_codigo1;
    // End of variables declaration//GEN-END:variables
    int iofnum = 0;
    int ifnum = 0;
    int pronum = 0;
    int separadorvnum = 0;
    int separadornum = 0;
    int datosnum = 0;
    JLabel seleccionado = null;
    JPanel selec = null;
    ArrayList<JLabel> labels = new ArrayList();
    ArrayList<claseCreada> clases = new ArrayList();
    DefaultListModel dlm;
    String[] fuentes;
    String ruta;
    int contcopiar=0;
    int contcopiar1=0;
    ArrayList<JLabel>pegar=new ArrayList();
    ArrayList<JPanel>pegar1=new ArrayList();
    JPanel copiarpanel1;
    JPanel copiarpanel2;
    JPanel copiarpanel3;
    int contpos1 = 0;
    int contatri = 0;

    //metodos
    public String getArchivo(String ruta) {
        FileReader fr = null;
        BufferedReader br = null;
        String contenido = "";
        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido += linea + "\n";

            }

        } catch (Exception e) {
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
            }
        }
        return contenido;
    }

    private void cargarcomponentes() {
        for (int i = 12; i <= 30; i++) {
            combo.addItem(i);
        }
        for (String fuente : fuentes) {
            dlm.addElement(fuente);
        }
    }

}
