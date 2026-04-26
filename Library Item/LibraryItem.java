class LibraryItem
{
    private String title;
    private String catalogID;

    LibraryItem(String title , String catalogID)
    {
        this.title = title;
        this.catalogID = catalogID;
    }

    String getTitle()
    {
        return title;
    }

    String getCatalogId()
    {
        return catalogID;
    }

    String availabilityNote()
    {
        return "See front desk for details.";
    }

    void summaryLine()
    {
        System.out.println("[ " + getCatalogId() + " ]" + " " + getTitle());
    }
}


class BorrowableBook extends LibraryItem
{
    private int loanDays;

    BorrowableBook(String title, String catalogId, int loanDays)
    {
        super(title , catalogId);
        this.loanDays = loanDays;
    }

    int getLoanDays()
    {
        return loanDays;
    }

    @Override

    String availabilityNote()
    {
        return "Borrow up to " + loanDays + " days" ;
    }

    int dueDayNumber(int startDay)
    {
        return startDay + loanDays;
    }
}

class Main
{
    public static void main(String[] args) {
        
        BorrowableBook b = new BorrowableBook("OOP Guide", "B-99", 14);
        b.summaryLine();

        System.out.println(b.availabilityNote());
        System.out.println(b.dueDayNumber(5));

    }
}