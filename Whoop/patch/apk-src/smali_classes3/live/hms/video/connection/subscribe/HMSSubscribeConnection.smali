.class public final Llive/hms/video/connection/subscribe/HMSSubscribeConnection;
.super Llive/hms/video/connection/HMSConnection;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/subscribe/HMSSubscribeConnection$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001(\u0008\u0000\u0018\u0000 02\u00020\u0001:\u00010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008#\u0010%\"\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/\u00a8\u00061"
    }
    d2 = {
        "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;",
        "Llive/hms/video/connection/HMSConnection;",
        "Lhms/webrtc/PeerConnectionFactory;",
        "peerConnectionFactory",
        "Llive/hms/video/signal/ISignal;",
        "signal",
        "Lhms/webrtc/PeerConnection$RTCConfiguration;",
        "config",
        "Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;",
        "observer",
        "Llive/hms/video/connection/subscribe/RemoteTrackFactory;",
        "remoteTrackFactory",
        "<init>",
        "(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;)V",
        "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;",
        "message",
        "",
        "isVideo",
        "Llive/hms/video/media/streams/models/PreferStateResponse;",
        "sendOverApiDataChannel",
        "(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;ZLq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "close",
        "(Lq83/d;)Ljava/lang/Object;",
        "Ljava/util/HashMap;",
        "",
        "Llive/hms/video/media/streams/HMSRemoteStream;",
        "remoteStreams",
        "Ljava/util/HashMap;",
        "Llive/hms/video/connection/HMSDataChannel;",
        "api",
        "Llive/hms/video/connection/HMSDataChannel;",
        "Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;",
        "dataChannelRequestManager",
        "Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;",
        "isClose",
        "Z",
        "()Z",
        "setClose",
        "(Z)V",
        "live/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1",
        "nativeObserver",
        "Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;",
        "Lhms/webrtc/PeerConnection;",
        "nativeConnection",
        "Lhms/webrtc/PeerConnection;",
        "getNativeConnection",
        "()Lhms/webrtc/PeerConnection;",
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
.field public static final Companion:Llive/hms/video/connection/subscribe/HMSSubscribeConnection$Companion;

.field private static final TAG:Ljava/lang/String; = "HMSSubscribeConnection"


# instance fields
.field private api:Llive/hms/video/connection/HMSDataChannel;

.field private final dataChannelRequestManager:Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

.field private isClose:Z

.field private final nativeConnection:Lhms/webrtc/PeerConnection;

.field private final nativeObserver:Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;

.field private final remoteStreams:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/media/streams/HMSRemoteStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->Companion:Llive/hms/video/connection/subscribe/HMSSubscribeConnection$Companion;

    return-void
.end method

.method public constructor <init>(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;)V
    .locals 7

    const-string v0, "peerConnectionFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteTrackFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->SUBSCRIBE:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-direct {p0, v0, p2}, Llive/hms/video/connection/HMSConnection;-><init>(Llive/hms/video/connection/models/HMSConnectionRole;Llive/hms/video/signal/ISignal;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->remoteStreams:Ljava/util/HashMap;

    new-instance v0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    invoke-direct {v0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;-><init>()V

    iput-object v0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->dataChannelRequestManager:Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v6

    new-instance v1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;

    move-object v2, p0

    move-object v5, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/signal/ISignal;Llive/hms/video/connection/models/HMSConnectionRole;)V

    iput-object v1, v2, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->nativeObserver:Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;

    invoke-virtual {p1, p3, v1}, Lhms/webrtc/PeerConnectionFactory;->createPeerConnection(Lhms/webrtc/PeerConnection$RTCConfiguration;Lhms/webrtc/PeerConnection$Observer;)Lhms/webrtc/PeerConnection;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, v2, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->nativeConnection:Lhms/webrtc/PeerConnection;

    return-void
.end method

.method public static final synthetic access$getDataChannelRequestManager$p(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->dataChannelRequestManager:Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    return-object p0
.end method

.method public static final synthetic access$getRemoteStreams$p(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->remoteStreams:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic access$setApi$p(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/HMSDataChannel;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->api:Llive/hms/video/connection/HMSDataChannel;

    return-void
.end method


# virtual methods
.method public close(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->isClose:Z

    iget-object v0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->api:Llive/hms/video/connection/HMSDataChannel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/connection/HMSDataChannel;->close()V

    :cond_0
    invoke-super {p0, p1}, Llive/hms/video/connection/HMSConnection;->close(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public getNativeConnection()Lhms/webrtc/PeerConnection;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->nativeConnection:Lhms/webrtc/PeerConnection;

    return-object v0
.end method

.method public final isClose()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->isClose:Z

    return v0
.end method

.method public final sendOverApiDataChannel(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;",
            "Z",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/streams/models/PreferStateResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p2, :cond_0

    iget-object p2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->dataChannelRequestManager:Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    invoke-virtual {p2, p1, p3}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->preferVideo(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->dataChannelRequestManager:Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    invoke-virtual {p2, p1, p3}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->preferAudio(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setClose(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->isClose:Z

    return-void
.end method
