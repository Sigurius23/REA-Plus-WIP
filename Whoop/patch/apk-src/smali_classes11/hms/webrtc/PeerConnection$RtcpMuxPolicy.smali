.class public final enum Lhms/webrtc/PeerConnection$RtcpMuxPolicy;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RtcpMuxPolicy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/PeerConnection$RtcpMuxPolicy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

.field public static final enum NEGOTIATE:Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

.field public static final enum REQUIRE:Lhms/webrtc/PeerConnection$RtcpMuxPolicy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    const-string v1, "NEGOTIATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;->NEGOTIATE:Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    new-instance v1, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    const-string v2, "REQUIRE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;->REQUIRE:Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    filled-new-array {v0, v1}, [Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    move-result-object v0

    sput-object v0, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;->$VALUES:[Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/PeerConnection$RtcpMuxPolicy;
    .locals 1

    const-class v0, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/PeerConnection$RtcpMuxPolicy;
    .locals 1

    sget-object v0, Lhms/webrtc/PeerConnection$RtcpMuxPolicy;->$VALUES:[Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    invoke-virtual {v0}, [Lhms/webrtc/PeerConnection$RtcpMuxPolicy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/PeerConnection$RtcpMuxPolicy;

    return-object v0
.end method
