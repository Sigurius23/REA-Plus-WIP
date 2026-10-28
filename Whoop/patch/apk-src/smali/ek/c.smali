.class public final Lek/c;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# instance fields
.field public a:Leb/k;

.field public final synthetic b:Landroid/net/ConnectivityManager;

.field public final synthetic c:Lcom/google/crypto/tink/internal/l0;


# direct methods
.method public constructor <init>(Landroid/net/ConnectivityManager;Lcom/google/crypto/tink/internal/l0;)V
    .locals 0

    iput-object p1, p0, Lek/c;->b:Landroid/net/ConnectivityManager;

    iput-object p2, p0, Lek/c;->c:Lcom/google/crypto/tink/internal/l0;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 6

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lek/c;->b:Landroid/net/ConnectivityManager;

    invoke-virtual {v0, p1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    new-instance v1, Leb/k;

    iget-object v2, p0, Lek/c;->c:Lcom/google/crypto/tink/internal/l0;

    iget-object v2, v2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v2, Lad3/z;

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    const/16 v4, 0x10

    invoke-virtual {v0, v4}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v4

    const/16 v5, 0xc

    invoke-virtual {v0, v5}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p1, v1, Leb/k;->c:Ljava/lang/Object;

    iput-object v2, v1, Leb/k;->d:Ljava/lang/Object;

    iput-boolean v3, v1, Leb/k;->a:Z

    const/4 p1, 0x0

    iput-boolean p1, v1, Leb/k;->b:Z

    if-eqz v3, :cond_2

    iget-object p1, v2, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Lgj/d;

    iget-object v0, p1, Lgj/d;->k:Lfk/a;

    const-string v2, "AndroidNetworkListener, onNetworkAvailable."

    invoke-interface {v0, v2}, Lfk/a;->debug(Ljava/lang/String;)V

    iget-object v0, p1, Lgj/d;->a:Lgj/g;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v2, v0, Lgj/g;->p:Ljava/lang/Boolean;

    iget-object v0, p1, Lgj/d;->c:Lbc3/c0;

    iget-object v2, p1, Lgj/d;->d:Lbc3/z;

    new-instance v3, Landroidx/room/z1;

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-direct {v3, p1, v5, v4}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    invoke-static {v0, v2, v5, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lad3/z;->q()V

    :goto_1
    iput-object v1, p0, Lek/c;->a:Leb/k;

    return-void
.end method

.method public final onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 3

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lek/c;->a:Leb/k;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, p2, v2}, Leb/k;->h(Leb/k;Landroid/net/Network;ZZI)V

    :cond_0
    return-void
.end method

.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 3

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkCapabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lek/c;->a:Leb/k;

    if-eqz v0, :cond_1

    const/16 v1, 0x10

    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {p2, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    if-eqz v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, v2

    :goto_0
    const/4 v1, 0x4

    invoke-static {v0, p1, p2, v2, v1}, Leb/k;->h(Leb/k;Landroid/net/Network;ZZI)V

    :cond_1
    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 3

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lek/c;->a:Leb/k;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v2, v1}, Leb/k;->h(Leb/k;Landroid/net/Network;ZZI)V

    :cond_0
    return-void
.end method

.method public final onUnavailable()V
    .locals 1

    iget-object v0, p0, Lek/c;->c:Lcom/google/crypto/tink/internal/l0;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lad3/z;

    invoke-virtual {v0}, Lad3/z;->q()V

    return-void
.end method
