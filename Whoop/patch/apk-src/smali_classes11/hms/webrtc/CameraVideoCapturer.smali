.class public interface abstract Lhms/webrtc/CameraVideoCapturer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoCapturer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/CameraVideoCapturer$CameraStatistics;,
        Lhms/webrtc/CameraVideoCapturer$MediaRecorderHandler;,
        Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;,
        Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;,
        Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;
    }
.end annotation


# virtual methods
.method public addMediaRecorderToCamera(Landroid/media/MediaRecorder;Lhms/webrtc/CameraVideoCapturer$MediaRecorderHandler;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Deprecated and not implemented."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeMediaRecorderFromCamera(Lhms/webrtc/CameraVideoCapturer$MediaRecorderHandler;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Deprecated and not implemented."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
.end method

.method public abstract switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V
.end method
