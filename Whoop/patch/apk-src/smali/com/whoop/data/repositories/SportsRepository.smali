.class public final Lcom/whoop/data/repositories/SportsRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/data/repositories/SportsRepository;",
        "",
        "Lcom/whoop/service/network/ActivityServiceApi;",
        "activityServiceApi",
        "Ltr2/n;",
        "log",
        "Lod1/u;",
        "userContext",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/service/network/ActivityServiceApi;Ltr2/n;Lod1/u;Lbc3/c0;)V",
        "Lxg3/g;",
        "",
        "Lcom/whoop/service/network/model/Sport;",
        "getSports",
        "()Lxg3/g;",
        "Lcom/whoop/service/network/ActivityServiceApi;",
        "getActivityServiceApi",
        "()Lcom/whoop/service/network/ActivityServiceApi;",
        "Ltr2/n;",
        "Lod1/u;",
        "Lbc3/c0;",
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
.field private final activityServiceApi:Lcom/whoop/service/network/ActivityServiceApi;

.field private final coroutineScope:Lbc3/c0;

.field private final log:Ltr2/n;

.field private final userContext:Lod1/u;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/ActivityServiceApi;Ltr2/n;Lod1/u;Lbc3/c0;)V
    .locals 1

    const-string v0, "activityServiceApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "log"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/SportsRepository;->activityServiceApi:Lcom/whoop/service/network/ActivityServiceApi;

    iput-object p2, p0, Lcom/whoop/data/repositories/SportsRepository;->log:Ltr2/n;

    iput-object p3, p0, Lcom/whoop/data/repositories/SportsRepository;->userContext:Lod1/u;

    iput-object p4, p0, Lcom/whoop/data/repositories/SportsRepository;->coroutineScope:Lbc3/c0;

    return-void
.end method

.method public static synthetic a(Lbc3/c2;)V
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/repositories/SportsRepository;->getSports$lambda$0$0(Lbc3/k1;)V

    return-void
.end method

.method public static final synthetic access$getLog$p(Lcom/whoop/data/repositories/SportsRepository;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SportsRepository;->log:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$getUserContext$p(Lcom/whoop/data/repositories/SportsRepository;)Lod1/u;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SportsRepository;->userContext:Lod1/u;

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/repositories/SportsRepository;Lxg3/q;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/SportsRepository;->getSports$lambda$0(Lcom/whoop/data/repositories/SportsRepository;Lxg3/q;)V

    return-void
.end method

.method private static final getSports$lambda$0(Lcom/whoop/data/repositories/SportsRepository;Lxg3/q;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/SportsRepository;->coroutineScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;-><init>(Lcom/whoop/data/repositories/SportsRepository;Lxg3/q;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    new-instance v0, Lcom/whoop/data/repositories/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/data/repositories/d;-><init>(Lbc3/c2;I)V

    check-cast p1, Lch3/w0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lfh3/a;

    invoke-direct {p0, v0}, Lfh3/a;-><init>(Ljava/lang/Object;)V

    iget-object p1, p1, Lch3/w0;->x:Lfh3/a;

    invoke-virtual {p1, p0}, Lfh3/a;->c(Lxg3/t;)V

    return-void
.end method

.method private static final getSports$lambda$0$0(Lbc3/k1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method


# virtual methods
.method public final getActivityServiceApi()Lcom/whoop/service/network/ActivityServiceApi;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/SportsRepository;->activityServiceApi:Lcom/whoop/service/network/ActivityServiceApi;

    return-object v0
.end method

.method public final getSports()Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/Sport;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/onboarding/c;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lxg3/p;->b(Lbh3/b;)Lxg3/p;

    move-result-object v0

    invoke-static {v0}, Lxg3/p;->a(Lxg3/p;)Lxg3/g;

    move-result-object v0

    const-string v1, "toObservable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
