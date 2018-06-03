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
public class penebaranbibit extends koneksi {

    DefaultTableModel tablemodeltebarbibit;
    String tgl, id, nama, umur, jml;

    public penebaranbibit() throws SQLException {
        super();

        String header[] = {"No", "Tanggal", "NamaBibit", "Umur", "Jumlah"};
        tablemodeltebarbibit = new DefaultTableModel(null, header);

    }

    public String getNama() {
        return nama;
    }

    public String getid() {
        return id;
    }

    public String getUmur() {
        return umur;
    }

    public String getJml() {
        return jml;
    }

    public String getTgl() {
        return tgl;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public void setTgl(String t) {
        this.tgl = t;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJml(String j) {
        this.jml = j;
    }

  
    public void setSelectedRowTebarBibit(int baris) {
        this.id = tablemodeltebarbibit.getValueAt(baris, 0).toString();
        this.tgl = tablemodeltebarbibit.getValueAt(baris, 1).toString();
        this.nama = tablemodeltebarbibit.getValueAt(baris, 2).toString();
        this.umur = tablemodeltebarbibit.getValueAt(baris, 3).toString();
        this.jml = tablemodeltebarbibit.getValueAt(baris, 4).toString();
    }

    public DefaultTableModel getTabelTebarBibit() throws SQLException {
        for (int i = tablemodeltebarbibit.getRowCount() - 1; i >= 0; i--) {
            tablemodeltebarbibit.removeRow(i);
        }
        String sql = "select * from `penebaranbibit`";
        ResultSet rs = getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[5];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tablemodeltebarbibit.addRow(kolom);
        }
        return tablemodeltebarbibit;
    } 
      public void save() throws SQLException {

        String sql = "insert into penebaranbibit values (null, '" + tgl + "', '" + nama + "', '" + umur + "', '"+ jml +"')";
          System.out.println(sql);
        executeQuery(sql);
    }

    public void update() throws SQLException {
        String sql = "update penebaranbibit set namaBibit = '" + nama + "', tanggal = '" + tgl +
                "' , umur = '" + umur + "', jumlah = '" + jml + "' where idTebar =" + id;
        executeQuery(sql);
    }

    public void delete() throws SQLException {
        String sql = "delete from penebaranbibit where idTebar =" + this.id;
        executeQuery(sql);

    }

}
