package today.tarasov.daggerindependentscopes;

import dagger.Subcomponent;

/**
 * @author Dmitriy Tarasov
 */
@ScopeB
@Subcomponent(modules = ModuleB.class)
public interface ComponentB {

    void inject(MainActivity mainActivity);

}
