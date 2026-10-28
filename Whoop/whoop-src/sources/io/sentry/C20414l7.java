package io.sentry;

import aa3.C0627i1;
import p505ts.AbstractC34132o;
import p624xs.C38632a;
import yq1.C39711a;

/* JADX INFO: renamed from: io.sentry.l7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20414l7 {

    /* JADX INFO: renamed from: a */
    public final C20513q6 f76494a;

    public C20414l7(C20513q6 c20513q6) {
        this.f76494a = c20513q6;
    }

    /* JADX INFO: renamed from: a */
    public final C0627i1 m56630a(C20634y3 c20634y3) {
        Double dM127084f;
        Double d3 = c20634y3.f77187b;
        C20426m7 c20426m7 = c20634y3.f77186a;
        C0627i1 c0627i1 = c20426m7.f76324z;
        if (c0627i1 != null) {
            return AbstractC34132o.m107880d(c0627i1);
        }
        C20513q6 c20513q6 = this.f76494a;
        c20513q6.getProfilesSampler();
        Double profilesSampleRate = c20513q6.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d3.doubleValue());
        if (c20513q6.getTracesSampler() != null) {
            try {
                ((C38632a) c20513q6.getTracesSampler()).getClass();
                dM127084f = C39711a.m127084f(c20634y3);
            } catch (Throwable th3) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'TracesSamplerCallback' callback.", th3);
                dM127084f = null;
            }
            if (dM127084f != null) {
                return new C0627i1(Boolean.valueOf(dM127084f.doubleValue() >= d3.doubleValue()), dM127084f, d3, boolValueOf, profilesSampleRate);
            }
        }
        boolean z4 = false;
        C0627i1 c0627i2 = c20426m7.f76507R;
        if (c0627i2 != null) {
            return AbstractC34132o.m107880d(c0627i2);
        }
        Double tracesSampleRate = c20513q6.getTracesSampleRate();
        Double dValueOf = tracesSampleRate != null ? Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, c20513q6.getBackpressureMonitor().mo56223a())) : null;
        if (dValueOf == null) {
            Boolean bool = Boolean.FALSE;
            return new C0627i1(bool, (Double) null, d3, bool, (Double) null);
        }
        if (dValueOf.doubleValue() >= d3.doubleValue()) {
            z4 = true;
        }
        return new C0627i1(Boolean.valueOf(z4), dValueOf, d3, boolValueOf, profilesSampleRate);
    }
}
