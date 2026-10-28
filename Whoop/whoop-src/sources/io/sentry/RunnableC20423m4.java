package io.sentry;

import aa3.C0627i1;
import ge3.AbstractC15751g;
import io.sentry.cache.C20282e;
import io.sentry.cache.C20283f;
import io.sentry.cache.tape.AbstractC20289f;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.EnumC20479g0;
import io.sentry.util.AbstractC20589k;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: renamed from: io.sentry.m4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC20423m4 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76502w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20513q6 f76503x;

    public /* synthetic */ RunnableC20423m4(C20513q6 c20513q6, int i13) {
        this.f76502w = i13;
        this.f76503x = c20513q6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f76502w) {
            case 0:
                this.f76503x.loadLazyFields();
                return;
            case 1:
                C20513q6 c20513q6 = this.f76503x;
                String cacheDirPathWithoutDsn = c20513q6.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        AbstractC15751g.m44465r(file);
                        if (c20513q6.isEnableAppStartProfiling() || c20513q6.isStartProfilerOnAppStart()) {
                            if (!c20513q6.isStartProfilerOnAppStart() && !c20513q6.isTracingEnabled()) {
                                c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                C20458p4 c20458p4 = new C20458p4(c20513q6, c20513q6.isEnableAppStartProfiling() ? c20513q6.getInternalTracesSampler().m56630a(new C20634y3(new C20426m7("app.launch", EnumC20479g0.CUSTOM, "profile", null), Double.valueOf(AbstractC20589k.m56722a().m56721c()))) : new C0627i1(Boolean.FALSE, (Double) null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC20445o4.f76536e));
                                    try {
                                        c20513q6.getSerializer().mo56235a(bufferedWriter, c20458p4);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } catch (Throwable th3) {
                                        try {
                                            bufferedWriter.close();
                                            break;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th5) {
                                    try {
                                        fileOutputStream.close();
                                        break;
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                    }
                                    throw th5;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th7) {
                        c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Unable to create app start profiling config file. ", th7);
                        return;
                    }
                }
                return;
            case 2:
                C20513q6 c20513q7 = this.f76503x;
                for (InterfaceC20615w0 interfaceC20615w0 : c20513q7.getOptionsObservers()) {
                    String release = c20513q7.getRelease();
                    C20282e c20282e = (C20282e) interfaceC20615w0;
                    if (release == null) {
                        c20282e.m56263a("release.json");
                    } else {
                        c20282e.m56264b(release, "release.json");
                    }
                    String proguardUuid = c20513q7.getProguardUuid();
                    if (proguardUuid == null) {
                        c20282e.m56263a("proguard-uuid.json");
                    } else {
                        c20282e.m56264b(proguardUuid, "proguard-uuid.json");
                    }
                    C20499t sdkVersion = c20513q7.getSdkVersion();
                    if (sdkVersion == null) {
                        c20282e.m56263a("sdk-version.json");
                    } else {
                        c20282e.m56264b(sdkVersion, "sdk-version.json");
                    }
                    String dist = c20513q7.getDist();
                    if (dist == null) {
                        c20282e.m56263a("dist.json");
                    } else {
                        c20282e.m56264b(dist, "dist.json");
                    }
                    String environment = c20513q7.getEnvironment();
                    if (environment == null) {
                        c20282e.m56263a("environment.json");
                    } else {
                        c20282e.m56264b(environment, "environment.json");
                    }
                    c20282e.m56264b(c20513q7.getTags(), "tags.json");
                    Double d3 = c20513q7.getSessionReplay().f77064f;
                    if (d3 == null) {
                        c20282e.m56263a("replay-error-sample-rate.json");
                    } else {
                        c20282e.m56264b(d3.toString(), "replay-error-sample-rate.json");
                    }
                }
                C20283f c20283fFindPersistingScopeObserver = c20513q7.findPersistingScopeObserver();
                if (c20283fFindPersistingScopeObserver != null) {
                    try {
                        ((AbstractC20289f) c20283fFindPersistingScopeObserver.f76166b.m56714a()).clear();
                        break;
                    } catch (IOException e5) {
                        c20283fFindPersistingScopeObserver.f76165a.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to clear breadcrumbs from file queue", e5);
                    }
                    c20283fFindPersistingScopeObserver.m56265a("user.json");
                    c20283fFindPersistingScopeObserver.m56265a("level.json");
                    c20283fFindPersistingScopeObserver.m56265a("request.json");
                    c20283fFindPersistingScopeObserver.m56265a("fingerprint.json");
                    c20283fFindPersistingScopeObserver.m56265a("contexts.json");
                    c20283fFindPersistingScopeObserver.m56265a("extras.json");
                    c20283fFindPersistingScopeObserver.m56265a("tags.json");
                    c20283fFindPersistingScopeObserver.m56265a("trace.json");
                    c20283fFindPersistingScopeObserver.m56265a("transaction.json");
                    return;
                }
                return;
            default:
                AbstractC20445o4.m56638b().mo56424d(this.f76503x.getFlushTimeoutMillis());
                return;
        }
    }
}
