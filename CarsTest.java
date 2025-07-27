package UcuncuHafta;

public class CarsTest {
    public static void main(String[]args){
        Cars range = new Cars("Range Rover","Evoque","Mavi");
        range.hizArtis(40);
        range.info();

        Cars toyota = new Cars("Toyota","Hybrıd","Beyaz");
        toyota.hizAzalis(10);
        toyota.hizArtis(100);
        toyota.info();

        Cars volksvagen = new Cars("Volskvagen","I7","Siyah");
        volksvagen.hizArtis(50);
        volksvagen.hizAzalis(20);
        volksvagen.info();
    }
}
