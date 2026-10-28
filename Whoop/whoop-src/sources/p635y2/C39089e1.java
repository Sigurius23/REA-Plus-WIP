package p635y2;

import p005a3.InterfaceC0178a0;
import p026b2.AbstractC2316v;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C39089e1 extends AbstractC2316v implements InterfaceC0178a0 {

    /* JADX INFO: renamed from: O */
    public Function1 f168157O;

    /* JADX INFO: renamed from: P */
    public long f168158P;

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return true;
    }

    @Override // p005a3.InterfaceC0178a0
    /* JADX INFO: renamed from: g */
    public final void mo423g(long j7) {
        if (C39180l.m124799a(this.f168158P, j7)) {
            return;
        }
        this.f168157O.invoke(new C39180l(j7));
        this.f168158P = j7;
    }
}
