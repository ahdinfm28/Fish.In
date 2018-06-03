/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import m.bibit;
import m.user;
import v.addForm;
import v.adminView;
import v.editForm;

/**
 *
 * @author Farisya
 */
public class adminControl {

    String username;
    adminView home;
    user usermodels;
    bibit bibitmodels;
    editForm editform;
    boolean datauserBar = false, datalainBar = false, add, edit;
    addForm addform;

    public adminControl(String username) throws SQLException {
        this.home = new adminView();
        this.usermodels = new user();
        this.bibitmodels = new bibit();
        editform = new editForm();
        addform = new addForm();
        home.setVisible(true);
        this.username = username;
        home.setUname(username);
        home.dashboardView();
        home.klikDataUser(new dataUserBarAction());
        home.klikDataBibit(new dataBibitBarAction());
    }

    public class dataUserBarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                System.out.println("Klik bar user");
                datauserBar = true;
                System.out.println(datauserBar);
                home.dataUserView();
                home.showTabelUser(usermodels.getTabelUser());
                home.klikEditData(new editDataAction());
                home.klikAddData(new addButtonAction());
                home.klikDeleteData(new deleteUserButtonAction());
            } catch (SQLException ex) {
                Logger.getLogger(adminControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class dataBibitBarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                System.out.println("Klik bar rekap");
                datalainBar = true;
                home.dataRekapView();
                home.showTabelBibit(bibitmodels.getTabelPilihBibit());
                home.klikEditData(new editDataAction());
                home.klikAddData(new addButtonAction());
            } catch (SQLException ex) {
                Logger.getLogger(adminControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class addButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            addform.setVisible(true);
            addform.addUserView();
            addform.klikCancel(new cancelAdd());
            addform.klikSave(new saveButtonAction());
        }
    }

    public class saveButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                System.out.println("Klik save");
                usermodels.setNama(addform.getTextField1());
                usermodels.setAlamat(addform.getTextField2());
                usermodels.setUmur(addform.getTextField3());
                usermodels.setTelepon(addform.getTextField4());
                usermodels.setJabatan(addform.getTextField5());
                usermodels.setUsername(addform.getTextField6());
                usermodels.setPassword(addform.getTextField7());
                usermodels.setLevel(addform.getLevel());
                if (addform.getTextField1().equals("") || addform.getTextField2().equals("") || addform.getTextField3().equals("")
                        || addform.getTextField4().equals("") || addform.getTextField5().equals("")
                        || addform.getTextField6().equals("") || addform.getTextField7().equals("")) {
                    JOptionPane.showMessageDialog(addform, "Seluruh data harus diisi");
                } else {
                    usermodels.save();
                    addform.dispose();
                    home.showTabelUser(usermodels.getTabelUser());
                }
            } catch (SQLException ex) {
                Logger.getLogger(adminControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class editDataAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("klik2 edit");
            editform.setVisible(true);
            if (datauserBar == true) {
                editform.klikCancel(new cancelEdit());
                editform.editUserView();
                usermodels.setSelectedRowUser(home.getSelectedRowUser());
                editform.setId(usermodels.getId());
                editform.setTextField1(usermodels.getNama());
                editform.setTextField2(usermodels.getAlamat());
                editform.setTextField3(usermodels.getUmur());
                editform.setTextField4(usermodels.getTelepon());
                editform.setTextField5(usermodels.getJabatan());
                editform.setTextField6(usermodels.getUsername());
                editform.setTextField7(usermodels.getPassword());
                editform.klikUpdate(new updateDataAction());
                // editform.set(usermodels.getJabatan());
            } else if (datalainBar == true) {
                editform.klikCancel(new cancelEdit());
                editform.editLainView();
                bibitmodels.setSelectedRowBibit(home.getSelectedRowBibit());
                editform.setId(bibitmodels.getid());
//                editform.setTextField1(bibitmodels.getnama());
//                editform.setTextField2(bibitmodels.getAnu());
            }
        }
    }

    public class updateDataAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (datauserBar == true) {
                try {
                    usermodels.setNama(editform.getTextField1());
                    usermodels.setAlamat(editform.getTextField2());
                    usermodels.setUmur(editform.getTextField3());
                    usermodels.setTelepon(editform.getTextField4());
                    usermodels.setJabatan(editform.getTextField5());
                    usermodels.setUsername(editform.getTextField6());
                    usermodels.setPassword(editform.getTextField7());
                    usermodels.setLevel(editform.getLevel());
                    usermodels.setId(editform.getID());
                    usermodels.update();
                    editform.dispose();
                    home.showTabelUser(usermodels.getTabelUser());
                } catch (SQLException ex) {
                    Logger.getLogger(adminControl.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (datalainBar == true) {

            }
        }

    }

    public class deleteUserButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            usermodels.setSelectedRowUser(home.getSelectedRowUser());
            try {
                int pilih = JOptionPane.showConfirmDialog(home, "yakin menghapus data?");
                if (pilih == JOptionPane.OK_OPTION) {
                    usermodels.delete();
                    home.disableButton();
                    home.showTabelUser(usermodels.getTabelUser());
                } else if (pilih == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(home, "data batal dihapus");
                } else {
                }
            } catch (SQLException ex) {
                Logger.getLogger(adminControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class cancelEdit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("klik cancel edit");
            editform.dispose();
            System.out.println("setelah klikcancel,status bar user = " + datauserBar);
        }
    }

    public class cancelAdd implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("klik cancel add");
            addform.dispose();
            System.out.println("setelah klikcancel,status bar user = " + datalainBar);

        }
    }
}
