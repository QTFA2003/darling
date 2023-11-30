package main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SwingTableExample {
    public static void main(String[] args) {
        // Tạo một JFrame
        JFrame frame = new JFrame("Example Table");

        // Tạo một mô hình dữ liệu mặc định cho bảng
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tên");
        model.addColumn("Tuổi");

        // Thêm dữ liệu vào bảng
        model.addRow(new Object[] {"Nguyễn Văn A", 30});
        model.addRow(new Object[] {"Trần Thị B", 25});

        // Tạo một JTable với mô hình dữ liệu đã tạo
        JTable table = new JTable(model);

        // Thêm bảng vào JFrame
        frame.add(new JScrollPane(table));

        // Thiết lập thuộc tính của JFrame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
