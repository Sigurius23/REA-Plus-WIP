.class public final enum Lhms/webrtc/PeerConnection$PeerConnectionState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PeerConnectionState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/PeerConnection$PeerConnectionState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/PeerConnection$PeerConnectionState;

.field public static final enum CLOSED:Lhms/webrtc/PeerConnection$PeerConnectionState;

.field public static final enum CONNECTED:Lhms/webrtc/PeerConnection$PeerConnectionState;

.field public static final enum CONNECTING:Lhms/webrtc/PeerConnection$PeerConnectionState;

.field public static final enum DISCONNECTED:Lhms/webrtc/PeerConnection$PeerConnectionState;

.field public static final enum FAILED:Lhms/webrtc/PeerConnection$PeerConnectionState;

.field public static final enum NEW:Lhms/webrtc/PeerConnection$PeerConnectionState;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lhms/webrtc/PeerConnection$PeerConnectionState;

    const-string v1, "NEW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhms/webrtc/PeerConnection$PeerConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhms/webrtc/PeerConnection$PeerConnectionState;->NEW:Lhms/webrtc/PeerConnection$PeerConnectionState;

    new-instance v1, Lhms/webrtc/PeerConnection$PeerConnectionState;

    const-string v2, "CONNECTING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhms/webrtc/PeerConnection$PeerConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lhms/webrtc/PeerConnection$PeerConnectionState;->CONNECTING:Lhms/webrtc/PeerConnection$PeerConnectionState;

    new-instance v2, Lhms/webrtc/PeerConnection$PeerConnectionState;

    const-string v3, "CONNECTED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lhms/webrtc/PeerConnection$PeerConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lhms/webrtc/PeerConnection$PeerConnectionState;->CONNECTED:Lhms/webrtc/PeerConnection$PeerConnectionState;

    new-instance v3, Lhms/webrtc/PeerConnection$PeerConnectionState;

    const-string v4, "DISCONNECTED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lhms/webrtc/PeerConnection$PeerConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lhms/webrtc/PeerConnection$PeerConnectionState;->DISCONNECTED:Lhms/webrtc/PeerConnection$PeerConnectionState;

    new-instance v4, Lhms/webrtc/PeerConnection$PeerConnectionState;

    const-string v5, "FAILED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lhms/webrtc/PeerConnection$PeerConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lhms/webrtc/PeerConnection$PeerConnectionState;->FAILED:Lhms/webrtc/PeerConnection$PeerConnectionState;

    new-instance v5, Lhms/webrtc/PeerConnection$PeerConnectionState;

    const-string v6, "CLOSED"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lhms/webrtc/PeerConnection$PeerConnectionState;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lhms/webrtc/PeerConnection$PeerConnectionState;->CLOSED:Lhms/webrtc/PeerConnection$PeerConnectionState;

    filled-new-array/range {v0 .. v5}, [Lhms/webrtc/PeerConnection$PeerConnectionState;

    move-result-object v0

    sput-object v0, Lhms/webrtc/PeerConnection$PeerConnectionState;->$VALUES:[Lhms/webrtc/PeerConnection$PeerConnectionState;

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

.method public static fromNativeIndex(I)Lhms/webrtc/PeerConnection$PeerConnectionState;
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
        value = "PeerConnectionState"
    .end annotation

    invoke-static {}, Lhms/webrtc/PeerConnection$PeerConnectionState;->values()[Lhms/webrtc/PeerConnection$PeerConnectionState;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/PeerConnection$PeerConnectionState;
    .locals 1

    const-class v0, Lhms/webrtc/PeerConnection$PeerConnectionState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/PeerConnection$PeerConnectionState;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/PeerConnection$PeerConnectionState;
    .locals 1

    sget-object v0, Lhms/webrtc/PeerConnection$PeerConnectionState;->$VALUES:[Lhms/webrtc/PeerConnection$PeerConnectionState;

    invoke-virtual {v0}, [Lhms/webrtc/PeerConnection$PeerConnectionState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/PeerConnection$PeerConnectionState;

    return-object v0
.end method
