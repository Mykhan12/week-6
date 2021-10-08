package bulb.light.state.builder;

public class SwitchonState implements State {

    Lightbulb lightbulb;
    public SwitchonState(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    @Override
    public void buyLightbulb() {
        System.out.println("Buying Lightbulbs");

    }

    @Override
    public void useLightbulb() {
        System.out.println("Light bulbs helps illuminating dark environments ");
        lightbulb.setState(lightbulb.getSwitchoffState());

    }

    @Override
    public void switchoffLightbulb() {
        System.out.println("Cleaning Lightbulb");
        lightbulb.setState(lightbulb.getFailureState());
    }

    @Override
    public void brokenLightbulb() {
        System.out.println("Lightbulb Broken");
        lightbulb.setState(lightbulb.getBrokenState());
    }

}