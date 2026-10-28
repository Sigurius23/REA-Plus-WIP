.class public abstract Llive/hms/video/sdk/models/HMSPeer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0008&\u0018\u00002\u00020\u0001BM\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0008\u0010F\u001a\u00020\u0003H\u0016J\u0010\u0010G\u001a\u0004\u0018\u00010!2\u0006\u0010H\u001a\u00020\u0003J\u0011\u0010I\u001a\u0008\u0012\u0004\u0012\u00020!0J\u00a2\u0006\u0002\u0010KR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0014R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR0\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0 2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 @@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R$\u0010\'\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010\u0012\"\u0004\u0008-\u0010.R$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u0010\u0012\"\u0004\u00080\u0010.R(\u00102\u001a\u0004\u0018\u0001012\u0008\u0010\u001f\u001a\u0004\u0018\u000101@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R$\u0010\u000c\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R0\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010=j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`<X\u0080\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR&\u0010C\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078F@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008C\u0010\u0014\"\u0004\u0008D\u0010E\u00a8\u0006L"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSPeer;",
        "",
        "peerID",
        "",
        "customerUserID",
        "name",
        "isLocal",
        "",
        "type",
        "Llive/hms/video/sdk/models/HMSPeerType;",
        "role",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "joinedAt",
        "",
        "metadata",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/sdk/models/HMSPeerType;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;)V",
        "getPeerID",
        "()Ljava/lang/String;",
        "getCustomerUserID",
        "()Z",
        "getType",
        "()Llive/hms/video/sdk/models/HMSPeerType;",
        "videoTrack",
        "Llive/hms/video/media/tracks/HMSVideoTrack;",
        "getVideoTrack",
        "()Llive/hms/video/media/tracks/HMSVideoTrack;",
        "audioTrack",
        "Llive/hms/video/media/tracks/HMSAudioTrack;",
        "getAudioTrack",
        "()Llive/hms/video/media/tracks/HMSAudioTrack;",
        "value",
        "",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "auxiliaryTracks",
        "getAuxiliaryTracks",
        "()Ljava/util/List;",
        "setAuxiliaryTracks$lib_release",
        "(Ljava/util/List;)V",
        "hmsRole",
        "getHmsRole",
        "()Llive/hms/video/sdk/models/role/HMSRole;",
        "setHmsRole$lib_release",
        "(Llive/hms/video/sdk/models/role/HMSRole;)V",
        "getName",
        "setName$lib_release",
        "(Ljava/lang/String;)V",
        "getMetadata",
        "setMetadata$lib_release",
        "Llive/hms/video/connection/stats/quality/HMSNetworkQuality;",
        "networkQuality",
        "getNetworkQuality",
        "()Llive/hms/video/connection/stats/quality/HMSNetworkQuality;",
        "setNetworkQuality$lib_release",
        "(Llive/hms/video/connection/stats/quality/HMSNetworkQuality;)V",
        "getJoinedAt",
        "()J",
        "setJoinedAt$lib_release",
        "(J)V",
        "groups",
        "Lkotlin/collections/ArrayList;",
        "Ljava/util/ArrayList;",
        "getGroups$lib_release",
        "()Ljava/util/ArrayList;",
        "setGroups$lib_release",
        "(Ljava/util/ArrayList;)V",
        "Ljava/util/ArrayList;",
        "isHandRaised",
        "setHandRaised$lib_release",
        "(Z)V",
        "toString",
        "getTrackById",
        "trackId",
        "getAllTracks",
        "",
        "()[Llive/hms/video/media/tracks/HMSTrack;",
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
.field private auxiliaryTracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ">;"
        }
    .end annotation
.end field

.field private final customerUserID:Ljava/lang/String;

.field private groups:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private hmsRole:Llive/hms/video/sdk/models/role/HMSRole;

.field private isHandRaised:Z

.field private final isLocal:Z

.field private joinedAt:J

.field private metadata:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private networkQuality:Llive/hms/video/connection/stats/quality/HMSNetworkQuality;

.field private final peerID:Ljava/lang/String;

.field private final type:Llive/hms/video/sdk/models/HMSPeerType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/sdk/models/HMSPeerType;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;)V
    .locals 1

    const-string v0, "peerID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/sdk/models/HMSPeer;->peerID:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Llive/hms/video/sdk/models/HMSPeer;->customerUserID:Ljava/lang/String;

    .line 4
    iput-boolean p4, p0, Llive/hms/video/sdk/models/HMSPeer;->isLocal:Z

    .line 5
    iput-object p5, p0, Llive/hms/video/sdk/models/HMSPeer;->type:Llive/hms/video/sdk/models/HMSPeerType;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSPeer;->auxiliaryTracks:Ljava/util/List;

    .line 7
    iput-object p6, p0, Llive/hms/video/sdk/models/HMSPeer;->hmsRole:Llive/hms/video/sdk/models/role/HMSRole;

    .line 8
    iput-object p3, p0, Llive/hms/video/sdk/models/HMSPeer;->name:Ljava/lang/String;

    .line 9
    iput-object p9, p0, Llive/hms/video/sdk/models/HMSPeer;->metadata:Ljava/lang/String;

    .line 10
    iput-wide p7, p0, Llive/hms/video/sdk/models/HMSPeer;->joinedAt:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/sdk/models/HMSPeerType;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    .line 11
    const-string v0, ""

    move-object v10, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {v1 .. v10}, Llive/hms/video/sdk/models/HMSPeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/sdk/models/HMSPeerType;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getAllTracks()[Llive/hms/video/media/tracks/HMSTrack;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSPeer;->auxiliaryTracks:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v1, 0x0

    new-array v1, v1, [Llive/hms/video/media/tracks/HMSTrack;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llive/hms/video/media/tracks/HMSTrack;

    return-object v0
.end method

.method public abstract getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;
.end method

.method public final getAuxiliaryTracks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->auxiliaryTracks:Ljava/util/List;

    return-object v0
.end method

.method public final getCustomerUserID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->customerUserID:Ljava/lang/String;

    return-object v0
.end method

.method public final getGroups$lib_release()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->groups:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getHmsRole()Llive/hms/video/sdk/models/role/HMSRole;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->hmsRole:Llive/hms/video/sdk/models/role/HMSRole;

    return-object v0
.end method

.method public final getJoinedAt()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/HMSPeer;->joinedAt:J

    return-wide v0
.end method

.method public final getMetadata()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->metadata:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getNetworkQuality()Llive/hms/video/connection/stats/quality/HMSNetworkQuality;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->networkQuality:Llive/hms/video/connection/stats/quality/HMSNetworkQuality;

    return-object v0
.end method

.method public final getPeerID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->peerID:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackById(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;
    .locals 4

    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->auxiliaryTracks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/media/tracks/HMSTrack;

    invoke-virtual {v2}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    return-object v2

    :cond_5
    return-object v1
.end method

.method public final getType()Llive/hms/video/sdk/models/HMSPeerType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->type:Llive/hms/video/sdk/models/HMSPeerType;

    return-object v0
.end method

.method public abstract getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;
.end method

.method public final isHandRaised()Z
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSPeer;->groups:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const-string v1, "_handraise"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isLocal()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSPeer;->isLocal:Z

    return v0
.end method

.method public final setAuxiliaryTracks$lib_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSPeer;->auxiliaryTracks:Ljava/util/List;

    return-void
.end method

.method public final setGroups$lib_release(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSPeer;->groups:Ljava/util/ArrayList;

    return-void
.end method

.method public final setHandRaised$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/models/HMSPeer;->isHandRaised:Z

    return-void
.end method

.method public final setHmsRole$lib_release(Llive/hms/video/sdk/models/role/HMSRole;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSPeer;->hmsRole:Llive/hms/video/sdk/models/role/HMSRole;

    return-void
.end method

.method public final setJoinedAt$lib_release(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/sdk/models/HMSPeer;->joinedAt:J

    return-void
.end method

.method public final setMetadata$lib_release(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSPeer;->metadata:Ljava/lang/String;

    return-void
.end method

.method public final setName$lib_release(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSPeer;->name:Ljava/lang/String;

    return-void
.end method

.method public final setNetworkQuality$lib_release(Llive/hms/video/connection/stats/quality/HMSNetworkQuality;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSPeer;->networkQuality:Llive/hms/video/connection/stats/quality/HMSNetworkQuality;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSPeer{peerId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSPeer;->peerID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSPeer;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSPeer;->hmsRole:Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customerDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSPeer;->metadata:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", audioTrack="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", videoTrack="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", auxiliaryTracks="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSPeer;->auxiliaryTracks:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", customerId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSPeer;->customerUserID:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSPeer;->metadata:Ljava/lang/String;

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
