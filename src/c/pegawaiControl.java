/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import m.bibit;
import m.penebaranbibit;
import m.user;
import v.addForm;
import v.adminView;
import v.editForm;
import v.pegawaiView;

/**
 *
 * @author Farisya
 */
public class pegawaiControl {

    String username;
    pegawaiView home;
    penebaranbibit tebarbibitmodels;
    bibit bibitmodels;
    editForm editform;
    boolean tebarBibitBar = false, rekapPilihBar = false, pilihBibitBar = false, add, edit;
    addForm addform;
    double C1A1 = 0, C1A2 = 0, C1A3 = 0, C1A4 = 0, C1A5 = 0;
    double C2A1 = 0, C2A2 = 0, C2A3 = 0, C2A4 = 0, C2A5 = 0;
    double C3A1 = 0, C3A2 = 0, C3A3 = 0, C3A4 = 0, C3A5 = 0;
    double C4A1 = 0, C4A2 = 0, C4A3 = 0, C4A4 = 0, C4A5 = 0;
    double C5A1 = 0, C5A2 = 0, C5A3 = 0, C5A4 = 0, C5A5 = 0;
    double C6A1 = 0, C6A2 = 0, C6A3 = 0, C6A4 = 0, C6A5 = 0;
    double C7A1 = 0, C7A2 = 0, C7A3 = 0, C7A4 = 0, C7A5 = 0;

    double bC1A1, bC1A2 = 0, bC1A3 = 0, bC1A4 = 0, bC1A5 = 0;
    double bC2A1, bC2A2 = 0, bC2A3 = 0, bC2A4 = 0, bC2A5 = 0;
    double bC3A1, bC3A2 = 0, bC3A3 = 0, bC3A4 = 0, bC3A5 = 0;
    double bC4A1, bC4A2 = 0, bC4A3 = 0, bC4A4 = 0, bC4A5 = 0;
    double bC5A1, bC5A2 = 0, bC5A3 = 0, bC5A4 = 0, bC5A5 = 0;
    double bC6A1, bC6A2 = 0, bC6A3 = 0, bC6A4 = 0, bC6A5 = 0;
    double bC7A1, bC7A2 = 0, bC7A3 = 0, bC7A4 = 0, bC7A5 = 0;

    double A1C1, A2C1, A3C1, A4C1, A5C1;
    double A1C2, A2C2, A3C2, A4C2, A5C2;
    double A1C3, A2C3, A3C3, A4C3, A5C3;
    double A1C4, A2C4, A3C4, A4C4, A5C4;
    double A1C5, A2C5, A3C5, A4C5, A5C5;
    double A1C6, A2C6, A3C6, A4C6, A5C6;
    double A1C7, A2C7, A3C7, A4C7, A5C7;

    double suhu, oksigen, ph, ketinggian, kedalaman, kemiringan, A1, A2, A3, A4, A5, hasil1, hasil2, hasil3, hasil4, hasils[];
    String hasil, ikan;
    double b1 = 0.3, b2 = 0.2, b3 = 0.15, b4 = 0.12, b5 = 0.1, b6 = 0.8, b7 = 0.5;
    String tekstur;

    public pegawaiControl(String username) throws SQLException {
        this.home = new pegawaiView();
        this.tebarbibitmodels = new penebaranbibit();
        this.bibitmodels = new bibit();
        editform = new editForm();
        addform = new addForm();
        home.setVisible(true);
        this.username = username;
        home.setUname(username);
        home.dashboardView();
        home.klikPenebaranibit(new penebaranBibitBarAction());
        home.klikPemilihanBibit(new pemilihanBibitBarAction());
        home.klikRekapPilihBibit(new recordPilihBibitBarAction());
    }

    public class penebaranBibitBarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                System.out.println("Klik bar tebar");
                tebarBibitBar = true;
                System.out.println(tebarBibitBar);
                home.dataPenebaranBibitView();
                home.showTabelTebarBibit(tebarbibitmodels.getTabelTebarBibit());
                home.klikEditData(new editDataAction());
                home.klikAddData(new addButtonAction());
                home.klikDeleteData(new deleteUserButtonAction());
            } catch (SQLException ex) {
                Logger.getLogger(adminControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class recordPilihBibitBarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                System.out.println("Klik bar bibit");
                rekapPilihBar = true;
                home.dataRekapPilihanView();
                home.showTabelPilihBibit(bibitmodels.getTabelPilihBibit());
                home.klikSaveHasil(new saveHasilAction());
                // home.klikEditData(new editDataAction());
                // home.klikAddData(new addButtonAction());
                // home.klikDeleteData(new deleteUserButtonAction());
            } catch (SQLException ex) {
                Logger.getLogger(adminControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class pemilihanBibitBarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Klik bar user");
            pilihBibitBar = true;
            home.pemilihanBibitView();
            home.klikLihatHasil(new hasilAction());
//            home.klikEditData(new editDataAction());
//            home.klikAddData(new addButtonAction());
//            home.klikDeleteData(new deleteUserButtonAction());
        }
    }

    public class hasilAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MOORA();
            home.showHasil(String.valueOf(ikan));
//            home.klikEditData(new editDataAction());
//            home.klikAddData(new addButtonAction());
//            home.klikDeleteData(new deleteUserButtonAction());
        }
    }

    public class addButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            addform.setVisible(true);
            addform.addPenebaranBibitView();
            addform.klikCancel(new cancelAdd());
            addform.klikSave(new saveButtonAction());
        }
    }

    public class saveButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                System.out.println("Klik save");
                tebarbibitmodels.setNama(addform.getIkan());
                tebarbibitmodels.setTgl(addform.getTgl());
                tebarbibitmodels.setUmur(addform.getTextField3());
                tebarbibitmodels.setJml(addform.getTextField4());
                if (addform.getTextField3().equals("") || addform.getTextField4().equals("")) {
                    JOptionPane.showMessageDialog(addform, "Seluruh data harus diisi");
                } else {
                    tebarbibitmodels.save();
                    addform.dispose();
                    home.showTabelTebarBibit(tebarbibitmodels.getTabelTebarBibit());
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
            if (tebarBibitBar == true) {
                editform.klikCancel(new cancelEdit());
                editform.editPenebaranBibitView();
                tebarbibitmodels.setSelectedRowTebarBibit(home.getSelectedRowTebar());
                editform.setId(tebarbibitmodels.getid());
                editform.setIkan(tebarbibitmodels.getNama());
                editform.setTextField3(tebarbibitmodels.getUmur());
                editform.setTextField4(tebarbibitmodels.getJml());
                editform.klikUpdate(new updateDataAction());
                // editform.set(tebarbibitmodels.getJabatan());
            } else if (rekapPilihBar == true) {
//                editform.klikCancel(new adminControl.cancelEdit());
//                editform.editLainView();
//                bibitmodels.setSelectedRowBibit(home.getSelectedRowLain());
//                editform.setId(bibitmodels.getid());
//                editform.setTextField1(bibitmodels.getnama());
//                editform.setTextField2(bibitmodels.getAnu());
            }
        }
    }

    public class updateDataAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (tebarBibitBar == true) {
                try {
                    tebarbibitmodels.setNama(editform.getIkan());
                    tebarbibitmodels.setTgl(editform.getTgl());
                    tebarbibitmodels.setUmur(editform.getTextField3());
                    tebarbibitmodels.setJml(editform.getTextField4());
                    tebarbibitmodels.setId(editform.getID());
                    tebarbibitmodels.update();
                    editform.dispose();
                    home.showTabelTebarBibit(tebarbibitmodels.getTabelTebarBibit());
                } catch (SQLException ex) {
                    Logger.getLogger(adminControl.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (rekapPilihBar == true) {

            }
        }

    }

    public class deleteUserButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            tebarbibitmodels.setSelectedRowTebarBibit(home.getSelectedRowTebar());
            try {
                int pilih = JOptionPane.showConfirmDialog(home, "yakin menghapus data?");
                if (pilih == JOptionPane.OK_OPTION) {
                    tebarbibitmodels.delete();
                    home.disableButton();
                    home.showTabelTebarBibit(tebarbibitmodels.getTabelTebarBibit());
                } else if (pilih == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(home, "data batal dihapus");
                } else {
                }
            } catch (SQLException ex) {
                Logger.getLogger(adminControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class cancelAdd implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("klik cancel add");
            addform.dispose();

        }
    }

    public class cancelEdit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("klik cancel edit");
            editform.dispose();
        }
    }

    public void MOORA() {
        suhu = Double.valueOf(home.getSuhu());
        oksigen = Double.valueOf(home.getOksigen());
        ph = Double.valueOf(home.getPH());
        tekstur = home.getTekstur();
        kedalaman = Double.valueOf(home.getKedalaman());
        kemiringan = Double.valueOf(home.getKemiringan());
        ketinggian = Double.valueOf(home.getKetinggian());
        if (suhu < 20 || suhu > 27) {
            C1A1 = 1;
        } else if (24 <= suhu && suhu <= 27) {
            C1A1 = 5;
        } else if (20 <= suhu && 24 > suhu) {
            C1A1 = 3;
        }
        if (suhu > 30 || suhu < 20) {
            C1A2 = 1;
            C1A3 = 1;
        } else if (suhu >= 25 && suhu <= 30) {
            C1A2 = 5;
            C1A3 = 5;
        } else if (suhu < 25 && suhu >= 20) {
            C1A2 = 3;
            C1A3 = 3;
        }
        if (suhu < 26 || suhu > 31) {
            C1A4 = 1;
            C1A5 = 1;
        } else if (suhu >= 28 && suhu <= 31) {
            C1A4 = 5;
            C1A5 = 5;
        } else if (suhu < 28 && suhu >= 26) {
            C1A4 = 3;
            C1A5 = 3;
        }
        if (ph < 5 || ph > 9) {
            C2A1 = 1;
        } else if (ph > 6 && ph < 9) {
            C2A1 = 5;
        } else if (ph <= 6 && ph >= 5) {
            C2A1 = 3;
        }
        if (ph < 5 || ph > 7) {
            C2A2 = 1;
        } else if (ph >= 6.5 && ph <= 7) {
            C2A2 = 5;
        } else if (ph >= 5 && ph < 6.5) {
            C2A2 = 3;
        }
        if (ph > 8 || ph < 6) {
            C2A3 = 1;
            C2A5 = 1;
        } else if (ph <= 8 && ph >= 7) {
            C2A3 = 5;
            C2A5 = 5;
        } else if (ph >= 6 && ph < 7) {
            C2A3 = 3;
            C2A5 = 3;
        }
        if (ph > 7 || ph < 6) {
            C2A4 = 1;
        } else if (ph <= 7 && ph >= 6.5) {
            C2A4 = 5;
        } else if (ph >= 6 && ph < 6.5) {
            C2A4 = 3;
        }
        if (oksigen <= 2 || oksigen > 4) {
            C3A1 = 1;
        } else if (oksigen == 3) {
            C3A1 = 5;
            C3A2 = 5;
        } else if (oksigen == 4) {
            C3A1 = 3;
        }
        if (oksigen < 3 || oksigen > 4) {
            C3A2 = 1;
        } else if (oksigen > 3 && oksigen <= 4) {
            C3A2 = 3;
        }
        if (oksigen < 4 || oksigen > 6.5) {
            C3A3 = 1;
            C3A4 = 1;
        } else if (oksigen >= 4 && oksigen <= 6) {
            C3A3 = 5;
            C3A4 = 5;
        } else if (oksigen > 6 && oksigen <= 6.5) {
            C3A3 = 3;
            C3A4 = 3;
        }
        if (oksigen > 5 || oksigen < 4) {
            C3A5 = 1;
        } else if (oksigen == 5) {
            C3A5 = 5;
        } else if (oksigen < 5 && oksigen >= 4) {
            C3A5 = 3;
        }
        if (tekstur.equalsIgnoreCase("tanah liat")) {
            C4A1 = 3;
            C4A2 = 5;
            C4A3 = 3;
            C4A4 = 3;
            C4A5 = 5;
        } else if (tekstur.equalsIgnoreCase("tanah lempung")) {
            C4A1 = 5;
            C4A2 = 3;
            C4A3 = 5;
            C4A4 = 5;
            C4A5 = 1;
        } else if (tekstur.equalsIgnoreCase("tanah pasir")) {
            C4A1 = 1;
            C4A2 = 1;
            C4A3 = 1;
            C4A4 = 1;
            C4A5 = 3;
        }
        if (ketinggian > 700 || ketinggian < 100) {
            C5A1 = 1;
        } else if (ketinggian > 100 && ketinggian <= 700) {
            C5A1 = 5;
        } else if (ketinggian == 100) {
            C5A1 = 3;
        }
        if (ketinggian > 900) {
            C5A2 = 1;
            C5A4 = 1;
        } else if (ketinggian > 0 && ketinggian <= 800) {
            C5A2 = 5;
            C5A4 = 5;
        } else if (ketinggian > 800 && ketinggian <= 900) {
            C5A2 = 3;
            C5A4 = 3;
        }
        if (ketinggian < 50) {
            C5A3 = 1;
        } else if (ketinggian >= 50 && ketinggian <= 500) {
            C5A3 = 5;
        } else if (ketinggian > 500) {
            C5A3 = 3;
        }
        if (ketinggian > 600 || ketinggian < 100) {
            C5A5 = 1;
        } else if (ketinggian >= 100 && ketinggian <= 500) {
            C5A5 = 5;
        } else if (ketinggian > 500 && ketinggian <= 600) {
            C5A5 = 3;
        }
        if (kedalaman < 0.75) {
            C6A1 = 1;
        } else if (kedalaman >= 0.75 && kedalaman < 1.5) {
            C6A1 = 5;
        } else if (kedalaman >= 1.5) {
            C6A1 = 3;
        }
        if (kedalaman < 0.9) {
            C6A2 = 1;
        } else if (kedalaman >= 1.2) {
            C6A2 = 5;
            C6A5 = 5;
        } else if (kedalaman >= 0.9 && kedalaman < 1.2) {
            C6A2 = 3;
        }
        if (kedalaman < 0.7 || kedalaman > 1.2) {
            C6A3 = 1;
        } else if (kedalaman >= 0.7 && kedalaman <= 1) {
            C6A3 = 5;
        } else if (kedalaman > 1 && kedalaman <= 1.2) {
            C6A3 = 3;
        }
        if (kedalaman > 2) {
            C6A4 = 1;
        } else if (kedalaman > 1 && kedalaman <= 2) {
            C6A4 = 5;
        } else if (kedalaman <= 1) {
            C6A4 = 3;
        }
        if (kedalaman < 0.7) {
            C6A5 = 1;
        } else if (kedalaman >= 0.7 && kedalaman < 1.2) {
            C6A5 = 3;
        }
        if (kemiringan > 15 || kemiringan < 5) {
            C7A1 = 1;
            C7A2 = 1;
            C7A3 = 1;
            C7A4 = 1;
        } else if (kemiringan >= 5 && kemiringan <= 10) {
            C7A1 = 5;
            C7A2 = 5;
            C7A3 = 5;
            C7A4 = 5;
        } else if (kemiringan > 10 && kemiringan <= 15) {
            C7A1 = 3;
            C7A2 = 3;
            C7A3 = 3;
            C7A4 = 3;
        }
        if (kemiringan > 15 || kemiringan < 3) {
            C7A5 = 1;
        } else if (kemiringan >= 3 && kemiringan <= 5) {
            C7A5 = 5;
        } else if (kemiringan > 5 && kemiringan <= 15) {
            C7A5 = 3;
        }
        System.out.println("" + C1A1 + C2A1 + C3A1 + C4A1 + C5A1 + C6A1 + C7A1);
        System.out.println("" + C1A2 + C2A2 + C3A2 + C4A2 + C5A2 + C6A2 + C7A2);
        System.out.println("" + C1A3 + C2A3 + C3A3 + C4A3 + C5A3 + C6A3 + C7A3);
        System.out.println("" + C1A4 + C2A4 + C3A4 + C4A4 + C5A4 + C6A4 + C7A4);
        System.out.println("" + C1A5 + C2A5 + C3A5 + C4A5 + C5A5 + C6A5 + C7A5);

        A1C1 = C1A1 / (Math.sqrt(Math.pow(C1A1, 2) + Math.pow(C1A2, 2) + Math.pow(C1A3, 2) + Math.pow(C1A4, 2) + Math.pow(C1A5, 2)));
        A1C2 = C2A1 / (Math.sqrt(Math.pow(C2A1, 2) + Math.pow(C2A2, 2) + Math.pow(C2A3, 2) + Math.pow(C2A4, 2) + Math.pow(C2A5, 2)));
        A1C3 = C3A1 / (Math.sqrt(Math.pow(C3A1, 2) + Math.pow(C3A2, 2) + Math.pow(C3A3, 2) + Math.pow(C3A4, 2) + Math.pow(C3A5, 2)));
        A1C4 = C4A1 / (Math.sqrt(Math.pow(C4A1, 2) + Math.pow(C4A2, 2) + Math.pow(C4A3, 2) + Math.pow(C4A4, 2) + Math.pow(C4A5, 2)));
        A1C5 = C5A1 / (Math.sqrt(Math.pow(C5A1, 2) + Math.pow(C5A2, 2) + Math.pow(C5A3, 2) + Math.pow(C5A4, 2) + Math.pow(C5A5, 2)));
        A1C6 = C6A1 / (Math.sqrt(Math.pow(C6A1, 2) + Math.pow(C6A2, 2) + Math.pow(C6A3, 2) + Math.pow(C6A4, 2) + Math.pow(C6A5, 2)));
        A1C7 = C7A1 / (Math.sqrt(Math.pow(C7A1, 2) + Math.pow(C7A2, 2) + Math.pow(C7A3, 2) + Math.pow(C7A4, 2) + Math.pow(C7A5, 2)));
        A2C1 = C1A2 / (Math.sqrt(Math.pow(C1A1, 2) + Math.pow(C1A2, 2) + Math.pow(C1A3, 2) + Math.pow(C1A4, 2) + Math.pow(C1A5, 2)));
        A2C2 = C2A2 / (Math.sqrt(Math.pow(C2A1, 2) + Math.pow(C2A2, 2) + Math.pow(C2A3, 2) + Math.pow(C2A4, 2) + Math.pow(C2A5, 2)));
        A2C3 = C3A2 / (Math.sqrt(Math.pow(C3A1, 2) + Math.pow(C3A2, 2) + Math.pow(C3A3, 2) + Math.pow(C3A4, 2) + Math.pow(C3A5, 2)));
        A2C4 = C4A2 / (Math.sqrt(Math.pow(C4A1, 2) + Math.pow(C4A2, 2) + Math.pow(C4A3, 2) + Math.pow(C4A4, 2) + Math.pow(C4A5, 2)));
        A2C5 = C5A2 / (Math.sqrt(Math.pow(C5A1, 2) + Math.pow(C5A2, 2) + Math.pow(C5A3, 2) + Math.pow(C5A4, 2) + Math.pow(C5A5, 2)));
        A2C6 = C6A2 / (Math.sqrt(Math.pow(C6A1, 2) + Math.pow(C6A2, 2) + Math.pow(C6A3, 2) + Math.pow(C6A4, 2) + Math.pow(C6A5, 2)));
        A2C7 = C7A2 / (Math.sqrt(Math.pow(C7A1, 2) + Math.pow(C7A2, 2) + Math.pow(C7A3, 2) + Math.pow(C7A4, 2) + Math.pow(C7A5, 2)));
        A3C1 = C1A3 / (Math.sqrt(Math.pow(C1A1, 2) + Math.pow(C1A2, 2) + Math.pow(C1A3, 2) + Math.pow(C1A4, 2) + Math.pow(C1A5, 2)));
        A3C2 = C2A3 / (Math.sqrt(Math.pow(C2A1, 2) + Math.pow(C2A2, 2) + Math.pow(C2A3, 2) + Math.pow(C2A4, 2) + Math.pow(C2A5, 2)));
        A3C3 = C3A3 / (Math.sqrt(Math.pow(C3A1, 2) + Math.pow(C3A2, 2) + Math.pow(C3A3, 2) + Math.pow(C3A4, 2) + Math.pow(C3A5, 2)));
        A3C4 = C4A3 / (Math.sqrt(Math.pow(C4A1, 2) + Math.pow(C4A2, 2) + Math.pow(C4A3, 2) + Math.pow(C4A4, 2) + Math.pow(C4A5, 2)));
        A3C5 = C5A3 / (Math.sqrt(Math.pow(C5A1, 2) + Math.pow(C5A2, 2) + Math.pow(C5A3, 2) + Math.pow(C5A4, 2) + Math.pow(C5A5, 2)));
        A3C6 = C6A3 / (Math.sqrt(Math.pow(C6A1, 2) + Math.pow(C6A2, 2) + Math.pow(C6A3, 2) + Math.pow(C6A4, 2) + Math.pow(C6A5, 2)));
        A3C7 = C7A3 / (Math.sqrt(Math.pow(C7A1, 2) + Math.pow(C7A2, 2) + Math.pow(C7A3, 2) + Math.pow(C7A4, 2) + Math.pow(C7A5, 2)));
        A4C1 = C1A4 / (Math.sqrt(Math.pow(C1A1, 2) + Math.pow(C1A2, 2) + Math.pow(C1A3, 2) + Math.pow(C1A4, 2) + Math.pow(C1A5, 2)));
        A4C2 = C2A4 / (Math.sqrt(Math.pow(C2A1, 2) + Math.pow(C2A2, 2) + Math.pow(C2A3, 2) + Math.pow(C2A4, 2) + Math.pow(C2A5, 2)));
        A4C3 = C3A4 / (Math.sqrt(Math.pow(C3A1, 2) + Math.pow(C3A2, 2) + Math.pow(C3A3, 2) + Math.pow(C3A4, 2) + Math.pow(C3A5, 2)));
        A4C4 = C4A4 / (Math.sqrt(Math.pow(C4A1, 2) + Math.pow(C4A2, 2) + Math.pow(C4A3, 2) + Math.pow(C4A4, 2) + Math.pow(C4A5, 2)));
        A4C5 = C5A4 / (Math.sqrt(Math.pow(C5A1, 2) + Math.pow(C5A2, 2) + Math.pow(C5A3, 2) + Math.pow(C5A4, 2) + Math.pow(C5A5, 2)));
        A4C6 = C6A4 / (Math.sqrt(Math.pow(C6A1, 2) + Math.pow(C6A2, 2) + Math.pow(C6A3, 2) + Math.pow(C6A4, 2) + Math.pow(C6A5, 2)));
        A4C7 = C7A4 / (Math.sqrt(Math.pow(C7A1, 2) + Math.pow(C7A2, 2) + Math.pow(C7A3, 2) + Math.pow(C7A4, 2) + Math.pow(C7A5, 2)));
        A5C1 = C1A5 / (Math.sqrt(Math.pow(C1A1, 2) + Math.pow(C1A2, 2) + Math.pow(C1A3, 2) + Math.pow(C1A4, 2) + Math.pow(C1A5, 2)));
        A5C2 = C2A5 / (Math.sqrt(Math.pow(C2A1, 2) + Math.pow(C2A2, 2) + Math.pow(C2A3, 2) + Math.pow(C2A4, 2) + Math.pow(C2A5, 2)));
        A5C3 = C3A5 / (Math.sqrt(Math.pow(C3A1, 2) + Math.pow(C3A2, 2) + Math.pow(C3A3, 2) + Math.pow(C3A4, 2) + Math.pow(C3A5, 2)));
        A5C4 = C4A5 / (Math.sqrt(Math.pow(C4A1, 2) + Math.pow(C4A2, 2) + Math.pow(C4A3, 2) + Math.pow(C4A4, 2) + Math.pow(C4A5, 2)));
        A5C5 = C5A5 / (Math.sqrt(Math.pow(C5A1, 2) + Math.pow(C5A2, 2) + Math.pow(C5A3, 2) + Math.pow(C5A4, 2) + Math.pow(C5A5, 2)));
        A5C6 = C6A5 / (Math.sqrt(Math.pow(C6A1, 2) + Math.pow(C6A2, 2) + Math.pow(C6A3, 2) + Math.pow(C6A4, 2) + Math.pow(C6A5, 2)));
        A5C7 = C7A5 / (Math.sqrt(Math.pow(C7A1, 2) + Math.pow(C7A2, 2) + Math.pow(C7A3, 2) + Math.pow(C7A4, 2) + Math.pow(C7A5, 2)));

        System.out.println("---------MATRIX---------");
        System.out.println(A1C1 + " " + A1C2 + " " + A1C3 + " " + A1C4 + " " + A1C5 + " " + A1C6 + " " + A1C7);
        System.out.println(A2C1 + " " + A2C2 + " " + A2C3 + " " + A2C4 + " " + A2C5 + " " + A2C6 + " " + A2C7);
        System.out.println(A3C1 + " " + A3C2 + " " + A3C3 + " " + A3C4 + " " + A3C5 + " " + A3C6 + " " + A3C7);
        System.out.println(A4C1 + " " + A4C2 + " " + A4C3 + " " + A4C4 + " " + A4C5 + " " + A4C6 + " " + A4C7);
        System.out.println(A5C1 + " " + A5C2 + " " + A5C3 + " " + A5C4 + " " + A5C5 + " " + A5C6 + " " + A5C7);

        bC1A1 = A1C1 * b1;
        bC1A2 = A2C1 * b1;
        bC1A3 = A3C1 * b1;
        bC1A4 = A4C1 * b1;
        bC1A5 = A5C1 * b1;
        bC2A1 = A1C2 * b2;
        bC2A2 = A2C2 * b2;
        bC2A3 = A3C2 * b2;
        bC2A4 = A4C2 * b2;
        bC2A5 = A5C2 * b2;
        bC3A1 = A1C3 * b3;
        bC3A2 = A2C3 * b3;
        bC3A3 = A3C3 * b3;
        bC3A4 = A4C3 * b3;
        bC3A5 = A5C3 * b3;
        bC4A1 = A1C4 * b4;
        bC4A2 = A2C4 * b4;
        bC4A3 = A3C4 * b4;
        bC4A4 = A4C4 * b4;
        bC5A5 = A5C4 * b5;
        bC5A1 = A1C5 * b5;
        bC5A2 = A2C5 * b5;
        bC5A3 = A3C5 * b5;
        bC5A4 = A4C5 * b5;
        bC5A5 = A5C5 * b5;
        bC6A5 = A5C6 * b6;
        bC6A1 = A1C6 * b6;
        bC6A2 = A2C6 * b6;
        bC6A3 = A3C6 * b6;
        bC6A4 = A4C6 * b6;
        bC6A5 = A5C6 * b6;
        bC6A5 = A5C6 * b6;
        bC7A1 = A1C7 * b7;
        bC7A2 = A2C7 * b7;
        bC7A3 = A3C7 * b7;
        bC7A4 = A4C7 * b7;
        bC7A5 = A5C7 * b7;
        System.out.println("---------------BOBOT---------------");
        System.out.println(" " + bC1A1 + " " + bC2A1 + " " + bC3A1 + " " + bC4A1 + " " + bC5A1 + " " + bC6A1 + " " + bC7A1);
        System.out.println("" + bC1A2 + " " + bC2A2 + " " + bC3A2 + " " + bC4A2 + " " + bC5A2 + " " + bC6A2 + " " + bC7A2);
        System.out.println("" + bC1A3 + " " + bC2A3 + " " + bC3A3 + " " + bC4A3 + " " + bC5A3 + " " + bC6A3 + " " + bC7A3);
        System.out.println("" + bC1A4 + " " + bC2A4 + " " + bC3A4 + " " + bC4A4 + " " + bC5A4 + " " + bC6A4 + " " + bC7A4);
        System.out.println("" + bC1A5 + " " + bC2A5 + " " + bC3A5 + " " + bC4A5 + " " + bC5A5 + " " + bC6A5 + " " + bC7A5);

        A1 = bC1A1 + bC2A1 + bC3A1 + bC4A1 + bC5A1 - (bC6A1 + bC7A1);
        A2 = bC1A2 + bC2A2 + bC3A2 + bC4A2 + bC5A2 - (bC6A2 + bC7A2);
        A3 = bC1A3 + bC2A3 + bC3A3 + bC4A3 + bC5A3 - (bC6A3 + bC7A3);
        A4 = bC1A4 + bC2A4 + bC3A4 + bC4A4 + bC5A4 - (bC6A4 + bC7A4);
        A5 = bC1A5 + bC2A5 + bC3A5 + bC4A5 + bC5A5 - (bC6A5 + bC7A5);
        System.out.println("A1= " + A1);
        System.out.println("A2= " + A2);
        System.out.println("A3= " + A3);
        System.out.println("A4= " + A4);
        System.out.println("A5= " + A5);
        hasils = new double[5];
        hasils[0] = A1;
        hasils[1] = A2;
        hasils[2] = A3;
        hasils[3] = A4;
        hasils[4] = A5;
        System.out.println("--------------------");
        System.out.println("-------Sorting------");

        sorting(hasils, hasils.length);
        for (int i = 0; i < hasils.length; i++) {
            System.out.println(hasils[i] + "\n");
        }
//        for (double x : hasils) {
//            System.out.println(x + "");
//        }
//        Arrays.sort(hasils);
//        for (double x : hasils) {
//            System.out.println(hasils[0]);
//        }
        System.out.println("--------MAX------------");
        hasil = String.valueOf(hasils[0]);
        hasil1 = Math.max(A1, A2);
        hasil2 = Math.max(A3, A4);
        hasil3 = Math.max(hasil1, hasil2);
        hasil4 = Math.max(hasil3, A5);
        System.out.println(hasil4);
        if (hasil4 == A1) {
            ikan = "Lele";
        } else if (hasil4 == A2) {
            ikan = "Bawal";
        } else if (hasil4 == A3) {
            ikan = "Gurame";
        } else if (hasil4 == A4) {
            ikan = "Patin";
        } else if (hasil4 == A5) {
            ikan = "Nila";
        }
    }

    public void sorting(double array[], int n) {
        for (int i = 0; i < n; i++) {
            int indexmin = i;
            for (int j = i; j < n; j++) {
                if (array[indexmin] < array[j]) {
                    indexmin = j;
                }
            }
            double temp = array[i];
            array[i] = array[indexmin];
            array[indexmin] = temp;
        }
    }

    public class saveHasilAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                System.out.println("Klik save hasil");
                bibitmodels.setHasil(home.getHasil());
                bibitmodels.setOksigen(home.getOksigen());
                bibitmodels.setSuhu(home.getSuhu());
                bibitmodels.setPH(home.getPH());
                bibitmodels.setKedalaman(home.getKedalaman());
                bibitmodels.setKemiringan(home.getKemiringan());
                bibitmodels.setKetinggian(home.getKetinggian());
                bibitmodels.setTekstur(home.getTekstur());
                bibitmodels.save();
                home.showTabelPilihBibit(bibitmodels.getTabelPilihBibit());
            } catch (SQLException ex) {
                Logger.getLogger(pegawaiControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
