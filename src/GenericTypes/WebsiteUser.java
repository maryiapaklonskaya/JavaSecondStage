package GenericTypes;

public class WebsiteUser extends WebsiteUsers{
    private String phoneNumber;

    public WebsiteUser(String name, int age, String phoneNumber) {
        super(name, age);
        this.phoneNumber = phoneNumber;
    }
}
