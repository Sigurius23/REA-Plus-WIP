.class public final synthetic Lh6/l;
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

    iput p4, p0, Lh6/l;->w:I

    iput-object p1, p0, Lh6/l;->x:Ljava/lang/Object;

    iput-object p2, p0, Lh6/l;->y:Ljava/lang/Object;

    iput-object p3, p0, Lh6/l;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    iget v0, p0, Lh6/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh6/l;->x:Ljava/lang/Object;

    check-cast v0, Lzt/h;

    iget-object v1, p0, Lh6/l;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Intent;

    iget-object v2, p0, Lh6/l;->z:Ljava/lang/Object;

    check-cast v2, Lcq/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v0, v1}, Lzt/h;->d(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v3}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v3}, Lcq/i;->b(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lh6/l;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/WorkDatabase;

    iget-object v1, p0, Lh6/l;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lh6/l;->z:Ljava/lang/Object;

    check-cast v2, Ljc/v;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "name"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lqc/u;->a:Landroidx/room/z0;

    new-instance v3, Le61/g;

    const/16 v4, 0xb

    invoke-direct {v3, v1, v4}, Le61/g;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v3}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1}, Lq83/g;->m(Ljc/v;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lh6/l;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/l0;

    iget-object v1, p0, Lh6/l;->y:Ljava/lang/Object;

    check-cast v1, Ljc/l;

    iget-object v2, p0, Lh6/l;->z:Ljava/lang/Object;

    check-cast v2, La3/p;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljc/g;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Work "

    iget-object v11, v1, Ljc/l;->a:Lqc/j;

    iget-object v12, v11, Lqc/j;->a:Ljava/lang/String;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v7, Ljc/g;->e:Landroidx/work/impl/WorkDatabase;

    new-instance v4, Ljc/f;

    invoke-direct {v4, v7, v10, v12}, Ljc/f;-><init>(Ljc/g;Ljava/util/ArrayList;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroidx/room/z0;->runInTransaction(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lqc/q;

    if-nez v9, :cond_1

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v1, Ljc/g;->l:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Didn\'t find WorkSpec for id "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v11}, Ljc/g;->e(Lqc/j;)V

    goto/16 :goto_3

    :cond_1
    iget-object v13, v7, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter v13

    :try_start_1
    iget-object v3, v7, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v7, v12}, Ljc/g;->c(Ljava/lang/String;)Ljc/i0;

    move-result-object v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v4, :cond_4

    :try_start_3
    iget-object v2, v7, Ljc/g;->h:Ljava/util/HashMap;

    invoke-virtual {v2, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljc/l;

    iget-object v3, v3, Ljc/l;->a:Lqc/j;

    iget v3, v3, Lqc/j;->b:I

    iget v4, v11, Lqc/j;->b:I

    if-ne v3, v4, :cond_3

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    sget-object v2, Ljc/g;->l:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is already enqueued for processing"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v7, v11}, Ljc/g;->e(Lqc/j;)V

    :goto_2
    monitor-exit v13

    goto/16 :goto_3

    :cond_4
    iget v0, v9, Lqc/q;->t:I

    iget v3, v11, Lqc/j;->b:I

    if-eq v0, v3, :cond_5

    invoke-virtual {v7, v11}, Ljc/g;->e(Lqc/j;)V

    monitor-exit v13

    goto :goto_3

    :cond_5
    new-instance v3, Ljc/b0;

    iget-object v4, v7, Ljc/g;->b:Landroid/content/Context;

    iget-object v5, v7, Ljc/g;->c:Lic/b;

    iget-object v6, v7, Ljc/g;->d:Lsc/b;

    iget-object v8, v7, Ljc/g;->e:Landroidx/work/impl/WorkDatabase;

    invoke-direct/range {v3 .. v10}, Ljc/b0;-><init>(Landroid/content/Context;Lic/b;Lsc/b;Lpc/a;Landroidx/work/impl/WorkDatabase;Lqc/q;Ljava/util/ArrayList;)V

    if-eqz v2, :cond_6

    iput-object v2, v3, Ljc/b0;->h:Ljava/lang/Object;

    :cond_6
    new-instance v0, Ljc/i0;

    invoke-direct {v0, v3}, Ljc/i0;-><init>(Ljc/b0;)V

    iget-object v2, v0, Ljc/i0;->e:Lsc/b;

    iget-object v2, v2, Lsc/b;->b:Lbc3/z;

    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object v3

    invoke-virtual {v2, v3}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    new-instance v3, Ljc/g0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v0, v5, v4}, Ljc/g0;-><init>(Ljc/i0;Lq83/d;I)V

    invoke-static {v2, v3}, Lq83/g;->F(Lq83/j;Lc93/m;)Ld4/l;

    move-result-object v2

    new-instance v3, Lh6/l;

    const/4 v4, 0x4

    invoke-direct {v3, v7, v2, v0, v4}, Lh6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object v4, v7, Ljc/g;->d:Lsc/b;

    iget-object v4, v4, Lsc/b;->d:Lcq/s;

    iget-object v2, v2, Ld4/l;->x:Ld4/k;

    invoke-virtual {v2, v3, v4}, Ld4/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v2, v7, Ljc/g;->g:Ljava/util/HashMap;

    invoke-virtual {v2, v12, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v7, Ljc/g;->h:Ljava/util/HashMap;

    invoke-virtual {v1, v12, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v1, Ljc/g;->l:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-class v3, Ljc/g;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": processing "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    return-void

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    throw v0

    :goto_4
    monitor-exit v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :pswitch_2
    iget-object v0, p0, Lh6/l;->x:Ljava/lang/Object;

    check-cast v0, Ljc/g;

    iget-object v1, p0, Lh6/l;->y:Ljava/lang/Object;

    check-cast v1, Ld4/l;

    iget-object v2, p0, Lh6/l;->z:Ljava/lang/Object;

    check-cast v2, Ljc/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_6
    iget-object v1, v1, Ld4/l;->x:Ld4/k;

    invoke-virtual {v1}, Ld4/h;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_5

    :catch_0
    const/4 v1, 0x1

    :goto_5
    iget-object v3, v0, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter v3

    :try_start_7
    iget-object v4, v2, Ljc/i0;->a:Lqc/q;

    invoke-static {v4}, Lhg3/i;->P(Lqc/q;)Lqc/j;

    move-result-object v4

    iget-object v5, v4, Lqc/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljc/g;->c(Ljava/lang/String;)Ljc/i0;

    move-result-object v6

    if-ne v6, v2, :cond_7

    invoke-virtual {v0, v5}, Ljc/g;->b(Ljava/lang/String;)Ljc/i0;

    goto :goto_6

    :catchall_3
    move-exception v0

    goto :goto_8

    :cond_7
    :goto_6
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    sget-object v6, Ljc/g;->l:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-class v8, Ljc/g;

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " executed; reschedule = "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v6, v5}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v0, Ljc/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljc/d;

    invoke-interface {v2, v4, v1}, Ljc/d;->b(Lqc/j;Z)V

    goto :goto_7

    :cond_8
    monitor-exit v3

    return-void

    :goto_8
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    :pswitch_3
    iget-object v0, p0, Lh6/l;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Lh6/l;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/e7;

    iget-object v2, p0, Lh6/l;->z:Ljava/lang/Object;

    check-cast v2, Lio/sentry/c4;

    const-string v3, "trace.json"

    if-nez v1, :cond_9

    iget-object v1, v2, Lio/sentry/c4;->s:La3/p;

    new-instance v2, Lio/sentry/e7;

    iget-object v4, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v4, Lio/sentry/protocol/v;

    iget-object v1, v1, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/h7;

    const-string v5, "default"

    const/4 v6, 0x0

    invoke-direct {v2, v4, v1, v5, v6}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/String;Lio/sentry/h7;)V

    const-string v1, "auto"

    iput-object v1, v2, Lio/sentry/e7;->I:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lio/sentry/cache/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v0, v1, v3}, Lio/sentry/cache/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_9
    return-void

    :pswitch_4
    iget-object v0, p0, Lh6/l;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/ndk/b;

    iget-object v1, p0, Lh6/l;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lh6/l;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v0, v0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lio/sentry/ndk/NativeScope;->nativeSetTag(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lh6/l;->x:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    iget-object v1, p0, Lh6/l;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lh6/l;->z:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    const-string v3, "$c"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$js"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    :try_start_8
    invoke-virtual {v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluate(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v2, :cond_a

    invoke-interface {v2, v0, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    goto :goto_a

    :catch_1
    move-exception v0

    if-eqz v2, :cond_a

    invoke-interface {v2, v3, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    :goto_a
    return-void

    :pswitch_6
    iget-object v0, p0, Lh6/l;->x:Ljava/lang/Object;

    check-cast v0, Lbl/d;

    iget-object v1, p0, Lh6/l;->y:Ljava/lang/Object;

    check-cast v1, Lwb3/f;

    iget-object v2, p0, Lh6/l;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    :try_start_9
    iget-object v0, v0, Lbl/d;->a:Landroid/content/Context;

    invoke-static {v0}, Lts/o;->k(Landroid/content/Context;)Lh6/t;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v3, v0, Lh6/t;->a:Lh6/i;

    check-cast v3, Lh6/s;

    iget-object v4, v3, Lh6/s;->d:Ljava/lang/Object;

    monitor-enter v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    iput-object v2, v3, Lh6/s;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    monitor-exit v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :try_start_b
    iget-object v0, v0, Lh6/t;->a:Lh6/i;

    new-instance v3, Lh6/m;

    invoke-direct {v3, v1, v2}, Lh6/m;-><init>(Lwb3/f;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v3}, Lh6/i;->a(Lwb3/f;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_c

    :catchall_4
    move-exception v0

    goto :goto_b

    :catchall_5
    move-exception v0

    :try_start_c
    monitor-exit v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    throw v0

    :cond_b
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :goto_b
    invoke-virtual {v1, v0}, Lwb3/f;->S(Ljava/lang/Throwable;)V

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_c
    return-void

    nop

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
