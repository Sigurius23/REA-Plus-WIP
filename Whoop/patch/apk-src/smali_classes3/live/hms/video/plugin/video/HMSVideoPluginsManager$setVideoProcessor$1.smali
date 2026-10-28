.class public final Llive/hms/video/plugin/video/HMSVideoPluginsManager$setVideoProcessor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoProcessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/plugin/video/HMSVideoPluginsManager;->setVideoProcessor()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "live/hms/video/plugin/video/HMSVideoPluginsManager$setVideoProcessor$1",
        "Lhms/webrtc/VideoProcessor;",
        "",
        "p0",
        "Ll83/a0;",
        "onCapturerStarted",
        "(Z)V",
        "onCapturerStopped",
        "()V",
        "Lhms/webrtc/VideoFrame;",
        "frame",
        "onFrameCaptured",
        "(Lhms/webrtc/VideoFrame;)V",
        "Lhms/webrtc/VideoSink;",
        "sink",
        "setSink",
        "(Lhms/webrtc/VideoSink;)V",
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
.field final synthetic this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;


# direct methods
.method public constructor <init>(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$setVideoProcessor$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCapturerStarted(Z)V
    .locals 0

    return-void
.end method

.method public onCapturerStopped()V
    .locals 0

    return-void
.end method

.method public onFrameCaptured(Lhms/webrtc/VideoFrame;)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$setVideoProcessor$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-static {v0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getPlugins$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$setVideoProcessor$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-virtual {v0, p1}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->pluginsProcessing(Lhms/webrtc/VideoFrame;)V

    return-void

    :cond_0
    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$setVideoProcessor$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-static {v0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getLocalSink$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Lhms/webrtc/VideoSink;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lhms/webrtc/VideoSink;->onFrame(Lhms/webrtc/VideoFrame;)V

    :cond_1
    return-void
.end method

.method public setSink(Lhms/webrtc/VideoSink;)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$setVideoProcessor$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-static {v0, p1}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$setLocalSink$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;Lhms/webrtc/VideoSink;)V

    const-string p1, "HMSVideoPluginsManager"

    const-string v0, "set local sink"

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
