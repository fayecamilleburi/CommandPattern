public class Pause implements Command {
    private MusicPlayer musicPlayer;

    public Pause(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.pause();
    }
}