.class public Lio/sentry/q6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final DEFAULT_DIAGNOSTIC_LEVEL:Lio/sentry/n5;

.field private static final DEFAULT_ENVIRONMENT:Ljava/lang/String; = "production"

.field public static final DEFAULT_PROPAGATION_TARGETS:Ljava/lang/String; = ".*"

.field public static final MAX_EVENT_SIZE_BYTES:J = 0x100000L


# instance fields
.field private attachServerName:Z

.field private attachStacktrace:Z

.field private attachThreads:Z

.field private backpressureMonitor:Lio/sentry/backpressure/b;

.field private beforeBreadcrumb:Lio/sentry/b6;

.field private beforeEnvelopeCallback:Lio/sentry/c6;

.field private beforeSend:Lio/sentry/d6;

.field private beforeSendFeedback:Lio/sentry/d6;

.field private beforeSendReplay:Lio/sentry/e6;

.field private beforeSendTransaction:Lio/sentry/f6;

.field private final bundleIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private cacheDirPath:Ljava/lang/String;

.field private captureOpenTelemetryEvents:Z

.field clientReportRecorder:Lio/sentry/clientreport/g;

.field private compositePerformanceCollector:Lio/sentry/l;

.field private connectionStatusProvider:Lio/sentry/p0;

.field private connectionTimeoutMillis:I

.field private final contextTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private continuousProfiler:Lio/sentry/q0;

.field private cron:Lio/sentry/g6;

.field private final dateProvider:Lio/sentry/util/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/util/f;"
        }
    .end annotation
.end field

.field private deadlineTimeout:J

.field private debug:Z

.field private debugMetaLoader:Lio/sentry/internal/debugmeta/a;

.field private defaultScopeType:Lio/sentry/g4;

.field private final defaultTracePropagationTargets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private diagnosticLevel:Lio/sentry/n5;

.field private dist:Ljava/lang/String;

.field private distinctId:Ljava/lang/String;

.field private distribution:Lio/sentry/h6;

.field private distributionController:Lio/sentry/r0;

.field private dsn:Ljava/lang/String;

.field private dsnHash:Ljava/lang/String;

.field private enableAppStartProfiling:Z

.field private enableAutoSessionTracking:Z

.field private enableBackpressureHandling:Z

.field private enableCacheTracing:Z

.field private enableDatabaseTransactionTracing:Z

.field private enableDeduplication:Z

.field private enableEventSizeLimiting:Z

.field private enableExternalConfiguration:Z

.field private enablePrettySerializationOutput:Z

.field private enableQueueTracing:Z

.field private enableScopePersistence:Z

.field private enableScreenTracking:Z

.field private enableShutdownHook:Z

.field private enableSpotlight:Z

.field private enableTimeToFullDisplayTracing:Z

.field private enableUncaughtExceptionHandler:Z

.field private enableUserInteractionBreadcrumbs:Z

.field private enableUserInteractionTracing:Z

.field private enabled:Z

.field private envelopeDiskCache:Lio/sentry/cache/d;

.field private final envelopeReader:Lio/sentry/util/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/util/f;"
        }
    .end annotation
.end field

.field private environment:Ljava/lang/String;

.field private final eventProcessors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/b0;",
            ">;"
        }
    .end annotation
.end field

.field private executorService:Lio/sentry/h1;

.field private final experimental:Lio/sentry/c0;

.field private fatalLogger:Lio/sentry/v0;

.field private feedbackOptions:Lio/sentry/i5;

.field private flushTimeoutMillis:J

.field private forceInit:Z

.field private fullyDisplayedReporter:Lio/sentry/f0;

.field private final gestureTargetLocators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/internal/gestures/a;",
            ">;"
        }
    .end annotation
.end field

.field private globalHubMode:Ljava/lang/Boolean;

.field private idleTimeout:Ljava/lang/Long;

.field private ignoredCheckIns:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/e0;",
            ">;"
        }
    .end annotation
.end field

.field private ignoredErrors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/e0;",
            ">;"
        }
    .end annotation
.end field

.field private final ignoredExceptionsForType:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field

.field private ignoredSpanOrigins:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/e0;",
            ">;"
        }
    .end annotation
.end field

.field private ignoredTransactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/e0;",
            ">;"
        }
    .end annotation
.end field

.field private final inAppExcludes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final inAppIncludes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private initPriority:Lio/sentry/r1;

.field private instrumenter:Lio/sentry/s1;

.field private final integrations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/t1;",
            ">;"
        }
    .end annotation
.end field

.field private volatile internalTracesSampler:Lio/sentry/l7;

.field protected final lock:Lio/sentry/util/a;

.field private logger:Lio/sentry/v0;

.field private logs:Lio/sentry/i6;

.field private maxAttachmentSize:J

.field private maxBreadcrumbs:I

.field private maxCacheItems:I

.field private maxDepth:I

.field private maxFeatureFlags:I

.field private maxQueueSize:I

.field private maxRequestBodySize:Lio/sentry/o6;

.field private maxSpans:I

.field private maxTraceFileSize:J

.field private metrics:Lio/sentry/j6;

.field private modulesLoader:Lio/sentry/internal/modules/a;

.field private final observers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/c1;",
            ">;"
        }
    .end annotation
.end field

.field private onDiscard:Lio/sentry/k6;

.field private onOversizedEvent:Lio/sentry/l6;

.field private openTelemetryMode:Lio/sentry/z5;

.field private final optionsObservers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/w0;",
            ">;"
        }
    .end annotation
.end field

.field private orgId:Ljava/lang/String;

.field private final parsedDsn:Lio/sentry/util/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/util/f;"
        }
    .end annotation
.end field

.field private final performanceCollectors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/x0;",
            ">;"
        }
    .end annotation
.end field

.field private printUncaughtStackTrace:Z

.field private profileLifecycle:Lio/sentry/r3;

.field private profileSessionSampleRate:Ljava/lang/Double;

.field private profilerConverter:Lio/sentry/a1;

.field private profilesSampleRate:Ljava/lang/Double;

.field private profilesSampler:Lio/sentry/m6;

.field private profilingTracesDirPath:Ljava/lang/String;

.field private profilingTracesHz:I

.field private proguardUuid:Ljava/lang/String;

.field private propagateTraceparent:Z

.field private proxy:Lio/sentry/n6;

.field private readTimeoutMillis:I

.field private release:Ljava/lang/String;

.field private replayController:Lio/sentry/v3;

.field private sampleRate:Ljava/lang/Double;

.field private scopesStorageFactory:Lio/sentry/f1;

.field private sdkVersion:Lio/sentry/protocol/t;

.field private sendClientReports:Z

.field private sendDefaultPii:Z

.field private sendModules:Z

.field private sentryClientName:Ljava/lang/String;

.field private final serializer:Lio/sentry/util/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/util/f;"
        }
    .end annotation
.end field

.field private serverName:Ljava/lang/String;

.field private sessionFlushTimeoutMillis:J

.field private sessionReplay:Lio/sentry/u6;

.field private sessionTrackingIntervalMillis:J

.field private shutdownTimeoutMillis:J

.field private socketTagger:Lio/sentry/k1;

.field private spanFactory:Lio/sentry/m1;

.field private spotlightConnectionUrl:Ljava/lang/String;

.field private final spotlightIntegrationLoaded:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

.field private startProfilerOnAppStart:Z

.field private strictTraceContinuation:Z

.field private final tags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private threadChecker:Lio/sentry/util/thread/a;

.field private traceOptionsRequests:Z

.field private tracePropagationTargets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private traceSampling:Z

.field private tracesSampleRate:Ljava/lang/Double;

.field private tracesSampler:Lio/sentry/p6;

.field private transactionProfiler:Lio/sentry/o1;

.field private transportFactory:Lio/sentry/p1;

.field private transportGate:Lio/sentry/transport/h;

.field private versionDetector:Lio/sentry/q1;

.field private final viewHierarchyExporters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    sput-object v0, Lio/sentry/q6;->DEFAULT_DIAGNOSTIC_LEVEL:Lio/sentry/n5;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q6;->eventProcessors:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lio/sentry/q6;->ignoredExceptionsForType:Ljava/util/Set;

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/q6;->ignoredErrors:Ljava/util/List;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lio/sentry/q6;->integrations:Ljava/util/List;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, p0, Lio/sentry/q6;->bundleIds:Ljava/util/Set;

    new-instance v1, Lio/sentry/util/f;

    new-instance v2, Lio/sentry/a6;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/sentry/a6;-><init>(Lio/sentry/q6;I)V

    invoke-direct {v1, v2}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v1, p0, Lio/sentry/q6;->parsedDsn:Lio/sentry/util/f;

    const-wide/16 v1, 0x7d0

    iput-wide v1, p0, Lio/sentry/q6;->shutdownTimeoutMillis:J

    const-wide/16 v1, 0x3a98

    iput-wide v1, p0, Lio/sentry/q6;->flushTimeoutMillis:J

    iput-wide v1, p0, Lio/sentry/q6;->sessionFlushTimeoutMillis:J

    sget-object v1, Lio/sentry/t2;->w:Lio/sentry/t2;

    iput-object v1, p0, Lio/sentry/q6;->logger:Lio/sentry/v0;

    iput-object v1, p0, Lio/sentry/q6;->fatalLogger:Lio/sentry/v0;

    sget-object v2, Lio/sentry/q6;->DEFAULT_DIAGNOSTIC_LEVEL:Lio/sentry/n5;

    iput-object v2, p0, Lio/sentry/q6;->diagnosticLevel:Lio/sentry/n5;

    new-instance v2, Lio/sentry/util/f;

    new-instance v3, Lio/sentry/a6;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Lio/sentry/a6;-><init>(Lio/sentry/q6;I)V

    invoke-direct {v2, v3}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v2, p0, Lio/sentry/q6;->serializer:Lio/sentry/util/f;

    new-instance v2, Lio/sentry/util/f;

    new-instance v3, Lio/sentry/a6;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v4}, Lio/sentry/a6;-><init>(Lio/sentry/q6;I)V

    invoke-direct {v2, v3}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v2, p0, Lio/sentry/q6;->envelopeReader:Lio/sentry/util/f;

    const/16 v2, 0x64

    iput v2, p0, Lio/sentry/q6;->maxDepth:I

    const/16 v3, 0x1e

    iput v3, p0, Lio/sentry/q6;->maxCacheItems:I

    iput v3, p0, Lio/sentry/q6;->maxQueueSize:I

    iput v2, p0, Lio/sentry/q6;->maxBreadcrumbs:I

    iput v2, p0, Lio/sentry/q6;->maxFeatureFlags:I

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v2, p0, Lio/sentry/q6;->inAppExcludes:Ljava/util/List;

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v2, p0, Lio/sentry/q6;->inAppIncludes:Ljava/util/List;

    sget-object v2, Lio/sentry/h3;->w:Lio/sentry/h3;

    iput-object v2, p0, Lio/sentry/q6;->transportFactory:Lio/sentry/p1;

    sget-object v2, Lio/sentry/transport/k;->a:Lio/sentry/transport/k;

    iput-object v2, p0, Lio/sentry/q6;->transportGate:Lio/sentry/transport/h;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lio/sentry/q6;->attachStacktrace:Z

    iput-boolean v2, p0, Lio/sentry/q6;->enableAutoSessionTracking:Z

    const-wide/16 v3, 0x7530

    iput-wide v3, p0, Lio/sentry/q6;->sessionTrackingIntervalMillis:J

    iput-boolean v2, p0, Lio/sentry/q6;->attachServerName:Z

    iput-boolean v2, p0, Lio/sentry/q6;->enableUncaughtExceptionHandler:Z

    const/4 v5, 0x0

    iput-boolean v5, p0, Lio/sentry/q6;->printUncaughtStackTrace:Z

    sget-object v6, Lio/sentry/b3;->a:Lio/sentry/b3;

    iput-object v6, p0, Lio/sentry/q6;->executorService:Lio/sentry/h1;

    new-instance v6, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v6, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v6, p0, Lio/sentry/q6;->spotlightIntegrationLoaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v6, 0x7530

    iput v6, p0, Lio/sentry/q6;->connectionTimeoutMillis:I

    iput v6, p0, Lio/sentry/q6;->readTimeoutMillis:I

    sget-object v6, Lio/sentry/transport/i;->w:Lio/sentry/transport/i;

    iput-object v6, p0, Lio/sentry/q6;->envelopeDiskCache:Lio/sentry/cache/d;

    iput-boolean v5, p0, Lio/sentry/q6;->sendDefaultPii:Z

    new-instance v6, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->observers:Ljava/util/List;

    new-instance v6, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->optionsObservers:Ljava/util/List;

    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->tags:Ljava/util/Map;

    const-wide/32 v6, 0x1400000

    iput-wide v6, p0, Lio/sentry/q6;->maxAttachmentSize:J

    iput-boolean v2, p0, Lio/sentry/q6;->enableDeduplication:Z

    iput-boolean v5, p0, Lio/sentry/q6;->enableEventSizeLimiting:Z

    const/16 v6, 0x3e8

    iput v6, p0, Lio/sentry/q6;->maxSpans:I

    iput-boolean v2, p0, Lio/sentry/q6;->enableShutdownHook:Z

    sget-object v6, Lio/sentry/o6;->NONE:Lio/sentry/o6;

    iput-object v6, p0, Lio/sentry/q6;->maxRequestBodySize:Lio/sentry/o6;

    iput-boolean v2, p0, Lio/sentry/q6;->traceSampling:Z

    const-wide/32 v6, 0x500000

    iput-wide v6, p0, Lio/sentry/q6;->maxTraceFileSize:J

    sget-object v6, Lio/sentry/p2;->y:Lio/sentry/p2;

    iput-object v6, p0, Lio/sentry/q6;->transactionProfiler:Lio/sentry/o1;

    sget-object v6, Lio/sentry/o2;->w:Lio/sentry/o2;

    iput-object v6, p0, Lio/sentry/q6;->continuousProfiler:Lio/sentry/q0;

    sget-object v6, Lio/sentry/u2;->a:Lio/sentry/u2;

    iput-object v6, p0, Lio/sentry/q6;->profilerConverter:Lio/sentry/a1;

    iput-object v0, p0, Lio/sentry/q6;->tracePropagationTargets:Ljava/util/List;

    const-string v6, ".*"

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    iput-object v6, p0, Lio/sentry/q6;->defaultTracePropagationTargets:Ljava/util/List;

    iput-boolean v5, p0, Lio/sentry/q6;->propagateTraceparent:Z

    iput-boolean v5, p0, Lio/sentry/q6;->strictTraceContinuation:Z

    const-wide/16 v6, 0xbb8

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, p0, Lio/sentry/q6;->idleTimeout:Ljava/lang/Long;

    new-instance v6, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->contextTags:Ljava/util/List;

    iput-boolean v2, p0, Lio/sentry/q6;->sendClientReports:Z

    new-instance v6, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v6, p0}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/q6;)V

    iput-object v6, p0, Lio/sentry/q6;->clientReportRecorder:Lio/sentry/clientreport/g;

    sget-object v6, Lio/sentry/internal/modules/e;->a:Lio/sentry/internal/modules/e;

    iput-object v6, p0, Lio/sentry/q6;->modulesLoader:Lio/sentry/internal/modules/a;

    sget-object v6, Lio/sentry/internal/debugmeta/b;->w:Lio/sentry/internal/debugmeta/b;

    iput-object v6, p0, Lio/sentry/q6;->debugMetaLoader:Lio/sentry/internal/debugmeta/a;

    iput-boolean v5, p0, Lio/sentry/q6;->enableUserInteractionTracing:Z

    iput-boolean v2, p0, Lio/sentry/q6;->enableUserInteractionBreadcrumbs:Z

    sget-object v6, Lio/sentry/s1;->SENTRY:Lio/sentry/s1;

    iput-object v6, p0, Lio/sentry/q6;->instrumenter:Lio/sentry/s1;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->gestureTargetLocators:Ljava/util/List;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->viewHierarchyExporters:Ljava/util/List;

    sget-object v6, Lio/sentry/util/thread/b;->a:Lio/sentry/util/thread/b;

    iput-object v6, p0, Lio/sentry/q6;->threadChecker:Lio/sentry/util/thread/a;

    iput-boolean v2, p0, Lio/sentry/q6;->traceOptionsRequests:Z

    iput-boolean v5, p0, Lio/sentry/q6;->enableDatabaseTransactionTracing:Z

    iput-boolean v5, p0, Lio/sentry/q6;->enableCacheTracing:Z

    iput-boolean v5, p0, Lio/sentry/q6;->enableQueueTracing:Z

    new-instance v6, Lio/sentry/util/f;

    new-instance v7, Li5/c;

    const/16 v8, 0xd

    invoke-direct {v7, v8}, Li5/c;-><init>(I)V

    invoke-direct {v6, v7}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v6, p0, Lio/sentry/q6;->dateProvider:Lio/sentry/util/f;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->performanceCollectors:Ljava/util/List;

    sget-object v6, Lio/sentry/m2;->a:Lio/sentry/m2;

    iput-object v6, p0, Lio/sentry/q6;->compositePerformanceCollector:Lio/sentry/l;

    iput-boolean v5, p0, Lio/sentry/q6;->enableTimeToFullDisplayTracing:Z

    sget-object v6, Lio/sentry/f0;->b:Lio/sentry/f0;

    iput-object v6, p0, Lio/sentry/q6;->fullyDisplayedReporter:Lio/sentry/f0;

    new-instance v6, Lio/sentry/n2;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->connectionStatusProvider:Lio/sentry/p0;

    iput-boolean v2, p0, Lio/sentry/q6;->enabled:Z

    iput-boolean v2, p0, Lio/sentry/q6;->enablePrettySerializationOutput:Z

    iput-boolean v2, p0, Lio/sentry/q6;->sendModules:Z

    iput-boolean v5, p0, Lio/sentry/q6;->enableSpotlight:Z

    iput-boolean v2, p0, Lio/sentry/q6;->enableScopePersistence:Z

    iput-object v0, p0, Lio/sentry/q6;->ignoredCheckIns:Ljava/util/List;

    iput-object v0, p0, Lio/sentry/q6;->ignoredSpanOrigins:Ljava/util/List;

    iput-object v0, p0, Lio/sentry/q6;->ignoredTransactions:Ljava/util/List;

    sget-object v6, Lio/sentry/backpressure/c;->w:Lio/sentry/backpressure/c;

    iput-object v6, p0, Lio/sentry/q6;->backpressureMonitor:Lio/sentry/backpressure/b;

    iput-boolean v2, p0, Lio/sentry/q6;->enableBackpressureHandling:Z

    iput-boolean v5, p0, Lio/sentry/q6;->enableAppStartProfiling:Z

    sget-object v6, Lio/sentry/f3;->b:Lio/sentry/f3;

    iput-object v6, p0, Lio/sentry/q6;->spanFactory:Lio/sentry/m1;

    const/16 v6, 0x65

    iput v6, p0, Lio/sentry/q6;->profilingTracesHz:I

    iput-object v0, p0, Lio/sentry/q6;->cron:Lio/sentry/g6;

    sget-object v6, Lio/sentry/p2;->x:Lio/sentry/p2;

    iput-object v6, p0, Lio/sentry/q6;->replayController:Lio/sentry/v3;

    sget-object v6, Lio/sentry/p2;->w:Lio/sentry/p2;

    iput-object v6, p0, Lio/sentry/q6;->distributionController:Lio/sentry/r0;

    iput-boolean v2, p0, Lio/sentry/q6;->enableScreenTracking:Z

    sget-object v6, Lio/sentry/g4;->ISOLATION:Lio/sentry/g4;

    iput-object v6, p0, Lio/sentry/q6;->defaultScopeType:Lio/sentry/g4;

    sget-object v6, Lio/sentry/r1;->MEDIUM:Lio/sentry/r1;

    iput-object v6, p0, Lio/sentry/q6;->initPriority:Lio/sentry/r1;

    iput-boolean v5, p0, Lio/sentry/q6;->forceInit:Z

    iput-object v0, p0, Lio/sentry/q6;->globalHubMode:Ljava/lang/Boolean;

    new-instance v6, Lio/sentry/util/a;

    invoke-direct {v6}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->lock:Lio/sentry/util/a;

    sget-object v6, Lio/sentry/z5;->AUTO:Lio/sentry/z5;

    iput-object v6, p0, Lio/sentry/q6;->openTelemetryMode:Lio/sentry/z5;

    iput-boolean v5, p0, Lio/sentry/q6;->captureOpenTelemetryEvents:Z

    sget-object v6, Lio/sentry/i3;->w:Lio/sentry/i3;

    iput-object v6, p0, Lio/sentry/q6;->versionDetector:Lio/sentry/q1;

    sget-object v6, Lio/sentry/r3;->MANUAL:Lio/sentry/r3;

    iput-object v6, p0, Lio/sentry/q6;->profileLifecycle:Lio/sentry/r3;

    iput-boolean v5, p0, Lio/sentry/q6;->startProfilerOnAppStart:Z

    iput-wide v3, p0, Lio/sentry/q6;->deadlineTimeout:J

    new-instance v6, Lio/sentry/i6;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-boolean v5, v6, Lio/sentry/i6;->a:Z

    new-instance v7, Lio/sentry/logger/c;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-object v7, v6, Lio/sentry/i6;->b:Lio/sentry/logger/b;

    iput-object v6, p0, Lio/sentry/q6;->logs:Lio/sentry/i6;

    new-instance v6, Lio/sentry/j6;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, v6, Lio/sentry/j6;->a:Z

    new-instance v7, Lio/sentry/hints/j;

    const/16 v8, 0x1d

    invoke-direct {v7, v8}, Lio/sentry/hints/j;-><init>(I)V

    iput-object v7, v6, Lio/sentry/j6;->b:Lio/sentry/metrics/b;

    iput-object v6, p0, Lio/sentry/q6;->metrics:Lio/sentry/j6;

    sget-object v6, Lio/sentry/d3;->w:Lio/sentry/d3;

    iput-object v6, p0, Lio/sentry/q6;->socketTagger:Lio/sentry/k1;

    new-instance v6, Lio/sentry/h6;

    invoke-direct {v6}, Lio/sentry/h6;-><init>()V

    iput-object v6, p0, Lio/sentry/q6;->distribution:Lio/sentry/h6;

    new-instance v6, Lio/sentry/protocol/t;

    const-string v7, "sentry.java"

    const-string v8, "8.41.0"

    invoke-direct {v6, v7, v8}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v8, v6, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    new-instance v7, Lio/sentry/c0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-object v7, p0, Lio/sentry/q6;->experimental:Lio/sentry/c0;

    new-instance v7, Lio/sentry/u6;

    invoke-direct {v7}, Li63/j;-><init>()V

    iput-boolean v5, v7, Lio/sentry/u6;->d:Z

    sget-object v9, Lio/sentry/t6;->MEDIUM:Lio/sentry/t6;

    iput-object v9, v7, Lio/sentry/u6;->g:Lio/sentry/t6;

    iput v2, v7, Lio/sentry/u6;->h:I

    iput-wide v3, v7, Lio/sentry/u6;->i:J

    const-wide/16 v3, 0x1388

    iput-wide v3, v7, Lio/sentry/u6;->j:J

    const-wide/32 v3, 0x36ee80

    iput-wide v3, v7, Lio/sentry/u6;->k:J

    iput-boolean v2, v7, Lio/sentry/u6;->l:Z

    iput-boolean v5, v7, Lio/sentry/u6;->n:Z

    sget-object v3, Lio/sentry/j4;->PIXEL_COPY:Lio/sentry/j4;

    iput-object v3, v7, Lio/sentry/u6;->o:Lio/sentry/j4;

    iput-boolean v5, v7, Lio/sentry/u6;->p:Z

    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v3, v7, Lio/sentry/u6;->q:Ljava/util/List;

    iput-object v3, v7, Lio/sentry/u6;->r:Ljava/util/List;

    iput-boolean v2, v7, Lio/sentry/u6;->s:Z

    sget-object v3, Lio/sentry/u6;->v:Ljava/util/List;

    iput-object v3, v7, Lio/sentry/u6;->t:Ljava/util/List;

    iput-object v3, v7, Lio/sentry/u6;->u:Ljava/util/List;

    if-nez p1, :cond_0

    iget-object v3, v7, Li63/j;->b:Ljava/io/Serializable;

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v4, "android.widget.TextView"

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object v3, v7, Li63/j;->b:Ljava/io/Serializable;

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v4, "android.widget.ImageView"

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object v3, v7, Li63/j;->b:Ljava/io/Serializable;

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v4, "android.webkit.WebView"

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object v3, v7, Li63/j;->b:Ljava/io/Serializable;

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v4, "android.widget.VideoView"

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object v3, v7, Li63/j;->b:Ljava/io/Serializable;

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v4, "androidx.camera.view.PreviewView"

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object v3, v7, Li63/j;->b:Ljava/io/Serializable;

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v4, "androidx.media3.ui.PlayerView"

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object v3, v7, Li63/j;->b:Ljava/io/Serializable;

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v4, "com.google.android.exoplayer2.ui.PlayerView"

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iget-object v3, v7, Li63/j;->b:Ljava/io/Serializable;

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v4, "com.google.android.exoplayer2.ui.StyledPlayerView"

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iput-object v6, v7, Lio/sentry/u6;->m:Lio/sentry/protocol/t;

    :cond_0
    iput-object v7, p0, Lio/sentry/q6;->sessionReplay:Lio/sentry/u6;

    new-instance v3, Lio/sentry/i5;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-boolean v5, v3, Lio/sentry/i5;->a:Z

    iput-boolean v2, v3, Lio/sentry/i5;->b:Z

    iput-boolean v5, v3, Lio/sentry/i5;->c:Z

    iput-boolean v2, v3, Lio/sentry/i5;->d:Z

    iput-boolean v2, v3, Lio/sentry/i5;->e:Z

    iput-boolean v2, v3, Lio/sentry/i5;->f:Z

    iput-boolean v5, v3, Lio/sentry/i5;->g:Z

    iput-object v3, p0, Lio/sentry/q6;->feedbackOptions:Lio/sentry/i5;

    if-nez p1, :cond_3

    sget-boolean p1, Lio/sentry/util/i;->a:Z

    if-nez p1, :cond_1

    const-string p1, "io.sentry.opentelemetry.OtelSpanFactory"

    invoke-static {v1, p1}, Lqt/e;->h(Lio/sentry/v0;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1, p1}, Lqt/e;->o(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    instance-of v0, p1, Lio/sentry/m1;

    if-eqz v0, :cond_1

    check-cast p1, Lio/sentry/m1;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    new-instance p1, Lio/sentry/f3;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lio/sentry/f3;-><init>(I)V

    :goto_0
    invoke-virtual {p0, p1}, Lio/sentry/q6;->setSpanFactory(Lio/sentry/m1;)V

    iget-object p1, p0, Lio/sentry/q6;->integrations:Ljava/util/List;

    new-instance v0, Lio/sentry/UncaughtExceptionHandlerIntegration;

    invoke-direct {v0}, Lio/sentry/UncaughtExceptionHandlerIntegration;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/sentry/q6;->integrations:Ljava/util/List;

    new-instance v0, Lio/sentry/ShutdownHookIntegration;

    invoke-direct {v0}, Lio/sentry/ShutdownHookIntegration;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/sentry/q6;->eventProcessors:Ljava/util/List;

    new-instance v0, Lio/sentry/j2;

    invoke-direct {v0, p0}, Lio/sentry/j2;-><init>(Lio/sentry/q6;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/sentry/q6;->eventProcessors:Ljava/util/List;

    new-instance v0, Lio/sentry/n;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/sentry/n;-><init>(Lio/sentry/q6;I)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-boolean p1, Lio/sentry/util/i;->a:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lio/sentry/q6;->eventProcessors:Ljava/util/List;

    new-instance v0, Lio/sentry/v6;

    invoke-direct {v0}, Lio/sentry/v6;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    const-string p1, "sentry.java/8.41.0"

    invoke-virtual {p0, p1}, Lio/sentry/q6;->setSentryClientName(Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lio/sentry/q6;->setSdkVersion(Lio/sentry/protocol/t;)V

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object p1

    const-string v0, "maven:io.sentry:sentry"

    invoke-virtual {p1, v0, v8}, Lio/sentry/l5;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public static synthetic a(Lio/sentry/q6;)Lio/sentry/y;
    .locals 1

    new-instance v0, Lio/sentry/y;

    iget-object p0, p0, Lio/sentry/q6;->dsn:Ljava/lang/String;

    invoke-direct {v0, p0}, Lio/sentry/y;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic b(Lio/sentry/q6;)Lio/sentry/z;
    .locals 1

    new-instance v0, Lio/sentry/z;

    iget-object p0, p0, Lio/sentry/q6;->serializer:Lio/sentry/util/f;

    invoke-virtual {p0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/sentry/j1;

    invoke-direct {v0, p0}, Lio/sentry/z;-><init>(Lio/sentry/j1;)V

    return-object v0
.end method

.method public static empty()Lio/sentry/q6;
    .locals 2

    new-instance v0, Lio/sentry/q6;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/sentry/q6;-><init>(Z)V

    return-object v0
.end method


# virtual methods
.method public activate()V
    .locals 3

    iget-object v0, p0, Lio/sentry/q6;->executorService:Lio/sentry/h1;

    instance-of v0, v0, Lio/sentry/b3;

    if-eqz v0, :cond_0

    new-instance v0, Lio/sentry/h5;

    invoke-direct {v0, p0}, Lio/sentry/h5;-><init>(Lio/sentry/q6;)V

    iput-object v0, p0, Lio/sentry/q6;->executorService:Lio/sentry/h1;

    invoke-interface {v0}, Lio/sentry/h1;->b()V

    :cond_0
    iget-object v0, p0, Lio/sentry/q6;->spotlightIntegrationLoaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    const-string v0, "io.sentry.spotlight.SpotlightIntegration"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/q6;->integrations:Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/t1;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method public addBundleId(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/q6;->bundleIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public addContextTag(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->contextTags:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addEventProcessor(Lio/sentry/b0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->eventProcessors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredCheckIn(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/q6;->ignoredCheckIns:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q6;->ignoredCheckIns:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lio/sentry/q6;->ignoredCheckIns:Ljava/util/List;

    new-instance v1, Lio/sentry/e0;

    invoke-direct {v1, p1}, Lio/sentry/e0;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredError(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/q6;->ignoredErrors:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q6;->ignoredErrors:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lio/sentry/q6;->ignoredErrors:Ljava/util/List;

    new-instance v1, Lio/sentry/e0;

    invoke-direct {v1, p1}, Lio/sentry/e0;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredExceptionForType(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->ignoredExceptionsForType:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredSpanOrigin(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/q6;->ignoredSpanOrigins:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q6;->ignoredSpanOrigins:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lio/sentry/q6;->ignoredSpanOrigins:Ljava/util/List;

    new-instance v1, Lio/sentry/e0;

    invoke-direct {v1, p1}, Lio/sentry/e0;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredTransaction(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/q6;->ignoredTransactions:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q6;->ignoredTransactions:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lio/sentry/q6;->ignoredTransactions:Ljava/util/List;

    new-instance v1, Lio/sentry/e0;

    invoke-direct {v1, p1}, Lio/sentry/e0;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addInAppExclude(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->inAppExcludes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addInAppInclude(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->inAppIncludes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIntegration(Lio/sentry/t1;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->integrations:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addOptionsObserver(Lio/sentry/w0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->optionsObservers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addPerformanceCollector(Lio/sentry/x0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->performanceCollectors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addScopeObserver(Lio/sentry/c1;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->observers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public containsIgnoredExceptionForType(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->ignoredExceptionsForType:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public findPersistingScopeObserver()Lio/sentry/cache/f;
    .locals 3

    iget-object v0, p0, Lio/sentry/q6;->observers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/c1;

    instance-of v2, v1, Lio/sentry/cache/f;

    if-eqz v2, :cond_0

    check-cast v1, Lio/sentry/cache/f;

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getBackpressureMonitor()Lio/sentry/backpressure/b;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->backpressureMonitor:Lio/sentry/backpressure/b;

    return-object v0
.end method

.method public getBeforeBreadcrumb()Lio/sentry/b6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->beforeBreadcrumb:Lio/sentry/b6;

    return-object v0
.end method

.method public getBeforeEnvelopeCallback()Lio/sentry/c6;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBeforeSend()Lio/sentry/d6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->beforeSend:Lio/sentry/d6;

    return-object v0
.end method

.method public getBeforeSendFeedback()Lio/sentry/d6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->beforeSendFeedback:Lio/sentry/d6;

    return-object v0
.end method

.method public getBeforeSendReplay()Lio/sentry/e6;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBeforeSendTransaction()Lio/sentry/f6;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBundleIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->bundleIds:Ljava/util/Set;

    return-object v0
.end method

.method public getCacheDirPath()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/sentry/q6;->cacheDirPath:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/q6;->dsnHash:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/sentry/q6;->cacheDirPath:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/q6;->dsnHash:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/q6;->cacheDirPath:Ljava/lang/String;

    return-object v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCacheDirPathWithoutDsn()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->cacheDirPath:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/q6;->cacheDirPath:Ljava/lang/String;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getClientReportRecorder()Lio/sentry/clientreport/g;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->clientReportRecorder:Lio/sentry/clientreport/g;

    return-object v0
.end method

.method public getCompositePerformanceCollector()Lio/sentry/l;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->compositePerformanceCollector:Lio/sentry/l;

    return-object v0
.end method

.method public getConnectionStatusProvider()Lio/sentry/p0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->connectionStatusProvider:Lio/sentry/p0;

    return-object v0
.end method

.method public getConnectionTimeoutMillis()I
    .locals 1

    iget v0, p0, Lio/sentry/q6;->connectionTimeoutMillis:I

    return v0
.end method

.method public getContextTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->contextTags:Ljava/util/List;

    return-object v0
.end method

.method public getContinuousProfiler()Lio/sentry/q0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->continuousProfiler:Lio/sentry/q0;

    return-object v0
.end method

.method public getCron()Lio/sentry/g6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->cron:Lio/sentry/g6;

    return-object v0
.end method

.method public getDateProvider()Lio/sentry/v4;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->dateProvider:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/v4;

    return-object v0
.end method

.method public getDeadlineTimeout()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/q6;->deadlineTimeout:J

    return-wide v0
.end method

.method public getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->debugMetaLoader:Lio/sentry/internal/debugmeta/a;

    return-object v0
.end method

.method public getDefaultScopeType()Lio/sentry/g4;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->defaultScopeType:Lio/sentry/g4;

    return-object v0
.end method

.method public getDiagnosticLevel()Lio/sentry/n5;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->diagnosticLevel:Lio/sentry/n5;

    return-object v0
.end method

.method public getDist()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->dist:Ljava/lang/String;

    return-object v0
.end method

.method public getDistinctId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->distinctId:Ljava/lang/String;

    return-object v0
.end method

.method public getDistribution()Lio/sentry/h6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->distribution:Lio/sentry/h6;

    return-object v0
.end method

.method public getDistributionController()Lio/sentry/r0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->distributionController:Lio/sentry/r0;

    return-object v0
.end method

.method public getDsn()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->dsn:Ljava/lang/String;

    return-object v0
.end method

.method public getEffectiveOrgId()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/sentry/q6;->orgId:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/q6;->retrieveParsedDsn()Lio/sentry/y;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/y;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getEnvelopeDiskCache()Lio/sentry/cache/d;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->envelopeDiskCache:Lio/sentry/cache/d;

    return-object v0
.end method

.method public getEnvelopeReader()Lio/sentry/s0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->envelopeReader:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/s0;

    return-object v0
.end method

.method public getEnvironment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->environment:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "production"

    return-object v0
.end method

.method public getEventProcessors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/b0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->eventProcessors:Ljava/util/List;

    return-object v0
.end method

.method public getExecutorService()Lio/sentry/h1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->executorService:Lio/sentry/h1;

    return-object v0
.end method

.method public getExperimental()Lio/sentry/c0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->experimental:Lio/sentry/c0;

    return-object v0
.end method

.method public getFatalLogger()Lio/sentry/v0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->fatalLogger:Lio/sentry/v0;

    return-object v0
.end method

.method public getFeedbackOptions()Lio/sentry/i5;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->feedbackOptions:Lio/sentry/i5;

    return-object v0
.end method

.method public getFlushTimeoutMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/q6;->flushTimeoutMillis:J

    return-wide v0
.end method

.method public getFullyDisplayedReporter()Lio/sentry/f0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->fullyDisplayedReporter:Lio/sentry/f0;

    return-object v0
.end method

.method public getGestureTargetLocators()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/internal/gestures/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->gestureTargetLocators:Ljava/util/List;

    return-object v0
.end method

.method public getIdleTimeout()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->idleTimeout:Ljava/lang/Long;

    return-object v0
.end method

.method public getIgnoredCheckIns()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/e0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->ignoredCheckIns:Ljava/util/List;

    return-object v0
.end method

.method public getIgnoredErrors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/e0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->ignoredErrors:Ljava/util/List;

    return-object v0
.end method

.method public getIgnoredExceptionsForType()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->ignoredExceptionsForType:Ljava/util/Set;

    return-object v0
.end method

.method public getIgnoredSpanOrigins()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/e0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->ignoredSpanOrigins:Ljava/util/List;

    return-object v0
.end method

.method public getIgnoredTransactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/e0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->ignoredTransactions:Ljava/util/List;

    return-object v0
.end method

.method public getInAppExcludes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->inAppExcludes:Ljava/util/List;

    return-object v0
.end method

.method public getInAppIncludes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->inAppIncludes:Ljava/util/List;

    return-object v0
.end method

.method public getInitPriority()Lio/sentry/r1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->initPriority:Lio/sentry/r1;

    return-object v0
.end method

.method public getInstrumenter()Lio/sentry/s1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->instrumenter:Lio/sentry/s1;

    return-object v0
.end method

.method public getIntegrations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/t1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->integrations:Ljava/util/List;

    return-object v0
.end method

.method public getInternalTracesSampler()Lio/sentry/l7;
    .locals 2

    iget-object v0, p0, Lio/sentry/q6;->internalTracesSampler:Lio/sentry/l7;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/sentry/q6;->lock:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/q6;->internalTracesSampler:Lio/sentry/l7;

    if-nez v1, :cond_0

    new-instance v1, Lio/sentry/l7;

    invoke-direct {v1, p0}, Lio/sentry/l7;-><init>(Lio/sentry/q6;)V

    iput-object v1, p0, Lio/sentry/q6;->internalTracesSampler:Lio/sentry/l7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    goto :goto_3

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    :cond_1
    :goto_3
    iget-object v0, p0, Lio/sentry/q6;->internalTracesSampler:Lio/sentry/l7;

    return-object v0
.end method

.method public getLogger()Lio/sentry/v0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->logger:Lio/sentry/v0;

    return-object v0
.end method

.method public getLogs()Lio/sentry/i6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->logs:Lio/sentry/i6;

    return-object v0
.end method

.method public getMaxAttachmentSize()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/q6;->maxAttachmentSize:J

    return-wide v0
.end method

.method public getMaxBreadcrumbs()I
    .locals 1

    iget v0, p0, Lio/sentry/q6;->maxBreadcrumbs:I

    return v0
.end method

.method public getMaxCacheItems()I
    .locals 1

    iget v0, p0, Lio/sentry/q6;->maxCacheItems:I

    return v0
.end method

.method public getMaxDepth()I
    .locals 1

    iget v0, p0, Lio/sentry/q6;->maxDepth:I

    return v0
.end method

.method public getMaxFeatureFlags()I
    .locals 1

    iget v0, p0, Lio/sentry/q6;->maxFeatureFlags:I

    return v0
.end method

.method public getMaxQueueSize()I
    .locals 1

    iget v0, p0, Lio/sentry/q6;->maxQueueSize:I

    return v0
.end method

.method public getMaxRequestBodySize()Lio/sentry/o6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->maxRequestBodySize:Lio/sentry/o6;

    return-object v0
.end method

.method public getMaxSpans()I
    .locals 1

    iget v0, p0, Lio/sentry/q6;->maxSpans:I

    return v0
.end method

.method public getMaxTraceFileSize()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/q6;->maxTraceFileSize:J

    return-wide v0
.end method

.method public getMetrics()Lio/sentry/j6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->metrics:Lio/sentry/j6;

    return-object v0
.end method

.method public getModulesLoader()Lio/sentry/internal/modules/a;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->modulesLoader:Lio/sentry/internal/modules/a;

    return-object v0
.end method

.method public getOnDiscard()Lio/sentry/k6;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOnOversizedEvent()Lio/sentry/l6;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOpenTelemetryMode()Lio/sentry/z5;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->openTelemetryMode:Lio/sentry/z5;

    return-object v0
.end method

.method public getOptionsObservers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/w0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->optionsObservers:Ljava/util/List;

    return-object v0
.end method

.method public getOrgId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->orgId:Ljava/lang/String;

    return-object v0
.end method

.method public getOutboxPath()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/File;

    const-string v2, "outbox"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPerformanceCollectors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/x0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->performanceCollectors:Ljava/util/List;

    return-object v0
.end method

.method public getProfileLifecycle()Lio/sentry/r3;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->profileLifecycle:Lio/sentry/r3;

    return-object v0
.end method

.method public getProfileSessionSampleRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->profileSessionSampleRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getProfilerConverter()Lio/sentry/a1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->profilerConverter:Lio/sentry/a1;

    return-object v0
.end method

.method public getProfilesSampleRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->profilesSampleRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getProfilesSampler()Lio/sentry/m6;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getProfilingTracesDirPath()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/sentry/q6;->profilingTracesDirPath:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/sentry/q6;->dsnHash:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/sentry/q6;->profilingTracesDirPath:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/q6;->dsnHash:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/q6;->profilingTracesDirPath:Ljava/lang/String;

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return-object v0

    :cond_2
    new-instance v1, Ljava/io/File;

    const-string v2, "profiling_traces"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getProfilingTracesHz()I
    .locals 1

    iget v0, p0, Lio/sentry/q6;->profilingTracesHz:I

    return v0
.end method

.method public getProguardUuid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->proguardUuid:Ljava/lang/String;

    return-object v0
.end method

.method public getProxy()Lio/sentry/n6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->proxy:Lio/sentry/n6;

    return-object v0
.end method

.method public getReadTimeoutMillis()I
    .locals 1

    iget v0, p0, Lio/sentry/q6;->readTimeoutMillis:I

    return v0
.end method

.method public getRelease()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->release:Ljava/lang/String;

    return-object v0
.end method

.method public getReplayController()Lio/sentry/v3;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->replayController:Lio/sentry/v3;

    return-object v0
.end method

.method public getSampleRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->sampleRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getScopeObservers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/c1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->observers:Ljava/util/List;

    return-object v0
.end method

.method public getScopesStorageFactory()Lio/sentry/f1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSdkVersion()Lio/sentry/protocol/t;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->sdkVersion:Lio/sentry/protocol/t;

    return-object v0
.end method

.method public getSentryClientName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->sentryClientName:Ljava/lang/String;

    return-object v0
.end method

.method public getSerializer()Lio/sentry/j1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->serializer:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/j1;

    return-object v0
.end method

.method public getServerName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->serverName:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionFlushTimeoutMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/q6;->sessionFlushTimeoutMillis:J

    return-wide v0
.end method

.method public getSessionReplay()Lio/sentry/u6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->sessionReplay:Lio/sentry/u6;

    return-object v0
.end method

.method public getSessionTrackingIntervalMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/q6;->sessionTrackingIntervalMillis:J

    return-wide v0
.end method

.method public getShutdownTimeoutMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/q6;->shutdownTimeoutMillis:J

    return-wide v0
.end method

.method public getSocketTagger()Lio/sentry/k1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->socketTagger:Lio/sentry/k1;

    return-object v0
.end method

.method public getSpanFactory()Lio/sentry/m1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->spanFactory:Lio/sentry/m1;

    return-object v0
.end method

.method public getSpotlightConnectionUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->spotlightConnectionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public getTags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->tags:Ljava/util/Map;

    return-object v0
.end method

.method public getThreadChecker()Lio/sentry/util/thread/a;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->threadChecker:Lio/sentry/util/thread/a;

    return-object v0
.end method

.method public getTracePropagationTargets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->tracePropagationTargets:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/q6;->defaultTracePropagationTargets:Ljava/util/List;

    :cond_0
    return-object v0
.end method

.method public getTracesSampleRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->tracesSampleRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getTracesSampler()Lio/sentry/p6;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->tracesSampler:Lio/sentry/p6;

    return-object v0
.end method

.method public getTransactionProfiler()Lio/sentry/o1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->transactionProfiler:Lio/sentry/o1;

    return-object v0
.end method

.method public getTransportFactory()Lio/sentry/p1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->transportFactory:Lio/sentry/p1;

    return-object v0
.end method

.method public getTransportGate()Lio/sentry/transport/h;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->transportGate:Lio/sentry/transport/h;

    return-object v0
.end method

.method public getVersionDetector()Lio/sentry/q1;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->versionDetector:Lio/sentry/q1;

    return-object v0
.end method

.method public final getViewHierarchyExporters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->viewHierarchyExporters:Ljava/util/List;

    return-object v0
.end method

.method public isAttachServerName()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->attachServerName:Z

    return v0
.end method

.method public isAttachStacktrace()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->attachStacktrace:Z

    return v0
.end method

.method public isAttachThreads()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->attachThreads:Z

    return v0
.end method

.method public isCaptureOpenTelemetryEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->captureOpenTelemetryEvents:Z

    return v0
.end method

.method public isContinuousProfilingEnabled()Z
    .locals 4

    iget-object v0, p0, Lio/sentry/q6;->profilesSampleRate:Ljava/lang/Double;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/q6;->profileSessionSampleRate:Ljava/lang/Double;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isDebug()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->debug:Z

    return v0
.end method

.method public isEnableAppStartProfiling()Z
    .locals 1

    invoke-virtual {p0}, Lio/sentry/q6;->isProfilingEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/q6;->isContinuousProfilingEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lio/sentry/q6;->enableAppStartProfiling:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isEnableAutoSessionTracking()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableAutoSessionTracking:Z

    return v0
.end method

.method public isEnableBackpressureHandling()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableBackpressureHandling:Z

    return v0
.end method

.method public isEnableCacheTracing()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableCacheTracing:Z

    return v0
.end method

.method public isEnableDatabaseTransactionTracing()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableDatabaseTransactionTracing:Z

    return v0
.end method

.method public isEnableDeduplication()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableDeduplication:Z

    return v0
.end method

.method public isEnableEventSizeLimiting()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableEventSizeLimiting:Z

    return v0
.end method

.method public isEnableExternalConfiguration()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableExternalConfiguration:Z

    return v0
.end method

.method public isEnablePrettySerializationOutput()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enablePrettySerializationOutput:Z

    return v0
.end method

.method public isEnableQueueTracing()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableQueueTracing:Z

    return v0
.end method

.method public isEnableScopePersistence()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableScopePersistence:Z

    return v0
.end method

.method public isEnableScreenTracking()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableScreenTracking:Z

    return v0
.end method

.method public isEnableShutdownHook()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableShutdownHook:Z

    return v0
.end method

.method public isEnableSpotlight()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableSpotlight:Z

    return v0
.end method

.method public isEnableTimeToFullDisplayTracing()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableTimeToFullDisplayTracing:Z

    return v0
.end method

.method public isEnableUncaughtExceptionHandler()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableUncaughtExceptionHandler:Z

    return v0
.end method

.method public isEnableUserInteractionBreadcrumbs()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableUserInteractionBreadcrumbs:Z

    return v0
.end method

.method public isEnableUserInteractionTracing()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enableUserInteractionTracing:Z

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->enabled:Z

    return v0
.end method

.method public isForceInit()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->forceInit:Z

    return v0
.end method

.method public isGlobalHubMode()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->globalHubMode:Ljava/lang/Boolean;

    return-object v0
.end method

.method public isPrintUncaughtStackTrace()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->printUncaughtStackTrace:Z

    return v0
.end method

.method public isProfilingEnabled()Z
    .locals 4

    iget-object v0, p0, Lio/sentry/q6;->profilesSampleRate:Ljava/lang/Double;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public isPropagateTraceparent()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->propagateTraceparent:Z

    return v0
.end method

.method public isSendClientReports()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->sendClientReports:Z

    return v0
.end method

.method public isSendDefaultPii()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->sendDefaultPii:Z

    return v0
.end method

.method public isSendModules()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->sendModules:Z

    return v0
.end method

.method public isStartProfilerOnAppStart()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->startProfilerOnAppStart:Z

    return v0
.end method

.method public isStrictTraceContinuation()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->strictTraceContinuation:Z

    return v0
.end method

.method public isTraceOptionsRequests()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->traceOptionsRequests:Z

    return v0
.end method

.method public isTraceSampling()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/q6;->traceSampling:Z

    return v0
.end method

.method public isTracingEnabled()Z
    .locals 1

    invoke-virtual {p0}, Lio/sentry/q6;->getTracesSampleRate()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/sentry/q6;->getTracesSampler()Lio/sentry/p6;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public loadLazyFields()V
    .locals 0

    invoke-virtual {p0}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    invoke-virtual {p0}, Lio/sentry/q6;->retrieveParsedDsn()Lio/sentry/y;

    invoke-virtual {p0}, Lio/sentry/q6;->getEnvelopeReader()Lio/sentry/s0;

    invoke-virtual {p0}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    return-void
.end method

.method public merge(Lio/sentry/d0;)V
    .locals 4

    invoke-virtual {p1}, Lio/sentry/d0;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/sentry/d0;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setDsn(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lio/sentry/d0;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/sentry/d0;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnvironment(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lio/sentry/d0;->A()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lio/sentry/d0;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setRelease(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lio/sentry/d0;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lio/sentry/d0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setDist(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p1}, Lio/sentry/d0;->D()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lio/sentry/d0;->D()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setServerName(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p1}, Lio/sentry/d0;->z()Lio/sentry/n6;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lio/sentry/d0;->z()Lio/sentry/n6;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setProxy(Lio/sentry/n6;)V

    :cond_5
    invoke-virtual {p1}, Lio/sentry/d0;->i()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lio/sentry/d0;->i()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnableUncaughtExceptionHandler(Z)V

    :cond_6
    invoke-virtual {p1}, Lio/sentry/d0;->t()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lio/sentry/d0;->t()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setPrintUncaughtStackTrace(Z)V

    :cond_7
    invoke-virtual {p1}, Lio/sentry/d0;->B()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lio/sentry/d0;->B()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setSampleRate(Ljava/lang/Double;)V

    :cond_8
    invoke-virtual {p1}, Lio/sentry/d0;->J()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lio/sentry/d0;->J()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setTracesSampleRate(Ljava/lang/Double;)V

    :cond_9
    invoke-virtual {p1}, Lio/sentry/d0;->w()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lio/sentry/d0;->w()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setProfilesSampleRate(Ljava/lang/Double;)V

    :cond_a
    invoke-virtual {p1}, Lio/sentry/d0;->e()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Lio/sentry/d0;->e()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setDebug(Z)V

    :cond_b
    invoke-virtual {p1}, Lio/sentry/d0;->h()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lio/sentry/d0;->h()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnableDeduplication(Z)V

    :cond_c
    invoke-virtual {p1}, Lio/sentry/d0;->C()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Lio/sentry/d0;->C()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setSendClientReports(Z)V

    :cond_d
    invoke-virtual {p1}, Lio/sentry/d0;->U()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Lio/sentry/d0;->U()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setForceInit(Z)V

    :cond_e
    new-instance v0, Ljava/util/HashMap;

    invoke-virtual {p1}, Lio/sentry/d0;->H()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p0, Lio/sentry/q6;->tags:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_f
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lio/sentry/d0;->q()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/q6;->addInAppInclude(Ljava/lang/String;)V

    goto :goto_1

    :cond_10
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lio/sentry/d0;->p()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/q6;->addInAppExclude(Ljava/lang/String;)V

    goto :goto_2

    :cond_11
    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p1}, Lio/sentry/d0;->n()Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {p0, v1}, Lio/sentry/q6;->addIgnoredExceptionForType(Ljava/lang/Class;)V

    goto :goto_3

    :cond_12
    invoke-virtual {p1}, Lio/sentry/d0;->I()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lio/sentry/d0;->I()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setTracePropagationTargets(Ljava/util/List;)V

    :cond_13
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lio/sentry/d0;->c()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/q6;->addContextTag(Ljava/lang/String;)V

    goto :goto_4

    :cond_14
    invoke-virtual {p1}, Lio/sentry/d0;->y()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {p1}, Lio/sentry/d0;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setProguardUuid(Ljava/lang/String;)V

    :cond_15
    invoke-virtual {p1}, Lio/sentry/d0;->k()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {p1}, Lio/sentry/d0;->k()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setIdleTimeout(Ljava/lang/Long;)V

    :cond_16
    invoke-virtual {p1}, Lio/sentry/d0;->F()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {p1}, Lio/sentry/d0;->F()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lio/sentry/q6;->setShutdownTimeoutMillis(J)V

    :cond_17
    invoke-virtual {p1}, Lio/sentry/d0;->E()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual {p1}, Lio/sentry/d0;->E()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lio/sentry/q6;->setSessionFlushTimeoutMillis(J)V

    :cond_18
    invoke-virtual {p1}, Lio/sentry/d0;->b()Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/q6;->addBundleId(Ljava/lang/String;)V

    goto :goto_5

    :cond_19
    invoke-virtual {p1}, Lio/sentry/d0;->T()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-virtual {p1}, Lio/sentry/d0;->T()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnabled(Z)V

    :cond_1a
    invoke-virtual {p1}, Lio/sentry/d0;->Q()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lio/sentry/d0;->Q()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnablePrettySerializationOutput(Z)V

    :cond_1b
    invoke-virtual {p1}, Lio/sentry/d0;->X()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {p1}, Lio/sentry/d0;->X()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setSendModules(Z)V

    :cond_1c
    invoke-virtual {p1}, Lio/sentry/d0;->l()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1d

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lio/sentry/d0;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setIgnoredCheckIns(Ljava/util/List;)V

    :cond_1d
    invoke-virtual {p1}, Lio/sentry/d0;->o()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1e

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lio/sentry/d0;->o()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setIgnoredTransactions(Ljava/util/List;)V

    :cond_1e
    invoke-virtual {p1}, Lio/sentry/d0;->m()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1f

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lio/sentry/d0;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setIgnoredErrors(Ljava/util/List;)V

    :cond_1f
    invoke-virtual {p1}, Lio/sentry/d0;->L()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {p1}, Lio/sentry/d0;->L()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnableBackpressureHandling(Z)V

    :cond_20
    invoke-virtual {p1}, Lio/sentry/d0;->N()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {p1}, Lio/sentry/d0;->N()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnableDatabaseTransactionTracing(Z)V

    :cond_21
    invoke-virtual {p1}, Lio/sentry/d0;->M()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {p1}, Lio/sentry/d0;->M()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnableCacheTracing(Z)V

    :cond_22
    invoke-virtual {p1}, Lio/sentry/d0;->R()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-virtual {p1}, Lio/sentry/d0;->R()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnableQueueTracing(Z)V

    :cond_23
    invoke-virtual {p1}, Lio/sentry/d0;->r()Lio/sentry/o6;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual {p1}, Lio/sentry/d0;->r()Lio/sentry/o6;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setMaxRequestBodySize(Lio/sentry/o6;)V

    :cond_24
    invoke-virtual {p1}, Lio/sentry/d0;->W()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-virtual {p1}, Lio/sentry/d0;->W()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setSendDefaultPii(Z)V

    :cond_25
    invoke-virtual {p1}, Lio/sentry/d0;->K()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-virtual {p1}, Lio/sentry/d0;->K()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setCaptureOpenTelemetryEvents(Z)V

    :cond_26
    invoke-virtual {p1}, Lio/sentry/d0;->S()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_27

    invoke-virtual {p1}, Lio/sentry/d0;->S()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setEnableSpotlight(Z)V

    :cond_27
    invoke-virtual {p1}, Lio/sentry/d0;->G()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_28

    invoke-virtual {p1}, Lio/sentry/d0;->G()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setSpotlightConnectionUrl(Ljava/lang/String;)V

    :cond_28
    invoke-virtual {p1}, Lio/sentry/d0;->V()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-virtual {p1}, Lio/sentry/d0;->V()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setGlobalHubMode(Ljava/lang/Boolean;)V

    :cond_29
    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {p0}, Lio/sentry/q6;->getCron()Lio/sentry/g6;

    move-result-object v0

    if-nez v0, :cond_2a

    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setCron(Lio/sentry/g6;)V

    goto/16 :goto_6

    :cond_2a
    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/g6;->a()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2b

    invoke-virtual {p0}, Lio/sentry/q6;->getCron()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/g6;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/g6;->f(Ljava/lang/Long;)V

    :cond_2b
    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/g6;->c()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2c

    invoke-virtual {p0}, Lio/sentry/q6;->getCron()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/g6;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/g6;->h(Ljava/lang/Long;)V

    :cond_2c
    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/g6;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2d

    invoke-virtual {p0}, Lio/sentry/q6;->getCron()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/g6;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/g6;->j(Ljava/lang/String;)V

    :cond_2d
    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/g6;->b()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2e

    invoke-virtual {p0}, Lio/sentry/q6;->getCron()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/g6;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/g6;->g(Ljava/lang/Long;)V

    :cond_2e
    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/g6;->d()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {p0}, Lio/sentry/q6;->getCron()Lio/sentry/g6;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/d0;->d()Lio/sentry/g6;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/g6;->d()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/g6;->i(Ljava/lang/Long;)V

    :cond_2f
    :goto_6
    invoke-virtual {p1}, Lio/sentry/d0;->O()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_30

    invoke-virtual {p0}, Lio/sentry/q6;->getLogs()Lio/sentry/i6;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/d0;->O()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/i6;->a:Z

    :cond_30
    invoke-virtual {p1}, Lio/sentry/d0;->P()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_31

    invoke-virtual {p0}, Lio/sentry/q6;->getMetrics()Lio/sentry/j6;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/d0;->P()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/j6;->a:Z

    :cond_31
    invoke-virtual {p1}, Lio/sentry/d0;->v()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_32

    invoke-virtual {p1}, Lio/sentry/d0;->v()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    :cond_32
    invoke-virtual {p1}, Lio/sentry/d0;->x()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_33

    invoke-virtual {p1}, Lio/sentry/d0;->x()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setProfilingTracesDirPath(Ljava/lang/String;)V

    :cond_33
    invoke-virtual {p1}, Lio/sentry/d0;->u()Lio/sentry/r3;

    move-result-object v0

    if-eqz v0, :cond_34

    invoke-virtual {p1}, Lio/sentry/d0;->u()Lio/sentry/r3;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setProfileLifecycle(Lio/sentry/r3;)V

    :cond_34
    invoke-virtual {p1}, Lio/sentry/d0;->Y()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_35

    invoke-virtual {p1}, Lio/sentry/d0;->Y()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setStrictTraceContinuation(Z)V

    :cond_35
    invoke-virtual {p1}, Lio/sentry/d0;->s()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_36

    invoke-virtual {p1}, Lio/sentry/d0;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/sentry/q6;->setOrgId(Ljava/lang/String;)V

    :cond_36
    return-void
.end method

.method public retrieveParsedDsn()Lio/sentry/y;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->parsedDsn:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/y;

    return-object v0
.end method

.method public setAttachServerName(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->attachServerName:Z

    return-void
.end method

.method public setAttachStacktrace(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->attachStacktrace:Z

    return-void
.end method

.method public setAttachThreads(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->attachThreads:Z

    return-void
.end method

.method public setBackpressureMonitor(Lio/sentry/backpressure/b;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->backpressureMonitor:Lio/sentry/backpressure/b;

    return-void
.end method

.method public setBeforeBreadcrumb(Lio/sentry/b6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->beforeBreadcrumb:Lio/sentry/b6;

    return-void
.end method

.method public setBeforeEnvelopeCallback(Lio/sentry/c6;)V
    .locals 0

    return-void
.end method

.method public setBeforeSend(Lio/sentry/d6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->beforeSend:Lio/sentry/d6;

    return-void
.end method

.method public setBeforeSendFeedback(Lio/sentry/d6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->beforeSendFeedback:Lio/sentry/d6;

    return-void
.end method

.method public setBeforeSendReplay(Lio/sentry/e6;)V
    .locals 0

    return-void
.end method

.method public setBeforeSendTransaction(Lio/sentry/f6;)V
    .locals 0

    return-void
.end method

.method public setCacheDirPath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->cacheDirPath:Ljava/lang/String;

    return-void
.end method

.method public setCaptureOpenTelemetryEvents(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->captureOpenTelemetryEvents:Z

    return-void
.end method

.method public setCompositePerformanceCollector(Lio/sentry/l;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->compositePerformanceCollector:Lio/sentry/l;

    return-void
.end method

.method public setConnectionStatusProvider(Lio/sentry/p0;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->connectionStatusProvider:Lio/sentry/p0;

    return-void
.end method

.method public setConnectionTimeoutMillis(I)V
    .locals 0

    iput p1, p0, Lio/sentry/q6;->connectionTimeoutMillis:I

    return-void
.end method

.method public setContinuousProfiler(Lio/sentry/q0;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/q6;->continuousProfiler:Lio/sentry/q0;

    sget-object v1, Lio/sentry/o2;->w:Lio/sentry/o2;

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lio/sentry/q6;->continuousProfiler:Lio/sentry/q0;

    :cond_0
    return-void
.end method

.method public setCron(Lio/sentry/g6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->cron:Lio/sentry/g6;

    return-void
.end method

.method public setDateProvider(Lio/sentry/v4;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->dateProvider:Lio/sentry/util/f;

    invoke-virtual {v0, p1}, Lio/sentry/util/f;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public setDeadlineTimeout(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/q6;->deadlineTimeout:J

    return-void
.end method

.method public setDebug(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->debug:Z

    return-void
.end method

.method public setDebugMetaLoader(Lio/sentry/internal/debugmeta/a;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/internal/debugmeta/b;->w:Lio/sentry/internal/debugmeta/b;

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->debugMetaLoader:Lio/sentry/internal/debugmeta/a;

    return-void
.end method

.method public setDefaultScopeType(Lio/sentry/g4;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->defaultScopeType:Lio/sentry/g4;

    return-void
.end method

.method public setDiagnosticLevel(Lio/sentry/n5;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/q6;->DEFAULT_DIAGNOSTIC_LEVEL:Lio/sentry/n5;

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->diagnosticLevel:Lio/sentry/n5;

    return-void
.end method

.method public setDist(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->dist:Ljava/lang/String;

    return-void
.end method

.method public setDistinctId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->distinctId:Ljava/lang/String;

    return-void
.end method

.method public setDistribution(Lio/sentry/h6;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lio/sentry/h6;

    invoke-direct {p1}, Lio/sentry/h6;-><init>()V

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->distribution:Lio/sentry/h6;

    return-void
.end method

.method public setDistributionController(Lio/sentry/r0;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/p2;->w:Lio/sentry/p2;

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->distributionController:Lio/sentry/r0;

    return-void
.end method

.method public setDsn(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->dsn:Ljava/lang/String;

    iget-object p1, p0, Lio/sentry/q6;->parsedDsn:Lio/sentry/util/f;

    invoke-virtual {p1}, Lio/sentry/util/f;->b()V

    iget-object p1, p0, Lio/sentry/q6;->dsn:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/q6;->logger:Lio/sentry/v0;

    sget-object v2, Lio/sentry/util/m;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_3

    :cond_1
    :try_start_0
    const-string v2, "SHA-1"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    sget-object v3, Lio/sentry/util/m;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2

    new-instance v3, Ljava/math/BigInteger;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v4, 0x10

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v2

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :goto_1
    sget-object v3, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "string: %s could not calculate its hash"

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v3, v4, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :goto_2
    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "SHA-1 isn\'t available to calculate the hash."

    invoke-interface {v1, v2, v3, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    iput-object v0, p0, Lio/sentry/q6;->dsnHash:Ljava/lang/String;

    return-void
.end method

.method public setEnableAppStartProfiling(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableAppStartProfiling:Z

    return-void
.end method

.method public setEnableAutoSessionTracking(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableAutoSessionTracking:Z

    return-void
.end method

.method public setEnableBackpressureHandling(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableBackpressureHandling:Z

    return-void
.end method

.method public setEnableCacheTracing(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableCacheTracing:Z

    return-void
.end method

.method public setEnableDatabaseTransactionTracing(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableDatabaseTransactionTracing:Z

    return-void
.end method

.method public setEnableDeduplication(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableDeduplication:Z

    return-void
.end method

.method public setEnableEventSizeLimiting(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableEventSizeLimiting:Z

    return-void
.end method

.method public setEnableExternalConfiguration(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableExternalConfiguration:Z

    return-void
.end method

.method public setEnablePrettySerializationOutput(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enablePrettySerializationOutput:Z

    return-void
.end method

.method public setEnableQueueTracing(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableQueueTracing:Z

    return-void
.end method

.method public setEnableScopePersistence(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableScopePersistence:Z

    return-void
.end method

.method public setEnableScreenTracking(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableScreenTracking:Z

    return-void
.end method

.method public setEnableShutdownHook(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableShutdownHook:Z

    return-void
.end method

.method public setEnableSpotlight(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableSpotlight:Z

    return-void
.end method

.method public setEnableTimeToFullDisplayTracing(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableTimeToFullDisplayTracing:Z

    return-void
.end method

.method public setEnableUncaughtExceptionHandler(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableUncaughtExceptionHandler:Z

    return-void
.end method

.method public setEnableUserInteractionBreadcrumbs(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableUserInteractionBreadcrumbs:Z

    return-void
.end method

.method public setEnableUserInteractionTracing(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enableUserInteractionTracing:Z

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->enabled:Z

    return-void
.end method

.method public setEnvelopeDiskCache(Lio/sentry/cache/d;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/transport/i;->w:Lio/sentry/transport/i;

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->envelopeDiskCache:Lio/sentry/cache/d;

    return-void
.end method

.method public setEnvelopeReader(Lio/sentry/s0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->envelopeReader:Lio/sentry/util/f;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/q2;->a:Lio/sentry/q2;

    :goto_0
    invoke-virtual {v0, p1}, Lio/sentry/util/f;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public setEnvironment(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->environment:Ljava/lang/String;

    return-void
.end method

.method public setExecutorService(Lio/sentry/h1;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lio/sentry/q6;->executorService:Lio/sentry/h1;

    :cond_0
    return-void
.end method

.method public setFatalLogger(Lio/sentry/v0;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lio/sentry/t2;->w:Lio/sentry/t2;

    :cond_0
    iput-object p1, p0, Lio/sentry/q6;->fatalLogger:Lio/sentry/v0;

    return-void
.end method

.method public setFeedbackOptions(Lio/sentry/i5;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->feedbackOptions:Lio/sentry/i5;

    return-void
.end method

.method public setFlushTimeoutMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/q6;->flushTimeoutMillis:J

    return-void
.end method

.method public setForceInit(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->forceInit:Z

    return-void
.end method

.method public setFullyDisplayedReporter(Lio/sentry/f0;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->fullyDisplayedReporter:Lio/sentry/f0;

    return-void
.end method

.method public setGestureTargetLocators(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/sentry/internal/gestures/a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->gestureTargetLocators:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/sentry/q6;->gestureTargetLocators:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setGlobalHubMode(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->globalHubMode:Ljava/lang/Boolean;

    return-void
.end method

.method public setIdleTimeout(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->idleTimeout:Ljava/lang/Long;

    return-void
.end method

.method public setIgnoredCheckIns(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/q6;->ignoredCheckIns:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/e0;

    invoke-direct {v2, v1}, Lio/sentry/e0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/q6;->ignoredCheckIns:Ljava/util/List;

    return-void
.end method

.method public setIgnoredErrors(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/q6;->ignoredErrors:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/e0;

    invoke-direct {v2, v1}, Lio/sentry/e0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/q6;->ignoredErrors:Ljava/util/List;

    return-void
.end method

.method public setIgnoredSpanOrigins(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/q6;->ignoredSpanOrigins:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/e0;

    invoke-direct {v2, v1}, Lio/sentry/e0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/q6;->ignoredSpanOrigins:Ljava/util/List;

    return-void
.end method

.method public setIgnoredTransactions(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/q6;->ignoredTransactions:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/e0;

    invoke-direct {v2, v1}, Lio/sentry/e0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/q6;->ignoredTransactions:Ljava/util/List;

    return-void
.end method

.method public setInitPriority(Lio/sentry/r1;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->initPriority:Lio/sentry/r1;

    return-void
.end method

.method public setInstrumenter(Lio/sentry/s1;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lio/sentry/q6;->instrumenter:Lio/sentry/s1;

    return-void
.end method

.method public setLogger(Lio/sentry/v0;)V
    .locals 3

    if-nez p1, :cond_0

    sget-object p1, Lio/sentry/t2;->w:Lio/sentry/t2;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->logger:Lio/sentry/v0;

    return-void
.end method

.method public setLogs(Lio/sentry/i6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->logs:Lio/sentry/i6;

    return-void
.end method

.method public setMaxAttachmentSize(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/q6;->maxAttachmentSize:J

    return-void
.end method

.method public setMaxBreadcrumbs(I)V
    .locals 0

    iput p1, p0, Lio/sentry/q6;->maxBreadcrumbs:I

    return-void
.end method

.method public setMaxCacheItems(I)V
    .locals 0

    iput p1, p0, Lio/sentry/q6;->maxCacheItems:I

    return-void
.end method

.method public setMaxDepth(I)V
    .locals 0

    iput p1, p0, Lio/sentry/q6;->maxDepth:I

    return-void
.end method

.method public setMaxFeatureFlags(I)V
    .locals 0

    iput p1, p0, Lio/sentry/q6;->maxFeatureFlags:I

    return-void
.end method

.method public setMaxQueueSize(I)V
    .locals 0

    if-lez p1, :cond_0

    iput p1, p0, Lio/sentry/q6;->maxQueueSize:I

    :cond_0
    return-void
.end method

.method public setMaxRequestBodySize(Lio/sentry/o6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->maxRequestBodySize:Lio/sentry/o6;

    return-void
.end method

.method public setMaxSpans(I)V
    .locals 0

    iput p1, p0, Lio/sentry/q6;->maxSpans:I

    return-void
.end method

.method public setMaxTraceFileSize(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/q6;->maxTraceFileSize:J

    return-void
.end method

.method public setMetrics(Lio/sentry/j6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->metrics:Lio/sentry/j6;

    return-void
.end method

.method public setModulesLoader(Lio/sentry/internal/modules/a;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/internal/modules/e;->a:Lio/sentry/internal/modules/e;

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->modulesLoader:Lio/sentry/internal/modules/a;

    return-void
.end method

.method public setOnDiscard(Lio/sentry/k6;)V
    .locals 0

    return-void
.end method

.method public setOnOversizedEvent(Lio/sentry/l6;)V
    .locals 0

    return-void
.end method

.method public setOpenTelemetryMode(Lio/sentry/z5;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->openTelemetryMode:Lio/sentry/z5;

    return-void
.end method

.method public setOrgId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->orgId:Ljava/lang/String;

    return-void
.end method

.method public setPrintUncaughtStackTrace(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->printUncaughtStackTrace:Z

    return-void
.end method

.method public setProfileLifecycle(Lio/sentry/r3;)V
    .locals 3

    iput-object p1, p0, Lio/sentry/q6;->profileLifecycle:Lio/sentry/r3;

    sget-object v0, Lio/sentry/r3;->TRACE:Lio/sentry/r3;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/q6;->isTracingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/sentry/q6;->logger:Lio/sentry/v0;

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public setProfileSessionSampleRate(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/q6;->profileSessionSampleRate:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use values between 0.0 and 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setProfilerConverter(Lio/sentry/a1;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->profilerConverter:Lio/sentry/a1;

    return-void
.end method

.method public setProfilesSampleRate(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/q6;->profilesSampleRate:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use null to disable or values between 0.0 and 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setProfilesSampler(Lio/sentry/m6;)V
    .locals 0

    return-void
.end method

.method public setProfilingTracesDirPath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->profilingTracesDirPath:Ljava/lang/String;

    return-void
.end method

.method public setProfilingTracesHz(I)V
    .locals 0

    iput p1, p0, Lio/sentry/q6;->profilingTracesHz:I

    return-void
.end method

.method public setProguardUuid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->proguardUuid:Ljava/lang/String;

    return-void
.end method

.method public setPropagateTraceparent(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->propagateTraceparent:Z

    return-void
.end method

.method public setProxy(Lio/sentry/n6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->proxy:Lio/sentry/n6;

    return-void
.end method

.method public setReadTimeoutMillis(I)V
    .locals 0

    iput p1, p0, Lio/sentry/q6;->readTimeoutMillis:I

    return-void
.end method

.method public setRelease(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->release:Ljava/lang/String;

    return-void
.end method

.method public setReplayController(Lio/sentry/v3;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/p2;->x:Lio/sentry/p2;

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->replayController:Lio/sentry/v3;

    return-void
.end method

.method public setSampleRate(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/q6;->sampleRate:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use null to disable or values >= 0.0 and <= 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setScopesStorageFactory(Lio/sentry/f1;)V
    .locals 0

    return-void
.end method

.method public setSdkVersion(Lio/sentry/protocol/t;)V
    .locals 2

    invoke-virtual {p0}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/u6;->m:Lio/sentry/protocol/t;

    iget-object v1, p0, Lio/sentry/q6;->sdkVersion:Lio/sentry/protocol/t;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Lio/sentry/protocol/t;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iput-object p1, v0, Lio/sentry/u6;->m:Lio/sentry/protocol/t;

    :cond_0
    iput-object p1, p0, Lio/sentry/q6;->sdkVersion:Lio/sentry/protocol/t;

    return-void
.end method

.method public setSendClientReports(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/sentry/q6;->sendClientReports:Z

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {p1, p0}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/q6;)V

    iput-object p1, p0, Lio/sentry/q6;->clientReportRecorder:Lio/sentry/clientreport/g;

    return-void

    :cond_0
    new-instance p1, Lg73/d;

    const/16 v0, 0x8

    invoke-direct {p1, v0}, Lg73/d;-><init>(I)V

    iput-object p1, p0, Lio/sentry/q6;->clientReportRecorder:Lio/sentry/clientreport/g;

    return-void
.end method

.method public setSendDefaultPii(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->sendDefaultPii:Z

    return-void
.end method

.method public setSendModules(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->sendModules:Z

    return-void
.end method

.method public setSentryClientName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->sentryClientName:Ljava/lang/String;

    return-void
.end method

.method public setSerializer(Lio/sentry/j1;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/q6;->serializer:Lio/sentry/util/f;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/c3;->a:Lio/sentry/c3;

    :goto_0
    invoke-virtual {v0, p1}, Lio/sentry/util/f;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public setServerName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->serverName:Ljava/lang/String;

    return-void
.end method

.method public setSessionFlushTimeoutMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/q6;->sessionFlushTimeoutMillis:J

    return-void
.end method

.method public setSessionReplay(Lio/sentry/u6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->sessionReplay:Lio/sentry/u6;

    return-void
.end method

.method public setSessionTrackingIntervalMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/q6;->sessionTrackingIntervalMillis:J

    return-void
.end method

.method public setShutdownTimeoutMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/q6;->shutdownTimeoutMillis:J

    return-void
.end method

.method public setSocketTagger(Lio/sentry/k1;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/d3;->w:Lio/sentry/d3;

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->socketTagger:Lio/sentry/k1;

    return-void
.end method

.method public setSpanFactory(Lio/sentry/m1;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->spanFactory:Lio/sentry/m1;

    return-void
.end method

.method public setSpotlightConnectionUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->spotlightConnectionUrl:Ljava/lang/String;

    return-void
.end method

.method public setSslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    return-void
.end method

.method public setStartProfilerOnAppStart(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->startProfilerOnAppStart:Z

    return-void
.end method

.method public setStrictTraceContinuation(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->strictTraceContinuation:Z

    return-void
.end method

.method public setTag(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lio/sentry/q6;->tags:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    iget-object v0, p0, Lio/sentry/q6;->tags:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setThreadChecker(Lio/sentry/util/thread/a;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->threadChecker:Lio/sentry/util/thread/a;

    return-void
.end method

.method public setTraceOptionsRequests(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/q6;->traceOptionsRequests:Z

    return-void
.end method

.method public setTracePropagationTargets(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/q6;->tracePropagationTargets:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/q6;->tracePropagationTargets:Ljava/util/List;

    return-void
.end method

.method public setTraceSampling(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Lio/sentry/q6;->traceSampling:Z

    return-void
.end method

.method public setTracesSampleRate(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/q6;->tracesSampleRate:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use null to disable or values between 0.0 and 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setTracesSampler(Lio/sentry/p6;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->tracesSampler:Lio/sentry/p6;

    return-void
.end method

.method public setTransactionProfiler(Lio/sentry/o1;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/q6;->transactionProfiler:Lio/sentry/o1;

    sget-object v1, Lio/sentry/p2;->y:Lio/sentry/p2;

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lio/sentry/q6;->transactionProfiler:Lio/sentry/o1;

    :cond_0
    return-void
.end method

.method public setTransportFactory(Lio/sentry/p1;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/h3;->w:Lio/sentry/h3;

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->transportFactory:Lio/sentry/p1;

    return-void
.end method

.method public setTransportGate(Lio/sentry/transport/h;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/transport/k;->a:Lio/sentry/transport/k;

    :goto_0
    iput-object p1, p0, Lio/sentry/q6;->transportGate:Lio/sentry/transport/h;

    return-void
.end method

.method public setVersionDetector(Lio/sentry/q1;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/q6;->versionDetector:Lio/sentry/q1;

    return-void
.end method

.method public setViewHierarchyExporters(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/q6;->viewHierarchyExporters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/sentry/q6;->viewHierarchyExporters:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
