.class public final Llive/hms/video/factories/IceCandidateFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\tJ$\u0010\n\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Llive/hms/video/factories/IceCandidateFactory;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "makeStunServer",
        "Lhms/webrtc/PeerConnection$IceServer;",
        "urls",
        "",
        "makeTurnServer",
        "username",
        "password",
        "DEFAULT_ICE_SERVERS",
        "getDEFAULT_ICE_SERVERS",
        "()Ljava/util/List;",
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
.field private static final DEFAULT_ICE_SERVERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhms/webrtc/PeerConnection$IceServer;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Llive/hms/video/factories/IceCandidateFactory;

.field private static final TAG:Ljava/lang/String; = "IceCandidateFactory"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/factories/IceCandidateFactory;

    invoke-direct {v0}, Llive/hms/video/factories/IceCandidateFactory;-><init>()V

    sput-object v0, Llive/hms/video/factories/IceCandidateFactory;->INSTANCE:Llive/hms/video/factories/IceCandidateFactory;

    const-string v1, "stun:stun.stunprotocol.org:3478"

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/factories/IceCandidateFactory;->makeStunServer(Ljava/util/List;)Lhms/webrtc/PeerConnection$IceServer;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Llive/hms/video/factories/IceCandidateFactory;->DEFAULT_ICE_SERVERS:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDEFAULT_ICE_SERVERS()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhms/webrtc/PeerConnection$IceServer;",
            ">;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/factories/IceCandidateFactory;->DEFAULT_ICE_SERVERS:Ljava/util/List;

    return-object v0
.end method

.method public final makeStunServer(Ljava/util/List;)Lhms/webrtc/PeerConnection$IceServer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lhms/webrtc/PeerConnection$IceServer;"
        }
    .end annotation

    const-string v0, "urls"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Building stun server with urls="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IceCandidateFactory"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lhms/webrtc/PeerConnection$IceServer;->builder(Ljava/util/List;)Lhms/webrtc/PeerConnection$IceServer$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lhms/webrtc/PeerConnection$IceServer$Builder;->createIceServer()Lhms/webrtc/PeerConnection$IceServer;

    move-result-object p1

    const-string v0, "createIceServer(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final makeTurnServer(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lhms/webrtc/PeerConnection$IceServer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lhms/webrtc/PeerConnection$IceServer;"
        }
    .end annotation

    const-string v0, "urls"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Building turn server with urls="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IceCandidateFactory"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lhms/webrtc/PeerConnection$IceServer;->builder(Ljava/util/List;)Lhms/webrtc/PeerConnection$IceServer$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lhms/webrtc/PeerConnection$IceServer$Builder;->setUsername(Ljava/lang/String;)Lhms/webrtc/PeerConnection$IceServer$Builder;

    invoke-virtual {p1, p3}, Lhms/webrtc/PeerConnection$IceServer$Builder;->setPassword(Ljava/lang/String;)Lhms/webrtc/PeerConnection$IceServer$Builder;

    invoke-virtual {p1}, Lhms/webrtc/PeerConnection$IceServer$Builder;->createIceServer()Lhms/webrtc/PeerConnection$IceServer;

    move-result-object p1

    const-string p2, "createIceServer(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
