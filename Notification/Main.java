abstract class Notification
{
    private String id;
    private String body;

    Notification(String id, String body)
    {
        this.id = id;
        this.body = body;
    }

    String getId()
    {
        return id;
    }

    String getBody()
    {
        return body;
    }

    public abstract String render();

    void preview()
    {
        System.out.println(render());
    }
}


class EmailNotification extends Notification
{
    private String subject ;

    EmailNotification(String id , String body , String subject)
    {
        super(id, body) ;
        this.subject = subject;
    }
    
    public String render()
    {
        return "Subject: ...  " + subject +  " Body... " + getBody();
    } 
}


class SmsNotification extends Notification
{
    private int maxInt ;

    SmsNotification(String id, String body, int maxLen)
    {
        super(id, body) ;
        this.maxInt = maxLen;
    }

    public String render()
    {
        return getBody();
    }
}

class Main 
{
    public static void main(String[] args) {
        
        EmailNotification email = new EmailNotification("S123", "English is basic language for everyone", "English");
        System.out.println(email.render());
    }
}