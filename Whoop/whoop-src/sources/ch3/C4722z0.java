package ch3;

import dh3.C12053b;
import xg3.AbstractC38291r;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ch3.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4722z0 extends AbstractC38291r {

    /* JADX INFO: renamed from: x */
    public final AbstractC38292s f19312x;

    public C4722z0(AbstractC38292s abstractC38292s) {
        this.f19312x = abstractC38292s;
    }

    @Override // xg3.AbstractC38291r
    /* JADX INFO: renamed from: d */
    public final void mo14742d(Throwable th3) {
        this.f19312x.onError(th3);
    }

    @Override // xg3.AbstractC38291r
    /* JADX INFO: renamed from: e */
    public final void mo14743e(Object obj) {
        AbstractC38292s abstractC38292s = this.f19312x;
        abstractC38292s.mo14765f(new C12053b(abstractC38292s, obj));
    }
}
