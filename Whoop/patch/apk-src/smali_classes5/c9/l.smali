.class public final Lc9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/b;


# instance fields
.field public A:I

.field public B:Z

.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lc9/j;

.field public final d:Landroid/media/metrics/PlaybackSession;

.field public final e:J

.field public final f:Lu8/n0;

.field public final g:Lu8/m0;

.field public final h:Ljava/util/HashMap;

.field public final i:Ljava/util/HashMap;

.field public j:Ljava/lang/String;

.field public k:Landroid/media/metrics/PlaybackMetrics$Builder;

.field public l:I

.field public m:I

.field public n:I

.field public o:Landroidx/media3/common/PlaybackException;

.field public p:Lab/h0;

.field public q:Lab/h0;

.field public r:Lab/h0;

.field public s:Lu8/p;

.field public t:Lu8/p;

.field public u:Lu8/p;

.field public v:Z

.field public w:I

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lc9/l;->a:Landroid/content/Context;

    iput-object p2, p0, Lc9/l;->d:Landroid/media/metrics/PlaybackSession;

    invoke-static {}, Lx8/a;->i()Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Lc9/l;->b:Ljava/util/concurrent/Executor;

    new-instance p1, Lu8/n0;

    invoke-direct {p1}, Lu8/n0;-><init>()V

    iput-object p1, p0, Lc9/l;->f:Lu8/n0;

    new-instance p1, Lu8/m0;

    invoke-direct {p1}, Lu8/m0;-><init>()V

    iput-object p1, p0, Lc9/l;->g:Lu8/m0;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lc9/l;->i:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lc9/l;->h:Ljava/util/HashMap;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lc9/l;->e:J

    const/4 p1, 0x0

    iput p1, p0, Lc9/l;->m:I

    iput p1, p0, Lc9/l;->n:I

    new-instance p1, Lc9/j;

    invoke-direct {p1}, Lc9/j;-><init>()V

    iput-object p1, p0, Lc9/l;->c:Lc9/j;

    iput-object p0, p1, Lc9/j;->d:Lc9/l;

    return-void
.end method

.method public static synthetic a(Lc9/l;Landroid/media/metrics/PlaybackErrorEvent;)V
    .locals 0

    iget-object p0, p0, Lc9/l;->d:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportPlaybackErrorEvent(Landroid/media/metrics/PlaybackErrorEvent;)V

    return-void
.end method

.method public static synthetic b(Lc9/l;Landroid/media/metrics/PlaybackMetrics;)V
    .locals 0

    iget-object p0, p0, Lc9/l;->d:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportPlaybackMetrics(Landroid/media/metrics/PlaybackMetrics;)V

    return-void
.end method

.method public static synthetic c(Lc9/l;Landroid/media/metrics/NetworkEvent;)V
    .locals 0

    iget-object p0, p0, Lc9/l;->d:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportNetworkEvent(Landroid/media/metrics/NetworkEvent;)V

    return-void
.end method

.method public static synthetic d(Lc9/l;Landroid/media/metrics/TrackChangeEvent;)V
    .locals 0

    iget-object p0, p0, Lc9/l;->d:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportTrackChangeEvent(Landroid/media/metrics/TrackChangeEvent;)V

    return-void
.end method

.method public static synthetic e(Lc9/l;Landroid/media/metrics/PlaybackStateEvent;)V
    .locals 0

    iget-object p0, p0, Lc9/l;->d:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportPlaybackStateEvent(Landroid/media/metrics/PlaybackStateEvent;)V

    return-void
.end method

.method public static g(Landroid/content/Context;)Lc9/l;
    .locals 2

    const-string v0, "media_metrics"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/metrics/MediaMetricsManager;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v1, Lc9/l;

    invoke-virtual {v0}, Landroid/media/metrics/MediaMetricsManager;->createPlaybackSession()Landroid/media/metrics/PlaybackSession;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lc9/l;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    return-object v1
.end method


# virtual methods
.method public final f(Lab/h0;)Z
    .locals 2

    if-eqz p1, :cond_0

    iget-object p1, p1, Lab/h0;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lc9/l;->c:Lc9/j;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lc9/j;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final h()V
    .locals 7

    iget-object v0, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Lc9/l;->B:Z

    if-eqz v2, :cond_3

    iget v2, p0, Lc9/l;->A:I

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setAudioUnderrunCount(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Lc9/l;->y:I

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setVideoFramesDropped(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Lc9/l;->z:I

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setVideoFramesPlayed(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lc9/l;->h:Ljava/util/HashMap;

    iget-object v2, p0, Lc9/l;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iget-object v2, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    const-wide/16 v3, 0x0

    if-nez v0, :cond_0

    move-wide v5, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_0
    invoke-virtual {v2, v5, v6}, Landroid/media/metrics/PlaybackMetrics$Builder;->setNetworkTransferDurationMillis(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lc9/l;->i:Ljava/util/HashMap;

    iget-object v2, p0, Lc9/l;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iget-object v2, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez v0, :cond_1

    move-wide v5, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_1
    invoke-virtual {v2, v5, v6}, Landroid/media/metrics/PlaybackMetrics$Builder;->setNetworkBytesRead(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v2, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    invoke-virtual {v2, v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->setStreamSource(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-virtual {v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->build()Landroid/media/metrics/PlaybackMetrics;

    move-result-object v0

    new-instance v2, La8/c;

    const/16 v3, 0x8

    invoke-direct {v2, v3, p0, v0}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lc9/l;->b:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    iput-object v0, p0, Lc9/l;->j:Ljava/lang/String;

    iput v1, p0, Lc9/l;->A:I

    iput v1, p0, Lc9/l;->y:I

    iput v1, p0, Lc9/l;->z:I

    iput-object v0, p0, Lc9/l;->s:Lu8/p;

    iput-object v0, p0, Lc9/l;->t:Lu8/p;

    iput-object v0, p0, Lc9/l;->u:Lu8/p;

    iput-boolean v1, p0, Lc9/l;->B:Z

    return-void
.end method

.method public final i()Landroid/media/metrics/LogSessionId;
    .locals 1

    iget-object v0, p0, Lc9/l;->d:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {v0}, Landroid/media/metrics/PlaybackSession;->getSessionId()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    return-object v0
.end method

.method public final j(Lu8/o0;Ll9/c0;)V
    .locals 8

    iget-object v0, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result p2

    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lc9/l;->g:Lu8/m0;

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v2}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    iget p2, v1, Lu8/m0;->c:I

    iget-object v1, p0, Lc9/l;->f:Lu8/n0;

    invoke-virtual {p1, p2, v1}, Lu8/o0;->n(ILu8/n0;)V

    iget-object p1, v1, Lu8/n0;->c:Lu8/x;

    iget-object p1, p1, Lu8/x;->b:Lu8/u;

    const/4 p2, 0x2

    const/4 v3, 0x1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p1, Lu8/u;->a:Landroid/net/Uri;

    iget-object p1, p1, Lu8/u;->b:Ljava/lang/String;

    invoke-static {v2, p1}, Lx8/t;->D(Landroid/net/Uri;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_5

    if-eq p1, v3, :cond_4

    if-eq p1, p2, :cond_3

    move v2, v3

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    goto :goto_1

    :cond_4
    const/4 v2, 0x5

    goto :goto_1

    :cond_5
    const/4 v2, 0x3

    :goto_1
    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setStreamType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-wide v4, v1, Lu8/n0;->m:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v4, v6

    if-eqz p1, :cond_6

    iget-boolean p1, v1, Lu8/n0;->k:Z

    if-nez p1, :cond_6

    iget-boolean p1, v1, Lu8/n0;->i:Z

    if-nez p1, :cond_6

    invoke-virtual {v1}, Lu8/n0;->a()Z

    move-result p1

    if-nez p1, :cond_6

    iget-wide v4, v1, Lu8/n0;->m:J

    invoke-static {v4, v5}, Lx8/t;->U(J)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Landroid/media/metrics/PlaybackMetrics$Builder;->setMediaDurationMillis(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    :cond_6
    invoke-virtual {v1}, Lu8/n0;->a()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_2

    :cond_7
    move p2, v3

    :goto_2
    invoke-virtual {v0, p2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlaybackType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iput-boolean v3, p0, Lc9/l;->B:Z

    return-void
.end method

.method public final k(Lu8/j0;Lqg3/d;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget-object v2, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v2, Lu8/n;

    iget-object v2, v2, Lu8/n;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_34

    :cond_0
    const/4 v7, 0x0

    move v2, v7

    :goto_0
    iget-object v3, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v3, Lu8/n;

    iget-object v3, v3, Lu8/n;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v3}, Landroid/util/SparseBooleanArray;->size()I

    move-result v3

    const/16 v8, 0xb

    const/4 v9, 0x1

    if-ge v2, v3, :cond_c

    iget-object v3, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v3, Lu8/n;

    invoke-virtual {v3, v2}, Lu8/n;->a(I)I

    move-result v3

    iget-object v4, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v4, Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc9/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v3, :cond_5

    iget-object v5, v1, Lc9/l;->c:Lc9/j;

    monitor-enter v5

    :try_start_0
    iget-object v3, v5, Lc9/j;->d:Lc9/l;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v5, Lc9/j;->e:Lu8/o0;

    iget-object v6, v4, Lc9/a;->b:Lu8/o0;

    iput-object v6, v5, Lc9/j;->e:Lu8/o0;

    iget-object v6, v5, Lc9/j;->c:Ljava/util/HashMap;

    invoke-virtual {v6}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc9/i;

    iget-object v9, v5, Lc9/j;->e:Lu8/o0;

    invoke-virtual {v8, v3, v9}, Lc9/i;->b(Lu8/o0;Lu8/o0;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v8, v4}, Lc9/i;->a(Lc9/a;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    iget-boolean v9, v8, Lc9/i;->e:Z

    if-eqz v9, :cond_1

    iget-object v9, v8, Lc9/i;->a:Ljava/lang/String;

    iget-object v10, v5, Lc9/j;->f:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v5, v8}, Lc9/j;->a(Lc9/i;)V

    :cond_3
    iget-object v9, v5, Lc9/j;->d:Lc9/l;

    iget-object v8, v8, Lc9/i;->a:Ljava/lang/String;

    invoke-virtual {v9, v4, v8}, Lc9/l;->m(Lc9/a;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v5, v4}, Lc9/j;->d(Lc9/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    goto :goto_8

    :goto_3
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_5
    if-ne v3, v8, :cond_b

    iget-object v3, v1, Lc9/l;->c:Lc9/j;

    iget v5, v1, Lc9/l;->l:I

    monitor-enter v3

    :try_start_2
    iget-object v6, v3, Lc9/j;->d:Lc9/l;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    move v9, v7

    :goto_4
    iget-object v5, v3, Lc9/j;->c:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc9/i;

    invoke-virtual {v6, v4}, Lc9/i;->a(Lc9/a;)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    iget-boolean v8, v6, Lc9/i;->e:Z

    if-eqz v8, :cond_7

    iget-object v8, v6, Lc9/i;->a:Ljava/lang/String;

    iget-object v10, v3, Lc9/j;->f:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v9, :cond_8

    if-eqz v8, :cond_8

    iget-boolean v10, v6, Lc9/i;->f:Z

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_8
    :goto_6
    if-eqz v8, :cond_9

    invoke-virtual {v3, v6}, Lc9/j;->a(Lc9/i;)V

    :cond_9
    iget-object v8, v3, Lc9/j;->d:Lc9/l;

    iget-object v6, v6, Lc9/i;->a:Ljava/lang/String;

    invoke-virtual {v8, v4, v6}, Lc9/l;->m(Lc9/a;Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v3, v4}, Lc9/j;->d(Lc9/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v3

    goto :goto_8

    :goto_7
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :cond_b
    iget-object v3, v1, Lc9/l;->c:Lc9/j;

    invoke-virtual {v3, v4}, Lc9/j;->e(Lc9/a;)V

    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_c
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    invoke-virtual {v0, v7}, Lqg3/d;->l(I)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v2, Landroid/util/SparseArray;

    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc9/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v1, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v5, :cond_d

    iget-object v5, v2, Lc9/a;->b:Lu8/o0;

    iget-object v2, v2, Lc9/a;->d:Ll9/c0;

    invoke-virtual {v1, v5, v2}, Lc9/l;->j(Lu8/o0;Ll9/c0;)V

    :cond_d
    const/4 v10, 0x2

    invoke-virtual {v0, v10}, Lqg3/d;->l(I)Z

    move-result v2

    if-eqz v2, :cond_15

    iget-object v2, v1, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v2, :cond_15

    move-object/from16 v2, p1

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->d0()Lu8/v0;

    move-result-object v2

    iget-object v2, v2, Lu8/v0;->a:Lzr/g0;

    invoke-virtual {v2, v7}, Lzr/g0;->o(I)Lzr/e0;

    move-result-object v2

    :cond_e
    invoke-virtual {v2}, Lzr/e0;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {v2}, Lzr/e0;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu8/u0;

    move v13, v7

    :goto_9
    iget v14, v6, Lu8/u0;->a:I

    if-ge v13, v14, :cond_e

    iget-object v14, v6, Lu8/u0;->e:[Z

    aget-boolean v14, v14, v13

    if-eqz v14, :cond_f

    iget-object v14, v6, Lu8/u0;->b:Lu8/p0;

    iget-object v14, v14, Lu8/p0;->d:[Lu8/p;

    aget-object v14, v14, v13

    iget-object v14, v14, Lu8/p;->r:Lu8/l;

    if-eqz v14, :cond_f

    goto :goto_a

    :cond_f
    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_10
    const/4 v14, 0x0

    :goto_a
    if-eqz v14, :cond_15

    iget-object v2, v1, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    move v6, v7

    :goto_b
    iget v13, v14, Lu8/l;->z:I

    if-ge v6, v13, :cond_14

    iget-object v13, v14, Lu8/l;->w:[Lu8/k;

    aget-object v13, v13, v6

    iget-object v13, v13, Lu8/k;->x:Ljava/util/UUID;

    sget-object v15, Lu8/f;->d:Ljava/util/UUID;

    invoke-virtual {v13, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    const/4 v6, 0x3

    goto :goto_c

    :cond_11
    sget-object v15, Lu8/f;->e:Ljava/util/UUID;

    invoke-virtual {v13, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_12

    move v6, v10

    goto :goto_c

    :cond_12
    sget-object v15, Lu8/f;->c:Ljava/util/UUID;

    invoke-virtual {v13, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    const/4 v6, 0x6

    goto :goto_c

    :cond_13
    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :cond_14
    move v6, v9

    :goto_c
    invoke-virtual {v2, v6}, Landroid/media/metrics/PlaybackMetrics$Builder;->setDrmType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    :cond_15
    const/16 v2, 0x3f3

    invoke-virtual {v0, v2}, Lqg3/d;->l(I)Z

    move-result v2

    if-eqz v2, :cond_16

    iget v2, v1, Lc9/l;->A:I

    add-int/2addr v2, v9

    iput v2, v1, Lc9/l;->A:I

    :cond_16
    iget-object v2, v1, Lc9/l;->o:Landroidx/media3/common/PlaybackException;

    const/4 v14, 0x5

    const/4 v5, 0x4

    if-nez v2, :cond_17

    move/from16 v17, v5

    move v15, v9

    move v6, v10

    const/16 v9, 0xd

    const/16 v13, 0x9

    const/16 v16, 0x8

    const/16 v18, 0x7

    const/16 v19, 0x6

    goto/16 :goto_1d

    :cond_17
    iget v13, v2, Landroidx/media3/common/PlaybackException;->w:I

    iget-object v10, v1, Lc9/l;->a:Landroid/content/Context;

    iget v15, v1, Lc9/l;->w:I

    if-ne v15, v5, :cond_18

    move v15, v9

    goto :goto_d

    :cond_18
    move v15, v7

    :goto_d
    const/16 v5, 0x3e9

    if-ne v13, v5, :cond_19

    new-instance v5, Lc9/k;

    const/16 v10, 0x14

    const/4 v13, 0x0

    invoke-direct {v5, v10, v7, v13}, Lc9/k;-><init>(III)V

    :goto_e
    const/16 v9, 0xd

    const/16 v13, 0x9

    :goto_f
    const/16 v16, 0x8

    const/16 v17, 0x4

    const/16 v18, 0x7

    const/16 v19, 0x6

    goto/16 :goto_1c

    :cond_19
    instance-of v5, v2, Landroidx/media3/exoplayer/ExoPlaybackException;

    if-eqz v5, :cond_1b

    move-object v5, v2

    check-cast v5, Landroidx/media3/exoplayer/ExoPlaybackException;

    iget v6, v5, Landroidx/media3/exoplayer/ExoPlaybackException;->y:I

    if-ne v6, v9, :cond_1a

    move v6, v9

    goto :goto_10

    :cond_1a
    move v6, v7

    :goto_10
    iget v5, v5, Landroidx/media3/exoplayer/ExoPlaybackException;->G:I

    goto :goto_11

    :cond_1b
    move v5, v7

    move v6, v5

    :goto_11
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v12, v11, Ljava/io/IOException;

    const/16 v20, 0x19

    const/16 v21, 0x1a

    const/16 v8, 0x1b

    const/16 v9, 0x17

    if-eqz v12, :cond_30

    instance-of v5, v11, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    if-eqz v5, :cond_1c

    check-cast v11, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    iget v5, v11, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;->y:I

    new-instance v6, Lc9/k;

    const/4 v8, 0x0

    invoke-direct {v6, v14, v5, v8}, Lc9/k;-><init>(III)V

    :goto_12
    move-object v5, v6

    goto :goto_e

    :cond_1c
    instance-of v5, v11, Landroidx/media3/datasource/HttpDataSource$InvalidContentTypeException;

    if-nez v5, :cond_1d

    instance-of v5, v11, Landroidx/media3/common/ParserException;

    if-eqz v5, :cond_1e

    :cond_1d
    const/4 v8, 0x6

    const/4 v9, 0x7

    const/4 v10, 0x4

    const/16 v11, 0x8

    const/16 v13, 0x9

    goto/16 :goto_18

    :cond_1e
    instance-of v5, v11, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    if-nez v5, :cond_1f

    instance-of v6, v11, Landroidx/media3/datasource/UdpDataSource$UdpDataSourceException;

    if-eqz v6, :cond_20

    :cond_1f
    const/16 v13, 0x9

    goto/16 :goto_15

    :cond_20
    const/16 v5, 0x3ea

    if-ne v13, v5, :cond_21

    new-instance v5, Lc9/k;

    const/16 v6, 0x15

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Lc9/k;-><init>(III)V

    goto :goto_e

    :cond_21
    instance-of v5, v11, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    if-eqz v5, :cond_28

    invoke-virtual {v11}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v6, v5, Landroid/media/MediaDrm$MediaDrmStateException;

    if-eqz v6, :cond_22

    check-cast v5, Landroid/media/MediaDrm$MediaDrmStateException;

    invoke-virtual {v5}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lx8/t;->t(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Lx8/t;->s(I)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    goto :goto_13

    :pswitch_0
    move/from16 v8, v21

    goto :goto_13

    :pswitch_1
    move/from16 v8, v20

    goto :goto_13

    :pswitch_2
    const/16 v8, 0x1c

    goto :goto_13

    :pswitch_3
    const/16 v8, 0x18

    :goto_13
    new-instance v6, Lc9/k;

    const/4 v9, 0x0

    invoke-direct {v6, v8, v5, v9}, Lc9/k;-><init>(III)V

    goto :goto_12

    :cond_22
    sget v6, Lx8/t;->a:I

    if-lt v6, v9, :cond_23

    instance-of v6, v5, Landroid/media/MediaDrmResetException;

    if-eqz v6, :cond_23

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    invoke-direct {v5, v8, v7, v6}, Lc9/k;-><init>(III)V

    goto/16 :goto_e

    :cond_23
    instance-of v6, v5, Landroid/media/NotProvisionedException;

    if-eqz v6, :cond_24

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    const/16 v10, 0x18

    invoke-direct {v5, v10, v7, v6}, Lc9/k;-><init>(III)V

    goto/16 :goto_e

    :cond_24
    instance-of v6, v5, Landroid/media/DeniedByServerException;

    if-eqz v6, :cond_25

    new-instance v5, Lc9/k;

    const/16 v6, 0x1d

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Lc9/k;-><init>(III)V

    goto/16 :goto_e

    :cond_25
    instance-of v6, v5, Landroidx/media3/exoplayer/drm/UnsupportedDrmException;

    if-eqz v6, :cond_26

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    invoke-direct {v5, v9, v7, v6}, Lc9/k;-><init>(III)V

    goto/16 :goto_e

    :cond_26
    instance-of v5, v5, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$MissingSchemeDataException;

    if-eqz v5, :cond_27

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    const/16 v12, 0x1c

    invoke-direct {v5, v12, v7, v6}, Lc9/k;-><init>(III)V

    goto/16 :goto_e

    :cond_27
    new-instance v5, Lc9/k;

    const/16 v6, 0x1e

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Lc9/k;-><init>(III)V

    goto/16 :goto_e

    :cond_28
    instance-of v5, v11, Landroidx/media3/datasource/FileDataSource$FileDataSourceException;

    if-eqz v5, :cond_2a

    invoke-virtual {v11}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    instance-of v5, v5, Ljava/io/FileNotFoundException;

    if-eqz v5, :cond_2a

    invoke-virtual {v11}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    instance-of v6, v5, Landroid/system/ErrnoException;

    if-eqz v6, :cond_29

    check-cast v5, Landroid/system/ErrnoException;

    iget v5, v5, Landroid/system/ErrnoException;->errno:I

    sget v6, Landroid/system/OsConstants;->EACCES:I

    if-ne v5, v6, :cond_29

    new-instance v5, Lc9/k;

    const/16 v6, 0x20

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Lc9/k;-><init>(III)V

    goto/16 :goto_e

    :cond_29
    new-instance v5, Lc9/k;

    const/16 v6, 0x1f

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Lc9/k;-><init>(III)V

    goto/16 :goto_e

    :cond_2a
    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    const/16 v13, 0x9

    invoke-direct {v5, v13, v7, v6}, Lc9/k;-><init>(III)V

    :goto_14
    const/16 v9, 0xd

    goto/16 :goto_f

    :goto_15
    invoke-static {v10}, Lx8/m;->a(Landroid/content/Context;)Lx8/m;

    move-result-object v6

    invoke-virtual {v6}, Lx8/m;->b()I

    move-result v6

    const/4 v8, 0x1

    if-ne v6, v8, :cond_2b

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    const/4 v8, 0x3

    invoke-direct {v5, v8, v7, v6}, Lc9/k;-><init>(III)V

    goto :goto_14

    :cond_2b
    invoke-virtual {v11}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    instance-of v8, v6, Ljava/net/UnknownHostException;

    if-eqz v8, :cond_2c

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    const/4 v8, 0x6

    invoke-direct {v5, v8, v7, v6}, Lc9/k;-><init>(III)V

    move/from16 v19, v8

    const/16 v9, 0xd

    const/16 v16, 0x8

    const/16 v17, 0x4

    const/16 v18, 0x7

    goto/16 :goto_1c

    :cond_2c
    const/4 v8, 0x6

    instance-of v6, v6, Ljava/net/SocketTimeoutException;

    if-eqz v6, :cond_2d

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    const/4 v9, 0x7

    invoke-direct {v5, v9, v7, v6}, Lc9/k;-><init>(III)V

    move/from16 v19, v8

    move/from16 v18, v9

    const/16 v9, 0xd

    const/16 v16, 0x8

    const/16 v17, 0x4

    goto/16 :goto_1c

    :cond_2d
    const/4 v9, 0x7

    if-eqz v5, :cond_2e

    check-cast v11, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    iget v5, v11, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;->x:I

    const/4 v6, 0x1

    if-ne v5, v6, :cond_2e

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    const/4 v10, 0x4

    invoke-direct {v5, v10, v7, v6}, Lc9/k;-><init>(III)V

    move/from16 v19, v8

    move/from16 v18, v9

    move/from16 v17, v10

    const/16 v9, 0xd

    const/16 v16, 0x8

    goto/16 :goto_1c

    :cond_2e
    const/4 v10, 0x4

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    const/16 v11, 0x8

    invoke-direct {v5, v11, v7, v6}, Lc9/k;-><init>(III)V

    :goto_16
    move/from16 v19, v8

    move/from16 v18, v9

    move/from16 v17, v10

    move/from16 v16, v11

    :goto_17
    const/16 v9, 0xd

    goto/16 :goto_1c

    :goto_18
    new-instance v5, Lc9/k;

    if-eqz v15, :cond_2f

    const/16 v6, 0xa

    goto :goto_19

    :cond_2f
    const/16 v6, 0xb

    :goto_19
    const/4 v12, 0x0

    invoke-direct {v5, v6, v7, v12}, Lc9/k;-><init>(III)V

    goto :goto_16

    :cond_30
    const/16 v10, 0x18

    const/16 v12, 0x1c

    const/16 v13, 0x9

    const/16 v16, 0x8

    const/16 v17, 0x4

    const/16 v18, 0x7

    const/16 v19, 0x6

    if-eqz v6, :cond_32

    if-eqz v5, :cond_31

    const/4 v15, 0x1

    if-ne v5, v15, :cond_32

    :cond_31
    new-instance v5, Lc9/k;

    const/16 v6, 0x23

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Lc9/k;-><init>(III)V

    goto :goto_17

    :cond_32
    if-eqz v6, :cond_33

    const/4 v15, 0x3

    if-ne v5, v15, :cond_33

    new-instance v5, Lc9/k;

    const/16 v6, 0xf

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Lc9/k;-><init>(III)V

    goto :goto_17

    :cond_33
    if-eqz v6, :cond_34

    const/4 v6, 0x2

    if-ne v5, v6, :cond_34

    new-instance v5, Lc9/k;

    const/4 v6, 0x0

    invoke-direct {v5, v9, v7, v6}, Lc9/k;-><init>(III)V

    goto :goto_17

    :cond_34
    instance-of v5, v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    if-eqz v5, :cond_35

    check-cast v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    iget-object v5, v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->z:Ljava/lang/String;

    invoke-static {v5}, Lx8/t;->t(Ljava/lang/String;)I

    move-result v5

    new-instance v6, Lc9/k;

    const/4 v8, 0x0

    const/16 v9, 0xd

    invoke-direct {v6, v9, v5, v8}, Lc9/k;-><init>(III)V

    :goto_1a
    move-object v5, v6

    goto/16 :goto_1c

    :cond_35
    const/16 v9, 0xd

    instance-of v5, v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    const/16 v6, 0xe

    if-eqz v5, :cond_36

    check-cast v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    iget v5, v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;->w:I

    new-instance v8, Lc9/k;

    const/4 v10, 0x0

    invoke-direct {v8, v6, v5, v10}, Lc9/k;-><init>(III)V

    move-object v5, v8

    goto :goto_1c

    :cond_36
    instance-of v5, v11, Ljava/lang/OutOfMemoryError;

    if-eqz v5, :cond_37

    new-instance v5, Lc9/k;

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Lc9/k;-><init>(III)V

    goto :goto_1c

    :cond_37
    instance-of v5, v11, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    if-eqz v5, :cond_38

    check-cast v11, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    iget v5, v11, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->w:I

    new-instance v6, Lc9/k;

    const/16 v8, 0x11

    const/4 v10, 0x0

    invoke-direct {v6, v8, v5, v10}, Lc9/k;-><init>(III)V

    goto :goto_1a

    :cond_38
    instance-of v5, v11, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;

    if-eqz v5, :cond_39

    check-cast v11, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;

    iget v5, v11, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->w:I

    new-instance v6, Lc9/k;

    const/16 v8, 0x12

    const/4 v10, 0x0

    invoke-direct {v6, v8, v5, v10}, Lc9/k;-><init>(III)V

    goto :goto_1a

    :cond_39
    instance-of v5, v11, Landroid/media/MediaCodec$CryptoException;

    if-eqz v5, :cond_3a

    check-cast v11, Landroid/media/MediaCodec$CryptoException;

    invoke-virtual {v11}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v5

    invoke-static {v5}, Lx8/t;->s(I)I

    move-result v6

    packed-switch v6, :pswitch_data_1

    goto :goto_1b

    :pswitch_4
    move/from16 v8, v21

    goto :goto_1b

    :pswitch_5
    move/from16 v8, v20

    goto :goto_1b

    :pswitch_6
    move v8, v12

    goto :goto_1b

    :pswitch_7
    move v8, v10

    :goto_1b
    new-instance v6, Lc9/k;

    const/4 v10, 0x0

    invoke-direct {v6, v8, v5, v10}, Lc9/k;-><init>(III)V

    goto :goto_1a

    :cond_3a
    new-instance v5, Lc9/k;

    const/16 v6, 0x16

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Lc9/k;-><init>(III)V

    :goto_1c
    new-instance v6, Landroid/media/metrics/PlaybackErrorEvent$Builder;

    invoke-direct {v6}, Landroid/media/metrics/PlaybackErrorEvent$Builder;-><init>()V

    iget-wide v10, v1, Lc9/l;->e:J

    sub-long v10, v3, v10

    invoke-virtual {v6, v10, v11}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v6

    iget v8, v5, Lc9/k;->x:I

    invoke-virtual {v6, v8}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v6

    iget v5, v5, Lc9/k;->y:I

    invoke-virtual {v6, v5}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setSubErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setException(Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->build()Landroid/media/metrics/PlaybackErrorEvent;

    move-result-object v2

    iget-object v5, v1, Lc9/l;->b:Ljava/util/concurrent/Executor;

    new-instance v6, La8/c;

    const/4 v8, 0x7

    invoke-direct {v6, v8, v1, v2}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 v15, 0x1

    iput-boolean v15, v1, Lc9/l;->B:Z

    const/4 v5, 0x0

    iput-object v5, v1, Lc9/l;->o:Landroidx/media3/common/PlaybackException;

    const/4 v6, 0x2

    :goto_1d
    invoke-virtual {v0, v6}, Lqg3/d;->l(I)Z

    move-result v2

    if-eqz v2, :cond_3b

    move-object/from16 v2, p1

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->d0()Lu8/v0;

    move-result-object v2

    invoke-virtual {v2, v6}, Lu8/v0;->a(I)Z

    move-result v5

    invoke-virtual {v2, v15}, Lu8/v0;->a(I)Z

    move-result v8

    const/4 v15, 0x3

    invoke-virtual {v2, v15}, Lu8/v0;->a(I)Z

    move-result v10

    if-nez v5, :cond_3c

    if-nez v8, :cond_3c

    if-eqz v10, :cond_3b

    goto :goto_1e

    :cond_3b
    move/from16 v11, v17

    const/4 v8, 0x0

    goto :goto_25

    :cond_3c
    :goto_1e
    if-nez v5, :cond_3f

    iget-object v2, v1, Lc9/l;->s:Lu8/p;

    const/4 v5, 0x0

    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3d

    move/from16 v11, v17

    goto :goto_20

    :cond_3d
    iget-object v2, v1, Lc9/l;->s:Lu8/p;

    if-nez v2, :cond_3e

    const/4 v6, 0x1

    goto :goto_1f

    :cond_3e
    move v6, v7

    :goto_1f
    iput-object v5, v1, Lc9/l;->s:Lu8/p;

    const/4 v2, 0x1

    move/from16 v11, v17

    invoke-virtual/range {v1 .. v6}, Lc9/l;->n(IJLu8/p;I)V

    goto :goto_20

    :cond_3f
    move/from16 v11, v17

    const/4 v5, 0x0

    :goto_20
    if-nez v8, :cond_42

    iget-object v2, v1, Lc9/l;->t:Lu8/p;

    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_40

    goto :goto_22

    :cond_40
    iget-object v2, v1, Lc9/l;->t:Lu8/p;

    if-nez v2, :cond_41

    const/4 v6, 0x1

    goto :goto_21

    :cond_41
    move v6, v7

    :goto_21
    iput-object v5, v1, Lc9/l;->t:Lu8/p;

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v6}, Lc9/l;->n(IJLu8/p;I)V

    :cond_42
    :goto_22
    if-nez v10, :cond_45

    iget-object v2, v1, Lc9/l;->u:Lu8/p;

    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_43

    goto :goto_24

    :cond_43
    iget-object v2, v1, Lc9/l;->u:Lu8/p;

    if-nez v2, :cond_44

    const/4 v6, 0x1

    goto :goto_23

    :cond_44
    move v6, v7

    :goto_23
    iput-object v5, v1, Lc9/l;->u:Lu8/p;

    const/4 v2, 0x2

    invoke-virtual/range {v1 .. v6}, Lc9/l;->n(IJLu8/p;I)V

    :cond_45
    :goto_24
    move-object v8, v5

    :goto_25
    iget-object v2, v1, Lc9/l;->p:Lab/h0;

    invoke-virtual {v1, v2}, Lc9/l;->f(Lab/h0;)Z

    move-result v2

    if-eqz v2, :cond_48

    iget-object v2, v1, Lc9/l;->p:Lab/h0;

    iget-object v5, v2, Lab/h0;->y:Ljava/lang/Object;

    check-cast v5, Lu8/p;

    iget v6, v5, Lu8/p;->v:I

    const/4 v10, -0x1

    if-eq v6, v10, :cond_48

    iget v2, v2, Lab/h0;->x:I

    iget-object v6, v1, Lc9/l;->s:Lu8/p;

    invoke-static {v6, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_46

    goto :goto_27

    :cond_46
    iget-object v6, v1, Lc9/l;->s:Lu8/p;

    if-nez v6, :cond_47

    if-nez v2, :cond_47

    const/4 v6, 0x1

    goto :goto_26

    :cond_47
    move v6, v2

    :goto_26
    iput-object v5, v1, Lc9/l;->s:Lu8/p;

    const/4 v2, 0x1

    invoke-virtual/range {v1 .. v6}, Lc9/l;->n(IJLu8/p;I)V

    :goto_27
    iput-object v8, v1, Lc9/l;->p:Lab/h0;

    :cond_48
    iget-object v2, v1, Lc9/l;->q:Lab/h0;

    invoke-virtual {v1, v2}, Lc9/l;->f(Lab/h0;)Z

    move-result v2

    if-eqz v2, :cond_4b

    iget-object v2, v1, Lc9/l;->q:Lab/h0;

    iget-object v5, v2, Lab/h0;->y:Ljava/lang/Object;

    check-cast v5, Lu8/p;

    iget v2, v2, Lab/h0;->x:I

    iget-object v6, v1, Lc9/l;->t:Lu8/p;

    invoke-static {v6, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_49

    goto :goto_29

    :cond_49
    iget-object v6, v1, Lc9/l;->t:Lu8/p;

    if-nez v6, :cond_4a

    if-nez v2, :cond_4a

    const/4 v6, 0x1

    goto :goto_28

    :cond_4a
    move v6, v2

    :goto_28
    iput-object v5, v1, Lc9/l;->t:Lu8/p;

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v6}, Lc9/l;->n(IJLu8/p;I)V

    :goto_29
    iput-object v8, v1, Lc9/l;->q:Lab/h0;

    :cond_4b
    iget-object v2, v1, Lc9/l;->r:Lab/h0;

    invoke-virtual {v1, v2}, Lc9/l;->f(Lab/h0;)Z

    move-result v2

    if-eqz v2, :cond_4e

    iget-object v2, v1, Lc9/l;->r:Lab/h0;

    iget-object v5, v2, Lab/h0;->y:Ljava/lang/Object;

    check-cast v5, Lu8/p;

    iget v2, v2, Lab/h0;->x:I

    iget-object v6, v1, Lc9/l;->u:Lu8/p;

    invoke-static {v6, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4c

    goto :goto_2b

    :cond_4c
    iget-object v6, v1, Lc9/l;->u:Lu8/p;

    if-nez v6, :cond_4d

    if-nez v2, :cond_4d

    const/4 v6, 0x1

    goto :goto_2a

    :cond_4d
    move v6, v2

    :goto_2a
    iput-object v5, v1, Lc9/l;->u:Lu8/p;

    const/4 v2, 0x2

    invoke-virtual/range {v1 .. v6}, Lc9/l;->n(IJLu8/p;I)V

    :goto_2b
    iput-object v8, v1, Lc9/l;->r:Lab/h0;

    :cond_4e
    iget-object v2, v1, Lc9/l;->a:Landroid/content/Context;

    invoke-static {v2}, Lx8/m;->a(Landroid/content/Context;)Lx8/m;

    move-result-object v2

    invoke-virtual {v2}, Lx8/m;->b()I

    move-result v2

    packed-switch v2, :pswitch_data_2

    :pswitch_8
    const/4 v15, 0x1

    goto :goto_2c

    :pswitch_9
    move/from16 v15, v18

    goto :goto_2c

    :pswitch_a
    move/from16 v15, v16

    goto :goto_2c

    :pswitch_b
    const/4 v15, 0x3

    goto :goto_2c

    :pswitch_c
    move/from16 v15, v19

    goto :goto_2c

    :pswitch_d
    move v15, v14

    goto :goto_2c

    :pswitch_e
    move v15, v11

    goto :goto_2c

    :pswitch_f
    const/4 v15, 0x2

    goto :goto_2c

    :pswitch_10
    move v15, v13

    goto :goto_2c

    :pswitch_11
    move v15, v7

    :goto_2c
    iget v2, v1, Lc9/l;->n:I

    if-eq v15, v2, :cond_4f

    iput v15, v1, Lc9/l;->n:I

    new-instance v2, Landroid/media/metrics/NetworkEvent$Builder;

    invoke-direct {v2}, Landroid/media/metrics/NetworkEvent$Builder;-><init>()V

    invoke-virtual {v2, v15}, Landroid/media/metrics/NetworkEvent$Builder;->setNetworkType(I)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object v2

    iget-wide v5, v1, Lc9/l;->e:J

    sub-long v5, v3, v5

    invoke-virtual {v2, v5, v6}, Landroid/media/metrics/NetworkEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/metrics/NetworkEvent$Builder;->build()Landroid/media/metrics/NetworkEvent;

    move-result-object v2

    iget-object v5, v1, Lc9/l;->b:Ljava/util/concurrent/Executor;

    new-instance v6, La8/c;

    const/4 v8, 0x6

    invoke-direct {v6, v8, v1, v2}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4f
    move-object/from16 v2, p1

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->i0()I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_50

    iput-boolean v7, v1, Lc9/l;->v:Z

    :cond_50
    invoke-virtual {v2}, Lb9/f0;->L0()V

    iget-object v5, v2, Lb9/f0;->I0:Lb9/c1;

    iget-object v5, v5, Lb9/c1;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    if-nez v5, :cond_51

    iput-boolean v7, v1, Lc9/l;->x:Z

    const/16 v5, 0xa

    goto :goto_2d

    :cond_51
    const/16 v5, 0xa

    invoke-virtual {v0, v5}, Lqg3/d;->l(I)Z

    move-result v6

    if-eqz v6, :cond_52

    const/4 v15, 0x1

    iput-boolean v15, v1, Lc9/l;->x:Z

    :cond_52
    :goto_2d
    invoke-virtual {v2}, Lb9/f0;->i0()I

    move-result v6

    iget-boolean v7, v1, Lc9/l;->v:Z

    if-eqz v7, :cond_53

    move v8, v14

    :goto_2e
    const/4 v15, 0x1

    goto/16 :goto_30

    :cond_53
    iget-boolean v7, v1, Lc9/l;->x:Z

    if-eqz v7, :cond_54

    move v8, v9

    goto :goto_2e

    :cond_54
    if-ne v6, v11, :cond_55

    const/16 v8, 0xb

    goto :goto_2e

    :cond_55
    const/16 v8, 0xc

    const/4 v7, 0x2

    if-ne v6, v7, :cond_5a

    iget v6, v1, Lc9/l;->m:I

    if-eqz v6, :cond_59

    if-eq v6, v7, :cond_59

    if-ne v6, v8, :cond_56

    goto :goto_2f

    :cond_56
    invoke-virtual {v2}, Lb9/f0;->g0()Z

    move-result v6

    if-nez v6, :cond_57

    move/from16 v8, v18

    goto :goto_2e

    :cond_57
    invoke-virtual {v2}, Lb9/f0;->L0()V

    iget-object v2, v2, Lb9/f0;->I0:Lb9/c1;

    iget v2, v2, Lb9/c1;->n:I

    if-eqz v2, :cond_58

    move v8, v5

    goto :goto_2e

    :cond_58
    move/from16 v8, v19

    goto :goto_2e

    :cond_59
    :goto_2f
    move v8, v7

    goto :goto_2e

    :cond_5a
    const/4 v15, 0x3

    if-ne v6, v15, :cond_5d

    invoke-virtual {v2}, Lb9/f0;->g0()Z

    move-result v5

    if-nez v5, :cond_5b

    move v8, v11

    goto :goto_2e

    :cond_5b
    invoke-virtual {v2}, Lb9/f0;->L0()V

    iget-object v2, v2, Lb9/f0;->I0:Lb9/c1;

    iget v2, v2, Lb9/c1;->n:I

    if-eqz v2, :cond_5c

    move v8, v13

    goto :goto_2e

    :cond_5c
    move v8, v15

    goto :goto_2e

    :cond_5d
    const/4 v15, 0x1

    if-ne v6, v15, :cond_5e

    iget v2, v1, Lc9/l;->m:I

    if-eqz v2, :cond_5e

    goto :goto_30

    :cond_5e
    iget v8, v1, Lc9/l;->m:I

    :goto_30
    iget v2, v1, Lc9/l;->m:I

    if-eq v2, v8, :cond_5f

    iput v8, v1, Lc9/l;->m:I

    iput-boolean v15, v1, Lc9/l;->B:Z

    new-instance v2, Landroid/media/metrics/PlaybackStateEvent$Builder;

    invoke-direct {v2}, Landroid/media/metrics/PlaybackStateEvent$Builder;-><init>()V

    iget v5, v1, Lc9/l;->m:I

    invoke-virtual {v2, v5}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setState(I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object v2

    iget-wide v5, v1, Lc9/l;->e:J

    sub-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/metrics/PlaybackStateEvent$Builder;->build()Landroid/media/metrics/PlaybackStateEvent;

    move-result-object v2

    iget-object v3, v1, Lc9/l;->b:Ljava/util/concurrent/Executor;

    new-instance v4, La8/c;

    const/16 v5, 0x9

    invoke-direct {v4, v5, v1, v2}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_5f
    const/16 v2, 0x404

    invoke-virtual {v0, v2}, Lqg3/d;->l(I)Z

    move-result v3

    if-eqz v3, :cond_63

    iget-object v3, v1, Lc9/l;->c:Lc9/j;

    iget-object v0, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc9/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v3

    :try_start_4
    iget-object v2, v3, Lc9/j;->f:Ljava/lang/String;

    if-eqz v2, :cond_60

    iget-object v4, v3, Lc9/j;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc9/i;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v2}, Lc9/j;->a(Lc9/i;)V

    goto :goto_31

    :catchall_2
    move-exception v0

    goto :goto_33

    :cond_60
    :goto_31
    iget-object v2, v3, Lc9/j;->c:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_61
    :goto_32
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_62

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc9/i;

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    iget-boolean v5, v4, Lc9/i;->e:Z

    if-eqz v5, :cond_61

    iget-object v5, v3, Lc9/j;->d:Lc9/l;

    if-eqz v5, :cond_61

    iget-object v4, v4, Lc9/i;->a:Ljava/lang/String;

    invoke-virtual {v5, v0, v4}, Lc9/l;->m(Lc9/a;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_32

    :cond_62
    monitor-exit v3

    return-void

    :goto_33
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0

    :cond_63
    :goto_34
    return-void

    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1772
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_8
        :pswitch_b
        :pswitch_8
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public final l(Lc9/a;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p1, Lc9/a;->d:Ll9/c0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll9/c0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lc9/l;->h()V

    iput-object p2, p0, Lc9/l;->j:Ljava/lang/String;

    new-instance p2, Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-direct {p2}, Landroid/media/metrics/PlaybackMetrics$Builder;-><init>()V

    const-string v1, "AndroidXMedia3"

    invoke-virtual {p2, v1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerName(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    const-string v1, "1.6.1"

    invoke-virtual {p2, v1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerVersion(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    iput-object p2, p0, Lc9/l;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object p1, p1, Lc9/a;->b:Lu8/o0;

    invoke-virtual {p0, p1, v0}, Lc9/l;->j(Lu8/o0;Ll9/c0;)V

    return-void
.end method

.method public final m(Lc9/a;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p1, Lc9/a;->d:Ll9/c0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll9/c0;->b()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_0
    iget-object p1, p0, Lc9/l;->j:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lc9/l;->h()V

    :cond_2
    :goto_0
    iget-object p1, p0, Lc9/l;->h:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc9/l;->i:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final n(IJLu8/p;I)V
    .locals 3

    new-instance v0, Landroid/media/metrics/TrackChangeEvent$Builder;

    invoke-direct {v0, p1}, Landroid/media/metrics/TrackChangeEvent$Builder;-><init>(I)V

    iget-wide v1, p0, Lc9/l;->e:J

    sub-long/2addr p2, v1

    invoke-virtual {v0, p2, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/TrackChangeEvent$Builder;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-eqz p4, :cond_d

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    const/4 v0, 0x2

    if-eq p5, p3, :cond_1

    const/4 v1, 0x3

    if-eq p5, v0, :cond_2

    if-eq p5, v1, :cond_0

    move v1, p3

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    move v1, v0

    :cond_2
    :goto_0
    invoke-virtual {p1, v1}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackChangeReason(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    iget-object p5, p4, Lu8/p;->m:Ljava/lang/String;

    if-eqz p5, :cond_3

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setContainerMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_3
    iget-object p5, p4, Lu8/p;->n:Ljava/lang/String;

    if-eqz p5, :cond_4

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setSampleMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_4
    iget-object p5, p4, Lu8/p;->k:Ljava/lang/String;

    if-eqz p5, :cond_5

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setCodecName(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_5
    iget p5, p4, Lu8/p;->j:I

    const/4 v1, -0x1

    if-eq p5, v1, :cond_6

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setBitrate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_6
    iget p5, p4, Lu8/p;->u:I

    if-eq p5, v1, :cond_7

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setWidth(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_7
    iget p5, p4, Lu8/p;->v:I

    if-eq p5, v1, :cond_8

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setHeight(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_8
    iget p5, p4, Lu8/p;->D:I

    if-eq p5, v1, :cond_9

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setChannelCount(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_9
    iget p5, p4, Lu8/p;->E:I

    if-eq p5, v1, :cond_a

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setAudioSampleRate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_a
    iget-object p5, p4, Lu8/p;->d:Ljava/lang/String;

    if-eqz p5, :cond_c

    sget v2, Lx8/t;->a:I

    const-string v2, "-"

    invoke-virtual {p5, v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p5

    aget-object p2, p5, p2

    array-length v1, p5

    if-lt v1, v0, :cond_b

    aget-object p5, p5, p3

    goto :goto_1

    :cond_b
    const/4 p5, 0x0

    :goto_1
    invoke-static {p2, p5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p2

    iget-object p5, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p5, Ljava/lang/String;

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguage(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz p2, :cond_c

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguageRegion(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_c
    iget p2, p4, Lu8/p;->w:F

    const/high16 p4, -0x40800000    # -1.0f

    cmpl-float p4, p2, p4

    if-eqz p4, :cond_e

    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setVideoFrameRate(F)Landroid/media/metrics/TrackChangeEvent$Builder;

    goto :goto_2

    :cond_d
    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_e
    :goto_2
    iput-boolean p3, p0, Lc9/l;->B:Z

    invoke-virtual {p1}, Landroid/media/metrics/TrackChangeEvent$Builder;->build()Landroid/media/metrics/TrackChangeEvent;

    move-result-object p1

    new-instance p2, La8/c;

    const/4 p3, 0x5

    invoke-direct {p2, p3, p0, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lc9/l;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
