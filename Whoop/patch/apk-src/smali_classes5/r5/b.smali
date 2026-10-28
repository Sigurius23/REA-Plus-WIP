.class public final synthetic Lr5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lr5/b;->w:I

    iput-object p2, p0, Lr5/b;->x:Ljava/lang/Object;

    iput-object p3, p0, Lr5/b;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 22

    move-object/from16 v1, p0

    iget v0, v1, Lr5/b;->w:I

    const/16 v2, 0xd

    const/4 v3, 0x0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x7

    const/4 v7, 0x5

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lzt/m;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Lcq/i;

    :try_start_0
    invoke-virtual {v0}, Lzt/m;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcq/i;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v2, v0}, Lcq/i;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Ly40/d;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v0, v0, Ly40/d;->x:Lu40/h;

    invoke-interface {v0, v2}, Lx40/b;->onSuccess(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Ly40/d;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Lu40/d;

    iget-object v0, v0, Ly40/d;->x:Lu40/h;

    new-instance v3, Lcom/stripe/hcaptcha/HCaptchaException;

    invoke-direct {v3, v2}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-interface {v0, v3}, Lx40/a;->e(Lcom/stripe/hcaptcha/HCaptchaException;)V

    return-void

    :pswitch_2
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Ld9/e;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    iget-object v0, v0, Ld9/e;->b:Ljava/lang/Object;

    check-cast v0, Lx8/m;

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/ConnectivityManager;

    if-nez v3, :cond_1

    :catch_1
    :cond_0
    move v6, v10

    goto :goto_2

    :cond_1
    :try_start_1
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    move-result v4

    const/16 v5, 0x9

    const/4 v12, 0x6

    if-eqz v4, :cond_5

    if-eq v4, v11, :cond_4

    if-eq v4, v8, :cond_5

    if-eq v4, v7, :cond_5

    if-eq v4, v12, :cond_3

    if-eq v4, v5, :cond_7

    const/16 v6, 0x8

    goto :goto_2

    :cond_3
    :pswitch_3
    move v6, v7

    goto :goto_2

    :cond_4
    :pswitch_4
    move v6, v9

    goto :goto_2

    :cond_5
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v3

    packed-switch v3, :pswitch_data_1

    :pswitch_5
    move v6, v12

    goto :goto_2

    :pswitch_6
    sget v3, Lx8/t;->a:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_0

    move v6, v5

    goto :goto_2

    :pswitch_7
    move v6, v8

    goto :goto_2

    :pswitch_8
    const/4 v6, 0x3

    goto :goto_2

    :cond_6
    :goto_1
    move v6, v11

    :cond_7
    :goto_2
    sget v3, Lx8/t;->a:I

    const/16 v4, 0x1f

    if-lt v3, v4, :cond_8

    if-ne v6, v7, :cond_8

    invoke-static {v2, v0}, Lx8/k;->a(Landroid/content/Context;Lx8/m;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v0, v6}, Lx8/m;->c(I)V

    :goto_3
    return-void

    :pswitch_9
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lx8/m;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    const-string v4, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v4, Ld9/e;

    invoke-direct {v4, v0, v7}, Ld9/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v4, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void

    :pswitch_a
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lb30/m;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    iget-object v3, v0, Lb30/m;->E:Ljava/lang/Object;

    iput-object v2, v0, Lb30/m;->E:Ljava/lang/Object;

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    iget-object v0, v0, Lb30/m;->z:Ljava/lang/Object;

    check-cast v0, Lb9/u;

    iget-object v0, v0, Lb9/u;->w:Lb9/f0;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0}, Lb9/f0;->L0()V

    const/16 v4, 0xa

    invoke-virtual {v0, v11, v4, v2}, Lb9/f0;->v0(IILjava/lang/Object;)V

    invoke-virtual {v0, v9, v4, v2}, Lb9/f0;->v0(IILjava/lang/Object;)V

    iget-object v0, v0, Lb9/f0;->N:Lx8/i;

    new-instance v2, Lb9/t;

    invoke-direct {v2, v3, v11}, Lb9/t;-><init>(II)V

    const/16 v3, 0x15

    invoke-virtual {v0, v3, v2}, Lx8/i;->e(ILx8/f;)V

    :cond_9
    return-void

    :pswitch_b
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lwn/b;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Landroid/net/Uri;

    iput-boolean v10, v0, Lwn/b;->I:Z

    invoke-virtual {v0, v2}, Lwn/b;->b(Landroid/net/Uri;)V

    return-void

    :pswitch_c
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Lb9/m1;

    const-string v3, "audio"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    sput-object v0, Lv8/b;->a:Landroid/media/AudioManager;

    invoke-virtual {v2}, Lb9/m1;->c()Z

    return-void

    :pswitch_d
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lu4/b;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Typeface;

    invoke-virtual {v0, v2}, Lu4/b;->k(Landroid/graphics/Typeface;)V

    return-void

    :pswitch_e
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lq3/i;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Lb9/g;

    monitor-enter v2

    monitor-exit v2

    iget-object v0, v0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v2, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    iget-object v2, v0, Lsm/d;->z:La30/w0;

    iget-object v2, v2, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Lsn/v;

    invoke-virtual {v0, v2}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object v2

    new-instance v3, Lsm/b;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lsm/b;-><init>(I)V

    const/16 v4, 0x3f5

    invoke-virtual {v0, v2, v4, v3}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_f
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Ltd3/c;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-wide v5, v0, Ltd3/c;->a:J

    iget-object v7, v0, Ltd3/c;->b:Ltd3/d;

    iget-object v8, v7, Ltd3/a;->g:Ltd3/n;

    iget-wide v8, v8, Ltd3/n;->E:J

    sub-long v8, v3, v8

    const-wide/16 v10, 0x5

    add-long/2addr v8, v10

    cmp-long v5, v5, v8

    if-lez v5, :cond_a

    goto :goto_5

    :cond_a
    iput-wide v3, v0, Ltd3/c;->a:J

    invoke-static {}, Ltd3/b;->a()Ltd3/b;

    move-result-object v0

    check-cast v0, Ltd3/f;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/bluetooth/le/ScanResult;

    invoke-virtual {v0, v4}, Ltd3/f;->e(Landroid/bluetooth/le/ScanResult;)Ltd3/m;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_b
    invoke-virtual {v7, v3}, Ltd3/a;->b(Ljava/util/ArrayList;)V

    :goto_5
    return-void

    :pswitch_10
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lbq/b;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Ltd3/m;

    iget-object v0, v0, Lbq/b;->x:Ljava/lang/Object;

    check-cast v0, Ltd3/a;

    iget-object v0, v0, Ltd3/a;->h:Ltd3/i;

    invoke-virtual {v0, v8, v2}, Ltd3/i;->c(ILtd3/m;)V

    return-void

    :pswitch_11
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lsn/k0;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Lwm/p;

    iget-object v3, v0, Lsn/k0;->Q:Lmn/c;

    if-nez v3, :cond_c

    move-object v3, v2

    goto :goto_6

    :cond_c
    new-instance v3, Lwm/l;

    invoke-direct {v3, v4, v5}, Lwm/l;-><init>(J)V

    :goto_6
    iput-object v3, v0, Lsn/k0;->X:Lwm/p;

    invoke-interface {v2}, Lwm/p;->f()J

    move-result-wide v7

    iput-wide v7, v0, Lsn/k0;->Y:J

    iget-wide v7, v0, Lsn/k0;->e0:J

    const-wide/16 v12, -0x1

    cmp-long v3, v7, v12

    if-nez v3, :cond_d

    invoke-interface {v2}, Lwm/p;->f()J

    move-result-wide v7

    cmp-long v3, v7, v4

    if-nez v3, :cond_d

    move v10, v11

    :cond_d
    iput-boolean v10, v0, Lsn/k0;->Z:Z

    if-eqz v10, :cond_e

    goto :goto_7

    :cond_e
    move v6, v11

    :goto_7
    iput v6, v0, Lsn/k0;->a0:I

    iget-object v3, v0, Lsn/k0;->G:Lsn/n0;

    iget-wide v4, v0, Lsn/k0;->Y:J

    invoke-interface {v2}, Lwm/p;->e()Z

    move-result v2

    iget-boolean v6, v0, Lsn/k0;->Z:Z

    invoke-virtual {v3, v4, v5, v2, v6}, Lsn/n0;->q(JZZ)V

    iget-boolean v2, v0, Lsn/k0;->U:Z

    if-nez v2, :cond_f

    invoke-virtual {v0}, Lsn/k0;->z()V

    :cond_f
    return-void

    :pswitch_12
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Ls9/i;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/SurfaceTexture;

    iget-object v3, v0, Ls9/i;->G:Landroid/graphics/SurfaceTexture;

    iget-object v4, v0, Ls9/i;->H:Landroid/view/Surface;

    new-instance v5, Landroid/view/Surface;

    invoke-direct {v5, v2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v2, v0, Ls9/i;->G:Landroid/graphics/SurfaceTexture;

    iput-object v5, v0, Ls9/i;->H:Landroid/view/Surface;

    iget-object v0, v0, Ls9/i;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb9/c0;

    iget-object v2, v2, Lb9/c0;->w:Lb9/f0;

    invoke-virtual {v2, v5}, Lb9/f0;->E0(Ljava/lang/Object;)V

    goto :goto_8

    :cond_10
    if-eqz v3, :cond_11

    invoke-virtual {v3}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_11
    if-eqz v4, :cond_12

    invoke-virtual {v4}, Landroid/view/Surface;->release()V

    :cond_12
    return-void

    :pswitch_13
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Ls5/a;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Lm5/c;

    iget-object v0, v0, Ls5/a;->e:Lm5/g;

    if-eqz v0, :cond_13

    invoke-interface {v0, v2}, Lm5/g;->onResult(Ljava/lang/Object;)V

    return-void

    :cond_13
    const-string v0, "callback"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :pswitch_14
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Ls5/a;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/credentials/exceptions/CreateCredentialException;

    const-string v4, "this$0"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$e"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Ls5/a;->e:Lm5/g;

    if-eqz v0, :cond_14

    invoke-interface {v0, v2}, Lm5/g;->a(Ljava/lang/Object;)V

    return-void

    :cond_14
    const-string v0, "callback"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :pswitch_15
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Lrm/u;

    iget-object v0, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v0, Lrm/x;

    iget v2, v12, Lrm/u;->i0:I

    iget v3, v0, Lrm/x;->c:I

    sub-int/2addr v2, v3

    iput v2, v12, Lrm/u;->i0:I

    iget-boolean v3, v0, Lrm/x;->d:Z

    if-eqz v3, :cond_15

    iget v3, v0, Lrm/x;->e:I

    iput v3, v12, Lrm/u;->j0:I

    iput-boolean v11, v12, Lrm/u;->k0:Z

    :cond_15
    iget-boolean v3, v0, Lrm/x;->f:Z

    if-eqz v3, :cond_16

    iget v3, v0, Lrm/x;->g:I

    iput v3, v12, Lrm/u;->l0:I

    :cond_16
    if-nez v2, :cond_20

    iget-object v2, v0, Lrm/x;->b:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    iget-object v3, v12, Lrm/u;->K0:Lrm/v0;

    iget-object v3, v3, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v3}, Lrm/o1;->p()Z

    move-result v3

    if-nez v3, :cond_17

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v3

    if-eqz v3, :cond_17

    const/4 v3, -0x1

    iput v3, v12, Lrm/u;->L0:I

    const-wide/16 v6, 0x0

    iput-wide v6, v12, Lrm/u;->M0:J

    :cond_17
    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v3

    if-nez v3, :cond_19

    move-object v3, v2

    check-cast v3, Lrm/e1;

    iget-object v3, v3, Lrm/e1;->H:[Lrm/o1;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    iget-object v7, v12, Lrm/u;->P:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v6, v7, :cond_18

    move v6, v11

    goto :goto_9

    :cond_18
    move v6, v10

    :goto_9
    invoke-static {v6}, Llo/a;->i(Z)V

    move v6, v10

    :goto_a
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_19

    iget-object v7, v12, Lrm/u;->P:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lrm/t;

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lrm/o1;

    iput-object v8, v7, Lrm/t;->b:Lrm/o1;

    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_19
    iget-boolean v3, v12, Lrm/u;->k0:Z

    if-eqz v3, :cond_1f

    iget-object v3, v0, Lrm/x;->b:Lrm/v0;

    iget-object v3, v3, Lrm/v0;->b:Lsn/v;

    iget-object v6, v12, Lrm/u;->K0:Lrm/v0;

    iget-object v6, v6, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v3, v6}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1b

    iget-object v3, v0, Lrm/x;->b:Lrm/v0;

    iget-wide v6, v3, Lrm/v0;->d:J

    iget-object v3, v12, Lrm/u;->K0:Lrm/v0;

    iget-wide v8, v3, Lrm/v0;->s:J

    cmp-long v3, v6, v8

    if-eqz v3, :cond_1a

    goto :goto_b

    :cond_1a
    move v11, v10

    :cond_1b
    :goto_b
    if-eqz v11, :cond_1e

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v3

    if-nez v3, :cond_1d

    iget-object v3, v0, Lrm/x;->b:Lrm/v0;

    iget-object v3, v3, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v3}, Lsn/t;->a()Z

    move-result v3

    if-eqz v3, :cond_1c

    goto :goto_c

    :cond_1c
    iget-object v3, v0, Lrm/x;->b:Lrm/v0;

    iget-object v4, v3, Lrm/v0;->b:Lsn/v;

    iget-wide v5, v3, Lrm/v0;->d:J

    iget-object v3, v4, Lsn/t;->a:Ljava/lang/Object;

    iget-object v4, v12, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v2, v3, v4}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget-wide v2, v4, Lrm/m1;->E:J

    add-long/2addr v5, v2

    move-wide v4, v5

    goto :goto_d

    :cond_1d
    :goto_c
    iget-object v2, v0, Lrm/x;->b:Lrm/v0;

    iget-wide v2, v2, Lrm/v0;->d:J

    move-wide v4, v2

    :cond_1e
    :goto_d
    move-wide/from16 v19, v4

    move/from16 v17, v11

    goto :goto_e

    :cond_1f
    move-wide/from16 v19, v4

    move/from16 v17, v10

    :goto_e
    iput-boolean v10, v12, Lrm/u;->k0:Z

    iget-object v13, v0, Lrm/x;->b:Lrm/v0;

    iget v15, v12, Lrm/u;->l0:I

    iget v0, v12, Lrm/u;->j0:I

    const/16 v21, -0x1

    const/4 v14, 0x1

    const/16 v16, 0x0

    move/from16 v18, v0

    invoke-virtual/range {v12 .. v21}, Lrm/u;->z0(Lrm/v0;IIZZIJI)V

    :cond_20
    return-void

    :pswitch_16
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/WorkDatabase;

    iget-object v3, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v3, Ljc/v;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v4

    iget-object v4, v4, Lqc/u;->a:Landroidx/room/z0;

    new-instance v5, Lq80/f;

    invoke-direct {v5, v2}, Lq80/f;-><init>(I)V

    invoke-static {v4, v11, v10, v5}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v3, v4}, Lq83/g;->m(Ljc/v;Ljava/lang/String;)V

    goto :goto_f

    :cond_21
    iget-object v2, v3, Ljc/v;->b:Lic/b;

    iget-object v2, v2, Lic/b;->d:Lic/y;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v4, Lqc/d;

    const-string v5, "last_cancel_all_time_ms"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v4, v5, v2}, Lqc/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()Lqc/e;

    move-result-object v0

    invoke-virtual {v0, v4}, Lqc/e;->b(Lqc/d;)V

    return-void

    :pswitch_17
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Ljc/v;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lq83/g;->m(Ljc/v;Ljava/lang/String;)V

    return-void

    :pswitch_18
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lxl/a;

    iget-object v3, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v3, Lb9/g;

    monitor-enter v3

    monitor-exit v3

    iget-object v0, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v4, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    iget-object v4, v0, Lc9/h;->z:La30/w0;

    iget-object v4, v4, La30/w0;->F:Ljava/lang/Object;

    check-cast v4, Ll9/c0;

    invoke-virtual {v0, v4}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object v4

    new-instance v5, Lab/g0;

    invoke-direct {v5, v4, v3, v2}, Lab/g0;-><init>(Lc9/a;Ljava/lang/Object;I)V

    const/16 v2, 0x3fc

    invoke-virtual {v0, v4, v2, v5}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_19
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lxl/a;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Lu8/y0;

    iget-object v0, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v3, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iput-object v2, v0, Lb9/f0;->G0:Lu8/y0;

    iget-object v0, v0, Lb9/f0;->N:Lx8/i;

    new-instance v3, Lb9/b0;

    invoke-direct {v3, v2}, Lb9/b0;-><init>(Lu8/y0;)V

    const/16 v2, 0x19

    invoke-virtual {v0, v2, v3}, Lx8/i;->e(ILx8/f;)V

    return-void

    :pswitch_1a
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lq3/i;

    iget-object v0, v0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lr9/c;

    iget-object v0, v0, Lr9/c;->g:Lr9/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_1b
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lr5/e;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    const-string v3, "this$0"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$e"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lr5/e;->e()Lm5/g;

    move-result-object v0

    invoke-interface {v0, v2}, Lm5/g;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_1c
    iget-object v0, v1, Lr5/b;->x:Ljava/lang/Object;

    check-cast v0, Lr5/e;

    iget-object v2, v1, Lr5/b;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    const-string v3, "this$0"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$exception"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lr5/e;->e()Lm5/g;

    move-result-object v0

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-interface {v0, v2}, Lm5/g;->a(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
