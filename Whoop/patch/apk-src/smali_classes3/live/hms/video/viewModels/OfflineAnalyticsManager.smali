.class public final Llive/hms/video/viewModels/OfflineAnalyticsManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/viewModels/OfflineAnalyticsManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Llive/hms/video/viewModels/OfflineAnalyticsManager;",
        "",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/utils/HMSAgentOs;",
        "hmsAgentOs",
        "Lkotlin/Function0;",
        "",
        "isQaLink",
        "<init>",
        "(Landroid/content/Context;Llive/hms/video/utils/HMSAgentOs;Lc93/a;)V",
        "Llive/hms/video/database/entity/AnalyticsEntityModel;",
        "analyticsEntityModel",
        "flushLog",
        "(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "persistLog",
        "(Llive/hms/video/database/entity/AnalyticsEntityModel;)V",
        "",
        "eventId",
        "deleteLogById",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "flushExistingLogs",
        "(Landroid/content/Context;)V",
        "Lc93/a;",
        "Llive/hms/video/database/OfflineAnalyticsRepository;",
        "analyticsRepository",
        "Llive/hms/video/database/OfflineAnalyticsRepository;",
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
.field public static final Companion:Llive/hms/video/viewModels/OfflineAnalyticsManager$Companion;

.field public static final TAG:Ljava/lang/String; = "OfflineAnalyticsManager"


# instance fields
.field private analyticsRepository:Llive/hms/video/database/OfflineAnalyticsRepository;

.field private final isQaLink:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/viewModels/OfflineAnalyticsManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/viewModels/OfflineAnalyticsManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/viewModels/OfflineAnalyticsManager;->Companion:Llive/hms/video/viewModels/OfflineAnalyticsManager$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Llive/hms/video/utils/HMSAgentOs;Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Llive/hms/video/utils/HMSAgentOs;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsAgentOs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isQaLink"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager;->isQaLink:Lc93/a;

    sget-object p3, Llive/hms/video/database/EventsDatabase;->Companion:Llive/hms/video/database/EventsDatabase$Companion;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p3, p1, v0, v1, v0}, Llive/hms/video/database/EventsDatabase$Companion;->getInstance$default(Llive/hms/video/database/EventsDatabase$Companion;Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/database/EventsDatabase;

    move-result-object p1

    new-instance p3, Llive/hms/video/database/OfflineAnalyticsRepository;

    invoke-virtual {p1}, Llive/hms/video/database/EventsDatabase;->logDao()Llive/hms/video/database/dao/AnalyticsEventsDao;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Llive/hms/video/database/OfflineAnalyticsRepository;-><init>(Llive/hms/video/database/dao/AnalyticsEventsDao;Llive/hms/video/utils/HMSAgentOs;)V

    iput-object p3, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager;->analyticsRepository:Llive/hms/video/database/OfflineAnalyticsRepository;

    return-void
.end method

.method public static final synthetic access$getAnalyticsRepository$p(Llive/hms/video/viewModels/OfflineAnalyticsManager;)Llive/hms/video/database/OfflineAnalyticsRepository;
    .locals 0

    iget-object p0, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager;->analyticsRepository:Llive/hms/video/database/OfflineAnalyticsRepository;

    return-object p0
.end method

.method public static final synthetic access$isQaLink$p(Llive/hms/video/viewModels/OfflineAnalyticsManager;)Lc93/a;
    .locals 0

    iget-object p0, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager;->isQaLink:Lc93/a;

    return-object p0
.end method


# virtual methods
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

    iget-object v0, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager;->analyticsRepository:Llive/hms/video/database/OfflineAnalyticsRepository;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/database/OfflineAnalyticsRepository;->deleteLogById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final flushExistingLogs(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager;->analyticsRepository:Llive/hms/video/database/OfflineAnalyticsRepository;

    invoke-virtual {v0}, Llive/hms/video/database/OfflineAnalyticsRepository;->getHmsAgentOs()Llive/hms/video/utils/HMSAgentOs;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/video/utils/HMSAgentOs;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;-><init>(Llive/hms/video/viewModels/OfflineAnalyticsManager;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final flushLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p2, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;

    iget v1, v0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;-><init>(Llive/hms/video/viewModels/OfflineAnalyticsManager;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager;->analyticsRepository:Llive/hms/video/database/OfflineAnalyticsRepository;

    iput v3, v0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushLog$1;->label:I

    invoke-virtual {p2, p1, v0}, Llive/hms/video/database/OfflineAnalyticsRepository;->flushLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final persistLog(Llive/hms/video/database/entity/AnalyticsEntityModel;)V
    .locals 3

    const-string v0, "analyticsEntityModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Llive/hms/video/viewModels/OfflineAnalyticsManager$persistLog$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/viewModels/OfflineAnalyticsManager$persistLog$1;-><init>(Llive/hms/video/viewModels/OfflineAnalyticsManager;Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
