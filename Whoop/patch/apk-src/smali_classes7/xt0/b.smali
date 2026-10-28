.class public final Lxt0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leu0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u000e2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lxt0/b;",
        "Leu0/b;",
        "Lfu0/d;",
        "dao",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lfu0/d;Ltr2/n;)V",
        "",
        "Lgu0/c;",
        "rows",
        "",
        "c",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "count",
        "b",
        "(ILq83/d;)Ljava/lang/Object;",
        "a",
        "Lfu0/d;",
        "Ltr2/n;",
        "connectivity-data-packets_release"
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
.field private final a:Lfu0/d;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lfu0/d;Ltr2/n;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxt0/b;->a:Lfu0/d;

    .line 3
    iput-object p2, p0, Lxt0/b;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lfu0/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "Rev2RawDataRepository"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lxt0/b;-><init>(Lfu0/d;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lgu0/c;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lxt0/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxt0/b$a;

    iget v1, v0, Lxt0/b$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxt0/b$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxt0/b$a;

    invoke-direct {v0, p0, p2}, Lxt0/b$a;-><init>(Lxt0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lxt0/b$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxt0/b$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lxt0/b$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lxt0/b;->a:Lfu0/d;

    const/4 v2, 0x0

    iput-object v2, v0, Lxt0/b$a;->w:Ljava/lang/Object;

    iput v3, v0, Lxt0/b$a;->z:I

    invoke-interface {p2, p1, v0}, Lfu0/d;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    move-object p1, p2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lxt0/b;->b:Ltr2/n;

    const-string v1, "Deleted "

    const-string v2, " Rev2 raw data frames"

    invoke-static {p1, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p2
.end method

.method public b(ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lgu0/c;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lxt0/b;->a:Lfu0/d;

    invoke-interface {v0, p1, p2}, Lfu0/d;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lgu0/c;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lxt0/b$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxt0/b$b;

    iget v1, v0, Lxt0/b$b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxt0/b$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxt0/b$b;

    invoke-direct {v0, p0, p2}, Lxt0/b$b;-><init>(Lxt0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lxt0/b$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxt0/b$b;->F:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lxt0/b$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lxt0/b;->a:Lfu0/d;

    iput-object p1, v0, Lxt0/b$b;->w:Ljava/lang/Object;

    iput v4, v0, Lxt0/b$b;->x:I

    iput v4, v0, Lxt0/b$b;->y:I

    iput v3, v0, Lxt0/b$b;->F:I

    invoke-interface {p2, p1, v0}, Lfu0/d;->insertAll(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/util/List;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_3
    instance-of v0, p2, Ll83/m;

    xor-int/lit8 v1, v0, 0x1

    if-nez v0, :cond_8

    move-object v0, p2

    check-cast v0, Ljava/util/List;

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_4

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v4

    goto :goto_5

    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v4

    :cond_5
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v5, v5, v7

    if-nez v5, :cond_5

    add-int/lit8 v3, v3, 0x1

    if-ltz v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {}, Lwb3/f;->c0()V

    const/4 p1, 0x0

    throw p1

    :cond_7
    :goto_5
    iget-object v2, p0, Lxt0/b;->b:Ltr2/n;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v3

    const-string v5, " Rev2 raw data frames, ignored "

    const-string v6, " already stored"

    const-string v7, "Saved "

    invoke-static {v0, v3, v7, v5, v6}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v3, v4, [Lqr2/a$a;

    invoke-interface {v2, v0, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_8
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_9

    iget-object v0, p0, Lxt0/b;->b:Ltr2/n;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const-string v2, "Failed to save "

    const-string v3, " Rev2 raw data frames"

    invoke-static {p1, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, p1, p2, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :goto_6
    throw p1
.end method
