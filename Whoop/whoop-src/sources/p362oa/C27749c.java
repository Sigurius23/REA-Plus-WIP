package p362oa;

import ai.C0902h;
import androidx.media3.common.ParserException;
import ed3.C13131o;
import java.util.Arrays;
import ng3.C26701n;
import p123en.AbstractC13361h;
import p123en.C13355b;
import p123en.C13358e;
import p499t9.AbstractC33618a;
import p499t9.C33650s;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import qg3.C30352d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: oa.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C27749c implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public InterfaceC33648q f111911a;

    /* JADX INFO: renamed from: b */
    public AbstractC13361h f111912b;

    /* JADX INFO: renamed from: c */
    public boolean f111913c;

    /* JADX INFO: renamed from: a */
    public final boolean m83843a(InterfaceC33646o interfaceC33646o) {
        boolean zM106231w;
        C13358e c13358e = new C13358e(1);
        if (c13358e.m37617a(interfaceC33646o, true) && (c13358e.f46687a & 2) == 2) {
            int iMin = Math.min(c13358e.f46691e, 8);
            C38059n c38059n = new C38059n(iMin);
            interfaceC33646o.mo3103p(c38059n.f163017a, 0, iMin);
            c38059n.m121846F(0);
            if (c38059n.m121848a() >= 5 && c38059n.m121867t() == 127 && c38059n.m121869v() == 1179402563) {
                this.f111912b = new C27748b(1);
                return true;
            }
            c38059n.m121846F(0);
            try {
                zM106231w = AbstractC33618a.m106231w(1, c38059n, true);
            } catch (ParserException unused) {
                zM106231w = false;
            }
            if (zM106231w) {
                this.f111912b = new C27752f(1);
            } else {
                c38059n.m121846F(0);
                if (C27751e.m83844g(c38059n, C27751e.f111914p)) {
                    this.f111912b = new C27751e(1);
                }
            }
            return true;
        }
        return false;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        AbstractC13361h abstractC13361h = this.f111912b;
        if (abstractC13361h != null) {
            C13131o c13131o = (C13131o) abstractC13361h.f46705j;
            C13358e c13358e = (C13358e) c13131o.f45424e;
            c13358e.f46687a = 0;
            c13358e.f46688b = 0L;
            c13358e.f46689c = 0;
            c13358e.f46690d = 0;
            c13358e.f46691e = 0;
            ((C38059n) c13131o.f45425f).m121843C(0);
            c13131o.f45421b = -1;
            c13131o.f45423d = false;
            if (j7 == 0) {
                abstractC13361h.mo37615f(!abstractC13361h.f46703h);
                return;
            }
            if (abstractC13361h.f46700e != 0) {
                long j14 = (((long) abstractC13361h.f46701f) * j13) / 1000000;
                abstractC13361h.f46697b = j14;
                InterfaceC27750d interfaceC27750d = (InterfaceC27750d) abstractC13361h.f46708m;
                int i13 = AbstractC38065t.f163031a;
                interfaceC27750d.mo2200e(j14);
                abstractC13361h.f46700e = 2;
            }
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f111911a = interfaceC33648q;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        try {
            return m83843a(interfaceC33646o);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0197  */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        byte[] bArr;
        AbstractC35849g.m113808j(this.f111911a);
        if (this.f111912b == null) {
            if (!m83843a(interfaceC33646o)) {
                throw ParserException.m5049a(null, "Failed to determine bitstream type");
            }
            interfaceC33646o.mo3093e();
        }
        if (!this.f111913c) {
            InterfaceC33639k0 interfaceC33639k0Mo3101o = this.f111911a.mo3101o(0, 1);
            this.f111911a.mo3098l();
            AbstractC13361h abstractC13361h = this.f111912b;
            abstractC13361h.f46707l = this.f111911a;
            abstractC13361h.f46706k = interfaceC33639k0Mo3101o;
            abstractC13361h.mo37615f(true);
            this.f111913c = true;
        }
        AbstractC13361h abstractC13361h2 = this.f111912b;
        C13131o c13131o = (C13131o) abstractC13361h2.f46705j;
        AbstractC35849g.m113808j((InterfaceC33639k0) abstractC13361h2.f46706k);
        int i13 = AbstractC38065t.f163031a;
        int i14 = abstractC13361h2.f46700e;
        long j7 = -1;
        if (i14 != 0) {
            if (i14 == 1) {
                interfaceC33646o.mo3100n((int) abstractC13361h2.f46698c);
                abstractC13361h2.f46700e = 2;
                return 0;
            }
            if (i14 != 2) {
                if (i14 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long jMo2203j = ((InterfaceC27750d) abstractC13361h2.f46708m).mo2203j(interfaceC33646o);
            if (jMo2203j >= 0) {
                c33650s.f140436a = jMo2203j;
                return 1;
            }
            if (jMo2203j < -1) {
                abstractC13361h2.mo37622a(-(jMo2203j + 2));
            }
            if (!abstractC13361h2.f46703h) {
                InterfaceC33627e0 interfaceC33627e0Mo2198d = ((InterfaceC27750d) abstractC13361h2.f46708m).mo2198d();
                AbstractC35849g.m113808j(interfaceC33627e0Mo2198d);
                ((InterfaceC33648q) abstractC13361h2.f46707l).mo3109v(interfaceC33627e0Mo2198d);
                InterfaceC33639k0 interfaceC33639k0 = (InterfaceC33639k0) abstractC13361h2.f46706k;
                interfaceC33627e0Mo2198d.mo8510f();
                interfaceC33639k0.getClass();
                abstractC13361h2.f46703h = true;
            }
            if (abstractC13361h2.f46702g <= 0 && !c13131o.m36746g(interfaceC33646o)) {
                abstractC13361h2.f46700e = 3;
                return -1;
            }
            abstractC13361h2.f46702g = 0L;
            C38059n c38059n = (C38059n) c13131o.f45425f;
            long jMo37623c = abstractC13361h2.mo37623c(c38059n);
            if (jMo37623c >= 0) {
                long j13 = abstractC13361h2.f46699d;
                if (j13 + jMo37623c >= abstractC13361h2.f46697b) {
                    long j14 = (j13 * 1000000) / ((long) abstractC13361h2.f46701f);
                    ((InterfaceC33639k0) abstractC13361h2.f46706k).mo36176d(c38059n, c38059n.f163019c, 0);
                    ((InterfaceC33639k0) abstractC13361h2.f46706k).mo36174b(j14, 1, c38059n.f163019c, 0, null);
                    abstractC13361h2.f46697b = -1L;
                }
            }
            abstractC13361h2.f46699d += jMo37623c;
            return 0;
        }
        while (true) {
            boolean zM36746g = c13131o.m36746g(interfaceC33646o);
            C38059n c38059n2 = (C38059n) c13131o.f45425f;
            if (!zM36746g) {
                abstractC13361h2.f46700e = 3;
                return -1;
            }
            long position = interfaceC33646o.getPosition();
            long j15 = j7;
            long j16 = abstractC13361h2.f46698c;
            abstractC13361h2.f46702g = position - j16;
            if (!abstractC13361h2.mo37624e(c38059n2, j16, (C30352d) abstractC13361h2.f46709n)) {
                C34610p c34610p = (C34610p) ((C30352d) abstractC13361h2.f46709n).f124535x;
                abstractC13361h2.f46701f = c34610p.f145760E;
                if (!abstractC13361h2.f46704i) {
                    ((InterfaceC33639k0) abstractC13361h2.f46706k).mo36173a(c34610p);
                    abstractC13361h2.f46704i = true;
                }
                C0902h c0902h = (C0902h) ((C30352d) abstractC13361h2.f46709n).f124536y;
                if (c0902h == null) {
                    if (interfaceC33646o.getLength() == j15) {
                        abstractC13361h2.f46708m = new C26701n(9);
                    } else {
                        C13358e c13358e = (C13358e) c13131o.f45424e;
                        abstractC13361h2.f46708m = new C13355b(abstractC13361h2, abstractC13361h2.f46698c, interfaceC33646o.getLength(), c13358e.f46690d + c13358e.f46691e, c13358e.f46688b, (c13358e.f46687a & 4) != 0, (byte) 0);
                    }
                    abstractC13361h2.f46700e = 2;
                    bArr = c38059n2.f163017a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    c38059n2.m121844D(c38059n2.f163019c, Arrays.copyOf(bArr, Math.max(65025, c38059n2.f163019c)));
                    return 0;
                }
                abstractC13361h2.f46708m = c0902h;
                abstractC13361h2.f46700e = 2;
                bArr = c38059n2.f163017a;
                if (bArr.length == 65025) {
                    return 0;
                }
                c38059n2.m121844D(c38059n2.f163019c, Arrays.copyOf(bArr, Math.max(65025, c38059n2.f163019c)));
                return 0;
            }
            abstractC13361h2.f46698c = interfaceC33646o.getPosition();
            j7 = j15;
        }
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
