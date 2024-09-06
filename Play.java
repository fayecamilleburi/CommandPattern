public class Play implements Command {
    private MusicPlayer musicPlayer;

    public Play(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.play();
    }
}