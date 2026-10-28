package androidx.fragment.app;

import android.view.View;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: androidx.fragment.app.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1284d0 extends AbstractC1350u0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractComponentCallbacksC1320m0 f5584w;

    public C1284d0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this.f5584w = abstractComponentCallbacksC1320m0;
    }

    @Override // androidx.fragment.app.AbstractC1350u0
    /* JADX INFO: renamed from: b */
    public final View mo4070b(int i13) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5584w;
        View view = abstractComponentCallbacksC1320m0.mView;
        if (view != null) {
            return view.findViewById(i13);
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(abstractComponentCallbacksC1320m0, "Fragment ", " does not have a view"));
    }

    @Override // androidx.fragment.app.AbstractC1350u0
    /* JADX INFO: renamed from: c */
    public final boolean mo4071c() {
        return this.f5584w.mView != null;
    }
}
