package io.sentry;

import aa3.C0627i1;
import ad3.C0783z;
import androidx.core.app.NotificationCompat;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import ih0.AbstractC18489d0;
import io.sentry.protocol.C20501v;
import io.sentry.util.AbstractC20591m;
import io.sentry.util.thread.InterfaceC20598a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p098dt.AbstractC12350b;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.e7 */
/* JADX INFO: loaded from: classes5.dex */
public class C20323e7 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public final String f76310E;

    /* JADX INFO: renamed from: F */
    public String f76311F;

    /* JADX INFO: renamed from: G */
    public EnumC20374i7 f76312G;

    /* JADX INFO: renamed from: H */
    public ConcurrentHashMap f76313H;

    /* JADX INFO: renamed from: I */
    public String f76314I;

    /* JADX INFO: renamed from: J */
    public Map f76315J;

    /* JADX INFO: renamed from: K */
    public ConcurrentHashMap f76316K;

    /* JADX INFO: renamed from: L */
    public EnumC20537s1 f76317L;

    /* JADX INFO: renamed from: M */
    public C20269c f76318M;

    /* JADX INFO: renamed from: N */
    public final C0783z f76319N;

    /* JADX INFO: renamed from: O */
    public final C20501v f76320O;

    /* JADX INFO: renamed from: w */
    public final C20501v f76321w;

    /* JADX INFO: renamed from: x */
    public final C20353h7 f76322x;

    /* JADX INFO: renamed from: y */
    public final C20353h7 f76323y;

    /* JADX INFO: renamed from: z */
    public transient C0627i1 f76324z;

    public C20323e7(C20501v c20501v, C20353h7 c20353h7, String str, C20353h7 c20353h8) {
        this(c20501v, c20353h7, c20353h8, str, null, null, null, "manual");
    }

    /* JADX INFO: renamed from: a */
    public final void m56484a(C0627i1 c0627i1) {
        this.f76324z = c0627i1;
        C20269c c20269c = this.f76318M;
        if (c20269c == null || c0627i1 == null) {
            return;
        }
        Boolean bool = (Boolean) c0627i1.f2195b;
        Charset charset = AbstractC20591m.f77097a;
        c20269c.m56227c("sentry-sampled", bool == null ? null : bool.toString());
        Double d3 = (Double) c0627i1.f2197d;
        if (d3 != null && c20269c.f76118f) {
            c20269c.f76116d = d3;
        }
        Double d14 = (Double) c0627i1.f2196c;
        if (d14 != null) {
            c20269c.f76115c = d14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20323e7)) {
            return false;
        }
        C20323e7 c20323e7 = (C20323e7) obj;
        return this.f76321w.equals(c20323e7.f76321w) && this.f76322x.equals(c20323e7.f76322x) && AbstractC29125c.m88542s(this.f76323y, c20323e7.f76323y) && this.f76310E.equals(c20323e7.f76310E) && AbstractC29125c.m88542s(this.f76311F, c20323e7.f76311F) && this.f76312G == c20323e7.f76312G;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76321w, this.f76322x, this.f76323y, this.f76310E, this.f76311F, this.f76312G});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("trace_id");
        this.f76321w.serialize(c37199o, interfaceC20602v0);
        c37199o.m119207K("span_id");
        this.f76322x.serialize(c37199o, interfaceC20602v0);
        C20353h7 c20353h7 = this.f76323y;
        if (c20353h7 != null) {
            c37199o.m119207K("parent_span_id");
            c20353h7.serialize(c37199o, interfaceC20602v0);
        }
        c37199o.m119207K("op");
        c37199o.m119222b0(this.f76310E);
        if (this.f76311F != null) {
            c37199o.m119207K("description");
            c37199o.m119222b0(this.f76311F);
        }
        if (this.f76312G != null) {
            c37199o.m119207K(NotificationCompat.CATEGORY_STATUS);
            c37199o.m119219Y(interfaceC20602v0, this.f76312G);
        }
        if (this.f76314I != null) {
            c37199o.m119207K(AnalyticsRequestV2.HEADER_ORIGIN);
            c37199o.m119219Y(interfaceC20602v0, this.f76314I);
        }
        if (!this.f76313H.isEmpty()) {
            c37199o.m119207K("tags");
            c37199o.m119219Y(interfaceC20602v0, this.f76313H);
        }
        if (!this.f76315J.isEmpty()) {
            c37199o.m119207K("data");
            c37199o.m119219Y(interfaceC20602v0, this.f76315J);
        }
        ConcurrentHashMap concurrentHashMap = this.f76316K;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76316K, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }

    public C20323e7(C20501v c20501v, C20353h7 c20353h7, C20353h7 c20353h8, String str, String str2, C0627i1 c0627i1, EnumC20374i7 enumC20374i7, String str3) {
        this.f76313H = new ConcurrentHashMap();
        this.f76314I = "manual";
        this.f76315J = new ConcurrentHashMap();
        this.f76317L = EnumC20537s1.SENTRY;
        this.f76319N = new C0783z(18);
        this.f76320O = C20501v.f76802x;
        AbstractC29125c.m88510S(c20501v, "traceId is required");
        this.f76321w = c20501v;
        AbstractC29125c.m88510S(c20353h7, "spanId is required");
        this.f76322x = c20353h7;
        AbstractC29125c.m88510S(str, "operation is required");
        this.f76310E = str;
        this.f76323y = c20353h8;
        this.f76311F = str2;
        this.f76312G = enumC20374i7;
        this.f76314I = str3;
        m56484a(c0627i1);
        InterfaceC20598a threadChecker = AbstractC20445o4.m56638b().mo56432l().getThreadChecker();
        this.f76315J.put("thread.id", String.valueOf(threadChecker.mo55998c()));
        this.f76315J.put("thread.name", threadChecker.mo55997b());
    }

    public C20323e7(C20323e7 c20323e7) {
        this.f76313H = new ConcurrentHashMap();
        this.f76314I = "manual";
        this.f76315J = new ConcurrentHashMap();
        this.f76317L = EnumC20537s1.SENTRY;
        this.f76319N = new C0783z(18);
        this.f76320O = C20501v.f76802x;
        this.f76321w = c20323e7.f76321w;
        this.f76322x = c20323e7.f76322x;
        this.f76323y = c20323e7.f76323y;
        m56484a(c20323e7.f76324z);
        this.f76310E = c20323e7.f76310E;
        this.f76311F = c20323e7.f76311F;
        this.f76312G = c20323e7.f76312G;
        ConcurrentHashMap concurrentHashMapM34553B = AbstractC12350b.m34553B(c20323e7.f76313H);
        if (concurrentHashMapM34553B != null) {
            this.f76313H = concurrentHashMapM34553B;
        }
        ConcurrentHashMap concurrentHashMapM34553B2 = AbstractC12350b.m34553B(c20323e7.f76316K);
        if (concurrentHashMapM34553B2 != null) {
            this.f76316K = concurrentHashMapM34553B2;
        }
        this.f76318M = c20323e7.f76318M;
        ConcurrentHashMap concurrentHashMapM34553B3 = AbstractC12350b.m34553B(c20323e7.f76315J);
        if (concurrentHashMapM34553B3 != null) {
            this.f76315J = concurrentHashMapM34553B3;
        }
    }
}
