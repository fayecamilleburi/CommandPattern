public class IncreaseBrightness implements Command {
    private Light light;

    public IncreaseBrightness(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.increaseBright();
    }
}