/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Farisya
 */
public class bibit extends koneksi {

    DefaultTableModel tablemodelbibit;
    String suhu, id, oksigen, ph, tekstur, ketinggian, kedalaman, kemiringan, hasil;

    public bibit() throws SQLException {
        super();

        String header[] = {"No", "Suhu", "Oksigen", "TeksturTanah", "pH", "Ketinggian", "Kedalaman", "Kemiringan", "Hasil"};
        tablemodelbibit = new DefaultTableModel(null, header);

    }

    public String getSuhu() {
        return suhu;
    }

    public String getid() {
        return id;
    }

    public String getPH() {
        return ph;
    }

    public String getOksigen() {
        return oksigen;
    }

    public String getKedalaman() {
        return kedalaman;
    }

    public String getKetinggian() {
        return ketinggian;
    }

    public String getKemiringan() {
        return kemiringan;
    }

    public String getTekstur() {
        return tekstur;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHasil(String h) {
        this.hasil = h;
    }

    public void setSuhu(String h) {
        this.suhu = h;
    }

    public void setOksigen(String h) {
        this.oksigen = h;
    }

    public void setTekstur(String h) {
        this.tekstur = h;
    }

    public void setKedalaman(String h) {
        this.kedalaman = h;
    }

    public void setKemiringan(String h) {
        this.kemiringan = h;
    }

    public void setKetinggian(String h) {
        this.ketinggian = h;
    }

    public void setPH(String h) {
        this.ph = h;
    }

    public void setSelectedRowBibit(int baris) {
        this.id = tablemodelbibit.getValueAt(baris, 0).toString();
        this.suhu = tablemodelbibit.getValueAt(baris, 1).toString();
        this.oksigen = tablemodelbibit.getValueAt(baris, 2).toString();
        this.tekstur = tablemodelbibit.getValueAt(baris, 3).toString();
        this.ph = tablemodelbibit.getValueAt(baris, 4).toString();
        this.ketinggian = tablemodelbibit.getValueAt(baris, 5).toString();
        this.kedalaman = tablemodelbibit.getValueAt(baris, 6).toString();
        this.kemiringan = tablemodelbibit.getValueAt(baris, 7).toString();
        this.hasil = tablemodelbibit.getValueAt(baris, 8).toString();
    }

    public DefaultTableModel getTabelPilihBibit() throws SQLException {
        for (int i = tablemodelbibit.getRowCount() - 1; i >= 0; i--) {
            tablemodelbibit.removeRow(i);
        }
        String sql = "select * from `pemilihanbibit`";
        ResultSet rs = getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[9];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tablemodelbibit.addRow(kolom);
        }
        return tablemodelbibit;
    }

    public void save() throws SQLException {

        String sql = "insert into pemilihanbibit values (null, '" + suhu + "', '" + oksigen + "', '" + tekstur + "', '" + ph
                + "', '" + ketinggian + "', '" + kedalaman + "', '" + kemiringan + "', '" + hasil + "')";
        executeQuery(sql);
        System.out.println(sql);
    }
}
