package p027b3;

import p181h2.C16618c;
import p209i3.C18034p;
import p294l3.C23277r0;
import p294l3.C23286w;
import p571w3.EnumC36774j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C2366e extends AbstractC2351b {

    /* JADX INFO: renamed from: f */
    public static C2366e f9338f;

    /* JADX INFO: renamed from: g */
    public static final EnumC36774j f9339g = EnumC36774j.f157348x;

    /* JADX INFO: renamed from: h */
    public static final EnumC36774j f9340h = EnumC36774j.f157347w;

    /* JADX INFO: renamed from: d */
    public C23277r0 f9341d;

    /* JADX INFO: renamed from: e */
    public C18034p f9342e;

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: C */
    public final int[] mo7244C(int i13) {
        int iM67375e;
        if (m7267u().length() <= 0 || i13 <= 0) {
            return null;
        }
        try {
            C18034p c18034p = this.f9342e;
            if (c18034p == null) {
                AbstractC22676k.m65757q("node");
                throw null;
            }
            C16618c c16618cM51783g = c18034p.m51783g();
            int iRound = Math.round(c16618cM51783g.f63942d - c16618cM51783g.f63940b);
            int length = m7267u().length();
            if (length <= i13) {
                i13 = length;
            }
            C23277r0 c23277r0 = this.f9341d;
            if (c23277r0 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            int iM67374d = c23277r0.f92228b.m67374d(i13);
            C23277r0 c23277r1 = this.f9341d;
            if (c23277r1 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            float fM67376f = c23277r1.f92228b.m67376f(iM67374d) - iRound;
            if (fM67376f > 0.0f) {
                C23277r0 c23277r2 = this.f9341d;
                if (c23277r2 == null) {
                    AbstractC22676k.m65757q("layoutResult");
                    throw null;
                }
                iM67375e = c23277r2.f92228b.m67375e(fM67376f);
            } else {
                iM67375e = 0;
            }
            if (i13 == m7267u().length() && iM67375e < iM67374d) {
                iM67375e++;
            }
            return m7265s(m7293L(iM67375e, f9339g), i13);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public final int m7293L(int i13, EnumC36774j enumC36774j) {
        C23277r0 c23277r0 = this.f9341d;
        if (c23277r0 == null) {
            AbstractC22676k.m65757q("layoutResult");
            throw null;
        }
        int iM67339h = c23277r0.m67339h(i13);
        C23277r0 c23277r1 = this.f9341d;
        if (c23277r1 == null) {
            AbstractC22676k.m65757q("layoutResult");
            throw null;
        }
        if (enumC36774j != c23277r1.m67340i(iM67339h)) {
            C23277r0 c23277r2 = this.f9341d;
            if (c23277r2 != null) {
                return c23277r2.m67339h(i13);
            }
            AbstractC22676k.m65757q("layoutResult");
            throw null;
        }
        C23277r0 c23277r3 = this.f9341d;
        if (c23277r3 != null) {
            return c23277r3.f92228b.m67373c(i13, false) - 1;
        }
        AbstractC22676k.m65757q("layoutResult");
        throw null;
    }

    /* JADX INFO: renamed from: M */
    public final void m7294M(String str, C23277r0 c23277r0, C18034p c18034p) {
        this.f9291b = str;
        this.f9341d = c23277r0;
        this.f9342e = c18034p;
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: n */
    public final int[] mo7261n(int i13) {
        int iM67375e;
        if (m7267u().length() <= 0 || i13 >= m7267u().length()) {
            return null;
        }
        try {
            C18034p c18034p = this.f9342e;
            if (c18034p == null) {
                AbstractC22676k.m65757q("node");
                throw null;
            }
            C16618c c16618cM51783g = c18034p.m51783g();
            int iRound = Math.round(c16618cM51783g.f63942d - c16618cM51783g.f63940b);
            if (i13 <= 0) {
                i13 = 0;
            }
            C23277r0 c23277r0 = this.f9341d;
            if (c23277r0 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            int iM67374d = c23277r0.f92228b.m67374d(i13);
            C23277r0 c23277r1 = this.f9341d;
            if (c23277r1 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            float fM67376f = c23277r1.f92228b.m67376f(iM67374d) + iRound;
            C23277r0 c23277r2 = this.f9341d;
            if (c23277r2 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            if (c23277r2 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            C23286w c23286w = c23277r2.f92228b;
            if (fM67376f < c23286w.m67376f(c23286w.f92263f - 1)) {
                C23277r0 c23277r3 = this.f9341d;
                if (c23277r3 == null) {
                    AbstractC22676k.m65757q("layoutResult");
                    throw null;
                }
                iM67375e = c23277r3.f92228b.m67375e(fM67376f);
            } else {
                C23277r0 c23277r4 = this.f9341d;
                if (c23277r4 == null) {
                    AbstractC22676k.m65757q("layoutResult");
                    throw null;
                }
                iM67375e = c23277r4.f92228b.f92263f;
            }
            return m7265s(i13, m7293L(iM67375e - 1, f9340h) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
