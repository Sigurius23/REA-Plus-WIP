package p076d;

import java.io.IOException;
import ro.C31624i;

/* JADX INFO: renamed from: d.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11296k0 extends AbstractC11267a {
    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        int iMo30479c = z4 ? 4 : 3;
        for (InterfaceC11307q interfaceC11307q : this.f36181a) {
            iMo30479c += interfaceC11307q.mo30482d().mo30479c(true);
        }
        return iMo30479c;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97708h(z4, 49, this.f36181a);
    }
}
