package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class GroceryListApp {
        private static ArrayList<String> groceryList = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int choice;
            do {
                System.out.println("0 - Uygulamayı Durdur");
                System.out.println("1 - Eleman Ekle");
                System.out.println("2 - Eleman Çıkar");
                System.out.println("3 - Listeyi Sırala ve Yazdır");
                System.out.print("Seçiminizi yapınız: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 0:
                        System.out.println("Uygulama durduruluyor...");
                        break;
                    case 1:
                        addItem();
                        break;
                    case 2:
                        removeItem();
                        break;
                    case 3:
                        printSorted();
                        break;
                    default:
                        System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
                        break;
                }
            } while (choice != 0);

            scanner.close();
        }

        private static void addItem() {
            System.out.print("Eklemek istediğiniz eleman(ları) giriniz (virgülle ayırın): ");
            scanner.nextLine(); // Boş bir satırı tüketmek için
            String input = scanner.nextLine();
            String[] items = input.split(",\\s*");
            for (String item : items) {
                if (!checkItemIsInList(item)) {
                    groceryList.add(item);
                }
            }
            Collections.sort(groceryList);
        }

        private static void removeItem() {

            if(groceryList.isEmpty()){
                System.out.println("Liste şuan boş ürünü kaldırmak için eklemelsiiniz");
            }
            else{
                System.out.print("Çıkarmak istediğiniz elemanları giriniz (virgülle ayırın): ");
                scanner.nextLine(); // Boş bir satırı tüketmek için
                String input = scanner.nextLine();
                String[] items = input.split(",\\s*");
                for (String item : items) {
                    if (checkItemIsInList(item)) {
                        groceryList.remove(item);
                    }
                }
                Collections.sort(groceryList);
            }

        }

        private static boolean checkItemIsInList(String item) {
            return groceryList.contains(item);
        }

        private static void printSorted() {
            if (groceryList.isEmpty()) {
                System.out.println("Liste boş.");
            } else {
                System.out.println("Sıralanmış Liste:");
                for (String item : groceryList) {
                    System.out.println(item);
                }
            }
        }
}
