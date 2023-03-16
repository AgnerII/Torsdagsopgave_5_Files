package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;


    public Customer(String firstName, String lastName, String username, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = id;
    }
    public String toString(){
        return (firstName + " "+lastName+" : "+username+" "+id);
}

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getUsername(){
        return this.username;
    }

    public int getId(){
        return this.id;
    }
}
