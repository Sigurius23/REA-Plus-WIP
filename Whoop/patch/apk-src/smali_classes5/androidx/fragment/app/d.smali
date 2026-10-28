.class public final synthetic Landroidx/fragment/app/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Landroidx/fragment/app/d;->w:I

    iput-object p1, p0, Landroidx/fragment/app/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/d;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Llm/a;Lgm/i;Lcom/mapbox/maps/l;Lgm/h;)V
    .locals 0

    .line 2
    const/16 p3, 0xf

    iput p3, p0, Landroidx/fragment/app/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/d;->y:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/fragment/app/d;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    iget v0, p0, Landroidx/fragment/app/d;->w:I

    const/4 v1, 0x1

    const-string v2, "this$0"

    const/4 v3, 0x0

    iget-object v4, p0, Landroidx/fragment/app/d;->z:Ljava/lang/Object;

    iget-object v5, p0, Landroidx/fragment/app/d;->y:Ljava/lang/Object;

    iget-object v6, p0, Landroidx/fragment/app/d;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, Lz0/f;

    check-cast v5, Lz0/d;

    check-cast v4, Lz0/e;

    iget-object v0, v6, Lz0/f;->a:Landroid/view/View;

    new-instance v2, Lz0/j;

    invoke-direct {v2, v5}, Lz0/j;-><init>(Lz0/d;)V

    invoke-virtual {v0, v2, v1}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object v0

    iget-object v1, v6, Lz0/f;->h:Landroid/view/ActionMode;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-nez v0, :cond_0

    invoke-virtual {v4}, Lz0/e;->close()V

    :cond_0
    return-void

    :pswitch_0
    check-cast v6, Lq30/w0;

    check-cast v5, Ly40/f;

    check-cast v4, Landroid/net/Uri;

    iget-object v0, v6, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    const-string v1, "JSInterface"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v1, "JSDI"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    iget-object v0, v5, Ly40/f;->b:Lu40/f;

    iget-object v0, v0, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v2, Lu40/d;->G:Lu40/d;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Insecure resource "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " requested"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    check-cast v6, Lsn/z;

    check-cast v5, Lsn/a0;

    check-cast v4, Ll9/y;

    iget v0, v6, Lsn/z;->a:I

    iget-object v1, v6, Lsn/z;->b:Lsn/v;

    invoke-interface {v5, v0, v1, v4}, Lsn/a0;->h(ILsn/v;Ll9/y;)V

    return-void

    :pswitch_2
    check-cast v6, Lrm/p0;

    check-cast v5, Lzr/d0;

    check-cast v4, Lsn/v;

    iget-object v0, v6, Lrm/p0;->c:Lsm/d;

    invoke-virtual {v5}, Lzr/d0;->f()Lzr/w0;

    move-result-object v1

    iget-object v2, v0, Lsm/d;->z:La30/w0;

    iget-object v0, v0, Lsm/d;->G:Lrm/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v5

    iput-object v5, v2, La30/w0;->y:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v1, v3}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/v;

    iput-object v1, v2, La30/w0;->F:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v4, v2, La30/w0;->G:Ljava/lang/Object;

    :cond_1
    iget-object v1, v2, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    if-nez v1, :cond_2

    iget-object v1, v2, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lzr/g0;

    iget-object v3, v2, La30/w0;->F:Ljava/lang/Object;

    check-cast v3, Lsn/v;

    iget-object v4, v2, La30/w0;->x:Ljava/lang/Object;

    check-cast v4, Lrm/m1;

    invoke-static {v0, v1, v3, v4}, La30/w0;->p(Lrm/b1;Lzr/g0;Lsn/v;Lrm/m1;)Lsn/v;

    move-result-object v1

    iput-object v1, v2, La30/w0;->E:Ljava/lang/Object;

    :cond_2
    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v0

    invoke-virtual {v2, v0}, La30/w0;->L(Lrm/o1;)V

    return-void

    :pswitch_3
    check-cast v6, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    check-cast v5, Ljk0/d;

    check-cast v4, Ljk0/d;

    invoke-static {v6, v5, v4}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->S(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;Ljk0/d;)V

    return-void

    :pswitch_4
    check-cast v6, Lpg3/p;

    check-cast v5, Lpg3/h;

    check-cast v4, Ljava/lang/Throwable;

    iget-object v0, v6, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v0, Lpg3/q;

    invoke-interface {v5, v0, v4}, Lpg3/h;->r(Lpg3/e;Ljava/lang/Throwable;)V

    return-void

    :pswitch_5
    check-cast v6, Lpg3/p;

    check-cast v5, Lpg3/h;

    check-cast v4, Lpg3/v0;

    iget-object v0, v6, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v0, Lpg3/q;

    iget-object v1, v0, Lpg3/q;->x:Lpg3/e;

    invoke-interface {v1}, Lpg3/e;->F0()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {v5, v0, v1}, Lpg3/h;->r(Lpg3/e;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    invoke-interface {v5, v0, v4}, Lpg3/h;->g(Lpg3/e;Lpg3/v0;)V

    :goto_0
    return-void

    :pswitch_6
    check-cast v6, Lmd3/b;

    check-cast v5, Landroid/bluetooth/BluetoothDevice;

    check-cast v4, Lnd3/a;

    :try_start_0
    invoke-interface {v6, v5, v4}, Lmd3/b;->a(Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    const-string v1, "k0"

    const-string v2, "Exception in Value callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void

    :pswitch_7
    check-cast v6, Llm/a;

    check-cast v5, Lgm/i;

    iget-object v0, v5, Lgm/i;->a:Ljava/lang/String;

    check-cast v4, Lgm/h;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Llm/a;->f:Ljava/util/logging/Logger;

    const-string v2, "Transport backend \'"

    :try_start_1
    iget-object v3, v6, Llm/a;->c:Lhm/e;

    invoke-virtual {v3, v0}, Lhm/e;->a(Ljava/lang/String;)Lhm/f;

    move-result-object v3

    if-nez v3, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' is not registered"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_4
    check-cast v3, Lem/c;

    invoke-virtual {v3, v4}, Lem/c;->a(Lgm/h;)Lgm/h;

    move-result-object v0

    iget-object v2, v6, Llm/a;->e:Lom/b;

    new-instance v3, Lbc/i;

    const/16 v4, 0x9

    invoke-direct {v3, v6, v5, v0, v4}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    check-cast v2, Lnm/i;

    invoke-virtual {v2, v3}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error scheduling event "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    :goto_3
    return-void

    :pswitch_8
    check-cast v6, Landroid/app/Activity;

    check-cast v5, Lkj/c;

    check-cast v4, Lkj/g;

    const-string v0, "$tapData"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "rootView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, v4, Lkj/g;->b:F

    float-to-int v1, v1

    iget v2, v4, Lkj/g;->c:F

    float-to-int v2, v2

    invoke-static {v0, v1, v2}, Lkj/c;->a(Landroid/view/View;II)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, v5, Lkj/c;->a:Lhj/q;

    if-eqz v1, :cond_5

    invoke-virtual {v1, v0}, Lhj/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void

    :pswitch_9
    check-cast v6, Lio/sentry/android/replay/screenshot/h;

    check-cast v5, Landroid/view/View;

    check-cast v4, Lio/sentry/android/replay/viewhierarchy/g;

    invoke-virtual {v6, v5, v4}, Lio/sentry/android/replay/screenshot/h;->d(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;)V

    return-void

    :pswitch_a
    check-cast v6, Lio/sentry/android/core/h;

    move-object v14, v5

    check-cast v14, Lio/sentry/q6;

    check-cast v4, Lio/sentry/d1;

    iget-object v0, v6, Lio/sentry/android/core/h;->M:Ljava/util/ArrayList;

    iget-object v1, v6, Lio/sentry/android/core/h;->P:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_6

    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v6, Lio/sentry/android/core/h;->W:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/o3;

    new-instance v7, Lio/sentry/p3;

    iget-object v8, v5, Lio/sentry/o3;->a:Lio/sentry/protocol/v;

    iget-object v9, v5, Lio/sentry/o3;->b:Lio/sentry/protocol/v;

    iget-object v10, v5, Lio/sentry/o3;->d:Ljava/io/File;

    iget-object v11, v5, Lio/sentry/o3;->c:Ljava/util/concurrent/ConcurrentHashMap;

    iget-wide v12, v5, Lio/sentry/o3;->e:D

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    iget-object v13, v5, Lio/sentry/o3;->f:Ljava/lang/String;

    invoke-direct/range {v7 .. v14}, Lio/sentry/p3;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/v;Ljava/io/File;Ljava/util/AbstractMap;Ljava/lang/Double;Ljava/lang/String;Lio/sentry/q6;)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v2}, Lio/sentry/s;->close()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/p3;

    invoke-interface {v4, v1}, Lio/sentry/d1;->n(Lio/sentry/p3;)Lio/sentry/protocol/v;

    goto :goto_5

    :cond_8
    :goto_6
    return-void

    :goto_7
    :try_start_3
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_8

    :catchall_2
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1

    :pswitch_b
    check-cast v6, Lio/sentry/android/core/d;

    check-cast v5, Ljava/lang/Runnable;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_4
    invoke-interface {v5}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_9

    :catchall_3
    if-eqz v4, :cond_9

    iget-object v0, v6, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "Failed to execute "

    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_9
    :goto_9
    return-void

    :pswitch_c
    check-cast v6, Lc4/k;

    check-cast v5, Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    :try_start_5
    invoke-virtual {v6, v5}, Lc4/k;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_a

    :catch_1
    move-exception v0

    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :goto_a
    return-void

    :pswitch_d
    check-cast v6, Lhms/webrtc/VideoFileRenderer;

    check-cast v5, Lhms/webrtc/VideoFrame$I420Buffer;

    check-cast v4, Lhms/webrtc/VideoFrame;

    invoke-static {v6, v5, v4}, Lhms/webrtc/VideoFileRenderer;->c(Lhms/webrtc/VideoFileRenderer;Lhms/webrtc/VideoFrame$I420Buffer;Lhms/webrtc/VideoFrame;)V

    return-void

    :pswitch_e
    check-cast v6, Lhms/webrtc/EglRenderer;

    check-cast v5, Lhms/webrtc/EglBase$Context;

    check-cast v4, [I

    invoke-static {v6, v5, v4}, Lhms/webrtc/EglRenderer;->a(Lhms/webrtc/EglRenderer;Lhms/webrtc/EglBase$Context;[I)V

    return-void

    :pswitch_f
    check-cast v6, Lhms/webrtc/EglRenderer;

    check-cast v5, Ljava/util/concurrent/CountDownLatch;

    check-cast v4, Lhms/webrtc/EglRenderer$FrameListener;

    invoke-static {v6, v5, v4}, Lhms/webrtc/EglRenderer;->g(Lhms/webrtc/EglRenderer;Ljava/util/concurrent/CountDownLatch;Lhms/webrtc/EglRenderer$FrameListener;)V

    return-void

    :pswitch_10
    check-cast v6, Lew/f;

    check-cast v5, Lkotlin/jvm/internal/e0;

    check-cast v4, Lew/c;

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$chunksSent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lew/f;->E:Ldw/f;

    iget-object v1, v6, Lew/f;->F:Lz7/a;

    invoke-virtual {v1}, Lz7/a;->f()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_b

    :cond_a
    const-wide/16 v1, 0xa

    :goto_b
    iget v3, v5, Lkotlin/jvm/internal/e0;->w:I

    new-instance v5, Ljava/lang/Exception;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Request failed "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, v2, v3, v5}, Ldw/f;->a(JILjava/lang/Exception;)V

    return-void

    :pswitch_11
    check-cast v6, Ldb/h0;

    check-cast v5, Landroid/view/SurfaceView;

    check-cast v4, Landroidx/fragment/app/m;

    invoke-static {v6, v5, v4}, Ldb/h0;->a(Ldb/h0;Landroid/view/SurfaceView;Landroidx/fragment/app/m;)V

    return-void

    :pswitch_12
    check-cast v6, Ljava/util/Map$Entry;

    check-cast v5, Lcom/mapbox/common/LifecycleMonitoringState;

    check-cast v4, Ljava/lang/String;

    invoke-static {v6, v5, v4}, Lcom/mapbox/common/LifecycleMonitorAndroid;->c(Ljava/util/Map$Entry;Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V

    return-void

    :pswitch_13
    check-cast v6, Lc8/a;

    check-cast v5, Ljava/lang/String;

    check-cast v4, Lc8/d;

    iget-object v0, v6, Lc8/a;->f:Landroid/content/Context;

    const-string v2, "PermissionTokenManager.healthdata"

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "token"

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :try_start_6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_2

    :try_start_7
    const-string v0, "androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback"

    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    iget-object v0, v4, Lc8/d;->f:Landroid/os/IBinder;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    goto :goto_c

    :catchall_4
    move-exception v0

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    throw v0
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_2

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HealthDataSdkService#setPermissionToken failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "a"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_c
    return-void

    :pswitch_14
    check-cast v6, Lb9/s0;

    check-cast v5, Lzr/d0;

    check-cast v4, Ll9/c0;

    iget-object v0, v6, Lb9/s0;->c:Lc9/h;

    invoke-virtual {v5}, Lzr/d0;->f()Lzr/w0;

    move-result-object v1

    iget-object v2, v0, Lc9/h;->z:La30/w0;

    iget-object v0, v0, Lc9/h;->G:Lu8/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v5

    iput-object v5, v2, La30/w0;->y:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_b

    invoke-virtual {v1, v3}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/c0;

    iput-object v1, v2, La30/w0;->F:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v4, v2, La30/w0;->G:Ljava/lang/Object;

    :cond_b
    iget-object v1, v2, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    if-nez v1, :cond_c

    iget-object v1, v2, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lzr/g0;

    iget-object v3, v2, La30/w0;->F:Ljava/lang/Object;

    check-cast v3, Ll9/c0;

    iget-object v4, v2, La30/w0;->x:Ljava/lang/Object;

    check-cast v4, Lu8/m0;

    invoke-static {v0, v1, v3, v4}, La30/w0;->o(Lu8/j0;Lzr/g0;Ll9/c0;Lu8/m0;)Ll9/c0;

    move-result-object v1

    iput-object v1, v2, La30/w0;->E:Ljava/lang/Object;

    :cond_c
    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v0

    invoke-virtual {v2, v0}, La30/w0;->N(Lu8/o0;)V

    return-void

    :pswitch_15
    check-cast v6, Landroidx/fragment/app/p2;

    check-cast v5, Landroidx/fragment/app/p2;

    check-cast v4, Landroidx/fragment/app/q;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v1, v5, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-boolean v2, v4, Landroidx/fragment/app/q;->o:Z

    iget-object v4, v4, Landroidx/fragment/app/q;->n:La0/g;

    invoke-static {v0, v1, v2, v4, v3}, Landroidx/fragment/app/d2;->a(Landroidx/fragment/app/m0;Landroidx/fragment/app/m0;ZLa0/g;Z)V

    return-void

    :pswitch_16
    check-cast v6, Landroid/view/ViewGroup;

    check-cast v5, Landroid/view/View;

    check-cast v4, Landroidx/fragment/app/f;

    const-string v0, "$container"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, v4, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/g;

    iget-object v0, v0, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    invoke-virtual {v0, v4}, Landroidx/fragment/app/p2;->c(Landroidx/fragment/app/o2;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
