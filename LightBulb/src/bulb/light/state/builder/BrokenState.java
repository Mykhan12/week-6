package bulb.light.state.builder;

public class BrokenState implements State {

    Lightbulb lightbulb;
    public BrokenState(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    @Override
    public void buyLightbulb() {
        System.out.println("Buying lightbulb");
        lightbulb.setState(lightbulb.getSwitchonState());
    }

    @Override
    public void useLightbulb() {
        System.out.println("Light bulbs helps illuminating dark environments ");
    }

    @Override
    public void switchoffLightbulb() {
        System.out.println("Once lightbulb is broken it can only be replaced");

    }

    @Override
    public void brokenLightbulb() {
        System.out.println("Filament burned");

    }



}


