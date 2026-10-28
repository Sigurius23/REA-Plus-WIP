package w63;

import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32100b;
import v63.AbstractC35749g;
import v63.C35746d;

/* JADX INFO: renamed from: w63.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC36867b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f157705a = new byte[0];

    /* JADX INFO: renamed from: a */
    public static final void m118251a(AbstractC35749g abstractC35749g, C36866a c36866a) {
        AbstractC22676k.m65750j(abstractC35749g, "<this>");
        int i13 = c36866a.f77290f;
        if (c36866a == abstractC35749g) {
            return;
        }
        int i14 = c36866a.f77287c;
        int i15 = c36866a.f77286b;
        if (i14 <= i15) {
            abstractC35749g.m113266h(c36866a);
            return;
        }
        if (i13 - c36866a.f77289e >= 8) {
            abstractC35749g.f152035z = i15;
            return;
        }
        C36866a c36866aM118245h = c36866a.m118245h();
        if (c36866aM118245h == null) {
            abstractC35749g.m113267i(c36866a);
            return;
        }
        int i16 = c36866a.f77287c - c36866a.f77286b;
        int iMin = Math.min(i16, 8 - (i13 - c36866a.f77289e));
        if (c36866aM118245h.f77288d < iMin) {
            abstractC35749g.m113267i(c36866a);
            return;
        }
        AbstractC32100b.m99870t(iMin, c36866aM118245h);
        if (i16 > iMin) {
            c36866a.f77289e = i13;
            abstractC35749g.f152029E = c36866a.f77287c;
            abstractC35749g.m113263T(abstractC35749g.f152030F + ((long) iMin));
        } else {
            abstractC35749g.m113264a0(c36866aM118245h);
            abstractC35749g.m113263T(abstractC35749g.f152030F - ((long) ((c36866aM118245h.f77287c - c36866aM118245h.f77286b) - iMin)));
            c36866a.m118244g();
            c36866a.m118247j(abstractC35749g.f152032w);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C36866a m118252b(AbstractC35749g abstractC35749g, int i13) {
        AbstractC22676k.m65750j(abstractC35749g, "<this>");
        return abstractC35749g.m113271x(i13, abstractC35749g.m113269m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final C36866a m118253c(AbstractC35749g abstractC35749g, C36866a c36866a) {
        AbstractC22676k.m65750j(abstractC35749g, "<this>");
        if (c36866a != abstractC35749g) {
            return abstractC35749g.m113266h(c36866a);
        }
        if (abstractC35749g.f152035z == abstractC35749g.f152029E && abstractC35749g.f152030F == 0) {
            return null;
        }
        return (C36866a) abstractC35749g;
    }

    /* JADX INFO: renamed from: d */
    public static final C36866a m118254d(C35746d c35746d, int i13, C36866a c36866a) {
        AbstractC22676k.m65750j(c35746d, "<this>");
        if (c36866a != null) {
            c35746d.m113255b();
        }
        return c35746d.m113258k(i13);
    }
}
