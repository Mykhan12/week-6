package bulb.light.state.builder;

public class Main {

    public static void main(String[] args) {

        LightbulbBuilder build=new LightbulbBuilder();
        Lightbulb bulb=build.Filament().Circuit().Switch().build();


        bulb.buyLightbulb();

        bulb.brokenLightbulb();

        bulb.switchoffLightbulb();

        bulb.useLightbulb();

        bulb.buyLightbulb();

    }

}



