package today.tarasov.daggerindependentscopes;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Dmitriy Tarasov
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    ComponentA plus(ModuleA moduleA);

    ComponentB plus(ModuleB moduleB);

}
