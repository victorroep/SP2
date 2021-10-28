public class PetrolCar extends Car {
    private int oktanTal;
    private int kmPrL;

    public PetrolCar(int regNum, String model, int generation, int doorAmount, int oktanTal, int kmPrL) {
        super(regNum, model, generation, doorAmount);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    public abstract double calcTax(){
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

    public int getOktanTal() {
        return oktanTal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }
}