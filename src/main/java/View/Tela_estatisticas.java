/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author devmat
 */
public class Tela_estatisticas extends javax.swing.JFrame {

    /**
     * Creates new form Tela_estatisticas
     */
    public Tela_estatisticas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagem_do_usuario_os = new javax.swing.JLabel();
        tipo_de_usuario_os = new javax.swing.JLabel();
        nome_usuario_os = new javax.swing.JLabel();
        painel_estatisticas = new javax.swing.JPanel();
        estatisticas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botao_gerar_pdf = new javax.swing.JButton();
        grafico_de_barras = new javax.swing.JPanel();
        periodo_grafico_de_barras = new javax.swing.JComboBox<>();
        nome_grafico_de_barras = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        periodo_grafico_de_pizza = new javax.swing.JComboBox<>();
        nome_grafico_de_pizza = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagem_do_usuario_os.setText("foto usuario");
        getContentPane().add(imagem_do_usuario_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 40, 30));

        tipo_de_usuario_os.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tipo_de_usuario_os.setText("Administrador");
        getContentPane().add(tipo_de_usuario_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, -1, -1));

        nome_usuario_os.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        nome_usuario_os.setText("Suel sousa");
        getContentPane().add(nome_usuario_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        painel_estatisticas.setMaximumSize(new java.awt.Dimension(1920, 1080));
        painel_estatisticas.setMinimumSize(new java.awt.Dimension(1920, 1080));

        estatisticas.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        estatisticas.setText("Estatísticas");

        botao_gerar_pdf.setText("Gerar PDF");

        grafico_de_barras.setBackground(new java.awt.Color(0, 204, 153));

        periodo_grafico_de_barras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Período" }));

        nome_grafico_de_barras.setText("Gráfico de barra");
        nome_grafico_de_barras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout grafico_de_barrasLayout = new javax.swing.GroupLayout(grafico_de_barras);
        grafico_de_barras.setLayout(grafico_de_barrasLayout);
        grafico_de_barrasLayout.setHorizontalGroup(
            grafico_de_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grafico_de_barrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grafico_de_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grafico_de_barrasLayout.createSequentialGroup()
                        .addComponent(nome_grafico_de_barras, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(periodo_grafico_de_barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grafico_de_barrasLayout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())))
        );
        grafico_de_barrasLayout.setVerticalGroup(
            grafico_de_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grafico_de_barrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grafico_de_barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodo_grafico_de_barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_grafico_de_barras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        periodo_grafico_de_pizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Período" }));
        periodo_grafico_de_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodo_grafico_de_pizzaActionPerformed(evt);
            }
        });

        nome_grafico_de_pizza.setText("Gráfico de pizza");
        nome_grafico_de_pizza.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nome_grafico_de_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(periodo_grafico_de_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_grafico_de_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodo_grafico_de_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painel_estatisticasLayout = new javax.swing.GroupLayout(painel_estatisticas);
        painel_estatisticas.setLayout(painel_estatisticasLayout);
        painel_estatisticasLayout.setHorizontalGroup(
            painel_estatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_estatisticasLayout.createSequentialGroup()
                .addGroup(painel_estatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_estatisticasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(painel_estatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estatisticas)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_estatisticasLayout.createSequentialGroup()
                        .addGap(825, 825, 825)
                        .addComponent(botao_gerar_pdf))
                    .addGroup(painel_estatisticasLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(grafico_de_barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(984, Short.MAX_VALUE))
        );
        painel_estatisticasLayout.setVerticalGroup(
            painel_estatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_estatisticasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(estatisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(painel_estatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_estatisticasLayout.createSequentialGroup()
                        .addComponent(grafico_de_barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botao_gerar_pdf))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(530, Short.MAX_VALUE))
        );

        getContentPane().add(painel_estatisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void periodo_grafico_de_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodo_grafico_de_pizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodo_grafico_de_pizzaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_estatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_estatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_estatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_estatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_estatisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_gerar_pdf;
    private javax.swing.JLabel estatisticas;
    private javax.swing.JPanel grafico_de_barras;
    private javax.swing.JLabel imagem_do_usuario_os;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel nome_grafico_de_barras;
    private javax.swing.JLabel nome_grafico_de_pizza;
    private javax.swing.JLabel nome_usuario_os;
    private javax.swing.JPanel painel_estatisticas;
    private javax.swing.JComboBox<String> periodo_grafico_de_barras;
    private javax.swing.JComboBox<String> periodo_grafico_de_pizza;
    private javax.swing.JLabel tipo_de_usuario_os;
    // End of variables declaration//GEN-END:variables
}
