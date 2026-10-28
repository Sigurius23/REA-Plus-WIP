.class public final Loc/f;
.super Leb/o0;
.source "SourceFile"


# instance fields
.field public final f:Landroid/net/ConnectivityManager;

.field public final g:Ljava/lang/Object;

.field public volatile h:Z

.field public final i:Lio/sentry/android/core/internal/util/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lsc/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Leb/o0;-><init>(Landroid/content/Context;Lsc/b;)V

    iget-object p1, p0, Leb/o0;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    const-string p2, "connectivity"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Loc/f;->f:Landroid/net/ConnectivityManager;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loc/f;->g:Ljava/lang/Object;

    new-instance p1, Lio/sentry/android/core/internal/util/b;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lio/sentry/android/core/internal/util/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Loc/f;->i:Lio/sentry/android/core/internal/util/b;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Loc/f;->f:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Loc/f;->h:Z

    invoke-static {v0, v1}, Loc/g;->a(Landroid/net/NetworkCapabilities;Z)Lmc/e;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Loc/f;->f:Landroid/net/ConnectivityManager;

    iget-boolean v7, p0, Loc/f;->h:Z

    sget-object v8, Loc/g;->a:Ljava/lang/String;

    const-string v0, "connectivityManager"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    move v5, v3

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_5

    :cond_1
    move v5, v3

    move v3, v4

    :goto_0
    :try_start_1
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    if-eqz v0, :cond_2

    const/16 v6, 0x10

    invoke-virtual {v0, v6}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v4

    goto :goto_3

    :goto_2
    :try_start_2
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v6

    const-string v9, "Unable to validate active network"

    invoke-virtual {v6, v8, v9, v0}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :goto_3
    invoke-static {v1}, Lse/g;->E(Landroid/net/ConnectivityManager;)Z

    move-result v1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isRoaming()Z

    move-result v2

    if-nez v2, :cond_3

    move v6, v5

    goto :goto_4

    :cond_3
    move v6, v4

    :goto_4
    new-instance v2, Lmc/e;

    move v4, v0

    move v5, v1

    invoke-direct/range {v2 .. v7}, Lmc/e;-><init>(ZZZZZ)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_6

    :goto_5
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    const-string v2, "Unable to get active network state"

    invoke-virtual {v1, v8, v2, v0}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v2, Lmc/e;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lmc/e;-><init>(ZZZZZ)V

    :goto_6
    return-object v2
.end method

.method public final e()V
    .locals 4

    const-string v0, "Received exception while registering network callback"

    :try_start_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    sget-object v2, Loc/g;->a:Ljava/lang/String;

    const-string v3, "Registering network callback"

    invoke-virtual {v1, v2, v3}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Loc/f;->f:Landroid/net/ConnectivityManager;

    iget-object v2, p0, Loc/f;->i:Lio/sentry/android/core/internal/util/b;

    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "networkCallback"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :goto_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    sget-object v3, Loc/g;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v0, v1}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    sget-object v3, Loc/g;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v0, v1}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public final f()V
    .locals 4

    const-string v0, "Received exception while unregistering network callback"

    :try_start_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    sget-object v2, Loc/g;->a:Ljava/lang/String;

    const-string v3, "Unregistering network callback"

    invoke-virtual {v1, v2, v3}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Loc/f;->f:Landroid/net/ConnectivityManager;

    iget-object v2, p0, Loc/f;->i:Lio/sentry/android/core/internal/util/b;

    invoke-virtual {v1, v2}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :goto_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    sget-object v3, Loc/g;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v0, v1}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    sget-object v3, Loc/g;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v0, v1}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
