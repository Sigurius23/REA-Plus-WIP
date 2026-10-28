.class public final Lto/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/i;
.implements Lcom/google/android/gms/common/api/j;


# instance fields
.field public final f:Ljava/util/LinkedList;

.field public final g:Lcom/google/android/gms/common/api/d;

.field public final h:Lto/a;

.field public final i:Lpg3/o;

.field public final j:Ljava/util/HashSet;

.field public final k:Ljava/util/HashMap;

.field public final l:I

.field public final m:Lto/i0;

.field public n:Z

.field public final o:Ljava/util/ArrayList;

.field public p:Lcom/google/android/gms/common/a;

.field public q:I

.field public final synthetic r:Lto/f;


# direct methods
.method public constructor <init>(Lto/f;Lcom/google/android/gms/common/api/h;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/v;->r:Lto/f;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lto/v;->f:Ljava/util/LinkedList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lto/v;->j:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lto/v;->k:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lto/v;->o:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lto/v;->p:Lcom/google/android/gms/common/a;

    const/4 v1, 0x0

    iput v1, p0, Lto/v;->q:I

    iget-object v1, p1, Lto/f;->N:Ljp/d;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {p2, v2, p0}, Lcom/google/android/gms/common/api/h;->zaa(Landroid/os/Looper;Lto/v;)Lcom/google/android/gms/common/api/d;

    move-result-object v2

    iput-object v2, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/h;->getApiKey()Lto/a;

    move-result-object v3

    iput-object v3, p0, Lto/v;->h:Lto/a;

    new-instance v3, Lpg3/o;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lpg3/o;-><init>(I)V

    iput-object v3, p0, Lto/v;->i:Lpg3/o;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/h;->zab()I

    move-result v3

    iput v3, p0, Lto/v;->l:I

    invoke-interface {v2}, Lcom/google/android/gms/common/api/d;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p1, Lto/f;->E:Landroid/content/Context;

    invoke-virtual {p2, p1, v1}, Lcom/google/android/gms/common/api/h;->zac(Landroid/content/Context;Landroid/os/Handler;)Lto/i0;

    move-result-object p1

    iput-object p1, p0, Lto/v;->m:Lto/i0;

    return-void

    :cond_0
    iput-object v0, p0, Lto/v;->m:Lto/i0;

    return-void
.end method


# virtual methods
.method public final X(I)V
    .locals 3

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v2, v1, :cond_0

    invoke-virtual {p0, p1}, Lto/v;->b(I)V

    return-void

    :cond_0
    new-instance v1, Lc5/a;

    const/4 v2, 0x4

    invoke-direct {v1, p0, p1, v2}, Lc5/a;-><init>(Ljava/lang/Object;II)V

    iget-object p1, v0, Lto/f;->N:Ljp/d;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a()V
    .locals 5

    iget-object v0, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    iget-object v1, p0, Lto/v;->r:Lto/f;

    iget-object v2, v1, Lto/f;->N:Ljp/d;

    invoke-static {v2}, Luo/w;->c(Landroid/os/Handler;)V

    const/4 v2, 0x0

    iput-object v2, p0, Lto/v;->p:Lcom/google/android/gms/common/a;

    sget-object v2, Lcom/google/android/gms/common/a;->E:Lcom/google/android/gms/common/a;

    invoke-virtual {p0, v2}, Lto/v;->j(Lcom/google/android/gms/common/a;)V

    iget-boolean v2, p0, Lto/v;->n:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Lto/f;->N:Ljp/d;

    const/16 v3, 0xb

    iget-object v4, p0, Lto/v;->h:Lto/a;

    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v1, v1, Lto/f;->N:Ljp/d;

    const/16 v2, 0x9

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lto/v;->n:Z

    :cond_0
    iget-object v1, p0, Lto/v;->k:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/f0;

    iget-object v2, v2, Lto/f0;->a:Lto/l;

    :try_start_0
    new-instance v3, Lcq/i;

    invoke-direct {v3}, Lcq/i;-><init>()V

    invoke-virtual {v2, v0, v3}, Lto/l;->b(Lcom/google/android/gms/common/api/d;Lcq/i;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    :goto_1
    const-string v3, "GoogleApiManager"

    const-string v4, "Failed to register listener on re-connection."

    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catch_2
    const/4 v1, 0x3

    invoke-virtual {p0, v1}, Lto/v;->X(I)V

    const-string v1, "DeadObjectException thrown while calling register listener method."

    check-cast v0, Luo/c;

    invoke-virtual {v0, v1}, Luo/c;->f(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lto/v;->d()V

    invoke-virtual {p0}, Lto/v;->h()V

    return-void
.end method

.method public final b(I)V
    .locals 6

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-static {v0}, Luo/w;->c(Landroid/os/Handler;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lto/v;->p:Lcom/google/android/gms/common/a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lto/v;->n:Z

    iget-object v2, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    check-cast v2, Luo/c;

    iget-object v2, v2, Luo/c;->a:Ljava/lang/String;

    iget-object v3, p0, Lto/v;->i:Lpg3/o;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "The connection to Google Play services was lost"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-ne p1, v1, :cond_0

    const-string p1, " due to service disconnection."

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/4 v5, 0x3

    if-ne p1, v5, :cond_1

    const-string p1, " due to dead object exception."

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    const-string p1, " Last reason for disconnect: "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v4, 0x14

    invoke-direct {v2, v4, p1, v0, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-virtual {v3, v2, v1}, Lpg3/o;->v0(Lcom/google/android/gms/common/api/Status;Z)V

    iget-object p1, p0, Lto/v;->h:Lto/a;

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    const/16 v2, 0x9

    invoke-static {v1, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    const-wide/16 v3, 0x1388

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    const/16 v2, 0xb

    invoke-static {v1, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, v0, Lto/f;->G:Lp0/n0;

    iget-object p1, p1, Lp0/n0;->x:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseIntArray;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lto/v;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/f0;

    iget-object v0, v0, Lto/f0;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_3
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final c(Lcom/google/android/gms/common/a;)Z
    .locals 4

    sget-object v0, Lto/f;->R:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lto/v;->r:Lto/f;

    iget-object v2, v1, Lto/f;->K:Lto/s;

    if-eqz v2, :cond_0

    iget-object v2, v1, Lto/f;->L:La0/h;

    iget-object v3, p0, Lto/v;->h:Lto/a;

    invoke-virtual {v2, v3}, La0/h;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lto/f;->K:Lto/s;

    iget v2, p0, Lto/v;->l:I

    invoke-virtual {v1, p1, v2}, Lto/r0;->l(Lcom/google/android/gms/common/a;I)V

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final c0(Lcom/google/android/gms/common/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lto/v;->l(Lcom/google/android/gms/common/a;Ljava/lang/RuntimeException;)V

    return-void
.end method

.method public final d()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lto/v;->f:Ljava/util/LinkedList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lto/n0;

    iget-object v5, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    check-cast v5, Luo/c;

    invoke-virtual {v5}, Luo/c;->n()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v4}, Lto/v;->e(Lto/n0;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final e(Lto/n0;)Z
    .locals 13

    instance-of v0, p1, Lto/d0;

    const-string v1, "DeadObjectException thrown while running ApiCallRunner."

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lto/v;->i:Lpg3/o;

    iget-object v3, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-interface {v3}, Lcom/google/android/gms/common/api/d;->a()Z

    move-result v4

    invoke-virtual {p1, v0, v4}, Lto/n0;->c(Lpg3/o;Z)V

    :try_start_0
    invoke-virtual {p1, p0}, Lto/n0;->d(Lto/v;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    invoke-virtual {p0, v2}, Lto/v;->X(I)V

    check-cast v3, Luo/c;

    invoke-virtual {v3, v1}, Luo/c;->f(Ljava/lang/String;)V

    return v2

    :cond_0
    move-object v0, p1

    check-cast v0, Lto/d0;

    invoke-virtual {v0, p0}, Lto/d0;->f(Lto/v;)[Lcom/google/android/gms/common/c;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_7

    array-length v5, v3

    if-nez v5, :cond_1

    goto :goto_4

    :cond_1
    iget-object v5, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    check-cast v5, Luo/c;

    iget-object v5, v5, Luo/c;->v:Luo/d0;

    if-nez v5, :cond_2

    move-object v5, v4

    goto :goto_0

    :cond_2
    iget-object v5, v5, Luo/d0;->x:[Lcom/google/android/gms/common/c;

    :goto_0
    const/4 v6, 0x0

    if-nez v5, :cond_3

    new-array v5, v6, [Lcom/google/android/gms/common/c;

    :cond_3
    new-instance v7, La0/g;

    array-length v8, v5

    invoke-direct {v7, v8}, La0/f1;-><init>(I)V

    move v8, v6

    :goto_1
    array-length v9, v5

    if-ge v8, v9, :cond_4

    aget-object v9, v5, v8

    iget-object v10, v9, Lcom/google/android/gms/common/c;->w:Ljava/lang/String;

    invoke-virtual {v9}, Lcom/google/android/gms/common/c;->b()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v7, v10, v9}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_4
    array-length v5, v3

    :goto_2
    if-ge v6, v5, :cond_7

    aget-object v8, v3, v6

    iget-object v9, v8, Lcom/google/android/gms/common/c;->w:Ljava/lang/String;

    invoke-virtual {v7, v9}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-virtual {v8}, Lcom/google/android/gms/common/c;->b()J

    move-result-wide v11

    cmp-long v9, v9, v11

    if-gez v9, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    move-object v4, v8

    :cond_7
    :goto_4
    if-nez v4, :cond_8

    iget-object v0, p0, Lto/v;->i:Lpg3/o;

    iget-object v3, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-interface {v3}, Lcom/google/android/gms/common/api/d;->a()Z

    move-result v4

    invoke-virtual {p1, v0, v4}, Lto/n0;->c(Lpg3/o;Z)V

    :try_start_1
    invoke-virtual {p1, p0}, Lto/n0;->d(Lto/v;)V
    :try_end_1
    .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_1

    return v2

    :catch_1
    invoke-virtual {p0, v2}, Lto/v;->X(I)V

    check-cast v3, Luo/c;

    invoke-virtual {v3, v1}, Luo/c;->f(Ljava/lang/String;)V

    return v2

    :cond_8
    iget-object p1, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object v1, v4, Lcom/google/android/gms/common/c;->w:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/google/android/gms/common/c;->b()J

    move-result-wide v5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v3, v3, 0x35

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    add-int/2addr v3, v7

    const/4 v7, 0x2

    add-int/2addr v3, v7

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    new-instance v9, Ljava/lang/StringBuilder;

    add-int/2addr v3, v8

    add-int/2addr v3, v7

    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, " could not execute call because it requires feature ("

    const-string v8, ", "

    invoke-static {v9, p1, v3, v1, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "GoogleApiManager"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lto/v;->r:Lto/f;

    iget-boolean v3, p1, Lto/f;->O:Z

    if-eqz v3, :cond_c

    invoke-virtual {v0, p0}, Lto/d0;->g(Lto/v;)Z

    move-result v3

    if-eqz v3, :cond_c

    iget-object v0, p0, Lto/v;->h:Lto/a;

    new-instance v2, Lto/w;

    invoke-direct {v2, v0, v4}, Lto/w;-><init>(Lto/a;Lcom/google/android/gms/common/c;)V

    iget-object v0, p0, Lto/v;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v3

    const-wide/16 v5, 0x1388

    const/16 v8, 0xf

    if-ltz v3, :cond_9

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/w;

    iget-object v1, p1, Lto/f;->N:Ljp/d;

    invoke-virtual {v1, v8, v0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v1, p1, Lto/f;->N:Ljp/d;

    invoke-static {v1, v8, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object p1, p1, Lto/f;->N:Ljp/d;

    invoke-virtual {p1, v0, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_5

    :cond_9
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lto/f;->N:Ljp/d;

    invoke-static {v0, v8, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v3, p1, Lto/f;->N:Ljp/d;

    invoke-virtual {v3, v0, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p1, Lto/f;->N:Ljp/d;

    const/16 v3, 0x10

    invoke-static {v0, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v2, p1, Lto/f;->N:Ljp/d;

    const-wide/32 v5, 0x1d4c0

    invoke-virtual {v2, v0, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    new-instance v0, Lcom/google/android/gms/common/a;

    const/4 v2, 0x0

    invoke-direct {v0, v7, v2}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, v0}, Lto/v;->c(Lcom/google/android/gms/common/a;)Z

    move-result v2

    const-string v3, ", version: "

    if-nez v2, :cond_a

    iget v2, p0, Lto/v;->l:I

    iget-object v5, p1, Lto/f;->F:Lcom/google/android/gms/common/GoogleApiAvailability;

    iget-object p1, p1, Lto/f;->E:Landroid/content/Context;

    invoke-virtual {v5, p1, v0, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->zad(Landroid/content/Context;Lcom/google/android/gms/common/a;I)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, v4, Lcom/google/android/gms/common/c;->w:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/google/android/gms/common/c;->b()J

    move-result-wide v4

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x37

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    new-instance v6, Ljava/lang/StringBuilder;

    add-int/2addr v0, v2

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Notification displayed for missing feature: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_a
    iget-object p1, v4, Lcom/google/android/gms/common/c;->w:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/google/android/gms/common/c;->b()J

    move-result-wide v4

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x3d

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    new-instance v6, Ljava/lang/StringBuilder;

    add-int/2addr v0, v2

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "A dialog should be displayed for missing feature: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    :goto_5
    const/4 p1, 0x0

    return p1

    :cond_c
    new-instance p1, Lcom/google/android/gms/common/api/UnsupportedApiCallException;

    invoke-direct {p1, v4}, Lcom/google/android/gms/common/api/UnsupportedApiCallException;-><init>(Lcom/google/android/gms/common/c;)V

    invoke-virtual {v0, p1}, Lto/n0;->b(Ljava/lang/Exception;)V

    return v2
.end method

.method public final f(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V
    .locals 4

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-static {v0}, Luo/w;->c(Landroid/os/Handler;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz p2, :cond_1

    move v0, v1

    :cond_1
    if-eq v2, v0, :cond_6

    iget-object v0, p0, Lto/v;->f:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lto/n0;

    if-eqz p3, :cond_3

    iget v2, v1, Lto/n0;->a:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {v1, p1}, Lto/n0;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1, p2}, Lto/n0;->b(Ljava/lang/Exception;)V

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Status XOR exception should be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-static {v0}, Luo/w;->c(Landroid/os/Handler;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lto/v;->f(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    return-void
.end method

.method public final h()V
    .locals 5

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    const/16 v2, 0xc

    iget-object v3, p0, Lto/v;->h:Lto/a;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    iget-wide v3, v0, Lto/f;->w:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final i(Z)Z
    .locals 3

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-static {v0}, Luo/w;->c(Landroid/os/Handler;)V

    iget-object v0, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    check-cast v0, Luo/c;

    invoke-virtual {v0}, Luo/c;->n()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lto/v;->k:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lto/v;->i:Lpg3/o;

    iget-object v2, v1, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, v1, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Timing out service connection."

    invoke-virtual {v0, p1}, Luo/c;->f(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lto/v;->h()V

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final j(Lcom/google/android/gms/common/a;)V
    .locals 5

    iget-object v0, p0, Lto/v;->j:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/o0;

    sget-object v3, Lcom/google/android/gms/common/a;->E:Lcom/google/android/gms/common/a;

    invoke-static {p1, v3}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    check-cast v3, Luo/c;

    invoke-virtual {v3}, Luo/c;->n()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v3, v3, Luo/c;->b:Lbd3/u;

    if-eqz v3, :cond_0

    const-string v3, "com.google.android.gms"

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Failed to connect when checking package"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    iget-object v4, p0, Lto/v;->h:Lto/a;

    invoke-virtual {v2, v4, p1, v3}, Lto/o0;->c(Lto/a;Lcom/google/android/gms/common/a;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final k(Lcom/google/android/gms/common/a;)V
    .locals 6

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-static {v0}, Luo/w;->c(Landroid/os/Handler;)V

    iget-object v0, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x19

    add-int/2addr v3, v4

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "onSignInFailed for "

    const-string v4, " with "

    invoke-static {v5, v3, v1, v4, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v0, Luo/c;

    invoke-virtual {v0, v1}, Luo/c;->f(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lto/v;->l(Lcom/google/android/gms/common/a;Ljava/lang/RuntimeException;)V

    return-void
.end method

.method public final l(Lcom/google/android/gms/common/a;Ljava/lang/RuntimeException;)V
    .locals 7

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    invoke-static {v1}, Luo/w;->c(Landroid/os/Handler;)V

    iget-object v1, p0, Lto/v;->m:Lto/i0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lto/i0;->o0()V

    :cond_0
    iget-object v1, p0, Lto/v;->r:Lto/f;

    iget-object v1, v1, Lto/f;->N:Ljp/d;

    invoke-static {v1}, Luo/w;->c(Landroid/os/Handler;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lto/v;->p:Lcom/google/android/gms/common/a;

    iget-object v2, v0, Lto/f;->G:Lp0/n0;

    iget-object v2, v2, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v2, Landroid/util/SparseIntArray;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2}, Landroid/util/SparseIntArray;->clear()V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1}, Lto/v;->j(Lcom/google/android/gms/common/a;)V

    iget-object v2, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    instance-of v2, v2, Lwo/c;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    iget v2, p1, Lcom/google/android/gms/common/a;->x:I

    const/16 v4, 0x18

    if-eq v2, v4, :cond_1

    iput-boolean v3, v0, Lto/f;->x:Z

    iget-object v2, v0, Lto/f;->N:Ljp/d;

    const/16 v4, 0x13

    invoke-virtual {v2, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    const-wide/32 v5, 0x493e0

    invoke-virtual {v2, v4, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_1
    iget v2, p1, Lcom/google/android/gms/common/a;->x:I

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    sget-object p1, Lto/f;->Q:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lto/v;->g(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_2
    const/16 v4, 0x19

    if-ne v2, v4, :cond_3

    iget-object p2, p0, Lto/v;->h:Lto/a;

    invoke-static {p2, p1}, Lto/f;->d(Lto/a;Lcom/google/android/gms/common/a;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lto/v;->g(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_3
    iget-object v2, p0, Lto/v;->f:Ljava/util/LinkedList;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    iput-object p1, p0, Lto/v;->p:Lcom/google/android/gms/common/a;

    return-void

    :cond_4
    if-eqz p2, :cond_5

    iget-object p1, v0, Lto/f;->N:Ljp/d;

    invoke-static {p1}, Luo/w;->c(Landroid/os/Handler;)V

    const/4 p1, 0x0

    invoke-virtual {p0, v1, p2, p1}, Lto/v;->f(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    return-void

    :cond_5
    iget-boolean p2, v0, Lto/f;->O:Z

    if-eqz p2, :cond_a

    iget-object p2, p0, Lto/v;->h:Lto/a;

    invoke-static {p2, p1}, Lto/f;->d(Lto/a;Lcom/google/android/gms/common/a;)Lcom/google/android/gms/common/api/Status;

    move-result-object v4

    invoke-virtual {p0, v4, v1, v3}, Lto/v;->f(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {p0, p1}, Lto/v;->c(Lcom/google/android/gms/common/a;)Z

    move-result v1

    if-nez v1, :cond_9

    iget v1, p0, Lto/v;->l:I

    iget-object v2, v0, Lto/f;->F:Lcom/google/android/gms/common/GoogleApiAvailability;

    iget-object v4, v0, Lto/f;->E:Landroid/content/Context;

    invoke-virtual {v2, v4, p1, v1}, Lcom/google/android/gms/common/GoogleApiAvailability;->zad(Landroid/content/Context;Lcom/google/android/gms/common/a;I)Z

    move-result v1

    if-nez v1, :cond_9

    iget v1, p1, Lcom/google/android/gms/common/a;->x:I

    const/16 v2, 0x12

    if-ne v1, v2, :cond_7

    iput-boolean v3, p0, Lto/v;->n:Z

    :cond_7
    iget-boolean v1, p0, Lto/v;->n:Z

    if-eqz v1, :cond_8

    iget-object p1, v0, Lto/f;->N:Ljp/d;

    const/16 v0, 0x9

    invoke-static {p1, v0, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    const-wide/16 v0, 0x1388

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_8
    invoke-static {p2, p1}, Lto/f;->d(Lto/a;Lcom/google/android/gms/common/a;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lto/v;->g(Lcom/google/android/gms/common/api/Status;)V

    :cond_9
    :goto_0
    return-void

    :cond_a
    iget-object p2, p0, Lto/v;->h:Lto/a;

    invoke-static {p2, p1}, Lto/f;->d(Lto/a;Lcom/google/android/gms/common/a;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lto/v;->g(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final m(Lto/n0;)V
    .locals 2

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-static {v0}, Luo/w;->c(Landroid/os/Handler;)V

    iget-object v0, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    check-cast v0, Luo/c;

    invoke-virtual {v0}, Luo/c;->n()Z

    move-result v0

    iget-object v1, p0, Lto/v;->f:Ljava/util/LinkedList;

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lto/v;->e(Lto/n0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lto/v;->h()V

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lto/v;->p:Lcom/google/android/gms/common/a;

    if-eqz p1, :cond_2

    iget v0, p1, Lcom/google/android/gms/common/a;->x:I

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/common/a;->y:Landroid/app/PendingIntent;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lto/v;->l(Lcom/google/android/gms/common/a;Ljava/lang/RuntimeException;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lto/v;->o()V

    return-void
.end method

.method public final n()V
    .locals 6

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-static {v0}, Luo/w;->c(Landroid/os/Handler;)V

    sget-object v0, Lto/f;->P:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lto/v;->g(Lcom/google/android/gms/common/api/Status;)V

    iget-object v1, p0, Lto/v;->i:Lpg3/o;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lpg3/o;->v0(Lcom/google/android/gms/common/api/Status;Z)V

    iget-object v0, p0, Lto/v;->k:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    new-array v1, v2, [Lto/j;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lto/j;

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    new-instance v4, Lto/l0;

    new-instance v5, Lcq/i;

    invoke-direct {v5}, Lcq/i;-><init>()V

    invoke-direct {v4, v3, v5}, Lto/l0;-><init>(Lto/j;Lcq/i;)V

    invoke-virtual {p0, v4}, Lto/v;->m(Lto/n0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/a;-><init>(I)V

    invoke-virtual {p0, v0}, Lto/v;->j(Lcom/google/android/gms/common/a;)V

    iget-object v0, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    check-cast v0, Luo/c;

    invoke-virtual {v0}, Luo/c;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lq30/u0;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0}, Lq30/u0;->F()V

    :cond_1
    return-void
.end method

.method public final o()V
    .locals 10

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    invoke-static {v1}, Luo/w;->c(Landroid/os/Handler;)V

    const-string v1, " is not available: "

    const-string v2, "The service for "

    iget-object v3, p0, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    move-object v4, v3

    check-cast v4, Luo/c;

    invoke-virtual {v4}, Luo/c;->n()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v4}, Luo/c;->o()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/16 v5, 0xa

    :try_start_0
    iget-object v6, v0, Lto/f;->G:Lp0/n0;

    iget-object v7, v0, Lto/f;->E:Landroid/content/Context;

    invoke-virtual {v6, v7, v3}, Lp0/n0;->o(Landroid/content/Context;Lcom/google/android/gms/common/api/d;)I

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    new-instance v0, Lcom/google/android/gms/common/a;

    invoke-direct {v0, v6, v7}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    const-string v4, "GoogleApiManager"

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/common/a;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, 0x23

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v8, v9

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v0, v7}, Lto/v;->l(Lcom/google/android/gms/common/a;Ljava/lang/RuntimeException;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    new-instance v1, Lcd3/g;

    iget-object v2, p0, Lto/v;->h:Lto/a;

    invoke-direct {v1, v0, v3, v2}, Lcd3/g;-><init>(Lto/f;Lcom/google/android/gms/common/api/d;Lto/a;)V

    invoke-interface {v3}, Lcom/google/android/gms/common/api/d;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lto/v;->m:Lto/i0;

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lto/i0;->n0(Lcd3/g;)V

    :cond_2
    :try_start_1
    iput-object v1, v4, Luo/c;->i:Luo/b;

    const/4 v0, 0x2

    invoke-virtual {v4, v0, v7}, Luo/c;->t(ILandroid/os/IInterface;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/common/a;

    invoke-direct {v1, v5}, Lcom/google/android/gms/common/a;-><init>(I)V

    invoke-virtual {p0, v1, v0}, Lto/v;->l(Lcom/google/android/gms/common/a;Ljava/lang/RuntimeException;)V

    return-void

    :goto_0
    new-instance v1, Lcom/google/android/gms/common/a;

    invoke-direct {v1, v5}, Lcom/google/android/gms/common/a;-><init>(I)V

    invoke-virtual {p0, v1, v0}, Lto/v;->l(Lcom/google/android/gms/common/a;Ljava/lang/RuntimeException;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final s()V
    .locals 3

    iget-object v0, p0, Lto/v;->r:Lto/f;

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v2, v1, :cond_0

    invoke-virtual {p0}, Lto/v;->a()V

    return-void

    :cond_0
    new-instance v1, Lbq/b;

    const/16 v2, 0x1a

    invoke-direct {v1, p0, v2}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
