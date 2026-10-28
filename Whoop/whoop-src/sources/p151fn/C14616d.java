package p151fn;

import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import no.nordicsemi.android.dfu.DfuBaseService;
import p012ab.C0690l0;
import p309lo.AbstractC24543a;
import p309lo.C24561s;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;

/* JADX INFO: renamed from: fn.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C14616d implements InterfaceC37367i {

    /* JADX INFO: renamed from: c */
    public final C13117a f53846c;

    /* JADX INFO: renamed from: d */
    public final C24561s f53847d;

    /* JADX INFO: renamed from: e */
    public InterfaceC37369k f53848e;

    /* JADX INFO: renamed from: f */
    public long f53849f;

    /* JADX INFO: renamed from: h */
    public boolean f53851h;

    /* JADX INFO: renamed from: i */
    public boolean f53852i;

    /* JADX INFO: renamed from: a */
    public final C14617e f53844a = new C14617e(true, null);

    /* JADX INFO: renamed from: b */
    public final C13117a f53845b = new C13117a(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);

    /* JADX INFO: renamed from: g */
    public long f53850g = -1;

    public C14616d(int i13) {
        C13117a c13117a = new C13117a(10);
        this.f53846c = c13117a;
        byte[] bArr = c13117a.f45381a;
        this.f53847d = new C24561s(bArr, bArr.length, 0, (byte) 0);
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        this.f53851h = false;
        this.f53844a.mo41817a();
        this.f53849f = j13;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) throws EOFException, InterruptedIOException {
        int i13 = 0;
        while (true) {
            C13117a c13117a = this.f53846c;
            interfaceC37368j.mo3103p(c13117a.f45381a, 0, 10);
            c13117a.m36689K(0);
            if (c13117a.m36679A() != 4801587) {
                break;
            }
            c13117a.m36690L(3);
            int iM36713w = c13117a.m36713w();
            i13 += iM36713w + 10;
            interfaceC37368j.mo3096i(iM36713w);
        }
        interfaceC37368j.mo3093e();
        interfaceC37368j.mo3096i(i13);
        if (this.f53850g == -1) {
            this.f53850g = i13;
        }
        int i14 = i13;
        int i15 = 0;
        int i16 = 0;
        do {
            C13117a c13117a2 = this.f53846c;
            C37364f c37364f = (C37364f) interfaceC37368j;
            c37364f.mo3092c(c13117a2.f45381a, 0, 2, false);
            c13117a2.m36689K(0);
            if ((c13117a2.m36682D() & 65526) == 65520) {
                i15++;
                if (i15 >= 4 && i16 > 188) {
                    return true;
                }
                c37364f.mo3092c(c13117a2.f45381a, 0, 4, false);
                C24561s c24561s = this.f53847d;
                c24561s.m71640q(14);
                int iM71632i = c24561s.m71632i(13);
                if (iM71632i <= 6) {
                    i14++;
                    c37364f.f159847F = 0;
                    c37364f.m119648a(i14, false);
                } else {
                    c37364f.m119648a(iM71632i - 6, false);
                    i16 += iM71632i;
                }
            } else {
                i14++;
                c37364f.f159847F = 0;
                c37364f.m119648a(i14, false);
            }
            i15 = 0;
            i16 = 0;
        } while (i14 - i13 < 8192);
        return false;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f53848e = interfaceC37369k;
        this.f53844a.mo1712g(interfaceC37369k, new C0690l0(0, 1, 1, (byte) 0));
        interfaceC37369k.mo3098l();
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        AbstractC24543a.m71574j(this.f53848e);
        long j7 = ((C37364f) interfaceC37368j).f159851y;
        C13117a c13117a = this.f53845b;
        int i13 = ((C37364f) interfaceC37368j).read(c13117a.f45381a, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
        boolean z4 = i13 == -1;
        if (!this.f53852i) {
            this.f53848e.mo3111x(new C37370l(-9223372036854775807L));
            this.f53852i = true;
        }
        if (z4) {
            return -1;
        }
        c13117a.m36689K(0);
        c13117a.m36688J(i13);
        boolean z13 = this.f53851h;
        C14617e c14617e = this.f53844a;
        if (!z13) {
            c14617e.mo41818d(4, this.f53849f);
            this.f53851h = true;
        }
        c14617e.mo1711f(c13117a);
        return 0;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
