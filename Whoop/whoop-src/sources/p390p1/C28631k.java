package p390p1;

import m83.AbstractC25265s;
import m83.C25264r;
import p002a0.C0020f0;
import p002a0.C0047q0;
import xb3.AbstractC38176k;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: p1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C28631k extends Exception {

    /* JADX INFO: renamed from: w */
    public final C0047q0 f115814w;

    /* JADX INFO: renamed from: x */
    public final C0047q0 f115815x;

    /* JADX INFO: renamed from: y */
    public final C0020f0 f115816y;

    /* JADX INFO: renamed from: z */
    public final int f115817z;

    public C28631k(C0047q0 c0047q0, C0047q0 c0047q1, C0020f0 c0020f0, int i13, Exception exc) {
        super(exc);
        this.f115814w = c0047q0;
        this.f115815x = c0047q1;
        this.f115816y = c0020f0;
        this.f115817z = i13;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return AbstractC39415s.m125910t("\n            |Exception while applying pausable composition. Last 10 operations:\n            |" + AbstractC25265s.m74110N0(AbstractC25265s.m74158x1(10, AbstractC38176k.m122276E(new C25264r(new C28627j(this, null)))), "\n", null, null, null, 62) + "\n            ");
    }
}
