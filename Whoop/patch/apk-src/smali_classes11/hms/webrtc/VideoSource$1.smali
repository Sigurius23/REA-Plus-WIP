.class Lhms/webrtc/VideoSource$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/CapturerObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/VideoSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/VideoSource;


# direct methods
.method public constructor <init>(Lhms/webrtc/VideoSource;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCapturerStarted(Z)V
    .locals 2

    iget-object v0, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v0}, Lhms/webrtc/VideoSource;->d(Lhms/webrtc/VideoSource;)Lhms/webrtc/NativeAndroidVideoTrackSource;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhms/webrtc/NativeAndroidVideoTrackSource;->setState(Z)V

    iget-object v0, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v0}, Lhms/webrtc/VideoSource;->f(Lhms/webrtc/VideoSource;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v1, p1}, Lhms/webrtc/VideoSource;->g(Lhms/webrtc/VideoSource;Z)V

    iget-object v1, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v1}, Lhms/webrtc/VideoSource;->e(Lhms/webrtc/VideoSource;)Lhms/webrtc/VideoProcessor;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v1}, Lhms/webrtc/VideoSource;->e(Lhms/webrtc/VideoSource;)Lhms/webrtc/VideoProcessor;

    move-result-object v1

    invoke-interface {v1, p1}, Lhms/webrtc/CapturerObserver;->onCapturerStarted(Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onCapturerStopped()V
    .locals 3

    iget-object v0, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v0}, Lhms/webrtc/VideoSource;->d(Lhms/webrtc/VideoSource;)Lhms/webrtc/NativeAndroidVideoTrackSource;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhms/webrtc/NativeAndroidVideoTrackSource;->setState(Z)V

    iget-object v0, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v0}, Lhms/webrtc/VideoSource;->f(Lhms/webrtc/VideoSource;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v2, v1}, Lhms/webrtc/VideoSource;->g(Lhms/webrtc/VideoSource;Z)V

    iget-object v1, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v1}, Lhms/webrtc/VideoSource;->e(Lhms/webrtc/VideoSource;)Lhms/webrtc/VideoProcessor;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v1}, Lhms/webrtc/VideoSource;->e(Lhms/webrtc/VideoSource;)Lhms/webrtc/VideoProcessor;

    move-result-object v1

    invoke-interface {v1}, Lhms/webrtc/CapturerObserver;->onCapturerStopped()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onFrameCaptured(Lhms/webrtc/VideoFrame;)V
    .locals 3

    iget-object v0, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v0}, Lhms/webrtc/VideoSource;->d(Lhms/webrtc/VideoSource;)Lhms/webrtc/NativeAndroidVideoTrackSource;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhms/webrtc/NativeAndroidVideoTrackSource;->adaptFrame(Lhms/webrtc/VideoFrame;)Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v1}, Lhms/webrtc/VideoSource;->f(Lhms/webrtc/VideoSource;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v2}, Lhms/webrtc/VideoSource;->e(Lhms/webrtc/VideoSource;)Lhms/webrtc/VideoProcessor;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v2}, Lhms/webrtc/VideoSource;->e(Lhms/webrtc/VideoSource;)Lhms/webrtc/VideoProcessor;

    move-result-object v2

    invoke-interface {v2, p1, v0}, Lhms/webrtc/VideoProcessor;->onFrameCaptured(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v0}, Lhms/webrtc/VideoProcessor;->applyFrameAdaptationParameters(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;)Lhms/webrtc/VideoFrame;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lhms/webrtc/VideoSource$1;->this$0:Lhms/webrtc/VideoSource;

    invoke-static {v0}, Lhms/webrtc/VideoSource;->d(Lhms/webrtc/VideoSource;)Lhms/webrtc/NativeAndroidVideoTrackSource;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhms/webrtc/NativeAndroidVideoTrackSource;->onFrameCaptured(Lhms/webrtc/VideoFrame;)V

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->release()V

    :cond_1
    return-void

    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
