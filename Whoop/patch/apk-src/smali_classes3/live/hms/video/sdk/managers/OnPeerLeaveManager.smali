.class public final Llive/hms/video/sdk/managers/OnPeerLeaveManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/managers/OnPeerLeaveManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/OnPeerLeaveManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;",
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
        "removeFromStoreAndSendUpdates",
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
.field public static final Companion:Llive/hms/video/sdk/managers/OnPeerLeaveManager$Companion;

.field private static final TAG:Ljava/lang/String; = "OnPeerLeaveManager"


# instance fields
.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/sdk/managers/OnPeerLeaveManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/sdk/managers/OnPeerLeaveManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->Companion:Llive/hms/video/sdk/managers/OnPeerLeaveManager$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method


# virtual methods
.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->getPeerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v0

    .line 3
    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->removeFromStoreAndSendUpdates(Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;)Ljava/util/List;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type java.util.ArrayList<live.hms.video.sdk.models.SDKUpdate>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-static {v1, v2}, Llive/hms/video/sdk/managers/PeerCountUpdateUseCaseKt;->updatePeerCount(ZLlive/hms/video/sdk/SDKStore;)Llive/hms/video/sdk/models/SDKUpdate$Room;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v1, Llive/hms/video/sdk/models/SDKUpdate$Peer;

    sget-object v2, Llive/hms/video/sdk/models/enums/HMSPeerUpdate;->PEER_LEFT:Llive/hms/video/sdk/models/enums/HMSPeerUpdate;

    invoke-direct {v1, v2, v0}, Llive/hms/video/sdk/models/SDKUpdate$Peer;-><init>(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p1
.end method

.method public final removeFromStoreAndSendUpdates(Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->getPeerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v1

    if-eqz v1, :cond_3

    move-object p1, v1

    check-cast p1, Llive/hms/video/sdk/models/HMSRemotePeer;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRemotePeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Llive/hms/video/sdk/models/SDKUpdate$Track;

    sget-object v4, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_REMOVED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    invoke-direct {v3, v4, v2, v1}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3, v2}, Llive/hms/video/sdk/SDKStore;->remove(Llive/hms/video/media/tracks/HMSTrack;)Z

    :cond_0
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRemotePeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Llive/hms/video/sdk/models/SDKUpdate$Track;

    sget-object v4, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_REMOVED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    invoke-direct {v3, v4, v2, v1}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3, v2}, Llive/hms/video/sdk/SDKStore;->remove(Llive/hms/video/media/tracks/HMSTrack;)Z

    :cond_1
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getAuxiliaryTracks()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/media/tracks/HMSTrack;

    new-instance v4, Llive/hms/video/sdk/models/SDKUpdate$Track;

    sget-object v5, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_REMOVED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    invoke-direct {v4, v5, v3, v1}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v4

    invoke-virtual {v4, v3}, Llive/hms/video/sdk/SDKStore;->remove(Llive/hms/video/media/tracks/HMSTrack;)Z

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Llive/hms/video/sdk/models/HMSRemotePeer;->setAudioTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;)V

    invoke-virtual {p1, v2}, Llive/hms/video/sdk/models/HMSRemotePeer;->setVideoTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)V

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getAuxiliaryTracks()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    new-instance p1, Llive/hms/video/sdk/models/SDKUpdate$PeerListUpdate;

    filled-new-array {v1}, [Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {p1, v2, v3}, Llive/hms/video/sdk/models/SDKUpdate$PeerListUpdate;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object p1

    invoke-virtual {p1, v1}, Llive/hms/video/sdk/SDKStore;->remove(Llive/hms/video/sdk/models/HMSPeer;)Z

    return-object v0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Received "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for non-existent peer, store="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnPeerLeaveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "OnPeerLeaveManager"

    invoke-static {v1, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
