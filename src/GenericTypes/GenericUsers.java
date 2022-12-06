package GenericTypes;

import java.time.LocalDate;

import static GenericTypes.WebsiteUsers.getAge;

public class GenericUsers<T extends WebsiteUsers>{
    WebsiteUsers user2 = new Admin("maryia", 28, "basicAdmin");
    WebsiteUsers user3 = new SuperAdmin("maryia", 28, "fullAccess", "maryiapaklonskaya");
    WebsiteUsers user4 = new WebsiteUser("maryia", 28, "37066852134");
    int dob = 0;

    private static T user;





    public int calculateDOB(T user){
        int currentYear = LocalDate.now().getYear();
        return dob = currentYear - user.getAge();
        //Period(dob, currentYear).getYears()
    }

    public userProfile(String name, int age){
        user.name = name;
    }

    public static void main(String[] args){
        user.calculateDOB(user1);

    }


}
