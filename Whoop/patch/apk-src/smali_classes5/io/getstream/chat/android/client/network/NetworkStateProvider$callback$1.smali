.class public final Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/network/NetworkStateProvider;-><init>(Lbc3/c0;Landroid/net/ConnectivityManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "io/getstream/chat/android/client/network/NetworkStateProvider$callback$1",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "Landroid/net/Network;",
        "network",
        "Ll83/a0;",
        "onAvailable",
        "(Landroid/net/Network;)V",
        "Landroid/net/NetworkCapabilities;",
        "networkCapabilities",
        "onCapabilitiesChanged",
        "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V",
        "onLost",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/network/NetworkStateProvider;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;->this$0:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;->this$0:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-static {v0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->access$getAvailableNetworks$p(Lio/getstream/chat/android/client/network/NetworkStateProvider;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;->this$0:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-static {p1}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->access$notifyListenersIfNetworkStateChanged(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V

    return-void
.end method

.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "networkCapabilities"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;->this$0:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-static {p1}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->access$notifyListenersIfNetworkStateChanged(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V

    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;->this$0:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-static {v0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->access$getAvailableNetworks$p(Lio/getstream/chat/android/client/network/NetworkStateProvider;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;->this$0:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-static {p1}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->access$notifyListenersIfNetworkStateChanged(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;->this$0:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-static {p1}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->access$getAvailableNetworks$p(Lio/getstream/chat/android/client/network/NetworkStateProvider;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;->this$0:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-static {p1}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->access$getListeners$p(Lio/getstream/chat/android/client/network/NetworkStateProvider;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->access$onDisconnected(Lio/getstream/chat/android/client/network/NetworkStateProvider;Ljava/util/Set;)V

    :cond_0
    return-void
.end method
