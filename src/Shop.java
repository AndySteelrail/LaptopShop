import java.util.*;
import java.util.stream.Collectors;

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

    public static TreeSet<String> getAllNames(Set<Laptop> laptops) {
        return laptops.stream()
                .map(Laptop::getName)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static TreeSet<Integer> getAllRAM(Set<Laptop> laptops) {
        return laptops.stream()
                .map(Laptop::getMemRAM)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static TreeSet<Integer> getAllHDD(Set<Laptop> laptops) {
        return laptops.stream()
                .map(Laptop::getMemHDD)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static TreeSet<String> getAllOS(Set<Laptop> laptops) {
        return laptops.stream()
                .map(Laptop::getOS)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static TreeSet<String> getAllColor(Set<Laptop> laptops) {
        return laptops.stream()
                .map(Laptop::getColor)
                .collect(Collectors.toCollection(TreeSet::new));
    }

}