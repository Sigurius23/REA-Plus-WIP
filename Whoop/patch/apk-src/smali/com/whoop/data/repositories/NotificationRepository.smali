.class public final Lcom/whoop/data/repositories/NotificationRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010!\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0019R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/data/repositories/NotificationRepository;",
        "",
        "Lcom/whoop/service/network/NotificationApi;",
        "remoteService",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "Lin2/d;",
        "dispatcherFactory",
        "Lod1/u;",
        "userContext",
        "<init>",
        "(Lcom/whoop/service/network/NotificationApi;Ltr2/n;Lrr2/c;Lin2/d;Lod1/u;)V",
        "Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;",
        "type",
        "",
        "sourceId",
        "",
        "sendPushNotificationMetric",
        "(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/service/network/NotificationApi;",
        "Ltr2/n;",
        "Lrr2/c;",
        "Lin2/d;",
        "Lod1/u;",
        "",
        "notificationStatusList",
        "Ljava/util/List;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final crashReporter:Lrr2/c;

.field private final dispatcherFactory:Lin2/d;

.field private final logger:Ltr2/n;

.field private final notificationStatusList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final remoteService:Lcom/whoop/service/network/NotificationApi;

.field private final userContext:Lod1/u;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/NotificationApi;Ltr2/n;Lrr2/c;Lin2/d;Lod1/u;)V
    .locals 1

    const-string v0, "remoteService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository;->remoteService:Lcom/whoop/service/network/NotificationApi;

    iput-object p2, p0, Lcom/whoop/data/repositories/NotificationRepository;->logger:Ltr2/n;

    iput-object p3, p0, Lcom/whoop/data/repositories/NotificationRepository;->crashReporter:Lrr2/c;

    iput-object p4, p0, Lcom/whoop/data/repositories/NotificationRepository;->dispatcherFactory:Lin2/d;

    iput-object p5, p0, Lcom/whoop/data/repositories/NotificationRepository;->userContext:Lod1/u;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository;->notificationStatusList:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$getCrashReporter$p(Lcom/whoop/data/repositories/NotificationRepository;)Lrr2/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/NotificationRepository;->crashReporter:Lrr2/c;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/data/repositories/NotificationRepository;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/NotificationRepository;->logger:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$getNotificationStatusList$p(Lcom/whoop/data/repositories/NotificationRepository;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/NotificationRepository;->notificationStatusList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getRemoteService$p(Lcom/whoop/data/repositories/NotificationRepository;)Lcom/whoop/service/network/NotificationApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/NotificationRepository;->remoteService:Lcom/whoop/service/network/NotificationApi;

    return-object p0
.end method

.method public static final synthetic access$getUserContext$p(Lcom/whoop/data/repositories/NotificationRepository;)Lod1/u;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/NotificationRepository;->userContext:Lod1/u;

    return-object p0
.end method


# virtual methods
.method public final sendPushNotificationMetric(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/NotificationRepository;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, p2, v2}, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;-><init>(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Lcom/whoop/data/repositories/NotificationRepository;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
