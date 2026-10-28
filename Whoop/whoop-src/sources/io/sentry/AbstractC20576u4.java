package io.sentry;

/* JADX INFO: renamed from: io.sentry.u4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20576u4 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC20576u4 abstractC20576u4) {
        return Long.valueOf(mo56606d()).compareTo(Long.valueOf(abstractC20576u4.mo56606d()));
    }

    /* JADX INFO: renamed from: b */
    public long mo56692b(AbstractC20576u4 abstractC20576u4) {
        return mo56606d() - abstractC20576u4.mo56606d();
    }

    /* JADX INFO: renamed from: c */
    public long mo56693c(AbstractC20576u4 abstractC20576u4) {
        return (abstractC20576u4 == null || compareTo(abstractC20576u4) >= 0) ? mo56606d() : abstractC20576u4.mo56606d();
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo56606d();
}
