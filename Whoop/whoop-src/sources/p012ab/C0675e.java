package p012ab;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import no.nordicsemi.android.dfu.DfuBaseService;
import p309lo.C24561s;
import p499t9.C33636j;
import p499t9.C33638k;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C0675e implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final int f2368a;

    /* JADX INFO: renamed from: d */
    public final C38059n f2371d;

    /* JADX INFO: renamed from: e */
    public final C24561s f2372e;

    /* JADX INFO: renamed from: f */
    public InterfaceC33648q f2373f;

    /* JADX INFO: renamed from: g */
    public long f2374g;

    /* JADX INFO: renamed from: j */
    public boolean f2377j;

    /* JADX INFO: renamed from: k */
    public boolean f2378k;

    /* JADX INFO: renamed from: l */
    public boolean f2379l;

    /* JADX INFO: renamed from: b */
    public final C0677f f2369b = new C0677f(true, null, 0, "audio/mp4a-latm");

    /* JADX INFO: renamed from: c */
    public final C38059n f2370c = new C38059n(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);

    /* JADX INFO: renamed from: i */
    public int f2376i = -1;

    /* JADX INFO: renamed from: h */
    public long f2375h = -1;

    public C0675e(int i13) {
        this.f2368a = i13;
        C38059n c38059n = new C38059n(10);
        this.f2371d = c38059n;
        byte[] bArr = c38059n.f163017a;
        this.f2372e = new C24561s(bArr, bArr.length, 5, (byte) 0);
    }

    /* JADX INFO: renamed from: a */
    public final int m1668a(InterfaceC33646o interfaceC33646o) {
        int i13 = 0;
        while (true) {
            C38059n c38059n = this.f2371d;
            interfaceC33646o.mo3103p(c38059n.f163017a, 0, 10);
            c38059n.m121846F(0);
            if (c38059n.m121870w() != 4801587) {
                break;
            }
            c38059n.m121847G(3);
            int iM121866s = c38059n.m121866s();
            i13 += iM121866s + 10;
            interfaceC33646o.mo3096i(iM121866s);
        }
        interfaceC33646o.mo3093e();
        interfaceC33646o.mo3096i(i13);
        if (this.f2375h == -1) {
            this.f2375h = i13;
        }
        return i13;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        this.f2378k = false;
        this.f2369b.mo1663a();
        this.f2374g = j13;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f2373f = interfaceC33648q;
        this.f2369b.mo1667i(interfaceC33648q, new C0690l0(0, 1, 0, (byte) 0));
        interfaceC33648q.mo3098l();
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws EOFException, InterruptedIOException {
        int iM1668a = m1668a(interfaceC33646o);
        int i13 = iM1668a;
        int i14 = 0;
        int i15 = 0;
        do {
            C38059n c38059n = this.f2371d;
            C33638k c33638k = (C33638k) interfaceC33646o;
            c33638k.mo3092c(c38059n.f163017a, 0, 2, false);
            c38059n.m121846F(0);
            if ((c38059n.m121873z() & 65526) == 65520) {
                i14++;
                if (i14 >= 4 && i15 > 188) {
                    return true;
                }
                c33638k.mo3092c(c38059n.f163017a, 0, 4, false);
                C24561s c24561s = this.f2372e;
                c24561s.m71640q(14);
                int iM71632i = c24561s.m71632i(13);
                if (iM71632i <= 6) {
                    i13++;
                    c33638k.f140403F = 0;
                    c33638k.mo3078C(i13, false);
                } else {
                    c33638k.mo3078C(iM71632i - 6, false);
                    i15 += iM71632i;
                }
            } else {
                i13++;
                c33638k.f140403F = 0;
                c33638k.mo3078C(i13, false);
            }
            i14 = 0;
            i15 = 0;
        } while (i13 - iM1668a < 8192);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        C0677f c0677f;
        AbstractC35849g.m113808j(this.f2373f);
        long length = interfaceC33646o.getLength();
        int i13 = this.f2368a;
        if ((i13 & 1) != 0 && length != -1) {
            C24561s c24561s = this.f2372e;
            C38059n c38059n = this.f2371d;
            if (!this.f2377j) {
                this.f2376i = -1;
                interfaceC33646o.mo3093e();
                long j7 = 0;
                if (interfaceC33646o.getPosition() == 0) {
                    m1668a(interfaceC33646o);
                }
                int i14 = 0;
                while (interfaceC33646o.mo3092c(c38059n.f163017a, 0, 2, true)) {
                    try {
                        c38059n.m121846F(0);
                        if (!((c38059n.m121873z() & 65526) == 65520)) {
                            i14 = 0;
                            break;
                        }
                        if (!interfaceC33646o.mo3092c(c38059n.f163017a, 0, 4, true)) {
                            break;
                        }
                        c24561s.m71640q(14);
                        int iM71632i = c24561s.m71632i(13);
                        if (iM71632i <= 6) {
                            this.f2377j = true;
                            throw ParserException.m5049a(null, "Malformed ADTS stream");
                        }
                        j7 += (long) iM71632i;
                        i14++;
                        if (i14 == 1000 || !interfaceC33646o.mo3078C(iM71632i - 6, true)) {
                            break;
                            break;
                        }
                    } catch (EOFException unused) {
                    }
                }
                interfaceC33646o.mo3093e();
                if (i14 > 0) {
                    this.f2376i = (int) (j7 / ((long) i14));
                } else {
                    this.f2376i = -1;
                }
                this.f2377j = true;
            }
        }
        C38059n c38059n2 = this.f2370c;
        int i15 = interfaceC33646o.read(c38059n2.f163017a, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
        boolean z4 = i15 == -1;
        boolean z13 = this.f2379l;
        C0677f c0677f2 = this.f2369b;
        if (z13) {
            c0677f = c0677f2;
            c38059n2 = c38059n2;
        } else {
            boolean z14 = (i13 & 1) != 0 && this.f2376i > 0;
            if (z14 && c0677f2.f2399s == -9223372036854775807L && !z4) {
                c0677f = c0677f2;
                c38059n2 = c38059n2;
            } else {
                if (z14) {
                    long j13 = c0677f2.f2399s;
                    if (j13 != -9223372036854775807L) {
                        InterfaceC33648q interfaceC33648q = this.f2373f;
                        int i16 = this.f2376i;
                        c0677f = c0677f2;
                        interfaceC33648q.mo3109v(new C33636j(length, this.f2375h, (int) ((((long) i16) * 8000000) / j13), i16, false));
                    } else {
                        c0677f = c0677f2;
                        this.f2373f.mo3109v(new C33651t(-9223372036854775807L));
                    }
                } else {
                    c0677f = c0677f2;
                    this.f2373f.mo3109v(new C33651t(-9223372036854775807L));
                }
                this.f2379l = true;
            }
        }
        if (z4) {
            return -1;
        }
        C38059n c38059n3 = c38059n2;
        c38059n3.m121846F(0);
        c38059n3.m121845E(i15);
        if (!this.f2378k) {
            c0677f.f2401u = this.f2374g;
            this.f2378k = true;
        }
        c0677f.mo1664c(c38059n3);
        return 0;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
