package m;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Farisya
 */
public class koneksi {

    Connection con;
    Statement stm;
    ResultSet rs;

    public koneksi() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sppk";
        String username = "root";
        String pass = "";
        this.con = (Connection) DriverManager.getConnection(url, username, pass);
        this.stm = (Statement) this.con.createStatement();
    }

    protected void executeQuery(String query) throws SQLException {
        this.stm.execute(query);
    }

    protected ResultSet getResult(String query) throws SQLException {
        this.rs = stm.executeQuery(query);
        return rs;
    }

//    public int checkId(String query) throws SQLException {
//        int id = 0;
//        ResultSet hasil;
//        do {
//            id++;
//            hasil = getResult(query + id);
//        } while (hasil.next());
//        return id;
//    }

    public boolean getStatusQuery(String query) throws SQLException {
        boolean getStatusQuery = false;
        try {
            executeQuery(query);
            getStatusQuery = true;
        } catch (SQLException ex) {
            getStatusQuery = false;
        } finally {
            if (stm != null) {
                stm.close();
            }
        }
        return getStatusQuery;
    }

    public int getDataInt(String query) throws SQLException {
        ResultSet hasil = getResult(query);
        hasil.next();
        int getDataInt = hasil.getInt(1);
        return getDataInt;
    }
}
