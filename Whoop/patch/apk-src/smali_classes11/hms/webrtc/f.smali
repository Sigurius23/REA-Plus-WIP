.class public final synthetic Lhms/webrtc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;FFFFI)V
    .locals 0

    iput p6, p0, Lhms/webrtc/f;->w:I

    iput-object p1, p0, Lhms/webrtc/f;->F:Ljava/lang/Object;

    iput p2, p0, Lhms/webrtc/f;->x:F

    iput p3, p0, Lhms/webrtc/f;->y:F

    iput p4, p0, Lhms/webrtc/f;->z:F

    iput p5, p0, Lhms/webrtc/f;->E:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lhms/webrtc/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhms/webrtc/f;->F:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/EglRenderer;

    iget v1, p0, Lhms/webrtc/f;->z:F

    iget v2, p0, Lhms/webrtc/f;->E:F

    iget v3, p0, Lhms/webrtc/f;->x:F

    iget v4, p0, Lhms/webrtc/f;->y:F

    invoke-static {v0, v3, v4, v1, v2}, Lorg/webrtc/EglRenderer;->c(Lorg/webrtc/EglRenderer;FFFF)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhms/webrtc/f;->F:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/EglRenderer;

    iget v1, p0, Lhms/webrtc/f;->z:F

    iget v2, p0, Lhms/webrtc/f;->E:F

    iget v3, p0, Lhms/webrtc/f;->x:F

    iget v4, p0, Lhms/webrtc/f;->y:F

    invoke-static {v0, v3, v4, v1, v2}, Lhms/webrtc/EglRenderer;->j(Lhms/webrtc/EglRenderer;FFFF)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
