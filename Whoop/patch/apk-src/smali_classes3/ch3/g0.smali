.class public final Lch3/g0;
.super Lxg3/s;
.source "SourceFile"


# static fields
.field public static final V:[Lch3/e0;


# instance fields
.field public final E:Lxg3/s;

.field public final F:Z

.field public final G:I

.field public H:Lch3/f0;

.field public volatile I:Ljava/util/Queue;

.field public volatile J:Lmh3/c;

.field public volatile K:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public volatile L:Z

.field public M:Z

.field public N:Z

.field public final O:Ljava/lang/Object;

.field public volatile P:[Lch3/e0;

.field public Q:J

.field public R:J

.field public S:I

.field public final T:I

.field public U:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lch3/e0;

    sput-object v0, Lch3/g0;->V:[Lch3/e0;

    return-void
.end method

.method public constructor <init>(Lxg3/s;Z)V
    .locals 0

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lch3/g0;->E:Lxg3/s;

    iput-boolean p2, p0, Lch3/g0;->F:Z

    const p1, 0x7fffffff

    iput p1, p0, Lch3/g0;->G:I

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lch3/g0;->O:Ljava/lang/Object;

    sget-object p2, Lch3/g0;->V:[Lch3/e0;

    iput-object p2, p0, Lch3/g0;->P:[Lch3/e0;

    iput p1, p0, Lch3/g0;->T:I

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2}, Lxg3/s;->e(J)V

    return-void
.end method

.method public static k(Lch3/e0;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lch3/e0;->H:Lgh3/g;

    if-nez v0, :cond_1

    sget v0, Lgh3/g;->x:I

    sget-object v1, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    if-eqz v1, :cond_0

    sget-boolean v1, Lrx/internal/util/unsafe/j;->b:Z

    if-nez v1, :cond_0

    new-instance v1, Lgh3/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lrx/internal/util/unsafe/d;

    invoke-direct {v2, v0}, Lrx/internal/util/unsafe/d;-><init>(I)V

    iput-object v2, v1, Lgh3/g;->w:Ljava/util/AbstractQueue;

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lgh3/g;

    new-instance v2, Lhh3/b;

    invoke-direct {v2, v0}, Lhh3/b;-><init>(I)V

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v2, v1, Lgh3/g;->w:Ljava/util/AbstractQueue;

    goto :goto_0

    :goto_1
    invoke-virtual {p0, v0}, Lxg3/s;->c(Lxg3/t;)V

    iput-object v0, p0, Lch3/e0;->H:Lgh3/g;

    :cond_1
    if-nez p1, :cond_2

    :try_start_0
    sget-object p1, Lch3/d;->b:Lch3/b;

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :cond_2
    :goto_2
    invoke-virtual {v0, p1}, Lgh3/g;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Lrx/exceptions/MissingBackpressureException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_3
    invoke-virtual {p0}, Lxg3/s;->a()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lxg3/s;->b()V

    invoke-virtual {p0, p1}, Lch3/e0;->onError(Ljava/lang/Throwable;)V

    goto :goto_5

    :goto_4
    invoke-virtual {p0}, Lxg3/s;->b()V

    invoke-virtual {p0, p1}, Lch3/e0;->onError(Ljava/lang/Throwable;)V

    :cond_3
    :goto_5
    return-void
.end method


# virtual methods
.method public final g()Z
    .locals 3

    iget-object v0, p0, Lch3/g0;->E:Lxg3/s;

    invoke-virtual {v0}, Lxg3/s;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lch3/g0;->K:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iget-boolean v2, p0, Lch3/g0;->F:Z

    if-nez v2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lch3/g0;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lxg3/s;->b()V

    return v1

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lxg3/s;->b()V

    throw v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final h()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lch3/g0;->M:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lch3/g0;->N:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lch3/g0;->M:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lch3/g0;->i()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final i()V
    .locals 25

    move-object/from16 v1, p0

    :try_start_0
    iget-object v3, v1, Lch3/g0;->E:Lxg3/s;

    :goto_0
    invoke-virtual {v1}, Lch3/g0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1c

    :cond_0
    iget-object v4, v1, Lch3/g0;->I:Ljava/util/Queue;

    iget-object v0, v1, Lch3/g0;->H:Lch3/f0;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    const-wide v7, 0x7fffffffffffffffL

    cmp-long v0, v5, v7

    if-nez v0, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    const-wide/16 v11, 0x1

    const-wide/16 v14, 0x0

    if-eqz v4, :cond_9

    const/4 v0, 0x0

    :goto_2
    move-wide/from16 v16, v5

    const/4 v6, 0x0

    move v5, v0

    const/4 v0, 0x0

    :goto_3
    cmp-long v18, v16, v14

    if-lez v18, :cond_5

    invoke-interface {v4}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v18

    invoke-virtual {v1}, Lch3/g0;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_1c

    :cond_2
    if-nez v18, :cond_3

    move-object/from16 v0, v18

    goto :goto_5

    :cond_3
    invoke-static/range {v18 .. v18}, Lch3/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-interface {v3, v0}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    :try_start_2
    iget-boolean v7, v1, Lch3/g0;->F:Z

    if-nez v7, :cond_4

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v1}, Lxg3/s;->b()V

    invoke-interface {v3, v0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_1c

    :catchall_1
    move-exception v0

    const/4 v9, 0x1

    goto/16 :goto_1e

    :catchall_2
    move-exception v0

    const/4 v9, 0x0

    goto/16 :goto_1e

    :cond_4
    :try_start_4
    invoke-virtual {v1}, Lch3/g0;->j()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v7

    invoke-interface {v7, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v6, v6, 0x1

    sub-long v16, v16, v11

    move-object/from16 v0, v18

    const-wide v7, 0x7fffffffffffffffL

    goto :goto_3

    :cond_5
    :goto_5
    if-lez v6, :cond_7

    if-eqz v10, :cond_6

    move v8, v10

    const-wide v16, 0x7fffffffffffffffL

    goto :goto_6

    :cond_6
    iget-object v7, v1, Lch3/g0;->H:Lch3/f0;

    neg-int v6, v6

    move v8, v10

    int-to-long v9, v6

    invoke-virtual {v7, v9, v10}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v6

    move-wide/from16 v16, v6

    goto :goto_6

    :cond_7
    move v8, v10

    :goto_6
    cmp-long v6, v16, v14

    if-eqz v6, :cond_a

    if-nez v0, :cond_8

    goto :goto_7

    :cond_8
    move v0, v5

    move v10, v8

    move-wide/from16 v5, v16

    const-wide v7, 0x7fffffffffffffffL

    goto :goto_2

    :cond_9
    move v8, v10

    move-wide/from16 v16, v5

    const/4 v5, 0x0

    :cond_a
    :goto_7
    iget-boolean v0, v1, Lch3/g0;->L:Z

    iget-object v4, v1, Lch3/g0;->I:Ljava/util/Queue;

    iget-object v6, v1, Lch3/g0;->P:[Lch3/e0;

    array-length v7, v6

    if-eqz v0, :cond_e

    if-eqz v4, :cond_b

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_b
    if-nez v7, :cond_e

    iget-object v0, v1, Lch3/g0;->K:Ljava/util/concurrent/ConcurrentLinkedQueue;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v1}, Lch3/g0;->n()V

    goto/16 :goto_1c

    :cond_d
    :goto_8
    invoke-interface {v3}, Lxg3/h;->onCompleted()V

    goto/16 :goto_1c

    :cond_e
    if-lez v7, :cond_29

    iget-wide v9, v1, Lch3/g0;->R:J

    iget v0, v1, Lch3/g0;->S:I

    if-le v7, v0, :cond_f

    aget-object v4, v6, v0

    move-wide/from16 v19, v11

    iget-wide v11, v4, Lch3/e0;->F:J

    cmp-long v4, v11, v9

    if-eqz v4, :cond_14

    goto :goto_9

    :cond_f
    move-wide/from16 v19, v11

    :goto_9
    if-gt v7, v0, :cond_10

    const/4 v0, 0x0

    :cond_10
    const/4 v4, 0x0

    :goto_a
    if-ge v4, v7, :cond_13

    aget-object v11, v6, v0

    iget-wide v11, v11, Lch3/e0;->F:J

    cmp-long v11, v11, v9

    if-nez v11, :cond_11

    goto :goto_b

    :cond_11
    add-int/lit8 v0, v0, 0x1

    if-ne v0, v7, :cond_12

    const/4 v0, 0x0

    :cond_12
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_13
    :goto_b
    iput v0, v1, Lch3/g0;->S:I

    aget-object v4, v6, v0

    iget-wide v9, v4, Lch3/e0;->F:J

    iput-wide v9, v1, Lch3/g0;->R:J

    :cond_14
    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_c
    if-ge v4, v7, :cond_28

    invoke-virtual {v1}, Lch3/g0;->g()Z

    move-result v10

    if-eqz v10, :cond_15

    goto/16 :goto_1c

    :cond_15
    aget-object v10, v6, v0

    const/4 v11, 0x0

    :goto_d
    const/4 v12, 0x0

    :goto_e
    cmp-long v21, v16, v14

    if-lez v21, :cond_1a

    invoke-virtual {v1}, Lch3/g0;->g()Z

    move-result v21

    if-eqz v21, :cond_16

    goto/16 :goto_1c

    :cond_16
    iget-object v13, v10, Lch3/e0;->H:Lgh3/g;

    if-nez v13, :cond_17

    goto :goto_11

    :cond_17
    monitor-enter v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    iget-object v11, v13, Lgh3/g;->w:Ljava/util/AbstractQueue;

    if-nez v11, :cond_18

    monitor-exit v13

    const/4 v11, 0x0

    goto :goto_f

    :catchall_3
    move-exception v0

    goto :goto_10

    :cond_18
    invoke-interface {v11}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v11

    monitor-exit v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :goto_f
    if-nez v11, :cond_19

    goto :goto_11

    :cond_19
    :try_start_6
    invoke-static {v11}, Lch3/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    invoke-interface {v3, v13}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    sub-long v16, v16, v19

    add-int/lit8 v12, v12, 0x1

    goto :goto_e

    :catchall_4
    move-exception v0

    :try_start_8
    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    invoke-interface {v3, v0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :try_start_a
    invoke-virtual {v1}, Lxg3/s;->b()V

    goto/16 :goto_1c

    :catchall_5
    move-exception v0

    invoke-virtual {v1}, Lxg3/s;->b()V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :goto_10
    :try_start_b
    monitor-exit v13
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    throw v0

    :cond_1a
    :goto_11
    if-lez v12, :cond_1e

    if-nez v8, :cond_1b

    iget-object v13, v1, Lch3/g0;->H:Lch3/f0;

    move-wide/from16 v22, v14

    neg-int v14, v12

    int-to-long v14, v14

    invoke-virtual {v13, v14, v15}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v13

    :goto_12
    move-object/from16 v24, v3

    goto :goto_13

    :cond_1b
    move-wide/from16 v22, v14

    const-wide v13, 0x7fffffffffffffffL

    goto :goto_12

    :goto_13
    int-to-long v2, v12

    iget v12, v10, Lch3/e0;->I:I

    long-to-int v2, v2

    sub-int/2addr v12, v2

    sget v2, Lch3/e0;->J:I

    if-le v12, v2, :cond_1c

    iput v12, v10, Lch3/e0;->I:I

    goto :goto_14

    :cond_1c
    sget v2, Lgh3/g;->x:I

    iput v2, v10, Lch3/e0;->I:I

    sub-int/2addr v2, v12

    if-lez v2, :cond_1d

    int-to-long v2, v2

    invoke-virtual {v10, v2, v3}, Lxg3/s;->e(J)V

    :cond_1d
    :goto_14
    move-wide/from16 v16, v13

    goto :goto_15

    :cond_1e
    move-object/from16 v24, v3

    move-wide/from16 v22, v14

    :goto_15
    cmp-long v2, v16, v22

    if-eqz v2, :cond_20

    if-nez v11, :cond_1f

    goto :goto_16

    :cond_1f
    move-wide/from16 v14, v22

    move-object/from16 v3, v24

    goto/16 :goto_d

    :cond_20
    :goto_16
    iget-boolean v3, v10, Lch3/e0;->G:Z

    iget-object v11, v10, Lch3/e0;->H:Lgh3/g;

    if-eqz v3, :cond_25

    if-eqz v11, :cond_23

    iget-object v3, v11, Lgh3/g;->w:Ljava/util/AbstractQueue;

    if-eqz v3, :cond_22

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_21

    goto :goto_17

    :cond_21
    const/4 v3, 0x0

    goto :goto_18

    :cond_22
    :goto_17
    const/4 v3, 0x1

    :goto_18
    if-eqz v3, :cond_25

    :cond_23
    invoke-virtual {v1, v10}, Lch3/g0;->m(Lch3/e0;)V

    invoke-virtual {v1}, Lch3/g0;->g()Z

    move-result v3

    if-eqz v3, :cond_24

    goto :goto_1c

    :cond_24
    add-int/lit8 v5, v5, 0x1

    const/4 v9, 0x1

    :cond_25
    if-nez v2, :cond_26

    goto :goto_19

    :cond_26
    add-int/lit8 v0, v0, 0x1

    if-ne v0, v7, :cond_27

    const/4 v0, 0x0

    :cond_27
    add-int/lit8 v4, v4, 0x1

    move-wide/from16 v14, v22

    move-object/from16 v3, v24

    goto/16 :goto_c

    :cond_28
    move-object/from16 v24, v3

    :goto_19
    iput v0, v1, Lch3/g0;->S:I

    aget-object v0, v6, v0

    iget-wide v2, v0, Lch3/e0;->F:J

    iput-wide v2, v1, Lch3/g0;->R:J

    goto :goto_1a

    :cond_29
    move-object/from16 v24, v3

    const/4 v9, 0x0

    :goto_1a
    if-lez v5, :cond_2a

    int-to-long v2, v5

    invoke-virtual {v1, v2, v3}, Lxg3/s;->e(J)V

    :cond_2a
    if-eqz v9, :cond_2b

    :goto_1b
    move-object/from16 v3, v24

    goto/16 :goto_0

    :cond_2b
    monitor-enter p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :try_start_d
    iget-boolean v0, v1, Lch3/g0;->N:Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    if-nez v0, :cond_2c

    const/4 v15, 0x0

    :try_start_e
    iput-boolean v15, v1, Lch3/g0;->M:Z

    monitor-exit p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :goto_1c
    return-void

    :catchall_6
    move-exception v0

    const/4 v9, 0x1

    goto :goto_1d

    :cond_2c
    const/4 v15, 0x0

    :try_start_f
    iput-boolean v15, v1, Lch3/g0;->N:Z

    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto :goto_1b

    :catchall_7
    move-exception v0

    const/4 v9, 0x0

    :goto_1d
    :try_start_10
    monitor-exit p0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    :try_start_11
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception v0

    goto :goto_1e

    :catchall_9
    move-exception v0

    goto :goto_1d

    :goto_1e
    if-nez v9, :cond_2d

    monitor-enter p0

    const/4 v15, 0x0

    :try_start_12
    iput-boolean v15, v1, Lch3/g0;->M:Z

    monitor-exit p0

    goto :goto_1f

    :catchall_a
    move-exception v0

    monitor-exit p0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    throw v0

    :cond_2d
    :goto_1f
    throw v0
.end method

.method public final j()Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 1

    iget-object v0, p0, Lch3/g0;->K:Ljava/util/concurrent/ConcurrentLinkedQueue;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lch3/g0;->K:Ljava/util/concurrent/ConcurrentLinkedQueue;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lch3/g0;->K:Ljava/util/concurrent/ConcurrentLinkedQueue;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    return-object v0
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lch3/g0;->I:Ljava/util/Queue;

    if-nez v0, :cond_3

    iget v0, p0, Lch3/g0;->G:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    new-instance v0, Lhh3/e;

    sget v1, Lgh3/g;->x:I

    invoke-direct {v0, v1}, Lhh3/e;-><init>(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v0, -0x1

    and-int/2addr v1, v0

    if-nez v1, :cond_2

    sget-object v1, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    if-eqz v1, :cond_1

    sget-boolean v1, Lrx/internal/util/unsafe/j;->b:Z

    if-nez v1, :cond_1

    new-instance v1, Lrx/internal/util/unsafe/d;

    invoke-direct {v1, v0}, Lrx/internal/util/unsafe/d;-><init>(I)V

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    new-instance v1, Lhh3/b;

    invoke-direct {v1, v0}, Lhh3/b;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance v1, Lhh3/c;

    invoke-direct {v1, v0}, Lhh3/c;-><init>(I)V

    goto :goto_0

    :goto_1
    iput-object v0, p0, Lch3/g0;->I:Ljava/util/Queue;

    :cond_3
    if-nez p1, :cond_4

    sget-object v1, Lch3/d;->b:Lch3/b;

    goto :goto_2

    :cond_4
    move-object v1, p1

    :goto_2
    invoke-interface {v0, v1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lxg3/s;->b()V

    new-instance v0, Lrx/exceptions/MissingBackpressureException;

    invoke-direct {v0}, Lrx/exceptions/MissingBackpressureException;-><init>()V

    invoke-static {p1, v0}, Lrx/exceptions/OnErrorThrowable;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    invoke-virtual {p0, v0}, Lch3/g0;->onError(Ljava/lang/Throwable;)V

    :cond_5
    return-void
.end method

.method public final m(Lch3/e0;)V
    .locals 6

    iget-object v0, p1, Lch3/e0;->H:Lgh3/g;

    if-eqz v0, :cond_0

    monitor-enter v0

    monitor-exit v0

    :cond_0
    iget-object v0, p0, Lch3/g0;->J:Lmh3/c;

    invoke-virtual {v0, p1}, Lmh3/c;->e(Lxg3/t;)V

    iget-object v0, p0, Lch3/g0;->O:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lch3/g0;->P:[Lch3/e0;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v1, v4

    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v4, -0x1

    :goto_1
    if-gez v4, :cond_3

    monitor-exit v0

    return-void

    :cond_3
    const/4 p1, 0x1

    if-ne v2, p1, :cond_4

    sget-object p1, Lch3/g0;->V:[Lch3/e0;

    iput-object p1, p0, Lch3/g0;->P:[Lch3/e0;

    monitor-exit v0

    return-void

    :cond_4
    add-int/lit8 v5, v2, -0x1

    new-array v5, v5, [Lch3/e0;

    invoke-static {v1, v3, v5, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v3, v4, 0x1

    sub-int/2addr v2, v4

    sub-int/2addr v2, p1

    invoke-static {v1, v3, v5, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v5, p0, Lch3/g0;->P:[Lch3/e0;

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final n()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lch3/g0;->K:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lch3/g0;->E:Lxg3/s;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-interface {v1, v0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v1, p0, Lch3/g0;->E:Lxg3/s;

    new-instance v2, Lrx/exceptions/CompositeException;

    invoke-direct {v2, v0}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/List;)V

    invoke-interface {v1, v2}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onCompleted()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/g0;->L:Z

    invoke-virtual {p0}, Lch3/g0;->h()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lch3/g0;->j()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lch3/g0;->L:Z

    invoke-virtual {p0}, Lch3/g0;->h()V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 7

    check-cast p1, Lxg3/g;

    if-nez p1, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-static {}, Lxg3/g;->l()Lxg3/g;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_2

    iget p1, p0, Lch3/g0;->U:I

    add-int/2addr p1, v2

    iget v0, p0, Lch3/g0;->T:I

    if-ne p1, v0, :cond_1

    iput v1, p0, Lch3/g0;->U:I

    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lxg3/s;->e(J)V

    return-void

    :cond_1
    iput p1, p0, Lch3/g0;->U:I

    return-void

    :cond_2
    instance-of v0, p1, Lgh3/l;

    if-eqz v0, :cond_d

    check-cast p1, Lgh3/l;

    iget-object p1, p1, Lgh3/l;->x:Ljava/lang/Object;

    iget-object v0, p0, Lch3/g0;->H:Lch3/f0;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-eqz v0, :cond_4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lch3/g0;->H:Lch3/f0;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    iget-boolean v0, p0, Lch3/g0;->M:Z

    if-nez v0, :cond_3

    cmp-long v0, v3, v5

    if-eqz v0, :cond_3

    iput-boolean v2, p0, Lch3/g0;->M:Z

    move v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    move v0, v1

    :goto_2
    if-eqz v0, :cond_c

    iget-object v0, p0, Lch3/g0;->I:Ljava/util/Queue;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p0, p1}, Lch3/g0;->l(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lch3/g0;->i()V

    goto :goto_6

    :cond_6
    :goto_3
    :try_start_1
    iget-object v0, p0, Lch3/g0;->E:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    :try_start_2
    iget-boolean v0, p0, Lch3/g0;->F:Z

    if-nez v0, :cond_7

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-virtual {p0}, Lxg3/s;->b()V

    invoke-virtual {p0, p1}, Lch3/g0;->onError(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception p1

    goto :goto_8

    :catchall_3
    move-exception p1

    move v2, v1

    goto :goto_8

    :cond_7
    :try_start_4
    invoke-virtual {p0}, Lch3/g0;->j()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    :goto_4
    const-wide v5, 0x7fffffffffffffffL

    cmp-long p1, v3, v5

    if-eqz p1, :cond_8

    iget-object p1, p0, Lch3/g0;->H:Lch3/f0;

    const/4 v0, -0x1

    int-to-long v3, v0

    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_8
    iget p1, p0, Lch3/g0;->U:I

    add-int/2addr p1, v2

    iget v0, p0, Lch3/g0;->T:I

    if-ne p1, v0, :cond_9

    iput v1, p0, Lch3/g0;->U:I

    int-to-long v3, p1

    invoke-virtual {p0, v3, v4}, Lxg3/s;->e(J)V

    goto :goto_5

    :cond_9
    iput p1, p0, Lch3/g0;->U:I

    :goto_5
    monitor-enter p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    iget-boolean p1, p0, Lch3/g0;->N:Z

    if-nez p1, :cond_a

    iput-boolean v1, p0, Lch3/g0;->M:Z

    monitor-exit p0

    goto :goto_6

    :catchall_4
    move-exception p1

    goto :goto_7

    :cond_a
    iput-boolean v1, p0, Lch3/g0;->N:Z

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    invoke-virtual {p0}, Lch3/g0;->i()V

    :goto_6
    return-void

    :goto_7
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_8
    if-nez v2, :cond_b

    monitor-enter p0

    :try_start_8
    iput-boolean v1, p0, Lch3/g0;->M:Z

    monitor-exit p0

    goto :goto_9

    :catchall_5
    move-exception p1

    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    throw p1

    :cond_b
    :goto_9
    throw p1

    :cond_c
    invoke-virtual {p0, p1}, Lch3/g0;->l(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lch3/g0;->h()V

    return-void

    :cond_d
    new-instance v0, Lch3/e0;

    iget-wide v3, p0, Lch3/g0;->Q:J

    const-wide/16 v5, 0x1

    add-long/2addr v5, v3

    iput-wide v5, p0, Lch3/g0;->Q:J

    invoke-direct {v0, p0, v3, v4}, Lch3/e0;-><init>(Lch3/g0;J)V

    iget-object v3, p0, Lch3/g0;->J:Lmh3/c;

    if-nez v3, :cond_f

    monitor-enter p0

    :try_start_9
    iget-object v3, p0, Lch3/g0;->J:Lmh3/c;

    if-nez v3, :cond_e

    new-instance v3, Lmh3/c;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lch3/g0;->J:Lmh3/c;

    goto :goto_a

    :catchall_6
    move-exception p1

    goto :goto_b

    :cond_e
    move v2, v1

    :goto_a
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    if-eqz v2, :cond_f

    invoke-virtual {p0, v3}, Lxg3/s;->c(Lxg3/t;)V

    goto :goto_c

    :goto_b
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    throw p1

    :cond_f
    :goto_c
    invoke-virtual {v3, v0}, Lmh3/c;->c(Lxg3/t;)V

    iget-object v2, p0, Lch3/g0;->O:Ljava/lang/Object;

    monitor-enter v2

    :try_start_b
    iget-object v3, p0, Lch3/g0;->P:[Lch3/e0;

    array-length v4, v3

    add-int/lit8 v5, v4, 0x1

    new-array v5, v5, [Lch3/e0;

    invoke-static {v3, v1, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object v0, v5, v4

    iput-object v5, p0, Lch3/g0;->P:[Lch3/e0;

    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    invoke-virtual {p1, v0}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    invoke-virtual {p0}, Lch3/g0;->h()V

    return-void

    :catchall_7
    move-exception p1

    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    throw p1
.end method
