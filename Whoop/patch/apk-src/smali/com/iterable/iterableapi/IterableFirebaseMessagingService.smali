.class public Lcom/iterable/iterableapi/IterableFirebaseMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    return-void
.end method

.method public static l()Ljava/lang/String;
    .locals 6

    const-string v0, "itblFCMMessagingService"

    :try_start_0
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->c()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lcq/i;

    invoke-direct {v2}, Lcq/i;-><init>()V

    iget-object v3, v1, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v4, Lzt/l;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v2, v5}, Lzt/l;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lcq/i;I)V

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    iget-object v1, v2, Lcq/i;->a:Lcq/u;

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    return-object v1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    const-string v1, "Failed to fetch firebase token"

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static m(Lcom/google/firebase/messaging/FirebaseMessagingService;Lzt/p;)V
    .locals 4

    invoke-virtual {p1}, Lzt/p;->f()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_a

    move-object v1, v0

    check-cast v1, La0/f1;

    iget v1, v1, La0/f1;->y:I

    if-nez v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "itblFCMMessagingService"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Message data payload: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lzt/p;->f()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lzt/p;->h()Ldb/j0;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "itblFCMMessagingService"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Message Notification Body: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lzt/p;->h()Ldb/j0;

    move-result-object p1

    invoke-virtual {p1}, Ldb/j0;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {v0}, Lup/d;->H(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lup/d;->F(Landroid/os/Bundle;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string p0, "itblFCMMessagingService"

    const-string p1, "Not an Iterable push message"

    invoke-static {p0, p1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {p1}, Lup/d;->E(Landroid/os/Bundle;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {p1}, Lup/d;->D(Landroid/os/Bundle;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "itblFCMMessagingService"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Iterable push received "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, p1}, Lup/d;->t(Landroid/content/Context;Landroid/os/Bundle;)Lcom/iterable/iterableapi/s1;

    move-result-object p0

    new-instance p1, Lcom/iterable/iterableapi/w1;

    invoke-direct {p1}, Lcom/iterable/iterableapi/w1;-><init>()V

    filled-new-array {p0}, [Lcom/iterable/iterableapi/s1;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_3

    :cond_3
    const-string p0, "itblFCMMessagingService"

    const-string p1, "Iterable OS notification push received"

    invoke-static {p0, p1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_4
    const-string p0, "itblFCMMessagingService"

    const-string v0, "Iterable ghost silent push received"

    invoke-static {p0, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "notificationType"

    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_a

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "InAppUpdate"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "InAppRemove"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "UpdateEmbedded"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    sget-object p0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {p0}, Lcom/iterable/iterableapi/k;->e()Lcom/iterable/iterableapi/d1;

    move-result-object p0

    invoke-virtual {p0}, Lcom/iterable/iterableapi/d1;->i()V

    goto :goto_3

    :pswitch_1
    const-string p0, "messageId"

    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_a

    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {p1}, Lcom/iterable/iterableapi/k;->e()Lcom/iterable/iterableapi/d1;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/iterable/iterableapi/d1;->y:La3/p;

    invoke-virtual {v0, p0}, La3/p;->y(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;

    move-result-object p0

    if-eqz p0, :cond_8

    iget-object v0, p1, Lcom/iterable/iterableapi/d1;->y:La3/p;

    invoke-virtual {v0, p0}, La3/p;->K(Lcom/iterable/iterableapi/j1;)V

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_8
    :goto_1
    invoke-virtual {p1}, Lcom/iterable/iterableapi/d1;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_3

    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :pswitch_2
    sget-object p0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object p0, p0, Lcom/iterable/iterableapi/k;->m:Lcom/iterable/iterableapi/c0;

    if-eqz p0, :cond_9

    iget-object p0, p0, Lcom/iterable/iterableapi/c0;->w:Lcom/iterable/iterableapi/k;

    iget-object p0, p0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_9
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "IterableApi must be initialized before calling getEmbeddedManager(). Make sure you call IterableApi#initialize() in Application#onCreate"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x26fbaa93 -> :sswitch_2
        0x3b133640 -> :sswitch_1
        0x40c87685 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final h(Lzt/p;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/iterable/iterableapi/IterableFirebaseMessagingService;->m(Lcom/google/firebase/messaging/FirebaseMessagingService;Lzt/p;)V

    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/iterable/iterableapi/IterableFirebaseMessagingService;->l()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "New Firebase Token generated: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "itblFCMMessagingService"

    invoke-static {v0, p1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {p1}, Lcom/iterable/iterableapi/k;->k()V

    return-void
.end method
