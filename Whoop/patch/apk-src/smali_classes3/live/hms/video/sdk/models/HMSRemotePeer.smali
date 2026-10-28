.class public final Llive/hms/video/sdk/models/HMSRemotePeer;
.super Llive/hms/video/sdk/models/HMSPeer;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001BE\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0008\u0010\u001c\u001a\u00020\u0003H\u0016R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010@PX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0016@PX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSRemotePeer;",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "peerId",
        "",
        "customerUserId",
        "name",
        "role",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "joinedAt",
        "",
        "description",
        "type",
        "Llive/hms/video/sdk/models/HMSPeerType;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V",
        "value",
        "Llive/hms/video/media/tracks/HMSRemoteAudioTrack;",
        "audioTrack",
        "getAudioTrack",
        "()Llive/hms/video/media/tracks/HMSRemoteAudioTrack;",
        "setAudioTrack$lib_release",
        "(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;)V",
        "Llive/hms/video/media/tracks/HMSRemoteVideoTrack;",
        "videoTrack",
        "getVideoTrack",
        "()Llive/hms/video/media/tracks/HMSRemoteVideoTrack;",
        "setVideoTrack$lib_release",
        "(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)V",
        "toString",
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
.field private audioTrack:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

.field private videoTrack:Llive/hms/video/media/tracks/HMSRemoteVideoTrack;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V
    .locals 11

    const-string v0, "peerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v10, p7

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v6, p8

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move-wide/from16 v8, p5

    .line 3
    invoke-direct/range {v1 .. v10}, Llive/hms/video/sdk/models/HMSPeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/sdk/models/HMSPeerType;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_0

    .line 1
    const-string v0, ""

    move-object v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide v6, p5

    move-object/from16 v9, p8

    goto :goto_1

    :cond_0
    move-object/from16 v8, p7

    goto :goto_0

    .line 2
    :goto_1
    invoke-direct/range {v1 .. v9}, Llive/hms/video/sdk/models/HMSRemotePeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;
    .locals 1

    .line 1
    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSRemotePeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    move-result-object v0

    return-object v0
.end method

.method public getAudioTrack()Llive/hms/video/media/tracks/HMSRemoteAudioTrack;
    .locals 1

    .line 2
    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRemotePeer;->audioTrack:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    return-object v0
.end method

.method public getVideoTrack()Llive/hms/video/media/tracks/HMSRemoteVideoTrack;
    .locals 1

    .line 2
    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRemotePeer;->videoTrack:Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    return-object v0
.end method

.method public bridge synthetic getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;
    .locals 1

    .line 1
    invoke-virtual {p0}, Llive/hms/video/sdk/models/HMSRemotePeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    move-result-object v0

    return-object v0
.end method

.method public setAudioTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSRemotePeer;->audioTrack:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    return-void
.end method

.method public setVideoTrack$lib_release(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSRemotePeer;->videoTrack:Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-super {p0}, Llive/hms/video/sdk/models/HMSPeer;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSRemotePeer"

    const/4 v2, 0x0

    const-string v3, "HMSPeer"

    invoke-static {v0, v3, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
