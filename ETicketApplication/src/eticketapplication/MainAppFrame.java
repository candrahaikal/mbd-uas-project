/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eticketapplication;

import com.sun.jdi.connect.spi.Connection;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MainAppFrame extends javax.swing.JFrame {
    
    
  // Global Variable
  // Page Login
  String ID_AKUN = "";
  
  // Page Home
  int totalJadwal;
  String[] ID_jadwal= new String[3];
  
  public MainAppFrame() {
    initComponents();
    tglBerangkatDateHome.setDateFormatString("dd-MMM-yyyy");
    ContainerPages.setSelectedIndex(0);
    setVisibleNav(false);
  }
  //hidden navBar
  public void setVisibleNav(boolean x){
      homeNavBtn.setVisible(x);
      transaksiNavBtn.setVisible(x);
      bliFoodNavBtn.setVisible(x);
  }
  
  // Clear SignUp Pages
  public void clearSignUp(){
      namaFieldSignUp.setText("");
      emailFieldSignUp.setText("");
      teleponFieldSignUp.setText("");
      passwordFieldSignUp.setText("");   
  }
  
  public void setVisibleFinalMakanan(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
      namaLabelFinalMakanan2.setVisible(x);
      namaLabelFinalMakanan3.setVisible(x);
      namaLabelFinalMakanan4.setVisible(x);
      namaLabelFinalMakanan5.setVisible(x);
      namaLabelFinalMakanan6.setVisible(x);
      namaLabelFinalMakanan7.setVisible(x);
      namaLabelFinalMakanan8.setVisible(x);
      namaLabelFinalMakanan9.setVisible(x);
      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
      jumlahLabelFinalMakanan2.setVisible(x);
      jumlahLabelFinalMakanan3.setVisible(x);
      jumlahLabelFinalMakanan4.setVisible(x);
      jumlahLabelFinalMakanan5.setVisible(x);
      jumlahLabelFinalMakanan6.setVisible(x);
      jumlahLabelFinalMakanan7.setVisible(x);
      jumlahLabelFinalMakanan8.setVisible(x);
      jumlahLabelFinalMakanan9.setVisible(x);
      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
      hargaLabelFinalMakanan2.setVisible(x);
      hargaLabelFinalMakanan3.setVisible(x);
      hargaLabelFinalMakanan4.setVisible(x);
      hargaLabelFinalMakanan5.setVisible(x);
      hargaLabelFinalMakanan6.setVisible(x);
      hargaLabelFinalMakanan7.setVisible(x);
      hargaLabelFinalMakanan8.setVisible(x);
      hargaLabelFinalMakanan9.setVisible(x);
      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  
  public void setVisibleFinalMakanan1(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
      namaLabelFinalMakanan2.setVisible(x);
      namaLabelFinalMakanan3.setVisible(x);
      namaLabelFinalMakanan4.setVisible(x);
      namaLabelFinalMakanan5.setVisible(x);
      namaLabelFinalMakanan6.setVisible(x);
      namaLabelFinalMakanan7.setVisible(x);
      namaLabelFinalMakanan8.setVisible(x);
      namaLabelFinalMakanan9.setVisible(x);
//      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
      jumlahLabelFinalMakanan2.setVisible(x);
      jumlahLabelFinalMakanan3.setVisible(x);
      jumlahLabelFinalMakanan4.setVisible(x);
      jumlahLabelFinalMakanan5.setVisible(x);
      jumlahLabelFinalMakanan6.setVisible(x);
      jumlahLabelFinalMakanan7.setVisible(x);
      jumlahLabelFinalMakanan8.setVisible(x);
      jumlahLabelFinalMakanan9.setVisible(x);
//      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
      hargaLabelFinalMakanan2.setVisible(x);
      hargaLabelFinalMakanan3.setVisible(x);
      hargaLabelFinalMakanan4.setVisible(x);
      hargaLabelFinalMakanan5.setVisible(x);
      hargaLabelFinalMakanan6.setVisible(x);
      hargaLabelFinalMakanan7.setVisible(x);
      hargaLabelFinalMakanan8.setVisible(x);
      hargaLabelFinalMakanan9.setVisible(x);
//      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  
  public void setVisibleFinalMakanan2(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
      namaLabelFinalMakanan2.setVisible(x);
      namaLabelFinalMakanan3.setVisible(x);
      namaLabelFinalMakanan4.setVisible(x);
      namaLabelFinalMakanan5.setVisible(x);
      namaLabelFinalMakanan6.setVisible(x);
      namaLabelFinalMakanan7.setVisible(x);
      namaLabelFinalMakanan8.setVisible(x);
//      namaLabelFinalMakanan9.setVisible(x);
//      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
      jumlahLabelFinalMakanan2.setVisible(x);
      jumlahLabelFinalMakanan3.setVisible(x);
      jumlahLabelFinalMakanan4.setVisible(x);
      jumlahLabelFinalMakanan5.setVisible(x);
      jumlahLabelFinalMakanan6.setVisible(x);
      jumlahLabelFinalMakanan7.setVisible(x);
      jumlahLabelFinalMakanan8.setVisible(x);
//      jumlahLabelFinalMakanan9.setVisible(x);
//      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
      hargaLabelFinalMakanan2.setVisible(x);
      hargaLabelFinalMakanan3.setVisible(x);
      hargaLabelFinalMakanan4.setVisible(x);
      hargaLabelFinalMakanan5.setVisible(x);
      hargaLabelFinalMakanan6.setVisible(x);
      hargaLabelFinalMakanan7.setVisible(x);
      hargaLabelFinalMakanan8.setVisible(x);
//      hargaLabelFinalMakanan9.setVisible(x);
//      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  
  public void setVisibleFinalMakanan3(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
      namaLabelFinalMakanan2.setVisible(x);
      namaLabelFinalMakanan3.setVisible(x);
      namaLabelFinalMakanan4.setVisible(x);
      namaLabelFinalMakanan5.setVisible(x);
      namaLabelFinalMakanan6.setVisible(x);
      namaLabelFinalMakanan7.setVisible(x);
//      namaLabelFinalMakanan8.setVisible(x);
//      namaLabelFinalMakanan9.setVisible(x);
//      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
      jumlahLabelFinalMakanan2.setVisible(x);
      jumlahLabelFinalMakanan3.setVisible(x);
      jumlahLabelFinalMakanan4.setVisible(x);
      jumlahLabelFinalMakanan5.setVisible(x);
      jumlahLabelFinalMakanan6.setVisible(x);
      jumlahLabelFinalMakanan7.setVisible(x);
//      jumlahLabelFinalMakanan8.setVisible(x);
//      jumlahLabelFinalMakanan9.setVisible(x);
//      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
      hargaLabelFinalMakanan2.setVisible(x);
      hargaLabelFinalMakanan3.setVisible(x);
      hargaLabelFinalMakanan4.setVisible(x);
      hargaLabelFinalMakanan5.setVisible(x);
      hargaLabelFinalMakanan6.setVisible(x);
      hargaLabelFinalMakanan7.setVisible(x);
//      hargaLabelFinalMakanan8.setVisible(x);
//      hargaLabelFinalMakanan9.setVisible(x);
//      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  
  public void setVisibleFinalMakanan4(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
      namaLabelFinalMakanan2.setVisible(x);
      namaLabelFinalMakanan3.setVisible(x);
      namaLabelFinalMakanan4.setVisible(x);
      namaLabelFinalMakanan5.setVisible(x);
      namaLabelFinalMakanan6.setVisible(x);
//      namaLabelFinalMakanan7.setVisible(x);
//      namaLabelFinalMakanan8.setVisible(x);
//      namaLabelFinalMakanan9.setVisible(x);
//      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
      jumlahLabelFinalMakanan2.setVisible(x);
      jumlahLabelFinalMakanan3.setVisible(x);
      jumlahLabelFinalMakanan4.setVisible(x);
      jumlahLabelFinalMakanan5.setVisible(x);
      jumlahLabelFinalMakanan6.setVisible(x);
      jumlahLabelFinalMakanan7.setVisible(x);
      jumlahLabelFinalMakanan8.setVisible(x);
      jumlahLabelFinalMakanan9.setVisible(x);
      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
      hargaLabelFinalMakanan2.setVisible(x);
      hargaLabelFinalMakanan3.setVisible(x);
      hargaLabelFinalMakanan4.setVisible(x);
      hargaLabelFinalMakanan5.setVisible(x);
      hargaLabelFinalMakanan6.setVisible(x);
      hargaLabelFinalMakanan7.setVisible(x);
      hargaLabelFinalMakanan8.setVisible(x);
      hargaLabelFinalMakanan9.setVisible(x);
      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  
  public void setVisibleFinalMakanan5(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
      namaLabelFinalMakanan2.setVisible(x);
      namaLabelFinalMakanan3.setVisible(x);
      namaLabelFinalMakanan4.setVisible(x);
      namaLabelFinalMakanan5.setVisible(x);
//      namaLabelFinalMakanan6.setVisible(x);
//      namaLabelFinalMakanan7.setVisible(x);
//      namaLabelFinalMakanan8.setVisible(x);
//      namaLabelFinalMakanan9.setVisible(x);
//      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
      jumlahLabelFinalMakanan2.setVisible(x);
      jumlahLabelFinalMakanan3.setVisible(x);
      jumlahLabelFinalMakanan4.setVisible(x);
      jumlahLabelFinalMakanan5.setVisible(x);
//      jumlahLabelFinalMakanan6.setVisible(x);
//      jumlahLabelFinalMakanan7.setVisible(x);
//      jumlahLabelFinalMakanan8.setVisible(x);
//      jumlahLabelFinalMakanan9.setVisible(x);
//      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
      hargaLabelFinalMakanan2.setVisible(x);
      hargaLabelFinalMakanan3.setVisible(x);
      hargaLabelFinalMakanan4.setVisible(x);
      hargaLabelFinalMakanan5.setVisible(x);
//      hargaLabelFinalMakanan6.setVisible(x);
//      hargaLabelFinalMakanan7.setVisible(x);
//      hargaLabelFinalMakanan8.setVisible(x);
//      hargaLabelFinalMakanan9.setVisible(x);
//      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  
  public void setVisibleFinalMakanan6(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
      namaLabelFinalMakanan2.setVisible(x);
      namaLabelFinalMakanan3.setVisible(x);
      namaLabelFinalMakanan4.setVisible(x);
//      namaLabelFinalMakanan5.setVisible(x);
//      namaLabelFinalMakanan6.setVisible(x);
//      namaLabelFinalMakanan7.setVisible(x);
//      namaLabelFinalMakanan8.setVisible(x);
//      namaLabelFinalMakanan9.setVisible(x);
//      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
      jumlahLabelFinalMakanan2.setVisible(x);
      jumlahLabelFinalMakanan3.setVisible(x);
      jumlahLabelFinalMakanan4.setVisible(x);
//      jumlahLabelFinalMakanan5.setVisible(x);
//      jumlahLabelFinalMakanan6.setVisible(x);
//      jumlahLabelFinalMakanan7.setVisible(x);
//      jumlahLabelFinalMakanan8.setVisible(x);
//      jumlahLabelFinalMakanan9.setVisible(x);
//      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
      hargaLabelFinalMakanan2.setVisible(x);
      hargaLabelFinalMakanan3.setVisible(x);
      hargaLabelFinalMakanan4.setVisible(x);
//      hargaLabelFinalMakanan5.setVisible(x);
//      hargaLabelFinalMakanan6.setVisible(x);
//      hargaLabelFinalMakanan7.setVisible(x);
//      hargaLabelFinalMakanan8.setVisible(x);
//      hargaLabelFinalMakanan9.setVisible(x);
//      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  
  public void setVisibleFinalMakanan7(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
      namaLabelFinalMakanan2.setVisible(x);
      namaLabelFinalMakanan3.setVisible(x);
//      namaLabelFinalMakanan4.setVisible(x);
//      namaLabelFinalMakanan5.setVisible(x);
//      namaLabelFinalMakanan6.setVisible(x);
//      namaLabelFinalMakanan7.setVisible(x);
//      namaLabelFinalMakanan8.setVisible(x);
//      namaLabelFinalMakanan9.setVisible(x);
//      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
      jumlahLabelFinalMakanan2.setVisible(x);
      jumlahLabelFinalMakanan3.setVisible(x);
//      jumlahLabelFinalMakanan4.setVisible(x);
//      jumlahLabelFinalMakanan5.setVisible(x);
//      jumlahLabelFinalMakanan6.setVisible(x);
//      jumlahLabelFinalMakanan7.setVisible(x);
//      jumlahLabelFinalMakanan8.setVisible(x);
//      jumlahLabelFinalMakanan9.setVisible(x);
//      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
      hargaLabelFinalMakanan2.setVisible(x);
      hargaLabelFinalMakanan3.setVisible(x);
//      hargaLabelFinalMakanan4.setVisible(x);
//      hargaLabelFinalMakanan5.setVisible(x);
//      hargaLabelFinalMakanan6.setVisible(x);
//      hargaLabelFinalMakanan7.setVisible(x);
//      hargaLabelFinalMakanan8.setVisible(x);
//      hargaLabelFinalMakanan9.setVisible(x);
//      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  
  public void setVisibleFinalMakanan8(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
      namaLabelFinalMakanan2.setVisible(x);
//      namaLabelFinalMakanan3.setVisible(x);
//      namaLabelFinalMakanan4.setVisible(x);
//      namaLabelFinalMakanan5.setVisible(x);
//      namaLabelFinalMakanan6.setVisible(x);
//      namaLabelFinalMakanan7.setVisible(x);
//      namaLabelFinalMakanan8.setVisible(x);
//      namaLabelFinalMakanan9.setVisible(x);
//      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
      jumlahLabelFinalMakanan2.setVisible(x);
//      jumlahLabelFinalMakanan3.setVisible(x);
//      jumlahLabelFinalMakanan4.setVisible(x);
//      jumlahLabelFinalMakanan5.setVisible(x);
//      jumlahLabelFinalMakanan6.setVisible(x);
//      jumlahLabelFinalMakanan7.setVisible(x);
//      jumlahLabelFinalMakanan8.setVisible(x);
//      jumlahLabelFinalMakanan9.setVisible(x);
//      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
      hargaLabelFinalMakanan2.setVisible(x);
//      hargaLabelFinalMakanan3.setVisible(x);
//      hargaLabelFinalMakanan4.setVisible(x);
//      hargaLabelFinalMakanan5.setVisible(x);
//      hargaLabelFinalMakanan6.setVisible(x);
//      hargaLabelFinalMakanan7.setVisible(x);
//      hargaLabelFinalMakanan8.setVisible(x);
//      hargaLabelFinalMakanan9.setVisible(x);
//      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  
  public void setVisibleFinalMakanan9(boolean x){
      namaLabelFinalMakanan1.setVisible(x);
//      namaLabelFinalMakanan2.setVisible(x);
//      namaLabelFinalMakanan3.setVisible(x);
//      namaLabelFinalMakanan4.setVisible(x);
//      namaLabelFinalMakanan5.setVisible(x);
//      namaLabelFinalMakanan6.setVisible(x);
//      namaLabelFinalMakanan7.setVisible(x);
//      namaLabelFinalMakanan8.setVisible(x);
//      namaLabelFinalMakanan9.setVisible(x);
//      namaLabelFinalMakanan10.setVisible(x);
      
      jumlahLabelFinalMakanan1.setVisible(x);
//      jumlahLabelFinalMakanan2.setVisible(x);
//      jumlahLabelFinalMakanan3.setVisible(x);
//      jumlahLabelFinalMakanan4.setVisible(x);
//      jumlahLabelFinalMakanan5.setVisible(x);
//      jumlahLabelFinalMakanan6.setVisible(x);
//      jumlahLabelFinalMakanan7.setVisible(x);
//      jumlahLabelFinalMakanan8.setVisible(x);
//      jumlahLabelFinalMakanan9.setVisible(x);
//      jumlahLabelFinalMakanan10.setVisible(x);
      
      hargaLabelFinalMakanan1.setVisible(x);
//      hargaLabelFinalMakanan2.setVisible(x);
//      hargaLabelFinalMakanan3.setVisible(x);
//      hargaLabelFinalMakanan4.setVisible(x);
//      hargaLabelFinalMakanan5.setVisible(x);
//      hargaLabelFinalMakanan6.setVisible(x);
//      hargaLabelFinalMakanan7.setVisible(x);
//      hargaLabelFinalMakanan8.setVisible(x);
//      hargaLabelFinalMakanan9.setVisible(x);
//      hargaLabelFinalMakanan10.setVisible(x);
              
  }
  // Create Configure without result 
  public void sqlStatementNoResult(String sql){
      
    try {
        
        java.sql.Connection configuration = (java.sql.Connection) config.configDB();
        java.sql.PreparedStatement preparedStatement = configuration.prepareStatement(sql);
        preparedStatement.execute();

    } catch(Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }    
  }
  
  public java.sql.ResultSet sqlStatementWithResult(String sql){
      java.sql.ResultSet result = null;
      
      try{
        java.sql.Connection configuration = (java.sql.Connection) config.configDB();
        java.sql.Statement sqlStatement = configuration.createStatement();
        java.sql.ResultSet sqlResult = sqlStatement.executeQuery(sql); 
        result = sqlResult;
      } catch(Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());

      }

    
        return result;
  }
  
  // Clear jadwal tiket
  public void clearJadwalTiket(){
//     namaKeretaLabelJadwalSatu.setText("");
//                        hargaLabelJadwalSatu.setText("RP : " + String.valueOf(result.getInt(3)));
//                        keberangkatanLabelJadwalSatu.setText(result.getString(4));
//                        tujuanLabelJadwalSatu.setText(result.getString(5));
//                        awalLabelJadwalSatu.setText(result.getString(6));
//                        sampaiLabelJadwalSatu.setText(result.getString(7));
//                        durasiLabelJadwalSatu.setText(result.getString(8));
//                        idTiketLabelJadwalSatu.setText(result.getString(1));
//                        
//                        namaKeretaLabelJadwalKedua.setText("Kereta : " + result.getString(2));
//                        hargaLabelJadwalKedua.setText("RP : " + String.valueOf(result.getInt(3)));
//                        keberangkatanLabelJadwalKedua.setText(result.getString(4));
//                        tujuanLabelJadwalKedua.setText(result.getString(5));
//                        awalLabelJadwalKedua.setText(result.getString(6));
//                        sampaiLabelJadwalKedua.setText(result.getString(7));
//                        durasiLabelJadwalKedua.setText(result.getString(8));
//                        idTiketLabelJadwalKedua.setText(result.getString(1));
//                        result.next();
//                        
//                        namaKeretaLabelJadwalKetiga.setText("Kereta : " + result.getString(2));
//                        hargaLabelJadwalKetiga.setText("RP : " + String.valueOf(result.getInt(3)));
//                        keberangkatanLabelJadwalKetiga.setText(result.getString(4));
//                        tujuanLabelJadwalKetiga.setText(result.getString(5));
//                        awalLabelJadwalKetiga.setText(result.getString(6));
//                        sampaiLabelJadwalKetiga.setText(result.getString(7));
//                        durasiLabelJadwalKetiga.setText(result.getString(8));
//                        idTiketLabelJadwalKetiga.setText(result.getString(1));
        listJadwalPanelJadwalSatu.setVisible(false);
        listJadwalPanelJadwalKedua.setVisible(false);
        listJadwalPanelJadwalKetiga.setVisible(false);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do
   * NOT modify this code. The content of this method is always regenerated by the Form
   * Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jadwal1 = new javax.swing.JPanel();
        namaKereta = new javax.swing.JLabel();
        awal = new javax.swing.JLabel();
        sampai = new javax.swing.JLabel();
        durasi = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        keberangkatan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        bliFoodNavBtn = new javax.swing.JButton();
        transaksiNavBtn = new javax.swing.JButton();
        homeNavBtn = new javax.swing.JButton();
        ContainerPages = new javax.swing.JTabbedPane();
        LoginPage = new javax.swing.JPanel();
        emailFieldLogin = new javax.swing.JTextField();
        emailLabelLogin = new javax.swing.JLabel();
        passwordLabelLogin = new javax.swing.JLabel();
        masukBtnLogin = new javax.swing.JButton();
        passwordFieldLogin = new javax.swing.JPasswordField();
        daftarBtnLogin = new javax.swing.JButton();
        titleLabelHome1 = new javax.swing.JLabel();
        loginLabelLogin = new javax.swing.JLabel();
        SignUpPage = new javax.swing.JPanel();
        emailLabelSignup = new javax.swing.JLabel();
        emailFieldSignUp = new javax.swing.JTextField();
        passwordLabelSignup = new javax.swing.JLabel();
        passwordFieldSignUp = new javax.swing.JPasswordField();
        teleponLabelSignIUp = new javax.swing.JLabel();
        teleponFieldSignUp = new javax.swing.JTextField();
        namaLabelSignup = new javax.swing.JLabel();
        namaFieldSignUp = new javax.swing.JTextField();
        daftarBtnSignUp = new javax.swing.JButton();
        signUpLabelSignUp = new javax.swing.JLabel();
        HomePage = new javax.swing.JPanel();
        titleLabelHome = new javax.swing.JLabel();
        awalListHome = new javax.swing.JComboBox<>();
        awalLabelHome = new javax.swing.JLabel();
        tujuanLabelHome = new javax.swing.JLabel();
        tujuanListHome = new javax.swing.JComboBox<>();
        tanggalLabelHome = new javax.swing.JLabel();
        tglBerangkatDateHome = new com.toedter.calendar.JDateChooser();
        penumpangLabelHome = new javax.swing.JLabel();
        penumpangSpinnerHome = new javax.swing.JSpinner();
        cariTiketBtnHome = new javax.swing.JButton();
        JadwalPage = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        listJadwalPanelJadwalKedua = new javax.swing.JPanel();
        namaKeretaLabelJadwalKedua = new javax.swing.JLabel();
        awalLabelJadwalKedua = new javax.swing.JLabel();
        sampaiLabelJadwalKedua = new javax.swing.JLabel();
        durasiLabelJadwalKedua = new javax.swing.JLabel();
        hargaLabelJadwalKedua = new javax.swing.JLabel();
        keberangkatanLabelJadwalKedua = new javax.swing.JLabel();
        tujuanLabelJadwalKedua = new javax.swing.JLabel();
        idTiketLabelJadwalKedua = new javax.swing.JLabel();
        jadwalKeretaApiLabelJadwal = new javax.swing.JLabel();
        listJadwalPanelJadwalKetiga = new javax.swing.JPanel();
        namaKeretaLabelJadwalKetiga = new javax.swing.JLabel();
        awalLabelJadwalKetiga = new javax.swing.JLabel();
        sampaiLabelJadwalKetiga = new javax.swing.JLabel();
        durasiLabelJadwalKetiga = new javax.swing.JLabel();
        hargaLabelJadwalKetiga = new javax.swing.JLabel();
        keberangkatanLabelJadwalKetiga = new javax.swing.JLabel();
        tujuanLabelJadwalKetiga = new javax.swing.JLabel();
        idTiketLabelJadwalKetiga = new javax.swing.JLabel();
        listJadwalPanelJadwalSatu = new javax.swing.JPanel();
        namaKeretaLabelJadwalSatu = new javax.swing.JLabel();
        awalLabelJadwalSatu = new javax.swing.JLabel();
        sampaiLabelJadwalSatu = new javax.swing.JLabel();
        durasiLabelJadwalSatu = new javax.swing.JLabel();
        hargaLabelJadwalSatu = new javax.swing.JLabel();
        keberangkatanLabelJadwalSatu = new javax.swing.JLabel();
        tujuanLabelJadwalSatu = new javax.swing.JLabel();
        idTiketLabelJadwalSatu = new javax.swing.JLabel();
        kembaliBtnJadwal = new javax.swing.JButton();
        PesanTiketPage = new javax.swing.JPanel();
        tiketPanelPesanTiket = new javax.swing.JPanel();
        tglTiketLabelPesanTiket = new javax.swing.JLabel();
        destinasiAwalLabelPesanTiket = new javax.swing.JLabel();
        awalLabelPesanTiket = new javax.swing.JLabel();
        namaKeretaLabelPesanTiket = new javax.swing.JLabel();
        destinasiAkhirLabelPesanTiket = new javax.swing.JLabel();
        strip = new javax.swing.JLabel();
        akhirLabelPesanTiket = new javax.swing.JLabel();
        penumpangLabelPesanTiket = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PilihKursiPage = new javax.swing.JPanel();
        gerbongPilihKursi = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        gerbongLabelPilihKursi = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        pilihGerbongComboPilihKursi = new javax.swing.JComboBox<>();
        pesanBtnPilihKursi = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        DetailPembayaranPage = new javax.swing.JPanel();
        detailPanelDetailPembayaran = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        metodePembayaranComboDetailPembayaran = new javax.swing.JComboBox<>();
        totalHargaDetailPembayaran = new javax.swing.JLabel();
        metodePembayaranLabelDetailPembayaran = new javax.swing.JLabel();
        detailPembayaranLabelDetailPembayaran = new javax.swing.JLabel();
        hargaTiketLabelDetailPembayaran = new javax.swing.JLabel();
        penumpangLabelDetailPembayaran = new javax.swing.JLabel();
        angkaPenumpangLabelDetailPembayaran = new javax.swing.JLabel();
        bayarBtnDetailPembayaran = new javax.swing.JButton();
        FinalPembayaran = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        PesanMakananPage = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        MakananPanelPesanMakanan = new javax.swing.JPanel();
        namaMakananLabelPesanMakanan1 = new javax.swing.JLabel();
        hargaMakananLabelPesanMakanan1 = new javax.swing.JLabel();
        spinnerMakananPesanMakanan1 = new javax.swing.JSpinner();
        bliFoodLabelPesanMakanan = new javax.swing.JLabel();
        MinumanPanelPesanMakanan1 = new javax.swing.JPanel();
        namaMinumanLabelPesanMakanan1 = new javax.swing.JLabel();
        hargaMinumanLabelPesanMakanan1 = new javax.swing.JLabel();
        spinnerMinumanPesanMakanan1 = new javax.swing.JSpinner();
        MinumanPanelPesanMakanan3 = new javax.swing.JPanel();
        namaMinumanLabelPesanMakanan2 = new javax.swing.JLabel();
        hargaMinumanLabelPesanMakanan2 = new javax.swing.JLabel();
        spinnerMinumanPesanMakanan2 = new javax.swing.JSpinner();
        MakananPanelPesanMakanan2 = new javax.swing.JPanel();
        namaMakananLabelPesanMakanan2 = new javax.swing.JLabel();
        hargaMakananLabelPesanMakanan2 = new javax.swing.JLabel();
        spinnerMakananPesanMakanan2 = new javax.swing.JSpinner();
        MakananPanelPesanMakanan3 = new javax.swing.JPanel();
        namaMakananLabelPesanMakanan3 = new javax.swing.JLabel();
        hargaMakananLabelPesanMakanan3 = new javax.swing.JLabel();
        spinnerMakananPesanMakanan4 = new javax.swing.JSpinner();
        MinumanPanelPesanMakanan4 = new javax.swing.JPanel();
        namaMinumanLabelPesanMakanan3 = new javax.swing.JLabel();
        hargaMinumanLabelPesanMakanan3 = new javax.swing.JLabel();
        spinnerMinumanPesanMakanan4 = new javax.swing.JSpinner();
        MinumanPanelPesanMakanan5 = new javax.swing.JPanel();
        namaMinumanLabelPesanMakanan4 = new javax.swing.JLabel();
        hargaMinumanLabelPesanMakanan4 = new javax.swing.JLabel();
        spinnerMinumanPesanMakanan3 = new javax.swing.JSpinner();
        MakananPanelPesanMakanan4 = new javax.swing.JPanel();
        namaMakananLabelPesanMakanan4 = new javax.swing.JLabel();
        hargaMakananLabelPesanMakanan4 = new javax.swing.JLabel();
        spinnerMakananPesanMakanan3 = new javax.swing.JSpinner();
        MinumanPanelPesanMakanan6 = new javax.swing.JPanel();
        namaMinumanLabelPesanMakanan5 = new javax.swing.JLabel();
        hargaMinumanLabelPesanMakanan5 = new javax.swing.JLabel();
        spinnerMinumanPesanMakanan5 = new javax.swing.JSpinner();
        MakananPanelPesanMakanan5 = new javax.swing.JPanel();
        namaMakananLabelPesanMakanan5 = new javax.swing.JLabel();
        hargaMakananLabelPesanMakanan5 = new javax.swing.JLabel();
        spinnerMakananPesanMakanan5 = new javax.swing.JSpinner();
        pesanBtnPesanMakanan = new javax.swing.JButton();
        FinalMakananPage = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        listMakananPanelFinalMakanan = new javax.swing.JPanel();
        namaLabelFinalMakanan1 = new javax.swing.JLabel();
        totalHargaLabelFinalMakanan = new javax.swing.JLabel();
        namaLabelFinalMakanan2 = new javax.swing.JLabel();
        namaLabelFinalMakanan3 = new javax.swing.JLabel();
        namaLabelFinalMakanan4 = new javax.swing.JLabel();
        namaLabelFinalMakanan5 = new javax.swing.JLabel();
        namaLabelFinalMakanan6 = new javax.swing.JLabel();
        namaLabelFinalMakanan7 = new javax.swing.JLabel();
        namaLabelFinalMakanan8 = new javax.swing.JLabel();
        namaLabelFinalMakanan9 = new javax.swing.JLabel();
        namaLabelFinalMakanan10 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan1 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan2 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan3 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan4 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan5 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan6 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan7 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan8 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan9 = new javax.swing.JLabel();
        jumlahLabelFinalMakanan10 = new javax.swing.JLabel();
        hargaLabelFinalMakanan1 = new javax.swing.JLabel();
        hargaLabelFinalMakanan2 = new javax.swing.JLabel();
        hargaLabelFinalMakanan3 = new javax.swing.JLabel();
        hargaLabelFinalMakanan4 = new javax.swing.JLabel();
        hargaLabelFinalMakanan5 = new javax.swing.JLabel();
        hargaLabelFinalMakanan6 = new javax.swing.JLabel();
        hargaLabelFinalMakanan7 = new javax.swing.JLabel();
        hargaLabelFinalMakanan8 = new javax.swing.JLabel();
        hargaLabelFinalMakanan9 = new javax.swing.JLabel();
        hargaLabelFinalMakanan10 = new javax.swing.JLabel();
        metodePembayaranLabelFinalMakanan = new javax.swing.JLabel();
        metodeBayarComboFinalMakanan = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        TransaksiPage = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        listPanelTransaksi2 = new javax.swing.JPanel();
        invoiceLabelTransaksi2 = new javax.swing.JLabel();
        hargaLabelTransaksi2 = new javax.swing.JLabel();
        namaKeretaLabelTransaksi2 = new javax.swing.JLabel();
        awalLabelTransaksi2 = new javax.swing.JLabel();
        tujuanLabelTujuan2 = new javax.swing.JLabel();
        riwayatTransaksiLabelTransaksi1 = new javax.swing.JLabel();
        listPanelTransaksi3 = new javax.swing.JPanel();
        invoiceLabelTransaksi3 = new javax.swing.JLabel();
        hargaLabelTransaksi3 = new javax.swing.JLabel();
        namaKeretaLabelTransaksi3 = new javax.swing.JLabel();
        awalLabelTransaksi3 = new javax.swing.JLabel();
        tujuanLabelTujuan3 = new javax.swing.JLabel();
        listPanelTransaksi5 = new javax.swing.JPanel();
        invoiceLabelTransaksi5 = new javax.swing.JLabel();
        hargaLabelTransaksi5 = new javax.swing.JLabel();
        namaKeretaLabelTransaksi5 = new javax.swing.JLabel();
        awalLabelTransaksi5 = new javax.swing.JLabel();
        tujuanLabelTujuan5 = new javax.swing.JLabel();
        listPanelTransaksi6 = new javax.swing.JPanel();
        invoiceLabelTransaksi6 = new javax.swing.JLabel();
        hargaLabelTransaksi6 = new javax.swing.JLabel();
        namaKeretaLabelTransaksi6 = new javax.swing.JLabel();
        awalLabelTransaksi6 = new javax.swing.JLabel();
        tujuanLabelTujuan6 = new javax.swing.JLabel();
        AdminPage = new javax.swing.JPanel();
        jadwalBtnAdminPage = new javax.swing.JButton();
        akunBtnAdminPage1 = new javax.swing.JButton();
        daftarKeretaBtnAdminPage = new javax.swing.JButton();
        daftarStasiunBtnAdminPage = new javax.swing.JButton();
        daftarMenuBtnAdminPage = new javax.swing.JButton();
        daftarPembayaranBtnAdminPage = new javax.swing.JButton();
        pembayaranBlifoodBtnAdminPage = new javax.swing.JButton();
        daftarGerbongBtnAdminPage = new javax.swing.JButton();
        daftarPenumpangBtnAdminPage = new javax.swing.JButton();
        daftarTransaksiBtnAdminPage = new javax.swing.JButton();

        jadwal1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        namaKereta.setText("Nama Kereta");

        awal.setText("Awal");

        sampai.setText("Sampai");

        durasi.setText("Durasi");

        harga.setText("Harga");

        keberangkatan.setText("Keberangkatan");

        jLabel2.setText("Tujuan");

        javax.swing.GroupLayout jadwal1Layout = new javax.swing.GroupLayout(jadwal1);
        jadwal1.setLayout(jadwal1Layout);
        jadwal1Layout.setHorizontalGroup(
            jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jadwal1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jadwal1Layout.createSequentialGroup()
                        .addComponent(namaKereta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harga))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jadwal1Layout.createSequentialGroup()
                        .addGroup(jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jadwal1Layout.createSequentialGroup()
                                .addComponent(awal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(durasi)
                                .addGap(162, 162, 162))
                            .addGroup(jadwal1Layout.createSequentialGroup()
                                .addComponent(keberangkatan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(sampai))))
                .addGap(54, 54, 54))
        );
        jadwal1Layout.setVerticalGroup(
            jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jadwal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKereta)
                    .addComponent(harga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keberangkatan)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sampai)
                    .addComponent(durasi)
                    .addComponent(awal)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 173, 133));
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bliFoodNavBtn.setText("BliFood");
        bliFoodNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bliFoodNavBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bliFoodNavBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        transaksiNavBtn.setText("Transaksi");
        transaksiNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiNavBtnActionPerformed(evt);
            }
        });
        getContentPane().add(transaksiNavBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        homeNavBtn.setText("Home");
        homeNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeNavBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeNavBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        ContainerPages.setBackground(new java.awt.Color(255, 204, 102));

        LoginPage.setBackground(new java.awt.Color(208, 231, 255));

        emailLabelLogin.setText("Email");

        passwordLabelLogin.setText("Password");

        masukBtnLogin.setBackground(new java.awt.Color(255, 204, 102));
        masukBtnLogin.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        masukBtnLogin.setText("Masuk");
        masukBtnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        masukBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukBtnLoginActionPerformed(evt);
            }
        });

        daftarBtnLogin.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        daftarBtnLogin.setForeground(new java.awt.Color(0, 0, 255));
        daftarBtnLogin.setText("Daftar");
        daftarBtnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        daftarBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarBtnLoginActionPerformed(evt);
            }
        });

        titleLabelHome1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 1, 18)); // NOI18N
        titleLabelHome1.setForeground(new java.awt.Color(0, 51, 204));
        titleLabelHome1.setText("BLI-Tiket");

        loginLabelLogin.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        loginLabelLogin.setText("LOGIN");

        javax.swing.GroupLayout LoginPageLayout = new javax.swing.GroupLayout(LoginPage);
        LoginPage.setLayout(LoginPageLayout);
        LoginPageLayout.setHorizontalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabelLogin)
                            .addComponent(passwordLabelLogin))
                        .addGap(29, 29, 29)
                        .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailFieldLogin)
                            .addComponent(passwordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(masukBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabelHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPageLayout.createSequentialGroup()
                        .addComponent(loginLabelLogin)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPageLayout.createSequentialGroup()
                        .addComponent(daftarBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        LoginPageLayout.setVerticalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabelHome1)
                .addGap(31, 31, 31)
                .addComponent(loginLabelLogin)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabelLogin))
                        .addGap(18, 18, 18)
                        .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabelLogin)
                            .addComponent(passwordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(masukBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(daftarBtnLogin)
                .addGap(19, 19, 19))
        );

        ContainerPages.addTab("Login", LoginPage);

        SignUpPage.setBackground(new java.awt.Color(208, 231, 255));

        emailLabelSignup.setText("Email");

        passwordLabelSignup.setText("Password");

        passwordFieldSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldSignUpActionPerformed(evt);
            }
        });

        teleponLabelSignIUp.setText("Telepon");

        namaLabelSignup.setText("Nama");

        daftarBtnSignUp.setBackground(new java.awt.Color(255, 204, 153));
        daftarBtnSignUp.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        daftarBtnSignUp.setText("Daftar");
        daftarBtnSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        daftarBtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarBtnSignUpActionPerformed(evt);
            }
        });

        signUpLabelSignUp.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        signUpLabelSignUp.setText("Sign UP");

        javax.swing.GroupLayout SignUpPageLayout = new javax.swing.GroupLayout(SignUpPage);
        SignUpPage.setLayout(SignUpPageLayout);
        SignUpPageLayout.setHorizontalGroup(
            SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPageLayout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpPageLayout.createSequentialGroup()
                        .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SignUpPageLayout.createSequentialGroup()
                                .addComponent(namaLabelSignup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(namaFieldSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SignUpPageLayout.createSequentialGroup()
                                .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabelSignup)
                                    .addComponent(passwordLabelSignup)
                                    .addComponent(teleponLabelSignIUp))
                                .addGap(29, 29, 29)
                                .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(teleponFieldSignUp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailFieldSignUp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordFieldSignUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)
                        .addComponent(daftarBtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpPageLayout.createSequentialGroup()
                        .addComponent(signUpLabelSignUp)
                        .addGap(281, 281, 281))))
        );
        SignUpPageLayout.setVerticalGroup(
            SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpPageLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(signUpLabelSignUp)
                .addGap(18, 18, 18)
                .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabelSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaFieldSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpPageLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SignUpPageLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(teleponLabelSignIUp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(teleponFieldSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SignUpPageLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(emailLabelSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailFieldSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SignUpPageLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(daftarBtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(SignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabelSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordFieldSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        ContainerPages.addTab("SignUp", SignUpPage);

        HomePage.setBackground(new java.awt.Color(208, 231, 255));

        titleLabelHome.setFont(new java.awt.Font("Source Sans Pro SemiBold", 1, 18)); // NOI18N
        titleLabelHome.setText("Selamat Datang di Aplikasi BLI-Tiket");

        awalListHome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Surabaya", "Sidoarjo", "Mojokerto", "Malang" ,"Pasuruan", "Lamongan"}));
        awalListHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awalListHomeActionPerformed(evt);
            }
        });
        awalListHome.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                awalListHomePropertyChange(evt);
            }
        });

        awalLabelHome.setText("Awal");

        tujuanLabelHome.setText("Tujuan");

        tujuanListHome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Surabaya", "Sidoarjo", "Mojokerto", "Malang","Pasuruan","Lamongan"}));
        tujuanListHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanListHomeActionPerformed(evt);
            }
        });

        tanggalLabelHome.setText("Tanggal Berangkat");

        penumpangLabelHome.setText("Jumlah Penumpang");

        penumpangSpinnerHome.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        penumpangSpinnerHome.setRequestFocusEnabled(false);

        cariTiketBtnHome.setBackground(new java.awt.Color(255, 204, 153));
        cariTiketBtnHome.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        cariTiketBtnHome.setText("Cari Tiket");
        cariTiketBtnHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cariTiketBtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariTiketBtnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(awalListHome, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(awalLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tujuanListHome, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tujuanLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tanggalLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(tglBerangkatDateHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(HomePageLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(penumpangLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HomePageLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(penumpangSpinnerHome)
                                .addGap(42, 42, 42))))
                    .addComponent(cariTiketBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleLabelHome)
                .addGap(18, 18, 18)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(awalLabelHome)
                            .addComponent(tujuanLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(awalListHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tujuanListHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penumpangLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tglBerangkatDateHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penumpangSpinnerHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(cariTiketBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        ContainerPages.addTab("Home", HomePage);

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        listJadwalPanelJadwalKedua.setBackground(new java.awt.Color(208, 231, 255));
        listJadwalPanelJadwalKedua.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        listJadwalPanelJadwalKedua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listJadwalPanelJadwalKeduaMouseClicked(evt);
            }
        });

        namaKeretaLabelJadwalKedua.setText("Nama Kereta");

        awalLabelJadwalKedua.setText("Awal");

        sampaiLabelJadwalKedua.setText("Sampai");

        durasiLabelJadwalKedua.setText("Durasi");

        hargaLabelJadwalKedua.setText("Harga");

        keberangkatanLabelJadwalKedua.setText("Keberangkatan");

        tujuanLabelJadwalKedua.setText("Tujuan");

        idTiketLabelJadwalKedua.setForeground(new java.awt.Color(208, 231, 255));
        idTiketLabelJadwalKedua.setText("Durasi");

        javax.swing.GroupLayout listJadwalPanelJadwalKeduaLayout = new javax.swing.GroupLayout(listJadwalPanelJadwalKedua);
        listJadwalPanelJadwalKedua.setLayout(listJadwalPanelJadwalKeduaLayout);
        listJadwalPanelJadwalKeduaLayout.setHorizontalGroup(
            listJadwalPanelJadwalKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listJadwalPanelJadwalKeduaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(listJadwalPanelJadwalKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listJadwalPanelJadwalKeduaLayout.createSequentialGroup()
                        .addComponent(namaKeretaLabelJadwalKedua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hargaLabelJadwalKedua))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listJadwalPanelJadwalKeduaLayout.createSequentialGroup()
                        .addGroup(listJadwalPanelJadwalKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listJadwalPanelJadwalKeduaLayout.createSequentialGroup()
                                .addComponent(keberangkatanLabelJadwalKedua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(listJadwalPanelJadwalKeduaLayout.createSequentialGroup()
                                .addComponent(awalLabelJadwalKedua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(durasiLabelJadwalKedua)
                                .addGap(62, 62, 62)))
                        .addComponent(idTiketLabelJadwalKedua)
                        .addGap(113, 113, 113)
                        .addGroup(listJadwalPanelJadwalKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tujuanLabelJadwalKedua)
                            .addComponent(sampaiLabelJadwalKedua))))
                .addGap(38, 38, 38))
        );
        listJadwalPanelJadwalKeduaLayout.setVerticalGroup(
            listJadwalPanelJadwalKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listJadwalPanelJadwalKeduaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listJadwalPanelJadwalKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKeretaLabelJadwalKedua)
                    .addComponent(hargaLabelJadwalKedua))
                .addGroup(listJadwalPanelJadwalKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listJadwalPanelJadwalKeduaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listJadwalPanelJadwalKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keberangkatanLabelJadwalKedua)
                            .addComponent(tujuanLabelJadwalKedua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(listJadwalPanelJadwalKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sampaiLabelJadwalKedua)
                            .addComponent(durasiLabelJadwalKedua)
                            .addComponent(awalLabelJadwalKedua)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listJadwalPanelJadwalKeduaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idTiketLabelJadwalKedua)
                        .addGap(14, 14, 14))))
        );

        jadwalKeretaApiLabelJadwal.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jadwalKeretaApiLabelJadwal.setForeground(new java.awt.Color(51, 51, 255));
        jadwalKeretaApiLabelJadwal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jadwalKeretaApiLabelJadwal.setText("Jadwal Kereta Api");

        listJadwalPanelJadwalKetiga.setBackground(new java.awt.Color(208, 231, 255));
        listJadwalPanelJadwalKetiga.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        listJadwalPanelJadwalKetiga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listJadwalPanelJadwalKetigaMouseClicked(evt);
            }
        });

        namaKeretaLabelJadwalKetiga.setText("Nama Kereta");

        awalLabelJadwalKetiga.setText("Awal");

        sampaiLabelJadwalKetiga.setText("Sampai");

        durasiLabelJadwalKetiga.setText("Durasi");

        hargaLabelJadwalKetiga.setText("Harga");

        keberangkatanLabelJadwalKetiga.setText("Keberangkatan");

        tujuanLabelJadwalKetiga.setText("Tujuan");

        idTiketLabelJadwalKetiga.setForeground(new java.awt.Color(208, 231, 255));
        idTiketLabelJadwalKetiga.setText("Durasi");

        javax.swing.GroupLayout listJadwalPanelJadwalKetigaLayout = new javax.swing.GroupLayout(listJadwalPanelJadwalKetiga);
        listJadwalPanelJadwalKetiga.setLayout(listJadwalPanelJadwalKetigaLayout);
        listJadwalPanelJadwalKetigaLayout.setHorizontalGroup(
            listJadwalPanelJadwalKetigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listJadwalPanelJadwalKetigaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(listJadwalPanelJadwalKetigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listJadwalPanelJadwalKetigaLayout.createSequentialGroup()
                        .addComponent(namaKeretaLabelJadwalKetiga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hargaLabelJadwalKetiga))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listJadwalPanelJadwalKetigaLayout.createSequentialGroup()
                        .addGroup(listJadwalPanelJadwalKetigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listJadwalPanelJadwalKetigaLayout.createSequentialGroup()
                                .addComponent(awalLabelJadwalKetiga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(durasiLabelJadwalKetiga)
                                .addGap(209, 209, 209))
                            .addGroup(listJadwalPanelJadwalKetigaLayout.createSequentialGroup()
                                .addComponent(keberangkatanLabelJadwalKetiga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idTiketLabelJadwalKetiga)
                                .addGap(137, 137, 137)))
                        .addGroup(listJadwalPanelJadwalKetigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tujuanLabelJadwalKetiga)
                            .addComponent(sampaiLabelJadwalKetiga))))
                .addGap(38, 38, 38))
        );
        listJadwalPanelJadwalKetigaLayout.setVerticalGroup(
            listJadwalPanelJadwalKetigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listJadwalPanelJadwalKetigaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listJadwalPanelJadwalKetigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKeretaLabelJadwalKetiga)
                    .addComponent(hargaLabelJadwalKetiga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listJadwalPanelJadwalKetigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keberangkatanLabelJadwalKetiga)
                    .addComponent(tujuanLabelJadwalKetiga)
                    .addComponent(idTiketLabelJadwalKetiga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listJadwalPanelJadwalKetigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sampaiLabelJadwalKetiga)
                    .addComponent(durasiLabelJadwalKetiga)
                    .addComponent(awalLabelJadwalKetiga)))
        );

        listJadwalPanelJadwalSatu.setBackground(new java.awt.Color(208, 231, 255));
        listJadwalPanelJadwalSatu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        listJadwalPanelJadwalSatu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listJadwalPanelJadwalSatuMouseClicked(evt);
            }
        });

        namaKeretaLabelJadwalSatu.setText("Nama Kereta");

        awalLabelJadwalSatu.setText("Awal");

        sampaiLabelJadwalSatu.setText("Sampai");

        durasiLabelJadwalSatu.setText("Durasi");

        hargaLabelJadwalSatu.setText("Harga");

        keberangkatanLabelJadwalSatu.setText("Keberangkatan");

        tujuanLabelJadwalSatu.setText("Tujuan");

        idTiketLabelJadwalSatu.setForeground(new java.awt.Color(208, 231, 255));
        idTiketLabelJadwalSatu.setText("Durasi");

        javax.swing.GroupLayout listJadwalPanelJadwalSatuLayout = new javax.swing.GroupLayout(listJadwalPanelJadwalSatu);
        listJadwalPanelJadwalSatu.setLayout(listJadwalPanelJadwalSatuLayout);
        listJadwalPanelJadwalSatuLayout.setHorizontalGroup(
            listJadwalPanelJadwalSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listJadwalPanelJadwalSatuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(listJadwalPanelJadwalSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listJadwalPanelJadwalSatuLayout.createSequentialGroup()
                        .addComponent(namaKeretaLabelJadwalSatu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hargaLabelJadwalSatu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listJadwalPanelJadwalSatuLayout.createSequentialGroup()
                        .addGroup(listJadwalPanelJadwalSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listJadwalPanelJadwalSatuLayout.createSequentialGroup()
                                .addComponent(awalLabelJadwalSatu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                                .addComponent(durasiLabelJadwalSatu)
                                .addGap(210, 210, 210))
                            .addGroup(listJadwalPanelJadwalSatuLayout.createSequentialGroup()
                                .addComponent(keberangkatanLabelJadwalSatu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idTiketLabelJadwalSatu)
                                .addGap(115, 115, 115)))
                        .addGroup(listJadwalPanelJadwalSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tujuanLabelJadwalSatu)
                            .addComponent(sampaiLabelJadwalSatu))))
                .addGap(38, 38, 38))
        );
        listJadwalPanelJadwalSatuLayout.setVerticalGroup(
            listJadwalPanelJadwalSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listJadwalPanelJadwalSatuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listJadwalPanelJadwalSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKeretaLabelJadwalSatu)
                    .addComponent(hargaLabelJadwalSatu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listJadwalPanelJadwalSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keberangkatanLabelJadwalSatu)
                    .addComponent(tujuanLabelJadwalSatu)
                    .addComponent(idTiketLabelJadwalSatu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listJadwalPanelJadwalSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sampaiLabelJadwalSatu)
                    .addComponent(durasiLabelJadwalSatu)
                    .addComponent(awalLabelJadwalSatu)))
        );

        kembaliBtnJadwal.setBackground(new java.awt.Color(153, 204, 255));
        kembaliBtnJadwal.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        kembaliBtnJadwal.setText("Kembali");
        kembaliBtnJadwal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kembaliBtnJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBtnJadwalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(listJadwalPanelJadwalKedua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listJadwalPanelJadwalKetiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listJadwalPanelJadwalSatu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jadwalKeretaApiLabelJadwal))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(kembaliBtnJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jadwalKeretaApiLabelJadwal)
                .addGap(18, 18, 18)
                .addComponent(listJadwalPanelJadwalSatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listJadwalPanelJadwalKedua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listJadwalPanelJadwalKetiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kembaliBtnJadwal)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel7);

        javax.swing.GroupLayout JadwalPageLayout = new javax.swing.GroupLayout(JadwalPage);
        JadwalPage.setLayout(JadwalPageLayout);
        JadwalPageLayout.setHorizontalGroup(
            JadwalPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        JadwalPageLayout.setVerticalGroup(
            JadwalPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );

        ContainerPages.addTab("Jadwal", JadwalPage);

        PesanTiketPage.setBackground(new java.awt.Color(255, 255, 255));

        tiketPanelPesanTiket.setBackground(new java.awt.Color(219, 237, 255));
        tiketPanelPesanTiket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tglTiketLabelPesanTiket.setText("tanggal_tiket");

        destinasiAwalLabelPesanTiket.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        destinasiAwalLabelPesanTiket.setForeground(new java.awt.Color(51, 51, 255));
        destinasiAwalLabelPesanTiket.setText("Destinasi Awal");

        awalLabelPesanTiket.setText("awal");

        namaKeretaLabelPesanTiket.setText("nama_kereta");

        destinasiAkhirLabelPesanTiket.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        destinasiAkhirLabelPesanTiket.setForeground(new java.awt.Color(51, 51, 255));
        destinasiAkhirLabelPesanTiket.setText("Destinasi Tujuan");

        strip.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        strip.setForeground(new java.awt.Color(51, 51, 255));
        strip.setText("      -");

        akhirLabelPesanTiket.setText("akhir");

        penumpangLabelPesanTiket.setText("Penumpang");

        javax.swing.GroupLayout tiketPanelPesanTiketLayout = new javax.swing.GroupLayout(tiketPanelPesanTiket);
        tiketPanelPesanTiket.setLayout(tiketPanelPesanTiketLayout);
        tiketPanelPesanTiketLayout.setHorizontalGroup(
            tiketPanelPesanTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tiketPanelPesanTiketLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(tiketPanelPesanTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tiketPanelPesanTiketLayout.createSequentialGroup()
                        .addComponent(destinasiAwalLabelPesanTiket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(strip, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(destinasiAkhirLabelPesanTiket))
                    .addGroup(tiketPanelPesanTiketLayout.createSequentialGroup()
                        .addComponent(awalLabelPesanTiket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(akhirLabelPesanTiket))
                    .addGroup(tiketPanelPesanTiketLayout.createSequentialGroup()
                        .addComponent(tglTiketLabelPesanTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tiketPanelPesanTiketLayout.createSequentialGroup()
                        .addComponent(namaKeretaLabelPesanTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(penumpangLabelPesanTiket)))
                .addContainerGap())
        );
        tiketPanelPesanTiketLayout.setVerticalGroup(
            tiketPanelPesanTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tiketPanelPesanTiketLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tglTiketLabelPesanTiket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tiketPanelPesanTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinasiAwalLabelPesanTiket)
                    .addComponent(destinasiAkhirLabelPesanTiket)
                    .addComponent(strip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tiketPanelPesanTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(awalLabelPesanTiket)
                    .addComponent(akhirLabelPesanTiket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tiketPanelPesanTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKeretaLabelPesanTiket)
                    .addComponent(penumpangLabelPesanTiket))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 224, 194));
        jButton1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton1.setText("Pilih Kursi");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("DETAIL TIKET");

        javax.swing.GroupLayout PesanTiketPageLayout = new javax.swing.GroupLayout(PesanTiketPage);
        PesanTiketPage.setLayout(PesanTiketPageLayout);
        PesanTiketPageLayout.setHorizontalGroup(
            PesanTiketPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesanTiketPageLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(PesanTiketPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesanTiketPageLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesanTiketPageLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesanTiketPageLayout.createSequentialGroup()
                        .addComponent(tiketPanelPesanTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );
        PesanTiketPageLayout.setVerticalGroup(
            PesanTiketPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesanTiketPageLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiketPanelPesanTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        ContainerPages.addTab("PesanTiket", PesanTiketPage);

        PilihKursiPage.setBackground(new java.awt.Color(255, 255, 255));

        gerbongPilihKursi.setBackground(new java.awt.Color(153, 204, 255));
        gerbongPilihKursi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jRadioButton1.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton1.setText("1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        gerbongLabelPilihKursi.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        gerbongLabelPilihKursi.setText("Gerbong 1");

        jRadioButton2.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton2.setText("3");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton3.setText("4");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton7.setText("2");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton8.setText("5");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton9.setText("7");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton10.setText("8");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jRadioButton11.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton11.setText("6");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jRadioButton12.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton12.setText("9");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        jRadioButton15.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton15.setText("10");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        jRadioButton16.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton16.setText("13");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });

        jRadioButton17.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton17.setText("15");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });

        jRadioButton18.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton18.setText("16");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });

        jRadioButton19.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton19.setText("14");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        jRadioButton20.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton20.setText("17");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        jRadioButton21.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton21.setText("19");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });

        jRadioButton22.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton22.setText("20");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });

        jRadioButton23.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton23.setText("18");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });

        jRadioButton24.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton24.setText("21");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });

        jRadioButton25.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton25.setText("23");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });

        jRadioButton26.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton26.setText("24");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });

        jRadioButton27.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton27.setText("22");
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });

        jRadioButton28.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton28.setText("12");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });

        jRadioButton29.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton29.setText("11");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gerbongPilihKursiLayout = new javax.swing.GroupLayout(gerbongPilihKursi);
        gerbongPilihKursi.setLayout(gerbongPilihKursiLayout);
        gerbongPilihKursiLayout.setHorizontalGroup(
            gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jRadioButton29))
                .addGap(18, 18, 18)
                .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton15)
                    .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton7)
                        .addComponent(jRadioButton11)
                        .addComponent(jRadioButton3))
                    .addComponent(jRadioButton28))
                .addGap(88, 88, 88)
                .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                        .addComponent(jRadioButton20)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton23))
                    .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                        .addComponent(jRadioButton21)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton22))
                    .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                        .addComponent(jRadioButton24)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton27))
                    .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                        .addComponent(jRadioButton25)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton26))
                    .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                        .addComponent(jRadioButton16)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton19))
                    .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                        .addComponent(jRadioButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton18)))
                .addGap(57, 57, 57))
            .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(gerbongLabelPilihKursi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gerbongPilihKursiLayout.setVerticalGroup(
            gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(gerbongLabelPilihKursi)
                .addGap(19, 19, 19)
                .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3))
                        .addGap(18, 18, 18)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton10))
                        .addGap(18, 18, 18)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton12)
                            .addComponent(jRadioButton15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton28)
                            .addComponent(jRadioButton29)))
                    .addGroup(gerbongPilihKursiLayout.createSequentialGroup()
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton16)
                            .addComponent(jRadioButton19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton17)
                            .addComponent(jRadioButton18))
                        .addGap(18, 18, 18)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton20)
                            .addComponent(jRadioButton23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton21)
                            .addComponent(jRadioButton22))
                        .addGap(18, 18, 18)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton24)
                            .addComponent(jRadioButton27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gerbongPilihKursiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton25)
                            .addComponent(jRadioButton26))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pilihGerbongComboPilihKursi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerbong 1", "Gerbong 2", "Gerbong 3", "Gerbong 4" }));
        pilihGerbongComboPilihKursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihGerbongComboPilihKursiActionPerformed(evt);
            }
        });

        pesanBtnPilihKursi.setBackground(new java.awt.Color(255, 204, 153));
        pesanBtnPilihKursi.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        pesanBtnPilihKursi.setText("Pesan");
        pesanBtnPilihKursi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pesanBtnPilihKursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanBtnPilihKursiActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("Pilih Kursi");

        jLabel19.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel19.setText("Pilih Gerbong");

        javax.swing.GroupLayout PilihKursiPageLayout = new javax.swing.GroupLayout(PilihKursiPage);
        PilihKursiPage.setLayout(PilihKursiPageLayout);
        PilihKursiPageLayout.setHorizontalGroup(
            PilihKursiPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PilihKursiPageLayout.createSequentialGroup()
                .addGroup(PilihKursiPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PilihKursiPageLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(PilihKursiPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(pilihGerbongComboPilihKursi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesanBtnPilihKursi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PilihKursiPageLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(gerbongPilihKursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PilihKursiPageLayout.setVerticalGroup(
            PilihKursiPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PilihKursiPageLayout.createSequentialGroup()
                .addComponent(gerbongPilihKursi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PilihKursiPageLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addGap(55, 55, 55)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pilihGerbongComboPilihKursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesanBtnPilihKursi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ContainerPages.addTab("PilihKursi", PilihKursiPage);

        DetailPembayaranPage.setBackground(new java.awt.Color(255, 255, 255));

        detailPanelDetailPembayaran.setBackground(new java.awt.Color(208, 231, 255));
        detailPanelDetailPembayaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Awal");

        jLabel9.setText("Tujuan");

        jLabel10.setText("Tanggal");

        jLabel11.setText("Nama Kereta");

        jLabel12.setText("Gerbong");

        javax.swing.GroupLayout detailPanelDetailPembayaranLayout = new javax.swing.GroupLayout(detailPanelDetailPembayaran);
        detailPanelDetailPembayaran.setLayout(detailPanelDetailPembayaranLayout);
        detailPanelDetailPembayaranLayout.setHorizontalGroup(
            detailPanelDetailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelDetailPembayaranLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(detailPanelDetailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPanelDetailPembayaranLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(detailPanelDetailPembayaranLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelDetailPembayaranLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        detailPanelDetailPembayaranLayout.setVerticalGroup(
            detailPanelDetailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelDetailPembayaranLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(detailPanelDetailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(detailPanelDetailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        metodePembayaranComboDetailPembayaran.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        metodePembayaranComboDetailPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BliPay", "Transfer Bank", "Alfamart", "Indomaret" }));

        totalHargaDetailPembayaran.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        totalHargaDetailPembayaran.setText("Total Harga");

        metodePembayaranLabelDetailPembayaran.setText("Metode Pembayaran");

        detailPembayaranLabelDetailPembayaran.setText("Detail Pembayaran");

        hargaTiketLabelDetailPembayaran.setText("Harga Tiket");

        penumpangLabelDetailPembayaran.setText("Penumpang");

        angkaPenumpangLabelDetailPembayaran.setText("2");

        bayarBtnDetailPembayaran.setBackground(new java.awt.Color(255, 204, 153));
        bayarBtnDetailPembayaran.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bayarBtnDetailPembayaran.setText("Bayar");
        bayarBtnDetailPembayaran.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bayarBtnDetailPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarBtnDetailPembayaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DetailPembayaranPageLayout = new javax.swing.GroupLayout(DetailPembayaranPage);
        DetailPembayaranPage.setLayout(DetailPembayaranPageLayout);
        DetailPembayaranPageLayout.setHorizontalGroup(
            DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailPembayaranPageLayout.createSequentialGroup()
                .addGroup(DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bayarBtnDetailPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(DetailPembayaranPageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(penumpangLabelDetailPembayaran)
                            .addGap(80, 80, 80)
                            .addComponent(angkaPenumpangLabelDetailPembayaran))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DetailPembayaranPageLayout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addGroup(DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(totalHargaDetailPembayaran)
                                .addComponent(detailPanelDetailPembayaran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(DetailPembayaranPageLayout.createSequentialGroup()
                                    .addGroup(DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(metodePembayaranLabelDetailPembayaran)
                                        .addComponent(detailPembayaranLabelDetailPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(metodePembayaranComboDetailPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hargaTiketLabelDetailPembayaran)))))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        DetailPembayaranPageLayout.setVerticalGroup(
            DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailPembayaranPageLayout.createSequentialGroup()
                .addComponent(detailPanelDetailPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metodePembayaranComboDetailPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metodePembayaranLabelDetailPembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailPembayaranLabelDetailPembayaran)
                    .addComponent(hargaTiketLabelDetailPembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetailPembayaranPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penumpangLabelDetailPembayaran)
                    .addComponent(angkaPenumpangLabelDetailPembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalHargaDetailPembayaran)
                .addGap(18, 18, 18)
                .addComponent(bayarBtnDetailPembayaran)
                .addGap(43, 43, 43))
        );

        ContainerPages.addTab("DetailPembayaran", DetailPembayaranPage);

        FinalPembayaran.setBackground(new java.awt.Color(208, 231, 255));

        jLabel17.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel17.setText("Pembayaran Sukses!");

        jPanel1.setBackground(new java.awt.Color(255, 248, 239));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setText("ID Invoice");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel6.setText("ID_AKUN");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel7.setText("Nama");

        jLabel20.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel20.setText("Nama Kereta");

        jLabel21.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel21.setText("Asal");

        jLabel22.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel22.setText("Tujuan");

        jLabel23.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel23.setText("Total Harga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel6)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(255, 204, 153));
        jButton2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jButton2.setText("Home");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FinalPembayaranLayout = new javax.swing.GroupLayout(FinalPembayaran);
        FinalPembayaran.setLayout(FinalPembayaranLayout);
        FinalPembayaranLayout.setHorizontalGroup(
            FinalPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalPembayaranLayout.createSequentialGroup()
                .addGroup(FinalPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FinalPembayaranLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel17))
                    .addGroup(FinalPembayaranLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FinalPembayaranLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        FinalPembayaranLayout.setVerticalGroup(
            FinalPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalPembayaranLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        ContainerPages.addTab("FinalPm", FinalPembayaran);

        PesanMakananPage.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(208, 231, 255));

        MakananPanelPesanMakanan.setBackground(new java.awt.Color(255, 204, 153));
        MakananPanelPesanMakanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MakananPanelPesanMakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MakananPanelPesanMakananMouseClicked(evt);
            }
        });
        MakananPanelPesanMakanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMakananLabelPesanMakanan1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMakananLabelPesanMakanan1.setText("Nama Makanan");
        MakananPanelPesanMakanan.add(namaMakananLabelPesanMakanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMakananLabelPesanMakanan1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMakananLabelPesanMakanan1.setText("Harga");
        MakananPanelPesanMakanan.add(hargaMakananLabelPesanMakanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 21, 43, -1));

        spinnerMakananPesanMakanan1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MakananPanelPesanMakanan.add(spinnerMakananPesanMakanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        bliFoodLabelPesanMakanan.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        bliFoodLabelPesanMakanan.setForeground(new java.awt.Color(51, 51, 255));
        bliFoodLabelPesanMakanan.setText("Bli-Food");

        MinumanPanelPesanMakanan1.setBackground(new java.awt.Color(255, 204, 153));
        MinumanPanelPesanMakanan1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MinumanPanelPesanMakanan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMinumanLabelPesanMakanan1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMinumanLabelPesanMakanan1.setText("Nama Minuman");
        MinumanPanelPesanMakanan1.add(namaMinumanLabelPesanMakanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMinumanLabelPesanMakanan1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMinumanLabelPesanMakanan1.setText("Harga");
        MinumanPanelPesanMakanan1.add(hargaMinumanLabelPesanMakanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 21, 43, -1));

        spinnerMinumanPesanMakanan1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MinumanPanelPesanMakanan1.add(spinnerMinumanPesanMakanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        MinumanPanelPesanMakanan3.setBackground(new java.awt.Color(255, 204, 153));
        MinumanPanelPesanMakanan3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MinumanPanelPesanMakanan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMinumanLabelPesanMakanan2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMinumanLabelPesanMakanan2.setText("Nama Minuman");
        MinumanPanelPesanMakanan3.add(namaMinumanLabelPesanMakanan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMinumanLabelPesanMakanan2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMinumanLabelPesanMakanan2.setText("Harga");
        MinumanPanelPesanMakanan3.add(hargaMinumanLabelPesanMakanan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 21, 43, -1));

        spinnerMinumanPesanMakanan2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MinumanPanelPesanMakanan3.add(spinnerMinumanPesanMakanan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        MakananPanelPesanMakanan2.setBackground(new java.awt.Color(255, 204, 153));
        MakananPanelPesanMakanan2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MakananPanelPesanMakanan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMakananLabelPesanMakanan2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMakananLabelPesanMakanan2.setText("Nama Makanan");
        MakananPanelPesanMakanan2.add(namaMakananLabelPesanMakanan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMakananLabelPesanMakanan2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMakananLabelPesanMakanan2.setText("Harga");
        MakananPanelPesanMakanan2.add(hargaMakananLabelPesanMakanan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 21, 43, -1));

        spinnerMakananPesanMakanan2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MakananPanelPesanMakanan2.add(spinnerMakananPesanMakanan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        MakananPanelPesanMakanan3.setBackground(new java.awt.Color(255, 204, 153));
        MakananPanelPesanMakanan3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MakananPanelPesanMakanan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMakananLabelPesanMakanan3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMakananLabelPesanMakanan3.setText("Nama Makanan");
        MakananPanelPesanMakanan3.add(namaMakananLabelPesanMakanan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMakananLabelPesanMakanan3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMakananLabelPesanMakanan3.setText("Harga");
        MakananPanelPesanMakanan3.add(hargaMakananLabelPesanMakanan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 21, 43, -1));

        spinnerMakananPesanMakanan4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MakananPanelPesanMakanan3.add(spinnerMakananPesanMakanan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        MinumanPanelPesanMakanan4.setBackground(new java.awt.Color(255, 204, 153));
        MinumanPanelPesanMakanan4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MinumanPanelPesanMakanan4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMinumanLabelPesanMakanan3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMinumanLabelPesanMakanan3.setText("Nama Minuman");
        MinumanPanelPesanMakanan4.add(namaMinumanLabelPesanMakanan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMinumanLabelPesanMakanan3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMinumanLabelPesanMakanan3.setText("Harga");
        MinumanPanelPesanMakanan4.add(hargaMinumanLabelPesanMakanan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 21, 43, -1));

        spinnerMinumanPesanMakanan4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MinumanPanelPesanMakanan4.add(spinnerMinumanPesanMakanan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        MinumanPanelPesanMakanan5.setBackground(new java.awt.Color(255, 204, 153));
        MinumanPanelPesanMakanan5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MinumanPanelPesanMakanan5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMinumanLabelPesanMakanan4.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMinumanLabelPesanMakanan4.setText("Nama Minuman");
        MinumanPanelPesanMakanan5.add(namaMinumanLabelPesanMakanan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMinumanLabelPesanMakanan4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMinumanLabelPesanMakanan4.setText("Harga");
        MinumanPanelPesanMakanan5.add(hargaMinumanLabelPesanMakanan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 21, 43, -1));

        spinnerMinumanPesanMakanan3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MinumanPanelPesanMakanan5.add(spinnerMinumanPesanMakanan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        MakananPanelPesanMakanan4.setBackground(new java.awt.Color(255, 204, 153));
        MakananPanelPesanMakanan4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MakananPanelPesanMakanan4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMakananLabelPesanMakanan4.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMakananLabelPesanMakanan4.setText("Nama Makanan");
        MakananPanelPesanMakanan4.add(namaMakananLabelPesanMakanan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMakananLabelPesanMakanan4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMakananLabelPesanMakanan4.setText("Harga");
        MakananPanelPesanMakanan4.add(hargaMakananLabelPesanMakanan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 21, 43, -1));

        spinnerMakananPesanMakanan3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MakananPanelPesanMakanan4.add(spinnerMakananPesanMakanan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        MinumanPanelPesanMakanan6.setBackground(new java.awt.Color(255, 204, 153));
        MinumanPanelPesanMakanan6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MinumanPanelPesanMakanan6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMinumanLabelPesanMakanan5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMinumanLabelPesanMakanan5.setText("Nama Minuman");
        MinumanPanelPesanMakanan6.add(namaMinumanLabelPesanMakanan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMinumanLabelPesanMakanan5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMinumanLabelPesanMakanan5.setText("Harga");
        MinumanPanelPesanMakanan6.add(hargaMinumanLabelPesanMakanan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 21, 43, -1));

        spinnerMinumanPesanMakanan5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MinumanPanelPesanMakanan6.add(spinnerMinumanPesanMakanan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        MakananPanelPesanMakanan5.setBackground(new java.awt.Color(255, 204, 153));
        MakananPanelPesanMakanan5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MakananPanelPesanMakanan5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaMakananLabelPesanMakanan5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        namaMakananLabelPesanMakanan5.setText("Nama Makanan");
        MakananPanelPesanMakanan5.add(namaMakananLabelPesanMakanan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        hargaMakananLabelPesanMakanan5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaMakananLabelPesanMakanan5.setText("Harga");
        MakananPanelPesanMakanan5.add(hargaMakananLabelPesanMakanan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 21, 43, -1));

        spinnerMakananPesanMakanan5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        MakananPanelPesanMakanan5.add(spinnerMakananPesanMakanan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, 90, -1));

        pesanBtnPesanMakanan.setBackground(new java.awt.Color(153, 204, 255));
        pesanBtnPesanMakanan.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        pesanBtnPesanMakanan.setForeground(new java.awt.Color(51, 51, 255));
        pesanBtnPesanMakanan.setText("Pesan");
        pesanBtnPesanMakanan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pesanBtnPesanMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanBtnPesanMakananActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(bliFoodLabelPesanMakanan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MakananPanelPesanMakanan5, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(MakananPanelPesanMakanan3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MakananPanelPesanMakanan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MakananPanelPesanMakanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MakananPanelPesanMakanan4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MinumanPanelPesanMakanan1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(MinumanPanelPesanMakanan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MinumanPanelPesanMakanan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MinumanPanelPesanMakanan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MinumanPanelPesanMakanan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(pesanBtnPesanMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1198, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bliFoodLabelPesanMakanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MakananPanelPesanMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(MinumanPanelPesanMakanan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MinumanPanelPesanMakanan3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(MakananPanelPesanMakanan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MinumanPanelPesanMakanan5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(MakananPanelPesanMakanan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MakananPanelPesanMakanan3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(MinumanPanelPesanMakanan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MakananPanelPesanMakanan5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(MinumanPanelPesanMakanan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(pesanBtnPesanMakanan)
                .addGap(21, 21, 21))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout PesanMakananPageLayout = new javax.swing.GroupLayout(PesanMakananPage);
        PesanMakananPage.setLayout(PesanMakananPageLayout);
        PesanMakananPageLayout.setHorizontalGroup(
            PesanMakananPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        PesanMakananPageLayout.setVerticalGroup(
            PesanMakananPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );

        ContainerPages.addTab("PesanMakanan", PesanMakananPage);

        FinalMakananPage.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setToolTipText("");
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(208, 231, 255));

        listMakananPanelFinalMakanan.setBackground(new java.awt.Color(255, 225, 196));
        listMakananPanelFinalMakanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        namaLabelFinalMakanan1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan1.setText("Nama");

        totalHargaLabelFinalMakanan.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        totalHargaLabelFinalMakanan.setText("Total Harga");

        namaLabelFinalMakanan2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan2.setText("Nama");

        namaLabelFinalMakanan3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan3.setText("Nama");

        namaLabelFinalMakanan4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan4.setText("Nama");

        namaLabelFinalMakanan5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan5.setText("Nama");

        namaLabelFinalMakanan6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan6.setText("Nama");

        namaLabelFinalMakanan7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan7.setText("Nama");

        namaLabelFinalMakanan8.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan8.setText("Nama");

        namaLabelFinalMakanan9.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan9.setText("Nama");

        namaLabelFinalMakanan10.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        namaLabelFinalMakanan10.setText("Nama");

        jumlahLabelFinalMakanan1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan1.setText("Jumlah");

        jumlahLabelFinalMakanan2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan2.setText("Jumlah");

        jumlahLabelFinalMakanan3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan3.setText("Jumlah");

        jumlahLabelFinalMakanan4.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan4.setText("Jumlah");

        jumlahLabelFinalMakanan5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan5.setText("Jumlah");

        jumlahLabelFinalMakanan6.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan6.setText("Jumlah");

        jumlahLabelFinalMakanan7.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan7.setText("Jumlah");

        jumlahLabelFinalMakanan8.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan8.setText("Jumlah");

        jumlahLabelFinalMakanan9.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan9.setText("Jumlah");

        jumlahLabelFinalMakanan10.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jumlahLabelFinalMakanan10.setText("Jumlah");

        hargaLabelFinalMakanan1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan1.setText("Harga");

        hargaLabelFinalMakanan2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan2.setText("Harga");

        hargaLabelFinalMakanan3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan3.setText("Harga");

        hargaLabelFinalMakanan4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan4.setText("Harga");

        hargaLabelFinalMakanan5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan5.setText("Harga");

        hargaLabelFinalMakanan6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan6.setText("Harga");

        hargaLabelFinalMakanan7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan7.setText("Harga");

        hargaLabelFinalMakanan8.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan8.setText("Harga");

        hargaLabelFinalMakanan9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan9.setText("Harga");

        hargaLabelFinalMakanan10.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        hargaLabelFinalMakanan10.setText("Harga");

        javax.swing.GroupLayout listMakananPanelFinalMakananLayout = new javax.swing.GroupLayout(listMakananPanelFinalMakanan);
        listMakananPanelFinalMakanan.setLayout(listMakananPanelFinalMakananLayout);
        listMakananPanelFinalMakananLayout.setHorizontalGroup(
            listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listMakananPanelFinalMakananLayout.createSequentialGroup()
                .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                .addComponent(namaLabelFinalMakanan1)
                                .addGap(18, 18, 18)
                                .addComponent(jumlahLabelFinalMakanan1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hargaLabelFinalMakanan1))
                            .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                .addComponent(namaLabelFinalMakanan3)
                                .addGap(18, 18, 18)
                                .addComponent(jumlahLabelFinalMakanan3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hargaLabelFinalMakanan3))
                            .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                .addComponent(namaLabelFinalMakanan2)
                                .addGap(18, 18, 18)
                                .addComponent(jumlahLabelFinalMakanan2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hargaLabelFinalMakanan2))
                            .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                        .addComponent(namaLabelFinalMakanan10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jumlahLabelFinalMakanan10))
                                    .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                        .addComponent(namaLabelFinalMakanan9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jumlahLabelFinalMakanan9))
                                    .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                        .addComponent(namaLabelFinalMakanan8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jumlahLabelFinalMakanan8))
                                    .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                        .addComponent(namaLabelFinalMakanan7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jumlahLabelFinalMakanan7))
                                    .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                        .addComponent(namaLabelFinalMakanan6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jumlahLabelFinalMakanan6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargaLabelFinalMakanan10)
                                    .addComponent(hargaLabelFinalMakanan8)
                                    .addComponent(hargaLabelFinalMakanan9)
                                    .addComponent(hargaLabelFinalMakanan7)
                                    .addComponent(hargaLabelFinalMakanan6)))
                            .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                .addComponent(namaLabelFinalMakanan4)
                                .addGap(18, 18, 18)
                                .addComponent(jumlahLabelFinalMakanan4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hargaLabelFinalMakanan4))
                            .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                                .addComponent(namaLabelFinalMakanan5)
                                .addGap(18, 18, 18)
                                .addComponent(jumlahLabelFinalMakanan5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hargaLabelFinalMakanan5))))
                    .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalHargaLabelFinalMakanan)))
                .addGap(25, 25, 25))
        );
        listMakananPanelFinalMakananLayout.setVerticalGroup(
            listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listMakananPanelFinalMakananLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabelFinalMakanan1)
                    .addComponent(jumlahLabelFinalMakanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaLabelFinalMakanan1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabelFinalMakanan2)
                    .addComponent(jumlahLabelFinalMakanan2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaLabelFinalMakanan2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabelFinalMakanan3)
                    .addComponent(jumlahLabelFinalMakanan3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaLabelFinalMakanan3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabelFinalMakanan4)
                    .addComponent(jumlahLabelFinalMakanan4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaLabelFinalMakanan4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabelFinalMakanan5)
                    .addComponent(jumlahLabelFinalMakanan5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaLabelFinalMakanan5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                        .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaLabelFinalMakanan6)
                            .addComponent(jumlahLabelFinalMakanan6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaLabelFinalMakanan7)
                            .addComponent(jumlahLabelFinalMakanan7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaLabelFinalMakanan8)
                            .addComponent(jumlahLabelFinalMakanan8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaLabelFinalMakanan9)
                            .addComponent(jumlahLabelFinalMakanan9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listMakananPanelFinalMakananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaLabelFinalMakanan10)
                            .addComponent(jumlahLabelFinalMakanan10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(listMakananPanelFinalMakananLayout.createSequentialGroup()
                        .addComponent(hargaLabelFinalMakanan10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargaLabelFinalMakanan9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargaLabelFinalMakanan8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargaLabelFinalMakanan7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargaLabelFinalMakanan6)))
                .addGap(18, 18, 18)
                .addComponent(totalHargaLabelFinalMakanan)
                .addGap(27, 27, 27))
        );

        metodePembayaranLabelFinalMakanan.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        metodePembayaranLabelFinalMakanan.setText("Metode Pembayaran");

        metodeBayarComboFinalMakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bli-Pay", "Cash"}));

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton4.setText("Bayar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(listMakananPanelFinalMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(metodePembayaranLabelFinalMakanan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                            .addComponent(metodeBayarComboFinalMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(listMakananPanelFinalMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metodePembayaranLabelFinalMakanan)
                    .addComponent(metodeBayarComboFinalMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel3);

        javax.swing.GroupLayout FinalMakananPageLayout = new javax.swing.GroupLayout(FinalMakananPage);
        FinalMakananPage.setLayout(FinalMakananPageLayout);
        FinalMakananPageLayout.setHorizontalGroup(
            FinalMakananPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        FinalMakananPageLayout.setVerticalGroup(
            FinalMakananPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );

        ContainerPages.addTab("FinalMakanan", FinalMakananPage);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(208, 231, 255));

        listPanelTransaksi2.setBackground(new java.awt.Color(255, 225, 196));
        listPanelTransaksi2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        invoiceLabelTransaksi2.setText("ID INVOICE");

        hargaLabelTransaksi2.setText("Harga");

        namaKeretaLabelTransaksi2.setText("Nama Kereta");

        awalLabelTransaksi2.setText("Awal");

        tujuanLabelTujuan2.setText("Tujuan");

        javax.swing.GroupLayout listPanelTransaksi2Layout = new javax.swing.GroupLayout(listPanelTransaksi2);
        listPanelTransaksi2.setLayout(listPanelTransaksi2Layout);
        listPanelTransaksi2Layout.setHorizontalGroup(
            listPanelTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelTransaksi2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(listPanelTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listPanelTransaksi2Layout.createSequentialGroup()
                        .addComponent(namaKeretaLabelTransaksi2)
                        .addGap(56, 56, 56)
                        .addComponent(awalLabelTransaksi2)
                        .addGap(51, 51, 51)
                        .addComponent(tujuanLabelTujuan2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(hargaLabelTransaksi2)
                        .addGap(35, 35, 35))
                    .addGroup(listPanelTransaksi2Layout.createSequentialGroup()
                        .addComponent(invoiceLabelTransaksi2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        listPanelTransaksi2Layout.setVerticalGroup(
            listPanelTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelTransaksi2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(invoiceLabelTransaksi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listPanelTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabelTransaksi2)
                    .addComponent(namaKeretaLabelTransaksi2)
                    .addComponent(awalLabelTransaksi2)
                    .addComponent(tujuanLabelTujuan2))
                .addContainerGap())
        );

        riwayatTransaksiLabelTransaksi1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        riwayatTransaksiLabelTransaksi1.setForeground(new java.awt.Color(51, 51, 255));
        riwayatTransaksiLabelTransaksi1.setText("RIWAYAT TRANSAKSI");

        listPanelTransaksi3.setBackground(new java.awt.Color(255, 225, 196));
        listPanelTransaksi3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        invoiceLabelTransaksi3.setText("ID INVOICE");

        hargaLabelTransaksi3.setText("Harga");

        namaKeretaLabelTransaksi3.setText("Nama Kereta");

        awalLabelTransaksi3.setText("Awal");

        tujuanLabelTujuan3.setText("Tujuan");

        javax.swing.GroupLayout listPanelTransaksi3Layout = new javax.swing.GroupLayout(listPanelTransaksi3);
        listPanelTransaksi3.setLayout(listPanelTransaksi3Layout);
        listPanelTransaksi3Layout.setHorizontalGroup(
            listPanelTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelTransaksi3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(listPanelTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listPanelTransaksi3Layout.createSequentialGroup()
                        .addComponent(namaKeretaLabelTransaksi3)
                        .addGap(56, 56, 56)
                        .addComponent(awalLabelTransaksi3)
                        .addGap(51, 51, 51)
                        .addComponent(tujuanLabelTujuan3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hargaLabelTransaksi3)
                        .addGap(35, 35, 35))
                    .addGroup(listPanelTransaksi3Layout.createSequentialGroup()
                        .addComponent(invoiceLabelTransaksi3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        listPanelTransaksi3Layout.setVerticalGroup(
            listPanelTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelTransaksi3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(invoiceLabelTransaksi3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listPanelTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabelTransaksi3)
                    .addComponent(namaKeretaLabelTransaksi3)
                    .addComponent(awalLabelTransaksi3)
                    .addComponent(tujuanLabelTujuan3))
                .addContainerGap())
        );

        listPanelTransaksi5.setBackground(new java.awt.Color(255, 225, 196));
        listPanelTransaksi5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        invoiceLabelTransaksi5.setText("ID INVOICE");

        hargaLabelTransaksi5.setText("Harga");

        namaKeretaLabelTransaksi5.setText("Nama Kereta");

        awalLabelTransaksi5.setText("Awal");

        tujuanLabelTujuan5.setText("Tujuan");

        javax.swing.GroupLayout listPanelTransaksi5Layout = new javax.swing.GroupLayout(listPanelTransaksi5);
        listPanelTransaksi5.setLayout(listPanelTransaksi5Layout);
        listPanelTransaksi5Layout.setHorizontalGroup(
            listPanelTransaksi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelTransaksi5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(listPanelTransaksi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listPanelTransaksi5Layout.createSequentialGroup()
                        .addComponent(namaKeretaLabelTransaksi5)
                        .addGap(56, 56, 56)
                        .addComponent(awalLabelTransaksi5)
                        .addGap(51, 51, 51)
                        .addComponent(tujuanLabelTujuan5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hargaLabelTransaksi5)
                        .addGap(35, 35, 35))
                    .addGroup(listPanelTransaksi5Layout.createSequentialGroup()
                        .addComponent(invoiceLabelTransaksi5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        listPanelTransaksi5Layout.setVerticalGroup(
            listPanelTransaksi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelTransaksi5Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(invoiceLabelTransaksi5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listPanelTransaksi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabelTransaksi5)
                    .addComponent(namaKeretaLabelTransaksi5)
                    .addComponent(awalLabelTransaksi5)
                    .addComponent(tujuanLabelTujuan5))
                .addContainerGap())
        );

        listPanelTransaksi6.setBackground(new java.awt.Color(255, 225, 196));
        listPanelTransaksi6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        invoiceLabelTransaksi6.setText("ID INVOICE");

        hargaLabelTransaksi6.setText("Harga");

        namaKeretaLabelTransaksi6.setText("Nama Kereta");

        awalLabelTransaksi6.setText("Awal");

        tujuanLabelTujuan6.setText("Tujuan");

        javax.swing.GroupLayout listPanelTransaksi6Layout = new javax.swing.GroupLayout(listPanelTransaksi6);
        listPanelTransaksi6.setLayout(listPanelTransaksi6Layout);
        listPanelTransaksi6Layout.setHorizontalGroup(
            listPanelTransaksi6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelTransaksi6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(listPanelTransaksi6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listPanelTransaksi6Layout.createSequentialGroup()
                        .addComponent(namaKeretaLabelTransaksi6)
                        .addGap(56, 56, 56)
                        .addComponent(awalLabelTransaksi6)
                        .addGap(51, 51, 51)
                        .addComponent(tujuanLabelTujuan6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(hargaLabelTransaksi6)
                        .addGap(35, 35, 35))
                    .addGroup(listPanelTransaksi6Layout.createSequentialGroup()
                        .addComponent(invoiceLabelTransaksi6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        listPanelTransaksi6Layout.setVerticalGroup(
            listPanelTransaksi6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelTransaksi6Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(invoiceLabelTransaksi6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listPanelTransaksi6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabelTransaksi6)
                    .addComponent(namaKeretaLabelTransaksi6)
                    .addComponent(awalLabelTransaksi6)
                    .addComponent(tujuanLabelTujuan6))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(riwayatTransaksiLabelTransaksi1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listPanelTransaksi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listPanelTransaksi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listPanelTransaksi6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listPanelTransaksi5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(riwayatTransaksiLabelTransaksi1)
                .addGap(33, 33, 33)
                .addComponent(listPanelTransaksi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listPanelTransaksi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listPanelTransaksi5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listPanelTransaksi6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel4);

        javax.swing.GroupLayout TransaksiPageLayout = new javax.swing.GroupLayout(TransaksiPage);
        TransaksiPage.setLayout(TransaksiPageLayout);
        TransaksiPageLayout.setHorizontalGroup(
            TransaksiPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiPageLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );
        TransaksiPageLayout.setVerticalGroup(
            TransaksiPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContainerPages.addTab("Transaksi", TransaksiPage);

        AdminPage.setBackground(new java.awt.Color(208, 231, 255));

        jadwalBtnAdminPage.setText("Jadwal");
        jadwalBtnAdminPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadwalBtnAdminPageActionPerformed(evt);
            }
        });

        akunBtnAdminPage1.setText("Daftar akun");

        daftarKeretaBtnAdminPage.setText("Daftar Kereta");
        daftarKeretaBtnAdminPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarKeretaBtnAdminPageActionPerformed(evt);
            }
        });

        daftarStasiunBtnAdminPage.setText("Daftar Stasiun");
        daftarStasiunBtnAdminPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarStasiunBtnAdminPageActionPerformed(evt);
            }
        });

        daftarMenuBtnAdminPage.setText("Daftar Menu");
        daftarMenuBtnAdminPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarMenuBtnAdminPageActionPerformed(evt);
            }
        });

        daftarPembayaranBtnAdminPage.setText("Daftar Pembayaran");

        pembayaranBlifoodBtnAdminPage.setText("Pembayaran BLI-Food");
        pembayaranBlifoodBtnAdminPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayaranBlifoodBtnAdminPageActionPerformed(evt);
            }
        });

        daftarGerbongBtnAdminPage.setText("Daftar Gerbong");
        daftarGerbongBtnAdminPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarGerbongBtnAdminPageActionPerformed(evt);
            }
        });

        daftarPenumpangBtnAdminPage.setText("Daftar Penumpang");
        daftarPenumpangBtnAdminPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarPenumpangBtnAdminPageActionPerformed(evt);
            }
        });

        daftarTransaksiBtnAdminPage.setText("Daftar Transaksi");
        daftarTransaksiBtnAdminPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarTransaksiBtnAdminPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminPageLayout = new javax.swing.GroupLayout(AdminPage);
        AdminPage.setLayout(AdminPageLayout);
        AdminPageLayout.setHorizontalGroup(
            AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPageLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AdminPageLayout.createSequentialGroup()
                        .addComponent(daftarPembayaranBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pembayaranBlifoodBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(daftarGerbongBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(daftarPenumpangBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(daftarTransaksiBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminPageLayout.createSequentialGroup()
                        .addComponent(akunBtnAdminPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jadwalBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(daftarKeretaBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(daftarStasiunBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(daftarMenuBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        AdminPageLayout.setVerticalGroup(
            AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPageLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jadwalBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akunBtnAdminPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarKeretaBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarStasiunBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarMenuBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pembayaranBlifoodBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarPembayaranBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarGerbongBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarPenumpangBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarTransaksiBtnAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        ContainerPages.addTab("AdminPage", AdminPage);

        getContentPane().add(ContainerPages, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void homeNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeNavBtnActionPerformed
    ContainerPages.setSelectedIndex(2);
    
  }//GEN-LAST:event_homeNavBtnActionPerformed

    private void awalListHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_awalListHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_awalListHomeActionPerformed

    private void tujuanListHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanListHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tujuanListHomeActionPerformed

    private void passwordFieldSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldSignUpActionPerformed

    private void transaksiNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiNavBtnActionPerformed
        
    }//GEN-LAST:event_transaksiNavBtnActionPerformed

    private void masukBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukBtnLoginActionPerformed
        // TODO add your handling code here:
        String email = emailFieldLogin.getText();
        String password = passwordFieldLogin.getText();
        
        if(email.equals("admin") && password.equals("admin123")){
            ContainerPages.setSelectedIndex(11);
        }
        else {
            if (email.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog(this, "GAGAL LOGIN");
                ContainerPages.setSelectedIndex(0);
            }
            else{
                try{
                    java.sql.ResultSet ID_AKUNS = sqlStatementWithResult("SELECT ID_AKUN FROM akun WHERE EMAIL = '"+email+"' AND  PASSWORD = '"+password+"'");
                    ID_AKUNS.next();
                    if (ID_AKUNS.getString(1) != null){
                        ContainerPages.setSelectedIndex(2);
                        setVisibleNav(true);
                    } 

                } catch(Exception Ex){
                    JOptionPane.showMessageDialog(this, "GAGAL LOGIN");
                }
            } 
        }
        
        
    }//GEN-LAST:event_masukBtnLoginActionPerformed

    private void daftarBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarBtnLoginActionPerformed
        // TODO add your handling code here:
        ContainerPages.setSelectedIndex(1);
        
        setVisibleNav(false);
    }//GEN-LAST:event_daftarBtnLoginActionPerformed

    private void daftarBtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarBtnSignUpActionPerformed
        
      
    try{
        // GET DATA TO create ID_akun
        java.sql.ResultSet numAcc = sqlStatementWithResult("SELECT COUNT(ID_AKUN) FROM akun");
        numAcc.next();
        System.out.println(numAcc);
        String newIdAcc = "A" + String.valueOf(numAcc.getInt(1)+1);
        
        // INSERT DATA to table akun
        sqlStatementNoResult("INSERT INTO akun VALUES('"+newIdAcc+"', '"+namaFieldSignUp.getText()+"', '"+teleponFieldSignUp.getText()+"', '"+emailFieldSignUp.getText()+"', '"+passwordFieldSignUp.getText()+"') ");
    } catch(Exception ex){
        JOptionPane.showMessageDialog(this, ex.getMessage());
    } finally{
        ContainerPages.setSelectedIndex(0);
        clearSignUp();
    }
    
    }//GEN-LAST:event_daftarBtnSignUpActionPerformed

    private void pilihGerbongComboPilihKursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihGerbongComboPilihKursiActionPerformed
        // TODO add your handling code here:
        pilihGerbongComboPilihKursi.addItemListener(new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getItem() == "Gerbong 1"){
                   gerbongLabelPilihKursi.setText("Gerbong 1");
                }else if (e.getItem() == "Gerbong 2"){
                   gerbongLabelPilihKursi.setText("Gerbong 2");
                }else if (e.getItem() == "Gerbong 3"){
                   gerbongLabelPilihKursi.setText("Gerbong 3");
                }else if (e.getItem() == "Gerbong 4"){
                gerbongLabelPilihKursi.setText("Gerbong 4");
                }
            }
            });
    }//GEN-LAST:event_pilihGerbongComboPilihKursiActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void listJadwalPanelJadwalKeduaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listJadwalPanelJadwalKeduaMouseClicked
        // TODO add your handling code here:
        ContainerPages.setSelectedIndex(4);
        namaKeretaLabelPesanTiket.setText(namaKeretaLabelJadwalSatu.getText());
        awalLabelPesanTiket.setText(awalLabelJadwalSatu.getText());
        akhirLabelPesanTiket.setText(sampaiLabelJadwalSatu.getText());
        destinasiAwalLabelPesanTiket.setText(keberangkatanLabelJadwalSatu.getText());
        destinasiAkhirLabelPesanTiket.setText(tujuanLabelJadwalSatu.getText());
        
        Date date = tglBerangkatDateHome.getDate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        tglTiketLabelPesanTiket.setText(String.valueOf(date));
    }//GEN-LAST:event_listJadwalPanelJadwalKeduaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ContainerPages.setSelectedIndex(5);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pesanBtnPilihKursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanBtnPilihKursiActionPerformed
        // TODO add your handling code here:
        ContainerPages.setSelectedIndex(6);

    }//GEN-LAST:event_pesanBtnPilihKursiActionPerformed

    private void bayarBtnDetailPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarBtnDetailPembayaranActionPerformed
        // TODO add your handling code here:
        ContainerPages.setSelectedIndex(7);
        
    }//GEN-LAST:event_bayarBtnDetailPembayaranActionPerformed

    private void cariTiketBtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariTiketBtnHomeActionPerformed
        
        String destinasiAwal = (String) awalListHome.getSelectedItem();
        String destinasiAkhir = (String) tujuanListHome.getSelectedItem();
        System.out.println(destinasiAwal + " " + destinasiAkhir);
        int jumlahPenumpang = (Integer) penumpangSpinnerHome.getValue();
        Date date = tglBerangkatDateHome.getDate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        String sql = "SELECT jadwal.ID_JADWAL, kereta_api.NAMA_KERETA, jadwal.HARGA, jadwal.DESTINASI_AWAL, jadwal.DESTINASI_AKHIR, jadwal.JAM_KEBERANGKATAN, jadwal.JAM_SAMPAI, jadwal.DURASI  FROM jadwal INNER JOIN punya ON jadwal.ID_JADWAL = punya.ID_JADWAL INNER JOIN kereta_api ON kereta_api.ID_KERETA = punya.ID_KERETA WHERE KOTA_AWAL = '"+destinasiAwal+"' AND KOTA_AKHIR ='"+destinasiAkhir+"'";
        String sqlCountJadwal = "SELECT COUNT(*)  FROM jadwal INNER JOIN punya ON jadwal.ID_JADWAL = punya.ID_JADWAL INNER JOIN kereta_api ON kereta_api.ID_KERETA = punya.ID_KERETA WHERE KOTA_AWAL = '"+destinasiAwal+"' AND KOTA_AKHIR ='"+destinasiAkhir+"'";
        
        java.sql.ResultSet result = sqlStatementWithResult(sql);
        java.sql.ResultSet countJadwal = sqlStatementWithResult(sqlCountJadwal);
        
        System.out.println(result);
        
        
        try {
//            while(result.next()){
//                System.out.println(result.next());
                result.next();
                countJadwal.next();
                totalJadwal = countJadwal.getInt(1);
                System.out.println(totalJadwal);
//                System.out.println(result.getString(1) + " " + result.getString(7) + " " + result.getString(8) + " " + result.getString(9) + " " + result.getString(10));
                
                // Update component Jadwal kereta
                switch (totalJadwal){
                    
                    case 0:{
                        clearJadwalTiket();
                        jadwalKeretaApiLabelJadwal.setText("Jadwal tidak ditemukan!");
                        
                        
                        
                    }
                
                    case 1:{
                        namaKeretaLabelJadwalSatu.setText("Kereta : " + result.getString(2));
                        hargaLabelJadwalSatu.setText("RP : " + String.valueOf(result.getInt(3)));
                        keberangkatanLabelJadwalSatu.setText(result.getString(4));
                        tujuanLabelJadwalSatu.setText(result.getString(5));
                        awalLabelJadwalSatu.setText(result.getString(6));
                        sampaiLabelJadwalSatu.setText(result.getString(7));
                        durasiLabelJadwalSatu.setText(result.getString(8));
                        idTiketLabelJadwalSatu.setText(result.getString(1));
                        
                        
                        listJadwalPanelJadwalKedua.setVisible(false);
                        listJadwalPanelJadwalKetiga.setVisible(false);
                        kembaliBtnJadwal.setVisible(false);
                        break;
                        
                        
                    }
                    case 2:{
                        namaKeretaLabelJadwalSatu.setText("Kereta : " + result.getString(2));
                        hargaLabelJadwalSatu.setText("RP : " + String.valueOf(result.getInt(3)));
                        keberangkatanLabelJadwalSatu.setText(result.getString(4));
                        tujuanLabelJadwalSatu.setText(result.getString(5));
                        awalLabelJadwalSatu.setText(result.getString(6));
                        sampaiLabelJadwalSatu.setText(result.getString(7));
                        durasiLabelJadwalSatu.setText(result.getString(8));
                        idTiketLabelJadwalSatu.setText(result.getString(1));
                        result.next();
                        
                        
                        namaKeretaLabelJadwalKedua.setText("Kereta : " + result.getString(2));
                        hargaLabelJadwalKedua.setText("RP : " + String.valueOf(result.getInt(3)));
                        keberangkatanLabelJadwalKedua.setText(result.getString(4));
                        tujuanLabelJadwalKedua.setText(result.getString(5));
                        awalLabelJadwalKedua.setText(result.getString(6));
                        sampaiLabelJadwalKedua.setText(result.getString(7));
                        durasiLabelJadwalKedua.setText(result.getString(8));
                        idTiketLabelJadwalKedua.setText(result.getString(1));
                        
                        listJadwalPanelJadwalKetiga.setVisible(false);
                        kembaliBtnJadwal.setVisible(false);
                        break;
                    }
                    case 3:{
                        namaKeretaLabelJadwalSatu.setText("Kereta : " + result.getString(2));
                        hargaLabelJadwalSatu.setText("RP : " + String.valueOf(result.getInt(3)));
                        keberangkatanLabelJadwalSatu.setText(result.getString(4));
                        tujuanLabelJadwalSatu.setText(result.getString(5));
                        awalLabelJadwalSatu.setText(result.getString(6));
                        sampaiLabelJadwalSatu.setText(result.getString(7));
                        durasiLabelJadwalSatu.setText(result.getString(8));
                        idTiketLabelJadwalSatu.setText(result.getString(1));
                        result.next();
                        
                        namaKeretaLabelJadwalKedua.setText("Kereta : " + result.getString(2));
                        hargaLabelJadwalKedua.setText("RP : " + String.valueOf(result.getInt(3)));
                        keberangkatanLabelJadwalKedua.setText(result.getString(4));
                        tujuanLabelJadwalKedua.setText(result.getString(5));
                        awalLabelJadwalKedua.setText(result.getString(6));
                        sampaiLabelJadwalKedua.setText(result.getString(7));
                        durasiLabelJadwalKedua.setText(result.getString(8));
                        idTiketLabelJadwalKedua.setText(result.getString(1));
                        result.next();
                        
                        namaKeretaLabelJadwalKetiga.setText("Kereta : " + result.getString(2));
                        hargaLabelJadwalKetiga.setText("RP : " + String.valueOf(result.getInt(3)));
                        keberangkatanLabelJadwalKetiga.setText(result.getString(4));
                        tujuanLabelJadwalKetiga.setText(result.getString(5));
                        awalLabelJadwalKetiga.setText(result.getString(6));
                        sampaiLabelJadwalKetiga.setText(result.getString(7));
                        durasiLabelJadwalKetiga.setText(result.getString(8));
                        idTiketLabelJadwalKetiga.setText(result.getString(1));
                        kembaliBtnJadwal.setVisible(false);
                        break;
                    }
                    default:
                        break;
                        
            }
//                if(totalJadwal == 1){
//                    
//                }
//                else if (totalJadwal == 2){
//                    namaKeretaLabelJadwal.setText(result.getString(1));
//                    hargaLabelJadwalSatu.setText(String.valueOf(result.getInt(2)));
//                    keberangkatanLabelJadwalSatu.setText(result.getString(3));
//                    tujuanLabelJadwalSatu.setText(result.getString(4));
//                    awalLabelJadwalSatu.setText(result.getString(5));
//                    sampaiLabelJadwalSatu.setText(result.getString(6));
//                }
    
//            }
//            while(countJadwal.next()){
//                totalJadwal = countJadwal.getInt(1);
//            }
            result.close();
            countJadwal.close();

        } catch (SQLException ex) {
            Logger.getLogger(MainAppFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 

        ContainerPages.setSelectedIndex(3);
        
    }//GEN-LAST:event_cariTiketBtnHomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void listJadwalPanelJadwalKetigaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listJadwalPanelJadwalKetigaMouseClicked
        // TODO add your handling code here:
        ContainerPages.setSelectedIndex(4);
        namaKeretaLabelPesanTiket.setText(namaKeretaLabelJadwalSatu.getText());
        awalLabelPesanTiket.setText(awalLabelJadwalSatu.getText());
        akhirLabelPesanTiket.setText(sampaiLabelJadwalSatu.getText());
        destinasiAwalLabelPesanTiket.setText(keberangkatanLabelJadwalSatu.getText());
        destinasiAkhirLabelPesanTiket.setText(tujuanLabelJadwalSatu.getText());
        
        Date date = tglBerangkatDateHome.getDate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        tglTiketLabelPesanTiket.setText(String.valueOf(date));
    }//GEN-LAST:event_listJadwalPanelJadwalKetigaMouseClicked

    private void listJadwalPanelJadwalSatuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listJadwalPanelJadwalSatuMouseClicked
        ContainerPages.setSelectedIndex(4);
        namaKeretaLabelPesanTiket.setText(namaKeretaLabelJadwalSatu.getText());
        awalLabelPesanTiket.setText(awalLabelJadwalSatu.getText());
        akhirLabelPesanTiket.setText(sampaiLabelJadwalSatu.getText());
        destinasiAwalLabelPesanTiket.setText(keberangkatanLabelJadwalSatu.getText());
        destinasiAkhirLabelPesanTiket.setText(tujuanLabelJadwalSatu.getText());
        
        Date date = tglBerangkatDateHome.getDate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        tglTiketLabelPesanTiket.setText(String.valueOf(date));
        int penumpang = (Integer) penumpangSpinnerHome.getValue();
        penumpangLabelPesanTiket.setText(String.valueOf(penumpang));
    }//GEN-LAST:event_listJadwalPanelJadwalSatuMouseClicked

    private void awalListHomePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_awalListHomePropertyChange
        
    }//GEN-LAST:event_awalListHomePropertyChange

    private void jadwalBtnAdminPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadwalBtnAdminPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jadwalBtnAdminPageActionPerformed

    private void daftarKeretaBtnAdminPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarKeretaBtnAdminPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarKeretaBtnAdminPageActionPerformed

    private void daftarStasiunBtnAdminPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarStasiunBtnAdminPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarStasiunBtnAdminPageActionPerformed

    private void daftarMenuBtnAdminPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarMenuBtnAdminPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarMenuBtnAdminPageActionPerformed

    private void pembayaranBlifoodBtnAdminPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayaranBlifoodBtnAdminPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pembayaranBlifoodBtnAdminPageActionPerformed

    private void daftarGerbongBtnAdminPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarGerbongBtnAdminPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarGerbongBtnAdminPageActionPerformed

    private void daftarPenumpangBtnAdminPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarPenumpangBtnAdminPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarPenumpangBtnAdminPageActionPerformed

    private void daftarTransaksiBtnAdminPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarTransaksiBtnAdminPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarTransaksiBtnAdminPageActionPerformed

    private void bliFoodNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bliFoodNavBtnActionPerformed
        // TODO add your handling code here:
        ContainerPages.setSelectedIndex(8);
        
        String mkn = "SELECT NAMA_MENU, HARGA FROM menu_makanan WHERE ID_MENU LIKE 'F%'";
        String mnm = "SELECT NAMA_MENU, HARGA FROM menu_makanan WHERE ID_MENU LIKE 'D%'";
               
        java.sql.ResultSet makan = sqlStatementWithResult(mkn);
        java.sql.ResultSet minum = sqlStatementWithResult(mnm);

        try{
//            String x = "1";
//            String tmp = "namaMakananLabelPesanMakanan";
//            int i=0;
//            while(makan.next()){
//                String fa = tmp+x;
                makan.next();
                namaMakananLabelPesanMakanan1.setText(makan.getString(1));
                hargaMakananLabelPesanMakanan1.setText(String.valueOf(makan.getString(2)));
                
                makan.next();
                namaMakananLabelPesanMakanan2.setText(makan.getString(1));
                hargaMakananLabelPesanMakanan2.setText(String.valueOf(makan.getString(2)));
                
                makan.next();
                namaMakananLabelPesanMakanan3.setText(makan.getString(1));
                hargaMakananLabelPesanMakanan3.setText(String.valueOf(makan.getString(2)));
                
                makan.next();
                namaMakananLabelPesanMakanan4.setText(makan.getString(1));
                hargaMakananLabelPesanMakanan4.setText(String.valueOf(makan.getString(2)));
                
                makan.next();
                namaMakananLabelPesanMakanan5.setText(makan.getString(1));
                hargaMakananLabelPesanMakanan5.setText(String.valueOf(makan.getString(2)));
                
            
            
    

                minum.next();
                namaMinumanLabelPesanMakanan1.setText(minum.getString(1));
                hargaMinumanLabelPesanMakanan1.setText(String.valueOf(minum.getString(2)));
                
                minum.next();
                namaMinumanLabelPesanMakanan2.setText(minum.getString(1));
                hargaMinumanLabelPesanMakanan2.setText(String.valueOf(minum.getString(2)));
                
                minum.next();
                namaMinumanLabelPesanMakanan3.setText(minum.getString(1));
                hargaMinumanLabelPesanMakanan3.setText(String.valueOf(minum.getString(2)));
                
                minum.next();
                namaMinumanLabelPesanMakanan4.setText(minum.getString(1));
                hargaMinumanLabelPesanMakanan4.setText(String.valueOf(minum.getString(2)));
                
                minum.next();
                namaMinumanLabelPesanMakanan5.setText(minum.getString(1));
                hargaMinumanLabelPesanMakanan5.setText(String.valueOf(minum.getString(2)));
                
                
                
                
            
//            System.out.println(makan.getString(1));
            
        }catch(Exception ex){
        }
        
        
//        for(int i=0; i<5; i++){
//            
//        }
        
    }//GEN-LAST:event_bliFoodNavBtnActionPerformed

    private void pesanBtnPesanMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanBtnPesanMakananActionPerformed
        // TODO add your handling code here:
        ContainerPages.setSelectedIndex(9);
        
//        int f1 = spinnerMakananPesanMakanan1.getValue();
        int x=-1;
        if((int) spinnerMakananPesanMakanan1.getValue()!=0){
            x++;
//            System.out.println(spinnerMakananPesanMakanan1.getValue());
        }if((int) spinnerMakananPesanMakanan1.getValue()!=0){
            x++;
        } if((int) spinnerMakananPesanMakanan2.getValue()!=0){
            x++;
        } if((int) spinnerMakananPesanMakanan3.getValue()!=0){
            x++;
        } if((int) spinnerMakananPesanMakanan4.getValue()!=0){
            x++;
        } if((int) spinnerMakananPesanMakanan5.getValue()!=0){
            x++; 
        } if((int) spinnerMinumanPesanMakanan1.getValue()!=0){
            x++;
        } if((int) spinnerMinumanPesanMakanan2.getValue()!=0){
            x++;
        } if((int) spinnerMinumanPesanMakanan3.getValue()!=0){
            x++;
        } if((int) spinnerMinumanPesanMakanan4.getValue()!=0){
            x++;
        } if((int) spinnerMinumanPesanMakanan5.getValue()!=0){
            x++;
        }
        System.out.println(x);
        switch(x){
            case 0:{
                setVisibleFinalMakanan(false);
                 break;
            }
            case 1:{
                setVisibleFinalMakanan1(false);
                break;
            }
            case 2:{
                setVisibleFinalMakanan2(false);
                 break;
            }
            case 3:{
                setVisibleFinalMakanan3(false);
                 break;
            }
            case 4:{
                setVisibleFinalMakanan4(false);
                 break;
            }
            case 5:{
                setVisibleFinalMakanan5(false);
                 break;
            }
            case 6:{
                setVisibleFinalMakanan6(false);
                 break;
            }
            case 7:{
                setVisibleFinalMakanan7(false);
                 break;
            }
            case 8:{
                setVisibleFinalMakanan8(false);
                 break;
            }
            case 9:{
                setVisibleFinalMakanan9(false);
                 break;
            }
//            case 10:{
//                setVisibleFinalMakanan(true);
//            }
            
        }
        
        
    }//GEN-LAST:event_pesanBtnPesanMakananActionPerformed

    private void kembaliBtnJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBtnJadwalActionPerformed
        // TODO add your handling code here:
        ContainerPages.setSelectedIndex(2);
    }//GEN-LAST:event_kembaliBtnJadwalActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void MakananPanelPesanMakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MakananPanelPesanMakananMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MakananPanelPesanMakananMouseClicked

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainAppFrame().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPage;
    private javax.swing.JTabbedPane ContainerPages;
    private javax.swing.JPanel DetailPembayaranPage;
    private javax.swing.JPanel FinalMakananPage;
    private javax.swing.JPanel FinalPembayaran;
    private javax.swing.JPanel HomePage;
    private javax.swing.JPanel JadwalPage;
    private javax.swing.JPanel LoginPage;
    private javax.swing.JPanel MakananPanelPesanMakanan;
    private javax.swing.JPanel MakananPanelPesanMakanan2;
    private javax.swing.JPanel MakananPanelPesanMakanan3;
    private javax.swing.JPanel MakananPanelPesanMakanan4;
    private javax.swing.JPanel MakananPanelPesanMakanan5;
    private javax.swing.JPanel MinumanPanelPesanMakanan1;
    private javax.swing.JPanel MinumanPanelPesanMakanan3;
    private javax.swing.JPanel MinumanPanelPesanMakanan4;
    private javax.swing.JPanel MinumanPanelPesanMakanan5;
    private javax.swing.JPanel MinumanPanelPesanMakanan6;
    private javax.swing.JPanel PesanMakananPage;
    private javax.swing.JPanel PesanTiketPage;
    private javax.swing.JPanel PilihKursiPage;
    private javax.swing.JPanel SignUpPage;
    private javax.swing.JPanel TransaksiPage;
    private javax.swing.JLabel akhirLabelPesanTiket;
    private javax.swing.JButton akunBtnAdminPage1;
    private javax.swing.JLabel angkaPenumpangLabelDetailPembayaran;
    private javax.swing.JLabel awal;
    private javax.swing.JLabel awalLabelHome;
    private javax.swing.JLabel awalLabelJadwalKedua;
    private javax.swing.JLabel awalLabelJadwalKetiga;
    private javax.swing.JLabel awalLabelJadwalSatu;
    private javax.swing.JLabel awalLabelPesanTiket;
    private javax.swing.JLabel awalLabelTransaksi2;
    private javax.swing.JLabel awalLabelTransaksi3;
    private javax.swing.JLabel awalLabelTransaksi5;
    private javax.swing.JLabel awalLabelTransaksi6;
    private javax.swing.JComboBox<String> awalListHome;
    private javax.swing.JButton bayarBtnDetailPembayaran;
    private javax.swing.JLabel bliFoodLabelPesanMakanan;
    private javax.swing.JButton bliFoodNavBtn;
    private javax.swing.JButton cariTiketBtnHome;
    private javax.swing.JButton daftarBtnLogin;
    private javax.swing.JButton daftarBtnSignUp;
    private javax.swing.JButton daftarGerbongBtnAdminPage;
    private javax.swing.JButton daftarKeretaBtnAdminPage;
    private javax.swing.JButton daftarMenuBtnAdminPage;
    private javax.swing.JButton daftarPembayaranBtnAdminPage;
    private javax.swing.JButton daftarPenumpangBtnAdminPage;
    private javax.swing.JButton daftarStasiunBtnAdminPage;
    private javax.swing.JButton daftarTransaksiBtnAdminPage;
    private javax.swing.JLabel destinasiAkhirLabelPesanTiket;
    private javax.swing.JLabel destinasiAwalLabelPesanTiket;
    private javax.swing.JPanel detailPanelDetailPembayaran;
    private javax.swing.JLabel detailPembayaranLabelDetailPembayaran;
    private javax.swing.JLabel durasi;
    private javax.swing.JLabel durasiLabelJadwalKedua;
    private javax.swing.JLabel durasiLabelJadwalKetiga;
    private javax.swing.JLabel durasiLabelJadwalSatu;
    private javax.swing.JTextField emailFieldLogin;
    private javax.swing.JTextField emailFieldSignUp;
    private javax.swing.JLabel emailLabelLogin;
    private javax.swing.JLabel emailLabelSignup;
    private javax.swing.JLabel gerbongLabelPilihKursi;
    private javax.swing.JPanel gerbongPilihKursi;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel hargaLabelFinalMakanan1;
    private javax.swing.JLabel hargaLabelFinalMakanan10;
    private javax.swing.JLabel hargaLabelFinalMakanan2;
    private javax.swing.JLabel hargaLabelFinalMakanan3;
    private javax.swing.JLabel hargaLabelFinalMakanan4;
    private javax.swing.JLabel hargaLabelFinalMakanan5;
    private javax.swing.JLabel hargaLabelFinalMakanan6;
    private javax.swing.JLabel hargaLabelFinalMakanan7;
    private javax.swing.JLabel hargaLabelFinalMakanan8;
    private javax.swing.JLabel hargaLabelFinalMakanan9;
    private javax.swing.JLabel hargaLabelJadwalKedua;
    private javax.swing.JLabel hargaLabelJadwalKetiga;
    private javax.swing.JLabel hargaLabelJadwalSatu;
    private javax.swing.JLabel hargaLabelTransaksi2;
    private javax.swing.JLabel hargaLabelTransaksi3;
    private javax.swing.JLabel hargaLabelTransaksi5;
    private javax.swing.JLabel hargaLabelTransaksi6;
    private javax.swing.JLabel hargaMakananLabelPesanMakanan1;
    private javax.swing.JLabel hargaMakananLabelPesanMakanan2;
    private javax.swing.JLabel hargaMakananLabelPesanMakanan3;
    private javax.swing.JLabel hargaMakananLabelPesanMakanan4;
    private javax.swing.JLabel hargaMakananLabelPesanMakanan5;
    private javax.swing.JLabel hargaMinumanLabelPesanMakanan1;
    private javax.swing.JLabel hargaMinumanLabelPesanMakanan2;
    private javax.swing.JLabel hargaMinumanLabelPesanMakanan3;
    private javax.swing.JLabel hargaMinumanLabelPesanMakanan4;
    private javax.swing.JLabel hargaMinumanLabelPesanMakanan5;
    private javax.swing.JLabel hargaTiketLabelDetailPembayaran;
    private javax.swing.JButton homeNavBtn;
    private javax.swing.JLabel idTiketLabelJadwalKedua;
    private javax.swing.JLabel idTiketLabelJadwalKetiga;
    private javax.swing.JLabel idTiketLabelJadwalSatu;
    private javax.swing.JLabel invoiceLabelTransaksi2;
    private javax.swing.JLabel invoiceLabelTransaksi3;
    private javax.swing.JLabel invoiceLabelTransaksi5;
    private javax.swing.JLabel invoiceLabelTransaksi6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jadwal1;
    private javax.swing.JButton jadwalBtnAdminPage;
    private javax.swing.JLabel jadwalKeretaApiLabelJadwal;
    private javax.swing.JLabel jumlahLabelFinalMakanan1;
    private javax.swing.JLabel jumlahLabelFinalMakanan10;
    private javax.swing.JLabel jumlahLabelFinalMakanan2;
    private javax.swing.JLabel jumlahLabelFinalMakanan3;
    private javax.swing.JLabel jumlahLabelFinalMakanan4;
    private javax.swing.JLabel jumlahLabelFinalMakanan5;
    private javax.swing.JLabel jumlahLabelFinalMakanan6;
    private javax.swing.JLabel jumlahLabelFinalMakanan7;
    private javax.swing.JLabel jumlahLabelFinalMakanan8;
    private javax.swing.JLabel jumlahLabelFinalMakanan9;
    private javax.swing.JLabel keberangkatan;
    private javax.swing.JLabel keberangkatanLabelJadwalKedua;
    private javax.swing.JLabel keberangkatanLabelJadwalKetiga;
    private javax.swing.JLabel keberangkatanLabelJadwalSatu;
    private javax.swing.JButton kembaliBtnJadwal;
    private javax.swing.JPanel listJadwalPanelJadwalKedua;
    private javax.swing.JPanel listJadwalPanelJadwalKetiga;
    private javax.swing.JPanel listJadwalPanelJadwalSatu;
    private javax.swing.JPanel listMakananPanelFinalMakanan;
    private javax.swing.JPanel listPanelTransaksi2;
    private javax.swing.JPanel listPanelTransaksi3;
    private javax.swing.JPanel listPanelTransaksi5;
    private javax.swing.JPanel listPanelTransaksi6;
    private javax.swing.JLabel loginLabelLogin;
    private javax.swing.JButton masukBtnLogin;
    private javax.swing.JComboBox<String> metodeBayarComboFinalMakanan;
    private javax.swing.JComboBox<String> metodePembayaranComboDetailPembayaran;
    private javax.swing.JLabel metodePembayaranLabelDetailPembayaran;
    private javax.swing.JLabel metodePembayaranLabelFinalMakanan;
    private javax.swing.JTextField namaFieldSignUp;
    private javax.swing.JLabel namaKereta;
    private javax.swing.JLabel namaKeretaLabelJadwalKedua;
    private javax.swing.JLabel namaKeretaLabelJadwalKetiga;
    private javax.swing.JLabel namaKeretaLabelJadwalSatu;
    private javax.swing.JLabel namaKeretaLabelPesanTiket;
    private javax.swing.JLabel namaKeretaLabelTransaksi2;
    private javax.swing.JLabel namaKeretaLabelTransaksi3;
    private javax.swing.JLabel namaKeretaLabelTransaksi5;
    private javax.swing.JLabel namaKeretaLabelTransaksi6;
    private javax.swing.JLabel namaLabelFinalMakanan1;
    private javax.swing.JLabel namaLabelFinalMakanan10;
    private javax.swing.JLabel namaLabelFinalMakanan2;
    private javax.swing.JLabel namaLabelFinalMakanan3;
    private javax.swing.JLabel namaLabelFinalMakanan4;
    private javax.swing.JLabel namaLabelFinalMakanan5;
    private javax.swing.JLabel namaLabelFinalMakanan6;
    private javax.swing.JLabel namaLabelFinalMakanan7;
    private javax.swing.JLabel namaLabelFinalMakanan8;
    private javax.swing.JLabel namaLabelFinalMakanan9;
    private javax.swing.JLabel namaLabelSignup;
    private javax.swing.JLabel namaMakananLabelPesanMakanan1;
    private javax.swing.JLabel namaMakananLabelPesanMakanan2;
    private javax.swing.JLabel namaMakananLabelPesanMakanan3;
    private javax.swing.JLabel namaMakananLabelPesanMakanan4;
    private javax.swing.JLabel namaMakananLabelPesanMakanan5;
    private javax.swing.JLabel namaMinumanLabelPesanMakanan1;
    private javax.swing.JLabel namaMinumanLabelPesanMakanan2;
    private javax.swing.JLabel namaMinumanLabelPesanMakanan3;
    private javax.swing.JLabel namaMinumanLabelPesanMakanan4;
    private javax.swing.JLabel namaMinumanLabelPesanMakanan5;
    private javax.swing.JPasswordField passwordFieldLogin;
    private javax.swing.JPasswordField passwordFieldSignUp;
    private javax.swing.JLabel passwordLabelLogin;
    private javax.swing.JLabel passwordLabelSignup;
    private javax.swing.JButton pembayaranBlifoodBtnAdminPage;
    private javax.swing.JLabel penumpangLabelDetailPembayaran;
    private javax.swing.JLabel penumpangLabelHome;
    private javax.swing.JLabel penumpangLabelPesanTiket;
    private javax.swing.JSpinner penumpangSpinnerHome;
    private javax.swing.JButton pesanBtnPesanMakanan;
    private javax.swing.JButton pesanBtnPilihKursi;
    private javax.swing.JComboBox<String> pilihGerbongComboPilihKursi;
    private javax.swing.JLabel riwayatTransaksiLabelTransaksi1;
    private javax.swing.JLabel sampai;
    private javax.swing.JLabel sampaiLabelJadwalKedua;
    private javax.swing.JLabel sampaiLabelJadwalKetiga;
    private javax.swing.JLabel sampaiLabelJadwalSatu;
    private javax.swing.JLabel signUpLabelSignUp;
    private javax.swing.JSpinner spinnerMakananPesanMakanan1;
    private javax.swing.JSpinner spinnerMakananPesanMakanan2;
    private javax.swing.JSpinner spinnerMakananPesanMakanan3;
    private javax.swing.JSpinner spinnerMakananPesanMakanan4;
    private javax.swing.JSpinner spinnerMakananPesanMakanan5;
    private javax.swing.JSpinner spinnerMinumanPesanMakanan1;
    private javax.swing.JSpinner spinnerMinumanPesanMakanan2;
    private javax.swing.JSpinner spinnerMinumanPesanMakanan3;
    private javax.swing.JSpinner spinnerMinumanPesanMakanan4;
    private javax.swing.JSpinner spinnerMinumanPesanMakanan5;
    private javax.swing.JLabel strip;
    private javax.swing.JLabel tanggalLabelHome;
    private javax.swing.JTextField teleponFieldSignUp;
    private javax.swing.JLabel teleponLabelSignIUp;
    private com.toedter.calendar.JDateChooser tglBerangkatDateHome;
    private javax.swing.JLabel tglTiketLabelPesanTiket;
    private javax.swing.JPanel tiketPanelPesanTiket;
    private javax.swing.JLabel titleLabelHome;
    private javax.swing.JLabel titleLabelHome1;
    private javax.swing.JLabel totalHargaDetailPembayaran;
    private javax.swing.JLabel totalHargaLabelFinalMakanan;
    private javax.swing.JButton transaksiNavBtn;
    private javax.swing.JLabel tujuanLabelHome;
    private javax.swing.JLabel tujuanLabelJadwalKedua;
    private javax.swing.JLabel tujuanLabelJadwalKetiga;
    private javax.swing.JLabel tujuanLabelJadwalSatu;
    private javax.swing.JLabel tujuanLabelTujuan2;
    private javax.swing.JLabel tujuanLabelTujuan3;
    private javax.swing.JLabel tujuanLabelTujuan5;
    private javax.swing.JLabel tujuanLabelTujuan6;
    private javax.swing.JComboBox<String> tujuanListHome;
    // End of variables declaration//GEN-END:variables
}
