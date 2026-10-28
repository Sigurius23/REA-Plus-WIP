.class public final synthetic Lhms/webrtc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoSink;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lhms/webrtc/a;->w:I

    iput-object p1, p0, Lhms/webrtc/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFrame(Lhms/webrtc/VideoFrame;)V
    .locals 1

    iget v0, p0, Lhms/webrtc/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhms/webrtc/a;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/VideoSource;

    invoke-static {v0, p1}, Lhms/webrtc/VideoSource;->c(Lhms/webrtc/VideoSource;Lhms/webrtc/VideoFrame;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhms/webrtc/a;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/Camera2Session$CaptureSessionCallback;

    invoke-static {v0, p1}, Lhms/webrtc/Camera2Session$CaptureSessionCallback;->a(Lhms/webrtc/Camera2Session$CaptureSessionCallback;Lhms/webrtc/VideoFrame;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lhms/webrtc/a;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/Camera1Session;

    invoke-static {v0, p1}, Lhms/webrtc/Camera1Session;->a(Lhms/webrtc/Camera1Session;Lhms/webrtc/VideoFrame;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
