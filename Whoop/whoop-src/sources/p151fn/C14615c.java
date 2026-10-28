package p151fn;

import ed3.C13117a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import no.nordicsemi.android.dfu.DfuBaseService;
import p012ab.C0690l0;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;

/* JADX INFO: renamed from: fn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C14615c implements InterfaceC37367i {

    /* JADX INFO: renamed from: a */
    public final C14614b f53841a = new C14614b(null, 1);

    /* JADX INFO: renamed from: b */
    public final C13117a f53842b = new C13117a(DfuBaseService.ERROR_CONNECTION_MASK);

    /* JADX INFO: renamed from: c */
    public boolean f53843c;

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        this.f53843c = false;
        this.f53841a.mo41817a();
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) throws EOFException, InterruptedIOException {
        C37364f c37364f;
        int i13;
        C13117a c13117a = new C13117a(10);
        int i14 = 0;
        while (true) {
            c37364f = (C37364f) interfaceC37368j;
            c37364f.mo3092c(c13117a.f45381a, 0, 10, false);
            c13117a.m36689K(0);
            if (c13117a.m36679A() != 4801587) {
                break;
            }
            c13117a.m36690L(3);
            int iM36713w = c13117a.m36713w();
            i14 += iM36713w + 10;
            c37364f.m119648a(iM36713w, false);
        }
        c37364f.f159847F = 0;
        c37364f.m119648a(i14, false);
        int i15 = 0;
        int i16 = i14;
        while (true) {
            int i17 = 7;
            c37364f.mo3092c(c13117a.f45381a, 0, 7, false);
            c13117a.m36689K(0);
            int iM36682D = c13117a.m36682D();
            if (iM36682D == 44096 || iM36682D == 44097) {
                i15++;
                if (i15 >= 4) {
                    return true;
                }
                byte[] bArr = c13117a.f45381a;
                if (bArr.length < 7) {
                    i13 = -1;
                } else {
                    int i18 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i18 == 65535) {
                        i18 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i17 = 4;
                    }
                    if (iM36682D == 44097) {
                        i17 += 2;
                    }
                    i13 = i18 + i17;
                }
                if (i13 == -1) {
                    break;
                }
                c37364f.m119648a(i13 - 7, false);
            } else {
                c37364f.f159847F = 0;
                i16++;
                if (i16 - i14 >= 8192) {
                    break;
                }
                c37364f.m119648a(i16, false);
                i15 = 0;
            }
        }
        return false;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f53841a.mo1712g(interfaceC37369k, new C0690l0(0, 1, 1, (byte) 0));
        interfaceC37369k.mo3098l();
        interfaceC37369k.mo3111x(new C37370l(-9223372036854775807L));
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws EOFException, InterruptedIOException {
        C13117a c13117a = this.f53842b;
        int i13 = ((C37364f) interfaceC37368j).read(c13117a.f45381a, 0, DfuBaseService.ERROR_CONNECTION_MASK);
        if (i13 == -1) {
            return -1;
        }
        c13117a.m36689K(0);
        c13117a.m36688J(i13);
        boolean z4 = this.f53843c;
        C14614b c14614b = this.f53841a;
        if (!z4) {
            c14614b.mo41818d(4, 0L);
            this.f53843c = true;
        }
        c14614b.mo1711f(c13117a);
        return 0;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
