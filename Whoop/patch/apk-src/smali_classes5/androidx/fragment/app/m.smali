.class public final synthetic Landroidx/fragment/app/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb9/l0;Lb9/f1;)V
    .locals 0

    .line 1
    const/16 p1, 0x9

    iput p1, p0, Landroidx/fragment/app/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;)V
    .locals 1

    .line 2
    const/16 v0, 0x12

    iput v0, p0, Landroidx/fragment/app/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p2, p0, Landroidx/fragment/app/m;->w:I

    iput-object p1, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget v0, p0, Landroidx/fragment/app/m;->w:I

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;

    invoke-static {v0}, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->a(Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/EditTextKt;->a(Landroid/widget/EditText;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Li9/e;

    iget-object v3, v0, Li9/e;->a:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-boolean v4, v0, Li9/e;->m:Z

    if-eqz v4, :cond_0

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-wide v4, v0, Li9/e;->l:J

    const-wide/16 v6, 0x1

    sub-long/2addr v4, v6

    iput-wide v4, v0, Li9/e;->l:J

    cmp-long v1, v4, v1

    if-lez v1, :cond_1

    monitor-exit v3

    goto :goto_0

    :cond_1
    if-gez v1, :cond_2

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    iget-object v2, v0, Li9/e;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object v1, v0, Li9/e;->n:Ljava/lang/IllegalStateException;

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :cond_2
    invoke-virtual {v0}, Li9/e;->a()V

    monitor-exit v3

    :goto_0
    return-void

    :goto_1
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :pswitch_2
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lg2/s;

    invoke-virtual {v0}, Lg2/s;->b()V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lj43/b;

    invoke-virtual {v0}, Lj43/b;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lg/m;

    invoke-static {v0}, Lg/m;->a(Lg/m;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lg/i;

    iget-object v1, v0, Lg/i;->x:Ljava/lang/Runnable;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    iput-object v4, v0, Lg/i;->x:Ljava/lang/Runnable;

    :cond_3
    return-void

    :pswitch_6
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    :pswitch_7
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Ldb/x;

    invoke-virtual {v0}, Ldb/x;->o()V

    return-void

    :pswitch_8
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Ldb/f;

    invoke-virtual {v0, v3}, Ldb/f;->d(Z)V

    return-void

    :pswitch_9
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Ld9/x;

    iget-wide v3, v0, Ld9/x;->h0:J

    const-wide/32 v6, 0x493e0

    cmp-long v3, v3, v6

    if-ltz v3, :cond_4

    iget-object v3, v0, Ld9/x;->r:Lro/i;

    iget-object v3, v3, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Ld9/a0;

    iput-boolean v5, v3, Ld9/a0;->o1:Z

    iput-wide v1, v0, Ld9/x;->h0:J

    :cond_4
    return-void

    :pswitch_a
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_b
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/view/ProfileScreenEventRouter;

    invoke-static {v0}, Lcom/whoop/profile/view/ProfileScreenEventRouter;->a(Lcom/whoop/profile/view/ProfileScreenEventRouter;)V

    return-void

    :pswitch_c
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/NativeMapImpl;

    invoke-static {v0}, Lcom/mapbox/maps/NativeMapImpl;->a(Lcom/mapbox/maps/NativeMapImpl;)V

    return-void

    :pswitch_d
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;

    invoke-static {v0}, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->a(Lcom/mapbox/common/module/cronet/CronetRequestDetail;)V

    return-void

    :pswitch_e
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/v0;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/v0;->G()V

    return-void

    :pswitch_f
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Laa3/i1;

    iget-object v1, v0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    :try_start_5
    new-instance v2, Lab/h0;

    invoke-direct {v2, v1}, Lab/h0;-><init>(Landroid/content/Context;)V

    invoke-static {v5}, Le4/p;->e(I)I

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, v2, Lab/h0;->z:Ljava/lang/Object;

    check-cast v3, Landroid/security/keystore/KeyGenParameterSpec;

    if-nez v3, :cond_5

    iput v5, v2, Lab/h0;->x:I

    invoke-virtual {v2}, Lab/h0;->h()Ldb/j0;

    move-result-object v2

    invoke-static {v1, v2}, Lsb/b;->a(Landroid/content/Context;Ldb/j0;)Lsb/b;

    move-result-object v1

    goto :goto_2

    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "KeyScheme set after setting a KeyGenParamSpec"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "AES256_GCM"

    const-string v3, "Unsupported scheme: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-object v1, v4

    :goto_2
    if-nez v1, :cond_7

    invoke-virtual {v0}, Laa3/i1;->n()V

    new-instance v1, Lcom/iterable/iterableapi/IterableKeychainEncryptedDataMigrator$MigrationException;

    const-string v2, "Failed to load EncryptedSharedPreferences"

    invoke-direct {v1, v2, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v0, La0/a1;

    if-eqz v0, :cond_b

    invoke-virtual {v0, v1}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_6

    :cond_7
    const-string v2, "iterable-auth-token"

    const-string v3, "iterable-user-id"

    iget-object v5, v0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v5, Lcom/iterable/iterableapi/o1;

    const-string v6, "IterableKeychainMigrator"

    invoke-virtual {v1}, Lsb/b;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    const-string v8, "iterable-email"

    invoke-virtual {v1, v8, v4}, Lsb/b;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_8

    invoke-virtual {v5, v8, v9}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v7

    check-cast v10, Lsb/a;

    invoke-virtual {v10, v8}, Lsb/a;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v8, "Email migrated: "

    invoke-virtual {v8, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    const-string v8, "No email found to migrate."

    invoke-static {v6, v8}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v1, v3, v4}, Lsb/b;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v5, v3, v8}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    move-object v9, v7

    check-cast v9, Lsb/a;

    invoke-virtual {v9, v3}, Lsb/a;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v3, "User ID migrated: "

    invoke-virtual {v3, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    const-string v3, "No user ID found to migrate."

    invoke-static {v6, v3}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    invoke-virtual {v1, v2, v4}, Lsb/b;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v5, v2, v1}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v7

    check-cast v3, Lsb/a;

    invoke-virtual {v3, v2}, Lsb/a;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v2, "Auth token migrated: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    const-string v1, "No auth token found to migrate."

    invoke-static {v6, v1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    check-cast v7, Lsb/a;

    invoke-virtual {v7}, Lsb/a;->apply()V

    invoke-virtual {v0}, Laa3/i1;->n()V

    iget-object v0, v0, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v0, La0/a1;

    if-eqz v0, :cond_b

    invoke-virtual {v0, v4}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    :goto_6
    return-void

    :pswitch_10
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/timepicker/e;

    invoke-virtual {v0}, Lcom/google/android/material/timepicker/e;->f()V

    return-void

    :pswitch_11
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lc9/h;

    invoke-virtual {v0}, Lc9/h;->g()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x404

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    iget-object v0, v0, Lc9/h;->F:Lx8/i;

    invoke-virtual {v0}, Lx8/i;->d()V

    return-void

    :pswitch_12
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lc8/b;

    :try_start_6
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v2, 0x64

    if-eq v1, v2, :cond_c

    const/16 v2, 0x7d

    if-eq v1, v2, :cond_c

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_d

    :cond_c
    move v3, v5

    :cond_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1

    :try_start_7
    const-string v2, "androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback"

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, v0, Lc8/b;->f:Landroid/os/IBinder;

    invoke-interface {v0, v5, v1, v4, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    goto :goto_7

    :catchall_2
    move-exception v0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    throw v0
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1

    :catch_1
    move-exception v0

    const-string v1, "a"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "HealthDataSdkService#getIsInForeground failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_7
    return-void

    :pswitch_13
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lb9/f1;

    :try_start_9
    monitor-enter v0

    monitor-exit v0
    :try_end_9
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_9 .. :try_end_9} :catch_2

    :try_start_a
    iget-object v1, v0, Lb9/f1;->a:Lb9/e1;

    iget v2, v0, Lb9/f1;->c:I

    iget-object v3, v0, Lb9/f1;->d:Ljava/lang/Object;

    invoke-interface {v1, v2, v3}, Lb9/e1;->a(ILjava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :try_start_b
    invoke-virtual {v0, v5}, Lb9/f1;->a(Z)V

    return-void

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v5}, Lb9/f1;->a(Z)V

    throw v1
    :try_end_b
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_b .. :try_end_b} :catch_2

    :catch_2
    move-exception v0

    const-string v1, "ExoPlayerImplInternal"

    const-string v2, "Unexpected error delivering message on external thread."

    invoke-static {v1, v2, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :pswitch_14
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lb9/f0;

    iget-object v1, v0, Lb9/f0;->g0:Lb30/m;

    iget-object v0, v0, Lb9/f0;->F:Landroid/content/Context;

    sget v2, Lx8/t;->a:I

    invoke-static {v0}, Lv8/b;->r(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioManager;->generateAudioSessionId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lb30/m;->F:Ljava/lang/Object;

    iget-object v2, v1, Lb30/m;->y:Ljava/lang/Object;

    check-cast v2, Lx8/r;

    new-instance v3, Lr5/b;

    const/16 v4, 0x12

    invoke-direct {v3, v4, v1, v0}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_15
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lb9/a;

    iget-object v1, v0, Lb9/a;->d:Ljava/lang/Object;

    check-cast v1, Lb9/b;

    iget-boolean v1, v1, Lb9/b;->x:Z

    if-eqz v1, :cond_e

    iget-object v0, v0, Lb9/a;->b:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, v3}, Lb9/f0;->I0(IZ)V

    :cond_e
    return-void

    :pswitch_16
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lb9/b;

    iget-object v1, v0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v0, v0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v0, Lb9/a;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void

    :pswitch_17
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lm5/k;

    sget-object v1, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    const-string v1, "AndroidOwner:outOfFrameExecutor"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_c
    invoke-virtual {v0}, Lm5/k;->invoke()Ljava/lang/Object;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_4
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :pswitch_18
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lev/i;

    :cond_f
    iget-object v1, v0, Lev/i;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, v0, Lev/i;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v6

    if-eqz v6, :cond_12

    move v6, v3

    move-object v7, v4

    :goto_8
    :try_start_d
    invoke-virtual {v2, v5, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-virtual {v0}, Lev/i;->b()Lib/n;

    move-result-object v7

    move v6, v5

    goto :goto_8

    :catchall_5
    move-exception v0

    goto :goto_9

    :cond_10
    if-eqz v6, :cond_11

    iget-object v8, v0, Lev/i;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/lifecycle/h;

    invoke-virtual {v8, v7}, Landroidx/lifecycle/p0;->postValue(Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :cond_11
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_a

    :goto_9
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v0

    :cond_12
    move v6, v3

    :goto_a
    if-eqz v6, :cond_13

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_f

    :cond_13
    return-void

    :pswitch_19
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v0, v0, Landroidx/fragment/app/o1;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhb/i;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_b

    :cond_14
    return-void

    :pswitch_1a
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    const/4 v1, 0x2

    invoke-static {v1}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    if-eqz v1, :cond_15

    const-string v1, "FragmentManager"

    const-string v2, "Transition for all operations has completed"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    iget-object v1, v0, Landroidx/fragment/app/q;->c:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/r;

    iget-object v2, v2, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    invoke-virtual {v2, v0}, Landroidx/fragment/app/p2;->c(Landroidx/fragment/app/o2;)V

    goto :goto_c

    :cond_16
    return-void

    :pswitch_1b
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Landroidx/fragment/app/d2;->d(Ljava/util/ArrayList;I)V

    return-void

    :pswitch_1c
    iget-object v0, p0, Landroidx/fragment/app/m;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    const-string v1, "$seekCancelLambda"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_17

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_17
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
