/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.bbs;

import deu.cse.team.Delivery.Delivery_Frame;
import deu.cse.team.mainmenu.MainMenu;
import java.awt.Component;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 * 게시판 gui
 * @author CHANG
 */
public class Bbs extends javax.swing.JFrame {

    /**
     * Creates new form Bbs
     */
    public Bbs() {
        initComponents();
        setLocationRelativeTo(null);
        addRowToJTable();
        cmbList();
    }
    List<LogMemento.Memento> savedSearchLog = new ArrayList<LogMemento.Memento>();
    LogMemento log = new LogMemento();
    // 콤보박스에 카테고리를 불러옴
    public void cmbList() {
        DefaultComboBoxModel model = new DefaultComboBoxModel<>();
        BufferedReader br = null;
        model.addElement("--전체--");
        try {
            br = new BufferedReader(new FileReader("C:\\DB\\category.txt"));
            int val = Integer.parseInt(br.readLine());
            for (int i=0; i<val; i++) {
                String line = br.readLine();
                model.addElement(line);
                kategorie_product.setModel(model);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public class Split{
        public String image, name, price, location, category, quantity, status, explanation;
        public Split(String image, String name,String price, String location, String category, String quantity, String status, String explanation) {
            this.image = image;
            this.name = name;
            this.price = price;
            this.location = location;
            this.category = category;
            this.quantity = quantity;
            this.status = status;
            this.explanation = explanation;
        }
    }
    // 게시글을 읽어오는 ArrayList
    public ArrayList ListPost() {
        ArrayList<String> list = new ArrayList();
        ArrayList<Split> splitlist = new ArrayList<Split>();
        try {
            File Stext = new File("C:\\DB\\RegistrationProduct.txt");
            FileReader textRead = new FileReader(Stext);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String line;

        for (int i = 0; i < list.size(); i++) {
            line = list.get(i);
            String[] str = line.split("\t");
            splitlist.add(new Split(str[5], str[3],str[4], str[8], str[1], str[6], str[9], str[7]));
        }
        return splitlist;
    }
    public Image setIconImage(String imgLocation, int width, int height) {
        ImageIcon imageicon = new ImageIcon(imgLocation);
        Image img = imageicon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return img;
    }
    
    public void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Split> list = ListPost();
        JLabel imageLabel;
        DataCheck check = new DataCheck();
        jTable1.getColumn("썸네일").setCellRenderer(new myTableCellRanderer());
        for(int i=0; i<list.size(); i++) {      
            if (check.dataCheck(nameTextField.getText(), list.get(i).name) ||
                check.dataCheck(kategorie_product.getSelectedItem().toString(), list.get(i).category) ||
                check.dataCheck(minPriceTextField.getText(), maxPriceTextField.getText(),list.get(i).price) ||
                check.dataCheck(locationComboBox.getSelectedItem().toString(), list.get(i).location))
                continue;
            else {
            imageLabel = new JLabel();
            Proxy_Image setThumbnail = new Proxy_Image(list.get(i).image, 100, 100);
            imageLabel.setIcon(setThumbnail.displayImage());
            model.insertRow(model.getRowCount(), new Object[]{
            imageLabel,
            list.get(i).name,
            list.get(i).price,
            list.get(i).location,
            list.get(i).category,
            list.get(i).quantity,
            list.get(i).status,
            list.get(i).explanation,
            list.get(i).image
            });
            }
        }
    }
    private class DataCheck {
        public boolean dataCheck(String Sdata, String Ddata) {
            if ((Sdata.equals("") || Sdata.equals("--전체--") || Sdata.equals("없음")) || Ddata.equals(Sdata)) {
                return false;
            } else return true;
        }
        public boolean dataCheck(String Smin, String Smax, String Ddata) {
            int min;
            int max;
            int data = Integer.parseInt(Ddata);
            if (Smin.equals("")) {
                min = 0;
            } else {
                min = Integer.parseInt(Smin); }
            if (Smax.equals("")) {
                max = 100000000;
            } else {
                max = Integer.parseInt(Smax);
            }
            if ((min <= data) && (data <= max)) {
                return false;
            } else return true;
        }
    }
    class myTableCellRanderer implements TableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
            TableColumn tb = jTable1.getColumn("썸네일");
            tb.setMaxWidth(100);
            tb.setMinWidth(100);
 
            jTable1.setRowHeight(100);
            return (Component) value;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productInfo = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        explanationTextArea = new javax.swing.JTextArea();
        search = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        kategorie_product = new javax.swing.JComboBox<>();
        minPriceTextField = new javax.swing.JTextField();
        maxPriceTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        locationComboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        logTable = new javax.swing.JTable();
        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton2.setText("닫기");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("구매");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("제품명 : ");

        jLabel2.setText("가격 : ");

        jLabel3.setText("제품상태 : ");

        jLabel4.setText("카테고리 : ");

        jLabel5.setText("거래지역 : ");

        nameLabel.setText("jLabel6");

        priceLabel.setText("jLabel7");

        statusLabel.setText("jLabel8");

        locationLabel.setText("jLabel9");

        categoryLabel.setText("jLabel6");

        jLabel6.setText("수량 : ");

        quantityLabel.setText("jLabel7");

        explanationTextArea.setColumns(20);
        explanationTextArea.setRows(5);
        jScrollPane2.setViewportView(explanationTextArea);

        javax.swing.GroupLayout productInfoLayout = new javax.swing.GroupLayout(productInfo.getContentPane());
        productInfo.getContentPane().setLayout(productInfoLayout);
        productInfoLayout.setHorizontalGroup(
            productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productInfoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(88, 88, 88))
            .addGroup(productInfoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productInfoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoryLabel))
                    .addGroup(productInfoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productInfoLayout.createSequentialGroup()
                                .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceLabel)
                                    .addComponent(nameLabel)))
                            .addGroup(productInfoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusLabel))
                            .addGroup(productInfoLayout.createSequentialGroup()
                                .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantityLabel)
                                    .addComponent(locationLabel)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        productInfoLayout.setVerticalGroup(
            productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoryLabel))
                .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(priceLabel))
                        .addGap(18, 18, 18)
                        .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(statusLabel))
                        .addGap(18, 18, 18)
                        .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(locationLabel))
                        .addGap(18, 18, 18)
                        .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(quantityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(37, 37, 37))
        );

        jLabel7.setText("제품명 :");

        jLabel8.setText("카테고리 :");

        jLabel9.setText("가격 :");

        jLabel10.setText("거래지역 :");

        kategorie_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--전체--" }));

        minPriceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minPriceTextFieldKeyTyped(evt);
            }
        });

        maxPriceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxPriceTextFieldKeyTyped(evt);
            }
        });

        jLabel11.setText("~");

        locationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "없음", "서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시", "세종특별자치시", "경기도", "강원도", "충청북도", "충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주특별자치도" }));

        searchButton.setText("검색");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("취소");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        logTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "제품명", "카테고리", "최소가격", "최대가격", "거래지역"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(logTable);

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search.getContentPane());
        search.getContentPane().setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(searchLayout.createSequentialGroup()
                                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(kategorie_product, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, searchLayout.createSequentialGroup()
                                        .addComponent(minPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maxPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton)))
                .addGap(69, 69, 69))
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kategorie_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(minPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(61, 61, 61)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(locationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(cancelButton))
                .addGap(23, 23, 23))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "썸네일", "제품명", "가격", "거래지역", "카테고리", "수량", "제품상태", "제품설명", "이미지경로"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(5).setMinWidth(0);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(6).setMinWidth(0);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(7).setMinWidth(0);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(8).setMinWidth(0);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        jButton1.setText("검색옵션");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("이전");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        search.setVisible(true);
        search.setLocationRelativeTo(this);
        search.setSize(392, 550);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        TableModel data = jTable1.getModel();
        
        imageLabel.setIcon(new ImageIcon(setIconImage((String)data.getValueAt(row, 8), 160, 180)));
        nameLabel.setText((String)data.getValueAt(row, 1));
        priceLabel.setText((String)data.getValueAt(row, 2));
        locationLabel.setText((String)data.getValueAt(row, 3));
        categoryLabel.setText((String)data.getValueAt(row, 4));
        quantityLabel.setText((String)data.getValueAt(row, 5));
        statusLabel.setText((String)data.getValueAt(row, 6));
        explanationTextArea.setText((String)data.getValueAt(row, 7));
        explanationTextArea.setEditable(false);
        productInfo.setVisible(true);
        productInfo.setLocationRelativeTo(null);
        productInfo.setSize(460, 520);
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) logTable.getModel();
        String name = nameTextField.getText();
        String category = kategorie_product.getSelectedItem().toString();
        String minPrice = minPriceTextField.getText();
        String maxPrice = maxPriceTextField.getText();
        String location = locationComboBox.getSelectedItem().toString();       
        if (!minPrice.equals("") && !maxPrice.equals("")) {
            if (Integer.parseInt(minPrice) > Integer.parseInt(maxPrice)) {
                JOptionPane.showMessageDialog(null, "최소금액이 최대금액보다 큽니다.");
            }
        }
        
        String str = name + "\t" + category + "\t" + minPrice + "\t" + maxPrice + "\t" + location;
        log.setLog(str);
        savedSearchLog.add(log.saveToMemento());
        model.insertRow(model.getRowCount(), new Object[]{
            name, category, minPrice, maxPrice, location
        });
        search.dispose();
        model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        addRowToJTable();        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        search.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void logTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logTableMouseClicked
        // TODO add your handling code here:
        
        String[] restoredData = log.restoreFromMemento(savedSearchLog.get(logTable.getSelectedRow())).split("\t");
        nameTextField.setText(restoredData[0]);
        kategorie_product.setSelectedItem(restoredData[1]);
        minPriceTextField.setText(restoredData[2]);
        maxPriceTextField.setText(restoredData[3]);
        locationComboBox.setSelectedItem(restoredData[4]);
    }//GEN-LAST:event_logTableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        productInfo.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //구매버튼
        int row = jTable1.getSelectedRow();
        TableModel data = jTable1.getModel();
        String name = (String)data.getValueAt(row, 1);
        String price = (String)data.getValueAt(row, 2);
        String location = (String)data.getValueAt(row, 3);
        String category = (String)data.getValueAt(row, 4);
        String status = (String)data.getValueAt(row, 6);
        
        try {
            File f1 = new File("C:\\DB\\RegistrationProduct.txt");
            List<String> nlist = new ArrayList<String>();
            
            BufferedReader bufferread = new BufferedReader(new FileReader(f1));
            String li;
            
            while ((li = bufferread.readLine()) != null){
                String[] str = li.split("\t"); 
                if(name.equals(str[3])&&price.equals(str[4])&&location.equals(str[8])&&category.equals(str[1])&&status.equals(str[9])){
                    continue;
                } else {
                    nlist.add(li);
                }
            }
            FileWriter writer = new FileWriter(f1);
            BufferedWriter bw2 = new BufferedWriter(writer);
           
            for(int i=0; i<nlist.size(); i++){
                li = nlist.get(i);
                bw2.write(li);
                bw2.write("\n");
            }
            bw2.close();
            bufferread.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            System.out.println("오류발생");
        }
        
        JOptionPane.showMessageDialog(null, "구매 완료되었습니다.");
        productInfo.dispose();
        dispose();
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void minPriceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minPriceTextFieldKeyTyped
        // 숫자만 입력받는다.
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_minPriceTextFieldKeyTyped

    private void maxPriceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxPriceTextFieldKeyTyped
        // 숫자만 입력받는다.
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_maxPriceTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(Bbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bbs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextArea explanationTextArea;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    public javax.swing.JComboBox<String> kategorie_product;
    public javax.swing.JComboBox<String> locationComboBox;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTable logTable;
    public javax.swing.JTextField maxPriceTextField;
    public javax.swing.JTextField minPriceTextField;
    private javax.swing.JLabel nameLabel;
    public javax.swing.JTextField nameTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JDialog productInfo;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JDialog search;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
