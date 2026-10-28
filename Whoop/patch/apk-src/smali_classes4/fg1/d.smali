.class public final Lfg1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg1/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J&\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lfg1/d;",
        "Lfg1/c;",
        "Ltr2/n;",
        "logger",
        "Lau0/a;",
        "strapFirmwareEventsDao",
        "<init>",
        "(Ltr2/n;Lau0/a;)V",
        "",
        "Lbu0/a;",
        "eventsList",
        "Ll83/a0;",
        "c",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "oldestTimeStamp",
        "newestTimestamp",
        "d",
        "(JJLq83/d;)Ljava/lang/Object;",
        "",
        "versionId",
        "numberOfRecords",
        "a",
        "(IILq83/d;)Ljava/lang/Object;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "Lau0/a;",
        "firmware-events_release"
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
.field private final a:Ltr2/n;

.field private final b:Lau0/a;


# direct methods
.method public constructor <init>(Ltr2/n;Lau0/a;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapFirmwareEventsDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg1/d;->a:Ltr2/n;

    iput-object p2, p0, Lfg1/d;->b:Lau0/a;

    return-void
.end method


# virtual methods
.method public a(IILq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lfg1/d$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lfg1/d$b;

    iget v1, v0, Lfg1/d$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfg1/d$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfg1/d$b;

    invoke-direct {v0, p0, p3}, Lfg1/d$b;-><init>(Lfg1/d;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lfg1/d$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfg1/d$b;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lfg1/d$b;->w:I

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lfg1/d;->b:Lau0/a;

    iput p1, v0, Lfg1/d$b;->w:I

    iput p2, v0, Lfg1/d$b;->x:I

    iput v4, v0, Lfg1/d$b;->E:I

    invoke-interface {p3, p1, p2, v0}, Lau0/a;->e(IILq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/util/List;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p3

    :goto_2
    iget-object p3, p0, Lfg1/d;->a:Ltr2/n;

    const-string v0, "Something went wrong when trying to get firmware event packets by version "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p3, p1, p2, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_3
    iget-object p3, p0, Lfg1/d;->a:Ltr2/n;

    const-string v0, "Error fetching strap firmware events by version "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p3, p1, p2, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_4
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lfg1/d$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lfg1/d$c;

    iget v1, v0, Lfg1/d$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfg1/d$c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfg1/d$c;

    invoke-direct {v0, p0, p1}, Lfg1/d$c;-><init>(Lfg1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lfg1/d$c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfg1/d$c;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
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
    iget-object p1, p0, Lfg1/d;->b:Lau0/a;

    iput v4, v0, Lfg1/d$c;->y:I

    invoke-interface {p1, v0}, Lau0/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Integer;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v0, p0, Lfg1/d;->a:Ltr2/n;

    const-string v1, "Something went wrong when trying to get oldest version ID"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_3
    iget-object v0, p0, Lfg1/d;->a:Ltr2/n;

    const-string v1, "Error fetching oldest version ID"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lfg1/d$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfg1/d$d;

    iget v1, v0, Lfg1/d$d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfg1/d$d;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfg1/d$d;

    invoke-direct {v0, p0, p2}, Lfg1/d$d;-><init>(Lfg1/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lfg1/d$d;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfg1/d$d;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lfg1/d$d;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lfg1/d;->b:Lau0/a;

    const/4 v2, 0x0

    iput-object v2, v0, Lfg1/d$d;->w:Ljava/lang/Object;

    iput v4, v0, Lfg1/d$d;->z:I

    invoke-interface {p2, p1, v0}, Lau0/a;->insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object p2, p0, Lfg1/d;->a:Ltr2/n;

    const-string v0, "Something went wrong when trying to insert list of firmware events in room db"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_3

    :goto_2
    iget-object p2, p0, Lfg1/d;->a:Ltr2/n;

    const-string v0, "Error inserting strap firmware events list"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public d(JJLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lfg1/d$a;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lfg1/d$a;

    iget v1, v0, Lfg1/d$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfg1/d$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lfg1/d$a;

    invoke-direct {v0, p0, p5}, Lfg1/d$a;-><init>(Lfg1/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p5, v6, Lfg1/d$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lfg1/d$a;->E:I

    const/4 v7, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v1, p0, Lfg1/d;->b:Lau0/a;

    iput-wide p1, v6, Lfg1/d$a;->w:J

    iput-wide p3, v6, Lfg1/d$a;->x:J

    iput v2, v6, Lfg1/d$a;->E:I

    move-wide v2, p1

    move-wide v4, p3

    invoke-interface/range {v1 .. v6}, Lau0/a;->f(JJLq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_3

    return-object v0

    :goto_2
    iget-object p2, p0, Lfg1/d;->a:Ltr2/n;

    const-string p3, "Something went wrong when trying to delete list of firmware events"

    new-array p4, v7, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, p4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_3
    iget-object p2, p0, Lfg1/d;->a:Ltr2/n;

    const-string p3, "Error deleting strap firmware events"

    new-array p4, v7, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, p4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
