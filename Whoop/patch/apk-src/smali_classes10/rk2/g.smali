.class public final Lrk2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrk2/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJN\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0096@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0016H\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010 \u001a\u00020\u001fH\u0096@\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0096@\u00a2\u0006\u0004\u0008#\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lrk2/g;",
        "Lrk2/f;",
        "Lrk2/c;",
        "dao",
        "Ljava/time/Clock;",
        "clock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lrk2/c;Ljava/time/Clock;Ltr2/n;)V",
        "Lrk2/e;",
        "Lrk2/b;",
        "d",
        "(Lrk2/e;)Lrk2/b;",
        "",
        "activityInternalName",
        "",
        "garmentId",
        "startTime",
        "endTime",
        "",
        "gpsEnabled",
        "",
        "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
        "pauseSegments",
        "Ll83/n;",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;",
        "getAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "id",
        "b",
        "(JLq83/d;)Ljava/lang/Object;",
        "c",
        "Lrk2/c;",
        "Ljava/time/Clock;",
        "Ltr2/n;",
        "track-activity_release"
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
.field private final a:Lrk2/c;

.field private final b:Ljava/time/Clock;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lrk2/c;Ljava/time/Clock;Ltr2/n;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrk2/g;->a:Lrk2/c;

    .line 3
    iput-object p2, p0, Lrk2/g;->b:Ljava/time/Clock;

    .line 4
    iput-object p3, p0, Lrk2/g;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lrk2/c;Ljava/time/Clock;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object p2

    const-string p5, "systemUTC(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "RoomPendingActivitySaveStore"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lrk2/g;-><init>(Lrk2/c;Ljava/time/Clock;Ltr2/n;)V

    return-void
.end method

.method private final d(Lrk2/e;)Lrk2/b;
    .locals 9

    new-instance v0, Lrk2/b;

    invoke-virtual {p1}, Lrk2/e;->e()J

    move-result-wide v1

    invoke-virtual {p1}, Lrk2/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lrk2/e;->c()I

    move-result v4

    invoke-virtual {p1}, Lrk2/e;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lrk2/e;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lrk2/e;->d()Z

    move-result v7

    invoke-virtual {p1}, Lrk2/e;->f()Ljava/util/List;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lrk2/b;-><init>(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p7

    instance-of v2, v0, Lrk2/g$b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lrk2/g$b;

    iget v3, v2, Lrk2/g$b;->I:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lrk2/g$b;->I:I

    goto :goto_0

    :cond_0
    new-instance v2, Lrk2/g$b;

    invoke-direct {v2, v1, v0}, Lrk2/g$b;-><init>(Lrk2/g;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Lrk2/g$b;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lrk2/g$b;->I:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lrk2/g$b;->z:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lrk2/g$b;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v2, Lrk2/g$b;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lrk2/g$b;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v0, v1, Lrk2/g;->a:Lrk2/c;

    new-instance v6, Lrk2/e;

    iget-object v4, v1, Lrk2/g;->b:Ljava/time/Clock;

    invoke-virtual {v4}, Ljava/time/Clock;->millis()J

    move-result-wide v14

    const/16 v17, 0x1

    const/16 v18, 0x0

    const-wide/16 v7, 0x0

    move-object/from16 v9, p1

    move/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move/from16 v13, p5

    move-object/from16 v16, p6

    invoke-direct/range {v6 .. v18}, Lrk2/e;-><init>(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZJLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    iput-object v4, v2, Lrk2/g$b;->w:Ljava/lang/Object;

    iput-object v4, v2, Lrk2/g$b;->x:Ljava/lang/Object;

    iput-object v4, v2, Lrk2/g$b;->y:Ljava/lang/Object;

    iput-object v4, v2, Lrk2/g$b;->z:Ljava/lang/Object;

    move/from16 v10, p2

    iput v10, v2, Lrk2/g$b;->E:I

    move/from16 v13, p5

    iput-boolean v13, v2, Lrk2/g$b;->F:Z

    iput v5, v2, Lrk2/g$b;->I:I

    invoke-interface {v0, v6, v2}, Lrk2/c;->b(Lrk2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_3

    return-object v3

    :cond_3
    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :goto_2
    iget-object v2, v1, Lrk2/g;->c:Ltr2/n;

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Failed to enqueue pending activity save"

    invoke-interface {v2, v4, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    return-object v0
.end method

.method public b(JLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lrk2/g$d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lrk2/g$d;

    iget v1, v0, Lrk2/g$d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrk2/g$d;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrk2/g$d;

    invoke-direct {v0, p0, p3}, Lrk2/g$d;-><init>(Lrk2/g;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lrk2/g$d;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrk2/g$d;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lrk2/g;->a:Lrk2/c;

    iput-wide p1, v0, Lrk2/g$d;->w:J

    iput v3, v0, Lrk2/g$d;->z:I

    invoke-interface {p3, p1, p2, v0}, Lrk2/c;->a(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object p2, p0, Lrk2/g;->c:Ltr2/n;

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    const-string v0, "Failed to remove pending activity save"

    invoke-interface {p2, v0, p1, p3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public c(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrk2/g$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrk2/g$a;

    iget v1, v0, Lrk2/g$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrk2/g$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrk2/g$a;

    invoke-direct {v0, p0, p1}, Lrk2/g$a;-><init>(Lrk2/g;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lrk2/g$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrk2/g$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lrk2/g;->a:Lrk2/c;

    iput v3, v0, Lrk2/g$a;->y:I

    invoke-interface {p1, v0}, Lrk2/c;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v0, p0, Lrk2/g;->c:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to clear pending activity saves"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public getAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lrk2/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrk2/g$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrk2/g$c;

    iget v1, v0, Lrk2/g$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrk2/g$c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrk2/g$c;

    invoke-direct {v0, p0, p1}, Lrk2/g$c;-><init>(Lrk2/g;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lrk2/g$c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrk2/g$c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lrk2/g;->a:Lrk2/c;

    iput v3, v0, Lrk2/g$c;->y:I

    invoke-interface {p1, v0}, Lrk2/c;->getAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrk2/e;

    invoke-direct {p0, v1}, Lrk2/g;->d(Lrk2/e;)Lrk2/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_4
    return-object v0

    :goto_3
    iget-object v0, p0, Lrk2/g;->c:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to fetch pending activity saves"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method
