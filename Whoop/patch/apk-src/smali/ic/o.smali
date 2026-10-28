.class public final synthetic Lic/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld4/j;
.implements Lio/sentry/f7;
.implements Lio/sentry/util/network/c;


# instance fields
.field public final synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lic/o;->w:Ljava/lang/Object;

    iput-object p2, p0, Lic/o;->x:Ljava/lang/Object;

    iput-object p3, p0, Lic/o;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq83/j;Lbc3/d0;Lc93/m;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/o;->w:Ljava/lang/Object;

    iput-object p2, p0, Lic/o;->x:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Lic/o;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lxl/a;
    .locals 9

    iget-object v0, p0, Lic/o;->w:Ljava/lang/Object;

    check-cast v0, Lud3/n0;

    iget-object v1, p0, Lic/o;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lic/o;->y:Ljava/lang/Object;

    check-cast v2, Lio/sentry/okhttp/d;

    check-cast p1, Lud3/o0;

    const-string v3, "req"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lud3/o0;->d:Lud3/v0;

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    new-instance v4, Lne3/h;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v4}, Lud3/v0;->writeTo(Lne3/i;)V

    iget-wide v5, v4, Lne3/h;->x:J

    invoke-virtual {v4, v5, v6}, Lne3/h;->b0(J)[B

    move-result-object v4

    sget-object v5, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {p1}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static {v5, v4, v6, v8, v7}, Lud3/u0;->d(Lud3/u0;[BLud3/h0;II)Lud3/t0;

    move-result-object v5

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lud3/o0;

    iget-object v1, v1, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    invoke-virtual {p1}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object p1

    iget-object v0, v2, Lio/sentry/okhttp/d;->w:Lio/sentry/d1;

    invoke-interface {v0}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    const-string v1, "getLogger(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v1, p1, Lud3/h0;->a:Ljava/lang/String;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz p1, :cond_1

    sget-object v2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Lud3/h0;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v3

    :goto_1
    if-nez p1, :cond_2

    const-string p1, "UTF-8"

    :cond_2
    invoke-static {v4, v1, p1, v0}, Ls2/e;->t([BLjava/lang/String;Ljava/lang/String;Lio/sentry/v0;)Lxl/a;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_2
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse buffered request body: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v8, [Ljava/lang/Object;

    invoke-interface {v0, v1, p1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-object v3
.end method

.method public c(Lio/sentry/d7;)V
    .locals 10

    iget-object v0, p0, Lic/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/z6;

    iget-object v1, p0, Lic/o;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/f7;

    iget-object v2, p0, Lic/o;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lio/sentry/f7;->c(Lio/sentry/d7;)V

    :cond_0
    iget-object p1, v0, Lio/sentry/z6;->r:Lio/sentry/n7;

    iget-object p1, p1, Lio/sentry/n7;->i:Lio/sentry/android/core/f;

    if-eqz p1, :cond_7

    iget-object v1, p1, Lio/sentry/android/core/f;->w:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/ActivityLifecycleIntegration;

    iget-object v3, p1, Lio/sentry/android/core/f;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ref/WeakReference;

    iget-object p1, p1, Lio/sentry/android/core/f;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Activity;

    if-eqz v3, :cond_6

    iget-object p1, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->Q:Lio/sentry/android/core/d;

    iget-object v1, v0, Lio/sentry/z6;->a:Lio/sentry/protocol/v;

    const-string v4, "none"

    iget-object v5, p1, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    check-cast v5, Lio/sentry/util/a;

    invoke-virtual {v5}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v5

    :try_start_0
    invoke-virtual {p1}, Lio/sentry/android/core/d;->c()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_2

    :cond_1
    :goto_0
    invoke-virtual {v5}, Lio/sentry/s;->close()V

    goto/16 :goto_4

    :cond_2
    :try_start_1
    new-instance v6, Lio/sentry/android/core/b;

    const/4 v7, 0x1

    invoke-direct {v6, p1, v3, v7}, Lio/sentry/android/core/b;-><init>(Lio/sentry/android/core/d;Landroid/app/Activity;I)V

    const/4 v7, 0x0

    invoke-virtual {p1, v6, v7}, Lio/sentry/android/core/d;->d(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object v6, p1, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    check-cast v6, Ljava/util/WeakHashMap;

    invoke-virtual {v6, v3}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/android/core/c;

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lio/sentry/android/core/d;->b()Lio/sentry/android/core/c;

    move-result-object v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v6}, Lio/sentry/android/core/c;->a(Lio/sentry/android/core/c;)I

    move-result v7

    invoke-static {v3}, Lio/sentry/android/core/c;->a(Lio/sentry/android/core/c;)I

    move-result v8

    sub-int/2addr v7, v8

    invoke-static {v6}, Lio/sentry/android/core/c;->b(Lio/sentry/android/core/c;)I

    move-result v8

    invoke-static {v3}, Lio/sentry/android/core/c;->b(Lio/sentry/android/core/c;)I

    move-result v9

    sub-int/2addr v8, v9

    invoke-static {v6}, Lio/sentry/android/core/c;->c(Lio/sentry/android/core/c;)I

    move-result v6

    invoke-static {v3}, Lio/sentry/android/core/c;->c(Lio/sentry/android/core/c;)I

    move-result v3

    sub-int/2addr v6, v3

    new-instance v3, Lio/sentry/android/core/c;

    invoke-direct {v3, v7, v8, v6}, Lio/sentry/android/core/c;-><init>(III)V

    move-object v7, v3

    :goto_1
    if-eqz v7, :cond_1

    invoke-static {v7}, Lio/sentry/android/core/c;->a(Lio/sentry/android/core/c;)I

    move-result v3

    if-nez v3, :cond_5

    invoke-static {v7}, Lio/sentry/android/core/c;->b(Lio/sentry/android/core/c;)I

    move-result v3

    if-nez v3, :cond_5

    invoke-static {v7}, Lio/sentry/android/core/c;->c(Lio/sentry/android/core/c;)I

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_5
    new-instance v3, Lio/sentry/protocol/m;

    invoke-static {v7}, Lio/sentry/android/core/c;->a(Lio/sentry/android/core/c;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v3, v4, v6}, Lio/sentry/protocol/m;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    new-instance v6, Lio/sentry/protocol/m;

    invoke-static {v7}, Lio/sentry/android/core/c;->b(Lio/sentry/android/core/c;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v6, v4, v8}, Lio/sentry/protocol/m;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    new-instance v8, Lio/sentry/protocol/m;

    invoke-static {v7}, Lio/sentry/android/core/c;->c(Lio/sentry/android/core/c;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v8, v4, v7}, Lio/sentry/protocol/m;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v7, "frames_total"

    invoke-virtual {v4, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "frames_slow"

    invoke-virtual {v4, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "frames_frozen"

    invoke-virtual {v4, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    :goto_2
    :try_start_2
    invoke-virtual {v5}, Lio/sentry/s;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    :cond_6
    iget-object v1, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v3, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v4, "Unable to track activity frames as the Activity %s has been destroyed."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v3, v4, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    :goto_4
    iget-object p1, v0, Lio/sentry/z6;->q:Lio/sentry/l;

    if-eqz p1, :cond_8

    invoke-interface {p1, v0}, Lio/sentry/l;->e(Lio/sentry/n1;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public d(Ld4/i;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lic/o;->w:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    iget-object v1, p0, Lic/o;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/d0;

    iget-object v2, p0, Lic/o;->y:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    sget-object v3, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    check-cast v3, Lbc3/k1;

    new-instance v4, Landroidx/lifecycle/z0;

    const/4 v5, 0x6

    invoke-direct {v4, v3, v5}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    sget-object v3, Lic/j;->w:Lic/j;

    iget-object v5, p1, Ld4/i;->c:Ld4/n;

    if-eqz v5, :cond_0

    invoke-virtual {v5, v4, v3}, Ld4/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v3, La6/v;

    const/4 v4, 0x0

    invoke-direct {v3, v2, p1, v4}, La6/v;-><init>(Lc93/m;Ld4/i;Lq83/d;)V

    const/4 p1, 0x1

    invoke-static {v0, v4, v1, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
