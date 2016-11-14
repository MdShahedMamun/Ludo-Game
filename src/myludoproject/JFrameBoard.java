package myludoproject;

import java.util.Arrays;
import javax.swing.*;

public class JFrameBoard extends javax.swing.JFrame {

    public static JFrameBoard jFrameBoard = new JFrameBoard();//this is the only object for playing which memebers used by other class by JFrameBoard.jFrameBoard.member reference
    public JLabel labels[] = new JLabel[100];//Arrray of jlabel, containig reference of every JLabel situated separetely in each ghor/a single square 
    public JButton buttons[] = new JButton[3];//containig reference of Roll and Your Turn Over button
    int labelsFlag[] = new int[100];// labelsFlag 1 for green pawn(for user),2 for blue pawn(for computer) and 0 for neutral
    int numbersArray[] = new int[15];//containg numbers obtained by rolling dice for user
    int greenPawnLabels[] = new int[4];//containg four green pawns labels 
    int six2[] = new int[3];
    int count = 0, stored = 0, check = 5, cntSix2 = 0, indexSix2 = 0;//stored and count is using in numberAray index
    Runnable r;  //used for a new thread to show moving dice for one second
    int add;
    boolean firstSix, addFlag, six2Flag;//first six is true when

    public JFrameBoard() {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Can't set look and feel.");
        }
        initComponents();
        initLabels();
        initButtons();
        initLabelsPawnColor();
        initGreenPawnLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel80.setText("jLabel80");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(1200, 733));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/green.png"))); // NOI18N
        jLabel2.setText("            ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(164, 540, 40, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/green.png"))); // NOI18N
        jLabel3.setText("             ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 494, 40, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/green.png"))); // NOI18N
        jLabel4.setText("           ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 584, 40, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/green.png"))); // NOI18N
        jLabel5.setText("           ");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(74, 544, 40, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/blue.png"))); // NOI18N
        jLabel6.setText("           ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(590, 120, 40, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/blue.png"))); // NOI18N
        jLabel7.setText("             ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 164, 40, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/blue.png"))); // NOI18N
        jLabel8.setText("             ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 120, 40, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/blue.png"))); // NOI18N
        jLabel9.setText("             ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(540, 74, 40, 40);

        jLabel10.setText("             ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(280, 660, 40, 40);

        jLabel11.setText("             ");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(280, 610, 39, 40);

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 0));
        jButton1.setText(" Roll   ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(870, 90, 100, 40);

        jLabel12.setText("             ");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(280, 564, 39, 40);

        jLabel13.setText("             ");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(280, 520, 39, 40);

        jLabel14.setText("             ");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(280, 470, 39, 40);

        jLabel15.setText("             ");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(280, 424, 39, 40);

        jLabel16.setText("             ");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16);
        jLabel16.setBounds(240, 380, 40, 40);

        jLabel17.setText("             ");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(190, 380, 39, 40);

        jLabel18.setText("             ");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(140, 380, 40, 40);

        jLabel19.setText("             ");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19);
        jLabel19.setBounds(100, 380, 40, 40);

        jLabel20.setText("             ");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20);
        jLabel20.setBounds(50, 380, 39, 40);

        jLabel21.setText("             ");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21);
        jLabel21.setBounds(0, 380, 39, 40);

        jLabel22.setText("             ");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22);
        jLabel22.setBounds(0, 330, 39, 40);

        jLabel23.setText("             ");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel23);
        jLabel23.setBounds(0, 280, 39, 40);

        jLabel24.setText("             ");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24);
        jLabel24.setBounds(50, 280, 39, 40);

        jLabel25.setText("             ");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel25);
        jLabel25.setBounds(100, 280, 40, 40);

        jLabel26.setText("             ");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel26);
        jLabel26.setBounds(140, 280, 39, 40);

        jLabel27.setText("             ");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel27);
        jLabel27.setBounds(190, 280, 39, 40);

        jLabel28.setText("             ");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel28);
        jLabel28.setBounds(240, 280, 39, 40);

        jLabel29.setText("             ");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel29);
        jLabel29.setBounds(280, 240, 40, 40);

        jLabel30.setText("             ");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel30);
        jLabel30.setBounds(280, 190, 39, 40);

        jLabel31.setText("             ");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel31);
        jLabel31.setBounds(280, 140, 39, 40);

        jLabel32.setText("             ");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel32);
        jLabel32.setBounds(280, 100, 39, 40);

        jLabel33.setText("             ");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel33);
        jLabel33.setBounds(280, 50, 39, 40);

        jLabel34.setText("             ");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel34);
        jLabel34.setBounds(280, 0, 39, 40);

        jLabel35.setText("             ");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel35);
        jLabel35.setBounds(330, 0, 39, 40);

        jLabel36.setText("             ");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel36);
        jLabel36.setBounds(380, 0, 39, 40);

        jLabel37.setText("             ");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel37);
        jLabel37.setBounds(380, 50, 39, 40);

        jLabel38.setText("             ");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel38);
        jLabel38.setBounds(380, 100, 39, 40);

        jLabel39.setText("             ");
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel39);
        jLabel39.setBounds(380, 140, 39, 40);

        jLabel40.setText("             ");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel40);
        jLabel40.setBounds(380, 190, 39, 40);

        jLabel41.setText("             ");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel41);
        jLabel41.setBounds(380, 240, 39, 40);

        jLabel42.setText("             ");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel42);
        jLabel42.setBounds(420, 280, 39, 40);

        jLabel43.setText("             ");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel43);
        jLabel43.setBounds(470, 284, 39, 40);

        jLabel44.setText("             ");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel44);
        jLabel44.setBounds(520, 280, 39, 40);

        jLabel45.setText("             ");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel45);
        jLabel45.setBounds(560, 280, 39, 40);

        jLabel46.setText("             ");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel46);
        jLabel46.setBounds(610, 280, 39, 40);

        jLabel47.setText("             ");
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel47);
        jLabel47.setBounds(660, 284, 39, 40);

        jLabel48.setText("             ");
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel48);
        jLabel48.setBounds(660, 330, 39, 40);

        jLabel49.setText("             ");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel49);
        jLabel49.setBounds(660, 380, 39, 40);

        jLabel50.setText("             ");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel50);
        jLabel50.setBounds(610, 380, 39, 40);

        jLabel51.setText("             ");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel51);
        jLabel51.setBounds(560, 380, 39, 40);

        jLabel52.setText("             ");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel52);
        jLabel52.setBounds(520, 380, 39, 40);

        jLabel53.setText("             ");
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel53);
        jLabel53.setBounds(470, 380, 39, 40);

        jLabel54.setText("             ");
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel54);
        jLabel54.setBounds(420, 380, 39, 40);

        jLabel55.setText("             ");
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel55);
        jLabel55.setBounds(380, 420, 39, 40);

        jLabel56.setText("             ");
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel56);
        jLabel56.setBounds(380, 470, 39, 40);

        jLabel57.setText("             ");
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel57);
        jLabel57.setBounds(380, 520, 39, 40);

        jLabel58.setText("             ");
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel58);
        jLabel58.setBounds(380, 560, 39, 40);

        jLabel59.setText("             ");
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel59);
        jLabel59.setBounds(380, 610, 39, 40);

        jLabel60.setText("             ");
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel60);
        jLabel60.setBounds(380, 654, 39, 40);

        jLabel61.setText("             ");
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel61);
        jLabel61.setBounds(330, 660, 39, 40);

        jLabel62.setText("             ");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel62);
        jLabel62.setBounds(330, 614, 39, 40);

        jLabel63.setText("             ");
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel63);
        jLabel63.setBounds(330, 564, 39, 40);

        jLabel64.setText("             ");
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel64);
        jLabel64.setBounds(330, 514, 39, 40);

        jLabel65.setText("             ");
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel65);
        jLabel65.setBounds(330, 470, 39, 40);

        jLabel66.setText("             ");
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel66);
        jLabel66.setBounds(330, 424, 39, 40);

        jLabel67.setText("             ");
        getContentPane().add(jLabel67);
        jLabel67.setBounds(330, 54, 39, 40);

        jLabel68.setText("             ");
        getContentPane().add(jLabel68);
        jLabel68.setBounds(330, 100, 39, 40);

        jLabel69.setText("             ");
        getContentPane().add(jLabel69);
        jLabel69.setBounds(330, 140, 39, 40);

        jLabel70.setText("             ");
        getContentPane().add(jLabel70);
        jLabel70.setBounds(330, 190, 39, 40);

        jLabel71.setText("             ");
        getContentPane().add(jLabel71);
        jLabel71.setBounds(330, 240, 39, 40);

        jLabel72.setText("             ");
        getContentPane().add(jLabel72);
        jLabel72.setBounds(280, 280, 39, 40);

        jLabel73.setText("             ");
        getContentPane().add(jLabel73);
        jLabel73.setBounds(330, 280, 39, 40);

        jLabel74.setText("             ");
        getContentPane().add(jLabel74);
        jLabel74.setBounds(380, 280, 39, 40);

        jLabel75.setText("             ");
        getContentPane().add(jLabel75);
        jLabel75.setBounds(380, 380, 39, 40);

        jLabel76.setText("             ");
        getContentPane().add(jLabel76);
        jLabel76.setBounds(330, 380, 39, 40);

        jLabel77.setText("             ");
        getContentPane().add(jLabel77);
        jLabel77.setBounds(290, 330, 39, 40);

        jLabel78.setText("             ");
        getContentPane().add(jLabel78);
        jLabel78.setBounds(370, 334, 39, 40);

        jLabel79.setText("             ");
        getContentPane().add(jLabel79);
        jLabel79.setBounds(280, 380, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/700 700.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 700);

        jLabel81.setBackground(new java.awt.Color(153, 153, 153));
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/animated dice.gif"))); // NOI18N
        jLabel81.setText("                           ");
        getContentPane().add(jLabel81);
        jLabel81.setBounds(870, 140, 150, 80);
        jLabel81.setVisible(false);

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/ludo scr.png"))); // NOI18N
        jLabel87.setText(" ");
        getContentPane().add(jLabel87);
        jLabel87.setBounds(880, 260, 80, 80);

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/ludo one.png"))); // NOI18N
        jLabel88.setText("jLabel88");
        getContentPane().add(jLabel88);
        jLabel88.setBounds(880, 260, 80, 80);

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/ludo three.png"))); // NOI18N
        jLabel89.setText("jLabel89");
        getContentPane().add(jLabel89);
        jLabel89.setBounds(880, 260, 80, 80);

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/ludo two.png"))); // NOI18N
        jLabel90.setText("jLabel90");
        getContentPane().add(jLabel90);
        jLabel90.setBounds(880, 260, 80, 80);

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/ludo four.png"))); // NOI18N
        jLabel91.setText("jLabel91");
        getContentPane().add(jLabel91);
        jLabel91.setBounds(880, 260, 80, 80);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/ludo five.png"))); // NOI18N
        jLabel92.setText("jLabel92");
        getContentPane().add(jLabel92);
        jLabel92.setBounds(880, 260, 80, 80);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myludoproject/ludo six.png"))); // NOI18N
        jLabel93.setText("jLabel93");
        getContentPane().add(jLabel93);
        jLabel93.setBounds(880, 260, 80, 80);

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 255, 255));
        jButton2.setText("Your Turn Over");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(850, 30, 150, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //puting correspondence jLabel reference to labels array(it is a array of jlabel) 
    public void initLabels() {
        labels[1] = jLabel1;
        labels[2] = jLabel2;
        labels[3] = jLabel3;
        labels[4] = jLabel4;
        labels[5] = jLabel5;
        labels[6] = jLabel6;
        labels[7] = jLabel7;
        labels[8] = jLabel8;
        labels[9] = jLabel9;
        labels[10] = jLabel10;
        labels[11] = jLabel11;
        labels[12] = jLabel12;
        labels[13] = jLabel13;
        labels[14] = jLabel14;
        labels[15] = jLabel15;
        labels[16] = jLabel16;
        labels[17] = jLabel17;
        labels[18] = jLabel18;
        labels[19] = jLabel19;
        labels[20] = jLabel20;
        labels[21] = jLabel21;
        labels[22] = jLabel22;
        labels[23] = jLabel23;
        labels[24] = jLabel24;
        labels[25] = jLabel25;
        labels[26] = jLabel26;
        labels[27] = jLabel27;
        labels[28] = jLabel28;
        labels[29] = jLabel29;
        labels[30] = jLabel30;
        labels[31] = jLabel31;
        labels[32] = jLabel32;
        labels[33] = jLabel33;
        labels[34] = jLabel34;
        labels[35] = jLabel35;
        labels[36] = jLabel36;
        labels[37] = jLabel37;
        labels[38] = jLabel38;
        labels[39] = jLabel39;
        labels[40] = jLabel40;
        labels[41] = jLabel41;
        labels[42] = jLabel42;
        labels[43] = jLabel43;
        labels[44] = jLabel44;
        labels[45] = jLabel45;
        labels[46] = jLabel46;
        labels[47] = jLabel47;
        labels[48] = jLabel48;
        labels[49] = jLabel49;
        labels[50] = jLabel50;
        labels[51] = jLabel51;
        labels[52] = jLabel52;
        labels[53] = jLabel53;
        labels[54] = jLabel54;
        labels[55] = jLabel55;
        labels[56] = jLabel56;
        labels[57] = jLabel57;
        labels[58] = jLabel58;
        labels[59] = jLabel59;
        labels[60] = jLabel60;
        labels[61] = jLabel61;
        labels[62] = jLabel62;
        labels[63] = jLabel63;
        labels[64] = jLabel64;
        labels[65] = jLabel65;
        labels[66] = jLabel66;
        labels[67] = jLabel67;
        labels[68] = jLabel68;
        labels[69] = jLabel69;
        labels[70] = jLabel70;
        labels[71] = jLabel71;
        labels[72] = jLabel72;
        labels[73] = jLabel73;
        labels[74] = jLabel74;
        labels[75] = jLabel75;
        labels[76] = jLabel76;
        labels[77] = jLabel77;
        labels[78] = jLabel78;
        labels[79] = jLabel79;
        labels[80] = jLabel80;
        labels[81] = jLabel81; // 82 theke 86 ei label gulo babohar kora hoi ni
        labels[87] = jLabel87;
        labels[88] = jLabel88;
        labels[89] = jLabel90;
        labels[90] = jLabel89;
        labels[91] = jLabel91;
        labels[92] = jLabel92;
        labels[93] = jLabel93;
    }

    //puting reference of jButton in buttons array
    public void initButtons() {
        buttons[1] = jButton1;
        buttons[2] = jButton2;
    }

    //containg four green pawns labels(2 to 5)
    public void initGreenPawnLabels() {
        int j = 0;
        for (int i = 2; i <= 5; i++) {
            greenPawnLabels[j++] = i;
        }
    }

    //color 1 for green pawn(for user) and 2 for blue pawn(for computer)
    public void initLabelsPawnColor() {
        int i;
        for (i = 2; i <= 5; i++) {
            labelsFlag[i] = 1;
        }
        for (i = 6; i <= 9; i++) {
            labelsFlag[i] = 2;
        }
    }

    boolean flag = true; //used in new thread 
    int sleep;

    /**
     * method for showing dice and obtained number for user
     */
    public void showNumber() {
        r = new Runnable() {
            public void run() {
                jLabel81.setVisible(true);  //jLabel81 is animated dice;
                jButton1.setEnabled(false);
                flag = !flag;
                if (flag) {
                    sleep = 1000;
                } else {
                    sleep = 700;
                }
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                }
                jLabel81.setVisible(false);
                jButton1.setEnabled(true);
                int number = Dice.dice.moveDice();
                cntSix2++;
                six2[indexSix2++] = number;
                if (cntSix2 % 2 == 0) {
                    indexSix2 = 0;
                    if (six2[0] == six2[1] && six2[0] == 6) {
                        number = 3;
                    }
                }
                Arrays.sort(greenPawnLabels);
                if (JFrameBoard.jFrameBoard.addFlag) {
                    add = 0;
                    check = 5;
                    addFlag = false;
                }
                int keep0, keep1, keep2;
                if (greenPawnLabels[0] >= 2 && greenPawnLabels[0] <= 5) {
                    keep0 = 5;//karon add er moddhe 6 asei 6+5=11 
                } else {
                    keep0 = greenPawnLabels[0];
                }
                if (greenPawnLabels[1] >= 2 && greenPawnLabels[1] <= 5) {
                    keep1 = 5;
                } else {
                    keep1 = greenPawnLabels[1];
                }
                if (greenPawnLabels[2] >= 2 && greenPawnLabels[2] <= 5) {
                    keep2 = 5;
                } else {
                    keep2 = greenPawnLabels[2];
                }
                if (number == 6) {
                    if (JFrameBoard.jFrameBoard.labelsFlag[11] == 2) {
                        number = 5;
                    } else if (JFrameBoard.jFrameBoard.labelsFlag[11] == 1) {
                        number = 2;
                    }
                }
                while (labelsFlag[keep0 + number + add] == 1
                        || labelsFlag[keep1 + number + add] == 1
                        || labelsFlag[keep2 + number + add] == 1) {
                    number = check--;
                }
                add += number;
                for (int i = 87; i <= 93; i++) {
                    if (number != i) {
                        labels[i].setVisible(false);
                    }
                }
                labels[number + 87].setVisible(true);
                putInNumbersArray(number);
            }
        };
    }

    // this is clicked by user to roll and it call the showNumber method to show dice and obtained number
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showNumber();
        Thread t = new Thread(r);
        t.start();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     *
     * @param number obtained by roll button for user
     */
    public void putInNumbersArray(int number) {
        if (number == 6) {    //after gaining first six user can move pawn so firstSix become true and put in numbersArray
            firstSix = true;
        } else if (firstSix == false) {
            buttons[1].setEnabled(false);
            buttons[2].setEnabled(true);
        }

        if (firstSix) {
            numbersArray[count++] = number;
            for (int i = 0; i < count; i++) {
                if (numbersArray[i] < 6) {
                    buttons[1].setEnabled(false);
                    buttons[2].setEnabled(true);
                }
            }
        }
    }


    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        if (numbersArray[stored] == 6) {
            Chal.chal.green(2);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    //when user chal completed user click this button named Your Turn Over
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buttons[2].setEnabled(false);
        addFlag = true;
        count = 0;
        stored = 0;
        Computer.computer.computerLogic();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (numbersArray[stored] == 6) {
            Chal.chal.green(3);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (numbersArray[stored] == 6) {
            Chal.chal.green(4);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (numbersArray[stored] == 6) {
            Chal.chal.green(5);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Chal.chal.green(11);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Chal.chal.green(12);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Chal.chal.green(13);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Chal.chal.green(14);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Chal.chal.green(15);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Chal.chal.green(16);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Chal.chal.green(17);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Chal.chal.green(18);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        Chal.chal.green(19);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Chal.chal.green(20);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Chal.chal.green(21);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        Chal.chal.green(22);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        Chal.chal.green(23);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        Chal.chal.green(24);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        Chal.chal.green(25);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        Chal.chal.green(26);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        Chal.chal.green(27);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        Chal.chal.green(28);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        Chal.chal.green(29);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        Chal.chal.green(30);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        Chal.chal.green(31);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        Chal.chal.green(32);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        Chal.chal.green(33);
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        Chal.chal.green(34);
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        Chal.chal.green(35);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        Chal.chal.green(36);
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        Chal.chal.green(37);
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        Chal.chal.green(38);
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        Chal.chal.green(39);
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        Chal.chal.green(40);
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        Chal.chal.green(41);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        Chal.chal.green(42);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        Chal.chal.green(43);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        Chal.chal.green(44);
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        Chal.chal.green(45);
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        Chal.chal.green(46);
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        Chal.chal.green(47);
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        Chal.chal.green(48);
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        Chal.chal.green(49);
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        Chal.chal.green(50);
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        Chal.chal.green(51);
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        Chal.chal.green(52);
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        Chal.chal.green(53);
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        Chal.chal.green(54);
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        Chal.chal.green(55);
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        Chal.chal.green(56);
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        Chal.chal.green(57);
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        Chal.chal.green(58);
    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        Chal.chal.green(59);
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        Chal.chal.green(60);
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        Chal.chal.green(61);
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        Chal.chal.green(62);
    }//GEN-LAST:event_jLabel62MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        Chal.chal.green(63);
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        Chal.chal.green(64);
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        Chal.chal.green(65);
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        Chal.chal.green(66);
    }//GEN-LAST:event_jLabel66MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    public javax.swing.JLabel jLabel41;
    public javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    public javax.swing.JLabel jLabel44;
    public javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    public javax.swing.JLabel jLabel47;
    public javax.swing.JLabel jLabel48;
    public javax.swing.JLabel jLabel49;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel50;
    public javax.swing.JLabel jLabel51;
    public javax.swing.JLabel jLabel52;
    public javax.swing.JLabel jLabel53;
    public javax.swing.JLabel jLabel54;
    public javax.swing.JLabel jLabel55;
    public javax.swing.JLabel jLabel56;
    public javax.swing.JLabel jLabel57;
    public javax.swing.JLabel jLabel58;
    public javax.swing.JLabel jLabel59;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel60;
    public javax.swing.JLabel jLabel61;
    public javax.swing.JLabel jLabel62;
    public javax.swing.JLabel jLabel63;
    public javax.swing.JLabel jLabel64;
    public javax.swing.JLabel jLabel65;
    public javax.swing.JLabel jLabel66;
    public javax.swing.JLabel jLabel67;
    public javax.swing.JLabel jLabel68;
    public javax.swing.JLabel jLabel69;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel70;
    public javax.swing.JLabel jLabel71;
    public javax.swing.JLabel jLabel72;
    public javax.swing.JLabel jLabel73;
    public javax.swing.JLabel jLabel74;
    public javax.swing.JLabel jLabel75;
    public javax.swing.JLabel jLabel76;
    public javax.swing.JLabel jLabel77;
    public javax.swing.JLabel jLabel78;
    public javax.swing.JLabel jLabel79;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    public javax.swing.JLabel jLabel81;
    public javax.swing.JLabel jLabel87;
    public javax.swing.JLabel jLabel88;
    public javax.swing.JLabel jLabel89;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabel90;
    public javax.swing.JLabel jLabel91;
    public javax.swing.JLabel jLabel92;
    public javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
