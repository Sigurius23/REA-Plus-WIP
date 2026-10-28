.class public final Lt23/k3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lio/getstream/video/android/model/User;

.field public final c:Ljava/lang/String;

.field public final d:Le53/c;

.field public final e:Lb43/b;

.field public final f:Le43/g;

.field public final g:J

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:Lk53/c;

.field public final k:Lk53/b;

.field public final l:Lt9/p;

.field public final m:J

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:Landroid/content/Context;

.field public final r:Lc53/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lio/getstream/video/android/model/User;Ljava/lang/String;Lb43/b;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    new-instance v4, Le10/k0;

    sget-object v5, Lt23/l3;->a:Le53/d;

    invoke-direct {v4, v5}, Le10/k0;-><init>(Le53/d;)V

    new-instance v6, Le43/g;

    sget-object v8, Le43/a;->y:Le43/a;

    sget-object v11, Le43/a;->z:Le43/a;

    const-string v5, "livestream"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ldt/b;->w([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v14

    sget-object v15, Le43/f;->w:Le43/f;

    sget-object v7, Lm83/y;->w:Lm83/y;

    sget-object v9, Lh43/a;->w:Lh43/a;

    const/4 v10, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-direct/range {v6 .. v15}, Le43/g;-><init>(Ljava/util/List;Lc93/a;Le43/h;ZLc93/a;ZZLjava/util/Set;Lkotlin/jvm/functions/Function1;)V

    const-string v5, "context"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ld1/j;

    const/16 v8, 0x12

    invoke-direct {v7, v1, v8}, Ld1/j;-><init>(Landroid/content/Context;I)V

    new-instance v8, Lk53/c;

    invoke-direct {v8, v7}, Lk53/c;-><init>(Ld1/j;)V

    new-instance v7, Lk53/b;

    invoke-direct {v7}, Lk53/b;-><init>()V

    new-instance v9, Lt9/p;

    const/4 v10, 0x4

    invoke-direct {v9, v10}, Lt9/p;-><init>(I)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "apiKey"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "token"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lt23/k3;->a:Ljava/lang/String;

    move-object/from16 v2, p3

    iput-object v2, v0, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    iput-object v3, v0, Lt23/k3;->c:Ljava/lang/String;

    iput-object v4, v0, Lt23/k3;->d:Le53/c;

    move-object/from16 v2, p5

    iput-object v2, v0, Lt23/k3;->e:Lb43/b;

    iput-object v6, v0, Lt23/k3;->f:Le43/g;

    const-wide/16 v2, 0x2710

    iput-wide v2, v0, Lt23/k3;->g:J

    const/4 v2, 0x1

    iput-boolean v2, v0, Lt23/k3;->h:Z

    const-string v3, "video.stream-io-api.com"

    iput-object v3, v0, Lt23/k3;->i:Ljava/lang/String;

    iput-object v8, v0, Lt23/k3;->j:Lk53/c;

    iput-object v7, v0, Lt23/k3;->k:Lk53/b;

    iput-object v9, v0, Lt23/k3;->l:Lt9/p;

    const-wide/16 v3, 0x1e

    iput-wide v3, v0, Lt23/k3;->m:J

    iput-boolean v2, v0, Lt23/k3;->n:Z

    iput-boolean v2, v0, Lt23/k3;->o:Z

    iput-boolean v2, v0, Lt23/k3;->p:Z

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lt23/k3;->q:Landroid/content/Context;

    invoke-static {}, Lc53/c;->a()Lc53/a;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v2, v3}, Lup/d;->h(Lc53/a;Lq83/j;I)Lc53/a;

    move-result-object v1

    iput-object v1, v0, Lt23/k3;->r:Lc53/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 28

    move-object/from16 v1, p0

    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v8, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    if-eqz v0, :cond_1

    iget-boolean v0, v1, Lt23/k3;->h:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Creating 2 instance of the video client will cause bugs with call.state. Before creating a new client, please remove the old one. You can remove the old client using StreamVideo.removeClient()"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, v1, Lt23/k3;->a:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->getType()Lio/getstream/video/android/model/UserType;

    move-result-object v0

    sget-object v2, Lio/getstream/video/android/model/UserType$Authenticated;->INSTANCE:Lio/getstream/video/android/model/UserType$Authenticated;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, v1, Lt23/k3;->c:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "The token cannot be blank for authenticated users"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->getType()Lio/getstream/video/android/model/UserType;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "The user ID cannot be empty for authenticated users"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    iget-object v0, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->getRole()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    iget-object v9, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    const-string v11, "user"

    const/16 v20, 0x3fd

    const/16 v21, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v9 .. v21}, Lio/getstream/video/android/model/User;->copy$default(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/UserType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;ILjava/lang/Object;)Lio/getstream/video/android/model/User;

    move-result-object v0

    iput-object v0, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    :cond_7
    sget-boolean v0, Lb23/i;->b:Z

    if-nez v0, :cond_8

    new-instance v0, Lb23/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lb23/i;->c(Lb23/j;)V

    new-instance v0, Lrm/p;

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lb23/i;->d:Lb23/e;

    :cond_8
    iget-object v0, v1, Lt23/k3;->q:Landroid/content/Context;

    sget-object v2, Lmu/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v15, 0x1

    invoke-virtual {v2, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_c

    new-instance v2, Lmu/b;

    invoke-direct {v2, v0}, Lmu/b;-><init>(Landroid/content/Context;)V

    sget-object v0, Log3/j;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, Log3/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_3
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_a

    goto :goto_3

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Initializer was already set, possibly with a default during initialization"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Already initialized"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_4
    sget-object v6, Lt23/l3;->a:Le53/d;

    iget-object v0, v1, Lt23/k3;->c:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "token"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v6, Le53/d;->a:Ljava/lang/Object;

    iget-object v0, v1, Lt23/k3;->i:Ljava/lang/String;

    const-string v2, "https:///"

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lt23/k3;->i:Ljava/lang/String;

    const-string v4, "wss://"

    const-string v5, "/video/connect"

    invoke-static {v4, v2, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v5, Ld33/c;

    iget-object v2, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    invoke-direct {v5, v2}, Ld33/c;-><init>(Lio/getstream/video/android/model/User;)V

    move-object v2, v3

    iget-object v3, v1, Lt23/k3;->q:Landroid/content/Context;

    iget-object v7, v1, Lt23/k3;->r:Lc53/a;

    iget-wide v10, v1, Lt23/k3;->g:J

    iget-object v12, v1, Lt23/k3;->e:Lb43/b;

    iget-object v13, v1, Lt23/k3;->a:Ljava/lang/String;

    iget-object v4, v1, Lt23/k3;->d:Le53/c;

    move-object v14, v2

    new-instance v2, Ly33/c;

    move-object/from16 v26, v8

    move-object v8, v0

    move-object v0, v14

    move-object/from16 v14, v26

    invoke-direct/range {v2 .. v14}, Ly33/c;-><init>(Landroid/content/Context;Le53/c;Ld33/c;Le53/d;Lbc3/c0;Ljava/lang/String;Ljava/lang/String;JLb43/b;Ljava/lang/String;Landroidx/lifecycle/x;)V

    move-object v8, v14

    new-instance v13, Lp43/b;

    iget-object v3, v1, Lt23/k3;->q:Landroid/content/Context;

    const-string v4, "context"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lyz1/g;

    const/16 v7, 0xa

    invoke-direct {v4, v7}, Lyz1/g;-><init>(I)V

    sget-object v7, Lbc3/q0;->a:Lkc3/e;

    sget-object v7, Lkc3/d;->w:Lkc3/d;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v9

    invoke-virtual {v7, v9}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v7

    invoke-static {v7}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v7

    new-instance v9, Lz5/a;

    new-instance v10, Lz5/b;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    invoke-direct {v9, v10, v4, v7}, Lz5/a;-><init>(Lz5/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;)V

    sget-object v4, Lp43/b;->a:[Lj93/z;

    const/16 v24, 0x0

    aget-object v4, v4, v24

    invoke-virtual {v9, v3, v4}, Lz5/a;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La6/g;

    invoke-interface {v3}, La6/g;->getData()Lec3/l;

    move-result-object v3

    new-instance v4, Lch/o;

    const/4 v7, 0x5

    invoke-direct {v4, v3, v7}, Lch/o;-><init>(Lec3/l;I)V

    sget-object v3, Lh43/b;->E:Lg73/d;

    iget-object v4, v1, Lt23/k3;->q:Landroid/content/Context;

    iget-object v10, v1, Lt23/k3;->r:Lc53/a;

    iget-object v7, v1, Lt23/k3;->f:Le43/g;

    invoke-virtual {v2}, Ly33/c;->a()Lio/getstream/android/video/generated/apis/ProductvideoApi;

    move-result-object v12

    const-string v9, "context"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "scope"

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "notificationConfig"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v3

    :try_start_0
    sget-object v9, Lh43/b;->G:Lh43/b;

    if-eqz v9, :cond_d

    iput-object v10, v9, Lh43/b;->w:Lbc3/c0;

    iput-object v12, v9, Lh43/b;->y:Lio/getstream/android/video/generated/apis/ProductvideoApi;

    goto :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_e

    :cond_d
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    instance-of v9, v4, Landroid/app/Application;

    if-eqz v9, :cond_e

    check-cast v4, Landroid/app/Application;

    goto :goto_5

    :cond_e
    move-object v4, v0

    :goto_5
    iget-boolean v9, v7, Le43/g;->f:Z

    invoke-static {v7, v4, v9}, Lg73/d;->m(Le43/g;Landroid/app/Application;Z)Le43/g;

    move-result-object v11

    new-instance v9, La0/a1;

    const/16 v14, 0x17

    invoke-direct {v9, v11, v14}, La0/a1;-><init>(Ljava/lang/Object;I)V

    if-eqz v4, :cond_f

    iget-object v7, v7, Le43/g;->b:Lc93/a;

    const-string v14, "requestPermissionOnAppLaunch"

    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, La13/d;

    sget-object v0, La13/i;->E:Lio/sentry/hints/j;

    invoke-virtual {v0, v4}, Lio/sentry/hints/j;->q(Landroid/app/Application;)La13/i;

    move-result-object v0

    invoke-direct {v14, v0, v7, v9}, La13/d;-><init>(La13/i;Lc93/a;Lkotlin/jvm/functions/Function1;)V

    const-string v4, "Push:Notifications-PM"

    const-string v7, "[initialize] no args"

    invoke-static {v4, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, v0, La13/i;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    const/4 v14, 0x0

    :goto_6
    new-instance v9, Lh43/b;

    invoke-direct/range {v9 .. v14}, Lh43/b;-><init>(Lbc3/c0;Le43/g;Lio/getstream/android/video/generated/apis/ProductvideoApi;Lp43/b;La13/d;)V

    sput-object v9, Lh43/b;->G:Lh43/b;

    :goto_7
    sget-object v12, Lh43/b;->G:Lh43/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v12, :cond_16

    monitor-exit v3

    new-instance v0, Lbi/p;

    invoke-direct {v0, v15}, Lbi/p;-><init>(I)V

    iget-object v3, v1, Lt23/k3;->q:Landroid/content/Context;

    iget-object v4, v1, Lt23/k3;->r:Lc53/a;

    move-object v13, v5

    iget-object v5, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    move-object v10, v6

    iget-object v6, v1, Lt23/k3;->a:Ljava/lang/String;

    iget-object v7, v1, Lt23/k3;->c:Ljava/lang/String;

    iget-object v11, v1, Lt23/k3;->d:Le53/c;

    iget-object v9, v1, Lt23/k3;->f:Le43/g;

    iget-boolean v14, v9, Le43/g;->g:Z

    iget-object v9, v1, Lt23/k3;->j:Lk53/c;

    iget-object v15, v1, Lt23/k3;->l:Lt9/p;

    move-object/from16 v17, v0

    iget-object v0, v1, Lt23/k3;->e:Lb43/b;

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    iget-wide v2, v1, Lt23/k3;->m:J

    move-object/from16 v20, v0

    iget-boolean v0, v1, Lt23/k3;->n:Z

    move/from16 v22, v0

    iget-object v0, v1, Lt23/k3;->k:Lk53/b;

    move-object/from16 v21, v0

    iget-boolean v0, v1, Lt23/k3;->o:Z

    move-object/from16 v16, v9

    move-object/from16 v9, v18

    const/16 v23, 0x1

    move-object/from16 v18, v15

    move-object/from16 v15, v17

    move-object/from16 v17, v21

    move-wide/from16 v26, v2

    move-object/from16 v3, v19

    move-object/from16 v19, v20

    move-wide/from16 v20, v26

    new-instance v2, Lt23/b4;

    move/from16 v26, v23

    move/from16 v23, v0

    move/from16 v0, v26

    invoke-direct/range {v2 .. v23}, Lt23/b4;-><init>(Landroid/content/Context;Lbc3/c0;Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/x;Ly33/c;Le53/d;Le53/c;Lh43/b;Ld33/c;ZLbi/p;Lk53/c;Lk53/b;Lt9/p;Lb43/b;JZZ)V

    move-object v3, v2

    move-object v2, v9

    iget-object v4, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v4}, Lio/getstream/video/android/model/User;->getType()Lio/getstream/video/android/model/UserType;

    move-result-object v4

    sget-object v5, Lio/getstream/video/android/model/UserType$Guest;->INSTANCE:Lio/getstream/video/android/model/UserType$Guest;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v6, 0x3

    if-eqz v4, :cond_10

    const-string v4, "anonymous"

    iget-object v2, v2, Ly33/c;->e:Ly33/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v4, v2, Ly33/a;->y:Ljava/lang/String;

    iget-object v2, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    const-string v4, "user"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v3, Lt23/b4;->E:Ly33/c;

    const-string v7, ""

    invoke-virtual {v4, v7}, Ly33/c;->b(Ljava/lang/String;)V

    iget-object v4, v3, Lt23/b4;->x:Lbc3/c0;

    new-instance v7, Lt23/z3;

    const/4 v14, 0x0

    invoke-direct {v7, v3, v2, v14}, Lt23/z3;-><init>(Lt23/b4;Lio/getstream/video/android/model/User;Lq83/d;)V

    invoke-static {v4, v14, v7, v6}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v2

    iput-object v2, v3, Lt23/b4;->W:Lbc3/j0;

    goto :goto_8

    :cond_10
    iget-object v4, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v4}, Lio/getstream/video/android/model/User;->getType()Lio/getstream/video/android/model/UserType;

    move-result-object v4

    sget-object v7, Lio/getstream/video/android/model/UserType$Anonymous;->INSTANCE:Lio/getstream/video/android/model/UserType$Anonymous;

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    const-string v4, "anonymous"

    iget-object v2, v2, Ly33/c;->e:Ly33/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v4, v2, Ly33/a;->y:Ljava/lang/String;

    :cond_11
    :goto_8
    iget-object v2, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v2}, Lio/getstream/video/android/model/User;->getType()Lio/getstream/video/android/model/UserType;

    move-result-object v2

    sget-object v4, Lio/getstream/video/android/model/UserType$Authenticated;->INSTANCE:Lio/getstream/video/android/model/UserType$Authenticated;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    iget-object v2, v1, Lt23/k3;->b:Lio/getstream/video/android/model/User;

    invoke-virtual {v2}, Lio/getstream/video/android/model/User;->getType()Lio/getstream/video/android/model/UserType;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    const/4 v14, 0x0

    goto :goto_a

    :cond_13
    :goto_9
    iget-object v2, v1, Lt23/k3;->r:Lc53/a;

    new-instance v4, Ln43/a;

    const/16 v5, 0x18

    const/4 v14, 0x0

    invoke-direct {v4, v1, v3, v14, v5}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v14, v14, v4, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_a
    iget-object v2, v1, Lt23/k3;->r:Lc53/a;

    new-instance v4, Ls40/c0;

    const/16 v5, 0x9

    invoke-direct {v4, v3, v14, v5}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v14, v14, v4, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v2, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "The "

    monitor-enter v2

    :try_start_1
    sget-object v5, Lt23/i3;->a:Lt23/i3;

    sget-object v5, Lt23/i3;->b:Lt23/j3;

    if-eqz v5, :cond_14

    move v15, v0

    goto :goto_b

    :cond_14
    move/from16 v15, v24

    :goto_b
    if-eqz v15, :cond_15

    const-string v0, "StreamVideo"

    sget-object v5, Lb23/i;->a:Lb23/i;

    sget-object v5, Lb23/i;->d:Lb23/e;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v5, v6, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_15

    sget-object v5, Lb23/i;->c:Lb23/j;

    sget-object v7, Lt23/i3;->b:Lt23/j3;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " is already installed but you\'ve tried to install a new exception handler: "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v14, 0x0

    invoke-interface {v5, v6, v0, v4, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :catchall_1
    move-exception v0

    goto :goto_d

    :cond_15
    :goto_c
    sput-object v3, Lt23/i3;->b:Lt23/j3;

    sget-object v0, Lt23/i3;->c:Lec3/h2;

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<io.getstream.video.android.core.StreamVideo?>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lt23/i3;->b:Lt23/j3;

    invoke-virtual {v0, v3}, Lec3/h2;->j(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v2

    return-void

    :goto_d
    monitor-exit v2

    throw v0

    :cond_16
    :try_start_2
    const-string v0, "internalStreamNotificationManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/16 v25, 0x0

    throw v25
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_e
    monitor-exit v3

    throw v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "The API key cannot be blank"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
