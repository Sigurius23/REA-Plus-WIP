package p012ab;

import java.io.EOFException;
import java.io.InterruptedIOException;
import no.nordicsemi.android.dfu.DfuBaseService;
import p499t9.C33638k;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p607x8.C38059n;

/* JADX INFO: renamed from: ab.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C0673d implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final C0671c f2354a = new C0671c(null, 0, "audio/ac4", 1);

    /* JADX INFO: renamed from: b */
    public final C38059n f2355b = new C38059n(DfuBaseService.ERROR_CONNECTION_MASK);

    /* JADX INFO: renamed from: c */
    public boolean f2356c;

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        this.f2356c = false;
        this.f2354a.mo1663a();
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f2354a.mo1667i(interfaceC33648q, new C0690l0(0, 1, 0, (byte) 0));
        interfaceC33648q.mo3098l();
        interfaceC33648q.mo3109v(new C33651t(-9223372036854775807L));
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws EOFException, InterruptedIOException {
        C33638k c33638k;
        int i13;
        C38059n c38059n = new C38059n(10);
        int i14 = 0;
        while (true) {
            c33638k = (C33638k) interfaceC33646o;
            c33638k.mo3092c(c38059n.f163017a, 0, 10, false);
            c38059n.m121846F(0);
            if (c38059n.m121870w() != 4801587) {
                break;
            }
            c38059n.m121847G(3);
            int iM121866s = c38059n.m121866s();
            i14 += iM121866s + 10;
            c33638k.mo3078C(iM121866s, false);
        }
        c33638k.f140403F = 0;
        c33638k.mo3078C(i14, false);
        int i15 = 0;
        int i16 = i14;
        while (true) {
            int i17 = 7;
            c33638k.mo3092c(c38059n.f163017a, 0, 7, false);
            c38059n.m121846F(0);
            int iM121873z = c38059n.m121873z();
            if (iM121873z == 44096 || iM121873z == 44097) {
                i15++;
                if (i15 >= 4) {
                    return true;
                }
                byte[] bArr = c38059n.f163017a;
                if (bArr.length < 7) {
                    i13 = -1;
                } else {
                    int i18 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i18 == 65535) {
                        i18 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i17 = 4;
                    }
                    if (iM121873z == 44097) {
                        i17 += 2;
                    }
                    i13 = i18 + i17;
                }
                if (i13 == -1) {
                    break;
                }
                c33638k.mo3078C(i13 - 7, false);
            } else {
                c33638k.f140403F = 0;
                i16++;
                if (i16 - i14 >= 8192) {
                    break;
                }
                c33638k.mo3078C(i16, false);
                i15 = 0;
            }
        }
        return false;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) {
        C38059n c38059n = this.f2355b;
        int i13 = interfaceC33646o.read(c38059n.f163017a, 0, DfuBaseService.ERROR_CONNECTION_MASK);
        if (i13 == -1) {
            return -1;
        }
        c38059n.m121846F(0);
        c38059n.m121845E(i13);
        boolean z4 = this.f2356c;
        C0671c c0671c = this.f2354a;
        if (!z4) {
            c0671c.f2346o = 0L;
            this.f2356c = true;
        }
        c0671c.mo1664c(c38059n);
        return 0;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
