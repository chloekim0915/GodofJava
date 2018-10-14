public class SalaryManager1 {


    public static void main(String[] args) {
        SalaryManager1 result = new SalaryManager1();
        System.out.println("result="+ result.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary){

        double monthSalary= yearlySalary/12.0;
        System.out.println("monthSalary="+monthSalary);

        double calculateTax=calculateTax(monthSalary);
        double calculateNationalPension=calculateNationalPension(monthSalary);
        double calculateHealthInsurance=calculateHealthInsurance(monthSalary);
        monthSalary-=calculateTax+calculateNationalPension+calculateHealthInsurance;
        return monthSalary;
    }

    public double calculateTax(double monthSalary){

        double Tax = 12.5;
        Tax*=monthSalary*0.01;
        System.out.println("Tax=" + Tax);
        return Tax;
    }

    public double calculateNationalPension(double monthSalary){

        double Pension = 8.1;
        Pension*=monthSalary*0.01;
        System.out.println("Pension="+Pension);
        return  Pension;
    }

    public double calculateHealthInsurance(double monthSalary){

        double HealthInsurance = 13.5;
        HealthInsurance*=monthSalary*0.01;
        System.out.println("HealthInsurance="+HealthInsurance);
        return  HealthInsurance;
    }
}
