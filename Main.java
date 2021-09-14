import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
Scanner Operator_Input_User = new Scanner(System.in);
float Operator_Digit_Variabel_A;
float Operator_Digit_Variabel_B;
String Operator_Penentuan_Kalkulasi;

System.out.print("-Masukan nilai variabel a:  \n");
Operator_Digit_Variabel_A = Operator_Input_User.nextFloat();
System.out.print("-Operator yang anda pilih: \n");
Operator_Penentuan_Kalkulasi = Operator_Input_User.next();
System.out.print("-Masukan nilai variabrl b: \n");
Operator_Digit_Variabel_B = Operator_Input_User.nextFloat();
switch (Operator_Penentuan_Kalkulasi) {
  case "+":
    float Hasil_Kalkulasi_Plus;
    Hasil_Kalkulasi_Plus = (Operator_Digit_Variabel_A + Operator_Digit_Variabel_B);
    System.out.print("Hasil penjumlahan: "
    + Hasil_Kalkulasi_Plus);
    break;
    case "-":
        float Hasil_Kalkulasi_Minus;
    Hasil_Kalkulasi_Minus = (Operator_Digit_Variabel_A - Operator_Digit_Variabel_B);
    System.out.print("Hasil penjumlahan: " + Hasil_Kalkulasi_Minus);
    break;
    case "*":
        float Hasil_Kalkulasi_Kali;
    Hasil_Kalkulasi_Kali = (Operator_Digit_Variabel_A * Operator_Digit_Variabel_B);
    System.out.print("Hasil penjumlahan: " + Hasil_Kalkulasi_Kali);
    break;
    case "/":
        float Hasil_Kalkulasi_Bagi;
    Hasil_Kalkulasi_Bagi = (Operator_Digit_Variabel_A / Operator_Digit_Variabel_B);
    System.out.print("Hasil penjumlahan: " + Hasil_Kalkulasi_Bagi);
    break;
    default:
    System.out.print("Operator tidak ditemukan");
}
  }
}