package p151fn;

import ed3.C13117a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import p012ab.C0690l0;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: fn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C14613a implements InterfaceC37367i {

    /* JADX INFO: renamed from: a */
    public final C14614b f53825a = new C14614b(null, 0);

    /* JADX INFO: renamed from: b */
    public final C13117a f53826b = new C13117a(2786);

    /* JADX INFO: renamed from: c */
    public boolean f53827c;

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        this.f53827c = false;
        this.f53825a.mo41817a();
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) throws EOFException, InterruptedIOException {
        C37364f c37364f;
        int iM107328b;
        C13117a c13117a = new C13117a(10);
        int i13 = 0;
        while (true) {
            c37364f = (C37364f) interfaceC37368j;
            c37364f.mo3092c(c13117a.f45381a, 0, 10, false);
            c13117a.m36689K(0);
            if (c13117a.m36679A() != 4801587) {
                break;
            }
            c13117a.m36690L(3);
            int iM36713w = c13117a.m36713w();
            i13 += iM36713w + 10;
            c37364f.m119648a(iM36713w, false);
        }
        c37364f.f159847F = 0;
        c37364f.m119648a(i13, false);
        int i14 = 0;
        int i15 = i13;
        while (true) {
            c37364f.mo3092c(c13117a.f45381a, 0, 6, false);
            c13117a.m36689K(0);
            if (c13117a.m36682D() != 2935) {
                c37364f.f159847F = 0;
                i15++;
                if (i15 - i13 >= 8192) {
                    break;
                }
                c37364f.m119648a(i15, false);
                i14 = 0;
            } else {
                i14++;
                if (i14 >= 4) {
                    return true;
                }
                byte[] bArr = c13117a.f45381a;
                if (bArr.length < 6) {
                    iM107328b = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iM107328b = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iM107328b = AbstractC33922a.m107328b((b & 192) >> 6, b & 63);
                }
                if (iM107328b == -1) {
                    break;
                }
                c37364f.m119648a(iM107328b - 6, false);
            }
        }
        return false;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f53825a.mo1712g(interfaceC37369k, new C0690l0(0, 1, 1, (byte) 0));
        interfaceC37369k.mo3098l();
        interfaceC37369k.mo3111x(new C37370l(-9223372036854775807L));
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws EOFException, InterruptedIOException {
        C13117a c13117a = this.f53826b;
        int i13 = ((C37364f) interfaceC37368j).read(c13117a.f45381a, 0, 2786);
        if (i13 == -1) {
            return -1;
        }
        c13117a.m36689K(0);
        c13117a.m36688J(i13);
        boolean z4 = this.f53827c;
        C14614b c14614b = this.f53825a;
        if (!z4) {
            c14614b.mo41818d(4, 0L);
            this.f53827c = true;
        }
        c14614b.mo1711f(c13117a);
        return 0;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
