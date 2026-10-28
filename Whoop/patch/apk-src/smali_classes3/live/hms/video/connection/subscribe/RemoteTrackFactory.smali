.class public final Llive/hms/video/connection/subscribe/RemoteTrackFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/subscribe/RemoteTrackFactory$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Llive/hms/video/connection/subscribe/RemoteTrackFactory;",
        "",
        "<init>",
        "()V",
        "createRemoteTrack",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "Lhms/webrtc/MediaStreamTrack;",
        "remote",
        "Llive/hms/video/media/streams/HMSRemoteStream;",
        "ssrc",
        "",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createRemoteTrack(Lhms/webrtc/MediaStreamTrack;Llive/hms/video/media/streams/HMSRemoteStream;J)Llive/hms/video/media/tracks/HMSTrack;
    .locals 10

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remote"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/media/tracks/HMSTrackType;->Companion:Llive/hms/video/media/tracks/HMSTrackType$Companion;

    invoke-virtual {v0, p1}, Llive/hms/video/media/tracks/HMSTrackType$Companion;->from$lib_release(Lhms/webrtc/MediaStreamTrack;)Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v0

    sget-object v1, Llive/hms/video/connection/subscribe/RemoteTrackFactory$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v2, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    move-object v4, p1

    check-cast v4, Lhms/webrtc/VideoTrack;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v5, 0x0

    move-object v3, p2

    move-wide v6, p3

    invoke-direct/range {v2 .. v9}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;-><init>(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    move-object v1, p2

    move-wide v4, p3

    new-instance v0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    move-object v2, p1

    check-cast v2, Lhms/webrtc/AudioTrack;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;-><init>(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
