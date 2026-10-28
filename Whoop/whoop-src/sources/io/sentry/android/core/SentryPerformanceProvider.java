package io.sentry.android.core;

import aa3.C0627i1;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import hn.C17508p;
import io.sentry.C20351h5;
import io.sentry.C20369i2;
import io.sentry.C20414l7;
import io.sentry.C20458p4;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.android.core.internal.util.C20116q;
import io.sentry.android.core.performance.C20144g;
import io.sentry.util.C20579a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes5.dex */
public final class SentryPerformanceProvider extends AbstractC20133o0 {

    /* JADX INFO: renamed from: E */
    public static final long f75276E = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ int f75277F = 0;

    /* JADX INFO: renamed from: x */
    public Application f75278x;

    /* JADX INFO: renamed from: y */
    public final C20156t f75279y;

    /* JADX INFO: renamed from: z */
    public final C20121k0 f75280z;

    public SentryPerformanceProvider() {
        new C20579a();
        C20156t c20156t = new C20156t(3);
        this.f75279y = c20156t;
        this.f75280z = new C20121k0(c20156t);
    }

    /* JADX INFO: renamed from: a */
    public final void m55905a(Context context, C20458p4 c20458p4, C20144g c20144g) {
        boolean z4 = c20458p4.f76574I;
        C20156t c20156t = this.f75279y;
        if (!z4) {
            c20156t.mo16066m(EnumC20436n5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        C20079h c20079h = new C20079h(this.f75280z, new C20116q(context.getApplicationContext(), c20156t, this.f75280z), c20156t, c20458p4.f76570E, c20458p4.f76573H, new C17508p(new C20351h5(), 17));
        c20144g.f75665I = null;
        c20144g.f75666J = c20079h;
        c20156t.mo16066m(EnumC20436n5.DEBUG, "App start continuous profiling started.", new Object[0]);
        C20513q6 c20513q6Empty = C20513q6.empty();
        c20513q6Empty.setProfileSessionSampleRate(Double.valueOf(c20458p4.f76574I ? 1.0d : 0.0d));
        c20079h.mo55948b(c20458p4.f76577L, new C20414l7(c20513q6Empty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    /* JADX INFO: renamed from: b */
    public final void m55906b(Context context, C20458p4 c20458p4, C20144g c20144g) {
        boolean z4 = c20458p4.f76581y;
        C0627i1 c0627i1 = new C0627i1(Boolean.valueOf(z4), c20458p4.f76582z, (Double) null, Boolean.valueOf(c20458p4.f76579w), c20458p4.f76580x);
        c20144g.f75667K = c0627i1;
        boolean zBooleanValue = ((Boolean) c0627i1.f2198e).booleanValue();
        C20156t c20156t = this.f75279y;
        if (!zBooleanValue || !z4) {
            c20156t.mo16066m(EnumC20436n5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        C20351h5 c20351h5 = new C20351h5();
        C20159u c20159u = new C20159u(context, this.f75280z, new C20116q(context, c20156t, this.f75280z), c20156t, c20458p4.f76570E, c20458p4.f76571F, c20458p4.f76573H, new C17508p(c20351h5, 17));
        c20144g.f75666J = null;
        c20144g.f75665I = c20159u;
        c20156t.mo16066m(EnumC20436n5.DEBUG, "App start profiling started.", new Object[0]);
        c20159u.start();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C20144g c20144gM56042c = C20144g.m56042c();
        Context context = getContext();
        c20144gM56042c.f75661E.m56048c(f75276E);
        this.f75280z.getClass();
        c20144gM56042c.f75675z.m56048c(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.f75278x = (Application) context;
        }
        Application application = this.f75278x;
        if (application != null) {
            c20144gM56042c.m56045e(application);
        }
        Context context2 = getContext();
        C20156t c20156t = this.f75279y;
        if (context2 == null) {
            c20156t.mo16066m(EnumC20436n5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return true;
        }
        File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
        if (!file.exists() || !file.canRead()) {
            return true;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                C20458p4 c20458p4 = (C20458p4) new C20369i2(C20513q6.empty()).mo56239e(bufferedReader, C20458p4.class);
                if (c20458p4 == null) {
                    c20156t.mo16066m(EnumC20436n5.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                } else if (c20458p4.f76572G && c20458p4.f76576K) {
                    m55905a(context2, c20458p4, c20144gM56042c);
                } else if (!c20458p4.f76571F) {
                    c20156t.mo16066m(EnumC20436n5.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                } else if (c20458p4.f76575J) {
                    m55906b(context2, c20458p4, c20144gM56042c);
                }
                bufferedReader.close();
                return true;
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (FileNotFoundException e5) {
            c20156t.mo16060j(EnumC20436n5.ERROR, "App start profiling config file not found. ", e5);
            return true;
        } catch (Throwable th5) {
            c20156t.mo16060j(EnumC20436n5.ERROR, "Error reading app start profiling config file. ", th5);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        C20535s c20535sM56711a = C20144g.f75660R.m56711a();
        try {
            C20159u c20159u = C20144g.m56042c().f75665I;
            if (c20159u != null) {
                c20159u.close();
            }
            C20079h c20079h = C20144g.m56042c().f75666J;
            if (c20079h != null) {
                c20079h.mo55947a(true);
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
