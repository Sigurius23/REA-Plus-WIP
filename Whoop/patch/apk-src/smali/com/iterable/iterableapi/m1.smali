.class public final synthetic Lcom/iterable/iterableapi/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lcom/iterable/iterableapi/m1;->w:I

    iput-object p2, p0, Lcom/iterable/iterableapi/m1;->x:Ljava/lang/Object;

    iput-object p3, p0, Lcom/iterable/iterableapi/m1;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lcom/iterable/iterableapi/m1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/iterable/iterableapi/m1;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/iterable/iterableapi/m1;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Intent;

    invoke-static {}, Lzt/q;->u()Lzt/q;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "FirebaseMessaging"

    const/4 v4, 0x3

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "FirebaseMessaging"

    const-string v5, "Starting service"

    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v3, v2, Lzt/q;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayDeque;

    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    new-instance v1, Landroid/content/Intent;

    const-string v3, "com.google.firebase.MESSAGING_EVENT"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "Error resolving target intent service, skipping classname enforcement. Resolved service was: "

    monitor-enter v2

    :try_start_0
    iget-object v5, v2, Lzt/q;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_1

    monitor-exit v2

    goto/16 :goto_4

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v1, v6}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-nez v5, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v7, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "."

    invoke-virtual {v7, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lzt/q;->x:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_4
    iget-object v3, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    iput-object v3, v2, Lzt/q;->x:Ljava/lang/Object;

    :goto_0
    iget-object v3, v2, Lzt/q;->x:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    goto :goto_4

    :cond_5
    :goto_1
    :try_start_2
    const-string v7, "FirebaseMessaging"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v2

    :goto_2
    move-object v5, v6

    goto :goto_4

    :cond_6
    :goto_3
    :try_start_3
    const-string v3, "FirebaseMessaging"

    const-string v5, "Failed to resolve target intent service, skipping classname enforcement"

    invoke-static {v3, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v2

    goto :goto_2

    :goto_4
    if-eqz v5, :cond_8

    const-string v3, "FirebaseMessaging"

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "FirebaseMessaging"

    const-string v4, "Restricting intent to a specific service: "

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_8
    :try_start_4
    invoke-virtual {v2, v0}, Lzt/q;->z(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v0, v1}, Lzt/z;->d(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object v0

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_7

    :cond_9
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object v0

    const-string v1, "FirebaseMessaging"

    const-string v2, "Missing wake lock permission, service start may be delayed"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_5
    if-nez v0, :cond_a

    const-string v0, "FirebaseMessaging"

    const-string v1, "Error while delivering the message: ServiceIntent not found."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    const/16 v0, 0x194

    goto :goto_8

    :cond_a
    const/4 v0, -0x1

    goto :goto_8

    :goto_6
    const-string v1, "FirebaseMessaging"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to start service while in background: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0x192

    goto :goto_8

    :goto_7
    const-string v1, "FirebaseMessaging"

    const-string v2, "Error while delivering the message to the serviceIntent"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 v0, 0x191

    :goto_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :goto_9
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/iterable/iterableapi/m1;->x:Ljava/lang/Object;

    check-cast v0, Ljc/f0;

    iget-object v1, p0, Lcom/iterable/iterableapi/m1;->y:Ljava/lang/Object;

    check-cast v1, Ljc/i0;

    iget-object v2, v1, Ljc/i0;->a:Lqc/q;

    iget-object v3, v1, Ljc/i0;->c:Ljava/lang/String;

    iget-object v4, v1, Ljc/i0;->j:Lqc/u;

    instance-of v5, v0, Ljc/d0;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_13

    check-cast v0, Ljc/d0;

    iget-object v0, v0, Ljc/d0;->a:Lic/u;

    invoke-virtual {v4, v3}, Lqc/u;->d(Ljava/lang/String;)Lic/m0;

    move-result-object v5

    iget-object v8, v1, Ljc/i0;->i:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->g()Lqc/n;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v8, Lqc/n;->a:Landroidx/room/z0;

    new-instance v9, Le61/g;

    const/16 v10, 0x8

    invoke-direct {v9, v3, v10}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-static {v8, v7, v6, v9}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    if-nez v5, :cond_b

    goto :goto_a

    :cond_b
    sget-object v8, Lic/m0;->x:Lic/m0;

    if-ne v5, v8, :cond_12

    iget-object v5, v1, Ljc/i0;->m:Ljava/lang/String;

    instance-of v8, v0, Lic/t;

    if-eqz v8, :cond_f

    sget-object v8, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Worker result SUCCESS for "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v8, v5}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lqc/q;->c()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v1}, Ljc/i0;->c()V

    :cond_c
    :goto_a
    move v6, v7

    goto/16 :goto_c

    :cond_d
    sget-object v2, Lic/m0;->y:Lic/m0;

    invoke-virtual {v4, v2, v3}, Lqc/u;->j(Lic/m0;Ljava/lang/String;)I

    check-cast v0, Lic/t;

    iget-object v0, v0, Lic/t;->a:Lic/g;

    const-string v2, "getOutputData(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v4, Lqc/u;->a:Landroidx/room/z0;

    new-instance v5, Lp3/b0;

    const/4 v8, 0x6

    invoke-direct {v5, v8, v0, v3}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v7, v6, v5}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    iget-object v0, v1, Ljc/i0;->g:Lic/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-object v0, v1, Ljc/i0;->k:Lqc/c;

    invoke-virtual {v0, v3}, Lqc/c;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v2}, Lqc/u;->d(Ljava/lang/String;)Lic/m0;

    move-result-object v3

    sget-object v5, Lic/m0;->E:Lic/m0;

    if-ne v3, v5, :cond_e

    iget-object v3, v0, Lqc/c;->a:Landroidx/room/z0;

    new-instance v5, Lht2/d;

    const/16 v10, 0x1a

    invoke-direct {v5, v2, v10}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-static {v3, v6, v7, v5}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_e

    sget-object v3, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v5

    const-string v10, "Setting status to enqueued for "

    invoke-virtual {v10, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v3, v10}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v3, Lic/m0;->w:Lic/m0;

    invoke-virtual {v4, v3, v2}, Lqc/u;->j(Lic/m0;Ljava/lang/String;)I

    invoke-virtual {v4, v8, v9, v2}, Lqc/u;->i(JLjava/lang/String;)V

    goto :goto_b

    :cond_f
    instance-of v3, v0, Lic/s;

    if-eqz v3, :cond_10

    sget-object v0, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Worker result RETRY for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, -0x100

    invoke-virtual {v1, v0}, Ljc/i0;->b(I)V

    goto :goto_c

    :cond_10
    sget-object v3, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Worker result FAILURE for "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lqc/q;->c()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {v1}, Ljc/i0;->c()V

    goto/16 :goto_a

    :cond_11
    invoke-virtual {v1, v0}, Ljc/i0;->d(Lic/u;)V

    goto/16 :goto_a

    :cond_12
    invoke-virtual {v5}, Lic/m0;->a()Z

    move-result v0

    if-nez v0, :cond_c

    const/16 v0, -0x200

    invoke-virtual {v1, v0}, Ljc/i0;->b(I)V

    :goto_c
    move v7, v6

    goto/16 :goto_d

    :cond_13
    instance-of v5, v0, Ljc/c0;

    if-eqz v5, :cond_14

    check-cast v0, Ljc/c0;

    iget-object v0, v0, Ljc/c0;->a:Lic/u;

    invoke-virtual {v1, v0}, Ljc/i0;->d(Lic/u;)V

    goto/16 :goto_d

    :cond_14
    instance-of v5, v0, Ljc/e0;

    if-eqz v5, :cond_17

    check-cast v0, Ljc/e0;

    iget v0, v0, Ljc/e0;->a:I

    const-string v5, " is "

    const-string v8, "Status for "

    iget-object v9, v2, Lqc/q;->y:Ljava/lang/Boolean;

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    sget-object v3, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Worker "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, Lqc/q;->c:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " was interrupted. Backing off."

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v3, v2}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljc/i0;->b(I)V

    goto :goto_c

    :cond_15
    invoke-virtual {v4, v3}, Lqc/u;->d(Ljava/lang/String;)Lic/m0;

    move-result-object v1

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Lic/m0;->a()Z

    move-result v2

    if-nez v2, :cond_16

    sget-object v2, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "; not doing any work and rescheduling for later execution"

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v2, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lic/m0;->w:Lic/m0;

    invoke-virtual {v4, v1, v3}, Lqc/u;->j(Lic/m0;Ljava/lang/String;)I

    invoke-virtual {v4, v0, v3}, Lqc/u;->k(ILjava/lang/String;)V

    const-wide/16 v0, -0x1

    invoke-virtual {v4, v0, v1, v3}, Lqc/u;->g(JLjava/lang/String;)I

    goto/16 :goto_c

    :cond_16
    sget-object v0, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ; not doing any work"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_a

    :goto_d
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_17
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/iterable/iterableapi/m1;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/l0;

    iget-object v1, p0, Lcom/iterable/iterableapi/m1;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v0, v0, Lio/sentry/android/core/l0;->w:Landroid/content/Context;

    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/n0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/iterable/iterableapi/m1;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/j1;

    iget-object v1, p0, Lcom/iterable/iterableapi/m1;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/b7;

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_6
    new-instance v3, Ljava/io/BufferedWriter;

    new-instance v4, Ljava/io/OutputStreamWriter;

    sget-object v5, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    invoke-direct {v4, v2, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    invoke-interface {v0, v3, v1}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    invoke-virtual {v3}, Ljava/io/Writer;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V

    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_f

    :catchall_2
    move-exception v0

    :try_start_9
    invoke-virtual {v3}, Ljava/io/Writer;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_e

    :catchall_3
    move-exception v1

    :try_start_a
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_e
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :goto_f
    :try_start_b
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_10

    :catchall_4
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_10
    throw v0

    :pswitch_3
    iget-object v0, p0, Lcom/iterable/iterableapi/m1;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/j1;

    iget-object v1, p0, Lcom/iterable/iterableapi/m1;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/r4;

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_c
    new-instance v3, Ljava/io/BufferedWriter;

    new-instance v4, Ljava/io/OutputStreamWriter;

    sget-object v5, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    invoke-direct {v4, v2, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    invoke-interface {v0, v3, v1}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    :try_start_e
    invoke-virtual {v3}, Ljava/io/Writer;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V

    return-object v0

    :catchall_5
    move-exception v0

    goto :goto_12

    :catchall_6
    move-exception v0

    :try_start_f
    invoke-virtual {v3}, Ljava/io/Writer;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto :goto_11

    :catchall_7
    move-exception v1

    :try_start_10
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_11
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :goto_12
    :try_start_11
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    goto :goto_13

    :catchall_8
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_13
    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/iterable/iterableapi/m1;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/z;

    iget-object v1, p0, Lcom/iterable/iterableapi/m1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "$it"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "doFinal(...)"

    const/4 v2, 0x2

    :try_start_12
    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    const/4 v3, 0x0

    aget-byte v4, v1, v3

    const/4 v5, 0x1

    if-ne v4, v5, :cond_18

    move v3, v5

    :cond_18
    aget-byte v4, v1, v5

    add-int/2addr v4, v2

    invoke-static {v1, v2, v4}, Lm83/n;->k0([BII)[B

    move-result-object v5

    array-length v6, v1

    invoke-static {v1, v4, v6}, Lm83/n;->k0([BII)[B

    move-result-object v1

    if-eqz v3, :cond_19

    const-string v3, "AES/GCM/NoPadding"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    new-instance v4, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v6, 0x80

    invoke-direct {v4, v6, v5}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    invoke-static {}, Lcom/iterable/iterableapi/z;->c()Ljavax/crypto/SecretKey;

    move-result-object v5

    invoke-virtual {v3, v2, v5, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v3, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_14

    :cond_19
    const-string v3, "AES/CBC/PKCS5Padding"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v4, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-static {}, Lcom/iterable/iterableapi/z;->c()Ljavax/crypto/SecretKey;

    move-result-object v5

    invoke-virtual {v3, v2, v5, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v3, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_14
    new-instance v0, Ljava/lang/String;

    sget-object v2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_12
    .catch Lcom/iterable/iterableapi/IterableDataEncryptor$DecryptionException; {:try_start_12 .. :try_end_12} :catch_3
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    goto :goto_15

    :catch_3
    move-exception v0

    goto :goto_16

    :goto_15
    const-string v1, "IterableDataEncryptor"

    const-string v2, "Decryption failed"

    invoke-static {v1, v2, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    new-instance v1, Lcom/iterable/iterableapi/IterableDataEncryptor$DecryptionException;

    const-string v2, "Failed to decrypt data"

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_16
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
