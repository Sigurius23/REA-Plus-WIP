.class public final Lj43/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj43/a;->w:I

    iput-object p1, p0, Lj43/a;->x:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lj43/a;->w:I

    .line 2
    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Lj43/a;->x:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lj43/a;->w:I

    const/16 v1, 0x20

    const-string v2, "e"

    const/4 v3, 0x3

    const/4 v4, 0x2

    const-string v5, "instance"

    const-string v6, "$this$withDensity"

    const/4 v7, 0x0

    const-string v8, "it"

    const/4 v9, 0x0

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    iget-object v11, p0, Lj43/a;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/net/ConnectivityManager;

    const-string v0, "$this$callWithSecurityExceptionHandling"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p1, v11}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-object v10

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    check-cast v11, Ld4/l;

    invoke-virtual {v11, v7}, Ld4/l;->cancel(Z)Z

    return-object v10

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    check-cast v11, Ly53/c;

    check-cast v11, Lz53/g;

    iget-object p1, v11, Lz53/g;->z:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/z;

    :try_start_0
    instance-of v0, p1, Lbc3/c1;

    if-eqz v0, :cond_0

    check-cast p1, Lbc3/c1;

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/io/Closeable;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/io/Closeable;

    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-object v10

    :pswitch_2
    check-cast p1, Lstream/video/sfu/models/Error;

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ly33/e;

    iget-object v0, v11, Ly33/e;->b:La0/a1;

    invoke-virtual {v0, p1}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v10

    :pswitch_3
    check-cast p1, Lj3/c;

    check-cast v11, Ly2/f1;

    iget-object v0, v11, Ly2/f1;->V:Lj3/c;

    invoke-virtual {v11, p1, v0}, Ly2/f1;->X0(Lj3/c;Lj3/c;)V

    return-object v10

    :pswitch_4
    check-cast p1, Lj3/c;

    check-cast v11, Ly2/x;

    iget-object v0, v11, Ly2/x;->O:Ly2/w;

    iget-object v0, v0, Ly2/w;->a:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iput-object p1, v11, Ly2/x;->Q:Lj3/c;

    return-object v10

    :pswitch_5
    check-cast p1, Lvj/b;

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lnj/b;

    invoke-virtual {v11, p1}, Lnj/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    if-eqz p1, :cond_2

    check-cast v11, Lv53/c;

    iget-object p1, v11, Lv53/c;->w:Lz53/g;

    invoke-static {p1, v9}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_2
    return-object v10

    :pswitch_7
    check-cast p1, Lej/b;

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v11

    :pswitch_8
    check-cast p1, Ljava/lang/String;

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Landroid/content/Context;

    invoke-static {v11, p1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    check-cast v11, Lu2/g0;

    iget-object v0, v11, Lu2/g0;->y:Lbc3/m;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    :cond_3
    iput-object v9, v11, Lu2/g0;->y:Lbc3/m;

    return-object v10

    :pswitch_a
    check-cast p1, Lcom/squareup/wire/l;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ltx/b;

    iget-object v0, v11, Ltx/b;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/squareup/wire/l;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/lang/reflect/Method;

    invoke-virtual {v11, p1, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/squareup/wire/j;

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/lang/reflect/Field;

    invoke-virtual {v11, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lud3/j;

    check-cast v11, Lzd3/o;

    invoke-virtual {v11}, Lzd3/o;->cancel()V

    return-object v10

    :pswitch_e
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lt23/g2;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    iget-object p1, v11, Lt23/g2;->x:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :cond_4
    return-object p1

    :pswitch_f
    check-cast p1, Lc33/e;

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lc33/l;

    if-eqz v11, :cond_5

    invoke-virtual {v11}, Lc33/l;->a()Lz40/e;

    move-result-object v0

    goto :goto_1

    :cond_5
    move-object v0, v9

    :goto_1
    invoke-virtual {p1}, Lc33/e;->a()Lbc3/c0;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    new-instance v2, Landroidx/room/e;

    invoke-direct {v2, p1, v0, v9, v4}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v9, v9, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_2
    return-object v10

    :pswitch_10
    check-cast p1, Landroidx/credentials/exceptions/CreateCredentialException;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ls5/a;

    iget-object v0, v11, Ls5/a;->f:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_7

    new-instance v1, Lr5/b;

    const/16 v2, 0x8

    invoke-direct {v1, v2, v11, p1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v10

    :cond_7
    const-string p1, "executor"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :pswitch_11
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lkotlin/jvm/internal/m;

    invoke-interface {v11, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v10

    :pswitch_12
    check-cast p1, Landroidx/credentials/exceptions/GetCredentialException;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lr5/e;

    invoke-virtual {v11}, Lr5/e;->f()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lr5/a;

    invoke-direct {v1, v11, p1, v7}, Lr5/a;-><init>(Lr5/e;Landroidx/credentials/exceptions/GetCredentialException;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v10

    :pswitch_13
    check-cast p1, Lp1/i0;

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Landroidx/media3/exoplayer/ExoPlayer;

    new-instance p1, Lb1/e;

    const/16 v0, 0xb

    invoke-direct {p1, v11, v0}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_14
    check-cast p1, Lpv/a;

    const-string v0, "$this$GesturesSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Landroid/content/res/TypedArray;

    const/16 v0, 0x2b

    const/4 v2, 0x1

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->a:Z

    const/16 v0, 0x27

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->b:Z

    const/16 v0, 0x2d

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->c:Z

    const/16 v0, 0x2f

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->d:Z

    const/16 v0, 0x28

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->e:Z

    invoke-static {v3}, Le4/p;->f(I)[I

    move-result-object v0

    const/16 v3, 0x2e

    invoke-virtual {v11, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    aget v0, v0, v3

    const-string v3, "<set-?>"

    invoke-static {v0, v3}, Lih0/d0;->w(ILjava/lang/String;)V

    iput v0, p1, Lpv/a;->f:I

    const/16 v0, 0x1f

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->g:Z

    invoke-virtual {v11, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->h:Z

    const/16 v0, 0x29

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->i:Z

    const/16 v0, 0x21

    invoke-virtual {v11, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x22

    invoke-virtual {v11, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_8

    new-instance v9, Lcom/mapbox/maps/ScreenCoordinate;

    const/4 v3, 0x0

    invoke-virtual {v11, v0, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    float-to-double v4, v0

    invoke-virtual {v11, v1, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    float-to-double v0, v0

    invoke-direct {v9, v4, v5, v0, v1}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    :cond_8
    iput-object v9, p1, Lpv/a;->j:Lcom/mapbox/maps/ScreenCoordinate;

    const/16 v0, 0x26

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->k:Z

    const/16 v0, 0x2a

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->l:Z

    const/16 v0, 0x2c

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->m:Z

    const/16 v0, 0x24

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->n:Z

    const/16 v0, 0x23

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->o:Z

    const/16 v0, 0x30

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v11, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p1, Lpv/a;->p:F

    const/16 v0, 0x25

    invoke-virtual {v11, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lpv/a;->q:Z

    return-object v10

    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v11, Lcom/amplitude/android/engagement/a;

    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    iget-object v0, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lhj/v;

    iget v0, v0, Lhj/v;->w:I

    const/4 v1, 0x4

    if-le v1, v0, :cond_9

    goto :goto_3

    :cond_9
    const-string v0, "AmplitudeEngagement.sdk[internal]#toggleBypassCustomThrottles()"

    sget-object v1, Lhj/v;->E:Lhj/v;

    invoke-virtual {p1, v1, v0}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    :goto_3
    iget-object p1, v11, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v0, "globalThis.nudgeActions.toggleBypassCustomThrottles()"

    invoke-virtual {p1, v0, v9}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-object v10

    :pswitch_16
    check-cast p1, Lvj/b;

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/Rect;

    check-cast v11, Li3/p;

    invoke-virtual {v11}, Li3/p;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Lh2/b;->e(J)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v11}, Li3/p;->m()J

    move-result-wide v3

    invoke-static {v3, v4}, Lh2/b;->f(J)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v11}, Li3/p;->m()J

    move-result-wide v4

    invoke-static {v4, v5}, Lh2/b;->e(J)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v11}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v5

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_a

    iget-wide v8, v5, Ly2/j1;->y:J

    goto :goto_4

    :cond_a
    move-wide v8, v6

    :goto_4
    shr-long/2addr v8, v1

    long-to-int v1, v8

    add-int/2addr v4, v1

    invoke-virtual {v11}, Li3/p;->m()J

    move-result-wide v8

    invoke-static {v8, v9}, Lh2/b;->f(J)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v11}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v5

    if-eqz v5, :cond_b

    iget-wide v6, v5, Ly2/j1;->y:J

    :cond_b
    const-wide v8, 0xffffffffL

    and-long v5, v6, v8

    long-to-int v5, v5

    add-int/2addr v1, v5

    invoke-direct {v0, v2, v3, v4, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p1, v0}, Lvj/b;->b(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_c

    const-string p1, "#!upload"

    goto :goto_5

    :cond_c
    const-string p1, "#!maxRetryAttemptReached"

    :goto_5
    check-cast v11, Lkk/b;

    iget-object v0, v11, Lkk/b;->h:Ldc3/l;

    invoke-interface {v0, p1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v10

    :pswitch_18
    check-cast p1, Lstream/video/sfu/models/ParticipantSource;

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, [Lstream/video/sfu/models/ParticipantSource;

    invoke-static {v11, p1}, Lm83/n;->z0([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_d

    const p1, 0x7fffffff

    :cond_d
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ln23/e;

    check-cast v11, Lio/getstream/video/android/core/notifications/internal/service/CallService;

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v9

    :cond_e
    sget-object p1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->I:Ll83/p;

    invoke-virtual {v11, v9}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    return-object v10

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
