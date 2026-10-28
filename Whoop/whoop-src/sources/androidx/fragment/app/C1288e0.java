package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;

/* JADX INFO: renamed from: androidx.fragment.app.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1288e0 implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractComponentCallbacksC1320m0 f5592w;

    public C1288e0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this.f5592w = abstractComponentCallbacksC1320m0;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
        View view;
        if (enumC1632v != EnumC1632v.ON_STOP || (view = this.f5592w.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
