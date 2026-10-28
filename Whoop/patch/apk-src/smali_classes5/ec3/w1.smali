.class public Lec3/w1;
.super Lfc3/a;
.source "SourceFile"

# interfaces
.implements Lec3/o1;
.implements Lec3/d;
.implements Lfc3/q;


# instance fields
.field public final E:I

.field public final F:I

.field public final G:Ldc3/a;

.field public H:[Ljava/lang/Object;

.field public I:J

.field public J:J

.field public K:I

.field public L:I


# direct methods
.method public constructor <init>(IILdc3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lec3/w1;->E:I

    iput p2, p0, Lec3/w1;->F:I

    iput-object p3, p0, Lec3/w1;->G:Ldc3/a;

    return-void
.end method

.method public static k(Lec3/w1;Lec3/m;Lq83/d;)V
    .locals 8

    instance-of v0, p2, Lec3/v1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/v1;

    iget v1, v0, Lec3/v1;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/v1;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/v1;

    invoke-direct {v0, p0, p2}, Lec3/v1;-><init>(Lec3/w1;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/v1;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/v1;->G:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lec3/v1;->z:Lbc3/k1;

    iget-object p1, v0, Lec3/v1;->y:Lec3/x1;

    iget-object v2, v0, Lec3/v1;->x:Lec3/m;

    iget-object v5, v0, Lec3/v1;->w:Lec3/w1;

    :goto_1
    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_7

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lec3/v1;->z:Lbc3/k1;

    iget-object p1, v0, Lec3/v1;->y:Lec3/x1;

    iget-object v2, v0, Lec3/v1;->x:Lec3/m;

    iget-object v5, v0, Lec3/v1;->w:Lec3/w1;

    goto :goto_1

    :goto_2
    move-object p2, v2

    move-object v2, p0

    move-object p0, v5

    goto :goto_4

    :cond_3
    iget-object p1, v0, Lec3/v1;->y:Lec3/x1;

    iget-object p0, v0, Lec3/v1;->x:Lec3/m;

    iget-object v2, v0, Lec3/v1;->w:Lec3/w1;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p2, p0

    move-object p0, v2

    goto :goto_3

    :catchall_1
    move-exception p0

    move-object v5, v2

    goto/16 :goto_7

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lfc3/a;->c()Lfc3/c;

    move-result-object p2

    check-cast p2, Lec3/x1;

    :try_start_2
    instance-of v2, p1, Lec3/k2;

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, Lec3/k2;

    iput-object p0, v0, Lec3/v1;->w:Lec3/w1;

    iput-object p1, v0, Lec3/v1;->x:Lec3/m;

    iput-object p2, v0, Lec3/v1;->y:Lec3/x1;

    iput v5, v0, Lec3/v1;->G:I

    invoke-virtual {v2, v0}, Lec3/k2;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_5

    goto :goto_6

    :catchall_2
    move-exception p1

    move-object v5, p0

    move-object p0, p1

    move-object p1, p2

    goto :goto_7

    :cond_5
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    :try_start_3
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v5, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v2, v5}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    check-cast v2, Lbc3/k1;

    :cond_6
    :goto_4
    invoke-virtual {p0, p1}, Lec3/w1;->s(Lec3/x1;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lec3/v;->c:Lhc3/x;

    if-ne v5, v6, :cond_7

    iput-object p0, v0, Lec3/v1;->w:Lec3/w1;

    iput-object p2, v0, Lec3/v1;->x:Lec3/m;

    iput-object p1, v0, Lec3/v1;->y:Lec3/x1;

    iput-object v2, v0, Lec3/v1;->z:Lbc3/k1;

    iput v4, v0, Lec3/v1;->G:I

    invoke-virtual {p0, p1, v0}, Lec3/w1;->i(Lec3/x1;Lec3/v1;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_6

    goto :goto_6

    :catchall_3
    move-exception p2

    move-object v5, p0

    move-object p0, p2

    goto :goto_7

    :cond_7
    if-eqz v2, :cond_9

    invoke-interface {v2}, Lbc3/k1;->isActive()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v2}, Lbc3/k1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p2

    throw p2

    :cond_9
    :goto_5
    iput-object p0, v0, Lec3/v1;->w:Lec3/w1;

    iput-object p2, v0, Lec3/v1;->x:Lec3/m;

    iput-object p1, v0, Lec3/v1;->y:Lec3/x1;

    iput-object v2, v0, Lec3/v1;->z:Lbc3/k1;

    iput v3, v0, Lec3/v1;->G:I

    invoke-interface {p2, v5, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne v5, v1, :cond_6

    :goto_6
    return-void

    :goto_7
    invoke-virtual {v5, p1}, Lfc3/a;->g(Lfc3/c;)V

    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 5

    sget-object v0, Lfc3/b;->a:[Lq83/d;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lec3/w1;->q(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lec3/w1;->n([Lq83/d;)[Lq83/d;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move p1, v1

    :goto_0
    monitor-exit p0

    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v3, v4}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return p1

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final b(Lq83/j;ILdc3/a;)Lec3/l;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lec3/v;->G(Lec3/t1;Lq83/j;ILdc3/a;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lec3/w1;->k(Lec3/w1;Lec3/m;Lq83/d;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final d()V
    .locals 13

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v0

    iget v2, p0, Lec3/w1;->K:I

    int-to-long v2, v2

    add-long v5, v0, v2

    iget-wide v7, p0, Lec3/w1;->J:J

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v0

    iget v2, p0, Lec3/w1;->K:I

    int-to-long v2, v2

    add-long v9, v0, v2

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v0

    iget v2, p0, Lec3/w1;->K:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget v2, p0, Lec3/w1;->L:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    int-to-long v2, v2

    add-long v11, v0, v2

    move-object v4, p0

    :try_start_1
    invoke-virtual/range {v4 .. v12}, Lec3/w1;->t(JJJJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v4, p0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final e()Lfc3/c;
    .locals 3

    new-instance v0, Lec3/x1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, -0x1

    iput-wide v1, v0, Lec3/x1;->a:J

    return-object v0
.end method

.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance v5, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v6, 0x1

    invoke-direct {v5, v6, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v5}, Lbc3/m;->s()V

    sget-object p2, Lfc3/b;->a:[Lq83/d;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lec3/w1;->q(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v0, :cond_1

    :try_start_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v5, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lec3/w1;->n([Lq83/d;)[Lq83/d;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p2, 0x0

    move-object v1, p0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v1, p0

    goto :goto_5

    :cond_1
    :try_start_2
    new-instance v0, Lec3/u1;

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v1

    iget v3, p0, Lec3/w1;->K:I

    iget v4, p0, Lec3/w1;->L:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    add-int/2addr v3, v4

    int-to-long v3, v3

    add-long v2, v1, v3

    move-object v1, p0

    move-object v4, p1

    :try_start_3
    invoke-direct/range {v0 .. v5}, Lec3/u1;-><init>(Lec3/w1;JLjava/lang/Object;Lbc3/m;)V

    invoke-virtual {p0, v0}, Lec3/w1;->m(Ljava/lang/Object;)V

    iget p1, v1, Lec3/w1;->L:I

    add-int/2addr p1, v6

    iput p1, v1, Lec3/w1;->L:I

    iget p1, v1, Lec3/w1;->F:I

    if-nez p1, :cond_2

    invoke-virtual {p0, p2}, Lec3/w1;->n([Lq83/d;)[Lq83/d;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_5

    :cond_2
    :goto_1
    move-object p1, p2

    move-object p2, v0

    :goto_2
    monitor-exit p0

    if-eqz p2, :cond_3

    new-instance v0, Lbc3/i;

    const/4 v2, 0x1

    invoke-direct {v0, p2, v2}, Lbc3/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v0}, Lbc3/m;->v(Lbc3/a2;)V

    :cond_3
    array-length p2, p1

    const/4 v0, 0x0

    :goto_3
    if-ge v0, p2, :cond_5

    aget-object v2, p1, v0

    if-eqz v2, :cond_4

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v2, v3}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {v5}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_6

    goto :goto_4

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    if-ne p1, p2, :cond_7

    return-object p1

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_2
    move-exception v0

    move-object v1, p0

    goto :goto_0

    :goto_5
    monitor-exit p0

    throw p1
.end method

.method public final f()[Lfc3/c;
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [Lec3/x1;

    return-object v0
.end method

.method public final getReplayCache()Ljava/util/List;
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v0

    iget v2, p0, Lec3/w1;->K:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-wide v2, p0, Lec3/w1;->I:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, Lec3/w1;->H:[Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    iget-wide v4, p0, Lec3/w1;->I:J

    int-to-long v6, v3

    add-long/2addr v4, v6

    long-to-int v4, v4

    array-length v5, v2

    add-int/lit8 v5, v5, -0x1

    and-int/2addr v4, v5

    aget-object v4, v2, v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-object v1

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final i(Lec3/x1;Lec3/v1;)Ljava/lang/Object;
    .locals 5

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lec3/w1;->r(Lec3/x1;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-gez p2, :cond_0

    iput-object v0, p1, Lec3/x1;->b:Lbc3/m;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final j()V
    .locals 8

    iget v0, p0, Lec3/w1;->F:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget v0, p0, Lec3/w1;->L:I

    if-gt v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lec3/w1;->H:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_0
    iget v2, p0, Lec3/w1;->L:I

    if-lez v2, :cond_1

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v2

    iget v4, p0, Lec3/w1;->K:I

    iget v5, p0, Lec3/w1;->L:I

    add-int/2addr v4, v5

    int-to-long v6, v4

    add-long/2addr v2, v6

    const-wide/16 v6, 0x1

    sub-long/2addr v2, v6

    long-to-int v2, v2

    array-length v3, v0

    sub-int/2addr v3, v1

    and-int/2addr v2, v3

    aget-object v2, v0, v2

    sget-object v3, Lec3/v;->c:Lhc3/x;

    if-ne v2, v3, :cond_1

    add-int/lit8 v5, v5, -0x1

    iput v5, p0, Lec3/w1;->L:I

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v2

    iget v4, p0, Lec3/w1;->K:I

    iget v5, p0, Lec3/w1;->L:I

    add-int/2addr v4, v5

    int-to-long v4, v4

    add-long/2addr v2, v4

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Lec3/v;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final l()V
    .locals 10

    iget-object v0, p0, Lec3/w1;->H:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lec3/v;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    iget v0, p0, Lec3/w1;->K:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lec3/w1;->K:I

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iget-wide v2, p0, Lec3/w1;->I:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_0

    iput-wide v0, p0, Lec3/w1;->I:J

    :cond_0
    iget-wide v2, p0, Lec3/w1;->J:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_3

    iget v2, p0, Lfc3/a;->x:I

    if-eqz v2, :cond_2

    iget-object v2, p0, Lfc3/a;->w:[Lfc3/c;

    if-eqz v2, :cond_2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    if-eqz v5, :cond_1

    check-cast v5, Lec3/x1;

    iget-wide v6, v5, Lec3/x1;->a:J

    const-wide/16 v8, 0x0

    cmp-long v8, v6, v8

    if-ltz v8, :cond_1

    cmp-long v6, v6, v0

    if-gez v6, :cond_1

    iput-wide v0, v5, Lec3/x1;->a:J

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iput-wide v0, p0, Lec3/w1;->J:J

    :cond_3
    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, Lec3/w1;->K:I

    iget v1, p0, Lec3/w1;->L:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lec3/w1;->H:[Ljava/lang/Object;

    const/4 v2, 0x2

    if-nez v1, :cond_0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v1}, Lec3/w1;->p(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    array-length v3, v1

    if-lt v0, v3, :cond_1

    array-length v3, v1

    mul-int/2addr v3, v2

    invoke-virtual {p0, v0, v3, v1}, Lec3/w1;->p(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v2

    int-to-long v4, v0

    add-long/2addr v2, v4

    invoke-static {v1, v2, v3, p1}, Lec3/v;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final n([Lq83/d;)[Lq83/d;
    .locals 10

    array-length v0, p1

    iget v1, p0, Lfc3/a;->x:I

    if-eqz v1, :cond_3

    iget-object v1, p0, Lfc3/a;->w:[Lfc3/c;

    if-eqz v1, :cond_3

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    if-eqz v4, :cond_2

    check-cast v4, Lec3/x1;

    iget-object v5, v4, Lec3/x1;->b:Lbc3/m;

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v4}, Lec3/w1;->r(Lec3/x1;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-ltz v6, :cond_2

    array-length v6, p1

    if-lt v0, v6, :cond_1

    array-length v6, p1

    const/4 v7, 0x2

    mul-int/2addr v6, v7

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v6, "copyOf(...)"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v6, p1

    check-cast v6, [Lq83/d;

    add-int/lit8 v7, v0, 0x1

    aput-object v5, v6, v0

    const/4 v0, 0x0

    iput-object v0, v4, Lec3/x1;->b:Lbc3/m;

    move v0, v7

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    check-cast p1, [Lq83/d;

    return-object p1
.end method

.method public final o()J
    .locals 4

    iget-wide v0, p0, Lec3/w1;->J:J

    iget-wide v2, p0, Lec3/w1;->I:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final p(II[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 7

    if-lez p2, :cond_2

    new-array p2, p2, [Ljava/lang/Object;

    iput-object p2, p0, Lec3/w1;->H:[Ljava/lang/Object;

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_1

    int-to-long v3, v2

    add-long/2addr v3, v0

    long-to-int v5, v3

    array-length v6, p3

    add-int/lit8 v6, v6, -0x1

    and-int/2addr v5, v6

    aget-object v5, p3, v5

    invoke-static {p2, v3, v4, v5}, Lec3/v;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Buffer size overflow"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Ljava/lang/Object;)Z
    .locals 12

    iget v1, p0, Lfc3/a;->x:I

    iget v2, p0, Lec3/w1;->E:I

    const/4 v9, 0x1

    if-nez v1, :cond_2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p1}, Lec3/w1;->m(Ljava/lang/Object;)V

    iget v1, p0, Lec3/w1;->K:I

    add-int/2addr v1, v9

    iput v1, p0, Lec3/w1;->K:I

    if-le v1, v2, :cond_1

    invoke-virtual {p0}, Lec3/w1;->l()V

    :cond_1
    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v1

    iget v3, p0, Lec3/w1;->K:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Lec3/w1;->J:J

    return v9

    :cond_2
    iget v1, p0, Lec3/w1;->K:I

    iget v3, p0, Lec3/w1;->F:I

    if-lt v1, v3, :cond_5

    iget-wide v4, p0, Lec3/w1;->J:J

    iget-wide v6, p0, Lec3/w1;->I:J

    cmp-long v1, v4, v6

    if-gtz v1, :cond_5

    iget-object v1, p0, Lec3/w1;->G:Ldc3/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_4

    if-eq v1, v9, :cond_5

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_4
    const/4 v1, 0x0

    return v1

    :cond_5
    invoke-virtual/range {p0 .. p1}, Lec3/w1;->m(Ljava/lang/Object;)V

    iget v1, p0, Lec3/w1;->K:I

    add-int/2addr v1, v9

    iput v1, p0, Lec3/w1;->K:I

    if-le v1, v3, :cond_6

    invoke-virtual {p0}, Lec3/w1;->l()V

    :cond_6
    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v3

    iget v1, p0, Lec3/w1;->K:I

    int-to-long v5, v1

    add-long/2addr v3, v5

    iget-wide v5, p0, Lec3/w1;->I:J

    sub-long/2addr v3, v5

    long-to-int v1, v3

    if-le v1, v2, :cond_7

    const-wide/16 v1, 0x1

    add-long/2addr v1, v5

    iget-wide v3, p0, Lec3/w1;->J:J

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v5

    iget v7, p0, Lec3/w1;->K:I

    int-to-long v7, v7

    add-long/2addr v5, v7

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v7

    iget v10, p0, Lec3/w1;->K:I

    int-to-long v10, v10

    add-long/2addr v7, v10

    iget v10, p0, Lec3/w1;->L:I

    int-to-long v10, v10

    add-long/2addr v7, v10

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Lec3/w1;->t(JJJJ)V

    :cond_7
    :goto_0
    return v9
.end method

.method public final r(Lec3/x1;)J
    .locals 6

    iget-wide v0, p1, Lec3/x1;->a:J

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v2

    iget p1, p0, Lec3/w1;->K:I

    int-to-long v4, p1

    add-long/2addr v2, v4

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    iget p1, p0, Lec3/w1;->F:I

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_2

    goto :goto_0

    :cond_2
    iget p1, p0, Lec3/w1;->L:I

    if-nez p1, :cond_3

    :goto_0
    const-wide/16 v0, -0x1

    :cond_3
    :goto_1
    return-wide v0
.end method

.method public final s(Lec3/x1;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lfc3/b;->a:[Lq83/d;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lec3/w1;->r(Lec3/x1;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-gez v3, :cond_0

    sget-object p1, Lec3/v;->c:Lhc3/x;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-wide v3, p1, Lec3/x1;->a:J

    iget-object v0, p0, Lec3/w1;->H:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    long-to-int v5, v1

    array-length v6, v0

    add-int/lit8 v6, v6, -0x1

    and-int/2addr v5, v6

    aget-object v0, v0, v5

    instance-of v5, v0, Lec3/u1;

    if-eqz v5, :cond_1

    check-cast v0, Lec3/u1;

    iget-object v0, v0, Lec3/u1;->y:Ljava/lang/Object;

    :cond_1
    const-wide/16 v5, 0x1

    add-long/2addr v1, v5

    iput-wide v1, p1, Lec3/x1;->a:J

    invoke-virtual {p0, v3, v4}, Lec3/w1;->u(J)[Lq83/d;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_0
    monitor-exit p0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    if-eqz v3, :cond_2

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v3, v4}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-object p1

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final t(JJJJ)V
    .locals 6

    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-virtual {p0}, Lec3/w1;->o()J

    move-result-wide v2

    :goto_0
    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    iget-object v4, p0, Lec3/w1;->H:[Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-static {v4, v2, v3, v5}, Lec3/v;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    goto :goto_0

    :cond_0
    iput-wide p1, p0, Lec3/w1;->I:J

    iput-wide p3, p0, Lec3/w1;->J:J

    sub-long p1, p5, v0

    long-to-int p1, p1

    iput p1, p0, Lec3/w1;->K:I

    sub-long/2addr p7, p5

    long-to-int p1, p7

    iput p1, p0, Lec3/w1;->L:I

    return-void
.end method

.method public final u(J)[Lq83/d;
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lec3/v;->c:Lhc3/x;

    sget-object v2, Lfc3/b;->a:[Lq83/d;

    iget-wide v3, v0, Lec3/w1;->J:J

    cmp-long v3, p1, v3

    if-lez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lec3/w1;->o()J

    move-result-wide v3

    iget v5, v0, Lec3/w1;->K:I

    int-to-long v5, v5

    add-long/2addr v5, v3

    iget v7, v0, Lec3/w1;->F:I

    const-wide/16 v8, 0x1

    if-nez v7, :cond_1

    iget v10, v0, Lec3/w1;->L:I

    if-lez v10, :cond_1

    add-long/2addr v5, v8

    :cond_1
    iget v10, v0, Lfc3/a;->x:I

    const/4 v11, 0x0

    if-eqz v10, :cond_3

    iget-object v10, v0, Lfc3/a;->w:[Lfc3/c;

    if-eqz v10, :cond_3

    array-length v12, v10

    move v13, v11

    :goto_0
    if-ge v13, v12, :cond_3

    aget-object v14, v10, v13

    if-eqz v14, :cond_2

    check-cast v14, Lec3/x1;

    iget-wide v14, v14, Lec3/x1;->a:J

    const-wide/16 v16, 0x0

    cmp-long v16, v14, v16

    if-ltz v16, :cond_2

    cmp-long v16, v14, v5

    if-gez v16, :cond_2

    move-wide v5, v14

    :cond_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_3
    iget-wide v12, v0, Lec3/w1;->J:J

    cmp-long v10, v5, v12

    if-gtz v10, :cond_4

    :goto_1
    return-object v2

    :cond_4
    invoke-virtual {v0}, Lec3/w1;->o()J

    move-result-wide v12

    iget v10, v0, Lec3/w1;->K:I

    int-to-long v14, v10

    add-long/2addr v12, v14

    iget v10, v0, Lfc3/a;->x:I

    if-lez v10, :cond_5

    sub-long v14, v12, v5

    long-to-int v10, v14

    iget v14, v0, Lec3/w1;->L:I

    sub-int v10, v7, v10

    invoke-static {v14, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    goto :goto_2

    :cond_5
    iget v10, v0, Lec3/w1;->L:I

    :goto_2
    iget v14, v0, Lec3/w1;->L:I

    int-to-long v14, v14

    add-long/2addr v14, v12

    if-lez v10, :cond_9

    new-array v2, v10, [Lq83/d;

    move-wide/from16 p1, v8

    iget-object v8, v0, Lec3/w1;->H:[Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-wide/from16 v16, v3

    move-object v4, v2

    move-wide v2, v12

    :goto_3
    cmp-long v9, v12, v14

    if-gez v9, :cond_8

    long-to-int v9, v12

    move-object/from16 v18, v4

    array-length v4, v8

    add-int/lit8 v4, v4, -0x1

    and-int/2addr v4, v9

    aget-object v4, v8, v4

    if-eq v4, v1, :cond_7

    const-string v9, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lec3/u1;

    add-int/lit8 v9, v11, 0x1

    move-wide/from16 v19, v5

    iget-object v5, v4, Lec3/u1;->z:Lbc3/m;

    aput-object v5, v18, v11

    invoke-static {v8, v12, v13, v1}, Lec3/v;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    iget-object v4, v4, Lec3/u1;->y:Ljava/lang/Object;

    invoke-static {v8, v2, v3, v4}, Lec3/v;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    add-long v2, v2, p1

    if-ge v9, v10, :cond_6

    move v11, v9

    goto :goto_5

    :cond_6
    :goto_4
    move-wide v12, v2

    move-object/from16 v9, v18

    goto :goto_6

    :cond_7
    move-wide/from16 v19, v5

    :goto_5
    add-long v12, v12, p1

    move-object/from16 v4, v18

    move-wide/from16 v5, v19

    goto :goto_3

    :cond_8
    move-object/from16 v18, v4

    move-wide/from16 v19, v5

    goto :goto_4

    :cond_9
    move-wide/from16 v16, v3

    move-wide/from16 v19, v5

    move-wide/from16 p1, v8

    move-object v9, v2

    :goto_6
    sub-long v2, v12, v16

    long-to-int v2, v2

    iget v3, v0, Lfc3/a;->x:I

    if-nez v3, :cond_a

    move-wide v3, v12

    goto :goto_7

    :cond_a
    move-wide/from16 v3, v19

    :goto_7
    iget-wide v5, v0, Lec3/w1;->I:J

    iget v8, v0, Lec3/w1;->E:I

    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-long v10, v2

    sub-long v10, v12, v10

    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    if-nez v7, :cond_b

    cmp-long v2, v5, v14

    if-gez v2, :cond_b

    iget-object v2, v0, Lec3/w1;->H:[Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    long-to-int v7, v5

    array-length v8, v2

    add-int/lit8 v8, v8, -0x1

    and-int/2addr v7, v8

    aget-object v2, v2, v7

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    add-long v12, v12, p1

    add-long v5, v5, p1

    :cond_b
    move-wide v1, v5

    move-wide v5, v12

    move-wide v7, v14

    invoke-virtual/range {v0 .. v8}, Lec3/w1;->t(JJJJ)V

    invoke-virtual {v0}, Lec3/w1;->j()V

    array-length v1, v9

    if-nez v1, :cond_c

    return-object v9

    :cond_c
    invoke-virtual {v0, v9}, Lec3/w1;->n([Lq83/d;)[Lq83/d;

    move-result-object v1

    return-object v1
.end method
