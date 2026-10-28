.class Lvz2/e$c;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvz2/e;->v()V
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

    iput-object p1, p0, Lvz2/e$c;->a:Lvz2/e;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    iget-object p1, p0, Lvz2/e$c;->a:Lvz2/e;

    invoke-static {p1}, Lvz2/e;->q(Lvz2/e;)V

    return-void
.end method
