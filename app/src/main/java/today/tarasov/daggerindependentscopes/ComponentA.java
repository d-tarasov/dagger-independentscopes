package today.tarasov.daggerindependentscopes;

import dagger.Subcomponent;

/**
 * @author Dmitriy Tarasov
 */
@ScopeA
@Subcomponent(modules = ModuleA.class)
public interface ComponentA {

    ClassA provideClassA();

}
