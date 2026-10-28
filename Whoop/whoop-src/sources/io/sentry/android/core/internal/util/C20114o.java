package io.sentry.android.core.internal.util;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C20114o implements Comparable {

    /* JADX INFO: renamed from: w */
    public final long f75559w;

    /* JADX INFO: renamed from: x */
    public final long f75560x;

    public C20114o(long j7, long j13) {
        this.f75559w = j7;
        this.f75560x = j13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C20114o c20114o = (C20114o) obj;
        int iCompare = Long.compare(this.f75560x, c20114o.f75560x);
        return iCompare != 0 ? iCompare : Long.compare(this.f75559w, c20114o.f75559w);
    }
}
