.class public final Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/HMSPluginResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/plugin/video/HMSVideoPluginsManager;-><init>(Lhms/webrtc/VideoSource;Llive/hms/video/events/AnalyticsEventsService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "live/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1",
        "Llive/hms/video/sdk/HMSPluginResultListener;",
        "Lhms/webrtc/VideoFrame;",
        "output",
        "Ll83/a0;",
        "onOutputResult",
        "(Lhms/webrtc/VideoFrame;)V",
        "Llive/hms/video/sdk/ProcessTimeVariables;",
        "timeObject",
        "onTimeTaken",
        "(Llive/hms/video/sdk/ProcessTimeVariables;)V",
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

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOutputResult(Lhms/webrtc/VideoFrame;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-static {v0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getLocalSink$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Lhms/webrtc/VideoSink;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lhms/webrtc/VideoSink;->onFrame(Lhms/webrtc/VideoFrame;)V

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lhms/webrtc/VideoFrame$Buffer;->release()V

    :cond_1
    return-void
.end method

.method public onTimeTaken(Llive/hms/video/sdk/ProcessTimeVariables;)V
    .locals 7

    const-string v0, "timeObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-static {v0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getPlugins$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-static {v0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getAnalytics$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;

    move-result-object v1

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;->this$0:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-static {v0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->access$getPlugins$p(Llive/hms/video/plugin/video/HMSVideoPluginsManager;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "get(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Llive/hms/video/sdk/ProcessTimeVariables;->getTimeTakenWithML()J

    move-result-wide v3

    invoke-virtual {p1}, Llive/hms/video/sdk/ProcessTimeVariables;->getTimeTakenWithoutML()J

    move-result-wide v5

    invoke-virtual/range {v1 .. v6}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processTime(Ljava/lang/String;JJ)V

    :cond_0
    return-void
.end method
