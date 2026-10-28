.class public final Lck/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkk/e;


# instance fields
.field public w:Lch3/h;


# virtual methods
.method public final b(Lgj/d;)V
    .locals 7

    iget-object v0, p1, Lgj/d;->k:Lfk/a;

    const-string v1, "Installing AndroidNetworkConnectivityPlugin, offline feature should be supported."

    invoke-interface {v0, v1}, Lfk/a;->debug(Ljava/lang/String;)V

    new-instance v1, Lch3/h;

    iget-object v2, p1, Lgj/d;->a:Lgj/g;

    iget-object v2, v2, Lgj/g;->b:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Lch3/h;-><init>(Landroid/content/Context;Lfk/a;)V

    iput-object v1, p0, Lck/f;->w:Lch3/h;

    iget-object v1, p1, Lgj/d;->c:Lbc3/c0;

    iget-object v3, p1, Lgj/d;->f:Lbc3/z;

    new-instance v4, La6/q;

    const/4 v5, 0x5

    const/4 v6, 0x0

    invoke-direct {v4, p1, p0, v6, v5}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v5, 0x2

    invoke-static {v1, v3, v6, v4, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lad3/z;

    const/4 v3, 0x5

    invoke-direct {v1, p1, v3}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {p1, v2, v0, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(Landroid/content/Context;Lfk/a;Lad3/z;)V

    :try_start_0
    const-string v0, "connectivity"

    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/net/ConnectivityManager;

    new-instance v1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v1

    new-instance v2, Lek/c;

    invoke-direct {v2, v0, p1}, Lek/c;-><init>(Landroid/net/ConnectivityManager;Lcom/google/crypto/tink/internal/l0;)V

    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Lfk/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error starting network listener: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lfk/a;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public final getType()Lkk/d;
    .locals 1

    sget-object v0, Lkk/d;->w:Lkk/d;

    return-object v0
.end method
