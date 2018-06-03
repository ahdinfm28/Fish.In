/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Farisya
 */
public class user extends koneksi {

    String idUser, namaLengkap, alamat, jabatan, telepon, umur, level,username,password;
    private DefaultTableModel tablemodeluser;

    public user() throws SQLException {
        super();

        String header[] = {"idUser", "NamaLengkap", "Alamat", "Umur", "Telepon", "Jabatan", "Username", "Password", "Level"};
        tablemodeluser = new DefaultTableModel(null, header);
    }

    public void setId(String id) {
        this.idUser = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setNama(String nama) {
        this.namaLengkap = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setTelepon(String telp) {
        this.telepon = telp;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public String getId() {
        return idUser;
    }
    public String getNama() {
        return namaLengkap;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getUmur() {
        return umur;
    }
    public String getTelepon() {
        return telepon;
    }
    public String getJabatan() {
        return jabatan;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getLevel() {
        return level;
    }
   
    public void setSelectedRowUser(int baris) {
        this.idUser = tablemodeluser.getValueAt(baris, 0).toString();
        this.namaLengkap = tablemodeluser.getValueAt(baris, 1).toString();
        this.alamat = tablemodeluser.getValueAt(baris, 2).toString();
        this.umur = tablemodeluser.getValueAt(baris, 3).toString();
        this.telepon = tablemodeluser.getValueAt(baris, 4).toString();
        this.jabatan = tablemodeluser.getValueAt(baris, 5).toString();
        this.username = tablemodeluser.getValueAt(baris, 6).toString();
        this.password = tablemodeluser.getValueAt(baris, 7).toString();
        this.level = tablemodeluser.getValueAt(baris, 8).toString();
    }
   

    public boolean cekUser(String username, String password) throws SQLException {
        String query = "SELECT * FROM `user` WHERE username = '" + username + "' AND password ='" + password + "'";
        boolean status = false;
        try {
            rs = getResult(query);
            if (rs.next()) {
                status = true;
            }
        } catch (SQLException e) {
            System.out.println("Salah");
        }
        return status;
    }

    public String getLevel(String username, String password) throws SQLException {
        String query = "SELECT `level` FROM `user` WHERE `username` = '" + username + "' and `password` = '" + password + "'";
        ResultSet hasil = getResult(query);
        hasil.next();
        String data = hasil.getString(1).toUpperCase();
        return data;
    }

    public boolean insertUser(String username, String password) throws SQLException {
        String query = "INSERT INTO `user`(`idUser`, `namaLengkap`, `alamat`, `umur`, "
                + "`telepon`, `jabatan`, `username`, `password`, `level`) VALUES ('" + idUser + "','" + namaLengkap + "','" + alamat
                + "','" + umur + "','" + telepon + "','" + jabatan + "','" + username + "', '" + password
                + "', '" + level + "')";
        return getStatusQuery(query);
    }

    public DefaultTableModel getTabelUser() throws SQLException {
        for (int i = tablemodeluser.getRowCount() - 1; i >= 0; i--) {
            tablemodeluser.removeRow(i);
        }
        String sql = "select * from `user`";
        ResultSet rs = getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[9];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tablemodeluser.addRow(kolom);
        }
        return tablemodeluser;
    }
   
     public void save() throws SQLException {

        String sql = "insert into user values (null, '" + namaLengkap + "', '" + alamat + "', '" + umur + "', '" + telepon + 
                "', '" + jabatan + "', '"+username+"', '"+password+"', '"+level+"')";
        executeQuery(sql);
    }

    public void update() throws SQLException {
        String sql = "update user set namaLengkap = '" + namaLengkap + "', alamat = '" + alamat +
                "' , umur = '" + umur + "', telepon = '" + telepon + "', jabatan = '" + jabatan + "',"
                + "username = '"+username+"', password = '"+password+"', level = '"+level+"' where idUser =" + idUser;
        executeQuery(sql);
    }

    public void delete() throws SQLException {
        String sql = "delete from user where idUser =" + this.idUser;
        executeQuery(sql);

    }

}
