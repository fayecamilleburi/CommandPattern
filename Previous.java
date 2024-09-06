public class Previous implements Command {
    private MusicPlayer musicPlayer;

    public Previous(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.previous();
    }
}