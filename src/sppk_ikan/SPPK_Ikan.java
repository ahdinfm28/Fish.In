/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppk_ikan;

import c.loginControl;
import java.sql.SQLException;
import v.mainView;

/**
 *
 * @author Farisya
 */
public class SPPK_Ikan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        mainView v = new mainView();
        new loginControl(v);
    }

}
