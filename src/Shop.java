import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dexp Aquilon", 8, 256, "Windows 11 Home", "Серый");
        Laptop laptop2 = new Laptop("Dexp Aquilon", 8, 128, "Windows 11 Home", "Серебристый");
        Laptop laptop3 = new Laptop("Echips Joy", 6, 128, "Windows 11 Pro", "Серый");
        Laptop laptop4 = new Laptop("Dexp Atlas", 8, 256, "Windows 11 Pro", "Серый");
        Laptop laptop5 = new Laptop("Asus ExpertBook", 4, 128, "Windows 11 Pro", "Чёрный");
        Laptop laptop6 = new Laptop("Asus VivoBook", 16, 512, "Без ОС", "Серебристый");
        Laptop laptop7 = new Laptop("MSI Katana 17", 8, 512, "Без ОС", "Чёрный");
        Laptop laptop8 = new Laptop("Huawei MateBook", 8, 512, "Без ОС", "Серый");
        Laptop laptop9 = new Laptop("Vologda 11ШБ", 128, 2048, "Astra Linux", "Баклажан");

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(
                laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8, laptop9));

        filter(laptops);
    }

    public static void filter(Set<Laptop> laptops) {

    }
}