abstract class Expense
{
    private String label;
    private double monthlyBudget;

    public Expense(String label , double monthlyBudget)
    {
        this.label = label;
        this.monthlyBudget = monthlyBudget;
    }

    public String getLabel()
    {
        return label;
    }

    public double getMonthlyBudget()
    {
        return monthlyBudget;
    }

    public abstract double spentSoFar();

    void printStatus()
    {
        System.out.println(getLabel());
        System.out.println(getMonthlyBudget());

        if (monthlyBudget - spentSoFar() <0)
        {
            System.out.println("Negative");
        }

    }
}

class SubscriptionExpense extends Expense
{
    private double monthlyCharge ;
    
    SubscriptionExpense(String label , double monthlyBudget , double monthlyCharge)
    {
        super(label, monthlyBudget);
        this.monthlyCharge = monthlyBudget;
    }

    @Override

   public double spentSoFar()
    {
        return monthlyCharge;
    }
}

class Main
{
    public static void main(String[] args) {
        
        SubscriptionExpense s = new SubscriptionExpense("Music", 500, 299);

        System.out.println(s.spentSoFar());
    }
}