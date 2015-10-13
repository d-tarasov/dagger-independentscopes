package today.tarasov.daggerindependentscopes;

import android.app.Application;

/**
 * @author Dmitriy Tarasov
 */
public class App extends Application {

    private static App instance;

    private AppComponent appComponent;
    private ComponentA componentA;
    private ComponentB componentB;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public ComponentA getComponentA() {
        return componentA;
    }

    public ComponentB getComponentB() {
        return componentB;
    }

    public ComponentA createComponentA() {
        componentA = appComponent.plus(new ModuleA());
        return componentA;
    }

    public ComponentB createComponentB() {
        componentB = appComponent.plus(new ModuleB());
        return componentB;
    }
}
