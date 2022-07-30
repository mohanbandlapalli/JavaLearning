package Interface;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(20_000);
        var report = new TaxReport(calculator);
        report.show();



    }
}
