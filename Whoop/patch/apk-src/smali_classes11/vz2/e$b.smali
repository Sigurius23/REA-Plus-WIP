.class Lvz2/e$b;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvz2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvz2/e;


# direct methods
.method public constructor <init>(Lvz2/e;)V
    .locals 0

    iput-object p1, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    iget-object v0, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->j(Lvz2/e;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->j(Lvz2/e;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvz2/e$b;->a:Lvz2/e;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lvz2/e;->o(Lvz2/e;Landroid/hardware/camera2/CameraCaptureSession;)V

    :cond_0
    return-void
.end method

.method public onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    iget-object p1, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {p1}, Lvz2/e;->l(Lvz2/e;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to configure capture session"

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 4

    iget-object v0, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->f(Lvz2/e;)Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v0, p1}, Lvz2/e;->o(Lvz2/e;Landroid/hardware/camera2/CameraCaptureSession;)V

    iget-object p1, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {p1}, Lvz2/e;->r(Lvz2/e;)V

    iget-object p1, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {p1}, Lvz2/e;->k(Lvz2/e;)Llh3/b;

    move-result-object v0

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvz2/g;

    invoke-static {p1, v0}, Lvz2/e;->t(Lvz2/e;Lvz2/g;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->j(Lvz2/e;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->j(Lvz2/e;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    iget-object v1, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v1}, Lvz2/e;->m(Lvz2/e;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v2}, Lvz2/e;->i(Lvz2/e;)Lvz2/e$d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v1}, Lvz2/e;->l(Lvz2/e;)Ltr2/n;

    move-result-object v1

    const-string v2, "Failed to start camera preview"

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {p1}, Lvz2/e;->h(Lvz2/e;)Llh3/e;

    move-result-object p1

    invoke-virtual {p1, v0}, Llh3/e;->onError(Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    iget-object v1, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {v1}, Lvz2/e;->l(Lvz2/e;)Ltr2/n;

    move-result-object v1

    const-string v2, "Could not access camera"

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lvz2/e$b;->a:Lvz2/e;

    invoke-static {p1}, Lvz2/e;->h(Lvz2/e;)Llh3/e;

    move-result-object p1

    invoke-virtual {p1, v0}, Llh3/e;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    return-void
.end method
