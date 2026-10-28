.class abstract enum Lhms/webrtc/HardwareVideoEncoder$YuvFormat;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/HardwareVideoEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "YuvFormat"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/HardwareVideoEncoder$YuvFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

.field public static final enum I420:Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

.field public static final enum NV12:Lhms/webrtc/HardwareVideoEncoder$YuvFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lhms/webrtc/HardwareVideoEncoder$YuvFormat$1;

    invoke-direct {v0}, Lhms/webrtc/HardwareVideoEncoder$YuvFormat$1;-><init>()V

    sput-object v0, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;->I420:Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    new-instance v1, Lhms/webrtc/HardwareVideoEncoder$YuvFormat$2;

    invoke-direct {v1}, Lhms/webrtc/HardwareVideoEncoder$YuvFormat$2;-><init>()V

    sput-object v1, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;->NV12:Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    const/4 v2, 0x2

    new-array v2, v2, [Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;->$VALUES:[Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(I)Lhms/webrtc/HardwareVideoEncoder$YuvFormat;
    .locals 2

    const/16 v0, 0x13

    if-eq p0, v0, :cond_2

    const/16 v0, 0x15

    if-eq p0, v0, :cond_1

    const v0, 0x7fa30c00

    if-eq p0, v0, :cond_1

    const v0, 0x7fa30c04

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported colorFormat: "

    .line 3
    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_1
    :goto_0
    sget-object p0, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;->NV12:Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object p0

    .line 6
    :cond_2
    sget-object p0, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;->I420:Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/HardwareVideoEncoder$YuvFormat;
    .locals 1

    .line 1
    const-class v0, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/HardwareVideoEncoder$YuvFormat;
    .locals 1

    sget-object v0, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;->$VALUES:[Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    invoke-virtual {v0}, [Lhms/webrtc/HardwareVideoEncoder$YuvFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object v0
.end method


# virtual methods
.method public abstract fillBuffer(Ljava/nio/ByteBuffer;Lhms/webrtc/VideoFrame$Buffer;II)V
.end method
