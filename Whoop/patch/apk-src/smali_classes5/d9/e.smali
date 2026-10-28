.class public final Ld9/e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld9/e;->a:I

    iput-object p1, p0, Ld9/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public constructor <init>(Lzt/s;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Ld9/e;->a:I

    .line 2
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 3
    iput-object p1, p0, Ld9/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x3

    const-string v1, "FirebaseMessaging"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Connectivity change received registered"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast v1, Lzt/s;

    iget-object v1, v1, Lzt/s;->y:Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v1, v1, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    invoke-virtual {v1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    iget v0, p0, Ld9/e;->a:I

    packed-switch v0, :pswitch_data_0

    const-string p1, "FirebaseMessaging"

    iget-object p2, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p2, Lzt/s;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lzt/s;->a()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x3

    invoke-static {p1, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "Connectivity changed. Starting background sync."

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object p1, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p1, Lzt/s;

    iget-object p2, p1, Lzt/s;->y:Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->b(Ljava/lang/Runnable;J)V

    iget-object p1, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p1, Lzt/s;

    iget-object p1, p1, Lzt/s;->y:Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object p1, p1, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ld9/e;->b:Ljava/lang/Object;

    :goto_0
    return-void

    :pswitch_0
    iget-object p2, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p2, Lx8/m;

    iget-object p2, p2, Lx8/m;->c:Ljava/lang/Object;

    check-cast p2, Ljava/util/concurrent/Executor;

    new-instance v0, Lr5/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1, p0, p1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p1, Lrm/j1;

    iget-object p2, p1, Lrm/j1;->e:Ljava/lang/Object;

    check-cast p2, Landroid/os/Handler;

    new-instance v0, Llr/e;

    const/16 v1, 0x10

    invoke-direct {v0, p1, v1}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_2
    iget-object p2, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p2, Lml/b;

    iget-boolean v0, p2, Lml/b;->y:Z

    invoke-static {p1}, Lml/b;->i(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p2, Lml/b;->y:Z

    iget-object p1, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p1, Lml/b;

    iget-boolean p1, p1, Lml/b;->y:Z

    if-eq v0, p1, :cond_5

    const-string p1, "ConnectivityMonitor"

    const/4 p2, 0x3

    invoke-static {p1, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "ConnectivityMonitor"

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "connectivity changed, isConnected: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast v0, Lml/b;

    iget-boolean v0, v0, Lml/b;->y:Z

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iget-object p1, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p1, Lml/b;

    iget-object p2, p1, Lml/b;->x:Lio/sentry/internal/debugmeta/c;

    iget-boolean p1, p1, Lml/b;->y:Z

    if-eqz p1, :cond_4

    iget-object p1, p2, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast p1, Lcom/bumptech/glide/h;

    monitor-enter p1

    :try_start_0
    iget-object p2, p2, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast p2, Lf1/p1;

    invoke-virtual {p2}, Lf1/p1;->s()V

    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    :goto_1
    return-void

    :pswitch_3
    iget-object p1, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p1, Lb3/b;

    invoke-virtual {p1}, Lb3/b;->B()V

    return-void

    :pswitch_4
    iget-object p2, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast p2, Llo/r;

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/16 v1, 0x1d

    const/4 v2, 0x1

    const/4 v3, 0x5

    const/4 v4, 0x0

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    :try_start_1
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v5

    const/16 v6, 0x9

    const/4 v7, 0x6

    const/4 v8, 0x4

    if-eqz v5, :cond_9

    if-eq v5, v2, :cond_b

    if-eq v5, v8, :cond_9

    if-eq v5, v3, :cond_9

    if-eq v5, v7, :cond_c

    if-eq v5, v6, :cond_8

    const/16 v6, 0x8

    goto :goto_4

    :cond_8
    const/4 v6, 0x7

    goto :goto_4

    :cond_9
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    :pswitch_5
    move v6, v7

    goto :goto_4

    :pswitch_6
    sget v0, Llo/y;->a:I

    if-lt v0, v1, :cond_a

    goto :goto_4

    :catch_0
    :cond_a
    :goto_2
    move v6, v4

    goto :goto_4

    :cond_b
    :pswitch_7
    const/4 v6, 0x2

    goto :goto_4

    :cond_c
    :pswitch_8
    move v6, v3

    goto :goto_4

    :pswitch_9
    move v6, v8

    goto :goto_4

    :pswitch_a
    const/4 v6, 0x3

    goto :goto_4

    :cond_d
    :goto_3
    move v6, v2

    :goto_4
    sget v0, Llo/y;->a:I

    if-lt v0, v1, :cond_f

    if-ne v6, v3, :cond_f

    :try_start_2
    const-string v1, "phone"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Llo/q;

    invoke-direct {v1, p2}, Llo/q;-><init>(Llo/r;)V

    const/16 v3, 0x1f

    if-ge v0, v3, :cond_e

    invoke-virtual {p1, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    goto :goto_5

    :cond_e
    const/high16 v0, 0x100000

    invoke-virtual {p1, v1, v0}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    :goto_5
    invoke-virtual {p1, v1, v4}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_6

    :catch_1
    :cond_f
    invoke-static {p2, v6}, Llo/r;->a(Llo/r;I)V

    :goto_6
    return-void

    :pswitch_b
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p0, Ld9/e;->b:Ljava/lang/Object;

    check-cast v0, Ld30/h;

    iget-object v1, v0, Ld30/h;->j:Ljava/lang/Object;

    check-cast v1, Lu8/d;

    iget-object v2, v0, Ld30/h;->i:Ljava/lang/Object;

    check-cast v2, Lro/i;

    invoke-static {p1, p2, v1, v2}, Ld9/b;->b(Landroid/content/Context;Landroid/content/Intent;Lu8/d;Lro/i;)Ld9/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld30/h;->b(Ld9/b;)V

    :cond_10
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_9
        :pswitch_9
        :pswitch_5
        :pswitch_9
        :pswitch_7
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
