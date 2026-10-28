package io.sentry.android.core;

import io.sentry.hints.InterfaceC20354a;
import io.sentry.hints.InterfaceC20365l;

/* JADX INFO: renamed from: io.sentry.android.core.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C20165w implements InterfaceC20354a, InterfaceC20365l {

    /* JADX INFO: renamed from: w */
    public final boolean f75760w;

    public C20165w(boolean z4) {
        this.f75760w = z4;
    }

    @Override // io.sentry.hints.InterfaceC20354a
    /* JADX INFO: renamed from: b */
    public final Long mo56081b() {
        return null;
    }

    @Override // io.sentry.hints.InterfaceC20354a
    /* JADX INFO: renamed from: c */
    public final boolean mo56082c() {
        return true;
    }

    @Override // io.sentry.hints.InterfaceC20354a
    /* JADX INFO: renamed from: d */
    public final String mo56083d() {
        return this.f75760w ? "anr_background" : "anr_foreground";
    }
}
