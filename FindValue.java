import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên học sinh cần tìm: ");
        String inputName = input.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Vị trí của học sinh " + inputName + " là: " + (i + 1));
                isExist = true;
                break;
            }

        }
        if (isExist == false)
            System.out.println("Không có " + inputName + " trong danh sách");
    }
}
