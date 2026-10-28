.class public final Lt23/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Lec3/h2;

.field public B:Z

.field public final C:Lec3/h2;

.field public D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public final F:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public G:J

.field public H:J

.field public final I:Ll83/p;

.field public J:Le33/j0;

.field public final K:Lv23/a;

.field public final L:Ljava/util/concurrent/ConcurrentHashMap;

.field public final M:Ll83/p;

.field public final N:Lf53/f;

.field public O:Lbc3/c2;

.field public P:J

.field public Q:I

.field public final R:Lmc3/c;

.field public S:Lbc3/c2;

.field public T:Lbc3/c2;

.field public U:Lbc3/c2;

.field public final a:Lt23/b4;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public final e:Ljava/util/Set;

.field public f:I

.field public final g:Lt23/b4;

.field public final h:Lb9/b;

.field public i:Lc6/a;

.field public final j:Ll83/p;

.field public final k:Lbc3/e2;

.field public l:Lbc3/c2;

.field public final m:Landroid/os/PowerManager;

.field public final n:Lhc3/d;

.field public final o:Lec3/w1;

.field public final p:Lt23/s0;

.field public final q:Ll83/p;

.field public final r:Ljava/lang/Object;

.field public final s:Ljava/lang/Object;

.field public final t:Ljava/lang/Object;

.field public final u:Ljava/lang/Object;

.field public final v:Ljava/lang/String;

.field public w:Lq33/a;

.field public final x:La00/g;

.field public final y:Lz7/a;

.field public final z:Lec3/h2;


# direct methods
.method public constructor <init>(Lt23/b4;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/User;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    move-object/from16 v4, p3

    move-object/from16 v2, p4

    const-string v3, "type"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "user"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lt23/c0;->a:Lt23/b4;

    iput-object v5, v1, Lt23/c0;->b:Ljava/lang/String;

    iput-object v4, v1, Lt23/c0;->c:Ljava/lang/String;

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    iput-object v3, v1, Lt23/c0;->e:Ljava/util/Set;

    iput-object v0, v1, Lt23/c0;->g:Lt23/b4;

    new-instance v3, Lb9/b;

    iget-object v6, v0, Lt23/b4;->x:Lbc3/c0;

    invoke-direct {v3, v6}, Lb9/b;-><init>(Lbc3/c0;)V

    iput-object v3, v1, Lt23/c0;->h:Lb9/b;

    new-instance v3, Lc6/a;

    const/4 v11, 0x1

    invoke-direct {v3, v11}, Lc6/a;-><init>(I)V

    iput-object v3, v1, Lt23/c0;->i:Lc6/a;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Call:"

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ":"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v3

    iput-object v3, v1, Lt23/c0;->j:Ll83/p;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v3

    iput-object v3, v1, Lt23/c0;->k:Lbc3/e2;

    iget-object v7, v0, Lt23/b4;->x:Lbc3/c0;

    invoke-interface {v7}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v7

    invoke-interface {v7, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v3

    invoke-static {v3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v10

    iput-object v10, v1, Lt23/c0;->n:Lhc3/d;

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v7, 0x96

    const/4 v8, 0x5

    const/4 v13, 0x0

    invoke-static {v12, v7, v13, v8}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v7

    iput-object v7, v1, Lt23/c0;->o:Lec3/w1;

    new-instance v7, Lt23/s0;

    invoke-direct {v7, v0, v1, v2, v10}, Lt23/s0;-><init>(Lt23/b4;Lt23/c0;Lio/getstream/video/android/model/User;Lhc3/d;)V

    iput-object v7, v1, Lt23/c0;->p:Lt23/s0;

    new-instance v2, Lt23/l;

    const/4 v14, 0x3

    invoke-direct {v2, v1, v14}, Lt23/l;-><init>(Lt23/c0;I)V

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->q:Ll83/p;

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v8, Lt23/l;

    invoke-direct {v8, v1, v12}, Lt23/l;-><init>(Lt23/c0;I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    iput-object v8, v1, Lt23/c0;->r:Ljava/lang/Object;

    new-instance v8, Lt23/l;

    const/4 v9, 0x2

    invoke-direct {v8, v1, v9}, Lt23/l;-><init>(Lt23/c0;I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    iput-object v8, v1, Lt23/c0;->s:Ljava/lang/Object;

    new-instance v8, Lt23/l;

    const/16 v9, 0x9

    invoke-direct {v8, v1, v9}, Lt23/l;-><init>(Lt23/c0;I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    iput-object v8, v1, Lt23/c0;->t:Ljava/lang/Object;

    new-instance v8, Lt23/l;

    const/4 v9, 0x7

    invoke-direct {v8, v1, v9}, Lt23/l;-><init>(Lt23/c0;I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->u:Ljava/lang/Object;

    invoke-static {v5, v6, v4}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->v:Ljava/lang/String;

    new-instance v2, La00/g;

    new-instance v6, Lt23/l;

    const/16 v8, 0x8

    invoke-direct {v6, v1, v8}, Lt23/l;-><init>(Lt23/c0;I)V

    invoke-direct {v2, v6}, La00/g;-><init>(Lt23/l;)V

    iput-object v2, v1, Lt23/c0;->x:La00/g;

    new-instance v2, Lz7/a;

    invoke-direct {v2, v14}, Lz7/a;-><init>(I)V

    iput-object v2, v1, Lt23/c0;->y:Lz7/a;

    invoke-static {v13}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->z:Lec3/h2;

    filled-new-array {v3, v3, v3}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->A:Lec3/h2;

    invoke-static {v13}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->C:Lec3/h2;

    const-string v2, "toString(...)"

    invoke-static {v2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lt23/c0;->D:Ljava/lang/String;

    invoke-static {v2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->E:Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    move-result-object v2

    const-string v3, "newKeySet(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v1, Lt23/c0;->F:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    sget-object v2, Lt23/n;->x:Lt23/n;

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->I:Ll83/p;

    new-instance v2, Lv23/a;

    iget-object v3, v0, Lt23/b4;->w:Landroid/content/Context;

    iget-object v6, v7, Lt23/s0;->m:Ln53/e;

    iget-object v8, v7, Lt23/s0;->h:Lec3/h2;

    iget-object v7, v7, Lt23/s0;->v:Lj53/m;

    iget-object v7, v7, Lj53/m;->j:Lec3/h2;

    iget-object v9, v0, Lt23/b4;->U:Lt23/g1;

    iget-object v9, v9, Lt23/g1;->k:Lz23/c;

    move-object v15, v8

    move-object v8, v7

    move-object v7, v15

    invoke-direct/range {v2 .. v10}, Lv23/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/h2;Lz23/c;Lhc3/d;)V

    iput-object v2, v1, Lt23/c0;->K:Lv23/a;

    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    const-string v3, "CLIENT_CAPABILITY_SUBSCRIBER_VIDEO_PAUSE"

    sget-object v4, Lstream/video/sfu/models/ClientCapability;->CLIENT_CAPABILITY_SUBSCRIBER_VIDEO_PAUSE:Lstream/video/sfu/models/ClientCapability;

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v2, v1, Lt23/c0;->L:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v2, Lt23/r;

    invoke-direct {v2, v1}, Lt23/r;-><init>(Lt23/c0;)V

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->M:Ll83/p;

    new-instance v2, Lf53/f;

    invoke-direct {v2, v1, v11}, Lf53/f;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v1, Lt23/c0;->N:Lf53/f;

    const/16 v2, 0x2710

    iput v2, v1, Lt23/c0;->Q:I

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v2

    iput-object v2, v1, Lt23/c0;->R:Lmc3/c;

    new-instance v2, Lt23/i;

    invoke-direct {v2, v1, v13, v12}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    invoke-static {v10, v13, v13, v2, v14}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :try_start_0
    iget-object v0, v0, Lt23/b4;->w:Landroid/content/Context;

    const-string v2, "power"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Landroid/os/PowerManager;

    if-eqz v2, :cond_0

    check-cast v0, Landroid/os/PowerManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v13, v0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    const-string v4, "SafeCall"

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Exception occurred: "

    invoke-static {v6, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v4, v5, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iput-object v13, v1, Lt23/c0;->m:Landroid/os/PowerManager;

    return-void
.end method

.method public static synthetic m(Lt23/c0;Ls83/c;I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    and-int/2addr p2, v0

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p0, v0, p1}, Lt23/c0;->l(ZLs83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lt23/c0;Lt23/m1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lx23/a;Ls83/c;I)Ljava/lang/Object;
    .locals 11

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, p3

    :goto_1
    and-int/lit8 p1, p7, 0x40

    if-eqz p1, :cond_2

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object v8, p4

    :goto_2
    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    invoke-virtual/range {v2 .. v10}, Lt23/c0;->n(Lt23/m1;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static q(Lt23/c0;)V
    .locals 5

    invoke-virtual {p0}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Lt23/c0;->v:Ljava/lang/String;

    const-string v4, "[leave] #ringing; no args, call_cid:"

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lt23/e0;

    const-string v1, "user"

    invoke-direct {v0, v1}, Lt23/e0;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt23/c0;->i:Lc6/a;

    new-instance v2, Lr5/c;

    const/4 v3, 0x6

    invoke-direct {v2, v3, p0, v0}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lc6/a;->a(Lc93/a;)V

    return-void
.end method

.method public static r(Lt23/c0;Lio/getstream/android/video/generated/models/JoinCallResponse;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lt23/c0;->U:Lbc3/c2;

    iget-object v2, v0, Lt23/c0;->C:Lec3/h2;

    iget-object v3, v0, Lt23/c0;->K:Lv23/a;

    iget-object v4, v0, Lt23/c0;->n:Lhc3/d;

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getStatsOptions()Lio/getstream/android/video/generated/models/StatsOptions;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/StatsOptions;->getReportingIntervalMs()I

    move-result v1

    int-to-long v6, v1

    iget-object v1, v0, Lt23/c0;->l:Lbc3/c2;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    new-instance v1, Lf0/c;

    invoke-direct {v1, v6, v7, v0, v5}, Lf0/c;-><init>(JLt23/c0;Lq83/d;)V

    const/4 v6, 0x3

    invoke-static {v4, v5, v5, v1, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v0, Lt23/c0;->l:Lbc3/c2;

    new-instance v1, Lt23/i;

    const/4 v7, 0x3

    invoke-direct {v1, v0, v5, v7}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    invoke-static {v4, v5, v5, v1, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v0, Lt23/c0;->U:Lbc3/c2;

    iget-object v1, v0, Lt23/c0;->S:Lbc3/c2;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    iget-object v1, v3, Lv23/a;->d:Lw23/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v1, Lw23/p;->g:Lw23/r;

    const-string v8, "session"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v7, Lw23/r;->b:Lec3/r1;

    iget-object v8, v8, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lw23/q;

    iget-object v8, v8, Lw23/q;->a:Lbc3/k1;

    if-eqz v8, :cond_3

    invoke-interface {v8, v5}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    iget-object v8, v7, Lw23/r;->a:Lec3/h2;

    :cond_4
    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lw23/q;

    const/4 v15, 0x0

    const/16 v16, 0x1e

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Lw23/q;->a(Lw23/q;Lbc3/k1;Lbc3/c2;Lbc3/c2;Lx23/f;Lx23/f;I)Lw23/q;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    iget-object v8, v7, Lw23/r;->b:Lec3/r1;

    iget-object v8, v8, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lw23/q;

    iget-object v8, v8, Lw23/q;->a:Lbc3/k1;

    if-eqz v8, :cond_5

    invoke-interface {v8, v5}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_5
    iget-object v8, v1, Lw23/p;->c:Lhc3/d;

    new-instance v9, Lay/u;

    const/16 v10, 0x19

    invoke-direct {v9, v1, v2, v5, v10}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v8, v5, v5, v9, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v12

    iget-object v9, v7, Lw23/r;->a:Lec3/h2;

    :cond_6
    invoke-virtual {v9}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lw23/q;

    const/16 v16, 0x0

    const/16 v17, 0x1e

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Lw23/q;->a(Lw23/q;Lbc3/k1;Lbc3/c2;Lbc3/c2;Lx23/f;Lx23/f;I)Lw23/q;

    move-result-object v7

    invoke-virtual {v9, v1, v7}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, v3, Lv23/a;->f:Lio/sentry/android/replay/video/d;

    iget-object v3, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->v:Lj53/m;

    iget-object v3, v3, Lj53/m;->j:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "participants"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v1, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v7, Lbc3/c2;

    if-eqz v7, :cond_7

    invoke-virtual {v7, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    iget-object v7, v1, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v7, Lhc3/d;

    new-instance v8, Lw23/f;

    invoke-direct {v8, v2, v3, v1, v5}, Lw23/f;-><init>(Lec3/f2;Lec3/f2;Lio/sentry/android/replay/video/d;Lq83/d;)V

    invoke-static {v7, v5, v5, v8, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    new-instance v1, Lt23/v;

    invoke-direct {v1, v0, v5}, Lt23/v;-><init>(Lt23/c0;Lq83/d;)V

    invoke-static {v4, v5, v5, v1, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v0, Lt23/c0;->S:Lbc3/c2;

    iget-object v1, v0, Lt23/c0;->T:Lbc3/c2;

    if-eqz v1, :cond_8

    invoke-virtual {v1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_8
    new-instance v1, Lt23/i;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v5, v2}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    invoke-static {v4, v5, v5, v1, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v0, Lt23/c0;->T:Lbc3/c2;

    iget-object v1, v0, Lt23/c0;->q:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz33/b;

    iget-object v0, v0, Lt23/c0;->N:Lf53/f;

    invoke-virtual {v1, v0}, Lz33/b;->d(Lf53/f;)V

    return-void
.end method


# virtual methods
.method public final a(ZLt23/m1;Ljava/lang/Boolean;Lx23/a;Ls83/c;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    instance-of v4, v3, Lt23/k;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lt23/k;

    iget v5, v4, Lt23/k;->H:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lt23/k;->H:I

    :goto_0
    move-object v11, v4

    goto :goto_1

    :cond_0
    new-instance v4, Lt23/k;

    invoke-direct {v4, v0, v3}, Lt23/k;-><init>(Lt23/c0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v3, v11, Lt23/k;->F:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v11, Lt23/k;->H:I

    const-string v13, "null cannot be cast to non-null type io.getstream.result.Result.Failure"

    const/4 v14, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v15, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v7, :cond_3

    if-eq v5, v6, :cond_2

    if-ne v5, v14, :cond_1

    iget-object v1, v11, Lt23/k;->x:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v2, v11, Lt23/k;->w:Lt23/c0;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v11, Lt23/k;->w:Lt23/c0;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-boolean v1, v11, Lt23/k;->E:Z

    iget-object v2, v11, Lt23/k;->z:Lx23/a;

    iget-object v5, v11, Lt23/k;->y:Ljava/lang/Boolean;

    iget-object v7, v11, Lt23/k;->x:Ljava/lang/Object;

    check-cast v7, Lt23/m1;

    iget-object v8, v11, Lt23/k;->w:Lt23/c0;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v2

    move-object v9, v5

    move-object v2, v7

    move-object v5, v8

    goto/16 :goto_2

    :cond_4
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 v3, 0x0

    iput v3, v0, Lt23/c0;->f:I

    iget-object v3, v0, Lt23/c0;->U:Lbc3/c2;

    if-eqz v3, :cond_5

    invoke-virtual {v3, v15}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_5
    iget-object v3, v0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_6

    new-instance v1, Ln23/f;

    new-instance v2, Ln23/a;

    const-string v3, "Call "

    const-string v4, " has already been joined"

    iget-object v5, v0, Lt23/c0;->v:Ljava/lang/String;

    invoke-static {v3, v5, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1

    :cond_6
    invoke-virtual {v0}, Lt23/c0;->g()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v8, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "[joinInternal] #track; create: "

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v10, ", ring: false, notify: false, createOptions: "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v9, v8, v5, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iput-wide v8, v0, Lt23/c0;->G:J

    iput-object v0, v11, Lt23/k;->w:Lt23/c0;

    iput-object v2, v11, Lt23/k;->x:Ljava/lang/Object;

    move-object/from16 v3, p3

    iput-object v3, v11, Lt23/k;->y:Ljava/lang/Boolean;

    move-object/from16 v5, p4

    iput-object v5, v11, Lt23/k;->z:Lx23/a;

    iput-boolean v1, v11, Lt23/k;->E:Z

    iput v7, v11, Lt23/k;->H:I

    iget-object v7, v0, Lt23/c0;->g:Lt23/b4;

    invoke-virtual {v7, v11}, Lt23/b4;->p(Ls83/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_8

    goto/16 :goto_6

    :cond_8
    move-object v9, v3

    move-object v10, v5

    move-object v3, v7

    move-object v5, v0

    :goto_2
    check-cast v3, Ln23/h;

    instance-of v7, v3, Ln23/g;

    if-nez v7, :cond_9

    invoke-static {v3, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ln23/f;

    return-object v3

    :cond_9
    check-cast v3, Ln23/g;

    iget-object v3, v3, Ln23/g;->a:Ljava/lang/Object;

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    iput-object v7, v5, Lt23/c0;->d:Ljava/lang/String;

    if-nez v2, :cond_b

    if-eqz v1, :cond_a

    new-instance v2, Lt23/m1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_3

    :cond_a
    move-object v2, v15

    :cond_b
    :goto_3
    iput-object v5, v11, Lt23/k;->w:Lt23/c0;

    iput-object v15, v11, Lt23/k;->x:Ljava/lang/Object;

    iput-object v15, v11, Lt23/k;->y:Ljava/lang/Boolean;

    iput-object v15, v11, Lt23/k;->z:Lx23/a;

    iput v6, v11, Lt23/k;->H:I

    const/4 v8, 0x0

    const/16 v12, 0xc

    move-object v6, v2

    invoke-static/range {v5 .. v12}, Lt23/c0;->o(Lt23/c0;Lt23/m1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lx23/a;Ls83/c;I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_c

    goto/16 :goto_6

    :cond_c
    move-object v1, v5

    :goto_4
    move-object v2, v3

    check-cast v2, Ln23/h;

    instance-of v3, v2, Ln23/g;

    if-nez v3, :cond_d

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ln23/f;

    return-object v2

    :cond_d
    move-object v3, v2

    check-cast v3, Ln23/g;

    iget-object v3, v3, Ln23/g;->a:Ljava/lang/Object;

    check-cast v3, Lio/getstream/android/video/generated/models/JoinCallResponse;

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getCredentials()Lio/getstream/android/video/generated/models/Credentials;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/Credentials;->getToken()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getCredentials()Lio/getstream/android/video/generated/models/Credentials;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/SFUResponse;->getUrl()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getCredentials()Lio/getstream/android/video/generated/models/Credentials;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/SFUResponse;->getWsEndpoint()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getCredentials()Lio/getstream/android/video/generated/models/Credentials;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/SFUResponse;->getEdgeName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getCredentials()Lio/getstream/android/video/generated/models/Credentials;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/Credentials;->getIceServers()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/android/video/generated/models/ICEServer;

    invoke-static {v7}, Lse/g;->L(Lio/getstream/android/video/generated/models/ICEServer;)Lc43/e;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_e
    iget-object v3, v1, Lt23/c0;->D:Ljava/lang/String;

    iget-object v7, v1, Lt23/c0;->g:Lt23/b4;

    iget-object v8, v7, Lt23/b4;->y:Ljava/lang/String;

    iget-object v7, v7, Lt23/b4;->E:Ly33/c;

    iget-object v7, v7, Ly33/c;->d:Landroidx/lifecycle/x;

    iget-object v9, v1, Lt23/c0;->a:Lt23/b4;

    iget-object v10, v1, Lt23/c0;->m:Landroid/os/PowerManager;

    iget-object v12, v1, Lt23/c0;->K:Lv23/a;

    iget-object v12, v12, Lv23/a;->c:Lb30/m;

    iget-object v13, v12, Lb30/m;->F:Ljava/lang/Object;

    check-cast v13, La30/w0;

    invoke-virtual {v13, v5}, La30/w0;->O(Ljava/lang/String;)V

    new-instance v16, Ld33/h1;

    const/16 v18, 0x0

    const v30, 0x2ff002

    move-object/from16 v20, v1

    move-object/from16 v21, v3

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    move-object/from16 v17, v9

    move-object/from16 v19, v10

    move-object/from16 v29, v12

    invoke-direct/range {v16 .. v30}, Ld33/h1;-><init>(Lt23/b4;ILandroid/os/PowerManager;Lt23/c0;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lb30/m;I)V

    move-object/from16 v3, v16

    iget-object v5, v1, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v15, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld33/h1;

    if-eqz v3, :cond_f

    iget-object v6, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v6, v6, Lt23/s0;->g:Lec3/h2;

    new-instance v7, Lt23/l2;

    invoke-direct {v7, v3}, Lt23/l2;-><init>(Ld33/h1;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6, v15, v7}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_f
    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld33/h1;

    if-eqz v3, :cond_11

    iput-object v1, v11, Lt23/k;->w:Lt23/c0;

    iput-object v2, v11, Lt23/k;->x:Ljava/lang/Object;

    iput v14, v11, Lt23/k;->H:I

    invoke-virtual {v3, v15, v15, v15, v11}, Ld33/h1;->m(Lstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_10

    :goto_6
    return-object v4

    :cond_10
    move-object/from16 v31, v2

    move-object v2, v1

    move-object/from16 v1, v31

    :goto_7
    check-cast v3, Ld33/k1;

    move-object/from16 v31, v2

    move-object v2, v1

    move-object/from16 v1, v31

    goto :goto_8

    :cond_11
    move-object v3, v15

    :goto_8
    instance-of v4, v3, Ld33/i1;

    if-nez v4, :cond_14

    instance-of v4, v3, Ld33/j1;

    if-eqz v4, :cond_13

    new-instance v1, Ln23/f;

    new-instance v2, Ln23/a;

    check-cast v3, Ld33/j1;

    iget-object v3, v3, Ld33/j1;->a:Ljava/lang/Exception;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_12

    const-string v3, "RtcSession error occurred."

    :cond_12
    invoke-direct {v2, v3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1

    :cond_13
    if-nez v3, :cond_14

    new-instance v1, Ln23/f;

    new-instance v2, Ln23/a;

    const-string v3, "RtcSession was null during connect"

    invoke-direct {v2, v3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1

    :cond_14
    iget-object v3, v1, Lt23/c0;->a:Lt23/b4;

    iget-object v3, v3, Lt23/b4;->U:Lt23/g1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v1, Lt23/c0;->n:Lhc3/d;

    iget-object v5, v3, Lt23/g1;->f:Lec3/h2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v15, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v5, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v6, v5, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt23/d3;

    iget-object v7, v3, Lt23/g1;->i:Lbi/p;

    iget-object v8, v1, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {v7, v8}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v7

    iget-boolean v8, v7, Lj43/c;->a:Z

    instance-of v9, v6, Lt23/z2;

    if-eqz v9, :cond_15

    invoke-virtual {v3, v1}, Lt23/g1;->e(Lt23/c0;)V

    if-eqz v8, :cond_19

    new-instance v5, Lt23/f1;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v1, v15, v6}, Lt23/f1;-><init>(Lt23/g1;Lt23/c0;Lq83/d;I)V

    invoke-static {v4, v15, v15, v5, v14}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_9

    :cond_15
    instance-of v9, v6, Lt23/a3;

    if-eqz v9, :cond_17

    iget-object v4, v5, Lt23/s0;->B0:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-nez v4, :cond_16

    invoke-virtual {v3, v1}, Lt23/g1;->e(Lt23/c0;)V

    :cond_16
    iget-object v4, v7, Lj43/c;->d:Ljava/lang/Class;

    new-instance v5, Lj43/g;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lj43/g;-><init>(I)V

    iget-object v6, v3, Lt23/g1;->a:Lt23/b4;

    iget-object v6, v6, Lt23/b4;->w:Landroid/content/Context;

    invoke-virtual {v5, v6, v4}, Lj43/g;->d(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v4

    if-eqz v8, :cond_19

    if-nez v4, :cond_19

    invoke-virtual {v3}, Lt23/g1;->a()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_19

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v4, "Outgoing call service should already be running"

    invoke-interface {v3, v6, v5, v4, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_9

    :cond_17
    invoke-virtual {v3, v1}, Lt23/g1;->d(Lt23/c0;)V

    if-eqz v8, :cond_18

    new-instance v5, Lt23/f1;

    const/4 v6, 0x1

    invoke-direct {v5, v3, v1, v15, v6}, Lt23/f1;-><init>(Lt23/g1;Lt23/c0;Lq83/d;I)V

    invoke-static {v4, v15, v15, v5, v14}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_9

    :cond_18
    instance-of v3, v6, Lt23/y2;

    if-eqz v3, :cond_19

    invoke-virtual {v5, v15}, Lt23/s0;->k(Ltx/f;)V

    :cond_19
    :goto_9
    check-cast v2, Ln23/g;

    iget-object v2, v2, Ln23/g;->a:Ljava/lang/Object;

    check-cast v2, Lio/getstream/android/video/generated/models/JoinCallResponse;

    invoke-static {v1, v2}, Lt23/c0;->r(Lt23/c0;Lio/getstream/android/video/generated/models/JoinCallResponse;)V

    new-instance v2, Ln23/g;

    iget-object v1, v1, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v2, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v2
.end method

.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lt23/m;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lt23/m;

    iget v1, v0, Lt23/m;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt23/m;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt23/m;

    invoke-direct {v0, p0, p1}, Lt23/m;-><init>(Lt23/c0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lt23/m;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt23/m;->E:I

    const/16 v3, 0xa

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v1, v0, Lt23/m;->x:Ln33/q;

    iget-object v0, v0, Lt23/m;->w:Lt23/c0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_8

    :catchall_0
    move-exception p1

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lt23/m;->w:Lt23/c0;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld33/h1;

    if-eqz p1, :cond_6

    iput-object p0, v0, Lt23/m;->w:Lt23/c0;

    iput v5, v0, Lt23/m;->E:I

    iget-object p1, p1, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le33/n;

    if-eqz p1, :cond_4

    new-instance v2, Lq83/l;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v7

    invoke-direct {v2, v7}, Lq83/l;-><init>(Lq83/d;)V

    invoke-virtual {p1}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v7

    new-instance v8, Ld1/j;

    invoke-direct {v8, v3, p1, v2}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v8}, Lorg/webrtc/PeerConnection;->getStats(Lorg/webrtc/RTCStatsCollectorCallback;)V

    invoke-virtual {v2}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :cond_4
    move-object p1, v6

    :goto_1
    if-ne p1, v1, :cond_5

    goto :goto_7

    :cond_5
    move-object v2, p0

    :goto_2
    :try_start_3
    check-cast p1, Ln33/q;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_5

    :goto_3
    move-object v2, p0

    goto :goto_4

    :catchall_2
    move-exception p1

    goto :goto_3

    :cond_6
    move-object v2, p0

    move-object p1, v6

    goto :goto_5

    :goto_4
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_5
    instance-of v7, p1, Ll83/m;

    if-eqz v7, :cond_7

    move-object p1, v6

    :cond_7
    check-cast p1, Ln33/q;

    :try_start_4
    iget-object v7, v2, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ld33/h1;

    if-eqz v7, :cond_a

    iput-object v2, v0, Lt23/m;->w:Lt23/c0;

    iput-object p1, v0, Lt23/m;->x:Ln33/q;

    iput v4, v0, Lt23/m;->E:I

    iget-object v4, v7, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le33/v0;

    if-eqz v4, :cond_8

    new-instance v7, Lq83/l;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v7, v0}, Lq83/l;-><init>(Lq83/d;)V

    invoke-virtual {v4}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v0

    new-instance v8, Ld1/j;

    invoke-direct {v8, v3, v4, v7}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v8}, Lorg/webrtc/PeerConnection;->getStats(Lorg/webrtc/RTCStatsCollectorCallback;)V

    invoke-virtual {v7}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lr83/a;->w:Lr83/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_6

    :cond_8
    move-object v0, v6

    :goto_6
    if-ne v0, v1, :cond_9

    :goto_7
    return-object v1

    :cond_9
    move-object v1, p1

    move-object p1, v0

    move-object v0, v2

    :goto_8
    :try_start_5
    check-cast p1, Ln33/q;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_b

    :goto_9
    move-object v1, p1

    move-object p1, v0

    move-object v0, v2

    goto :goto_a

    :catchall_3
    move-exception v0

    goto :goto_9

    :cond_a
    move-object v1, p1

    move-object p1, v6

    goto :goto_c

    :goto_a
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_b
    move-object v2, v0

    :goto_c
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_b

    move-object p1, v6

    :cond_b
    check-cast p1, Ln33/q;

    :try_start_6
    iget-object v0, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->s:Lt23/t0;

    invoke-virtual {v0, v1, v5}, Lt23/t0;->a(Ln33/q;Z)V

    iget-object v0, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->s:Lt23/t0;

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3}, Lt23/t0;->a(Ln33/q;Z)V

    iget-object v0, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->s:Lt23/t0;

    invoke-virtual {v0}, Lt23/t0;->b()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_d

    :catchall_4
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_d
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v2}, Lt23/c0;->g()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-interface {v4, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v4, "[collectStats] Failed to update stats: "

    invoke-static {v4, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v7, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    iget-object v0, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v2, Lt23/c0;->A:Lec3/h2;

    iget-object v0, v0, Lt23/s0;->s:Lt23/t0;

    iget-object v0, v0, Lt23/t0;->e:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/s1;

    new-instance v4, Lt23/u0;

    iget-object v5, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v5, v5, Lt23/s0;->s:Lt23/t0;

    invoke-direct {v4, v1, p1, v0, v5}, Lt23/u0;-><init>(Ln33/q;Ln33/q;Lt23/s1;Lt23/t0;)V

    iget-object p1, v2, Lt23/c0;->z:Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v6, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v0, v5, Lt23/t0;->c:Lm63/d;

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v3, v6, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x14

    if-le p1, v0, :cond_d

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v6, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_d
    return-object v4
.end method

.method public final c(Lio/getstream/android/video/generated/models/VideoEvent;)V
    .locals 6

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/c0;->e:Ljava/util/Set;

    const-string v1, "subscriptions"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt23/c0;->e:Ljava/util/Set;

    const-string v2, "subscriptions"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/r1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lt23/r1;->a:Lqm2/c;

    invoke-virtual {v2, p1}, Lqm2/c;->b(Lio/getstream/android/video/generated/models/VideoEvent;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lt23/c0;->o:Lec3/w1;

    invoke-virtual {v1, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to emit event to observers: [event: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    invoke-interface {v2, v3, v1, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final d(Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lt23/o;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lt23/o;

    iget v1, v0, Lt23/o;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt23/o;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt23/o;

    invoke-direct {v0, p0, p1}, Lt23/o;-><init>(Lt23/c0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lt23/o;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt23/o;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lt23/o;->w:Lt23/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lt23/o;->w:Lt23/c0;

    iput v3, v0, Lt23/o;->z:I

    iget-object p1, p0, Lt23/c0;->g:Lt23/b4;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lt23/s3;

    const/4 v3, 0x0

    iget-object v4, p0, Lt23/c0;->b:Ljava/lang/String;

    iget-object v5, p0, Lt23/c0;->c:Ljava/lang/String;

    invoke-direct {v2, p1, v4, v5, v3}, Lt23/s3;-><init>(Lt23/b4;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {p1, v2, v0}, Lt23/b4;->m(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Ln23/h;

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Lio/getstream/android/video/generated/models/GetCallResponse;

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "response"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/GetCallResponse;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v2

    invoke-virtual {v0, v2}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    iget-object v2, v0, Lt23/s0;->L:Lec3/h2;

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/GetCallResponse;->getOwnCapabilities()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/GetCallResponse;->getMembers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lt23/s0;->c(Ljava/util/List;)V

    return-object p1

    :cond_4
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_5

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final e()Lt23/e1;
    .locals 1

    iget-object v0, p0, Lt23/c0;->r:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/e1;

    return-object v0
.end method

.method public final f()Lorg/webrtc/EglBase;
    .locals 2

    iget-object v0, p0, Lt23/c0;->I:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/webrtc/EglBase;

    return-object v0
.end method

.method public final g()Lb23/k;
    .locals 1

    iget-object v0, p0, Lt23/c0;->j:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final h()Lt23/x1;
    .locals 1

    iget-object v0, p0, Lt23/c0;->M:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/x1;

    return-object v0
.end method

.method public final i()Lt23/a2;
    .locals 1

    iget-object v0, p0, Lt23/c0;->s:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/a2;

    return-object v0
.end method

.method public final j()Le33/j0;
    .locals 7

    iget-object v0, p0, Lt23/c0;->J:Le33/j0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lt23/c0;->g:Lt23/b4;

    iget-object v2, v0, Lt23/b4;->w:Landroid/content/Context;

    iget-object v1, v0, Lt23/b4;->K:Lbi/p;

    iget-object v3, p0, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    iget-object v0, v0, Lt23/b4;->O:Lb43/b;

    iget-object v6, v0, Lb43/b;->c:Lorg/webrtc/Logging$Severity;

    new-instance v1, Le33/j0;

    new-instance v3, Lt23/l;

    const/4 v0, 0x4

    invoke-direct {v3, p0, v0}, Lt23/l;-><init>(Lt23/c0;I)V

    new-instance v4, Lt23/l;

    const/4 v0, 0x5

    invoke-direct {v4, p0, v0}, Lt23/l;-><init>(Lt23/c0;I)V

    new-instance v5, Lt23/l;

    const/4 v0, 0x6

    invoke-direct {v5, p0, v0}, Lt23/l;-><init>(Lt23/c0;I)V

    invoke-direct/range {v1 .. v6}, Le33/j0;-><init>(Landroid/content/Context;Lt23/l;Lt23/l;Lt23/l;Lorg/webrtc/Logging$Severity;)V

    iput-object v1, p0, Lt23/c0;->J:Le33/j0;

    :cond_0
    iget-object v0, p0, Lt23/c0;->J:Le33/j0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final k(Lio/getstream/android/video/generated/models/VideoEvent;)V
    .locals 6

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/VideoEvent;->getEventType()Ljava/lang/String;

    move-result-object v1

    const-string v5, "[call handleEvent] #sfu; event.type: "

    invoke-static {v5, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of p1, p1, Lv33/i;

    if-eqz p1, :cond_1

    new-instance p1, Lt23/i;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v4, v0}, Lt23/i;-><init>(Lt23/c0;Lq83/d;I)V

    const/4 v0, 0x3

    iget-object v1, p0, Lt23/c0;->n:Lhc3/d;

    invoke-static {v1, v4, v4, p1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    return-void
.end method

.method public final l(ZLs83/c;)Ljava/lang/Object;
    .locals 55

    move-object/from16 v1, p0

    move/from16 v0, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lt23/p;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lt23/p;

    iget v4, v3, Lt23/p;->J:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lt23/p;->J:I

    goto :goto_0

    :cond_0
    new-instance v3, Lt23/p;

    invoke-direct {v3, v1, v2}, Lt23/p;-><init>(Lt23/c0;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lt23/p;->H:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lt23/p;->J:I

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v10, 0x1

    if-eqz v5, :cond_5

    if-eq v5, v10, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget v0, v3, Lt23/p;->G:I

    iget-boolean v5, v3, Lt23/p;->F:Z

    iget-object v11, v3, Lt23/p;->z:Lkotlin/jvm/internal/g0;

    iget-object v12, v3, Lt23/p;->y:Ljava/lang/Boolean;

    iget-object v13, v3, Lt23/p;->x:Lt23/m1;

    iget-object v14, v3, Lt23/p;->w:Lt23/c0;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v12

    move v12, v8

    move-object v8, v2

    move-object v9, v6

    move v2, v7

    move-object v7, v13

    const/4 v10, 0x0

    move v6, v5

    move-object v5, v14

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v3, Lt23/p;->G:I

    iget-boolean v5, v3, Lt23/p;->F:Z

    iget-object v11, v3, Lt23/p;->E:Lkotlin/jvm/internal/g0;

    iget-object v12, v3, Lt23/p;->z:Lkotlin/jvm/internal/g0;

    iget-object v13, v3, Lt23/p;->y:Ljava/lang/Boolean;

    iget-object v14, v3, Lt23/p;->x:Lt23/m1;

    iget-object v15, v3, Lt23/p;->w:Lt23/c0;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v12

    move v12, v8

    goto/16 :goto_b

    :cond_3
    iget-boolean v0, v3, Lt23/p;->F:Z

    iget-object v5, v3, Lt23/p;->z:Lkotlin/jvm/internal/g0;

    if-nez v5, :cond_4

    iget-object v5, v3, Lt23/p;->y:Ljava/lang/Boolean;

    iget-object v11, v3, Lt23/p;->x:Lt23/m1;

    iget-object v12, v3, Lt23/p;->w:Lt23/c0;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lt23/c0;->K:Lv23/a;

    iget-object v5, v2, Lv23/a;->b:Lb30/m;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v11, "toString(...)"

    invoke-static {v14, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v5, Lb30/m;->E:Ljava/lang/Object;

    check-cast v12, Lso/q;

    iget-object v12, v12, Lso/q;->w:Ljava/lang/Object;

    check-cast v12, Lec3/h2;

    :goto_1
    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    move-object v15, v12

    move-object v12, v13

    check-cast v12, Lw23/h;

    const/16 v17, 0x0

    const/16 v18, 0x1d

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v8, v19

    move-object/from16 v7, v20

    invoke-static/range {v12 .. v18}, Lw23/h;->a(Lw23/h;Ls93/k;Ljava/lang/String;Ljava/lang/String;Lx23/f;Ljava/lang/String;I)Lw23/h;

    move-result-object v12

    invoke-virtual {v8, v7, v12}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2b

    iget-object v7, v5, Lb30/m;->z:Ljava/lang/Object;

    check-cast v7, Lz23/c;

    iget-object v8, v5, Lb30/m;->y:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v5, v5, Lb30/m;->x:Ljava/lang/Object;

    move-object v13, v5

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "callType"

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v7, Lz23/c;->a:La33/d;

    iget-object v7, v7, Lz23/c;->c:Lz23/a;

    sget-object v15, Lb33/d;->x:Lb33/d;

    sget-object v16, Lb33/g;->x:Lb33/g;

    const/16 v31, 0x0

    const v32, 0x7fffb0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v19, v12

    move-object v12, v7

    move-object/from16 v7, v19

    move-object/from16 v19, v14

    move-object v14, v8

    invoke-static/range {v12 .. v32}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v8

    invoke-virtual {v7, v8}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    iget-object v2, v2, Lv23/a;->e:Lb30/m;

    iget-object v7, v2, Lb30/m;->x:Ljava/lang/Object;

    check-cast v7, Landroid/content/Context;

    iget-object v8, v2, Lb30/m;->E:Ljava/lang/Object;

    check-cast v8, Lz23/c;

    iget-object v12, v2, Lb30/m;->y:Ljava/lang/Object;

    move-object/from16 v35, v12

    check-cast v35, Ljava/lang/String;

    iget-object v12, v2, Lb30/m;->z:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v2, v2, Lb30/m;->F:Ljava/lang/Object;

    check-cast v2, Lso/q;

    iget-object v2, v2, Lso/q;->x:Ljava/lang/Object;

    check-cast v2, Lec3/r1;

    iget-object v13, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v13}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lw23/h;

    iget-object v13, v13, Lw23/h;->b:Ljava/lang/String;

    if-nez v13, :cond_6

    const-string v13, "unknown"

    :cond_6
    move-object/from16 v41, v13

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw23/h;

    iget-object v2, v2, Lw23/h;->a:Ls93/k;

    if-nez v2, :cond_7

    sget-object v2, Lx23/e;->w:Lx23/e;

    :cond_7
    move-object/from16 v40, v2

    const-string v2, "android.permission.CAMERA"

    invoke-static {v7, v2}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_8

    move v2, v10

    goto :goto_2

    :cond_8
    const/4 v2, 0x0

    :goto_2
    const-string v13, "android.permission.RECORD_AUDIO"

    invoke-static {v7, v13}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_9

    move v7, v10

    goto :goto_3

    :cond_9
    const/4 v7, 0x0

    :goto_3
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v8, Lz23/c;->a:La33/d;

    iget-object v8, v8, Lz23/c;->c:Lz23/a;

    sget-object v37, Lb33/d;->G:Lb33/d;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v52

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v53

    const v54, 0x4fff80

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    move-object/from16 v39, v5

    move-object/from16 v34, v8

    move-object/from16 v36, v12

    move-object/from16 v38, v16

    invoke-static/range {v34 .. v54}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v2

    invoke-virtual {v11, v2}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    invoke-virtual {v1}, Lt23/c0;->g()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v7, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v5, "[join] #ringing; #track; create: "

    const-string v11, ", ring: false, notify: false, createOptions: null"

    invoke-static {v5, v11, v0}, Lc13/a;->k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v8, v7, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    iget-object v2, v1, Lt23/c0;->g:Lt23/b4;

    iget-object v5, v2, Lt23/b4;->N:Lt9/p;

    iget-object v7, v2, Lt23/b4;->w:Landroid/content/Context;

    invoke-virtual {v5, v7, v1}, Lt9/p;->g(Landroid/content/Context;Lt23/c0;)Ll83/k;

    move-result-object v5

    iget-object v5, v5, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_b

    invoke-virtual {v1}, Lt23/c0;->g()Lb23/k;

    move-result-object v5

    iget-object v7, v5, Lb23/k;->c:Lb23/e;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v11, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_b

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    const-string v7, "\n[Call.join()] called without having the required permissions.\nThis will work only if you have [runForegroundServiceForCalls = false] in the StreamVideoBuilder.\nThe reason is that [Call.join()] will by default start an ongoing call foreground service,\nTo start this service and send the appropriate audio/video tracks the permissions are required,\notherwise the service will fail to start, resulting in a crash.\nYou can re-define your permissions and their expected state by overriding the [permissionCheck] in [StreamVideoBuilder]\n"

    invoke-interface {v5, v11, v8, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    iget-object v2, v2, Lt23/b4;->W:Lbc3/j0;

    if-eqz v2, :cond_c

    iput-object v1, v3, Lt23/p;->w:Lt23/c0;

    iput-object v6, v3, Lt23/p;->x:Lt23/m1;

    iput-object v6, v3, Lt23/p;->y:Ljava/lang/Boolean;

    iput-object v6, v3, Lt23/p;->z:Lkotlin/jvm/internal/g0;

    iput-boolean v0, v3, Lt23/p;->F:Z

    iput v10, v3, Lt23/p;->J:I

    invoke-virtual {v2, v3}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_c

    goto/16 :goto_15

    :goto_4
    move v2, v0

    goto :goto_5

    :cond_c
    move-object v12, v1

    move-object v5, v6

    move-object v11, v5

    goto :goto_4

    :goto_5
    iget-object v0, v12, Lt23/c0;->J:Le33/j0;

    iget-object v7, v12, Lt23/c0;->p:Lt23/s0;

    if-nez v0, :cond_d

    goto/16 :goto_9

    :cond_d
    iget-object v0, v0, Le33/j0;->f:Lstream/video/sfu/models/AudioBitrateProfile;

    invoke-virtual {v12}, Lt23/c0;->h()Lt23/x1;

    move-result-object v8

    iget-object v8, v8, Lt23/x1;->f:Lt23/a2;

    iget-object v8, v8, Lt23/a2;->r:Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lstream/video/sfu/models/AudioBitrateProfile;

    if-eqz v0, :cond_13

    if-eq v8, v0, :cond_13

    invoke-virtual {v12}, Lt23/c0;->g()Lb23/k;

    move-result-object v13

    iget-object v14, v13, Lb23/k;->c:Lb23/e;

    iget-object v15, v13, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->z:Lb23/g;

    invoke-interface {v14, v10, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_e

    iget-object v13, v13, Lb23/k;->b:Lb23/j;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v9, "Audio bitrate profile changed from "

    invoke-direct {v14, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". Recreating factory before joining."

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v13, v10, v15, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_e
    invoke-virtual {v12}, Lt23/c0;->i()Lt23/a2;

    move-result-object v0

    iget-object v0, v0, Lt23/a2;->k:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v8, v0, Lt23/o1;

    invoke-virtual {v12}, Lt23/c0;->e()Lt23/e1;

    move-result-object v0

    iget-object v0, v0, Lt23/e1;->k:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v9, v0, Lt23/o1;

    invoke-virtual {v12}, Lt23/c0;->h()Lt23/x1;

    move-result-object v0

    invoke-virtual {v0}, Lt23/x1;->a()V

    iget-object v10, v12, Lt23/c0;->J:Le33/j0;

    if-eqz v10, :cond_11

    :try_start_0
    invoke-virtual {v10}, Le33/j0;->b()Lorg/webrtc/PeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0}, Lorg/webrtc/PeerConnectionFactory;->dispose()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v14, v6

    goto :goto_6

    :catch_0
    move-exception v0

    invoke-virtual {v10}, Le33/j0;->c()Lb23/k;

    move-result-object v13

    iget-object v14, v13, Lb23/k;->c:Lb23/e;

    iget-object v15, v13, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v6, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_f

    iget-object v13, v13, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v14, "Error disposing factory: "

    invoke-static {v14, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v14, 0x0

    invoke-interface {v13, v6, v15, v0, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_f
    const/4 v14, 0x0

    :goto_6
    iget-object v0, v10, Le33/j0;->p:Lorg/webrtc/audio/JavaAudioDeviceModule;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lorg/webrtc/audio/JavaAudioDeviceModule;->release()V

    :cond_10
    iput-object v14, v10, Le33/j0;->p:Lorg/webrtc/audio/JavaAudioDeviceModule;

    goto :goto_7

    :cond_11
    move-object v14, v6

    :goto_7
    iput-object v14, v12, Lt23/c0;->J:Le33/j0;

    if-eqz v8, :cond_12

    invoke-virtual {v12}, Lt23/c0;->i()Lt23/a2;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lfv/g;

    const/4 v8, 0x2

    const/4 v10, 0x0

    invoke-direct {v6, v10, v0, v8}, Lfv/g;-><init>(ZLjava/lang/Object;I)V

    invoke-virtual {v0, v6, v10}, Lt23/a2;->b(Lc93/a;Z)V

    goto :goto_8

    :cond_12
    const/4 v10, 0x0

    :goto_8
    if-eqz v9, :cond_13

    invoke-virtual {v12}, Lt23/c0;->e()Lt23/e1;

    move-result-object v0

    invoke-virtual {v0, v10}, Lt23/e1;->e(Z)V

    :cond_13
    :goto_9
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v7, Lt23/s0;->g:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lt23/k2;->a:Lt23/k2;

    const/4 v14, 0x0

    invoke-virtual {v0, v14, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lc6/a;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lc6/a;-><init>(I)V

    iput-object v6, v12, Lt23/c0;->i:Lc6/a;

    move v6, v2

    move-object v8, v5

    move-object v7, v11

    move-object v5, v12

    const/4 v2, 0x3

    move-object v11, v0

    const/4 v0, 0x0

    :goto_a
    move-object v10, v3

    if-ge v0, v2, :cond_2a

    new-instance v9, Lx23/a;

    sget-object v2, Lx23/b;->w:Lx23/b;

    invoke-direct {v9, v0, v2}, Lx23/a;-><init>(ILs93/k;)V

    iput-object v5, v10, Lt23/p;->w:Lt23/c0;

    iput-object v7, v10, Lt23/p;->x:Lt23/m1;

    iput-object v8, v10, Lt23/p;->y:Ljava/lang/Boolean;

    iput-object v11, v10, Lt23/p;->z:Lkotlin/jvm/internal/g0;

    iput-object v11, v10, Lt23/p;->E:Lkotlin/jvm/internal/g0;

    iput-boolean v6, v10, Lt23/p;->F:Z

    iput v0, v10, Lt23/p;->G:I

    const/4 v12, 0x2

    iput v12, v10, Lt23/p;->J:I

    invoke-virtual/range {v5 .. v10}, Lt23/c0;->a(ZLt23/m1;Ljava/lang/Boolean;Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_14

    goto/16 :goto_15

    :cond_14
    move-object v15, v5

    move v5, v6

    move-object v14, v7

    move-object v13, v8

    move-object v3, v10

    move-object v6, v11

    :goto_b
    iput-object v2, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v2, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v7, v2, Ln23/g;

    if-eqz v7, :cond_25

    iget-object v0, v15, Lt23/c0;->p:Lt23/s0;

    iget-object v2, v15, Lt23/c0;->t:Ljava/lang/Object;

    iget-object v0, v0, Lt23/s0;->J:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/android/video/generated/models/CallSettingsResponse;

    if-eqz v0, :cond_23

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/h3;

    iget-object v3, v3, Lt23/h3;->e:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lt23/p1;

    if-eqz v3, :cond_1a

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getVideo()Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->getCameraDefaultOn()Z

    move-result v3

    if-nez v3, :cond_17

    invoke-virtual {v15}, Lt23/c0;->e()Lt23/e1;

    move-result-object v3

    iget-object v3, v3, Lt23/e1;->k:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lt23/o1;

    if-eqz v3, :cond_15

    goto :goto_c

    :cond_15
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getAudio()Lio/getstream/android/video/generated/models/AudioSettingsResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->getDefaultDevice()Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

    move-result-object v3

    sget-object v4, Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$Speaker;->INSTANCE:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$Speaker;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getAudio()Lio/getstream/android/video/generated/models/AudioSettingsResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->getSpeakerDefaultOn()Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_c

    :cond_16
    const/4 v3, 0x0

    goto :goto_d

    :cond_17
    :goto_c
    const/4 v3, 0x1

    :goto_d
    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/h3;

    iget-object v4, v2, Lt23/h3;->d:Lec3/h2;

    iget-object v5, v2, Lt23/h3;->a:Lt23/a2;

    iget-object v7, v2, Lt23/h3;->c:Ll83/p;

    invoke-virtual {v7}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb23/k;

    iget-object v8, v7, Lb23/k;->c:Lb23/e;

    iget-object v9, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->z:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_18

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    const-string v8, "setEnabled "

    invoke-static {v8, v3}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    const/4 v14, 0x0

    invoke-interface {v7, v10, v9, v8, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_18
    const/4 v14, 0x0

    :goto_e
    if-eqz v3, :cond_19

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt23/o1;->a:Lt23/o1;

    invoke-virtual {v4, v14, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v3, Lfv/g;

    const/4 v4, 0x3

    const/4 v7, 0x1

    invoke-direct {v3, v2, v7, v4}, Lfv/g;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v5, v3, v7}, Lt23/a2;->b(Lc93/a;Z)V

    goto :goto_f

    :cond_19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt23/n1;->a:Lt23/n1;

    invoke-virtual {v4, v14, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v3, Lfv/g;

    const/4 v4, 0x3

    const/4 v10, 0x0

    invoke-direct {v3, v2, v10, v4}, Lfv/g;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v5, v3, v10}, Lt23/a2;->b(Lc93/a;Z)V

    :cond_1a
    :goto_f
    invoke-virtual {v15}, Lt23/c0;->i()Lt23/a2;

    move-result-object v2

    iget-object v2, v2, Lt23/a2;->q:Lec3/h2;

    new-instance v3, Lo23/p;

    const/16 v4, 0xa

    const/4 v14, 0x0

    invoke-direct {v3, v15, v14, v4}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v4, Lec3/j1;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v3, v5}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v2, v15, Lt23/c0;->n:Lhc3/d;

    invoke-static {v4, v2}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    invoke-virtual {v15}, Lt23/c0;->e()Lt23/e1;

    move-result-object v2

    iget-object v2, v2, Lt23/e1;->k:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lt23/p1;

    if-eqz v2, :cond_21

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getVideo()Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->getCameraFacing()Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

    move-result-object v2

    sget-object v3, Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing$Front;->INSTANCE:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing$Front;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    sget-object v2, Lt23/x0;->a:Lt23/x0;

    goto :goto_10

    :cond_1b
    sget-object v2, Lt23/w0;->a:Lt23/w0;

    :goto_10
    invoke-virtual {v15}, Lt23/c0;->e()Lt23/e1;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Lt23/e1;->m:Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt23/y0;

    const/4 v14, 0x0

    invoke-virtual {v4, v14, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    invoke-virtual {v3}, Lt23/e1;->g()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1c

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v4, "[flip] no args"

    invoke-interface {v2, v7, v5, v4, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1c
    iget-boolean v2, v3, Lt23/e1;->e:Z

    if-nez v2, :cond_1d

    goto :goto_11

    :cond_1d
    iget-object v2, v3, Lt23/e1;->t:Lbc3/c2;

    if-eqz v2, :cond_1e

    invoke-virtual {v3}, Lt23/e1;->g()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v7, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1f

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[flip] job already running"

    const/4 v14, 0x0

    invoke-interface {v2, v7, v4, v3, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_11

    :cond_1e
    const/4 v14, 0x0

    iget-object v2, v3, Lt23/e1;->a:Lt23/x1;

    iget-object v2, v2, Lt23/x1;->c:Lbc3/c0;

    new-instance v4, Lt23/z0;

    invoke-direct {v4, v3, v14}, Lt23/z0;-><init>(Lt23/e1;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {v2, v14, v14, v4, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v2

    iput-object v2, v3, Lt23/e1;->t:Lbc3/c2;

    :cond_1f
    :goto_11
    invoke-virtual {v15}, Lt23/c0;->e()Lt23/e1;

    move-result-object v2

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getVideo()Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->getCameraDefaultOn()Z

    move-result v3

    if-eqz v3, :cond_20

    const/4 v7, 0x1

    invoke-virtual {v2, v7}, Lt23/e1;->e(Z)V

    goto :goto_12

    :cond_20
    invoke-virtual {v2}, Lt23/e1;->c()V

    :cond_21
    :goto_12
    invoke-virtual {v15}, Lt23/c0;->i()Lt23/a2;

    move-result-object v2

    iget-object v2, v2, Lt23/a2;->k:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lt23/p1;->a:Lt23/p1;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getAudio()Lio/getstream/android/video/generated/models/AudioSettingsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->getMicDefaultOn()Z

    move-result v0

    invoke-virtual {v15}, Lt23/c0;->i()Lt23/a2;

    move-result-object v2

    if-eqz v0, :cond_22

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lfv/g;

    const/4 v3, 0x2

    const/4 v7, 0x1

    invoke-direct {v0, v7, v2, v3}, Lfv/g;-><init>(ZLjava/lang/Object;I)V

    const/4 v10, 0x0

    invoke-virtual {v2, v0, v10}, Lt23/a2;->b(Lc93/a;Z)V

    goto :goto_13

    :cond_22
    const/4 v10, 0x0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lm5/k;

    const/4 v3, 0x7

    invoke-direct {v0, v2, v3}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v0, v10}, Lt23/a2;->b(Lc93/a;Z)V

    goto :goto_13

    :cond_23
    invoke-virtual {v15}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_24

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[join] Call settings were null - this should never happen after a callis joined. MediaManager will not be initialised with server settings."

    const/4 v8, 0x0

    invoke-interface {v0, v4, v3, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_24
    :goto_13
    iget-object v0, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object v0

    :cond_25
    const/4 v7, 0x1

    const/4 v8, 0x0

    instance-of v2, v2, Ln23/f;

    if-eqz v2, :cond_28

    iget-object v2, v15, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v2, v8}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v15}, Lt23/c0;->g()Lb23/k;

    move-result-object v2

    iget-object v9, v2, Lb23/k;->c:Lb23/e;

    iget-object v10, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->F:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_26

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    iget-object v9, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    const-string v7, "Join failed with error "

    invoke-static {v9, v7}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v11, v10, v7, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_26
    iget-object v2, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Ln23/f;

    iget-object v2, v2, Ln23/f;->a:Ln23/e;

    const-string v7, "error"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v7, v2, Ln23/d;

    if-eqz v7, :cond_27

    check-cast v2, Ln23/d;

    iget-object v2, v2, Ln23/d;->a:Ljava/lang/String;

    const-string v7, "Unable to resolve host"

    const/4 v10, 0x0

    invoke-static {v2, v7, v10}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_27

    add-int/lit8 v0, v0, 0x1

    goto :goto_14

    :cond_27
    iget-object v2, v15, Lt23/c0;->p:Lt23/s0;

    iget-object v2, v2, Lt23/s0;->g:Lec3/h2;

    new-instance v3, Lt23/j2;

    iget-object v4, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Ln23/f;

    iget-object v4, v4, Ln23/f;->a:Ln23/e;

    invoke-direct {v3, v4}, Lt23/j2;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x0

    invoke-virtual {v2, v14, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v2, v15, Lt23/c0;->K:Lv23/a;

    iget-object v2, v2, Lv23/a;->b:Lb30/m;

    iget-object v3, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Ln23/f;

    iget-object v3, v3, Ln23/f;->a:Ln23/e;

    invoke-virtual {v3}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v3

    const-string v4, "SERVER_ERROR"

    invoke-virtual {v2, v0, v4, v3}, Lb30/m;->F(ILjava/lang/String;Ljava/lang/String;)V

    iget-object v0, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object v0

    :cond_28
    const/4 v10, 0x0

    :goto_14
    add-int/lit8 v2, v0, -0x1

    int-to-long v7, v2

    const-wide/16 v19, 0x3e8

    mul-long v7, v7, v19

    iput-object v15, v3, Lt23/p;->w:Lt23/c0;

    iput-object v14, v3, Lt23/p;->x:Lt23/m1;

    iput-object v13, v3, Lt23/p;->y:Ljava/lang/Boolean;

    iput-object v6, v3, Lt23/p;->z:Lkotlin/jvm/internal/g0;

    const/4 v9, 0x0

    iput-object v9, v3, Lt23/p;->E:Lkotlin/jvm/internal/g0;

    iput-boolean v5, v3, Lt23/p;->F:Z

    iput v0, v3, Lt23/p;->G:I

    const/4 v2, 0x3

    iput v2, v3, Lt23/p;->J:I

    invoke-static {v7, v8, v3}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_29

    :goto_15
    return-object v4

    :cond_29
    move-object v11, v6

    move-object v8, v13

    move-object v7, v14

    move v6, v5

    move-object v5, v15

    goto/16 :goto_a

    :cond_2a
    const/4 v9, 0x0

    iget-object v2, v5, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v2, v9}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v2, v5, Lt23/c0;->p:Lt23/s0;

    iget-object v2, v2, Lt23/s0;->g:Lec3/h2;

    new-instance v3, Lt23/j2;

    const-string v4, "Join failed after 3 retries"

    invoke-direct {v3, v4}, Lt23/j2;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v9, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v2, v5, Lt23/c0;->K:Lv23/a;

    iget-object v2, v2, Lv23/a;->b:Lb30/m;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "RETRY_EXHAUSTED"

    invoke-virtual {v2, v0, v3, v4}, Lb30/m;->F(ILjava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ln23/f;

    new-instance v2, Ln23/a;

    invoke-direct {v2, v4}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0

    :cond_2b
    const/16 v33, 0x3

    move-object v12, v8

    move/from16 v7, v33

    const/4 v8, 0x2

    goto/16 :goto_1
.end method

.method public final n(Lt23/m1;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Lx23/a;Ls83/c;)Ljava/lang/Object;
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    instance-of v3, v2, Lt23/q;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lt23/q;

    iget v4, v3, Lt23/q;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lt23/q;->E:I

    goto :goto_0

    :cond_0
    new-instance v3, Lt23/q;

    invoke-direct {v3, v0, v2}, Lt23/q;-><init>(Lt23/c0;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lt23/q;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lt23/q;->E:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lt23/q;->x:Lx23/a;

    iget-object v3, v3, Lt23/q;->w:Lt23/c0;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lt23/c0;->F:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_3

    move-object/from16 v17, v2

    goto :goto_1

    :cond_3
    const/16 v17, 0x0

    :goto_1
    iget-object v2, v0, Lt23/c0;->K:Lv23/a;

    iget-object v2, v2, Lv23/a;->b:Lb30/m;

    iget-object v9, v1, Lx23/a;->b:Ls93/k;

    iget-object v5, v2, Lb30/m;->E:Ljava/lang/Object;

    check-cast v5, Lso/q;

    iget-object v8, v5, Lso/q;->x:Ljava/lang/Object;

    move-object v15, v8

    check-cast v15, Lec3/r1;

    iget-object v8, v5, Lso/q;->w:Ljava/lang/Object;

    check-cast v8, Lec3/h2;

    sget-object v10, Lx23/b;->w:Lx23/b;

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const-string v11, "toString(...)"

    if-nez v10, :cond_5

    invoke-static {v11}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    :cond_4
    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v18, v10

    check-cast v18, Lw23/h;

    const/16 v23, 0x0

    const/16 v24, 0x1d

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v18 .. v24}, Lw23/h;->a(Lw23/h;Ls93/k;Ljava/lang/String;Ljava/lang/String;Lx23/f;Ljava/lang/String;I)Lw23/h;

    move-result-object v12

    invoke-virtual {v8, v10, v12}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    :cond_5
    iget-object v10, v15, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v10}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lw23/h;

    iget-object v10, v10, Lw23/h;->d:Lx23/f;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    if-eqz v10, :cond_6

    const/4 v12, 0x2

    if-eq v10, v12, :cond_6

    move-object/from16 v18, v4

    goto/16 :goto_3

    :cond_6
    :goto_2
    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v8

    move-object v8, v10

    check-cast v8, Lw23/h;

    const/4 v13, 0x0

    const/16 v14, 0x1e

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v6, v18

    move-object/from16 v18, v4

    move-object v4, v6

    move-object/from16 v6, v16

    move-object/from16 v7, v19

    invoke-static/range {v8 .. v14}, Lw23/h;->a(Lw23/h;Ls93/k;Ljava/lang/String;Ljava/lang/String;Lx23/f;Ljava/lang/String;I)Lw23/h;

    move-result-object v8

    invoke-virtual {v7, v6, v8}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    iget-object v6, v2, Lb30/m;->z:Ljava/lang/Object;

    check-cast v6, Lz23/c;

    iget-object v8, v2, Lb30/m;->y:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v2, v2, Lb30/m;->x:Ljava/lang/Object;

    move-object/from16 v20, v2

    check-cast v20, Ljava/lang/String;

    iget-object v2, v15, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw23/h;

    iget-object v2, v2, Lw23/h;->b:Ljava/lang/String;

    if-nez v2, :cond_7

    const-string v2, "unknown"

    :cond_7
    move-object/from16 v26, v2

    if-nez v9, :cond_8

    sget-object v9, Lx23/e;->w:Lx23/e;

    :cond_8
    move-object/from16 v25, v9

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "callType"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v27, v25

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v24

    iget-object v2, v6, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v23, Lb33/d;->y:Lb33/d;

    new-instance v19, Lb33/j;

    const/16 v31, 0x0

    const/16 v32, 0xf80

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v21, v8

    move-object/from16 v22, v12

    invoke-direct/range {v19 .. v32}, Lb33/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/d;JLjava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/String;Lb33/i;ZI)V

    move-object/from16 v4, v19

    invoke-virtual {v2, v12, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v6, Lz23/c;->a:La33/d;

    iget-object v4, v6, Lz23/c;->c:Lz23/a;

    move-object/from16 v22, v23

    sget-object v23, Lb33/g;->x:Lb33/g;

    const/16 v38, 0x0

    const v39, 0x7fff80

    move-object/from16 v25, v27

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    move-object/from16 v19, v4

    move-object/from16 v24, v12

    invoke-static/range {v19 .. v39}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v4

    invoke-virtual {v2, v4}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    :cond_9
    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lw23/h;

    const/4 v14, 0x0

    const/16 v15, 0x1b

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Lw23/h;->a(Lw23/h;Ls93/k;Ljava/lang/String;Ljava/lang/String;Lx23/f;Ljava/lang/String;I)Lw23/h;

    move-result-object v4

    invoke-virtual {v7, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v2, Lx23/f;->x:Lx23/f;

    invoke-virtual {v5, v2}, Lso/q;->i(Lx23/f;)V

    :goto_3
    if-eqz p1, :cond_a

    const/4 v7, 0x1

    goto :goto_4

    :cond_a
    const/4 v2, 0x0

    move v7, v2

    :goto_4
    if-eqz p1, :cond_b

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v8, v2

    goto :goto_5

    :cond_b
    const/4 v8, 0x0

    :goto_5
    iput-object v0, v3, Lt23/q;->w:Lt23/c0;

    iput-object v1, v3, Lt23/q;->x:Lx23/a;

    const/4 v6, 0x1

    iput v6, v3, Lt23/q;->E:I

    iget-object v4, v0, Lt23/c0;->g:Lt23/b4;

    iget-object v5, v0, Lt23/c0;->b:Ljava/lang/String;

    iget-object v6, v0, Lt23/c0;->c:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v15, p2

    move-object/from16 v16, p3

    move/from16 v13, p4

    move/from16 v14, p5

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move-object/from16 v18, p6

    invoke-virtual/range {v4 .. v19}, Lt23/b4;->s(Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;Ljg3/i;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_c

    return-object v3

    :cond_c
    move-object v3, v0

    :goto_6
    check-cast v2, Ln23/h;

    instance-of v4, v2, Ln23/g;

    if-eqz v4, :cond_10

    move-object v4, v2

    check-cast v4, Ln23/g;

    iget-object v4, v4, Ln23/g;->a:Ljava/lang/Object;

    check-cast v4, Lio/getstream/android/video/generated/models/JoinCallResponse;

    iget-object v5, v3, Lt23/c0;->K:Lv23/a;

    iget-object v5, v5, Lv23/a;->b:Lb30/m;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getCurrentSessionId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "joinAnalyticsModel"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "currentSessionId"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v5, Lb30/m;->E:Ljava/lang/Object;

    check-cast v7, Lso/q;

    iget-object v8, v7, Lso/q;->x:Ljava/lang/Object;

    check-cast v8, Lec3/r1;

    iget-object v9, v8, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v9}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lw23/h;

    iget-object v9, v9, Lw23/h;->d:Lx23/f;

    sget-object v10, Lw23/g;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v10, v9

    const/4 v10, 0x3

    if-ne v9, v10, :cond_f

    iget-object v9, v7, Lso/q;->w:Ljava/lang/Object;

    check-cast v9, Lec3/h2;

    :goto_7
    invoke-virtual {v9}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lw23/h;

    const/4 v12, 0x0

    const/16 v13, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 p6, v6

    move-object/from16 p1, v11

    move-object/from16 p5, v12

    move/from16 p7, v13

    move-object/from16 p2, v14

    move-object/from16 p3, v15

    move-object/from16 p4, v16

    invoke-static/range {p1 .. p7}, Lw23/h;->a(Lw23/h;Ls93/k;Ljava/lang/String;Ljava/lang/String;Lx23/f;Ljava/lang/String;I)Lw23/h;

    move-result-object v6

    move-object/from16 v11, p6

    invoke-virtual {v9, v10, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    iget-object v6, v8, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw23/h;

    iget-object v6, v6, Lw23/h;->c:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_d

    iget-object v6, v5, Lb30/m;->z:Ljava/lang/Object;

    check-cast v6, Lz23/c;

    iget-object v8, v8, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lw23/h;

    iget-object v8, v8, Lw23/h;->c:Ljava/lang/String;

    iget v1, v1, Lx23/a;->a:I

    const/4 v9, 0x0

    const/16 v10, 0x18

    const/4 v12, 0x1

    const/4 v13, 0x0

    move/from16 p4, v1

    move-object/from16 p1, v6

    move-object/from16 p2, v8

    move-object/from16 p6, v9

    move/from16 p8, v10

    move-object/from16 p7, v11

    move/from16 p3, v12

    move-object/from16 p5, v13

    invoke-static/range {p1 .. p8}, Lz23/c;->b(Lz23/c;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    iget-object v1, v5, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lm5/k;

    invoke-virtual {v1}, Lm5/k;->invoke()Ljava/lang/Object;

    :cond_d
    sget-object v1, Lx23/f;->y:Lx23/f;

    invoke-virtual {v7, v1}, Lso/q;->i(Lx23/f;)V

    goto :goto_8

    :cond_e
    move-object v6, v11

    goto :goto_7

    :cond_f
    :goto_8
    iget-object v1, v3, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Lt23/s0;->L:Lec3/h2;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getOwnCapabilities()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v5}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getMembers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, Lt23/s0;->c(Ljava/util/List;)V

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v3

    invoke-virtual {v1, v3}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    return-object v2

    :cond_10
    instance-of v1, v2, Ln23/f;

    if-eqz v1, :cond_11

    return-object v2

    :cond_11
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_12
    move-object v11, v4

    move-object v8, v7

    move-object/from16 v4, v18

    const/4 v6, 0x1

    goto/16 :goto_2
.end method

.method public final p(Lt23/i0;)V
    .locals 5

    invoke-virtual {p0}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Lt23/c0;->v:Ljava/lang/String;

    const-string v4, "[leave] #ringing; call_cid:"

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lt23/c0;->i:Lc6/a;

    new-instance v1, Lr5/c;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p0, p1}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lc6/a;->a(Lc93/a;)V

    return-void
.end method

.method public final s(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v3, p3

    const-string v4, "[reconnect] State is "

    instance-of v5, v3, Lt23/y;

    if-eqz v5, :cond_0

    move-object v5, v3

    check-cast v5, Lt23/y;

    iget v6, v5, Lt23/y;->I:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lt23/y;->I:I

    goto :goto_0

    :cond_0
    new-instance v5, Lt23/y;

    invoke-direct {v5, v1, v3}, Lt23/y;-><init>(Lt23/c0;Ls83/c;)V

    :goto_0
    iget-object v3, v5, Lt23/y;->G:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v5, Lt23/y;->I:I

    const-string v9, " reason="

    sget-object v12, Lt23/p2;->a:Lt23/p2;

    const-string v14, ", finalStrategy: "

    const-string v15, "[reconnect] Free reconnectMutex, initialStrategy: "

    sget-object v16, Ll83/a0;->a:Ll83/a0;

    const-string v13, ")"

    packed-switch v7, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-wide v10, v5, Lt23/y;->F:J

    iget-object v0, v5, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iget-object v2, v5, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iget-object v4, v5, Lt23/y;->y:Ljava/lang/String;

    iget-object v7, v5, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v8, v5, Lt23/y;->w:Lt23/c0;

    :try_start_0
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v5

    move-object/from16 v21, v9

    move-object/from16 v20, v12

    move-object/from16 v19, v13

    move-object/from16 v18, v14

    move-object/from16 v22, v15

    const-wide/16 v13, 0x1f4

    move-object v5, v0

    move-object v0, v4

    move-object v4, v8

    move-object/from16 v25, v6

    move-object v6, v2

    move-object v2, v7

    move-wide v7, v10

    move-object/from16 v10, v25

    goto/16 :goto_1b

    :catchall_0
    move-exception v0

    move-object v6, v2

    move-object v2, v7

    :goto_1
    move-object v9, v14

    move-object v7, v15

    goto/16 :goto_24

    :pswitch_1
    iget-wide v7, v5, Lt23/y;->F:J

    iget-object v0, v5, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iget-object v2, v5, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iget-object v4, v5, Lt23/y;->y:Ljava/lang/String;

    iget-object v10, v5, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v11, v5, Lt23/y;->w:Lt23/c0;

    :try_start_1
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v3, v5

    move-object/from16 v19, v13

    move-object/from16 v18, v14

    move-object/from16 v22, v15

    move-object v5, v0

    move-object v0, v4

    move-object v4, v11

    move-object v11, v6

    move-object v6, v2

    move-object v2, v10

    move-object v10, v12

    const/4 v12, 0x5

    goto/16 :goto_17

    :catchall_1
    move-exception v0

    move-object v6, v2

    move-object v2, v10

    move-object v8, v11

    goto :goto_1

    :pswitch_2
    iget-wide v7, v5, Lt23/y;->F:J

    iget-object v0, v5, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iget-object v2, v5, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iget-object v4, v5, Lt23/y;->y:Ljava/lang/String;

    iget-object v10, v5, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v11, v5, Lt23/y;->w:Lt23/c0;

    :try_start_2
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v1, v11

    move-object/from16 v20, v12

    move-object/from16 v19, v13

    move-object/from16 v18, v14

    move-object/from16 v22, v15

    move-object v11, v6

    move-object v6, v2

    move-object v2, v10

    goto/16 :goto_11

    :pswitch_3
    iget-wide v7, v5, Lt23/y;->F:J

    iget-object v0, v5, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iget-object v2, v5, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iget-object v4, v5, Lt23/y;->y:Ljava/lang/String;

    iget-object v10, v5, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v11, v5, Lt23/y;->w:Lt23/c0;

    :try_start_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v1, v11

    move-object/from16 v20, v12

    move-object/from16 v19, v13

    move-object/from16 v18, v14

    move-object/from16 v22, v15

    move-object v11, v6

    move-object v6, v2

    move-object v2, v10

    goto/16 :goto_13

    :pswitch_4
    iget-wide v7, v5, Lt23/y;->F:J

    iget-object v0, v5, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iget-object v2, v5, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iget-object v4, v5, Lt23/y;->y:Ljava/lang/String;

    iget-object v10, v5, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v11, v5, Lt23/y;->w:Lt23/c0;

    :try_start_4
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v1, v11

    move-object/from16 v20, v12

    move-object/from16 v19, v13

    move-object/from16 v18, v14

    move-object/from16 v22, v15

    move-object v11, v6

    move-object v6, v2

    move-object v2, v10

    goto/16 :goto_14

    :pswitch_5
    iget-wide v7, v5, Lt23/y;->F:J

    iget-object v0, v5, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iget-object v2, v5, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iget-object v4, v5, Lt23/y;->y:Ljava/lang/String;

    iget-object v10, v5, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v11, v5, Lt23/y;->w:Lt23/c0;

    :try_start_5
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-object v3, v6

    move-object v6, v2

    move-object v2, v10

    move-object v10, v3

    move-object v3, v5

    move-object/from16 v20, v12

    move-object/from16 v18, v14

    move-object/from16 v22, v15

    move-object v5, v0

    move-object v0, v4

    move-object v4, v11

    goto/16 :goto_c

    :pswitch_6
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v7, v3, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt23/q2;

    invoke-virtual {v1}, Lt23/c0;->g()Lb23/k;

    move-result-object v8

    invoke-virtual {v8}, Lb23/k;->c()Lb23/e;

    move-result-object v10

    sget-object v11, Lb23/g;->y:Lb23/g;

    move-object/from16 v18, v5

    invoke-virtual {v8}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v8}, Lb23/k;->a()Lb23/j;

    move-result-object v5

    invoke-virtual {v8}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    move-object/from16 v19, v6

    const-string v6, "[reconnect] Entry \u2014 strategy="

    invoke-direct {v10, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " connection="

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v11, v8, v6}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    move-object/from16 v19, v6

    :goto_2
    iget-boolean v5, v1, Lt23/c0;->B:Z

    if-nez v5, :cond_2

    instance-of v5, v7, Lt23/i2;

    if-eqz v5, :cond_3

    :cond_2
    move-object v12, v13

    goto/16 :goto_25

    :cond_3
    iget-object v5, v1, Lt23/c0;->R:Lmc3/c;

    invoke-interface {v5}, Lmc3/a;->tryLock()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v1}, Lt23/c0;->g()Lb23/k;

    move-result-object v2

    invoke-virtual {v2}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v11, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    const-string v4, "[reconnect] Active reconnect loop running \u2014 skipping ("

    invoke-static {v4, v0, v13}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v11, v2, v0}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    :cond_4
    move-object v3, v1

    goto/16 :goto_26

    :cond_5
    new-instance v6, Lkotlin/jvm/internal/g0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v2, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :try_start_6
    iget-object v7, v3, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt23/q2;

    instance-of v8, v7, Lt23/i2;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_b

    if-eqz v8, :cond_7

    :try_start_7
    invoke-virtual {v1}, Lt23/c0;->g()Lb23/k;

    move-result-object v3

    invoke-virtual {v3}, Lb23/k;->c()Lb23/e;

    move-result-object v8

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v11, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v3}, Lb23/k;->a()Lb23/j;

    move-result-object v8

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " \u2014 no reconnect needed ("

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v11, v3, v0}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v8, v1

    goto/16 :goto_1

    :cond_6
    :goto_3
    invoke-static {v5}, Lmc3/d;->b(Lmc3/a;)V

    invoke-virtual {v1}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v11, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v11, v0, v2}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    :cond_7
    :try_start_8
    sget-object v4, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_MIGRATE:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    if-ne v2, v4, :cond_8

    const/4 v4, 0x1

    goto :goto_4

    :cond_8
    const/4 v4, 0x0

    :goto_4
    iget-object v3, v3, Lt23/s0;->g:Lec3/h2;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    if-eqz v4, :cond_9

    :try_start_9
    sget-object v4, Lt23/m2;->a:Lt23/m2;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_5

    :cond_9
    :try_start_a
    sget-object v4, Lt23/o2;->a:Lt23/o2;

    :goto_5
    invoke-virtual {v3, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, Lkotlin/jvm/internal/e0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_b

    move-wide v7, v3

    move-object/from16 v3, v18

    move-object v4, v1

    :goto_6
    :try_start_b
    iget-object v10, v4, Lt23/c0;->p:Lt23/s0;

    iget-object v11, v4, Lt23/c0;->g:Lt23/b4;

    iget-object v1, v10, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/q2;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    move-object/from16 v18, v14

    :try_start_c
    instance-of v14, v1, Lt23/h2;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    if-nez v14, :cond_a

    :try_start_d
    instance-of v14, v1, Lt23/p2;

    if-nez v14, :cond_a

    instance-of v14, v1, Lt23/i2;

    if-eqz v14, :cond_b

    :cond_a
    move-object v12, v13

    move-object/from16 v22, v15

    goto/16 :goto_20

    :cond_b
    iget v1, v5, Lkotlin/jvm/internal/e0;->w:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    const/16 v14, 0xa

    if-lt v1, v14, :cond_d

    :try_start_e
    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    const-string v8, "[reconnect] Max reconnect attempts (10) reached \u2014 giving up"

    invoke-static {v3, v7, v1, v8}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :catchall_3
    move-exception v0

    move-object v8, v4

    move-object v7, v15

    move-object/from16 v9, v18

    goto/16 :goto_24

    :cond_c
    :goto_7
    iget-object v1, v10, Lt23/s0;->g:Lec3/h2;

    invoke-virtual {v1, v12}, Lec3/h2;->j(Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    move-object v12, v13

    move-object/from16 v22, v15

    goto/16 :goto_1f

    :cond_d
    :try_start_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    sub-long v20, v20, v7

    move-object/from16 v22, v15

    :try_start_10
    iget-wide v14, v11, Lt23/b4;->P:J

    const-wide/16 v23, 0x0

    cmp-long v1, v14, v23

    if-lez v1, :cond_f

    const/16 v1, 0x3e8

    move-wide/from16 v23, v14

    int-to-long v14, v1

    div-long v20, v20, v14

    cmp-long v1, v20, v23

    if-lez v1, :cond_f

    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    const-string v8, "[reconnect] Disconnection timeout reached \u2014 giving up"

    invoke-static {v3, v7, v1, v8}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_a

    :catchall_4
    move-exception v0

    :goto_8
    move-object v8, v4

    :goto_9
    move-object/from16 v9, v18

    move-object/from16 v7, v22

    goto/16 :goto_24

    :cond_e
    :goto_a
    iget-object v1, v10, Lt23/s0;->g:Lec3/h2;

    invoke-virtual {v1, v12}, Lec3/h2;->j(Ljava/lang/Object;)V

    move-object v12, v13

    goto/16 :goto_1f

    :cond_f
    iget-object v1, v4, Lt23/c0;->q:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz33/b;

    invoke-virtual {v1}, Lz33/b;->c()Z

    move-result v1

    if-nez v1, :cond_12

    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v10

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v10, v11, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v10

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    iget v14, v5, Lkotlin/jvm/internal/e0;->w:I

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v20, v12

    const-string v12, "[reconnect] Network unavailable \u2014 waiting for connectivity (loopIteration="

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v10, v11, v1, v12}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_b

    :cond_10
    move-object/from16 v20, v12

    :goto_b
    iput-object v4, v3, Lt23/y;->w:Lt23/c0;

    iput-object v2, v3, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iput-object v0, v3, Lt23/y;->y:Ljava/lang/String;

    iput-object v6, v3, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iput-object v5, v3, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iput-wide v7, v3, Lt23/y;->F:J

    const/4 v1, 0x1

    iput v1, v3, Lt23/y;->I:I

    const-wide/16 v10, 0x1f4

    invoke-static {v10, v11, v3}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v10, v19

    if-ne v1, v10, :cond_11

    goto/16 :goto_1a

    :cond_11
    :goto_c
    move-object/from16 v1, p0

    move-object/from16 v19, v10

    move-object/from16 v14, v18

    move-object/from16 v12, v20

    :goto_d
    move-object/from16 v15, v22

    goto/16 :goto_6

    :cond_12
    move-object/from16 v20, v12

    move-object/from16 v10, v19

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v7

    iget v1, v4, Lt23/c0;->Q:I

    int-to-long v14, v1

    cmp-long v1, v11, v14

    const/4 v11, 0x2

    if-ltz v1, :cond_14

    iget-object v1, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    sget-object v12, Lt23/j;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v12, v1

    const/4 v12, 0x1

    if-eq v1, v12, :cond_13

    if-eq v1, v11, :cond_13

    iget-object v1, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    goto :goto_e

    :cond_13
    sget-object v1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_REJOIN:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    :goto_e
    iput-object v1, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_14
    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v12

    sget-object v14, Lb23/g;->z:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v12, v14, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_15

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v12

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    iget v15, v5, Lkotlin/jvm/internal/e0;->w:I

    iget-object v11, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v19, v13

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v10

    const-string v10, "[reconnect] loopIteration="

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, " strategy="

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v12, v14, v1, v10}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_f

    :cond_15
    move-object/from16 v21, v10

    move-object/from16 v19, v13

    :goto_f
    iget-object v1, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lstream/video/sfu/models/WebsocketReconnectStrategy;

    sget-object v10, Lt23/j;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v10, v1

    const/4 v12, 0x1

    if-eq v1, v12, :cond_1b

    const/4 v10, 0x2

    if-eq v1, v10, :cond_1b

    const/4 v10, 0x3

    if-eq v1, v10, :cond_19

    const/4 v10, 0x4

    if-eq v1, v10, :cond_17

    const/4 v11, 0x5

    if-ne v1, v11, :cond_16

    sget-object v1, Lt23/r2;->a:Lt23/r2;

    move-object/from16 v11, v21

    goto/16 :goto_15

    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_17
    iget v1, v4, Lt23/c0;->f:I

    const/16 v17, 0x1

    add-int/lit8 v1, v1, 0x1

    iput v1, v4, Lt23/c0;->f:I

    new-instance v11, Lx23/a;

    sget-object v12, Lx23/c;->w:Lx23/c;

    invoke-direct {v11, v1, v12}, Lx23/a;-><init>(ILs93/k;)V

    iput-object v4, v3, Lt23/y;->w:Lt23/c0;

    iput-object v2, v3, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iput-object v0, v3, Lt23/y;->y:Ljava/lang/String;

    iput-object v6, v3, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iput-object v5, v3, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iput-wide v7, v3, Lt23/y;->F:J

    iput v10, v3, Lt23/y;->I:I

    invoke-virtual {v4, v11, v3}, Lt23/c0;->u(Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    move-object/from16 v11, v21

    if-ne v1, v11, :cond_18

    :goto_10
    move-object v10, v11

    goto/16 :goto_1a

    :cond_18
    move-object/from16 v25, v4

    move-object v4, v0

    move-object v0, v5

    move-object v5, v3

    move-object v3, v1

    move-object/from16 v1, v25

    :goto_11
    :try_start_11
    check-cast v3, Lt23/w2;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    :goto_12
    move-object/from16 v25, v5

    move-object v5, v0

    move-object v0, v4

    move-object v4, v1

    move-object v1, v3

    move-object/from16 v3, v25

    goto :goto_15

    :catchall_5
    move-exception v0

    move-object v8, v1

    goto/16 :goto_9

    :cond_19
    move-object/from16 v11, v21

    :try_start_12
    iget v1, v4, Lt23/c0;->f:I

    const/16 v17, 0x1

    add-int/lit8 v1, v1, 0x1

    iput v1, v4, Lt23/c0;->f:I

    new-instance v12, Lx23/a;

    sget-object v13, Lx23/d;->w:Lx23/d;

    invoke-direct {v12, v1, v13}, Lx23/a;-><init>(ILs93/k;)V

    iput-object v4, v3, Lt23/y;->w:Lt23/c0;

    iput-object v2, v3, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iput-object v0, v3, Lt23/y;->y:Ljava/lang/String;

    iput-object v6, v3, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iput-object v5, v3, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iput-wide v7, v3, Lt23/y;->F:J

    iput v10, v3, Lt23/y;->I:I

    invoke-virtual {v4, v0, v12, v3}, Lt23/c0;->v(Ljava/lang/String;Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    if-ne v1, v11, :cond_1a

    goto :goto_10

    :cond_1a
    move-object/from16 v25, v4

    move-object v4, v0

    move-object v0, v5

    move-object v5, v3

    move-object v3, v1

    move-object/from16 v1, v25

    :goto_13
    :try_start_13
    check-cast v3, Lt23/w2;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    goto :goto_12

    :cond_1b
    move-object/from16 v11, v21

    :try_start_14
    iput-object v4, v3, Lt23/y;->w:Lt23/c0;

    iput-object v2, v3, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iput-object v0, v3, Lt23/y;->y:Ljava/lang/String;

    iput-object v6, v3, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iput-object v5, v3, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iput-wide v7, v3, Lt23/y;->F:J

    const/4 v10, 0x2

    iput v10, v3, Lt23/y;->I:I

    invoke-virtual {v4, v0, v3}, Lt23/c0;->t(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    if-ne v1, v11, :cond_1c

    goto :goto_10

    :cond_1c
    move-object/from16 v25, v4

    move-object v4, v0

    move-object v0, v5

    move-object v5, v3

    move-object v3, v1

    move-object/from16 v1, v25

    :goto_14
    :try_start_15
    check-cast v3, Lt23/w2;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    goto :goto_12

    :goto_15
    :try_start_16
    instance-of v10, v1, Lt23/v2;

    if-nez v10, :cond_1e

    instance-of v10, v1, Lt23/r2;

    if-eqz v10, :cond_1f

    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    const-string v8, "[reconnect] DISCONNECT requested \u2014 leaving call"

    invoke-static {v3, v7, v1, v8}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1d
    new-instance v1, Lt23/d0;

    sget-object v3, Lt23/g;->y:Lt23/g;

    iget-object v7, v3, Lt23/g;->w:Ljava/lang/String;

    invoke-direct {v1, v3, v7}, Lt23/d0;-><init>(Lt23/g;Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Lt23/c0;->p(Lt23/i0;)V

    :cond_1e
    :goto_16
    move-object/from16 v12, v19

    goto/16 :goto_1f

    :cond_1f
    instance-of v10, v1, Lt23/u2;

    if-eqz v10, :cond_21

    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v3

    invoke-virtual {v3}, Lb23/k;->c()Lb23/e;

    move-result-object v7

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v8, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-virtual {v3}, Lb23/k;->a()Lb23/j;

    move-result-object v7

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    check-cast v1, Lt23/u2;

    iget-object v1, v1, Lt23/u2;->a:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "[reconnect] Precondition not met \u2014 giving up: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v8, v3, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_20
    iget-object v1, v4, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->g:Lec3/h2;

    move-object/from16 v10, v20

    invoke-virtual {v1, v10}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_16

    :cond_21
    move-object/from16 v10, v20

    instance-of v12, v1, Lt23/t2;

    if-eqz v12, :cond_24

    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v12

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v12, v13, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_22

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v12

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    const-string v14, "[reconnect] Peer connections stale \u2014 escalating to REJOIN"

    invoke-static {v12, v13, v1, v14}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_22
    iput-object v4, v3, Lt23/y;->w:Lt23/c0;

    iput-object v2, v3, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iput-object v0, v3, Lt23/y;->y:Ljava/lang/String;

    iput-object v6, v3, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iput-object v5, v3, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iput-wide v7, v3, Lt23/y;->F:J

    const/4 v12, 0x5

    iput v12, v3, Lt23/y;->I:I

    const-wide/16 v13, 0x1f4

    invoke-static {v13, v14, v3}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v11, :cond_23

    goto/16 :goto_10

    :cond_23
    :goto_17
    iget v1, v5, Lkotlin/jvm/internal/e0;->w:I

    const/16 v17, 0x1

    add-int/lit8 v1, v1, 0x1

    iput v1, v5, Lkotlin/jvm/internal/e0;->w:I

    sget-object v1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_REJOIN:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iput-object v1, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :goto_18
    move-object/from16 v1, p0

    move-object v12, v10

    move-object/from16 v14, v18

    move-object/from16 v13, v19

    move-object/from16 v15, v22

    move-object/from16 v19, v11

    goto/16 :goto_6

    :cond_24
    const/4 v12, 0x5

    instance-of v13, v1, Lt23/s2;

    if-eqz v13, :cond_2c

    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v13

    invoke-virtual {v13}, Lb23/k;->c()Lb23/e;

    move-result-object v14

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-virtual {v13}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v14, v15, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_25

    invoke-virtual {v13}, Lb23/k;->a()Lb23/j;

    move-result-object v12

    invoke-virtual {v13}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v13

    iget-object v14, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v20, v1

    iget v1, v4, Lt23/c0;->f:I

    move-object/from16 v21, v9

    move-object/from16 v9, v20

    check-cast v9, Lt23/s2;

    iget-object v9, v9, Lt23/s2;->a:Ljava/lang/Exception;

    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v20, v10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v23, v11

    const-string v11, "[reconnect] "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " ("

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") failed: "

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v15, v13, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_19

    :cond_25
    move-object/from16 v21, v9

    move-object/from16 v20, v10

    move-object/from16 v23, v11

    :goto_19
    iput-object v4, v3, Lt23/y;->w:Lt23/c0;

    iput-object v2, v3, Lt23/y;->x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iput-object v0, v3, Lt23/y;->y:Ljava/lang/String;

    iput-object v6, v3, Lt23/y;->z:Lkotlin/jvm/internal/g0;

    iput-object v5, v3, Lt23/y;->E:Lkotlin/jvm/internal/e0;

    iput-wide v7, v3, Lt23/y;->F:J

    const/4 v1, 0x6

    iput v1, v3, Lt23/y;->I:I

    const-wide/16 v13, 0x1f4

    invoke-static {v13, v14, v3}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v10, v23

    if-ne v1, v10, :cond_26

    :goto_1a
    return-object v10

    :cond_26
    :goto_1b
    iget v1, v5, Lkotlin/jvm/internal/e0;->w:I

    const/16 v17, 0x1

    add-int/lit8 v1, v1, 0x1

    iput v1, v5, Lkotlin/jvm/internal/e0;->w:I

    iget-object v1, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v9, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_MIGRATE:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    if-ne v1, v9, :cond_27

    move/from16 v1, v17

    goto :goto_1c

    :cond_27
    const/4 v1, 0x0

    :goto_1c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v7

    iget v9, v4, Lt23/c0;->Q:I

    int-to-long v13, v9

    cmp-long v9, v11, v13

    if-lez v9, :cond_28

    move/from16 v9, v17

    goto :goto_1d

    :cond_28
    const/4 v9, 0x0

    :goto_1d
    if-nez v1, :cond_29

    if-eqz v9, :cond_2a

    :cond_29
    sget-object v1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_REJOIN:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iput-object v1, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_2a
    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v9

    sget-object v11, Lb23/g;->z:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v9, v11, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2b

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v9

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v12, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget v13, v5, Lkotlin/jvm/internal/e0;->w:I

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "[reconnect] Next strategy: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, " (loopIteration="

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v12, v19

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v9, v11, v1, v13}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    goto :goto_1e

    :cond_2b
    move-object/from16 v12, v19

    :goto_1e
    move-object/from16 v1, p0

    move-object/from16 v19, v10

    move-object v13, v12

    move-object/from16 v14, v18

    move-object/from16 v12, v20

    move-object/from16 v9, v21

    goto/16 :goto_d

    :cond_2c
    const/16 v17, 0x1

    goto/16 :goto_18

    :cond_2d
    :goto_1f
    move-object v8, v4

    goto :goto_21

    :catchall_6
    move-exception v0

    move-object/from16 v22, v15

    goto/16 :goto_8

    :goto_20
    :try_start_17
    invoke-virtual {v4}, Lt23/c0;->g()Lb23/k;

    move-result-object v3

    invoke-virtual {v3}, Lb23/k;->c()Lb23/e;

    move-result-object v7

    sget-object v8, Lb23/g;->z:Lb23/g;

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v8, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    if-eqz v7, :cond_2d

    :try_start_18
    invoke-virtual {v3}, Lb23/k;->a()Lb23/j;

    move-result-object v7

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "[reconnect] Loop finished \u2014 state="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v8, v3, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    goto :goto_1f

    :goto_21
    :try_start_19
    iget-object v1, v8, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lt23/p2;

    if-eqz v1, :cond_2f

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[reconnect] All recovery attempts exhausted \u2014 leaving call ("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2e

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v4, v1, v0}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_22

    :catchall_7
    move-exception v0

    goto/16 :goto_9

    :cond_2e
    :goto_22
    iget-object v1, v8, Lt23/c0;->K:Lv23/a;

    iget-object v1, v1, Lv23/a;->b:Lb30/m;

    iget v3, v5, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "RETRY_EXHAUSTED"

    const-string v7, "message"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3, v4, v0}, Lb30/m;->F(ILjava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lt23/f0;

    iget v3, v5, Lkotlin/jvm/internal/e0;->w:I

    invoke-direct {v1, v3, v0}, Lt23/f0;-><init>(ILjava/lang/String;)V

    invoke-virtual {v8, v1}, Lt23/c0;->p(Lt23/i0;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_7

    :cond_2f
    iget-object v0, v8, Lt23/c0;->R:Lmc3/c;

    invoke-static {v0}, Lmc3/d;->b(Lmc3/a;)V

    invoke-virtual {v8}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_30

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v5, Ljava/lang/StringBuilder;

    move-object/from16 v7, v22

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v9, v18

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v0, v2}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    :cond_30
    move-object/from16 v3, p0

    goto/16 :goto_26

    :catchall_8
    move-exception v0

    move-object/from16 v9, v18

    move-object/from16 v7, v22

    :goto_23
    move-object v8, v4

    goto :goto_24

    :catchall_9
    move-exception v0

    move-object v7, v15

    move-object/from16 v9, v18

    goto :goto_23

    :catchall_a
    move-exception v0

    move-object v9, v14

    move-object v7, v15

    goto :goto_23

    :catchall_b
    move-exception v0

    move-object v9, v14

    move-object v7, v15

    move-object/from16 v8, p0

    :goto_24
    iget-object v1, v8, Lt23/c0;->R:Lmc3/c;

    invoke-static {v1}, Lmc3/d;->b(Lmc3/a;)V

    invoke-virtual {v8}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_31

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v5, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v4, v1, v2}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_31
    throw v0

    :goto_25
    invoke-virtual/range {p0 .. p0}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v11, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_30

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, p0

    iget-boolean v4, v3, Lt23/c0;->B:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[reconnect] Call already left/destroyed (isDestroyed="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", conn="

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ") \u2014 skipping ("

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v12, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v11, v1, v0}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :goto_26
    return-object v16

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

.method public final t(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lt23/z;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lt23/z;

    iget v3, v2, Lt23/z;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lt23/z;->F:I

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lt23/z;

    invoke-direct {v2, v0, v1}, Lt23/z;-><init>(Lt23/c0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v7, Lt23/z;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v7, Lt23/z;->F:I

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v4, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_6

    if-eq v3, v11, :cond_5

    if-eq v3, v4, :cond_4

    if-eq v3, v10, :cond_2

    if-ne v3, v9, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v7, Lt23/z;->y:Ld33/h1;

    iget-object v4, v7, Lt23/z;->x:Ljava/lang/String;

    iget-object v5, v7, Lt23/z;->w:Lt23/c0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v20, v4

    goto/16 :goto_6

    :cond_4
    iget-object v3, v7, Lt23/z;->y:Ld33/h1;

    iget-object v4, v7, Lt23/z;->x:Ljava/lang/String;

    iget-object v5, v7, Lt23/z;->w:Lt23/c0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_5
    iget-object v3, v7, Lt23/z;->y:Ld33/h1;

    iget-object v5, v7, Lt23/z;->x:Ljava/lang/String;

    iget-object v6, v7, Lt23/z;->w:Lt23/c0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v5

    move-object v5, v1

    move-object v1, v13

    move-object v13, v6

    goto :goto_2

    :cond_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget v3, v0, Lt23/c0;->f:I

    const-string v8, "[reconnectFast] reconnectAttempts="

    invoke-static {v3, v8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v6, v5, v3, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v1, v0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ld33/h1;

    if-nez v3, :cond_8

    new-instance v1, Lt23/u2;

    const-string v2, "No active session for fast reconnect"

    invoke-direct {v1, v2}, Lt23/u2;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_8
    iput-object v0, v7, Lt23/z;->w:Lt23/c0;

    move-object/from16 v1, p1

    iput-object v1, v7, Lt23/z;->x:Ljava/lang/String;

    iput-object v3, v7, Lt23/z;->y:Ld33/h1;

    iput v11, v7, Lt23/z;->F:I

    invoke-virtual {v0, v7}, Lt23/c0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_9

    goto/16 :goto_7

    :cond_9
    move-object v13, v0

    :goto_2
    check-cast v5, Lt23/u0;

    iput-object v13, v7, Lt23/z;->w:Lt23/c0;

    iput-object v1, v7, Lt23/z;->x:Ljava/lang/String;

    iput-object v3, v7, Lt23/z;->y:Ld33/h1;

    iput v4, v7, Lt23/z;->F:I

    move-object v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x6

    invoke-static/range {v3 .. v8}, Ld33/h1;->B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_a

    goto/16 :goto_7

    :cond_a
    move-object v4, v1

    move-object v5, v13

    :goto_3
    iput-object v5, v7, Lt23/z;->w:Lt23/c0;

    iput-object v4, v7, Lt23/z;->x:Ljava/lang/String;

    iput-object v3, v7, Lt23/z;->y:Ld33/h1;

    iput v10, v7, Lt23/z;->F:I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v11}, Ld33/h1;->k(Z)V

    invoke-virtual {v3}, Ld33/h1;->t()Ly33/e;

    move-result-object v1

    iget-object v1, v1, Ly33/e;->e:Lh53/f;

    iget-object v1, v1, Lh53/f;->d:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li53/j;

    instance-of v6, v1, Li53/a;

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    if-nez v6, :cond_c

    instance-of v6, v1, Li53/b;

    if-eqz v6, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {v3}, Ld33/h1;->s()Lb23/k;

    move-result-object v6

    iget-object v10, v6, Lb23/k;->c:Lb23/e;

    iget-object v11, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v10, v13, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_d

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v14, "[prepareReconnect] Socket already disconnected ("

    invoke-direct {v10, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") \u2014 skipping disconnect"

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v13, v11, v1, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_c
    :goto_4
    invoke-virtual {v3}, Ld33/h1;->t()Ly33/e;

    move-result-object v1

    iget-object v1, v1, Ly33/e;->e:Lh53/f;

    invoke-virtual {v1, v7}, Lh53/f;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_d

    move-object v8, v1

    :cond_d
    :goto_5
    if-ne v8, v2, :cond_3

    goto :goto_7

    :goto_6
    iget-object v1, v5, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->g:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lt23/o2;->a:Lt23/o2;

    invoke-virtual {v1, v12, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    iput-wide v10, v5, Lt23/c0;->H:J

    invoke-virtual {v3}, Ld33/h1;->o()Ll83/q;

    move-result-object v1

    iget-object v4, v1, Ll83/q;->x:Ljava/lang/Object;

    move-object/from16 v16, v4

    check-cast v16, Ljava/util/List;

    iget-object v1, v1, Ll83/q;->y:Ljava/lang/Object;

    move-object v15, v1

    check-cast v15, Ljava/util/List;

    sget-object v14, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_FAST:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget v1, v5, Lt23/c0;->f:I

    new-instance v13, Lstream/video/sfu/event/ReconnectDetails;

    const/16 v22, 0x90

    const/16 v23, 0x0

    const/16 v18, 0x0

    const-string v19, ""

    const/16 v21, 0x0

    move/from16 v17, v1

    invoke-direct/range {v13 .. v23}, Lstream/video/sfu/event/ReconnectDetails;-><init>(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v12, v7, Lt23/z;->w:Lt23/c0;

    iput-object v12, v7, Lt23/z;->x:Ljava/lang/String;

    iput-object v12, v7, Lt23/z;->y:Ld33/h1;

    iput v9, v7, Lt23/z;->F:I

    invoke-virtual {v3, v13, v7}, Ld33/h1;->p(Lstream/video/sfu/event/ReconnectDetails;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_e

    :goto_7
    return-object v2

    :cond_e
    :goto_8
    check-cast v1, Ld33/i;

    instance-of v2, v1, Ld33/f;

    if-eqz v2, :cond_f

    sget-object v1, Lt23/v2;->a:Lt23/v2;

    return-object v1

    :cond_f
    instance-of v2, v1, Ld33/h;

    if-eqz v2, :cond_10

    sget-object v1, Lt23/t2;->a:Lt23/t2;

    return-object v1

    :cond_10
    instance-of v2, v1, Ld33/g;

    if-eqz v2, :cond_11

    new-instance v2, Lt23/s2;

    check-cast v1, Ld33/g;

    iget-object v1, v1, Ld33/g;->a:Ljava/lang/Exception;

    invoke-direct {v2, v1}, Lt23/s2;-><init>(Ljava/lang/Exception;)V

    return-object v2

    :cond_11
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final u(Lx23/a;Ls83/c;)Ljava/lang/Object;
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lt23/a0;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lt23/a0;

    iget v3, v2, Lt23/a0;->J:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lt23/a0;->J:I

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lt23/a0;

    invoke-direct {v2, v1, v0}, Lt23/a0;-><init>(Lt23/c0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lt23/a0;->H:Ljava/lang/Object;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v2, v7, Lt23/a0;->J:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v3, 0x1

    const/4 v12, 0x2

    const/4 v13, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v3, :cond_4

    if-eq v2, v12, :cond_3

    if-eq v2, v11, :cond_2

    if-ne v2, v10, :cond_1

    iget-object v2, v7, Lt23/a0;->y:Ljava/lang/Object;

    check-cast v2, Ln23/h;

    iget-object v3, v7, Lt23/a0;->x:Ljava/lang/Object;

    check-cast v3, Ld33/h1;

    iget-object v4, v7, Lt23/a0;->w:Lt23/c0;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_a

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v7, Lt23/a0;->G:Lstream/video/sfu/event/ReconnectDetails;

    iget-object v3, v7, Lt23/a0;->F:Ljava/util/List;

    check-cast v3, Ljava/util/List;

    iget-object v4, v7, Lt23/a0;->E:Lio/getstream/android/video/generated/models/Credentials;

    iget-object v5, v7, Lt23/a0;->z:Ln23/h;

    iget-object v6, v7, Lt23/a0;->y:Ljava/lang/Object;

    check-cast v6, Ld33/h1;

    iget-object v8, v7, Lt23/a0;->x:Ljava/lang/Object;

    check-cast v8, Lx23/a;

    iget-object v11, v7, Lt23/a0;->w:Lt23/c0;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v3

    move-object v3, v6

    goto/16 :goto_7

    :cond_3
    iget-object v2, v7, Lt23/a0;->G:Lstream/video/sfu/event/ReconnectDetails;

    iget-object v3, v7, Lt23/a0;->F:Ljava/util/List;

    check-cast v3, Ljava/util/List;

    iget-object v4, v7, Lt23/a0;->E:Lio/getstream/android/video/generated/models/Credentials;

    iget-object v5, v7, Lt23/a0;->z:Ln23/h;

    iget-object v6, v7, Lt23/a0;->y:Ljava/lang/Object;

    check-cast v6, Ld33/h1;

    iget-object v8, v7, Lt23/a0;->x:Ljava/lang/Object;

    check-cast v8, Lx23/a;

    iget-object v12, v7, Lt23/a0;->w:Lt23/c0;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v3

    move-object v10, v4

    move-object v14, v12

    move-object v12, v8

    :goto_2
    move-object v11, v5

    move-object v3, v6

    goto/16 :goto_6

    :cond_4
    iget-object v2, v7, Lt23/a0;->y:Ljava/lang/Object;

    check-cast v2, Ld33/h1;

    iget-object v3, v7, Lt23/a0;->x:Ljava/lang/Object;

    check-cast v3, Lx23/a;

    iget-object v4, v7, Lt23/a0;->w:Lt23/c0;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v2

    move-object v1, v4

    goto/16 :goto_4

    :cond_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[reconnectMigrate] Migrating"

    invoke-interface {v0, v5, v4, v2, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v0, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->g:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lt23/m2;->a:Lt23/m2;

    invoke-virtual {v0, v13, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, v1, Lt23/c0;->d:Ljava/lang/String;

    if-nez v0, :cond_7

    new-instance v0, Lt23/u2;

    const-string v2, "No location available for migrate"

    invoke-direct {v0, v2}, Lt23/u2;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_7
    iget-object v2, v1, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ld33/h1;

    if-nez v14, :cond_8

    new-instance v0, Lt23/u2;

    const-string v2, "No active session for migrate"

    invoke-direct {v0, v2}, Lt23/u2;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, v1, Lt23/c0;->H:J

    iget-object v2, v14, Ld33/h1;->g:Ljava/lang/String;

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_3

    :cond_9
    iget-object v4, v1, Lt23/c0;->F:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    :goto_3
    iget-object v4, v14, Ld33/h1;->g:Ljava/lang/String;

    iput-object v1, v7, Lt23/a0;->w:Lt23/c0;

    move-object/from16 v6, p1

    iput-object v6, v7, Lt23/a0;->x:Ljava/lang/Object;

    iput-object v14, v7, Lt23/a0;->y:Ljava/lang/Object;

    iput v3, v7, Lt23/a0;->J:I

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/16 v8, 0x79

    move-object v3, v0

    invoke-static/range {v1 .. v8}, Lt23/c0;->o(Lt23/c0;Lt23/m1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lx23/a;Ls83/c;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto/16 :goto_9

    :cond_a
    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object v6, v14

    :goto_4
    move-object v5, v0

    check-cast v5, Ln23/h;

    instance-of v0, v5, Ln23/g;

    if-nez v0, :cond_b

    new-instance v0, Lt23/s2;

    new-instance v1, Ljava/lang/Exception;

    invoke-virtual {v5}, Ln23/h;->a()Ln23/e;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to get join response during migration: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lt23/s2;-><init>(Ljava/lang/Exception;)V

    return-object v0

    :cond_b
    move-object v0, v5

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lio/getstream/android/video/generated/models/JoinCallResponse;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getCredentials()Lio/getstream/android/video/generated/models/Credentials;

    move-result-object v0

    iget-object v2, v6, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le33/n;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Le33/n;->q()Ljava/util/List;

    move-result-object v2

    goto :goto_5

    :cond_c
    move-object v2, v13

    :goto_5
    iget-object v4, v6, Ld33/h1;->g:Ljava/lang/String;

    invoke-virtual {v1}, Lt23/c0;->g()Lb23/k;

    move-result-object v8

    iget-object v14, v8, Lb23/k;->c:Lb23/e;

    iget-object v15, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->z:Lb23/g;

    invoke-interface {v14, v10, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_d

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v14

    invoke-virtual {v14}, Lio/getstream/android/video/generated/models/SFUResponse;->getEdgeName()Ljava/lang/String;

    move-result-object v14

    const-string v11, "[reconnectMigrate] Migrate SFU "

    const-string v12, " to "

    invoke-static {v11, v4, v12, v14}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v8, v10, v15, v11, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    invoke-virtual {v6}, Ld33/h1;->o()Ll83/q;

    move-result-object v8

    iget-object v10, v8, Ll83/q;->x:Ljava/lang/Object;

    move-object/from16 v17, v10

    check-cast v17, Ljava/util/List;

    iget-object v8, v8, Ll83/q;->y:Ljava/lang/Object;

    move-object/from16 v16, v8

    check-cast v16, Ljava/util/List;

    sget-object v15, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_MIGRATE:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget v8, v1, Lt23/c0;->f:I

    new-instance v14, Lstream/video/sfu/event/ReconnectDetails;

    const/16 v23, 0xc0

    const/16 v24, 0x0

    const-string v20, ""

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v4

    move/from16 v18, v8

    invoke-direct/range {v14 .. v24}, Lstream/video/sfu/event/ReconnectDetails;-><init>(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v7, Lt23/a0;->w:Lt23/c0;

    iput-object v3, v7, Lt23/a0;->x:Ljava/lang/Object;

    iput-object v6, v7, Lt23/a0;->y:Ljava/lang/Object;

    iput-object v5, v7, Lt23/a0;->z:Ln23/h;

    iput-object v0, v7, Lt23/a0;->E:Lio/getstream/android/video/generated/models/Credentials;

    move-object v4, v2

    check-cast v4, Ljava/util/List;

    iput-object v4, v7, Lt23/a0;->F:Ljava/util/List;

    iput-object v14, v7, Lt23/a0;->G:Lstream/video/sfu/event/ReconnectDetails;

    const/4 v4, 0x2

    iput v4, v7, Lt23/a0;->J:I

    invoke-virtual {v1, v7}, Lt23/c0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_e

    goto/16 :goto_9

    :cond_e
    move-object v10, v14

    move-object v14, v1

    move-object v1, v2

    move-object v2, v10

    move-object v10, v0

    move-object v12, v3

    move-object v0, v4

    goto/16 :goto_2

    :goto_6
    move-object v4, v0

    check-cast v4, Lt23/u0;

    iput-object v14, v7, Lt23/a0;->w:Lt23/c0;

    iput-object v12, v7, Lt23/a0;->x:Ljava/lang/Object;

    iput-object v3, v7, Lt23/a0;->y:Ljava/lang/Object;

    iput-object v11, v7, Lt23/a0;->z:Ln23/h;

    iput-object v10, v7, Lt23/a0;->E:Lio/getstream/android/video/generated/models/Credentials;

    move-object v0, v1

    check-cast v0, Ljava/util/List;

    iput-object v0, v7, Lt23/a0;->F:Ljava/util/List;

    iput-object v2, v7, Lt23/a0;->G:Lstream/video/sfu/event/ReconnectDetails;

    const/4 v0, 0x3

    iput v0, v7, Lt23/a0;->J:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x6

    invoke-static/range {v3 .. v8}, Ld33/h1;->B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_f

    goto/16 :goto_9

    :cond_f
    move-object v4, v10

    move-object v5, v11

    move-object v8, v12

    move-object v11, v14

    :goto_7
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ld33/h1;->k(Z)V

    iget-object v15, v11, Lt23/c0;->g:Lt23/b4;

    iget v0, v11, Lt23/c0;->f:I

    iget-object v6, v11, Lt23/c0;->m:Landroid/os/PowerManager;

    iget-object v10, v11, Lt23/c0;->D:Ljava/lang/String;

    iget-object v12, v15, Lt23/b4;->y:Ljava/lang/String;

    iget-object v14, v15, Lt23/b4;->E:Ly33/c;

    iget-object v14, v14, Ly33/c;->d:Landroidx/lifecycle/x;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lio/getstream/android/video/generated/models/SFUResponse;->getUrl()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lio/getstream/android/video/generated/models/SFUResponse;->getWsEndpoint()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getToken()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lio/getstream/android/video/generated/models/SFUResponse;->getEdgeName()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getIceServers()Ljava/util/List;

    move-result-object v16

    move-object/from16 v13, v16

    check-cast v13, Ljava/lang/Iterable;

    move/from16 v16, v0

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 p1, v4

    const/16 v4, 0xa

    invoke-static {v13, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/getstream/android/video/generated/models/ICEServer;

    invoke-static {v13}, Lse/g;->L(Lio/getstream/android/video/generated/models/ICEServer;)Lc43/e;

    move-result-object v13

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    iget-object v4, v11, Lt23/c0;->K:Lv23/a;

    iget-object v4, v4, Lv23/a;->c:Lb30/m;

    iget-object v13, v4, Lb30/m;->F:Ljava/lang/Object;

    check-cast v13, La30/w0;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v17

    move-object/from16 v26, v0

    invoke-virtual/range {v17 .. v17}, Lio/getstream/android/video/generated/models/SFUResponse;->getEdgeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, La30/w0;->O(Ljava/lang/String;)V

    move-object/from16 v21, v14

    new-instance v14, Ld33/h1;

    const v28, 0x2ff000

    move-object/from16 v27, v4

    move-object/from16 v17, v6

    move-object/from16 v19, v10

    move-object/from16 v18, v11

    move-object/from16 v20, v12

    invoke-direct/range {v14 .. v28}, Ld33/h1;-><init>(Lt23/b4;ILandroid/os/PowerManager;Lt23/c0;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lb30/m;I)V

    move-object/from16 v4, v18

    iget-object v0, v4, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x0

    invoke-virtual {v0, v6, v14}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :try_start_1
    new-instance v0, Lx23/a;

    iget v8, v8, Lx23/a;->a:I

    invoke-direct {v0, v8, v6}, Lx23/a;-><init>(ILs93/k;)V

    iput-object v4, v7, Lt23/a0;->w:Lt23/c0;

    iput-object v3, v7, Lt23/a0;->x:Ljava/lang/Object;

    iput-object v5, v7, Lt23/a0;->y:Ljava/lang/Object;

    iput-object v6, v7, Lt23/a0;->z:Ln23/h;

    iput-object v6, v7, Lt23/a0;->E:Lio/getstream/android/video/generated/models/Credentials;

    iput-object v6, v7, Lt23/a0;->F:Ljava/util/List;

    iput-object v6, v7, Lt23/a0;->G:Lstream/video/sfu/event/ReconnectDetails;

    const/4 v6, 0x4

    iput v6, v7, Lt23/a0;->J:I

    invoke-virtual {v14, v2, v1, v0, v7}, Ld33/h1;->m(Lstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_11

    :goto_9
    return-object v9

    :cond_11
    move-object v2, v5

    :goto_a
    check-cast v0, Ld33/k1;

    instance-of v1, v0, Ld33/i1;

    if-eqz v1, :cond_12

    check-cast v2, Ln23/g;

    iget-object v0, v2, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lio/getstream/android/video/generated/models/JoinCallResponse;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lt23/c0;->r(Lt23/c0;Lio/getstream/android/video/generated/models/JoinCallResponse;)V

    sget-object v0, Lt23/v2;->a:Lt23/v2;

    goto :goto_b

    :cond_12
    instance-of v1, v0, Ld33/j1;

    if-eqz v1, :cond_14

    new-instance v1, Lt23/s2;

    check-cast v0, Ld33/j1;

    iget-object v0, v0, Ld33/j1;->a:Ljava/lang/Exception;

    invoke-direct {v1, v0}, Lt23/s2;-><init>(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v1

    :goto_b
    iget-object v1, v3, Ld33/h1;->r:Lbc3/c2;

    if-eqz v1, :cond_13

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_13
    iget-object v1, v3, Ld33/h1;->L:Lc6/a;

    new-instance v2, Ld33/r;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Ld33/r;-><init>(Ld33/h1;I)V

    invoke-virtual {v1, v2}, Lc6/a;->a(Lc93/a;)V

    return-object v0

    :cond_14
    :try_start_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_c
    iget-object v1, v3, Ld33/h1;->r:Lbc3/c2;

    if-eqz v1, :cond_15

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_15
    iget-object v1, v3, Ld33/h1;->L:Lc6/a;

    new-instance v2, Ld33/r;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Ld33/r;-><init>(Ld33/h1;I)V

    invoke-virtual {v1, v2}, Lc6/a;->a(Lc93/a;)V

    throw v0
.end method

.method public final v(Ljava/lang/String;Lx23/a;Ls83/c;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lt23/b0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lt23/b0;

    iget v3, v2, Lt23/b0;->J:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lt23/b0;->J:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lt23/b0;

    invoke-direct {v2, v0, v1}, Lt23/b0;-><init>(Lt23/c0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v6, Lt23/b0;->H:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v2, v6, Lt23/b0;->J:I

    const-string v9, "rejoin"

    const/4 v10, 0x3

    const/4 v3, 0x1

    const/4 v11, 0x2

    const/4 v12, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v3, :cond_3

    if-eq v2, v11, :cond_2

    if-ne v2, v10, :cond_1

    iget-object v2, v6, Lt23/b0;->z:Ljava/lang/Object;

    check-cast v2, Ld33/h1;

    iget-object v3, v6, Lt23/b0;->y:Ljava/lang/Object;

    check-cast v3, Ln23/h;

    iget-object v4, v6, Lt23/b0;->x:Ljava/lang/String;

    iget-object v5, v6, Lt23/b0;->w:Lt23/c0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v2, v6, Lt23/b0;->G:Lstream/video/sfu/event/ReconnectDetails;

    iget-object v3, v6, Lt23/b0;->F:Ljava/util/List;

    check-cast v3, Ljava/util/List;

    iget-object v4, v6, Lt23/b0;->E:Lio/getstream/android/video/generated/models/Credentials;

    iget-object v5, v6, Lt23/b0;->z:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    iget-object v7, v6, Lt23/b0;->y:Ljava/lang/Object;

    check-cast v7, Lx23/a;

    iget-object v11, v6, Lt23/b0;->x:Ljava/lang/String;

    iget-object v13, v6, Lt23/b0;->w:Lt23/c0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, v3

    move-object v3, v5

    move-object v5, v11

    goto/16 :goto_5

    :cond_3
    iget-object v2, v6, Lt23/b0;->z:Ljava/lang/Object;

    check-cast v2, Ld33/h1;

    iget-object v3, v6, Lt23/b0;->y:Ljava/lang/Object;

    check-cast v3, Lx23/a;

    iget-object v4, v6, Lt23/b0;->x:Ljava/lang/String;

    iget-object v5, v6, Lt23/b0;->w:Lt23/c0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v21, v4

    move-object v0, v5

    goto/16 :goto_2

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget v2, v0, Lt23/c0;->f:I

    const-string v7, "[reconnectRejoin] reconnectAttempts="

    invoke-static {v2, v7}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v5, v4, v2, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v1, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->g:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lt23/o2;->a:Lt23/o2;

    invoke-virtual {v1, v12, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v2, v0, Lt23/c0;->d:Ljava/lang/String;

    if-nez v2, :cond_6

    new-instance v1, Lt23/u2;

    const-string v2, "No location available for rejoin"

    invoke-direct {v1, v2}, Lt23/u2;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_6
    iget-object v1, v0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Ld33/h1;

    if-nez v13, :cond_7

    new-instance v1, Lt23/u2;

    const-string v2, "No active session for rejoin"

    invoke-direct {v1, v2}, Lt23/u2;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, v0, Lt23/c0;->H:J

    iput-object v0, v6, Lt23/b0;->w:Lt23/c0;

    move-object/from16 v14, p1

    iput-object v14, v6, Lt23/b0;->x:Ljava/lang/String;

    move-object/from16 v5, p2

    iput-object v5, v6, Lt23/b0;->y:Ljava/lang/Object;

    iput-object v13, v6, Lt23/b0;->z:Ljava/lang/Object;

    iput v3, v6, Lt23/b0;->J:I

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v7, 0x7d

    invoke-static/range {v0 .. v7}, Lt23/c0;->o(Lt23/c0;Lt23/m1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lx23/a;Ls83/c;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_8

    goto/16 :goto_7

    :cond_8
    move-object/from16 v0, p0

    move-object/from16 v3, p2

    move-object v2, v13

    move-object/from16 v21, v14

    :goto_2
    check-cast v1, Ln23/h;

    instance-of v4, v1, Ln23/g;

    if-nez v4, :cond_9

    new-instance v0, Lt23/s2;

    new-instance v2, Ljava/lang/Exception;

    invoke-virtual {v1}, Ln23/h;->a()Ln23/e;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to get join response: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v2}, Lt23/s2;-><init>(Ljava/lang/Exception;)V

    return-object v0

    :cond_9
    move-object v4, v1

    check-cast v4, Ln23/g;

    iget-object v4, v4, Ln23/g;->a:Ljava/lang/Object;

    check-cast v4, Lio/getstream/android/video/generated/models/JoinCallResponse;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/JoinCallResponse;->getCredentials()Lio/getstream/android/video/generated/models/Credentials;

    move-result-object v4

    iget-object v5, v2, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le33/n;

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Le33/n;->q()Ljava/util/List;

    move-result-object v5

    goto :goto_3

    :cond_a
    move-object v5, v12

    :goto_3
    invoke-virtual {v0}, Lt23/c0;->g()Lb23/k;

    move-result-object v7

    iget-object v13, v7, Lb23/k;->c:Lb23/e;

    iget-object v14, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->z:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_b

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    iget-object v13, v2, Ld33/h1;->e:Ljava/lang/String;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lio/getstream/android/video/generated/models/SFUResponse;->getUrl()Ljava/lang/String;

    move-result-object v10

    const-string v11, "Rejoin SFU "

    move-object/from16 p1, v5

    const-string v5, " to "

    invoke-static {v11, v13, v5, v10}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v15, v14, v5, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_b
    move-object/from16 p1, v5

    :goto_4
    const-string v5, "toString(...)"

    invoke-static {v5}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Lt23/c0;->D:Ljava/lang/String;

    invoke-virtual {v2}, Ld33/h1;->o()Ll83/q;

    move-result-object v5

    iget-object v7, v5, Ll83/q;->w:Ljava/lang/Object;

    move-object/from16 v20, v7

    check-cast v20, Ljava/lang/String;

    iget-object v7, v5, Ll83/q;->x:Ljava/lang/Object;

    move-object/from16 v17, v7

    check-cast v17, Ljava/util/List;

    iget-object v5, v5, Ll83/q;->y:Ljava/lang/Object;

    move-object/from16 v16, v5

    check-cast v16, Ljava/util/List;

    sget-object v15, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_REJOIN:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget v5, v0, Lt23/c0;->f:I

    new-instance v14, Lstream/video/sfu/event/ReconnectDetails;

    const/16 v23, 0x90

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    move/from16 v18, v5

    invoke-direct/range {v14 .. v24}, Lstream/video/sfu/event/ReconnectDetails;-><init>(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v20

    move-object/from16 v5, v21

    iget-object v10, v0, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "sessionId"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v10, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v11, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, v10, Lt23/s0;->j:Lec3/h2;

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7, v12, v10}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iput-object v0, v6, Lt23/b0;->w:Lt23/c0;

    iput-object v5, v6, Lt23/b0;->x:Ljava/lang/String;

    iput-object v3, v6, Lt23/b0;->y:Ljava/lang/Object;

    iput-object v1, v6, Lt23/b0;->z:Ljava/lang/Object;

    iput-object v4, v6, Lt23/b0;->E:Lio/getstream/android/video/generated/models/Credentials;

    move-object/from16 v7, p1

    check-cast v7, Ljava/util/List;

    iput-object v7, v6, Lt23/b0;->F:Ljava/util/List;

    iput-object v14, v6, Lt23/b0;->G:Lstream/video/sfu/event/ReconnectDetails;

    const/4 v7, 0x2

    iput v7, v6, Lt23/b0;->J:I

    invoke-virtual {v2, v9, v6}, Ld33/h1;->x(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_c

    goto/16 :goto_7

    :cond_c
    move-object v13, v0

    move-object v7, v3

    move-object v2, v14

    move-object/from16 v0, p1

    move-object v3, v1

    :goto_5
    iget-object v14, v13, Lt23/c0;->g:Lt23/b4;

    iget v15, v13, Lt23/c0;->f:I

    iget-object v1, v13, Lt23/c0;->m:Landroid/os/PowerManager;

    iget-object v10, v13, Lt23/c0;->D:Ljava/lang/String;

    iget-object v11, v14, Lt23/b4;->y:Ljava/lang/String;

    iget-object v12, v14, Lt23/b4;->E:Ly33/c;

    iget-object v12, v12, Ly33/c;->d:Landroidx/lifecycle/x;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lio/getstream/android/video/generated/models/SFUResponse;->getUrl()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lio/getstream/android/video/generated/models/SFUResponse;->getWsEndpoint()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getToken()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lio/getstream/android/video/generated/models/SFUResponse;->getEdgeName()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/Credentials;->getIceServers()Ljava/util/List;

    move-result-object v16

    move-object/from16 v17, v1

    move-object/from16 v1, v16

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 p1, v4

    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v18, v10

    const/16 v10, 0xa

    invoke-static {v1, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v4, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/android/video/generated/models/ICEServer;

    invoke-static {v10}, Lse/g;->L(Lio/getstream/android/video/generated/models/ICEServer;)Lc43/e;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_d
    iget-object v1, v13, Lt23/c0;->K:Lv23/a;

    iget-object v1, v1, Lv23/a;->c:Lb30/m;

    iget-object v10, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v10, La30/w0;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/android/video/generated/models/Credentials;->getServer()Lio/getstream/android/video/generated/models/SFUResponse;

    move-result-object v16

    move-object/from16 v26, v1

    invoke-virtual/range {v16 .. v16}, Lio/getstream/android/video/generated/models/SFUResponse;->getEdgeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, La30/w0;->O(Ljava/lang/String;)V

    move-object/from16 v16, v17

    move-object/from16 v17, v13

    new-instance v13, Ld33/h1;

    const v27, 0x2ff000

    move-object/from16 v25, v4

    move-object/from16 v19, v11

    move-object/from16 v20, v12

    invoke-direct/range {v13 .. v27}, Ld33/h1;-><init>(Lt23/b4;ILandroid/os/PowerManager;Lt23/c0;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lb30/m;I)V

    move-object/from16 v1, v17

    iget-object v4, v1, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x0

    invoke-virtual {v4, v10, v13}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v4, Lx23/a;

    iget v7, v7, Lx23/a;->a:I

    invoke-direct {v4, v7, v10}, Lx23/a;-><init>(ILs93/k;)V

    iput-object v1, v6, Lt23/b0;->w:Lt23/c0;

    iput-object v5, v6, Lt23/b0;->x:Ljava/lang/String;

    iput-object v3, v6, Lt23/b0;->y:Ljava/lang/Object;

    iput-object v13, v6, Lt23/b0;->z:Ljava/lang/Object;

    iput-object v10, v6, Lt23/b0;->E:Lio/getstream/android/video/generated/models/Credentials;

    iput-object v10, v6, Lt23/b0;->F:Ljava/util/List;

    iput-object v10, v6, Lt23/b0;->G:Lstream/video/sfu/event/ReconnectDetails;

    const/4 v7, 0x3

    iput v7, v6, Lt23/b0;->J:I

    invoke-virtual {v13, v2, v0, v4, v6}, Ld33/h1;->m(Lstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_e

    :goto_7
    return-object v8

    :cond_e
    move-object v4, v5

    move-object v2, v13

    move-object v5, v1

    move-object v1, v0

    :goto_8
    check-cast v1, Ld33/k1;

    instance-of v0, v1, Ld33/i1;

    if-eqz v0, :cond_f

    iget-object v0, v2, Ld33/h1;->n:Ll53/m;

    invoke-virtual {v0, v4, v9}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ln23/g;

    iget-object v0, v3, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lio/getstream/android/video/generated/models/JoinCallResponse;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v0}, Lt23/c0;->r(Lt23/c0;Lio/getstream/android/video/generated/models/JoinCallResponse;)V

    sget-object v0, Lt23/v2;->a:Lt23/v2;

    return-object v0

    :cond_f
    instance-of v0, v1, Ld33/j1;

    if-eqz v0, :cond_10

    new-instance v0, Lt23/s2;

    check-cast v1, Ld33/j1;

    iget-object v1, v1, Ld33/j1;->a:Ljava/lang/Exception;

    invoke-direct {v0, v1}, Lt23/s2;-><init>(Ljava/lang/Exception;)V

    return-object v0

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final w(Ltx/f;Lq83/d;)Ljava/lang/Object;
    .locals 10

    invoke-virtual {p0}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    iget-object v7, p0, Lt23/c0;->c:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[reject] #ringing; rejectReason: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", call_id:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v5, p0, Lt23/c0;->g:Lt23/b4;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, La6/e0;

    const/4 v9, 0x0

    iget-object v6, p0, Lt23/c0;->b:Ljava/lang/String;

    move-object v8, p1

    invoke-direct/range {v4 .. v9}, La6/e0;-><init>(Lt23/b4;Ljava/lang/String;Ljava/lang/String;Ltx/f;Lq83/d;)V

    invoke-virtual {v5, v4, p2}, Lt23/b4;->m(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/String;Ltx/f;Ls83/c;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[reject] source: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p0, p2, p3}, Lt23/c0;->w(Ltx/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
