package p133f1;

import j93.AbstractC21478l0;
import java.util.List;
import p181h2.C16618c;
import p294l3.C23254g;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p294l3.C23286w;
import p412q3.C29860a;
import p412q3.C29890x;
import p412q3.C29891y;
import p412q3.InterfaceC29874h;
import p412q3.InterfaceC29884r;
import p510u0.AbstractC34339n0;
import p510u0.C34346p1;
import p571w3.EnumC36774j;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: f1.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13941g1 {

    /* JADX INFO: renamed from: a */
    public final C23254g f49695a;

    /* JADX INFO: renamed from: b */
    public final long f49696b;

    /* JADX INFO: renamed from: c */
    public final C23277r0 f49697c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC29884r f49698d;

    /* JADX INFO: renamed from: e */
    public final C13992x1 f49699e;

    /* JADX INFO: renamed from: f */
    public long f49700f;

    /* JADX INFO: renamed from: g */
    public final C23254g f49701g;

    /* JADX INFO: renamed from: h */
    public final C29891y f49702h;

    /* JADX INFO: renamed from: i */
    public final C34346p1 f49703i;

    public C13941g1(C29891y c29891y, InterfaceC29884r interfaceC29884r, C34346p1 c34346p1, C13992x1 c13992x1) {
        C23254g c23254g = c29891y.f122125a;
        long j7 = c29891y.f122126b;
        C23277r0 c23277r0 = c34346p1 != null ? c34346p1.f144282a : null;
        this.f49695a = c23254g;
        this.f49696b = j7;
        this.f49697c = c23277r0;
        this.f49698d = interfaceC29884r;
        this.f49699e = c13992x1;
        this.f49700f = j7;
        this.f49701g = c23254g;
        this.f49702h = c29891y;
        this.f49703i = c34346p1;
    }

    /* JADX INFO: renamed from: a */
    public final List m39712a(Function1 function1) {
        if (!C23283u0.m67357c(this.f49700f)) {
            return AbstractC37056f.m118959K(new C29860a("", 0), new C29890x(C23283u0.m67360f(this.f49700f), C23283u0.m67360f(this.f49700f)));
        }
        InterfaceC29874h interfaceC29874h = (InterfaceC29874h) function1.invoke(this);
        if (interfaceC29874h != null) {
            return AbstractC37056f.m118958J(interfaceC29874h);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m39713b() {
        C23277r0 c23277r0 = this.f49697c;
        if (c23277r0 == null) {
            return null;
        }
        C23286w c23286w = c23277r0.f92228b;
        int iM67359e = C23283u0.m67359e(this.f49700f);
        InterfaceC29884r interfaceC29884r = this.f49698d;
        return Integer.valueOf(interfaceC29884r.mo15743n(c23286w.m67373c(c23286w.m67374d(interfaceC29884r.mo15749x(iM67359e)), true)));
    }

    /* JADX INFO: renamed from: c */
    public final Integer m39714c() {
        C23277r0 c23277r0 = this.f49697c;
        if (c23277r0 == null) {
            return null;
        }
        int iM67360f = C23283u0.m67360f(this.f49700f);
        InterfaceC29884r interfaceC29884r = this.f49698d;
        return Integer.valueOf(interfaceC29884r.mo15743n(c23277r0.m67339h(c23277r0.f92228b.m67374d(interfaceC29884r.mo15749x(iM67360f)))));
    }

    /* JADX INFO: renamed from: d */
    public final Integer m39715d() {
        int length;
        C23277r0 c23277r0 = this.f49697c;
        if (c23277r0 == null) {
            return null;
        }
        int iM39729r = m39729r();
        while (true) {
            C23254g c23254g = this.f49695a;
            if (iM39729r < c23254g.f92135x.length()) {
                int length2 = this.f49701g.f92135x.length() - 1;
                if (iM39729r <= length2) {
                    length2 = iM39729r;
                }
                long jM67342k = c23277r0.m67342k(length2);
                int i13 = C23283u0.f92252c;
                int i14 = (int) (jM67342k & 4294967295L);
                if (i14 > iM39729r) {
                    length = this.f49698d.mo15743n(i14);
                    break;
                }
                iM39729r++;
            } else {
                length = c23254g.f92135x.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: e */
    public final Integer m39716e() {
        int iMo15743n;
        C23277r0 c23277r0 = this.f49697c;
        if (c23277r0 == null) {
            return null;
        }
        for (int iM39729r = m39729r(); iM39729r > 0; iM39729r--) {
            int length = this.f49701g.f92135x.length() - 1;
            if (iM39729r <= length) {
                length = iM39729r;
            }
            long jM67342k = c23277r0.m67342k(length);
            int i13 = C23283u0.f92252c;
            int i14 = (int) (jM67342k >> 32);
            if (i14 < iM39729r) {
                iMo15743n = this.f49698d.mo15743n(i14);
                return Integer.valueOf(iMo15743n);
            }
        }
        iMo15743n = 0;
        return Integer.valueOf(iMo15743n);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m39717f() {
        C23277r0 c23277r0 = this.f49697c;
        return (c23277r0 != null ? c23277r0.m67340i(m39729r()) : null) != EnumC36774j.f157348x;
    }

    /* JADX INFO: renamed from: g */
    public final int m39718g(C23277r0 c23277r0, int i13) {
        int iM39729r = m39729r();
        C13992x1 c13992x1 = this.f49699e;
        if (c13992x1.f49931a == null) {
            c13992x1.f49931a = Float.valueOf(c23277r0.m67334c(iM39729r).f63939a);
        }
        C23286w c23286w = c23277r0.f92228b;
        int iM67374d = c23286w.m67374d(iM39729r) + i13;
        if (iM67374d < 0) {
            return 0;
        }
        if (iM67374d >= c23286w.f92263f) {
            return this.f49701g.f92135x.length();
        }
        float fM67372b = c23286w.m67372b(iM67374d) - 1;
        Float f13 = c13992x1.f49931a;
        AbstractC22676k.m65747g(f13);
        float fFloatValue = f13.floatValue();
        if ((m39717f() && fFloatValue >= c23277r0.m67338g(iM67374d)) || (!m39717f() && fFloatValue <= c23277r0.m67337f(iM67374d))) {
            return c23286w.m67373c(iM67374d, true);
        }
        return this.f49698d.mo15743n(c23286w.m67377g((((long) Float.floatToRawIntBits(fM67372b)) & 4294967295L) | (Float.floatToRawIntBits(f13.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: h */
    public final int m39719h(C34346p1 c34346p1, int i13) {
        C16618c c16618cMo3547r;
        InterfaceC39147y interfaceC39147y = c34346p1.f144283b;
        C23277r0 c23277r0 = c34346p1.f144282a;
        if (interfaceC39147y == null) {
            c16618cMo3547r = C16618c.f63938e;
        } else {
            InterfaceC39147y interfaceC39147y2 = c34346p1.f144284c;
            c16618cMo3547r = interfaceC39147y2 != null ? interfaceC39147y2.mo3547r(interfaceC39147y, true) : null;
            if (c16618cMo3547r == null) {
                c16618cMo3547r = C16618c.f63938e;
            }
        }
        long j7 = this.f49702h.f122126b;
        int i14 = C23283u0.f92252c;
        int i15 = (int) (j7 & 4294967295L);
        InterfaceC29884r interfaceC29884r = this.f49698d;
        C16618c c16618cM67334c = c23277r0.m67334c(interfaceC29884r.mo15749x(i15));
        float f13 = c16618cM67334c.f63939a;
        return interfaceC29884r.mo15743n(c23277r0.f92228b.m67377g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c16618cMo3547r.m47199e() & 4294967295L)) * i13) + c16618cM67334c.f63940b)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32)));
    }

    /* JADX INFO: renamed from: i */
    public final void m39720i() {
        C13992x1 c13992x1 = this.f49699e;
        c13992x1.f49931a = null;
        C23254g c23254g = this.f49701g;
        if (c23254g.f92135x.length() > 0) {
            if (m39717f()) {
                m39722k();
                return;
            }
            c13992x1.f49931a = null;
            if (c23254g.f92135x.length() > 0) {
                String str = c23254g.f92135x;
                long j7 = this.f49700f;
                int i13 = C23283u0.f92252c;
                int iM108635m = AbstractC34339n0.m108635m((int) (j7 & 4294967295L), str);
                if (iM108635m != -1) {
                    m39728q(iM108635m, iM108635m);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m39721j() {
        this.f49699e.f49931a = null;
        C23254g c23254g = this.f49701g;
        String str = c23254g.f92135x;
        String str2 = c23254g.f92135x;
        if (str.length() > 0) {
            int iM108636n = AbstractC34339n0.m108636n(C23283u0.m67359e(this.f49700f), str2);
            if (iM108636n == C23283u0.m67359e(this.f49700f) && iM108636n != str2.length()) {
                iM108636n = AbstractC34339n0.m108636n(iM108636n + 1, str2);
            }
            m39728q(iM108636n, iM108636n);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m39722k() {
        this.f49699e.f49931a = null;
        C23254g c23254g = this.f49701g;
        if (c23254g.f92135x.length() > 0) {
            String str = c23254g.f92135x;
            long j7 = this.f49700f;
            int i13 = C23283u0.f92252c;
            int iM108638p = AbstractC34339n0.m108638p((int) (j7 & 4294967295L), str);
            if (iM108638p != -1) {
                m39728q(iM108638p, iM108638p);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m39723l() {
        this.f49699e.f49931a = null;
        C23254g c23254g = this.f49701g;
        String str = c23254g.f92135x;
        String str2 = c23254g.f92135x;
        if (str.length() > 0) {
            int iM108637o = AbstractC34339n0.m108637o(C23283u0.m67360f(this.f49700f), str2);
            if (iM108637o == C23283u0.m67360f(this.f49700f) && iM108637o != 0) {
                iM108637o = AbstractC34339n0.m108637o(iM108637o - 1, str2);
            }
            m39728q(iM108637o, iM108637o);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m39724m() {
        C13992x1 c13992x1 = this.f49699e;
        c13992x1.f49931a = null;
        C23254g c23254g = this.f49701g;
        if (c23254g.f92135x.length() > 0) {
            if (!m39717f()) {
                m39722k();
                return;
            }
            c13992x1.f49931a = null;
            if (c23254g.f92135x.length() > 0) {
                String str = c23254g.f92135x;
                long j7 = this.f49700f;
                int i13 = C23283u0.f92252c;
                int iM108635m = AbstractC34339n0.m108635m((int) (j7 & 4294967295L), str);
                if (iM108635m != -1) {
                    m39728q(iM108635m, iM108635m);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m39725n() {
        Integer numM39713b;
        this.f49699e.f49931a = null;
        if (this.f49701g.f92135x.length() <= 0 || (numM39713b = m39713b()) == null) {
            return;
        }
        int iIntValue = numM39713b.intValue();
        m39728q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: o */
    public final void m39726o() {
        Integer numM39714c;
        this.f49699e.f49931a = null;
        if (this.f49701g.f92135x.length() <= 0 || (numM39714c = m39714c()) == null) {
            return;
        }
        int iIntValue = numM39714c.intValue();
        m39728q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: p */
    public final void m39727p() {
        if (this.f49701g.f92135x.length() > 0) {
            int i13 = C23283u0.f92252c;
            this.f49700f = AbstractC21478l0.m60431f((int) (this.f49696b >> 32), (int) (this.f49700f & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m39728q(int i13, int i14) {
        this.f49700f = AbstractC21478l0.m60431f(i13, i14);
    }

    /* JADX INFO: renamed from: r */
    public final int m39729r() {
        long j7 = this.f49700f;
        int i13 = C23283u0.f92252c;
        return this.f49698d.mo15749x((int) (j7 & 4294967295L));
    }
}
