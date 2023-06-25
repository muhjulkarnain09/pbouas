/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMADJULKARNAIN
 */
class RotiManis {
    private String rasa;
    private String topping;

    public RotiManis(String rasa, String topping) {
        this.rasa = rasa;
        this.topping = topping;
    }

    public void panggang() {
        System.out.println("Roti sedang dipanggang...");
    }

    public void tambahkanTopping() {
        System.out.println("Menambahkan topping " + topping + " ke roti...");
    }

    public void sajikan() {
        System.out.println("Roti " + rasa + " dengan topping " + topping + " siap disajikan!");
    }
}

class RotiManisV2 extends RotiManis {
    private String isian;

    public RotiManisV2(String rasa, String topping, String isian) {
        super(rasa, topping);
        this.isian = isian;
    }

    public void tambahkanIsian() {
        System.out.println("Menambahkan isian " + isian + " ke dalam roti...");
    }

    @Override
    public void sajikan() {
        System.out.println("Roti " + rasa + " dengan isian " + isian + ", topping " + topping + " siap disajikan!");
    }
}

public class Main {
    public static void main(String[] args) {
        RotiManisV2 roti1 = new RotiManisV2("Coklat", "Keju", "Selai Kacang");
        roti1.panggang();
        roti1.tambahkanTopping();
        roti1.tambahkanIsian();
        roti1.sajikan();

        RotiManis roti2 = new RotiManis("Stroberi", "Coklat");
        roti2.panggang();
        roti2.tambahkanTopping();
        roti2.sajikan();
    }
}
