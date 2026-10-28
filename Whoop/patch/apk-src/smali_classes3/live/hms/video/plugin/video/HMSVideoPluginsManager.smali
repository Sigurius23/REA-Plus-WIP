.class public final Llive/hms/video/plugin/video/HMSVideoPluginsManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/plugin/video/HMSVideoPluginsManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0008\u0005*\u0001K\u0008\u0000\u0018\u0000 N2\u00020\u0001:\u0001NB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001e\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\u00082\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u001f\u0010\u0016J\u0015\u0010 \u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008 \u0010!J\u0013\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\"\u00a2\u0006\u0004\u0008#\u0010$J\u001d\u0010\'\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(J\r\u0010)\u001a\u00020\u0008\u00a2\u0006\u0004\u0008)\u0010\nJ\u0015\u0010+\u001a\u00020\u00082\u0006\u0010*\u001a\u00020\u000f\u00a2\u0006\u0004\u0008+\u0010,J\u0015\u0010.\u001a\u00020\u00082\u0006\u0010-\u001a\u00020\u0002\u00a2\u0006\u0004\u0008.\u0010/R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u0010/R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0016\u00109\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u001c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00170\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\"\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u001c\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010<R\"\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020A0=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010?R\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020%0=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010?R\"\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010?R\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0016\u0010H\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u00105R\"\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008I\u0010?R\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010?R\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010M\u00a8\u0006O"
    }
    d2 = {
        "Llive/hms/video/plugin/video/HMSVideoPluginsManager;",
        "",
        "Lhms/webrtc/VideoSource;",
        "source",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "eventsService",
        "<init>",
        "(Lhms/webrtc/VideoSource;Llive/hms/video/events/AnalyticsEventsService;)V",
        "Ll83/a0;",
        "setVideoProcessor",
        "()V",
        "Llive/hms/video/plugin/video/HMSVideoPlugin;",
        "plugin",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "resultListener",
        "",
        "pluginFrameRate",
        "addPluginInternal",
        "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V",
        "Lhms/webrtc/VideoFrame;",
        "frame",
        "processFramesThroughPlugins",
        "(Lhms/webrtc/VideoFrame;)V",
        "",
        "name",
        "removePluginEntry",
        "(Ljava/lang/String;)V",
        "",
        "checkIfSkipRequired",
        "(Ljava/lang/String;)Z",
        "addPlugin",
        "pluginsProcessing",
        "removePlugin",
        "(Llive/hms/video/plugin/video/HMSVideoPlugin;)V",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "getPlugins",
        "()Ljava/util/concurrent/CopyOnWriteArrayList;",
        "",
        "timeTakenWithML",
        "checkIfPluginFpsChangeNeeded",
        "(Ljava/lang/String;J)V",
        "clean",
        "inputFps",
        "setInputFps",
        "(I)V",
        "localCameraVideoSource",
        "updateCameraSource",
        "(Lhms/webrtc/VideoSource;)V",
        "Lhms/webrtc/VideoSource;",
        "getSource",
        "()Lhms/webrtc/VideoSource;",
        "setSource",
        "setProcessor",
        "Z",
        "Lhms/webrtc/VideoSink;",
        "localSink",
        "Lhms/webrtc/VideoSink;",
        "inputFrameRate",
        "I",
        "plugins",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "pluginsMap",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "pluginsObjectList",
        "",
        "pluginsAvgProcessingTime",
        "pluginsProcessingTimeExceedsSafeLimitCount",
        "pluginsFrameRateList",
        "Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;",
        "analytics",
        "Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;",
        "pluginAddInProgress",
        "pluginNumFramesToSkip",
        "pluginNumFramesSkipped",
        "live/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1",
        "pluginResultListener",
        "Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/plugin/video/HMSVideoPluginsManager$Companion;

.field public static final MAX_CONSEQUENT_TIME_VALUE:I = 0x1e

.field public static final TAG:Ljava/lang/String; = "HMSVideoPluginsManager"


# instance fields
.field private analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

.field private inputFrameRate:I

.field private localSink:Lhms/webrtc/VideoSink;

.field private pluginAddInProgress:Z

.field private pluginNumFramesSkipped:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private pluginNumFramesToSkip:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final pluginResultListener:Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;

.field private plugins:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private pluginsAvgProcessingTime:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private pluginsMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/plugin/video/HMSVideoPlugin;",
            ">;"
        }
    .end annotation
.end field

.field private pluginsObjectList:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Llive/hms/video/plugin/video/HMSVideoPlugin;",
            ">;"
        }
    .end annotation
.end field

.field private pluginsProcessingTimeExceedsSafeLimitCount:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private setProcessor:Z

.field private source:Lhms/webrtc/VideoSource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/plugin/video/HMSVideoPluginsManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->Companion:Llive/hms/video/plugin/video/HMSVideoPluginsManager$Companion;

    return-void
.end method

.method public constructor <init>(Lhms/webrtc/VideoSource;Llive/hms/video/events/AnalyticsEventsService;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventsService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->source:Lhms/webrtc/VideoSource;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->plugins:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsMap:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsObjectList:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsAvgProcessingTime:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsProcessingTimeExceedsSafeLimitCount:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    invoke-direct {p1, p2}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;-><init>(Llive/hms/video/events/AnalyticsEventsService;)V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesToSkip:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesSkipped:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;

    invoke-direct {p1, p0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;-><init>(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginResultListener:Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;

    return-void
.end method

.method public static synthetic a(Llive/hms/video/plugin/video/HMSVideoPlugin;Lhms/webrtc/VideoFrame;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->processFramesThroughPlugins$lambda$0(Llive/hms/video/plugin/video/HMSVideoPlugin;Lhms/webrtc/VideoFrame;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAnalytics$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;
    .locals 0

    iget-object p0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    return-object p0
.end method

.method public static final synthetic access$getLocalSink$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Lhms/webrtc/VideoSink;
    .locals 0

    iget-object p0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->localSink:Lhms/webrtc/VideoSink;

    return-object p0
.end method

.method public static final synthetic access$getPlugins$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->plugins:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method public static final synthetic access$getPluginsMap$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    iget-object p0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsMap:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method public static final synthetic access$getPluginsObjectList$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsObjectList:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method public static final synthetic access$getSetProcessor$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Z
    .locals 0

    iget-boolean p0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->setProcessor:Z

    return p0
.end method

.method public static final synthetic access$setLocalSink$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;Lhms/webrtc/VideoSink;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->localSink:Lhms/webrtc/VideoSink;

    return-void
.end method

.method public static final synthetic access$setSetProcessor$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->setProcessor:Z

    return-void
.end method

.method public static final synthetic access$setVideoProcessor(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->setVideoProcessor()V

    return-void
.end method

.method private final addPluginInternal(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V
    .locals 8

    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const-string v6, "HMSVideoPluginsManager"

    if-nez v0, :cond_0

    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string p2, "no name provided by the plugin"

    invoke-virtual {p1, v6, p2}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "plugin - "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " already added."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v6, p1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v7, 0x0

    const-string v0, "adding plugin "

    const/4 v1, 0x0

    if-lez p3, :cond_3

    sget-object v2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " with framerate "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->inputFrameRate:I

    if-ge p3, v0, :cond_2

    int-to-double v0, v0

    int-to-double v2, p3

    div-double/2addr v0, v2

    const/4 v2, 0x1

    int-to-double v2, v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v1, v0

    :cond_2
    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    iget v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->inputFrameRate:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, v4, v2, p3}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->added(Ljava/lang/String;ILjava/lang/Integer;)V

    goto :goto_0

    :cond_3
    iget-object p3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v6, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    iget v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->inputFrameRate:I

    invoke-virtual {p3, v4, v0, v7}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->added(Ljava/lang/String;ILjava/lang/Integer;)V

    :goto_0
    sget-object p3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "numFrames to skip processing "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v6, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesToSkip:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesSkipped:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsAvgProcessingTime:Ljava/util/concurrent/ConcurrentHashMap;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsProcessingTimeExceedsSafeLimitCount:Ljava/util/concurrent/ConcurrentHashMap;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->isSupported()Z

    move-result v0

    if-eqz v0, :cond_4

    :try_start_0
    sget-object p3, Lbc3/q0;->a:Lkc3/e;

    sget-object p3, Lkc3/d;->w:Lkc3/d;

    invoke-static {p3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p3

    new-instance v0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    :try_start_1
    invoke-direct/range {v0 .. v5}, Llive/hms/video/plugin/video/HMSVideoPluginsManager$addPluginInternal$1;-><init>(Llive/hms/video/plugin/video/HMSVideoPluginsManager;Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p3, v7, v7, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v1, p0

    move-object v2, p1

    goto :goto_1

    :goto_2
    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string p3, "failed to add plugin"

    invoke-virtual {p2, v6, p3, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p2, v1, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    invoke-virtual {p2, v4, p1}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->failure(Ljava/lang/String;Llive/hms/video/error/HMSException;)V

    invoke-virtual {p0, v2}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->removePlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;)V

    throw p1

    :cond_4
    move-object v1, p0

    move-object v2, p1

    sget-object p1, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$MediaPluginErrors;

    sget-object p2, Llive/hms/video/error/HMSAction;->VIDEO_PLUGINS:Llive/hms/video/error/HMSAction;

    const-string v0, "platform not supported"

    invoke-virtual {p1, p2, v0}, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->PlatformNotSupported(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;

    move-result-object p1

    iget-object p2, v1, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    invoke-virtual {p2, v4, p1}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->failure(Ljava/lang/String;Llive/hms/video/error/HMSException;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Platform/Resolution is not supported for plugin - "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, v6, p2}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    throw p1
.end method

.method private final checkIfSkipRequired(Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesSkipped:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesToSkip:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesSkipped:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2

    :cond_0
    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesSkipped:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1
.end method

.method private final processFramesThroughPlugins(Lhms/webrtc/VideoFrame;)V
    .locals 6

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->plugins:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/plugin/video/HMSVideoPlugin;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-interface {v2}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getPluginType()Llive/hms/video/plugin/video/HMSVideoPluginType;

    move-result-object v3

    sget-object v4, Llive/hms/video/plugin/video/HMSVideoPluginType;->TRANSFORM:Llive/hms/video/plugin/video/HMSVideoPluginType;

    if-ne v3, v4, :cond_2

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginResultListener:Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v2, p1, v3, v4}, Llive/hms/video/plugin/video/HMSVideoPlugin;->processVideoFrame(Lhms/webrtc/VideoFrame;Llive/hms/video/sdk/HMSPluginResultListener;Ljava/lang/Boolean;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getPluginType()Llive/hms/video/plugin/video/HMSVideoPluginType;

    move-result-object v3

    sget-object v4, Llive/hms/video/plugin/video/HMSVideoPluginType;->ANALYZE:Llive/hms/video/plugin/video/HMSVideoPluginType;

    if-ne v3, v4, :cond_0

    new-instance v3, Ll01/q;

    const/16 v4, 0x13

    invoke-direct {v3, v4, v2, p1}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v1, v3}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processWithTime(Ljava/lang/String;Lc93/a;)V

    iget-object v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->localSink:Lhms/webrtc/VideoSink;

    if-eqz v3, :cond_0

    invoke-interface {v3, p1}, Lhms/webrtc/VideoSink;->onFrame(Lhms/webrtc/VideoFrame;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "error in processing plugin "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "HMSVideoPluginsManager"

    invoke-virtual {v0, v4, v3, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$MediaPluginErrors;

    sget-object v3, Llive/hms/video/error/HMSAction;->VIDEO_PLUGINS:Llive/hms/video/error/HMSAction;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed during processing of plugin"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->ProcessingFailed(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;

    const-string v0, "HMSVideoPluginAnalytics"

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, p1}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->failure(Ljava/lang/String;Llive/hms/video/error/HMSException;)V

    invoke-virtual {p0, v2}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->removePlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;)V

    throw p1

    :cond_3
    return-void
.end method

.method private static final processFramesThroughPlugins$lambda$0(Llive/hms/video/plugin/video/HMSVideoPlugin;Lhms/webrtc/VideoFrame;)Ll83/a0;
    .locals 2

    const-string v0, "$plugin"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v0, 0x0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1, v0, v1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->processVideoFrame(Lhms/webrtc/VideoFrame;Llive/hms/video/sdk/HMSPluginResultListener;Ljava/lang/Boolean;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final removePluginEntry(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->plugins:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesToSkip:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesSkipped:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsAvgProcessingTime:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsProcessingTimeExceedsSafeLimitCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final setVideoProcessor()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->source:Lhms/webrtc/VideoSource;

    new-instance v1, Llive/hms/video/plugin/video/HMSVideoPluginsManager$setVideoProcessor$1;

    invoke-direct {v1, p0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager$setVideoProcessor$1;-><init>(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)V

    invoke-virtual {v0, v1}, Lhms/webrtc/VideoSource;->setVideoProcessor(Lhms/webrtc/VideoProcessor;)V

    return-void
.end method


# virtual methods
.method public final addPlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V
    .locals 5

    const-string v0, "plugin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginAddInProgress:Z

    if-eqz v0, :cond_1

    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-string v2, "HMSVideoPluginsManager"

    if-nez v1, :cond_0

    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string p2, "no name provided by the plugin"

    invoke-virtual {p1, v2, p2}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v1, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$MediaPluginErrors;

    sget-object v3, Llive/hms/video/error/HMSAction;->VIDEO_PLUGINS:Llive/hms/video/error/HMSAction;

    const-string v4, "Add Plugin is already in Progress"

    invoke-virtual {v1, v3, v4}, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->AddAlreadyInProgress(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;

    move-result-object v1

    iget-object v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    invoke-virtual {v3, v0, v1}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->failure(Ljava/lang/String;Llive/hms/video/error/HMSException;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v1, "can\'t add another plugin when previous add is in progress"

    invoke-virtual {v0, v2, v1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginAddInProgress:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->addPluginInternal(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginAddInProgress:Z

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginAddInProgress:Z

    throw p1
.end method

.method public final checkIfPluginFpsChangeNeeded(Ljava/lang/String;J)V
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_2

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsAvgProcessingTime:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const-wide/16 v3, 0x0

    invoke-static {v2, v3, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Double;D)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsAvgProcessingTime:Ljava/util/concurrent/ConcurrentHashMap;

    long-to-double p2, p2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Li93/j;

    const/16 v3, 0xb

    const/16 v4, 0xf

    const/4 v5, 0x1

    invoke-direct {v2, v3, v4, v5}, Li93/h;-><init>(III)V

    iget-object v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Li93/j;->e(I)Z

    move-result v2

    if-eqz v2, :cond_2

    long-to-double p2, p2

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsAvgProcessingTime:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    add-double/2addr v2, p2

    const-wide/high16 p2, 0x4000000000000000L    # 2.0

    div-double/2addr v2, p2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    iget-object p3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsAvgProcessingTime:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/high16 p2, 0x4059000000000000L    # 100.0

    cmpl-double p2, v2, p2

    if-lez p2, :cond_1

    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsProcessingTimeExceedsSafeLimitCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsProcessingTimeExceedsSafeLimitCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsProcessingTimeExceedsSafeLimitCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    const-wide/16 v0, 0x1e

    cmp-long p2, p2, v0

    if-lez p2, :cond_2

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string p3, "HMSVideoPluginsManager"

    const-string v0, "Reducing the plugin Frame Rate to 10"

    invoke-virtual {p2, p3, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;

    const/16 p3, 0xa

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->inputFrameRate:I

    int-to-double p2, p2

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    div-double/2addr p2, v0

    int-to-double v0, v5

    sub-double/2addr p2, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p2

    double-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesToSkip:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object p3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesSkipped:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsProcessingTimeExceedsSafeLimitCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final clean()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/plugin/video/HMSVideoPlugin;

    invoke-virtual {p0, v1}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->removePlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;)V

    iget-object v1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    invoke-virtual {v1, v2}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->clean(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesSkipped:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginNumFramesToSkip:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->plugins:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsObjectList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsAvgProcessingTime:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsProcessingTimeExceedsSafeLimitCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsFrameRateList:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->setProcessor:Z

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->source:Lhms/webrtc/VideoSource;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhms/webrtc/VideoSource;->setVideoProcessor(Lhms/webrtc/VideoProcessor;)V

    return-void
.end method

.method public final getPlugins()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Llive/hms/video/plugin/video/HMSVideoPlugin;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsObjectList:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public final getSource()Lhms/webrtc/VideoSource;
    .locals 1

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->source:Lhms/webrtc/VideoSource;

    return-object v0
.end method

.method public final pluginsProcessing(Lhms/webrtc/VideoFrame;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->processFramesThroughPlugins(Lhms/webrtc/VideoFrame;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v1, "HMSVideoPluginsManager"

    const-string v2, "error in plugins loop"

    invoke-virtual {v0, v1, v2, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final removePlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;)V
    .locals 5

    const-string v0, "removing plugin "

    const-string v1, "plugin - "

    const-string v2, "plugin"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "HMSVideoPluginsManager"

    if-nez v3, :cond_0

    :try_start_1
    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " not found to remove."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v4, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsObjectList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    invoke-direct {p0, v2}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->removePluginEntry(Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->plugins:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "No plugins left, stopping processing"

    invoke-virtual {v1, v4, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->stop()V

    iget-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->analytics:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    invoke-virtual {p1, v2}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->removed(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :goto_0
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    return-void
.end method

.method public final setInputFps(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->inputFrameRate:I

    return-void
.end method

.method public final setSource(Lhms/webrtc/VideoSource;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->source:Lhms/webrtc/VideoSource;

    return-void
.end method

.method public final updateCameraSource(Lhms/webrtc/VideoSource;)V
    .locals 1

    const-string v0, "localCameraVideoSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->source:Lhms/webrtc/VideoSource;

    invoke-direct {p0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->setVideoProcessor()V

    return-void
.end method
