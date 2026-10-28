package io.sentry.util.thread;

/* JADX INFO: renamed from: io.sentry.util.thread.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20600c implements InterfaceC20598a {

    /* JADX INFO: renamed from: a */
    public static final long f77108a = Thread.currentThread().getId();

    /* JADX INFO: renamed from: b */
    public static final C20600c f77109b = new C20600c();

    /* JADX INFO: renamed from: d */
    public static C20600c m56728d() {
        return f77109b;
    }

    @Override // io.sentry.util.thread.InterfaceC20598a
    /* JADX INFO: renamed from: a */
    public final boolean mo55996a() {
        return f77108a == Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.InterfaceC20598a
    /* JADX INFO: renamed from: b */
    public final String mo55997b() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.InterfaceC20598a
    /* JADX INFO: renamed from: c */
    public final long mo55998c() {
        return Thread.currentThread().getId();
    }
}
