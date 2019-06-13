package my_spring;


/**
 * @author Evgeny Borisov
 */
public class IRobot {
    private Speaker speaker = new ConsoleSpeaker();
    private Cleaner cleaner = new CleanerImpl();

    public void clean(){
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
