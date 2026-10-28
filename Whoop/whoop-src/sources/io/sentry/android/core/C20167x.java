package io.sentry.android.core;

import io.sentry.InterfaceC20602v0;
import io.sentry.hints.AbstractC20356c;
import io.sentry.hints.InterfaceC20354a;
import io.sentry.hints.InterfaceC20355b;
import io.sentry.protocol.C20501v;

/* JADX INFO: renamed from: io.sentry.android.core.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C20167x extends AbstractC20356c implements InterfaceC20355b, InterfaceC20354a {

    /* JADX INFO: renamed from: E */
    public final boolean f75763E;

    /* JADX INFO: renamed from: F */
    public final boolean f75764F;

    /* JADX INFO: renamed from: z */
    public final long f75765z;

    public C20167x(long j7, InterfaceC20602v0 interfaceC20602v0, long j13, boolean z4, boolean z13) {
        super(j7, interfaceC20602v0);
        this.f75765z = j13;
        this.f75763E = z4;
        this.f75764F = z13;
    }

    @Override // io.sentry.hints.InterfaceC20355b
    /* JADX INFO: renamed from: a */
    public final boolean mo56062a() {
        return this.f75763E;
    }

    @Override // io.sentry.hints.InterfaceC20354a
    /* JADX INFO: renamed from: b */
    public final Long mo56081b() {
        return Long.valueOf(this.f75765z);
    }

    @Override // io.sentry.hints.InterfaceC20354a
    /* JADX INFO: renamed from: c */
    public final boolean mo56082c() {
        return false;
    }

    @Override // io.sentry.hints.InterfaceC20354a
    /* JADX INFO: renamed from: d */
    public final String mo56083d() {
        return this.f75764F ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.AbstractC20356c
    /* JADX INFO: renamed from: f */
    public final boolean mo56063f(C20501v c20501v) {
        return true;
    }

    @Override // io.sentry.hints.AbstractC20356c
    /* JADX INFO: renamed from: g */
    public final void mo56064g(C20501v c20501v) {
    }
}
