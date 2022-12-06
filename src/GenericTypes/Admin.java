package GenericTypes;

public class Admin extends WebsiteUsers{
    private String access;


    public Admin(String name, int age, String access) {
        super(name, age);
        this.access = access;
    }

}
