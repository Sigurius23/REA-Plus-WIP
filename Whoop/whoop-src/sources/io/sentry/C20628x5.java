package io.sentry;

import java.util.Date;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: io.sentry.x5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20628x5 extends AbstractC20576u4 {

    /* JADX INFO: renamed from: w */
    public final Date f77176w;

    /* JADX INFO: renamed from: x */
    public final long f77177x;

    public C20628x5(Date date, long j7) {
        this.f77176w = date;
        this.f77177x = j7;
    }

    @Override // io.sentry.AbstractC20576u4, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(AbstractC20576u4 abstractC20576u4) {
        if (!(abstractC20576u4 instanceof C20628x5)) {
            return super.compareTo(abstractC20576u4);
        }
        C20628x5 c20628x5 = (C20628x5) abstractC20576u4;
        long time = this.f77176w.getTime();
        long time2 = c20628x5.f77176w.getTime();
        return time == time2 ? Long.valueOf(this.f77177x).compareTo(Long.valueOf(c20628x5.f77177x)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC20576u4
    /* JADX INFO: renamed from: b */
    public final long mo56692b(AbstractC20576u4 abstractC20576u4) {
        return abstractC20576u4 instanceof C20628x5 ? this.f77177x - ((C20628x5) abstractC20576u4).f77177x : super.mo56692b(abstractC20576u4);
    }

    @Override // io.sentry.AbstractC20576u4
    /* JADX INFO: renamed from: c */
    public final long mo56693c(AbstractC20576u4 abstractC20576u4) {
        if (abstractC20576u4 == null || !(abstractC20576u4 instanceof C20628x5)) {
            return super.mo56693c(abstractC20576u4);
        }
        C20628x5 c20628x5 = (C20628x5) abstractC20576u4;
        long j7 = c20628x5.f77177x;
        int iCompareTo = compareTo(abstractC20576u4);
        long j13 = this.f77177x;
        if (iCompareTo < 0) {
            return mo56606d() + (j7 - j13);
        }
        return c20628x5.mo56606d() + (j13 - j7);
    }

    @Override // io.sentry.AbstractC20576u4
    /* JADX INFO: renamed from: d */
    public final long mo56606d() {
        return this.f77176w.getTime() * 1000000;
    }

    public C20628x5() {
        this(AbstractC21598x.m60659O(), System.nanoTime());
    }
}
