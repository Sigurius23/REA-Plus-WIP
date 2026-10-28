package p588wm;

import ed3.C13117a;
import java.io.EOFException;
import p284ko.InterfaceC22622i;
import p465rm.C31521c0;

/* JADX INFO: renamed from: wm.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C37366h implements InterfaceC37377s {

    /* JADX INFO: renamed from: a */
    public final byte[] f159855a = new byte[4096];

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: a */
    public final void mo102730a(C31521c0 c31521c0) {
    }

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: b */
    public final int mo102731b(InterfaceC22622i interfaceC22622i, int i13, boolean z4) throws EOFException {
        byte[] bArr = this.f159855a;
        int i14 = interfaceC22622i.read(bArr, 0, Math.min(bArr.length, i13));
        if (i14 != -1) {
            return i14;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: c */
    public final void mo102732c(int i13, C13117a c13117a) {
        c13117a.m36690L(i13);
    }

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: d */
    public final void mo102733d(long j7, int i13, int i14, int i15, C37376r c37376r) {
    }
}
