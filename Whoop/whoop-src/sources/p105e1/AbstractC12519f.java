package p105e1;

import d13.AbstractC11478a;
import p636y3.C39183o;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: e1.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12519f {

    /* JADX INFO: renamed from: a */
    public static final long f42753a = AbstractC35745c.m113246h(14);

    /* JADX INFO: renamed from: a */
    public static final long m35175a(long j7, long j13) {
        if (!C39183o.m124806d(j13)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) C39183o.m124807e(j13)) + '.');
        }
        if (C39183o.m124806d(j7)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) C39183o.m124807e(j13)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        long j14 = j7 & 1095216660480L;
        if (j14 != 0) {
            float fM124805c = C39183o.m124805c(j13);
            AbstractC35745c.m113242a(j7);
            return AbstractC35745c.m113248j(C39183o.m124805c(j7) * fM124805c, j14);
        }
        float fM124805c2 = C39183o.m124805c(j13);
        long j15 = f42753a;
        AbstractC35745c.m113242a(j15);
        return AbstractC11478a.m30852d(j15, 1095216660480L & j15, fM124805c2);
    }
}
