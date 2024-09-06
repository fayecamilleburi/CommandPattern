public class Next implements Command {
    private MusicPlayer musicPlayer;

    public Next(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.next();
    }
}