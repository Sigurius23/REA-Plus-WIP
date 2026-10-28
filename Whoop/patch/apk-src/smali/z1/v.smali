.class public final Lz1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public c:Z

.field public final d:Lc41/l3;

.field public final e:Lrf/p;

.field public final f:Lr1/c;

.field public final g:Ljava/lang/Object;

.field public h:Lvd1/c;

.field public i:Lz1/u;

.field public j:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/v;->a:Lkotlin/jvm/functions/Function1;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lz1/v;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lc41/l3;

    const/16 v0, 0xf

    invoke-direct {p1, p0, v0}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lz1/v;->d:Lc41/l3;

    new-instance p1, Lrf/p;

    const/16 v0, 0xb

    invoke-direct {p1, p0, v0}, Lrf/p;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lz1/v;->e:Lrf/p;

    new-instance p1, Lr1/c;

    const/16 v0, 0x10

    new-array v0, v0, [Lz1/u;

    invoke-direct {p1, v0}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lz1/v;->f:Lr1/c;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/v;->g:Ljava/lang/Object;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lz1/v;->j:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lz1/v;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz1/v;->f:Lr1/c;

    iget-object v2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v2, v3

    check-cast v4, Lz1/u;

    iget-object v5, v4, Lz1/u;->e:La0/v0;

    invoke-virtual {v5}, La0/v0;->a()V

    iget-object v5, v4, Lz1/u;->f:La0/v0;

    invoke-virtual {v5}, La0/v0;->a()V

    iget-object v5, v4, Lz1/u;->k:La0/v0;

    invoke-virtual {v5}, La0/v0;->a()V

    iget-object v4, v4, Lz1/u;->l:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lz1/v;->g:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, v1, Lz1/v;->f:Lr1/c;

    iget v4, v3, Lr1/c;->y:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v4, :cond_8

    iget-object v8, v3, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v8, v8, v6

    check-cast v8, Lz1/u;

    iget-object v9, v8, Lz1/u;->f:La0/v0;

    invoke-virtual {v9, v0}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La0/m0;

    if-nez v9, :cond_1

    :cond_0
    move/from16 v16, v6

    goto :goto_3

    :cond_1
    iget-object v10, v9, La0/m0;->b:[Ljava/lang/Object;

    iget-object v11, v9, La0/m0;->c:[I

    iget-object v9, v9, La0/m0;->a:[J

    array-length v12, v9

    add-int/lit8 v12, v12, -0x2

    if-ltz v12, :cond_0

    const/4 v13, 0x0

    :goto_1
    aget-wide v14, v9, v13

    move/from16 v16, v6

    not-long v5, v14

    const/16 v17, 0x7

    shl-long v5, v5, v17

    and-long/2addr v5, v14

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v5, v5, v17

    cmp-long v5, v5, v17

    if-eqz v5, :cond_4

    sub-int v5, v13, v12

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    const/16 v6, 0x8

    rsub-int/lit8 v5, v5, 0x8

    move/from16 v17, v6

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_3

    const-wide/16 v18, 0xff

    and-long v18, v14, v18

    const-wide/16 v20, 0x80

    cmp-long v18, v18, v20

    if-gez v18, :cond_2

    shl-int/lit8 v18, v13, 0x3

    add-int v18, v18, v6

    aget-object v1, v10, v18

    aget v18, v11, v18

    invoke-virtual {v8, v0, v1}, Lz1/u;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    shr-long v14, v14, v17

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p0

    goto :goto_2

    :cond_3
    move/from16 v1, v17

    if-ne v5, v1, :cond_5

    :cond_4
    if-eq v13, v12, :cond_5

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p0

    move/from16 v6, v16

    goto :goto_1

    :cond_5
    :goto_3
    iget-object v1, v8, Lz1/u;->f:La0/v0;

    invoke-virtual {v1}, La0/v0;->j()Z

    move-result v1

    if-nez v1, :cond_6

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    if-lez v7, :cond_7

    iget-object v1, v3, Lr1/c;->w:[Ljava/lang/Object;

    sub-int v6, v16, v7

    aget-object v5, v1, v16

    aput-object v5, v1, v6

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_7
    :goto_4
    add-int/lit8 v6, v16, 0x1

    move-object/from16 v1, p0

    goto/16 :goto_0

    :cond_8
    iget-object v0, v3, Lr1/c;->w:[Ljava/lang/Object;

    sub-int v1, v4, v7

    const/4 v5, 0x0

    invoke-static {v0, v1, v4, v5}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iput v1, v3, Lr1/c;->y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :goto_5
    monitor-exit v2

    throw v0
.end method

.method public final c()Z
    .locals 10

    iget-object v0, p0, Lz1/v;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lz1/v;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    const/4 v0, 0x0

    if-eqz v1, :cond_0

    return v0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lz1/v;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    goto :goto_4

    :cond_1
    instance-of v6, v3, Ljava/util/Set;

    if-eqz v6, :cond_2

    move-object v6, v3

    check-cast v6, Ljava/util/Set;

    goto :goto_3

    :cond_2
    instance-of v6, v3, Ljava/util/List;

    if-eqz v6, :cond_b

    move-object v6, v3

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Set;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x2

    if-ne v8, v9, :cond_3

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    goto :goto_2

    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    if-le v8, v9, :cond_4

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v6, v5, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    :cond_4
    :goto_2
    move-object v6, v7

    :cond_5
    :goto_3
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    move-object v4, v6

    :goto_4
    if-nez v4, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lz1/v;->g:Ljava/lang/Object;

    monitor-enter v2

    :try_start_1
    iget-object v3, p0, Lz1/v;->f:Lr1/c;

    iget-object v6, v3, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v3, Lr1/c;->y:I

    move v7, v0

    :goto_5
    if-ge v7, v3, :cond_9

    aget-object v8, v6, v7

    check-cast v8, Lz1/u;

    invoke-virtual {v8, v4}, Lz1/u;->b(Ljava/util/Set;)Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v8, :cond_8

    if-eqz v1, :cond_7

    goto :goto_6

    :cond_7
    move v1, v0

    goto :goto_7

    :cond_8
    :goto_6
    move v1, v5

    :goto_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_9
    monitor-exit v2

    goto :goto_0

    :goto_8
    monitor-exit v2

    throw v0

    :cond_a
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v3, :cond_5

    goto :goto_1

    :cond_b
    const-string v0, "Unexpected notification"

    invoke-static {v0}, Lp1/r;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final d(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lz1/v;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz1/v;->f:Lr1/c;

    iget-object v2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v1, Lr1/c;->y:I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    move-object v6, v5

    check-cast v6, Lz1/u;

    iget-object v6, v6, Lz1/u;->a:Lkotlin/jvm/functions/Function1;

    if-ne v6, p2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    check-cast v5, Lz1/u;

    if-nez v5, :cond_2

    new-instance v5, Lz1/u;

    const-string v2, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-static {v2, p2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-direct {v5, p2}, Lz1/u;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v5}, Lr1/c;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_2
    monitor-exit v0

    iget-object p2, p0, Lz1/v;->i:Lz1/u;

    iget-wide v0, p0, Lz1/v;->j:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_4

    invoke-static {}, Lx1/c;->c()J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    const-string v2, "Detected multithreaded access to SnapshotStateObserver: previousThreadId="

    const-string v3, "), currentThread={id="

    invoke-static {v0, v1, v2, v3}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lx1/c;->c()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", name="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lp1/q1;->a(Ljava/lang/String;)V

    :cond_4
    :goto_2
    :try_start_1
    iput-object v5, p0, Lz1/v;->i:Lz1/u;

    invoke-static {}, Lx1/c;->c()J

    move-result-wide v2

    iput-wide v2, p0, Lz1/v;->j:J

    iget-object v2, p0, Lz1/v;->e:Lrf/p;

    invoke-virtual {v5, p3, v2, p1}, Lz1/u;->a(Ljava/lang/Object;Lrf/p;Lc93/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object p2, p0, Lz1/v;->i:Lz1/u;

    iput-wide v0, p0, Lz1/v;->j:J

    return-void

    :catchall_0
    move-exception p1

    iput-object p2, p0, Lz1/v;->i:Lz1/u;

    iput-wide v0, p0, Lz1/v;->j:J

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lz1/v;->d:Lc41/l3;

    sget-object v1, Lz1/l;->a:Lz1/k;

    invoke-static {v1}, Lz1/l;->f(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    sget-object v1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lz1/l;->h:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    invoke-static {v0, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    sput-object v2, Lz1/l;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    new-instance v1, Lvd1/c;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v2}, Lvd1/c;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lz1/v;->h:Lvd1/c;

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
