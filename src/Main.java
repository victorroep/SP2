public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage("Gedegaragen");

        garage.addCar(new PetrolCar(1234, "Fiat", 1999, 3, 2, 6));
        garage.addCar(new PetrolCar(2314, "Mercedes", 1730, 5, 4, 20));
        garage.addCar(new ElectricCar(4321, "Tesla", 2029, 5, 100, 300, 150));
        garage.addCar(new DieselCar(1432, "Regnbil", 1000, 2, true, 15));
        garage.addCar(new DieselCar(1243, "Bilen", 1998, 5, false, 13));

        System.out.println(garage.toString());
        System.out.println(garage.calcTaxForGarage());
    }
}
