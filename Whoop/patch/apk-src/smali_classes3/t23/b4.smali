.class public final Lt23/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt23/j3;
.implements Le43/h;


# instance fields
.field public final E:Ly33/c;

.field public final F:Le53/d;

.field public final G:Le53/c;

.field public final H:Lh43/b;

.field public final I:Ld33/c;

.field public final J:Z

.field public final K:Lbi/p;

.field public final L:Lk53/c;

.field public final M:Lk53/b;

.field public final N:Lt9/p;

.field public final O:Lb43/b;

.field public final P:J

.field public final Q:Z

.field public final R:Z

.field public final S:Lt9/u;

.field public T:Lbc3/j0;

.field public final U:Lt23/g1;

.field public final V:Ld33/c;

.field public W:Lbc3/j0;

.field public final X:Ll83/p;

.field public final Y:Ljava/util/LinkedHashSet;

.field public final Z:Ljava/util/LinkedHashMap;

.field public final a0:La0/a0;

.field public final b0:La30/w0;

.field public final c0:La33/d;

.field public final d0:Lf53/k;

.field public e0:Ljava/lang/String;

.field public final w:Landroid/content/Context;

.field public final x:Lbc3/c0;

.field public final y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lbc3/c0;Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/x;Ly33/c;Le53/d;Le53/c;Lh43/b;Ld33/c;ZLbi/p;Lk53/c;Lk53/b;Lt9/p;Lb43/b;JZZ)V
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    invoke-virtual/range {p7 .. p7}, Ly33/c;->a()Lio/getstream/android/video/generated/apis/ProductvideoApi;

    move-result-object v13

    const-string v14, "scope"

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, Lpg3/p;

    const/16 v5, 0xe

    invoke-direct {v15, v5}, Lpg3/p;-><init>(I)V

    new-instance v5, Lz23/c;

    new-instance v0, La33/d;

    const/4 v12, 0x0

    const/4 v11, 0x3

    invoke-static {v12, v12, v11}, Lup/d;->h(Lc53/a;Lq83/j;I)Lc53/a;

    move-result-object v10

    iget-object v10, v10, Lc53/a;->x:Lhc3/d;

    iget-object v10, v10, Lhc3/d;->w:Lq83/j;

    sget-object v12, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v10, v12}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v10

    check-cast v10, Lbc3/k1;

    new-instance v12, Lbc3/e2;

    invoke-direct {v12, v10}, Lbc3/l1;-><init>(Lbc3/k1;)V

    sget-object v10, Lbc3/q0;->a:Lkc3/e;

    sget-object v10, Lkc3/d;->w:Lkc3/d;

    invoke-static {v12, v10}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v10

    new-instance v12, Lc53/b;

    sget-object v9, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {v12, v9, v11}, Lc53/b;-><init>(Lq83/i;I)V

    invoke-interface {v10, v12}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v9

    invoke-static {v9}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v9

    invoke-direct {v0, v13, v9}, La33/d;-><init>(Lio/getstream/android/video/generated/apis/ProductvideoApi;Lhc3/d;)V

    invoke-direct {v5, v0, v15}, Lz23/c;-><init>(La33/d;Lpg3/p;)V

    new-instance v0, Lt9/u;

    new-instance v9, Lb30/m;

    invoke-direct {v9, v2, v5, v15}, Lb30/m;-><init>(Lbc3/c0;Lz23/c;Lpg3/p;)V

    invoke-direct {v0, v5, v9}, Lt9/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "context"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "initialUser"

    move-object/from16 v9, p3

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "apiKey"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "token"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "lifecycle"

    move-object/from16 v9, p6

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "tokenRepository"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "tokenProvider"

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "streamNotificationManager"

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "sounds"

    move-object/from16 v9, p14

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "vibrationConfig"

    move-object/from16 v10, p15

    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "permissionCheck"

    move-object/from16 v12, p16

    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "loggingLevel"

    move-object/from16 v13, p17

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v5, p0

    iput-object v1, v5, Lt23/b4;->w:Landroid/content/Context;

    iput-object v2, v5, Lt23/b4;->x:Lbc3/c0;

    iput-object v3, v5, Lt23/b4;->y:Ljava/lang/String;

    iput-object v4, v5, Lt23/b4;->z:Ljava/lang/String;

    move-object/from16 v3, p7

    iput-object v3, v5, Lt23/b4;->E:Ly33/c;

    iput-object v6, v5, Lt23/b4;->F:Le53/d;

    iput-object v7, v5, Lt23/b4;->G:Le53/c;

    iput-object v8, v5, Lt23/b4;->H:Lh43/b;

    move-object/from16 v4, p11

    iput-object v4, v5, Lt23/b4;->I:Ld33/c;

    move/from16 v4, p12

    iput-boolean v4, v5, Lt23/b4;->J:Z

    move-object/from16 v4, p13

    iput-object v4, v5, Lt23/b4;->K:Lbi/p;

    iput-object v9, v5, Lt23/b4;->L:Lk53/c;

    iput-object v10, v5, Lt23/b4;->M:Lk53/b;

    iput-object v12, v5, Lt23/b4;->N:Lt9/p;

    iput-object v13, v5, Lt23/b4;->O:Lb43/b;

    move-wide/from16 v6, p18

    iput-wide v6, v5, Lt23/b4;->P:J

    move/from16 v4, p20

    iput-boolean v4, v5, Lt23/b4;->Q:Z

    move/from16 v4, p21

    iput-boolean v4, v5, Lt23/b4;->R:Z

    iput-object v0, v5, Lt23/b4;->S:Lt9/u;

    new-instance v0, Lt23/g1;

    invoke-direct {v0, v5}, Lt23/g1;-><init>(Lt23/b4;)V

    iput-object v0, v5, Lt23/b4;->U:Lt23/g1;

    new-instance v4, Ld33/c;

    iget-object v6, v0, Lt23/g1;->h:Lec3/h2;

    iget-object v0, v0, Lt23/g1;->g:Lec3/h2;

    invoke-direct {v4, v6, v0}, Ld33/c;-><init>(Lec3/f2;Lec3/f2;)V

    iput-object v4, v5, Lt23/b4;->V:Ld33/c;

    const-string v0, "Call:StreamVideo"

    invoke-static {v5, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, v5, Lt23/b4;->X:Ll83/p;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, v5, Lt23/b4;->Y:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, v5, Lt23/b4;->Z:Ljava/util/LinkedHashMap;

    new-instance v0, La0/a0;

    const/16 v4, 0x64

    invoke-direct {v0, v4}, La0/a0;-><init>(I)V

    iput-object v0, v5, Lt23/b4;->a0:La0/a0;

    new-instance v0, La30/w0;

    const/16 v4, 0x9

    invoke-direct {v0, v1, v4}, La30/w0;-><init>(Landroid/content/Context;I)V

    iput-object v0, v5, Lt23/b4;->b0:La30/w0;

    new-instance v0, La33/d;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, La33/d;-><init>(I)V

    iput-object v0, v5, Lt23/b4;->c0:La33/d;

    iget-object v0, v3, Ly33/c;->j:Lf53/k;

    iput-object v0, v5, Lt23/b4;->d0:Lf53/k;

    new-instance v0, Lbc3/b0;

    const-string v1, "init#coordinatorSocket.events.collect"

    invoke-direct {v0, v1}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    new-instance v1, Ll43/b;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v5, v4, v3}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    const/4 v3, 0x2

    invoke-static {v2, v0, v4, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Ll43/b;

    invoke-direct {v0, v5, v4, v3}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    invoke-static {v2, v4, v4, v0, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, La13/h;

    const/16 v1, 0x13

    invoke-direct {v0, v5, v4, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v4, v4, v0, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Lbc3/b0;

    const-string v1, "init#coordinatorSocket.errors.collect"

    invoke-direct {v0, v1}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    new-instance v1, Ll43/b;

    invoke-direct {v1, v5, v4, v11}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    invoke-static {v2, v0, v4, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Lbc3/b0;

    const-string v1, "init#coordinatorSocket.connectionState.collect"

    invoke-direct {v0, v1}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    new-instance v1, Ll43/b;

    const/4 v6, 0x4

    invoke-direct {v1, v5, v4, v6}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    invoke-static {v2, v0, v4, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Ll43/b;

    const/4 v1, 0x5

    invoke-direct {v0, v5, v4, v1}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    invoke-static {v2, v4, v4, v0, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final k(Lt23/b4;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lt23/w3;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lt23/w3;

    iget v3, v2, Lt23/w3;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lt23/w3;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Lt23/w3;

    invoke-direct {v2, v0, v1}, Lt23/w3;-><init>(Lt23/b4;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lt23/w3;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lt23/w3;->z:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v2, Lt23/w3;->w:Lt23/b4;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lt23/b4;->G:Le53/c;

    if-eqz v1, :cond_b

    iput-object v0, v2, Lt23/w3;->w:Lt23/b4;

    iput v7, v2, Lt23/w3;->z:I

    invoke-interface {v1, v2}, Le53/c;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto/16 :goto_5

    :cond_4
    :goto_1
    check-cast v1, Ljava/lang/String;

    iget-object v4, v0, Lt23/b4;->E:Ly33/c;

    invoke-virtual {v4, v1}, Ly33/c;->b(Ljava/lang/String;)V

    invoke-virtual {v0}, Lt23/b4;->q()Lb23/k;

    move-result-object v4

    iget-object v8, v4, Lb23/k;->c:Lb23/e;

    iget-object v9, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    const/4 v11, 0x0

    if-eqz v8, :cond_5

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    const-string v8, "[refreshToken] Token has been refreshed with: "

    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v10, v9, v1, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v1, v0, Lt23/b4;->d0:Lf53/k;

    iget-object v0, v0, Lt23/b4;->I:Ld33/c;

    invoke-virtual {v0}, Ld33/c;->a()Lio/getstream/video/android/model/User;

    move-result-object v0

    iput-object v11, v2, Lt23/w3;->w:Lt23/b4;

    iput v6, v2, Lt23/w3;->z:I

    iget-object v1, v1, Lf53/k;->i:Lf53/j;

    sget-object v4, Lio/getstream/video/android/model/User;->Companion:Lio/getstream/video/android/model/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "<this>"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v6, "!anon"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    iget-object v6, v1, Lf53/j;->a:Ljava/lang/String;

    iget-object v8, v1, Lf53/j;->b:Ljava/lang/String;

    invoke-virtual {v1}, Lf53/j;->f()Lb23/k;

    move-result-object v9

    iget-object v12, v9, Lb23/k;->c:Lb23/e;

    iget-object v13, v9, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v12, v10, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_6

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v14, ", isAnonymous: "

    const-string v15, ", forceReconnection: true"

    const-string v7, "[reconnectUser] user.id: "

    invoke-static {v7, v12, v14, v15, v4}, Lnh3/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v9, v10, v13, v7, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v1, v1, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    const/4 v7, 0x1

    if-ne v4, v7, :cond_7

    new-instance v4, Lx43/b;

    invoke-direct {v4, v8, v6, v0}, Lx43/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/User;)V

    goto :goto_2

    :cond_7
    if-nez v4, :cond_a

    new-instance v4, Lx43/d;

    invoke-direct {v4, v8, v6, v0}, Lx43/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/User;)V

    :goto_2
    invoke-virtual {v1, v4, v7, v2}, Lio/sentry/internal/debugmeta/c;->C(Lrb3/g;ZLs83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_8

    goto :goto_3

    :cond_8
    move-object v0, v5

    :goto_3
    if-ne v0, v3, :cond_9

    goto :goto_4

    :cond_9
    move-object v0, v5

    :goto_4
    if-ne v0, v3, :cond_b

    :goto_5
    return-object v3

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    return-object v5
.end method

.method public static final l(Lt23/b4;Ls83/c;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Lt23/a4;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lt23/a4;

    iget v1, v0, Lt23/a4;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt23/a4;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt23/a4;

    invoke-direct {v0, p0, p1}, Lt23/a4;-><init>(Lt23/b4;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lt23/a4;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt23/a4;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lt23/a4;->w:Lt23/b4;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ll43/b;

    const/4 v2, 0x7

    invoke-direct {p1, p0, v3, v2}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    iput-object p0, v0, Lt23/a4;->w:Lt23/b4;

    iput v4, v0, Lt23/a4;->z:I

    const-wide/16 v4, 0x1388

    invoke-static {v4, v5, p1, v0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0}, Lt23/b4;->q()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    iget-object v1, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const-string v0, "[waitForConnectionId]: "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    if-nez p1, :cond_5

    return-object v3

    :cond_5
    return-object p1
.end method


# virtual methods
.method public final a(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Lh43/b;->a(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    invoke-virtual {v0, p1, p2, p3}, Lh43/b;->b(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final c()Ld1/j;
    .locals 1

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    iget-object v0, v0, Lh43/b;->z:Le43/h;

    invoke-interface {v0}, Le43/h;->c()Ld1/j;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lt23/c0;Ln43/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    iget-object v0, v0, Lh43/b;->z:Le43/h;

    invoke-interface {v0, p1, p2}, Lg43/r;->e(Lt23/c0;Ln43/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    invoke-virtual {v0, p1, p2, p3}, Lh43/b;->f(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
    .locals 6

    iget-object p5, p0, Lt23/b4;->H:Lh43/b;

    iget-object v0, p5, Lh43/b;->z:Le43/h;

    sget-object v5, Lm83/z;->w:Lm83/z;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lg43/p;->g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    invoke-virtual {v0, p1, p2, p3}, Lh43/b;->h(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final i(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    invoke-virtual {v0, p1, p2, p3}, Lh43/b;->i(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final j(Ljava/lang/String;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/Notification;
    .locals 1

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    iget-object v0, v0, Lh43/b;->z:Le43/h;

    invoke-interface {v0, p1, p2}, Lg43/p;->j(Ljava/lang/String;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public final m(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, La33/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, La33/c;-><init>(Lt23/b4;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v0, p2}, Lvd/e;->Y(La33/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;
    .locals 4

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    const-string p2, "toString(...)"

    invoke-static {p2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    const-string v0, ":"

    invoke-static {p1, v0, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lt23/b4;->Z:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lt23/c0;

    return-object p1

    :cond_1
    new-instance v2, Lt23/c0;

    iget-object v3, p0, Lt23/b4;->I:Ld33/c;

    invoke-virtual {v3}, Ld33/c;->a()Lio/getstream/video/android/model/User;

    move-result-object v3

    invoke-direct {v2, p0, p1, p2, v3}, Lt23/c0;-><init>(Lt23/b4;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/User;)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public final o(Lio/getstream/android/video/generated/models/VideoEvent;Ljava/lang/String;)V
    .locals 11

    const-string v0, "Exception occurred: "

    const-string v1, "SafeCall"

    const-string v2, "event"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cid"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lt23/b4;->q()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Event received "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v2, v6, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v2, p1, Lio/getstream/android/video/generated/models/CallRingEvent;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lt23/b4;->V:Ld33/c;

    move-object v4, p1

    check-cast v4, Lio/getstream/android/video/generated/models/CallRingEvent;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/CallRingEvent;->getCallCid()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Ld33/a;->w:Ld33/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "callCid"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iget-object v3, p0, Lt23/b4;->U:Lt23/g1;

    iget-object v4, v3, Lt23/g1;->a:Lt23/b4;

    instance-of v6, p1, Lio/getstream/android/video/generated/models/ConnectedEvent;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_2

    iget-object v2, v3, Lt23/g1;->d:Lec3/h2;

    sget-object v3, Lt23/h1;->a:Lt23/h1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v5, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of v6, p1, Lio/getstream/android/video/generated/models/CallCreatedEvent;

    const/4 v9, 0x6

    const-string v10, ":"

    if-eqz v6, :cond_3

    move-object v2, p1

    check-cast v2, Lio/getstream/android/video/generated/models/CallCreatedEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallCreatedEvent;->getCallCid()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v9}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v3, v2}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    move-object v2, p1

    check-cast v2, Lio/getstream/android/video/generated/models/CallRingEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallRingEvent;->getCallCid()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6, v9}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v6, v2}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v2

    iget-object v3, v3, Lt23/g1;->e:Lec3/h2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v5, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    goto :goto_3

    :cond_5
    instance-of p2, p1, Lio/getstream/android/video/generated/models/WSCallEvent;

    if-eqz p2, :cond_6

    move-object p2, p1

    check-cast p2, Lio/getstream/android/video/generated/models/WSCallEvent;

    goto :goto_1

    :cond_6
    move-object p2, v5

    :goto_1
    if-eqz p2, :cond_7

    invoke-interface {p2}, Lio/getstream/android/video/generated/models/WSCallEvent;->getCallCID()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_7
    move-object p2, v5

    :goto_2
    if-nez p2, :cond_8

    const-string p2, ""

    :cond_8
    :goto_3
    iget-object v2, p0, Lt23/b4;->Y:Ljava/util/LinkedHashSet;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/r1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, Lt23/r1;->a:Lqm2/c;

    invoke-virtual {v3, p1}, Lqm2/c;->b(Lio/getstream/android/video/generated/models/VideoEvent;)V

    goto :goto_4

    :cond_9
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_a

    :cond_a
    iget-object v2, p0, Lt23/b4;->Z:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/c0;

    if-eqz v2, :cond_b

    invoke-virtual {v2, p1}, Lt23/c0;->c(Lio/getstream/android/video/generated/models/VideoEvent;)V

    :cond_b
    :try_start_0
    iget-object v2, p0, Lt23/b4;->a0:La0/a0;

    invoke-virtual {v2}, La0/a0;->h()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/c0;

    iget-object v4, v3, Lt23/c0;->v:Ljava/lang/String;

    instance-of v6, p1, Lio/getstream/android/video/generated/models/WSCallEvent;

    if-eqz v6, :cond_d

    move-object v6, p1

    check-cast v6, Lio/getstream/android/video/generated/models/WSCallEvent;

    invoke-interface {v6}, Lio/getstream/android/video/generated/models/WSCallEvent;->getCallCID()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto :goto_6

    :cond_d
    move v4, v8

    :goto_6
    if-eqz v4, :cond_c

    invoke-virtual {v3, p1}, Lt23/c0;->c(Lio/getstream/android/video/generated/models/VideoEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v2

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v4, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v1, v6, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_e
    instance-of v2, p1, Lio/getstream/android/video/generated/models/CallAcceptedEvent;

    if-nez v2, :cond_f

    goto :goto_7

    :cond_f
    iget-object v2, p0, Lt23/b4;->U:Lt23/g1;

    iget-object v2, v2, Lt23/g1;->g:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/c0;

    if-nez v2, :cond_10

    goto :goto_7

    :cond_10
    iget-object v3, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/d3;

    instance-of v4, v3, Lt23/a3;

    if-nez v4, :cond_11

    sget-object v4, Lt23/y2;->a:Lt23/y2;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    :cond_11
    move v7, v8

    :cond_12
    iget-object v2, v2, Lt23/c0;->v:Ljava/lang/String;

    move-object v3, p1

    check-cast v3, Lio/getstream/android/video/generated/models/CallAcceptedEvent;

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/CallAcceptedEvent;->getCallCid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v7, :cond_13

    if-eqz v2, :cond_19

    :cond_13
    :goto_7
    iget-object v2, p0, Lt23/b4;->Z:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt23/c0;

    if-eqz p2, :cond_16

    iget-object v2, p2, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v2, p1}, Lt23/s0;->f(Lio/getstream/android/video/generated/models/VideoEvent;)V

    iget-object v2, p2, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld33/h1;

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->z:Lb23/g;

    iget-object v7, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_14

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "[rtc handleEvent] #sfu; event: "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v6, v3, v7, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_14
    instance-of v3, p1, Lv33/w;

    if-eqz v3, :cond_15

    iget-object v3, v2, Ld33/h1;->j:Lbc3/c0;

    new-instance v4, La1/h;

    const/16 v6, 0xc

    invoke-direct {v4, v2, p1, v5, v6}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v3, v5, v5, v4, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_15
    invoke-virtual {p2, p1}, Lt23/c0;->k(Lio/getstream/android/video/generated/models/VideoEvent;)V

    :cond_16
    :try_start_1
    iget-object p2, p0, Lt23/b4;->a0:La0/a0;

    invoke-virtual {p2}, La0/a0;->h()Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_17
    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/c0;

    iget-object v3, v2, Lt23/c0;->v:Ljava/lang/String;

    instance-of v4, p1, Lio/getstream/android/video/generated/models/WSCallEvent;

    if-eqz v4, :cond_18

    move-object v4, p1

    check-cast v4, Lio/getstream/android/video/generated/models/WSCallEvent;

    invoke-interface {v4}, Lio/getstream/android/video/generated/models/WSCallEvent;->getCallCID()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    goto :goto_9

    :cond_18
    move v3, v8

    :goto_9
    if-eqz v3, :cond_17

    iget-object v3, v2, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v3, p1}, Lt23/s0;->f(Lio/getstream/android/video/generated/models/VideoEvent;)V

    invoke-virtual {v2, p1}, Lt23/c0;->k(Lio/getstream/android/video/generated/models/VideoEvent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_8

    :catch_1
    move-exception p1

    sget-object p2, Lb23/i;->a:Lb23/i;

    sget-object p2, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {p2, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_19

    sget-object p2, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v2, v1, v0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    :goto_a
    return-void
.end method

.method public final onPermissionDenied()V
    .locals 1

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    invoke-virtual {v0}, Lh43/b;->onPermissionDenied()V

    return-void
.end method

.method public final onPermissionGranted()V
    .locals 1

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    invoke-virtual {v0}, Lh43/b;->onPermissionGranted()V

    return-void
.end method

.method public final onPermissionRationale()V
    .locals 1

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    invoke-virtual {v0}, Lh43/b;->onPermissionRationale()V

    return-void
.end method

.method public final onPermissionRequested()V
    .locals 1

    iget-object v0, p0, Lt23/b4;->H:Lh43/b;

    invoke-virtual {v0}, Lh43/b;->onPermissionRequested()V

    return-void
.end method

.method public final p(Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lt23/r3;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lt23/r3;

    iget v1, v0, Lt23/r3;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt23/r3;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt23/r3;

    invoke-direct {v0, p0, p1}, Lt23/r3;-><init>(Lt23/b4;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lt23/r3;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt23/r3;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lt23/r3;->w:Lt23/b4;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/b4;->T:Lbc3/j0;

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ll43/b;

    const/4 v2, 0x6

    invoke-direct {p1, p0, v3, v2}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    const/4 v2, 0x3

    iget-object v6, p0, Lt23/b4;->x:Lbc3/c0;

    invoke-static {v6, v3, p1, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    iput-object p1, p0, Lt23/b4;->T:Lbc3/j0;

    :goto_1
    iput-object p0, v0, Lt23/r3;->w:Lt23/b4;

    iput v5, v0, Lt23/r3;->z:I

    invoke-virtual {p1, v0}, Lbc3/t1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, p0

    :goto_2
    iget-object p1, v2, Lt23/b4;->e0:Ljava/lang/String;

    if-eqz p1, :cond_6

    new-instance v0, Ln23/g;

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_6
    iput-object v3, v0, Lt23/r3;->w:Lt23/b4;

    iput v4, v0, Lt23/r3;->z:I

    invoke-virtual {v2, v0}, Lt23/b4;->w(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    return-object p1
.end method

.method public final q()Lb23/k;
    .locals 1

    iget-object v0, p0, Lt23/b4;->X:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt23/b4;->I:Ld33/c;

    invoke-virtual {v0}, Ld33/c;->a()Lio/getstream/video/android/model/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final s(Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;Ljg3/i;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ls83/c;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p15

    instance-of v2, v1, Lt23/t3;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lt23/t3;

    iget v3, v2, Lt23/t3;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lt23/t3;->y:I

    goto :goto_0

    :cond_0
    new-instance v2, Lt23/t3;

    invoke-direct {v2, v0, v1}, Lt23/t3;-><init>(Lt23/b4;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lt23/t3;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lt23/t3;->y:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v16, Lio/getstream/android/video/generated/models/CallRequest;

    const/16 v14, 0x9

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    move-object/from16 v13, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v6, v16

    invoke-direct/range {v6 .. v15}, Lio/getstream/android/video/generated/models/CallRequest;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lio/getstream/android/video/generated/models/JoinCallRequest;

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static/range {p10 .. p10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static/range {p9 .. p9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    const/16 v17, 0x88

    const/16 v18, 0x0

    const/4 v14, 0x0

    move-object/from16 v7, p11

    move-object/from16 v11, p12

    move-object/from16 v15, p13

    move-object/from16 v9, p14

    invoke-direct/range {v6 .. v18}, Lio/getstream/android/video/generated/models/JoinCallRequest;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lt23/u3;

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object/from16 p5, p1

    move-object/from16 p6, p2

    move-object/from16 p4, v0

    move-object/from16 p3, v1

    move-object/from16 p8, v4

    move-object/from16 p7, v6

    move/from16 p9, v7

    invoke-direct/range {p3 .. p9}, Lt23/u3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v5, v2, Lt23/t3;->y:I

    invoke-virtual {v0, v1, v2}, Lt23/b4;->m(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    :goto_1
    check-cast v1, Ln23/h;

    return-object v1
.end method

.method public final t(Lt23/c0;)V
    .locals 5

    iget-object p1, p1, Lt23/c0;->v:Ljava/lang/String;

    invoke-virtual {p0}, Lt23/b4;->q()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[cleanup] Removing call from cache: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lt23/b4;->Z:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final u(Ljava/util/Map;Ljava/util/List;IZLs83/c;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p5

    instance-of v4, v3, Lt23/v3;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lt23/v3;

    iget v5, v4, Lt23/v3;->z:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lt23/v3;->z:I

    goto :goto_0

    :cond_0
    new-instance v4, Lt23/v3;

    invoke-direct {v4, v0, v3}, Lt23/v3;-><init>(Lt23/b4;Ls83/c;)V

    :goto_0
    iget-object v3, v4, Lt23/v3;->x:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lt23/v3;->z:I

    const/4 v7, 0x0

    const-string v8, "<this>"

    const/16 v9, 0xa

    const/4 v10, 0x1

    if-eqz v6, :cond_2

    if-ne v6, v10, :cond_1

    iget-object v1, v4, Lt23/v3;->w:Lt23/b4;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt23/b4;->q()Lb23/k;

    move-result-object v3

    iget-object v6, v3, Lb23/k;->c:Lb23/e;

    iget-object v11, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v13, "[queryCalls] filters: "

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v13, p1

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v14, ", sort: "

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v14, ", limit: "

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, ", watch: "

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v14, p4

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v12, v11, v6, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    move-object/from16 v13, p1

    move/from16 v14, p4

    :goto_1
    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc43/u;

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, Lio/getstream/android/video/generated/models/SortParamRequest;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/16 v19, 0x4

    const/16 v20, 0x0

    const-string v17, "cid"

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, Lio/getstream/android/video/generated/models/SortParamRequest;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v1, Lio/getstream/android/video/generated/models/QueryCallsRequest;

    new-instance v15, Ljava/lang/Integer;

    invoke-direct {v15, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v14, v1

    move-object/from16 v19, v3

    move-object/from16 v20, v13

    invoke-direct/range {v14 .. v20}, Lio/getstream/android/video/generated/models/QueryCallsRequest;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)V

    new-instance v1, La00/f;

    invoke-direct {v1, v0, v14, v7}, La00/f;-><init>(Lt23/b4;Lio/getstream/android/video/generated/models/QueryCallsRequest;Lq83/d;)V

    iput-object v0, v4, Lt23/v3;->w:Lt23/b4;

    iput v10, v4, Lt23/v3;->z:I

    invoke-virtual {v0, v1, v4}, Lt23/b4;->m(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_5

    return-object v5

    :cond_5
    move-object v1, v0

    :goto_3
    check-cast v3, Ln23/h;

    instance-of v2, v3, Ln23/g;

    if-eqz v2, :cond_6

    move-object v4, v3

    check-cast v4, Ln23/g;

    iget-object v4, v4, Ln23/g;->a:Ljava/lang/Object;

    check-cast v4, Lio/getstream/android/video/generated/models/QueryCallsResponse;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/QueryCallsResponse;->getCalls()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/android/video/generated/models/CallStateResponseFields;

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v10

    invoke-virtual {v10}, Lio/getstream/android/video/generated/models/CallResponse;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v6, v10}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v6

    iget-object v6, v6, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v10

    invoke-virtual {v6, v10}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    iget-object v10, v6, Lt23/s0;->L:Lec3/h2;

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->getOwnCapabilities()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v10, v11}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->getMembers()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v6, v5}, Lt23/s0;->c(Ljava/util/List;)V

    goto :goto_4

    :cond_6
    if-eqz v2, :cond_a

    check-cast v3, Ln23/g;

    iget-object v1, v3, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Lio/getstream/android/video/generated/models/QueryCallsResponse;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/QueryCallsResponse;->getCalls()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/android/video/generated/models/CallStateResponseFields;

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallResponse;->getBlockedUserIds()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v6

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getCid()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getType()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v10

    invoke-virtual {v10}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getSettings()Lio/getstream/android/video/generated/models/CallSettingsResponse;

    move-result-object v10

    invoke-virtual {v10}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getBroadcasting()Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;

    move-result-object v10

    invoke-virtual {v10}, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->getEnabled()Z

    move-result v15

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getSettings()Lio/getstream/android/video/generated/models/CallSettingsResponse;

    move-result-object v10

    invoke-virtual {v10}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getRecording()Lio/getstream/android/video/generated/models/RecordSettingsResponse;

    move-result-object v10

    invoke-virtual {v10}, Lio/getstream/android/video/generated/models/RecordSettingsResponse;->getAudioOnly()Z

    move-result v16

    new-instance v10, Ljava/util/Date;

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedAt()Ljg3/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljg3/i;->toEpochSecond()J

    move-result-wide v17

    const-wide/16 v19, 0x3e8

    move-object/from16 v21, v8

    mul-long v7, v17, v19

    invoke-direct {v10, v7, v8}, Ljava/util/Date;-><init>(J)V

    new-instance v7, Ljava/util/Date;

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getUpdatedAt()Ljg3/i;

    move-result-object v8

    invoke-virtual {v8}, Ljg3/i;->toEpochSecond()J

    move-result-wide v17

    move-object/from16 p1, v10

    mul-long v9, v17, v19

    invoke-direct {v7, v9, v10}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallResponse;->getCustom()Ljava/util/Map;

    move-result-object v19

    new-instance v10, Lc43/c;

    move-object/from16 v17, p1

    move-object/from16 v18, v7

    invoke-direct/range {v10 .. v19}, Lc43/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Date;Ljava/util/Date;Ljava/util/Map;)V

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->getMembers()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/android/video/generated/models/MemberResponse;

    invoke-static {v9}, Lvd/f;->T(Lio/getstream/android/video/generated/models/MemberResponse;)Lc43/d;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_7
    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->getMembership()Lio/getstream/android/video/generated/models/MemberResponse;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-static {v4}, Lvd/f;->T(Lio/getstream/android/video/generated/models/MemberResponse;)Lc43/d;

    move-result-object v4

    goto :goto_7

    :cond_8
    const/4 v4, 0x0

    :goto_7
    new-instance v6, Lc43/b;

    invoke-direct {v6, v5, v10, v7, v4}, Lc43/b;-><init>(Ljava/util/List;Lc43/c;Ljava/util/ArrayList;Lc43/d;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v9, v8

    move-object/from16 v8, v21

    const/4 v7, 0x0

    goto/16 :goto_5

    :cond_9
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/QueryCallsResponse;->getNext()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/QueryCallsResponse;->getPrev()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lc43/m;

    invoke-direct {v5, v3, v1, v2, v4}, Lc43/m;-><init>(Ljava/util/ArrayList;Lio/getstream/android/video/generated/models/QueryCallsResponse;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ln23/g;

    invoke-direct {v1, v5}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_a
    instance-of v1, v3, Ln23/f;

    if-eqz v1, :cond_b

    return-object v3

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final v(Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lt23/x3;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lt23/x3;

    iget v1, v0, Lt23/x3;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt23/x3;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt23/x3;

    invoke-direct {v0, p0, p1}, Lt23/x3;-><init>(Lt23/b4;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lt23/x3;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt23/x3;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lt23/x3;->w:Lt23/b4;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/b4;->W:Lbc3/j0;

    if-eqz p1, :cond_5

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v7, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v2, v7}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    if-eq v2, p1, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v6

    :goto_1
    if-eqz p1, :cond_5

    iput-object p0, v0, Lt23/x3;->w:Lt23/b4;

    iput v5, v0, Lt23/x3;->z:I

    invoke-virtual {p1, v0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v2, p0

    :goto_2
    iget-object p1, v2, Lt23/b4;->H:Lh43/b;

    iput-object v6, v0, Lt23/x3;->w:Lt23/b4;

    iput v4, v0, Lt23/x3;->z:I

    iget-object p1, p1, Lh43/b;->x:Le43/g;

    sget-object v0, Lh43/b;->E:Lg73/d;

    invoke-static {}, Lg73/d;->b()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[registerPushDevice] no args"

    invoke-interface {v0, v5, v4, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {}, Lg73/d;->b()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v2, p1, Le43/g;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const-string v7, "[registerPushDevice] no args, push device generator: "

    invoke-static {v2, v7}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v5, v4, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v0, p1, Le43/g;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_9

    invoke-static {}, Lg73/d;->b()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    throw v6

    :cond_9
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_a
    iget-object p1, p1, Le43/g;->a:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_c

    if-ne v3, v1, :cond_b

    :goto_4
    return-object v1

    :cond_b
    return-object v3

    :cond_c
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

.method public final w(Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p1, Lt23/y3;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lt23/y3;

    iget v1, v0, Lt23/y3;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt23/y3;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt23/y3;

    invoke-direct {v0, p0, p1}, Lt23/y3;-><init>(Lt23/b4;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lt23/y3;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt23/y3;->F:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-ne v2, v4, :cond_2

    iget v2, v0, Lt23/y3;->y:I

    iget-object v6, v0, Lt23/y3;->x:Ln23/h;

    iget-object v7, v0, Lt23/y3;->w:Lt23/b4;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move p1, v2

    move-object v2, v7

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget v2, v0, Lt23/y3;->y:I

    iget-object v6, v0, Lt23/y3;->w:Lt23/b4;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v6

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    move-object v2, p0

    :cond_5
    if-ge p1, v3, :cond_8

    add-int/lit8 p1, p1, 0x1

    iput-object v2, v0, Lt23/y3;->w:Lt23/b4;

    const/4 v6, 0x0

    iput-object v6, v0, Lt23/y3;->x:Ln23/h;

    iput p1, v0, Lt23/y3;->y:I

    iput v5, v0, Lt23/y3;->F:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lt23/q3;

    const/4 v8, 0x0

    invoke-direct {v7, v2, v6, v8}, Lt23/q3;-><init>(Lt23/b4;Lq83/d;I)V

    invoke-virtual {v2, v7, v0}, Lt23/b4;->m(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_6

    goto :goto_2

    :cond_6
    move-object v7, v2

    move v2, p1

    move-object p1, v6

    :goto_1
    move-object v6, p1

    check-cast v6, Ln23/h;

    instance-of p1, v6, Ln23/g;

    if-eqz p1, :cond_7

    move-object p1, v6

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iput-object p1, v7, Lt23/b4;->e0:Ljava/lang/String;

    return-object v6

    :cond_7
    iput-object v7, v0, Lt23/y3;->w:Lt23/b4;

    iput-object v6, v0, Lt23/y3;->x:Ln23/h;

    iput v2, v0, Lt23/y3;->y:I

    iput v4, v0, Lt23/y3;->F:I

    const-wide/16 v8, 0x64

    invoke-static {v8, v9, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    :goto_2
    return-object v1

    :goto_3
    if-ne p1, v3, :cond_5

    return-object v6

    :cond_8
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "failed to select location"

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method
