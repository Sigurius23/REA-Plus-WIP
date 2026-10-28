package com.google.crypto.tink.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C5118w {

    /* JADX INFO: renamed from: b */
    public static final C5118w f21467b = new C5118w();

    /* JADX INFO: renamed from: c */
    public static final C5117v f21468c = new C5117v();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f21469a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final C5117v m16084a() {
        C5117v c5117v = (C5117v) this.f21469a.get();
        return c5117v == null ? f21468c : c5117v;
    }
}
