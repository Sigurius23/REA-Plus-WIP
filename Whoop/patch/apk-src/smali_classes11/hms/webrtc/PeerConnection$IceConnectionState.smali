.class public final enum Lhms/webrtc/PeerConnection$IceConnectionState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IceConnectionState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/PeerConnection$IceConnectionState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/PeerConnection$IceConnectionState;

.field public static final enum CHECKING:Lhms/webrtc/PeerConnection$IceConnectionState;

.field public static final enum CLOSED:Lhms/webrtc/PeerConnection$IceConnectionState;

.field public static final enum COMPLETED:Lhms/webrtc/PeerConnection$IceConnectionState;

.field public static final enum CONNECTED:Lhms/webrtc/PeerConnection$IceConnectionState;

.field public static final enum DISCONNECTED:Lhms/webrtc/PeerConnection$IceConnectionState;

.field public static final enum FAILED:Lhms/webrtc/PeerConnection$IceConnectionState;

.field public static final enum NEW:Lhms/webrtc/PeerConnection$IceConnectionState;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lhms/webrtc/PeerConnection$IceConnectionState;

    const-string v1, "NEW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhms/webrtc/PeerConnection$IceConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhms/webrtc/PeerConnection$IceConnectionState;->NEW:Lhms/webrtc/PeerConnection$IceConnectionState;

    new-instance v1, Lhms/webrtc/PeerConnection$IceConnectionState;

    const-string v2, "CHECKING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhms/webrtc/PeerConnection$IceConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lhms/webrtc/PeerConnection$IceConnectionState;->CHECKING:Lhms/webrtc/PeerConnection$IceConnectionState;

    new-instance v2, Lhms/webrtc/PeerConnection$IceConnectionState;

    const-string v3, "CONNECTED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lhms/webrtc/PeerConnection$IceConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lhms/webrtc/PeerConnection$IceConnectionState;->CONNECTED:Lhms/webrtc/PeerConnection$IceConnectionState;

    new-instance v3, Lhms/webrtc/PeerConnection$IceConnectionState;

    const-string v4, "COMPLETED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lhms/webrtc/PeerConnection$IceConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lhms/webrtc/PeerConnection$IceConnectionState;->COMPLETED:Lhms/webrtc/PeerConnection$IceConnectionState;

    new-instance v4, Lhms/webrtc/PeerConnection$IceConnectionState;

    const-string v5, "FAILED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lhms/webrtc/PeerConnection$IceConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lhms/webrtc/PeerConnection$IceConnectionState;->FAILED:Lhms/webrtc/PeerConnection$IceConnectionState;

    new-instance v5, Lhms/webrtc/PeerConnection$IceConnectionState;

    const-string v6, "DISCONNECTED"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lhms/webrtc/PeerConnection$IceConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lhms/webrtc/PeerConnection$IceConnectionState;->DISCONNECTED:Lhms/webrtc/PeerConnection$IceConnectionState;

    new-instance v6, Lhms/webrtc/PeerConnection$IceConnectionState;

    const-string v7, "CLOSED"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lhms/webrtc/PeerConnection$IceConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lhms/webrtc/PeerConnection$IceConnectionState;->CLOSED:Lhms/webrtc/PeerConnection$IceConnectionState;

    filled-new-array/range {v0 .. v6}, [Lhms/webrtc/PeerConnection$IceConnectionState;

    move-result-object v0

    sput-object v0, Lhms/webrtc/PeerConnection$IceConnectionState;->$VALUES:[Lhms/webrtc/PeerConnection$IceConnectionState;

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

.method public static fromNativeIndex(I)Lhms/webrtc/PeerConnection$IceConnectionState;
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
        value = "IceConnectionState"
    .end annotation

    invoke-static {}, Lhms/webrtc/PeerConnection$IceConnectionState;->values()[Lhms/webrtc/PeerConnection$IceConnectionState;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/PeerConnection$IceConnectionState;
    .locals 1

    const-class v0, Lhms/webrtc/PeerConnection$IceConnectionState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/PeerConnection$IceConnectionState;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/PeerConnection$IceConnectionState;
    .locals 1

    sget-object v0, Lhms/webrtc/PeerConnection$IceConnectionState;->$VALUES:[Lhms/webrtc/PeerConnection$IceConnectionState;

    invoke-virtual {v0}, [Lhms/webrtc/PeerConnection$IceConnectionState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/PeerConnection$IceConnectionState;

    return-object v0
.end method
