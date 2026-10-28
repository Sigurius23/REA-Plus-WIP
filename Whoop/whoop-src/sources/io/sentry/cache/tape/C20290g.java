package io.sentry.cache.tape;

import ih0.AbstractC18489d0;

/* JADX INFO: renamed from: io.sentry.cache.tape.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C20290g {

    /* JADX INFO: renamed from: c */
    public static final C20290g f76170c = new C20290g(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f76171a;

    /* JADX INFO: renamed from: b */
    public final int f76172b;

    public C20290g(long j7, int i13) {
        this.f76171a = j7;
        this.f76172b = i13;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C20290g.class.getSimpleName());
        sb4.append("[position=");
        sb4.append(this.f76171a);
        sb4.append(", length=");
        return AbstractC18489d0.m53371l(sb4, this.f76172b, "]");
    }
}
