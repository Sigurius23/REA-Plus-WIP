.class public final Lcom/whoop/data/repositories/HealthMonitorRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001e\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010$R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010&R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lcom/whoop/data/repositories/HealthMonitorRepository;",
        "",
        "Lcom/whoop/service/network/UsersApi;",
        "remoteService",
        "Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;",
        "healthMonitorUsersApiMigrations",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "Lcom/whoop/data/remote/api/FileDownloaderApi;",
        "fileDownloaderApi",
        "Lin2/d;",
        "dispatcherFactory",
        "<init>",
        "(Lcom/whoop/service/network/UsersApi;Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lrr2/c;Lcom/whoop/data/remote/api/FileDownloaderApi;Lin2/d;)V",
        "",
        "useNewApi",
        "()Z",
        "useMigratedApi",
        "",
        "getHealthReportUrl",
        "(ZLq83/d;)Ljava/lang/Object;",
        "url",
        "Lud3/a1;",
        "downloadHealthReportFromUrl",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "amountOfTries",
        "Lcom/whoop/data/remote/commons/Resource;",
        "getHealthReport",
        "(ILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/service/network/UsersApi;",
        "Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "Lrr2/c;",
        "Lcom/whoop/data/remote/api/FileDownloaderApi;",
        "Lin2/d;",
        "kennel_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final crashReporter:Lrr2/c;

.field private final dispatcherFactory:Lin2/d;

.field private final featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final fileDownloaderApi:Lcom/whoop/data/remote/api/FileDownloaderApi;

.field private final healthMonitorUsersApiMigrations:Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

.field private final logger:Ltr2/n;

.field private final remoteService:Lcom/whoop/service/network/UsersApi;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/UsersApi;Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lrr2/c;Lcom/whoop/data/remote/api/FileDownloaderApi;Lin2/d;)V
    .locals 1

    const-string v0, "remoteService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthMonitorUsersApiMigrations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileDownloaderApi"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->remoteService:Lcom/whoop/service/network/UsersApi;

    iput-object p2, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->healthMonitorUsersApiMigrations:Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

    iput-object p3, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p4, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->logger:Ltr2/n;

    iput-object p5, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->crashReporter:Lrr2/c;

    iput-object p6, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->fileDownloaderApi:Lcom/whoop/data/remote/api/FileDownloaderApi;

    iput-object p7, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->dispatcherFactory:Lin2/d;

    return-void
.end method

.method public static final synthetic access$downloadHealthReportFromUrl(Lcom/whoop/data/repositories/HealthMonitorRepository;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/HealthMonitorRepository;->downloadHealthReportFromUrl(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFileDownloaderApi$p(Lcom/whoop/data/repositories/HealthMonitorRepository;)Lcom/whoop/data/remote/api/FileDownloaderApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->fileDownloaderApi:Lcom/whoop/data/remote/api/FileDownloaderApi;

    return-object p0
.end method

.method public static final synthetic access$getHealthReportUrl(Lcom/whoop/data/repositories/HealthMonitorRepository;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/HealthMonitorRepository;->getHealthReportUrl(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final downloadHealthReportFromUrl(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lud3/a1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/HealthMonitorRepository$downloadHealthReportFromUrl$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/HealthMonitorRepository$downloadHealthReportFromUrl$2;-><init>(Lcom/whoop/data/repositories/HealthMonitorRepository;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final getHealthReportUrl(ZLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;

    iget v1, v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;-><init>(Lcom/whoop/data/repositories/HealthMonitorRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_6

    iget-object p2, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->healthMonitorUsersApiMigrations:Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

    iput-boolean p1, v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;->Z$0:Z

    iput v5, v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;->label:I

    invoke-interface {p2, v0}, Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;->getHealthReportUrl(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_5

    invoke-static {p2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v3

    :cond_6
    iget-object p2, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->remoteService:Lcom/whoop/service/network/UsersApi;

    iput-boolean p1, v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;->Z$0:Z

    iput v4, v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReportUrl$1;->label:I

    invoke-interface {p2, v0}, Lcom/whoop/service/network/UsersApi;->getHealthReportUrl(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_8

    invoke-static {p2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_8
    return-object v3
.end method

.method private final useNewApi()Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/repositories/HealthMonitorRepository;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "kt-serialization-health-monitor-users-api"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final getHealthReport(ILq83/d;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "+",
            "Lud3/a1;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;

    iget v3, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;

    invoke-direct {v2, v1, v0}, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;-><init>(Lcom/whoop/data/repositories/HealthMonitorRepository;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->label:I

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x2

    const/4 v10, 0x0

    if-eqz v4, :cond_7

    if-eq v4, v8, :cond_6

    if-eq v4, v9, :cond_5

    if-eq v4, v7, :cond_4

    if-eq v4, v6, :cond_3

    if-ne v4, v5, :cond_2

    iget v4, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iget-boolean v11, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iget v12, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iget-object v13, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move v0, v11

    move-object v11, v2

    goto/16 :goto_a

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget v4, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iget-boolean v11, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iget v12, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iget-object v13, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v13, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/data/remote/commons/Resource;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :cond_4
    iget v4, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iget-boolean v11, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iget v12, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iget-object v13, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/data/remote/commons/Resource;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_5

    :cond_5
    iget v4, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iget-boolean v11, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iget v12, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iget-object v13, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/data/remote/commons/Resource;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_3

    :cond_6
    iget v4, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iget-boolean v11, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iget v12, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iget-object v13, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/data/remote/commons/Resource;

    :try_start_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_2

    :cond_7
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v14, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    new-instance v0, Lcom/whoop/network/exception/DomainException;

    sget-object v4, Lcom/whoop/network/exception/DomainException$c;->NOT_FOUND:Lcom/whoop/network/exception/DomainException$c;

    invoke-direct {v0, v4, v10, v9, v10}, Lcom/whoop/network/exception/DomainException;-><init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x6

    const/16 v20, 0x0

    const-string v15, "File not found exception"

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v0

    invoke-static/range {v14 .. v20}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object v0

    invoke-direct {v1}, Lcom/whoop/data/repositories/HealthMonitorRepository;->useNewApi()Z

    move-result v4

    move-object v13, v0

    move-object v11, v2

    move v12, v4

    move/from16 v2, p1

    move v4, v2

    :goto_1
    if-lez v2, :cond_f

    if-eqz v12, :cond_9

    :try_start_4
    iget-object v0, v1, Lcom/whoop/data/repositories/HealthMonitorRepository;->healthMonitorUsersApiMigrations:Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;

    iput-object v13, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    iput v4, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iput-boolean v12, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iput v2, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iput v8, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->label:I

    invoke-interface {v0, v11}, Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;->generateHealthReport(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    if-ne v0, v3, :cond_8

    goto/16 :goto_9

    :cond_8
    move/from16 v21, v4

    move v4, v2

    move-object v2, v11

    move v11, v12

    move/from16 v12, v21

    :goto_2
    :try_start_5
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_4

    :catch_1
    move-exception v0

    move/from16 v21, v4

    move v4, v2

    move-object v2, v11

    move v11, v12

    move/from16 v12, v21

    goto :goto_7

    :cond_9
    :try_start_6
    iget-object v0, v1, Lcom/whoop/data/repositories/HealthMonitorRepository;->remoteService:Lcom/whoop/service/network/UsersApi;

    iput-object v13, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    iput v4, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iput-boolean v12, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iput v2, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iput v9, v11, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->label:I

    invoke-interface {v0, v11}, Lcom/whoop/service/network/UsersApi;->generateHealthReport(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    if-ne v0, v3, :cond_a

    goto/16 :goto_9

    :cond_a
    move/from16 v21, v4

    move v4, v2

    move-object v2, v11

    move v11, v12

    move/from16 v12, v21

    :goto_3
    :try_start_7
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    :goto_4
    iput-object v13, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    iput v12, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iput-boolean v11, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iput v4, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iput v7, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->label:I

    invoke-direct {v1, v11, v2}, Lcom/whoop/data/repositories/HealthMonitorRepository;->getHealthReportUrl(ZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    goto :goto_9

    :cond_b
    :goto_5
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-nez v14, :cond_c

    goto :goto_8

    :cond_c
    iput-object v13, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$1:Ljava/lang/Object;

    iput v12, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iput-boolean v11, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iput v4, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iput v6, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->label:I

    invoke-direct {v1, v0, v2}, Lcom/whoop/data/repositories/HealthMonitorRepository;->downloadHealthReportFromUrl(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_d

    goto :goto_9

    :cond_d
    :goto_6
    check-cast v0, Lud3/a1;

    sget-object v14, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    invoke-virtual {v14, v0}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object v13
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto :goto_b

    :goto_7
    iget-object v14, v1, Lcom/whoop/data/repositories/HealthMonitorRepository;->logger:Ltr2/n;

    const/4 v15, 0x0

    new-array v15, v15, [Lqr2/a$a;

    const-string v6, "No health report is available"

    invoke-interface {v14, v6, v15}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v6, v1, Lcom/whoop/data/repositories/HealthMonitorRepository;->logger:Ltr2/n;

    iget-object v14, v1, Lcom/whoop/data/repositories/HealthMonitorRepository;->crashReporter:Lrr2/c;

    const-string v15, "Failed to generate Health Report"

    invoke-static {v0, v15, v6, v14}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    if-gtz v4, :cond_e

    goto :goto_b

    :cond_e
    :goto_8
    iput-object v13, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->L$1:Ljava/lang/Object;

    iput v12, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$0:I

    iput-boolean v11, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->Z$0:Z

    iput v4, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->I$1:I

    iput v5, v2, Lcom/whoop/data/repositories/HealthMonitorRepository$getHealthReport$1;->label:I

    const-wide/16 v14, 0x3e8

    invoke-static {v14, v15, v2}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_1

    :goto_9
    return-object v3

    :goto_a
    add-int/lit8 v2, v4, -0x1

    move v4, v12

    const/4 v6, 0x4

    move v12, v0

    goto/16 :goto_1

    :cond_f
    :goto_b
    return-object v13
.end method
