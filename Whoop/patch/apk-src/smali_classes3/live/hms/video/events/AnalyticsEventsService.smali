.class public final Llive/hms/video/events/AnalyticsEventsService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/events/AnalyticsEventsService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 52\u00020\u0001:\u00015B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJI\u0010#\u001a\u00020\u000f2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008%\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010(R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010)R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010.R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010.R\u001a\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00120/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u0017028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104\u00a8\u00066"
    }
    d2 = {
        "Llive/hms/video/events/AnalyticsEventsService;",
        "",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;",
        "level",
        "Llive/hms/video/utils/HMSAgentOs;",
        "agentOs",
        "Lkotlin/Function0;",
        "",
        "isQa",
        "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;",
        "offlineAnalyticsPeerInfo",
        "<init>",
        "(Landroid/content/Context;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/utils/HMSAgentOs;Lc93/a;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;)V",
        "Ll83/a0;",
        "flushExistingLogs",
        "()V",
        "Llive/hms/video/events/IAnalyticsTransport;",
        "transport",
        "addTransport",
        "(Llive/hms/video/events/IAnalyticsTransport;)Z",
        "removeTransport",
        "Llive/hms/video/events/AnalyticsEvent;",
        "event",
        "queue",
        "(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;",
        "",
        "token",
        "sessionId",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "hmsPeer",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "hmsRoom",
        "websocketUrl",
        "updateAnalyticsParams",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V",
        "flush",
        "Landroid/content/Context;",
        "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;",
        "Llive/hms/video/utils/HMSAgentOs;",
        "Lc93/a;",
        "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;",
        "Llive/hms/video/viewModels/OfflineAnalyticsManager;",
        "offlineAnalyticsManager",
        "Llive/hms/video/viewModels/OfflineAnalyticsManager;",
        "Ljava/lang/String;",
        "Ljava/util/ArrayList;",
        "transports",
        "Ljava/util/ArrayList;",
        "Ljava/util/Deque;",
        "pendingEvents",
        "Ljava/util/Deque;",
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
.field public static final Companion:Llive/hms/video/events/AnalyticsEventsService$Companion;

.field private static final TAG:Ljava/lang/String; = "AnalyticsEventsService"

.field private static final cMaxBufferSize:I = 0x64


# instance fields
.field private final agentOs:Llive/hms/video/utils/HMSAgentOs;

.field private final context:Landroid/content/Context;

.field private final isQa:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private level:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

.field private final offlineAnalyticsManager:Llive/hms/video/viewModels/OfflineAnalyticsManager;

.field private final offlineAnalyticsPeerInfo:Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;

.field private final pendingEvents:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Llive/hms/video/events/AnalyticsEvent;",
            ">;"
        }
    .end annotation
.end field

.field private sessionId:Ljava/lang/String;

.field private token:Ljava/lang/String;

.field private final transports:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Llive/hms/video/events/IAnalyticsTransport;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/events/AnalyticsEventsService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/events/AnalyticsEventsService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/events/AnalyticsEventsService;->Companion:Llive/hms/video/events/AnalyticsEventsService$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/utils/HMSAgentOs;Lc93/a;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;",
            "Llive/hms/video/utils/HMSAgentOs;",
            "Lc93/a;",
            "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "agentOs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isQa"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offlineAnalyticsPeerInfo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/events/AnalyticsEventsService;->context:Landroid/content/Context;

    iput-object p2, p0, Llive/hms/video/events/AnalyticsEventsService;->level:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    iput-object p3, p0, Llive/hms/video/events/AnalyticsEventsService;->agentOs:Llive/hms/video/utils/HMSAgentOs;

    iput-object p4, p0, Llive/hms/video/events/AnalyticsEventsService;->isQa:Lc93/a;

    iput-object p5, p0, Llive/hms/video/events/AnalyticsEventsService;->offlineAnalyticsPeerInfo:Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;

    new-instance p2, Llive/hms/video/viewModels/OfflineAnalyticsManager;

    invoke-direct {p2, p1, p3, p4}, Llive/hms/video/viewModels/OfflineAnalyticsManager;-><init>(Landroid/content/Context;Llive/hms/video/utils/HMSAgentOs;Lc93/a;)V

    iput-object p2, p0, Llive/hms/video/events/AnalyticsEventsService;->offlineAnalyticsManager:Llive/hms/video/viewModels/OfflineAnalyticsManager;

    const-string p1, ""

    iput-object p1, p0, Llive/hms/video/events/AnalyticsEventsService;->sessionId:Ljava/lang/String;

    iput-object p1, p0, Llive/hms/video/events/AnalyticsEventsService;->token:Ljava/lang/String;

    invoke-direct {p0}, Llive/hms/video/events/AnalyticsEventsService;->flushExistingLogs()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/events/AnalyticsEventsService;->transports:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    iput-object p1, p0, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    return-void
.end method

.method public static final synthetic access$getAgentOs$p(Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/utils/HMSAgentOs;
    .locals 0

    iget-object p0, p0, Llive/hms/video/events/AnalyticsEventsService;->agentOs:Llive/hms/video/utils/HMSAgentOs;

    return-object p0
.end method

.method public static final synthetic access$getOfflineAnalyticsManager$p(Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/viewModels/OfflineAnalyticsManager;
    .locals 0

    iget-object p0, p0, Llive/hms/video/events/AnalyticsEventsService;->offlineAnalyticsManager:Llive/hms/video/viewModels/OfflineAnalyticsManager;

    return-object p0
.end method

.method public static final synthetic access$getPendingEvents$p(Llive/hms/video/events/AnalyticsEventsService;)Ljava/util/Deque;
    .locals 0

    iget-object p0, p0, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    return-object p0
.end method

.method private final flushExistingLogs()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/events/AnalyticsEventsService;->offlineAnalyticsManager:Llive/hms/video/viewModels/OfflineAnalyticsManager;

    iget-object v1, p0, Llive/hms/video/events/AnalyticsEventsService;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Llive/hms/video/viewModels/OfflineAnalyticsManager;->flushExistingLogs(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic updateAnalyticsParams$default(Llive/hms/video/events/AnalyticsEventsService;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p5, v0

    :cond_4
    invoke-virtual/range {p0 .. p5}, Llive/hms/video/events/AnalyticsEventsService;->updateAnalyticsParams(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final addTransport(Llive/hms/video/events/IAnalyticsTransport;)Z
    .locals 1

    const-string v0, "transport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/events/AnalyticsEventsService;->transports:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final declared-synchronized flush()V
    .locals 19
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HardwareIds"
        }
    .end annotation

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    iget-object v0, v1, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, v1, Llive/hms/video/events/AnalyticsEventsService;->transports:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v4, "AnalyticsEventsService"

    const-string v5, "No valid signalling api found to flush analytics, trying to send via REST API"

    invoke-virtual {v0, v4, v5}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v4, "iterator(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llive/hms/video/events/AnalyticsEvent;

    iget-object v4, v1, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    invoke-interface {v4}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llive/hms/video/events/AnalyticsEvent;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Llive/hms/video/events/AnalyticsEvent;->getTimestamp()J

    move-result-wide v6

    iget-object v5, v1, Llive/hms/video/events/AnalyticsEventsService;->agentOs:Llive/hms/video/utils/HMSAgentOs;

    invoke-virtual {v5, v4}, Llive/hms/video/utils/HMSAgentOs;->getUniqueEventId(Llive/hms/video/events/AnalyticsEvent;)Ljava/lang/String;

    move-result-object v8

    iget-object v5, v1, Llive/hms/video/events/AnalyticsEventsService;->agentOs:Llive/hms/video/utils/HMSAgentOs;

    iget-object v9, v1, Llive/hms/video/events/AnalyticsEventsService;->context:Landroid/content/Context;

    invoke-virtual {v5, v9}, Llive/hms/video/utils/HMSAgentOs;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Llive/hms/video/events/AnalyticsEvent;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4}, Llive/hms/video/events/AnalyticsEvent;->getProperties()Ljava/util/HashMap;

    move-result-object v11

    iget-object v13, v1, Llive/hms/video/events/AnalyticsEventsService;->token:Ljava/lang/String;

    new-instance v5, Llive/hms/video/database/entity/AnalyticsCluster;

    iget-object v10, v1, Llive/hms/video/events/AnalyticsEventsService;->offlineAnalyticsPeerInfo:Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;

    invoke-virtual {v10}, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->getWebsocketUrl()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_2

    const-string v10, ""

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_2
    :goto_1
    invoke-direct {v5, v10}, Llive/hms/video/database/entity/AnalyticsCluster;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v5

    new-instance v5, Llive/hms/video/database/entity/AnalyticsEntityModel;

    const/16 v17, 0x188

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v18}, Llive/hms/video/database/entity/AnalyticsEntityModel;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v6, v1, Llive/hms/video/events/AnalyticsEventsService;->offlineAnalyticsPeerInfo:Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;

    invoke-virtual {v6}, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->getAnalyticsPeer()Llive/hms/video/database/entity/AnalyticsPeer;

    move-result-object v6

    invoke-virtual {v5, v6}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setAnalyticsPeer(Llive/hms/video/database/entity/AnalyticsPeer;)V

    sget-object v6, Lbc3/q0;->a:Lkc3/e;

    sget-object v6, Lkc3/d;->w:Lkc3/d;

    invoke-static {v6}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v6

    new-instance v7, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;

    invoke-direct {v7, v1, v5, v4, v3}, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;-><init>(Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/database/entity/AnalyticsEntityModel;Llive/hms/video/events/AnalyticsEvent;Lq83/d;)V

    invoke-static {v6, v3, v3, v7, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_3
    const-string v0, "AnalyticsEventsService"

    const-string v4, "Sending analytics via websocket"

    invoke-static {v0, v4}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v1, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    :goto_2
    :try_start_2
    iget-object v0, v1, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v1, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/events/AnalyticsEvent;

    if-eqz v0, :cond_4

    iget-object v5, v1, Llive/hms/video/events/AnalyticsEventsService;->transports:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llive/hms/video/events/IAnalyticsTransport;

    invoke-interface {v6, v0}, Llive/hms/video/events/IAnalyticsTransport;->event(Llive/hms/video/events/AnalyticsEvent;)V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_5
    sget-object v5, Lbc3/q0;->a:Lkc3/e;

    sget-object v5, Lkc3/d;->w:Lkc3/d;

    invoke-static {v5}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v5

    new-instance v6, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;

    invoke-direct {v6, v1, v0, v3}, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;-><init>(Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/events/AnalyticsEvent;Lq83/d;)V

    invoke-static {v5, v3, v3, v6, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :cond_6
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_7
    monitor-exit p0

    return-void

    :goto_4
    :try_start_4
    monitor-exit v4

    throw v0

    :goto_5
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public final declared-synchronized queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;
    .locals 4

    const-string v0, "Max buffer size reached, removing "

    monitor-enter p0

    :try_start_0
    const-string v1, "event"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/events/AnalyticsEvent;->getLevel()Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    iget-object v2, p0, Llive/hms/video/events/AnalyticsEventsService;->level:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-gt v1, v2, :cond_0

    const-string v1, "AnalyticsEventsService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " queued"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    invoke-interface {v1, p1}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->size()I

    move-result p1

    const/16 v1, 0x64

    if-le p1, v1, :cond_0

    iget-object p1, p0, Llive/hms/video/events/AnalyticsEventsService;->pendingEvents:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->pollFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/events/AnalyticsEvent;

    const-string v1, "AnalyticsEventsService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to accommodate new events"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final removeTransport(Llive/hms/video/events/IAnalyticsTransport;)Z
    .locals 1

    const-string v0, "transport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/events/AnalyticsEventsService;->transports:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final updateAnalyticsParams(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Llive/hms/video/events/AnalyticsEventsService;->token:Ljava/lang/String;

    :cond_0
    if-eqz p2, :cond_1

    iput-object p2, p0, Llive/hms/video/events/AnalyticsEventsService;->sessionId:Ljava/lang/String;

    :cond_1
    iget-object p2, p0, Llive/hms/video/events/AnalyticsEventsService;->offlineAnalyticsPeerInfo:Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;

    invoke-virtual {p2, p3}, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->updateWithPeer(Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-virtual {p2, p4}, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->updateWithRoom(Llive/hms/video/sdk/models/HMSRoom;)V

    invoke-virtual {p2, p1}, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->updateWithToken(Ljava/lang/String;)V

    if-eqz p5, :cond_2

    invoke-virtual {p2, p5}, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->setWebsocketUrl(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
