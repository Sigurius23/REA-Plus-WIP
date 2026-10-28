.class public final synthetic Lzt/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/google/firebase/messaging/FirebaseMessaging;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/FirebaseMessaging;I)V
    .locals 0

    iput p2, p0, Lzt/k;->w:I

    iput-object p1, p0, Lzt/k;->x:Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget v0, p0, Lzt/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzt/k;->x:Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v1, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    invoke-static {v1}, Le3/b;->c(Landroid/content/Context;)V

    iget-object v2, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lcom/google/crypto/tink/internal/k0;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->h()Z

    move-result v3

    const-string v4, "proxy_retention"

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1d

    if-lt v5, v6, :cond_2

    invoke-static {v1}, Lvb/g;->c(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x0

    invoke-interface {v5, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    if-ne v5, v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, v2, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v2, Lso/b;

    iget-object v5, v2, Lso/b;->c:Lce3/a0;

    invoke-virtual {v5}, Lce3/a0;->b()I

    move-result v5

    const v6, 0xe5ee4e0

    if-lt v5, v6, :cond_1

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v5, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v2, v2, Lso/b;->b:Landroid/content/Context;

    invoke-static {v2}, Lso/o;->b(Landroid/content/Context;)Lso/o;

    move-result-object v2

    new-instance v4, Lso/n;

    monitor-enter v2

    :try_start_0
    iget v6, v2, Lso/o;->a:I

    add-int/lit8 v7, v6, 0x1

    iput v7, v2, Lso/o;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    const/4 v7, 0x0

    const/4 v8, 0x4

    invoke-direct {v4, v6, v8, v5, v7}, Lso/n;-><init>(IILandroid/os/Bundle;I)V

    invoke-virtual {v2, v4}, Lso/o;->c(Lso/n;)Lcq/u;

    move-result-object v2

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    new-instance v2, Ljava/io/IOException;

    const-string v4, "SERVICE_NOT_AVAILABLE"

    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->c(Ljava/lang/Exception;)Lcq/u;

    move-result-object v2

    :goto_0
    new-instance v4, Landroidx/profileinstaller/b;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Landroidx/profileinstaller/b;-><init>(I)V

    new-instance v5, Lzt/o;

    invoke-direct {v5, v1, v3}, Lzt/o;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v2, v4, v5}, Lcq/u;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;

    :cond_2
    :goto_1
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->g()V

    :cond_3
    return-void

    :pswitch_0
    iget-object v0, p0, Lzt/k;->x:Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v1, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Leh/a;

    invoke-virtual {v1}, Leh/a;->c()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->f()Lzt/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->j(Lzt/r;)Z

    move-result v1

    if-eqz v1, :cond_5

    monitor-enter v0

    :try_start_2
    iget-boolean v1, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->i:Z

    if-nez v1, :cond_4

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/messaging/FirebaseMessaging;->i(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_4
    :goto_2
    monitor-exit v0

    goto :goto_4

    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    :cond_5
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
