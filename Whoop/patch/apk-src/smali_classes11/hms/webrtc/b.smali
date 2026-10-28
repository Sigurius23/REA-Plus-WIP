.class public final synthetic Lhms/webrtc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhms/webrtc/Camera1Session$2;

.field public final synthetic y:[B


# direct methods
.method public synthetic constructor <init>(Lhms/webrtc/Camera1Session$2;[BI)V
    .locals 0

    iput p3, p0, Lhms/webrtc/b;->w:I

    iput-object p1, p0, Lhms/webrtc/b;->x:Lhms/webrtc/Camera1Session$2;

    iput-object p2, p0, Lhms/webrtc/b;->y:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lhms/webrtc/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhms/webrtc/b;->x:Lhms/webrtc/Camera1Session$2;

    iget-object v1, p0, Lhms/webrtc/b;->y:[B

    invoke-static {v0, v1}, Lhms/webrtc/Camera1Session$2;->b(Lhms/webrtc/Camera1Session$2;[B)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhms/webrtc/b;->x:Lhms/webrtc/Camera1Session$2;

    iget-object v1, p0, Lhms/webrtc/b;->y:[B

    invoke-static {v0, v1}, Lhms/webrtc/Camera1Session$2;->a(Lhms/webrtc/Camera1Session$2;[B)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
