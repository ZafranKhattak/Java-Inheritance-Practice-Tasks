class Membership
{
    private String memberName ;
    private String planCode;

    Membership(String memberName , String planCode)
    {
        this.memberName = memberName;
        this.planCode = planCode;
    }

    void display()
    {
        System.out.println("Member Name: " + memberName);
        System.out.println("Plane Code: " + planCode);
    }

    double monthlyFee()
    {
        return 1500.0;
    }
}

class StudentMembership extends Membership
{
    StudentMembership(String memberName, String planCode)
    {
        super(memberName , planCode);
    }

    @Override
    double monthlyFee()
    {
        return 600.0;
    }
}

class ProfessionalMembership extends Membership
{
    ProfessionalMembership(String memberName, String planCode)
    {
        super(memberName , planCode);
    }

    @Override
    double monthlyFee()
    {
        return 2500.0;
    }
}

class Main
{
    public static void main(String[] args) {
        
        Membership mbr = new Membership("Sara", "GYM-1");

        mbr.display();
        System.out.println(mbr.monthlyFee());
        StudentMembership std = new StudentMembership("Sara", "GYM-1");
        std.display();
        System.out.println(std.monthlyFee());

        ProfessionalMembership prf = new ProfessionalMembership("Sara", "GYM-1");
        prf.display();
        System.out.println(prf.monthlyFee());

    }
}