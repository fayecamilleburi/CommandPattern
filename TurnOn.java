public class TurnOn implements Command {
    private Light light;

    public TurnOn(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.turnOn();
    }
}