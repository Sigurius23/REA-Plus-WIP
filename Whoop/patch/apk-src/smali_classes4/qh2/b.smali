.class public final Lqh2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lqh2/b;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lbc3/c0;",
        "coroutineScope",
        "Liy1/c;",
        "metricsInteractor",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lca2/h;",
        "rawDataTrackingService",
        "Ljava/time/Clock;",
        "clock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lbc3/c0;Liy1/c;Lci2/b;Lca2/h;Ljava/time/Clock;Ltr2/n;)V",
        "Lec3/l;",
        "Lqh2/a;",
        "f",
        "()Lec3/l;",
        "",
        "historySyncDelta",
        "Ll83/a0;",
        "e",
        "(JLq83/d;)Ljava/lang/Object;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "w",
        "Lbc3/c0;",
        "x",
        "Liy1/c;",
        "y",
        "Lci2/b;",
        "z",
        "Lca2/h;",
        "E",
        "Ljava/time/Clock;",
        "F",
        "Ltr2/n;",
        "strap-pipeline-analytics_release"
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
.field private final E:Ljava/time/Clock;

.field private final F:Ltr2/n;

.field private final w:Lbc3/c0;

.field private final x:Liy1/c;

.field private final y:Lci2/b;

.field private final z:Lca2/h;


# direct methods
.method public constructor <init>(Lbc3/c0;Liy1/c;Lci2/b;Lca2/h;Ljava/time/Clock;Ltr2/n;)V
    .locals 1

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawDataTrackingService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqh2/b;->w:Lbc3/c0;

    iput-object p2, p0, Lqh2/b;->x:Liy1/c;

    iput-object p3, p0, Lqh2/b;->y:Lci2/b;

    iput-object p4, p0, Lqh2/b;->z:Lca2/h;

    iput-object p5, p0, Lqh2/b;->E:Ljava/time/Clock;

    iput-object p6, p0, Lqh2/b;->F:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lqh2/b;JLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lqh2/b;->e(JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lqh2/b;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Lqh2/b;->E:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic c(Lqh2/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lqh2/b;->F:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Lqh2/b;)Liy1/c;
    .locals 0

    iget-object p0, p0, Lqh2/b;->x:Liy1/c;

    return-object p0
.end method

.method private final e(JLq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lqh2/b;->z:Lca2/h;

    invoke-interface {v0}, Lca2/h;->c()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "is_raw_data_in_strap_or_app_backlog:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    iget-object v1, p0, Lqh2/b;->F:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Received HistoryCompleteMetadata packet - Total sync latency: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", isRawDataInBacklog: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lqh2/b;->x:Liy1/c;

    new-instance v2, Ljy1/a;

    long-to-double p1, p1

    new-instance v5, Ljava/lang/Double;

    invoke-direct {v5, p1, p2}, Ljava/lang/Double;-><init>(D)V

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-string v4, "connectivity.strap.app.history_sync_latency"

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2, p3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final f()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lqh2/b;->y:Lci2/b;

    invoke-interface {v0}, Lci2/b;->b()Lec3/t1;

    move-result-object v0

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v0, Lqh2/b$b;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lqh2/b$b;-><init>(Lq83/d;)V

    invoke-static {v1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lqh2/b$a;

    invoke-direct {v1, v0}, Lqh2/b$a;-><init>(Lec3/l;)V

    sget-object v0, Lqh2/a$d;->a:Lqh2/a$d;

    new-instance v3, Lqh2/b$c;

    invoke-direct {v3, p0, v2}, Lqh2/b$c;-><init>(Lqh2/b;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, v1, v3}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lqh2/b;->F:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Beginning strap metrics history sync obs"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lqh2/b;->f()Lec3/l;

    move-result-object p1

    iget-object v0, p0, Lqh2/b;->w:Lbc3/c0;

    invoke-static {p1, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

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
