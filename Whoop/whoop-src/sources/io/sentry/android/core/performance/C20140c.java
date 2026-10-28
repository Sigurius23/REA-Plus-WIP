package io.sentry.android.core.performance;

/* JADX INFO: renamed from: io.sentry.android.core.performance.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20140c implements Comparable {

    /* JADX INFO: renamed from: w */
    public final C20145h f75653w = new C20145h();

    /* JADX INFO: renamed from: x */
    public final C20145h f75654x = new C20145h();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C20140c c20140c = (C20140c) obj;
        int iCompare = Long.compare(this.f75653w.f75678y, c20140c.f75653w.f75678y);
        return iCompare == 0 ? Long.compare(this.f75654x.f75678y, c20140c.f75654x.f75678y) : iCompare;
    }
}
