package Model;

public class Car {
    private int engine;
    private int series;
    private String model;

    public Car(int engine, int series, String model) {
        this.engine = engine;
        this.series = series;
        this.model = model;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
