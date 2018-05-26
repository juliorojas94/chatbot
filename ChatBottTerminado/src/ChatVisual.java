
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChatVisual extends javax.swing.JFrame {
    int saludo=0;
    public String retorno;
    
    private String texto;   
    
   
    public ChatVisual() {
        initComponents();
        setSize(500,500);
        entrada.requestFocus();
    }
    public void addText(String str){
contenido.setText(entrada.getText()+str);
	}
  
	

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("ChatBot");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("ChatBot");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 280, 80, 40);

        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });
        entrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entradaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                entradaKeyReleased(evt);
            }
        });
        getContentPane().add(entrada);
        entrada.setBounds(20, 280, 390, 40);

        contenido.setColumns(20);
        contenido.setRows(5);
        jScrollPane2.setViewportView(contenido);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 90, 470, 190);

        jLabel6.setFont(new java.awt.Font("CREW 36", 1, 36)); // NOI18N
        jLabel6.setText("ChatBot Seguros Grupo7");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 40, 460, 40);
        jLabel6.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed


    }//GEN-LAST:event_entradaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        String texto=entrada.getText();
        String tema=entrada.getText();
        
          if(saludo==0){    //variable se coloca para poder frenar y que no se hable antes de saludar
              
        if((texto.indexOf("Hola")!=-1)|| (texto.indexOf("Hola que tal")!=-1)|| (texto.indexOf("hola")!=-1)|| 
                (texto.indexOf("que onda")!=-1)|| (texto.indexOf("ayuda")!=-1)|| (texto.indexOf("informacion")!=-1) || (texto.indexOf("buenos dias")!=-1) 
                || (texto.indexOf("buenas tardes")!=-1)|| (texto.indexOf("buenas noches")!=-1) || (texto.indexOf("buenas")!=-1) || (texto.indexOf("BUENOS DIAS")!=-1) 
                || (texto.indexOf("BUENAS TARDES")!=-1) || (texto.indexOf("BUENAS NOCHES")!=-1) || (texto.indexOf("BUENAS")!=-1) || (texto.indexOf("BUENASS")!=-1)
                || (texto.indexOf("HOLA")!=-1)
                
                )  {
                entrada.setText("");
                añadirtexto ( "tu:"+(texto)
                        +"\nPc:"+"Hola en que puedo ayudarte?"+"\n");
               
                saludo=1;
            }    
        else{
            entrada.setText("");
        contenido.setText("tu:"+(texto)
                        +"\nPc:"+"Puedes iniciar la conversación con un 'Hola'."+"\n"+"\n"+"\n");
        
            }
          }
          
          
          else{
         if((texto.indexOf("necesito información de mi seguro")!=-1)|| (texto.indexOf("informacion de mi seguro")!=-1)|| 
            (texto.indexOf("Necesito informacion de mi seguro")!=-1)|| (texto.indexOf("puedes darme informacion de mi seguro")!=-1)
                 || (texto.indexOf("informacion")!=-1)|| (texto.indexOf("info")!=-1) || (texto.indexOf("informacion")!=-1) 
                 || (texto.indexOf("informacion por favor")!=-1) || (texto.indexOf("informacion porfa")!=-1) || (texto.indexOf("necesito informacion")!=-1)
                 || (texto.indexOf("INFO")!=-1)|| (texto.indexOf("necesito ayuda")!=-1)
                 
                 )   {
              
                entrada.setText("");
                 añadirtexto("tu:"+(texto)
                         +"\nPc:"+"Puedes darme tu nombre "+"\n"+"\n"+"\n");           
                
        }
              if((texto.indexOf("Alan Hernandez")!=-1)|| (texto.indexOf("Alan Eduardo Hernandez Santizo")!=-1)
                      || (texto.indexOf("Alan")!=-1)|| (texto.indexOf("Alan Eduardo")!=-1)|| (texto.indexOf("Eduardo")!=-1)||  (texto.indexOf("julio rojas")!=-1)|| (texto.indexOf("julio")!=-1)|| (texto.indexOf("ALAN EDUARDO HERNANDEZ SANTIZO")!=-1)
                      || (texto.indexOf("ALAN")!=-1)|| (texto.indexOf("ALAN HERNANDEZ")!=-1)|| (texto.indexOf("ALAN EDUARDO")!=-1)
                      || (texto.indexOf("EDUARDO HERNANDEZ")!=-1)
                      || (texto.indexOf("alan eduardo hernandez santizo")!=-1)|| (texto.indexOf("alan eduardo ")!=-1)
                      || (texto.indexOf("alan")!=-1)|| (texto.indexOf("eduardo")!=-1)|| (texto.indexOf("alan hernandez")!=-1)
                      
                
                      
                      )  {
                 entrada.setText("");
                 añadirtexto("tu:"+(texto)
              +"\nPc:"+" su numero de poliza es el:80833,"
              + "\n:"  + "La cual se encuentra vigente durante el 2018"
              + "\n:" + " Cuenta con un seguro de vida y gastos medicos, "              
              +"\n"+
                 "\n"
              +"\nPc:"+"Algo más en lo que lo pueda ayudar?"+"\n"+"si la respuesta es si indicarmelo en mayusculas gracias"+"\n"+"\n");
        }
              else{
                  if((texto.indexOf("Ana lucia viera ruiz")!=-1)
                      || (texto.indexOf("Ana viera ruiz")!=-1)|| (texto.indexOf("lucia viera ruiz")!=-1)|| (texto.indexOf("Ana")!=-1)|| (texto.indexOf("Lucia")!=-1)
                      || (texto.indexOf("Ana lucia")!=-1) || (texto.indexOf("ANA LUCIA VIERA RUIZ")!=-1)|| (texto.indexOf("ANA LUCIA")!=-1)
                      || (texto.indexOf("ANA VIERA")!=-1)|| (texto.indexOf("ANA VIERA RUIZ")!=-1)|| (texto.indexOf("LUCIA VIERA RUIZ")!=-1)
                          || (texto.indexOf("ANA")!=-1)|| (texto.indexOf("LUCIA")!=-1)|| (texto.indexOf("lucia")!=-1)
                      ){
                  entrada.setText("");
                 añadirtexto("tu:"+(texto)
              +"\nPc:"+" Señorita Ana Lucia Viera su numero de poliza es el:90784,"
              + "\n:"  + "La cual se encuentra vigente durante el 2018"
              + "\n:" + " Cuenta con un seguro de vida y gastos medicos, "              
              +"\n"+
                 "\n"
              +"\nPc:"+"Algo más en lo que lo pueda ayudar?"+"\n"+"si la respuesta es si indicarmelo en mayusculas gracias"+"\n"+"\n");
                  
                  }
                  else {
                   if((texto.indexOf("ALEX GARCIA")!=-1) || (texto.indexOf("Alejandro garcia")!=-1)|| (texto.indexOf("alejandro garcia")!=-1)
                      || (texto.indexOf("alex garcia")!=-1)|| (texto.indexOf("Alejandro Alberto Garcia Arrecis")!=-1)|| (texto.indexOf("ALEJANDRO ALBERTO GARCIA ARRECIS")!=-1)
                      || (texto.indexOf("alejandro alberto garcia arrecis")!=-1)|| (texto.indexOf("alejandro garcia arrecis")!=-1)|| (texto.indexOf("ALBERTO ARRECIS")!=-1)
                      || (texto.indexOf("ALEX ARRECIS")!=-1)|| (texto.indexOf("ALBERTO GARCIA")!=-1)|| (texto.indexOf("ALEJANDRO ALBERTO")!=-1)
                       || (texto.indexOf("Alex garcia")!=-1) || (texto.indexOf("alberto")!=-1)|| (texto.indexOf("alberto")!=-1)|| (texto.indexOf("alex")!=-1)
                      || (texto.indexOf("ALEX")!=-1)|| (texto.indexOf("Alejandro")!=-1)|| (texto.indexOf("ALEJANDRO")!=-1)|| (texto.indexOf("alejandro")!=-1)  
                      ){
                    entrada.setText("");
                 añadirtexto("tu:"+(texto)
              +"\nPc:"+" Ing. Alejandro Alberto García Arrecis su numero de poliza es el:234567,"
              + "\n:"  + "La cual se encuentra vigente durante el 2018"
              + "\n:" + " Cuenta con un seguro de vida y gastos medicos, "              
              +"\n"+
                 "\n"
              +"\nPc:"+"Algo más en lo que lo pueda ayudar?"+"\n"+"si la respuesta es si indicarmelo en mayusculas gracias"+"\n"+"\n");  
                   
                   
                   }
                   else{
                   
                   
                   if( (texto.indexOf("Julio Rojas")!=-1) ||(texto.indexOf("julio rojas")!=-1)){
                     entrada.setText("");
                 añadirtexto("tu:"+(texto)
              +"\nPc:"+" señor julio numero de poliza es el:367433,"
              + "\n:"  + "La cual se encuentra vigente durante el 2018"
              + "\n:" + " Cuenta con un seguro de vida y gastos medicos, "              
              +"\n"+
                 "\n"
              +"\nPc:"+"Algo más en lo que lo pueda ayudar?"+"\n"+"si la respuesta es si indicarmelo en mayusculas gracias"+"\n"+"\n");  
                   
                   
                   }
                   else{
                   
                   if(  (texto.indexOf("jose antonio")!=-1)|| (texto.indexOf("jose")!=-1)
                      || (texto.indexOf("antonio")!=-1)|| (texto.indexOf("rodrigo")!=-1)|| (texto.indexOf("ian")!=-1)
                      || (texto.indexOf("roberto")!=-1)|| (texto.indexOf("david")!=-1)|| (texto.indexOf("mildred ruano")!=-1)
                      || (texto.indexOf("mildred")!=-1)|| (texto.indexOf("gerson")!=-1)|| (texto.indexOf("kevin")!=-1)|| (texto.indexOf("ana viera")!=-1)
                      || (texto.indexOf("josue")!=-1)|| (texto.indexOf("carlos")!=-1)|| (texto.indexOf("ana")!=-1)
                      || (texto.indexOf("CARLOS")!=-1)|| (texto.indexOf("carlos")!=-1)|| (texto.indexOf("cesar")!=-1)
                      || (texto.indexOf("marvin")!=-1)|| (texto.indexOf("jesus")!=-1)|| (texto.indexOf("bryan")!=-1)|| (texto.indexOf("maria")!=-1)|| (texto.indexOf("alejandra")!=-1)|| (texto.indexOf("Gilberto")!=-1))
                   
                   
                   {
                       
                         entrada.setText("");
                 añadirtexto("tu:"+(texto)
              +"\nPc:"+" su nombre no aparece en la lista de asegurados dejeme dejarle informacion"+"\n"+" sobre nuestros seguros:"
                 +"\n"+ "1. Seguro de vida por 30,000 "+"\n"+"\n"+ "2. Seguro de vida por 60,000 "+"\n"+"\n"+ "3. Seguro de vida por 100,000 "+"\n"+"\n"+ "4. Seguro de vida por 500,000 "+"\n"+"todos incluyen gastos medicos"+"\n"+"para mas informacion llamar al 17783"
                 
                 
                 );
                   
                   }
                   }
                   }
                  
           
                  }
                  
              
                  
              if((texto.indexOf("No")!=-1)|| (texto.indexOf("No grcias")!=-1)|| (texto.indexOf("economía")!=-1)|| (texto.indexOf("dinero")!=-1)
                  || (texto.indexOf("no")!=-1)|| (texto.indexOf("NO")!=-1)   
                      
                      )  {
                 entrada.setText("");
                 añadirtexto("tu:"+(texto)
              +"\nPc:"+"Fue un gusto atenderlo si necesita ayuda porfavor comuniquese al 17783 "              
              +"\n");
        }
              else{ 
                  
                  if((texto.indexOf("SI")!=-1)){
                       entrada.setText("");
                  añadirtexto("tu:"+(texto)+"\n"+"indique que desea saber"+"\n"+"1.suma asegurada"+"\n"+"2.vigencia de mi seguro"+"\n"+"3.numero al que debo comunicarme en emergencias"+"\n"+"\n"+"\n");
                  }
                  if((texto.indexOf("cuanto es mi suma asegurada")!=-1)|| (texto.indexOf("suma asegurada")!=-1)|| 
                    (texto.indexOf("total suma asegurada")!=-1)|| (texto.indexOf("cuanto dinero me da el seguro")!=-1)
                    || (texto.indexOf("SUMA ASEGURADA")!=-1)|| (texto.indexOf("1")!=-1)|| (texto.indexOf("SUMA")!=-1)
                          || (texto.indexOf("CUANTO ES MI SUMA ASEGURADA")!=-1)|| (texto.indexOf("TOTAL SUMA ASEGURADA")!=-1)
                          
                          
                          
                          
                          )  {
                 entrada.setText("");
                  añadirtexto("tu:"+(texto)
              +"\nPc:"+" Señor  su seguro le cubre hasta 500,000 en efectivo "+"\n"+"fue un gusto atenderlo");
        
              }
                  if((texto.indexOf("2")!=-1)|| (texto.indexOf("VIGENCIA DE MI SEGURO")!=-1)|| (texto.indexOf("vigencia de mi seguro")!=-1)
                          || (texto.indexOf("vigencia")!=-1)|| (texto.indexOf("VIGENCIA")!=-1)){
                  
                  
                  entrada.setText("");
                 añadirtexto("tu:"+(texto)
              +"\nPc:"+"la vigencia de su seguro es para el 1 de enero del 2018"+"\n"+"fue un gusto atenderlo");
                  
                  
                  }
                  if((texto.indexOf("3")!=-1)|| (texto.indexOf("NUMERO DE EMERGENCIAS")!=-1)|| (texto.indexOf("NUMERO")!=-1) || (texto.indexOf("numero de emergencia")!=-1)
                          || (texto.indexOf("numero")!=-1)|| (texto.indexOf("numero al que debo comunicarme en emergencias")!=-1)|| (texto.indexOf("numero de emergencias")!=-1) 
                         || (texto.indexOf("NUMERO AL QUE DEBO COMUNICARME EN EMERGENCIAS")!=-1)|| (texto.indexOf("emergencia")!=-1)|| (texto.indexOf("emergencias")!=-1)
                          || (texto.indexOf("EMERGENCIA")!=-1)|| (texto.indexOf("EMERGENCIAS")!=-1)){
                  
                   
                  entrada.setText("");
                 añadirtexto("tu:"+(texto)
              +"\nPc:"+"el numero para emergencias es el 17783"+"\n"+"fue un gusto atenderlo");
                  
                  }
              }
                  if((texto.indexOf("GRACIAS")!=-1)|| (texto.indexOf("gracias")!=-1)|| (texto.indexOf("Adios")!=-1)
                          || (texto.indexOf("adios")!=-1)|| (texto.indexOf("ADIOS")!=-1)){
                  
                  
                  añadirtexto("\n"+"tu:"+(texto));
                  
                  }
                /*if((texto.indexOf("cuanta es mi suma asegurada")!=-1)|| (texto.indexOf("suma asegurada")!=-1)|| 
                    (texto.indexOf("total suma asegurada")!=-1)|| (texto.indexOf("cuanto dinero me da el seguro")!=-1))  {
                 entrada.setText("");
                  añadirtexto("tu:"+(texto)
              +"\nPc:"+" Señor Alan su seguro le cubre hasta 500,000 en efectivo ");
        }*/
              }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

 void añadirtexto (String suma){
		contenido.setText(contenido.getText()+suma);
	}
 
   
    private void entradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaKeyPressed
      
    }//GEN-LAST:event_entradaKeyPressed
public void keyReleased(KeyEvent evt){
		if(evt.getKeyCode()==KeyEvent.VK_ENTER){
			entrada.setEditable(true);
		}
	}

    private void entradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaKeyReleased

    }//GEN-LAST:event_entradaKeyReleased

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
            java.util.logging.Logger.getLogger(ChatVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatVisual().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea contenido;
    private javax.swing.JTextField entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
