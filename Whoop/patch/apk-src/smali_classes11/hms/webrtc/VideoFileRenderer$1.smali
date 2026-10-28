.class Lhms/webrtc/VideoFileRenderer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/VideoFileRenderer;-><init>(Ljava/lang/String;IILhms/webrtc/EglBase$Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/VideoFileRenderer;

.field final synthetic val$sharedContext:Lhms/webrtc/EglBase$Context;


# direct methods
.method public constructor <init>(Lhms/webrtc/VideoFileRenderer;Lhms/webrtc/EglBase$Context;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/VideoFileRenderer$1;->this$0:Lhms/webrtc/VideoFileRenderer;

    iput-object p2, p0, Lhms/webrtc/VideoFileRenderer$1;->val$sharedContext:Lhms/webrtc/EglBase$Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lhms/webrtc/VideoFileRenderer$1;->this$0:Lhms/webrtc/VideoFileRenderer;

    iget-object v1, p0, Lhms/webrtc/VideoFileRenderer$1;->val$sharedContext:Lhms/webrtc/EglBase$Context;

    sget-object v2, Lhms/webrtc/EglBase;->CONFIG_PIXEL_BUFFER:[I

    invoke-static {v1, v2}, Lhms/webrtc/EglBase;->create(Lhms/webrtc/EglBase$Context;[I)Lhms/webrtc/EglBase;

    move-result-object v1

    invoke-static {v0, v1}, Lhms/webrtc/VideoFileRenderer;->f(Lhms/webrtc/VideoFileRenderer;Lhms/webrtc/EglBase;)V

    iget-object v0, p0, Lhms/webrtc/VideoFileRenderer$1;->this$0:Lhms/webrtc/VideoFileRenderer;

    invoke-static {v0}, Lhms/webrtc/VideoFileRenderer;->e(Lhms/webrtc/VideoFileRenderer;)Lhms/webrtc/EglBase;

    move-result-object v0

    invoke-interface {v0}, Lhms/webrtc/EglBase;->createDummyPbufferSurface()V

    iget-object v0, p0, Lhms/webrtc/VideoFileRenderer$1;->this$0:Lhms/webrtc/VideoFileRenderer;

    invoke-static {v0}, Lhms/webrtc/VideoFileRenderer;->e(Lhms/webrtc/VideoFileRenderer;)Lhms/webrtc/EglBase;

    move-result-object v0

    invoke-interface {v0}, Lhms/webrtc/EglBase;->makeCurrent()V

    iget-object v0, p0, Lhms/webrtc/VideoFileRenderer$1;->this$0:Lhms/webrtc/VideoFileRenderer;

    new-instance v1, Lhms/webrtc/YuvConverter;

    invoke-direct {v1}, Lhms/webrtc/YuvConverter;-><init>()V

    invoke-static {v0, v1}, Lhms/webrtc/VideoFileRenderer;->g(Lhms/webrtc/VideoFileRenderer;Lhms/webrtc/YuvConverter;)V

    return-void
.end method
