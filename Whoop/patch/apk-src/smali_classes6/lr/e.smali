.class public final synthetic Llr/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Llr/e;->w:I

    iput-object p1, p0, Llr/e;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lrm/z;Lrm/d1;)V
    .locals 0

    .line 2
    const/16 p1, 0xf

    iput p1, p0, Llr/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Llr/e;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    iget v0, p0, Llr/e;->w:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lzv/c;

    const-string v1, "$previousStatus"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    throw v4

    :pswitch_0
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Laa3/i1;

    iget-object v1, v0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    iget-object v3, v0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayDeque;

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :pswitch_1
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lxv/f;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_2
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lx8/l;

    iget-object v1, v0, Lx8/l;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp9/e;

    if-eqz v1, :cond_8

    iget-object v0, v0, Lx8/l;->c:Lx8/m;

    invoke-virtual {v0}, Lx8/m;->b()I

    move-result v0

    iget-object v4, v1, Lp9/e;->a:Lp9/f;

    monitor-enter v4

    :try_start_1
    iget v1, v4, Lp9/f;->n:I

    if-eqz v1, :cond_1

    iget-boolean v5, v4, Lp9/f;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v5, :cond_1

    monitor-exit v4

    goto/16 :goto_5

    :catchall_1
    move-exception v0

    goto/16 :goto_4

    :cond_1
    if-ne v1, v0, :cond_2

    :try_start_2
    iget-object v1, v4, Lp9/f;->o:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_2

    monitor-exit v4

    goto/16 :goto_5

    :cond_2
    :try_start_3
    iput v0, v4, Lp9/f;->n:I

    if-eq v0, v3, :cond_7

    if-eqz v0, :cond_7

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    goto :goto_3

    :cond_3
    iget-object v1, v4, Lp9/f;->o:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, v4, Lp9/f;->a:Landroid/content/Context;

    sget v3, Lx8/t;->a:I

    if-eqz v1, :cond_4

    const-string v3, "phone"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v1}, Lrg/j;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lrg/j;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    iput-object v1, v4, Lp9/f;->o:Ljava/lang/String;

    :cond_5
    invoke-virtual {v4, v0}, Lp9/f;->a(I)J

    move-result-wide v0

    iput-wide v0, v4, Lp9/f;->l:J

    iget-object v0, v4, Lp9/f;->d:Lx8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget v3, v4, Lp9/f;->g:I

    if-lez v3, :cond_6

    iget-wide v5, v4, Lp9/f;->h:J

    sub-long v5, v0, v5

    long-to-int v3, v5

    move v5, v3

    goto :goto_2

    :cond_6
    move v5, v2

    :goto_2
    iget-wide v6, v4, Lp9/f;->i:J

    iget-wide v8, v4, Lp9/f;->l:J

    invoke-virtual/range {v4 .. v9}, Lp9/f;->b(IJJ)V

    iput-wide v0, v4, Lp9/f;->h:J

    const-wide/16 v0, 0x0

    iput-wide v0, v4, Lp9/f;->i:J

    iput-wide v0, v4, Lp9/f;->k:J

    iput-wide v0, v4, Lp9/f;->j:J

    iget-object v0, v4, Lp9/f;->f:Lp9/p;

    iget-object v1, v0, Lp9/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const/4 v1, -0x1

    iput v1, v0, Lp9/p;->c:I

    iput v2, v0, Lp9/p;->d:I

    iput v2, v0, Lp9/p;->e:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    goto :goto_5

    :cond_7
    :goto_3
    monitor-exit v4

    goto :goto_5

    :goto_4
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_8
    :goto_5
    return-void

    :pswitch_3
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/d;

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx40/a;

    new-instance v2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v3, Lu40/d;->E:Lu40/d;

    invoke-direct {v2, v3}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-interface {v1, v2}, Lx40/a;->e(Lcom/stripe/hcaptcha/HCaptchaException;)V

    goto :goto_6

    :cond_9
    return-void

    :pswitch_4
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lvn/k;

    invoke-virtual {v0}, Lvn/k;->r()V

    return-void

    :pswitch_5
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lt92/b;

    invoke-static {v0}, Lt92/b;->j1(Lt92/b;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->requestLayout()V

    return-void

    :pswitch_7
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lsm/d;

    invoke-virtual {v0}, Lsm/d;->t()Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/c;

    const/16 v4, 0xf

    invoke-direct {v2, v4}, Lsm/c;-><init>(I)V

    const/16 v4, 0x404

    invoke-virtual {v0, v1, v4, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    iget-object v0, v0, Lsm/d;->F:Ld9/p;

    iget-object v1, v0, Ld9/p;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llo/j;

    iget-object v5, v0, Ld9/p;->d:Ljava/lang/Object;

    check-cast v5, Llo/i;

    iput-boolean v3, v4, Llo/j;->d:Z

    iget-boolean v6, v4, Llo/j;->c:Z

    if-eqz v6, :cond_a

    iget-object v6, v4, Llo/j;->a:Ljava/lang/Object;

    iget-object v4, v4, Llo/j;->b:Llo/e;

    invoke-virtual {v4}, Llo/e;->b()Llo/f;

    move-result-object v4

    invoke-interface {v5, v6, v4}, Llo/i;->a(Ljava/lang/Object;Llo/f;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iput-boolean v3, v0, Ld9/p;->a:Z

    return-void

    :pswitch_8
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;->y(Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;)V

    return-void

    :pswitch_9
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Ls9/i;

    iget-object v1, v0, Ls9/i;->H:Landroid/view/Surface;

    if-eqz v1, :cond_c

    iget-object v2, v0, Ls9/i;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb9/c0;

    iget-object v3, v3, Lb9/c0;->w:Lb9/f0;

    invoke-virtual {v3, v4}, Lb9/f0;->E0(Ljava/lang/Object;)V

    goto :goto_8

    :cond_c
    iget-object v2, v0, Ls9/i;->G:Landroid/graphics/SurfaceTexture;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_d
    if-eqz v1, :cond_e

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    :cond_e
    iput-object v4, v0, Ls9/i;->G:Landroid/graphics/SurfaceTexture;

    iput-object v4, v0, Ls9/i;->H:Landroid/view/Surface;

    return-void

    :pswitch_a
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Ls5/a;

    iget-object v0, v0, Ls5/a;->e:Lm5/g;

    if-eqz v0, :cond_f

    new-instance v1, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    const-string v2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."

    invoke-direct {v1, v2}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lm5/g;->a(Ljava/lang/Object;)V

    return-void

    :cond_f
    const-string v0, "callback"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :pswitch_b
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lrm/j1;

    invoke-virtual {v0}, Lrm/j1;->d()V

    return-void

    :pswitch_c
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrm/d1;

    :try_start_5
    monitor-enter v1

    monitor-exit v1
    :try_end_5
    .catch Lcom/google/android/exoplayer2/ExoPlaybackException; {:try_start_5 .. :try_end_5} :catch_0

    :try_start_6
    iget-object v0, v1, Lrm/d1;->a:Lrm/c1;

    iget v2, v1, Lrm/d1;->d:I

    iget-object v4, v1, Lrm/d1;->e:Ljava/lang/Object;

    invoke-interface {v0, v2, v4}, Lrm/c1;->a(ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    invoke-virtual {v1, v3}, Lrm/d1;->b(Z)V

    return-void

    :catchall_2
    move-exception v0

    invoke-virtual {v1, v3}, Lrm/d1;->b(Z)V

    throw v0
    :try_end_7
    .catch Lcom/google/android/exoplayer2/ExoPlaybackException; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "ExoPlayerImplInternal"

    const-string v2, "Unexpected error delivering message on external thread."

    invoke-static {v1, v2, v0}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :pswitch_d
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;->a(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;)V

    return-void

    :pswitch_e
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lr5/e;

    invoke-virtual {v0}, Lr5/e;->e()Lm5/g;

    move-result-object v0

    new-instance v1, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    const-string v2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."

    invoke-direct {v1, v2}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lm5/g;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_f
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->W(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V

    return-void

    :pswitch_10
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/zip/ZipInputStream;

    invoke-static {v0}, Ldj/i;->b(Ljava/io/Closeable;)V

    return-void

    :pswitch_11
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Ldj/i;->b(Ljava/io/Closeable;)V

    return-void

    :pswitch_12
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    const-string v1, "$completionLatch"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :pswitch_13
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lq3/b0;

    iget-object v5, v0, Lq3/b0;->b:La3/p;

    iput-object v4, v0, Lq3/b0;->n:Llr/e;

    iget-object v6, v0, Lq3/b0;->m:Lr1/c;

    iget-object v0, v0, Lq3/b0;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v7

    if-nez v7, :cond_10

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v0

    if-ne v0, v3, :cond_10

    invoke-virtual {v6}, Lr1/c;->g()V

    goto/16 :goto_f

    :cond_10
    iget-object v0, v6, Lr1/c;->w:[Ljava/lang/Object;

    iget v7, v6, Lr1/c;->y:I

    move v9, v2

    move-object v8, v4

    :goto_9
    if-ge v9, v7, :cond_17

    aget-object v10, v0, v9

    check-cast v10, Lq3/a0;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eqz v11, :cond_15

    if-eq v11, v3, :cond_14

    if-eq v11, v1, :cond_12

    const/4 v12, 0x3

    if-ne v11, v12, :cond_11

    goto :goto_a

    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_12
    :goto_a
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_16

    sget-object v8, Lq3/a0;->y:Lq3/a0;

    if-ne v10, v8, :cond_13

    move v8, v3

    goto :goto_b

    :cond_13
    move v8, v2

    :goto_b
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    goto :goto_d

    :cond_14
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_c
    move-object v8, v4

    goto :goto_d

    :cond_15
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_c

    :cond_16
    :goto_d
    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    :cond_17
    invoke-virtual {v6}, Lr1/c;->g()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, v5, La3/p;->y:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, v5, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    :cond_18
    if-eqz v8, :cond_1a

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, v5, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Laj/d;

    iget-object v0, v0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Laj/c;

    invoke-virtual {v0}, Laj/c;->V()V

    goto :goto_e

    :cond_19
    iget-object v0, v5, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Laj/d;

    iget-object v0, v0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Laj/c;

    invoke-virtual {v0}, Laj/c;->L()V

    :cond_1a
    :goto_e
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-object v0, v5, La3/p;->y:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, v5, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    :cond_1b
    :goto_f
    return-void

    :pswitch_14
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lm5/g;

    const-string v1, "$callback"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4}, Lm5/g;->onResult(Ljava/lang/Object;)V

    return-void

    :pswitch_15
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lov/o;

    iget-object v1, v0, Lov/o;->s0:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v1, v0, Lov/o;->p0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v0, Lov/o;->n0:[Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1}, Lov/o;->o([Landroid/animation/ValueAnimator;)V

    iget-object v1, v0, Lov/o;->o0:[Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1}, Lov/o;->o([Landroid/animation/ValueAnimator;)V

    return-void

    :pswitch_16
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/presentation/login/JoinTeamActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->startPostponedEnterTransition()V

    return-void

    :pswitch_17
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->q(Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;)V

    return-void

    :pswitch_18
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Lno/m;

    iget-object v1, v0, Lno/m;->H:Landroid/view/Surface;

    if-eqz v1, :cond_1c

    iget-object v2, v0, Lno/m;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrm/r;

    iget-object v3, v3, Lrm/r;->w:Lrm/u;

    invoke-virtual {v3, v4}, Lrm/u;->w0(Ljava/lang/Object;)V

    goto :goto_10

    :cond_1c
    iget-object v2, v0, Lno/m;->G:Landroid/graphics/SurfaceTexture;

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_1d
    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    :cond_1e
    iput-object v4, v0, Lno/m;->G:Landroid/graphics/SurfaceTexture;

    iput-object v4, v0, Lno/m;->H:Landroid/view/Surface;

    return-void

    :pswitch_19
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v2, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v2, Lom/b;

    new-instance v3, Lmm/d;

    invoke-direct {v3, v0, v1}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    check-cast v2, Lnm/i;

    invoke-virtual {v2, v3}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    return-void

    :pswitch_1a
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lm/q;->r(Landroid/content/Context;)V

    return-void

    :pswitch_1b
    iget-object v0, p0, Llr/e;->x:Ljava/lang/Object;

    check-cast v0, Le73/b;

    iput-boolean v2, v0, Le73/b;->b:Z

    iget-object v2, v0, Le73/b;->c:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lw5/d;

    if-eqz v3, :cond_1f

    invoke-virtual {v3}, Lw5/d;->f()Z

    move-result v3

    if-eqz v3, :cond_1f

    iget v1, v0, Le73/b;->d:I

    invoke-virtual {v0, v1}, Le73/b;->i(I)V

    goto :goto_11

    :cond_1f
    iget v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    if-ne v3, v1, :cond_20

    iget v0, v0, Le73/b;->d:I

    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->J(I)V

    :cond_20
    :goto_11
    return-void

    :pswitch_data_0
    .packed-switch 0x0
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
