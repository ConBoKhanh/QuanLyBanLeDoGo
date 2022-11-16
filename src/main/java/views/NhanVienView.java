/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import domainModels.ChucVu;
import domainModels.CuaHang;
import domainModels.NhanVien;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.ChucVuSerivce;
import services.CuaHangService;
import services.NhanVienService;
import services.impl.IManageChucVuService;
import services.impl.IManageCuaHangService;
import services.impl.IManageNhanVienService;
import viewModel.ViewModelChucVu;
import viewModel.ViewModelCuaHang;
import viewModel.ViewModelNhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienView extends javax.swing.JFrame {

    private IManageNhanVienService nhanVienService = new NhanVienService();
    private IManageCuaHangService cuaHangService = new CuaHangService();
    private IManageChucVuService chucVuService = new ChucVuSerivce();

    DefaultTableModel model = new DefaultTableModel();

    public void loadTable() {
        model = (DefaultTableModel) TBBANG.getModel();
        model.setColumnCount(0);
        model.addColumn("Id");
        model.addColumn("Mã");
        model.addColumn("Họ tên");
        model.addColumn("SĐT");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngày sinh");
        model.addColumn("Cửa hàng");
        model.addColumn("Chức vụ");
        model.addColumn("Mật khẩu");
        model.addColumn("Email");

        model.setRowCount(0);
        List<ViewModelNhanVien> nv = nhanVienService.getAll();
        for (ViewModelNhanVien viewModelNhanVien : nv) {
            model.addRow(new Object[]{
                viewModelNhanVien.getId(), viewModelNhanVien.getMa(), viewModelNhanVien.getHoTen(),
                viewModelNhanVien.getSdt(), viewModelNhanVien.getDiaChi(), viewModelNhanVien.getNgaySinh(),
                viewModelNhanVien.getIdCH(), viewModelNhanVien.getIdCV(), viewModelNhanVien.getMatKhau(), viewModelNhanVien.getEmail()
            });

        }
    }

    public void loadTableTimKiem(String ten) {
        model = (DefaultTableModel) TBBANG.getModel();
        model.setColumnCount(0);
        model.addColumn("Id");
        model.addColumn("Mã");
        model.addColumn("Họ tên");
        model.addColumn("SĐT");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngày sinh");
        model.addColumn("Cửa hàng");
        model.addColumn("Chức vụ");
        model.addColumn("Mật khẩu");
        model.addColumn("Email");

        model.setRowCount(0);
        List<ViewModelNhanVien> nv = nhanVienService.listtk(ten);
        for (ViewModelNhanVien viewModelNhanVien : nv) {
            model.addRow(new Object[]{
                viewModelNhanVien.getId(), viewModelNhanVien.getMa(), viewModelNhanVien.getHoTen(),
                viewModelNhanVien.getSdt(), viewModelNhanVien.getDiaChi(), viewModelNhanVien.getNgaySinh(),
                viewModelNhanVien.getIdCH(), viewModelNhanVien.getIdCV(), viewModelNhanVien.getMatKhau(), viewModelNhanVien.getEmail()
            });

        }
    }

    public String getCHCBB() {
        String id = null;
        List<ViewModelCuaHang> a = cuaHangService.getAll();
        for (ViewModelCuaHang viewModelCuaHang : a) {
            if (CBCCUAHANG.getSelectedItem().equals(viewModelCuaHang.getTenCuaHang())) {
                id = viewModelCuaHang.getId();
            }

        }
        return id;
    }

    public String getCBBCV() {
        String id = null;
        List<ViewModelChucVu> a = chucVuService.getAll();
        for (ViewModelChucVu viewModelChucVu : a) {
            if (CBCCHUCVU.getSelectedItem().equals(viewModelChucVu.getTen())) {
                id = viewModelChucVu.getId();
            }

        }
        return id;
    }

    public void loadCBB() {
        List<ViewModelCuaHang> a = cuaHangService.getAll();
        for (ViewModelCuaHang viewModelCuaHang : a) {
            CBCCUAHANG.addItem(viewModelCuaHang.getTenCuaHang());

        }

        List<ViewModelChucVu> b = chucVuService.getAll();
        for (ViewModelChucVu viewModelChucVu : b) {
            CBCCHUCVU.addItem(viewModelChucVu.getTen());

        }
    }

    /**
     * Creates new form NhanVienView
     */
    public NhanVienView() {
        initComponents();
        loadTable();
        loadCBB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBBANG = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        CBCCUAHANG = new javax.swing.JComboBox<>();
        CBCCHUCVU = new javax.swing.JComboBox<>();
        txttimKiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TXTID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TXTMA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXTSDT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TXTDIACHI = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TXTHOTEN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEmailNv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtmatKhau = new javax.swing.JTextField();
        ngaySinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        TBBANG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Ma", "HoTen", "sdt", "DiaChi", "NgaySinh", "TenCV", "TenCuaHang"
            }
        ));
        TBBANG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBBANGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBBANG);

        jButton1.setText("Back");

        txttimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimKiemKeyReleased(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 204, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setText("Add");
        btnThem.setBorder(new javax.swing.border.MatteBorder(null));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 204, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setText("Delete");
        btnXoa.setBorder(new javax.swing.border.MatteBorder(null));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 204, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setText("Update");
        btnSua.setBorder(new javax.swing.border.MatteBorder(null));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        TXTID.setBackground(new java.awt.Color(255, 204, 204));
        TXTID.setActionCommand("<Not Set>");
        TXTID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Ma");

        TXTMA.setBackground(new java.awt.Color(255, 204, 204));
        TXTMA.setActionCommand("<Not Set>");
        TXTMA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        TXTMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTMAActionPerformed(evt);
            }
        });

        jLabel9.setText("SÐT");

        TXTSDT.setBackground(new java.awt.Color(255, 204, 204));
        TXTSDT.setActionCommand("<Not Set>");
        TXTSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jLabel10.setText("DiaChi");

        TXTDIACHI.setBackground(new java.awt.Color(255, 204, 204));
        TXTDIACHI.setActionCommand("<Not Set>");
        TXTDIACHI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        TXTDIACHI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDIACHIActionPerformed(evt);
            }
        });

        jLabel11.setText("HoTen");

        TXTHOTEN.setBackground(new java.awt.Color(255, 204, 204));
        TXTHOTEN.setActionCommand("<Not Set>");
        TXTHOTEN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        TXTHOTEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTHOTENActionPerformed(evt);
            }
        });

        jLabel12.setText("NgaySinh");

        jLabel13.setText("CuaHang");

        jLabel14.setText("TenCV");

        jLabel15.setText("Email");

        txtEmailNv.setBackground(new java.awt.Color(255, 204, 204));
        txtEmailNv.setActionCommand("<Not Set>");
        txtEmailNv.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtEmailNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailNvActionPerformed(evt);
            }
        });

        jLabel1.setText("Mật khẩu");

        txtmatKhau.setBackground(new java.awt.Color(255, 204, 204));
        txtmatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        ngaySinh.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEmailNv, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXTMA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(TXTID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXTHOTEN, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTDIACHI, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtmatKhau)
                                    .addComponent(ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txttimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBCCUAHANG, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBCCHUCVU, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(88, 88, 88))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TXTSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CBCCUAHANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CBCCHUCVU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTMA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTDIACHI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTHOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailNv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(txttimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        java.util.Date date = ngaySinh.getDate();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String now = format.format(date);

        String idCH = getCHCBB();
        String idCV = getCBBCV();
        String hoTen = TXTHOTEN.getText();
        String sdt = TXTSDT.getText();
        String diaChi = TXTDIACHI.getText();
        // String ngaySinh = getDate.getDateFormatString();
        String matKhau = txtmatKhau.getText();
        String email = txtEmailNv.getText();

        NhanVien nv = new NhanVien();

        CuaHang ch = new CuaHang();
        ch.setId(idCH);

        ChucVu cv = new ChucVu();
        cv.setId(idCV);

        nv.setIdCuaHang(ch);
        nv.setIdChucVu(cv);
        nv.setHoTen(hoTen);
        nv.setSdt(sdt);
        nv.setDiaChi(diaChi);
        //nv.setNgaySinh(ngaySinh);
        nv.setNgaySinh(Date.valueOf(now));

        nv.setMatKhau(matKhau);
        nv.setEmail(email);

        boolean b = nhanVienService.add(nv);

        if (b == true) {
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("/img/themmoiicon.png"));
            JOptionPane.showMessageDialog(this, "Thêm sp thành công", "Sản Phẩm", JOptionPane.INFORMATION_MESSAGE, icon);
            loadTable();
        } else {
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("/img/deleteicon.png"));
            JOptionPane.showMessageDialog(this, "Trùng Tên Sản Phẩm", "Sản Phẩm", JOptionPane.INFORMATION_MESSAGE, icon);
        }


    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:

        boolean b = nhanVienService.delete(TXTID.getText());
        if (b == true) {
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("/img/themmoiicon.png"));
            JOptionPane.showMessageDialog(this, "Delete sp thành công", "Sản Phẩm", JOptionPane.INFORMATION_MESSAGE, icon);
            loadTable();

        } else {
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("/img/deleteicon.png"));
            JOptionPane.showMessageDialog(this, "Delete Tên Sản Phẩm", "Sản Phẩm", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

        java.util.Date date = ngaySinh.getDate();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String now = format.format(date);
        String id = TXTID.getText();
        String idCH = getCHCBB();
        String idCV = getCBBCV();
        String hoTen = TXTHOTEN.getText();
        String sdt = TXTSDT.getText();
        String diaChi = TXTDIACHI.getText();
        // String ngaySinh = getDate.getDateFormatString();
        String matKhau = txtmatKhau.getText();
        String email = txtEmailNv.getText();

        NhanVien nv = new NhanVien();

        CuaHang ch = new CuaHang();
        ch.setId(idCH);

        ChucVu cv = new ChucVu();
        cv.setId(idCV);

        nv.setId(id);
        nv.setIdCuaHang(ch);
        nv.setIdChucVu(cv);
        nv.setHoTen(hoTen);
        nv.setSdt(sdt);
        nv.setDiaChi(diaChi);
        //nv.setNgaySinh(ngaySinh);
        nv.setNgaySinh(Date.valueOf(now));

        nv.setMatKhau(matKhau);
        nv.setEmail(email);

        boolean b = nhanVienService.update(nv);

        if (b == true) {
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("/img/themmoiicon.png"));
            JOptionPane.showMessageDialog(this, "Sửa sp thành công", "Sản Phẩm", JOptionPane.INFORMATION_MESSAGE, icon);
            loadTable();
        } else {
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("/img/deleteicon.png"));
            JOptionPane.showMessageDialog(this, "Sửa thất Sản Phẩm", "Sản Phẩm", JOptionPane.INFORMATION_MESSAGE, icon);
        }


    }//GEN-LAST:event_btnSuaActionPerformed

    private void TXTMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTMAActionPerformed

    private void TXTDIACHIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDIACHIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDIACHIActionPerformed

    private void TXTHOTENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTHOTENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTHOTENActionPerformed

    private void txtEmailNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailNvActionPerformed

    private void TBBANGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBBANGMouseClicked
        // TODO add your handling code here:

        int index = TBBANG.getSelectedRow();

        String ns = TBBANG.getValueAt(index, 5).toString();
        // Date ngay = Date.valueOf(ngaySinh);
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date result;
        try {
            result = sdt.parse(ns);
            ngaySinh.setDate(result);
            TXTID.setText(TBBANG.getValueAt(index, 0).toString());
            TXTMA.setText(TBBANG.getValueAt(index, 1).toString());
            TXTHOTEN.setText(TBBANG.getValueAt(index, 2).toString());
            TXTSDT.setText(TBBANG.getValueAt(index, 3).toString());
            TXTDIACHI.setText(TBBANG.getValueAt(index, 4).toString());

            CBCCUAHANG.setSelectedItem(TBBANG.getValueAt(index, 6).toString());
            CBCCHUCVU.setSelectedItem(TBBANG.getValueAt(index, 7).toString());
            txtmatKhau.setText(TBBANG.getValueAt(index, 8).toString());
            txtEmailNv.setText(TBBANG.getValueAt(index, 9).toString());

        } catch (ParseException ex) {
            Logger.getLogger(NhanVienView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_TBBANGMouseClicked

    private void txttimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKiemKeyReleased
        // TODO add your handling code here:
        loadTableTimKiem(txttimKiem.getText());

    }//GEN-LAST:event_txttimKiemKeyReleased

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
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCCHUCVU;
    private javax.swing.JComboBox<String> CBCCUAHANG;
    private javax.swing.JTable TBBANG;
    private javax.swing.JTextField TXTDIACHI;
    private javax.swing.JTextField TXTHOTEN;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTMA;
    private javax.swing.JTextField TXTSDT;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser ngaySinh;
    private javax.swing.JTextField txtEmailNv;
    private javax.swing.JTextField txtmatKhau;
    private javax.swing.JTextField txttimKiem;
    // End of variables declaration//GEN-END:variables
}
