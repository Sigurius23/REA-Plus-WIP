package io.seon.androidsdk.service;

import android.content.Context;
import android.util.Log;
import io.sentry.hints.C20363j;

/* JADX INFO: renamed from: io.seon.androidsdk.service.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20652c {

    /* JADX INFO: renamed from: a */
    public Context f77245a;

    /* JADX INFO: renamed from: b */
    public C20363j f77246b;

    /* JADX INFO: renamed from: c */
    public String f77247c;

    /* JADX INFO: renamed from: a */
    public final C20661f m56780a() {
        String str;
        if (this.f77245a == null || (str = this.f77247c) == null || str.isEmpty()) {
            Log.e("SEON", "Seon object should be configured first with a context and a session_id!");
        }
        return new C20661f(this.f77245a, this.f77247c, this.f77246b);
    }
}
