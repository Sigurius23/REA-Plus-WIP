.class Lhms/webrtc/AndroidVideoDecoder$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/AndroidVideoDecoder;->createOutputThread()Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/AndroidVideoDecoder;


# direct methods
.method public constructor <init>(Lhms/webrtc/AndroidVideoDecoder;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/AndroidVideoDecoder$1;->this$0:Lhms/webrtc/AndroidVideoDecoder;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lhms/webrtc/AndroidVideoDecoder$1;->this$0:Lhms/webrtc/AndroidVideoDecoder;

    new-instance v1, Lhms/webrtc/ThreadUtils$ThreadChecker;

    invoke-direct {v1}, Lhms/webrtc/ThreadUtils$ThreadChecker;-><init>()V

    invoke-static {v0, v1}, Lhms/webrtc/AndroidVideoDecoder;->b(Lhms/webrtc/AndroidVideoDecoder;Lhms/webrtc/ThreadUtils$ThreadChecker;)V

    :goto_0
    iget-object v0, p0, Lhms/webrtc/AndroidVideoDecoder$1;->this$0:Lhms/webrtc/AndroidVideoDecoder;

    invoke-static {v0}, Lhms/webrtc/AndroidVideoDecoder;->a(Lhms/webrtc/AndroidVideoDecoder;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhms/webrtc/AndroidVideoDecoder$1;->this$0:Lhms/webrtc/AndroidVideoDecoder;

    invoke-virtual {v0}, Lhms/webrtc/AndroidVideoDecoder;->deliverDecodedFrame()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhms/webrtc/AndroidVideoDecoder$1;->this$0:Lhms/webrtc/AndroidVideoDecoder;

    invoke-static {v0}, Lhms/webrtc/AndroidVideoDecoder;->c(Lhms/webrtc/AndroidVideoDecoder;)V

    return-void
.end method
