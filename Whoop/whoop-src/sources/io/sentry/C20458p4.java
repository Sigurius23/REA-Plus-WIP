package io.sentry;

import aa3.C0627i1;
import ih0.AbstractC18489d0;
import io.sentry.util.AbstractC20589k;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.p4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20458p4 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76570E;

    /* JADX INFO: renamed from: F */
    public boolean f76571F;

    /* JADX INFO: renamed from: G */
    public boolean f76572G;

    /* JADX INFO: renamed from: H */
    public int f76573H;

    /* JADX INFO: renamed from: I */
    public boolean f76574I;

    /* JADX INFO: renamed from: J */
    public boolean f76575J;

    /* JADX INFO: renamed from: K */
    public boolean f76576K;

    /* JADX INFO: renamed from: L */
    public EnumC20518r3 f76577L;

    /* JADX INFO: renamed from: M */
    public ConcurrentHashMap f76578M;

    /* JADX INFO: renamed from: w */
    public boolean f76579w;

    /* JADX INFO: renamed from: x */
    public Double f76580x;

    /* JADX INFO: renamed from: y */
    public boolean f76581y;

    /* JADX INFO: renamed from: z */
    public Double f76582z;

    public C20458p4(C20513q6 c20513q6, C0627i1 c0627i1) {
        this.f76581y = ((Boolean) c0627i1.f2195b).booleanValue();
        this.f76582z = (Double) c0627i1.f2196c;
        this.f76579w = ((Boolean) c0627i1.f2198e).booleanValue();
        this.f76580x = (Double) c0627i1.f2199f;
        C20414l7 internalTracesSampler = c20513q6.getInternalTracesSampler();
        double dM56721c = AbstractC20589k.m56722a().m56721c();
        Double profileSessionSampleRate = internalTracesSampler.f76494a.getProfileSessionSampleRate();
        this.f76574I = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dM56721c;
        this.f76570E = c20513q6.getProfilingTracesDirPath();
        this.f76571F = c20513q6.isProfilingEnabled();
        this.f76572G = c20513q6.isContinuousProfilingEnabled();
        this.f76577L = c20513q6.getProfileLifecycle();
        this.f76573H = c20513q6.getProfilingTracesHz();
        this.f76575J = c20513q6.isEnableAppStartProfiling();
        this.f76576K = c20513q6.isStartProfilerOnAppStart();
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("profile_sampled");
        c37199o.m119219Y(interfaceC20602v0, Boolean.valueOf(this.f76579w));
        c37199o.m119207K("profile_sample_rate");
        c37199o.m119219Y(interfaceC20602v0, this.f76580x);
        c37199o.m119207K("continuous_profile_sampled");
        c37199o.m119219Y(interfaceC20602v0, Boolean.valueOf(this.f76574I));
        c37199o.m119207K("trace_sampled");
        c37199o.m119219Y(interfaceC20602v0, Boolean.valueOf(this.f76581y));
        c37199o.m119207K("trace_sample_rate");
        c37199o.m119219Y(interfaceC20602v0, this.f76582z);
        c37199o.m119207K("profiling_traces_dir_path");
        c37199o.m119219Y(interfaceC20602v0, this.f76570E);
        c37199o.m119207K("is_profiling_enabled");
        c37199o.m119219Y(interfaceC20602v0, Boolean.valueOf(this.f76571F));
        c37199o.m119207K("is_continuous_profiling_enabled");
        c37199o.m119219Y(interfaceC20602v0, Boolean.valueOf(this.f76572G));
        c37199o.m119207K("profile_lifecycle");
        c37199o.m119219Y(interfaceC20602v0, this.f76577L.name());
        c37199o.m119207K("profiling_traces_hz");
        c37199o.m119219Y(interfaceC20602v0, Integer.valueOf(this.f76573H));
        c37199o.m119207K("is_enable_app_start_profiling");
        c37199o.m119219Y(interfaceC20602v0, Boolean.valueOf(this.f76575J));
        c37199o.m119207K("is_start_profiler_on_app_start");
        c37199o.m119219Y(interfaceC20602v0, Boolean.valueOf(this.f76576K));
        ConcurrentHashMap concurrentHashMap = this.f76578M;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76578M, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
