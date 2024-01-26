import java.util.*;

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

        Map<String, Object> laptopFilters = getLaptopFilters(laptops);
        Set<Laptop> filteredLaptops = findFilteredLaptops(laptops, laptopFilters);
        printFilteredLaptops(filteredLaptops);
    }

    public static Map<String, Object> getLaptopFilters(Set<Laptop> laptops) {

        Map<String, Object> userParameters = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        boolean endFiltration = false;
        while(!endFiltration) {
            System.out.println(
                    "Введите цифру фильтруемого параметра:\n" +
                            "1 - Название ноутбука\n" +
                            "2 - Объем памяти ОЗУ, ГБт\n" +
                            "3 - Объем памяти ЖД, ГБт\n" +
                            "4 - Операционная система\n" +
                            "5 - Цвет\n" +
                            "0 - Прекратить выбор фильтров");

            int parameter = sc.nextInt();
            sc.nextLine();

            switch (parameter) {
                case 1:
                    System.out.println("Введите название ноутбука:");
                    Set<String> uniqNames = getUniqNames(laptops);
                    System.out.println("Варианты:\n" + uniqNames);
                    String name = sc.nextLine();
                    userParameters.put("name", name);
                    break;
                case 2:
                    System.out.println("Введите объём памяти ОЗУ, ГБт:");
                    Set<Integer> uniqRAM = getUniqRAM(laptops);
                    System.out.println("Варианты:\n" + uniqRAM);
                    String memRAM = sc.nextLine();
                    userParameters.put("memRAM", memRAM);
                    break;
                case 3:
                    System.out.println("Введите объём памяти ЖД, ГБт:");
                    Set<Integer> uniqHDD = getUniqHDD(laptops);
                    System.out.println("Варианты:\n" + uniqHDD);
                    String memHDD = sc.nextLine();
                    userParameters.put("memHDD", memHDD);
                    break;
                case 4:
                    System.out.println("Введите тип операционной системы:");
                    Set<String> uniqOS = getUniqOS(laptops);
                    System.out.println("Варианты:\n" + uniqOS);
                    String OS = sc.nextLine();
                    userParameters.put("OS", OS);
                    break;
                case 5:
                    System.out.println("Введите цвет:");
                    Set<String> uniqColor = getUniqColor(laptops);
                    System.out.println("Варианты:\n" + uniqColor);
                    String color = sc.nextLine();
                    userParameters.put("Color", color);
                    break;
                case 0:
                    endFiltration = true;
                    break;
                default:
                    System.out.println("Некорректный выбор параметра");
                    return null;
            }
            System.out.println(userParameters);
        }

        sc.close();

        return userParameters;
    }

    public static Set<Laptop> findFilteredLaptops (Set<Laptop> laptops,
                                             Map<String, Object> laptopFilters) {

        if (laptopFilters == null) {
            return null;
        } else {
            Set<Laptop> foundLaptops = new HashSet<Laptop>(laptops);
            for (Laptop laptop: laptops) {
                for (Map.Entry<String, Object> elem : laptopFilters.entrySet()) {
                    String filter = elem.getKey();
                    Object value = elem.getValue();

                    switch (filter) {
                        case "name":
                            if (!laptop.getName().equals(value)) {
                                foundLaptops.remove(laptop);
                            }
                            break;
                        case "memRAM":
                            if (laptop.getMemRAM() < (int) value) {
                                foundLaptops.remove(laptop);
                            }
                            break;
                        case "memHDD":
                            if (laptop.getMemHDD() < (int) value) {
                                foundLaptops.remove(laptop);
                            }
                            break;
                        case "OS":
                            if (!laptop.getOS().equals(value)) {
                                foundLaptops.remove(laptop);
                            }
                            break;
                        case "Color":
                            if (!laptop.getColor().equals(value)) {
                                foundLaptops.remove(laptop);
                            }
                            break;
                    }
                }

            }

            return foundLaptops;
        }

    }

    public static void printFilteredLaptops(Set<Laptop> filteredLaptops) {
        if (filteredLaptops == null) {
            System.out.println("Под выбранные параметры не подпадает ни один ноутбук\n");
        } else {
            System.out.println("Ноутбуки с выбранными параметрами:");
            for (Laptop laptop : filteredLaptops) System.out.println(laptop);
        }
    }

    public static TreeSet<String> getUniqNames(Set<Laptop> laptops) {
        TreeSet<String> uniqNames = new TreeSet<String>();
        for (Laptop laptop: laptops) uniqNames.add(laptop.getName());
        return uniqNames;
    }

    public static TreeSet<Integer> getUniqRAM(Set<Laptop> laptops) {
        TreeSet<Integer> uniqRAM = new TreeSet<Integer>();
        for (Laptop laptop: laptops) uniqRAM.add(laptop.getMemRAM());
        return uniqRAM;
    }

    public static TreeSet<Integer> getUniqHDD(Set<Laptop> laptops) {
        TreeSet<Integer> uniqHDD = new TreeSet<Integer>();
        for (Laptop laptop: laptops) uniqHDD.add(laptop.getMemHDD());
        return uniqHDD;
    }

    public static TreeSet<String> getUniqOS(Set<Laptop> laptops) {
        TreeSet<String> uniqOS = new TreeSet<String>();
        for (Laptop laptop: laptops) uniqOS.add(laptop.getOS());
        return uniqOS;
    }

    public static TreeSet<String> getUniqColor(Set<Laptop> laptops) {
        TreeSet<String> uniqColor = new TreeSet<String>();
        for (Laptop laptop: laptops) uniqColor.add(laptop.getColor());
        return uniqColor;
    }


}