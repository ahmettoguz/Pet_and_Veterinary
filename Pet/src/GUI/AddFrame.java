package GUI;

import pet.AnimalSys;
import pet.Bird;
import pet.Cat;
import pet.Dog;
import pet.Snake;
import pet.Spider;

public class AddFrame extends javax.swing.JFrame
{

    ReservationFrame rf;
    String type;

    public AddFrame(ReservationFrame rr)
    {
        initComponents();
        rf = rr;
        closeAllPanels();
        catPanel.setVisible(true);
        setRegistrationId("cat");
        type = "cat";
    }

    public void setInitialRegistrationId()
    {
        closeAllPanels();
        catPanel.setVisible(true);
        setRegistrationId("cat");
        type = "cat";
        catradio.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        close = new javax.swing.JButton();
        catradio = new javax.swing.JRadioButton();
        dogradio = new javax.swing.JRadioButton();
        birdradio = new javax.swing.JRadioButton();
        snakeradio = new javax.swing.JRadioButton();
        spiderradio = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        catPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        catRegistrationId = new javax.swing.JTextField();
        catBreed = new javax.swing.JTextField();
        catGender = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        catAge = new javax.swing.JTextField();
        catHeight = new javax.swing.JTextField();
        catVaccinationNb = new javax.swing.JTextField();
        catisSpayed = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        dogPanel = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        dogRegistrationId = new javax.swing.JTextField();
        dogBreed = new javax.swing.JTextField();
        dogGender = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        dogAge = new javax.swing.JTextField();
        dogHeight = new javax.swing.JTextField();
        dogIsSpayed = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        dogIsTrained = new javax.swing.JCheckBox();
        birdPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        birdRegistrationId = new javax.swing.JTextField();
        birdBreed = new javax.swing.JTextField();
        birdGender = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        birdAge = new javax.swing.JTextField();
        birdHeight = new javax.swing.JTextField();
        birdBeakType = new javax.swing.JTextField();
        birdIsSpayed = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        snakePanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        snakeRegistrationId = new javax.swing.JTextField();
        snakeBreed = new javax.swing.JTextField();
        snakeGender = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        snakeAge = new javax.swing.JTextField();
        snakeHeight = new javax.swing.JTextField();
        snakeClassification = new javax.swing.JTextField();
        snakeHasPoison = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        spiderPanel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        spiderRegistrationId = new javax.swing.JTextField();
        spiderBreed = new javax.swing.JTextField();
        spiderGender = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        spiderAge = new javax.swing.JTextField();
        spiderHeight = new javax.swing.JTextField();
        spiderClassification = new javax.swing.JTextField();
        spiderHasPoison = new javax.swing.JCheckBox();
        jLabel39 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        buttonGroup1.add(catradio);
        catradio.setSelected(true);
        catradio.setText("Cat");
        catradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catradioActionPerformed(evt);
            }
        });

        buttonGroup1.add(dogradio);
        dogradio.setText("Dog");
        dogradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogradioActionPerformed(evt);
            }
        });

        buttonGroup1.add(birdradio);
        birdradio.setText("Bird");
        birdradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birdradioActionPerformed(evt);
            }
        });

        buttonGroup1.add(snakeradio);
        snakeradio.setText("Snake");
        snakeradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeradioActionPerformed(evt);
            }
        });

        buttonGroup1.add(spiderradio);
        spiderradio.setText("Spider");
        spiderradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spiderradioActionPerformed(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Registration Id:");

        jLabel10.setText("Breed:");

        jLabel11.setText("Gender:");

        jLabel12.setText("Age:");

        jLabel13.setText("Height:");

        jLabel14.setText("Vaccination #:");

        catisSpayed.setText("Is Spayed");

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cat");

        javax.swing.GroupLayout catPanelLayout = new javax.swing.GroupLayout(catPanel);
        catPanel.setLayout(catPanelLayout);
        catPanelLayout.setHorizontalGroup(
            catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanelLayout.createSequentialGroup()
                .addGroup(catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(catPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(catGender, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(catBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(catPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(catRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addGroup(catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(catAge, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanelLayout.createSequentialGroup()
                                .addGroup(catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(28, 28, 28)
                                .addGroup(catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(catVaccinationNb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(catPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(catPanelLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(catisSpayed)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        catPanelLayout.setVerticalGroup(
            catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(catRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(catAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(catBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(catHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(catGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(catVaccinationNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(catisSpayed)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(catPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 740, 200));

        jLabel43.setText("Registration Id:");

        jLabel44.setText("Breed:");

        jLabel45.setText("Gender:");

        jLabel46.setText("Age:");

        dogBreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogBreedActionPerformed(evt);
            }
        });

        jLabel47.setText("Height:");

        dogIsSpayed.setText("Is Spayed");

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dog");

        dogIsTrained.setText("Is Trained");

        javax.swing.GroupLayout dogPanelLayout = new javax.swing.GroupLayout(dogPanel);
        dogPanel.setLayout(dogPanelLayout);
        dogPanelLayout.setHorizontalGroup(
            dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dogPanelLayout.createSequentialGroup()
                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dogPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dogPanelLayout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dogGender, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dogPanelLayout.createSequentialGroup()
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dogBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dogPanelLayout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dogRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dogPanelLayout.createSequentialGroup()
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(dogAge, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dogPanelLayout.createSequentialGroup()
                                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dogPanelLayout.createSequentialGroup()
                                        .addComponent(dogIsSpayed)
                                        .addGap(26, 26, 26)))
                                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dogPanelLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(dogHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dogPanelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(dogIsTrained))))))
                    .addGroup(dogPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        dogPanelLayout.setVerticalGroup(
            dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dogPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(dogRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(dogAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(dogBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(dogHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(dogGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogIsSpayed)
                    .addComponent(dogIsTrained))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(dogPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 740, 200));

        jLabel15.setText("Registration Id:");

        jLabel16.setText("Breed:");

        jLabel17.setText("Gender:");

        jLabel18.setText("Age:");

        jLabel19.setText("Height:");

        jLabel20.setText("Beak Type:");

        birdIsSpayed.setText("Is Spayed");

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bird");

        javax.swing.GroupLayout birdPanelLayout = new javax.swing.GroupLayout(birdPanel);
        birdPanel.setLayout(birdPanelLayout);
        birdPanelLayout.setHorizontalGroup(
            birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(birdPanelLayout.createSequentialGroup()
                .addGroup(birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(birdPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(birdPanelLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(birdGender, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, birdPanelLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(birdBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(birdPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(birdRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addGroup(birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, birdPanelLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(birdAge, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, birdPanelLayout.createSequentialGroup()
                                .addGroup(birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(28, 28, 28)
                                .addGroup(birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birdHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(birdBeakType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(birdPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(birdPanelLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(birdIsSpayed)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        birdPanelLayout.setVerticalGroup(
            birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(birdPanelLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(17, 17, 17)
                .addGroup(birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(birdRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(birdAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(birdBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(birdHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(birdGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(birdBeakType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(birdIsSpayed)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(birdPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 740, 200));

        jLabel21.setText("Registration Id:");

        jLabel22.setText("Breed:");

        jLabel23.setText("Gender:");

        jLabel24.setText("Age:");

        jLabel25.setText("Height:");

        jLabel26.setText("Classification");

        snakeHasPoison.setText("Has Poison");

        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Snake");

        javax.swing.GroupLayout snakePanelLayout = new javax.swing.GroupLayout(snakePanel);
        snakePanel.setLayout(snakePanelLayout);
        snakePanelLayout.setHorizontalGroup(
            snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snakePanelLayout.createSequentialGroup()
                .addGroup(snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snakePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(snakePanelLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(snakeGender, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snakePanelLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(snakeBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(snakePanelLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(snakeRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addGroup(snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snakePanelLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(snakeAge, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snakePanelLayout.createSequentialGroup()
                                .addGroup(snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addGap(28, 28, 28)
                                .addGroup(snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(snakeHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(snakeClassification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(snakePanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(snakePanelLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(snakeHasPoison)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        snakePanelLayout.setVerticalGroup(
            snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snakePanelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addGroup(snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(snakeRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(snakeAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(snakeBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(snakeHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(snakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(snakeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(snakeClassification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(snakeHasPoison)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(snakePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 740, 200));

        jLabel33.setText("Registration Id:");

        jLabel34.setText("Breed:");

        jLabel35.setText("Gender:");

        jLabel36.setText("Age:");

        jLabel37.setText("Height:");

        jLabel38.setText("Classification");

        spiderAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spiderAgeActionPerformed(evt);
            }
        });

        spiderHasPoison.setText("Has Poison");

        jLabel39.setForeground(new java.awt.Color(255, 0, 51));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Spider");

        javax.swing.GroupLayout spiderPanelLayout = new javax.swing.GroupLayout(spiderPanel);
        spiderPanel.setLayout(spiderPanelLayout);
        spiderPanelLayout.setHorizontalGroup(
            spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spiderPanelLayout.createSequentialGroup()
                .addGroup(spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(spiderPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(spiderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spiderGender, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spiderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spiderBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(spiderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spiderRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addGroup(spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spiderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(spiderAge, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spiderPanelLayout.createSequentialGroup()
                                .addGroup(spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38))
                                .addGap(28, 28, 28)
                                .addGroup(spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spiderHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spiderClassification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(spiderPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(spiderPanelLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(spiderHasPoison)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        spiderPanelLayout.setVerticalGroup(
            spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spiderPanelLayout.createSequentialGroup()
                .addComponent(jLabel39)
                .addGap(17, 17, 17)
                .addGroup(spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(spiderRegistrationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(spiderAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(spiderBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(spiderHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(spiderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(spiderGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(spiderClassification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(spiderHasPoison)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(spiderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 740, 200));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(catradio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(dogradio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(birdradio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(snakeradio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(spiderradio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catradio)
                    .addComponent(dogradio)
                    .addComponent(birdradio)
                    .addComponent(snakeradio)
                    .addComponent(spiderradio))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(close))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_closeActionPerformed
    {//GEN-HEADEREND:event_closeActionPerformed
        this.setVisible(false);
        rf.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_closeActionPerformed

    private void closeAllPanels()
    {
        catPanel.setVisible(false);
        dogPanel.setVisible(false);
        birdPanel.setVisible(false);
        snakePanel.setVisible(false);
        spiderPanel.setVisible(false);
    }

    private void setRegistrationId(String type)
    {
        if (type.equalsIgnoreCase("cat"))
        {
            catRegistrationId.setText((AnimalSys.lastUsedId + 10) + "");

            catRegistrationId.setEditable(false);
            catRegistrationId.setFocusable(false);
        } else if (type.equalsIgnoreCase("dog"))
        {
            dogRegistrationId.setText((AnimalSys.lastUsedId + 10) + "");

            dogRegistrationId.setEditable(false);
            dogRegistrationId.setFocusable(false);
        } else if (type.equalsIgnoreCase("bird"))
        {
            birdRegistrationId.setText((AnimalSys.lastUsedId + 10) + "");

            birdRegistrationId.setEditable(false);
            birdRegistrationId.setFocusable(false);
        } else if (type.equalsIgnoreCase("snake"))
        {
            snakeRegistrationId.setText((AnimalSys.lastUsedId + 10) + "");

            snakeRegistrationId.setEditable(false);
            snakeRegistrationId.setFocusable(false);
        } else if (type.equalsIgnoreCase("spider"))
        {
            spiderRegistrationId.setText((AnimalSys.lastUsedId + 10) + "");

            spiderRegistrationId.setEditable(false);
            spiderRegistrationId.setFocusable(false);
        }

    }

    private void cleanTextFields()
    {
        catVaccinationNb.setText("");
        catRegistrationId.setText("");
        catBreed.setText("");
        catGender.setText("");
        catAge.setText("");
        catHeight.setText("");

        dogRegistrationId.setText("");
        dogBreed.setText("");
        dogGender.setText("");
        dogAge.setText("");
        dogHeight.setText("");

        birdBeakType.setText("");
        birdRegistrationId.setText("");
        birdBreed.setText("");
        birdGender.setText("");
        birdAge.setText("");
        birdHeight.setText("");

        snakeClassification.setText("");
        snakeRegistrationId.setText("");
        snakeBreed.setText("");
        snakeGender.setText("");
        snakeAge.setText("");
        snakeHeight.setText("");

        spiderClassification.setText("");
        spiderRegistrationId.setText("");
        spiderBreed.setText("");
        spiderGender.setText("");
        spiderAge.setText("");
        spiderHeight.setText("");
    }


    private void catradioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_catradioActionPerformed
    {//GEN-HEADEREND:event_catradioActionPerformed

        closeAllPanels();

        if (catradio.isSelected())
        {
            type = "cat";
            catPanel.setVisible(true);
        } else if (dogradio.isSelected())
        {
            type = "dog";
        } else if (birdradio.isSelected())
        {
            type = "bird";
        } else if (snakeradio.isSelected())
        {
            type = "snake";
        } else if (spiderradio.isSelected())
        {
            type = "spider";
        }
        setRegistrationId(type);

    }//GEN-LAST:event_catradioActionPerformed

    private void dogradioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dogradioActionPerformed
    {//GEN-HEADEREND:event_dogradioActionPerformed

        closeAllPanels();

        if (catradio.isSelected())
        {
            type = "cat";
            catPanel.setVisible(true);
        } else if (dogradio.isSelected())
        {
            type = "dog";
            dogPanel.setVisible(true);
        } else if (birdradio.isSelected())
        {
            type = "bird";
        } else if (snakeradio.isSelected())
        {
            type = "snake";
        } else if (spiderradio.isSelected())
        {
            type = "spider";
        }
        setRegistrationId(type);
    }//GEN-LAST:event_dogradioActionPerformed

    private void birdradioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_birdradioActionPerformed
    {//GEN-HEADEREND:event_birdradioActionPerformed

        closeAllPanels();

        if (catradio.isSelected())
        {
            type = "cat";
            catPanel.setVisible(true);
        } else if (dogradio.isSelected())
        {
            type = "dog";
        } else if (birdradio.isSelected())
        {
            type = "bird";
        } else if (snakeradio.isSelected())
        {
            type = "snake";
        } else if (spiderradio.isSelected())
        {
            type = "spider";
        }
        birdPanel.setVisible(true);
        setRegistrationId(type);
    }//GEN-LAST:event_birdradioActionPerformed

    private void snakeradioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_snakeradioActionPerformed
    {//GEN-HEADEREND:event_snakeradioActionPerformed

        closeAllPanels();

        if (catradio.isSelected())
        {
            type = "cat";
            catPanel.setVisible(true);
        } else if (dogradio.isSelected())
        {
            type = "dog";
        } else if (birdradio.isSelected())
        {
            type = "bird";
        } else if (snakeradio.isSelected())
        {
            type = "snake";
        } else if (spiderradio.isSelected())
        {
            type = "spider";
        }
        snakePanel.setVisible(true);
        setRegistrationId(type);
    }//GEN-LAST:event_snakeradioActionPerformed

    private void spiderradioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_spiderradioActionPerformed
    {//GEN-HEADEREND:event_spiderradioActionPerformed

        closeAllPanels();

        if (catradio.isSelected())
        {
            type = "cat";
            catPanel.setVisible(true);
        } else if (dogradio.isSelected())
        {
            type = "dog";
        } else if (birdradio.isSelected())
        {
            type = "bird";
        } else if (snakeradio.isSelected())
        {
            type = "snake";
        } else if (spiderradio.isSelected())
        {
            type = "spider";
        }
        spiderPanel.setVisible(true);
        setRegistrationId(type);
    }//GEN-LAST:event_spiderradioActionPerformed

    private void spiderAgeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_spiderAgeActionPerformed
    {//GEN-HEADEREND:event_spiderAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spiderAgeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addActionPerformed
    {//GEN-HEADEREND:event_addActionPerformed
        if (type.equalsIgnoreCase("cat"))
        {

            String spay;

            if (catisSpayed.isSelected())
            {
                spay = "yes";
            } else
            {
                spay = "no";
            }
            if (catVaccinationNb.getText().equals("") || catRegistrationId.getText().equals("") || catBreed.getText().equals("") || catGender.getText().equals("") || catAge.getText().equals("") || catHeight.getText().equals(""))
            {
                jLabel3.setText("Please enter the blank fields!!!!");
            } else
            {
                Cat o = new Cat(Integer.parseInt(catVaccinationNb.getText()), spay, Integer.parseInt(catRegistrationId.getText()), catBreed.getText(), catGender.getText(), Integer.parseInt(catAge.getText()), Double.parseDouble(catHeight.getText()), 0);
                o.calculatePrice();

                AnimalSys.animals.add(o);
                AnimalSys.lastUsedId += 10;
                cleanTextFields();

                rf.disableButton();
                this.setVisible(false);
                rf.setVisible(true);
            }
        } else if (type.equalsIgnoreCase("dog"))
        {
            String spay;
            String trained;

            if (dogIsSpayed.isSelected())
            {
                spay = "yes";
            } else
            {
                spay = "no";
            }

            if (dogIsTrained.isSelected())
            {
                trained = "yes";
            } else
            {
                trained = "no";
            }
            if (dogRegistrationId.getText().equals("") || dogBreed.getText().equals("") || dogGender.getText().equals("") || dogAge.getText().equals("") || dogHeight.getText().equals(""))
            {
                jLabel3.setText("Please enter the blank fields!!!!");
            } else
            {
                Dog o = new Dog(trained, spay, Integer.parseInt(dogRegistrationId.getText()), dogBreed.getText(), dogGender.getText(), Integer.parseInt(dogAge.getText()), Double.parseDouble(dogHeight.getText()), 0);
                o.calculatePrice();

                AnimalSys.animals.add(o);
                AnimalSys.lastUsedId += 10;
                cleanTextFields();

                rf.disableButton();
                this.setVisible(false);
                rf.setVisible(true);
            }
        } else if (type.equalsIgnoreCase("bird"))
        {
            String spay;

            if (birdIsSpayed.isSelected())
            {
                spay = "yes";
            } else
            {
                spay = "no";
            }
            if (birdBeakType.getText().equals("") || birdRegistrationId.getText().equals("") || birdBreed.getText().equals("") || birdGender.getText().equals("") || birdAge.getText().equals("") || birdHeight.getText().equals(""))
            {
                jLabel3.setText("Please enter the blank fields!!!!");
            } else
            {
                Bird o = new Bird(birdBeakType.getText(), spay, Integer.parseInt(birdRegistrationId.getText()), birdBreed.getText(), birdGender.getText(), Integer.parseInt(birdAge.getText()), Double.parseDouble(birdHeight.getText()), 0);
                o.calculatePrice();

                AnimalSys.animals.add(o);
                AnimalSys.lastUsedId += 10;
                cleanTextFields();

                rf.disableButton();
                this.setVisible(false);
                rf.setVisible(true);
            }
        } else if (type.equalsIgnoreCase("snake"))
        {
            boolean poison;

            if (snakeHasPoison.isSelected())
            {
                poison = true;
            } else
            {
                poison = false;
            }
            if (snakeClassification.getText().equals("") || snakeRegistrationId.getText().equals("") || snakeBreed.getText().equals("") || snakeGender.getText().equals("") || snakeAge.getText().equals("") || snakeHeight.getText().equals(""))
            {
                jLabel3.setText("Please enter the blank fields!!!!");
            } else
            {
                Snake o = new Snake(snakeClassification.getText(), poison, Integer.parseInt(snakeRegistrationId.getText()), snakeBreed.getText(), snakeGender.getText(), Integer.parseInt(snakeAge.getText()), Double.parseDouble(snakeHeight.getText()), 0);
                o.calculatePrice();

                AnimalSys.animals.add(o);
                AnimalSys.lastUsedId += 10;
                cleanTextFields();

                rf.disableButton();
                this.setVisible(false);
                rf.setVisible(true);
            }
        } else if (type.equalsIgnoreCase("spider"))
        {
            boolean poison;

            if (spiderHasPoison.isSelected())
            {
                poison = true;
            } else
            {
                poison = false;
            }
            if (spiderClassification.getText().equals("") || spiderRegistrationId.getText().equals("") || spiderBreed.getText().equals("") || spiderGender.getText().equals("") || spiderAge.getText().equals("") || spiderHeight.getText().equals(""))
            {
                jLabel3.setText("Please enter the blank fields!!!!");
            } else
            {
                Spider o = new Spider(spiderClassification.getText(), poison, Integer.parseInt(spiderRegistrationId.getText()), spiderBreed.getText(), spiderGender.getText(), Integer.parseInt(spiderAge.getText()), Double.parseDouble(spiderHeight.getText()), 0);
                o.calculatePrice();

                AnimalSys.animals.add(o);
                AnimalSys.lastUsedId += 10;
                cleanTextFields();

                rf.disableButton();
                this.setVisible(false);
                rf.setVisible(true);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void dogBreedActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dogBreedActionPerformed
    {//GEN-HEADEREND:event_dogBreedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dogBreedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField birdAge;
    private javax.swing.JTextField birdBeakType;
    private javax.swing.JTextField birdBreed;
    private javax.swing.JTextField birdGender;
    private javax.swing.JTextField birdHeight;
    private javax.swing.JCheckBox birdIsSpayed;
    private javax.swing.JPanel birdPanel;
    private javax.swing.JTextField birdRegistrationId;
    private javax.swing.JRadioButton birdradio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField catAge;
    private javax.swing.JTextField catBreed;
    private javax.swing.JTextField catGender;
    private javax.swing.JTextField catHeight;
    private javax.swing.JPanel catPanel;
    private javax.swing.JTextField catRegistrationId;
    private javax.swing.JTextField catVaccinationNb;
    private javax.swing.JCheckBox catisSpayed;
    private javax.swing.JRadioButton catradio;
    private javax.swing.JButton close;
    private javax.swing.JTextField dogAge;
    private javax.swing.JTextField dogBreed;
    private javax.swing.JTextField dogGender;
    private javax.swing.JTextField dogHeight;
    private javax.swing.JCheckBox dogIsSpayed;
    private javax.swing.JCheckBox dogIsTrained;
    private javax.swing.JPanel dogPanel;
    private javax.swing.JTextField dogRegistrationId;
    private javax.swing.JRadioButton dogradio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField snakeAge;
    private javax.swing.JTextField snakeBreed;
    private javax.swing.JTextField snakeClassification;
    private javax.swing.JTextField snakeGender;
    private javax.swing.JCheckBox snakeHasPoison;
    private javax.swing.JTextField snakeHeight;
    private javax.swing.JPanel snakePanel;
    private javax.swing.JTextField snakeRegistrationId;
    private javax.swing.JRadioButton snakeradio;
    private javax.swing.JTextField spiderAge;
    private javax.swing.JTextField spiderBreed;
    private javax.swing.JTextField spiderClassification;
    private javax.swing.JTextField spiderGender;
    private javax.swing.JCheckBox spiderHasPoison;
    private javax.swing.JTextField spiderHeight;
    private javax.swing.JPanel spiderPanel;
    private javax.swing.JTextField spiderRegistrationId;
    private javax.swing.JRadioButton spiderradio;
    // End of variables declaration//GEN-END:variables
}
