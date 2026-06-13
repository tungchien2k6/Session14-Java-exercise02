import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenDoiChuoiSangSoNguyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> danhSachHopLe = new ArrayList<>();

        int soHopLe = 0;
        int soKhongHopLe = 0;

        System.out.println("=== CHƯƠNG TRÌNH CHUYỂN ĐỔI CHUỖI SANG SỐ NGUYÊN ===");
        System.out.println("Nhập các chuỗi (nhập 'exit' hoặc 'thoat' để dừng):");

        while (true) {
            System.out.print("Nhập chuỗi: ");
            String input = sc.nextLine().trim();

            // Kiểm tra điều kiện thoát
            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("thoat")) {
                break;
            }

            try {
                // Thử chuyển đổi chuỗi sang số nguyên
                int so = Integer.parseInt(input);
                danhSachHopLe.add(so);
                soHopLe++;
                System.out.println("Hợp lệ: " + so);
            } catch (NumberFormatException e) {
                // Bắt ngoại lệ khi chuỗi không phải số nguyên
                soKhongHopLe++;
                System.out.println("Không hợp lệ: \"" + input + "\"");
            }
        }

        // Hiển thị kết quả thống kê
        System.out.println("\n" + "=".repeat(50));
        System.out.println("KẾT QUẢ:");
        System.out.println("Số chuỗi hợp lệ: " + soHopLe);
        System.out.println("Số chuỗi không hợp lệ: " + soKhongHopLe);

        if (soHopLe > 0) {
            System.out.println("Danh sách số nguyên hợp lệ: " + danhSachHopLe);
        } else {
            System.out.println("Danh sách số nguyên hợp lệ: []");
        }

        sc.close();
    }
}