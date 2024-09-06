public class TurnOff implements Command {
    private Light light;

    public TurnOff(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.turnOff();
    }
}