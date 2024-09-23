
package ej02;

public class CalculadoraGrafica extends javax.swing.JFrame {

    double numero1, numero2;
    double resultado = 0.0;
    String operador;

    public CalculadoraGrafica() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttncero = new javax.swing.JButton();
        bttnigual = new javax.swing.JButton();
        bttndelete = new javax.swing.JButton();
        bttncoma = new javax.swing.JButton();
        bttnsuma = new javax.swing.JButton();
        bttnuno = new javax.swing.JButton();
        bttnresta = new javax.swing.JButton();
        bttndos = new javax.swing.JButton();
        bttnmultiplicacion = new javax.swing.JButton();
        bttntres = new javax.swing.JButton();
        bttndivision = new javax.swing.JButton();
        bttncuatro = new javax.swing.JButton();
        bttnexponente = new javax.swing.JButton();
        bttncinco = new javax.swing.JButton();
        bttnraiz = new javax.swing.JButton();
        bttnseis = new javax.swing.JButton();
        bttnseno = new javax.swing.JButton();
        bttnsiete = new javax.swing.JButton();
        bttncoseno = new javax.swing.JButton();
        bttnocho = new javax.swing.JButton();
        bttntangente = new javax.swing.JButton();
        txtPantalla = new javax.swing.JLabel();
        bttnnueve = new javax.swing.JButton();
        bttnac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bttncero.setText("0");
        bttncero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnceroActionPerformed(evt);
            }
        });

        bttnigual.setText("=");
        bttnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnigualActionPerformed(evt);
            }
        });

        bttndelete.setText("DEL");
        bttndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttndeleteActionPerformed(evt);
            }
        });

        bttncoma.setText(".");
        bttncoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttncomaActionPerformed(evt);
            }
        });

        bttnsuma.setText("+");
        bttnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsumaActionPerformed(evt);
            }
        });

        bttnuno.setText("1");
        bttnuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnunoActionPerformed(evt);
            }
        });

        bttnresta.setText("-");
        bttnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnrestaActionPerformed(evt);
            }
        });

        bttndos.setText("2");
        bttndos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttndosActionPerformed(evt);
            }
        });

        bttnmultiplicacion.setText("x");
        bttnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnmultiplicacionActionPerformed(evt);
            }
        });

        bttntres.setText("3");
        bttntres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttntresActionPerformed(evt);
            }
        });

        bttndivision.setText("/");
        bttndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttndivisionActionPerformed(evt);
            }
        });

        bttncuatro.setText("4");
        bttncuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttncuatroActionPerformed(evt);
            }
        });

        bttnexponente.setText("^");
        bttnexponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnexponenteActionPerformed(evt);
            }
        });

        bttncinco.setText("5");
        bttncinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttncincoActionPerformed(evt);
            }
        });

        bttnraiz.setText("^(1/...)");
        bttnraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnraizActionPerformed(evt);
            }
        });

        bttnseis.setText("6");
        bttnseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnseisActionPerformed(evt);
            }
        });

        bttnseno.setText("Sen");
        bttnseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsenoActionPerformed(evt);
            }
        });

        bttnsiete.setText("7");
        bttnsiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsieteActionPerformed(evt);
            }
        });

        bttncoseno.setText("Cos");
        bttncoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttncosenoActionPerformed(evt);
            }
        });

        bttnocho.setText("8");
        bttnocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnochoActionPerformed(evt);
            }
        });

        bttntangente.setText("Tan");
        bttntangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttntangenteActionPerformed(evt);
            }
        });

        txtPantalla.setBackground(new java.awt.Color(255, 255, 255));
        txtPantalla.setBorder(new javax.swing.border.MatteBorder(null));
        txtPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtPantalla.setOpaque(true);

        bttnnueve.setText("9");
        bttnnueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnnueveActionPerformed(evt);
            }
        });

        bttnac.setText("AC");
        bttnac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttncero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttncoma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnuno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttndos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttncuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttncinco, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttntres, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bttnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bttnigual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnseis, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnsiete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnocho, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnnueve, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttnexponente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttndivision, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnseno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttncoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttntangente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttnac, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnseno)
                    .addComponent(bttncoseno)
                    .addComponent(bttntangente)
                    .addComponent(bttnac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnraiz)
                    .addComponent(bttnexponente)
                    .addComponent(bttndivision)
                    .addComponent(bttndelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnsiete)
                    .addComponent(bttnocho)
                    .addComponent(bttnnueve)
                    .addComponent(bttnmultiplicacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttncuatro)
                    .addComponent(bttncinco)
                    .addComponent(bttnseis)
                    .addComponent(bttnresta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnuno)
                    .addComponent(bttndos)
                    .addComponent(bttntres)
                    .addComponent(bttnsuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttncoma)
                    .addComponent(bttncero)
                    .addComponent(bttnigual))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnceroActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "0");
    }//GEN-LAST:event_bttnceroActionPerformed

    private void bttnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnigualActionPerformed
        // TODO add your handling code here:
        numero2 = Double.parseDouble(txtPantalla.getText());
        if(operador.equals("+")){
            resultado = numero1 + numero2;
            txtPantalla.setText(Double.toString(resultado));
        }
        else{
            if(operador.equals("-")){
                resultado = numero1 - numero2;
                txtPantalla.setText(Double.toString(resultado));
            }
            else{
                if(operador.equals("*")){
                    resultado = numero1 * numero2;
                    txtPantalla.setText(Double.toString(resultado));
                }
                else{
                    if(operador.equals("/")){
                        resultado = numero1 / numero2;
                        txtPantalla.setText(Double.toString(resultado));
                    }
                    else{
                        if(operador.equals("^")){
                            resultado = 1;
                            for(int i = 0; i < numero2; i++){
                                resultado = resultado * numero1;
                            }
                            txtPantalla.setText(Double.toString(resultado));
                        }
                        else{
                            if(operador.equals("^/")){
                                resultado = 1;
                                for(int i = 0; i < numero2; i++){
                                    resultado = resultado *(numero1 * (1/numero2));
                                }
                                txtPantalla.setText(Double.toString(resultado));
                            }
                            if(operador.equals("sin")){
                                resultado = Math.sin(Math.toRadians(numero2));
                                txtPantalla.setText(Double.toString(resultado));                                                                                               
                            }
                            else if(operador.equals("cos")){
                                resultado = Math.cos(Math.toRadians(numero2));
                                txtPantalla.setText(Double.toString(resultado));  
                                }
                            else if(operador.equals("tan")){
                                resultado = Math.tan(Math.toRadians(numero2));
                                txtPantalla.setText(Double.toString(resultado));  
}
                            }
                    }
                }
            }
        }

    }//GEN-LAST:event_bttnigualActionPerformed

    private void bttndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttndeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttndeleteActionPerformed

    private void bttncomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttncomaActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + ".");
    }//GEN-LAST:event_bttncomaActionPerformed

    private void bttnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsumaActionPerformed
        // TODO add your handling code here:
        numero1 = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operador = "+";
    }//GEN-LAST:event_bttnsumaActionPerformed

    private void bttnunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnunoActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "1");
    }//GEN-LAST:event_bttnunoActionPerformed

    private void bttnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnrestaActionPerformed
        // TODO add your handling code here:
        numero1 = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operador = "-";
    }//GEN-LAST:event_bttnrestaActionPerformed

    private void bttndosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttndosActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "2");
    }//GEN-LAST:event_bttndosActionPerformed

    private void bttnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnmultiplicacionActionPerformed
        // TODO add your handling code here:
        numero1 = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operador = "*";
    }//GEN-LAST:event_bttnmultiplicacionActionPerformed

    private void bttntresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttntresActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "3");
    }//GEN-LAST:event_bttntresActionPerformed

    private void bttndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttndivisionActionPerformed
        // TODO add your handling code here:
        numero1 = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operador = "/";
    }//GEN-LAST:event_bttndivisionActionPerformed

    private void bttncuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttncuatroActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "4");
    }//GEN-LAST:event_bttncuatroActionPerformed

    private void bttnexponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnexponenteActionPerformed
        // TODO add your handling code here:
        numero1 = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operador = "^";
    }//GEN-LAST:event_bttnexponenteActionPerformed

    private void bttncincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttncincoActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "5");
    }//GEN-LAST:event_bttncincoActionPerformed

    private void bttnraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnraizActionPerformed
        // TODO add your handling code here:
        numero1 = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operador = "^/";
    }//GEN-LAST:event_bttnraizActionPerformed

    private void bttnseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnseisActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "6");
    }//GEN-LAST:event_bttnseisActionPerformed

    private void bttnsenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsenoActionPerformed
        // TODO add your handling code here:
         numero1 = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operador = "sin";
    }//GEN-LAST:event_bttnsenoActionPerformed

    private void bttnsieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsieteActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "7");
    }//GEN-LAST:event_bttnsieteActionPerformed

    private void bttncosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttncosenoActionPerformed
        // TODO add your handling code here:
        numero1 = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operador = "cos";
    }//GEN-LAST:event_bttncosenoActionPerformed

    private void bttnochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnochoActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "8");
    }//GEN-LAST:event_bttnochoActionPerformed

    private void bttntangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttntangenteActionPerformed
        // TODO add your handling code here:
        numero1 = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operador = "tan";
    }//GEN-LAST:event_bttntangenteActionPerformed

    private void bttnnueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnnueveActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "9");
    }//GEN-LAST:event_bttnnueveActionPerformed

    private void bttnacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnacActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(" ");
    }//GEN-LAST:event_bttnacActionPerformed

    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnac;
    private javax.swing.JButton bttncero;
    private javax.swing.JButton bttncinco;
    private javax.swing.JButton bttncoma;
    private javax.swing.JButton bttncoseno;
    private javax.swing.JButton bttncuatro;
    private javax.swing.JButton bttndelete;
    private javax.swing.JButton bttndivision;
    private javax.swing.JButton bttndos;
    private javax.swing.JButton bttnexponente;
    private javax.swing.JButton bttnigual;
    private javax.swing.JButton bttnmultiplicacion;
    private javax.swing.JButton bttnnueve;
    private javax.swing.JButton bttnocho;
    private javax.swing.JButton bttnraiz;
    private javax.swing.JButton bttnresta;
    private javax.swing.JButton bttnseis;
    private javax.swing.JButton bttnseno;
    private javax.swing.JButton bttnsiete;
    private javax.swing.JButton bttnsuma;
    private javax.swing.JButton bttntangente;
    private javax.swing.JButton bttntres;
    private javax.swing.JButton bttnuno;
    private javax.swing.JLabel txtPantalla;
    // End of variables declaration//GEN-END:variables
}
