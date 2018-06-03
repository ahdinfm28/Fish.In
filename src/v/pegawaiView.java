/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Farisya
 */
public class pegawaiView extends javax.swing.JFrame {

    /**
     * Creates new form adminView
     */
    public pegawaiView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void klikPemilihanBibit(ActionListener a) {
        pemilihanBibitBar.addActionListener(a);
    }

    public void klikPenebaranibit(ActionListener a) {
        penebaranBibitBar.addActionListener(a);
    }

    public void klikRekapPilihBibit(ActionListener a) {
        recordPilihBibit.addActionListener(a);
    }

    public void klikLihatHasil(ActionListener a) {
        hasilButton.addActionListener(a);
    }

    public void klikSaveHasil(ActionListener a) {
        savehasil.addActionListener(a);
    }

    public void klikEditData(ActionListener a) {
        editButton.addActionListener(a);
    }

    public void klikDeleteData(ActionListener a) {
        deleteButton.addActionListener(a);
    }

    public void klikAddData(ActionListener a) {
        addButton.addActionListener(a);
    }

    public void setUname(String username) {
        usernamelabel.setText(username);

    }

    public void showHasil(String h) {
        labelhasil.setText(h);

    }

    public void dashboardView() {
        penebaranbibit.setVisible(false);
        hasilPemilihan.setVisible(false);
        dataLabel.setText("Welcome to Dashboard");
        pathlabel.setText("Pegawai / Home");
        editButton.setVisible(false);
        addButton.setVisible(false);
        deleteButton.setVisible(false);
        suhukolam.setVisible(false);
        tekstur.setVisible(false);
        ketinggian.setVisible(false);
        kemiringan.setVisible(false);
        oksigen.setVisible(false);
        ph.setVisible(false);
        kedalaman.setVisible(false);
        tf_kedalaman.setVisible(false);
        tf_kemiringan.setVisible(false);
        tf_ketinggian.setVisible(false);
        tf_oksigen.setVisible(false);
        tf_pH.setVisible(false);
        tf_suhu.setVisible(false);
        pilihTekstur.setVisible(false);
        form.setVisible(false);
        hasilButton.setVisible(false);
        labelhasil.setVisible(false);
        savehasil.setVisible(false);
    }

    public void dataPenebaranBibitView() {
        penebaranbibit.setVisible(true);
        hasilPemilihan.setVisible(false);
        dataLabel.setText("Data User");
        pathlabel.setText("Admin / Home / DataUser");
        editButton.setVisible(true);
        deleteButton.setVisible(true);
        editButton.setEnabled(false);
        deleteButton.setEnabled(false);
        addButton.setVisible(true);
    }

    public void dataRekapPilihanView() {
        penebaranbibit.setVisible(false);
        hasilPemilihan.setVisible(true);
        dataLabel.setText("Rekap Data");
        pathlabel.setText("Admin / Home / RekapData");
        editButton.setVisible(true);
        addButton.setVisible(true);
        deleteButton.setVisible(true);
        editButton.setEnabled(false);
        deleteButton.setEnabled(false);
        suhukolam.setVisible(false);
        tekstur.setVisible(false);
        ketinggian.setVisible(false);
        kemiringan.setVisible(false);
        oksigen.setVisible(false);
        ph.setVisible(false);
        kedalaman.setVisible(false);
        tf_kedalaman.setVisible(false);
        tf_kemiringan.setVisible(false);
        tf_ketinggian.setVisible(false);
        tf_oksigen.setVisible(false);
        tf_pH.setVisible(false);
        tf_suhu.setVisible(false);
        pilihTekstur.setVisible(false);
        form.setVisible(false);
        hasilButton.setVisible(false);
        labelhasil.setVisible(false);
        savehasil.setVisible(false);
    }

    public void pemilihanBibitView() {
        penebaranbibit.setVisible(false);
        hasilPemilihan.setVisible(false);
        dataLabel.setText("Data ");
        pathlabel.setText("Admin / Home / PemilihanBibit");
        editButton.setVisible(true);
        addButton.setVisible(true);
        deleteButton.setVisible(true);
        editButton.setEnabled(false);
        deleteButton.setEnabled(false);
        suhukolam.setVisible(true);
        tekstur.setVisible(true);
        ketinggian.setVisible(true);
        kemiringan.setVisible(true);
        oksigen.setVisible(true);
        ph.setVisible(true);
        kedalaman.setVisible(true);
        tf_kedalaman.setVisible(true);
        tf_kemiringan.setVisible(true);
        tf_ketinggian.setVisible(true);
        tf_oksigen.setVisible(true);
        tf_pH.setVisible(true);
        tf_suhu.setVisible(true);
        pilihTekstur.setVisible(true);
        form.setVisible(true);
        hasilButton.setVisible(true);
        labelhasil.setVisible(true);
        savehasil.setVisible(true);
    }

    public String getTekstur() {
        String isi = (String) pilihTekstur.getSelectedItem();
        return isi;
    }

    public String getSuhu() {
        String isi = tf_suhu.getText();
        return isi;
    }

    public String getOksigen() {
        String isi = tf_oksigen.getText();
        return isi;
    }

    public String getPH() {
        String isi = tf_pH.getText();
        return isi;
    }

    public String getKetinggian() {
        String isi = tf_ketinggian.getText();
        return isi;
    }

    public String getKedalaman() {
        String isi = tf_kedalaman.getText();
        return isi;
    }

    public String getKemiringan() {
        String isi = tf_kemiringan.getText();
        return isi;
    }

    public String getHasil() {
        String isi = labelhasil.getText();
        return isi;
    }

    public void showTabelTebarBibit(DefaultTableModel tm) {
        tabelpenebaran.setModel(tm);
    }

    public void showTabelPilihBibit(DefaultTableModel tm) {
        pilihbbit.setModel(tm);
    }

    public int getSelectedRowTebar() {
        int baris = tabelpenebaran.getSelectedRow();
        return baris;
    }

    public int getSelectedRowLain() {
        int baris = pilihbbit.getSelectedRow();
        return baris;
    }

    public void disableButton() {
        editButton.setEnabled(false);
        hasilButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Bar = new javax.swing.JPanel();
        recordPilihBibit = new javax.swing.JButton();
        levellabel = new javax.swing.JLabel();
        usernamelabel = new javax.swing.JLabel();
        pemilihanBibitBar = new javax.swing.JButton();
        penebaranBibitBar = new javax.swing.JButton();
        ButtonBar = new javax.swing.JPanel();
        pathlabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        dataLabel = new javax.swing.JLabel();
        tf_suhu = new javax.swing.JTextField();
        tf_oksigen = new javax.swing.JTextField();
        tf_pH = new javax.swing.JTextField();
        tf_ketinggian = new javax.swing.JTextField();
        tf_kedalaman = new javax.swing.JTextField();
        tf_kemiringan = new javax.swing.JTextField();
        suhukolam = new javax.swing.JLabel();
        oksigen = new javax.swing.JLabel();
        ph = new javax.swing.JLabel();
        tekstur = new javax.swing.JLabel();
        kemiringan = new javax.swing.JLabel();
        kedalaman = new javax.swing.JLabel();
        ketinggian = new javax.swing.JLabel();
        form = new javax.swing.JLabel();
        hasilButton = new javax.swing.JButton();
        labelhasil = new javax.swing.JLabel();
        savehasil = new javax.swing.JButton();
        pilihTekstur = new javax.swing.JComboBox<>();
        hasilPemilihan = new javax.swing.JScrollPane();
        pilihbbit = new javax.swing.JTable();
        penebaranbibit = new javax.swing.JScrollPane();
        tabelpenebaran = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(225, 225, 225));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(225, 225, 225));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bar.setBackground(new java.awt.Color(0, 102, 153));
        Bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recordPilihBibit.setBackground(new java.awt.Color(59, 140, 180));
        recordPilihBibit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recordPilihBibit.setForeground(new java.awt.Color(255, 255, 255));
        recordPilihBibit.setText("Rekap Pilihan Bibit");
        recordPilihBibit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));
        recordPilihBibit.setBorderPainted(false);
        recordPilihBibit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recordPilihBibit.setFocusPainted(false);
        recordPilihBibit.setHideActionText(true);
        recordPilihBibit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordPilihBibitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recordPilihBibitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recordPilihBibitMouseExited(evt);
            }
        });
        recordPilihBibit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordPilihBibitActionPerformed(evt);
            }
        });
        Bar.add(recordPilihBibit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 200, 40));

        levellabel.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        levellabel.setForeground(new java.awt.Color(255, 255, 255));
        levellabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levellabel.setText("Pegawai");
        Bar.add(levellabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 60));

        usernamelabel.setBackground(new java.awt.Color(204, 204, 255));
        usernamelabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernamelabel.setForeground(new java.awt.Color(204, 204, 255));
        usernamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bar.add(usernamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 20));

        pemilihanBibitBar.setBackground(new java.awt.Color(59, 140, 180));
        pemilihanBibitBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pemilihanBibitBar.setForeground(new java.awt.Color(255, 255, 255));
        pemilihanBibitBar.setText("Pemilihan Bibit");
        pemilihanBibitBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));
        pemilihanBibitBar.setBorderPainted(false);
        pemilihanBibitBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pemilihanBibitBar.setFocusPainted(false);
        pemilihanBibitBar.setHideActionText(true);
        pemilihanBibitBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pemilihanBibitBarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pemilihanBibitBarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pemilihanBibitBarMouseExited(evt);
            }
        });
        pemilihanBibitBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemilihanBibitBarActionPerformed(evt);
            }
        });
        Bar.add(pemilihanBibitBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 40));

        penebaranBibitBar.setBackground(new java.awt.Color(59, 140, 180));
        penebaranBibitBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        penebaranBibitBar.setForeground(new java.awt.Color(255, 255, 255));
        penebaranBibitBar.setText("Penebaran Bibit");
        penebaranBibitBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));
        penebaranBibitBar.setBorderPainted(false);
        penebaranBibitBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        penebaranBibitBar.setFocusPainted(false);
        penebaranBibitBar.setHideActionText(true);
        penebaranBibitBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penebaranBibitBarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                penebaranBibitBarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                penebaranBibitBarMouseExited(evt);
            }
        });
        penebaranBibitBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penebaranBibitBarActionPerformed(evt);
            }
        });
        Bar.add(penebaranBibitBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 40));

        bg.add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        ButtonBar.setBackground(new java.awt.Color(0, 102, 153));
        ButtonBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pathlabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pathlabel.setForeground(new java.awt.Color(225, 225, 225));
        ButtonBar.add(pathlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 20));

        editButton.setBackground(new java.awt.Color(224, 193, 72));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit Selected Data");
        editButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));
        editButton.setBorderPainted(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.setFocusPainted(false);
        editButton.setHideActionText(true);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editButtonMouseExited(evt);
            }
        });
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        ButtonBar.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 150, 40));

        addButton.setBackground(new java.awt.Color(59, 140, 180));
        addButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add Data");
        addButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));
        addButton.setBorderPainted(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setFocusPainted(false);
        addButton.setHideActionText(true);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        ButtonBar.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 40));

        deleteButton.setBackground(new java.awt.Color(245, 142, 142));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete Selected Data");
        deleteButton.setBorder(null);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonMouseExited(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        ButtonBar.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 140, 40));

        bg.add(ButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 1040, 100));

        dataLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        dataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.add(dataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 1040, 50));
        bg.add(tf_suhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 150, 40));
        bg.add(tf_oksigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 150, 40));
        bg.add(tf_pH, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 150, 40));
        bg.add(tf_ketinggian, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 150, 40));
        bg.add(tf_kedalaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 150, 40));
        bg.add(tf_kemiringan, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 150, 40));

        suhukolam.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        suhukolam.setText("Suhu Kolam ( ⁰C )");
        bg.add(suhukolam, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 130, 40));

        oksigen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        oksigen.setText("Oksigen Terlarut (mg/l)");
        bg.add(oksigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 140, 40));

        ph.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ph.setText("Tingkat Keasaman (pH)");
        bg.add(ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 130, 40));

        tekstur.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tekstur.setText("Tekstur Tanah");
        bg.add(tekstur, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 120, 40));

        kemiringan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        kemiringan.setText("Kemiringan Kolam (%)");
        bg.add(kemiringan, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 140, 30));

        kedalaman.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        kedalaman.setText("Kedalaman Kolam (meter)");
        bg.add(kedalaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 140, 30));

        ketinggian.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ketinggian.setText("Ketinggian Tanah (mdpl)");
        bg.add(ketinggian, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 140, 40));

        form.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        form.setText("Form Kriteria Kolam");
        bg.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        hasilButton.setBackground(new java.awt.Color(102, 153, 0));
        hasilButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hasilButton.setForeground(new java.awt.Color(255, 255, 255));
        hasilButton.setText("Lihat Hasil");
        hasilButton.setBorder(null);
        hasilButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hasilButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hasilButtonMouseExited(evt);
            }
        });
        hasilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilButtonActionPerformed(evt);
            }
        });
        bg.add(hasilButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 150, 40));
        bg.add(labelhasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, 130, 40));

        savehasil.setBackground(new java.awt.Color(102, 153, 0));
        savehasil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savehasil.setForeground(new java.awt.Color(255, 255, 255));
        savehasil.setText("Save");
        savehasil.setBorder(null);
        savehasil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savehasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savehasilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savehasilMouseExited(evt);
            }
        });
        savehasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savehasilActionPerformed(evt);
            }
        });
        bg.add(savehasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 570, 150, 40));

        pilihTekstur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tanah Liat", "Tanah Lempung", "Tanah Pasir" }));
        pilihTekstur.setSelectedIndex(-1);
        bg.add(pilihTekstur, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 150, 40));

        hasilPemilihan.setBorder(null);

        pilihbbit.setBackground(new java.awt.Color(225, 225, 225));
        pilihbbit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pilihbbit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pilihbbit.setIntercellSpacing(new java.awt.Dimension(2, 2));
        pilihbbit.setRowHeight(30);
        pilihbbit.setSelectionBackground(new java.awt.Color(255, 255, 255));
        pilihbbit.setSelectionForeground(new java.awt.Color(0, 102, 153));
        pilihbbit.setShowHorizontalLines(false);
        pilihbbit.setShowVerticalLines(false);
        pilihbbit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilihbbitMouseClicked(evt);
            }
        });
        hasilPemilihan.setViewportView(pilihbbit);

        bg.add(hasilPemilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 1040, 460));

        penebaranbibit.setBorder(null);

        tabelpenebaran.setBackground(new java.awt.Color(225, 225, 225));
        tabelpenebaran.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tabelpenebaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelpenebaran.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabelpenebaran.setSelectionForeground(new java.awt.Color(0, 102, 153));
        tabelpenebaran.setShowHorizontalLines(false);
        tabelpenebaran.setShowVerticalLines(false);
        tabelpenebaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpenebaranMouseClicked(evt);
            }
        });
        penebaranbibit.setViewportView(tabelpenebaran);

        bg.add(penebaranbibit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 1040, 460));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recordPilihBibitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordPilihBibitMouseEntered
//        datalainbutton.setBackground(new Color(225, 225, 225));
        recordPilihBibit.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_recordPilihBibitMouseEntered

    private void recordPilihBibitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordPilihBibitMouseExited
//        datalainbutton.setBackground(new Color(59, 140, 180));
        recordPilihBibit.setForeground(Color.WHITE);
    }//GEN-LAST:event_recordPilihBibitMouseExited

    private void recordPilihBibitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordPilihBibitActionPerformed
    }//GEN-LAST:event_recordPilihBibitActionPerformed

    private void editButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseEntered
        editButton.setBackground(new Color(211, 181, 64));
    }//GEN-LAST:event_editButtonMouseEntered

    private void editButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseExited
        editButton.setBackground(new Color(224, 193, 72));
    }//GEN-LAST:event_editButtonMouseExited

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void pemilihanBibitBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemilihanBibitBarMouseEntered
//        datauserbutton.setBackground(new Color(225, 225, 225));
        pemilihanBibitBar.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_pemilihanBibitBarMouseEntered

    private void pemilihanBibitBarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemilihanBibitBarMouseExited
//        datauserbutton.setBackground(new Color(59, 140, 180));
        pemilihanBibitBar.setForeground(Color.WHITE);
    }//GEN-LAST:event_pemilihanBibitBarMouseExited

    private void pemilihanBibitBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemilihanBibitBarActionPerformed

    }//GEN-LAST:event_pemilihanBibitBarActionPerformed

    private void hasilButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hasilButtonMouseEntered
        hasilButton.setBackground(new Color(117, 172, 6));
    }//GEN-LAST:event_hasilButtonMouseEntered

    private void hasilButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hasilButtonMouseExited
        hasilButton.setBackground(new Color(102, 153, 0));
    }//GEN-LAST:event_hasilButtonMouseExited

    private void hasilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilButtonActionPerformed

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        addButton.setBackground(new Color(53, 121, 154));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setBackground(new Color(59, 140, 180));
    }//GEN-LAST:event_addButtonMouseExited

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void pemilihanBibitBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemilihanBibitBarMouseClicked
        pemilihanBibitBar.setBackground(new Color(225, 225, 225));
        pemilihanBibitBar.setForeground(new Color(0, 102, 153));
        recordPilihBibit.setBackground(new Color(59, 140, 180));
        penebaranBibitBar.setBackground(new Color(59, 140, 180));

    }//GEN-LAST:event_pemilihanBibitBarMouseClicked

    private void recordPilihBibitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordPilihBibitMouseClicked
        recordPilihBibit.setBackground(new Color(225, 225, 225));
        recordPilihBibit.setForeground(new Color(0, 102, 153));
        pemilihanBibitBar.setBackground(new Color(59, 140, 180));
        penebaranBibitBar.setBackground(new Color(59, 140, 180));

    }//GEN-LAST:event_recordPilihBibitMouseClicked

    private void penebaranBibitBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penebaranBibitBarMouseClicked
        penebaranBibitBar.setBackground(new Color(225, 225, 225));
        penebaranBibitBar.setForeground(new Color(0, 102, 153));
        recordPilihBibit.setBackground(new Color(59, 140, 180));
        pemilihanBibitBar.setBackground(new Color(59, 140, 180));
    }//GEN-LAST:event_penebaranBibitBarMouseClicked

    private void penebaranBibitBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penebaranBibitBarMouseEntered
        penebaranBibitBar.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_penebaranBibitBarMouseEntered

    private void penebaranBibitBarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penebaranBibitBarMouseExited
        penebaranBibitBar.setForeground(Color.WHITE);
    }//GEN-LAST:event_penebaranBibitBarMouseExited

    private void penebaranBibitBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penebaranBibitBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penebaranBibitBarActionPerformed

    private void pilihbbitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilihbbitMouseClicked
        editButton.setEnabled(true);
        hasilButton.setEnabled(true);
    }//GEN-LAST:event_pilihbbitMouseClicked

    private void tabelpenebaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpenebaranMouseClicked
        editButton.setEnabled(true);
        hasilButton.setEnabled(true);
    }//GEN-LAST:event_tabelpenebaranMouseClicked

    private void deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonMouseEntered

    private void deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonMouseExited

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void savehasilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savehasilMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_savehasilMouseEntered

    private void savehasilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savehasilMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_savehasilMouseExited

    private void savehasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savehasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savehasilActionPerformed

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
            java.util.logging.Logger.getLogger(pegawaiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pegawaiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pegawaiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pegawaiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pegawaiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bar;
    private javax.swing.JPanel ButtonBar;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel form;
    private javax.swing.JButton hasilButton;
    private javax.swing.JScrollPane hasilPemilihan;
    private javax.swing.JLabel kedalaman;
    private javax.swing.JLabel kemiringan;
    private javax.swing.JLabel ketinggian;
    private javax.swing.JLabel labelhasil;
    private javax.swing.JLabel levellabel;
    private javax.swing.JLabel oksigen;
    private javax.swing.JLabel pathlabel;
    private javax.swing.JButton pemilihanBibitBar;
    private javax.swing.JButton penebaranBibitBar;
    private javax.swing.JScrollPane penebaranbibit;
    private javax.swing.JLabel ph;
    private javax.swing.JComboBox<String> pilihTekstur;
    private javax.swing.JTable pilihbbit;
    private javax.swing.JButton recordPilihBibit;
    private javax.swing.JButton savehasil;
    private javax.swing.JLabel suhukolam;
    private javax.swing.JTable tabelpenebaran;
    private javax.swing.JLabel tekstur;
    private javax.swing.JTextField tf_kedalaman;
    private javax.swing.JTextField tf_kemiringan;
    private javax.swing.JTextField tf_ketinggian;
    private javax.swing.JTextField tf_oksigen;
    private javax.swing.JTextField tf_pH;
    private javax.swing.JTextField tf_suhu;
    private javax.swing.JLabel usernamelabel;
    // End of variables declaration//GEN-END:variables
}
