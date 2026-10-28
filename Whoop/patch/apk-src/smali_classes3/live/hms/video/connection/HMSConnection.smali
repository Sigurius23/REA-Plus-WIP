.class public abstract Llive/hms/video/connection/HMSConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/HMSConnection$Companion;,
        Llive/hms/video/connection/HMSConnection$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008 \u0018\u0000 M2\u00020\u0001:\u0001MB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008&\u0010\'J\u0013\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0004\u0008*\u0010+J\u0015\u0010-\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020)\u00a2\u0006\u0004\u0008-\u0010.J\u000f\u0010/\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00102\u001a\u000201H\u0086@\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u00084\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00108\u001a\u0004\u00089\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u001d\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u001c0>8\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010BR\u0016\u0010C\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0014\u0010H\u001a\u00020E8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010GR\u0011\u0010L\u001a\u00020I8F\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010K\u00a8\u0006N"
    }
    d2 = {
        "Llive/hms/video/connection/HMSConnection;",
        "",
        "Llive/hms/video/connection/models/HMSConnectionRole;",
        "role",
        "Llive/hms/video/signal/ISignal;",
        "signal",
        "<init>",
        "(Llive/hms/video/connection/models/HMSConnectionRole;Llive/hms/video/signal/ISignal;)V",
        "Lhms/webrtc/SessionDescription;",
        "sdp",
        "enableOpusDtx",
        "(Lhms/webrtc/SessionDescription;)Lhms/webrtc/SessionDescription;",
        "",
        "getNodeInfo",
        "()Ljava/lang/String;",
        "nodeInfo",
        "Ll83/a0;",
        "setNodeInfo",
        "(Ljava/lang/String;)V",
        "Lhms/webrtc/MediaConstraints;",
        "constraints",
        "createOffer",
        "(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;",
        "createAnswer",
        "description",
        "setLocalDescription",
        "(Lhms/webrtc/SessionDescription;Lq83/d;)Ljava/lang/Object;",
        "setRemoteDescription",
        "Lhms/webrtc/IceCandidate;",
        "candidate",
        "",
        "addIceCandidate",
        "(Lhms/webrtc/IceCandidate;)Z",
        "Lhms/webrtc/MediaStreamTrack;",
        "track",
        "Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;",
        "init",
        "Lhms/webrtc/RtpTransceiver;",
        "addTransceiver",
        "(Lhms/webrtc/MediaStreamTrack;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;",
        "",
        "Lhms/webrtc/RtpSender;",
        "getSenders",
        "()Ljava/util/List;",
        "sender",
        "removeTrack",
        "(Lhms/webrtc/RtpSender;)Z",
        "getRemoteDescription",
        "()Lhms/webrtc/SessionDescription;",
        "Lhms/webrtc/RTCStatsReport;",
        "getStats",
        "(Lq83/d;)Ljava/lang/Object;",
        "close",
        "Llive/hms/video/connection/models/HMSConnectionRole;",
        "getRole",
        "()Llive/hms/video/connection/models/HMSConnectionRole;",
        "Llive/hms/video/signal/ISignal;",
        "getSignal",
        "()Llive/hms/video/signal/ISignal;",
        "Llive/hms/video/error/ErrorFactory$Action;",
        "action",
        "Llive/hms/video/error/ErrorFactory$Action;",
        "Ljava/util/ArrayList;",
        "candidates",
        "Ljava/util/ArrayList;",
        "getCandidates",
        "()Ljava/util/ArrayList;",
        "_nodeInfo",
        "Ljava/lang/String;",
        "Lhms/webrtc/PeerConnection;",
        "getNativeConnection",
        "()Lhms/webrtc/PeerConnection;",
        "nativeConnection",
        "Lhms/webrtc/PeerConnection$IceConnectionState;",
        "getIceConnectionState",
        "()Lhms/webrtc/PeerConnection$IceConnectionState;",
        "iceConnectionState",
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
.field public static final Companion:Llive/hms/video/connection/HMSConnection$Companion;

.field private static final TAG:Ljava/lang/String; = "HMSConnection"


# instance fields
.field private _nodeInfo:Ljava/lang/String;

.field private final action:Llive/hms/video/error/ErrorFactory$Action;

.field private final candidates:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhms/webrtc/IceCandidate;",
            ">;"
        }
    .end annotation
.end field

.field private final role:Llive/hms/video/connection/models/HMSConnectionRole;

.field private final signal:Llive/hms/video/signal/ISignal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/HMSConnection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/HMSConnection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/HMSConnection;->Companion:Llive/hms/video/connection/HMSConnection$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/connection/models/HMSConnectionRole;Llive/hms/video/signal/ISignal;)V
    .locals 1

    const-string v0, "role"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    iput-object p2, p0, Llive/hms/video/connection/HMSConnection;->signal:Llive/hms/video/signal/ISignal;

    sget-object p2, Llive/hms/video/connection/HMSConnection$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    sget-object p1, Llive/hms/video/error/ErrorFactory$Action;->SUBSCRIBE:Llive/hms/video/error/ErrorFactory$Action;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Llive/hms/video/error/ErrorFactory$Action;->PUBLISH:Llive/hms/video/error/ErrorFactory$Action;

    :goto_0
    iput-object p1, p0, Llive/hms/video/connection/HMSConnection;->action:Llive/hms/video/error/ErrorFactory$Action;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/HMSConnection;->candidates:Ljava/util/ArrayList;

    const-string p1, ""

    iput-object p1, p0, Llive/hms/video/connection/HMSConnection;->_nodeInfo:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lbc3/t;Lhms/webrtc/RTCStatsReport;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/connection/HMSConnection;->getStats$lambda$1(Lbc3/s;Lhms/webrtc/RTCStatsReport;)V

    return-void
.end method

.method public static final synthetic access$enableOpusDtx(Llive/hms/video/connection/HMSConnection;Lhms/webrtc/SessionDescription;)Lhms/webrtc/SessionDescription;
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/connection/HMSConnection;->enableOpusDtx(Lhms/webrtc/SessionDescription;)Lhms/webrtc/SessionDescription;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAction$p(Llive/hms/video/connection/HMSConnection;)Llive/hms/video/error/ErrorFactory$Action;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/HMSConnection;->action:Llive/hms/video/error/ErrorFactory$Action;

    return-object p0
.end method

.method public static synthetic close$suspendImpl(Llive/hms/video/connection/HMSConnection;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/HMSConnection;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object p1

    invoke-virtual {p1}, Lhms/webrtc/PeerConnection;->close()V

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object p0

    invoke-virtual {p0}, Lhms/webrtc/PeerConnection;->dispose()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final enableOpusDtx(Lhms/webrtc/SessionDescription;)Lhms/webrtc/SessionDescription;
    .locals 4

    iget-object v0, p1, Lhms/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v1, "description"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "usedtx=1"

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lhms/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "useinbandfec=1"

    const-string v2, "useinbandfec=1;usedtx=1"

    invoke-static {v0, v1, v2, v3}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lhms/webrtc/SessionDescription;

    iget-object p1, p1, Lhms/webrtc/SessionDescription;->type:Lhms/webrtc/SessionDescription$Type;

    invoke-direct {v1, p1, v0}, Lhms/webrtc/SessionDescription;-><init>(Lhms/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    return-object v1

    :cond_0
    return-object p1
.end method

.method private static final getStats$lambda$1(Lbc3/s;Lhms/webrtc/RTCStatsReport;)V
    .locals 1

    const-string v0, "$deferred"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p0, Lbc3/t;

    invoke-virtual {p0, p1}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final addIceCandidate(Lhms/webrtc/IceCandidate;)Z
    .locals 1

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhms/webrtc/PeerConnection;->addIceCandidate(Lhms/webrtc/IceCandidate;)Z

    move-result p1

    return p1
.end method

.method public final addTransceiver(Lhms/webrtc/MediaStreamTrack;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;
    .locals 1

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "init"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lhms/webrtc/PeerConnection;->addTransceiver(Lhms/webrtc/MediaStreamTrack;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;

    move-result-object p1

    const-string p2, "addTransceiver(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public close(Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    invoke-static {p0, p1}, Llive/hms/video/connection/HMSConnection;->close$suspendImpl(Llive/hms/video/connection/HMSConnection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final createAnswer(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/MediaConstraints;",
            "Lq83/d<",
            "-",
            "Lhms/webrtc/SessionDescription;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] createAnswer: constraints="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "HMSConnection"

    invoke-virtual {v0, v2, v1}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    new-instance v3, Llive/hms/video/connection/HMSConnection$createAnswer$2;

    invoke-direct {v3, v0, p0, v2}, Llive/hms/video/connection/HMSConnection$createAnswer$2;-><init>(Lbc3/s;Llive/hms/video/connection/HMSConnection;Llive/hms/video/connection/models/HMSConnectionRole;)V

    invoke-virtual {v1, v3, p1}, Lhms/webrtc/PeerConnection;->createAnswer(Lhms/webrtc/SdpObserver;Lhms/webrtc/MediaConstraints;)V

    invoke-virtual {v0, p2}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final createOffer(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/MediaConstraints;",
            "Lq83/d<",
            "-",
            "Lhms/webrtc/SessionDescription;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] createOffer: constraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSConnection"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    new-instance v3, Llive/hms/video/connection/HMSConnection$createOffer$2;

    invoke-direct {v3, p0, v0, v2}, Llive/hms/video/connection/HMSConnection$createOffer$2;-><init>(Llive/hms/video/connection/HMSConnection;Lbc3/s;Llive/hms/video/connection/models/HMSConnectionRole;)V

    invoke-virtual {v1, v3, p1}, Lhms/webrtc/PeerConnection;->createOffer(Lhms/webrtc/SdpObserver;Lhms/webrtc/MediaConstraints;)V

    invoke-virtual {v0, p2}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final getCandidates()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lhms/webrtc/IceCandidate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/HMSConnection;->candidates:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getIceConnectionState()Lhms/webrtc/PeerConnection$IceConnectionState;
    .locals 2

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0}, Lhms/webrtc/PeerConnection;->iceConnectionState()Lhms/webrtc/PeerConnection$IceConnectionState;

    move-result-object v0

    const-string v1, "iceConnectionState(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public abstract getNativeConnection()Lhms/webrtc/PeerConnection;
.end method

.method public final getNodeInfo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/HMSConnection;->_nodeInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final getRemoteDescription()Lhms/webrtc/SessionDescription;
    .locals 1

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0}, Lhms/webrtc/PeerConnection;->getRemoteDescription()Lhms/webrtc/SessionDescription;

    move-result-object v0

    return-object v0
.end method

.method public final getRole()Llive/hms/video/connection/models/HMSConnectionRole;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    return-object v0
.end method

.method public final getSenders()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhms/webrtc/RtpSender;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0}, Lhms/webrtc/PeerConnection;->getSenders()Ljava/util/List;

    move-result-object v0

    const-string v1, "getSenders(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getSignal()Llive/hms/video/signal/ISignal;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/HMSConnection;->signal:Llive/hms/video/signal/ISignal;

    return-object v0
.end method

.method public final getStats(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lhms/webrtc/RTCStatsReport;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v1

    new-instance v2, Lhn/p;

    const/16 v3, 0x1a

    invoke-direct {v2, v0, v3}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lhms/webrtc/PeerConnection;->getStats(Lhms/webrtc/RTCStatsCollectorCallback;)V

    invoke-virtual {v0, p1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final removeTrack(Lhms/webrtc/RtpSender;)Z
    .locals 1

    const-string v0, "sender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhms/webrtc/PeerConnection;->removeTrack(Lhms/webrtc/RtpSender;)Z

    move-result p1

    return p1
.end method

.method public final setLocalDescription(Lhms/webrtc/SessionDescription;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/SessionDescription;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] setLocalDescription with type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lhms/webrtc/SessionDescription;->type:Lhms/webrtc/SessionDescription$Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " [size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lhms/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lhms/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSConnection"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    new-instance v3, Llive/hms/video/connection/HMSConnection$setLocalDescription$2;

    invoke-direct {v3, v0, p0, v2}, Llive/hms/video/connection/HMSConnection$setLocalDescription$2;-><init>(Lbc3/s;Llive/hms/video/connection/HMSConnection;Llive/hms/video/connection/models/HMSConnectionRole;)V

    invoke-virtual {v1, v3, p1}, Lhms/webrtc/PeerConnection;->setLocalDescription(Lhms/webrtc/SdpObserver;Lhms/webrtc/SessionDescription;)V

    invoke-virtual {v0, p2}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setNodeInfo(Ljava/lang/String;)V
    .locals 3

    const-string v0, "NodeInfo: set for class "

    const-string v1, "nodeInfo"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/connection/HMSConnection;->_nodeInfo:Ljava/lang/String;

    :try_start_0
    const-string v1, "SFUMIGRATION"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " role :="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    return-void
.end method

.method public final setRemoteDescription(Lhms/webrtc/SessionDescription;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/SessionDescription;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] setRemoteDescription with type="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lhms/webrtc/SessionDescription;->type:Lhms/webrtc/SessionDescription$Type;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " [size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lhms/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] description="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lhms/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "HMSConnection"

    invoke-virtual {v0, v2, v1}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    invoke-virtual {p0}, Llive/hms/video/connection/HMSConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/connection/HMSConnection;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    new-instance v3, Llive/hms/video/connection/HMSConnection$setRemoteDescription$2;

    invoke-direct {v3, v0, p0, v2}, Llive/hms/video/connection/HMSConnection$setRemoteDescription$2;-><init>(Lbc3/s;Llive/hms/video/connection/HMSConnection;Llive/hms/video/connection/models/HMSConnectionRole;)V

    invoke-virtual {v1, v3, p1}, Lhms/webrtc/PeerConnection;->setRemoteDescription(Lhms/webrtc/SdpObserver;Lhms/webrtc/SessionDescription;)V

    invoke-virtual {v0, p2}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
