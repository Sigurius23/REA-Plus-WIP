package io.sentry.cache;

import io.sentry.C20513q6;
import io.sentry.InterfaceC20615w0;

/* JADX INFO: renamed from: io.sentry.cache.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C20282e implements InterfaceC20615w0 {

    /* JADX INFO: renamed from: a */
    public final C20513q6 f76163a;

    public C20282e(C20513q6 c20513q6) {
        this.f76163a = c20513q6;
    }

    /* JADX INFO: renamed from: a */
    public final void m56263a(String str) {
        AbstractC20278a.m56251a(this.f76163a, ".options-cache", str);
    }

    /* JADX INFO: renamed from: b */
    public final void m56264b(Object obj, String str) {
        AbstractC20278a.m56254d(this.f76163a, obj, ".options-cache", str);
    }
}
