public class Main
{
    public static void main(String[] args)
    {
        int fallCost = 1000;
        int winterCost = 2000;
        int springCost = 3000;
        int summerCost = 4000;
        int homeMaintenance = fallCost + winterCost + springCost + summerCost;

        System.out.println("Your annual home maintenance cost is " + homeMaintenance + " dollars.");
    }
}