.class public abstract Lcom/whoop/metrics/worker/BaseReportingWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008&\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J,\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tH\u00a6@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0084@\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0016R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001b\u001a\u0004\u0008!\u0010\"R\u0014\u0010&\u001a\u00020\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Lof3/a;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lic/u;",
        "result",
        "",
        "startTime",
        "",
        "throwable",
        "Ll83/a0;",
        "h",
        "(Lic/u;JLjava/lang/Throwable;Lq83/d;)Ljava/lang/Object;",
        "",
        "i",
        "(Lic/u;Ljava/lang/Throwable;)Ljava/lang/String;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "g",
        "doWork",
        "Liy1/c;",
        "w",
        "Ll83/h;",
        "d",
        "()Liy1/c;",
        "metricWriter",
        "Ltr2/n;",
        "x",
        "c",
        "()Ltr2/n;",
        "logger",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "metrics_release"
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
.field private final w:Ll83/h;

.field private final x:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/metrics/worker/BaseReportingWorker$c;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/metrics/worker/BaseReportingWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/metrics/worker/BaseReportingWorker;->w:Ll83/h;

    new-instance p1, Lm83/p;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/metrics/worker/BaseReportingWorker;->x:Ll83/h;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/metrics/worker/BaseReportingWorker;)Ltr2/n;
    .locals 0

    invoke-static {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->f(Lcom/whoop/metrics/worker/BaseReportingWorker;)Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/whoop/metrics/worker/BaseReportingWorker;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/metrics/worker/BaseReportingWorker;",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/metrics/worker/BaseReportingWorker$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/metrics/worker/BaseReportingWorker$a;

    iget v1, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/metrics/worker/BaseReportingWorker$a;

    invoke-direct {v0, p0, p1}, Lcom/whoop/metrics/worker/BaseReportingWorker$a;-><init>(Lcom/whoop/metrics/worker/BaseReportingWorker;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->z:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->F:I

    const/4 v8, 0x0

    const/4 v9, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v9, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object p0, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->x:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    iget-object v0, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/metrics/worker/BaseReportingWorker;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_2
    iget-wide v1, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->y:J

    iget-object p0, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->x:Ljava/lang/Object;

    check-cast p0, Lic/u;

    iget-object v0, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->w:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/metrics/worker/BaseReportingWorker;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-wide v10, v1

    move-object v1, v3

    move-wide v3, v10

    :goto_2
    move-object v5, p0

    goto :goto_5

    :cond_3
    iget-wide v2, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->y:J

    iget-object p0, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->w:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/metrics/worker/BaseReportingWorker;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-wide v3, v2

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v1, p0

    move-object v5, p1

    move-wide v3, v2

    goto :goto_5

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->e()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Starting work for "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {p1, v0, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    :try_start_2
    iput-object p0, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->w:Ljava/lang/Object;

    iput-wide v3, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->y:J

    iput v2, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->F:I

    invoke-virtual {p0, v6}, Lcom/whoop/metrics/worker/BaseReportingWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    if-ne p1, v7, :cond_5

    goto :goto_6

    :cond_5
    :goto_3
    :try_start_3
    move-object v2, p1

    check-cast v2, Lic/u;

    iput-object p0, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->w:Ljava/lang/Object;

    iput-object v2, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->x:Ljava/lang/Object;

    iput-wide v3, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->y:J

    iput v1, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->F:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    const/4 v5, 0x0

    move-object v1, p0

    :try_start_4
    invoke-direct/range {v1 .. v6}, Lcom/whoop/metrics/worker/BaseReportingWorker;->h(Lic/u;JLjava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne p0, v7, :cond_6

    goto :goto_6

    :cond_6
    return-object v2

    :catchall_2
    move-exception v0

    :goto_4
    move-object p0, v0

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v1, p0

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object p1, v0

    move-object v1, p0

    move-object v5, p1

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p0

    const-string p1, "Worker threw an exception"

    new-array v0, v8, [Lqr2/a$a;

    invoke-interface {p0, p1, v5, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p0, 0x0

    iput-object p0, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->w:Ljava/lang/Object;

    iput-object v5, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->x:Ljava/lang/Object;

    iput-wide v3, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->y:J

    iput v9, v6, Lcom/whoop/metrics/worker/BaseReportingWorker$a;->F:I

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/metrics/worker/BaseReportingWorker;->h(Lic/u;JLjava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v7, :cond_7

    :goto_6
    return-object v7

    :cond_7
    move-object p0, v5

    :goto_7
    throw p0
.end method

.method private final d()Liy1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/metrics/worker/BaseReportingWorker;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liy1/c;

    return-object v0
.end method

.method private static final f(Lcom/whoop/metrics/worker/BaseReportingWorker;)Ltr2/n;
    .locals 1

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->e()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lic/u;JLjava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic/u;",
            "J",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sub-long/2addr v1, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p2

    invoke-direct {p0, p1, p4}, Lcom/whoop/metrics/worker/BaseReportingWorker;->i(Lic/u;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p4

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ending work for "

    const-string v2, " with outcome "

    invoke-static {v1, v0, v2, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p4, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->d()Liy1/c;

    move-result-object p4

    new-instance v0, Ljy1/a;

    long-to-double p2, p2

    new-instance v3, Ljava/lang/Double;

    invoke-direct {v3, p2, p3}, Ljava/lang/Double;-><init>(D)V

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->e()Ljava/lang/String;

    move-result-object p2

    const-string p3, "worker_type:"

    invoke-static {p3, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "outcome:"

    invoke-static {p3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/16 v6, 0x11

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v2, "workmanager.worker.run.outcome"

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p4, v0, p5}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final i(Lic/u;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_1

    instance-of p1, p2, Ljava/util/concurrent/CancellationException;

    if-eqz p1, :cond_0

    const-string p1, "cancellation_exception"

    return-object p1

    :cond_0
    const-string p1, "exception"

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lic/u;->a()Lic/g;

    move-result-object p2

    new-instance v0, Lic/t;

    invoke-direct {v0, p2}, Lic/t;-><init>(Lic/g;)V

    invoke-virtual {p1}, Lic/u;->a()Lic/g;

    move-result-object p2

    new-instance v1, Lic/r;

    invoke-direct {v1, p2}, Lic/r;-><init>(Lic/g;)V

    new-instance p2, Lic/s;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "success"

    return-object p1

    :cond_2
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "failure"

    return-object p1

    :cond_3
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "retry"

    return-object p1

    :cond_4
    const-string p1, "unknown"

    return-object p1
.end method


# virtual methods
.method public final c()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lcom/whoop/metrics/worker/BaseReportingWorker;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltr2/n;

    return-object v0
.end method

.method public doWork(Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/whoop/metrics/worker/BaseReportingWorker;->b(Lcom/whoop/metrics/worker/BaseReportingWorker;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public final g(Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p1, Lcom/whoop/metrics/worker/BaseReportingWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;

    iget v1, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/whoop/metrics/worker/BaseReportingWorker$b;-><init>(Lcom/whoop/metrics/worker/BaseReportingWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/metrics/worker/BaseReportingWorker;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-gt p1, v2, :cond_5

    iput-object p0, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;->w:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;->z:I

    invoke-virtual {p0, v0}, Landroidx/work/CoroutineWorker;->getForegroundInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p1, Lic/m;

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;->w:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/metrics/worker/BaseReportingWorker$b;->z:I

    invoke-virtual {v2, p1, v0}, Landroidx/work/CoroutineWorker;->setForeground(Lic/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    return-object v3
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public abstract j(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
