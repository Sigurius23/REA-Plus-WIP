package p076d;

import java.io.IOException;
import ro.C31624i;

/* JADX INFO: renamed from: d.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11280e0 extends AbstractC11290h1 {
    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        int iMo30479c = z4 ? 4 : 3;
        int length = this.f36215a.length;
        for (int i13 = 0; i13 < length; i13++) {
            iMo30479c += this.f36215a[i13].mo30482d().mo30479c(true);
        }
        return iMo30479c;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97708h(z4, 48, this.f36215a);
    }

    @Override // p076d.AbstractC11290h1
    /* JADX INFO: renamed from: p */
    public final AbstractC11285g mo30490p() {
        return new C11313t(m30506n());
    }

    @Override // p076d.AbstractC11290h1
    /* JADX INFO: renamed from: q */
    public final AbstractC11322x0 mo30491q() {
        int length = this.f36215a.length;
        AbstractC11322x0[] abstractC11322x0Arr = new AbstractC11322x0[length];
        for (int i13 = 0; i13 < length; i13++) {
            abstractC11322x0Arr[i13] = AbstractC11322x0.m30532l(this.f36215a[i13]);
        }
        return new C11268a0(C11268a0.m30478m(abstractC11322x0Arr), abstractC11322x0Arr);
    }
}
