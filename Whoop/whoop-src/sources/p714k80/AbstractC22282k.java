package p714k80;

import android.os.Bundle;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k80.k */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroid/os/Bundle;", "Lk80/j;", "a", "(Landroid/os/Bundle;)Lk80/j;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22282k {
    /* JADX INFO: renamed from: a */
    public static final C22281j m64012a(Bundle bundle) {
        ActivationFlowDestination activationFlowDestination;
        ActivationFlowDestination activationFlowDestination2 = null;
        if (bundle == null) {
            return new C22281j(null, null, 3, null);
        }
        String string = bundle.getString("startScreen");
        if (string == null || string.length() == 0) {
            activationFlowDestination = ActivationFlowDestination.START_SCREEN;
        } else {
            activationFlowDestination = ActivationFlowDestination.START_SCREEN;
            for (ActivationFlowDestination activationFlowDestination3 : ActivationFlowDestination.values()) {
                if (AbstractC22676k.m65745e(activationFlowDestination3.name(), string)) {
                    activationFlowDestination2 = activationFlowDestination3;
                    break;
                }
            }
            if (activationFlowDestination2 != null) {
                activationFlowDestination = activationFlowDestination2;
            }
        }
        return new C22281j(activationFlowDestination, bundle.getString("source"));
    }
}
