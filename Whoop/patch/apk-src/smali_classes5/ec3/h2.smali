.class public final Lec3/h2;
.super Lfc3/a;
.source "SourceFile"

# interfaces
.implements Lec3/p1;
.implements Lec3/d;
.implements Lfc3/q;


# static fields
.field public static final synthetic F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public E:I

.field private volatile synthetic _state$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_state$volatile"

    const-class v2, Lec3/h2;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lec3/h2;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/h2;->_state$volatile:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Lq83/j;ILdc3/a;)Lec3/l;
    .locals 1

    if-ltz p2, :cond_0

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x2

    if-ne p2, v0, :cond_1

    :goto_0
    sget-object v0, Ldc3/a;->x:Ldc3/a;

    if-ne p3, v0, :cond_1

    move-object p1, p0

    goto :goto_1

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lec3/v;->G(Lec3/t1;Lq83/j;ILdc3/a;)Lec3/l;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lec3/g2;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lec3/g2;

    iget v4, v3, Lec3/g2;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lec3/g2;->H:I

    goto :goto_0

    :cond_0
    new-instance v3, Lec3/g2;

    invoke-direct {v3, v1, v2}, Lec3/g2;-><init>(Lec3/h2;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lec3/g2;->F:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lec3/g2;->H:I

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v5, :cond_4

    if-eq v5, v9, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v0, v3, Lec3/g2;->E:Ljava/lang/Object;

    iget-object v5, v3, Lec3/g2;->z:Lbc3/k1;

    iget-object v10, v3, Lec3/g2;->y:Lec3/i2;

    iget-object v11, v3, Lec3/g2;->x:Lec3/m;

    iget-object v12, v3, Lec3/g2;->w:Lec3/h2;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v3, Lec3/g2;->E:Ljava/lang/Object;

    iget-object v5, v3, Lec3/g2;->z:Lbc3/k1;

    iget-object v10, v3, Lec3/g2;->y:Lec3/i2;

    iget-object v11, v3, Lec3/g2;->x:Lec3/m;

    iget-object v12, v3, Lec3/g2;->w:Lec3/h2;

    :try_start_1
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_5

    :cond_3
    iget-object v10, v3, Lec3/g2;->y:Lec3/i2;

    iget-object v0, v3, Lec3/g2;->x:Lec3/m;

    iget-object v12, v3, Lec3/g2;->w:Lec3/h2;

    :try_start_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lfc3/a;->c()Lfc3/c;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lec3/i2;

    :try_start_3
    instance-of v2, v0, Lec3/k2;

    if-eqz v2, :cond_5

    move-object v2, v0

    check-cast v2, Lec3/k2;

    iput-object v1, v3, Lec3/g2;->w:Lec3/h2;

    iput-object v0, v3, Lec3/g2;->x:Lec3/m;

    iput-object v10, v3, Lec3/g2;->y:Lec3/i2;

    iput v9, v3, Lec3/g2;->H:I

    invoke-virtual {v2, v3}, Lec3/k2;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v2, v4, :cond_5

    goto/16 :goto_7

    :catchall_1
    move-exception v0

    move-object v12, v1

    goto/16 :goto_8

    :cond_5
    move-object v12, v1

    :goto_1
    :try_start_4
    invoke-interface {v3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v5, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v2, v5}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    check-cast v2, Lbc3/k1;

    move-object v11, v0

    move-object v5, v2

    const/4 v0, 0x0

    :cond_6
    :goto_2
    sget-object v2, Lec3/h2;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, v12}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v5, :cond_8

    invoke-interface {v5}, Lbc3/k1;->isActive()Z

    move-result v13

    if-eqz v13, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {v5}, Lbc3/k1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v0

    throw v0

    :cond_8
    :goto_3
    if-eqz v0, :cond_9

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    :cond_9
    sget-object v0, Lfc3/b;->b:Lhc3/x;

    if-ne v2, v0, :cond_a

    const/4 v0, 0x0

    goto :goto_4

    :cond_a
    move-object v0, v2

    :goto_4
    iput-object v12, v3, Lec3/g2;->w:Lec3/h2;

    iput-object v11, v3, Lec3/g2;->x:Lec3/m;

    iput-object v10, v3, Lec3/g2;->y:Lec3/i2;

    iput-object v5, v3, Lec3/g2;->z:Lbc3/k1;

    iput-object v2, v3, Lec3/g2;->E:Ljava/lang/Object;

    iput v8, v3, Lec3/g2;->H:I

    invoke-interface {v11, v0, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_b

    goto :goto_7

    :cond_b
    move-object v0, v2

    :cond_c
    :goto_5
    iget-object v2, v10, Lec3/i2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v13, Lec3/v;->d:Lhc3/x;

    invoke-virtual {v2, v13}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v14, Lec3/v;->e:Lhc3/x;

    if-ne v2, v14, :cond_d

    goto :goto_2

    :cond_d
    iput-object v12, v3, Lec3/g2;->w:Lec3/h2;

    iput-object v11, v3, Lec3/g2;->x:Lec3/m;

    iput-object v10, v3, Lec3/g2;->y:Lec3/i2;

    iput-object v5, v3, Lec3/g2;->z:Lbc3/k1;

    iput-object v0, v3, Lec3/g2;->E:Ljava/lang/Object;

    iput v7, v3, Lec3/g2;->H:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    new-instance v14, Lbc3/m;

    invoke-static {v3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v15

    invoke-direct {v14, v9, v15}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v14}, Lbc3/m;->s()V

    iget-object v15, v10, Lec3/i2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_e
    invoke-virtual {v15, v13, v14}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_f

    goto :goto_6

    :cond_f
    invoke-virtual {v15}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v13, :cond_e

    invoke-virtual {v14, v2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_6
    invoke-virtual {v14}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v6

    sget-object v13, Lr83/a;->w:Lr83/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne v6, v13, :cond_10

    move-object v2, v6

    :cond_10
    if-ne v2, v4, :cond_6

    :goto_7
    return-object v4

    :goto_8
    invoke-virtual {v12, v10}, Lfc3/a;->g(Lfc3/c;)V

    throw v0
.end method

.method public final d()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "MutableStateFlow.resetReplayCache is not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Lfc3/c;
    .locals 1

    new-instance v0, Lec3/i2;

    invoke-direct {v0}, Lec3/i2;-><init>()V

    return-object v0
.end method

.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final f()[Lfc3/c;
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [Lec3/i2;

    return-object v0
.end method

.method public final getReplayCache()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lfc3/b;->b:Lhc3/x;

    sget-object v1, Lec3/h2;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    sget-object v0, Lfc3/b;->b:Lhc3/x;

    if-nez p1, :cond_0

    move-object p1, v0

    :cond_0
    if-nez p2, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lfc3/b;->b:Lhc3/x;

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9

    monitor-enter p0

    :try_start_0
    sget-object v0, Lec3/h2;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return v2

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :try_start_1
    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    :try_start_2
    invoke-virtual {v0, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p1, p0, Lec3/h2;->E:I

    and-int/lit8 p2, p1, 0x1

    if-nez p2, :cond_b

    add-int/2addr p1, v1

    iput p1, p0, Lec3/h2;->E:I

    iget-object p2, p0, Lfc3/a;->w:[Lfc3/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    :goto_0
    check-cast p2, [Lec3/i2;

    if-eqz p2, :cond_9

    array-length v0, p2

    move v3, v2

    :goto_1
    if-ge v3, v0, :cond_9

    aget-object v4, p2, v3

    if-eqz v4, :cond_8

    iget-object v4, v4, Lec3/i2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_3

    :cond_2
    sget-object v6, Lec3/v;->e:Lhc3/x;

    if-ne v5, v6, :cond_3

    goto :goto_3

    :cond_3
    sget-object v7, Lec3/v;->d:Lhc3/x;

    if-ne v5, v7, :cond_6

    :cond_4
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v5, :cond_4

    goto :goto_2

    :cond_6
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    check-cast v5, Lbc3/m;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v5, v4}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v5, :cond_6

    goto :goto_2

    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_9
    monitor-enter p0

    :try_start_3
    iget p2, p0, Lec3/h2;->E:I

    if-ne p2, p1, :cond_a

    add-int/2addr p1, v1

    iput p1, p0, Lec3/h2;->E:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    return v1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_a
    :try_start_4
    iget-object p1, p0, Lfc3/a;->w:[Lfc3/c;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    move v8, p2

    move-object p2, p1

    move p1, v8

    goto :goto_0

    :goto_4
    monitor-exit p0

    throw p1

    :cond_b
    add-int/lit8 p1, p1, 0x2

    :try_start_5
    iput p1, p0, Lec3/h2;->E:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return v1

    :goto_5
    monitor-exit p0

    throw p1
.end method
