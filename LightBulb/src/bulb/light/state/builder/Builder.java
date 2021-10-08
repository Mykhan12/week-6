package bulb.light.state.builder;

public interface Builder {
    Builder Filament();
    Builder Circuit();
    Builder Switch();
    Lightbulb build();
}
