package io.sentry;

import io.sentry.config.C20302b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20307d0 {

    /* JADX INFO: renamed from: B */
    public Boolean f76213B;

    /* JADX INFO: renamed from: C */
    public Boolean f76214C;

    /* JADX INFO: renamed from: D */
    public Boolean f76215D;

    /* JADX INFO: renamed from: E */
    public Boolean f76216E;

    /* JADX INFO: renamed from: F */
    public Boolean f76217F;

    /* JADX INFO: renamed from: G */
    public String f76218G;

    /* JADX INFO: renamed from: H */
    public List f76219H;

    /* JADX INFO: renamed from: I */
    public List f76220I;

    /* JADX INFO: renamed from: J */
    public Boolean f76221J;

    /* JADX INFO: renamed from: K */
    public Boolean f76222K;

    /* JADX INFO: renamed from: L */
    public Boolean f76223L;

    /* JADX INFO: renamed from: M */
    public Boolean f76224M;

    /* JADX INFO: renamed from: N */
    public Boolean f76225N;

    /* JADX INFO: renamed from: O */
    public Boolean f76226O;

    /* JADX INFO: renamed from: P */
    public Boolean f76227P;

    /* JADX INFO: renamed from: Q */
    public Boolean f76228Q;

    /* JADX INFO: renamed from: R */
    public Boolean f76229R;

    /* JADX INFO: renamed from: S */
    public Double f76230S;

    /* JADX INFO: renamed from: T */
    public String f76231T;

    /* JADX INFO: renamed from: U */
    public EnumC20518r3 f76232U;

    /* JADX INFO: renamed from: V */
    public Boolean f76233V;

    /* JADX INFO: renamed from: W */
    public String f76234W;

    /* JADX INFO: renamed from: X */
    public C20343g6 f76235X;

    /* JADX INFO: renamed from: a */
    public String f76236a;

    /* JADX INFO: renamed from: b */
    public String f76237b;

    /* JADX INFO: renamed from: c */
    public String f76238c;

    /* JADX INFO: renamed from: d */
    public String f76239d;

    /* JADX INFO: renamed from: e */
    public String f76240e;

    /* JADX INFO: renamed from: f */
    public Boolean f76241f;

    /* JADX INFO: renamed from: g */
    public Boolean f76242g;

    /* JADX INFO: renamed from: h */
    public Boolean f76243h;

    /* JADX INFO: renamed from: i */
    public Double f76244i;

    /* JADX INFO: renamed from: j */
    public Double f76245j;

    /* JADX INFO: renamed from: k */
    public Double f76246k;

    /* JADX INFO: renamed from: l */
    public EnumC20447o6 f76247l;

    /* JADX INFO: renamed from: n */
    public C20437n6 f76249n;

    /* JADX INFO: renamed from: s */
    public String f76254s;

    /* JADX INFO: renamed from: t */
    public Long f76255t;

    /* JADX INFO: renamed from: u */
    public Long f76256u;

    /* JADX INFO: renamed from: v */
    public Long f76257v;

    /* JADX INFO: renamed from: x */
    public List f76259x;

    /* JADX INFO: renamed from: y */
    public Boolean f76260y;

    /* JADX INFO: renamed from: z */
    public Boolean f76261z;

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap f76248m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: o */
    public final CopyOnWriteArrayList f76250o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList f76251p = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: q */
    public CopyOnWriteArrayList f76252q = null;

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArrayList f76253r = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public final CopyOnWriteArraySet f76258w = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: A */
    public final CopyOnWriteArraySet f76212A = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public static C20307d0 m56365a(C20302b c20302b, InterfaceC20602v0 interfaceC20602v0) {
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        C20307d0 c20307d0 = new C20307d0();
        c20307d0.f76236a = c20302b.getProperty("dsn");
        c20307d0.f76237b = c20302b.getProperty("environment");
        c20307d0.f76238c = c20302b.getProperty("release");
        c20307d0.f76239d = c20302b.getProperty("dist");
        c20307d0.f76240e = c20302b.getProperty("servername");
        c20307d0.f76241f = c20302b.getBooleanProperty("uncaught.handler.enabled");
        c20307d0.f76260y = c20302b.getBooleanProperty("uncaught.handler.print-stacktrace");
        String property = c20302b.getProperty("sample-rate");
        Double dValueOf4 = null;
        if (property != null) {
            try {
                dValueOf = Double.valueOf(property);
            } catch (NumberFormatException unused) {
                dValueOf = null;
            }
        } else {
            dValueOf = null;
        }
        c20307d0.f76244i = dValueOf;
        String property2 = c20302b.getProperty("traces-sample-rate");
        if (property2 != null) {
            try {
                dValueOf2 = Double.valueOf(property2);
            } catch (NumberFormatException unused2) {
                dValueOf2 = null;
            }
        } else {
            dValueOf2 = null;
        }
        c20307d0.f76245j = dValueOf2;
        String property3 = c20302b.getProperty("profiles-sample-rate");
        if (property3 != null) {
            try {
                dValueOf3 = Double.valueOf(property3);
            } catch (NumberFormatException unused3) {
                dValueOf3 = null;
            }
        } else {
            dValueOf3 = null;
        }
        c20307d0.f76246k = dValueOf3;
        c20307d0.f76242g = c20302b.getBooleanProperty("debug");
        c20307d0.f76243h = c20302b.getBooleanProperty("enable-deduplication");
        c20307d0.f76261z = c20302b.getBooleanProperty("send-client-reports");
        c20307d0.f76228Q = c20302b.getBooleanProperty("force-init");
        String property4 = c20302b.getProperty("max-request-body-size");
        if (property4 != null) {
            c20307d0.f76247l = EnumC20447o6.valueOf(property4.toUpperCase(Locale.ROOT));
        }
        for (Map.Entry entry : ((ConcurrentHashMap) c20302b.mo56359b()).entrySet()) {
            c20307d0.f76248m.put((String) entry.getKey(), (String) entry.getValue());
        }
        String property5 = c20302b.getProperty("proxy.host");
        String property6 = c20302b.getProperty("proxy.user");
        String property7 = c20302b.getProperty("proxy.pass");
        String property8 = c20302b.getProperty("proxy.port");
        if (property8 == null) {
            property8 = "80";
        }
        if (property5 != null) {
            C20437n6 c20437n6 = new C20437n6();
            c20437n6.f76514a = property5;
            c20437n6.f76515b = property8;
            c20437n6.f76516c = property6;
            c20437n6.f76517d = property7;
            c20307d0.f76249n = c20437n6;
        }
        Iterator it = c20302b.m56362c("in-app-includes").iterator();
        while (it.hasNext()) {
            c20307d0.f76251p.add((String) it.next());
        }
        Iterator it3 = c20302b.m56362c("in-app-excludes").iterator();
        while (it3.hasNext()) {
            c20307d0.f76250o.add((String) it3.next());
        }
        List<String> listM56362c = c20302b.getProperty("trace-propagation-targets") != null ? c20302b.m56362c("trace-propagation-targets") : null;
        if (listM56362c == null && c20302b.getProperty("tracing-origins") != null) {
            listM56362c = c20302b.m56362c("tracing-origins");
        }
        if (listM56362c != null) {
            for (String str : listM56362c) {
                if (c20307d0.f76252q == null) {
                    c20307d0.f76252q = new CopyOnWriteArrayList();
                }
                if (!str.isEmpty()) {
                    c20307d0.f76252q.add(str);
                }
            }
        }
        Iterator it4 = c20302b.m56362c("context-tags").iterator();
        while (it4.hasNext()) {
            c20307d0.f76253r.add((String) it4.next());
        }
        c20307d0.f76254s = c20302b.getProperty("proguard-uuid");
        Iterator it5 = c20302b.m56362c("bundle-ids").iterator();
        while (it5.hasNext()) {
            c20307d0.f76212A.add((String) it5.next());
        }
        c20307d0.f76255t = c20302b.m56361a("idle-timeout");
        c20307d0.f76256u = c20302b.m56361a("shutdown-timeout-millis");
        c20307d0.f76257v = c20302b.m56361a("session-flush-timeout-millis");
        String property9 = c20302b.getProperty("ignored-errors");
        c20307d0.f76259x = property9 != null ? Arrays.asList(property9.split(",")) : null;
        c20307d0.f76213B = c20302b.getBooleanProperty("enabled");
        c20307d0.f76214C = c20302b.getBooleanProperty("enable-pretty-serialization-output");
        c20307d0.f76221J = c20302b.getBooleanProperty("send-modules");
        c20307d0.f76222K = c20302b.getBooleanProperty("send-default-pii");
        String property10 = c20302b.getProperty("ignored-checkins");
        c20307d0.f76219H = property10 != null ? Arrays.asList(property10.split(",")) : null;
        String property11 = c20302b.getProperty("ignored-transactions");
        c20307d0.f76220I = property11 != null ? Arrays.asList(property11.split(",")) : null;
        c20307d0.f76223L = c20302b.getBooleanProperty("enable-backpressure-handling");
        c20307d0.f76224M = c20302b.getBooleanProperty("enable-database-transaction-tracing");
        c20307d0.f76225N = c20302b.getBooleanProperty("enable-cache-tracing");
        c20307d0.f76226O = c20302b.getBooleanProperty("enable-queue-tracing");
        c20307d0.f76227P = c20302b.getBooleanProperty("global-hub-mode");
        c20307d0.f76229R = c20302b.getBooleanProperty("capture-open-telemetry-events");
        c20307d0.f76216E = c20302b.getBooleanProperty("logs.enabled");
        c20307d0.f76217F = c20302b.getBooleanProperty("metrics.enabled");
        for (String str2 : c20302b.m56362c("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str2);
                if (Throwable.class.isAssignableFrom(cls)) {
                    c20307d0.f76258w.add(cls);
                } else {
                    interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str2, str2);
                }
            } catch (ClassNotFoundException unused4) {
                interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str2, str2);
            }
        }
        Long lM56361a = c20302b.m56361a("cron.default-checkin-margin");
        Long lM56361a2 = c20302b.m56361a("cron.default-max-runtime");
        String property12 = c20302b.getProperty("cron.default-timezone");
        Long lM56361a3 = c20302b.m56361a("cron.default-failure-issue-threshold");
        Long lM56361a4 = c20302b.m56361a("cron.default-recovery-threshold");
        if (lM56361a != null || lM56361a2 != null || property12 != null || lM56361a3 != null || lM56361a4 != null) {
            C20343g6 c20343g6 = new C20343g6();
            c20343g6.f76361a = lM56361a;
            c20343g6.f76362b = lM56361a2;
            c20343g6.f76363c = property12;
            c20343g6.f76364d = lM56361a3;
            c20343g6.f76365e = lM56361a4;
            c20307d0.f76235X = c20343g6;
        }
        c20307d0.f76233V = c20302b.getBooleanProperty("enable-strict-trace-continuation");
        c20307d0.f76234W = c20302b.getProperty("org-id");
        c20307d0.f76215D = c20302b.getBooleanProperty("enable-spotlight");
        c20307d0.f76218G = c20302b.getProperty("spotlight-connection-url");
        String property13 = c20302b.getProperty("profile-session-sample-rate");
        if (property13 != null) {
            try {
                dValueOf4 = Double.valueOf(property13);
            } catch (NumberFormatException unused5) {
            }
        }
        c20307d0.f76230S = dValueOf4;
        c20307d0.f76231T = c20302b.getProperty("profiling-traces-dir-path");
        String property14 = c20302b.getProperty("profile-lifecycle");
        if (property14 != null && !property14.isEmpty()) {
            c20307d0.f76232U = EnumC20518r3.valueOf(property14.toUpperCase());
        }
        return c20307d0;
    }

    /* JADX INFO: renamed from: A */
    public final String m56366A() {
        return this.f76238c;
    }

    /* JADX INFO: renamed from: B */
    public final Double m56367B() {
        return this.f76244i;
    }

    /* JADX INFO: renamed from: C */
    public final Boolean m56368C() {
        return this.f76261z;
    }

    /* JADX INFO: renamed from: D */
    public final String m56369D() {
        return this.f76240e;
    }

    /* JADX INFO: renamed from: E */
    public final Long m56370E() {
        return this.f76257v;
    }

    /* JADX INFO: renamed from: F */
    public final Long m56371F() {
        return this.f76256u;
    }

    /* JADX INFO: renamed from: G */
    public final String m56372G() {
        return this.f76218G;
    }

    /* JADX INFO: renamed from: H */
    public final ConcurrentHashMap m56373H() {
        return this.f76248m;
    }

    /* JADX INFO: renamed from: I */
    public final List m56374I() {
        return this.f76252q;
    }

    /* JADX INFO: renamed from: J */
    public final Double m56375J() {
        return this.f76245j;
    }

    /* JADX INFO: renamed from: K */
    public final Boolean m56376K() {
        return this.f76229R;
    }

    /* JADX INFO: renamed from: L */
    public final Boolean m56377L() {
        return this.f76223L;
    }

    /* JADX INFO: renamed from: M */
    public final Boolean m56378M() {
        return this.f76225N;
    }

    /* JADX INFO: renamed from: N */
    public final Boolean m56379N() {
        return this.f76224M;
    }

    /* JADX INFO: renamed from: O */
    public final Boolean m56380O() {
        return this.f76216E;
    }

    /* JADX INFO: renamed from: P */
    public final Boolean m56381P() {
        return this.f76217F;
    }

    /* JADX INFO: renamed from: Q */
    public final Boolean m56382Q() {
        return this.f76214C;
    }

    /* JADX INFO: renamed from: R */
    public final Boolean m56383R() {
        return this.f76226O;
    }

    /* JADX INFO: renamed from: S */
    public final Boolean m56384S() {
        return this.f76215D;
    }

    /* JADX INFO: renamed from: T */
    public final Boolean m56385T() {
        return this.f76213B;
    }

    /* JADX INFO: renamed from: U */
    public final Boolean m56386U() {
        return this.f76228Q;
    }

    /* JADX INFO: renamed from: V */
    public final Boolean m56387V() {
        return this.f76227P;
    }

    /* JADX INFO: renamed from: W */
    public final Boolean m56388W() {
        return this.f76222K;
    }

    /* JADX INFO: renamed from: X */
    public final Boolean m56389X() {
        return this.f76221J;
    }

    /* JADX INFO: renamed from: Y */
    public final Boolean m56390Y() {
        return this.f76233V;
    }

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArraySet m56391b() {
        return this.f76212A;
    }

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList m56392c() {
        return this.f76253r;
    }

    /* JADX INFO: renamed from: d */
    public final C20343g6 m56393d() {
        return this.f76235X;
    }

    /* JADX INFO: renamed from: e */
    public final Boolean m56394e() {
        return this.f76242g;
    }

    /* JADX INFO: renamed from: f */
    public final String m56395f() {
        return this.f76239d;
    }

    /* JADX INFO: renamed from: g */
    public final String m56396g() {
        return this.f76236a;
    }

    /* JADX INFO: renamed from: h */
    public final Boolean m56397h() {
        return this.f76243h;
    }

    /* JADX INFO: renamed from: i */
    public final Boolean m56398i() {
        return this.f76241f;
    }

    /* JADX INFO: renamed from: j */
    public final String m56399j() {
        return this.f76237b;
    }

    /* JADX INFO: renamed from: k */
    public final Long m56400k() {
        return this.f76255t;
    }

    /* JADX INFO: renamed from: l */
    public final List m56401l() {
        return this.f76219H;
    }

    /* JADX INFO: renamed from: m */
    public final List m56402m() {
        return this.f76259x;
    }

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArraySet m56403n() {
        return this.f76258w;
    }

    /* JADX INFO: renamed from: o */
    public final List m56404o() {
        return this.f76220I;
    }

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList m56405p() {
        return this.f76250o;
    }

    /* JADX INFO: renamed from: q */
    public final CopyOnWriteArrayList m56406q() {
        return this.f76251p;
    }

    /* JADX INFO: renamed from: r */
    public final EnumC20447o6 m56407r() {
        return this.f76247l;
    }

    /* JADX INFO: renamed from: s */
    public final String m56408s() {
        return this.f76234W;
    }

    /* JADX INFO: renamed from: t */
    public final Boolean m56409t() {
        return this.f76260y;
    }

    /* JADX INFO: renamed from: u */
    public final EnumC20518r3 m56410u() {
        return this.f76232U;
    }

    /* JADX INFO: renamed from: v */
    public final Double m56411v() {
        return this.f76230S;
    }

    /* JADX INFO: renamed from: w */
    public final Double m56412w() {
        return this.f76246k;
    }

    /* JADX INFO: renamed from: x */
    public final String m56413x() {
        return this.f76231T;
    }

    /* JADX INFO: renamed from: y */
    public final String m56414y() {
        return this.f76254s;
    }

    /* JADX INFO: renamed from: z */
    public final C20437n6 m56415z() {
        return this.f76249n;
    }
}
