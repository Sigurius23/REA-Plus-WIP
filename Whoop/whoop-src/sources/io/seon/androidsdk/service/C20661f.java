package io.seon.androidsdk.service;

import android.content.Context;
import io.sentry.hints.C20363j;
import io.seon.androidsdk.exception.BehaviouralMonitoringException;
import p037bu.C3632c;
import p474s.C31983m2;

/* JADX INFO: renamed from: io.seon.androidsdk.service.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C20661f implements InterfaceC20649b {

    /* JADX INFO: renamed from: a */
    public final C20672i1 f77292a;

    /* JADX INFO: renamed from: b */
    public final Context f77293b;

    /* JADX INFO: renamed from: c */
    public final C20663f1 f77294c;

    /* JADX INFO: renamed from: d */
    public String f77295d;

    /* JADX INFO: renamed from: e */
    public boolean f77296e = false;

    public C20661f(Context context, String str, C20363j c20363j) throws Throwable {
        this.f77293b = context;
        this.f77295d = str;
        C20663f1 c20663f1 = new C20663f1();
        c20663f1.f77300b = new JNIHandler();
        c20663f1.f77299a = context;
        if (context != null && !JNIHandler.f77219a) {
            C31983m2 c31983m2 = new C31983m2(12);
            C31983m2.m99477o("Beginning load of %s...", "seon");
            c31983m2.m99490n(context, "seon");
            JNIHandler.f77219a = true;
        }
        this.f77294c = c20663f1;
        C20672i1 c20672i1 = new C20672i1(this);
        this.f77292a = c20672i1;
        C3632c.f14787y = Boolean.FALSE;
        c20672i1.f77338b.f77361h.m56867i(c20363j);
    }

    /* JADX INFO: renamed from: a */
    public final Context m56796a() {
        return this.f77293b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m56797b() {
        return this.f77295d;
    }

    /* JADX INFO: renamed from: c */
    public final void m56798c() {
        C20672i1 c20672i1 = this.f77292a;
        c20672i1.getClass();
        try {
            c20672i1.f77343g.m56783c();
        } catch (Exception unused) {
        }
        this.f77296e = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m56799d(InterfaceC20655d interfaceC20655d) {
        if (!this.f77296e) {
            throw new BehaviouralMonitoringException("Failed to stop behaviour monitoring! There's no active behaviour monitoring running!");
        }
        this.f77292a.m56821e(this.f77295d, interfaceC20655d, Boolean.TRUE);
        this.f77296e = false;
    }
}
