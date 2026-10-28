.class public final Llive/hms/video/sdk/managers/OnPeerJoinManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/OnPeerJoinManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;",
        "store",
        "Llive/hms/video/sdk/SDKStore;",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;)V",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
        "manage",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "params",
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


# instance fields
.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/OnPeerJoinManager;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method


# virtual methods
.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/OnPeerJoinManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/OnPeerJoinManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerJoinManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKStore;->add(Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;)Llive/hms/video/sdk/models/HMSRemotePeer;

    move-result-object p1

    .line 3
    new-instance v0, Llive/hms/video/sdk/models/SDKUpdate$Peer;

    sget-object v1, Llive/hms/video/sdk/models/enums/HMSPeerUpdate;->PEER_JOINED:Llive/hms/video/sdk/models/enums/HMSPeerUpdate;

    invoke-direct {v0, v1, p1}, Llive/hms/video/sdk/models/SDKUpdate$Peer;-><init>(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V

    .line 4
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerJoinManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2, v1}, Llive/hms/video/sdk/managers/PeerCountUpdateUseCaseKt;->updatePeerCount(ZLlive/hms/video/sdk/SDKStore;)Llive/hms/video/sdk/models/SDKUpdate$Room;

    move-result-object v1

    .line 5
    new-instance v3, Llive/hms/video/sdk/models/SDKUpdate$PeerListUpdate;

    new-array v4, v2, [Llive/hms/video/sdk/models/HMSPeer;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-static {v4}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Llive/hms/video/sdk/models/SDKUpdate$PeerListUpdate;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    const/4 p1, 0x3

    new-array p1, p1, [Llive/hms/video/sdk/models/SDKUpdate;

    aput-object v0, p1, v5

    aput-object v1, p1, v2

    const/4 v0, 0x2

    aput-object v3, p1, v0

    .line 6
    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
