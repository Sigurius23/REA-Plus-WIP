.class Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/VideoFrameDrawer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RGBABufferTextureUploader"
.end annotation


# instance fields
.field private copyBuffer:Ljava/nio/ByteBuffer;

.field textureId:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;IILjava/nio/ByteBuffer;I)I
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->uploadRgbaData(IILjava/nio/ByteBuffer;I)I

    move-result p0

    return p0
.end method

.method private uploadRgbaData(IILjava/nio/ByteBuffer;I)I
    .locals 17

    move-object/from16 v0, p0

    move/from16 v2, p4

    mul-int/lit8 v4, p1, 0x4

    const/4 v7, 0x0

    if-le v2, v4, :cond_0

    mul-int v1, v4, p2

    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v7

    :goto_0
    iget-object v3, v0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v7

    :goto_1
    if-ge v3, v1, :cond_2

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, v0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    :cond_2
    iget v1, v0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->textureId:I

    const/16 v3, 0xde1

    if-nez v1, :cond_3

    invoke-static {v3}, Lhms/webrtc/GlUtil;->generateTexture(I)I

    move-result v1

    :cond_3
    iput v1, v0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->textureId:I

    const v1, 0x84c0

    invoke-static {v1}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    iget v1, v0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->textureId:I

    invoke-static {v3, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    if-ne v2, v4, :cond_4

    move-object/from16 v16, p3

    goto :goto_2

    :cond_4
    iget-object v3, v0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    move/from16 v5, p1

    move/from16 v6, p2

    move-object/from16 v1, p3

    invoke-static/range {v1 .. v6}, Lhms/webrtc/YuvHelper;->copyPlane(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;III)V

    iget-object v1, v0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_5

    return v7

    :cond_5
    const/4 v1, 0x0

    move-object/from16 v16, v1

    :goto_2
    const/16 v14, 0x1908

    const/16 v15, 0x1401

    const/16 v8, 0xde1

    const/4 v9, 0x0

    const/16 v10, 0x1908

    const/4 v13, 0x0

    move/from16 v11, p1

    move/from16 v12, p2

    invoke-static/range {v8 .. v16}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    iget v1, v0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->textureId:I

    return v1
.end method


# virtual methods
.method public release()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    iget v0, p0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->textureId:I

    filled-new-array {v0}, [I

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    iput v2, p0, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->textureId:I

    return-void
.end method

.method public uploadFromBuffer(IILjava/nio/ByteBuffer;I)I
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lhms/webrtc/VideoFrameDrawer$RGBABufferTextureUploader;->uploadRgbaData(IILjava/nio/ByteBuffer;I)I

    move-result p1

    return p1
.end method
