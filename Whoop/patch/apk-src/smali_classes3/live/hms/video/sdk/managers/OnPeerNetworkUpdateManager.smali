.class public final Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;)V",
        "params",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "manage",
        "(Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;)Ljava/util/List;",
        "Llive/hms/video/diagnostics/ITransportListener;",
        "listener",
        "Ll83/a0;",
        "setConnectivityCheckListener",
        "(Llive/hms/video/diagnostics/ITransportListener;)V",
        "Llive/hms/video/sdk/SDKStore;",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
        "connectivityTestListener",
        "Llive/hms/video/diagnostics/ITransportListener;",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager$Companion;

.field private static final TAG:Ljava/lang/String; = "OnPeerNetworkUpdateManager"


# instance fields
.field private connectivityTestListener:Llive/hms/video/diagnostics/ITransportListener;

.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;->Companion:Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method


# virtual methods
.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;->getPeerNetworkInfoList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/HMSNotifications$Peer;

    .line 5
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$Peer;->getPeerId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getNullableLocalPeerId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x1

    if-eqz v3, :cond_2

    .line 7
    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 8
    iget-object v3, p0, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;->connectivityTestListener:Llive/hms/video/diagnostics/ITransportListener;

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$Peer;->getDownlinkScore()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    invoke-interface {v3, v5}, Llive/hms/video/diagnostics/ITransportListener;->onNetworkQuality(I)V

    .line 9
    :cond_2
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$Peer;->getDownlinkScore()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSPeer;->getNetworkQuality()Llive/hms/video/connection/stats/quality/HMSNetworkQuality;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Llive/hms/video/connection/stats/quality/HMSNetworkQuality;->getDownlinkQuality()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x1

    xor-int/2addr v3, v5

    if-ne v3, v5, :cond_0

    .line 10
    new-instance v3, Llive/hms/video/connection/stats/quality/HMSNetworkQuality;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$Peer;->getDownlinkScore()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :cond_4
    invoke-direct {v3, v4}, Llive/hms/video/connection/stats/quality/HMSNetworkQuality;-><init>(I)V

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/models/HMSPeer;->setNetworkQuality$lib_release(Llive/hms/video/connection/stats/quality/HMSNetworkQuality;)V

    .line 11
    new-instance v1, Llive/hms/video/sdk/models/SDKUpdate$Peer;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSPeerUpdate;->NETWORK_QUALITY_UPDATED:Llive/hms/video/sdk/models/enums/HMSPeerUpdate;

    invoke-direct {v1, v3, v2}, Llive/hms/video/sdk/models/SDKUpdate$Peer;-><init>(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method public final setConnectivityCheckListener(Llive/hms/video/diagnostics/ITransportListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;->connectivityTestListener:Llive/hms/video/diagnostics/ITransportListener;

    return-void
.end method
