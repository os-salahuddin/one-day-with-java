import java.time.LocalDate;
import java.time.Period;

public class UserInfo {
    public String name;
    public LocalDate birthDay;

    // Constructor
    public UserInfo(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    // Method to get the user's name
    public String getName() {
        return name;
    }

    // Method to get the user's age
    public int getAge() {
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }
}
