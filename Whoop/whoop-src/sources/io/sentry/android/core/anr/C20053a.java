package io.sentry.android.core.anr;

import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.android.core.anr.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20053a {

    /* JADX INFO: renamed from: a */
    public final int f75338a;

    /* JADX INFO: renamed from: b */
    public final float f75339b;

    /* JADX INFO: renamed from: c */
    public final StackTraceElement[] f75340c;

    /* JADX INFO: renamed from: d */
    public final int f75341d;

    /* JADX INFO: renamed from: e */
    public final int f75342e;

    /* JADX INFO: renamed from: f */
    public int f75343f = 1;

    /* JADX INFO: renamed from: g */
    public long f75344g;

    /* JADX INFO: renamed from: h */
    public long f75345h;

    public C20053a(StackTraceElement[] stackTraceElementArr, int i13, int i14, long j7, float f13) {
        this.f75340c = stackTraceElementArr;
        this.f75341d = i13;
        this.f75342e = i14;
        this.f75338a = (i14 - i13) + 1;
        this.f75344g = j7;
        this.f75345h = j7;
        this.f75339b = f13;
    }

    /* JADX INFO: renamed from: a */
    public final StackTraceElement[] m55918a() {
        return (StackTraceElement[]) Arrays.copyOfRange(this.f75340c, this.f75341d, this.f75342e + 1);
    }
}
