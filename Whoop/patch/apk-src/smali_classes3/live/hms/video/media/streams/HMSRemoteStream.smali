.class public final Llive/hms/video/media/streams/HMSRemoteStream;
.super Llive/hms/video/media/streams/HMSMediaStream;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Llive/hms/video/media/streams/HMSRemoteStream;",
        "Llive/hms/video/media/streams/HMSMediaStream;",
        "Lhms/webrtc/MediaStream;",
        "nativeStream",
        "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;",
        "connection",
        "<init>",
        "(Lhms/webrtc/MediaStream;Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)V",
        "",
        "trackId",
        "",
        "isEnabled",
        "Ll83/a0;",
        "setAudio",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/media/settings/HMSSimulcastLayer;",
        "layer",
        "Llive/hms/video/media/streams/models/PreferStateResponse;",
        "setVideo",
        "(Llive/hms/video/media/settings/HMSSimulcastLayer;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "with",
        "compareNative",
        "(Lhms/webrtc/MediaStream;)Z",
        "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;",
        "shouldSubscribeToAudio",
        "Z",
        "videoSimulcastLayer",
        "Llive/hms/video/media/settings/HMSSimulcastLayer;",
        "frameRate",
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
.field private final connection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

.field private frameRate:Llive/hms/video/media/settings/HMSSimulcastLayer;

.field private shouldSubscribeToAudio:Z

.field private videoSimulcastLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;


# direct methods
.method public constructor <init>(Lhms/webrtc/MediaStream;Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)V
    .locals 1

    const-string v0, "nativeStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llive/hms/video/media/streams/HMSMediaStream;-><init>(Lhms/webrtc/MediaStream;)V

    iput-object p2, p0, Llive/hms/video/media/streams/HMSRemoteStream;->connection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    const/4 p1, 0x1

    iput-boolean p1, p0, Llive/hms/video/media/streams/HMSRemoteStream;->shouldSubscribeToAudio:Z

    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->HIGH:Llive/hms/video/media/settings/HMSSimulcastLayer;

    iput-object p1, p0, Llive/hms/video/media/streams/HMSRemoteStream;->videoSimulcastLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    iput-object p1, p0, Llive/hms/video/media/streams/HMSRemoteStream;->frameRate:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-void
.end method


# virtual methods
.method public final compareNative(Lhms/webrtc/MediaStream;)Z
    .locals 1

    const-string v0, "with"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/streams/HMSMediaStream;->getNativeStream()Lhms/webrtc/MediaStream;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final setAudio(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iput-boolean p2, p0, Llive/hms/video/media/streams/HMSRemoteStream;->shouldSubscribeToAudio:Z

    iget-object v0, p0, Llive/hms/video/media/streams/HMSRemoteStream;->connection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    new-instance v1, Llive/hms/video/media/streams/models/PreferLayerAudio;

    invoke-direct {v1, p1, p2}, Llive/hms/video/media/streams/models/PreferLayerAudio;-><init>(Ljava/lang/String;Z)V

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1, p3}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->sendOverApiDataChannel(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setVideo(Llive/hms/video/media/settings/HMSSimulcastLayer;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/settings/HMSSimulcastLayer;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/streams/models/PreferStateResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/streams/HMSRemoteStream;->videoSimulcastLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    iget-object v0, p0, Llive/hms/video/media/streams/HMSRemoteStream;->connection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    new-instance v1, Llive/hms/video/media/streams/models/PreferLayer;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "toLowerCase(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p2, p1}, Llive/hms/video/media/streams/models/PreferLayer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {v0, v1, p1, p3}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->sendOverApiDataChannel(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
