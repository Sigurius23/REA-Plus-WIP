.class public final Ll53/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/video/android/core/api/SignalServerService;


# instance fields
.field public final a:Ll53/m;

.field public final b:Lio/getstream/video/android/core/api/SignalServerService;


# direct methods
.method public constructor <init>(Ll53/m;Lio/getstream/video/android/core/api/SignalServerService;)V
    .locals 1

    const-string v0, "target"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll53/j;->a:Ll53/m;

    iput-object p2, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    return-void
.end method


# virtual methods
.method public final iceRestart(Lstream/video/sfu/signal/ICERestartRequest;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Ll53/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll53/b;

    iget v1, v0, Ll53/b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll53/b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll53/b;

    invoke-direct {v0, p0, p2}, Ll53/b;-><init>(Ll53/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ll53/b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll53/b;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ll53/b;->x:Ljava/lang/String;

    iget-object v0, v0, Ll53/b;->w:Ll53/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ll53/j;->a:Ll53/m;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "iceRestart"

    invoke-virtual {p2, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget-object p2, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object p0, v0, Ll53/b;->w:Ll53/j;

    iput-object v4, v0, Ll53/b;->x:Ljava/lang/String;

    iput v3, v0, Ll53/b;->E:I

    invoke-interface {p2, p1, v0}, Lio/getstream/video/android/core/api/SignalServerService;->iceRestart(Lstream/video/sfu/signal/ICERestartRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p1, v4

    :goto_1
    :try_start_2
    move-object v1, p2

    check-cast v1, Lstream/video/sfu/signal/ICERestartResponse;

    invoke-virtual {v1}, Lstream/video/sfu/signal/ICERestartResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, Ll53/j;->a:Ll53/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/models/Error;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    return-object p2

    :catchall_1
    move-exception p2

    move-object v0, p0

    move-object p1, v4

    :goto_2
    iget-object v0, v0, Ll53/j;->a:Ll53/m;

    const-string v1, "-exception"

    invoke-static {p1, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "unknown"

    :cond_5
    invoke-virtual {v0, v1, p1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2

    :goto_3
    throw p1
.end method

.method public final iceTrickle(Lstream/video/sfu/models/ICETrickle;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Ll53/c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll53/c;

    iget v1, v0, Ll53/c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll53/c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll53/c;

    invoke-direct {v0, p0, p2}, Ll53/c;-><init>(Ll53/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ll53/c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll53/c;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ll53/c;->x:Ljava/lang/String;

    iget-object v0, v0, Ll53/c;->w:Ll53/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ll53/j;->a:Ll53/m;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "iceTrickle"

    invoke-virtual {p2, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget-object p2, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object p0, v0, Ll53/c;->w:Ll53/j;

    iput-object v4, v0, Ll53/c;->x:Ljava/lang/String;

    iput v3, v0, Ll53/c;->E:I

    invoke-interface {p2, p1, v0}, Lio/getstream/video/android/core/api/SignalServerService;->iceTrickle(Lstream/video/sfu/models/ICETrickle;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p1, v4

    :goto_1
    :try_start_2
    move-object v1, p2

    check-cast v1, Lstream/video/sfu/signal/ICETrickleResponse;

    invoke-virtual {v1}, Lstream/video/sfu/signal/ICETrickleResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, Ll53/j;->a:Ll53/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/models/Error;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    return-object p2

    :catchall_1
    move-exception p2

    move-object v0, p0

    move-object p1, v4

    :goto_2
    iget-object v0, v0, Ll53/j;->a:Ll53/m;

    const-string v1, "-exception"

    invoke-static {p1, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "unknown"

    :cond_5
    invoke-virtual {v0, v1, p1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2

    :goto_3
    throw p1
.end method

.method public final sendAnswer(Lstream/video/sfu/signal/SendAnswerRequest;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Ll53/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll53/d;

    iget v1, v0, Ll53/d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll53/d;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll53/d;

    invoke-direct {v0, p0, p2}, Ll53/d;-><init>(Ll53/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ll53/d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll53/d;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ll53/d;->x:Ljava/lang/String;

    iget-object v0, v0, Ll53/d;->w:Ll53/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ll53/j;->a:Ll53/m;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "sendAnswer"

    invoke-virtual {p2, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget-object p2, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object p0, v0, Ll53/d;->w:Ll53/j;

    iput-object v4, v0, Ll53/d;->x:Ljava/lang/String;

    iput v3, v0, Ll53/d;->E:I

    invoke-interface {p2, p1, v0}, Lio/getstream/video/android/core/api/SignalServerService;->sendAnswer(Lstream/video/sfu/signal/SendAnswerRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p1, v4

    :goto_1
    :try_start_2
    move-object v1, p2

    check-cast v1, Lstream/video/sfu/signal/SendAnswerResponse;

    invoke-virtual {v1}, Lstream/video/sfu/signal/SendAnswerResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, Ll53/j;->a:Ll53/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/models/Error;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    return-object p2

    :catchall_1
    move-exception p2

    move-object v0, p0

    move-object p1, v4

    :goto_2
    iget-object v0, v0, Ll53/j;->a:Ll53/m;

    const-string v1, "-exception"

    invoke-static {p1, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "unknown"

    :cond_5
    invoke-virtual {v0, v1, p1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2

    :goto_3
    throw p1
.end method

.method public final sendMetrics(Lstream/video/sfu/signal/SendMetricsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    invoke-interface {v0, p1, p2}, Lio/getstream/video/android/core/api/SignalServerService;->sendMetrics(Lstream/video/sfu/signal/SendMetricsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final sendStats(Lstream/video/sfu/signal/SendStatsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    invoke-interface {v0, p1, p2}, Lio/getstream/video/android/core/api/SignalServerService;->sendStats(Lstream/video/sfu/signal/SendStatsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setPublisher(Lstream/video/sfu/signal/SetPublisherRequest;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Ll53/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll53/e;

    iget v1, v0, Ll53/e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll53/e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll53/e;

    invoke-direct {v0, p0, p2}, Ll53/e;-><init>(Ll53/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ll53/e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll53/e;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ll53/e;->x:Ljava/lang/String;

    iget-object v0, v0, Ll53/e;->w:Ll53/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ll53/j;->a:Ll53/m;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "setPublisher"

    invoke-virtual {p2, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget-object p2, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object p0, v0, Ll53/e;->w:Ll53/j;

    iput-object v4, v0, Ll53/e;->x:Ljava/lang/String;

    iput v3, v0, Ll53/e;->E:I

    invoke-interface {p2, p1, v0}, Lio/getstream/video/android/core/api/SignalServerService;->setPublisher(Lstream/video/sfu/signal/SetPublisherRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p1, v4

    :goto_1
    :try_start_2
    move-object v1, p2

    check-cast v1, Lstream/video/sfu/signal/SetPublisherResponse;

    invoke-virtual {v1}, Lstream/video/sfu/signal/SetPublisherResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, Ll53/j;->a:Ll53/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/models/Error;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    return-object p2

    :catchall_1
    move-exception p2

    move-object v0, p0

    move-object p1, v4

    :goto_2
    iget-object v0, v0, Ll53/j;->a:Ll53/m;

    const-string v1, "-exception"

    invoke-static {p1, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "unknown"

    :cond_5
    invoke-virtual {v0, v1, p1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2

    :goto_3
    throw p1
.end method

.method public final startNoiseCancellation(Lstream/video/sfu/signal/StartNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Ll53/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll53/f;

    iget v1, v0, Ll53/f;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll53/f;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll53/f;

    invoke-direct {v0, p0, p2}, Ll53/f;-><init>(Ll53/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ll53/f;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll53/f;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ll53/f;->x:Ljava/lang/String;

    iget-object v0, v0, Ll53/f;->w:Ll53/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ll53/j;->a:Ll53/m;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "startNoiseCancellation"

    invoke-virtual {p2, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget-object p2, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object p0, v0, Ll53/f;->w:Ll53/j;

    iput-object v4, v0, Ll53/f;->x:Ljava/lang/String;

    iput v3, v0, Ll53/f;->E:I

    invoke-interface {p2, p1, v0}, Lio/getstream/video/android/core/api/SignalServerService;->startNoiseCancellation(Lstream/video/sfu/signal/StartNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p1, v4

    :goto_1
    :try_start_2
    move-object v1, p2

    check-cast v1, Lstream/video/sfu/signal/StartNoiseCancellationResponse;

    invoke-virtual {v1}, Lstream/video/sfu/signal/StartNoiseCancellationResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, Ll53/j;->a:Ll53/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/models/Error;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    return-object p2

    :catchall_1
    move-exception p2

    move-object v0, p0

    move-object p1, v4

    :goto_2
    iget-object v0, v0, Ll53/j;->a:Ll53/m;

    const-string v1, "-exception"

    invoke-static {p1, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "unknown"

    :cond_5
    invoke-virtual {v0, v1, p1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2

    :goto_3
    throw p1
.end method

.method public final stopNoiseCancellation(Lstream/video/sfu/signal/StopNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Ll53/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll53/g;

    iget v1, v0, Ll53/g;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll53/g;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll53/g;

    invoke-direct {v0, p0, p2}, Ll53/g;-><init>(Ll53/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ll53/g;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll53/g;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ll53/g;->x:Ljava/lang/String;

    iget-object v0, v0, Ll53/g;->w:Ll53/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ll53/j;->a:Ll53/m;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "stopNoiseCancellation"

    invoke-virtual {p2, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget-object p2, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object p0, v0, Ll53/g;->w:Ll53/j;

    iput-object v4, v0, Ll53/g;->x:Ljava/lang/String;

    iput v3, v0, Ll53/g;->E:I

    invoke-interface {p2, p1, v0}, Lio/getstream/video/android/core/api/SignalServerService;->stopNoiseCancellation(Lstream/video/sfu/signal/StopNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p1, v4

    :goto_1
    :try_start_2
    move-object v1, p2

    check-cast v1, Lstream/video/sfu/signal/StopNoiseCancellationResponse;

    invoke-virtual {v1}, Lstream/video/sfu/signal/StopNoiseCancellationResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, Ll53/j;->a:Ll53/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/models/Error;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    return-object p2

    :catchall_1
    move-exception p2

    move-object v0, p0

    move-object p1, v4

    :goto_2
    iget-object v0, v0, Ll53/j;->a:Ll53/m;

    const-string v1, "-exception"

    invoke-static {p1, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "unknown"

    :cond_5
    invoke-virtual {v0, v1, p1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2

    :goto_3
    throw p1
.end method

.method public final updateMuteStates(Lstream/video/sfu/signal/UpdateMuteStatesRequest;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Ll53/h;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll53/h;

    iget v1, v0, Ll53/h;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll53/h;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll53/h;

    invoke-direct {v0, p0, p2}, Ll53/h;-><init>(Ll53/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ll53/h;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll53/h;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ll53/h;->x:Ljava/lang/String;

    iget-object v0, v0, Ll53/h;->w:Ll53/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ll53/j;->a:Ll53/m;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "updateMuteStates"

    invoke-virtual {p2, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget-object p2, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object p0, v0, Ll53/h;->w:Ll53/j;

    iput-object v4, v0, Ll53/h;->x:Ljava/lang/String;

    iput v3, v0, Ll53/h;->E:I

    invoke-interface {p2, p1, v0}, Lio/getstream/video/android/core/api/SignalServerService;->updateMuteStates(Lstream/video/sfu/signal/UpdateMuteStatesRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p1, v4

    :goto_1
    :try_start_2
    move-object v1, p2

    check-cast v1, Lstream/video/sfu/signal/UpdateMuteStatesResponse;

    invoke-virtual {v1}, Lstream/video/sfu/signal/UpdateMuteStatesResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, Ll53/j;->a:Ll53/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/models/Error;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    return-object p2

    :catchall_1
    move-exception p2

    move-object v0, p0

    move-object p1, v4

    :goto_2
    iget-object v0, v0, Ll53/j;->a:Ll53/m;

    const-string v1, "-exception"

    invoke-static {p1, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "unknown"

    :cond_5
    invoke-virtual {v0, v1, p1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2

    :goto_3
    throw p1
.end method

.method public final updateSubscriptions(Lstream/video/sfu/signal/UpdateSubscriptionsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Ll53/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll53/i;

    iget v1, v0, Ll53/i;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll53/i;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll53/i;

    invoke-direct {v0, p0, p2}, Ll53/i;-><init>(Ll53/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ll53/i;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll53/i;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ll53/i;->x:Ljava/lang/String;

    iget-object v0, v0, Ll53/i;->w:Ll53/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ll53/j;->a:Ll53/m;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "updateSubscriptions"

    invoke-virtual {p2, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget-object p2, p0, Ll53/j;->b:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object p0, v0, Ll53/i;->w:Ll53/j;

    iput-object v4, v0, Ll53/i;->x:Ljava/lang/String;

    iput v3, v0, Ll53/i;->E:I

    invoke-interface {p2, p1, v0}, Lio/getstream/video/android/core/api/SignalServerService;->updateSubscriptions(Lstream/video/sfu/signal/UpdateSubscriptionsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p1, v4

    :goto_1
    :try_start_2
    move-object v1, p2

    check-cast v1, Lstream/video/sfu/signal/UpdateSubscriptionsResponse;

    invoke-virtual {v1}, Lstream/video/sfu/signal/UpdateSubscriptionsResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, Ll53/j;->a:Ll53/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/models/Error;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    return-object p2

    :catchall_1
    move-exception p2

    move-object v0, p0

    move-object p1, v4

    :goto_2
    iget-object v0, v0, Ll53/j;->a:Ll53/m;

    const-string v1, "-exception"

    invoke-static {p1, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "unknown"

    :cond_5
    invoke-virtual {v0, v1, p1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2

    :goto_3
    throw p1
.end method
