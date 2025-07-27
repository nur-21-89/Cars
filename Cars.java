package UcuncuHafta;

public class Cars {
    String model;
    int speed=0;
    String color;
    String type;

    Cars (String model,String type,String color){
        this.model = model;
        this.type = type;
        this.speed = 0;
        this.color = color;

    }

    int hizArtis(int artis){
        speed += artis;
        return speed;
    }

    int hizAzalis(int azalis){
        if(speed > 0){
          speed -= azalis;
        }
        return speed;
    }

    void info(){
        System.out.println("============");
        System.out.println("Model:\t"+this.model);
        System.out.println("Tipi:\t"+this.type);
        System.out.println("Hız:\t"+this.speed);
        System.out.println("Renk:\t"+this.color);

    }
}
