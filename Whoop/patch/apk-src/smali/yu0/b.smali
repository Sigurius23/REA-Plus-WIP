.class public final Lyu0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u000f2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001aR\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lyu0/b;",
        "",
        "Liy1/c;",
        "metricWriter",
        "Lmu0/a;",
        "metricsDataDao",
        "Ljava/time/Clock;",
        "clock",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Liy1/c;Lmu0/a;Ljava/time/Clock;La6/g;Ltr2/n;)V",
        "Ll83/a0;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "a",
        "",
        "foregroundCrash",
        "c",
        "(Ljava/lang/Boolean;Lq83/d;)Ljava/lang/Object;",
        "Liy1/c;",
        "Lmu0/a;",
        "Ljava/time/Clock;",
        "d",
        "La6/g;",
        "e",
        "Ltr2/n;",
        "connectivity-analytics_release"
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
.field private final a:Liy1/c;

.field private final b:Lmu0/a;

.field private final c:Ljava/time/Clock;

.field private final d:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final e:Ltr2/n;


# direct methods
.method public constructor <init>(Liy1/c;Lmu0/a;Ljava/time/Clock;La6/g;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liy1/c;",
            "Lmu0/a;",
            "Ljava/time/Clock;",
            "La6/g;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsDataDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStore"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyu0/b;->a:Liy1/c;

    .line 3
    iput-object p2, p0, Lyu0/b;->b:Lmu0/a;

    .line 4
    iput-object p3, p0, Lyu0/b;->c:Ljava/time/Clock;

    .line 5
    iput-object p4, p0, Lyu0/b;->d:La6/g;

    .line 6
    iput-object p5, p0, Lyu0/b;->e:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Liy1/c;Lmu0/a;Ljava/time/Clock;La6/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 7
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p3

    const-string p7, "systemDefaultZone(...)"

    invoke-static {p3, p7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_1

    .line 8
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "DataBacklogReporter"

    invoke-virtual {p3, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Lyu0/b;-><init>(Liy1/c;Lmu0/a;Ljava/time/Clock;La6/g;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lyu0/b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lyu0/b$a;

    iget v1, v0, Lyu0/b$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyu0/b$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyu0/b$a;

    invoke-direct {v0, p0, p1}, Lyu0/b$a;-><init>(Lyu0/b;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lyu0/b$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyu0/b$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lyu0/b;->b:Lmu0/a;

    iput v3, v0, Lyu0/b$a;->y:I

    invoke-interface {p1, v3, v0}, Lmu0/a;->e(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnu0/a;

    iget-object v0, p0, Lyu0/b;->c:Ljava/time/Clock;

    invoke-virtual {v0}, Ljava/time/Clock;->millis()J

    move-result-wide v0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lnu0/a;->getTimestamp()J

    move-result-wide v2

    goto :goto_2

    :cond_4
    move-wide v2, v0

    :goto_2
    const-wide/16 v4, 0x0

    sub-long/2addr v0, v2

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x40ed4c0000000000L    # 60000.0

    div-double/2addr v0, v2

    new-instance p1, Ljava/lang/Double;

    invoke-direct {p1, v0, v1}, Ljava/lang/Double;-><init>(D)V

    return-object p1
.end method

.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 17
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

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lyu0/b$b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lyu0/b$b;

    iget v3, v2, Lyu0/b$b;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lyu0/b$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v2, Lyu0/b$b;

    invoke-direct {v2, v1, v0}, Lyu0/b$b;-><init>(Lyu0/b;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Lyu0/b$b;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lyu0/b$b;->F:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lyu0/b$b;->y:Ljava/lang/Object;

    check-cast v3, Ljy1/a;

    iget-object v2, v2, Lyu0/b$b;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v7, v2, Lyu0/b$b;->w:D

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput v8, v2, Lyu0/b$b;->F:I

    invoke-virtual {v1, v2}, Lyu0/b;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v0, v1, Lyu0/b;->d:La6/g;

    invoke-interface {v0}, La6/g;->getData()Lec3/l;

    move-result-object v0

    iput-wide v8, v2, Lyu0/b$b;->w:D

    iput v7, v2, Lyu0/b$b;->F:I

    invoke-static {v0, v2}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    goto :goto_3

    :cond_6
    move-wide v7, v8

    :goto_2
    check-cast v0, Lf6/f;

    invoke-static {}, Lyu0/c;->a()Lf6/d;

    move-result-object v4

    invoke-virtual {v0, v4}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    new-instance v9, Ljy1/a;

    new-instance v12, Ljava/lang/Double;

    invoke-direct {v12, v7, v8}, Ljava/lang/Double;-><init>(D)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v10, "foreground_crash:"

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const/16 v15, 0x11

    const/16 v16, 0x0

    const/4 v10, 0x0

    const-string v11, "crash.data.backlog"

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, v1, Lyu0/b;->a:Liy1/c;

    const/4 v4, 0x0

    iput-object v4, v2, Lyu0/b$b;->x:Ljava/lang/Object;

    iput-object v4, v2, Lyu0/b$b;->y:Ljava/lang/Object;

    iput-wide v7, v2, Lyu0/b$b;->w:D

    iput v6, v2, Lyu0/b$b;->F:I

    invoke-interface {v0, v9, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    :goto_3
    return-object v3

    :cond_7
    return-object v5

    :goto_4
    iget-object v2, v1, Lyu0/b;->e:Ltr2/n;

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Failed to get oldest metric data"

    invoke-interface {v2, v4, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v5
.end method

.method public final c(Ljava/lang/Boolean;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    iget-object v2, p0, Lyu0/b;->d:La6/g;

    new-instance v3, Lyu0/b$c;

    invoke-direct {v3, p1, v1}, Lyu0/b$c;-><init>(Ljava/lang/Boolean;Lq83/d;)V

    invoke-static {v2, v3, p2}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v0

    :cond_1
    iget-object p1, p0, Lyu0/b;->d:La6/g;

    new-instance v2, Lyu0/b$d;

    invoke-direct {v2, v1}, Lyu0/b$d;-><init>(Lq83/d;)V

    invoke-static {p1, v2, p2}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    return-object v0
.end method
