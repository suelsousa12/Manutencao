/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author devmat
 */
public class Tela_home extends javax.swing.JFrame {

    /**
     * Creates new form Tela_home
     */
    public Tela_home() {
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

        painel_de_guias = new javax.swing.JPanel();
        logotipo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        guia_da_tela_inicial = new javax.swing.JLabel();
        guia_ordens_de_servico = new javax.swing.JLabel();
        guia_de_hidraulica = new javax.swing.JLabel();
        guia_de_eletrica = new javax.swing.JLabel();
        guia_de_pintura = new javax.swing.JLabel();
        guia_de_ferramentas = new javax.swing.JLabel();
        guia_de_projetos = new javax.swing.JLabel();
        guia_de_favoritos = new javax.swing.JLabel();
        guia_de_estatisticas = new javax.swing.JLabel();
        lixeira = new javax.swing.JLabel();
        Campo_de_pesquisa_tela_inicial = new javax.swing.JTextField();
        versao = new javax.swing.JLabel();
        painel_home = new javax.swing.JPanel();
        botao_criar_usuario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tela_inicial = new javax.swing.JLabel();
        painel_de_estatisticas = new javax.swing.JPanel();
        painel_grafico_de_pizza = new javax.swing.JPanel();
        painel_de_chamados = new javax.swing.JPanel();
        nome_usuario_ti = new javax.swing.JLabel();
        imagem_do_usuario_ti = new javax.swing.JLabel();
        tipo_de_usuario_ti = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel_de_guias.setBackground(new java.awt.Color(0, 153, 153));

        logotipo.setIcon(new javax.swing.ImageIcon("C:\\Users\\devmat\\Downloads\\logotipo da empresa.png")); // NOI18N
        logotipo.setPreferredSize(new java.awt.Dimension(46, 16));

        guia_da_tela_inicial.setText("Tela inicial");

        guia_ordens_de_servico.setText("Ordens de serviço");

        guia_de_hidraulica.setText("Hidráulica");

        guia_de_eletrica.setText("Elétrica");

        guia_de_pintura.setText("Pintura");

        guia_de_ferramentas.setText("Ferramentas");

        guia_de_projetos.setText("Projetos por residência");

        guia_de_favoritos.setText("Favoritos");

        guia_de_estatisticas.setText("Estatísticas");

        lixeira.setText("Lixeira");

        Campo_de_pesquisa_tela_inicial.setText("Pesquisa");

        versao.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        versao.setText("Versão 1.0");

        javax.swing.GroupLayout painel_de_guiasLayout = new javax.swing.GroupLayout(painel_de_guias);
        painel_de_guias.setLayout(painel_de_guiasLayout);
        painel_de_guiasLayout.setHorizontalGroup(
            painel_de_guiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_de_guiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_de_guiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(guia_da_tela_inicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guia_ordens_de_servico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guia_de_hidraulica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guia_de_eletrica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guia_de_pintura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guia_de_ferramentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guia_de_projetos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guia_de_favoritos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guia_de_estatisticas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lixeira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel_de_guiasLayout.createSequentialGroup()
                        .addGroup(painel_de_guiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_de_pesquisa_tela_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(versao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_de_guiasLayout.setVerticalGroup(
            painel_de_guiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_de_guiasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Campo_de_pesquisa_tela_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guia_da_tela_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guia_ordens_de_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guia_de_hidraulica, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guia_de_eletrica, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guia_de_pintura, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guia_de_ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guia_de_projetos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guia_de_favoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guia_de_estatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(versao)
                .addGap(131, 131, 131))
        );

        getContentPane().add(painel_de_guias, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 190, 600));

        painel_home.setBackground(new java.awt.Color(255, 255, 255));
        painel_home.setMaximumSize(new java.awt.Dimension(1920, 1080));
        painel_home.setMinimumSize(new java.awt.Dimension(1920, 1080));

        botao_criar_usuario.setBackground(new java.awt.Color(0, 204, 204));
        botao_criar_usuario.setText("+ Criar usuário");

        tela_inicial.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        tela_inicial.setText("Tela home");

        painel_de_estatisticas.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout painel_de_estatisticasLayout = new javax.swing.GroupLayout(painel_de_estatisticas);
        painel_de_estatisticas.setLayout(painel_de_estatisticasLayout);
        painel_de_estatisticasLayout.setHorizontalGroup(
            painel_de_estatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        painel_de_estatisticasLayout.setVerticalGroup(
            painel_de_estatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        painel_grafico_de_pizza.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout painel_grafico_de_pizzaLayout = new javax.swing.GroupLayout(painel_grafico_de_pizza);
        painel_grafico_de_pizza.setLayout(painel_grafico_de_pizzaLayout);
        painel_grafico_de_pizzaLayout.setHorizontalGroup(
            painel_grafico_de_pizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        painel_grafico_de_pizzaLayout.setVerticalGroup(
            painel_grafico_de_pizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        painel_de_chamados.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout painel_de_chamadosLayout = new javax.swing.GroupLayout(painel_de_chamados);
        painel_de_chamados.setLayout(painel_de_chamadosLayout);
        painel_de_chamadosLayout.setHorizontalGroup(
            painel_de_chamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        painel_de_chamadosLayout.setVerticalGroup(
            painel_de_chamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        nome_usuario_ti.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        nome_usuario_ti.setText("Suel sousa");

        imagem_do_usuario_ti.setText("foto usuario");

        tipo_de_usuario_ti.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tipo_de_usuario_ti.setText("Administrador");

        javax.swing.GroupLayout painel_homeLayout = new javax.swing.GroupLayout(painel_home);
        painel_home.setLayout(painel_homeLayout);
        painel_homeLayout.setHorizontalGroup(
            painel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_homeLayout.createSequentialGroup()
                .addGap(732, 732, 732)
                .addComponent(tela_inicial)
                .addGap(495, 495, 495)
                .addGroup(painel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nome_usuario_ti)
                    .addComponent(tipo_de_usuario_ti))
                .addGap(31, 31, 31)
                .addComponent(imagem_do_usuario_ti, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_criar_usuario))
            .addGroup(painel_homeLayout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addGroup(painel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_homeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(painel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painel_de_estatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painel_de_chamados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(painel_grafico_de_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painel_homeLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painel_homeLayout.setVerticalGroup(
            painel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_homeLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(painel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_criar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagem_do_usuario_ti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel_homeLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(painel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_homeLayout.createSequentialGroup()
                                .addComponent(nome_usuario_ti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo_de_usuario_ti))
                            .addComponent(tela_inicial))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_homeLayout.createSequentialGroup()
                        .addComponent(painel_de_estatisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painel_de_chamados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painel_grafico_de_pizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(291, Short.MAX_VALUE))
        );

        getContentPane().add(painel_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(-510, -170, 1500, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tela_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_de_pesquisa_tela_inicial;
    private javax.swing.JButton botao_criar_usuario;
    private javax.swing.JLabel guia_da_tela_inicial;
    private javax.swing.JLabel guia_de_eletrica;
    private javax.swing.JLabel guia_de_estatisticas;
    private javax.swing.JLabel guia_de_favoritos;
    private javax.swing.JLabel guia_de_ferramentas;
    private javax.swing.JLabel guia_de_hidraulica;
    private javax.swing.JLabel guia_de_pintura;
    private javax.swing.JLabel guia_de_projetos;
    private javax.swing.JLabel guia_ordens_de_servico;
    private javax.swing.JLabel imagem_do_usuario_ti;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lixeira;
    private javax.swing.JLabel logotipo;
    private javax.swing.JLabel nome_usuario_ti;
    private javax.swing.JPanel painel_de_chamados;
    private javax.swing.JPanel painel_de_estatisticas;
    private javax.swing.JPanel painel_de_guias;
    private javax.swing.JPanel painel_grafico_de_pizza;
    private javax.swing.JPanel painel_home;
    private javax.swing.JLabel tela_inicial;
    private javax.swing.JLabel tipo_de_usuario_ti;
    private javax.swing.JLabel versao;
    // End of variables declaration//GEN-END:variables
}
