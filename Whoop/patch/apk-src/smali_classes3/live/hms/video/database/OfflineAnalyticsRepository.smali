.class public final Llive/hms/video/database/OfflineAnalyticsRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\rH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u000cJ\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Llive/hms/video/database/OfflineAnalyticsRepository;",
        "",
        "Llive/hms/video/database/dao/AnalyticsEventsDao;",
        "analyticsEventsDao",
        "Llive/hms/video/utils/HMSAgentOs;",
        "hmsAgentOs",
        "<init>",
        "(Llive/hms/video/database/dao/AnalyticsEventsDao;Llive/hms/video/utils/HMSAgentOs;)V",
        "Llive/hms/video/database/entity/AnalyticsEntityModel;",
        "analyticsEntityModel",
        "Ll83/a0;",
        "insertLog",
        "(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;",
        "",
        "getAllLogs",
        "(Lq83/d;)Ljava/lang/Object;",
        "deleteLog",
        "",
        "eventId",
        "deleteLogById",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "flushLog",
        "Llive/hms/video/database/dao/AnalyticsEventsDao;",
        "Llive/hms/video/utils/HMSAgentOs;",
        "getHmsAgentOs",
        "()Llive/hms/video/utils/HMSAgentOs;",
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


# instance fields
.field private final analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

.field private final hmsAgentOs:Llive/hms/video/utils/HMSAgentOs;


# direct methods
.method public constructor <init>(Llive/hms/video/database/dao/AnalyticsEventsDao;Llive/hms/video/utils/HMSAgentOs;)V
    .locals 1

    const-string v0, "analyticsEventsDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsAgentOs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/database/OfflineAnalyticsRepository;->analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    iput-object p2, p0, Llive/hms/video/database/OfflineAnalyticsRepository;->hmsAgentOs:Llive/hms/video/utils/HMSAgentOs;

    return-void
.end method


# virtual methods
.method public final deleteLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/database/OfflineAnalyticsRepository;->analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    invoke-interface {v0, p1, p2}, Llive/hms/video/database/dao/AnalyticsEventsDao;->deleteLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteLogById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/database/OfflineAnalyticsRepository;->analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    invoke-interface {v0, p1, p2}, Llive/hms/video/database/dao/AnalyticsEventsDao;->deleteLogById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final flushLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/events/HMSApiClient;->INSTANCE:Llive/hms/video/events/HMSApiClient;

    iget-object v1, p0, Llive/hms/video/database/OfflineAnalyticsRepository;->hmsAgentOs:Llive/hms/video/utils/HMSAgentOs;

    invoke-virtual {v0, p1, v1, p2}, Llive/hms/video/events/HMSApiClient;->reportAnalyticsEvent(Llive/hms/video/database/entity/AnalyticsEntityModel;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getAllLogs(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/database/OfflineAnalyticsRepository;->analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    invoke-interface {v0, p1}, Llive/hms/video/database/dao/AnalyticsEventsDao;->getAllEvents(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getHmsAgentOs()Llive/hms/video/utils/HMSAgentOs;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/OfflineAnalyticsRepository;->hmsAgentOs:Llive/hms/video/utils/HMSAgentOs;

    return-object v0
.end method

.method public final insertLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/database/OfflineAnalyticsRepository;->analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    invoke-interface {v0, p1, p2}, Llive/hms/video/database/dao/AnalyticsEventsDao;->addEvent(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
