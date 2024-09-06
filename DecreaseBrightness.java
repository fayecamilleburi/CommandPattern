public class DecreaseBrightness implements Command {
    private Light light;

    public DecreaseBrightness(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.decreaseBright();
    }
}