.class public final Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J*\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;",
        "store",
        "Llive/hms/video/sdk/SDKStore;",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;)V",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "Ljava/lang/String;",
        "manage",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "params",
        "Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;",
        "handleRequest",
        "",
        "isMute",
        "",
        "givenPeerId",
        "requestedTrack",
        "Llive/hms/video/media/tracks/HMSTrack;",
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
.field private final TAG:Ljava/lang/String;

.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->store:Llive/hms/video/sdk/SDKStore;

    const-string p1, "TrackUpdateRequestedManager"

    iput-object p1, p0, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->TAG:Ljava/lang/String;

    return-void
.end method

.method private final handleRequest(ZLjava/lang/String;Llive/hms/video/media/tracks/HMSTrack;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v1

    invoke-virtual {p0}, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v2, p2}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p2

    if-eqz v1, :cond_3

    if-eqz p3, :cond_3

    if-eqz p1, :cond_2

    instance-of v2, p3, Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    if-eqz v2, :cond_0

    move-object v2, p3

    check-cast v2, Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    invoke-virtual {v2, p1}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setMute(Z)V

    goto :goto_0

    :cond_0
    instance-of v2, p3, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v2, :cond_1

    move-object v2, p3

    check-cast v2, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {v2, p1}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setMute(Z)V

    :cond_1
    :goto_0
    new-instance v2, Llive/hms/video/sdk/models/SDKUpdate$Track;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_MUTED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    invoke-direct {v2, v3, p3, v1}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance v1, Llive/hms/video/sdk/models/SDKUpdate$HMSTrackStateUpdate;

    invoke-direct {v1, p3, p2, p1}, Llive/hms/video/sdk/models/SDKUpdate$HMSTrackStateUpdate;-><init>(Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v0
.end method


# virtual methods
.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final manage(Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Llive/hms/video/media/tracks/HMSTrackType;->Companion:Llive/hms/video/media/tracks/HMSTrackType$Companion;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/media/tracks/HMSTrackType$Companion;->from$lib_release(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 6
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getAllTracks()[Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 7
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    array-length v4, v1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_6

    aget-object v6, v1, v5

    .line 9
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;->getSource()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v6}, Llive/hms/video/media/tracks/HMSTrack;->getSource()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;->getSource()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 10
    :cond_1
    :goto_1
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;->getType()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v7

    if-ne v7, v0, :cond_4

    .line 11
    :cond_3
    :goto_2
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    move-object v3, v2

    :cond_6
    if-eqz v3, :cond_7

    .line 12
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 14
    check-cast v1, Llive/hms/video/media/tracks/HMSTrack;

    .line 15
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;->getMute()Z

    move-result v3

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;->getPeerId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4, v1}, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->handleRequest(ZLjava/lang/String;Llive/hms/video/media/tracks/HMSTrack;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 16
    invoke-static {v2, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_3

    :cond_7
    if-nez v2, :cond_8

    .line 17
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_8
    return-object v2
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSPeer;->getAllTracks()[Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {v4}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->getTrackid()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v1, v4

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 3
    :cond_1
    :goto_1
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->isMute()Z

    move-result v0

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->getPeerId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1, v1}, Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;->handleRequest(ZLjava/lang/String;Llive/hms/video/media/tracks/HMSTrack;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
