package bulb.light.state.builder;

public class Lightbulb
{
    SwitchoffState switchoffState;
    FailureState failureState;
    SwitchonState switchonState;
    BrokenState brokenState;
    State state;

    Lightbulb()
    {
        switchoffState = new SwitchoffState(this);
        failureState= new FailureState(this);
        brokenState = new BrokenState(this);
        switchonState=new SwitchonState(this);
        state=switchonState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public SwitchoffState getSwitchoffState() {
        return switchoffState;
    }

    public FailureState getFailureState() {
        return failureState;
    }

    public SwitchonState getSwitchonState() {
        return switchonState;
    }

    public BrokenState getBrokenState() {
        return brokenState;
    }

    public void buyLightbulb()  {
        state.buyLightbulb();
    }

    public void useLightbulb()  {
        state.useLightbulb();
    }

    public void switchoffLightbulb() {
        state.switchoffLightbulb();
    }
    public void brokenLightbulb() {
        state.brokenLightbulb();
    }

}
