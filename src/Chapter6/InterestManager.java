package Chapter6;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager sample = new InterestManager();
//		for(int day=1;day<=365;day++) {
//			double amount=sample.calculateAmount(day, 1000000);
//			System.out.print(day+":"+amount+" ");
//			if(day%20==0) System.out.println();
//		}

        for (int day = 10; day <= 370; day += 10) {
            double amount = sample.calculateAmount(day, 1000000);
            System.out.println(day + ":" + amount + " ");
        }
    }

    public double getInterestRate(int day) {

        double interestRate = 0.0;
        System.out.println(day < 91 ? interestRate = 0.5 : day < 181 ? interestRate = 1.0 : day < 365 ? interestRate = 2.0 : day > 364 ? 5.6 : 0);
        return interestRate;
    }

    public double calculateAmount(int day, long amount) {
        double totalAmount = 0;
        double interest = getInterestRate(day);
        double interestAmount = (interest * amount) / 100.0;
        totalAmount = amount + interestAmount;
        return amount;
    }
}