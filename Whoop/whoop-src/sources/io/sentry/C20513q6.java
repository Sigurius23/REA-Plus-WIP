package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import g73.C15556d;
import io.sentry.backpressure.C20268c;
import io.sentry.backpressure.InterfaceC20267b;
import io.sentry.cache.C20283f;
import io.sentry.cache.InterfaceC20281d;
import io.sentry.clientreport.InterfaceC20299g;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.hints.C20363j;
import io.sentry.internal.debugmeta.C20377b;
import io.sentry.internal.debugmeta.InterfaceC20376a;
import io.sentry.internal.gestures.InterfaceC20379a;
import io.sentry.internal.modules.C20386e;
import io.sentry.internal.modules.InterfaceC20382a;
import io.sentry.logger.C20417c;
import io.sentry.protocol.C20499t;
import io.sentry.transport.C20559i;
import io.sentry.transport.C20561k;
import io.sentry.transport.InterfaceC20558h;
import io.sentry.util.AbstractC20587i;
import io.sentry.util.AbstractC20591m;
import io.sentry.util.C20579a;
import io.sentry.util.C20584f;
import io.sentry.util.thread.C20599b;
import io.sentry.util.thread.InterfaceC20598a;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;
import live.hms.video.utils.HMSConstantsKt;
import p211i5.C18090c;
import p437qt.C30582e;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: io.sentry.q6 */
/* JADX INFO: loaded from: classes5.dex */
public class C20513q6 {
    static final EnumC20436n5 DEFAULT_DIAGNOSTIC_LEVEL = EnumC20436n5.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private InterfaceC20267b backpressureMonitor;
    private InterfaceC20264b6 beforeBreadcrumb;
    private InterfaceC20276c6 beforeEnvelopeCallback;
    private InterfaceC20313d6 beforeSend;
    private InterfaceC20313d6 beforeSendFeedback;
    private InterfaceC20322e6 beforeSendReplay;
    private InterfaceC20331f6 beforeSendTransaction;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    InterfaceC20299g clientReportRecorder;
    private InterfaceC20406l compositePerformanceCollector;
    private InterfaceC20454p0 connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private InterfaceC20507q0 continuousProfiler;
    private C20343g6 cron;
    private final C20584f dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private InterfaceC20376a debugMetaLoader;
    private EnumC20341g4 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private EnumC20436n5 diagnosticLevel;
    private String dist;
    private String distinctId;
    private C20352h6 distribution;
    private InterfaceC20515r0 distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableCacheTracing;
    private boolean enableDatabaseTransactionTracing;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableQueueTracing;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private InterfaceC20281d envelopeDiskCache;
    private final C20584f envelopeReader;
    private String environment;
    private InterfaceC20347h1 executorService;
    private final C20270c0 experimental;
    private InterfaceC20602v0 fatalLogger;
    private C20372i5 feedbackOptions;
    private boolean forceInit;
    private C20325f0 fullyDisplayedReporter;
    private final List<InterfaceC20379a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<C20316e0> ignoredCheckIns;
    private List<C20316e0> ignoredSpanOrigins;
    private List<C20316e0> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC20516r1 initPriority;
    private EnumC20537s1 instrumenter;
    private volatile C20414l7 internalTracesSampler;
    protected final C20579a lock;
    private InterfaceC20602v0 logger;
    private C20373i6 logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;
    private EnumC20447o6 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private C20395j6 metrics;
    private InterfaceC20382a modulesLoader;
    private final List<InterfaceC20271c1> observers;
    private InterfaceC20404k6 onDiscard;
    private InterfaceC20413l6 onOversizedEvent;
    private EnumC20644z5 openTelemetryMode;
    private final List<InterfaceC20615w0> optionsObservers;
    private String orgId;
    private final List<InterfaceC20623x0> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private EnumC20518r3 profileLifecycle;
    private Double profileSessionSampleRate;
    private InterfaceC20042a1 profilerConverter;
    private Double profilesSampleRate;
    private InterfaceC20425m6 profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private C20437n6 proxy;
    private int readTimeoutMillis;
    private String release;
    private InterfaceC20605v3 replayController;
    private Double sampleRate;
    private InterfaceC20326f1 scopesStorageFactory;
    private C20499t sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final C20584f serializer;
    private String serverName;
    private C20578u6 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private InterfaceC20399k1 socketTagger;
    private InterfaceC20420m1 spanFactory;
    private String spotlightConnectionUrl;
    private final AtomicBoolean spotlightIntegrationLoaded;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private boolean strictTraceContinuation;
    private final Map<String, String> tags;
    private InterfaceC20598a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private InterfaceC20460p6 tracesSampler;
    private InterfaceC20442o1 transactionProfiler;
    private InterfaceC20455p1 transportFactory;
    private InterfaceC20558h transportGate;
    private InterfaceC20508q1 versionDetector;
    private final List<ComposeViewHierarchyExporter> viewHierarchyExporters;
    private final List<InterfaceC20258b0> eventProcessors = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private List<C20316e0> ignoredErrors = null;
    private final List<InterfaceC20545t1> integrations = new CopyOnWriteArrayList();
    private final Set<String> bundleIds = new CopyOnWriteArraySet();
    private final C20584f parsedDsn = new C20584f(new C20047a6(this, 0));
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;

    /* JADX WARN: Code duplicated, block: B:19:0x02a1  */
    public C20513q6(boolean z4) {
        InterfaceC20420m1 c20328f3;
        Class clsM93820o;
        C20546t2 c20546t2 = C20546t2.f76998w;
        this.logger = c20546t2;
        this.fatalLogger = c20546t2;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new C20584f(new C20047a6(this, 1));
        this.envelopeReader = new C20584f(new C20047a6(this, 2));
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C20349h3.f76370w;
        this.transportGate = C20561k.f77033a;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C20261b3.f76085a;
        this.spotlightIntegrationLoaded = new AtomicBoolean(false);
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = C20559i.f77031w;
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = EnumC20447o6.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C20456p2.f76555y;
        this.continuousProfiler = C20443o2.f76525w;
        this.profilerConverter = C20574u2.f77059a;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.strictTraceContinuation = false;
        this.idleTimeout = Long.valueOf(HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS);
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new C5101l0(this);
        this.modulesLoader = C20386e.f76438a;
        this.debugMetaLoader = C20377b.f76418w;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC20537s1.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = C20599b.f77107a;
        this.traceOptionsRequests = true;
        this.enableDatabaseTransactionTracing = false;
        this.enableCacheTracing = false;
        this.enableQueueTracing = false;
        this.dateProvider = new C20584f(new C18090c(13));
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = C20421m2.f76497a;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C20325f0.f76333b;
        this.connectionStatusProvider = new C20433n2();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = C20268c.f76111w;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = C20328f3.f76338b;
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = C20456p2.f76554x;
        this.distributionController = C20456p2.f76553w;
        this.enableScreenTracking = true;
        this.defaultScopeType = EnumC20341g4.ISOLATION;
        this.initPriority = EnumC20516r1.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new C20579a();
        this.openTelemetryMode = EnumC20644z5.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = C20370i3.f76401w;
        this.profileLifecycle = EnumC20518r3.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        C20373i6 c20373i6 = new C20373i6();
        c20373i6.f76411a = false;
        c20373i6.f76412b = new C20417c();
        this.logs = c20373i6;
        C20395j6 c20395j6 = new C20395j6();
        c20395j6.f76449a = true;
        c20395j6.f76450b = new C20363j(29);
        this.metrics = c20395j6;
        this.socketTagger = C20310d3.f76263w;
        this.distribution = new C20352h6();
        C20499t c20499t = new C20499t("sentry.java", "8.41.0");
        c20499t.f76792x = "8.41.0";
        this.experimental = new C20270c0();
        C20578u6 c20578u6 = new C20578u6();
        c20578u6.f77062d = false;
        c20578u6.f77065g = EnumC20550t6.MEDIUM;
        c20578u6.f77066h = 1;
        c20578u6.f77067i = 30000L;
        c20578u6.f77068j = 5000L;
        c20578u6.f77069k = 3600000L;
        c20578u6.f77070l = true;
        c20578u6.f77072n = false;
        c20578u6.f77073o = EnumC20393j4.PIXEL_COPY;
        c20578u6.f77074p = false;
        List list = Collections.EMPTY_LIST;
        c20578u6.f77075q = list;
        c20578u6.f77076r = list;
        c20578u6.f77077s = true;
        List list2 = C20578u6.f77061v;
        c20578u6.f77078t = list2;
        c20578u6.f77079u = list2;
        if (!z4) {
            ((CopyOnWriteArraySet) c20578u6.f70498b).add("android.widget.TextView");
            ((CopyOnWriteArraySet) c20578u6.f70498b).add("android.widget.ImageView");
            ((CopyOnWriteArraySet) c20578u6.f70498b).add("android.webkit.WebView");
            ((CopyOnWriteArraySet) c20578u6.f70498b).add("android.widget.VideoView");
            ((CopyOnWriteArraySet) c20578u6.f70498b).add("androidx.camera.view.PreviewView");
            ((CopyOnWriteArraySet) c20578u6.f70498b).add("androidx.media3.ui.PlayerView");
            ((CopyOnWriteArraySet) c20578u6.f70498b).add("com.google.android.exoplayer2.ui.PlayerView");
            ((CopyOnWriteArraySet) c20578u6.f70498b).add("com.google.android.exoplayer2.ui.StyledPlayerView");
            c20578u6.f77071m = c20499t;
        }
        this.sessionReplay = c20578u6;
        C20372i5 c20372i5 = new C20372i5();
        c20372i5.f76403a = false;
        c20372i5.f76404b = true;
        c20372i5.f76405c = false;
        c20372i5.f76406d = true;
        c20372i5.f76407e = true;
        c20372i5.f76408f = true;
        c20372i5.f76409g = false;
        this.feedbackOptions = c20372i5;
        if (z4) {
            return;
        }
        if (AbstractC20587i.f77090a || !C30582e.m93818h(c20546t2, "io.sentry.opentelemetry.OtelSpanFactory") || (clsM93820o = C30582e.m93820o(c20546t2, "io.sentry.opentelemetry.OtelSpanFactory")) == null) {
            c20328f3 = new C20328f3(1);
        } else {
            try {
                Object objNewInstance = clsM93820o.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance == null || !(objNewInstance instanceof InterfaceC20420m1)) {
                    c20328f3 = new C20328f3(1);
                } else {
                    c20328f3 = (InterfaceC20420m1) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        setSpanFactory(c20328f3);
        this.integrations.add(new UncaughtExceptionHandlerIntegration());
        this.integrations.add(new ShutdownHookIntegration());
        this.eventProcessors.add(new C20391j2(this));
        this.eventProcessors.add(new C20430n(this, 1));
        if (!AbstractC20587i.f77090a) {
            this.eventProcessors.add(new C20608v6());
        }
        setSentryClientName("sentry.java/8.41.0");
        setSdkVersion(c20499t);
        C20412l5.m56626d().m56628b("maven:io.sentry:sentry", "8.41.0");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C20630y m56668a(C20513q6 c20513q6) {
        return new C20630y(c20513q6.dsn);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20638z m56669b(C20513q6 c20513q6) {
        return new C20638z((InterfaceC20390j1) c20513q6.serializer.m56714a());
    }

    public static C20513q6 empty() {
        return new C20513q6(true);
    }

    public void activate() {
        if (this.executorService instanceof C20261b3) {
            C20351h5 c20351h5 = new C20351h5(this);
            this.executorService = c20351h5;
            c20351h5.mo56217b();
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((InterfaceC20545t1) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
            } catch (Throwable unused) {
            }
        }
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(InterfaceC20258b0 interfaceC20258b0) {
        this.eventProcessors.add(interfaceC20258b0);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new C20316e0(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new C20316e0(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new C20316e0(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new C20316e0(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(InterfaceC20545t1 interfaceC20545t1) {
        this.integrations.add(interfaceC20545t1);
    }

    public void addOptionsObserver(InterfaceC20615w0 interfaceC20615w0) {
        this.optionsObservers.add(interfaceC20615w0);
    }

    public void addPerformanceCollector(InterfaceC20623x0 interfaceC20623x0) {
        this.performanceCollectors.add(interfaceC20623x0);
    }

    public void addScopeObserver(InterfaceC20271c1 interfaceC20271c1) {
        this.observers.add(interfaceC20271c1);
    }

    public boolean containsIgnoredExceptionForType(Throwable th3) {
        return this.ignoredExceptionsForType.contains(th3.getClass());
    }

    public C20283f findPersistingScopeObserver() {
        for (InterfaceC20271c1 interfaceC20271c1 : this.observers) {
            if (interfaceC20271c1 instanceof C20283f) {
                return (C20283f) interfaceC20271c1;
            }
        }
        return null;
    }

    public InterfaceC20267b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public InterfaceC20264b6 getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public InterfaceC20276c6 getBeforeEnvelopeCallback() {
        return null;
    }

    public InterfaceC20313d6 getBeforeSend() {
        return this.beforeSend;
    }

    public InterfaceC20313d6 getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    public InterfaceC20322e6 getBeforeSendReplay() {
        return null;
    }

    public InterfaceC20331f6 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public InterfaceC20299g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public InterfaceC20406l getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public InterfaceC20454p0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public InterfaceC20507q0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public C20343g6 getCron() {
        return this.cron;
    }

    public InterfaceC20606v4 getDateProvider() {
        return (InterfaceC20606v4) this.dateProvider.m56714a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public InterfaceC20376a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC20341g4 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public EnumC20436n5 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public C20352h6 getDistribution() {
        return this.distribution;
    }

    public InterfaceC20515r0 getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEffectiveOrgId() {
        String str = this.orgId;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                return strTrim;
            }
        }
        try {
            return retrieveParsedDsn().f77184d;
        } catch (Throwable unused) {
            return null;
        }
    }

    public InterfaceC20281d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public InterfaceC20536s0 getEnvelopeReader() {
        return (InterfaceC20536s0) this.envelopeReader.m56714a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<InterfaceC20258b0> getEventProcessors() {
        return this.eventProcessors;
    }

    public InterfaceC20347h1 getExecutorService() {
        return this.executorService;
    }

    public C20270c0 getExperimental() {
        return this.experimental;
    }

    public InterfaceC20602v0 getFatalLogger() {
        return this.fatalLogger;
    }

    public C20372i5 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public C20325f0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<InterfaceC20379a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<C20316e0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<C20316e0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<C20316e0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<C20316e0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public EnumC20516r1 getInitPriority() {
        return this.initPriority;
    }

    public EnumC20537s1 getInstrumenter() {
        return this.instrumenter;
    }

    public List<InterfaceC20545t1> getIntegrations() {
        return this.integrations;
    }

    public C20414l7 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            C20535s c20535sM56711a = this.lock.m56711a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new C20414l7(this);
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
        return this.internalTracesSampler;
    }

    public InterfaceC20602v0 getLogger() {
        return this.logger;
    }

    public C20373i6 getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public EnumC20447o6 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public C20395j6 getMetrics() {
        return this.metrics;
    }

    public InterfaceC20382a getModulesLoader() {
        return this.modulesLoader;
    }

    public InterfaceC20404k6 getOnDiscard() {
        return null;
    }

    public InterfaceC20413l6 getOnOversizedEvent() {
        return null;
    }

    public EnumC20644z5 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<InterfaceC20615w0> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<InterfaceC20623x0> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public EnumC20518r3 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public InterfaceC20042a1 getProfilerConverter() {
        return this.profilerConverter;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public InterfaceC20425m6 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public C20437n6 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public InterfaceC20605v3 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<InterfaceC20271c1> getScopeObservers() {
        return this.observers;
    }

    public InterfaceC20326f1 getScopesStorageFactory() {
        return null;
    }

    public C20499t getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public InterfaceC20390j1 getSerializer() {
        return (InterfaceC20390j1) this.serializer.m56714a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public C20578u6 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public InterfaceC20399k1 getSocketTagger() {
        return this.socketTagger;
    }

    public InterfaceC20420m1 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public InterfaceC20598a getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public InterfaceC20460p6 getTracesSampler() {
        return this.tracesSampler;
    }

    public InterfaceC20442o1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public InterfaceC20455p1 getTransportFactory() {
        return this.transportFactory;
    }

    public InterfaceC20558h getTransportGate() {
        return this.transportGate;
    }

    public InterfaceC20508q1 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<ComposeViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d3;
        return this.profilesSampleRate == null && (d3 = this.profileSessionSampleRate) != null && d3.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableCacheTracing() {
        return this.enableCacheTracing;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableQueueTracing() {
        return this.enableQueueTracing;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d3 = this.profilesSampleRate;
        return d3 != null && d3.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isStrictTraceContinuation() {
        return this.strictTraceContinuation;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(C20307d0 c20307d0) {
        if (c20307d0.m56396g() != null) {
            setDsn(c20307d0.m56396g());
        }
        if (c20307d0.m56399j() != null) {
            setEnvironment(c20307d0.m56399j());
        }
        if (c20307d0.m56366A() != null) {
            setRelease(c20307d0.m56366A());
        }
        if (c20307d0.m56395f() != null) {
            setDist(c20307d0.m56395f());
        }
        if (c20307d0.m56369D() != null) {
            setServerName(c20307d0.m56369D());
        }
        if (c20307d0.m56415z() != null) {
            setProxy(c20307d0.m56415z());
        }
        if (c20307d0.m56398i() != null) {
            setEnableUncaughtExceptionHandler(c20307d0.m56398i().booleanValue());
        }
        if (c20307d0.m56409t() != null) {
            setPrintUncaughtStackTrace(c20307d0.m56409t().booleanValue());
        }
        if (c20307d0.m56367B() != null) {
            setSampleRate(c20307d0.m56367B());
        }
        if (c20307d0.m56375J() != null) {
            setTracesSampleRate(c20307d0.m56375J());
        }
        if (c20307d0.m56412w() != null) {
            setProfilesSampleRate(c20307d0.m56412w());
        }
        if (c20307d0.m56394e() != null) {
            setDebug(c20307d0.m56394e().booleanValue());
        }
        if (c20307d0.m56397h() != null) {
            setEnableDeduplication(c20307d0.m56397h().booleanValue());
        }
        if (c20307d0.m56368C() != null) {
            setSendClientReports(c20307d0.m56368C().booleanValue());
        }
        if (c20307d0.m56386U() != null) {
            setForceInit(c20307d0.m56386U().booleanValue());
        }
        for (Map.Entry entry : new HashMap(c20307d0.m56373H()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c20307d0.m56406q()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it3 = new ArrayList(c20307d0.m56405p()).iterator();
        while (it3.hasNext()) {
            addInAppExclude((String) it3.next());
        }
        Iterator it4 = new HashSet(c20307d0.m56403n()).iterator();
        while (it4.hasNext()) {
            addIgnoredExceptionForType((Class) it4.next());
        }
        if (c20307d0.m56374I() != null) {
            setTracePropagationTargets(new ArrayList(c20307d0.m56374I()));
        }
        Iterator it5 = new ArrayList(c20307d0.m56392c()).iterator();
        while (it5.hasNext()) {
            addContextTag((String) it5.next());
        }
        if (c20307d0.m56414y() != null) {
            setProguardUuid(c20307d0.m56414y());
        }
        if (c20307d0.m56400k() != null) {
            setIdleTimeout(c20307d0.m56400k());
        }
        if (c20307d0.m56371F() != null) {
            setShutdownTimeoutMillis(c20307d0.m56371F().longValue());
        }
        if (c20307d0.m56370E() != null) {
            setSessionFlushTimeoutMillis(c20307d0.m56370E().longValue());
        }
        Iterator it6 = c20307d0.m56391b().iterator();
        while (it6.hasNext()) {
            addBundleId((String) it6.next());
        }
        if (c20307d0.m56385T() != null) {
            setEnabled(c20307d0.m56385T().booleanValue());
        }
        if (c20307d0.m56382Q() != null) {
            setEnablePrettySerializationOutput(c20307d0.m56382Q().booleanValue());
        }
        if (c20307d0.m56389X() != null) {
            setSendModules(c20307d0.m56389X().booleanValue());
        }
        if (c20307d0.m56401l() != null) {
            setIgnoredCheckIns(new ArrayList(c20307d0.m56401l()));
        }
        if (c20307d0.m56404o() != null) {
            setIgnoredTransactions(new ArrayList(c20307d0.m56404o()));
        }
        if (c20307d0.m56402m() != null) {
            setIgnoredErrors(new ArrayList(c20307d0.m56402m()));
        }
        if (c20307d0.m56377L() != null) {
            setEnableBackpressureHandling(c20307d0.m56377L().booleanValue());
        }
        if (c20307d0.m56379N() != null) {
            setEnableDatabaseTransactionTracing(c20307d0.m56379N().booleanValue());
        }
        if (c20307d0.m56378M() != null) {
            setEnableCacheTracing(c20307d0.m56378M().booleanValue());
        }
        if (c20307d0.m56383R() != null) {
            setEnableQueueTracing(c20307d0.m56383R().booleanValue());
        }
        if (c20307d0.m56407r() != null) {
            setMaxRequestBodySize(c20307d0.m56407r());
        }
        if (c20307d0.m56388W() != null) {
            setSendDefaultPii(c20307d0.m56388W().booleanValue());
        }
        if (c20307d0.m56376K() != null) {
            setCaptureOpenTelemetryEvents(c20307d0.m56376K().booleanValue());
        }
        if (c20307d0.m56384S() != null) {
            setEnableSpotlight(c20307d0.m56384S().booleanValue());
        }
        if (c20307d0.m56372G() != null) {
            setSpotlightConnectionUrl(c20307d0.m56372G());
        }
        if (c20307d0.m56387V() != null) {
            setGlobalHubMode(c20307d0.m56387V());
        }
        if (c20307d0.m56393d() != null) {
            if (getCron() == null) {
                setCron(c20307d0.m56393d());
            } else {
                if (c20307d0.m56393d().m56516a() != null) {
                    getCron().m56521f(c20307d0.m56393d().m56516a());
                }
                if (c20307d0.m56393d().m56518c() != null) {
                    getCron().m56523h(c20307d0.m56393d().m56518c());
                }
                if (c20307d0.m56393d().m56520e() != null) {
                    getCron().m56525j(c20307d0.m56393d().m56520e());
                }
                if (c20307d0.m56393d().m56517b() != null) {
                    getCron().m56522g(c20307d0.m56393d().m56517b());
                }
                if (c20307d0.m56393d().m56519d() != null) {
                    getCron().m56524i(c20307d0.m56393d().m56519d());
                }
            }
        }
        if (c20307d0.m56380O() != null) {
            getLogs().f76411a = c20307d0.m56380O().booleanValue();
        }
        if (c20307d0.m56381P() != null) {
            getMetrics().f76449a = c20307d0.m56381P().booleanValue();
        }
        if (c20307d0.m56411v() != null) {
            setProfileSessionSampleRate(c20307d0.m56411v());
        }
        if (c20307d0.m56413x() != null) {
            setProfilingTracesDirPath(c20307d0.m56413x());
        }
        if (c20307d0.m56410u() != null) {
            setProfileLifecycle(c20307d0.m56410u());
        }
        if (c20307d0.m56390Y() != null) {
            setStrictTraceContinuation(c20307d0.m56390Y().booleanValue());
        }
        if (c20307d0.m56408s() != null) {
            setOrgId(c20307d0.m56408s());
        }
    }

    public C20630y retrieveParsedDsn() throws IllegalArgumentException {
        return (C20630y) this.parsedDsn.m56714a();
    }

    public void setAttachServerName(boolean z4) {
        this.attachServerName = z4;
    }

    public void setAttachStacktrace(boolean z4) {
        this.attachStacktrace = z4;
    }

    public void setAttachThreads(boolean z4) {
        this.attachThreads = z4;
    }

    public void setBackpressureMonitor(InterfaceC20267b interfaceC20267b) {
        this.backpressureMonitor = interfaceC20267b;
    }

    public void setBeforeBreadcrumb(InterfaceC20264b6 interfaceC20264b6) {
        this.beforeBreadcrumb = interfaceC20264b6;
    }

    public void setBeforeEnvelopeCallback(InterfaceC20276c6 interfaceC20276c6) {
    }

    public void setBeforeSend(InterfaceC20313d6 interfaceC20313d6) {
        this.beforeSend = interfaceC20313d6;
    }

    public void setBeforeSendFeedback(InterfaceC20313d6 interfaceC20313d6) {
        this.beforeSendFeedback = interfaceC20313d6;
    }

    public void setBeforeSendReplay(InterfaceC20322e6 interfaceC20322e6) {
    }

    public void setBeforeSendTransaction(InterfaceC20331f6 interfaceC20331f6) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z4) {
        this.captureOpenTelemetryEvents = z4;
    }

    public void setCompositePerformanceCollector(InterfaceC20406l interfaceC20406l) {
        this.compositePerformanceCollector = interfaceC20406l;
    }

    public void setConnectionStatusProvider(InterfaceC20454p0 interfaceC20454p0) {
        this.connectionStatusProvider = interfaceC20454p0;
    }

    public void setConnectionTimeoutMillis(int i13) {
        this.connectionTimeoutMillis = i13;
    }

    public void setContinuousProfiler(InterfaceC20507q0 interfaceC20507q0) {
        if (this.continuousProfiler != C20443o2.f76525w || interfaceC20507q0 == null) {
            return;
        }
        this.continuousProfiler = interfaceC20507q0;
    }

    public void setCron(C20343g6 c20343g6) {
        this.cron = c20343g6;
    }

    public void setDateProvider(InterfaceC20606v4 interfaceC20606v4) {
        this.dateProvider.m56716c(interfaceC20606v4);
    }

    public void setDeadlineTimeout(long j7) {
        this.deadlineTimeout = j7;
    }

    public void setDebug(boolean z4) {
        this.debug = z4;
    }

    public void setDebugMetaLoader(InterfaceC20376a interfaceC20376a) {
        if (interfaceC20376a == null) {
            interfaceC20376a = C20377b.f76418w;
        }
        this.debugMetaLoader = interfaceC20376a;
    }

    public void setDefaultScopeType(EnumC20341g4 enumC20341g4) {
        this.defaultScopeType = enumC20341g4;
    }

    public void setDiagnosticLevel(EnumC20436n5 enumC20436n5) {
        if (enumC20436n5 == null) {
            enumC20436n5 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC20436n5;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(C20352h6 c20352h6) {
        if (c20352h6 == null) {
            c20352h6 = new C20352h6();
        }
        this.distribution = c20352h6;
    }

    public void setDistributionController(InterfaceC20515r0 interfaceC20515r0) {
        if (interfaceC20515r0 == null) {
            interfaceC20515r0 = C20456p2.f76553w;
        }
        this.distributionController = interfaceC20515r0;
    }

    public void setDsn(String str) {
        String string = null;
        this.dsn = str != null ? str.trim() : null;
        this.parsedDsn.m56715b();
        String str2 = this.dsn;
        InterfaceC20602v0 interfaceC20602v0 = this.logger;
        Charset charset = AbstractC20591m.f77097a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(AbstractC20591m.f77097a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e5) {
                interfaceC20602v0.mo16060j(EnumC20436n5.INFO, "SHA-1 isn't available to calculate the hash.", e5);
            } catch (Throwable th3) {
                interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "string: %s could not calculate its hash", th3, str2);
            }
        }
        this.dsnHash = string;
    }

    public void setEnableAppStartProfiling(boolean z4) {
        this.enableAppStartProfiling = z4;
    }

    public void setEnableAutoSessionTracking(boolean z4) {
        this.enableAutoSessionTracking = z4;
    }

    public void setEnableBackpressureHandling(boolean z4) {
        this.enableBackpressureHandling = z4;
    }

    public void setEnableCacheTracing(boolean z4) {
        this.enableCacheTracing = z4;
    }

    public void setEnableDatabaseTransactionTracing(boolean z4) {
        this.enableDatabaseTransactionTracing = z4;
    }

    public void setEnableDeduplication(boolean z4) {
        this.enableDeduplication = z4;
    }

    public void setEnableEventSizeLimiting(boolean z4) {
        this.enableEventSizeLimiting = z4;
    }

    public void setEnableExternalConfiguration(boolean z4) {
        this.enableExternalConfiguration = z4;
    }

    public void setEnablePrettySerializationOutput(boolean z4) {
        this.enablePrettySerializationOutput = z4;
    }

    public void setEnableQueueTracing(boolean z4) {
        this.enableQueueTracing = z4;
    }

    public void setEnableScopePersistence(boolean z4) {
        this.enableScopePersistence = z4;
    }

    public void setEnableScreenTracking(boolean z4) {
        this.enableScreenTracking = z4;
    }

    public void setEnableShutdownHook(boolean z4) {
        this.enableShutdownHook = z4;
    }

    public void setEnableSpotlight(boolean z4) {
        this.enableSpotlight = z4;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z4) {
        this.enableTimeToFullDisplayTracing = z4;
    }

    public void setEnableUncaughtExceptionHandler(boolean z4) {
        this.enableUncaughtExceptionHandler = z4;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z4) {
        this.enableUserInteractionBreadcrumbs = z4;
    }

    public void setEnableUserInteractionTracing(boolean z4) {
        this.enableUserInteractionTracing = z4;
    }

    public void setEnabled(boolean z4) {
        this.enabled = z4;
    }

    public void setEnvelopeDiskCache(InterfaceC20281d interfaceC20281d) {
        if (interfaceC20281d == null) {
            interfaceC20281d = C20559i.f77031w;
        }
        this.envelopeDiskCache = interfaceC20281d;
    }

    public void setEnvelopeReader(InterfaceC20536s0 interfaceC20536s0) {
        C20584f c20584f = this.envelopeReader;
        if (interfaceC20536s0 == null) {
            interfaceC20536s0 = C20509q2.f76850a;
        }
        c20584f.m56716c(interfaceC20536s0);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(InterfaceC20347h1 interfaceC20347h1) {
        if (interfaceC20347h1 != null) {
            this.executorService = interfaceC20347h1;
        }
    }

    public void setFatalLogger(InterfaceC20602v0 interfaceC20602v0) {
        if (interfaceC20602v0 == null) {
            interfaceC20602v0 = C20546t2.f76998w;
        }
        this.fatalLogger = interfaceC20602v0;
    }

    public void setFeedbackOptions(C20372i5 c20372i5) {
        this.feedbackOptions = c20372i5;
    }

    public void setFlushTimeoutMillis(long j7) {
        this.flushTimeoutMillis = j7;
    }

    public void setForceInit(boolean z4) {
        this.forceInit = z4;
    }

    public void setFullyDisplayedReporter(C20325f0 c20325f0) {
        this.fullyDisplayedReporter = c20325f0;
    }

    public void setGestureTargetLocators(List<InterfaceC20379a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l7) {
        this.idleTimeout = l7;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new C20316e0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C20316e0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C20316e0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C20316e0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(EnumC20516r1 enumC20516r1) {
        this.initPriority = enumC20516r1;
    }

    @Deprecated
    public void setInstrumenter(EnumC20537s1 enumC20537s1) {
        this.instrumenter = enumC20537s1;
    }

    public void setLogger(InterfaceC20602v0 interfaceC20602v0) {
        InterfaceC20602v0 c5101l0;
        if (interfaceC20602v0 == null) {
            c5101l0 = C20546t2.f76998w;
        } else {
            c5101l0 = new C5101l0(this, interfaceC20602v0, false, 16);
        }
        this.logger = c5101l0;
    }

    public void setLogs(C20373i6 c20373i6) {
        this.logs = c20373i6;
    }

    public void setMaxAttachmentSize(long j7) {
        this.maxAttachmentSize = j7;
    }

    public void setMaxBreadcrumbs(int i13) {
        this.maxBreadcrumbs = i13;
    }

    public void setMaxCacheItems(int i13) {
        this.maxCacheItems = i13;
    }

    public void setMaxDepth(int i13) {
        this.maxDepth = i13;
    }

    public void setMaxFeatureFlags(int i13) {
        this.maxFeatureFlags = i13;
    }

    public void setMaxQueueSize(int i13) {
        if (i13 > 0) {
            this.maxQueueSize = i13;
        }
    }

    public void setMaxRequestBodySize(EnumC20447o6 enumC20447o6) {
        this.maxRequestBodySize = enumC20447o6;
    }

    public void setMaxSpans(int i13) {
        this.maxSpans = i13;
    }

    public void setMaxTraceFileSize(long j7) {
        this.maxTraceFileSize = j7;
    }

    public void setMetrics(C20395j6 c20395j6) {
        this.metrics = c20395j6;
    }

    public void setModulesLoader(InterfaceC20382a interfaceC20382a) {
        if (interfaceC20382a == null) {
            interfaceC20382a = C20386e.f76438a;
        }
        this.modulesLoader = interfaceC20382a;
    }

    public void setOnDiscard(InterfaceC20404k6 interfaceC20404k6) {
    }

    public void setOnOversizedEvent(InterfaceC20413l6 interfaceC20413l6) {
    }

    public void setOpenTelemetryMode(EnumC20644z5 enumC20644z5) {
        this.openTelemetryMode = enumC20644z5;
    }

    public void setOrgId(String str) {
        this.orgId = str;
    }

    public void setPrintUncaughtStackTrace(boolean z4) {
        this.printUncaughtStackTrace = z4;
    }

    public void setProfileLifecycle(EnumC20518r3 enumC20518r3) {
        this.profileLifecycle = enumC20518r3;
        if (enumC20518r3 != EnumC20518r3.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.mo16066m(EnumC20436n5.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d3) {
        if (AbstractC34132o.m107858C(d3, true)) {
            this.profileSessionSampleRate = d3;
            return;
        }
        throw new IllegalArgumentException("The value " + d3 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(InterfaceC20042a1 interfaceC20042a1) {
        this.profilerConverter = interfaceC20042a1;
    }

    public void setProfilesSampleRate(Double d3) {
        if (AbstractC34132o.m107858C(d3, true)) {
            this.profilesSampleRate = d3;
            return;
        }
        throw new IllegalArgumentException("The value " + d3 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(InterfaceC20425m6 interfaceC20425m6) {
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i13) {
        this.profilingTracesHz = i13;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z4) {
        this.propagateTraceparent = z4;
    }

    public void setProxy(C20437n6 c20437n6) {
        this.proxy = c20437n6;
    }

    public void setReadTimeoutMillis(int i13) {
        this.readTimeoutMillis = i13;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(InterfaceC20605v3 interfaceC20605v3) {
        if (interfaceC20605v3 == null) {
            interfaceC20605v3 = C20456p2.f76554x;
        }
        this.replayController = interfaceC20605v3;
    }

    public void setSampleRate(Double d3) {
        if (AbstractC34132o.m107858C(d3, true)) {
            this.sampleRate = d3;
            return;
        }
        throw new IllegalArgumentException("The value " + d3 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setScopesStorageFactory(InterfaceC20326f1 interfaceC20326f1) {
    }

    public void setSdkVersion(C20499t c20499t) {
        C20499t c20499t2 = getSessionReplay().f77071m;
        C20499t c20499t3 = this.sdkVersion;
        if (c20499t3 != null && c20499t2 != null && c20499t3.equals(c20499t2)) {
            getSessionReplay().f77071m = c20499t;
        }
        this.sdkVersion = c20499t;
    }

    public void setSendClientReports(boolean z4) {
        this.sendClientReports = z4;
        if (z4) {
            this.clientReportRecorder = new C5101l0(this);
        } else {
            this.clientReportRecorder = new C15556d(8);
        }
    }

    public void setSendDefaultPii(boolean z4) {
        this.sendDefaultPii = z4;
    }

    public void setSendModules(boolean z4) {
        this.sendModules = z4;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC20390j1 interfaceC20390j1) {
        C20584f c20584f = this.serializer;
        if (interfaceC20390j1 == null) {
            interfaceC20390j1 = C20273c3.f76122a;
        }
        c20584f.m56716c(interfaceC20390j1);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j7) {
        this.sessionFlushTimeoutMillis = j7;
    }

    public void setSessionReplay(C20578u6 c20578u6) {
        this.sessionReplay = c20578u6;
    }

    public void setSessionTrackingIntervalMillis(long j7) {
        this.sessionTrackingIntervalMillis = j7;
    }

    public void setShutdownTimeoutMillis(long j7) {
        this.shutdownTimeoutMillis = j7;
    }

    public void setSocketTagger(InterfaceC20399k1 interfaceC20399k1) {
        if (interfaceC20399k1 == null) {
            interfaceC20399k1 = C20310d3.f76263w;
        }
        this.socketTagger = interfaceC20399k1;
    }

    public void setSpanFactory(InterfaceC20420m1 interfaceC20420m1) {
        this.spanFactory = interfaceC20420m1;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z4) {
        this.startProfilerOnAppStart = z4;
    }

    public void setStrictTraceContinuation(boolean z4) {
        this.strictTraceContinuation = z4;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(InterfaceC20598a interfaceC20598a) {
        this.threadChecker = interfaceC20598a;
    }

    public void setTraceOptionsRequests(boolean z4) {
        this.traceOptionsRequests = z4;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z4) {
        this.traceSampling = z4;
    }

    public void setTracesSampleRate(Double d3) {
        if (AbstractC34132o.m107858C(d3, true)) {
            this.tracesSampleRate = d3;
            return;
        }
        throw new IllegalArgumentException("The value " + d3 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(InterfaceC20460p6 interfaceC20460p6) {
        this.tracesSampler = interfaceC20460p6;
    }

    public void setTransactionProfiler(InterfaceC20442o1 interfaceC20442o1) {
        if (this.transactionProfiler != C20456p2.f76555y || interfaceC20442o1 == null) {
            return;
        }
        this.transactionProfiler = interfaceC20442o1;
    }

    public void setTransportFactory(InterfaceC20455p1 interfaceC20455p1) {
        if (interfaceC20455p1 == null) {
            interfaceC20455p1 = C20349h3.f76370w;
        }
        this.transportFactory = interfaceC20455p1;
    }

    public void setTransportGate(InterfaceC20558h interfaceC20558h) {
        if (interfaceC20558h == null) {
            interfaceC20558h = C20561k.f77033a;
        }
        this.transportGate = interfaceC20558h;
    }

    public void setVersionDetector(InterfaceC20508q1 interfaceC20508q1) {
        this.versionDetector = interfaceC20508q1;
    }

    public void setViewHierarchyExporters(List<ComposeViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
