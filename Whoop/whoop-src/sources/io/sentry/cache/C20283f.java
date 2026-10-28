package io.sentry.cache;

import androidx.lifecycle.RunnableC1605m;
import androidx.lifecycle.RunnableC1645z0;
import com.whoop.data.repositories.C6656c;
import io.sentry.AbstractC20329f4;
import io.sentry.C20274c4;
import io.sentry.C20315e;
import io.sentry.C20323e7;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.android.core.RunnableC20151r0;
import io.sentry.cache.tape.AbstractC20289f;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20584f;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import p185h6.RunnableC16957l;

/* JADX INFO: renamed from: io.sentry.cache.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C20283f extends AbstractC20329f4 {

    /* JADX INFO: renamed from: c */
    public static final Charset f76164c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C20513q6 f76165a;

    /* JADX INFO: renamed from: b */
    public final C20584f f76166b = new C20584f(new C6656c(this, 12));

    public C20283f(C20513q6 c20513q6) {
        this.f76165a = c20513q6;
    }

    /* JADX INFO: renamed from: a */
    public final void m56265a(String str) {
        AbstractC20278a.m56251a(this.f76165a, ".scope-cache", str);
    }

    /* JADX INFO: renamed from: d */
    public final Object m56266d(C20513q6 c20513q6, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return AbstractC20278a.m56253c(c20513q6, ".scope-cache", str, cls);
        }
        try {
            return cls.cast(((AbstractC20289f) this.f76166b.m56714a()).m56272F0());
        } catch (IOException unused) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: e */
    public final void mo56089e(C20481h0 c20481h0) {
        m56267f(new RunnableC1605m(17, this, c20481h0));
    }

    /* JADX INFO: renamed from: f */
    public final void m56267f(Runnable runnable) {
        C20513q6 c20513q6 = this.f76165a;
        if (c20513q6.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th3) {
                    c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Serialization task failed", th3);
                    return;
                }
            }
            try {
                c20513q6.getExecutorService().submit(new RunnableC1605m(22, this, runnable));
            } catch (Throwable th4) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Serialization task could not be scheduled", th4);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m56268g(Object obj, String str) {
        AbstractC20278a.m56254d(this.f76165a, obj, ".scope-cache", str);
    }

    @Override // io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: h */
    public final void mo56090h(C20315e c20315e) {
        m56267f(new RunnableC1605m(19, this, c20315e));
    }

    @Override // io.sentry.AbstractC20329f4, io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: i */
    public final void mo56230i(Collection collection) {
        if (collection.isEmpty()) {
            m56267f(new RunnableC1645z0(this, 12));
        }
    }

    @Override // io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: j */
    public final void mo56091j(C20323e7 c20323e7, C20274c4 c20274c4) {
        m56267f(new RunnableC16957l(this, c20323e7, c20274c4, 3));
    }

    @Override // io.sentry.AbstractC20329f4, io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: k */
    public final void mo56231k(C20470c c20470c) {
        m56267f(new RunnableC1605m(20, this, c20470c));
    }

    @Override // io.sentry.AbstractC20329f4, io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: m */
    public final void mo56232m(ConcurrentHashMap concurrentHashMap) {
        m56267f(new RunnableC1605m(18, this, concurrentHashMap));
    }

    @Override // io.sentry.AbstractC20329f4, io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: n */
    public final void mo56233n(String str) {
        m56267f(new RunnableC1605m(21, this, str));
    }

    @Override // io.sentry.AbstractC20329f4, io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: t */
    public final void mo56234t(C20501v c20501v) {
        m56267f(new RunnableC20151r0(6, this, c20501v));
    }
}
