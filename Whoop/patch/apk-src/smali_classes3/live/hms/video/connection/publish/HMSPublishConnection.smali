.class public final Llive/hms/video/connection/publish/HMSPublishConnection;
.super Llive/hms/video/connection/HMSConnection;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/publish/HMSPublishConnection$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u001d\u0008\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Llive/hms/video/connection/publish/HMSPublishConnection;",
        "Llive/hms/video/connection/HMSConnection;",
        "Lhms/webrtc/PeerConnectionFactory;",
        "peerConnectionFactory",
        "Llive/hms/video/signal/ISignal;",
        "signal",
        "Lhms/webrtc/PeerConnection$RTCConfiguration;",
        "config",
        "Llive/hms/video/connection/publish/IPublishConnectionObserver;",
        "observer",
        "<init>",
        "(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/publish/IPublishConnectionObserver;)V",
        "",
        "label",
        "Ll83/a0;",
        "createDataChannel",
        "(Ljava/lang/String;)V",
        "close",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lhms/webrtc/PeerConnectionFactory;",
        "getPeerConnectionFactory",
        "()Lhms/webrtc/PeerConnectionFactory;",
        "",
        "apiChannelCreated",
        "Z",
        "isClose",
        "()Z",
        "setClose",
        "(Z)V",
        "live/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1",
        "nativeObserver",
        "Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;",
        "Lhms/webrtc/PeerConnection;",
        "nativeConnection",
        "Lhms/webrtc/PeerConnection;",
        "getNativeConnection",
        "()Lhms/webrtc/PeerConnection;",
        "Llive/hms/video/connection/HMSDataChannel;",
        "apiDataChannel",
        "Llive/hms/video/connection/HMSDataChannel;",
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
.field public static final Companion:Llive/hms/video/connection/publish/HMSPublishConnection$Companion;

.field private static final TAG:Ljava/lang/String; = "HMSPublishConnection"


# instance fields
.field private apiChannelCreated:Z

.field private final apiDataChannel:Llive/hms/video/connection/HMSDataChannel;

.field private isClose:Z

.field private final nativeConnection:Lhms/webrtc/PeerConnection;

.field private final nativeObserver:Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;

.field private final peerConnectionFactory:Lhms/webrtc/PeerConnectionFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/publish/HMSPublishConnection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/publish/HMSPublishConnection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/publish/HMSPublishConnection;->Companion:Llive/hms/video/connection/publish/HMSPublishConnection$Companion;

    return-void
.end method

.method public constructor <init>(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/publish/IPublishConnectionObserver;)V
    .locals 2

    const-string v0, "peerConnectionFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->PUBLISH:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-direct {p0, v0, p2}, Llive/hms/video/connection/HMSConnection;-><init>(Llive/hms/video/connection/models/HMSConnectionRole;Llive/hms/video/signal/ISignal;)V

    iput-object p1, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->peerConnectionFactory:Lhms/webrtc/PeerConnectionFactory;

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v0

    new-instance v1, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;

    invoke-direct {v1, p0, p2, p4, v0}, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;-><init>(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/signal/ISignal;Llive/hms/video/connection/publish/IPublishConnectionObserver;Llive/hms/video/connection/models/HMSConnectionRole;)V

    iput-object v1, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->nativeObserver:Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;

    invoke-virtual {p1, p3, v1}, Lhms/webrtc/PeerConnectionFactory;->createPeerConnection(Lhms/webrtc/PeerConnection$RTCConfiguration;Lhms/webrtc/PeerConnection$Observer;)Lhms/webrtc/PeerConnection;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->nativeConnection:Lhms/webrtc/PeerConnection;

    new-instance p1, Lhms/webrtc/DataChannel$Init;

    invoke-direct {p1}, Lhms/webrtc/DataChannel$Init;-><init>()V

    const-string p2, "SCTP"

    iput-object p2, p1, Lhms/webrtc/DataChannel$Init;->protocol:Ljava/lang/String;

    invoke-virtual {p0}, Llive/hms/video/connection/publish/HMSPublishConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object p2

    const-string p3, "ion-sfu"

    invoke-virtual {p2, p3, p1}, Lhms/webrtc/PeerConnection;->createDataChannel(Ljava/lang/String;Lhms/webrtc/DataChannel$Init;)Lhms/webrtc/DataChannel;

    move-result-object p1

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string p3, "HMSPublishConnection"

    const-string p4, "Created data-channel `ion-sfu`"

    invoke-virtual {p2, p3, p4}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Llive/hms/video/connection/HMSDataChannel;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance p3, Llive/hms/video/connection/publish/HMSPublishConnection$1;

    invoke-direct {p3}, Llive/hms/video/connection/publish/HMSPublishConnection$1;-><init>()V

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "role="

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p2, p1, p3, p4}, Llive/hms/video/connection/HMSDataChannel;-><init>(Lhms/webrtc/DataChannel;Llive/hms/video/connection/HMSDataChannel$Observer;Ljava/lang/String;)V

    iput-object p2, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->apiDataChannel:Llive/hms/video/connection/HMSDataChannel;

    return-void
.end method

.method public static final synthetic access$getApiChannelCreated$p(Llive/hms/video/connection/publish/HMSPublishConnection;)Z
    .locals 0

    iget-boolean p0, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->apiChannelCreated:Z

    return p0
.end method

.method public static final synthetic access$setApiChannelCreated$p(Llive/hms/video/connection/publish/HMSPublishConnection;Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->apiChannelCreated:Z

    return-void
.end method

.method private final createDataChannel(Ljava/lang/String;)V
    .locals 0

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

    iput-boolean v0, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->isClose:Z

    iget-object v0, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->apiDataChannel:Llive/hms/video/connection/HMSDataChannel;

    invoke-virtual {v0}, Llive/hms/video/connection/HMSDataChannel;->close()V

    invoke-super {p0, p1}, Llive/hms/video/connection/HMSConnection;->close(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public getNativeConnection()Lhms/webrtc/PeerConnection;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->nativeConnection:Lhms/webrtc/PeerConnection;

    return-object v0
.end method

.method public final getPeerConnectionFactory()Lhms/webrtc/PeerConnectionFactory;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->peerConnectionFactory:Lhms/webrtc/PeerConnectionFactory;

    return-object v0
.end method

.method public final isClose()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->isClose:Z

    return v0
.end method

.method public final setClose(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/connection/publish/HMSPublishConnection;->isClose:Z

    return-void
.end method
