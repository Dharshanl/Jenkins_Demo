

public class Users {

    private  String job;
    private String name;

    public void User(String name, String job){
        this.name = name;
        this.job = job;
    }


    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getJob(){
        return job;
    }

    public void setJob(String job){
        this.job = job;
    }

    @Override
    public String toString(){
        return String.format("Users{name : %s,job: %s }", name, job);
    }

}
