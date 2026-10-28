.class public final Lio/getstream/chat/android/client/network/NetworkStateProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001%\u0008\u0000\u0018\u00002\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u0008*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u0008*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010(R\u001c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010$R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/client/network/NetworkStateProvider;",
        "",
        "Lbc3/c0;",
        "scope",
        "Landroid/net/ConnectivityManager;",
        "connectivityManager",
        "<init>",
        "(Lbc3/c0;Landroid/net/ConnectivityManager;)V",
        "Ll83/a0;",
        "notifyListenersIfNetworkStateChanged",
        "()V",
        "",
        "Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;",
        "onConnected",
        "(Ljava/util/Set;)V",
        "onDisconnected",
        "",
        "isConnected",
        "()Z",
        "listener",
        "subscribe",
        "(Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;)V",
        "unsubscribe",
        "Lbc3/c0;",
        "Landroid/net/ConnectivityManager;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "lock",
        "Ljava/lang/Object;",
        "",
        "Landroid/net/Network;",
        "availableNetworks",
        "Ljava/util/Set;",
        "io/getstream/chat/android/client/network/NetworkStateProvider$callback$1",
        "callback",
        "Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;",
        "Z",
        "listeners",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isRegistered",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "NetworkStateListener",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final availableNetworks:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/net/Network;",
            ">;"
        }
    .end annotation
.end field

.field private final callback:Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;

.field private final connectivityManager:Landroid/net/ConnectivityManager;

.field private volatile isConnected:Z

.field private final isRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private volatile listeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;",
            ">;"
        }
    .end annotation
.end field

.field private final lock:Ljava/lang/Object;

.field private final logger$delegate:Ll83/h;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Landroid/net/ConnectivityManager;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    const-string p1, "Chat:NetworkStateProvider"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->logger$delegate:Ll83/h;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->lock:Ljava/lang/Object;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->availableNetworks:Ljava/util/Set;

    new-instance p1, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;-><init>(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->callback:Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected()Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected:Z

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->listeners:Ljava/util/Set;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static final synthetic access$getAvailableNetworks$p(Lio/getstream/chat/android/client/network/NetworkStateProvider;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->availableNetworks:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic access$getListeners$p(Lio/getstream/chat/android/client/network/NetworkStateProvider;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->listeners:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic access$notifyListenersIfNetworkStateChanged(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->notifyListenersIfNetworkStateChanged()V

    return-void
.end method

.method public static final synthetic access$onDisconnected(Lio/getstream/chat/android/client/network/NetworkStateProvider;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->onDisconnected(Ljava/util/Set;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final notifyListenersIfNetworkStateChanged()V
    .locals 4

    invoke-virtual {p0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected()Z

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected:Z

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Network connected."

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected:Z

    iget-object v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->listeners:Ljava/util/Set;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->onConnected(Ljava/util/Set;)V

    return-void

    :cond_1
    iget-boolean v1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected:Z

    if-eqz v1, :cond_3

    if-nez v0, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Network disconnected."

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected:Z

    iget-object v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->listeners:Ljava/util/Set;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->onDisconnected(Ljava/util/Set;)V

    :cond_3
    return-void
.end method

.method private final onConnected(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/network/NetworkStateProvider$onConnected$1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/client/network/NetworkStateProvider$onConnected$1;-><init>(Ljava/util/Set;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final onDisconnected(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/network/NetworkStateProvider$onDisconnected$1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/client/network/NetworkStateProvider$onDisconnected$1;-><init>(Ljava/util/Set;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final isConnected()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v2

    if-eqz v2, :cond_1

    const/16 v3, 0xc

    invoke-virtual {v2, v3}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x10

    invoke-virtual {v2, v3}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_1

    :cond_0
    move v2, v1

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_1
    move-object v2, v0

    goto :goto_2

    :goto_1
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_2
    instance-of v3, v2, Ll83/m;

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    move-object v0, v2

    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_3
    return v1
.end method

.method public final subscribe(Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;)V
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->listeners:Ljava/util/Set;

    invoke-static {p1, v1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->listeners:Ljava/util/Set;

    iget-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    new-instance v1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->callback:Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;

    invoke-virtual {p1, v1, v2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final unsubscribe(Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;)V
    .locals 4

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->listeners:Ljava/util/Set;

    invoke-static {p1, v1}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    iget-object v2, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->callback:Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;

    invoke-virtual {v1, v2}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider;->listeners:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
