package t1011.exam3;

public class Car {

    String company = "현대자동차";
    String model;
    String color;
    int maxSpead;

    Car() {}

    Car(String model) {
        this.model = model;

    }

    Car(String model,String color){
        this.model = model;
        this.color = color;

    }

    Car(String model,String color, int maxSpead){
        this.model = model;
        this.color = color;
        this.maxSpead = maxSpead;

    }
}
