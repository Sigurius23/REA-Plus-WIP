.class public final Lfg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg/m;


# static fields
.field public static final j:Lkr/e;


# instance fields
.field public final a:Lfg/b;

.field public final b:Lkotlin/time/TimeSource$Monotonic;

.field public final c:Lfg/f;

.field public final d:Lfg/g;

.field public e:D

.field public f:Lkotlin/time/TimeMark;

.field public g:D

.field public h:D

.field public final i:Lmc3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkr/e;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    sput-object v0, Lfg/e;->j:Lkr/e;

    return-void
.end method

.method public constructor <init>(Lfg/b;)V
    .locals 4

    sget-object v0, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    new-instance v1, Lfg/f;

    invoke-direct {v1, p1, v0}, Lfg/f;-><init>(Lfg/b;Lkotlin/time/TimeSource$Monotonic;)V

    new-instance v2, Lfg/g;

    invoke-direct {v2, p1, v0}, Lfg/g;-><init>(Lfg/b;Lkotlin/time/TimeSource$Monotonic;)V

    const-string v3, "timeSource"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg/e;->a:Lfg/b;

    iput-object v0, p0, Lfg/e;->b:Lkotlin/time/TimeSource$Monotonic;

    iput-object v1, p0, Lfg/e;->c:Lfg/f;

    iput-object v2, p0, Lfg/e;->d:Lfg/g;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lfg/e;->i:Lmc3/c;

    return-void
.end method


# virtual methods
.method public final a(ILs83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lfg/c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfg/c;

    iget v1, v0, Lfg/c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfg/c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfg/c;

    invoke-direct {v0, p0, p2}, Lfg/c;-><init>(Lfg/e;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lfg/c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfg/c;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lfg/c;->y:Lmc3/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p2

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lfg/c;->x:I

    iget v2, v0, Lfg/c;->w:I

    iget-object v4, v0, Lfg/c;->y:Lmc3/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, v2

    move v2, p1

    move p1, p2

    move-object p2, v4

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lfg/e;->i:Lmc3/c;

    iput-object p2, v0, Lfg/c;->y:Lmc3/a;

    iput p1, v0, Lfg/c;->w:I

    const/4 v2, 0x0

    iput v2, v0, Lfg/c;->x:I

    iput v4, v0, Lfg/c;->F:I

    invoke-virtual {p2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_1
    iget-object v4, p0, Lfg/e;->d:Lfg/g;

    iget-boolean v4, v4, Lfg/g;->e:Z

    if-eqz v4, :cond_7

    invoke-virtual {p0}, Lfg/e;->b()V

    int-to-double v6, p1

    iget-wide v8, p0, Lfg/e;->e:D

    cmpg-double v4, v6, v8

    if-gtz v4, :cond_5

    sub-double/2addr v8, v6

    iput-wide v8, p0, Lfg/e;->e:D

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    goto :goto_6

    :cond_5
    sub-double/2addr v6, v8

    sget-object v4, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget-wide v8, p0, Lfg/e;->g:D

    div-double/2addr v6, v8

    sget-object v4, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v6, v7, v4}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide v6

    iput-object p2, v0, Lfg/c;->y:Lmc3/a;

    iput p1, v0, Lfg/c;->w:I

    iput v2, v0, Lfg/c;->x:I

    iput v3, v0, Lfg/c;->F:I

    invoke-static {v6, v7, v0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object p1, p2

    :goto_3
    const-wide/16 v0, 0x0

    :try_start_2
    iput-wide v0, p0, Lfg/e;->e:D

    goto :goto_5

    :cond_7
    :goto_4
    move-object p1, p2

    :goto_5
    sget-object p2, Ll83/a0;->a:Ll83/a0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p2

    :goto_6
    invoke-interface {p1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Lfg/e;->f:Lkotlin/time/TimeMark;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v0

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    iget-wide v2, p0, Lfg/e;->g:D

    mul-double/2addr v2, v0

    iget-wide v0, p0, Lfg/e;->h:D

    iget-wide v4, p0, Lfg/e;->e:D

    add-double/2addr v4, v2

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lfg/e;->e:D

    :cond_0
    iget-object v0, p0, Lfg/e;->b:Lkotlin/time/TimeSource$Monotonic;

    invoke-interface {v0}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object v0

    iput-object v0, p0, Lfg/e;->f:Lkotlin/time/TimeMark;

    return-void
.end method

.method public final c(Lgg/f;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lfg/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfg/d;

    iget v1, v0, Lfg/d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfg/d;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfg/d;

    invoke-direct {v0, p0, p2}, Lfg/d;-><init>(Lfg/e;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lfg/d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfg/d;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lfg/d;->x:Lmc3/c;

    iget-object v0, v0, Lfg/d;->w:Lgg/f;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lfg/d;->w:Lgg/f;

    iget-object p2, p0, Lfg/e;->i:Lmc3/c;

    iput-object p2, v0, Lfg/d;->x:Lmc3/c;

    iput v3, v0, Lfg/d;->E:I

    invoke-virtual {p2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v3, p1

    move-object p1, p2

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    iget-object v0, p0, Lfg/e;->c:Lfg/f;

    invoke-virtual {v0}, Lfg/f;->a()D

    move-result-wide v4

    iget-object v2, p0, Lfg/e;->d:Lfg/g;

    iget-wide v6, p0, Lfg/e;->g:D

    invoke-virtual/range {v2 .. v7}, Lfg/g;->a(Lgg/f;DD)D

    move-result-wide v0

    const/4 v2, 0x2

    int-to-double v2, v2

    mul-double/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-virtual {p0}, Lfg/e;->b()V

    iget-object v2, p0, Lfg/e;->a:Lfg/b;

    iget-wide v3, v2, Lfg/b;->c:D

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    iput-wide v3, p0, Lfg/e;->g:D

    iget-wide v2, v2, Lfg/b;->b:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lfg/e;->h:D

    iget-wide v2, p0, Lfg/e;->e:D

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lfg/e;->e:D

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {p1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method
