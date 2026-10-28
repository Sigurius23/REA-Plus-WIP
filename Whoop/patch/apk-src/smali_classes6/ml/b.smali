.class public final Lml/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lml/a;


# instance fields
.field public final E:Ld9/e;

.field public final w:Landroid/content/Context;

.field public final x:Lio/sentry/internal/debugmeta/c;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/internal/debugmeta/c;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld9/e;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Ld9/e;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lml/b;->E:Ld9/e;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lml/b;->w:Landroid/content/Context;

    iput-object p2, p0, Lml/b;->x:Lio/sentry/internal/debugmeta/c;

    return-void
.end method

.method public static i(Landroid/content/Context;)Z
    .locals 2

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    const-string v0, "Argument must not be null"

    invoke-static {p0, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :catch_0
    move-exception p0

    const/4 v0, 0x5

    const-string v1, "ConnectivityMonitor"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Failed to determine connectivity status when connectivity changed"

    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final onDestroy()V
    .locals 0

    return-void
.end method

.method public final onStart()V
    .locals 4

    iget-boolean v0, p0, Lml/b;->z:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lml/b;->w:Landroid/content/Context;

    invoke-static {v0}, Lml/b;->i(Landroid/content/Context;)Z

    move-result v1

    iput-boolean v1, p0, Lml/b;->y:Z

    :try_start_0
    iget-object v1, p0, Lml/b;->E:Ld9/e;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lml/b;->z:Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x5

    const-string v2, "ConnectivityMonitor"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Failed to register"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public final onStop()V
    .locals 2

    iget-boolean v0, p0, Lml/b;->z:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lml/b;->w:Landroid/content/Context;

    iget-object v1, p0, Lml/b;->E:Ld9/e;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lml/b;->z:Z

    return-void
.end method
