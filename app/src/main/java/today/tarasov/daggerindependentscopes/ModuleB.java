package today.tarasov.daggerindependentscopes;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author Dmitriy Tarasov
 */
@Module
public class ModuleB {

    @ScopeB
    @Provides
    ClassB provideClassB() {
        return new ClassB();
    }
}
