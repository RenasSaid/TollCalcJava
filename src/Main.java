public class Main {
    public static void main(String[] args) {
        TollCalculator tollCalculator = new TollCalculator();

        Vehicle car = new Car("UMF422");
        Vehicle mc = new Motorbike("AKT153");
        
        tollCalculator.getTotalTollFee(car, TimeStamps.getCamera3());
        tollCalculator.getTotalTollFee(mc, TimeStamps.getCamera1());
        tollCalculator.getTotalTollFee(car, TimeStamps.getCamera2());


    }
}