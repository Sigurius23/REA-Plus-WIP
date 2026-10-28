package p299l9;

import p010a9.C0580e;
import qg3.C30352d;

/* JADX INFO: renamed from: l9.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23495e1 implements InterfaceC23540z0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC23540z0 f93002w;

    /* JADX INFO: renamed from: x */
    public final long f93003x;

    public C23495e1(InterfaceC23540z0 interfaceC23540z0, long j7) {
        this.f93002w = interfaceC23540z0;
        this.f93003x = j7;
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: b */
    public final boolean mo36169b() {
        return this.f93002w.mo36169b();
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: c */
    public final void mo36170c() {
        this.f93002w.mo36170c();
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: j */
    public final int mo36171j(long j7) {
        return this.f93002w.mo36171j(j7 - this.f93003x);
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: l */
    public final int mo36172l(C30352d c30352d, C0580e c0580e, int i13) {
        int iMo36172l = this.f93002w.mo36172l(c30352d, c0580e, i13);
        if (iMo36172l == -4) {
            c0580e.f2065G += this.f93003x;
        }
        return iMo36172l;
    }
}
