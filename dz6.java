import java.util.*;

public class dz6 {

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Asus", 12, 1024, "Windows", "Black");
        Notebook notebook2 = new Notebook("Acer", 8, 512, "Windows", "Gray");
        Notebook notebook3 = new Notebook("Dexp", 6, 240, "Linux", "Black");
        Notebook notebook4 = new Notebook("MSI", 16, 2048, "Windows", "Green");
        Notebook notebook5 = new Notebook("Apple", 8, 128, "Mac", "Space Gray");
        Notebook notebook6 = new Notebook("Asus", 10, 1024, "Windows", "Black");

        Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2,
        notebook3, notebook4, notebook5, notebook6));
        System.out.println(sort(notebooks));
        
        
    }

    static Integer scannerInt() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        Integer intScan = Integer.parseInt(scan);
        return intScan;
     }
     static String scannerStr() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
     }

     static Set<Notebook> sort(Set<Notebook> notebooks){
        System.out.println("Выберите по чему будем сортировать:\n"+
                            "1. Бренд\n"+
                            "2. ОЗУ\n"+
                            "3. Объем жесткого диска\n"+
                            "4. ОС\n"+
                            "5. Цвет");
        int parametr = scannerInt();
        if (parametr == 1 | parametr == 4 | parametr == 5) {
            System.out.println("Выберите тип сортировки:\n"+
                                "1. Только искомое\n"+
                                "2. Все, кроме искомого");
        }
        if (parametr == 2 | parametr == 3) {
            System.out.println("Выберите тип сортировки:\n"+
                                "1. Искать только значение\n"+
                                "2. Только больше значения\n"+
                                "3. Только меньше значения");
        }
        int condition = scannerInt();
        System.out.println("Введите искомое значение ");
        if (parametr == 1 | parametr == 4 | parametr == 5) {
            String userInp = scannerStr();
            return sortedStr(notebooks, parametr, condition, userInp);
        }else if (parametr == 2 | parametr == 3) {
            int userInp = scannerInt();
            return sortedInt(notebooks, parametr, condition, userInp);
        }else{
            return notebooks;
        }
        
        

     }
    static Set<Notebook> sortedStr(Set<Notebook> notebooks, Integer parametr, Integer condition, String userInp){
        Set<Notebook> resultNotebooks = new HashSet<>();
        for (Notebook notebook : notebooks) {
            if (parametr.equals(1)) {
                if (condition.equals(1)) {
                    if (userInp.equals(notebook.getName())) {
                        resultNotebooks.add(notebook);
                    }
                }
                if (condition.equals(2)) {
                    if (!userInp.equals(notebook.getName())) {
                        resultNotebooks.add(notebook);
                    }
                }
            }
            if (parametr.equals(4)) {
                if (condition.equals(1)) {
                    if (userInp.equals(notebook.getOs())) {
                        resultNotebooks.add(notebook);
                    }
                }
                if (condition.equals(2)) {
                    if (!userInp.equals(notebook.getOs())) {
                        resultNotebooks.add(notebook);
                    }
                }
            }
            if (parametr.equals(5)) {
                if (condition.equals(1)) {
                    if (userInp.equals(notebook.getColor())) {
                        resultNotebooks.add(notebook);
                    }
                }
                if (condition.equals(2)) {
                    if (!userInp.equals(notebook.getColor())) {
                        resultNotebooks.add(notebook);
                    }
                }
            }
        }
        return resultNotebooks;
    }
    static Set<Notebook> sortedInt(Set<Notebook> notebooks, Integer parametr, Integer condition, Integer userInp){
        Set<Notebook> resultNotebooks = new HashSet<>();
        for (Notebook notebook : notebooks) {
            if (parametr.equals(2)) {
                if (condition.equals(1)) {
                    if (userInp == notebook.getRam()) {
                        resultNotebooks.add(notebook);
                    }
                }
                if (condition.equals(2)) {
                    if (userInp < notebook.getRam()) {
                        resultNotebooks.add(notebook);
                    }
                }
                if (condition.equals(3)) {
                    if (userInp > notebook.getRam()) {
                        resultNotebooks.add(notebook);
                    }
                }
            }
            if (parametr.equals(3)) {
                if (condition.equals(1)) {
                    if (userInp == notebook.getHardDisk()) {
                        resultNotebooks.add(notebook);
                    }
                }
                if (condition.equals(2)) {
                    if (userInp < notebook.getHardDisk()) {
                        resultNotebooks.add(notebook);
                    }
                }
                if (condition.equals(3)) {
                    if (userInp > notebook.getHardDisk()) {
                        resultNotebooks.add(notebook);
                    }
                }
            }
        }
        return resultNotebooks;
    }
}
