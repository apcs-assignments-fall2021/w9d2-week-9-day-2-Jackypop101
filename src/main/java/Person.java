public class Person {
    private String first_name;
    private String last_name;

    public Person (String f, String l){
        first_name = f;
        last_name = l;
    }

    public void setfirstname (String x) {
        this.first_name = x;
    }
    public void setlastname (String x) {
        this.last_name = x;
    }
    public String getfirstname () {

        return(this.first_name);
    }
    public String getlastname () {
        return(this.last_name);
    }
    public String tostring (){
        return("First name: " + this.first_name + "\nLast name: " + this.last_name);
    }
    public String dosomething(){
        return("I am watching netflex.");
    }
}
