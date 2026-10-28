package io.sentry;

import io.sentry.util.C20579a;

/* JADX INFO: renamed from: io.sentry.t4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20548t4 {

    /* JADX INFO: renamed from: d */
    public static final C20548t4 f77007d = new C20548t4();

    /* JADX INFO: renamed from: a */
    public boolean f77008a;

    /* JADX INFO: renamed from: b */
    public Boolean f77009b;

    /* JADX INFO: renamed from: c */
    public final C20579a f77010c = new C20579a();

    /* JADX INFO: renamed from: a */
    public final void m56674a(boolean z4) {
        C20535s c20535sM56711a = this.f77010c.m56711a();
        try {
            if (!this.f77008a) {
                this.f77009b = Boolean.valueOf(z4);
                this.f77008a = true;
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
