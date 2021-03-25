import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String Nama;
        String NIM;
        String Umur;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Nama: ");
        Nama = input.nextLine();
        System.out.print("NIM: ");
        NIM = input.nextLine();
        System.out.print("Umur: ");
        Umur = input.nextLine();
        
        
        System.out.println("Nama: " +Nama+" NIM: "+NIM+" Umur: "+Umur);
        
   }
    
}