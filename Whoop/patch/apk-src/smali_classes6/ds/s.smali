.class public final Lds/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lds/s;->w:I

    iput-object p2, p0, Lds/s;->x:Ljava/lang/Object;

    iput-object p3, p0, Lds/s;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 2
    iput p4, p0, Lds/s;->w:I

    iput-object p1, p0, Lds/s;->y:Ljava/lang/Object;

    iput-object p2, p0, Lds/s;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    iget v0, p0, Lds/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/m;

    :try_start_0
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Ld4/l;

    iget-object v0, v0, Ld4/l;->x:Ld4/k;

    invoke-virtual {v0}, Ld4/h;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v2, v0

    :cond_0
    instance-of v0, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    invoke-virtual {v1, v2}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v1, Lcq/i;

    :try_start_1
    invoke-static {v0}, Lcom/google/android/gms/net/CronetProviderInstaller;->zzc(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcq/i;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v1, v0}, Lcq/i;->a(Ljava/lang/Exception;)V

    :goto_1
    return-void

    :pswitch_1
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lto/r0;

    iget-boolean v0, v6, Lto/r0;->x:Z

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Lto/p0;

    iget-object v1, v0, Lto/p0;->b:Lcom/google/android/gms/common/a;

    iget v2, v1, Lcom/google/android/gms/common/a;->x:I

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/google/android/gms/common/a;->y:Landroid/app/PendingIntent;

    if-eqz v2, :cond_3

    iget-object v2, v6, Lto/h;->w:Ljava/lang/Object;

    invoke-virtual {v6}, Lto/h;->a()Landroid/app/Activity;

    move-result-object v3

    iget-object v1, v1, Lcom/google/android/gms/common/a;->y:Landroid/app/PendingIntent;

    invoke-static {v1}, Luo/w;->f(Ljava/lang/Object;)V

    iget v0, v0, Lto/p0;->a:I

    const/4 v4, 0x0

    invoke-static {v3, v1, v0, v4}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;IZ)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Lto/i;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Lto/h;->a()Landroid/app/Activity;

    move-result-object v2

    iget v3, v1, Lcom/google/android/gms/common/a;->x:I

    move-object v4, v1

    iget-object v1, v6, Lto/r0;->E:Lcom/google/android/gms/common/GoogleApiAvailability;

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v3, v5}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorResolutionIntent(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v6}, Lto/h;->a()Landroid/app/Activity;

    move-result-object v2

    iget-object v3, v6, Lto/h;->w:Ljava/lang/Object;

    iget v4, v4, Lcom/google/android/gms/common/a;->x:I

    const/4 v5, 0x2

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/common/GoogleApiAvailability;->zab(Landroid/app/Activity;Lto/i;IILandroid/content/DialogInterface$OnCancelListener;)Z

    goto :goto_2

    :cond_4
    iget v2, v4, Lcom/google/android/gms/common/a;->x:I

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-virtual {v6}, Lto/h;->a()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v1, v0, v6}, Lcom/google/android/gms/common/GoogleApiAvailability;->zae(Landroid/app/Activity;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v6}, Lto/h;->a()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lto/q0;

    invoke-direct {v3, p0, v0}, Lto/q0;-><init>(Lds/s;Landroid/app/Dialog;)V

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/common/GoogleApiAvailability;->zaf(Landroid/content/Context;Lto/y;)Lto/z;

    goto :goto_2

    :cond_5
    iget v0, v0, Lto/p0;->a:I

    iget-object v1, v6, Lto/r0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {v6, v4, v0}, Lto/r0;->j(Lcom/google/android/gms/common/a;I)V

    :goto_2
    return-void

    :pswitch_2
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Lto/i0;

    iget-object v1, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v1, Laq/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Laq/f;->x:Lcom/google/android/gms/common/a;

    invoke-virtual {v2}, Lcom/google/android/gms/common/a;->b()Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v1, v1, Laq/f;->y:Luo/t;

    invoke-static {v1}, Luo/w;->f(Ljava/lang/Object;)V

    iget-object v2, v1, Luo/t;->y:Lcom/google/android/gms/common/a;

    invoke-virtual {v2}, Lcom/google/android/gms/common/a;->b()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/Exception;

    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    const-string v4, "Sign-in succeeded with resolve account failure: "

    const-string v5, "SignInCoordinator"

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, v3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, v0, Lto/i0;->m:Lcd3/g;

    invoke-virtual {v1, v2}, Lcd3/g;->K(Lcom/google/android/gms/common/a;)V

    iget-object v0, v0, Lto/i0;->l:Laq/a;

    check-cast v0, Luo/c;

    invoke-virtual {v0}, Luo/c;->e()V

    goto :goto_6

    :cond_6
    iget-object v2, v0, Lto/i0;->m:Lcd3/g;

    iget-object v1, v1, Luo/t;->x:Landroid/os/IBinder;

    if-nez v1, :cond_7

    const/4 v1, 0x0

    goto :goto_3

    :cond_7
    invoke-static {v1}, Luo/a;->X(Landroid/os/IBinder;)Luo/i;

    move-result-object v1

    :goto_3
    iget-object v3, v0, Lto/i0;->j:Ljava/util/Set;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v1, :cond_9

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    iput-object v1, v2, Lcd3/g;->z:Ljava/lang/Object;

    iput-object v3, v2, Lcd3/g;->E:Ljava/lang/Object;

    iget-boolean v4, v2, Lcd3/g;->w:Z

    if-eqz v4, :cond_b

    iget-object v2, v2, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/common/api/d;

    check-cast v2, Luo/c;

    invoke-virtual {v2, v1, v3}, Luo/c;->i(Luo/i;Ljava/util/Set;)V

    goto :goto_5

    :cond_9
    :goto_4
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v3, "GoogleApiManager"

    const-string v4, "Received null response from onSignInSuccess"

    invoke-static {v3, v4, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v1, Lcom/google/android/gms/common/a;

    const/4 v3, 0x4

    invoke-direct {v1, v3}, Lcom/google/android/gms/common/a;-><init>(I)V

    invoke-virtual {v2, v1}, Lcd3/g;->K(Lcom/google/android/gms/common/a;)V

    goto :goto_5

    :cond_a
    iget-object v1, v0, Lto/i0;->m:Lcd3/g;

    invoke-virtual {v1, v2}, Lcd3/g;->K(Lcom/google/android/gms/common/a;)V

    :cond_b
    :goto_5
    iget-object v0, v0, Lto/i0;->l:Laq/a;

    check-cast v0, Luo/c;

    invoke-virtual {v0}, Luo/c;->e()V

    :goto_6
    return-void

    :pswitch_3
    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Lto/k;

    iget-object v1, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v1, Lla/b;

    iget-object v0, v0, Lto/k;->b:Lto/j;

    if-nez v0, :cond_c

    goto :goto_7

    :cond_c
    iget-object v0, v0, Lto/j;->a:Ljava/lang/Object;

    iget v2, v1, Lla/b;->w:I

    packed-switch v2, :pswitch_data_1

    check-cast v0, Ltp/g;

    iget-object v1, v1, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/location/LocationAvailability;

    invoke-virtual {v0, v1}, Ltp/g;->onLocationAvailability(Lcom/google/android/gms/location/LocationAvailability;)V

    goto :goto_7

    :pswitch_4
    check-cast v0, Ltp/g;

    iget-object v1, v1, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/location/LocationResult;

    invoke-virtual {v0, v1}, Ltp/g;->onLocationResult(Lcom/google/android/gms/location/LocationResult;)V

    :goto_7
    return-void

    :pswitch_5
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Ltd3/a;

    iget-boolean v1, v0, Ltd3/a;->e:Z

    if-nez v1, :cond_e

    iget-boolean v2, v0, Ltd3/a;->c:Z

    if-eqz v2, :cond_d

    if-nez v1, :cond_d

    iget-object v1, v0, Ltd3/a;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2
    iget-object v2, v0, Ltd3/a;->h:Ltd3/i;

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, v0, Ltd3/a;->j:Ljava/util/ArrayList;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, v3}, Ltd3/i;->a(Ljava/util/List;)V

    iget-object v2, v0, Ltd3/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v0, v0, Ltd3/a;->k:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    monitor-exit v1

    goto :goto_8

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_d
    :goto_8
    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    iget-object v1, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v1, Ltd3/a;

    iget-object v1, v1, Ltd3/a;->g:Ltd3/n;

    iget-wide v1, v1, Ltd3/n;->E:J

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_e
    return-void

    :pswitch_6
    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Lpg3/y;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    iget-object v1, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Lpc/b;

    iget-object v0, v0, Lpc/b;->w:Ljc/v;

    iget-object v0, v0, Ljc/v;->f:Ljc/g;

    iget-object v1, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v0, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter v2

    :try_start_3
    invoke-virtual {v0, v1}, Ljc/g;->c(Ljava/lang/String;)Ljc/i0;

    move-result-object v0

    if-eqz v0, :cond_f

    iget-object v0, v0, Ljc/i0;->a:Lqc/q;

    monitor-exit v2

    goto :goto_9

    :catchall_2
    move-exception v0

    goto :goto_b

    :cond_f
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_10

    sget-object v1, Lic/e;->j:Lic/e;

    iget-object v2, v0, Lqc/q;->j:Lic/e;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    iget-object v1, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v1, Lpc/b;

    iget-object v1, v1, Lpc/b;->y:Ljava/lang/Object;

    monitor-enter v1

    :try_start_4
    iget-object v2, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v2, Lpc/b;

    iget-object v2, v2, Lpc/b;->F:Ljava/util/HashMap;

    invoke-static {v0}, Lhg3/i;->P(Lqc/q;)Lqc/j;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v2, Lpc/b;

    iget-object v3, v2, Lpc/b;->H:Lmc/h;

    iget-object v4, v2, Lpc/b;->x:Lsc/a;

    check-cast v4, Lsc/b;

    iget-object v4, v4, Lsc/b;->b:Lbc3/z;

    invoke-static {v3, v0, v4, v2}, Lmc/i;->a(Lmc/h;Lqc/q;Lbc3/z;Lmc/f;)Lbc3/c2;

    move-result-object v2

    iget-object v3, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v3, Lpc/b;

    iget-object v3, v3, Lpc/b;->G:Ljava/util/HashMap;

    invoke-static {v0}, Lhg3/i;->P(Lqc/q;)Lqc/j;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    goto :goto_a

    :catchall_3
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v0

    :cond_10
    :goto_a
    return-void

    :goto_b
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0

    :pswitch_8
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/performance/g;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lio/sentry/android/core/performance/g;->y:J

    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    new-instance v1, Lio/sentry/c7;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_9
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Lib/i;

    iget-object v1, v0, Lib/i;->d:Ljava/lang/Object;

    check-cast v1, Lib/k;

    iget v0, v0, Lib/i;->a:I

    iget-object v2, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v2, Lib/l;

    invoke-virtual {v1, v0, v2}, Lib/k;->a(ILib/l;)V

    return-void

    :pswitch_a
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/j2;

    iget-object v1, v0, Landroidx/fragment/app/j2;->F:Ljava/lang/Object;

    check-cast v1, Lib/c;

    iget v2, v1, Lib/c;->g:I

    iget v3, v0, Landroidx/fragment/app/j2;->x:I

    if-ne v2, v3, :cond_1f

    iget-object v2, v0, Landroidx/fragment/app/j2;->E:Ljava/lang/Object;

    check-cast v2, Lib/n;

    iget-object v3, v0, Landroidx/fragment/app/j2;->z:Ljava/util/List;

    check-cast v3, Lib/n;

    iget-object v4, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v4, Landroidx/recyclerview/widget/t;

    iget-object v0, v0, Landroidx/fragment/app/j2;->y:Ljava/util/List;

    check-cast v0, Lib/n;

    iget v0, v0, Lib/n;->E:I

    iget-object v5, v1, Lib/c;->f:Lib/n;

    if-eqz v5, :cond_1e

    iget-object v6, v5, Lib/n;->z:Lib/r;

    iget-object v7, v1, Lib/c;->e:Lib/n;

    if-nez v7, :cond_1e

    iput-object v2, v1, Lib/c;->e:Lib/n;

    const/4 v7, 0x0

    iput-object v7, v1, Lib/c;->f:Lib/n;

    iget-object v7, v1, Lib/c;->a:Landroidx/recyclerview/widget/c;

    iget-object v8, v2, Lib/n;->z:Lib/r;

    invoke-virtual {v6}, Lib/r;->d()I

    move-result v9

    invoke-virtual {v8}, Lib/r;->d()I

    move-result v10

    invoke-virtual {v6}, Lib/r;->c()I

    move-result v11

    invoke-virtual {v8}, Lib/r;->c()I

    move-result v8

    const/4 v12, 0x0

    if-nez v9, :cond_11

    if-nez v10, :cond_11

    if-nez v11, :cond_11

    if-nez v8, :cond_11

    invoke-virtual {v4, v7}, Landroidx/recyclerview/widget/t;->a(Landroidx/recyclerview/widget/a1;)V

    goto :goto_e

    :cond_11
    if-le v9, v10, :cond_12

    sub-int/2addr v9, v10

    invoke-virtual {v6}, Lib/r;->size()I

    move-result v10

    sub-int/2addr v10, v9

    invoke-virtual {v7, v10, v9}, Landroidx/recyclerview/widget/c;->b(II)V

    goto :goto_c

    :cond_12
    if-ge v9, v10, :cond_13

    invoke-virtual {v6}, Lib/r;->size()I

    move-result v13

    sub-int/2addr v10, v9

    invoke-virtual {v7, v13, v10}, Landroidx/recyclerview/widget/c;->a(II)V

    :cond_13
    :goto_c
    if-le v11, v8, :cond_14

    sub-int/2addr v11, v8

    invoke-virtual {v7, v12, v11}, Landroidx/recyclerview/widget/c;->b(II)V

    goto :goto_d

    :cond_14
    if-ge v11, v8, :cond_15

    sub-int v9, v8, v11

    invoke-virtual {v7, v12, v9}, Landroidx/recyclerview/widget/c;->a(II)V

    :cond_15
    :goto_d
    if-eqz v8, :cond_16

    new-instance v9, Lai/j;

    invoke-direct {v9, v8, v7}, Lai/j;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v9}, Landroidx/recyclerview/widget/t;->a(Landroidx/recyclerview/widget/a1;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v4, v7}, Landroidx/recyclerview/widget/t;->a(Landroidx/recyclerview/widget/a1;)V

    :goto_e
    iget-object v7, v1, Lib/c;->h:Lib/a;

    invoke-virtual {v2, v3, v7}, Lib/n;->c(Ljava/util/List;Lib/a;)V

    iget-object v2, v1, Lib/c;->e:Lib/n;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1d

    iget-object v2, v3, Lib/n;->z:Lib/r;

    invoke-virtual {v6}, Lib/r;->c()I

    move-result v3

    sub-int v7, v0, v3

    invoke-virtual {v6}, Lib/r;->size()I

    move-result v8

    sub-int/2addr v8, v3

    invoke-virtual {v6}, Lib/r;->d()I

    move-result v3

    sub-int/2addr v8, v3

    const/4 v3, 0x1

    if-ltz v7, :cond_1c

    if-ge v7, v8, :cond_1c

    move v8, v12

    :goto_f
    const/16 v9, 0x1e

    if-ge v8, v9, :cond_1c

    div-int/lit8 v9, v8, 0x2

    rem-int/lit8 v10, v8, 0x2

    const/4 v11, -0x1

    if-ne v10, v3, :cond_17

    move v10, v11

    goto :goto_10

    :cond_17
    move v10, v3

    :goto_10
    mul-int/2addr v9, v10

    add-int/2addr v9, v7

    if-ltz v9, :cond_1b

    iget v10, v6, Lib/r;->E:I

    if-lt v9, v10, :cond_18

    goto :goto_12

    :cond_18
    :try_start_6
    iget v10, v4, Landroidx/recyclerview/widget/t;->e:I

    if-ltz v9, :cond_1a

    if-ge v9, v10, :cond_1a

    iget-object v10, v4, Landroidx/recyclerview/widget/t;->b:[I

    aget v9, v10, v9

    and-int/lit8 v10, v9, 0xf

    if-nez v10, :cond_19

    move v9, v11

    goto :goto_11

    :cond_19
    shr-int/lit8 v9, v9, 0x4

    :goto_11
    if-eq v9, v11, :cond_1b

    iget v0, v2, Lib/r;->w:I

    add-int/2addr v9, v0

    goto :goto_13

    :cond_1a
    new-instance v4, Ljava/lang/IndexOutOfBoundsException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Index out of bounds - passed position = "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ", old list size = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_1

    :cond_1b
    :goto_12
    add-int/lit8 v8, v8, 0x1

    goto :goto_f

    :catch_1
    :cond_1c
    invoke-virtual {v2}, Lib/r;->size()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v9

    :goto_13
    iget-object v0, v1, Lib/c;->e:Lib/n;

    iget-object v2, v0, Lib/n;->z:Lib/r;

    invoke-virtual {v2}, Lib/r;->size()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-static {v2, v9}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v12, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v0, v2}, Lib/n;->n(I)V

    :cond_1d
    iget-object v0, v1, Lib/c;->e:Lib/n;

    invoke-virtual {v1, v5, v0}, Lib/c;->a(Lib/n;Lib/n;)V

    goto :goto_14

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "must be in snapshot state to apply diff"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    :goto_14
    return-void

    :pswitch_b
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/m;

    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Lds/w;

    iget-object v2, v0, Lds/n;->w:Ljava/lang/Object;

    instance-of v2, v2, Lds/a;

    if-eqz v2, :cond_20

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    goto :goto_15

    :cond_20
    :try_start_7
    invoke-static {v0}, Lbp/b;->x(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_7 .. :try_end_7} :catch_2

    goto :goto_15

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_15
    return-void

    :pswitch_c
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/m;

    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Lds/v;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v2

    if-eqz v2, :cond_21

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    goto :goto_16

    :cond_21
    :try_start_8
    invoke-static {v0}, Ld4/h;->g(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_16

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_16
    return-void

    :cond_22
    new-instance v0, Lkotlin/KotlinNullPointerException;

    invoke-direct {v0}, Lkotlin/KotlinNullPointerException;-><init>()V

    const-class v1, Lkotlin/jvm/internal/k;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->n(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw v0

    :pswitch_d
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Lcq/o;

    iget-object v1, v0, Lcq/o;->y:Ljava/lang/Object;

    monitor-enter v1

    :try_start_9
    iget-object v0, v0, Lcq/o;->z:Ljava/lang/Object;

    check-cast v0, Lcq/e;

    if-eqz v0, :cond_23

    iget-object v2, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v2

    invoke-static {v2}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Lcq/e;->n(Ljava/lang/Exception;)V

    goto :goto_17

    :catchall_4
    move-exception v0

    goto :goto_18

    :cond_23
    :goto_17
    monitor-exit v1

    return-void

    :goto_18
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    throw v0

    :pswitch_e
    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/a2;

    iget-object v1, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/a2;

    iget-object v1, v1, Lcom/iterable/iterableapi/a2;->b:Lcom/iterable/iterableapi/o;

    filled-new-array {v1}, [Lcom/iterable/iterableapi/o;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    :pswitch_f
    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Lc5/f;

    iget-object v1, p0, Lds/s;->y:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lc5/f;->accept(Ljava/lang/Object;)V

    return-void

    :pswitch_10
    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Lty/c;

    iget-object v1, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Typeface;

    iget-object v0, v0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lu4/b;

    if-eqz v0, :cond_24

    invoke-virtual {v0, v1}, Lu4/b;->k(Landroid/graphics/Typeface;)V

    :cond_24
    return-void

    :pswitch_11
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/m;

    iget-object v1, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/d1;

    invoke-virtual {v0, v1}, Lbc3/m;->C(Lbc3/z;)V

    return-void

    :pswitch_12
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/j2;

    iget-object v1, v0, Landroidx/fragment/app/j2;->F:Ljava/lang/Object;

    check-cast v1, Landroidx/recyclerview/widget/h;

    iget v2, v1, Landroidx/recyclerview/widget/h;->g:I

    iget v3, v0, Landroidx/fragment/app/j2;->x:I

    if-ne v2, v3, :cond_25

    iget-object v2, v0, Landroidx/fragment/app/j2;->z:Ljava/util/List;

    iget-object v3, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v3, Landroidx/recyclerview/widget/t;

    iget-object v0, v0, Landroidx/fragment/app/j2;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    iput-object v2, v1, Landroidx/recyclerview/widget/h;->e:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Landroidx/recyclerview/widget/h;->f:Ljava/util/List;

    iget-object v2, v1, Landroidx/recyclerview/widget/h;->a:Landroidx/recyclerview/widget/c;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/t;->a(Landroidx/recyclerview/widget/a1;)V

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/h;->a(Ljava/lang/Runnable;)V

    :cond_25
    return-void

    :pswitch_13
    iget-object v0, p0, Lds/s;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lz7/a;

    iget-object v0, p0, Lds/s;->x:Ljava/lang/Object;

    check-cast v0, Lds/v;

    instance-of v2, v0, Les/a;

    if-eqz v2, :cond_27

    move-object v2, v0

    check-cast v2, Les/a;

    check-cast v2, Lds/n;

    instance-of v3, v2, Lds/g;

    if-eqz v3, :cond_26

    iget-object v2, v2, Lds/n;->w:Ljava/lang/Object;

    instance-of v3, v2, Lds/b;

    if-eqz v3, :cond_26

    check-cast v2, Lds/b;

    iget-object v2, v2, Lds/b;->a:Ljava/lang/Throwable;

    goto :goto_19

    :cond_26
    const/4 v2, 0x0

    :goto_19
    if-eqz v2, :cond_27

    invoke-virtual {v1, v2}, Lz7/a;->j(Ljava/lang/Throwable;)V

    goto :goto_1a

    :cond_27
    :try_start_a
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v2

    const-string v3, "Future was expected to be done: %s"

    if-eqz v2, :cond_29

    invoke-static {v0}, Lbp/b;->x(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_a
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    check-cast v0, Ljava/lang/Integer;

    iget-object v2, v1, Lz7/a;->b:Ljava/lang/Object;

    check-cast v2, Lds/w;

    iget-object v3, v1, Lz7/a;->d:Ljava/lang/Object;

    check-cast v3, Lv7/b;

    iget-object v4, v3, Lv7/b;->a:Lqg3/d;

    iget-object v5, v3, Lv7/b;->b:La8/b;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v7, v1, Lz7/a;->a:I

    const/4 v8, 0x3

    if-ge v6, v7, :cond_28

    new-instance v1, La8/a;

    invoke-direct {v1, v4}, La8/a;-><init>(Lqg3/d;)V

    iget-object v3, v5, La8/b;->x:Landroid/os/Handler;

    invoke-virtual {v3, v8, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-instance v1, Landroidx/health/platform/client/impl/ipc/ApiVersionException;

    invoke-direct {v1, v0, v7}, Landroidx/health/platform/client/impl/ipc/ApiVersionException;-><init>(II)V

    invoke-virtual {v2, v1}, Lds/n;->k(Ljava/lang/Throwable;)Z

    goto :goto_1a

    :cond_28
    iget-object v0, v1, Lz7/a;->c:Ljava/lang/Object;

    check-cast v0, Lz7/c;

    new-instance v1, Lz7/b;

    invoke-direct {v1, v3, v4, v0, v2}, Lz7/b;-><init>(Lv7/b;Lqg3/d;Lz7/c;Lds/w;)V

    iget-object v0, v5, La8/b;->x:Landroid/os/Handler;

    invoke-virtual {v0, v8, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1a

    :cond_29
    :try_start_b
    new-instance v2, Ljava/lang/IllegalStateException;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v0}, Lrs/b;->k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_b
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :catchall_5
    move-exception v0

    invoke-virtual {v1, v0}, Lz7/a;->j(Ljava/lang/Throwable;)V

    goto :goto_1a

    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lz7/a;->j(Ljava/lang/Throwable;)V

    :goto_1a
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x11
        :pswitch_4
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lds/s;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lq30/w0;

    const-class v1, Lds/s;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lq30/w0;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lds/s;->y:Ljava/lang/Object;

    check-cast v1, Lz7/a;

    new-instance v2, Lpg3/p;

    const/16 v3, 0x10

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lpg3/p;-><init>(IZ)V

    iget-object v3, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v3, Lpg3/p;

    iput-object v2, v3, Lpg3/p;->y:Ljava/lang/Object;

    iput-object v2, v0, Lq30/w0;->z:Ljava/lang/Object;

    iput-object v1, v2, Lpg3/p;->x:Ljava/lang/Object;

    invoke-virtual {v0}, Lq30/w0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
