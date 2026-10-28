.class final enum Lhms/webrtc/HardwareVideoEncoder$YuvFormat$1;
.super Lhms/webrtc/HardwareVideoEncoder$YuvFormat;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/HardwareVideoEncoder$YuvFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "I420"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lhms/webrtc/HardwareVideoEncoder$YuvFormat$1;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lhms/webrtc/HardwareVideoEncoder$YuvFormat;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public fillBuffer(Ljava/nio/ByteBuffer;Lhms/webrtc/VideoFrame$Buffer;II)V
    .locals 14

    div-int/lit8 v11, p3, 0x2

    div-int/lit8 v12, p4, 0x2

    invoke-interface/range {p2 .. p2}, Lhms/webrtc/VideoFrame$Buffer;->toI420()Lhms/webrtc/VideoFrame$I420Buffer;

    move-result-object v13

    invoke-interface {v13}, Lhms/webrtc/VideoFrame$I420Buffer;->getDataY()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {v13}, Lhms/webrtc/VideoFrame$I420Buffer;->getStrideY()I

    move-result v1

    invoke-interface {v13}, Lhms/webrtc/VideoFrame$I420Buffer;->getDataU()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-interface {v13}, Lhms/webrtc/VideoFrame$I420Buffer;->getStrideU()I

    move-result v3

    invoke-interface {v13}, Lhms/webrtc/VideoFrame$I420Buffer;->getDataV()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-interface {v13}, Lhms/webrtc/VideoFrame$I420Buffer;->getStrideV()I

    move-result v5

    invoke-interface {v13}, Lhms/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v7

    invoke-interface {v13}, Lhms/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v8

    move-object v6, p1

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-static/range {v0 .. v12}, Lhms/webrtc/YuvHelper;->I420Copy(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIIIII)V

    invoke-interface {v13}, Lhms/webrtc/VideoFrame$Buffer;->release()V

    return-void
.end method
