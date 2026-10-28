.class public final Lcom/iterable/iterableapi/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iterable/iterableapi/f;


# instance fields
.field public final E:Laj/d;

.field public final F:Lcom/iterable/iterableapi/g;

.field public final G:D

.field public final H:Ljava/util/ArrayList;

.field public I:J

.field public J:J

.field public K:Z

.field public final w:Lcom/iterable/iterableapi/k;

.field public final x:Landroid/content/Context;

.field public final y:La3/p;

.field public final z:Lcom/iterable/iterableapi/x0;


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/k;Lcom/iterable/iterableapi/x0;)V
    .locals 5

    new-instance v0, La3/p;

    iget-object v1, p1, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, La3/p;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/iterable/iterableapi/g;->i:Lcom/iterable/iterableapi/g;

    new-instance v2, Laj/d;

    invoke-direct {v2, v1}, Laj/d;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/iterable/iterableapi/d1;->H:Ljava/util/ArrayList;

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lcom/iterable/iterableapi/d1;->I:J

    iput-wide v3, p0, Lcom/iterable/iterableapi/d1;->J:J

    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/iterable/iterableapi/d1;->K:Z

    iput-object p1, p0, Lcom/iterable/iterableapi/d1;->w:Lcom/iterable/iterableapi/k;

    iget-object p1, p1, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    iput-object p1, p0, Lcom/iterable/iterableapi/d1;->x:Landroid/content/Context;

    iput-object p2, p0, Lcom/iterable/iterableapi/d1;->z:Lcom/iterable/iterableapi/x0;

    const-wide/high16 p1, 0x403e000000000000L    # 30.0

    iput-wide p1, p0, Lcom/iterable/iterableapi/d1;->G:D

    iput-object v0, p0, Lcom/iterable/iterableapi/d1;->y:La3/p;

    iput-object v2, p0, Lcom/iterable/iterableapi/d1;->E:Laj/d;

    iput-object v1, p0, Lcom/iterable/iterableapi/d1;->F:Lcom/iterable/iterableapi/g;

    invoke-virtual {v1, p0}, Lcom/iterable/iterableapi/g;->a(Lcom/iterable/iterableapi/f;)V

    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->i()V

    return-void
.end method

.method public static c(Lcom/iterable/iterableapi/d1;Ljava/util/ArrayList;)V
    .locals 10

    iget-object v0, p0, Lcom/iterable/iterableapi/d1;->y:La3/p;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/iterable/iterableapi/j1;

    invoke-virtual {v4}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, La3/p;->y(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;

    move-result-object v6

    if-eqz v6, :cond_1

    move v6, v5

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    if-nez v6, :cond_5

    monitor-enter v0

    :try_start_0
    iget-object v3, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v4}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v0}, Lcom/iterable/iterableapi/j1;->u(La3/p;)V

    iget-object v3, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v3, Lcom/iterable/iterableapi/p0;

    const/16 v7, 0x64

    invoke-virtual {v3, v7}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v8

    if-nez v8, :cond_2

    const-wide/16 v8, 0x64

    invoke-virtual {v3, v7, v8, v9}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v0

    invoke-virtual {v4}, Lcom/iterable/iterableapi/j1;->p()Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/iterable/iterableapi/d1;->w:Lcom/iterable/iterableapi/k;

    invoke-virtual {v3}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_2

    :cond_3
    iget-object v3, v3, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    :try_start_1
    invoke-virtual {v3, v7}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    const-string v8, "messageId"

    invoke-virtual {v4}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v8, "messageContext"

    const/4 v9, 0x0

    invoke-static {v4, v9}, Lcom/google/crypto/tink/internal/l0;->Q(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/a1;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v8, "deviceInfo"

    invoke-virtual {v3}, Lcom/google/crypto/tink/internal/l0;->O()Lorg/json/JSONObject;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v8, "events/trackInAppDelivery"

    invoke-virtual {v3, v8, v7}, Lcom/google/crypto/tink/internal/l0;->f0(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_2
    move v3, v5

    goto :goto_3

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    :cond_5
    :goto_3
    if-eqz v6, :cond_0

    invoke-virtual {v4}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, La3/p;->y(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;

    move-result-object v6

    invoke-virtual {v6}, Lcom/iterable/iterableapi/j1;->p()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v4}, Lcom/iterable/iterableapi/j1;->p()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v4}, Lcom/iterable/iterableapi/j1;->p()Z

    move-result v3

    invoke-virtual {v6, v3}, Lcom/iterable/iterableapi/j1;->w(Z)V

    move v3, v5

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v0}, La3/p;->z()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/iterable/iterableapi/j1;

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {v0, v2}, La3/p;->K(Lcom/iterable/iterableapi/j1;)V

    move v3, v5

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->h()V

    if-eqz v3, :cond_9

    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->e()V

    :cond_9
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/iterable/iterableapi/d1;->I:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->i()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->h()V

    return-void
.end method

.method public final declared-synchronized d(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/iterable/iterableapi/d1;->y:La3/p;

    invoke-virtual {v0, p1}, La3/p;->y(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final e()V
    .locals 3

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/iterable/iterableapi/c1;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/iterable/iterableapi/c1;-><init>(Lcom/iterable/iterableapi/d1;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final f()V
    .locals 15

    iget-object v0, p0, Lcom/iterable/iterableapi/d1;->F:Lcom/iterable/iterableapi/g;

    iget-object v0, v0, Lcom/iterable/iterableapi/g;->b:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/iterable/iterableapi/d1;->E:Laj/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    if-eqz v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/iterable/iterableapi/d1;->J:J

    sub-long/2addr v2, v4

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    iget-wide v4, p0, Lcom/iterable/iterableapi/d1;->G:D

    cmpl-double v0, v2, v4

    if-ltz v0, :cond_d

    iget-boolean v0, p0, Lcom/iterable/iterableapi/d1;->K:Z

    if-eqz v0, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-static {}, Ldt/b;->F()V

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/iterable/iterableapi/d1;->y:La3/p;

    invoke-virtual {v2}, La3/p;->z()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/iterable/iterableapi/j1;

    invoke-virtual {v3}, Lcom/iterable/iterableapi/j1;->k()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {v3}, Lcom/iterable/iterableapi/j1;->f()Ljava/util/Date;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3}, Lcom/iterable/iterableapi/j1;->f()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-lez v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_5
    monitor-exit p0

    new-instance v2, Lcom/iterable/iterableapi/b1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/iterable/iterableapi/j1;

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->o()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->k()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->i()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->p()Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "IterableInAppManager"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Calling onNewInApp on "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/iterable/iterableapi/d1;->z:Lcom/iterable/iterableapi/x0;

    invoke-interface {v3, v2}, Lcom/iterable/iterableapi/x0;->a(Lcom/iterable/iterableapi/j1;)Lcom/iterable/iterableapi/w0;

    move-result-object v3

    const-string v5, "IterableInAppManager"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Response: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->v()V

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->m()Z

    move-result v5

    if-eqz v5, :cond_7

    monitor-enter p0

    :try_start_1
    invoke-virtual {v2, v4}, Lcom/iterable/iterableapi/j1;->w(Z)V

    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->s()V

    iget-object v0, p0, Lcom/iterable/iterableapi/d1;->w:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0, v2, v1, v1}, Lcom/iterable/iterableapi/k;->h(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/o0;Lcom/iterable/iterableapi/a1;)V

    return-void

    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_7
    sget-object v5, Lcom/iterable/iterableapi/w0;->w:Lcom/iterable/iterableapi/w0;

    if-ne v3, v5, :cond_6

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->l()Z

    move-result v0

    sget-object v3, Lcom/iterable/iterableapi/a1;->w:Lcom/iterable/iterableapi/y0;

    iget-object v5, p0, Lcom/iterable/iterableapi/d1;->E:Laj/d;

    new-instance v6, Lqg3/d;

    const/16 v7, 0x8

    const/4 v8, 0x0

    invoke-direct {v6, p0, v2, v8, v7}, Lqg3/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->m()Z

    move-result v7

    if-eqz v7, :cond_8

    goto/16 :goto_2

    :cond_8
    iget-object v5, v5, Laj/d;->w:Ljava/lang/Object;

    check-cast v5, Lcom/iterable/iterableapi/g;

    iget-object v5, v5, Lcom/iterable/iterableapi/g;->b:Ljava/lang/ref/WeakReference;

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    :cond_9
    if-eqz v1, :cond_c

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->e()Lcom/iterable/iterableapi/e1;

    move-result-object v5

    iget-object v5, v5, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->e()Lcom/iterable/iterableapi/e1;

    move-result-object v8

    iget-wide v8, v8, Lcom/iterable/iterableapi/e1;->c:D

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->e()Lcom/iterable/iterableapi/e1;

    move-result-object v10

    iget-object v10, v10, Lcom/iterable/iterableapi/e1;->b:Landroid/graphics/Rect;

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->e()Lcom/iterable/iterableapi/e1;

    move-result-object v11

    iget-object v11, v11, Lcom/iterable/iterableapi/e1;->d:Lcom/iterable/iterableapi/g1;

    iget-boolean v11, v11, Lcom/iterable/iterableapi/g1;->w:Z

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->e()Lcom/iterable/iterableapi/e1;

    move-result-object v12

    iget-object v12, v12, Lcom/iterable/iterableapi/e1;->d:Lcom/iterable/iterableapi/g1;

    iget-object v12, v12, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v12, Lcom/iterable/iterableapi/f1;

    const-string v13, "IterableInAppManager"

    instance-of v14, v1, Landroidx/fragment/app/r0;

    if-eqz v14, :cond_b

    check-cast v1, Landroidx/fragment/app/r0;

    if-eqz v5, :cond_c

    sget-object v14, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    if-eqz v14, :cond_a

    const-string v0, "Skipping the in-app notification: another notification is already being displayed"

    invoke-static {v13, v0}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_a
    new-instance v13, Lcom/iterable/iterableapi/v0;

    invoke-direct {v13}, Lcom/iterable/iterableapi/v0;-><init>()V

    sput-object v13, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    const-string v14, "HTML"

    invoke-virtual {v13, v14, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "CallbackOnCancel"

    invoke-virtual {v13, v5, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v5, "MessageId"

    invoke-virtual {v13, v5, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "BackgroundAlpha"

    invoke-virtual {v13, v5, v8, v9}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    const-string v5, "InsetPadding"

    invoke-virtual {v13, v5, v10}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v5, "InAppBgColor"

    iget-object v7, v12, Lcom/iterable/iterableapi/f1;->a:Ljava/lang/String;

    invoke-virtual {v13, v5, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "InAppBgAlpha"

    iget-wide v7, v12, Lcom/iterable/iterableapi/f1;->b:D

    invoke-virtual {v13, v5, v7, v8}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    const-string v5, "ShouldAnimate"

    invoke-virtual {v13, v5, v11}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    sput-object v6, Lcom/iterable/iterableapi/v0;->O:Lqg3/d;

    sput-object v3, Lcom/iterable/iterableapi/v0;->P:Lcom/iterable/iterableapi/y0;

    sget-object v3, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    invoke-virtual {v3, v13}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    sget-object v3, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    invoke-virtual {v1}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v5, "iterable_in_app"

    invoke-virtual {v3, v1, v5}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_3
    invoke-virtual {v2, v4}, Lcom/iterable/iterableapi/j1;->w(Z)V

    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->e()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit p0

    if-nez v0, :cond_c

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->r()V

    return-void

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    :cond_b
    const-string v0, "To display in-app notifications, the context must be of an instance of: FragmentActivity"

    invoke-static {v13, v0}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    :goto_2
    return-void

    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    :cond_d
    return-void
.end method

.method public final declared-synchronized g(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/m0;Lcom/iterable/iterableapi/y0;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ldt/b;->F()V

    invoke-virtual {p1}, Lcom/iterable/iterableapi/j1;->s()V

    iget-object v0, p0, Lcom/iterable/iterableapi/d1;->w:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0, p1, p2, p3}, Lcom/iterable/iterableapi/k;->h(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/o0;Lcom/iterable/iterableapi/a1;)V

    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final h()V
    .locals 10

    invoke-static {}, Ldt/b;->F()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/iterable/iterableapi/d1;->J:J

    sub-long/2addr v0, v2

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    iget-wide v4, p0, Lcom/iterable/iterableapi/d1;->G:D

    cmpl-double v0, v0, v4

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->f()V

    return-void

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/iterable/iterableapi/c1;

    const/4 v6, 0x0

    invoke-direct {v1, p0, v6}, Lcom/iterable/iterableapi/c1;-><init>(Lcom/iterable/iterableapi/d1;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-wide v8, p0, Lcom/iterable/iterableapi/d1;->J:J

    sub-long/2addr v6, v8

    long-to-double v6, v6

    div-double/2addr v6, v2

    sub-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    add-double/2addr v4, v6

    mul-double/2addr v4, v2

    double-to-long v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final i()V
    .locals 7

    invoke-static {}, Ldt/b;->F()V

    new-instance v5, Lbu/c;

    invoke-direct {v5, p0}, Lbu/c;-><init>(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/d1;->w:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    iget-object v1, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Laj/c;

    iget-object v2, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v2, Lcom/iterable/iterableapi/k;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    :try_start_0
    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    const-string v4, "count"

    const/16 v6, 0x64

    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "platform"

    iget-object v6, v2, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-static {v6}, Le93/b;->M(Landroid/content/pm/PackageManager;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "OTT"

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    const-string v6, "Android"

    :goto_0
    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "SDKVersion"

    const-string v6, "3.6.6"

    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "systemVersion"

    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "packageName"

    iget-object v2, v2, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "inApp/getMessages"

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->T()Lcom/iterable/iterableapi/l2;

    move-result-object v0

    iget-object v1, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/k;

    move-object v4, v1

    iget-object v1, v4, Lcom/iterable/iterableapi/k;->c:Ljava/lang/String;

    iget-object v4, v4, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    invoke-interface/range {v0 .. v5}, Lcom/iterable/iterableapi/l2;->c(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/f0;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method
