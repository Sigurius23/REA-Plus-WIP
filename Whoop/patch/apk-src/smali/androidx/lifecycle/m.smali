.class public final synthetic Landroidx/lifecycle/m;
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

    .line 1
    iput p1, p0, Landroidx/lifecycle/m;->w:I

    iput-object p2, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/l1;Lio/sentry/l1;)V
    .locals 0

    .line 2
    const/16 p1, 0xa

    iput p1, p0, Landroidx/lifecycle/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Runnable;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Landroidx/lifecycle/m;->w:I

    iput-object p1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget v0, p0, Landroidx/lifecycle/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lt92/b;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1}, Lt92/b;->i1(Lt92/b;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Leb/o0;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnc/a;

    iget-object v3, v1, Leb/o0;->e:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lnc/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/room/u1;

    iget-object v0, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroidx/room/u1;->a()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroidx/room/u1;->a()V

    throw v0

    :pswitch_2
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Llc3/g;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Llc3/b;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    check-cast v0, Llc3/f;

    invoke-virtual {v0, v1, v2}, Llc3/f;->g(Ljava/lang/Object;Ljava/lang/Object;)I

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lbl/c;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Ljc/l;

    iget-object v0, v0, Lbl/c;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/l0;

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/l0;->j0(Ljc/l;I)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    iget-object v1, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :pswitch_5
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/sentry/cache/f;

    iget-object v0, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    :try_start_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    iget-object v1, v1, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Serialization task failed"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :pswitch_6
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "transaction.json"

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v1, v2}, Lio/sentry/cache/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-void

    :pswitch_7
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/protocol/c;

    const-string v2, "contexts.json"

    invoke-virtual {v0, v1, v2}, Lio/sentry/cache/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_8
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/sentry/cache/f;

    iget-object v0, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/e;

    :try_start_2
    iget-object v2, v1, Lio/sentry/cache/f;->b:Lio/sentry/util/f;

    invoke-virtual {v2}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/cache/tape/f;

    invoke-virtual {v2, v0}, Lio/sentry/cache/tape/f;->m(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    iget-object v1, v1, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to add breadcrumb to file queue"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    return-void

    :pswitch_9
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    const-string v2, "tags.json"

    invoke-virtual {v0, v1, v2}, Lio/sentry/cache/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_a
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/protocol/h0;

    const-string v2, "user.json"

    if-nez v1, :cond_2

    invoke-virtual {v0, v2}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    goto :goto_4

    :cond_2
    invoke-virtual {v0, v1, v2}, Lio/sentry/cache/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    return-void

    :pswitch_b
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/ndk/b;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/e7;

    iget-object v0, v0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    iget-object v2, v1, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    invoke-virtual {v2}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Lio/sentry/e7;->x:Lio/sentry/h7;

    invoke-virtual {v1}, Lio/sentry/h7;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Lio/sentry/ndk/NativeScope;->nativeSetTrace(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_c
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/ndk/b;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/protocol/h0;

    iget-object v0, v0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    if-nez v1, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/sentry/ndk/NativeScope;->nativeRemoveUser()V

    goto :goto_5

    :cond_3
    iget-object v2, v1, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    iget-object v3, v1, Lio/sentry/protocol/h0;->w:Ljava/lang/String;

    iget-object v4, v1, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    iget-object v1, v1, Lio/sentry/protocol/h0;->y:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3, v4, v1}, Lio/sentry/ndk/NativeScope;->nativeSetUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    return-void

    :pswitch_d
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/ndk/b;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lio/sentry/ndk/NativeScope;->nativeRemoveTag(Ljava/lang/String;)V

    return-void

    :pswitch_e
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/sentry/android/ndk/b;

    iget-object v0, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lio/sentry/e;

    iget-object v3, v1, Lio/sentry/android/ndk/b;->a:Lio/sentry/q6;

    iget-object v0, v2, Lio/sentry/e;->I:Lio/sentry/n5;

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_6

    :cond_4
    move-object v5, v4

    :goto_6
    invoke-virtual {v2}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Ljc/x;->W(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    :try_start_3
    iget-object v0, v2, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v3}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v6

    invoke-interface {v6, v0}, Lio/sentry/j1;->b(Ljava/util/concurrent/ConcurrentHashMap;)Ljava/lang/String;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception v0

    goto :goto_8

    :cond_5
    :goto_7
    move-object v10, v4

    goto :goto_9

    :goto_8
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v7, "Breadcrumb data is not serializable."

    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/Object;

    invoke-interface {v3, v6, v0, v7, v8}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_7

    :goto_9
    iget-object v0, v1, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    iget-object v6, v2, Lio/sentry/e;->z:Ljava/lang/String;

    iget-object v7, v2, Lio/sentry/e;->G:Ljava/lang/String;

    iget-object v8, v2, Lio/sentry/e;->E:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {v5 .. v10}, Lio/sentry/ndk/NativeScope;->nativeAddBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_f
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/q;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/v0;

    :try_start_4
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/android/core/internal/util/q;->J:Landroid/view/Choreographer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_a
    return-void

    :pswitch_10
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/e0;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/v0;

    invoke-virtual {v0, v1}, Lio/sentry/android/core/e0;->h(Lio/sentry/v0;)V

    return-void

    :pswitch_11
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/l1;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/l1;

    invoke-static {v0, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->h(Lio/sentry/l1;Lio/sentry/l1;)V

    return-void

    :pswitch_12
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lij/m;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    :try_start_5
    const-string v2, "quickjs-android-wrapper"

    invoke-static {v2}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-static {}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->create()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v2

    iput-object v2, v0, Lij/m;->e:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    new-instance v2, Lzt/q;

    invoke-direct {v2, v0}, Lzt/q;-><init>(Lij/m;)V

    iput-object v2, v0, Lij/m;->f:Lzt/q;

    new-instance v2, Lzt/q;

    const-string v3, "nudgeServices"

    invoke-direct {v2, v0}, Lzt/q;-><init>(Lij/m;)V

    iput-object v3, v2, Lzt/q;->x:Ljava/lang/Object;

    iput-object v2, v0, Lij/m;->g:Lzt/q;

    new-instance v2, Lij/t;

    invoke-direct {v2, v0}, Lij/t;-><init>(Lij/m;)V

    new-instance v2, Laj/c;

    iget-object v3, v0, Lij/m;->b:Lcom/amplitude/android/engagement/a;

    invoke-direct {v2, v0, v3}, Laj/c;-><init>(Lij/m;Lcom/amplitude/android/engagement/a;)V

    new-instance v2, Lij/n;

    invoke-direct {v2, v0}, Lij/n;-><init>(Lij/m;)V

    iput-object v2, v0, Lij/m;->i:Lij/n;

    invoke-virtual {v0}, Lij/m;->d()V

    invoke-virtual {v0}, Lij/m;->e()V

    iget-object v2, v0, Lij/m;->j:Lwe/o;

    invoke-virtual {v2}, Lwe/o;->O()V

    invoke-virtual {v0}, Lij/m;->c()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :goto_b
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_c

    :catchall_4
    move-exception v0

    goto :goto_d

    :catch_1
    move-exception v0

    :try_start_6
    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v3, "Failed to load bundle"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_b

    :goto_c
    return-void

    :goto_d
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0

    :pswitch_13
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lht/a;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    iget v2, v0, Lht/a;->y:I

    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v0, v0, Lht/a;->z:Landroid/os/StrictMode$ThreadPolicy;

    if-eqz v0, :cond_6

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    :cond_6
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    return-void

    :pswitch_14
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgt/m;

    iget-object v0, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v0, Lst/a;

    monitor-enter v1

    :try_start_7
    iget-object v2, v1, Lgt/m;->b:Ljava/util/Set;

    if-nez v2, :cond_7

    iget-object v2, v1, Lgt/m;->a:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :catchall_5
    move-exception v0

    goto :goto_f

    :cond_7
    iget-object v2, v1, Lgt/m;->b:Ljava/util/Set;

    invoke-interface {v0}, Lst/a;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :goto_e
    monitor-exit v1

    return-void

    :goto_f
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    throw v0

    :pswitch_15
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgt/n;

    iget-object v0, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v0, Lst/a;

    iget-object v2, v1, Lgt/n;->b:Lst/a;

    sget-object v3, Lgt/n;->d:Lgt/f;

    if-ne v2, v3, :cond_8

    monitor-enter v1

    :try_start_9
    iget-object v2, v1, Lgt/n;->a:Lb23/h;

    const/4 v3, 0x0

    iput-object v3, v1, Lgt/n;->a:Lb23/h;

    iput-object v0, v1, Lgt/n;->b:Lst/a;

    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_6
    move-exception v0

    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "provide() can be called only once."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_16
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lg/l;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lg/z;

    invoke-static {v0, v1}, Lg/l;->access$addObserverForBackInvoker(Lg/l;Lg/z;)V

    return-void

    :pswitch_17
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Len0/a;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    invoke-static {v0, v1}, Len0/a;->c(Len0/a;Ljava/lang/Object;)V

    return-void

    :pswitch_18
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/common/LifecycleState;

    invoke-static {v0, v1}, Lcom/mapbox/common/LifecycleUtils;->c(Lkotlin/jvm/functions/Function1;Lcom/mapbox/common/LifecycleState;)V

    return-void

    :pswitch_19
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/m;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Lcc3/b;

    invoke-virtual {v0, v1}, Lbc3/m;->C(Lbc3/z;)V

    return-void

    :pswitch_1a
    iget-object v0, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    iget-object v1, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/room/u1;

    :try_start_b
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    invoke-virtual {v1}, Landroidx/room/u1;->a()V

    return-void

    :catchall_7
    move-exception v0

    invoke-virtual {v1}, Landroidx/room/u1;->a()V

    throw v0

    :pswitch_1b
    iget-object v0, p0, Landroidx/lifecycle/m;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/n;

    iget-object v1, p0, Landroidx/lifecycle/m;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    iget-object v2, v0, Landroidx/lifecycle/n;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v0}, Landroidx/lifecycle/n;->a()V

    return-void

    :cond_9
    const-string v0, "cannot enqueue any more runnables"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

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
