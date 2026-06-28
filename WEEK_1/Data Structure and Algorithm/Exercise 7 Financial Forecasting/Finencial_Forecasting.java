

public class Finencial_Forecasting {
    public static double f_value(double p_value, double g_rate, int year) {
        if (year== 0)
            return p_value;
        return f_value(p_value, g_rate, year - 1) * (1 + g_rate);
    }

    public static void main(String[] args) {

        double presentValue = 100000;  
        double growthRate = 0.15;     
        int years = 15;

        double result = f_value(presentValue, growthRate, years);

        System.out.println("Present Value : " + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : " + result);
    }
}
