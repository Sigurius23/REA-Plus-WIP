.class Lvz2/e$a;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
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

    iput-object p1, p0, Lvz2/e$a;->a:Lvz2/e;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    iget-object p1, p0, Lvz2/e$a;->a:Lvz2/e;

    invoke-static {p1}, Lvz2/e;->g(Lvz2/e;)Llh3/e;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Llh3/e;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    iget-object p1, p0, Lvz2/e$a;->a:Lvz2/e;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lvz2/e;->n(Lvz2/e;Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 3

    iget-object v0, p0, Lvz2/e$a;->a:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->l(Lvz2/e;)Ltr2/n;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CameraDevice.StateCallback.onError: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {v0, p1, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lvz2/e$a;->a:Lvz2/e;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lvz2/e;->n(Lvz2/e;Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    iget-object v0, p0, Lvz2/e$a;->a:Lvz2/e;

    invoke-static {v0, p1}, Lvz2/e;->n(Lvz2/e;Landroid/hardware/camera2/CameraDevice;)V

    iget-object p1, p0, Lvz2/e$a;->a:Lvz2/e;

    invoke-static {p1}, Lvz2/e;->h(Lvz2/e;)Llh3/e;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Llh3/e;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lvz2/e$a;->a:Lvz2/e;

    invoke-static {p1}, Lvz2/e;->s(Lvz2/e;)V

    return-void
.end method
