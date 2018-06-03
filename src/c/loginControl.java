/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import v.mainView;
import m.user;
import v.pegawaiView;

/**
 *
 * @author Farisya
 */
public class loginControl {

    mainView mainmenu;
    user auth;

    public loginControl(mainView v) throws SQLException {
        this.mainmenu = v;
        v.setVisible(true);
        this.auth = new user();
        mainmenu.klikLogin(new loginAct());
    }

    private class loginAct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                if (mainmenu.getUsername().isEmpty()) {
                    mainmenu.tampilPesan("Silahkan isi username dahulu");
                } else if (mainmenu.getPassword().isEmpty()) {
                    mainmenu.tampilPesan("Silahkan isi password dulu");
                } else if (auth.cekUser(mainmenu.getUsername(), mainmenu.getPassword())) {
                    System.out.println(auth.getLevel(mainmenu.getUsername(), mainmenu.getPassword()));
                    if (auth.getLevel(mainmenu.getUsername(), mainmenu.getPassword()).equalsIgnoreCase("ADMIN")) {
                        System.out.println("masuk sini");
                        new adminControl(mainmenu.getUsername());
                        System.out.println(mainmenu.getUsername());
                        mainmenu.dispose();
                    } else {
                        new pegawaiControl(mainmenu.getUsername());
                        System.out.println(mainmenu.getUsername());
                        mainmenu.dispose();
                    }
                } else {
                    mainmenu.tampilPesan("Username/Password Salah");
                }
            } catch (SQLException ex) {
                System.out.println("ada sesuatu");
            }
        }
    }
}
