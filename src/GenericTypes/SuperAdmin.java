package GenericTypes;

public class SuperAdmin extends Admin{
    private String title;


    public SuperAdmin(String name, int age, String access, String title) {
        super(name, age, access);
        this.title = title;
    }
}
