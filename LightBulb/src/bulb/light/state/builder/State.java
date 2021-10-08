package bulb.light.state.builder;

public interface State
{
    public abstract void buyLightbulb();
    public abstract void useLightbulb();
    public abstract void switchoffLightbulb();
    public abstract void brokenLightbulb();
}