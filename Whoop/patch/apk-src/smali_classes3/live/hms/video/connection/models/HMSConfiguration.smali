.class public final Llive/hms/video/connection/models/HMSConfiguration;
.super Lhms/webrtc/PeerConnection$RTCConfiguration;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/models/HMSConfiguration$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Llive/hms/video/connection/models/HMSConfiguration;",
        "Lhms/webrtc/PeerConnection$RTCConfiguration;",
        "",
        "Lhms/webrtc/PeerConnection$IceServer;",
        "iceServers",
        "<init>",
        "(Ljava/util/List;)V",
        "",
        "enable",
        "Ll83/a0;",
        "enableIceGatheringOnAnyAddressPorts",
        "(Z)V",
        "",
        "toString",
        "()Ljava/lang/String;",
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
.field public static final Companion:Llive/hms/video/connection/models/HMSConfiguration$Companion;

.field private static final TAG:Ljava/lang/String; = "HMSConfiguration"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/models/HMSConfiguration$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/models/HMSConfiguration$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/models/HMSConfiguration;->Companion:Llive/hms/video/connection/models/HMSConfiguration$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lhms/webrtc/PeerConnection$IceServer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "iceServers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhms/webrtc/PeerConnection$RTCConfiguration;-><init>(Ljava/util/List;)V

    sget-object p1, Lhms/webrtc/PeerConnection$SdpSemantics;->UNIFIED_PLAN:Lhms/webrtc/PeerConnection$SdpSemantics;

    iput-object p1, p0, Lhms/webrtc/PeerConnection$RTCConfiguration;->sdpSemantics:Lhms/webrtc/PeerConnection$SdpSemantics;

    return-void
.end method


# virtual methods
.method public final enableIceGatheringOnAnyAddressPorts(Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Lhms/webrtc/PeerConnection$PortAllocatorConfig;

    sget-object v0, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->ENABLE_ANY_ADDRESS_PORTS:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    filled-new-array {v0}, [Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    move-result-object v0

    invoke-direct {p1, v0}, Lhms/webrtc/PeerConnection$PortAllocatorConfig;-><init>([Lhms/webrtc/PeerConnection$PortAllocatorFlag;)V

    iput-object p1, p0, Lhms/webrtc/PeerConnection$RTCConfiguration;->portAllocatorConfig:Lhms/webrtc/PeerConnection$PortAllocatorConfig;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
