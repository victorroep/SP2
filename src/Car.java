public abstract class Car {
    private int regNum;
    private String model;
    private int generation;
    private int doorAmount;

    public Car(int regNum, String model, int generation, int doorAmount) {
        this.regNum = regNum;
        this.model = model;
        this.generation = generation;
        this.doorAmount = doorAmount;
    }

    public abstract double calcTax();

    public int getRegNum() {
        return regNum;
    }

    public String getModel() {
        return model;
    }

    public int getGeneration() {
        return generation;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public void setDoorAmount(int doorAmount) {
        this.doorAmount = doorAmount;
    }
}