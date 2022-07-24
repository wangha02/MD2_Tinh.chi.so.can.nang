import java.util.Scanner;

public class MD2_Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Cân nặng của bạn (tính bằng kilogram)");
        weight = scanner.nextDouble();

        System.out.print("Chiều cao của bạn (tính bằng meter)");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height,2);
        System.out.printf("%-20s","bmi","Interpretation\n"); //Interpretation: diễn dịch //Printf: nhận trực tiếp tham số chuyền từ ngoài in trong chuỗi thông qua %
        if (bmi < 18)
            System.out.printf("%-20s",bmi,"Underweight"); // Underweight: Thiếu cân
        else if (bmi < 25.0)
            System.out.printf("%-20s",bmi,"Normal"); // Normal: Bình thường
        else if (bmi < 30.0)
            System.out.printf("%-20s",bmi,"Overweight"); // Overweight: Thừa cân
        else
            System.out.printf("%-20s",bmi,"Obese"); // Obese: Béo phì
    }
}
//Lưu ý: Với ví dụ này ta thấy các biểu thức điều kiện đều viết dưới dạng không có phần thân scope {}.

