package bc3;

import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bc3.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3059t0 extends AbstractC3035m1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f12089E;

    /* JADX INFO: renamed from: F */
    public final Object f12090F;

    public /* synthetic */ C3059t0(Object obj, int i13) {
        this.f12089E = i13;
        this.f12090F = obj;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: i */
    public final boolean mo8685i() {
        switch (this.f12089E) {
        }
        return false;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: j */
    public final void mo8686j(Throwable th3) {
        switch (this.f12089E) {
            case 0:
                ((InterfaceC3056s0) this.f12090F).dispose();
                break;
            case 1:
                ((Function1) this.f12090F).invoke(th3);
                break;
            default:
                C3039n1 c3039n1 = (C3039n1) this.f12090F;
                Object obj = C3060t1.f12091w.get(m8786h());
                if (!(obj instanceof C3067w)) {
                    c3039n1.resumeWith(AbstractC3006f0.m8703I(obj));
                } else {
                    c3039n1.resumeWith(AbstractC34132o.m107888l(((C3067w) obj).f12104a));
                }
                break;
        }
    }
}
