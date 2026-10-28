.class public final enum Lhms/webrtc/EncodedImage$FrameType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/EncodedImage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FrameType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/EncodedImage$FrameType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/EncodedImage$FrameType;

.field public static final enum EmptyFrame:Lhms/webrtc/EncodedImage$FrameType;

.field public static final enum VideoFrameDelta:Lhms/webrtc/EncodedImage$FrameType;

.field public static final enum VideoFrameKey:Lhms/webrtc/EncodedImage$FrameType;


# instance fields
.field private final nativeIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lhms/webrtc/EncodedImage$FrameType;

    const-string v1, "EmptyFrame"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lhms/webrtc/EncodedImage$FrameType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhms/webrtc/EncodedImage$FrameType;->EmptyFrame:Lhms/webrtc/EncodedImage$FrameType;

    new-instance v1, Lhms/webrtc/EncodedImage$FrameType;

    const/4 v2, 0x1

    const/4 v3, 0x3

    const-string v4, "VideoFrameKey"

    invoke-direct {v1, v4, v2, v3}, Lhms/webrtc/EncodedImage$FrameType;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lhms/webrtc/EncodedImage$FrameType;->VideoFrameKey:Lhms/webrtc/EncodedImage$FrameType;

    new-instance v2, Lhms/webrtc/EncodedImage$FrameType;

    const/4 v3, 0x2

    const/4 v4, 0x4

    const-string v5, "VideoFrameDelta"

    invoke-direct {v2, v5, v3, v4}, Lhms/webrtc/EncodedImage$FrameType;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lhms/webrtc/EncodedImage$FrameType;->VideoFrameDelta:Lhms/webrtc/EncodedImage$FrameType;

    filled-new-array {v0, v1, v2}, [Lhms/webrtc/EncodedImage$FrameType;

    move-result-object v0

    sput-object v0, Lhms/webrtc/EncodedImage$FrameType;->$VALUES:[Lhms/webrtc/EncodedImage$FrameType;

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

    iput p3, p0, Lhms/webrtc/EncodedImage$FrameType;->nativeIndex:I

    return-void
.end method

.method public static fromNativeIndex(I)Lhms/webrtc/EncodedImage$FrameType;
    .locals 5
    .annotation build Lhms/webrtc/CalledByNative;
        value = "FrameType"
    .end annotation

    invoke-static {}, Lhms/webrtc/EncodedImage$FrameType;->values()[Lhms/webrtc/EncodedImage$FrameType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lhms/webrtc/EncodedImage$FrameType;->getNative()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown native frame type: "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/EncodedImage$FrameType;
    .locals 1

    const-class v0, Lhms/webrtc/EncodedImage$FrameType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/EncodedImage$FrameType;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/EncodedImage$FrameType;
    .locals 1

    sget-object v0, Lhms/webrtc/EncodedImage$FrameType;->$VALUES:[Lhms/webrtc/EncodedImage$FrameType;

    invoke-virtual {v0}, [Lhms/webrtc/EncodedImage$FrameType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/EncodedImage$FrameType;

    return-object v0
.end method


# virtual methods
.method public getNative()I
    .locals 1

    iget v0, p0, Lhms/webrtc/EncodedImage$FrameType;->nativeIndex:I

    return v0
.end method
