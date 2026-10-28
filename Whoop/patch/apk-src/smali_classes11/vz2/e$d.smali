.class Lvz2/e$d;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvz2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field private a:Lvz2/e$e;

.field final synthetic b:Lvz2/e;


# direct methods
.method private constructor <init>(Lvz2/e;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lvz2/e$d;->b:Lvz2/e;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    .line 3
    sget-object p1, Lvz2/e$e;->PREVIEW:Lvz2/e$e;

    iput-object p1, p0, Lvz2/e$d;->a:Lvz2/e$e;

    return-void
.end method

.method public synthetic constructor <init>(Lvz2/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lvz2/e$d;-><init>(Lvz2/e;)V

    return-void
.end method

.method private c(Landroid/hardware/camera2/CaptureResult;)V
    .locals 5

    iget-object v0, p0, Lvz2/e$d;->a:Lvz2/e$e;

    sget-object v1, Lvz2/e$e;->LOCKING:Lvz2/e$e;

    const/4 v2, 0x2

    const/4 v3, 0x4

    const/4 v4, 0x5

    if-ne v0, v1, :cond_4

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v3, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v4, :cond_8

    :cond_1
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v2, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lvz2/e$e;->LOCKED:Lvz2/e$e;

    invoke-virtual {p0, p1}, Lvz2/e$d;->d(Lvz2/e$e;)V

    invoke-virtual {p0}, Lvz2/e$d;->a()V

    return-void

    :cond_3
    :goto_0
    sget-object p1, Lvz2/e$e;->CAPTURING:Lvz2/e$e;

    invoke-virtual {p0, p1}, Lvz2/e$d;->d(Lvz2/e$e;)V

    invoke-virtual {p0}, Lvz2/e$d;->b()V

    return-void

    :cond_4
    sget-object v1, Lvz2/e$e;->PRECAPTURE:Lvz2/e$e;

    if-ne v0, v1, :cond_6

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v4, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v3, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v2, :cond_8

    :cond_5
    sget-object p1, Lvz2/e$e;->WAITING:Lvz2/e$e;

    invoke-virtual {p0, p1}, Lvz2/e$d;->d(Lvz2/e$e;)V

    return-void

    :cond_6
    sget-object v1, Lvz2/e$e;->WAITING:Lvz2/e$e;

    if-ne v0, v1, :cond_8

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v4, :cond_8

    :cond_7
    sget-object p1, Lvz2/e$e;->CAPTURING:Lvz2/e$e;

    invoke-virtual {p0, p1}, Lvz2/e$d;->d(Lvz2/e$e;)V

    invoke-virtual {p0}, Lvz2/e$d;->b()V

    :cond_8
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lvz2/e$d;->b:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->m(Lvz2/e;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v0, Lvz2/e$e;->PRECAPTURE:Lvz2/e$e;

    invoke-virtual {p0, v0}, Lvz2/e$d;->d(Lvz2/e$e;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v2, p0, Lvz2/e$d;->b:Lvz2/e;

    invoke-static {v2}, Lvz2/e;->j(Lvz2/e;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lvz2/e$d;->b:Lvz2/e;

    invoke-static {v2}, Lvz2/e;->j(Lvz2/e;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v2

    iget-object v3, p0, Lvz2/e$d;->b:Lvz2/e;

    invoke-static {v3}, Lvz2/e;->m(Lvz2/e;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, p0, v4}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    iget-object v2, p0, Lvz2/e$d;->b:Lvz2/e;

    invoke-static {v2}, Lvz2/e;->m(Lvz2/e;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    iget-object v2, p0, Lvz2/e$d;->b:Lvz2/e;

    invoke-static {v2}, Lvz2/e;->l(Lvz2/e;)Ltr2/n;

    move-result-object v2

    const-string v3, "Failed to run precapture sequence."

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v2, v3, v1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lvz2/e$d;->b:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->p(Lvz2/e;)V

    return-void
.end method

.method public d(Lvz2/e$e;)V
    .locals 0

    iput-object p1, p0, Lvz2/e$d;->a:Lvz2/e$e;

    return-void
.end method

.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    invoke-direct {p0, p3}, Lvz2/e$d;->c(Landroid/hardware/camera2/CaptureResult;)V

    return-void
.end method

.method public onCaptureProgressed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V
    .locals 0

    invoke-direct {p0, p3}, Lvz2/e$d;->c(Landroid/hardware/camera2/CaptureResult;)V

    return-void
.end method
