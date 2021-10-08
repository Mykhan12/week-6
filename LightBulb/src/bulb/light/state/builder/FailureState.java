package bulb.light.state.builder;


public class FailureState implements State {

    Lightbulb lightbulb;
    public FailureState(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    @Override
    public void buyLightbulb() {
        System.out.println("Lightbulb being installed");
        lightbulb.setState(lightbulb.getSwitchonState());
    }

    @Override
    public void useLightbulb() {
        System.out.println("Light bulbs helps illuminating dark environments ");
        lightbulb.setState(lightbulb.getSwitchoffState());
    }

    @Override
    public void switchoffLightbulb() {
        System.out.println("Lightbulb broken, We can not use it");
    }

    @Override
    public void brokenLightbulb() {
        System.out.println("lightbulb broke");
        lightbulb.setState(lightbulb.getBrokenState());
    }


}