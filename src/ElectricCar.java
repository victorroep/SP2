public class ElectricCar extends Car {
    private int batterikapacitetKWh;
    private int maxKm;
    private int whPrKm;

    public ElectricCar(int regNum, String model, int generation, int doorAmount, int batterikapacitetKWh, int maxKm, int whPrKm) {
        super(regNum, model, generation, doorAmount);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public double calcTax(){
        double kmPrL = 100 / (whPrKm / 91.25);
        if(kmPrL > 20 && kmPrL <= 50){
            return 330.00;
        }else if(kmPrL > 15 && kmPrL <= 20){
            return 1050.00;
        }else if(kmPrL > 10 && kmPrL <= 15){
            return 2340.00;
        }else if(kmPrL > 5 && kmPrL <= 10){
            return 5500.00;
        }else{
            return 10470.00;
        }
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }
}