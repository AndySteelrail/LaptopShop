import java.util.Objects;

public class Laptop {
    private String name;
    private int memRAM;
    private int memHDD;
    private String OS;
    private String color;

    public Laptop(String name, 
                  int memRAM,
                  int memHDD,
                  String OS,
                  String color) {
        this.name = name;
        this.memRAM = memRAM;
        this.memHDD = memHDD;
        this.OS = OS;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMemRAM() {
        return memRAM;
    }
    public void setMemRAM(int memRAM) {
        this.memRAM = memRAM;
    }

    public int getMemHDD() {
        return memHDD;
    }
    public void setMemHDD(int memHDD) {
        this.memHDD = memHDD;
    }

    public String getOS() {
        return OS;
    }
    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "Наименование: '" + name + '\'' +
                ", ОЗУ: " + memRAM +
                ", объём ЖД: " + memHDD +
                ", операционная система: " + OS +
                ", цвет: '" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop note = (Laptop) obj;
        return name.equals(note.name) &&
                memRAM == note.memRAM &&
                memHDD == note.memHDD &&
                OS.equals(note.OS) &&
                color.equals(note.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, memRAM, memHDD, OS,color);
    }
}