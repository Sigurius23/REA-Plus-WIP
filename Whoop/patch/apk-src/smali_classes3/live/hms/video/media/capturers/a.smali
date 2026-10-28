.class public final synthetic Llive/hms/video/media/capturers/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/video/media/capturers/HMSCameraCapturer;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/media/capturers/HMSCameraCapturer;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/media/capturers/a;->w:I

    iput-object p1, p0, Llive/hms/video/media/capturers/a;->x:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Llive/hms/video/media/capturers/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/media/capturers/a;->x:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {v0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->c(Llive/hms/video/media/capturers/HMSCameraCapturer;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/media/capturers/a;->x:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {v0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->d(Llive/hms/video/media/capturers/HMSCameraCapturer;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Llive/hms/video/media/capturers/a;->x:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {v0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->b(Llive/hms/video/media/capturers/HMSCameraCapturer;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
