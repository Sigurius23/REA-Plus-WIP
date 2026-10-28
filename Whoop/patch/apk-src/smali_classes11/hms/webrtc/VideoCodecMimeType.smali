.class final enum Lhms/webrtc/VideoCodecMimeType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/VideoCodecMimeType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/VideoCodecMimeType;

.field public static final enum AV1:Lhms/webrtc/VideoCodecMimeType;

.field public static final enum H264:Lhms/webrtc/VideoCodecMimeType;

.field public static final enum VP8:Lhms/webrtc/VideoCodecMimeType;

.field public static final enum VP9:Lhms/webrtc/VideoCodecMimeType;


# instance fields
.field private final mimeType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lhms/webrtc/VideoCodecMimeType;

    const/4 v1, 0x0

    const-string v2, "video/x-vnd.on2.vp8"

    const-string v3, "VP8"

    invoke-direct {v0, v3, v1, v2}, Lhms/webrtc/VideoCodecMimeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lhms/webrtc/VideoCodecMimeType;->VP8:Lhms/webrtc/VideoCodecMimeType;

    new-instance v1, Lhms/webrtc/VideoCodecMimeType;

    const/4 v2, 0x1

    const-string v3, "video/x-vnd.on2.vp9"

    const-string v4, "VP9"

    invoke-direct {v1, v4, v2, v3}, Lhms/webrtc/VideoCodecMimeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lhms/webrtc/VideoCodecMimeType;->VP9:Lhms/webrtc/VideoCodecMimeType;

    new-instance v2, Lhms/webrtc/VideoCodecMimeType;

    const/4 v3, 0x2

    const-string v4, "video/avc"

    const-string v5, "H264"

    invoke-direct {v2, v5, v3, v4}, Lhms/webrtc/VideoCodecMimeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lhms/webrtc/VideoCodecMimeType;->H264:Lhms/webrtc/VideoCodecMimeType;

    new-instance v3, Lhms/webrtc/VideoCodecMimeType;

    const/4 v4, 0x3

    const-string v5, "video/av01"

    const-string v6, "AV1"

    invoke-direct {v3, v6, v4, v5}, Lhms/webrtc/VideoCodecMimeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lhms/webrtc/VideoCodecMimeType;->AV1:Lhms/webrtc/VideoCodecMimeType;

    filled-new-array {v0, v1, v2, v3}, [Lhms/webrtc/VideoCodecMimeType;

    move-result-object v0

    sput-object v0, Lhms/webrtc/VideoCodecMimeType;->$VALUES:[Lhms/webrtc/VideoCodecMimeType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lhms/webrtc/VideoCodecMimeType;->mimeType:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/VideoCodecMimeType;
    .locals 1

    const-class v0, Lhms/webrtc/VideoCodecMimeType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/VideoCodecMimeType;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/VideoCodecMimeType;
    .locals 1

    sget-object v0, Lhms/webrtc/VideoCodecMimeType;->$VALUES:[Lhms/webrtc/VideoCodecMimeType;

    invoke-virtual {v0}, [Lhms/webrtc/VideoCodecMimeType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/VideoCodecMimeType;

    return-object v0
.end method


# virtual methods
.method public mimeType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhms/webrtc/VideoCodecMimeType;->mimeType:Ljava/lang/String;

    return-object v0
.end method
