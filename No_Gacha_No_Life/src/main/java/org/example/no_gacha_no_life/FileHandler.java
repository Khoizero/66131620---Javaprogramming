package org.example.no_gacha_no_life;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    // Hàm đọc file và trả về danh sách các dòng
    public static List<String> loadItemsFromFile(String fileName) {
        try {
            // Đọc toàn bộ các dòng trong file, loại bỏ các dòng trống
            return Files.lines(Paths.get(fileName))
                    .filter(line -> !line.trim().isEmpty())
                    .toList();
        } catch (IOException e) {
            System.err.println("Lỗi: Không tìm thấy file " + fileName);
            return new ArrayList<>(); // Trả về list rỗng nếu lỗi
        }
    }

    // Hàm ghi lịch sử quay (Dùng cho Giai đoạn sau)
    public static void saveHistory(String entry) {
        try {
            String record = "[" + java.time.LocalDateTime.now() + "] " + entry + "\n";
            Files.write(Paths.get("history.txt"),
                    record.getBytes(),
                    java.nio.file.StandardOpenOption.CREATE,
                    java.nio.file.StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
