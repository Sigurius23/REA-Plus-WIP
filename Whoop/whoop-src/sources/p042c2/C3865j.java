package p042c2;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: c2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3865j extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a */
    public static final C3865j f15799a = new C3865j();

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i13, int i14) {
        String str;
        super.onAutofillEvent(view, i13, i14);
        if (i14 == 1) {
            str = "Autofill popup was shown.";
        } else if (i14 != 2) {
            str = i14 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }
}
