//Sabeel Kazi - CS 175 = Project 1

//main class starts all threads
public class Main{
    public static void main(String[] arg){
        Movie movie = new Movie();

        Clock clock = new Clock(movie);
        clock.start();

        Speaker speaker = new Speaker(movie, clock);
        speaker.start();

        for(int i = 1; i < 18; i++){
            Visitor man = new Visitor(i, movie, clock, speaker);
            man.start();
        }
    }

}


