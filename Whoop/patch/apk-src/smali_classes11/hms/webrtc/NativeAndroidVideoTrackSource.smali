.class Lhms/webrtc/NativeAndroidVideoTrackSource;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final nativeAndroidVideoTrackSource:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeAndroidVideoTrackSource:J

    return-void
.end method

.method public static createFrameAdaptationParameters(IIIIIIJZ)Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;
    .locals 10
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    new-instance v0, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-wide/from16 v7, p6

    move/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;-><init>(IIIIIIJZ)V

    return-object v0
.end method

.method private static native nativeAdaptFrame(JIIIJ)Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;
.end method

.method private static native nativeAdaptOutputFormat(JIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/Integer;)V
.end method

.method private static native nativeOnFrameCaptured(JIJLhms/webrtc/VideoFrame$Buffer;)V
.end method

.method private static native nativeSetIsScreencast(JZ)V
.end method

.method private static native nativeSetState(JZ)V
.end method


# virtual methods
.method public adaptFrame(Lhms/webrtc/VideoFrame;)Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;
    .locals 7

    iget-wide v0, p0, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeAndroidVideoTrackSource:J

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v2

    invoke-interface {v2}, Lhms/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v3

    invoke-interface {v3}, Lhms/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v3

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getRotation()I

    move-result v4

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v5

    invoke-static/range {v0 .. v6}, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeAdaptFrame(JIIIJ)Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;

    move-result-object p1

    return-object p1
.end method

.method public adaptOutputFormat(Lhms/webrtc/VideoSource$AspectRatio;Ljava/lang/Integer;Lhms/webrtc/VideoSource$AspectRatio;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 9

    iget-wide v0, p0, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeAndroidVideoTrackSource:J

    iget v2, p1, Lhms/webrtc/VideoSource$AspectRatio;->width:I

    iget v3, p1, Lhms/webrtc/VideoSource$AspectRatio;->height:I

    iget v5, p3, Lhms/webrtc/VideoSource$AspectRatio;->width:I

    iget v6, p3, Lhms/webrtc/VideoSource$AspectRatio;->height:I

    move-object v4, p2

    move-object v7, p4

    move-object v8, p5

    invoke-static/range {v0 .. v8}, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeAdaptOutputFormat(JIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public onFrameCaptured(Lhms/webrtc/VideoFrame;)V
    .locals 6

    iget-wide v0, p0, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeAndroidVideoTrackSource:J

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getRotation()I

    move-result v2

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v3

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeOnFrameCaptured(JIJLhms/webrtc/VideoFrame$Buffer;)V

    return-void
.end method

.method public setIsScreencast(Z)V
    .locals 2

    iget-wide v0, p0, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeAndroidVideoTrackSource:J

    invoke-static {v0, v1, p1}, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeSetIsScreencast(JZ)V

    return-void
.end method

.method public setState(Z)V
    .locals 2

    iget-wide v0, p0, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeAndroidVideoTrackSource:J

    invoke-static {v0, v1, p1}, Lhms/webrtc/NativeAndroidVideoTrackSource;->nativeSetState(JZ)V

    return-void
.end method
