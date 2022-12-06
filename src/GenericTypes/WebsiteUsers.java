package GenericTypes;

public class WebsiteUsers {
    private String name;
    private int age;

    public WebsiteUsers(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String getName(){
        return name;
    }

    static int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


}
