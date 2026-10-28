.class public final La6/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lmc3/c;

.field public final b:Laj/d;

.field public final c:Lec3/s1;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, La6/d1;->a:Lmc3/c;

    new-instance p1, Laj/d;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Laj/d;-><init>(IZ)V

    iput-object p1, p0, La6/d1;->b:Laj/d;

    new-instance p1, La6/c1;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, p1}, Lec3/s1;-><init>(Lc93/m;)V

    iput-object v0, p0, La6/d1;->c:Lec3/s1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, La6/d1;->b:Laj/d;

    iget-object v0, v0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    return-object v1
.end method

.method public final b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, La6/a1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La6/a1;

    iget v1, v0, La6/a1;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/a1;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/a1;

    invoke-direct {v0, p0, p2}, La6/a1;-><init>(La6/d1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, La6/a1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/a1;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, La6/a1;->w:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, La6/a1;->x:Lmc3/c;

    iget-object v2, v0, La6/a1;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, La6/a1;->w:Ljava/lang/Object;

    iget-object p2, p0, La6/d1;->a:Lmc3/c;

    iput-object p2, v0, La6/a1;->x:Lmc3/c;

    iput v4, v0, La6/a1;->E:I

    invoke-virtual {p2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_1
    iput-object p2, v0, La6/a1;->w:Ljava/lang/Object;

    iput-object v5, v0, La6/a1;->x:Lmc3/c;

    iput v3, v0, La6/a1;->E:I

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_3
    invoke-interface {p1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p2

    :catchall_1
    move-exception p1

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_4
    invoke-interface {p1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method public final c(Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, La6/b1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La6/b1;

    iget v1, v0, La6/b1;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/b1;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/b1;

    invoke-direct {v0, p0, p2}, La6/b1;-><init>(La6/d1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, La6/b1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/b1;->E:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p1, v0, La6/b1;->x:Z

    iget-object v0, v0, La6/b1;->w:Lmc3/c;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La6/d1;->a:Lmc3/c;

    invoke-virtual {p2}, Lmc3/c;->tryLock()Z

    move-result v2

    :try_start_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object p2, v0, La6/b1;->w:Lmc3/c;

    iput-boolean v2, v0, La6/b1;->x:Z

    iput v3, v0, La6/b1;->E:I

    invoke-interface {p1, v5, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p2

    move-object p2, p1

    move p1, v2

    :goto_1
    if-eqz p1, :cond_4

    invoke-interface {v0, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    :cond_4
    return-object p2

    :catchall_1
    move-exception p1

    move-object v0, p2

    move-object p2, p1

    move p1, v2

    :goto_2
    if-eqz p1, :cond_5

    invoke-interface {v0, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    :cond_5
    throw p2
.end method
