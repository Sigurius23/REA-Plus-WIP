.class public final Lfg/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg/n;


# static fields
.field public static final f:Lio/sentry/hints/j;


# instance fields
.field public final a:Lqt/e;

.field public final b:Lkotlin/time/TimeSource$Monotonic;

.field public c:I

.field public d:Lkotlin/time/TimeMark;

.field public final e:Lmc3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Lfg/u;->f:Lio/sentry/hints/j;

    return-void
.end method

.method public constructor <init>(Lqt/e;)V
    .locals 2

    sget-object v0, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    const-string v1, "timeSource"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg/u;->a:Lqt/e;

    iput-object v0, p0, Lfg/u;->b:Lkotlin/time/TimeSource$Monotonic;

    const/16 p1, 0x1f4

    iput p1, p0, Lfg/u;->c:I

    invoke-interface {v0}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p1

    iput-object p1, p0, Lfg/u;->d:Lkotlin/time/TimeMark;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lfg/u;->e:Lmc3/c;

    return-void
.end method

.method public static final a(Lfg/u;ILs83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lfg/t;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfg/t;

    iget v1, v0, Lfg/t;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfg/t;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfg/t;

    invoke-direct {v0, p0, p2}, Lfg/t;-><init>(Lfg/u;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lfg/t;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfg/t;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lfg/t;->w:I

    iget-object v0, v0, Lfg/t;->x:Lmc3/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lfg/u;->e:Lmc3/c;

    iput-object p2, v0, Lfg/t;->x:Lmc3/c;

    iput p1, v0, Lfg/t;->w:I

    iput v3, v0, Lfg/t;->E:I

    invoke-virtual {p2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p2

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lfg/u;->d()V

    iget-object v1, p0, Lfg/u;->a:Lqt/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p0, Lfg/u;->c:I

    add-int/2addr v1, p1

    const/16 p1, 0x1f4

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lfg/u;->c:I

    iget-object p1, p0, Lfg/u;->b:Lkotlin/time/TimeSource$Monotonic;

    invoke-interface {p1}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p1

    iput-object p1, p0, Lfg/u;->d:Lkotlin/time/TimeMark;

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {v0, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p0
.end method


# virtual methods
.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lfg/r;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lfg/r;

    iget v1, v0, Lfg/r;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfg/r;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfg/r;

    invoke-direct {v0, p0, p1}, Lfg/r;-><init>(Lfg/u;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lfg/r;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfg/r;->y:I

    iget-object v3, p0, Lfg/u;->a:Lqt/e;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v4, v0, Lfg/r;->y:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0}, Lfg/u;->c(ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Lfg/q;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p1, p0, v4}, Lfg/q;-><init>(Lfg/u;I)V

    return-object p1
.end method

.method public final c(ILs83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lfg/s;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfg/s;

    iget v1, v0, Lfg/s;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfg/s;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfg/s;

    invoke-direct {v0, p0, p2}, Lfg/s;-><init>(Lfg/u;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lfg/s;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfg/s;->E:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    const/4 p1, 0x2

    if-ne v2, p1, :cond_1

    iget-object p1, v0, Lfg/s;->x:Lmc3/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p2, 0x0

    iput p2, p0, Lfg/u;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lfg/s;->w:I

    iget-object v0, v0, Lfg/s;->x:Lmc3/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v0

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lfg/u;->e:Lmc3/c;

    iput-object p2, v0, Lfg/s;->x:Lmc3/a;

    iput p1, v0, Lfg/s;->w:I

    iput v3, v0, Lfg/s;->E:I

    invoke-virtual {p2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lfg/u;->d()V

    iget v0, p0, Lfg/u;->c:I

    if-gt p1, v0, :cond_5

    sub-int/2addr v0, p1

    iput v0, p0, Lfg/u;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p1, p2

    :goto_2
    :try_start_2
    iget-object p2, p0, Lfg/u;->b:Lkotlin/time/TimeSource$Monotonic;

    invoke-interface {p2}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p2

    iput-object p2, p0, Lfg/u;->d:Lkotlin/time/TimeMark;

    sget-object p2, Ll83/a0;->a:Ll83/a0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p1, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p2

    :catchall_1
    move-exception p1

    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    goto :goto_3

    :cond_5
    :try_start_3
    iget-object p1, p0, Lfg/u;->a:Lqt/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException;

    const-string v0, "Insufficient capacity to attempt retry"

    invoke-direct {p1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    invoke-interface {p1, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lfg/u;->d:Lkotlin/time/TimeMark;

    invoke-interface {v0}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v0

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    iget-object v2, p0, Lfg/u;->a:Lqt/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    int-to-double v2, v2

    mul-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget v1, p0, Lfg/u;->c:I

    add-int/2addr v1, v0

    const/16 v0, 0x1f4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lfg/u;->c:I

    return-void
.end method
