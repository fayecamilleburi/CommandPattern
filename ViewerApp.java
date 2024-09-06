public class ViewerApp {

    public static void main(String[] args){

        // Initializing all objects
        Tv tv = new Tv();
        Light light = new Light();
        MusicPlayer music = new MusicPlayer();
        Thermostat  thermo = new Thermostat();

        RemoteControl rc = new RemoteControl();

        // TV Command
        PowerOn powerOn = new PowerOn(tv);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());

        // Lights Command
        TurnOn turnOnLights = new TurnOn(light);
        System.out.println(turnOnLights.execute());

        TurnOff turnOffLights = new TurnOff(light);
        System.out.println(turnOffLights.execute());

        DecreaseBrightness decreaseLights = new DecreaseBrightness(light);
        System.out.println(decreaseLights.execute());

        IncreaseBrightness increaseLights = new IncreaseBrightness(light);
        System.out.println(increaseLights.execute());

        // Music Command
        Play playMusic = new Play(music);
        System.out.println(playMusic.execute());

        Pause pauseMusic = new Pause(music);
        System.out.println(pauseMusic.execute());

        Next nextTrack = new Next(music);
        System.out.println(nextTrack.execute());

        Previous rewindTrack = new Previous(music);
        System.out.println(rewindTrack.execute());

        // Thermostat Command
        IncreaseTemperature increaseTemperature = new IncreaseTemperature(thermo);
        System.out.println(increaseTemperature.execute());

        DecreaseTemperature decreaseTemperature = new DecreaseTemperature(thermo);
        System.out.println(decreaseTemperature.execute());
    }
}