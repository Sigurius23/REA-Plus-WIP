package p027b3;

import p294l3.C23277r0;
import p571w3.EnumC36774j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C2361d extends AbstractC2351b {

    /* JADX INFO: renamed from: e */
    public static C2361d f9322e;

    /* JADX INFO: renamed from: f */
    public static final EnumC36774j f9323f = EnumC36774j.f157348x;

    /* JADX INFO: renamed from: g */
    public static final EnumC36774j f9324g = EnumC36774j.f157347w;

    /* JADX INFO: renamed from: d */
    public C23277r0 f9325d;

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: C */
    public final int[] mo7244C(int i13) {
        int iM67374d;
        if (m7267u().length() <= 0 || i13 <= 0) {
            return null;
        }
        int length = m7267u().length();
        EnumC36774j enumC36774j = f9324g;
        if (i13 > length) {
            C23277r0 c23277r0 = this.f9325d;
            if (c23277r0 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            iM67374d = c23277r0.f92228b.m67374d(m7267u().length());
        } else {
            C23277r0 c23277r1 = this.f9325d;
            if (c23277r1 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            int iM67374d2 = c23277r1.f92228b.m67374d(i13);
            iM67374d = m7284L(iM67374d2, enumC36774j) + 1 == i13 ? iM67374d2 : iM67374d2 - 1;
        }
        if (iM67374d < 0) {
            return null;
        }
        return m7265s(m7284L(iM67374d, f9323f), m7284L(iM67374d, enumC36774j) + 1);
    }

    /* JADX INFO: renamed from: L */
    public final int m7284L(int i13, EnumC36774j enumC36774j) {
        C23277r0 c23277r0 = this.f9325d;
        if (c23277r0 == null) {
            AbstractC22676k.m65757q("layoutResult");
            throw null;
        }
        int iM67339h = c23277r0.m67339h(i13);
        C23277r0 c23277r1 = this.f9325d;
        if (c23277r1 == null) {
            AbstractC22676k.m65757q("layoutResult");
            throw null;
        }
        if (enumC36774j != c23277r1.m67340i(iM67339h)) {
            C23277r0 c23277r2 = this.f9325d;
            if (c23277r2 != null) {
                return c23277r2.m67339h(i13);
            }
            AbstractC22676k.m65757q("layoutResult");
            throw null;
        }
        C23277r0 c23277r3 = this.f9325d;
        if (c23277r3 != null) {
            return c23277r3.f92228b.m67373c(i13, false) - 1;
        }
        AbstractC22676k.m65757q("layoutResult");
        throw null;
    }

    /* JADX INFO: renamed from: M */
    public final void m7285M(String str, C23277r0 c23277r0) {
        this.f9291b = str;
        this.f9325d = c23277r0;
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: n */
    public final int[] mo7261n(int i13) {
        int iM67374d;
        if (m7267u().length() <= 0 || i13 >= m7267u().length()) {
            return null;
        }
        EnumC36774j enumC36774j = f9323f;
        if (i13 < 0) {
            C23277r0 c23277r0 = this.f9325d;
            if (c23277r0 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            iM67374d = c23277r0.f92228b.m67374d(0);
        } else {
            C23277r0 c23277r1 = this.f9325d;
            if (c23277r1 == null) {
                AbstractC22676k.m65757q("layoutResult");
                throw null;
            }
            int iM67374d2 = c23277r1.f92228b.m67374d(i13);
            iM67374d = m7284L(iM67374d2, enumC36774j) == i13 ? iM67374d2 : iM67374d2 + 1;
        }
        C23277r0 c23277r2 = this.f9325d;
        if (c23277r2 == null) {
            AbstractC22676k.m65757q("layoutResult");
            throw null;
        }
        if (iM67374d >= c23277r2.f92228b.f92263f) {
            return null;
        }
        return m7265s(m7284L(iM67374d, enumC36774j), m7284L(iM67374d, f9324g) + 1);
    }
}
