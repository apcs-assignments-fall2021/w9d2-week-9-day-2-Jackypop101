public class NinthGrader extends Student { // SOME CODE NEEDED IN THIS LINE
    public NinthGrader(String a, String b, int c) {
        super(a, b, c);
        c = 2025;
    }
    public String doSomething() {
        return("I am preparing for a Harkness discussion!");
    }
    public String toString() {
        String str = this.getfirstname() + " " + this.getlastname() + ", " + this.getClassYear() + "(Ninth Grader)";
        return str;
    }
}
