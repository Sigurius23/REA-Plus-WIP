.class public final Le9/h;
.super Ll9/a;
.source "SourceFile"


# instance fields
.field public A:Lp9/k;

.field public B:Lz8/n;

.field public C:Landroidx/media3/exoplayer/dash/DashManifestStaleException;

.field public D:Landroid/os/Handler;

.field public E:Lu8/t;

.field public F:Landroid/net/Uri;

.field public final G:Landroid/net/Uri;

.field public H:Lf9/c;

.field public I:Z

.field public J:J

.field public K:J

.field public L:J

.field public M:I

.field public N:J

.field public O:I

.field public P:Lu8/x;

.field public final h:Z

.field public final i:Lz8/e;

.field public final j:Lab/h0;

.field public final k:Lg73/a;

.field public final l:Lg9/h;

.field public final m:Ljc/b;

.field public final n:La00/g;

.field public final o:J

.field public final p:J

.field public final q:Lg9/d;

.field public final r:Lp9/m;

.field public final s:Le9/d;

.field public final t:Ljava/lang/Object;

.field public final u:Landroid/util/SparseArray;

.field public final v:Le9/c;

.field public final w:Le9/c;

.field public final x:Le9/d;

.field public final y:Lp9/l;

.field public z:Lz8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.exoplayer.dash"

    invoke-static {v0}, Lu8/y;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lu8/x;Lz8/e;Lp9/m;Lab/h0;Lg73/a;Lg9/h;Ljc/b;JJ)V
    .locals 1

    invoke-direct {p0}, Ll9/a;-><init>()V

    iput-object p1, p0, Le9/h;->P:Lu8/x;

    iget-object v0, p1, Lu8/x;->c:Lu8/t;

    iput-object v0, p0, Le9/h;->E:Lu8/t;

    iget-object p1, p1, Lu8/x;->b:Lu8/u;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lu8/u;->a:Landroid/net/Uri;

    iput-object p1, p0, Le9/h;->F:Landroid/net/Uri;

    iput-object p1, p0, Le9/h;->G:Landroid/net/Uri;

    const/4 p1, 0x0

    iput-object p1, p0, Le9/h;->H:Lf9/c;

    iput-object p2, p0, Le9/h;->i:Lz8/e;

    iput-object p3, p0, Le9/h;->r:Lp9/m;

    iput-object p4, p0, Le9/h;->j:Lab/h0;

    iput-object p6, p0, Le9/h;->l:Lg9/h;

    iput-object p7, p0, Le9/h;->m:Ljc/b;

    iput-wide p8, p0, Le9/h;->o:J

    iput-wide p10, p0, Le9/h;->p:J

    iput-object p5, p0, Le9/h;->k:Lg73/a;

    new-instance p2, La00/g;

    const/16 p3, 0x9

    invoke-direct {p2, p3}, La00/g;-><init>(I)V

    iput-object p2, p0, Le9/h;->n:La00/g;

    const/4 p2, 0x0

    iput-boolean p2, p0, Le9/h;->h:Z

    iget-object p3, p0, Ll9/a;->c:Lg9/d;

    new-instance p4, Lg9/d;

    iget-object p3, p3, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p4, p3, p2, p1}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    iput-object p4, p0, Le9/h;->q:Lg9/d;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/h;->t:Ljava/lang/Object;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Le9/h;->u:Landroid/util/SparseArray;

    new-instance p1, Le9/d;

    invoke-direct {p1, p0}, Le9/d;-><init>(Le9/h;)V

    iput-object p1, p0, Le9/h;->x:Le9/d;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Le9/h;->N:J

    iput-wide p1, p0, Le9/h;->L:J

    new-instance p1, Le9/d;

    invoke-direct {p1, p0}, Le9/d;-><init>(Le9/h;)V

    iput-object p1, p0, Le9/h;->s:Le9/d;

    new-instance p1, Le9/d;

    invoke-direct {p1, p0}, Le9/d;-><init>(Le9/h;)V

    iput-object p1, p0, Le9/h;->y:Lp9/l;

    new-instance p1, Le9/c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Le9/c;-><init>(Le9/h;I)V

    iput-object p1, p0, Le9/h;->v:Le9/c;

    new-instance p1, Le9/c;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Le9/c;-><init>(Le9/h;I)V

    iput-object p1, p0, Le9/h;->w:Le9/c;

    return-void
.end method

.method public static s(Lf9/h;)Z
    .locals 5

    iget-object p0, p0, Lf9/h;->c:Ljava/util/List;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf9/a;

    iget v2, v2, Lf9/a;->b:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v4, 0x2

    if-ne v2, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v3

    :cond_2
    return v0
.end method


# virtual methods
.method public final a(Ll9/c0;Lko/o;J)Ll9/a0;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Ll9/c0;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget v3, v0, Le9/h;->O:I

    sub-int v8, v2, v3

    new-instance v14, Lg9/d;

    iget-object v2, v0, Ll9/a;->c:Lg9/d;

    iget-object v2, v2, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v3, 0x0

    invoke-direct {v14, v2, v3, v1}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    new-instance v12, Lg9/d;

    iget-object v2, v0, Ll9/a;->d:Lg9/d;

    iget-object v2, v2, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v12, v2, v3, v1}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    new-instance v4, Le9/b;

    iget v1, v0, Le9/h;->O:I

    add-int v5, v1, v8

    iget-object v6, v0, Le9/h;->H:Lf9/c;

    iget-object v10, v0, Le9/h;->B:Lz8/n;

    iget-wide v1, v0, Le9/h;->L:J

    iget-object v3, v0, Ll9/a;->g:Lc9/n;

    invoke-static {v3}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v7, v0, Le9/h;->n:La00/g;

    iget-object v9, v0, Le9/h;->j:Lab/h0;

    iget-object v11, v0, Le9/h;->l:Lg9/h;

    iget-object v13, v0, Le9/h;->m:Ljc/b;

    iget-object v15, v0, Le9/h;->y:Lp9/l;

    move-wide/from16 v16, v1

    iget-object v1, v0, Le9/h;->k:Lg73/a;

    iget-object v2, v0, Le9/h;->x:Le9/d;

    move-wide/from16 v18, v16

    move-object/from16 v17, v15

    move-wide/from16 v15, v18

    move-object/from16 v18, p2

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    invoke-direct/range {v4 .. v21}, Le9/b;-><init>(ILf9/c;La00/g;ILab/h0;Lz8/n;Lg9/h;Lg9/d;Ljc/b;Lg9/d;JLp9/l;Lko/o;Lg73/a;Le9/d;Lc9/n;)V

    iget-object v1, v0, Le9/h;->u:Landroid/util/SparseArray;

    invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object v4
.end method

.method public final declared-synchronized g()Lu8/x;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le9/h;->P:Lu8/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Le9/h;->y:Lp9/l;

    invoke-interface {v0}, Lp9/l;->c()V

    return-void
.end method

.method public final k(Lz8/n;)V
    .locals 2

    iput-object p1, p0, Le9/h;->B:Lz8/n;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, Ll9/a;->g:Lc9/n;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v1, p0, Le9/h;->l:Lg9/h;

    invoke-interface {v1, p1, v0}, Lg9/h;->b(Landroid/os/Looper;Lc9/n;)V

    invoke-interface {v1}, Lg9/h;->prepare()V

    iget-boolean p1, p0, Le9/h;->h:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Le9/h;->w(Z)V

    return-void

    :cond_0
    iget-object p1, p0, Le9/h;->i:Lz8/e;

    invoke-interface {p1}, Lz8/e;->createDataSource()Lz8/f;

    move-result-object p1

    iput-object p1, p0, Le9/h;->z:Lz8/f;

    new-instance p1, Lp9/k;

    const-string v0, "DashMediaSource"

    invoke-direct {p1, v0}, Lp9/k;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Le9/h;->A:Lp9/k;

    const/4 p1, 0x0

    invoke-static {p1}, Lx8/t;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Le9/h;->D:Landroid/os/Handler;

    invoke-virtual {p0}, Le9/h;->y()V

    return-void
.end method

.method public final m(Ll9/a0;)V
    .locals 5

    check-cast p1, Le9/b;

    iget-object v0, p1, Le9/b;->M:Le9/p;

    const/4 v1, 0x1

    iput-boolean v1, v0, Le9/p;->I:Z

    iget-object v0, v0, Le9/p;->z:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p1, Le9/b;->R:[Lm9/g;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4, p1}, Lm9/g;->C(Le9/b;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p1, Le9/b;->Q:Ll9/z;

    iget-object v0, p0, Le9/h;->u:Landroid/util/SparseArray;

    iget p1, p1, Le9/b;->w:I

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public final o()V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Le9/h;->I:Z

    const/4 v1, 0x0

    iput-object v1, p0, Le9/h;->z:Lz8/f;

    iget-object v2, p0, Le9/h;->A:Lp9/k;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lp9/k;->b(Lp9/j;)V

    iput-object v1, p0, Le9/h;->A:Lp9/k;

    :cond_0
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Le9/h;->J:J

    iput-wide v2, p0, Le9/h;->K:J

    iget-object v2, p0, Le9/h;->G:Landroid/net/Uri;

    iput-object v2, p0, Le9/h;->F:Landroid/net/Uri;

    iput-object v1, p0, Le9/h;->C:Landroidx/media3/exoplayer/dash/DashManifestStaleException;

    iget-object v2, p0, Le9/h;->D:Landroid/os/Handler;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Le9/h;->D:Landroid/os/Handler;

    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Le9/h;->L:J

    iput v0, p0, Le9/h;->M:I

    iput-wide v1, p0, Le9/h;->N:J

    iget-object v0, p0, Le9/h;->u:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    iget-object v0, p0, Le9/h;->n:La00/g;

    iget-object v1, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    iget-object v1, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Le9/h;->l:Lg9/h;

    invoke-interface {v0}, Lg9/h;->release()V

    return-void
.end method

.method public final declared-synchronized r(Lu8/x;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Le9/h;->P:Lu8/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final t()V
    .locals 5

    iget-object v0, p0, Le9/h;->A:Lp9/k;

    new-instance v1, Le9/d;

    invoke-direct {v1, p0}, Le9/d;-><init>(Le9/h;)V

    sget-object v2, Lq9/b;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-boolean v3, Lq9/b;->c:Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Le9/d;->a()V

    return-void

    :cond_0
    if-nez v0, :cond_1

    new-instance v0, Lp9/k;

    const-string v2, "SntpClient"

    invoke-direct {v0, v2}, Lp9/k;-><init>(Ljava/lang/String;)V

    :cond_1
    new-instance v2, Lng3/n;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lng3/n;-><init>(I)V

    new-instance v3, Le9/g;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Le9/g;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lp9/k;->d(Lp9/i;Lp9/g;I)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final u(Lp9/n;)V
    .locals 11

    new-instance v1, Ll9/t;

    iget-wide v2, p1, Lp9/n;->w:J

    iget-object v0, p1, Lp9/n;->z:Lz8/m;

    iget-object v0, v0, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Le9/h;->m:Ljc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p1, Lp9/n;->y:I

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v0, p0, Le9/h;->q:Lg9/d;

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v10}, Lg9/d;->c(Ll9/t;IILu8/p;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final v(Ljava/io/IOException;)V
    .locals 4

    const-string v0, "DashMediaSource"

    const-string v1, "Failed to resolve time offset."

    invoke-static {v0, v1, p1}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Le9/h;->L:J

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Le9/h;->w(Z)V

    return-void
.end method

.method public final w(Z)V
    .locals 43

    move-object/from16 v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget-object v0, v1, Le9/h;->u:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_9

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    iget v6, v1, Le9/h;->O:I

    if-lt v4, v6, :cond_8

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le9/b;

    iget-object v7, v1, Le9/h;->H:Lf9/c;

    iget v0, v1, Le9/h;->O:I

    sub-int/2addr v4, v0

    iput-object v7, v6, Le9/b;->U:Lf9/c;

    iput v4, v6, Le9/b;->V:I

    iget-object v0, v6, Le9/b;->M:Le9/p;

    iput-boolean v2, v0, Le9/p;->H:Z

    iput-object v7, v0, Le9/p;->F:Lf9/c;

    iget-object v8, v0, Le9/p;->E:Ljava/util/TreeMap;

    invoke-virtual {v8}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iget-object v11, v0, Le9/p;->F:Lf9/c;

    iget-wide v11, v11, Lf9/c;->h:J

    cmp-long v9, v9, v11

    if-gez v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_1
    iget-object v8, v6, Le9/b;->R:[Lm9/g;

    if-eqz v8, :cond_4

    array-length v9, v8

    move v10, v2

    :goto_2
    if-ge v10, v9, :cond_3

    aget-object v0, v8, v10

    iget-object v11, v0, Lm9/g;->E:Le9/l;

    iget-object v0, v11, Le9/l;->i:[Le9/j;

    :try_start_0
    iput-object v7, v11, Le9/l;->k:Lf9/c;

    iput v4, v11, Le9/l;->l:I

    invoke-virtual {v7, v4}, Lf9/c;->c(I)J

    move-result-wide v12

    invoke-virtual {v11}, Le9/l;->a()Ljava/util/ArrayList;

    move-result-object v14
    :try_end_0
    .catch Landroidx/media3/exoplayer/source/BehindLiveWindowException; {:try_start_0 .. :try_end_0} :catch_1

    move v15, v2

    const/16 v16, 0x1

    :goto_3
    :try_start_1
    array-length v5, v0

    if-ge v15, v5, :cond_2

    iget-object v5, v11, Le9/l;->j:Lo9/s;

    invoke-interface {v5, v15}, Lo9/s;->e(I)I

    move-result v5

    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf9/m;

    aget-object v2, v0, v15

    invoke-virtual {v2, v12, v13, v5}, Le9/j;->a(JLf9/m;)Le9/j;

    move-result-object v2

    aput-object v2, v0, v15
    :try_end_1
    .catch Landroidx/media3/exoplayer/source/BehindLiveWindowException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v15, v15, 0x1

    const/4 v2, 0x0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    const/16 v16, 0x1

    :goto_4
    iput-object v0, v11, Le9/l;->m:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    :cond_2
    add-int/lit8 v10, v10, 0x1

    const/4 v2, 0x0

    goto :goto_2

    :cond_3
    const/16 v16, 0x1

    iget-object v0, v6, Le9/b;->Q:Ll9/z;

    invoke-interface {v0, v6}, Ll9/a1;->b(Ll9/b1;)V

    goto :goto_5

    :cond_4
    const/16 v16, 0x1

    :goto_5
    invoke-virtual {v7, v4}, Lf9/c;->a(I)Lf9/h;

    move-result-object v0

    iget-object v0, v0, Lf9/h;->d:Ljava/util/List;

    iput-object v0, v6, Le9/b;->W:Ljava/util/List;

    iget-object v0, v6, Le9/b;->S:[Le9/m;

    array-length v2, v0

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v2, :cond_8

    aget-object v8, v0, v5

    iget-object v9, v6, Le9/b;->W:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lf9/g;

    invoke-virtual {v10}, Lf9/g;->a()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v8, Le9/m;->E:Lf9/g;

    invoke-virtual {v12}, Lf9/g;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    iget-object v9, v7, Lf9/c;->m:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    iget-boolean v11, v7, Lf9/c;->d:Z

    if-eqz v11, :cond_6

    if-ne v4, v9, :cond_6

    move/from16 v9, v16

    goto :goto_7

    :cond_6
    const/4 v9, 0x0

    :goto_7
    invoke-virtual {v8, v10, v9}, Le9/m;->a(Lf9/g;Z)V

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_8
    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_9
    const/16 v16, 0x1

    iget-object v0, v1, Le9/h;->H:Lf9/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lf9/c;->a(I)Lf9/h;

    move-result-object v0

    iget-object v2, v1, Le9/h;->H:Lf9/c;

    iget-object v2, v2, Lf9/c;->m:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    iget-object v3, v1, Le9/h;->H:Lf9/c;

    invoke-virtual {v3, v2}, Lf9/c;->a(I)Lf9/h;

    move-result-object v3

    iget-object v4, v1, Le9/h;->H:Lf9/c;

    invoke-virtual {v4, v2}, Lf9/c;->c(I)J

    move-result-wide v4

    iget-wide v6, v1, Le9/h;->L:J

    invoke-static {v6, v7}, Lx8/t;->v(J)J

    move-result-wide v6

    invoke-static {v6, v7}, Lx8/t;->J(J)J

    move-result-wide v6

    iget-object v2, v1, Le9/h;->H:Lf9/c;

    const/4 v8, 0x0

    invoke-virtual {v2, v8}, Lf9/c;->c(I)J

    move-result-wide v9

    iget-wide v11, v0, Lf9/h;->b:J

    iget-object v2, v0, Lf9/h;->c:Ljava/util/List;

    invoke-static {v11, v12}, Lx8/t;->J(J)J

    move-result-wide v11

    invoke-static {v0}, Le9/h;->s(Lf9/h;)Z

    move-result v8

    move/from16 v18, v8

    move-wide v14, v11

    const/4 v13, 0x0

    :goto_8
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    move-wide/from16 v19, v11

    if-ge v13, v8, :cond_10

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf9/a;

    const-wide/16 v22, 0x0

    iget-object v11, v8, Lf9/a;->c:Ljava/util/List;

    iget v8, v8, Lf9/a;->b:I

    move/from16 v12, v16

    if-eq v8, v12, :cond_a

    const/4 v12, 0x2

    if-eq v8, v12, :cond_a

    const/4 v8, 0x1

    goto :goto_9

    :cond_a
    const/4 v8, 0x0

    :goto_9
    if-eqz v18, :cond_b

    if-nez v8, :cond_f

    :cond_b
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_b

    :cond_c
    const/4 v8, 0x0

    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lf9/m;

    invoke-virtual {v11}, Lf9/m;->c()Le9/i;

    move-result-object v8

    if-nez v8, :cond_d

    goto :goto_a

    :cond_d
    invoke-interface {v8, v9, v10, v6, v7}, Le9/i;->D(JJ)J

    move-result-wide v11

    cmp-long v11, v11, v22

    if-nez v11, :cond_e

    :goto_a
    move-wide/from16 v11, v19

    goto :goto_c

    :cond_e
    invoke-interface {v8, v9, v10, v6, v7}, Le9/i;->r(JJ)J

    move-result-wide v11

    invoke-interface {v8, v11, v12}, Le9/i;->a(J)J

    move-result-wide v11

    add-long v11, v11, v19

    invoke-static {v14, v15, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    :cond_f
    :goto_b
    add-int/lit8 v13, v13, 0x1

    move-wide/from16 v11, v19

    const/16 v16, 0x1

    goto :goto_8

    :cond_10
    const-wide/16 v22, 0x0

    move-wide v11, v14

    :goto_c
    iget-wide v8, v3, Lf9/h;->b:J

    iget-object v2, v3, Lf9/h;->c:Ljava/util/List;

    invoke-static {v8, v9}, Lx8/t;->J(J)J

    move-result-wide v8

    invoke-static {v3}, Le9/h;->s(Lf9/h;)Z

    move-result v3

    const-wide v13, 0x7fffffffffffffffL

    const/4 v10, 0x0

    :goto_d
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v15

    if-ge v10, v15, :cond_18

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lf9/a;

    move/from16 v18, v3

    iget-object v3, v15, Lf9/a;->c:Ljava/util/List;

    iget v15, v15, Lf9/a;->b:I

    move-wide/from16 v19, v8

    const/4 v8, 0x1

    if-eq v15, v8, :cond_11

    const/4 v8, 0x2

    if-eq v15, v8, :cond_12

    const/4 v9, 0x1

    goto :goto_e

    :cond_11
    const/4 v8, 0x2

    :cond_12
    const/4 v9, 0x0

    :goto_e
    if-eqz v18, :cond_13

    if-nez v9, :cond_17

    :cond_13
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_14

    goto :goto_f

    :cond_14
    const/4 v9, 0x0

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf9/m;

    invoke-virtual {v3}, Lf9/m;->c()Le9/i;

    move-result-object v3

    if-nez v3, :cond_15

    add-long v8, v19, v4

    goto :goto_10

    :cond_15
    invoke-interface {v3, v4, v5, v6, v7}, Le9/i;->D(JJ)J

    move-result-wide v24

    cmp-long v9, v24, v22

    if-nez v9, :cond_16

    move-wide/from16 v8, v19

    goto :goto_10

    :cond_16
    invoke-interface {v3, v4, v5, v6, v7}, Le9/i;->r(JJ)J

    move-result-wide v26

    add-long v26, v26, v24

    const-wide/16 v24, 0x1

    sub-long v8, v26, v24

    invoke-interface {v3, v8, v9}, Le9/i;->a(J)J

    move-result-wide v24

    add-long v24, v24, v19

    invoke-interface {v3, v8, v9, v4, v5}, Le9/i;->q(JJ)J

    move-result-wide v8

    add-long v8, v8, v24

    invoke-static {v13, v14, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    move-wide v13, v8

    :cond_17
    :goto_f
    add-int/lit8 v10, v10, 0x1

    move/from16 v3, v18

    move-wide/from16 v8, v19

    goto :goto_d

    :cond_18
    move-wide v8, v13

    :goto_10
    iget-object v3, v1, Le9/h;->H:Lf9/c;

    iget-boolean v3, v3, Lf9/c;->d:Z

    if-eqz v3, :cond_1b

    const/4 v3, 0x0

    :goto_11
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_1a

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf9/a;

    iget-object v4, v4, Lf9/a;->c:Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf9/m;

    invoke-virtual {v4}, Lf9/m;->c()Le9/i;

    move-result-object v4

    if-eqz v4, :cond_1b

    invoke-interface {v4}, Le9/i;->A()Z

    move-result v4

    if-eqz v4, :cond_19

    goto :goto_12

    :cond_19
    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    :cond_1a
    const/4 v2, 0x1

    goto :goto_13

    :cond_1b
    :goto_12
    const/4 v2, 0x0

    :goto_13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_1c

    iget-object v5, v1, Le9/h;->H:Lf9/c;

    iget-wide v13, v5, Lf9/c;->f:J

    cmp-long v5, v13, v3

    if-eqz v5, :cond_1c

    invoke-static {v13, v14}, Lx8/t;->J(J)J

    move-result-wide v13

    sub-long v13, v8, v13

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    :cond_1c
    sub-long v34, v8, v11

    iget-object v5, v1, Le9/h;->H:Lf9/c;

    iget-boolean v8, v5, Lf9/c;->d:Z

    if-eqz v8, :cond_32

    iget-wide v8, v5, Lf9/c;->a:J

    cmp-long v5, v8, v3

    if-eqz v5, :cond_1d

    const/4 v5, 0x1

    goto :goto_14

    :cond_1d
    const/4 v5, 0x0

    :goto_14
    invoke-static {v5}, Lva3/g;->i(Z)V

    iget-object v5, v1, Le9/h;->H:Lf9/c;

    iget-wide v8, v5, Lf9/c;->a:J

    invoke-static {v8, v9}, Lx8/t;->J(J)J

    move-result-wide v8

    sub-long/2addr v6, v8

    sub-long/2addr v6, v11

    invoke-virtual {v1}, Le9/h;->g()Lu8/x;

    move-result-object v5

    iget-object v5, v5, Lu8/x;->c:Lu8/t;

    invoke-static {v6, v7}, Lx8/t;->U(J)J

    move-result-wide v8

    iget-wide v13, v5, Lu8/t;->c:J

    cmp-long v10, v13, v3

    if-eqz v10, :cond_1e

    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    goto :goto_15

    :cond_1e
    iget-object v10, v1, Le9/h;->H:Lf9/c;

    iget-object v10, v10, Lf9/c;->j:Lf9/t;

    if-eqz v10, :cond_1f

    iget-wide v13, v10, Lf9/t;->c:J

    cmp-long v10, v13, v3

    if-eqz v10, :cond_1f

    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    goto :goto_15

    :cond_1f
    move-wide v13, v8

    :goto_15
    sub-long v18, v6, v34

    invoke-static/range {v18 .. v19}, Lx8/t;->U(J)J

    move-result-wide v18

    cmp-long v10, v18, v22

    if-gez v10, :cond_20

    cmp-long v10, v13, v22

    if-lez v10, :cond_20

    move-wide/from16 v18, v22

    :cond_20
    iget-object v10, v1, Le9/h;->H:Lf9/c;

    move-wide/from16 v20, v3

    iget-wide v3, v10, Lf9/c;->c:J

    cmp-long v10, v3, v20

    if-eqz v10, :cond_21

    add-long v3, v18, v3

    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v18

    :cond_21
    move-wide/from16 v26, v18

    iget-wide v3, v5, Lu8/t;->b:J

    cmp-long v10, v3, v20

    if-eqz v10, :cond_23

    move-wide/from16 v24, v3

    move-wide/from16 v28, v8

    invoke-static/range {v24 .. v29}, Lx8/t;->h(JJJ)J

    move-result-wide v26

    :cond_22
    :goto_16
    move-wide/from16 v30, v26

    goto :goto_17

    :cond_23
    move-wide/from16 v28, v8

    iget-object v3, v1, Le9/h;->H:Lf9/c;

    iget-object v3, v3, Lf9/c;->j:Lf9/t;

    if-eqz v3, :cond_22

    iget-wide v3, v3, Lf9/t;->b:J

    cmp-long v8, v3, v20

    if-eqz v8, :cond_22

    move-wide/from16 v24, v3

    invoke-static/range {v24 .. v29}, Lx8/t;->h(JJJ)J

    move-result-wide v26

    goto :goto_16

    :goto_17
    cmp-long v3, v30, v13

    if-lez v3, :cond_24

    move-wide/from16 v32, v30

    goto :goto_18

    :cond_24
    move-wide/from16 v32, v13

    :goto_18
    iget-object v3, v1, Le9/h;->E:Lu8/t;

    iget-wide v3, v3, Lu8/t;->a:J

    cmp-long v8, v3, v20

    if-eqz v8, :cond_25

    goto :goto_19

    :cond_25
    iget-object v3, v1, Le9/h;->H:Lf9/c;

    iget-object v4, v3, Lf9/c;->j:Lf9/t;

    if-eqz v4, :cond_26

    iget-wide v8, v4, Lf9/t;->a:J

    cmp-long v4, v8, v20

    if-eqz v4, :cond_26

    move-wide v3, v8

    goto :goto_19

    :cond_26
    iget-wide v3, v3, Lf9/c;->g:J

    cmp-long v8, v3, v20

    if-eqz v8, :cond_27

    goto :goto_19

    :cond_27
    iget-wide v3, v1, Le9/h;->o:J

    :goto_19
    cmp-long v8, v3, v30

    if-gez v8, :cond_28

    move-wide/from16 v3, v30

    :cond_28
    cmp-long v8, v3, v32

    const-wide/16 v9, 0x2

    iget-wide v13, v1, Le9/h;->p:J

    if-lez v8, :cond_29

    div-long v3, v34, v9

    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    sub-long v3, v6, v3

    invoke-static {v3, v4}, Lx8/t;->U(J)J

    move-result-wide v28

    invoke-static/range {v28 .. v33}, Lx8/t;->h(JJJ)J

    move-result-wide v3

    move-wide/from16 v24, v3

    move-wide/from16 v18, v9

    move-wide/from16 v9, v30

    move-wide/from16 v41, v24

    move-wide/from16 v24, v6

    move-wide/from16 v6, v41

    :goto_1a
    move v8, v2

    move-wide/from16 v2, v32

    goto :goto_1b

    :cond_29
    move-wide/from16 v18, v9

    move-wide/from16 v9, v30

    move-wide/from16 v30, v3

    move-wide/from16 v24, v6

    move-wide/from16 v6, v30

    goto :goto_1a

    :goto_1b
    iget v4, v5, Lu8/t;->d:F

    const v15, -0x800001

    cmpl-float v26, v4, v15

    if-eqz v26, :cond_2a

    goto :goto_1c

    :cond_2a
    iget-object v4, v1, Le9/h;->H:Lf9/c;

    iget-object v4, v4, Lf9/c;->j:Lf9/t;

    if-eqz v4, :cond_2b

    iget v4, v4, Lf9/t;->d:F

    goto :goto_1c

    :cond_2b
    move v4, v15

    :goto_1c
    iget v5, v5, Lu8/t;->e:F

    cmpl-float v26, v5, v15

    if-eqz v26, :cond_2c

    goto :goto_1d

    :cond_2c
    iget-object v5, v1, Le9/h;->H:Lf9/c;

    iget-object v5, v5, Lf9/c;->j:Lf9/t;

    if-eqz v5, :cond_2d

    iget v5, v5, Lf9/t;->e:F

    goto :goto_1d

    :cond_2d
    move v5, v15

    :goto_1d
    cmpl-float v26, v4, v15

    if-nez v26, :cond_2f

    cmpl-float v15, v5, v15

    if-nez v15, :cond_2f

    iget-object v15, v1, Le9/h;->H:Lf9/c;

    iget-object v15, v15, Lf9/c;->j:Lf9/t;

    if-eqz v15, :cond_2e

    move/from16 v26, v4

    move/from16 v27, v5

    iget-wide v4, v15, Lf9/t;->a:J

    cmp-long v4, v4, v20

    if-nez v4, :cond_30

    :cond_2e
    const/high16 v4, 0x3f800000    # 1.0f

    move v5, v4

    goto :goto_1e

    :cond_2f
    move/from16 v26, v4

    move/from16 v27, v5

    :cond_30
    move/from16 v4, v26

    move/from16 v5, v27

    :goto_1e
    new-instance v15, Lf9/t;

    invoke-direct {v15}, Lf9/t;-><init>()V

    iput-wide v6, v15, Lf9/t;->a:J

    iput-wide v9, v15, Lf9/t;->b:J

    iput-wide v2, v15, Lf9/t;->c:J

    iput v4, v15, Lf9/t;->d:F

    iput v5, v15, Lf9/t;->e:F

    new-instance v2, Lu8/t;

    invoke-direct {v2, v15}, Lu8/t;-><init>(Lf9/t;)V

    iput-object v2, v1, Le9/h;->E:Lu8/t;

    iget-object v2, v1, Le9/h;->H:Lf9/c;

    iget-wide v2, v2, Lf9/c;->a:J

    invoke-static {v11, v12}, Lx8/t;->U(J)J

    move-result-wide v4

    add-long/2addr v4, v2

    iget-object v2, v1, Le9/h;->E:Lu8/t;

    iget-wide v2, v2, Lu8/t;->a:J

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v2

    sub-long v6, v24, v2

    div-long v2, v34, v18

    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    cmp-long v9, v6, v2

    if-gez v9, :cond_31

    move-wide/from16 v36, v2

    move-wide/from16 v27, v4

    goto :goto_1f

    :cond_31
    move-wide/from16 v27, v4

    move-wide/from16 v36, v6

    goto :goto_1f

    :cond_32
    move v8, v2

    move-wide/from16 v20, v3

    move-wide/from16 v27, v20

    move-wide/from16 v36, v22

    :goto_1f
    iget-wide v2, v0, Lf9/h;->b:J

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v2

    sub-long v32, v11, v2

    new-instance v24, Le9/e;

    iget-object v0, v1, Le9/h;->H:Lf9/c;

    iget-wide v2, v0, Lf9/c;->a:J

    iget-wide v4, v1, Le9/h;->L:J

    iget v6, v1, Le9/h;->O:I

    invoke-virtual {v1}, Le9/h;->g()Lu8/x;

    move-result-object v39

    iget-object v7, v1, Le9/h;->H:Lf9/c;

    iget-boolean v7, v7, Lf9/c;->d:Z

    if-eqz v7, :cond_33

    iget-object v7, v1, Le9/h;->E:Lu8/t;

    :goto_20
    move-object/from16 v38, v0

    move-wide/from16 v25, v2

    move-wide/from16 v29, v4

    move/from16 v31, v6

    move-object/from16 v40, v7

    goto :goto_21

    :cond_33
    const/4 v7, 0x0

    goto :goto_20

    :goto_21
    invoke-direct/range {v24 .. v40}, Le9/e;-><init>(JJJIJJJLf9/c;Lu8/x;Lu8/t;)V

    move-object/from16 v0, v24

    invoke-virtual {v1, v0}, Ll9/a;->l(Lu8/o0;)V

    iget-boolean v0, v1, Le9/h;->h:Z

    if-nez v0, :cond_3d

    iget-object v0, v1, Le9/h;->D:Landroid/os/Handler;

    iget-object v2, v1, Le9/h;->w:Le9/c;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    if-eqz v8, :cond_3a

    iget-object v0, v1, Le9/h;->D:Landroid/os/Handler;

    iget-object v3, v1, Le9/h;->H:Lf9/c;

    iget-wide v4, v1, Le9/h;->L:J

    invoke-static {v4, v5}, Lx8/t;->v(J)J

    move-result-wide v4

    iget-object v6, v3, Lf9/c;->m:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    const/16 v16, 0x1

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v3, v6}, Lf9/c;->a(I)Lf9/h;

    move-result-object v7

    iget-wide v8, v7, Lf9/h;->b:J

    iget-object v7, v7, Lf9/h;->c:Ljava/util/List;

    invoke-static {v8, v9}, Lx8/t;->J(J)J

    move-result-wide v8

    invoke-virtual {v3, v6}, Lf9/c;->c(I)J

    move-result-wide v10

    invoke-static {v4, v5}, Lx8/t;->J(J)J

    move-result-wide v4

    iget-wide v12, v3, Lf9/c;->a:J

    invoke-static {v12, v13}, Lx8/t;->J(J)J

    move-result-wide v12

    iget-wide v14, v3, Lf9/c;->e:J

    invoke-static {v14, v15}, Lx8/t;->J(J)J

    move-result-wide v14

    cmp-long v3, v14, v20

    const-wide/32 v18, 0x4c4b40

    if-eqz v3, :cond_34

    cmp-long v3, v14, v18

    if-gez v3, :cond_34

    goto :goto_22

    :cond_34
    move-wide/from16 v14, v18

    :goto_22
    const/4 v3, 0x0

    :goto_23
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_39

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf9/a;

    iget-object v6, v6, Lf9/a;->c:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_35

    move/from16 v16, v3

    const/4 v3, 0x0

    goto :goto_24

    :cond_35
    move/from16 v16, v3

    const/4 v3, 0x0

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf9/m;

    invoke-virtual {v6}, Lf9/m;->c()Le9/i;

    move-result-object v6

    if-eqz v6, :cond_38

    add-long v17, v12, v8

    invoke-interface {v6, v10, v11, v4, v5}, Le9/i;->s(JJ)J

    move-result-wide v24

    add-long v24, v24, v17

    sub-long v24, v24, v4

    cmp-long v6, v24, v22

    if-gtz v6, :cond_36

    goto :goto_24

    :cond_36
    const-wide/32 v17, 0x186a0

    sub-long v26, v14, v17

    cmp-long v6, v24, v26

    if-ltz v6, :cond_37

    cmp-long v6, v24, v14

    if-lez v6, :cond_38

    add-long v17, v14, v17

    cmp-long v6, v24, v17

    if-gez v6, :cond_38

    :cond_37
    move-wide/from16 v14, v24

    :cond_38
    :goto_24
    add-int/lit8 v6, v16, 0x1

    move v3, v6

    goto :goto_23

    :cond_39
    const-wide/16 v3, 0x3e8

    sget-object v5, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {v14, v15, v3, v4, v5}, Luf/c0;->J(JJLjava/math/RoundingMode;)J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_3a
    iget-boolean v0, v1, Le9/h;->I:Z

    if-eqz v0, :cond_3b

    invoke-virtual {v1}, Le9/h;->y()V

    goto :goto_25

    :cond_3b
    if-eqz p1, :cond_3d

    iget-object v0, v1, Le9/h;->H:Lf9/c;

    iget-boolean v2, v0, Lf9/c;->d:Z

    if-eqz v2, :cond_3d

    iget-wide v2, v0, Lf9/c;->e:J

    cmp-long v0, v2, v20

    if-eqz v0, :cond_3d

    cmp-long v0, v2, v22

    if-nez v0, :cond_3c

    const-wide/16 v2, 0x1388

    :cond_3c
    iget-wide v4, v1, Le9/h;->J:J

    add-long/2addr v4, v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v4, v2

    move-wide/from16 v2, v22

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iget-object v0, v1, Le9/h;->D:Landroid/os/Handler;

    iget-object v4, v1, Le9/h;->v:Le9/c;

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_3d
    :goto_25
    return-void
.end method

.method public final x(Lf9/u;Lp9/m;)V
    .locals 13

    new-instance v0, Lp9/n;

    iget-object v1, p0, Le9/h;->z:Lz8/f;

    iget-object p1, p1, Lf9/u;->c:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string p1, "The uri must be set."

    invoke-static {v3, p1}, Lva3/g;->k(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lz8/g;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-direct/range {v2 .. v12}, Lz8/g;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    const/4 p1, 0x5

    invoke-direct {v0, v1, v2, p1, p2}, Lp9/n;-><init>(Lz8/f;Lz8/g;ILp9/m;)V

    new-instance p1, Le9/g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Le9/g;-><init>(Ljava/lang/Object;I)V

    const/4 p2, 0x1

    iget-object v1, p0, Le9/h;->A:Lp9/k;

    invoke-virtual {v1, v0, p1, p2}, Lp9/k;->d(Lp9/i;Lp9/g;I)V

    return-void
.end method

.method public final y()V
    .locals 13

    iget-object v0, p0, Le9/h;->D:Landroid/os/Handler;

    iget-object v1, p0, Le9/h;->v:Le9/c;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Le9/h;->A:Lp9/k;

    iget-object v1, v0, Lp9/k;->y:Ljava/io/IOException;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lp9/k;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Le9/h;->I:Z

    return-void

    :cond_1
    iget-object v1, p0, Le9/h;->t:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v3, p0, Le9/h;->F:Landroid/net/Uri;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Le9/h;->I:Z

    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v0, "The uri must be set."

    invoke-static {v3, v0}, Lva3/g;->k(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lz8/g;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-direct/range {v2 .. v12}, Lz8/g;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    new-instance v0, Lp9/n;

    iget-object v1, p0, Le9/h;->z:Lz8/f;

    iget-object v3, p0, Le9/h;->r:Lp9/m;

    const/4 v4, 0x4

    invoke-direct {v0, v1, v2, v4, v3}, Lp9/n;-><init>(Lz8/f;Lz8/g;ILp9/m;)V

    iget-object v1, p0, Le9/h;->s:Le9/d;

    iget-object v2, p0, Le9/h;->m:Ljc/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x3

    iget-object v3, p0, Le9/h;->A:Lp9/k;

    invoke-virtual {v3, v0, v1, v2}, Lp9/k;->d(Lp9/i;Lp9/g;I)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
