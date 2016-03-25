package jjilexample;
/*
 Universidad Católica del Ecuador
 Facultad de Ingeniería de Sistemas
 Proyecto de titulación
 Andrés Albán C.    
 */

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class V_Principal extends javax.swing.JFrame {

    BufferedImage img;
    java.awt.Image i;

    public V_Principal() {
        initComponents();
        setIcon();
        setResizable(false);
        setLocationRelativeTo(null);
        bDetectar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bSalir = new javax.swing.JButton();
        SPane = new javax.swing.JScrollPane();
        l_MostrarImagen = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t_URL = new javax.swing.JTextField();
        bBorrar = new javax.swing.JButton();
        bSubir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        l_resol = new javax.swing.JLabel();
        l_alto = new javax.swing.JLabel();
        l_ancho = new javax.swing.JLabel();
        l_mostrarAncho = new javax.swing.JLabel();
        l_mostrarAlto = new javax.swing.JLabel();
        l_mostrarResolucion = new javax.swing.JLabel();
        l_mostrarFormato = new javax.swing.JLabel();
        l_thumbnail = new javax.swing.JLabel();
        bSeleccionar = new javax.swing.JButton();
        bDetectar = new javax.swing.JButton();
        bAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FID");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        SPane.setViewportView(l_MostrarImagen);

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panel.setForeground(new java.awt.Color(0, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("URL: ");

        bBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jjilexample/eraser.jpg"))); // NOI18N
        bBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/jjilexample/eraser2.jpg"))); // NOI18N
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        bSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jjilexample/upload.jpg"))); // NOI18N
        bSubir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSubir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/jjilexample/upload2.jpg"))); // NOI18N
        bSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(t_URL, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(t_URL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Formato:");

        l_resol.setBackground(new java.awt.Color(51, 51, 51));
        l_resol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l_resol.setForeground(new java.awt.Color(51, 51, 51));
        l_resol.setText("Resolución: ");

        l_alto.setBackground(new java.awt.Color(51, 51, 51));
        l_alto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l_alto.setForeground(new java.awt.Color(51, 51, 51));
        l_alto.setText("Alto:");

        l_ancho.setBackground(new java.awt.Color(51, 51, 51));
        l_ancho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l_ancho.setForeground(new java.awt.Color(51, 51, 51));
        l_ancho.setText("Ancho:");

        l_mostrarAncho.setBackground(new java.awt.Color(255, 255, 255));
        l_mostrarAncho.setForeground(new java.awt.Color(0, 102, 204));

        l_mostrarAlto.setBackground(new java.awt.Color(255, 255, 255));
        l_mostrarAlto.setForeground(new java.awt.Color(0, 102, 204));

        l_mostrarResolucion.setBackground(new java.awt.Color(255, 255, 255));
        l_mostrarResolucion.setForeground(new java.awt.Color(0, 102, 204));

        l_mostrarFormato.setBackground(new java.awt.Color(255, 255, 255));
        l_mostrarFormato.setForeground(new java.awt.Color(0, 102, 204));

        l_thumbnail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jjilexample/navigate.jpg"))); // NOI18N
        bSeleccionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSeleccionar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/jjilexample/navigate2.jpg"))); // NOI18N
        bSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_ancho)
                            .addComponent(l_alto)
                            .addComponent(l_resol)
                            .addComponent(jLabel1))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(l_mostrarAlto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_mostrarResolucion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_mostrarFormato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_mostrarAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(l_thumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_thumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_mostrarAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_ancho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_alto)
                            .addComponent(l_mostrarAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l_resol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_mostrarResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_mostrarFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bDetectar.setText("Detectar");
        bDetectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDetectarActionPerformed(evt);
            }
        });

        bAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jjilexample/help.png"))); // NOI18N
        bAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPane, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bDetectar)
                        .addGap(184, 184, 184)
                        .addComponent(bAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bAyuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDetectar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSeleccionarActionPerformed

        JFileChooser jfc = new JFileChooser();
        int retunvalue = jfc.showOpenDialog(jfc);

        limpiar();
        if (retunvalue == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();

            try {
                FileInputStream fis = new FileInputStream(file);
                img = ImageIO.read(file);
                l_MostrarImagen.setIcon(new ImageIcon(img));// se despliega la imagen en el label                
                mostrarInfoImagen(file);
                desplegarThumbnail(file);
                bDetectar.setEnabled(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Imagen no valida\n" + e);
            }
        }
    }//GEN-LAST:event_bSeleccionarActionPerformed

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.jpeg")));
    }

    public String retornaFormato(File file) {

        String retorno = "";
        String nombre = file.getName();

        retorno += nombre.charAt(nombre.length() - 3);
        retorno += nombre.charAt(nombre.length() - 2);
        retorno += nombre.charAt(nombre.length() - 1);

        return retorno.toUpperCase();
    }

    public void mostrarInfoImagen(File file) {

        l_mostrarAlto.setText(img.getHeight() + "");
        l_mostrarAncho.setText(img.getWidth() + "");
        l_mostrarResolucion.setText(img.getWidth() + "x" + img.getHeight());
        l_mostrarFormato.setText(retornaFormato(file));

    }

    public void desplegarThumbnail(File file) throws IOException {
        i = ImageIO.read(file).getScaledInstance(263, 147, BufferedImage.SCALE_SMOOTH);
        l_thumbnail.setIcon(new ImageIcon(i));

    }

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bDetectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDetectarActionPerformed

        V_Deteccion ven;

        try {
            ven = new V_Deteccion(img);
            ven.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(V_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bDetectarActionPerformed

    public void limpiar() {

        l_mostrarAlto.setText("");
        l_mostrarAncho.setText("");
        l_mostrarResolucion.setText("");
        l_mostrarFormato.setText("");
        l_thumbnail.setIcon(null);

    }

    private void bSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubirActionPerformed

        limpiar();

        if (!t_URL.getText().equals("") && !t_URL.getText().equals(" ")) {

            try {

                URL url = new URL(t_URL.getText().trim());
                img = ImageIO.read(url);
                String temp1 = url.getFile().trim().replaceAll("/", "");
                ImageIO.write(img, "jpg", new File("c:/temp/" + temp1));
                File archivo = new File("c:/temp/" + temp1);

                l_MostrarImagen.setIcon(new ImageIcon(img));
                bDetectar.setEnabled(true);

                desplegarThumbnail(archivo);
                mostrarInfoImagen(archivo);
                retornaFormato(archivo);

            } catch (MalformedURLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Error:\n" + ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error:\n" + ex);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error:\n" + ex);
            }
        }
    }//GEN-LAST:event_bSubirActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        t_URL.setText("");
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAyudaActionPerformed
        V_Ayuda ven = new V_Ayuda();
        ven.setVisible(true);
    }//GEN-LAST:event_bAyudaActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(V_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SPane;
    private javax.swing.JButton bAyuda;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bDetectar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bSeleccionar;
    private javax.swing.JButton bSubir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l_MostrarImagen;
    private javax.swing.JLabel l_alto;
    private javax.swing.JLabel l_ancho;
    private javax.swing.JLabel l_mostrarAlto;
    private javax.swing.JLabel l_mostrarAncho;
    private javax.swing.JLabel l_mostrarFormato;
    private javax.swing.JLabel l_mostrarResolucion;
    private javax.swing.JLabel l_resol;
    private javax.swing.JLabel l_thumbnail;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField t_URL;
    // End of variables declaration//GEN-END:variables
}
