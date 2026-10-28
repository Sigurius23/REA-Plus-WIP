.class public final Llive/hms/video/sdk/managers/OnTrackRemoveManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/managers/OnTrackRemoveManager$Companion;,
        Llive/hms/video/sdk/managers/OnTrackRemoveManager$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/media/tracks/HMSTrack;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/OnTrackRemoveManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/media/tracks/HMSTrack;",
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
.field public static final Companion:Llive/hms/video/sdk/managers/OnTrackRemoveManager$Companion;

.field private static final TAG:Ljava/lang/String; = "OnTrackRemoveManager"


# instance fields
.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/sdk/managers/OnTrackRemoveManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/sdk/managers/OnTrackRemoveManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/sdk/managers/OnTrackRemoveManager;->Companion:Llive/hms/video/sdk/managers/OnTrackRemoveManager$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/OnTrackRemoveManager;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method


# virtual methods
.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/OnTrackRemoveManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/media/tracks/HMSTrack;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/OnTrackRemoveManager;->manage(Llive/hms/video/media/tracks/HMSTrack;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/media/tracks/HMSTrack;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/tracks/HMSTrack;",
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
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackRemoveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/sdk/SDKStore;->getTrackMetadata(Ljava/lang/String;)Llive/hms/video/sdk/SDKStore$TrackMetadataPair;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 4
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackRemoveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/SDKStore;->getNativeTrackById(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v2

    const-string v3, "OnTrackRemoveManager"

    if-eqz v2, :cond_0

    .line 5
    check-cast v2, Llive/hms/video/media/tracks/HMSRemoteTrack;

    .line 6
    invoke-interface {v2}, Llive/hms/video/media/tracks/HMSRemoteTrack;->getSsrc()J

    move-result-wide v4

    move-object v6, p1

    check-cast v6, Llive/hms/video/media/tracks/HMSRemoteTrack;

    invoke-interface {v6}, Llive/hms/video/media/tracks/HMSRemoteTrack;->getSsrc()J

    move-result-wide v7

    cmp-long v4, v4, v7

    if-eqz v4, :cond_1

    .line 7
    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "TRACK%% AVOID_SEND_TRACK_REMOVED NEW_SSRC: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Llive/hms/video/media/tracks/HMSRemoteTrack;->getSsrc()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " OLD_SSRC: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v6}, Llive/hms/video/media/tracks/HMSRemoteTrack;->getSsrc()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {p1, v3, v1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 10
    :cond_0
    const-string v2, "TRACK%%Remove trackId not found"

    invoke-static {v3, v2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    :cond_1
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackRemoveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;->getPeerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 12
    move-object v2, v1

    check-cast v2, Llive/hms/video/sdk/models/HMSRemotePeer;

    .line 13
    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getSource()Ljava/lang/String;

    move-result-object v4

    const-string v5, "regular"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 14
    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v4

    sget-object v5, Llive/hms/video/sdk/managers/OnTrackRemoveManager$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v4, v5, :cond_4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_3

    .line 15
    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSRemotePeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_2
    move-object v5, v6

    :goto_0
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 16
    invoke-virtual {v2, v6}, Llive/hms/video/sdk/models/HMSRemotePeer;->setVideoTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)V

    goto :goto_2

    .line 17
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 18
    :cond_4
    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSRemotePeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_5
    move-object v5, v6

    :goto_1
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 19
    invoke-virtual {v2, v6}, Llive/hms/video/sdk/models/HMSRemotePeer;->setAudioTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;)V

    goto :goto_2

    .line 20
    :cond_6
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getAuxiliaryTracks()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 21
    :cond_7
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "TRACK%% SEND_TRACK_REMOVED peer: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ssrc:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, p1

    check-cast v4, Llive/hms/video/media/tracks/HMSRemoteTrack;

    invoke-interface {v4}, Llive/hms/video/media/tracks/HMSRemoteTrack;->getSsrc()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    new-instance v2, Llive/hms/video/sdk/models/SDKUpdate$Track;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_REMOVED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    invoke-direct {v2, v3, p1, v1}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 23
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No peer found "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    :cond_9
    :goto_3
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackRemoveManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {v1, p1}, Llive/hms/video/sdk/SDKStore;->remove(Llive/hms/video/media/tracks/HMSTrack;)Z

    return-object v0
.end method
