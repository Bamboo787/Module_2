import java.util.Locale;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        String str = "Trinh Bui Ba Dat".toLowerCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap vao 1 ky tu: ");
        String key = sc.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (key.length() != 1) {
                System.out.println("Vui long nhap lai (chi duoc nhap 1 ky tu)");
                return;
            }
        }
        int count = 0;
        char ch = key.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count += 1;
            }
        }
        System.out.printf("Số lần kí tự xuất hiện là %d", count);
    }
}


