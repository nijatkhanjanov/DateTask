package javadersim;

public class Dispencer {
    private int length;
    private int width;
    private int height;
    private String brand;
    private String waterBrand;
    private int maxVolume;

    public void takeColdWater(int volume) {

        System.out.println("Max volume = " + maxVolume);
        System.out.println("bakda qaliq su = " + (maxVolume - volume));
        maxVolume -= volume;
        System.out.println("bakda qaliq su = " + (maxVolume - volume));
        maxVolume -= volume;
        System.out.println(maxVolume);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWaterBrand() {
        return waterBrand;
    }

    public void setWaterBrand(String waterBrand) {
        this.waterBrand = waterBrand;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
 public Dispencer(int lenth, int width, int height, String brand, String waterBrand, int maxVolume) {
        this.length = lenth;
        this.width = width;
        this.brand = brand;
        this.waterBrand = waterBrand;
        this.maxVolume = maxVolume;
        this.height = height;

 }

    public Dispencer() {
    }
}
