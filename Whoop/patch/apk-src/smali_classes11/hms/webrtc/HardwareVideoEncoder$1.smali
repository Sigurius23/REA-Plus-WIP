.class Lhms/webrtc/HardwareVideoEncoder$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/HardwareVideoEncoder;->createOutputThread()Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/HardwareVideoEncoder;


# direct methods
.method public constructor <init>(Lhms/webrtc/HardwareVideoEncoder;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/HardwareVideoEncoder$1;->this$0:Lhms/webrtc/HardwareVideoEncoder;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    :goto_0
    iget-object v0, p0, Lhms/webrtc/HardwareVideoEncoder$1;->this$0:Lhms/webrtc/HardwareVideoEncoder;

    invoke-static {v0}, Lhms/webrtc/HardwareVideoEncoder;->b(Lhms/webrtc/HardwareVideoEncoder;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhms/webrtc/HardwareVideoEncoder$1;->this$0:Lhms/webrtc/HardwareVideoEncoder;

    invoke-virtual {v0}, Lhms/webrtc/HardwareVideoEncoder;->deliverEncodedImage()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhms/webrtc/HardwareVideoEncoder$1;->this$0:Lhms/webrtc/HardwareVideoEncoder;

    invoke-static {v0}, Lhms/webrtc/HardwareVideoEncoder;->c(Lhms/webrtc/HardwareVideoEncoder;)V

    return-void
.end method
