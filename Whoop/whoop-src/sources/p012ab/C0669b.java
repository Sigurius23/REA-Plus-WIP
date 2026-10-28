package p012ab;

import java.io.EOFException;
import java.io.InterruptedIOException;
import p499t9.AbstractC33618a;
import p499t9.C33638k;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p607x8.C38059n;

/* JADX INFO: renamed from: ab.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C0669b implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final C0671c f2320a = new C0671c("audio/ac3");

    /* JADX INFO: renamed from: b */
    public final C38059n f2321b = new C38059n(2786);

    /* JADX INFO: renamed from: c */
    public boolean f2322c;

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        this.f2322c = false;
        this.f2320a.mo1663a();
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f2320a.mo1667i(interfaceC33648q, new C0690l0(0, 1, 0, (byte) 0));
        interfaceC33648q.mo3098l();
        interfaceC33648q.mo3109v(new C33651t(-9223372036854775807L));
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws EOFException, InterruptedIOException {
        C33638k c33638k;
        int iM106214f;
        C38059n c38059n = new C38059n(10);
        int i13 = 0;
        while (true) {
            c33638k = (C33638k) interfaceC33646o;
            c33638k.mo3092c(c38059n.f163017a, 0, 10, false);
            c38059n.m121846F(0);
            if (c38059n.m121870w() != 4801587) {
                break;
            }
            c38059n.m121847G(3);
            int iM121866s = c38059n.m121866s();
            i13 += iM121866s + 10;
            c33638k.mo3078C(iM121866s, false);
        }
        c33638k.f140403F = 0;
        c33638k.mo3078C(i13, false);
        int i14 = 0;
        int i15 = i13;
        while (true) {
            c33638k.mo3092c(c38059n.f163017a, 0, 6, false);
            c38059n.m121846F(0);
            if (c38059n.m121873z() != 2935) {
                c33638k.f140403F = 0;
                i15++;
                if (i15 - i13 >= 8192) {
                    break;
                }
                c33638k.mo3078C(i15, false);
                i14 = 0;
            } else {
                i14++;
                if (i14 >= 4) {
                    return true;
                }
                byte[] bArr = c38059n.f163017a;
                if (bArr.length < 6) {
                    iM106214f = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iM106214f = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iM106214f = AbstractC33618a.m106214f((b & 192) >> 6, b & 63);
                }
                if (iM106214f == -1) {
                    break;
                }
                c33638k.mo3078C(iM106214f - 6, false);
            }
        }
        return false;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) {
        C38059n c38059n = this.f2321b;
        int i13 = interfaceC33646o.read(c38059n.f163017a, 0, 2786);
        if (i13 == -1) {
            return -1;
        }
        c38059n.m121846F(0);
        c38059n.m121845E(i13);
        boolean z4 = this.f2322c;
        C0671c c0671c = this.f2320a;
        if (!z4) {
            c0671c.f2346o = 0L;
            this.f2322c = true;
        }
        c0671c.mo1664c(c38059n);
        return 0;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
