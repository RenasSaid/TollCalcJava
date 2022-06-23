public class Main {
    public static void main(String[] args) {
        TollCalculator tollCalculator = new TollCalculator();

        Vehicle car = new Car("PMJ770");
        Vehicle mc = new Motorbike("UMF422");
        
        tollCalculator.getTotalTollFee(car, TimeStamps.getCamera3());
        tollCalculator.getTotalTollFee(mc, TimeStamps.getCamera1());
        tollCalculator.getTotalTollFee(car, TimeStamps.getCamera2());


    }
}