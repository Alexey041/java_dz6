public class Notebook {
    private String name;
    private Integer ram;
    private Integer hardDisk;
    private String os;
    private String color;
    
    public Notebook(String name, Integer ram, Integer hardDisk, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.os = os;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getHardDisk() {
        return hardDisk;
    }

    
    public String getOs() {
        return os;
    }

    
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook [name: " + name + ", ram: " + ram + " GB, hardDisk: " + hardDisk + " GB, OS: "
                + os + ", color: " + color + "]";
    }
}
