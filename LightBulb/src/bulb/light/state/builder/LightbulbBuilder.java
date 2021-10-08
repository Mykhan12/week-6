package bulb.light.state.builder;

public class LightbulbBuilder implements Builder{

    LightbulbBuilder(){

    }

    @Override
    public Builder Filament() {
        System.out.println("Filament added to lightbulb");
        return this;
    }

    @Override
    public Builder Circuit() {
        System.out.println("Circuit connected to lightbulb");
        return this;
    }

    @Override
    public Builder Switch() {
        System.out.println("Switch connected to lightbulb");
        return this;
    }

    @Override
    public Lightbulb build() {
        Lightbulb s=new Lightbulb();
        System.out.println("Lightbulb connection is made!");
        return s;
    }
}
