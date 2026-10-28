package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.RunnableC1605m;
import io.sentry.C20535s;
import io.sentry.C20546t2;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.internal.util.C20104e;
import io.sentry.util.C20579a;
import java.io.Closeable;

/* JADX INFO: renamed from: io.sentry.android.core.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20071e0 implements Closeable {

    /* JADX INFO: renamed from: E */
    public static final C20071e0 f75391E = new C20071e0();

    /* JADX INFO: renamed from: x */
    public volatile C20068d0 f75393x;

    /* JADX INFO: renamed from: w */
    public final C20579a f75392w = new C20579a();

    /* JADX INFO: renamed from: y */
    public final C20121k0 f75394y = new C20121k0();

    /* JADX INFO: renamed from: z */
    public volatile Boolean f75395z = null;

    /* JADX INFO: renamed from: b */
    public final void m55941b(InterfaceC20060b0 interfaceC20060b0) {
        C20535s c20535sM56711a = this.f75392w.m56711a();
        try {
            m55943i(C20546t2.f76998w);
            if (this.f75393x != null) {
                this.f75393x.f75383w.add(interfaceC20060b0);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m55945m();
    }

    /* JADX INFO: renamed from: h */
    public final void m55942h(InterfaceC20602v0 interfaceC20602v0) {
        C20068d0 c20068d0 = this.f75393x;
        if (c20068d0 != null) {
            try {
                ProcessLifecycleOwner.f6173I.f6175F.mo4986a(c20068d0);
            } catch (Throwable th3) {
                this.f75393x = null;
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th3);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m55943i(InterfaceC20602v0 interfaceC20602v0) {
        if (this.f75393x != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f6173I;
            this.f75393x = new C20068d0(this);
            if (C20104e.f75528a.mo55996a()) {
                m55942h(interfaceC20602v0);
                return;
            }
            C20121k0 c20121k0 = this.f75394y;
            ((Handler) c20121k0.f75591a).post(new RunnableC1605m(11, this, interfaceC20602v0));
        } catch (ClassNotFoundException unused) {
            interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th3) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "AppState could not register lifecycle observer", th3);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m55944k(InterfaceC20060b0 interfaceC20060b0) {
        C20535s c20535sM56711a = this.f75392w.m56711a();
        try {
            if (this.f75393x != null) {
                this.f75393x.f75383w.remove(interfaceC20060b0);
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

    /* JADX INFO: renamed from: m */
    public final void m55945m() {
        if (this.f75393x == null) {
            return;
        }
        C20535s c20535sM56711a = this.f75392w.m56711a();
        try {
            C20068d0 c20068d0 = this.f75393x;
            this.f75393x.f75383w.clear();
            this.f75393x = null;
            c20535sM56711a.close();
            if (C20104e.f75528a.mo55996a()) {
                if (c20068d0 != null) {
                    ProcessLifecycleOwner.f6173I.f6175F.mo4988d(c20068d0);
                }
            } else {
                C20121k0 c20121k0 = this.f75394y;
                ((Handler) c20121k0.f75591a).post(new RunnableC20277c7(this, c20068d0));
            }
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
