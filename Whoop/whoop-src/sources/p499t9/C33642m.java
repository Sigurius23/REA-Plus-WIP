package p499t9;

import java.io.EOFException;
import p516u8.C34610p;
import p516u8.InterfaceC34594h;
import p607x8.C38059n;

/* JADX INFO: renamed from: t9.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C33642m implements InterfaceC33639k0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f140424a = new byte[4096];

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: a */
    public final void mo36173a(C34610p c34610p) {
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: b */
    public final void mo36174b(long j7, int i13, int i14, int i15, C33637j0 c33637j0) {
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: c */
    public final int mo36175c(InterfaceC34594h interfaceC34594h, int i13, boolean z4) throws EOFException {
        byte[] bArr = this.f140424a;
        int i14 = interfaceC34594h.read(bArr, 0, Math.min(bArr.length, i13));
        if (i14 != -1) {
            return i14;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: d */
    public final void mo36176d(C38059n c38059n, int i13, int i14) {
        c38059n.m121847G(i13);
    }
}
