.class public final Ld33/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Lec3/h2;

.field public final B:Ly33/e;

.field public final C:Lstream/video/sfu/models/ClientDetails;

.field public final D:Lec3/h2;

.field public E:Ld33/n;

.field public F:Lbc3/c2;

.field public G:Lbc3/c2;

.field public final H:Lhc3/d;

.field public I:Lbc3/c2;

.field public J:Lbc3/c2;

.field public K:Lbc3/c2;

.field public final L:Lc6/a;

.field public final M:Lec3/h2;

.field public final N:Lmc3/c;

.field public final O:Lmc3/c;

.field public final P:Ljava/util/List;

.field public final Q:Ljava/util/List;

.field public final R:Ljava/util/List;

.field public final a:Landroid/os/PowerManager;

.field public final b:Lt23/c0;

.field public final c:Ljava/lang/String;

.field public final d:Landroidx/lifecycle/x;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Lt23/b4;

.field public final i:Lbc3/u;

.field public final j:Lbc3/c0;

.field public final k:Lbc3/c0;

.field public final l:Ln53/x1;

.field public final m:Lcom/iterable/iterableapi/g1;

.field public final n:Ll53/m;

.field public final o:Lc93/a;

.field public p:Lbc3/c2;

.field public q:Lbc3/c2;

.field public r:Lbc3/c2;

.field public final s:Ll53/m;

.field public final t:Ll53/m;

.field public final u:Ll83/p;

.field public final v:Ld1/j;

.field public final w:Ljava/util/concurrent/ConcurrentHashMap;

.field public final x:Lbi/p;

.field public final y:Ljava/util/ArrayList;

.field public final z:Lec3/h2;


# direct methods
.method public constructor <init>(Lt23/b4;ILandroid/os/PowerManager;Lt23/c0;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lb30/m;I)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v11, p4

    move-object/from16 v0, p5

    move-object/from16 v7, p8

    move-object/from16 v12, p11

    const/4 v13, 0x2

    and-int/lit8 v2, p14, 0x2

    if-eqz v2, :cond_0

    const/4 v15, 0x0

    goto :goto_0

    :cond_0
    move/from16 v15, p2

    :goto_0
    const-string v2, "null cannot be cast to non-null type io.getstream.video.android.core.StreamVideoClient"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v2

    iget-object v4, v11, Lt23/c0;->h:Lb9/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v5, v4, Lb9/b;->x:Z

    const-string v6, "ScopeProvider has been cleaned up"

    if-nez v5, :cond_f

    invoke-virtual {v4}, Lb9/b;->p()Lb23/k;

    move-result-object v5

    iget-object v8, v5, Lb23/k;->c:Lb23/e;

    sget-object v9, Lb23/g;->y:Lb23/g;

    iget-object v10, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v9, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    const/4 v10, 0x0

    if-eqz v8, :cond_1

    iget-object v8, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    const-string v13, "Creating coroutine scope for RTC session main"

    invoke-interface {v8, v9, v5, v13, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v5, v4, Lb9/b;->y:Ljava/lang/Object;

    check-cast v5, Lbc3/c0;

    invoke-interface {v5}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v5

    invoke-interface {v5, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v5

    new-instance v8, Lbc3/b0;

    const-string v13, "rtc-session-main"

    invoke-direct {v8, v13}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-interface {v5, v8}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v5

    invoke-static {v5}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v13

    iget-object v5, v11, Lt23/c0;->c:Ljava/lang/String;

    iget-object v8, v4, Lb9/b;->y:Ljava/lang/Object;

    check-cast v8, Lbc3/c0;

    iget-boolean v14, v4, Lb9/b;->x:Z

    if-nez v14, :cond_e

    invoke-virtual {v4}, Lb9/b;->p()Lb23/k;

    move-result-object v6

    iget-object v14, v6, Lb23/k;->c:Lb23/e;

    iget-object v10, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v14, v9, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2

    iget-object v10, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    const-string v14, "Creating RTC session scope for callId: "

    invoke-virtual {v14, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v16, v8

    const/4 v8, 0x0

    invoke-interface {v10, v9, v6, v14, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    move-object/from16 v16, v8

    :goto_1
    iget-object v6, v4, Lb9/b;->E:Ljava/lang/Object;

    check-cast v6, Ljava/util/concurrent/ExecutorService;

    if-nez v6, :cond_4

    invoke-virtual {v4}, Lb9/b;->p()Lb23/k;

    move-result-object v6

    iget-object v8, v6, Lb23/k;->c:Lb23/e;

    iget-object v10, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v9, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    iget-object v8, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    const-string v10, "Creating new single thread executor for callId: "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v14, 0x0

    invoke-interface {v8, v9, v6, v10, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    new-instance v6, Lk33/a;

    const/4 v8, 0x0

    invoke-direct {v6, v5, v8}, Lk33/a;-><init>(Ljava/lang/String;I)V

    invoke-static {v6}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    iput-object v6, v4, Lb9/b;->E:Ljava/lang/Object;

    :cond_4
    iget-object v6, v4, Lb9/b;->E:Ljava/lang/Object;

    check-cast v6, Ljava/util/concurrent/ExecutorService;

    const-string v8, "rtc-session-coroutine"

    if-eqz v6, :cond_6

    invoke-virtual {v4}, Lb9/b;->p()Lb23/k;

    move-result-object v10

    iget-object v14, v10, Lb23/k;->c:Lb23/e;

    move-object/from16 v17, v4

    iget-object v4, v10, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v14, v9, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v10, Lb23/k;->b:Lb23/j;

    iget-object v10, v10, Lb23/k;->a:Ljava/lang/String;

    const-string v14, "Creating RTC session scope with dedicated executor for callId: "

    invoke-virtual {v14, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v14, 0x0

    invoke-interface {v4, v9, v10, v5, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-interface/range {v16 .. v16}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v4

    invoke-interface {v4, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    new-instance v5, Lbc3/b0;

    invoke-direct {v5, v8}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    new-instance v5, Lbc3/d1;

    check-cast v6, Ljava/util/concurrent/Executor;

    invoke-direct {v5, v6}, Lbc3/d1;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-interface {v4, v5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v4

    const/4 v14, 0x0

    goto :goto_3

    :cond_6
    move-object/from16 v17, v4

    invoke-virtual/range {v17 .. v17}, Lb9/b;->p()Lb23/k;

    move-result-object v4

    iget-object v6, v4, Lb23/k;->c:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    iget-object v10, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v9, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, v4, Lb23/k;->b:Lb23/j;

    iget-object v4, v4, Lb23/k;->a:Ljava/lang/String;

    const-string v10, "Executor is null, falling back to regular scope for callId: "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v14, 0x0

    invoke-interface {v6, v9, v4, v5, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_7
    const/4 v14, 0x0

    :goto_2
    invoke-interface/range {v16 .. v16}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v4

    invoke-interface {v4, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    new-instance v5, Lbc3/b0;

    invoke-direct {v5, v8}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v4

    :goto_3
    new-instance v5, Ln53/x1;

    invoke-direct {v5, v4}, Ln53/x1;-><init>(Lbc3/c0;)V

    new-instance v6, Lcom/iterable/iterableapi/g1;

    iget-boolean v8, v3, Lt23/b4;->Q:Z

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-boolean v8, v6, Lcom/iterable/iterableapi/g1;->w:Z

    new-instance v8, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v8}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v8, v6, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    add-int/lit8 v8, v15, 0x1

    const-string v9, "https://"

    const-string v10, ""

    const/4 v14, 0x0

    invoke-static {v7, v9, v10, v14}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v16, v2

    const-string v2, "/twirp"

    invoke-static {v9, v2, v10, v14}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "-"

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/iterable/iterableapi/g1;->i(Ljava/lang/String;)Ll53/m;

    move-result-object v10

    new-instance v2, Ld33/k;

    move-object/from16 v9, p7

    move-object/from16 v8, p9

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move/from16 p2, v15

    move-object/from16 v14, v16

    move-object/from16 v15, v17

    const/16 v16, 0x0

    move-object/from16 v6, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p13

    invoke-direct/range {v2 .. v11}, Ld33/k;-><init>(Lt23/b4;Ljava/lang/String;Lb30/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/x;Ll53/m;Lt23/c0;)V

    const-string v5, "client"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "sessionId"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "apiKey"

    move-object/from16 v8, p6

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "lifecycle"

    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "sfuUrl"

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "sfuWsUrl"

    move-object/from16 v8, p9

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "sfuToken"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "sfuName"

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "scopeProvider"

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "sfuAnalytics"

    move-object/from16 v8, p13

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 v6, p3

    iput-object v6, v1, Ld33/h1;->a:Landroid/os/PowerManager;

    iput-object v11, v1, Ld33/h1;->b:Lt23/c0;

    iput-object v0, v1, Ld33/h1;->c:Ljava/lang/String;

    iput-object v9, v1, Ld33/h1;->d:Landroidx/lifecycle/x;

    iput-object v7, v1, Ld33/h1;->e:Ljava/lang/String;

    iput-object v4, v1, Ld33/h1;->f:Ljava/lang/String;

    iput-object v12, v1, Ld33/h1;->g:Ljava/lang/String;

    iput-object v3, v1, Ld33/h1;->h:Lt23/b4;

    iput-object v14, v1, Ld33/h1;->i:Lbc3/u;

    iput-object v13, v1, Ld33/h1;->j:Lbc3/c0;

    move-object/from16 v4, v18

    iput-object v4, v1, Ld33/h1;->k:Lbc3/c0;

    move-object/from16 v0, v19

    iput-object v0, v1, Ld33/h1;->l:Ln53/x1;

    move-object/from16 v0, v20

    iput-object v0, v1, Ld33/h1;->m:Lcom/iterable/iterableapi/g1;

    iput-object v10, v1, Ld33/h1;->n:Ll53/m;

    iput-object v2, v1, Ld33/h1;->o:Lc93/a;

    const/4 v2, 0x1

    add-int/lit8 v15, p2, 0x1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "-pub"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/iterable/iterableapi/g1;->i(Ljava/lang/String;)Ll53/m;

    move-result-object v3

    iput-object v3, v1, Ld33/h1;->s:Ll53/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "-sub"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/iterable/iterableapi/g1;->i(Ljava/lang/String;)Ll53/m;

    move-result-object v0

    iput-object v0, v1, Ld33/h1;->t:Ll53/m;

    const-string v0, "Video:RtcSession"

    invoke-static {v1, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, v1, Ld33/h1;->u:Ll83/p;

    new-instance v0, Ld33/r;

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3}, Ld33/r;-><init>(Ld33/h1;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    new-instance v0, Ld1/j;

    invoke-direct {v0, v2}, Ld1/j;-><init>(I)V

    iput-object v0, v1, Ld33/h1;->v:Ld1/j;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, v1, Ld33/h1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Lbi/p;

    new-instance v4, Ld33/q;

    invoke-direct {v4, v1, v2}, Ld33/q;-><init>(Ld33/h1;I)V

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    invoke-direct {v0, v4}, Lbi/p;-><init>(Ld33/q;)V

    iput-object v0, v1, Ld33/h1;->x:Lbi/p;

    sget-object v0, Ln53/c;->a:Lorg/webrtc/MediaConstraints;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v4, 0xa

    move-object/from16 v6, p12

    invoke-static {v6, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc43/e;

    iget-object v7, v6, Lc43/e;->w:Ljava/util/List;

    invoke-static {v7}, Lorg/webrtc/PeerConnection$IceServer;->builder(Ljava/util/List;)Lorg/webrtc/PeerConnection$IceServer$Builder;

    move-result-object v7

    iget-object v8, v6, Lc43/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v8}, Lorg/webrtc/PeerConnection$IceServer$Builder;->setUsername(Ljava/lang/String;)Lorg/webrtc/PeerConnection$IceServer$Builder;

    move-result-object v7

    iget-object v6, v6, Lc43/e;->y:Ljava/lang/String;

    invoke-virtual {v7, v6}, Lorg/webrtc/PeerConnection$IceServer$Builder;->setPassword(Ljava/lang/String;)Lorg/webrtc/PeerConnection$IceServer$Builder;

    move-result-object v6

    invoke-virtual {v6}, Lorg/webrtc/PeerConnection$IceServer$Builder;->createIceServer()Lorg/webrtc/PeerConnection$IceServer;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    iput-object v0, v1, Ld33/h1;->y:Ljava/util/ArrayList;

    invoke-static/range {v16 .. v16}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v1, Ld33/h1;->z:Lec3/h2;

    invoke-static/range {v16 .. v16}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, v1, Ld33/h1;->A:Lec3/h2;

    new-instance v0, Lstream/video/sfu/models/OS;

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-string v9, "Android"

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 p1, v0

    move-object/from16 p3, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p2, v9

    move-object/from16 p4, v10

    move-object/from16 p5, v11

    invoke-direct/range {p1 .. p7}, Lstream/video/sfu/models/OS;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lstream/video/sfu/models/Device;

    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v9, " : "

    invoke-static {v7, v9, v8}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object/from16 p1, v6

    move-object/from16 p2, v7

    move/from16 p5, v8

    move-object/from16 p6, v9

    move-object/from16 p3, v10

    move-object/from16 p4, v11

    invoke-direct/range {p1 .. p6}, Lstream/video/sfu/models/Device;-><init>(Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lstream/video/sfu/models/Sdk;

    sget-object v8, Lstream/video/sfu/models/SdkType;->SDK_TYPE_ANDROID:Lstream/video/sfu/models/SdkType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0x1c

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x10

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 p1, v7

    move-object/from16 p2, v8

    move-object/from16 p3, v9

    move-object/from16 p4, v10

    move-object/from16 p5, v11

    move/from16 p7, v12

    move-object/from16 p8, v13

    move-object/from16 p6, v14

    invoke-direct/range {p1 .. p8}, Lstream/video/sfu/models/Sdk;-><init>(Lstream/video/sfu/models/SdkType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lstream/video/sfu/models/ClientDetails;

    const/16 v9, 0x34

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 p3, v0

    move-object/from16 p5, v6

    move-object/from16 p2, v7

    move-object/from16 p1, v8

    move/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p4, v11

    move-object/from16 p6, v12

    move-object/from16 p7, v13

    invoke-direct/range {p1 .. p9}, Lstream/video/sfu/models/ClientDetails;-><init>(Lstream/video/sfu/models/Sdk;Lstream/video/sfu/models/OS;Lstream/video/sfu/models/Browser;Lstream/video/sfu/models/Device;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p1

    iput-object v0, v1, Ld33/h1;->C:Lstream/video/sfu/models/ClientDetails;

    sget-object v0, Li53/g;->a:Li53/g;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, v1, Ld33/h1;->D:Lec3/h2;

    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    if-eqz v0, :cond_d

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v6, v0, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->z:Lb23/g;

    iget-object v8, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    iget-object v6, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v8, "<init> #sfu; #track; no args"

    move-object/from16 v14, v16

    invoke-interface {v6, v7, v0, v8, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iget-object v0, v1, Ld33/h1;->o:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly33/e;

    const-string v6, "<set-?>"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, Ld33/h1;->B:Ly33/e;

    invoke-virtual {v1}, Ld33/h1;->w()V

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v6, v0, Lb23/k;->c:Lb23/e;

    iget-object v8, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_a

    iget-object v6, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v8, "[createSubscriber] #sfu; no args"

    const/4 v14, 0x0

    invoke-interface {v6, v7, v0, v8, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    iget-object v0, v1, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->j()Le33/j0;

    move-result-object v0

    iget-object v6, v1, Ld33/h1;->k:Lbc3/c0;

    invoke-virtual {v1}, Ld33/h1;->q()Lorg/webrtc/PeerConnection$RTCConfiguration;

    move-result-object v7

    invoke-virtual {v1}, Ld33/h1;->t()Ly33/e;

    move-result-object v8

    iget-object v8, v8, Ly33/e;->d:Lp33/o;

    iget-object v9, v1, Ld33/h1;->c:Ljava/lang/String;

    iget-object v10, v1, Ld33/h1;->h:Lt23/b4;

    iget-boolean v10, v10, Lt23/b4;->R:Z

    iget-object v11, v1, Ld33/h1;->t:Ll53/m;

    invoke-virtual {v1}, Ld33/h1;->t()Ly33/e;

    move-result-object v12

    new-instance v13, Landroidx/room/v0;

    const/4 v14, 0x0

    const/4 v15, 0x6

    const/16 v17, 0x2

    const-class v18, Ld33/h1;

    const-string v19, "sendIceCandidate"

    const-string v20, "sendIceCandidate(Lio/getstream/video/android/core/model/IceCandidate;Lio/getstream/video/android/core/model/StreamPeerType;)V"

    move-object/from16 p3, v1

    move-object/from16 p1, v13

    move/from16 p7, v14

    move/from16 p8, v15

    move/from16 p2, v17

    move-object/from16 p4, v18

    move-object/from16 p5, v19

    move-object/from16 p6, v20

    invoke-direct/range {p1 .. p8}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    const-string v14, "iceServers="

    const-string v15, "coroutineScope"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "sfuClient"

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "tracer"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Le33/v0;

    move-object/from16 p1, v5

    move-object/from16 p4, v6

    move-object/from16 p3, v8

    move-object/from16 p2, v9

    move/from16 p5, v10

    move-object/from16 p6, v11

    move-object/from16 p8, v12

    move-object/from16 p7, v13

    invoke-direct/range {p1 .. p8}, Le33/v0;-><init>(Ljava/lang/String;Lio/getstream/video/android/core/api/SignalServerService;Lbc3/c0;ZLl53/m;Landroidx/room/v0;Ly33/e;)V

    invoke-virtual {v0, v7, v5}, Le33/j0;->d(Lorg/webrtc/PeerConnection$RTCConfiguration;Le33/u;)Lorg/webrtc/PeerConnection;

    move-result-object v6

    invoke-virtual {v0}, Le33/j0;->c()Lb23/k;

    move-result-object v0

    iget-object v8, v0, Lb23/k;->c:Lb23/e;

    sget-object v9, Lb23/g;->y:Lb23/g;

    iget-object v10, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v9, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    iget-object v8, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "type "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " is now monitoring "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-interface {v8, v9, v0, v10, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    invoke-virtual {v5, v6}, Le33/u;->h(Lorg/webrtc/PeerConnection;)V

    invoke-virtual {v5}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v0

    sget-object v6, Lorg/webrtc/MediaStreamTrack$MediaType;->MEDIA_TYPE_VIDEO:Lorg/webrtc/MediaStreamTrack$MediaType;

    new-instance v8, Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;

    sget-object v9, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->RECV_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    invoke-direct {v8, v9}, Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;-><init>(Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;)V

    invoke-virtual {v0, v6, v8}, Lorg/webrtc/PeerConnection;->addTransceiver(Lorg/webrtc/MediaStreamTrack$MediaType;Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;)Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v5}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v0

    sget-object v6, Lorg/webrtc/MediaStreamTrack$MediaType;->MEDIA_TYPE_AUDIO:Lorg/webrtc/MediaStreamTrack$MediaType;

    new-instance v8, Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;

    invoke-direct {v8, v9}, Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;-><init>(Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;)V

    invoke-virtual {v0, v6, v8}, Lorg/webrtc/PeerConnection;->addTransceiver(Lorg/webrtc/MediaStreamTrack$MediaType;Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;)Lorg/webrtc/RtpTransceiver;

    :try_start_0
    iget-object v0, v7, Lorg/webrtc/PeerConnection$RTCConfiguration;->iceServers:Ljava/util/List;

    const-string v6, "iceServers"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    sget-object v6, Le33/g0;->w:Le33/g0;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 p1, v0

    move-object/from16 p5, v6

    move/from16 p6, v8

    move-object/from16 p2, v9

    move-object/from16 p3, v10

    move-object/from16 p4, v11

    invoke-static/range {p1 .. p6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    iget-object v6, v7, Lorg/webrtc/PeerConnection$RTCConfiguration;->bundlePolicy:Lorg/webrtc/PeerConnection$BundlePolicy;

    iget-object v7, v7, Lorg/webrtc/PeerConnection$RTCConfiguration;->sdpSemantics:Lorg/webrtc/PeerConnection$SdpSemantics;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " , budlePolicy="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sdpSemantics="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    sget-object v6, Lb23/i;->a:Lb23/i;

    sget-object v6, Lb23/i;->d:Lb23/e;

    sget-object v7, Lb23/g;->F:Lb23/g;

    const-string v8, "SafeCall"

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    sget-object v6, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Exception occurred: "

    invoke-static {v10, v9}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v7, v8, v9, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    const/4 v10, 0x0

    :goto_5
    iget-object v0, v5, Le33/u;->j:Ll53/m;

    sget-object v6, Ll53/a;->x:[Ll53/a;

    const-string v6, "create"

    invoke-virtual {v0, v10, v6}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    invoke-virtual {v4, v14, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, v1, Ld33/h1;->j:Lbc3/c0;

    new-instance v4, Ld33/m;

    const/4 v8, 0x0

    invoke-direct {v4, v1, v14, v8}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v0, v14, v14, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, v1, Ld33/h1;->j:Lbc3/c0;

    new-instance v4, Ld33/m;

    invoke-direct {v4, v1, v14, v2}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v0, v14, v14, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, v1, Ld33/h1;->j:Lbc3/c0;

    new-instance v4, Ld33/m;

    const/4 v5, 0x2

    invoke-direct {v4, v1, v14, v5}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v0, v14, v14, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {v1}, Ld33/h1;->w()V

    iget-object v0, v1, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->j()Le33/j0;

    move-result-object v0

    new-instance v3, Ld33/p;

    invoke-direct {v3, v1}, Ld33/p;-><init>(Ld33/h1;)V

    iput-object v3, v0, Le33/j0;->i:Ld33/p;

    iget-object v0, v1, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->j()Le33/j0;

    move-result-object v0

    new-instance v3, Lc2/q;

    invoke-direct {v3, v1, v2}, Lc2/q;-><init>(Ljava/lang/Object;I)V

    iput-object v3, v0, Le33/j0;->j:Lc2/q;

    iget-object v0, v1, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->j()Le33/j0;

    move-result-object v0

    new-instance v3, Ld33/q;

    const/4 v8, 0x0

    invoke-direct {v3, v1, v8}, Ld33/q;-><init>(Ld33/h1;I)V

    iput-object v3, v0, Le33/j0;->k:Ld33/q;

    iget-object v0, v1, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->j()Le33/j0;

    move-result-object v0

    new-instance v3, Ld33/r;

    invoke-direct {v3, v1, v8}, Ld33/r;-><init>(Ld33/h1;I)V

    iput-object v3, v0, Le33/j0;->l:Ld33/r;

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, v1, Ld33/h1;->H:Lhc3/d;

    new-instance v0, Lc6/a;

    invoke-direct {v0, v2}, Lc6/a;-><init>(I)V

    iput-object v0, v1, Ld33/h1;->L:Lc6/a;

    sget-object v0, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, v1, Ld33/h1;->M:Lec3/h2;

    new-instance v0, Lmc3/c;

    const/4 v8, 0x0

    invoke-direct {v0, v8}, Lmc3/c;-><init>(Z)V

    iput-object v0, v1, Ld33/h1;->N:Lmc3/c;

    new-instance v0, Lmc3/c;

    invoke-direct {v0, v8}, Lmc3/c;-><init>(Z)V

    iput-object v0, v1, Ld33/h1;->O:Lmc3/c;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Ld33/h1;->P:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Ld33/h1;->Q:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string v2, "synchronizedList(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, Ld33/h1;->R:Ljava/util/List;

    const/4 v14, 0x0

    invoke-static {v14}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    return-void

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "SDK hasn\'t been initialised yet - can\'t start a RtcSession"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;
    .locals 2

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    :cond_0
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v1

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Ld33/h1;->A(Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ld33/h1;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Ld33/y;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ld33/y;

    iget v1, v0, Ld33/y;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/y;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/y;

    invoke-direct {v0, p0, p1}, Ld33/y;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Ld33/y;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/y;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Ld33/y;->x:Ljava/lang/String;

    iget-object v0, v0, Ld33/y;->w:Ld33/h1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, p0

    move-object p0, v0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/h1;->b:Lt23/c0;

    iget-object p1, p1, Lt23/c0;->p:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->M:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    sget-object v2, Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;

    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return-object v3

    :cond_3
    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    invoke-virtual {p0, v4, p1}, Ld33/h1;->F(ZLstream/video/sfu/models/TrackType;)V

    invoke-virtual {p0, p1}, Ld33/h1;->j(Lstream/video/sfu/models/TrackType;)Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le33/n;

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    iput-object p0, v0, Ld33/y;->w:Ld33/h1;

    iput-object v2, v0, Ld33/y;->x:Ljava/lang/String;

    iput v4, v0, Ld33/y;->E:I

    invoke-virtual {v5, v2, p1, v6, v0}, Le33/n;->v(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    move-object v6, p1

    check-cast v6, Lorg/webrtc/MediaStreamTrack;

    :cond_5
    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    new-instance v0, Lc43/a;

    const-string v1, "null cannot be cast to non-null type org.webrtc.AudioTrack"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lorg/webrtc/AudioTrack;

    invoke-direct {v0, v2, v6}, Lc43/a;-><init>(Ljava/lang/String;Lorg/webrtc/AudioTrack;)V

    invoke-virtual {p0, p1, v0}, Ld33/h1;->E(Lstream/video/sfu/models/TrackType;Lc43/g;)V

    return-object v3
.end method

.method public static final b(Ld33/h1;Ld33/h1;Ls83/c;)Ljava/lang/Object;
    .locals 11

    const-string v0, "[processPendingPublisherEvents] #sfu; #track; publisherPendingEvents: "

    instance-of v1, p2, Ld33/l0;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Ld33/l0;

    iget v2, v1, Ld33/l0;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ld33/l0;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Ld33/l0;

    invoke-direct {v1, p0, p2}, Ld33/l0;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p0, v1, Ld33/l0;->z:Ljava/lang/Object;

    sget-object p2, Lr83/a;->w:Lr83/a;

    iget v2, v1, Ld33/l0;->F:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v1, Ld33/l0;->y:Ljava/util/Iterator;

    iget-object v0, v1, Ld33/l0;->x:Lmc3/a;

    iget-object v2, v1, Ld33/l0;->w:Ld33/h1;

    :try_start_0
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p0, Ll83/n;

    iget-object p0, p0, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p0

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p1, v1, Ld33/l0;->y:Ljava/util/Iterator;

    iget-object v0, v1, Ld33/l0;->x:Lmc3/a;

    iget-object v2, v1, Ld33/l0;->w:Ld33/h1;

    :try_start_1
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :cond_3
    iget-object p1, v1, Ld33/l0;->x:Lmc3/a;

    iget-object v2, v1, Ld33/l0;->w:Ld33/h1;

    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p0, p1

    move-object p1, v2

    goto :goto_1

    :cond_4
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p0, p1, Ld33/h1;->N:Lmc3/c;

    iput-object p1, v1, Ld33/l0;->w:Ld33/h1;

    iput-object p0, v1, Ld33/l0;->x:Lmc3/a;

    iput v5, v1, Ld33/l0;->F:I

    invoke-virtual {p0, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p2, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v5, p1, Ld33/h1;->P:Ljava/util/List;

    iget-object v7, v2, Lb23/k;->c:Lb23/e;

    iget-object v8, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->x:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v9, v8, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, p0

    move-object p0, p1

    goto/16 :goto_5

    :cond_6
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v2, p1

    move-object p1, v0

    move-object v0, p0

    :cond_7
    :goto_3
    :try_start_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/android/video/generated/models/VideoEvent;

    instance-of v5, p0, Lv33/k;

    if-eqz v5, :cond_8

    check-cast p0, Lv33/k;

    iput-object v2, v1, Ld33/l0;->w:Ld33/h1;

    iput-object v0, v1, Ld33/l0;->x:Lmc3/a;

    iput-object p1, v1, Ld33/l0;->y:Ljava/util/Iterator;

    iput v4, v1, Ld33/l0;->F:I

    invoke-virtual {v2, p0, v1}, Ld33/h1;->u(Lv33/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p2, :cond_7

    goto :goto_4

    :cond_8
    instance-of v5, p0, Lv33/j;

    if-eqz v5, :cond_9

    iget-object p0, v2, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le33/n;

    if-eqz p0, :cond_7

    const-string v5, "ICERestartEvent"

    iput-object v2, v1, Ld33/l0;->w:Ld33/h1;

    iput-object v0, v1, Ld33/l0;->x:Lmc3/a;

    iput-object p1, v1, Ld33/l0;->y:Ljava/util/Iterator;

    iput v3, v1, Ld33/l0;->F:I

    invoke-virtual {p0, v5, v1}, Le33/n;->w(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p2, :cond_7

    :goto_4
    return-object p2

    :cond_9
    instance-of v5, p0, Lv33/d;

    if-eqz v5, :cond_a

    iget-object v5, v2, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le33/n;

    if-eqz v5, :cond_7

    iget-object v7, v2, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v7}, Lt23/c0;->h()Lt23/x1;

    move-result-object v7

    iget-object v7, v7, Lt23/x1;->e:Lt23/e1;

    iget-object v7, v7, Lt23/e1;->q:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    check-cast p0, Lv33/d;

    iget-object p0, p0, Lv33/d;->a:Lstream/video/sfu/event/ChangePublishOptions;

    invoke-virtual {p0}, Lstream/video/sfu/event/ChangePublishOptions;->getPublish_options()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v5, v7, p0}, Le33/n;->y(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/util/List;)V

    goto :goto_3

    :cond_a
    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object v5

    iget-object v7, v5, Lb23/k;->c:Lb23/e;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Unknown event type: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v5, v9, v8, p0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_3

    :cond_b
    iget-object p0, v2, Ld33/h1;->P:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p0

    :goto_5
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p0
.end method

.method public static final c(Ld33/h1;Ld33/h1;Ls83/c;)Ljava/lang/Object;
    .locals 12

    const-string v0, "[processPendingSubscriberEvents] #sfu; #track; subscriberPendingEvents: "

    instance-of v1, p2, Ld33/m0;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Ld33/m0;

    iget v2, v1, Ld33/m0;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ld33/m0;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Ld33/m0;

    invoke-direct {v1, p0, p2}, Ld33/m0;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p0, v1, Ld33/m0;->z:Ljava/lang/Object;

    sget-object p2, Lr83/a;->w:Lr83/a;

    iget v2, v1, Ld33/m0;->F:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    iget-object p1, v1, Ld33/m0;->y:Ljava/util/Iterator;

    iget-object v0, v1, Ld33/m0;->x:Lmc3/a;

    iget-object v2, v1, Ld33/m0;->w:Ld33/h1;

    :try_start_0
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p0

    goto/16 :goto_5

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget-object p1, v1, Ld33/m0;->x:Lmc3/a;

    iget-object v2, v1, Ld33/m0;->w:Ld33/h1;

    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p0, p1

    move-object p1, v2

    goto :goto_1

    :cond_4
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p0, p1, Ld33/h1;->O:Lmc3/c;

    iput-object p1, v1, Ld33/m0;->w:Ld33/h1;

    iput-object p0, v1, Ld33/m0;->x:Lmc3/a;

    iput v6, v1, Ld33/m0;->F:I

    invoke-virtual {p0, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p2, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v6, p1, Ld33/h1;->Q:Ljava/util/List;

    iget-object v8, v2, Lb23/k;->c:Lb23/e;

    iget-object v9, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v10, v9, v0, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, p0

    move-object p0, p1

    goto/16 :goto_5

    :cond_6
    :goto_2
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v2, p1

    move-object p1, v0

    move-object v0, p0

    :cond_7
    :goto_3
    :try_start_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/android/video/generated/models/VideoEvent;

    instance-of v6, p0, Lv33/k;

    if-eqz v6, :cond_8

    check-cast p0, Lv33/k;

    iput-object v2, v1, Ld33/m0;->w:Ld33/h1;

    iput-object v0, v1, Ld33/m0;->x:Lmc3/a;

    iput-object p1, v1, Ld33/m0;->y:Ljava/util/Iterator;

    iput v5, v1, Ld33/m0;->F:I

    invoke-virtual {v2, p0, v1}, Ld33/h1;->u(Lv33/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p2, :cond_7

    goto :goto_4

    :cond_8
    instance-of v6, p0, Lv33/j;

    if-eqz v6, :cond_9

    iput-object v2, v1, Ld33/m0;->w:Ld33/h1;

    iput-object v0, v1, Ld33/m0;->x:Lmc3/a;

    iput-object p1, v1, Ld33/m0;->y:Ljava/util/Iterator;

    iput v4, v1, Ld33/m0;->F:I

    invoke-virtual {v2, v1}, Ld33/h1;->y(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p2, :cond_7

    goto :goto_4

    :cond_9
    instance-of v6, p0, Lv33/y;

    if-eqz v6, :cond_a

    check-cast p0, Lv33/y;

    iput-object v2, v1, Ld33/m0;->w:Ld33/h1;

    iput-object v0, v1, Ld33/m0;->x:Lmc3/a;

    iput-object p1, v1, Ld33/m0;->y:Ljava/util/Iterator;

    iput v3, v1, Ld33/m0;->F:I

    invoke-virtual {v2, p0, v1}, Ld33/h1;->v(Lv33/y;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p2, :cond_7

    :goto_4
    return-object p2

    :cond_a
    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object v6

    iget-object v8, v6, Lb23/k;->c:Lb23/e;

    iget-object v9, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Unknown event type: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v6, v10, v9, p0, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_b
    iget-object p0, v2, Ld33/h1;->Q:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p0

    :goto_5
    invoke-interface {v0, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p0
.end method

.method public static final d(Ld33/h1;Ljava/lang/String;)V
    .locals 10

    iget-object v0, p0, Ld33/h1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Ld33/h1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "next(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld33/s;

    iget-object v4, v4, Ld33/s;->a:Ljava/lang/String;

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld33/s;

    iget-object v4, v4, Ld33/s;->b:Lstream/video/sfu/models/TrackType;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld33/s;

    iget-object v3, v3, Ld33/s;->c:Lc43/g;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->z:Lb23/g;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    iget-object v7, p0, Ld33/h1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v7}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "[takeOrphanedTracks] #orphaned-track; Retrieved "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " orphaned tracks for sessionId="

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", remaining orphaned="

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v2, v6, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v0

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->z:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    const-string v6, "[reconcileOrphanedTracks] #orphaned-track; Reconciling "

    const-string v7, " orphaned tracks for sessionId="

    invoke-static {v5, v6, v7, p1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v0, v5, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v0, p0, Ld33/h1;->t:Ll53/m;

    const-string v2, "reconcile-tracks"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lstream/video/sfu/models/TrackType;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Lc43/g;

    invoke-virtual {p0, p1, v2, v1}, Ld33/h1;->G(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V

    goto :goto_1

    :cond_5
    :goto_2
    return-void

    :goto_3
    monitor-exit v0

    throw p0
.end method

.method public static final e(Ld33/h1;Lstream/video/sfu/models/ICETrickle;Ls83/c;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p2, Ld33/r0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld33/r0;

    iget v1, v0, Ld33/r0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/r0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/r0;

    invoke-direct {v0, p0, p2}, Ld33/r0;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ld33/r0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/r0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    invoke-virtual {p0}, Ld33/h1;->t()Ly33/e;

    move-result-object p0

    iget-object p0, p0, Ly33/e;->d:Lp33/o;

    iput v3, v0, Ld33/r0;->y:I

    invoke-virtual {p0, p1, v0}, Lp33/o;->iceTrickle(Lstream/video/sfu/models/ICETrickle;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Ln23/g;

    invoke-direct {p0, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object p2, Lb23/g;->F:Lb23/g;

    const-string v0, "SafeApiCall"

    invoke-interface {p1, p2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "API call failed: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, p2, v0, v1, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance p1, Ln23/f;

    new-instance p2, Ln23/d;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, "API call failed"

    :cond_5
    invoke-direct {p2, v0, p0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :catch_0
    move-exception p0

    throw p0
.end method

.method public static final f(Ld33/h1;Lio/getstream/video/android/core/model/IceCandidate;Lc43/v;)V
    .locals 7

    iget-object v0, p0, Ld33/h1;->D:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Li53/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld33/h1;->j:Lbc3/c0;

    new-instance v1, La1/h;

    const/16 v6, 0xe

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p0, 0x3

    invoke-static {v0, v5, v5, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_0
    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    iget-object p0, v2, Ld33/h1;->R:Ljava/util/List;

    new-instance p1, Ll83/k;

    invoke-direct {p1, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static final g(Ld33/h1;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 2

    new-instance p0, Lorg/json/JSONArray;

    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final h(Ld33/h1;Lstream/video/sfu/signal/UpdateMuteStatesRequest;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Ld33/g1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld33/g1;

    iget v1, v0, Ld33/g1;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/g1;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/g1;

    invoke-direct {v0, p0, p2}, Ld33/g1;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ld33/g1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/g1;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    invoke-virtual {p0}, Ld33/h1;->t()Ly33/e;

    move-result-object p0

    iget-object p0, p0, Ly33/e;->d:Lp33/o;

    iput v3, v0, Ld33/g1;->y:I

    invoke-virtual {p0, p1, v0}, Lp33/o;->updateMuteStates(Lstream/video/sfu/signal/UpdateMuteStatesRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Ln23/g;

    invoke-direct {p0, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object p2, Lb23/g;->F:Lb23/g;

    const-string v0, "SafeApiCall"

    invoke-interface {p1, p2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "API call failed: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, p2, v0, v1, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance p1, Ln23/f;

    new-instance p2, Ln23/d;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, "API call failed"

    :cond_5
    invoke-direct {p2, v0, p0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :catch_0
    move-exception p0

    throw p0
.end method

.method public static l(Le33/u;)V
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0}, Lorg/webrtc/PeerConnection;->getTransceivers()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v1}, Lorg/webrtc/RtpTransceiver;->stop()V

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Le33/u;->b()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;)Ljava/lang/Object;
    .locals 44

    move-object/from16 v1, p0

    move-object/from16 v0, p4

    iget-object v2, v1, Ld33/h1;->a:Landroid/os/PowerManager;

    const-string v3, "getstats"

    const-string v4, "[sendCallStats] #powerSaveMode state: "

    const-string v5, "[sendCallStats] #thermals state: "

    instance-of v6, v0, Ld33/p0;

    if-eqz v6, :cond_0

    move-object v6, v0

    check-cast v6, Ld33/p0;

    iget v7, v6, Ld33/p0;->J:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Ld33/p0;->J:I

    goto :goto_0

    :cond_0
    new-instance v6, Ld33/p0;

    invoke-direct {v6, v1, v0}, Ld33/p0;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object v0, v6, Ld33/p0;->H:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v6, Ld33/p0;->J:I

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const-string v10, "SafeCall"

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x1

    const-string v15, "Exception occurred: "

    if-eqz v8, :cond_4

    if-eq v8, v13, :cond_3

    if-eq v8, v12, :cond_2

    if-ne v8, v11, :cond_1

    iget-object v2, v6, Ld33/p0;->z:Ljava/io/Serializable;

    check-cast v2, Ljava/util/List;

    iget-object v3, v6, Ld33/p0;->y:Ljava/io/Serializable;

    check-cast v3, Ll83/k;

    iget-object v4, v6, Ld33/p0;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Float;

    iget-object v5, v6, Ld33/p0;->w:Ld33/h1;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v12, v4

    move-object/from16 v16, v9

    const/4 v4, 0x0

    goto/16 :goto_21

    :catchall_0
    move-exception v0

    move-object v2, v3

    move-object v12, v4

    :goto_1
    move-object/from16 v16, v9

    :goto_2
    const/4 v4, 0x0

    goto/16 :goto_25

    :catch_0
    move-exception v0

    move-object v12, v3

    move-object v3, v2

    move-object v2, v12

    move-object v12, v4

    move-object/from16 v16, v9

    :goto_3
    const/4 v4, 0x0

    goto/16 :goto_22

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v2, v6, Ld33/p0;->G:Z

    iget-object v4, v6, Ld33/p0;->F:Lstream/video/sfu/models/AndroidThermalState;

    iget-object v5, v6, Ld33/p0;->E:Ljava/lang/Object;

    check-cast v5, Lh33/a;

    iget-object v8, v6, Ld33/p0;->z:Ljava/io/Serializable;

    check-cast v8, Ll83/k;

    iget-object v12, v6, Ld33/p0;->y:Ljava/io/Serializable;

    check-cast v12, Ljava/lang/Float;

    iget-object v13, v6, Ld33/p0;->x:Ljava/lang/Object;

    check-cast v13, Lt23/u0;

    move/from16 p4, v11

    iget-object v11, v6, Ld33/p0;->w:Ld33/h1;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v43, v4

    move v4, v2

    move-object v2, v8

    move-object/from16 v8, v43

    move-object/from16 v43, v11

    move-object v11, v5

    move-object/from16 v5, v43

    goto/16 :goto_13

    :catchall_1
    move-exception v0

    move-object v2, v8

    move-object/from16 v16, v9

    move-object v5, v11

    goto :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_2b

    :cond_3
    move/from16 p4, v11

    iget-boolean v2, v6, Ld33/p0;->G:Z

    iget-object v4, v6, Ld33/p0;->E:Ljava/lang/Object;

    check-cast v4, Lstream/video/sfu/models/AndroidThermalState;

    iget-object v5, v6, Ld33/p0;->z:Ljava/io/Serializable;

    check-cast v5, Ll83/k;

    iget-object v8, v6, Ld33/p0;->y:Ljava/io/Serializable;

    check-cast v8, Ljava/lang/Float;

    iget-object v11, v6, Ld33/p0;->x:Ljava/lang/Object;

    check-cast v11, Lt23/u0;

    iget-object v13, v6, Ld33/p0;->w:Ld33/h1;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v17, v4

    move v4, v2

    move-object v2, v5

    move-object v5, v8

    move-object/from16 v8, v17

    move/from16 v17, v12

    goto/16 :goto_f

    :catchall_2
    move-exception v0

    move-object v2, v5

    move-object v12, v8

    :goto_4
    move-object/from16 v16, v9

    move-object v5, v13

    goto :goto_2

    :cond_4
    move/from16 p4, v11

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    sget-object v8, Lstream/video/sfu/models/AndroidThermalState;->ANDROID_THERMAL_STATE_UNSPECIFIED:Lstream/video/sfu/models/AndroidThermalState;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_c

    :try_start_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const/16 v16, 0x0

    const/16 v11, 0x1d

    if-lt v0, v11, :cond_6

    if-eqz v2, :cond_5

    :try_start_5
    invoke-virtual {v2}, Landroid/os/PowerManager;->getCurrentThermalStatus()I

    move-result v0

    invoke-static {v0}, Lhg3/i;->v(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object/from16 v12, p2

    move-object/from16 v2, p3

    move-object v5, v1

    goto/16 :goto_1

    :catch_2
    move-exception v0

    move/from16 v17, v12

    :goto_5
    move/from16 v18, v13

    goto/16 :goto_8

    :cond_5
    const/4 v0, 0x0

    goto :goto_6

    :cond_6
    move-object v0, v8

    :goto_6
    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v11

    invoke-virtual {v11}, Lb23/k;->c()Lb23/e;

    move-result-object v14
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move/from16 v17, v12

    :try_start_6
    sget-object v12, Lb23/g;->y:Lb23/g;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move/from16 v18, v13

    :try_start_7
    invoke-virtual {v11}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v14, v12, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-virtual {v11}, Lb23/k;->a()Lb23/j;

    move-result-object v13

    invoke-virtual {v11}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v11

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v13, v12, v11, v5}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :catch_3
    move-exception v0

    goto/16 :goto_8

    :cond_7
    :goto_7
    invoke-static/range {v16 .. v16}, Lhg3/i;->v(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    sget-object v8, Lstream/video/sfu/models/AndroidThermalState;->ANDROID_THERMAL_STATE_NONE:Lstream/video/sfu/models/AndroidThermalState;

    goto/16 :goto_9

    :cond_8
    invoke-static/range {v18 .. v18}, Lhg3/i;->v(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    sget-object v8, Lstream/video/sfu/models/AndroidThermalState;->ANDROID_THERMAL_STATE_LIGHT:Lstream/video/sfu/models/AndroidThermalState;

    goto/16 :goto_9

    :cond_9
    invoke-static/range {v17 .. v17}, Lhg3/i;->v(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    sget-object v8, Lstream/video/sfu/models/AndroidThermalState;->ANDROID_THERMAL_STATE_MODERATE:Lstream/video/sfu/models/AndroidThermalState;

    goto :goto_9

    :cond_a
    invoke-static/range {p4 .. p4}, Lhg3/i;->v(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    sget-object v8, Lstream/video/sfu/models/AndroidThermalState;->ANDROID_THERMAL_STATE_SEVERE:Lstream/video/sfu/models/AndroidThermalState;

    goto :goto_9

    :cond_b
    const/4 v5, 0x4

    invoke-static {v5}, Lhg3/i;->v(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    sget-object v8, Lstream/video/sfu/models/AndroidThermalState;->ANDROID_THERMAL_STATE_CRITICAL:Lstream/video/sfu/models/AndroidThermalState;

    goto :goto_9

    :cond_c
    const/4 v5, 0x5

    invoke-static {v5}, Lhg3/i;->v(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    sget-object v8, Lstream/video/sfu/models/AndroidThermalState;->ANDROID_THERMAL_STATE_EMERGENCY:Lstream/video/sfu/models/AndroidThermalState;

    goto :goto_9

    :cond_d
    const/4 v5, 0x6

    invoke-static {v5}, Lhg3/i;->v(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object v8, Lstream/video/sfu/models/AndroidThermalState;->ANDROID_THERMAL_STATE_SHUTDOWN:Lstream/video/sfu/models/AndroidThermalState;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_9

    :catch_4
    move-exception v0

    goto/16 :goto_5

    :catch_5
    move-exception v0

    move/from16 v17, v12

    move/from16 v18, v13

    const/16 v16, 0x0

    :goto_8
    :try_start_8
    sget-object v5, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v5

    sget-object v11, Lb23/g;->F:Lb23/g;

    invoke-interface {v5, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    if-eqz v5, :cond_e

    :try_start_9
    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v11, v10, v12, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :cond_e
    :goto_9
    if-eqz v2, :cond_f

    :try_start_a
    invoke-virtual {v2}, Landroid/os/PowerManager;->isPowerSaveMode()Z

    move-result v0

    invoke-static {v0}, Lhg3/i;->u(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_a

    :catch_6
    move-exception v0

    goto :goto_c

    :cond_f
    const/4 v0, 0x0

    :goto_a
    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    invoke-virtual {v2}, Lb23/k;->c()Lb23/e;

    move-result-object v5

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v11, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {v2}, Lb23/k;->a()Lb23/j;

    move-result-object v5

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v11, v2, v4}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_10
    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_b

    :cond_11
    move/from16 v11, v16

    :goto_b
    move v2, v11

    goto :goto_d

    :goto_c
    :try_start_b
    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v4, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2
    :try_end_b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_c

    if-eqz v2, :cond_12

    :try_start_c
    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v10, v5, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :cond_12
    move/from16 v2, v16

    :goto_d
    :try_start_d
    iget-object v0, v1, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/n;
    :try_end_d
    .catch Ljava/util/concurrent/CancellationException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    if-eqz v0, :cond_14

    :try_start_e
    iput-object v1, v6, Ld33/p0;->w:Ld33/h1;

    move-object/from16 v4, p1

    iput-object v4, v6, Ld33/p0;->x:Ljava/lang/Object;
    :try_end_e
    .catch Ljava/util/concurrent/CancellationException; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    move-object/from16 v5, p2

    :try_start_f
    iput-object v5, v6, Ld33/p0;->y:Ljava/io/Serializable;
    :try_end_f
    .catch Ljava/util/concurrent/CancellationException; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    move-object/from16 v11, p3

    :try_start_10
    iput-object v11, v6, Ld33/p0;->z:Ljava/io/Serializable;

    iput-object v8, v6, Ld33/p0;->E:Ljava/lang/Object;

    iput-boolean v2, v6, Ld33/p0;->G:Z

    move/from16 v12, v18

    iput v12, v6, Ld33/p0;->J:I

    invoke-virtual {v0, v6}, Le33/n;->x(Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_10
    .catch Ljava/util/concurrent/CancellationException; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    if-ne v0, v7, :cond_13

    :goto_e
    move-object v1, v7

    goto/16 :goto_20

    :cond_13
    move-object v13, v4

    move v4, v2

    move-object v2, v11

    move-object v11, v13

    move-object v13, v1

    :goto_f
    :try_start_11
    check-cast v0, Lh33/a;
    :try_end_11
    .catch Ljava/util/concurrent/CancellationException; {:try_start_11 .. :try_end_11} :catch_1
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    goto :goto_12

    :catchall_4
    move-exception v0

    move-object v12, v5

    goto/16 :goto_4

    :catchall_5
    move-exception v0

    :goto_10
    move-object v12, v5

    move-object/from16 v16, v9

    move-object v2, v11

    const/4 v4, 0x0

    move-object v5, v1

    goto/16 :goto_25

    :catchall_6
    move-exception v0

    :goto_11
    move-object/from16 v11, p3

    goto :goto_10

    :catchall_7
    move-exception v0

    move-object/from16 v5, p2

    goto :goto_11

    :cond_14
    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v11, p3

    move-object v0, v4

    move v4, v2

    move-object v2, v11

    move-object v11, v0

    move-object v13, v1

    const/4 v0, 0x0

    :goto_12
    :try_start_12
    iget-object v12, v13, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Le33/v0;
    :try_end_12
    .catch Ljava/util/concurrent/CancellationException; {:try_start_12 .. :try_end_12} :catch_1
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    if-eqz v12, :cond_16

    :try_start_13
    iput-object v13, v6, Ld33/p0;->w:Ld33/h1;

    iput-object v11, v6, Ld33/p0;->x:Ljava/lang/Object;

    iput-object v5, v6, Ld33/p0;->y:Ljava/io/Serializable;

    iput-object v2, v6, Ld33/p0;->z:Ljava/io/Serializable;

    iput-object v0, v6, Ld33/p0;->E:Ljava/lang/Object;

    iput-object v8, v6, Ld33/p0;->F:Lstream/video/sfu/models/AndroidThermalState;

    iput-boolean v4, v6, Ld33/p0;->G:Z

    move/from16 v14, v17

    iput v14, v6, Ld33/p0;->J:I

    invoke-virtual {v12, v6}, Le33/v0;->r(Ls83/c;)Ljava/lang/Object;

    move-result-object v12
    :try_end_13
    .catch Ljava/util/concurrent/CancellationException; {:try_start_13 .. :try_end_13} :catch_1
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    if-ne v12, v7, :cond_15

    goto :goto_e

    :cond_15
    move-object/from16 v43, v11

    move-object v11, v0

    move-object v0, v12

    move-object v12, v5

    move-object v5, v13

    move-object/from16 v13, v43

    :goto_13
    :try_start_14
    check-cast v0, Lh33/a;

    :goto_14
    move/from16 v19, v4

    move-object/from16 v18, v8

    goto :goto_15

    :catchall_8
    move-exception v0

    goto/16 :goto_1

    :cond_16
    move-object v12, v5

    move-object v5, v13

    move-object v13, v11

    move-object v11, v0

    const/4 v0, 0x0

    goto :goto_14

    :goto_15
    iget-object v4, v5, Ld33/h1;->s:Ll53/m;

    if-eqz v11, :cond_17

    iget-object v8, v11, Lh33/a;->b:Ljava/util/LinkedHashMap;

    goto :goto_16

    :cond_17
    const/4 v8, 0x0

    :goto_16
    invoke-virtual {v4, v8, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v5, Ld33/h1;->t:Ll53/m;

    if-eqz v0, :cond_18

    iget-object v8, v0, Lh33/a;->b:Ljava/util/LinkedHashMap;

    goto :goto_17

    :cond_18
    const/4 v8, 0x0

    :goto_17
    invoke-virtual {v4, v8, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v5, Ld33/h1;->m:Lcom/iterable/iterableapi/g1;

    iget-object v4, v4, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    const-string v8, "<get-values>(...)"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll53/m;

    invoke-virtual {v14}, Ll53/m;->a()Ll53/l;

    move-result-object v14

    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v14, v14, Ll53/l;->a:Ljava/util/List;

    check-cast v14, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 p1, v4

    const/16 v4, 0xa

    invoke-static {v14, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_19
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_19

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll53/k;

    invoke-static {v14}, Lvd/f;->M(Ll53/k;)[Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_19
    invoke-static {v8, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    move-object/from16 v1, p0

    move-object/from16 v4, p1

    goto :goto_18

    :cond_1a
    invoke-static {v8}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v5, v1}, Ld33/h1;->g(Ld33/h1;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Ld33/h1;->s()Lb23/k;

    move-result-object v4

    invoke-virtual {v4}, Lb23/k;->c()Lb23/e;

    move-result-object v8

    sget-object v14, Lb23/g;->y:Lb23/g;

    move-object/from16 p1, v4

    invoke-virtual/range {p1 .. p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v8, v14, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-virtual/range {p1 .. p1}, Lb23/k;->a()Lb23/j;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v8
    :try_end_14
    .catch Ljava/util/concurrent/CancellationException; {:try_start_14 .. :try_end_14} :catch_1
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    move-object/from16 v16, v9

    :try_start_15
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v42, v7

    const-string v7, "[sendCallStats] #sfu; #track; rtc_stats: "

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v14, v8, v7}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1a

    :catchall_9
    move-exception v0

    goto/16 :goto_2

    :cond_1b
    move-object/from16 v42, v7

    move-object/from16 v16, v9

    :goto_1a
    iget-object v4, v5, Ld33/h1;->c:Ljava/lang/String;

    iget-object v7, v5, Ld33/h1;->b:Lt23/c0;

    iget-object v7, v7, Lt23/c0;->E:Ljava/lang/String;
    :try_end_15
    .catch Ljava/util/concurrent/CancellationException; {:try_start_15 .. :try_end_15} :catch_1
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    const-string v8, ""

    if-eqz v13, :cond_1c

    :try_start_16
    sget-object v9, Lc43/v;->w:Lc43/v;

    invoke-static {v13, v9}, Lsb3/a;->t(Lt23/u0;Lc43/v;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v23, v9

    goto :goto_1b

    :cond_1c
    move-object/from16 v23, v8

    :goto_1b
    if-eqz v13, :cond_1d

    sget-object v8, Lc43/v;->x:Lc43/v;

    invoke-static {v13, v8}, Lsb3/a;->t(Lt23/u0;Lc43/v;)Ljava/lang/String;

    move-result-object v8
    :try_end_16
    .catch Ljava/util/concurrent/CancellationException; {:try_start_16 .. :try_end_16} :catch_1
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    :cond_1d
    sget-object v9, Lm83/y;->w:Lm83/y;

    if-eqz v11, :cond_1e

    :try_start_17
    iget-object v11, v11, Lh33/a;->c:Ljava/util/List;

    move-object/from16 v36, v11

    goto :goto_1c

    :cond_1e
    move-object/from16 v36, v9

    :goto_1c
    if-eqz v0, :cond_1f

    iget-object v9, v0, Lh33/a;->c:Ljava/util/List;

    :cond_1f
    move-object/from16 v37, v9

    new-instance v29, Lstream/video/sfu/models/AndroidState;

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v29

    invoke-direct/range {v17 .. v22}, Lstream/video/sfu/models/AndroidState;-><init>(Lstream/video/sfu/models/AndroidThermalState;ZLne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_17
    .catch Ljava/util/concurrent/CancellationException; {:try_start_17 .. :try_end_17} :catch_1
    .catchall {:try_start_17 .. :try_end_17} :catchall_9

    if-eqz v12, :cond_20

    :try_start_18
    new-instance v17, Lstream/video/sfu/signal/Telemetry;

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v0

    new-instance v9, Ljava/lang/Float;

    invoke-direct {v9, v0}, Ljava/lang/Float;-><init>(F)V

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v18, v9

    invoke-direct/range {v17 .. v22}, Lstream/video/sfu/signal/Telemetry;-><init>(Ljava/lang/Float;Lstream/video/sfu/signal/Reconnection;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1e

    :catch_7
    move-exception v0

    goto :goto_1d

    :cond_20
    if-eqz v2, :cond_22

    new-instance v17, Lstream/video/sfu/signal/Telemetry;

    new-instance v30, Lstream/video/sfu/signal/Reconnection;

    iget-object v0, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v31

    iget-object v0, v2, Ll83/k;->x:Ljava/lang/Object;

    move-object/from16 v32, v0

    check-cast v32, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    const/16 v34, 0x4

    const/16 v35, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v30 .. v35}, Lstream/video/sfu/signal/Reconnection;-><init>(FLstream/video/sfu/models/WebsocketReconnectStrategy;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x5

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v19, v30

    invoke-direct/range {v17 .. v22}, Lstream/video/sfu/signal/Telemetry;-><init>(Ljava/lang/Float;Lstream/video/sfu/signal/Reconnection;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_7
    .catchall {:try_start_18 .. :try_end_18} :catchall_9

    goto :goto_1e

    :goto_1d
    :try_start_19
    sget-object v9, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v9

    sget-object v11, Lb23/g;->F:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_21

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v9

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v13

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v9, v11, v10, v13, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_21
    const/16 v31, 0x0

    goto :goto_1f

    :cond_22
    const/16 v17, 0x0

    :goto_1e
    move-object/from16 v31, v17

    :goto_1f
    new-instance v20, Lstream/video/sfu/signal/SendStatsRequest;

    const-string v24, "1.3.6"

    const-string v25, "stream-android"

    const-string v26, "1.28.0"

    const v40, 0x43ac0

    const/16 v41, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v39, 0x0

    move-object/from16 v35, v1

    move-object/from16 v21, v4

    move-object/from16 v38, v7

    move-object/from16 v22, v8

    invoke-direct/range {v20 .. v41}, Lstream/video/sfu/signal/SendStatsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v20

    invoke-virtual {v5}, Ld33/h1;->s()Lb23/k;

    move-result-object v4

    invoke-virtual {v4}, Lb23/k;->c()Lb23/e;

    move-result-object v7

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-virtual {v4}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v8, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_23

    invoke-virtual {v4}, Lb23/k;->a()Lb23/j;

    move-result-object v7

    invoke-virtual {v4}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "[sendCallStats] #sfu; #track; request: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v8, v4, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_19
    .catch Ljava/util/concurrent/CancellationException; {:try_start_19 .. :try_end_19} :catch_1
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    :cond_23
    :try_start_1a
    invoke-virtual {v5}, Ld33/h1;->t()Ly33/e;

    move-result-object v1

    iget-object v1, v1, Ly33/e;->d:Lp33/o;

    iput-object v5, v6, Ld33/p0;->w:Ld33/h1;

    iput-object v12, v6, Ld33/p0;->x:Ljava/lang/Object;

    iput-object v2, v6, Ld33/p0;->y:Ljava/io/Serializable;

    iput-object v3, v6, Ld33/p0;->z:Ljava/io/Serializable;
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_9
    .catchall {:try_start_1a .. :try_end_1a} :catchall_9

    const/4 v4, 0x0

    :try_start_1b
    iput-object v4, v6, Ld33/p0;->E:Ljava/lang/Object;

    iput-object v4, v6, Ld33/p0;->F:Lstream/video/sfu/models/AndroidThermalState;

    move/from16 v7, p4

    iput v7, v6, Ld33/p0;->J:I

    invoke-virtual {v1, v0, v6}, Lp33/o;->sendStats(Lstream/video/sfu/signal/SendStatsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_8
    .catchall {:try_start_1b .. :try_end_1b} :catchall_a

    move-object/from16 v1, v42

    if-ne v0, v1, :cond_24

    :goto_20
    return-object v1

    :cond_24
    move-object v3, v2

    :goto_21
    move-object v2, v3

    goto :goto_24

    :catchall_a
    move-exception v0

    goto :goto_25

    :catch_8
    move-exception v0

    goto :goto_22

    :catch_9
    move-exception v0

    goto/16 :goto_3

    :goto_22
    :try_start_1c
    iget-object v1, v5, Ld33/h1;->n:Ll53/m;

    const-string v6, "send-stats-failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v6}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll53/l;

    iget-object v1, v1, Ll53/l;->b:La3/z0;

    invoke-virtual {v1}, La3/z0;->invoke()Ljava/lang/Object;

    goto :goto_23

    :cond_25
    move-object/from16 v0, v16

    :goto_24
    new-instance v1, Ln23/g;

    invoke-direct {v1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_1c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1c .. :try_end_1c} :catch_1
    .catchall {:try_start_1c .. :try_end_1c} :catchall_a

    goto :goto_26

    :catchall_b
    move-exception v0

    move-object/from16 v16, v9

    const/4 v4, 0x0

    move-object v12, v5

    move-object v5, v13

    goto :goto_25

    :catchall_c
    move-exception v0

    move-object/from16 v5, p2

    move-object/from16 v11, p3

    move-object/from16 v16, v9

    const/4 v4, 0x0

    move-object v12, v5

    move-object v2, v11

    move-object/from16 v5, p0

    :goto_25
    sget-object v1, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v1

    sget-object v3, Lb23/g;->F:Lb23/g;

    const-string v6, "SafeApiCall"

    invoke-interface {v1, v3, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    const-string v8, "API call failed: "

    invoke-static {v8, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v3, v6, v7, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_26
    new-instance v1, Ln23/f;

    new-instance v3, Ln23/d;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_27

    const-string v6, "API call failed"

    :cond_27
    invoke-direct {v3, v6, v0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v3}, Ln23/f;-><init>(Ln23/e;)V

    :goto_26
    invoke-virtual {v5}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    instance-of v6, v1, Ln23/g;

    if-eqz v6, :cond_2a

    check-cast v1, Ln23/g;

    invoke-virtual {v1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object v1

    if-eqz v2, :cond_28

    iget-object v6, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Float;

    goto :goto_27

    :cond_28
    move-object v6, v4

    :goto_27
    if-eqz v2, :cond_29

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    move-object v14, v2

    check-cast v14, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    goto :goto_28

    :cond_29
    move-object v14, v4

    :goto_28
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Success. Response: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Telemetry: connectionTimeSeconds: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reconnectionTimeSeconds: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strategy: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_29

    :cond_2a
    instance-of v2, v1, Ln23/f;

    if-eqz v2, :cond_2b

    check-cast v1, Ln23/f;

    invoke-virtual {v1}, Ln23/f;->e()Ln23/e;

    move-result-object v1

    invoke-virtual {v1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failure. Reason: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_29
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "sendStats: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v5, v0, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2a

    :cond_2b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2c
    :goto_2a
    return-object v16

    :goto_2b
    throw v0
.end method

.method public final C(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Ld33/q0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ld33/q0;

    iget v4, v3, Ld33/q0;->F:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ld33/q0;->F:I

    :goto_0
    move-object v8, v3

    goto :goto_1

    :cond_0
    new-instance v3, Ld33/q0;

    invoke-direct {v3, v0, v2}, Ld33/q0;-><init>(Ld33/h1;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v2, v8, Ld33/q0;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v8, Ld33/q0;->F:I

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    const/high16 v5, 0x447a0000    # 1000.0f

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v9, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v11, :cond_4

    if-eq v4, v9, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v10

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v8, Ld33/q0;->y:Ld33/h1;

    iget-object v4, v8, Ld33/q0;->x:Ljava/lang/Object;

    check-cast v4, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v7, v8, Ld33/q0;->w:Ld33/h1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v4

    move-object v4, v1

    move-object v1, v15

    goto :goto_3

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v10

    :cond_4
    iget-object v1, v8, Ld33/q0;->x:Ljava/lang/Object;

    check-cast v1, Ld33/h1;

    iget-object v4, v8, Ld33/q0;->w:Ld33/h1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v4

    move-object v4, v1

    move-object v1, v15

    goto :goto_2

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Ld33/h1;->b:Lt23/c0;

    if-nez v1, :cond_7

    iput-object v0, v8, Ld33/q0;->w:Ld33/h1;

    iput-object v0, v8, Ld33/q0;->x:Ljava/lang/Object;

    iput v11, v8, Ld33/q0;->F:I

    invoke-virtual {v2, v8}, Lt23/c0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_6

    goto :goto_4

    :cond_6
    move-object v1, v0

    move-object v4, v1

    :goto_2
    check-cast v2, Lt23/u0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-object v1, v1, Ld33/h1;->b:Lt23/c0;

    iget-wide v13, v1, Lt23/c0;->G:J

    sub-long/2addr v6, v13

    long-to-float v1, v6

    div-float/2addr v1, v5

    new-instance v6, Ljava/lang/Float;

    invoke-direct {v6, v1}, Ljava/lang/Float;-><init>(F)V

    iput-object v12, v8, Ld33/q0;->w:Ld33/h1;

    iput-object v12, v8, Ld33/q0;->x:Ljava/lang/Object;

    iput v9, v8, Ld33/q0;->F:I

    const/4 v7, 0x0

    const/4 v9, 0x4

    move-object v5, v2

    invoke-static/range {v4 .. v9}, Ld33/h1;->B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto :goto_4

    :cond_7
    iput-object v0, v8, Ld33/q0;->w:Ld33/h1;

    iput-object v1, v8, Ld33/q0;->x:Ljava/lang/Object;

    iput-object v0, v8, Ld33/q0;->y:Ld33/h1;

    iput v7, v8, Ld33/q0;->F:I

    invoke-virtual {v2, v8}, Lt23/c0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    goto :goto_4

    :cond_8
    move-object v4, v0

    move-object v7, v4

    :goto_3
    check-cast v2, Lt23/u0;

    new-instance v9, Ll83/k;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    iget-object v7, v7, Ld33/h1;->b:Lt23/c0;

    move v11, v5

    iget-wide v5, v7, Lt23/c0;->H:J

    sub-long/2addr v13, v5

    long-to-float v5, v13

    div-float/2addr v5, v11

    new-instance v6, Ljava/lang/Float;

    invoke-direct {v6, v5}, Ljava/lang/Float;-><init>(F)V

    invoke-direct {v9, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v12, v8, Ld33/q0;->w:Ld33/h1;

    iput-object v12, v8, Ld33/q0;->x:Ljava/lang/Object;

    iput-object v12, v8, Ld33/q0;->y:Ld33/h1;

    const/4 v1, 0x4

    iput v1, v8, Ld33/q0;->F:I

    const/4 v6, 0x0

    move-object v7, v9

    const/4 v9, 0x2

    move-object v5, v2

    invoke-static/range {v4 .. v9}, Ld33/h1;->B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    :goto_4
    return-object v3

    :cond_9
    return-object v10
.end method

.method public final D(Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lstream/video/sfu/event/LeaveCallRequest;

    const/4 v4, 0x4

    const/4 v5, 0x0

    iget-object v1, p0, Ld33/h1;->c:Ljava/lang/String;

    const/4 v3, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lstream/video/sfu/event/LeaveCallRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Ld33/h1;->n:Ll53/m;

    const-string v1, "leave-session"

    invoke-virtual {p1, v2, v1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    new-instance v0, Lstream/video/sfu/event/SfuRequest;

    const/16 v5, 0xb

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lstream/video/sfu/event/SfuRequest;-><init>(Lstream/video/sfu/event/JoinRequest;Lstream/video/sfu/event/HealthCheckRequest;Lstream/video/sfu/event/LeaveCallRequest;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Ld33/h1;->t()Ly33/e;

    move-result-object p1

    iget-object p1, p1, Ly33/e;->e:Lh53/f;

    new-instance v1, Lv33/x;

    invoke-direct {v1, v0}, Lv33/x;-><init>(Lstream/video/sfu/event/SfuRequest;)V

    iget-object p1, p1, Lh53/f;->c:Lh53/e;

    invoke-virtual {p1, v1}, Lh53/e;->e(Lv33/x;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final E(Lstream/video/sfu/models/TrackType;Lc43/g;)V
    .locals 2

    iget-object v0, p0, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/v0;

    iget-object v1, p0, Ld33/h1;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1, p1, p2}, Le33/v0;->q(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V

    :cond_0
    invoke-virtual {p0, v1, p1, p2}, Ld33/h1;->G(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V

    return-void
.end method

.method public final F(ZLstream/video/sfu/models/TrackType;)V
    .locals 12

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[setPublishState] #sfu; "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " isEnabled: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Ld33/h1;->M:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v9

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v4, v9}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Ld33/h1;->p:Lbc3/c2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v4}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    new-instance v5, Ld33/t0;

    const/4 v11, 0x0

    iget-object v10, p0, Ld33/h1;->e:Ljava/lang/String;

    move-object v6, p0

    move v8, p1

    move-object v7, p2

    invoke-direct/range {v5 .. v11}, Ld33/t0;-><init>(Ld33/h1;Lstream/video/sfu/models/TrackType;ZLjava/util/Map;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    iget-object p2, v6, Ld33/h1;->j:Lbc3/c0;

    invoke-static {p2, v4, v4, v5, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v6, Ld33/h1;->p:Lbc3/c2;

    return-void
.end method

.method public final G(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V
    .locals 6

    iget-object v0, p0, Ld33/h1;->b:Lt23/c0;

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "sessionId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/g2;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[setTrack] #orphaned-track; Participant not found for sessionId="

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", registering orphaned track (type="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ")"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/TrackType;->getValue()I

    move-result v0

    const-string v2, ":"

    invoke-static {v0, p1, v2}, Lm4/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ld33/s;

    invoke-direct {v3, p1, p2, p3}, Ld33/s;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V

    iget-object p3, p0, Ld33/h1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p3, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ld33/h1;->t:Ll53/m;

    const-string v3, "orphaned-track"

    invoke-virtual {v2, v0, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->z:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p3}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result p3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[registerOrphanedTrack] #orphaned-track; Registered track for sessionId="

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", type="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", total orphaned="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    sget-object p1, Ld33/t;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_8

    const/4 p2, 0x2

    if-eq p1, p2, :cond_6

    const/4 p2, 0x3

    if-eq p1, p2, :cond_4

    const/4 p2, 0x4

    if-eq p1, p2, :cond_4

    const/4 p2, 0x5

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object p3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-interface {p2, v0, p3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "Unspecified track type"

    invoke-interface {p1, v0, p3, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    iget-object p1, v0, Lt23/g2;->t:Lec3/h2;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of p2, p3, Lc43/w;

    if-eqz p2, :cond_5

    move-object v1, p3

    check-cast v1, Lc43/w;

    :cond_5
    invoke-virtual {p1, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_6
    iget-object p1, v0, Lt23/g2;->q:Lec3/h2;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of p2, p3, Lc43/a;

    if-eqz p2, :cond_7

    move-object v1, p3

    check-cast v1, Lc43/a;

    :cond_7
    invoke-virtual {p1, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of p1, p3, Lc43/w;

    if-eqz p1, :cond_9

    check-cast p3, Lc43/w;

    goto :goto_1

    :cond_9
    move-object p3, v1

    :goto_1
    iget-object p1, v0, Lt23/g2;->g:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->z:Lb23/g;

    invoke-interface {p2, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object p2, v0, Lt23/g2;->y:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[setVideoTrack] #sfu; #track; userId: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " track: "

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v3, v2, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    iget-object p1, v0, Lt23/g2;->i:Lec3/h2;

    invoke-virtual {p1, p3}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final H(Z)V
    .locals 8

    iget-object v0, p0, Ld33/h1;->b:Lt23/c0;

    iget-object v1, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->v:Lj53/m;

    iget-object v1, v1, Lj53/m;->j:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->o:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    new-instance v2, La30/u;

    const/4 v7, 0x0

    move-object v3, p0

    move v6, p1

    invoke-direct/range {v2 .. v7}, La30/u;-><init>(Ld33/h1;Ljava/util/List;Ljava/util/List;ZLq83/d;)V

    const/4 p1, 0x3

    iget-object v0, v3, Ld33/h1;->j:Lbc3/c0;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v2, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[setVideoSubscriptions] #sfu; #track; useDefaults: "

    invoke-static {v0, v6}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v4, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final I(Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Ld33/e1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ld33/e1;

    iget v1, v0, Ld33/e1;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/e1;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/e1;

    invoke-direct {v0, p0, p1}, Ld33/e1;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Ld33/e1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/e1;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Ld33/e1;->x:Le33/u;

    iget-object v0, v0, Ld33/e1;->w:Ld33/h1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    invoke-virtual {p0, p1}, Ld33/h1;->n(Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;)Le33/u;

    move-result-object p1

    if-eqz p1, :cond_4

    iput-object p0, v0, Ld33/e1;->w:Ld33/h1;

    iput-object p1, v0, Ld33/e1;->x:Le33/u;

    iput v3, v0, Ld33/e1;->E:I

    invoke-virtual {p0, p1, v0}, Ld33/h1;->r(Le33/u;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    move-object p1, v0

    move-object v0, p0

    :goto_1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ld33/h1;->l(Le33/u;)V

    if-nez p1, :cond_5

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    const-string p1, ""

    :cond_5
    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[throwawayPublisherSdpAndOptions] #sfu; sdp: \n"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    return-object p1
.end method

.method public final J(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Ld33/f1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ld33/f1;

    iget v1, v0, Ld33/f1;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/f1;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/f1;

    invoke-direct {v0, p0, p1}, Ld33/f1;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Ld33/f1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/f1;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Ld33/f1;->x:Le33/u;

    iget-object v0, v0, Ld33/f1;->w:Ld33/h1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->RECV_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    invoke-virtual {p0, p1}, Ld33/h1;->n(Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;)Le33/u;

    move-result-object p1

    if-eqz p1, :cond_5

    iput-object p0, v0, Ld33/f1;->w:Ld33/h1;

    iput-object p1, v0, Ld33/f1;->x:Le33/u;

    iput v3, v0, Ld33/f1;->E:I

    invoke-virtual {p0, p1, v0}, Ld33/h1;->r(Le33/u;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    move-object p1, v0

    move-object v0, p0

    :goto_1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ld33/h1;->l(Le33/u;)V

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    return-object p1

    :cond_5
    :goto_2
    const-string p1, ""

    return-object p1
.end method

.method public final K(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;ZZZ)V
    .locals 7

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, ", sessionId: "

    const-string v5, ", videoEnabled: "

    const-string v6, "[updateMuteState] #sfu; userId: "

    invoke-static {v6, p1, v1, p2, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", audioEnabled: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le33/v0;

    if-eqz p1, :cond_1

    iget-object p1, p1, Le33/v0;->J:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-virtual {p1, p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc43/g;

    goto :goto_0

    :cond_1
    move-object p1, v4

    :goto_0
    if-nez p1, :cond_2

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[getTrack] #sfu; #track; track is null for sessionId: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", type: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, v3, v2, p3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p3, p0, Ld33/h1;->b:Lt23/c0;

    iget-object p3, p3, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p3, p3, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt23/g2;

    if-eqz p2, :cond_3

    iget-object p3, p2, Lt23/g2;->n:Lec3/h2;

    invoke-virtual {p3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eq p3, p6, :cond_3

    iget-object p2, p2, Lt23/g2;->m:Lec3/h2;

    invoke-static {p6, p2, v4}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    :cond_3
    if-eqz p1, :cond_5

    instance-of p2, p1, Lc43/w;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Lc43/w;

    goto :goto_1

    :cond_4
    move-object p2, v4

    :goto_1
    if-eqz p2, :cond_5

    iget-object p2, p2, Lc43/w;->b:Lorg/webrtc/VideoTrack;

    invoke-virtual {p2, p4}, Lorg/webrtc/MediaStreamTrack;->setEnabled(Z)Z

    :cond_5
    if-eqz p1, :cond_7

    instance-of p2, p1, Lc43/a;

    if-eqz p2, :cond_6

    move-object v4, p1

    check-cast v4, Lc43/a;

    :cond_6
    if-eqz v4, :cond_7

    iget-object p1, v4, Lc43/a;->b:Lorg/webrtc/AudioTrack;

    invoke-virtual {p1, p5}, Lorg/webrtc/MediaStreamTrack;->setEnabled(Z)Z

    :cond_7
    return-void
.end method

.method public final i(Lstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ls83/c;)Ljava/io/Serializable;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Ld33/u;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ld33/u;

    iget v3, v2, Ld33/u;->G:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ld33/u;->G:I

    goto :goto_0

    :cond_0
    new-instance v2, Ld33/u;

    invoke-direct {v2, v0, v1}, Ld33/u;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Ld33/u;->E:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Ld33/u;->G:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Ld33/u;->z:Ljava/lang/String;

    iget-object v4, v2, Ld33/u;->y:Ljava/util/List;

    check-cast v4, Ljava/util/List;

    iget-object v5, v2, Ld33/u;->x:Lstream/video/sfu/event/ReconnectDetails;

    iget-object v2, v2, Ld33/u;->w:Ld33/h1;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v3

    move-object v12, v5

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Ld33/u;->y:Ljava/util/List;

    check-cast v4, Ljava/util/List;

    iget-object v6, v2, Ld33/u;->x:Lstream/video/sfu/event/ReconnectDetails;

    iget-object v7, v2, Ld33/u;->w:Ld33/h1;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v20, v6

    move-object v6, v1

    move-object/from16 v1, v20

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v0, v2, Ld33/u;->w:Ld33/h1;

    move-object/from16 v1, p1

    iput-object v1, v2, Ld33/u;->x:Lstream/video/sfu/event/ReconnectDetails;

    move-object/from16 v4, p2

    check-cast v4, Ljava/util/List;

    iput-object v4, v2, Ld33/u;->y:Ljava/util/List;

    iput v6, v2, Ld33/u;->G:I

    invoke-virtual {v0, v2}, Ld33/h1;->J(Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v7, v0

    move-object v6, v4

    move-object/from16 v4, p2

    :goto_1
    check-cast v6, Ljava/lang/String;

    iput-object v7, v2, Ld33/u;->w:Ld33/h1;

    iput-object v1, v2, Ld33/u;->x:Lstream/video/sfu/event/ReconnectDetails;

    move-object v8, v4

    check-cast v8, Ljava/util/List;

    iput-object v8, v2, Ld33/u;->y:Ljava/util/List;

    iput-object v6, v2, Ld33/u;->z:Ljava/lang/String;

    iput v5, v2, Ld33/u;->G:I

    invoke-virtual {v7, v2}, Ld33/h1;->I(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    :goto_2
    return-object v3

    :cond_5
    move-object v12, v1

    move-object v1, v2

    move-object v2, v7

    move-object v7, v6

    :goto_3
    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    iget-object v1, v2, Ld33/h1;->b:Lt23/c0;

    iget-object v6, v1, Lt23/c0;->E:Ljava/lang/String;

    iget-object v5, v2, Ld33/h1;->c:Ljava/lang/String;

    move-object v3, v4

    iget-object v4, v2, Ld33/h1;->f:Ljava/lang/String;

    iget-object v9, v2, Ld33/h1;->C:Lstream/video/sfu/models/ClientDetails;

    if-nez v3, :cond_6

    sget-object v2, Lm83/y;->w:Lm83/y;

    move-object v13, v2

    goto :goto_4

    :cond_6
    move-object v13, v3

    :goto_4
    iget-object v1, v1, Lt23/c0;->L:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "<get-values>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v15

    sget-object v16, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    new-instance v3, Lstream/video/sfu/event/JoinRequest;

    const/16 v18, 0x2440

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v3 .. v19}, Lstream/video/sfu/event/JoinRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method public final j(Lstream/video/sfu/models/TrackType;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p1}, Lstream/video/sfu/models/TrackType;->getValue()I

    move-result p1

    iget-object v0, p0, Ld33/h1;->b:Lt23/c0;

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->m:Ln53/e;

    iget-object v0, v0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/g2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lt23/g2;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    const/16 v3, 0x64

    int-to-double v3, v3

    mul-double/2addr v1, v3

    double-to-int v1, v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final k(Z)V
    .locals 2

    iget-object v0, p0, Ld33/h1;->q:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Ld33/h1;->r:Lbc3/c2;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object p1, p0, Ld33/h1;->G:Lbc3/c2;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    iput-object v1, p0, Ld33/h1;->G:Lbc3/c2;

    iget-object p1, p0, Ld33/h1;->p:Lbc3/c2;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    iput-object v1, p0, Ld33/h1;->p:Lbc3/c2;

    iget-object p1, p0, Ld33/h1;->F:Lbc3/c2;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_4
    iput-object v1, p0, Ld33/h1;->F:Lbc3/c2;

    iget-object p1, p0, Ld33/h1;->l:Ln53/x1;

    invoke-virtual {p1}, Ln53/x1;->b()V

    return-void
.end method

.method public final m(Lstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Lx23/a;Ls83/c;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p4

    instance-of v3, v2, Ld33/w;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ld33/w;

    iget v4, v3, Ld33/w;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ld33/w;->G:I

    :goto_0
    move-object v8, v3

    goto :goto_1

    :cond_0
    new-instance v3, Ld33/w;

    invoke-direct {v3, v1, v2}, Ld33/w;-><init>(Ld33/h1;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v2, v8, Ld33/w;->E:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v8, Ld33/w;->G:I

    const/4 v10, 0x1

    const/4 v7, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v8, Ld33/w;->x:Ljava/lang/Object;

    check-cast v0, Lx23/a;

    iget-object v3, v8, Ld33/w;->w:Ld33/h1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_1
    iget-object v0, v8, Ld33/w;->z:Ljava/lang/String;

    iget-object v3, v8, Ld33/w;->y:Ljava/lang/Object;

    check-cast v3, Li53/j;

    iget-object v4, v8, Ld33/w;->x:Ljava/lang/Object;

    check-cast v4, Lx23/a;

    iget-object v5, v8, Ld33/w;->w:Ld33/h1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_3
    iget-object v0, v8, Ld33/w;->y:Ljava/lang/Object;

    check-cast v0, Lx23/a;

    iget-object v4, v8, Ld33/w;->x:Ljava/lang/Object;

    check-cast v4, Lstream/video/sfu/event/ReconnectDetails;

    iget-object v6, v8, Ld33/w;->w:Ld33/h1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_4
    iget-object v0, v8, Ld33/w;->y:Ljava/lang/Object;

    check-cast v0, Lx23/a;

    iget-object v4, v8, Ld33/w;->x:Ljava/lang/Object;

    check-cast v4, Lstream/video/sfu/event/ReconnectDetails;

    iget-object v9, v8, Ld33/w;->w:Ld33/h1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_2
    move-object v6, v9

    goto/16 :goto_8

    :pswitch_5
    iget-object v0, v8, Ld33/w;->y:Ljava/lang/Object;

    check-cast v0, Lx23/a;

    iget-object v4, v8, Ld33/w;->x:Ljava/lang/Object;

    check-cast v4, Lstream/video/sfu/event/ReconnectDetails;

    iget-object v9, v8, Ld33/w;->w:Ld33/h1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v31, v2

    move-object v2, v0

    move-object/from16 v0, v31

    goto :goto_4

    :pswitch_6
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    sget-object v9, Lb23/g;->z:Lb23/g;

    iget-object v12, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v9, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lstream/video/sfu/event/ReconnectDetails;->getStrategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;

    move-result-object v12

    goto :goto_3

    :cond_1
    move-object v12, v7

    :goto_3
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "[connectInternal] #sfu; #track; reconnect="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v4, v9, v2, v12, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iput-object v1, v8, Ld33/w;->w:Ld33/h1;

    iput-object v0, v8, Ld33/w;->x:Ljava/lang/Object;

    move-object/from16 v2, p3

    iput-object v2, v8, Ld33/w;->y:Ljava/lang/Object;

    iput v10, v8, Ld33/w;->G:I

    move-object/from16 v4, p2

    invoke-virtual {v1, v0, v4, v8}, Ld33/h1;->i(Lstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ls83/c;)Ljava/io/Serializable;

    move-result-object v4

    if-ne v4, v3, :cond_3

    goto/16 :goto_11

    :cond_3
    move-object v9, v4

    move-object v4, v0

    move-object v0, v9

    move-object v9, v1

    :goto_4
    move-object v12, v0

    check-cast v12, Lstream/video/sfu/event/JoinRequest;

    iget-object v13, v9, Ld33/h1;->n:Ll53/m;

    sget-object v0, Ll53/a;->x:[Ll53/a;

    :try_start_0
    invoke-virtual {v12}, Lcom/squareup/wire/l;->adapter()Lcom/squareup/wire/q;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/squareup/wire/q;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->F:Lb23/g;

    const-string v10, "SafeCall"

    invoke-interface {v14, v15, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_4

    sget-object v14, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v11

    const-string v5, "Exception occurred: "

    invoke-static {v5, v11}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v14, v15, v10, v5, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    move-object v0, v7

    :goto_5
    const-string v5, "joinRequest"

    invoke-virtual {v13, v0, v5}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Ld33/h1;->w()V

    invoke-virtual {v9}, Ld33/h1;->t()Ly33/e;

    move-result-object v0

    iget-object v0, v0, Ly33/e;->e:Lh53/f;

    iput-object v9, v8, Ld33/w;->w:Ld33/h1;

    iput-object v4, v8, Ld33/w;->x:Ljava/lang/Object;

    iput-object v2, v8, Ld33/w;->y:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v8, Ld33/w;->G:I

    invoke-virtual {v0}, Lh53/f;->j()Lb23/k;

    move-result-object v5

    iget-object v10, v5, Lb23/k;->c:Lb23/e;

    sget-object v11, Lb23/g;->y:Lb23/g;

    iget-object v13, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v11, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    const-string v13, "[connect] request: "

    if-eqz v10, :cond_5

    iget-object v10, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v10, v11, v5, v14, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v0, v0, Lh53/f;->c:Lh53/e;

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0}, Lh53/e;->d()Lb23/k;

    move-result-object v10

    iget-object v14, v10, Lb23/k;->c:Lb23/e;

    iget-object v15, v10, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v14, v11, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_6

    iget-object v14, v10, Lb23/k;->b:Lb23/j;

    iget-object v10, v10, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v12}, Lstream/video/sfu/event/JoinRequest;->getClient_details()Lstream/video/sfu/models/ClientDetails;

    move-result-object v15

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v14, v11, v10, v6, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v6, v0, Lh53/e;->o:Ljava/lang/Object;

    check-cast v6, Lbc3/k1;

    if-eqz v6, :cond_7

    invoke-interface {v6, v7}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    iget-object v6, v0, Lh53/e;->n:Ljava/lang/Object;

    check-cast v6, Lbc3/c2;

    if-eqz v6, :cond_8

    invoke-virtual {v6, v7}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_8
    iget-object v6, v0, Lh53/e;->e:Ljava/lang/Object;

    check-cast v6, Lc53/a;

    new-instance v10, Lh53/a;

    const/4 v11, 0x3

    invoke-direct {v10, v0, v7, v11}, Lh53/a;-><init>(Lh53/e;Lq83/d;I)V

    invoke-static {v6, v7, v7, v10, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v6

    iput-object v6, v0, Lh53/e;->n:Ljava/lang/Object;

    iget-object v6, v0, Lh53/e;->m:Ljava/lang/Object;

    check-cast v6, Lqg3/d;

    move-object/from16 v16, v12

    new-instance v12, Lx43/c;

    iget-object v10, v0, Lh53/e;->a:Ljava/lang/Object;

    move-object v13, v10

    check-cast v13, Ljava/lang/String;

    iget-object v10, v0, Lh53/e;->b:Ljava/lang/Object;

    move-object v14, v10

    check-cast v14, Ljava/lang/String;

    sget-object v10, Lio/getstream/video/android/model/User;->Companion:Lio/getstream/video/android/model/c;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v21, Lio/getstream/video/android/model/UserType$Anonymous;->INSTANCE:Lio/getstream/video/android/model/UserType$Anonymous;

    new-instance v15, Lio/getstream/video/android/model/User;

    const/16 v29, 0x3f8

    const/16 v30, 0x0

    const-string v19, "!anon"

    const-string v20, "user"

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v18, v15

    invoke-direct/range {v18 .. v30}, Lio/getstream/video/android/model/User;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/UserType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, v0, Lh53/e;->c:Ljava/lang/Object;

    check-cast v0, Lqg3/d;

    iget-object v0, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Le53/d;

    iget-object v0, v0, Le53/d;->a:Ljava/lang/Object;

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    invoke-direct/range {v12 .. v17}, Lx43/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/User;Lstream/video/sfu/event/JoinRequest;Ljava/lang/String;)V

    invoke-virtual {v6}, Lqg3/d;->r()Lb23/k;

    move-result-object v0

    iget-object v10, v0, Lb23/k;->c:Lb23/e;

    sget-object v11, Lb23/g;->x:Lb23/g;

    iget-object v13, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v11, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    iget-object v10, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v15}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v13

    iget-boolean v14, v12, Lrb3/g;->a:Z

    const-string v15, "[onConnect] user.id: \'"

    const-string v1, "\', isReconnection: "

    invoke-static {v15, v13, v1, v14}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v11, v0, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {v6}, Lqg3/d;->s()Ly43/b;

    move-result-object v0

    new-instance v1, Li53/k;

    sget-object v6, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-direct {v1, v12, v6}, Li53/k;-><init>(Lx43/c;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    invoke-virtual {v0, v1, v8}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne v0, v1, :cond_a

    goto :goto_6

    :cond_a
    move-object v0, v5

    :goto_6
    if-ne v0, v1, :cond_b

    goto :goto_7

    :cond_b
    move-object v0, v5

    :goto_7
    if-ne v0, v1, :cond_c

    move-object v5, v0

    :cond_c
    if-ne v5, v3, :cond_d

    goto/16 :goto_11

    :cond_d
    move-object v0, v2

    goto/16 :goto_2

    :goto_8
    new-instance v1, Ld33/m;

    const/4 v2, 0x5

    invoke-direct {v1, v6, v7, v2}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    iput-object v6, v8, Ld33/w;->w:Ld33/h1;

    iput-object v4, v8, Ld33/w;->x:Ljava/lang/Object;

    iput-object v0, v8, Ld33/w;->y:Ljava/lang/Object;

    const/4 v11, 0x3

    iput v11, v8, Ld33/w;->G:I

    const-wide/16 v9, 0x2710

    invoke-static {v9, v10, v1, v8}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_e

    goto/16 :goto_11

    :cond_e
    :goto_9
    move-object v1, v2

    check-cast v1, Li53/j;

    instance-of v2, v1, Li53/a;

    if-eqz v2, :cond_11

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lstream/video/sfu/event/ReconnectDetails;->getStrategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;

    move-result-object v0

    goto :goto_a

    :cond_f
    move-object v0, v7

    :goto_a
    iput-object v7, v8, Ld33/w;->w:Ld33/h1;

    iput-object v7, v8, Ld33/w;->x:Ljava/lang/Object;

    iput-object v7, v8, Ld33/w;->y:Ljava/lang/Object;

    const/4 v1, 0x4

    iput v1, v8, Ld33/w;->G:I

    invoke-virtual {v6, v0, v8}, Ld33/h1;->C(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_10

    goto/16 :goto_11

    :cond_10
    :goto_b
    sget-object v0, Ld33/i1;->a:Ld33/i1;

    goto/16 :goto_14

    :cond_11
    instance-of v2, v1, Li53/i;

    const-string v4, "connect-failed"

    if-eqz v2, :cond_19

    move-object v2, v1

    check-cast v2, Li53/i;

    instance-of v5, v2, Li53/e;

    if-eqz v5, :cond_12

    move-object v2, v1

    check-cast v2, Li53/e;

    iget-object v2, v2, Li53/e;->a:Ln23/c;

    iget-object v2, v2, Ln23/c;->a:Ljava/lang/String;

    const-string v5, "SFU socket disconnected: "

    :goto_c
    invoke-static {v5, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_d

    :cond_12
    instance-of v2, v2, Li53/d;

    if-eqz v2, :cond_13

    move-object v2, v1

    check-cast v2, Li53/d;

    iget-object v2, v2, Li53/d;->a:Ln23/c;

    iget-object v2, v2, Ln23/c;->a:Ljava/lang/String;

    const-string v5, "SFU socket permanently disconnected: "

    goto :goto_c

    :cond_13
    const-string v2, "SFU socket disconnected"

    :goto_d
    invoke-virtual {v6}, Ld33/h1;->s()Lb23/k;

    move-result-object v5

    iget-object v9, v5, Lb23/k;->c:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    iget-object v11, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v9, v10, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_14

    iget-object v9, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    const-string v11, "[connectInternal] "

    invoke-static {v11, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v9, v10, v5, v11, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_14
    iget-object v5, v6, Ld33/h1;->n:Ll53/m;

    invoke-virtual {v5, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v8, Ld33/w;->w:Ld33/h1;

    iput-object v0, v8, Ld33/w;->x:Ljava/lang/Object;

    iput-object v1, v8, Ld33/w;->y:Ljava/lang/Object;

    iput-object v2, v8, Ld33/w;->z:Ljava/lang/String;

    const/4 v4, 0x5

    iput v4, v8, Ld33/w;->G:I

    const/4 v5, 0x0

    move-object v4, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x7

    invoke-static/range {v4 .. v9}, Ld33/h1;->B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v4

    if-ne v5, v3, :cond_15

    goto :goto_11

    :cond_15
    move-object v4, v0

    move-object v3, v1

    move-object v0, v2

    move-object v5, v6

    :goto_e
    check-cast v3, Li53/i;

    instance-of v1, v3, Li53/e;

    if-eqz v1, :cond_16

    const/4 v10, 0x1

    goto :goto_f

    :cond_16
    instance-of v10, v3, Li53/d;

    :goto_f
    if-eqz v10, :cond_18

    iget-object v1, v5, Ld33/h1;->b:Lt23/c0;

    iget-object v1, v1, Lt23/c0;->K:Lv23/a;

    iget-object v1, v1, Lv23/a;->c:Lb30/m;

    if-eqz v4, :cond_17

    iget v2, v4, Lx23/a;->a:I

    goto :goto_10

    :cond_17
    const/4 v2, 0x0

    :goto_10
    const-string v3, "SFU_ERROR"

    const/4 v4, 0x0

    invoke-virtual {v1, v0, v2, v3, v4}, Lb30/m;->G(Ljava/lang/String;ILjava/lang/String;Z)V

    :cond_18
    new-instance v1, Ld33/j1;

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ld33/j1;-><init>(Ljava/lang/Exception;)V

    move-object v0, v1

    goto :goto_14

    :cond_19
    iget-object v1, v6, Ld33/h1;->n:Ll53/m;

    const-string v2, "Connection timed out"

    invoke-virtual {v1, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v8, Ld33/w;->w:Ld33/h1;

    iput-object v0, v8, Ld33/w;->x:Ljava/lang/Object;

    iput-object v7, v8, Ld33/w;->y:Ljava/lang/Object;

    const/4 v1, 0x6

    iput v1, v8, Ld33/w;->G:I

    const/4 v5, 0x0

    move-object v4, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x7

    invoke-static/range {v4 .. v9}, Ld33/h1;->B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1a

    :goto_11
    return-object v3

    :cond_1a
    move-object v3, v4

    :goto_12
    iget-object v1, v3, Ld33/h1;->b:Lt23/c0;

    iget-object v1, v1, Lt23/c0;->K:Lv23/a;

    iget-object v1, v1, Lv23/a;->c:Lb30/m;

    if-eqz v0, :cond_1b

    iget v4, v0, Lx23/a;->a:I

    goto :goto_13

    :cond_1b
    const/4 v4, 0x0

    :goto_13
    const-string v0, "REQUEST_TIMEOUT"

    const-string v2, "SFU connection timed out"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v4, v0, v3}, Lb30/m;->G(Ljava/lang/String;ILjava/lang/String;Z)V

    new-instance v0, Ld33/j1;

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ld33/j1;-><init>(Ljava/lang/Exception;)V

    :goto_14
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;)Le33/u;
    .locals 18

    move-object/from16 v0, p1

    sget-object v1, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    sget-object v3, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->RECV_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    if-eq v0, v3, :cond_0

    return-object v2

    :cond_0
    move-object/from16 v3, p0

    iget-object v4, v3, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v4}, Lt23/c0;->j()Le33/j0;

    move-result-object v4

    new-instance v5, Lorg/webrtc/PeerConnection$RTCConfiguration;

    sget-object v6, Lm83/y;->w:Lm83/y;

    invoke-direct {v5, v6}, Lorg/webrtc/PeerConnection$RTCConfiguration;-><init>(Ljava/util/List;)V

    if-ne v0, v1, :cond_1

    sget-object v0, Lc43/v;->w:Lc43/v;

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_1
    sget-object v0, Lc43/v;->x:Lc43/v;

    goto :goto_0

    :goto_1
    sget-object v8, Ln53/c;->a:Lorg/webrtc/MediaConstraints;

    const-string v0, "mediaConstraints"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll53/m;

    invoke-static {v7}, Luf/c0;->n0(Lc43/v;)Lstream/video/sfu/models/PeerType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll53/m;-><init>(Ljava/lang/String;)V

    new-instance v6, Le33/u;

    sget-object v13, Le33/e0;->w:Le33/e0;

    const/4 v15, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    sget-object v12, Le33/d0;->w:Le33/d0;

    const v14, 0x124f80

    const-string v17, "DummyPeerConnection"

    move-object/from16 v16, v0

    invoke-direct/range {v6 .. v17}, Le33/u;-><init>(Lc43/v;Lorg/webrtc/MediaConstraints;Le33/e;Lc93/m;Lc93/m;Lc93/a;Lc93/a;IZLl53/m;Ljava/lang/String;)V

    invoke-virtual {v4, v5, v6}, Le33/j0;->d(Lorg/webrtc/PeerConnection$RTCConfiguration;Le33/u;)Lorg/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v4}, Le33/j0;->c()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v9, "type "

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " is now monitoring "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v8, v5, v4, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v6, v0}, Le33/u;->h(Lorg/webrtc/PeerConnection;)V

    sget-object v0, Ld33/z;->w:Ld33/z;

    invoke-virtual {v0, v6}, Ld33/z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v6
.end method

.method public final o()Ll83/q;
    .locals 4

    iget-object v0, p0, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/v0;

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-eqz v0, :cond_0

    iget-object v0, v0, Le33/v0;->G:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "<get-values>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le33/n;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v1

    invoke-virtual {v1}, Lorg/webrtc/PeerConnection;->getLocalDescription()Lorg/webrtc/SessionDescription;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v1, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    invoke-virtual {v2, v3, v1}, Le33/n;->r(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    :cond_2
    new-instance v2, Ll83/q;

    iget-object v3, p0, Ld33/h1;->c:Ljava/lang/String;

    invoke-direct {v2, v3, v0, v1}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method

.method public final p(Lstream/video/sfu/event/ReconnectDetails;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Ld33/c0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld33/c0;

    iget v1, v0, Ld33/c0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/c0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/c0;

    invoke-direct {v0, p0, p2}, Ld33/c0;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ld33/c0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/c0;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Ld33/c0;->w:Ld33/h1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Ld33/c0;->w:Ld33/h1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object p2

    iget-object v2, p2, Lb23/k;->c:Lb23/e;

    iget-object v6, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string v2, "[fastReconnect] Starting fast reconnect."

    invoke-interface {p2, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    const-string p2, "fastReconnect"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v6, p0, Ld33/h1;->n:Ll53/m;

    invoke-virtual {v6, v2, p2}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld33/h1;->o()Ll83/q;

    move-result-object p2

    iget-object p2, p2, Ll83/q;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v6, v2, Lb23/k;->c:Lb23/e;

    iget-object v8, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v6, "[fastReconnect] Published tracks: "

    invoke-static {v6, p2}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v2, v7, v8, p2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object p2, p0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le33/n;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Le33/n;->q()Ljava/util/List;

    move-result-object p2

    goto :goto_1

    :cond_6
    move-object p2, v3

    :goto_1
    iput-object p0, v0, Ld33/c0;->w:Ld33/h1;

    iput v5, v0, Ld33/c0;->z:I

    invoke-virtual {p0, p1, p2, v3, v0}, Ld33/h1;->m(Lstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto/16 :goto_4

    :cond_7
    move-object p1, p0

    :goto_2
    check-cast p2, Ld33/k1;

    instance-of v2, p2, Ld33/j1;

    if-eqz v2, :cond_8

    new-instance p1, Ld33/g;

    check-cast p2, Ld33/j1;

    iget-object p2, p2, Ld33/j1;->a:Ljava/lang/Exception;

    invoke-direct {p1, p2}, Ld33/g;-><init>(Ljava/lang/Exception;)V

    return-object p1

    :cond_8
    iget-object p2, p1, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le33/v0;

    if-eqz p2, :cond_9

    iget-object v2, p2, Le33/u;->r:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v6, Lorg/webrtc/PeerConnection$PeerConnectionState;->CLOSED:Lorg/webrtc/PeerConnection$PeerConnectionState;

    if-eq v2, v6, :cond_a

    iget-object p2, p2, Le33/u;->s:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    sget-object v2, Lorg/webrtc/PeerConnection$IceConnectionState;->CLOSED:Lorg/webrtc/PeerConnection$IceConnectionState;

    if-ne p2, v2, :cond_9

    goto :goto_3

    :cond_9
    iget-object p2, p1, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le33/n;

    if-eqz p2, :cond_c

    iget-object v2, p2, Le33/u;->r:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v6, Lorg/webrtc/PeerConnection$PeerConnectionState;->CLOSED:Lorg/webrtc/PeerConnection$PeerConnectionState;

    if-eq v2, v6, :cond_a

    iget-object p2, p2, Le33/u;->s:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    sget-object v2, Lorg/webrtc/PeerConnection$IceConnectionState;->CLOSED:Lorg/webrtc/PeerConnection$IceConnectionState;

    if-ne p2, v2, :cond_c

    :cond_a
    :goto_3
    invoke-virtual {p1}, Ld33/h1;->s()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->E:Lb23/g;

    invoke-interface {p2, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "[fastReconnect] Peer connection is closed \u2014 cannot recover, escalating to rejoin"

    invoke-interface {p1, v1, v0, p2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    sget-object p1, Ld33/h;->a:Ld33/h;

    return-object p1

    :cond_c
    iput-object p1, v0, Ld33/c0;->w:Ld33/h1;

    iput v4, v0, Ld33/c0;->z:I

    invoke-virtual {p1, v0}, Ld33/h1;->z(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_d

    :goto_4
    return-object v1

    :cond_d
    :goto_5
    invoke-virtual {p1, v5}, Ld33/h1;->H(Z)V

    sget-object p1, Ld33/f;->a:Ld33/f;

    return-object p1
.end method

.method public final q()Lorg/webrtc/PeerConnection$RTCConfiguration;
    .locals 4

    sget-object v0, Ln53/c;->a:Lorg/webrtc/MediaConstraints;

    sget-object v0, Lorg/webrtc/PeerConnection$SdpSemantics;->UNIFIED_PLAN:Lorg/webrtc/PeerConnection$SdpSemantics;

    const-string v1, "iceServers"

    iget-object v2, p0, Ld33/h1;->y:Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sdpSemantics"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lorg/webrtc/PeerConnection$RTCConfiguration;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-direct {v1, v3}, Lorg/webrtc/PeerConnection$RTCConfiguration;-><init>(Ljava/util/List;)V

    iput-object v0, v1, Lorg/webrtc/PeerConnection$RTCConfiguration;->sdpSemantics:Lorg/webrtc/PeerConnection$SdpSemantics;

    iput-object v2, v1, Lorg/webrtc/PeerConnection$RTCConfiguration;->iceServers:Ljava/util/List;

    sget-object v0, Lorg/webrtc/PeerConnection$BundlePolicy;->MAXBUNDLE:Lorg/webrtc/PeerConnection$BundlePolicy;

    iput-object v0, v1, Lorg/webrtc/PeerConnection$RTCConfiguration;->bundlePolicy:Lorg/webrtc/PeerConnection$BundlePolicy;

    return-object v1
.end method

.method public final r(Le33/u;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Ld33/d0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld33/d0;

    iget v1, v0, Ld33/d0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/d0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/d0;

    invoke-direct {v0, p0, p2}, Ld33/d0;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ld33/d0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/d0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Ld33/d0;->y:I

    sget-object p2, Ln53/c;->a:Lorg/webrtc/MediaConstraints;

    invoke-virtual {p1, p2, v0}, Le33/u;->d(Lorg/webrtc/MediaConstraints;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ln23/h;

    instance-of p1, p2, Ln23/g;

    if-nez p1, :cond_4

    const-string p1, ""

    return-object p1

    :cond_4
    check-cast p2, Ln23/g;

    iget-object p1, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lorg/webrtc/SessionDescription;

    iget-object p1, p1, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final s()Lb23/k;
    .locals 1

    iget-object v0, p0, Ld33/h1;->u:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final t()Ly33/e;
    .locals 1

    iget-object v0, p0, Ld33/h1;->B:Ly33/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sfuConnectionModule"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final u(Lv33/k;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Ld33/g0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ld33/g0;

    iget v4, v3, Ld33/g0;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ld33/g0;->E:I

    goto :goto_0

    :cond_0
    new-instance v3, Ld33/g0;

    invoke-direct {v3, v0, v2}, Ld33/g0;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Ld33/g0;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Ld33/g0;->E:I

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_1
    iget-object v1, v3, Ld33/g0;->x:Lv33/k;

    iget-object v3, v3, Ld33/g0;->w:Ld33/h1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v9

    goto/16 :goto_3

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lv33/k;->b:Lstream/video/sfu/models/PeerType;

    iget-object v5, v1, Lv33/k;->a:Ljava/lang/String;

    sget-object v10, Lstream/video/sfu/models/PeerType;->PEER_TYPE_PUBLISHER_UNSPECIFIED:Lstream/video/sfu/models/PeerType;

    iget-object v11, v0, Ld33/h1;->A:Lec3/h2;

    const-string v12, "[handleIceTrickle] #sfu; #"

    if-ne v2, v10, :cond_5

    invoke-virtual {v11}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_5

    invoke-virtual {v0}, Ld33/h1;->t()Ly33/e;

    move-result-object v13

    iget-object v13, v13, Ly33/e;->e:Lh53/f;

    iget-object v13, v13, Lh53/f;->d:Lec3/h2;

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    instance-of v13, v13, Li53/a;

    if-eqz v13, :cond_5

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-static {v2}, Lp33/q;->b(Lstream/video/sfu/models/PeerType;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "; publisher is null, adding to pending"

    invoke-static {v12, v2, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v7, v5, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v2, v0, Ld33/h1;->P:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v9

    :cond_5
    sget-object v13, Lstream/video/sfu/models/PeerType;->PEER_TYPE_SUBSCRIBER:Lstream/video/sfu/models/PeerType;

    iget-object v14, v0, Ld33/h1;->z:Lec3/h2;

    if-ne v2, v13, :cond_7

    invoke-virtual {v14}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_7

    invoke-virtual {v0}, Ld33/h1;->t()Ly33/e;

    move-result-object v13

    iget-object v13, v13, Ly33/e;->e:Lh53/f;

    iget-object v13, v13, Lh53/f;->d:Lec3/h2;

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    instance-of v13, v13, Li53/a;

    if-eqz v13, :cond_7

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-static {v2}, Lp33/q;->b(Lstream/video/sfu/models/PeerType;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "; subscriber is null, adding to pending"

    invoke-static {v12, v2, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v7, v5, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v2, v0, Ld33/h1;->Q:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v9

    :cond_7
    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v13

    iget-object v15, v13, Lb23/k;->c:Lb23/e;

    iget-object v7, v13, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v15, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_8

    iget-object v13, v13, Lb23/k;->b:Lb23/j;

    invoke-static {v2}, Lp33/q;->b(Lstream/video/sfu/models/PeerType;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v9

    const-string v9, "; candidate: "

    invoke-static {v12, v15, v9, v5}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v13, v8, v7, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_8
    move-object/from16 v16, v9

    :goto_2
    sget-object v7, Lad3/c;->d:Lad3/b;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lio/getstream/video/android/core/model/IceCandidate;->Companion:Lio/getstream/video/android/core/model/a;

    invoke-virtual {v8}, Lio/getstream/video/android/core/model/a;->serializer()Lwc3/c;

    move-result-object v8

    check-cast v8, Lwc3/b;

    invoke-virtual {v7, v8, v5}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/video/android/core/model/IceCandidate;

    if-ne v2, v10, :cond_b

    invoke-virtual {v11}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le33/n;

    if-eqz v2, :cond_a

    iput-object v0, v3, Ld33/g0;->w:Ld33/h1;

    iput-object v1, v3, Ld33/g0;->x:Lv33/k;

    const/4 v7, 0x1

    iput v7, v3, Ld33/g0;->E:I

    invoke-virtual {v2, v5, v3}, Le33/u;->g(Lio/getstream/video/android/core/model/IceCandidate;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_9

    goto :goto_4

    :cond_9
    move-object v3, v0

    :goto_3
    move-object/from16 v2, v16

    goto :goto_5

    :cond_a
    move-object v3, v0

    move-object v2, v6

    goto :goto_5

    :cond_b
    invoke-virtual {v14}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le33/v0;

    if-eqz v2, :cond_a

    iput-object v0, v3, Ld33/g0;->w:Ld33/h1;

    iput-object v1, v3, Ld33/g0;->x:Lv33/k;

    const/4 v7, 0x2

    iput v7, v3, Ld33/g0;->E:I

    invoke-virtual {v2, v5, v3}, Le33/u;->g(Lio/getstream/video/android/core/model/IceCandidate;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_9

    :goto_4
    return-object v4

    :goto_5
    invoke-virtual {v3}, Ld33/h1;->s()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lv33/k;->b:Lstream/video/sfu/models/PeerType;

    invoke-static {v1}, Lp33/q;->b(Lstream/video/sfu/models/PeerType;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "[handleTrickle] #sfu; #"

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; result: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v7, v5, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    return-object v16
.end method

.method public final v(Lv33/y;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Ld33/h0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld33/h0;

    iget v1, v0, Ld33/h0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/h0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/h0;

    invoke-direct {v0, p0, p2}, Ld33/h0;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ld33/h0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/h0;->y:I

    const/4 v3, 0x1

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object p2

    iget-object v2, p2, Lb23/k;->c:Lb23/e;

    iget-object v5, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v7, "[handleSubscriberOffer] #sfu; #subscriber; event: "

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    invoke-interface {p2, v6, v5, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p2, p0, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object p2, p0, Ld33/h1;->Q:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v4

    :cond_4
    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le33/v0;

    if-eqz p2, :cond_5

    iget-object p1, p1, Lv33/y;->a:Ljava/lang/String;

    iput v3, v0, Ld33/h0;->y:I

    invoke-virtual {p2, p1, v0}, Le33/v0;->n(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    return-object v4
.end method

.method public final w()V
    .locals 5

    iget-object v0, p0, Ld33/h1;->r:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Ld33/h1;->q:Lbc3/c2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object v0, p0, Ld33/h1;->F:Lbc3/c2;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    new-instance v0, Ld33/m;

    const/16 v2, 0xa

    invoke-direct {v0, p0, v1, v2}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    iget-object v2, p0, Ld33/h1;->j:Lbc3/c0;

    const/4 v3, 0x3

    invoke-static {v2, v1, v1, v0, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Ld33/h1;->F:Lbc3/c2;

    new-instance v0, Ld33/m;

    const/16 v4, 0xc

    invoke-direct {v0, p0, v1, v4}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v2, v1, v1, v0, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Ld33/h1;->q:Lbc3/c2;

    new-instance v0, Ld33/m;

    const/16 v4, 0xd

    invoke-direct {v0, p0, v1, v4}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v2, v1, v1, v0, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Ld33/h1;->r:Lbc3/c2;

    return-void
.end method

.method public final x(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Ld33/k0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld33/k0;

    iget v1, v0, Ld33/k0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/k0;->E:I

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ld33/k0;

    invoke-direct {v0, p0, p2}, Ld33/k0;-><init>(Ld33/h1;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p2, v5, Ld33/k0;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ld33/k0;->E:I

    const/4 v7, 0x3

    const/4 v2, 0x2

    const/4 v8, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v8, :cond_4

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    iget-object p1, v5, Ld33/k0;->w:Ld33/h1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v5, Ld33/k0;->x:Ljava/lang/String;

    iget-object v1, v5, Ld33/k0;->w:Ld33/h1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object p2, p1

    move-object p1, v1

    goto :goto_3

    :cond_4
    iget-object p1, v5, Ld33/k0;->x:Ljava/lang/String;

    iget-object v1, v5, Ld33/k0;->w:Ld33/h1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v5, Ld33/k0;->w:Ld33/h1;

    iput-object p1, v5, Ld33/k0;->x:Ljava/lang/String;

    iput v8, v5, Ld33/k0;->E:I

    iget-object p2, p0, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {p2, v5}, Lt23/c0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    goto :goto_4

    :cond_6
    move-object v1, p0

    :goto_2
    check-cast p2, Lt23/u0;

    iput-object v1, v5, Ld33/k0;->w:Ld33/h1;

    iput-object p1, v5, Ld33/k0;->x:Ljava/lang/String;

    iput v2, v5, Ld33/k0;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Ld33/h1;->B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    goto :goto_4

    :goto_3
    iget-object v1, p1, Ld33/h1;->D:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    sget-object v3, Li53/g;->a:Li53/g;

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iput-object p1, v5, Ld33/k0;->w:Ld33/h1;

    iput-object v2, v5, Ld33/k0;->x:Ljava/lang/String;

    iput v7, v5, Ld33/k0;->E:I

    invoke-virtual {p1, p2}, Ld33/h1;->D(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    :goto_4
    return-object v0

    :cond_7
    :goto_5
    invoke-virtual {p1, v8}, Ld33/h1;->k(Z)V

    iget-object p2, p1, Ld33/h1;->L:Lc6/a;

    new-instance v0, Ld33/r;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ld33/r;-><init>(Ld33/h1;I)V

    invoke-virtual {p2, v0}, Lc6/a;->a(Lc93/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final y(Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Ld33/n0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ld33/n0;

    iget v1, v0, Ld33/n0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/n0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/n0;

    invoke-direct {v0, p0, p1}, Ld33/n0;-><init>(Ld33/h1;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ld33/n0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/n0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le33/v0;

    if-eqz p1, :cond_5

    iput v3, v0, Ld33/n0;->y:I

    invoke-virtual {p1, v0}, Le33/v0;->p(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ln23/h;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    return-object p1

    :cond_5
    :goto_2
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/d;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Subscriber is null"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v2, v1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method

.method public final z(Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Ld33/o0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ld33/o0;

    iget v1, v0, Ld33/o0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld33/o0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld33/o0;

    invoke-direct {v0, p0, p1}, Ld33/o0;-><init>(Ld33/h1;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Ld33/o0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld33/o0;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Ld33/o0;->w:Ld33/h1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le33/n;

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v6, v2, Lb23/k;->c:Lb23/e;

    iget-object v7, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->z:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v6, "[fastReconnect] Restarting publisher ICE after fast reconnect"

    invoke-interface {v2, v8, v7, v6, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iput-object p0, v0, Ld33/o0;->w:Ld33/h1;

    iput v5, v0, Ld33/o0;->z:I

    const-string v2, "fastReconnect - network change recovery"

    invoke-virtual {p1, v2, v0}, Le33/n;->w(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, p0

    :goto_1
    iget-object p1, v2, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le33/v0;

    if-eqz p1, :cond_8

    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object p1

    iget-object v5, p1, Lb23/k;->c:Lb23/e;

    iget-object v6, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->z:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v5, "[fastReconnect] Restarting subscriber ICE after fast reconnect"

    invoke-interface {p1, v7, v6, v5, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iput-object v3, v0, Ld33/o0;->w:Ld33/h1;

    iput v4, v0, Ld33/o0;->z:I

    invoke-virtual {v2, v0}, Ld33/h1;->y(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    check-cast p1, Ln23/h;

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
