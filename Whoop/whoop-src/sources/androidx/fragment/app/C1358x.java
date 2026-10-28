package androidx.fragment.app;

import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C1358x extends AbstractC1350u0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC1350u0 f5824w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1361y f5825x;

    public C1358x(DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y, AbstractC1350u0 abstractC1350u0) {
        this.f5825x = dialogInterfaceOnCancelListenerC1361y;
        this.f5824w = abstractC1350u0;
    }

    @Override // androidx.fragment.app.AbstractC1350u0
    /* JADX INFO: renamed from: b */
    public final View mo4070b(int i13) {
        AbstractC1350u0 abstractC1350u0 = this.f5824w;
        return abstractC1350u0.mo4071c() ? abstractC1350u0.mo4070b(i13) : this.f5825x.onFindViewById(i13);
    }

    @Override // androidx.fragment.app.AbstractC1350u0
    /* JADX INFO: renamed from: c */
    public final boolean mo4071c() {
        return this.f5824w.mo4071c() || this.f5825x.onHasView();
    }
}
