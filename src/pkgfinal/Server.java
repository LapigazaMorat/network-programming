/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author levy
 */
public class Server extends javax.swing.JFrame {

    /**
     * Creates new form Server
     */
    public Server() {
        initComponents();
        khoitaoServer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public String giaima(String vanban, int khoa){
        int n=vanban.length();
        int sd,sc;
        sd=khoa;
        String kq="";
        sc=(n/sd)+1;
        char hr[][]=new char[sd][sc];
        int c,d;
        c=0;d=0;
        int sodu=n%sd;
        int sokytu=sc;
        for (int i=0;i<sd;i++){
            if (i>=sodu) sokytu=sc-1;
            for(int j=0;j<sokytu;j++){
                hr[i][j]=vanban.charAt(sodu);
                sodu++;
                
            }               
        }
        for (int i=0;i<n;i++){
            kq=kq+hr[d][c];
            d++;
            if (d==khoa){
                c++; d=0;
            }
        }
       return kq;
    }
    private String TimViTri(String vanban){
        int counter[] = new int[256];
        char kytu=vanban.charAt(0);
        int max=counter[vanban.charAt(0)];
        int len = vanban.length();
        for (int i = 0; i < len; i++)
            counter[vanban.charAt(i)]++;
        char array[] = new char[vanban.length()];
        for (int i = 0; i < len; i++) {
            array[i] = vanban.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (vanban.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                if (counter[vanban.charAt(i)]>max){
                    max=counter[vanban.charAt(i)];
                    kytu=vanban.charAt(i);
                }
        }
       String chuoi ="Số lần xuất hiện của " + kytu + " trong chuỗi:" + max;
        return chuoi;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtvanban = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtkhoa = new javax.swing.JTextField();
        txttrangthai = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtgiaima = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("SERVER");

        jLabel2.setText("Trạng thái");

        jLabel3.setText("Văn bản nhận được ");

        txtvanban.setColumns(20);
        txtvanban.setRows(5);
        jScrollPane1.setViewportView(txtvanban);

        jButton1.setText("Giải mã");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thoát");

        jLabel4.setText("Khóa");

        txtgiaima.setColumns(20);
        txtgiaima.setRows(5);
        jScrollPane2.setViewportView(txtgiaima);

        jLabel5.setText("Văn bản đã giải mã ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jButton1)
                        .addGap(251, 251, 251)
                        .addComponent(jButton2)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txttrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DatagramSocket server;
    byte[] receiveData = new byte[1024];
    DatagramPacket packetnhan;
    byte[] sendData = new byte[1024];
    DatagramPacket packetgui;
    private void khoitaoServer(){
        try{
            
            server= new DatagramSocket(9999);
            System.out.println("server đang đợi kết nối từ client!!!"); //lúc đầu server in ra dòng này ạ
            if (server!=null){
            txttrangthai.setText("Đã kết nối thành công!!");
            System.out.println("Đã kết nối thành công!!");
        }
            //nhận data về server 
            packetnhan = new DatagramPacket (receiveData,receiveData.length);
            server.receive(packetnhan);
            txttrangthai.setText("Server đã nhận dữ liệu");

            String vanban= new String (packetnhan.getData(),0,packetnhan.getLength());
            String[] chuoi =vanban.split("/");
            vanban=chuoi[0];
            String khoa=chuoi[1];
            txtvanban.setText(vanban);
            txtkhoa.setText(khoa);
            int Khoa = Integer.parseInt(khoa);
            //ma hoa 
            vanban=giaima(vanban,Khoa);
            txtgiaima.setText(vanban);            
            sendData = TimViTri(vanban).getBytes();
             // tạo packet để gửi về client
            


            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            packetgui = new DatagramPacket(sendData, sendData.length, packetnhan.getAddress(), packetnhan.getPort());
            server.send(packetgui);
            server.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtgiaima;
    private javax.swing.JTextField txtkhoa;
    private javax.swing.JTextField txttrangthai;
    private javax.swing.JTextArea txtvanban;
    // End of variables declaration//GEN-END:variables
}
