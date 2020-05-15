package BigProject;

import java.awt.EventQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PenjualanMotor extends javax.swing.JFrame {

    int bebek, sport, matik, diskon, total, harga, totaldiskon, a;
    
    Pattern p;
    Matcher m;
    
    DefaultTableModel model;

    public PenjualanMotor() {
        initComponents();
        model = (DefaultTableModel) tabel.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_pembeli = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        cmb_merek = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        rd_bebek = new javax.swing.JRadioButton();
        rd_sport = new javax.swing.JRadioButton();
        rd_matik = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_jenis = new javax.swing.JComboBox<>();
        btn_Hitung = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        t_diskon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_Beli_Lagi = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btn_insert = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        t_harga = new javax.swing.JLabel();
        t_total = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_id_motor = new javax.swing.JComboBox<>();
        btn_detail = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setText("NAMA PEMBELI");

        jLabel2.setFont(new java.awt.Font("Rockwell Nova Extra Bold", 1, 24)); // NOI18N
        jLabel2.setText("JAWARA SHOWROOM MOTOR");

        jScrollPane1.setViewportView(t_pembeli);

        jLabel3.setText("MEREK MOTOR");

        cmb_merek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH KENDARAAN--", "HONDA", "YAMAHA", "KAWASAKI", "SUZUKI", " ", " " }));
        cmb_merek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_merekActionPerformed(evt);
            }
        });

        jLabel4.setText("JENIS MOTOR");

        buttonGroup1.add(rd_bebek);
        rd_bebek.setText("BEBEK");
        rd_bebek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_bebekMouseClicked(evt);
            }
        });
        rd_bebek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_bebekActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_sport);
        rd_sport.setText("SPORT");
        rd_sport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_sportActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_matik);
        rd_matik.setText("MATIK");
        rd_matik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_matikActionPerformed(evt);
            }
        });

        jLabel5.setText("HARGA");

        jLabel6.setText("JENIS BAYAR");

        cmb_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--JENIS PEMBAYARAN--", "CASH", "KREDIT", " " }));
        cmb_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_jenisActionPerformed(evt);
            }
        });

        btn_Hitung.setText("HITUNG");
        btn_Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HitungActionPerformed(evt);
            }
        });

        jLabel7.setText("DISKON (%)");

        t_diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_diskonActionPerformed(evt);
            }
        });

        jLabel8.setText("TOTAL BAYAR");

        btn_Beli_Lagi.setText("BELI LAGI");
        btn_Beli_Lagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Beli_LagiActionPerformed(evt);
            }
        });

        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Pembeli", "Merk Motor", "Jenis Motor", "ID Motor", "Harga", "Jenis Bayar", "Diskon", "Total Bayar"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel);

        btn_insert.setText("INSERT");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        t_harga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        t_total.setBackground(new java.awt.Color(255, 0, 0));
        t_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("ID MOTOR");

        cmb_id_motor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH ID MOTOR--", "HB001", "HM001", "HS001", "YB001", "YM001", "YS001", "SB001", "SM001", "SS001", "KB001", "KM001", "KS001" }));
        cmb_id_motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_id_motorActionPerformed(evt);
            }
        });

        btn_detail.setForeground(new java.awt.Color(51, 51, 51));
        btn_detail.setText("DETAIL");
        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });

        btn_print.setText("PRINT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(btn_Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(cmb_id_motor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_merek, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rd_bebek)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addComponent(rd_sport)
                                        .addGap(34, 34, 34)
                                        .addComponent(rd_matik))
                                    .addComponent(t_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_jenis, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_diskon))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Beli_Lagi)
                                    .addComponent(btn_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel2)))
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(btn_insert)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete)
                                .addGap(18, 18, 18)
                                .addComponent(btn_update)
                                .addGap(112, 242, Short.MAX_VALUE))
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_print)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_merek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rd_bebek)
                    .addComponent(rd_sport)
                    .addComponent(rd_matik))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmb_id_motor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_detail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Hitung)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t_total, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btn_Beli_Lagi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert)
                    .addComponent(btn_delete)
                    .addComponent(btn_update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_keluar)
                    .addComponent(btn_print))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//  Spesifikasi Motor Honda
    public void hm001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : HONDA VARIO 125" + "\n" + 
                                                        "Harga : Rp. 20.200.000" + "\n" +
                                                        "Warna : Putih" + "\n" +
                                                        "Th Pembuatan : 2015" + "\n" +
                                                        "Isi Silinder : 125 CC" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/vario.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void hb001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : HONDA SUPRA X 125" + "\n" + 
                                                        "Harga : Rp. 17.800.000" + "\n" +
                                                        "Warna : Merah" + "\n" +
                                                        "Th Pembuatan : 2015" + "\n" +
                                                        "Isi Silinder : 125 CC" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/supra.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void hs001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : HONDA CBR 250 RR" + "\n" + 
                                                        "Harga : Rp. 72.600.000" + "\n" +
                                                        "Warna : MERAH" + "\n" +
                                                        "Th Pembuatan : 2018" + "\n" +
                                                        "Isi Silinder : 250 CC" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/cbr.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
//  Spesifikasi Motor Yamaha
    public void ym001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : YAMAHA FINO SPORTY" + "\n" + 
                                                        "Harga : Rp. 18.200.000" + "\n" +
                                                        "Warna : BIRU" + "\n" +
                                                        "Th Pembuatan : 2015" + "\n" +
                                                        "Isi Silinder : 125 CC" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/fino.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void yb001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : YAMAHA MX KING 150" + "\n" + 
                                                        "Harga : Rp. 23.400.000" + "\n" +
                                                        "Warna : BIRU" + "\n" +
                                                        "Th Pembuatan : 2019" + "\n" +
                                                        "Isi Silinder : 150 CC" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/MX.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void ys001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : YAMAHA YZF R15" + "\n" + 
                                                        "Harga : Rp 36.000.000" + "\n" +
                                                        "Warna : BIRU" + "\n" +
                                                        "Th Pembuatan : 2019" + "\n" +
                                                        "Isi Silinder : 155 CC" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/YZF.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

//  Spesifikasi Motor Kawasaki
    public void km001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : KAWASAKI" + "\n" + 
                                                        "Harga : 18.500.000" + "\n" +
                                                        "Warna : Merah" + "\n" +
                                                        "Th Pembuatan : 2015" + "\n" +
                                                        "Isi Silinder : 125" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/kawasaki.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void ks001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : KAWASAKI NINJA 250" + "\n" + 
                                                        "Harga : RP. 63.800.000" + "\n" +
                                                        "Warna : HIJAU" + "\n" +
                                                        "Th Pembuatan : 2016" + "\n" +
                                                        "Isi Silinder : 250" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/ninja.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void kb001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : KAWASAKI" + "\n" + 
                                                        "Harga : 18.500.000" + "\n" +
                                                        "Warna : Merah" + "\n" +
                                                        "Th Pembuatan : 2015" + "\n" +
                                                        "Isi Silinder : 125" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/kawasaki.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
//  Spesifikasi Motor Suzuki
    public void sm001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : SUZUKI NEX II" + "\n" + 
                                                        "Harga : RP 15.100.000" + "\n" +
                                                        "Warna : BIRU" + "\n" +
                                                        "Th Pembuatan : 2018" + "\n" +
                                                        "Isi Silinder : 115" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/nex.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void sb001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : SUZUKI SMASH FI" + "\n" + 
                                                        "Harga : RP. 15.300.000" + "\n" +
                                                        "Warna : Merah" + "\n" +
                                                        "Th Pembuatan : 2017" + "\n" +
                                                        "Isi Silinder : 115" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/smash.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void ss001(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                     
                    JOptionPane.showMessageDialog(null, "Merek : SUZUKI SATRIA F150" + "\n" + 
                                                        "Harga : RP. 23.800.000" + "\n" +
                                                        "Warna : HITAM" + "\n" +
                                                        "Th Pembuatan : 2018" + "\n" +
                                                        "Isi Silinder : 150" + "\n" ,
                                                        "Image OptionPane",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("../src/img/satria.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    private void cmb_merekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_merekActionPerformed

    }//GEN-LAST:event_cmb_merekActionPerformed

    private void rd_bebekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_bebekMouseClicked

    }//GEN-LAST:event_rd_bebekMouseClicked

    private void rd_bebekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_bebekActionPerformed

    }//GEN-LAST:event_rd_bebekActionPerformed

    private void rd_sportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_sportActionPerformed

    }//GEN-LAST:event_rd_sportActionPerformed

    private void rd_matikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_matikActionPerformed

    }//GEN-LAST:event_rd_matikActionPerformed

    private void cmb_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_jenisActionPerformed

        //HONDA
        if(cmb_merek.getSelectedItem().equals("HONDA"))
        {
            if (cmb_id_motor.getSelectedItem().equals("HM001")) 
                {
                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=3;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=1;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                } 
            
            else if (cmb_id_motor.getSelectedItem().equals("HB001")) 
                {   
                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=2;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=1;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                }            

            else if (cmb_id_motor.getSelectedItem().equals("HS001")) 
                {   
                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=5;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=2;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                }            
        }
        
        // YAMAHA
        else if(cmb_merek.getSelectedItem().equals("YAMAHA"))
        {
            if (cmb_id_motor.getSelectedItem().equals("YM001")) 
                {

                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=3;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=1;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                } 
            
            else if (cmb_id_motor.getSelectedItem().equals("YB001")) 
                {   
                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=2;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=1;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                }            

            else if (cmb_id_motor.getSelectedItem().equals("YS001")) 
                {   
                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=5;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=2;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                }
        }
        //SUZUKI
        else if(cmb_merek.getSelectedItem().equals("SUZUKI"))
        {
            if (cmb_id_motor.getSelectedItem().equals("SM001")) 
                {

                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=3;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=1;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                } 
            
            else if (cmb_id_motor.getSelectedItem().equals("SB001")) 
                {   
                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=2;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=1;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                }            

            else if (cmb_id_motor.getSelectedItem().equals("SS001")) 
                {   
                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=5;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=2;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                }
        }
        //KAWASAKI
        else if(cmb_merek.getSelectedItem().equals("KAWASAKI"))
        {
            if (cmb_id_motor.getSelectedItem().equals("KM001")) 
                {

                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=3;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=1;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                } 
            
            else if (cmb_id_motor.getSelectedItem().equals("KB001")) 
                {   
                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=2;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=1;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                }            

            else if (cmb_id_motor.getSelectedItem().equals("KS001")) 
                {   
                    if(cmb_jenis.getSelectedItem().equals("CASH"))
                        {
                            diskon=5;
                            t_diskon.setText(String.valueOf(diskon));
                        }
                    else if(cmb_jenis.getSelectedItem().equals("KREDIT"))
                        {
                            diskon=2;
                            t_diskon.setText(String.valueOf(diskon));
                        }                
                }
        }
        
    }//GEN-LAST:event_cmb_jenisActionPerformed

    private void btn_HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HitungActionPerformed
        harga = Integer.parseInt( t_harga.getText() );
        diskon = Integer.parseInt( t_diskon.getText() );
        
        totaldiskon = (diskon*harga)/100;
        total = (harga-totaldiskon);

        t_total.setText( String.valueOf(total) );
    }//GEN-LAST:event_btn_HitungActionPerformed

    private void btn_Beli_LagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Beli_LagiActionPerformed
        t_pembeli.setText("");
        cmb_merek.setSelectedItem("--PILIH KENDARAAN--");
        cmb_id_motor.setSelectedItem("--PILIH ID MOTOR--");
        t_harga.setText("");
        buttonGroup1.clearSelection();
        cmb_jenis.setSelectedItem("--JENIS PEMBAYARAN--");       
        t_diskon.setText("");        
        t_total.setText("");
        t_pembeli.requestFocus();
    }//GEN-LAST:event_btn_Beli_LagiActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        int answere = JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan keluar?", "Selesai", 
                JOptionPane.OK_OPTION);
        if (answere == JOptionPane.OK_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed

        String jenis_motor= "";
        
        if (rd_bebek.isSelected()){
            jenis_motor = rd_bebek.getText();
        }
        else if(rd_sport.isSelected()){
            jenis_motor = rd_sport.getText();
        }
        else if(rd_matik.isSelected()){
            jenis_motor = rd_matik.getText();
        }
        
        p = Pattern.compile( "(([a-z]+[ ]?|[A-Z]+['-]?)+)" );
        m = p.matcher( t_pembeli.getText() );
        
        if ( m.matches() ){

            model.addRow( new Object[]  
                        { 
                            t_pembeli.getText(), cmb_merek.getSelectedItem().toString(), jenis_motor, cmb_id_motor.getSelectedItem().toString(),
                            t_harga.getText(), cmb_jenis.getSelectedItem().toString(), t_diskon.getText(), t_total.getText() 
                        } 
                    );
        }
        
        else{
            JOptionPane.showMessageDialog(rootPane, "Nama Tidak Valid");
        }

    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
            "Apakah anda yakin akan menghapus?",
            "Hapus",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null);

        if(jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Hapus");
            model.removeRow( tabel.getSelectedRow() );
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void cmb_id_motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_id_motorActionPerformed
  
//      ID Motor Honda
        if( cmb_merek.getSelectedItem().equals("HONDA") )
            {
                if (cmb_id_motor.getSelectedItem().equals("HB001") ) {
                    a = 17800000;
                    t_harga.setText( String.valueOf(a) );
                } else if (cmb_id_motor.getSelectedItem().equals("HS001") ) {
                    a = 72600000;
                    t_harga.setText( String.valueOf(a) );
                } else if (cmb_id_motor.getSelectedItem().equals("HM001") ) {
                    a = 20200000;
                    t_harga.setText( String.valueOf(a) );
                }
            }
        
//      ID Motor Yamaha
        else if( cmb_merek.getSelectedItem().equals("YAMAHA") )
            {
                if (cmb_id_motor.getSelectedItem().equals("YB001") ) {
                    a = 23400000;
                    t_harga.setText( String.valueOf(a) );
                } else if (cmb_id_motor.getSelectedItem().equals("YS001") ) {
                    a = 36000000;
                    t_harga.setText( String.valueOf(a) );
                } else if (cmb_id_motor.getSelectedItem().equals("YM001") ) {
                    a = 18200000;
                    t_harga.setText( String.valueOf(a) );
                }
            }
        
//      ID Motor Kawasaki
        else if( cmb_merek.getSelectedItem().equals("KAWASAKI") )
            {
                if (cmb_id_motor.getSelectedItem().equals("KB001") ) {
                    a = 17800000;
                    t_harga.setText( String.valueOf(a) );
                } else if (cmb_id_motor.getSelectedItem().equals("KS001") ) {
                    a = 63800000;
                    t_harga.setText( String.valueOf(a) );
                } else if (cmb_id_motor.getSelectedItem().equals("KM001") ) {
                    a = 20200000;
                    t_harga.setText( String.valueOf(a) );
                }
            }
        
//      ID Motor Suzuki
        else if( cmb_merek.getSelectedItem().equals("SUZUKI") )
            {
                if (cmb_id_motor.getSelectedItem().equals("SB001") ) {
                    a = 15300000;
                    t_harga.setText( String.valueOf(a) );
                } else if (cmb_id_motor.getSelectedItem().equals("SS001") ) {
                    a = 23800000;
                    t_harga.setText( String.valueOf(a) );
                } else if (cmb_id_motor.getSelectedItem().equals("SM001") ) {
                    a = 15100000;
                    t_harga.setText( String.valueOf(a) );
                }
            }
        
    }//GEN-LAST:event_cmb_id_motorActionPerformed

    private void t_diskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_diskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_diskonActionPerformed

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailActionPerformed

//      ID Motor Honda
        if (cmb_id_motor.getSelectedItem().equals("HM001") ) {
            hm001();
        } else if(cmb_id_motor.getSelectedItem().equals("HB001") ){
            hb001();
        } else if(cmb_id_motor.getSelectedItem().equals("HS001") ){
            hs001();
        } 
        
//      ID Motor Yamaha
          else if(cmb_id_motor.getSelectedItem().equals("YM001") ){
            ym001();
        } else if(cmb_id_motor.getSelectedItem().equals("YB001") ){
            yb001();
        } else if(cmb_id_motor.getSelectedItem().equals("YS001") ){
            ys001();
        }
          
//      ID Motor Kawasaki
          else if(cmb_id_motor.getSelectedItem().equals("KM001") ){
            km001();
        } else if(cmb_id_motor.getSelectedItem().equals("KB001") ){
            kb001();
        } else if(cmb_id_motor.getSelectedItem().equals("KS001") ){
            ks001();
        }
          
//      ID Motor Suzuki
          else if(cmb_id_motor.getSelectedItem().equals("SM001") ){
            sm001();
        } else if(cmb_id_motor.getSelectedItem().equals("SB001") ){
            sb001();
        } else if(cmb_id_motor.getSelectedItem().equals("SS001") ){
            ss001();
        }

    }//GEN-LAST:event_btn_detailActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        t_pembeli.setText( tabel.getValueAt 
                        (tabel.getSelectedRow(), 0).toString() 
                    );
        cmb_merek.setSelectedItem(tabel.getValueAt 
                                (tabel.getSelectedRow(), 1).toString() 
                            );
        
//      Radio button jenis motor
        if (tabel.getValueAt ( tabel.getSelectedRow(), 2 ) .equals( rd_bebek.getText() ) ) {
            rd_bebek.setSelected(true);
        } else if
            (tabel.getValueAt(tabel.getSelectedRow(), 2).equals( rd_matik.getText() ) ){
            rd_matik.setSelected(true);    
        } else if
            (tabel.getValueAt(tabel.getSelectedRow(), 2).equals( rd_sport.getText() ) ){
            rd_sport.setSelected(true);    
        }
        
        cmb_id_motor.setSelectedItem(tabel.getValueAt 
                                (tabel.getSelectedRow(), 3).toString() 
                            );
        t_harga.setText( tabel.getValueAt 
                        (tabel.getSelectedRow(), 4).toString() 
                    );
        cmb_jenis.setSelectedItem(tabel.getValueAt 
                                (tabel.getSelectedRow(), 5).toString() 
                            );
        t_diskon.setText( tabel.getValueAt 
                        (tabel.getSelectedRow(), 6).toString() 
                    );
        t_total.setText( tabel.getValueAt 
                        (tabel.getSelectedRow(), 7).toString() 
                    );
    }//GEN-LAST:event_tabelMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        tabel.setValueAt(t_pembeli.getText(), 
                tabel.getSelectedRow(), 0);
        tabel.setValueAt(cmb_merek.getSelectedItem(), 
                tabel.getSelectedRow(), 1);
        
//      Radio button Merek Motor
        String MerekMotor = "";
        if (rd_bebek.isSelected()){
            MerekMotor = rd_bebek.getText();
        } else if(rd_matik.isSelected()){
            MerekMotor = rd_matik.getText();
        } else if(rd_sport.isSelected()){
            MerekMotor = rd_matik.getText();
        }       
        tabel.setValueAt(MerekMotor, tabel.getSelectedRow(), 2);
        
        tabel.setValueAt(cmb_id_motor.getSelectedItem(), 
                tabel.getSelectedRow(), 3);
        tabel.setValueAt(t_harga.getText(), 
                tabel.getSelectedRow(), 4);
        tabel.setValueAt(cmb_jenis.getSelectedItem(), 
                tabel.getSelectedRow(), 5);
        tabel.setValueAt(t_diskon.getText(), 
                tabel.getSelectedRow(), 6);
        tabel.setValueAt(t_total.getText(), 
                tabel.getSelectedRow(), 7);
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenjualanMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Beli_Lagi;
    private javax.swing.JButton btn_Hitung;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_detail;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_id_motor;
    private javax.swing.JComboBox<String> cmb_jenis;
    private javax.swing.JComboBox<String> cmb_merek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rd_bebek;
    private javax.swing.JRadioButton rd_matik;
    private javax.swing.JRadioButton rd_sport;
    private javax.swing.JTextField t_diskon;
    private javax.swing.JLabel t_harga;
    private javax.swing.JTextPane t_pembeli;
    private javax.swing.JLabel t_total;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
