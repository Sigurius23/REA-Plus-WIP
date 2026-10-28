.class public final enum Lhms/webrtc/VideoCodecStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/VideoCodecStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/VideoCodecStatus;

.field public static final enum ERROR:Lhms/webrtc/VideoCodecStatus;

.field public static final enum ERR_PARAMETER:Lhms/webrtc/VideoCodecStatus;

.field public static final enum ERR_REQUEST_SLI:Lhms/webrtc/VideoCodecStatus;

.field public static final enum ERR_SIZE:Lhms/webrtc/VideoCodecStatus;

.field public static final enum FALLBACK_SOFTWARE:Lhms/webrtc/VideoCodecStatus;

.field public static final enum LEVEL_EXCEEDED:Lhms/webrtc/VideoCodecStatus;

.field public static final enum MEMORY:Lhms/webrtc/VideoCodecStatus;

.field public static final enum NO_OUTPUT:Lhms/webrtc/VideoCodecStatus;

.field public static final enum OK:Lhms/webrtc/VideoCodecStatus;

.field public static final enum REQUEST_SLI:Lhms/webrtc/VideoCodecStatus;

.field public static final enum TARGET_BITRATE_OVERSHOOT:Lhms/webrtc/VideoCodecStatus;

.field public static final enum TIMEOUT:Lhms/webrtc/VideoCodecStatus;

.field public static final enum UNINITIALIZED:Lhms/webrtc/VideoCodecStatus;


# instance fields
.field private final number:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lhms/webrtc/VideoCodecStatus;

    const-string v1, "TARGET_BITRATE_OVERSHOOT"

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhms/webrtc/VideoCodecStatus;->TARGET_BITRATE_OVERSHOOT:Lhms/webrtc/VideoCodecStatus;

    new-instance v1, Lhms/webrtc/VideoCodecStatus;

    const-string v4, "REQUEST_SLI"

    const/4 v5, 0x1

    const/4 v6, 0x2

    invoke-direct {v1, v4, v5, v6}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lhms/webrtc/VideoCodecStatus;->REQUEST_SLI:Lhms/webrtc/VideoCodecStatus;

    move v4, v2

    new-instance v2, Lhms/webrtc/VideoCodecStatus;

    const-string v7, "NO_OUTPUT"

    invoke-direct {v2, v7, v6, v5}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lhms/webrtc/VideoCodecStatus;->NO_OUTPUT:Lhms/webrtc/VideoCodecStatus;

    move v5, v3

    new-instance v3, Lhms/webrtc/VideoCodecStatus;

    const-string v6, "OK"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v4}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lhms/webrtc/VideoCodecStatus;->OK:Lhms/webrtc/VideoCodecStatus;

    new-instance v4, Lhms/webrtc/VideoCodecStatus;

    const/4 v6, 0x4

    const/4 v7, -0x1

    const-string v8, "ERROR"

    invoke-direct {v4, v8, v6, v7}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lhms/webrtc/VideoCodecStatus;->ERROR:Lhms/webrtc/VideoCodecStatus;

    move v6, v5

    new-instance v5, Lhms/webrtc/VideoCodecStatus;

    const-string v7, "LEVEL_EXCEEDED"

    const/4 v8, -0x2

    invoke-direct {v5, v7, v6, v8}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lhms/webrtc/VideoCodecStatus;->LEVEL_EXCEEDED:Lhms/webrtc/VideoCodecStatus;

    new-instance v6, Lhms/webrtc/VideoCodecStatus;

    const/4 v7, 0x6

    const/4 v8, -0x3

    const-string v9, "MEMORY"

    invoke-direct {v6, v9, v7, v8}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lhms/webrtc/VideoCodecStatus;->MEMORY:Lhms/webrtc/VideoCodecStatus;

    new-instance v7, Lhms/webrtc/VideoCodecStatus;

    const/4 v8, 0x7

    const/4 v9, -0x4

    const-string v10, "ERR_PARAMETER"

    invoke-direct {v7, v10, v8, v9}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lhms/webrtc/VideoCodecStatus;->ERR_PARAMETER:Lhms/webrtc/VideoCodecStatus;

    new-instance v8, Lhms/webrtc/VideoCodecStatus;

    const/16 v9, 0x8

    const/4 v10, -0x5

    const-string v11, "ERR_SIZE"

    invoke-direct {v8, v11, v9, v10}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lhms/webrtc/VideoCodecStatus;->ERR_SIZE:Lhms/webrtc/VideoCodecStatus;

    new-instance v9, Lhms/webrtc/VideoCodecStatus;

    const/16 v10, 0x9

    const/4 v11, -0x6

    const-string v12, "TIMEOUT"

    invoke-direct {v9, v12, v10, v11}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lhms/webrtc/VideoCodecStatus;->TIMEOUT:Lhms/webrtc/VideoCodecStatus;

    new-instance v10, Lhms/webrtc/VideoCodecStatus;

    const/16 v11, 0xa

    const/4 v12, -0x7

    const-string v13, "UNINITIALIZED"

    invoke-direct {v10, v13, v11, v12}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lhms/webrtc/VideoCodecStatus;->UNINITIALIZED:Lhms/webrtc/VideoCodecStatus;

    new-instance v11, Lhms/webrtc/VideoCodecStatus;

    const/16 v12, 0xb

    const/16 v13, -0xc

    const-string v14, "ERR_REQUEST_SLI"

    invoke-direct {v11, v14, v12, v13}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lhms/webrtc/VideoCodecStatus;->ERR_REQUEST_SLI:Lhms/webrtc/VideoCodecStatus;

    new-instance v12, Lhms/webrtc/VideoCodecStatus;

    const/16 v13, 0xc

    const/16 v14, -0xd

    const-string v15, "FALLBACK_SOFTWARE"

    invoke-direct {v12, v15, v13, v14}, Lhms/webrtc/VideoCodecStatus;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lhms/webrtc/VideoCodecStatus;->FALLBACK_SOFTWARE:Lhms/webrtc/VideoCodecStatus;

    filled-new-array/range {v0 .. v12}, [Lhms/webrtc/VideoCodecStatus;

    move-result-object v0

    sput-object v0, Lhms/webrtc/VideoCodecStatus;->$VALUES:[Lhms/webrtc/VideoCodecStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lhms/webrtc/VideoCodecStatus;->number:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/VideoCodecStatus;
    .locals 1

    const-class v0, Lhms/webrtc/VideoCodecStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/VideoCodecStatus;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/VideoCodecStatus;
    .locals 1

    sget-object v0, Lhms/webrtc/VideoCodecStatus;->$VALUES:[Lhms/webrtc/VideoCodecStatus;

    invoke-virtual {v0}, [Lhms/webrtc/VideoCodecStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/VideoCodecStatus;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    iget v0, p0, Lhms/webrtc/VideoCodecStatus;->number:I

    return v0
.end method
