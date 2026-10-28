.class public final Lp33/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/video/android/core/api/SignalServerService;


# instance fields
.field public final a:Ll53/j;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lt9/p;

.field public final d:Lw43/b;


# direct methods
.method public constructor <init>(Ll53/j;Lj43/a;)V
    .locals 6

    new-instance v0, Lt9/p;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    new-instance v1, Ltx/a;

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v1, v3, v2}, Ltx/a;-><init>(II)V

    new-instance v2, Lw43/b;

    new-instance v4, Ltx/a;

    const/4 v5, 0x2

    invoke-direct {v4, v3, v5}, Ltx/a;-><init>(II)V

    invoke-direct {v2, v1, v4}, Lw43/b;-><init>(Lc93/m;Ltx/a;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp33/o;->a:Ll53/j;

    iput-object p2, p0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    iput-object v0, p0, Lp33/o;->c:Lt9/p;

    iput-object v2, p0, Lp33/o;->d:Lw43/b;

    return-void
.end method

.method public static a(Lstream/video/sfu/models/Error;)Z
    .locals 2

    invoke-virtual {p0}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object p0

    sget-object v0, Lp33/c;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    const/4 v1, 0x3

    if-eq p0, v1, :cond_0

    const/4 v1, 0x4

    if-eq p0, v1, :cond_0

    const/4 v1, 0x5

    if-eq p0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v0
.end method


# virtual methods
.method public final iceRestart(Lstream/video/sfu/signal/ICERestartRequest;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lp33/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/d;

    iget v1, v0, Lp33/d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/d;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/d;

    invoke-direct {v0, p0, p2}, Lp33/d;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/d;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/d;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lp33/d;->w:Lp33/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lb2/y;

    const/4 v7, 0x0

    const/16 v10, 0x15

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v10}, Lb2/y;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lcom/squareup/wire/l;I)V

    iput-object v6, v0, Lp33/d;->w:Lp33/o;

    iput-object v5, v0, Lp33/d;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/d;->E:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    move-object v0, v6

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/ICERestartResponse;

    invoke-virtual {p1}, Lstream/video/sfu/signal/ICERestartResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, v0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    return-object p2

    :cond_7
    throw v1
.end method

.method public final iceTrickle(Lstream/video/sfu/models/ICETrickle;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lp33/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/e;

    iget v1, v0, Lp33/e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/e;

    invoke-direct {v0, p0, p2}, Lp33/e;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/e;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/e;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lp33/e;->w:Lp33/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lb2/y;

    const/4 v7, 0x0

    const/16 v10, 0x16

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v10}, Lb2/y;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lcom/squareup/wire/l;I)V

    iput-object v6, v0, Lp33/e;->w:Lp33/o;

    iput-object v5, v0, Lp33/e;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/e;->E:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    move-object v0, v6

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/ICETrickleResponse;

    invoke-virtual {p1}, Lstream/video/sfu/signal/ICETrickleResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, v0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    return-object p2

    :cond_7
    throw v1
.end method

.method public final sendAnswer(Lstream/video/sfu/signal/SendAnswerRequest;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lp33/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/f;

    iget v1, v0, Lp33/f;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/f;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/f;

    invoke-direct {v0, p0, p2}, Lp33/f;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/f;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/f;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/f;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lp33/f;->w:Lp33/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lb2/y;

    const/4 v7, 0x0

    const/16 v10, 0x17

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v10}, Lb2/y;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lcom/squareup/wire/l;I)V

    iput-object v6, v0, Lp33/f;->w:Lp33/o;

    iput-object v5, v0, Lp33/f;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/f;->E:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    move-object v0, v6

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/SendAnswerResponse;

    invoke-virtual {p1}, Lstream/video/sfu/signal/SendAnswerResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, v0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    return-object p2

    :cond_7
    throw v1
.end method

.method public final sendMetrics(Lstream/video/sfu/signal/SendMetricsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lp33/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/g;

    iget v1, v0, Lp33/g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/g;

    invoke-direct {v0, p0, p2}, Lp33/g;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/g;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/g;->w:Lkotlin/jvm/internal/g0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lb2/y;

    const/4 v7, 0x0

    const/16 v10, 0x18

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v10}, Lb2/y;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lcom/squareup/wire/l;I)V

    iput-object v5, v0, Lp33/g;->w:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/g;->z:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_5

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/SendMetricsResponse;

    return-object p2

    :cond_5
    throw v0
.end method

.method public final sendStats(Lstream/video/sfu/signal/SendStatsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lp33/h;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/h;

    iget v1, v0, Lp33/h;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/h;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/h;

    invoke-direct {v0, p0, p2}, Lp33/h;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/h;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/h;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/h;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lp33/h;->w:Lp33/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lb2/y;

    const/4 v7, 0x0

    const/16 v10, 0x19

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v10}, Lb2/y;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lcom/squareup/wire/l;I)V

    iput-object v6, v0, Lp33/h;->w:Lp33/o;

    iput-object v5, v0, Lp33/h;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/h;->E:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    move-object v0, v6

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/SendStatsResponse;

    invoke-virtual {p1}, Lstream/video/sfu/signal/SendStatsResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, v0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    return-object p2

    :cond_7
    throw v1
.end method

.method public final setPublisher(Lstream/video/sfu/signal/SetPublisherRequest;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lp33/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/i;

    iget v1, v0, Lp33/i;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/i;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/i;

    invoke-direct {v0, p0, p2}, Lp33/i;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/i;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/i;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/i;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lp33/i;->w:Lp33/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lb2/y;

    const/4 v7, 0x0

    const/16 v10, 0x1a

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v10}, Lb2/y;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lcom/squareup/wire/l;I)V

    iput-object v6, v0, Lp33/i;->w:Lp33/o;

    iput-object v5, v0, Lp33/i;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/i;->E:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    move-object v0, v6

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/SetPublisherResponse;

    invoke-virtual {p1}, Lstream/video/sfu/signal/SetPublisherResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, v0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    return-object p2

    :cond_7
    throw v1
.end method

.method public final startNoiseCancellation(Lstream/video/sfu/signal/StartNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lp33/j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/j;

    iget v1, v0, Lp33/j;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/j;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/j;

    invoke-direct {v0, p0, p2}, Lp33/j;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/j;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/j;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/j;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lp33/j;->w:Lp33/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lb2/y;

    const/4 v7, 0x0

    const/16 v10, 0x1b

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v10}, Lb2/y;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lcom/squareup/wire/l;I)V

    iput-object v6, v0, Lp33/j;->w:Lp33/o;

    iput-object v5, v0, Lp33/j;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/j;->E:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    move-object v0, v6

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/StartNoiseCancellationResponse;

    invoke-virtual {p1}, Lstream/video/sfu/signal/StartNoiseCancellationResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, v0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    return-object p2

    :cond_7
    throw v1
.end method

.method public final stopNoiseCancellation(Lstream/video/sfu/signal/StopNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lp33/k;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/k;

    iget v1, v0, Lp33/k;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/k;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/k;

    invoke-direct {v0, p0, p2}, Lp33/k;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/k;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/k;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/k;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lp33/k;->w:Lp33/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lb2/y;

    const/4 v7, 0x0

    const/16 v10, 0x1c

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v10}, Lb2/y;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lcom/squareup/wire/l;I)V

    iput-object v6, v0, Lp33/k;->w:Lp33/o;

    iput-object v5, v0, Lp33/k;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/k;->E:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    move-object v0, v6

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/StopNoiseCancellationResponse;

    invoke-virtual {p1}, Lstream/video/sfu/signal/StopNoiseCancellationResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, v0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    return-object p2

    :cond_7
    throw v1
.end method

.method public final updateMuteStates(Lstream/video/sfu/signal/UpdateMuteStatesRequest;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lp33/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/l;

    iget v1, v0, Lp33/l;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/l;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/l;

    invoke-direct {v0, p0, p2}, Lp33/l;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/l;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/l;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/l;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lp33/l;->w:Lp33/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lb2/y;

    const/4 v7, 0x0

    const/16 v10, 0x1d

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v10}, Lb2/y;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lcom/squareup/wire/l;I)V

    iput-object v6, v0, Lp33/l;->w:Lp33/o;

    iput-object v5, v0, Lp33/l;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/l;->E:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    move-object v0, v6

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/UpdateMuteStatesResponse;

    invoke-virtual {p1}, Lstream/video/sfu/signal/UpdateMuteStatesResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, v0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    return-object p2

    :cond_7
    throw v1
.end method

.method public final updateSubscriptions(Lstream/video/sfu/signal/UpdateSubscriptionsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lp33/n;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp33/n;

    iget v1, v0, Lp33/n;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp33/n;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp33/n;

    invoke-direct {v0, p0, p2}, Lp33/n;-><init>(Lp33/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp33/n;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp33/n;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp33/n;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lp33/n;->w:Lp33/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v5

    new-instance v4, Lp33/m;

    const/4 v7, 0x0

    move-object v8, p0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v9}, Lp33/m;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lstream/video/sfu/signal/UpdateSubscriptionsRequest;)V

    iput-object v6, v0, Lp33/n;->w:Lp33/o;

    iput-object v5, v0, Lp33/n;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lp33/n;->E:I

    iget-object p1, v6, Lp33/o;->c:Lt9/p;

    iget-object p2, v6, Lp33/o;->d:Lw43/b;

    invoke-virtual {p1, p2, v4, v0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    move-object v0, v6

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_2
    move-object p1, p2

    check-cast p1, Lstream/video/sfu/signal/UpdateSubscriptionsResponse;

    invoke-virtual {p1}, Lstream/video/sfu/signal/UpdateSubscriptionsResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, v0, Lp33/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lio/getstream/video/android/core/call/utils/SessionFatalException;

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    return-object p2

    :cond_7
    throw v1
.end method
