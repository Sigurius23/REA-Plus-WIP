.class public Lhms/webrtc/FileVideoCapturer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoCapturer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/FileVideoCapturer$VideoReaderY4M;,
        Lhms/webrtc/FileVideoCapturer$VideoReader;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FileVideoCapturer"


# instance fields
.field private capturerObserver:Lhms/webrtc/CapturerObserver;

.field private final tickTask:Ljava/util/TimerTask;

.field private final timer:Ljava/util/Timer;

.field private final videoReader:Lhms/webrtc/FileVideoCapturer$VideoReader;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lhms/webrtc/FileVideoCapturer;->timer:Ljava/util/Timer;

    new-instance v0, Lhms/webrtc/FileVideoCapturer$1;

    invoke-direct {v0, p0}, Lhms/webrtc/FileVideoCapturer$1;-><init>(Lhms/webrtc/FileVideoCapturer;)V

    iput-object v0, p0, Lhms/webrtc/FileVideoCapturer;->tickTask:Ljava/util/TimerTask;

    :try_start_0
    new-instance v0, Lhms/webrtc/FileVideoCapturer$VideoReaderY4M;

    invoke-direct {v0, p1}, Lhms/webrtc/FileVideoCapturer$VideoReaderY4M;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lhms/webrtc/FileVideoCapturer;->videoReader:Lhms/webrtc/FileVideoCapturer$VideoReader;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "FileVideoCapturer"

    const-string v2, "Could not open video file: "

    invoke-static {v2, p1, v1}, Lhc3/i;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public changeCaptureFormat(III)V
    .locals 0

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/FileVideoCapturer;->videoReader:Lhms/webrtc/FileVideoCapturer$VideoReader;

    invoke-interface {v0}, Lhms/webrtc/FileVideoCapturer$VideoReader;->close()V

    return-void
.end method

.method public initialize(Lhms/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lhms/webrtc/CapturerObserver;)V
    .locals 0

    iput-object p3, p0, Lhms/webrtc/FileVideoCapturer;->capturerObserver:Lhms/webrtc/CapturerObserver;

    return-void
.end method

.method public isScreencast()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public startCapture(III)V
    .locals 6

    iget-object v0, p0, Lhms/webrtc/FileVideoCapturer;->timer:Ljava/util/Timer;

    iget-object v1, p0, Lhms/webrtc/FileVideoCapturer;->tickTask:Ljava/util/TimerTask;

    const/16 p1, 0x3e8

    div-int/2addr p1, p3

    int-to-long v4, p1

    const-wide/16 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public stopCapture()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, Lhms/webrtc/FileVideoCapturer;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    return-void
.end method

.method public tick()V
    .locals 2

    iget-object v0, p0, Lhms/webrtc/FileVideoCapturer;->videoReader:Lhms/webrtc/FileVideoCapturer$VideoReader;

    invoke-interface {v0}, Lhms/webrtc/FileVideoCapturer$VideoReader;->getNextFrame()Lhms/webrtc/VideoFrame;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/FileVideoCapturer;->capturerObserver:Lhms/webrtc/CapturerObserver;

    invoke-interface {v1, v0}, Lhms/webrtc/CapturerObserver;->onFrameCaptured(Lhms/webrtc/VideoFrame;)V

    invoke-virtual {v0}, Lhms/webrtc/VideoFrame;->release()V

    return-void
.end method
