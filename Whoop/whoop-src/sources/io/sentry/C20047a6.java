package io.sentry;

import io.sentry.util.InterfaceC20583e;
import p437qt.C30582e;

/* JADX INFO: renamed from: io.sentry.a6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20047a6 implements InterfaceC20583e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75201w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20513q6 f75202x;

    public /* synthetic */ C20047a6(C20513q6 c20513q6, int i13) {
        this.f75201w = i13;
        this.f75202x = c20513q6;
    }

    @Override // io.sentry.util.InterfaceC20583e
    /* JADX INFO: renamed from: j */
    public final Object mo19991j() {
        switch (this.f75201w) {
            case 0:
                return C20513q6.m56668a(this.f75202x);
            case 1:
                C20513q6 c20513q6 = this.f75202x;
                c20513q6.getClass();
                return new C20369i2(c20513q6);
            case 2:
                return C20513q6.m56669b(this.f75202x);
            default:
                return Boolean.valueOf(C30582e.m93819n(this.f75202x, "androidx.core.view.ScrollingView"));
        }
    }

    public /* synthetic */ C20047a6(C30582e c30582e, C20513q6 c20513q6) {
        this.f75201w = 3;
        this.f75202x = c20513q6;
    }
}
