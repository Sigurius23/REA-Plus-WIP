.class public final enum Lhms/webrtc/PeerConnection$KeyType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "KeyType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/PeerConnection$KeyType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/PeerConnection$KeyType;

.field public static final enum ECDSA:Lhms/webrtc/PeerConnection$KeyType;

.field public static final enum RSA:Lhms/webrtc/PeerConnection$KeyType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lhms/webrtc/PeerConnection$KeyType;

    const-string v1, "RSA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhms/webrtc/PeerConnection$KeyType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhms/webrtc/PeerConnection$KeyType;->RSA:Lhms/webrtc/PeerConnection$KeyType;

    new-instance v1, Lhms/webrtc/PeerConnection$KeyType;

    const-string v2, "ECDSA"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhms/webrtc/PeerConnection$KeyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lhms/webrtc/PeerConnection$KeyType;->ECDSA:Lhms/webrtc/PeerConnection$KeyType;

    filled-new-array {v0, v1}, [Lhms/webrtc/PeerConnection$KeyType;

    move-result-object v0

    sput-object v0, Lhms/webrtc/PeerConnection$KeyType;->$VALUES:[Lhms/webrtc/PeerConnection$KeyType;

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

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/PeerConnection$KeyType;
    .locals 1

    const-class v0, Lhms/webrtc/PeerConnection$KeyType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/PeerConnection$KeyType;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/PeerConnection$KeyType;
    .locals 1

    sget-object v0, Lhms/webrtc/PeerConnection$KeyType;->$VALUES:[Lhms/webrtc/PeerConnection$KeyType;

    invoke-virtual {v0}, [Lhms/webrtc/PeerConnection$KeyType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/PeerConnection$KeyType;

    return-object v0
.end method
