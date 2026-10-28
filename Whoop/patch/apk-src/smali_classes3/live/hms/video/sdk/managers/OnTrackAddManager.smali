.class public final Llive/hms/video/sdk/managers/OnTrackAddManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/managers/OnTrackAddManager$Companion;,
        Llive/hms/video/sdk/managers/OnTrackAddManager$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\t\u0008\u0000\u0018\u0000 $2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J/\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/OnTrackAddManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;)V",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "Llive/hms/video/sdk/models/HMSRemotePeer;",
        "peer",
        "",
        "",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "rolesMap",
        "Ll83/a0;",
        "addSimulcastLayerDefinitionFromPeer",
        "(Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSRemotePeer;Ljava/util/Map;)V",
        "track",
        "applyPeerToTrack",
        "(Llive/hms/video/sdk/models/HMSRemotePeer;Llive/hms/video/media/tracks/HMSTrack;)V",
        "params",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "manage",
        "(Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;)Ljava/util/List;",
        "Llive/hms/video/sdk/models/HMSNotifications$Track;",
        "data",
        "peerId",
        "",
        "manageMetadata",
        "(Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;)[Llive/hms/video/sdk/models/SDKUpdate;",
        "manageNativeTrack",
        "(Llive/hms/video/media/tracks/HMSTrack;)Ljava/util/List;",
        "Llive/hms/video/sdk/SDKStore;",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
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
.field public static final Companion:Llive/hms/video/sdk/managers/OnTrackAddManager$Companion;

.field private static final TAG:Ljava/lang/String; = "OnTrackAddManager"


# instance fields
.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/sdk/managers/OnTrackAddManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/sdk/managers/OnTrackAddManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/sdk/managers/OnTrackAddManager;->Companion:Llive/hms/video/sdk/managers/OnTrackAddManager$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/OnTrackAddManager;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method

.method private final addSimulcastLayerDefinitionFromPeer(Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSRemotePeer;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Llive/hms/video/sdk/models/HMSRemotePeer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Llive/hms/video/sdk/models/HMSPeer;->getHmsRole()Llive/hms/video/sdk/models/role/HMSRole;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/role/HMSRole;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/HMSRole;->getPublishParams()Llive/hms/video/sdk/models/role/PublishParams;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/PublishParams;->getSimulcast()Llive/hms/video/sdk/models/role/Simulcast;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/Simulcast;->getVideo()Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {p2}, Llive/hms/video/sdk/models/HMSPeer;->getHmsRole()Llive/hms/video/sdk/models/role/HMSRole;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Llive/hms/video/sdk/models/role/HMSRole;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Llive/hms/video/sdk/models/role/HMSRole;->getPublishParams()Llive/hms/video/sdk/models/role/PublishParams;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Llive/hms/video/sdk/models/role/PublishParams;->getVideo()Llive/hms/video/sdk/models/role/VideoParams;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v2

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;->getLayers()Ljava/util/ArrayList;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v2

    :goto_2
    if-nez p3, :cond_3

    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_3
    check-cast p3, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p3, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/sdk/models/role/LayerParams;

    new-instance v4, Llive/hms/video/media/settings/HMSSimulcastLayerDefinition;

    new-instance v5, Llive/hms/video/media/settings/HMSVideoResolution;

    const/4 v6, 0x0

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Llive/hms/video/sdk/models/role/VideoParams;->getWidth()I

    move-result v7

    goto :goto_4

    :cond_4
    move v7, v6

    :goto_4
    invoke-virtual {v3}, Llive/hms/video/sdk/models/role/LayerParams;->getScaleResolutionDownBy()Ljava/lang/Float;

    move-result-object v8

    if-nez v8, :cond_5

    move-object v8, v0

    :cond_5
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    div-int/2addr v7, v8

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Llive/hms/video/sdk/models/role/VideoParams;->getHeight()I

    move-result v6

    :cond_6
    invoke-virtual {v3}, Llive/hms/video/sdk/models/role/LayerParams;->getScaleResolutionDownBy()Ljava/lang/Float;

    move-result-object v8

    if-nez v8, :cond_7

    move-object v8, v0

    :cond_7
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    div-int/2addr v6, v8

    invoke-direct {v5, v7, v6}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    invoke-static {v3}, Llive/hms/video/sdk/managers/OnTrackAddManager;->addSimulcastLayerDefinitionFromPeer$ridToHMSLayerMapper(Llive/hms/video/sdk/models/role/LayerParams;)Llive/hms/video/media/settings/HMSLayer;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Llive/hms/video/media/settings/HMSSimulcastLayerDefinition;-><init>(Llive/hms/video/media/settings/HMSVideoResolution;Llive/hms/video/media/settings/HMSLayer;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    instance-of p2, p1, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    if-eqz p2, :cond_9

    move-object v2, p1

    check-cast v2, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    :cond_9
    if-eqz v2, :cond_a

    invoke-virtual {v2, v1}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->setLayerDefinition$lib_release(Ljava/util/List;)V

    :cond_a
    return-void
.end method

.method private static final addSimulcastLayerDefinitionFromPeer$ridToHMSLayerMapper(Llive/hms/video/sdk/models/role/LayerParams;)Llive/hms/video/media/settings/HMSLayer;
    .locals 2

    invoke-virtual {p0}, Llive/hms/video/sdk/models/role/LayerParams;->getRid()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x66

    if-eq v0, v1, :cond_4

    const/16 v1, 0x68

    if-eq v0, v1, :cond_2

    const/16 v1, 0x71

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "q"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Llive/hms/video/media/settings/HMSLayer;->LOW:Llive/hms/video/media/settings/HMSLayer;

    return-object p0

    :cond_2
    const-string v0, "h"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Llive/hms/video/media/settings/HMSLayer;->MEDIUM:Llive/hms/video/media/settings/HMSLayer;

    return-object p0

    :cond_4
    const-string v0, "f"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    sget-object p0, Llive/hms/video/media/settings/HMSLayer;->HIGH:Llive/hms/video/media/settings/HMSLayer;

    return-object p0

    :cond_6
    :goto_0
    sget-object p0, Llive/hms/video/media/settings/HMSLayer;->HIGH:Llive/hms/video/media/settings/HMSLayer;

    return-object p0
.end method

.method private final applyPeerToTrack(Llive/hms/video/sdk/models/HMSRemotePeer;Llive/hms/video/media/tracks/HMSTrack;)V
    .locals 2

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSTrack;->getSource()Ljava/lang/String;

    move-result-object v0

    const-string v1, "regular"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v0

    sget-object v1, Llive/hms/video/sdk/managers/OnTrackAddManager$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    invoke-virtual {p1, v0}, Llive/hms/video/sdk/models/HMSRemotePeer;->setVideoTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    move-object v0, p2

    check-cast v0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    invoke-virtual {p1, v0}, Llive/hms/video/sdk/models/HMSRemotePeer;->setAudioTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSPeer;->getAuxiliaryTracks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getRolesMap()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p2, p1, v0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->addSimulcastLayerDefinitionFromPeer(Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSRemotePeer;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic manageMetadata$default(Llive/hms/video/sdk/managers/OnTrackAddManager;Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;ILjava/lang/Object;)[Llive/hms/video/sdk/models/SDKUpdate;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/managers/OnTrackAddManager;->manageMetadata(Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;)[Llive/hms/video/sdk/models/SDKUpdate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/OnTrackAddManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/OnTrackAddManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;",
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
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;->getTracks()[Llive/hms/video/sdk/models/HMSNotifications$Track;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 4
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;->getPeer()Llive/hms/video/sdk/models/HMSNotifications$TrackMetadataPeer;

    move-result-object v5

    invoke-virtual {v5}, Llive/hms/video/sdk/models/HMSNotifications$TrackMetadataPeer;->getPeerId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v4, v5, p1}, Llive/hms/video/sdk/managers/OnTrackAddManager;->manageMetadata(Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;)[Llive/hms/video/sdk/models/SDKUpdate;

    move-result-object v4

    invoke-static {v0, v4}, Lm83/s;->o0(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final manageMetadata(Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;)[Llive/hms/video/sdk/models/SDKUpdate;
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {v1, p2}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v1

    if-nez v1, :cond_0

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {p3}, Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;->getPeer()Llive/hms/video/sdk/models/HMSNotifications$TrackMetadataPeer;

    move-result-object p3

    invoke-virtual {p3}, Llive/hms/video/sdk/models/HMSNotifications$TrackMetadataPeer;->toPeerJoin()Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;

    move-result-object p3

    invoke-virtual {v1, p3}, Llive/hms/video/sdk/SDKStore;->add(Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;)Llive/hms/video/sdk/models/HMSRemotePeer;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_2

    move-object p3, v1

    check-cast p3, Llive/hms/video/sdk/models/HMSRemotePeer;

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/SDKStore;->getNativeTrackById(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3, p1}, Llive/hms/video/sdk/SDKStore;->updateRTCTrack(Llive/hms/video/sdk/models/HMSNotifications$Track;)Z

    invoke-direct {p0, p3, v2}, Llive/hms/video/sdk/managers/OnTrackAddManager;->applyPeerToTrack(Llive/hms/video/sdk/models/HMSRemotePeer;Llive/hms/video/media/tracks/HMSTrack;)V

    new-instance p3, Llive/hms/video/sdk/models/SDKUpdate$Track;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_ADDED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    invoke-direct {p3, v3, v2, v1}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Llive/hms/video/sdk/SDKStore;->addTrackMetadata(Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;)V

    :cond_2
    const/4 p1, 0x0

    new-array p1, p1, [Llive/hms/video/sdk/models/SDKUpdate;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Llive/hms/video/sdk/models/SDKUpdate;

    return-object p1
.end method

.method public final manageNativeTrack(Llive/hms/video/media/tracks/HMSTrack;)Ljava/util/List;
    .locals 19
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

    move-object/from16 v0, p1

    const-string v1, "track"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/SDKStore;->getTrackMetadata(Ljava/lang/String;)Llive/hms/video/sdk/SDKStore$TrackMetadataPair;

    move-result-object v2

    const-string v3, "OnTrackAddManager"

    if-eqz v2, :cond_5

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Track metadata already present for trackId : "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v4

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;->getPeerId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v4

    if-eqz v4, :cond_4

    move-object v5, v4

    check-cast v5, Llive/hms/video/sdk/models/HMSRemotePeer;

    invoke-virtual/range {p0 .. p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v6

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Llive/hms/video/sdk/SDKStore;->getNativeTrackById(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v6

    if-eqz v6, :cond_2

    move-object v7, v6

    check-cast v7, Llive/hms/video/media/tracks/HMSRemoteTrack;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "TRACK%% tracks old_ssrc:"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v7}, Llive/hms/video/media/tracks/HMSRemoteTrack;->getSsrc()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, "  new_ssrc:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v9, v0

    check-cast v9, Llive/hms/video/media/tracks/HMSRemoteTrack;

    invoke-interface {v9}, Llive/hms/video/media/tracks/HMSRemoteTrack;->getSsrc()J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7}, Llive/hms/video/media/tracks/HMSRemoteTrack;->getSsrc()J

    move-result-wide v7

    invoke-interface {v9}, Llive/hms/video/media/tracks/HMSRemoteTrack;->getSsrc()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_3

    new-instance v8, Llive/hms/video/sdk/models/HMSRemotePeer;

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSPeer;->getCustomerUserID()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSPeer;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSPeer;->getHmsRole()Llive/hms/video/sdk/models/role/HMSRole;

    move-result-object v12

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSPeer;->getJoinedAt()J

    move-result-wide v13

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSPeer;->getType()Llive/hms/video/sdk/models/HMSPeerType;

    move-result-object v16

    const/16 v17, 0x20

    const/16 v18, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v18}, Llive/hms/video/sdk/models/HMSRemotePeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSPeer;->getGroups$lib_release()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v8, v7}, Llive/hms/video/sdk/models/HMSPeer;->setGroups$lib_release(Ljava/util/ArrayList;)V

    invoke-virtual {v5}, Llive/hms/video/sdk/models/HMSRemotePeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    move-result-object v7

    invoke-virtual {v8, v7}, Llive/hms/video/sdk/models/HMSRemotePeer;->setAudioTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;)V

    invoke-virtual {v5}, Llive/hms/video/sdk/models/HMSRemotePeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    move-result-object v7

    invoke-virtual {v8, v7}, Llive/hms/video/sdk/models/HMSRemotePeer;->setVideoTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)V

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v7

    sget-object v9, Llive/hms/video/sdk/managers/OnTrackAddManager$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v9, v7

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v7, v9, :cond_1

    const/4 v9, 0x2

    if-ne v7, v9, :cond_0

    invoke-virtual {v8, v10}, Llive/hms/video/sdk/models/HMSRemotePeer;->setVideoTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {v8, v10}, Llive/hms/video/sdk/models/HMSRemotePeer;->setAudioTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;)V

    :goto_0
    sget-object v7, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "TRACK%% RECEIVED_ADDREQ_SEND_TRACK_REMOVE type: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " audioTrack:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Llive/hms/video/sdk/models/HMSRemotePeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " videoTrack: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Llive/hms/video/sdk/models/HMSRemotePeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v10, 0x20

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v3, v9}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3, v6}, Llive/hms/video/sdk/SDKStore;->removeNativeTrack(Llive/hms/video/media/tracks/HMSTrack;)V

    new-instance v3, Llive/hms/video/sdk/models/SDKUpdate$Track;

    sget-object v7, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_REMOVED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    invoke-direct {v3, v7, v6, v8}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "No native track exists in store with trackId : "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    invoke-virtual/range {p0 .. p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3, v0}, Llive/hms/video/sdk/SDKStore;->addNativeTrack(Llive/hms/video/media/tracks/HMSTrack;)V

    invoke-virtual/range {p0 .. p0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;->getTrackData()Llive/hms/video/sdk/models/HMSNotifications$Track;

    move-result-object v2

    invoke-virtual {v3, v2}, Llive/hms/video/sdk/SDKStore;->updateRTCTrack(Llive/hms/video/sdk/models/HMSNotifications$Track;)Z

    move-object/from16 v2, p0

    invoke-direct {v2, v5, v0}, Llive/hms/video/sdk/managers/OnTrackAddManager;->applyPeerToTrack(Llive/hms/video/sdk/models/HMSRemotePeer;Llive/hms/video/media/tracks/HMSTrack;)V

    new-instance v3, Llive/hms/video/sdk/models/SDKUpdate$Track;

    sget-object v5, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_ADDED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    invoke-direct {v3, v5, v0, v4}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    move-object/from16 v2, p0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "No peer found for trackID : "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object/from16 v2, p0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Track metadata not yet received for trackId : "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3, v0}, Llive/hms/video/sdk/SDKStore;->addNativeTrack(Llive/hms/video/media/tracks/HMSTrack;)V

    :goto_2
    invoke-virtual {v2}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getLocalTracksMute()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v2}, Llive/hms/video/sdk/managers/OnTrackAddManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Llive/hms/video/sdk/SDKStore;->getNativeTrackById(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v0

    instance-of v3, v0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    if-eqz v3, :cond_6

    check-cast v0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->setVolume(D)V

    :cond_6
    return-object v1
.end method
