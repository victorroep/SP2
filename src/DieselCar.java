public class DieselCar extends Car {
    private boolean hasParticleFilter;
    private int kmPrL;

    public DieselCar(int regNum, String model, int generation, int doorAmount, boolean hasParticleFilter, int kmPrL) {
        super(regNum, model, generation, doorAmount);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public double calcTax(){
        int particleTax = hasParticleFilter ? 1000 : 0;
        if(kmPrL > 20 && kmPrL <= 50){
            return 330.00 + 130.00 + particleTax;
        }else if(kmPrL > 15 && kmPrL <= 20){
            return 1050.00 + 1390.00 + particleTax;
        }else if(kmPrL > 10 && kmPrL <= 15){
            return 2340.00 + 1850.00 + particleTax;
        }else if(kmPrL > 5 && kmPrL <= 10){
            return 5500.00 + 2770.00 + particleTax;
        }else{
            return 10470.00 + 15260.00 + particleTax;
        }
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }
}