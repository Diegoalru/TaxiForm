package Main;

public class FramesManager {

    /* TODO: Agregar limite para las ventanas. */

    private static int openFrames = 0;

    public static void addNewFrame(){
        openFrames++;
    }

    public static void removeFrame(){
        openFrames--;
    }

    public static int getOpenFrames() {
        return openFrames;
    }
}
