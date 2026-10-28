package p175go;

import java.util.Collections;
import java.util.List;
import p309lo.AbstractC24543a;
import p621xn.C38465b;
import p621xn.InterfaceC38468e;

/* JADX INFO: renamed from: go.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16010b implements InterfaceC38468e {

    /* JADX INFO: renamed from: x */
    public static final C16010b f60606x = new C16010b();

    /* JADX INFO: renamed from: w */
    public final List f60607w;

    public C16010b(C38465b c38465b) {
        this.f60607w = Collections.singletonList(c38465b);
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public final int mo1673b(long j7) {
        return j7 < 0 ? 0 : -1;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public final List mo1674d(long j7) {
        return j7 >= 0 ? this.f60607w : Collections.EMPTY_LIST;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public final long mo1675h(int i13) {
        AbstractC24543a.m71569e(i13 == 0);
        return 0L;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public final int mo1676j() {
        return 1;
    }

    public C16010b() {
        this.f60607w = Collections.EMPTY_LIST;
    }
}
