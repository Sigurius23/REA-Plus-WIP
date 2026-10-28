.class Lrz2/c$b;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrz2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrz2/c;


# direct methods
.method public constructor <init>(Lrz2/c;)V
    .locals 0

    iput-object p1, p0, Lrz2/c$b;->a:Lrz2/c;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 4

    iget-object v0, p0, Lrz2/c$b;->a:Lrz2/c;

    invoke-static {v0}, Lrz2/c;->y(Lrz2/c;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    iget-object v0, p0, Lrz2/c$b;->a:Lrz2/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lrz2/c;->z(Lrz2/c;Landroid/hardware/camera2/CameraDevice;)V

    iget-object v0, p0, Lrz2/c$b;->a:Lrz2/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lrz2/c;->A(Lrz2/c;Z)V

    invoke-static {}, Lrz2/c;->E()Ltr2/o;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DISCONNECTED FROM CAMERA "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-virtual {v0, p1, v1}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 2

    iget-object v0, p0, Lrz2/c$b;->a:Lrz2/c;

    invoke-static {v0}, Lrz2/c;->y(Lrz2/c;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    iget-object p1, p0, Lrz2/c$b;->a:Lrz2/c;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lrz2/c;->z(Lrz2/c;Landroid/hardware/camera2/CameraDevice;)V

    iget-object p1, p0, Lrz2/c$b;->a:Lrz2/c;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lrz2/c;->A(Lrz2/c;Z)V

    invoke-static {}, Lrz2/c;->E()Ltr2/o;

    move-result-object p1

    const-string v1, "CameraDevice.StateCallback onError() "

    invoke-static {p2, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v0, [Lqr2/a$a;

    invoke-virtual {p1, p2, v0}, Ltr2/o;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrz2/c$b;->a:Lrz2/c;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 3

    iget-object v0, p0, Lrz2/c$b;->a:Lrz2/c;

    invoke-static {v0}, Lrz2/c;->y(Lrz2/c;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    iget-object v0, p0, Lrz2/c$b;->a:Lrz2/c;

    invoke-static {v0, p1}, Lrz2/c;->z(Lrz2/c;Landroid/hardware/camera2/CameraDevice;)V

    iget-object v0, p0, Lrz2/c$b;->a:Lrz2/c;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lrz2/c;->A(Lrz2/c;Z)V

    invoke-static {}, Lrz2/c;->E()Ltr2/o;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onOpened "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-virtual {v0, p1, v1}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrz2/c$b;->a:Lrz2/c;

    invoke-static {p1}, Lrz2/c;->C(Lrz2/c;)V

    return-void
.end method
