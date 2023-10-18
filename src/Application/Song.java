package Application;

public class Song {
    private String name ; 
    private double duration ;
    
    public Song(String name , double duration){
        
        this.name = name ;
        this.duration = duration ;
    }
    public void setname(String name){
        this.name =  name ;
    }
    
    public String getname(){
        return name ;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song { " +
                " name= '" + name + '\'' +
                " , duration= " + duration +
                " }";
    }
}
