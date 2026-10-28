package io.sentry;

import androidx.databinding.RunnableC1189s;
import androidx.lifecycle.RunnableC1645z0;
import cd3.C4455g;
import io.sentry.android.core.C20073f;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.backpressure.C20268c;
import io.sentry.backpressure.RunnableC20266a;
import io.sentry.cache.C20280c;
import io.sentry.cache.InterfaceC20281d;
import io.sentry.internal.debugmeta.C20377b;
import io.sentry.internal.debugmeta.C20378c;
import io.sentry.internal.modules.C20384c;
import io.sentry.internal.modules.C20386e;
import io.sentry.internal.modules.C20387f;
import io.sentry.internal.modules.InterfaceC20382a;
import io.sentry.protocol.C20481h0;
import io.sentry.transport.C20559i;
import io.sentry.util.AbstractC20587i;
import io.sentry.util.AbstractC20590l;
import io.sentry.util.C20579a;
import io.sentry.util.thread.C20599b;
import io.sentry.util.thread.C20600c;
import j93.AbstractC21478l0;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import p000.AbstractC11266d;
import p035bp.AbstractC3511b;
import p048ce.AbstractC4482w;
import p437qt.C30582e;
import se.AbstractC32416g;

/* JADX INFO: renamed from: io.sentry.o4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20445o4 {

    /* JADX INFO: renamed from: a */
    public static volatile InterfaceC20317e1 f76532a = C20641z2.f77198a;

    /* JADX INFO: renamed from: b */
    public static volatile InterfaceC20308d1 f76533b = C20625x2.f77169b;

    /* JADX INFO: renamed from: c */
    public static final C20274c4 f76534c = new C20274c4(C20513q6.empty());

    /* JADX INFO: renamed from: d */
    public static volatile boolean f76535d = false;

    /* JADX INFO: renamed from: e */
    public static final Charset f76536e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f */
    public static final long f76537f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g */
    public static final C20579a f76538g = new C20579a();

    /* JADX INFO: renamed from: a */
    public static void m56637a() {
        C20535s c20535sM56711a = f76538g.m56711a();
        try {
            InterfaceC20308d1 interfaceC20308d1M56638b = m56638b();
            f76533b = C20625x2.f77169b;
            f76532a.close();
            interfaceC20308d1M56638b.mo56421a(false);
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

    /* JADX INFO: renamed from: b */
    public static InterfaceC20308d1 m56638b() {
        if (f76535d) {
            return f76533b;
        }
        InterfaceC20308d1 interfaceC20308d1 = f76532a.get();
        if (interfaceC20308d1 != null && !interfaceC20308d1.mo56431k()) {
            return interfaceC20308d1;
        }
        InterfaceC20308d1 interfaceC20308d1Mo56419D = f76533b.mo56419D("getCurrentScopes");
        f76532a.mo56473a(interfaceC20308d1Mo56419D);
        return interfaceC20308d1Mo56419D;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: c */
    public static void m56639c(C20456p2 c20456p2, C20073f c20073f) {
        C20513q6 c20513q6 = (C20513q6) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            c20073f.mo11179b(c20513q6);
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th3);
        }
        C20535s c20535sM56711a = f76538g.m56711a();
        try {
            if (!c20513q6.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && AbstractC20587i.f77090a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(c20513q6.getClass().getName()));
            }
            if (c20513q6.isEnableExternalConfiguration()) {
                c20513q6.merge(C20307d0.m56365a(AbstractC3511b.m10388q(), c20513q6.getLogger()));
            }
            String dsn = c20513q6.getDsn();
            if (!c20513q6.isEnabled() || (dsn != null && dsn.isEmpty())) {
                m56637a();
            } else {
                if (dsn == null) {
                    throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
                }
                c20513q6.retrieveParsedDsn();
                Boolean boolIsGlobalHubMode = c20513q6.isGlobalHubMode();
                int i13 = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                f76535d = zBooleanValue;
                if (c20513q6.getFatalLogger() instanceof C20546t2) {
                    c20513q6.setFatalLogger(new C20517r2());
                }
                C20274c4 c20274c4 = f76534c;
                int i14 = 0;
                if (AbstractC21478l0.m60420Z(c20274c4.f76134l, c20513q6, m56643g())) {
                    if (m56643g()) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    c20513q6.activate();
                    m56638b().mo56421a(true);
                    c20274c4.f76134l = c20513q6;
                    ?? r10 = c20274c4.f76129g;
                    c20274c4.f76129g = C20274c4.m56240g(c20513q6.getMaxBreadcrumbs());
                    Iterator it = r10.iterator();
                    while (it.hasNext()) {
                        c20274c4.mo56201i((C20315e) it.next(), null);
                    }
                    f76533b = new C20350h4(new C20274c4(c20513q6), new C20274c4(c20513q6), c20274c4);
                    if (c20513q6.isDebug() && (c20513q6.getLogger() instanceof C20546t2)) {
                        c20513q6.setLogger(new C20517r2());
                    }
                    m56641e(c20513q6);
                    f76532a.mo56473a(f76533b);
                    m56640d(c20513q6);
                    c20274c4.f76143u = new C4455g(c20513q6);
                    if (c20513q6.getExecutorService().isClosed()) {
                        c20513q6.setExecutorService(new C20351h5(c20513q6));
                        c20513q6.getExecutorService().mo56217b();
                    }
                    try {
                        c20513q6.getExecutorService().submit(new RunnableC20423m4(c20513q6, i14));
                    } catch (RejectedExecutionException e5) {
                        c20513q6.getLogger().mo16060j(EnumC20436n5.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e5);
                    }
                    try {
                        c20513q6.getExecutorService().submit(new RunnableC1189s(c20513q6, 4));
                    } catch (Throwable th4) {
                        c20513q6.getLogger().mo16060j(EnumC20436n5.DEBUG, "Failed to move previous session.", th4);
                    }
                    for (InterfaceC20545t1 interfaceC20545t1 : c20513q6.getIntegrations()) {
                        try {
                            interfaceC20545t1.mo55878m(c20513q6);
                        } catch (Throwable th5) {
                            c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to register the integration " + interfaceC20545t1.getClass().getName(), th5);
                        }
                    }
                    try {
                        c20513q6.getExecutorService().submit(new RunnableC20423m4(c20513q6, 2));
                    } catch (Throwable th6) {
                        c20513q6.getLogger().mo16060j(EnumC20436n5.DEBUG, "Failed to notify options observers.", th6);
                    }
                    try {
                        c20513q6.getExecutorService().submit(new RunnableC20434n3(c20513q6));
                    } catch (Throwable th7) {
                        c20513q6.getLogger().mo16060j(EnumC20436n5.DEBUG, "Failed to finalize previous session.", th7);
                    }
                    try {
                        c20513q6.getExecutorService().submit(new RunnableC20423m4(c20513q6, i13));
                    } catch (Throwable th8) {
                        c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th8);
                    }
                    InterfaceC20602v0 logger = c20513q6.getLogger();
                    EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
                    logger.mo16066m(enumC20436n5, "Using openTelemetryMode %s", c20513q6.getOpenTelemetryMode());
                    c20513q6.getLogger().mo16066m(enumC20436n5, "Using span factory %s", c20513q6.getSpanFactory().getClass().getName());
                    c20513q6.getLogger().mo16066m(enumC20436n5, "Using scopes storage %s", f76532a.getClass().getName());
                } else {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            c20535sM56711a.close();
        } catch (Throwable th9) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m56640d(C20513q6 c20513q6) {
        InterfaceC20281d c20280c;
        InterfaceC20602v0 logger = c20513q6.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.INFO;
        logger.mo16066m(enumC20436n5, "Initializing SDK with DSN: '%s'", c20513q6.getDsn());
        String outboxPath = c20513q6.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.mo16066m(enumC20436n5, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = c20513q6.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (c20513q6.getEnvelopeDiskCache() instanceof C20559i) {
                int i13 = C20280c.f76154J;
                String cacheDirPath2 = c20513q6.getCacheDirPath();
                int maxCacheItems = c20513q6.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    c20280c = C20559i.f77031w;
                } else {
                    c20280c = new C20280c(c20513q6, cacheDirPath2, maxCacheItems);
                }
                c20513q6.setEnvelopeDiskCache(c20280c);
            }
        }
        String profilingTracesDirPath = c20513q6.getProfilingTracesDirPath();
        if ((c20513q6.isProfilingEnabled() || c20513q6.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                c20513q6.getExecutorService().submit(new RunnableC1645z0(file, 7));
            } catch (RejectedExecutionException e5) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e5);
            }
        }
        InterfaceC20382a modulesLoader = c20513q6.getModulesLoader();
        if (!c20513q6.isSendModules()) {
            c20513q6.setModulesLoader(C20386e.f76438a);
        } else if (modulesLoader instanceof C20386e) {
            c20513q6.setModulesLoader(new C20387f(Arrays.asList(new C20384c(c20513q6.getLogger()), new C20387f(c20513q6.getLogger())), c20513q6.getLogger()));
        }
        if (c20513q6.getDebugMetaLoader() instanceof C20377b) {
            c20513q6.setDebugMetaLoader(new C20378c(c20513q6.getLogger()));
        }
        List<Properties> listMo16064l = c20513q6.getDebugMetaLoader().mo16064l();
        if (listMo16064l != null) {
            if (c20513q6.getBundleIds().isEmpty()) {
                Iterator it = listMo16064l.iterator();
                while (it.hasNext()) {
                    String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            c20513q6.addBundleId(str);
                        }
                    }
                }
            }
            if (c20513q6.getProguardUuid() == null) {
                Iterator it3 = listMo16064l.iterator();
                while (it3.hasNext()) {
                    String property2 = ((Properties) it3.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Proguard UUID found: %s", property2);
                        c20513q6.setProguardUuid(property2);
                        break;
                    }
                }
            }
            for (Properties properties : listMo16064l) {
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    C20412l5.m56626d().m56628b(property3, property4);
                    break;
                }
            }
            for (Properties properties2 : listMo16064l) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                String property9 = properties2.getProperty("io.sentry.distribution.install-groups-override");
                if (property5 != null || property6 != null || property7 != null || property8 != null || property9 != null) {
                    C20352h6 distribution = c20513q6.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.f76382b.isEmpty()) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.f76382b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.f76383c.isEmpty()) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.f76383c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.f76381a.isEmpty()) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.f76381a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.f76384d == null) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.f76384d = property8;
                    }
                    if (property9 != null && !property9.isEmpty() && distribution.f76385e == null) {
                        String[] strArrSplit = property9.split(",", -1);
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strTrim = str2.trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Distribution install groups override found: %s", arrayList);
                            distribution.f76385e = arrayList;
                            break;
                        }
                        break;
                    }
                    break;
                    break;
                    break;
                }
            }
        }
        if (c20513q6.getThreadChecker() instanceof C20599b) {
            c20513q6.setThreadChecker(C20600c.m56728d());
        }
        if (c20513q6.getPerformanceCollectors().isEmpty()) {
            c20513q6.addPerformanceCollector(new C20573u1());
        }
        if (c20513q6.isEnableBackpressureHandling() && !AbstractC20587i.f77090a) {
            if (c20513q6.getBackpressureMonitor() instanceof C20268c) {
                c20513q6.setBackpressureMonitor(new RunnableC20266a(c20513q6));
            }
            c20513q6.getBackpressureMonitor().start();
        }
        if (!AbstractC20587i.f77090a && c20513q6.isContinuousProfilingEnabled() && (c20513q6.getContinuousProfiler() instanceof C20443o2)) {
            try {
                AbstractC21478l0.m60399E(c20513q6);
                InterfaceC20602v0 logger2 = c20513q6.getLogger();
                c20513q6.getProfilingTracesHz();
                c20513q6.getExecutorService();
                AbstractC4482w.m13988Y(logger2);
                c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            } catch (Exception e13) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to create default profiling traces directory", e13);
            }
            c20513q6.getContinuousProfiler();
        } else {
            c20513q6.getContinuousProfiler();
        }
        if (!AbstractC20587i.f77090a && c20513q6.isContinuousProfilingEnabled() && (c20513q6.getProfilerConverter() instanceof C20574u2)) {
            AbstractC4482w.m13989Z();
            c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
            c20513q6.getProfilerConverter();
        } else {
            c20513q6.getProfilerConverter();
        }
        c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(c20513q6.isContinuousProfilingEnabled()), c20513q6.getProfileLifecycle());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX INFO: renamed from: e */
    public static void m56641e(C20513q6 c20513q6) {
        ?? arrayList;
        C20546t2 c20546t2 = C20546t2.f76998w;
        boolean z4 = AbstractC20587i.f77090a;
        if (!z4) {
            if (EnumC20644z5.AUTO.equals(c20513q6.getOpenTelemetryMode())) {
                if (C30582e.m93818h(c20546t2, "io.sentry.opentelemetry.agent.AgentMarker")) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    c20513q6.setOpenTelemetryMode(EnumC20644z5.AGENT);
                } else if (C30582e.m93818h(c20546t2, "io.sentry.opentelemetry.agent.AgentlessMarker")) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    c20513q6.setOpenTelemetryMode(EnumC20644z5.AGENTLESS);
                } else if (C30582e.m93818h(c20546t2, "io.sentry.opentelemetry.agent.AgentlessSpringMarker")) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    c20513q6.setOpenTelemetryMode(EnumC20644z5.AGENTLESS_SPRING);
                }
            }
        }
        EnumC20644z5 enumC20644z5 = EnumC20644z5.OFF;
        if (enumC20644z5 == c20513q6.getOpenTelemetryMode()) {
            c20513q6.setSpanFactory(new C20328f3(1));
        }
        f76532a.close();
        c20513q6.getScopesStorageFactory();
        if (enumC20644z5 == c20513q6.getOpenTelemetryMode()) {
            f76532a = new C20543t();
        } else {
            f76532a = AbstractC32416g.m101161r(new C30582e(29));
        }
        if (z4) {
            return;
        }
        EnumC20644z5 openTelemetryMode = c20513q6.getOpenTelemetryMode();
        if (enumC20644z5.equals(openTelemetryMode)) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = AbstractC20590l.f77096a;
            arrayList = new ArrayList();
            EnumC20644z5 enumC20644z6 = EnumC20644z5.AGENT;
            if (enumC20644z6 == openTelemetryMode || EnumC20644z5.AGENTLESS_SPRING == openTelemetryMode) {
                AbstractC11266d.m30445C(arrayList, "auto.http.spring_jakarta.webmvc", "auto.http.spring.webmvc", "auto.http.spring7.webmvc", "auto.spring_jakarta.webflux");
                AbstractC11266d.m30445C(arrayList, "auto.spring.webflux", "auto.spring7.webflux", "auto.db.jdbc", "auto.http.spring_jakarta.webclient");
                AbstractC11266d.m30445C(arrayList, "auto.http.spring.webclient", "auto.http.spring7.webclient", "auto.http.spring_jakarta.restclient", "auto.http.spring.restclient");
                AbstractC11266d.m30445C(arrayList, "auto.http.spring7.restclient", "auto.http.spring_jakarta.resttemplate", "auto.http.spring.resttemplate", "auto.http.spring7.resttemplate");
                AbstractC11266d.m30445C(arrayList, "auto.http.openfeign", "auto.http.ktor-client", "auto.queue.spring_jakarta.kafka.producer", "auto.queue.spring_jakarta.kafka.consumer");
                arrayList.add("auto.queue.kafka.producer");
                arrayList.add("auto.queue.kafka.consumer");
            }
            if (enumC20644z6 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c20513q6.addIgnoredSpanOrigin((String) it.next());
        }
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m56642f() {
        return m56638b().mo56445y();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m56643g() {
        return m56638b().isEnabled();
    }

    /* JADX INFO: renamed from: h */
    public static void m56644h(String str) {
        m56638b().mo56422b(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m56645i(String str, String str2) {
        m56638b().mo56423c(str, str2);
    }

    /* JADX INFO: renamed from: j */
    public static void m56646j(C20481h0 c20481h0) {
        m56638b().mo56425e(c20481h0);
    }
}
