.class public final synthetic Lhms/webrtc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhms/webrtc/EglRenderer;


# direct methods
.method public synthetic constructor <init>(Lhms/webrtc/EglRenderer;I)V
    .locals 0

    iput p2, p0, Lhms/webrtc/d;->w:I

    iput-object p1, p0, Lhms/webrtc/d;->x:Lhms/webrtc/EglRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lhms/webrtc/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhms/webrtc/d;->x:Lhms/webrtc/EglRenderer;

    invoke-static {v0}, Lhms/webrtc/EglRenderer;->i(Lhms/webrtc/EglRenderer;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhms/webrtc/d;->x:Lhms/webrtc/EglRenderer;

    invoke-static {v0}, Lhms/webrtc/EglRenderer;->f(Lhms/webrtc/EglRenderer;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lhms/webrtc/d;->x:Lhms/webrtc/EglRenderer;

    invoke-static {v0}, Lhms/webrtc/EglRenderer;->h(Lhms/webrtc/EglRenderer;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
