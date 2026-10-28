package io.sentry.util;

import io.sentry.C20535s;

/* JADX INFO: renamed from: io.sentry.util.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C20584f {

    /* JADX INFO: renamed from: b */
    public final InterfaceC20583e f77085b;

    /* JADX INFO: renamed from: a */
    public volatile Object f77084a = null;

    /* JADX INFO: renamed from: c */
    public final C20579a f77086c = new C20579a();

    public C20584f(InterfaceC20583e interfaceC20583e) {
        this.f77085b = interfaceC20583e;
    }

    /* JADX INFO: renamed from: a */
    public final Object m56714a() {
        if (this.f77084a == null) {
            C20535s c20535sM56711a = this.f77086c.m56711a();
            try {
                if (this.f77084a == null) {
                    this.f77084a = this.f77085b.mo19991j();
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
        return this.f77084a;
    }

    /* JADX INFO: renamed from: b */
    public final void m56715b() {
        C20535s c20535sM56711a = this.f77086c.m56711a();
        try {
            this.f77084a = null;
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

    /* JADX INFO: renamed from: c */
    public final void m56716c(Object obj) {
        C20535s c20535sM56711a = this.f77086c.m56711a();
        try {
            this.f77084a = obj;
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
