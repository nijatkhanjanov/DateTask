package javadersim;

public class MainDispencer {
    public static void main(String[] args) {
        Dispencer Suqabi = new Dispencer();
        Suqabi.setMaxVolume(100);
        Suqabi.takeColdWater(22);
        String dlk = "Samir";
        int a = dlk.hashCode();

        System.out.println(a);
        System.out.println("----------");
        System.out.println(dlk.hashCode());

    }
}
