package c41;

import k91.C22303b;
import lf0.AbstractC23924h1;
import p134f2.C14015d;
import p208i2.InterfaceC17886g0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c41.z0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4159z0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16923w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22303b f16924x;

    public /* synthetic */ C4159z0(C22303b c22303b, int i13) {
        this.f16923w = i13;
        this.f16924x = c22303b;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16923w) {
            case 0:
                return AbstractC3993b1.m12089m(this.f16924x, (InterfaceC17886g0) obj);
            case 1:
                return AbstractC3993b1.m12090n(this.f16924x, (C14015d) obj);
            case 2:
                return AbstractC23924h1.m70386t(this.f16924x, (InterfaceC17886g0) obj);
            default:
                return AbstractC23924h1.m70387u(this.f16924x, (C14015d) obj);
        }
    }
}
