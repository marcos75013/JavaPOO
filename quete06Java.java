class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;  
    }  
    
    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (this.aware == true) {
            return "Je m'appelle " + this.firstname + " et je suis aware";
        } else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
        }
    }
}

class Classroon{
    public static void main(String[] args) {
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);

        System.out.println(jeanClaude.whoAmI());
        System.out.println(henri.whoAmI());
    }
}

 