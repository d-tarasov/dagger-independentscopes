package today.tarasov.daggerindependentscopes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ClassA classA;

    @Inject
    ClassB classB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // injecting classA from ScopeA
        App.getInstance().getComponentA().inject(this);
        // injection classB from ScopeB
        App.getInstance().getComponentB().inject(this);

        if (classA == null || classB == null) {
            throw new RuntimeException("Injection failed");
        }
    }
}
