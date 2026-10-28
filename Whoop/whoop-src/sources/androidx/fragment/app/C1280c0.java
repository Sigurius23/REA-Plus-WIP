package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;

/* JADX INFO: renamed from: androidx.fragment.app.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1280c0 extends AbstractC1308j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComponentCallbacksC1320m0 f5558a;

    public C1280c0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this.f5558a = abstractComponentCallbacksC1320m0;
    }

    @Override // androidx.fragment.app.AbstractC1308j0
    /* JADX INFO: renamed from: a */
    public final void mo4065a() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5558a;
        abstractComponentCallbacksC1320m0.mSavedStateRegistryController.f117550a.m95914a();
        AbstractC1613o1.m5016f(abstractComponentCallbacksC1320m0);
        Bundle bundle = abstractComponentCallbacksC1320m0.mSavedFragmentState;
        abstractComponentCallbacksC1320m0.mSavedStateRegistryController.m88295a(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
