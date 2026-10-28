package hh0;

import kd1.AbstractC22403o;
import p040c0.InterfaceC3770q;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import qu2.AbstractC30643k;

/* JADX INFO: renamed from: hh0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C17285e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f66448w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f66449x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f66450y;

    public /* synthetic */ C17285e(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        this.f66449x = interfaceC28601c1;
        this.f66450y = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f66448w) {
            case 0:
                return AbstractC17286f.m48946m(this.f66450y, this.f66449x, (AbstractC22403o) obj);
            default:
                return AbstractC30643k.m94197t(this.f66449x, this.f66450y, (InterfaceC3770q) obj);
        }
    }

    public /* synthetic */ C17285e(boolean z4, InterfaceC28601c1 interfaceC28601c1) {
        this.f66450y = z4;
        this.f66449x = interfaceC28601c1;
    }
}
