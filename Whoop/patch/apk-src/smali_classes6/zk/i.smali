.class public final Lzk/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/e;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lul/b;


# instance fields
.field public final E:Lg5/d;

.field public final F:Lz63/d;

.field public final G:Ld9/f;

.field public H:Lcom/bumptech/glide/c;

.field public I:Lwk/e;

.field public J:Lcom/bumptech/glide/d;

.field public K:Lzk/r;

.field public L:I

.field public M:I

.field public N:Lzk/k;

.field public O:Lwk/h;

.field public P:Lzk/p;

.field public Q:I

.field public R:J

.field public S:Ljava/lang/Object;

.field public T:Ljava/lang/Thread;

.field public U:Lwk/e;

.field public V:Lwk/e;

.field public W:Ljava/lang/Object;

.field public X:Lwk/a;

.field public Y:Lxk/e;

.field public volatile Z:Lzk/f;

.field public volatile a0:Z

.field public volatile b0:Z

.field public c0:I

.field public d0:I

.field public final w:Lzk/g;

.field public final x:Ljava/util/ArrayList;

.field public final y:Lul/d;

.field public final z:Lio/sentry/android/core/util/a;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/util/a;Ls/m2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzk/g;

    invoke-direct {v0}, Lzk/g;-><init>()V

    iput-object v0, p0, Lzk/i;->w:Lzk/g;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzk/i;->x:Ljava/util/ArrayList;

    new-instance v0, Lul/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lzk/i;->y:Lul/d;

    new-instance v0, Lz63/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lzk/i;->F:Lz63/d;

    new-instance v0, Ld9/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lzk/i;->G:Ld9/f;

    iput-object p1, p0, Lzk/i;->z:Lio/sentry/android/core/util/a;

    iput-object p2, p0, Lzk/i;->E:Lg5/d;

    return-void
.end method


# virtual methods
.method public final a(Lwk/e;Ljava/lang/Exception;Lxk/e;Lwk/a;)V
    .locals 2

    invoke-interface {p3}, Lxk/e;->a()V

    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    const-string v1, "Fetching data failed"

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {p3}, Lxk/e;->b()Ljava/lang/Class;

    move-result-object p2

    iput-object p1, v0, Lcom/bumptech/glide/load/engine/GlideException;->x:Lwk/e;

    iput-object p4, v0, Lcom/bumptech/glide/load/engine/GlideException;->y:Lwk/a;

    iput-object p2, v0, Lcom/bumptech/glide/load/engine/GlideException;->z:Ljava/lang/Class;

    iget-object p1, p0, Lzk/i;->x:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lzk/i;->T:Ljava/lang/Thread;

    if-eq p1, p2, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lzk/i;->d0:I

    iget-object p1, p0, Lzk/i;->P:Lzk/p;

    iget-boolean p2, p1, Lzk/p;->M:Z

    if-eqz p2, :cond_0

    iget-object p1, p1, Lzk/p;->I:Lcl/b;

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lzk/p;->H:Lcl/b;

    :goto_0
    invoke-virtual {p1, p0}, Lcl/b;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lzk/i;->n()V

    return-void
.end method

.method public final b()Lul/d;
    .locals 1

    iget-object v0, p0, Lzk/i;->y:Lul/d;

    return-object v0
.end method

.method public final c(Lwk/e;Ljava/lang/Object;Lxk/e;Lwk/a;Lwk/e;)V
    .locals 0

    iput-object p1, p0, Lzk/i;->U:Lwk/e;

    iput-object p2, p0, Lzk/i;->W:Ljava/lang/Object;

    iput-object p3, p0, Lzk/i;->Y:Lxk/e;

    iput-object p4, p0, Lzk/i;->X:Lwk/a;

    iput-object p5, p0, Lzk/i;->V:Lwk/e;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lzk/i;->T:Ljava/lang/Thread;

    if-eq p1, p2, :cond_1

    const/4 p1, 0x3

    iput p1, p0, Lzk/i;->d0:I

    iget-object p1, p0, Lzk/i;->P:Lzk/p;

    iget-boolean p2, p1, Lzk/p;->M:Z

    if-eqz p2, :cond_0

    iget-object p1, p1, Lzk/p;->I:Lcl/b;

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lzk/p;->H:Lcl/b;

    :goto_0
    invoke-virtual {p1, p0}, Lcl/b;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lzk/i;->f()V

    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lzk/i;

    iget-object v0, p0, Lzk/i;->J:Lcom/bumptech/glide/d;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p1, Lzk/i;->J:Lcom/bumptech/glide/d;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lzk/i;->Q:I

    iget p1, p1, Lzk/i;->Q:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final d(Lxk/e;Ljava/lang/Object;Lwk/a;)Lzk/z;
    .locals 5

    const-string v0, "Decoded result "

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-interface {p1}, Lxk/e;->a()V

    return-object v1

    :cond_0
    :try_start_0
    sget v2, Ltl/g;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v2

    invoke-virtual {p0, p2, p3}, Lzk/i;->e(Ljava/lang/Object;Lwk/a;)Lzk/z;

    move-result-object p2

    const-string p3, "DecodeJob"

    const/4 v4, 0x2

    invoke-static {p3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, v2, v3, p3, v1}, Lzk/i;->j(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Lxk/e;->a()V

    return-object p2

    :goto_1
    invoke-interface {p1}, Lxk/e;->a()V

    throw p2
.end method

.method public final e(Ljava/lang/Object;Lwk/a;)Lzk/z;
    .locals 9

    iget-object v0, p0, Lzk/i;->w:Lzk/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lzk/g;->c(Ljava/lang/Class;)Lzk/x;

    move-result-object v2

    iget-object v0, p0, Lzk/i;->O:Lwk/h;

    sget-object v1, Lwk/a;->z:Lwk/a;

    if-eq p2, v1, :cond_1

    iget-object v1, p0, Lzk/i;->w:Lzk/g;

    iget-boolean v1, v1, Lzk/g;->r:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    sget-object v3, Lgl/m;->i:Lwk/g;

    invoke-virtual {v0, v3}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v1, :cond_3

    :cond_2
    :goto_2
    move-object v4, v0

    goto :goto_3

    :cond_3
    new-instance v0, Lwk/h;

    invoke-direct {v0}, Lwk/h;-><init>()V

    iget-object v4, p0, Lzk/i;->O:Lwk/h;

    iget-object v5, v0, Lwk/h;->b:Ltl/b;

    iget-object v4, v4, Lwk/h;->b:Ltl/b;

    invoke-virtual {v5, v4}, Ltl/b;->h(La0/g;)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v4, v0, Lwk/h;->b:Ltl/b;

    invoke-virtual {v4, v3, v1}, Ltl/b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :goto_3
    iget-object v0, p0, Lzk/i;->H:Lcom/bumptech/glide/c;

    iget-object v0, v0, Lcom/bumptech/glide/c;->b:La3/l1;

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxk/h;

    monitor-enter v1

    :try_start_0
    iget-object v0, v1, Lxk/h;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/f;

    if-nez v0, :cond_5

    iget-object v3, v1, Lxk/h;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxk/f;

    invoke-interface {v5}, Lxk/f;->b()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v0, v5

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_5
    :goto_4
    if-nez v0, :cond_6

    sget-object v0, Lxk/h;->x:Lhl/a;

    :cond_6
    invoke-interface {v0, p1}, Lxk/f;->a(Ljava/lang/Object;)Lxk/g;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    :try_start_1
    iget v5, p0, Lzk/i;->L:I

    iget v6, p0, Lzk/i;->M:I

    new-instance v7, Lpg3/p;

    const/16 p1, 0x11

    invoke-direct {v7, p1, p0, p2}, Lpg3/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v2, Lzk/x;->a:Lg5/d;

    invoke-interface {p1}, Lg5/d;->b()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "Argument must not be null"

    invoke-static {p2, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p2

    check-cast v8, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual/range {v2 .. v8}, Lzk/x;->a(Lxk/g;Lwk/h;IILpg3/p;Ljava/util/List;)Lzk/z;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-interface {p1, v8}, Lg5/d;->a(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-interface {v3}, Lxk/g;->a()V

    return-object p2

    :catchall_1
    move-exception v0

    move-object p2, v0

    :try_start_4
    invoke-interface {p1, v8}, Lg5/d;->a(Ljava/lang/Object;)Z

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    move-object p1, v0

    invoke-interface {v3}, Lxk/g;->a()V

    throw p1

    :goto_5
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final f()V
    .locals 12

    const-string v0, "DecodeJob"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Retrieved data"

    iget-wide v1, p0, Lzk/i;->R:J

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "data: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lzk/i;->W:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", cache key: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lzk/i;->U:Lwk/e;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", fetcher: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lzk/i;->Y:Lxk/e;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1, v2, v0, v3}, Lzk/i;->j(JLjava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lzk/i;->Y:Lxk/e;

    iget-object v2, p0, Lzk/i;->W:Ljava/lang/Object;

    iget-object v3, p0, Lzk/i;->X:Lwk/a;

    invoke-virtual {p0, v0, v2, v3}, Lzk/i;->d(Lxk/e;Ljava/lang/Object;Lwk/a;)Lzk/z;

    move-result-object v0
    :try_end_0
    .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v2, p0, Lzk/i;->V:Lwk/e;

    iget-object v3, p0, Lzk/i;->X:Lwk/a;

    iput-object v2, v0, Lcom/bumptech/glide/load/engine/GlideException;->x:Lwk/e;

    iput-object v3, v0, Lcom/bumptech/glide/load/engine/GlideException;->y:Lwk/a;

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/GlideException;->z:Ljava/lang/Class;

    iget-object v2, p0, Lzk/i;->x:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_b

    iget-object v2, p0, Lzk/i;->X:Lwk/a;

    instance-of v3, v0, Lzk/v;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Lzk/v;

    invoke-interface {v3}, Lzk/v;->initialize()V

    :cond_1
    iget-object v3, p0, Lzk/i;->F:Lz63/d;

    iget-object v3, v3, Lz63/d;->y:Ljava/lang/Object;

    check-cast v3, Lzk/y;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    sget-object v1, Lzk/y;->E:Ls/m2;

    invoke-virtual {v1}, Ls/m2;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzk/y;

    iput-boolean v4, v1, Lzk/y;->z:Z

    iput-boolean v5, v1, Lzk/y;->y:Z

    iput-object v0, v1, Lzk/y;->x:Lzk/z;

    move-object v0, v1

    :cond_2
    invoke-virtual {p0}, Lzk/i;->p()V

    iget-object v3, p0, Lzk/i;->P:Lzk/p;

    monitor-enter v3

    :try_start_1
    iput-object v0, v3, Lzk/p;->N:Lzk/z;

    iput-object v2, v3, Lzk/p;->O:Lwk/a;

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    monitor-enter v3

    :try_start_2
    iget-object v0, v3, Lzk/p;->x:Lul/d;

    invoke-virtual {v0}, Lul/d;->b()V

    iget-boolean v0, v3, Lzk/p;->U:Z

    if-eqz v0, :cond_3

    iget-object v0, v3, Lzk/p;->N:Lzk/z;

    invoke-interface {v0}, Lzk/z;->a()V

    invoke-virtual {v3}, Lzk/p;->h()V

    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_3
    iget-object v0, v3, Lzk/p;->w:Lzk/o;

    iget-object v0, v0, Lzk/o;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-boolean v0, v3, Lzk/p;->P:Z

    if-nez v0, :cond_9

    iget-object v0, v3, Lzk/p;->E:Lz5/b;

    iget-object v7, v3, Lzk/p;->N:Lzk/z;

    iget-boolean v8, v3, Lzk/p;->L:Z

    iget-object v10, v3, Lzk/p;->K:Lzk/r;

    iget-object v11, v3, Lzk/p;->y:Lzk/s;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lzk/t;

    const/4 v9, 0x1

    invoke-direct/range {v6 .. v11}, Lzk/t;-><init>(Lzk/z;ZZLwk/e;Lzk/s;)V

    iput-object v6, v3, Lzk/p;->S:Lzk/t;

    iput-boolean v5, v3, Lzk/p;->P:Z

    iget-object v0, v3, Lzk/p;->w:Lzk/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, v0, Lzk/o;->w:Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v5

    invoke-virtual {v3, v0}, Lzk/p;->e(I)V

    iget-object v0, v3, Lzk/p;->K:Lzk/r;

    iget-object v6, v3, Lzk/p;->S:Lzk/t;

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v7, v3, Lzk/p;->F:Lzk/q;

    check-cast v7, Lzk/l;

    invoke-virtual {v7, v3, v0, v6}, Lzk/l;->d(Lzk/p;Lwk/e;Lzk/t;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzk/n;

    iget-object v6, v2, Lzk/n;->b:Ljava/util/concurrent/Executor;

    new-instance v7, Lzk/m;

    iget-object v2, v2, Lzk/n;->a:Lpl/e;

    const/4 v8, 0x1

    invoke-direct {v7, v3, v2, v8}, Lzk/m;-><init>(Lzk/p;Lpl/e;I)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, Lzk/p;->d()V

    :goto_2
    const/4 v0, 0x5

    iput v0, p0, Lzk/i;->c0:I

    :try_start_3
    iget-object v2, p0, Lzk/i;->F:Lz63/d;

    iget-object v0, v2, Lz63/d;->y:Ljava/lang/Object;

    check-cast v0, Lzk/y;

    if-eqz v0, :cond_5

    move v4, v5

    :cond_5
    if-eqz v4, :cond_6

    iget-object v0, p0, Lzk/i;->z:Lio/sentry/android/core/util/a;

    iget-object v3, p0, Lzk/i;->O:Lwk/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v0}, Lio/sentry/android/core/util/a;->a()Lbl/a;

    move-result-object v0

    iget-object v4, v2, Lz63/d;->w:Ljava/lang/Object;

    check-cast v4, Lwk/e;

    new-instance v6, Lz63/d;

    iget-object v7, v2, Lz63/d;->x:Ljava/lang/Object;

    check-cast v7, Lwk/k;

    iget-object v8, v2, Lz63/d;->y:Ljava/lang/Object;

    check-cast v8, Lzk/y;

    invoke-direct {v6, v7, v8, v3}, Lz63/d;-><init>(Lwk/c;Ljava/lang/Object;Lwk/h;)V

    invoke-interface {v0, v4, v6}, Lbl/a;->j(Lwk/e;Lz63/d;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-object v0, v2, Lz63/d;->y:Ljava/lang/Object;

    check-cast v0, Lzk/y;

    invoke-virtual {v0}, Lzk/y;->d()V

    goto :goto_3

    :catchall_1
    move-exception v0

    iget-object v2, v2, Lz63/d;->y:Ljava/lang/Object;

    check-cast v2, Lzk/y;

    invoke-virtual {v2}, Lzk/y;->d()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_4

    :cond_6
    :goto_3
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lzk/y;->d()V

    :cond_7
    iget-object v2, p0, Lzk/i;->G:Ld9/f;

    monitor-enter v2

    :try_start_6
    iput-boolean v5, v2, Ld9/f;->b:Z

    invoke-virtual {v2}, Ld9/f;->b()Z

    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    monitor-exit v2

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lzk/i;->l()V

    goto :goto_6

    :catchall_3
    move-exception v0

    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    :goto_4
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lzk/y;->d()V

    :cond_8
    throw v0

    :cond_9
    :try_start_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already have resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received a resource without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw v0

    :catchall_4
    move-exception v0

    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    throw v0

    :cond_b
    invoke-virtual {p0}, Lzk/i;->n()V

    :cond_c
    :goto_6
    return-void
.end method

.method public final g()Lzk/f;
    .locals 3

    iget v0, p0, Lzk/i;->c0:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lzk/i;->w:Lzk/g;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    iget v1, p0, Lzk/i;->c0:I

    invoke-static {v1}, Lzk/h;->a(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lzk/d0;

    invoke-direct {v0, v2, p0}, Lzk/d0;-><init>(Lzk/g;Lzk/i;)V

    return-object v0

    :cond_2
    new-instance v0, Lzk/c;

    invoke-virtual {v2}, Lzk/g;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lzk/c;-><init>(Ljava/util/List;Lzk/g;Lzk/e;)V

    return-object v0

    :cond_3
    new-instance v0, Lzk/a0;

    invoke-direct {v0, v2, p0}, Lzk/a0;-><init>(Lzk/g;Lzk/i;)V

    return-object v0
.end method

.method public final h(I)I
    .locals 4

    invoke-static {p1}, Le4/p;->e(I)I

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    const/4 v3, 0x3

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v3, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Lzk/h;->a(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Unrecognized stage: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 p1, 0x6

    return p1

    :cond_2
    const/4 p1, 0x4

    return p1

    :cond_3
    iget-object p1, p0, Lzk/i;->N:Lzk/k;

    iget p1, p1, Lzk/k;->a:I

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const/4 p1, 0x1

    goto :goto_1

    :pswitch_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    return v3

    :cond_4
    invoke-virtual {p0, v3}, Lzk/i;->h(I)I

    move-result p1

    return p1

    :cond_5
    iget-object p1, p0, Lzk/i;->N:Lzk/k;

    iget p1, p1, Lzk/k;->a:I

    packed-switch p1, :pswitch_data_1

    :pswitch_2
    const/4 p1, 0x1

    goto :goto_2

    :pswitch_3
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_6

    return v1

    :cond_6
    invoke-virtual {p0, v1}, Lzk/i;->h(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final i(Lcom/bumptech/glide/c;Ljava/lang/Object;Lzk/r;Lwk/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d;Lzk/k;Ljava/util/Map;ZZLwk/h;Lzk/p;I)V
    .locals 2

    move-object/from16 v0, p14

    iget-object v1, p0, Lzk/i;->w:Lzk/g;

    iput-object p1, v1, Lzk/g;->c:Lcom/bumptech/glide/c;

    iput-object p2, v1, Lzk/g;->d:Ljava/lang/Object;

    iput-object p4, v1, Lzk/g;->n:Lwk/e;

    iput p5, v1, Lzk/g;->e:I

    iput p6, v1, Lzk/g;->f:I

    iput-object p10, v1, Lzk/g;->p:Lzk/k;

    iput-object p7, v1, Lzk/g;->g:Ljava/lang/Class;

    iget-object p7, p0, Lzk/i;->z:Lio/sentry/android/core/util/a;

    iput-object p7, v1, Lzk/g;->h:Lio/sentry/android/core/util/a;

    iput-object p8, v1, Lzk/g;->k:Ljava/lang/Class;

    iput-object p9, v1, Lzk/g;->o:Lcom/bumptech/glide/d;

    iput-object v0, v1, Lzk/g;->i:Lwk/h;

    iput-object p11, v1, Lzk/g;->j:Ljava/util/Map;

    move p7, p12

    iput-boolean p7, v1, Lzk/g;->q:Z

    move p7, p13

    iput-boolean p7, v1, Lzk/g;->r:Z

    iput-object p1, p0, Lzk/i;->H:Lcom/bumptech/glide/c;

    iput-object p4, p0, Lzk/i;->I:Lwk/e;

    iput-object p9, p0, Lzk/i;->J:Lcom/bumptech/glide/d;

    iput-object p3, p0, Lzk/i;->K:Lzk/r;

    iput p5, p0, Lzk/i;->L:I

    iput p6, p0, Lzk/i;->M:I

    iput-object p10, p0, Lzk/i;->N:Lzk/k;

    iput-object v0, p0, Lzk/i;->O:Lwk/h;

    move-object/from16 p1, p15

    iput-object p1, p0, Lzk/i;->P:Lzk/p;

    move/from16 p1, p16

    iput p1, p0, Lzk/i;->Q:I

    const/4 p1, 0x1

    iput p1, p0, Lzk/i;->d0:I

    iput-object p2, p0, Lzk/i;->S:Ljava/lang/Object;

    return-void
.end method

.method public final j(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, " in "

    invoke-static {p3, v0}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-static {p1, p2}, Ltl/g;->a(J)D

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, ", load key: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lzk/i;->K:Lzk/r;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    const-string p1, ", "

    invoke-virtual {p1, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", thread: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DecodeJob"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final k()V
    .locals 7

    invoke-virtual {p0}, Lzk/i;->p()V

    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    const-string v1, "Failed to load resource"

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lzk/i;->x:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, Lzk/i;->P:Lzk/p;

    monitor-enter v1

    :try_start_0
    iput-object v0, v1, Lzk/p;->Q:Lcom/bumptech/glide/load/engine/GlideException;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-enter v1

    :try_start_1
    iget-object v0, v1, Lzk/p;->x:Lul/d;

    invoke-virtual {v0}, Lul/d;->b()V

    iget-boolean v0, v1, Lzk/p;->U:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lzk/p;->h()V

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    iget-object v0, v1, Lzk/p;->w:Lzk/o;

    iget-object v0, v0, Lzk/o;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, v1, Lzk/p;->R:Z

    if-nez v0, :cond_3

    iput-boolean v2, v1, Lzk/p;->R:Z

    iget-object v0, v1, Lzk/p;->K:Lzk/r;

    iget-object v3, v1, Lzk/p;->w:Lzk/o;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v3, v3, Lzk/o;->w:Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Lzk/p;->e(I)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v3, v1, Lzk/p;->F:Lzk/q;

    const/4 v5, 0x0

    check-cast v3, Lzk/l;

    invoke-virtual {v3, v1, v0, v5}, Lzk/l;->d(Lzk/p;Lwk/e;Lzk/t;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzk/n;

    iget-object v4, v3, Lzk/n;->b:Ljava/util/concurrent/Executor;

    new-instance v5, Lzk/m;

    iget-object v3, v3, Lzk/n;->a:Lpl/e;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v3, v6}, Lzk/m;-><init>(Lzk/p;Lpl/e;I)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lzk/p;->d()V

    :goto_1
    iget-object v0, p0, Lzk/i;->G:Ld9/f;

    monitor-enter v0

    :try_start_2
    iput-boolean v2, v0, Ld9/f;->c:Z

    invoke-virtual {v0}, Ld9/f;->b()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lzk/i;->l()V

    :cond_2
    return-void

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    :cond_3
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Already failed once"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Received an exception without any callbacks to notify"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0
.end method

.method public final l()V
    .locals 5

    iget-object v0, p0, Lzk/i;->G:Ld9/f;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, v0, Ld9/f;->b:Z

    iput-boolean v1, v0, Ld9/f;->a:Z

    iput-boolean v1, v0, Ld9/f;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lzk/i;->F:Lz63/d;

    const/4 v2, 0x0

    iput-object v2, v0, Lz63/d;->w:Ljava/lang/Object;

    iput-object v2, v0, Lz63/d;->x:Ljava/lang/Object;

    iput-object v2, v0, Lz63/d;->y:Ljava/lang/Object;

    iget-object v0, p0, Lzk/i;->w:Lzk/g;

    iput-object v2, v0, Lzk/g;->c:Lcom/bumptech/glide/c;

    iput-object v2, v0, Lzk/g;->d:Ljava/lang/Object;

    iput-object v2, v0, Lzk/g;->n:Lwk/e;

    iput-object v2, v0, Lzk/g;->g:Ljava/lang/Class;

    iput-object v2, v0, Lzk/g;->k:Ljava/lang/Class;

    iput-object v2, v0, Lzk/g;->i:Lwk/h;

    iput-object v2, v0, Lzk/g;->o:Lcom/bumptech/glide/d;

    iput-object v2, v0, Lzk/g;->j:Ljava/util/Map;

    iput-object v2, v0, Lzk/g;->p:Lzk/k;

    iget-object v3, v0, Lzk/g;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-boolean v1, v0, Lzk/g;->l:Z

    iget-object v3, v0, Lzk/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-boolean v1, v0, Lzk/g;->m:Z

    iput-boolean v1, p0, Lzk/i;->a0:Z

    iput-object v2, p0, Lzk/i;->H:Lcom/bumptech/glide/c;

    iput-object v2, p0, Lzk/i;->I:Lwk/e;

    iput-object v2, p0, Lzk/i;->O:Lwk/h;

    iput-object v2, p0, Lzk/i;->J:Lcom/bumptech/glide/d;

    iput-object v2, p0, Lzk/i;->K:Lzk/r;

    iput-object v2, p0, Lzk/i;->P:Lzk/p;

    iput v1, p0, Lzk/i;->c0:I

    iput-object v2, p0, Lzk/i;->Z:Lzk/f;

    iput-object v2, p0, Lzk/i;->T:Ljava/lang/Thread;

    iput-object v2, p0, Lzk/i;->U:Lwk/e;

    iput-object v2, p0, Lzk/i;->W:Ljava/lang/Object;

    iput-object v2, p0, Lzk/i;->X:Lwk/a;

    iput-object v2, p0, Lzk/i;->Y:Lxk/e;

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lzk/i;->R:J

    iput-boolean v1, p0, Lzk/i;->b0:Z

    iput-object v2, p0, Lzk/i;->S:Ljava/lang/Object;

    iget-object v0, p0, Lzk/i;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lzk/i;->E:Lg5/d;

    invoke-interface {v0, p0}, Lg5/d;->a(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final m()V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lzk/i;->d0:I

    iget-object v0, p0, Lzk/i;->P:Lzk/p;

    iget-boolean v1, v0, Lzk/p;->M:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lzk/p;->I:Lcl/b;

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lzk/p;->H:Lcl/b;

    :goto_0
    invoke-virtual {v0, p0}, Lcl/b;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final n()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lzk/i;->T:Ljava/lang/Thread;

    sget v0, Ltl/g;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    iput-wide v0, p0, Lzk/i;->R:J

    const/4 v0, 0x0

    :cond_0
    iget-boolean v1, p0, Lzk/i;->b0:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lzk/i;->Z:Lzk/f;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lzk/i;->Z:Lzk/f;

    invoke-interface {v0}, Lzk/f;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget v1, p0, Lzk/i;->c0:I

    invoke-virtual {p0, v1}, Lzk/i;->h(I)I

    move-result v1

    iput v1, p0, Lzk/i;->c0:I

    invoke-virtual {p0}, Lzk/i;->g()Lzk/f;

    move-result-object v1

    iput-object v1, p0, Lzk/i;->Z:Lzk/f;

    iget v1, p0, Lzk/i;->c0:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lzk/i;->m()V

    return-void

    :cond_1
    iget v1, p0, Lzk/i;->c0:I

    const/4 v2, 0x6

    if-eq v1, v2, :cond_2

    iget-boolean v1, p0, Lzk/i;->b0:Z

    if-eqz v1, :cond_3

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, Lzk/i;->k()V

    :cond_3
    return-void
.end method

.method public final o()V
    .locals 3

    iget v0, p0, Lzk/i;->d0:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lzk/i;->f()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    iget v1, p0, Lzk/i;->d0:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const-string v1, "null"

    goto :goto_0

    :cond_1
    const-string v1, "DECODE_DATA"

    goto :goto_0

    :cond_2
    const-string v1, "SWITCH_TO_SOURCE_SERVICE"

    goto :goto_0

    :cond_3
    const-string v1, "INITIALIZE"

    :goto_0
    const-string v2, "Unrecognized run reason: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {p0}, Lzk/i;->n()V

    return-void

    :cond_5
    invoke-virtual {p0, v1}, Lzk/i;->h(I)I

    move-result v0

    iput v0, p0, Lzk/i;->c0:I

    invoke-virtual {p0}, Lzk/i;->g()Lzk/f;

    move-result-object v0

    iput-object v0, p0, Lzk/i;->Z:Lzk/f;

    invoke-virtual {p0}, Lzk/i;->n()V

    return-void
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lzk/i;->y:Lul/d;

    invoke-virtual {v0}, Lul/d;->b()V

    iget-boolean v0, p0, Lzk/i;->a0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzk/i;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzk/i;->x:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already notified"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iput-boolean v1, p0, Lzk/i;->a0:Z

    return-void
.end method

.method public final run()V
    .locals 5

    const-string v0, "DecodeJob"

    const-string v1, "DecodeJob threw unexpectedly, isCancelled: "

    iget-object v2, p0, Lzk/i;->Y:Lxk/e;

    :try_start_0
    iget-boolean v3, p0, Lzk/i;->b0:Z

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lzk/i;->k()V
    :try_end_0
    .catch Lzk/b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lxk/e;->a()V

    return-void

    :catchall_0
    move-exception v3

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lzk/i;->o()V
    :try_end_1
    .catch Lzk/b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lxk/e;->a()V

    :cond_1
    return-void

    :goto_0
    const/4 v4, 0x3

    :try_start_2
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lzk/i;->b0:Z

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", stage: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lzk/i;->c0:I

    invoke-static {v1}, Lzk/h;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_1
    iget v0, p0, Lzk/i;->c0:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lzk/i;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lzk/i;->k()V

    :cond_3
    iget-boolean v0, p0, Lzk/i;->b0:Z

    if-nez v0, :cond_4

    throw v3

    :cond_4
    throw v3

    :goto_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    if-eqz v2, :cond_5

    invoke-interface {v2}, Lxk/e;->a()V

    :cond_5
    throw v0
.end method
