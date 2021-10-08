package bulb.light.state.builder;

public class SwitchoffState implements State{

    Lightbulb lightbulb;
    public SwitchoffState(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    @Override
    public void buyLightbulb() {
        System.out.println("Lightbulb already brought");
        lightbulb.setState(lightbulb.getSwitchonState());

    }

    @Override
    public void useLightbulb() {
        System.out.println("Light bulbs helps illuminating dark environments ");
    }

    @Override
    public void switchoffLightbulb() {
        System.out.println("Work finished with lightbulb, installin and checking whether lightbulb is working or not");
        lightbulb.setState(lightbulb.getFailureState());
    }

    @Override
    public void brokenLightbulb() {
        System.out.println("Lightbulb Broken");
        lightbulb.setState(lightbulb.getBrokenState());
    }



}
