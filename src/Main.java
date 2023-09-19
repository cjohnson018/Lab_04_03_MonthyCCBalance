public class Main
{
    public static void main(String[] args)
    {
        int cardBalance = 5000;
        double interest = .17;
        double monthOneInterest = cardBalance * interest;
        double monthTwoInterest = monthOneInterest * 2;
        System.out.println("The interest due after one month is " + monthOneInterest);
        System.out.println("The interest due after two months is " + monthTwoInterest);
    }
}