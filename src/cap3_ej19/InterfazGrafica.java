
package cap3_ej19;

public class InterfazGrafica extends javax.swing.JFrame {

    public InterfazGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teqP = new javax.swing.JPanel();
        trianguloeq = new javax.swing.JLabel();
        ladoL = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        alturaL = new javax.swing.JLabel();
        perimetroL = new javax.swing.JLabel();
        areaL = new javax.swing.JLabel();
        lado = new javax.swing.JTextField();
        perimetro = new javax.swing.JTextField();
        altura = new javax.swing.JTextField();
        area = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teqP.setBackground(new java.awt.Color(255, 255, 240));
        teqP.setToolTipText("");

        trianguloeq.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trianguloeq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trianguloeq.setText("Triángulo equilátero");
        trianguloeq.setToolTipText("");

        ladoL.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        ladoL.setText("Ingrese el valor de un lado del triángulo equilátero");
        ladoL.setToolTipText("");

        calcular.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcular.setForeground(new java.awt.Color(0, 51, 153));
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        borrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(153, 0, 0));
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        alturaL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        alturaL.setForeground(new java.awt.Color(0, 51, 153));
        alturaL.setText("Perímetro del triángulo");
        alturaL.setToolTipText("");

        perimetroL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        perimetroL.setForeground(new java.awt.Color(0, 51, 153));
        perimetroL.setText("Altura del triángulo");
        perimetroL.setToolTipText("");

        areaL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        areaL.setForeground(new java.awt.Color(0, 51, 153));
        areaL.setText("Área del triángulo");
        areaL.setToolTipText("");

        lado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        perimetro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        altura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        area.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout teqPLayout = new javax.swing.GroupLayout(teqP);
        teqP.setLayout(teqPLayout);
        teqPLayout.setHorizontalGroup(
            teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teqPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teqPLayout.createSequentialGroup()
                        .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calcular)
                            .addComponent(alturaL))
                        .addGap(18, 18, 18)
                        .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrar)
                            .addGroup(teqPLayout.createSequentialGroup()
                                .addComponent(perimetro)
                                .addGap(30, 30, 30))))
                    .addGroup(teqPLayout.createSequentialGroup()
                        .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(trianguloeq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(teqPLayout.createSequentialGroup()
                                    .addComponent(areaL)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(area, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                        .addComponent(altura))))
                            .addComponent(perimetroL)
                            .addComponent(ladoL))
                        .addGap(30, 30, 30))))
        );
        teqPLayout.setVerticalGroup(
            teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teqPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(trianguloeq)
                .addGap(15, 15, 15)
                .addComponent(ladoL, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular)
                    .addComponent(borrar))
                .addGap(12, 12, 12)
                .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturaL)
                    .addComponent(perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perimetroL)
                    .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(teqPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaL))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teqP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(teqP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        lado.setText("");
        perimetro.setText("");
        altura.setText("");
        area.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        double l = Double.parseDouble(lado.getText());
        TrianguloEquilatero trianguloEq = new TrianguloEquilatero(l);
        String perimetroT = String.valueOf(trianguloEq.calcularPerimetro());
        String alturaT = String.valueOf(trianguloEq.calcularAltura());
        String areaT = String.valueOf(trianguloEq.calcularArea());
        perimetro.setText(perimetroT);
        altura.setText(alturaT);
        area.setText(areaT);
    }//GEN-LAST:event_calcularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JLabel alturaL;
    private javax.swing.JTextField area;
    private javax.swing.JLabel areaL;
    private javax.swing.JButton borrar;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField lado;
    private javax.swing.JLabel ladoL;
    private javax.swing.JTextField perimetro;
    private javax.swing.JLabel perimetroL;
    private javax.swing.JPanel teqP;
    private javax.swing.JLabel trianguloeq;
    // End of variables declaration//GEN-END:variables
}