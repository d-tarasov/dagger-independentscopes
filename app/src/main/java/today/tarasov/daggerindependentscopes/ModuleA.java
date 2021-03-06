package today.tarasov.daggerindependentscopes;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author Dmitriy Tarasov
 */
@Module
public class ModuleA {

    @ScopeA
    @Provides
    ClassA provideClassA() {
        return new ClassA();
    }
}
