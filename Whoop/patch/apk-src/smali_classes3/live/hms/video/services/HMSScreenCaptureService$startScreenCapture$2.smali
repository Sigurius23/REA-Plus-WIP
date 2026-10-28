.class public final Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/CapturerObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/services/HMSScreenCaptureService;->startScreenCapture(Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Lhms/webrtc/VideoSource;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "live/hms/video/services/HMSScreenCaptureService$startScreenCapture$2",
        "Lhms/webrtc/CapturerObserver;",
        "",
        "success",
        "Ll83/a0;",
        "onCapturerStarted",
        "(Z)V",
        "onCapturerStopped",
        "()V",
        "Lhms/webrtc/VideoFrame;",
        "frame",
        "onFrameCaptured",
        "(Lhms/webrtc/VideoFrame;)V",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $source:Lhms/webrtc/VideoSource;

.field final synthetic this$0:Llive/hms/video/services/HMSScreenCaptureService;


# direct methods
.method public constructor <init>(Lhms/webrtc/VideoSource;Llive/hms/video/services/HMSScreenCaptureService;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$2;->$source:Lhms/webrtc/VideoSource;

    iput-object p2, p0, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$2;->this$0:Llive/hms/video/services/HMSScreenCaptureService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCapturerStarted(Z)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$2;->$source:Lhms/webrtc/VideoSource;

    invoke-virtual {v0}, Lhms/webrtc/VideoSource;->getCapturerObserver()Lhms/webrtc/CapturerObserver;

    move-result-object v0

    invoke-interface {v0, p1}, Lhms/webrtc/CapturerObserver;->onCapturerStarted(Z)V

    return-void
.end method

.method public onCapturerStopped()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$2;->$source:Lhms/webrtc/VideoSource;

    invoke-virtual {v0}, Lhms/webrtc/VideoSource;->getCapturerObserver()Lhms/webrtc/CapturerObserver;

    move-result-object v0

    invoke-interface {v0}, Lhms/webrtc/CapturerObserver;->onCapturerStopped()V

    return-void
.end method

.method public onFrameCaptured(Lhms/webrtc/VideoFrame;)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$2;->$source:Lhms/webrtc/VideoSource;

    invoke-virtual {v0}, Lhms/webrtc/VideoSource;->getCapturerObserver()Lhms/webrtc/CapturerObserver;

    move-result-object v0

    invoke-interface {v0, p1}, Lhms/webrtc/CapturerObserver;->onFrameCaptured(Lhms/webrtc/VideoFrame;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$2;->this$0:Llive/hms/video/services/HMSScreenCaptureService;

    invoke-static {v0, p1}, Llive/hms/video/services/HMSScreenCaptureService;->access$checkForOrientationChange(Llive/hms/video/services/HMSScreenCaptureService;Lhms/webrtc/VideoFrame;)V

    :cond_0
    return-void
.end method
