
public class Profile {
    private String name;
    private  Date  birthday;

    public Profile(String thename, Date thebirthday){
        name = thename;
        birthday = thebirthday;

    }

    public String toString(){
        return String.format("My name is %s, my birhtday is %s", name, birthday);
    }


}

