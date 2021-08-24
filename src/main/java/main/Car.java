package main;

public class Car {

    private Engine engine;

    public Car() {

    }

    //With DI
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String showEngineHP() {
        return "hp: " + engine.getHp();
    }
}
