.class public final Lwg1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lwg1/c;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lic/p0;",
        "workManager",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lic/p0;Ltr2/n;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "w",
        "Lic/p0;",
        "x",
        "Ltr2/n;",
        "",
        "y",
        "J",
        "repeatInterval",
        "firmware-update-service_release"
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
.field private final w:Lic/p0;

.field private final x:Ltr2/n;

.field private final y:J


# direct methods
.method public constructor <init>(Lic/p0;Ltr2/n;)V
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwg1/c;->w:Lic/p0;

    iput-object p2, p0, Lwg1/c;->x:Ltr2/n;

    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 p1, 0x1

    sget-object p2, Lkotlin/time/DurationUnit;->HOURS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide p1

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide p1

    iput-wide p1, p0, Lwg1/c;->y:J

    return-void
.end method

.method private final a()V
    .locals 12

    new-instance v1, Lrc/e;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    sget-object v2, Lic/x;->w:Lic/x;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v11

    new-instance v0, Lic/e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, -0x1

    move-wide v9, v7

    invoke-direct/range {v0 .. v11}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    iget-wide v1, p0, Lwg1/c;->y:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v4, Lic/j0;

    const-class v5, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;

    invoke-direct {v4, v5, v1, v2, v3}, Lic/j0;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v4, v0}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    sget-object v1, Lic/a;->x:Lic/a;

    const-wide/16 v4, 0x2710

    invoke-virtual {v0, v1, v4, v5, v3}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/k0;

    iget-object v1, p0, Lwg1/c;->x:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Enqueueing PeriodicFwUpdateCheckWorker  in background"

    invoke-interface {v1, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lwg1/c;->w:Lic/p0;

    sget-object v2, Lic/k;->x:Lic/k;

    const-string v3, "PeriodicFwUpdateCheckWorker"

    invoke-virtual {v1, v3, v2, v0}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwg1/c;->a()V

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
