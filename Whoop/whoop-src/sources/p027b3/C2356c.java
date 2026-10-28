package p027b3;

import java.text.BreakIterator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C2356c extends AbstractC2351b {

    /* JADX INFO: renamed from: f */
    public static C2356c f9308f;

    /* JADX INFO: renamed from: g */
    public static C2356c f9309g;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9310d;

    /* JADX INFO: renamed from: e */
    public BreakIterator f9311e;

    public /* synthetic */ C2356c(int i13) {
        this.f9310d = i13;
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: C */
    public final int[] mo7244C(int i13) {
        switch (this.f9310d) {
            case 0:
                int length = m7267u().length();
                if (length <= 0 || i13 <= 0) {
                    return null;
                }
                if (i13 > length) {
                    i13 = length;
                }
                do {
                    BreakIterator breakIterator = this.f9311e;
                    if (breakIterator == null) {
                        AbstractC22676k.m65757q("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i13)) {
                        BreakIterator breakIterator2 = this.f9311e;
                        if (breakIterator2 == null) {
                            AbstractC22676k.m65757q("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i13);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m7265s(iPreceding, i13);
                    }
                    BreakIterator breakIterator3 = this.f9311e;
                    if (breakIterator3 == null) {
                        AbstractC22676k.m65757q("impl");
                        throw null;
                    }
                    i13 = breakIterator3.preceding(i13);
                } while (i13 != -1);
                return null;
            default:
                int length2 = m7267u().length();
                if (length2 <= 0 || i13 <= 0) {
                    return null;
                }
                if (i13 > length2) {
                    i13 = length2;
                }
                while (i13 > 0 && !m7280M(i13 - 1) && !m7279L(i13)) {
                    BreakIterator breakIterator4 = this.f9311e;
                    if (breakIterator4 == null) {
                        AbstractC22676k.m65757q("impl");
                        throw null;
                    }
                    i13 = breakIterator4.preceding(i13);
                    if (i13 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f9311e;
                if (breakIterator5 == null) {
                    AbstractC22676k.m65757q("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i13);
                if (iPreceding2 == -1 || !m7280M(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m7280M(iPreceding2 - 1)) {
                    return m7265s(iPreceding2, i13);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean m7279L(int i13) {
        if (i13 <= 0 || !m7280M(i13 - 1)) {
            return false;
        }
        return i13 == m7267u().length() || !m7280M(i13);
    }

    /* JADX INFO: renamed from: M */
    public boolean m7280M(int i13) {
        if (i13 < 0 || i13 >= m7267u().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m7267u().codePointAt(i13));
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: n */
    public final int[] mo7261n(int i13) {
        switch (this.f9310d) {
            case 0:
                int length = m7267u().length();
                if (length <= 0 || i13 >= length) {
                    return null;
                }
                if (i13 < 0) {
                    i13 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f9311e;
                    if (breakIterator == null) {
                        AbstractC22676k.m65757q("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i13)) {
                        BreakIterator breakIterator2 = this.f9311e;
                        if (breakIterator2 == null) {
                            AbstractC22676k.m65757q("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i13);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m7265s(i13, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.f9311e;
                    if (breakIterator3 == null) {
                        AbstractC22676k.m65757q("impl");
                        throw null;
                    }
                    i13 = breakIterator3.following(i13);
                } while (i13 != -1);
                return null;
            default:
                if (m7267u().length() <= 0 || i13 >= m7267u().length()) {
                    return null;
                }
                if (i13 < 0) {
                    i13 = 0;
                }
                while (!m7280M(i13) && (!m7280M(i13) || (i13 != 0 && m7280M(i13 - 1)))) {
                    BreakIterator breakIterator4 = this.f9311e;
                    if (breakIterator4 == null) {
                        AbstractC22676k.m65757q("impl");
                        throw null;
                    }
                    i13 = breakIterator4.following(i13);
                    if (i13 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f9311e;
                if (breakIterator5 == null) {
                    AbstractC22676k.m65757q("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i13);
                if (iFollowing2 == -1 || !m7279L(iFollowing2)) {
                    return null;
                }
                return m7265s(i13, iFollowing2);
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: v */
    public final void mo7268v(String str) {
        switch (this.f9310d) {
            case 0:
                this.f9291b = str;
                BreakIterator breakIterator = this.f9311e;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC22676k.m65757q("impl");
                    throw null;
                }
            default:
                this.f9291b = str;
                BreakIterator breakIterator2 = this.f9311e;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC22676k.m65757q("impl");
                    throw null;
                }
        }
    }
}
