.class public final Lmx0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u001d\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00110%8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lmx0/c;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lbc3/c0;",
        "coroutineScope",
        "Lgx0/a;",
        "dataSyncServicePrefs",
        "Lcom/whoop/dataSyncService/retrofit/DataSyncApi;",
        "dataSyncApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lbc3/c0;Lgx0/a;Lcom/whoop/dataSyncService/retrofit/DataSyncApi;Ltr2/n;)V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "",
        "metricsProcessedTime",
        "g",
        "(J)V",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "w",
        "Lbc3/c0;",
        "getCoroutineScope",
        "()Lbc3/c0;",
        "x",
        "Lgx0/a;",
        "y",
        "Lcom/whoop/dataSyncService/retrofit/DataSyncApi;",
        "z",
        "Ltr2/n;",
        "Lec3/p1;",
        "E",
        "Lec3/p1;",
        "_highWaterMarkFlow",
        "Lec3/f2;",
        "F",
        "Lec3/f2;",
        "f",
        "()Lec3/f2;",
        "highWaterMark",
        "data-sync-service_release"
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
.field private final E:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final F:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final w:Lbc3/c0;

.field private final x:Lgx0/a;

.field private final y:Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

.field private final z:Ltr2/n;


# direct methods
.method public constructor <init>(Lbc3/c0;Lgx0/a;Lcom/whoop/dataSyncService/retrofit/DataSyncApi;Ltr2/n;)V
    .locals 1

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSyncServicePrefs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSyncApi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmx0/c;->w:Lbc3/c0;

    iput-object p2, p0, Lmx0/c;->x:Lgx0/a;

    iput-object p3, p0, Lmx0/c;->y:Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    iput-object p4, p0, Lmx0/c;->z:Ltr2/n;

    invoke-virtual {p2}, Lgx0/a;->b()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lmx0/c;->E:Lec3/p1;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lmx0/c;->F:Lec3/f2;

    return-void
.end method

.method public static final synthetic a(Lmx0/c;)Lcom/whoop/dataSyncService/retrofit/DataSyncApi;
    .locals 0

    iget-object p0, p0, Lmx0/c;->y:Lcom/whoop/dataSyncService/retrofit/DataSyncApi;

    return-object p0
.end method

.method public static final synthetic b(Lmx0/c;)Lgx0/a;
    .locals 0

    iget-object p0, p0, Lmx0/c;->x:Lgx0/a;

    return-object p0
.end method

.method public static final synthetic c(Lmx0/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lmx0/c;->z:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Lmx0/c;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lmx0/c;->E:Lec3/p1;

    return-object p0
.end method


# virtual methods
.method public final e(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lmx0/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lmx0/c$a;

    iget v1, v0, Lmx0/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmx0/c$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lmx0/c$a;

    invoke-direct {v0, p0, p1}, Lmx0/c$a;-><init>(Lmx0/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lmx0/c$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lmx0/c$a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lmx0/c;->z:Ltr2/n;

    new-instance v5, Lmx0/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lmx0/c$b;-><init>(Lmx0/c;Lq83/d;)V

    iput p1, v6, Lmx0/c$a;->y:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lmx0/c;->z:Ltr2/n;

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Error occurred when fetching high watermark "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_3

    :cond_4
    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_6

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/domain/model/MetricsProcessedTime;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/domain/model/MetricsProcessedTime;->getMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lmx0/c;->g(J)V

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lmx0/c;->z:Ltr2/n;

    const-string v0, "high watermark response body is null"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final f()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lmx0/c;->F:Lec3/f2;

    return-object v0
.end method

.method public final g(J)V
    .locals 3

    iget-object v0, p0, Lmx0/c;->w:Lbc3/c0;

    new-instance v1, Lmx0/c$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lmx0/c$d;-><init>(Lmx0/c;JLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lmx0/c;->w:Lbc3/c0;

    new-instance v0, Lmx0/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lmx0/c$c;-><init>(Lmx0/c;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

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
