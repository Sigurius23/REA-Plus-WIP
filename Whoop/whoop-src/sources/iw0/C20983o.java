package iw0;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iw0.o */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20983o implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79283w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f79284x;

    public /* synthetic */ C20983o(Function1 function1, int i13) {
        this.f79283w = i13;
        this.f79284x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f79283w) {
            case 0:
                return AbstractC20992x.m58461u1(this.f79284x, obj);
            case 1:
                return AbstractC20992x.m58466w0(this.f79284x, obj);
            case 2:
                return AbstractC20992x.m58427j0(this.f79284x, obj);
            case 3:
                return AbstractC20992x.m58388U0(this.f79284x, ((Integer) obj).intValue());
            case 4:
                return AbstractC20992x.m58347E0(this.f79284x, obj);
            case 5:
                return AbstractC20992x.m58350F0(this.f79284x, obj);
            case 6:
                return AbstractC20992x.m58353G0(this.f79284x, obj);
            default:
                return AbstractC20962c0.m58253j(this.f79284x, obj);
        }
    }
}
