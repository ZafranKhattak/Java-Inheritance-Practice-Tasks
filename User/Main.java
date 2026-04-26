class User
{
    private String username ;
    
    User(String username)
    {
        this.username = username;
    }

    String getUsername()
    {
        return username;
    }

    void display()
    {
        System.out.println("Name: " + username);
    }

    int monthlyUploadQuotaMb()
    {
        return 500;
    }


}


class VerifiedUser extends User 
{
    private String email;

    VerifiedUser(String email , String username)
    {
        super(username);
        this.email = email;
    }

    @Override
    void display()
    {
        super.display();
    }

    int monthlyUploadQuotaMb()
    {
        return 2000;
    }
}

class PremiumUser extends VerifiedUser
{
    private int extraStorageGb;

    PremiumUser(String username, String email, int extraStorageGb)
    {
        super(email, username);
        this.extraStorageGb = extraStorageGb;
    }

    @Override
    void display()
    {
        super.display();
    }

    int monthlyUploadQuotaMb()
    {
        return super.monthlyUploadQuotaMb() + extraStorageGb * 500;
    }
}


class Main {

    public static void main(String[] args) {
        
        User user = new User("Zafran Khan");
        user.display();
       System.out.println( user.monthlyUploadQuotaMb());
        PremiumUser premiumUser = new PremiumUser("Zafran Khan", "zafrankhan@123gmail.com", 2);
        premiumUser.display();
        System.out.println(premiumUser.monthlyUploadQuotaMb());
    }
}
