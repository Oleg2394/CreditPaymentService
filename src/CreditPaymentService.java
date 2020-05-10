public class CreditPaymentService {
    public double calculate(double years, double amount, double rate) {
        double month = years * 12;                             // Перевод количества лет в месяц.
        double percentRatio = rate / 100 / 12;                 // месячная % ставка по кредиту.
        double degree = Math.pow(1 + percentRatio, month);              // Расчет степени в формуле Коэффициент. аннуитета
        double annuityRatio = ((percentRatio * degree) / (degree - 1)); // // Коэффициент аннуитета
        double payment = Math.round(amount * annuityRatio);             // ежемесячный платеж
        return payment;
    }
}