.class public Lvz2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvz2/e$d;,
        Lvz2/e$e;
    }
.end annotation


# instance fields
.field private final A:Landroid/media/ImageReader$OnImageAvailableListener;

.field private final B:Landroid/hardware/camera2/CameraDevice$StateCallback;

.field private final C:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

.field private final a:Landroid/content/Context;

.field private final b:Ltr2/n;

.field private final c:Lu92/d;

.field private final d:Landroid/hardware/camera2/CameraManager;

.field private e:Landroid/hardware/camera2/CameraDevice;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Landroid/hardware/camera2/CameraCharacteristics;

.field private i:Z

.field private j:Landroid/media/ImageReader;

.field private k:Landroid/hardware/camera2/CaptureRequest$Builder;

.field private l:Landroid/hardware/camera2/CameraCaptureSession;

.field private final m:Lvz2/e$d;

.field private final n:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

.field private final o:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lvz2/h;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lvz2/h;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field

.field private final r:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field

.field private final s:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field

.field private final t:Lmh3/c;

.field private final u:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private final v:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private final w:Lxg3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxg3/g<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Lxg3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxg3/g<",
            "Luz2/a;",
            ">;"
        }
    .end annotation
.end field

.field private y:Z

.field private z:Lwz2/b;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;Landroid/content/Context;Lxg3/g;Lxg3/g;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;",
            "Landroid/content/Context;",
            "Lxg3/g<",
            "Luz2/a;",
            ">;",
            "Lxg3/g<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lvf3/c;

    const-string v1, "mainPrefs"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const-class v2, Lu92/d;

    invoke-static {v2, v0, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu92/d;

    iput-object v0, p0, Lvz2/e;->c:Lu92/d;

    const/4 v1, 0x0

    iput v1, p0, Lvz2/e;->g:I

    const/4 v2, 0x1

    iput-boolean v2, p0, Lvz2/e;->i:Z

    new-instance v3, Lvz2/e$d;

    invoke-direct {v3, p0, v1}, Lvz2/e$d;-><init>(Lvz2/e;I)V

    iput-object v3, p0, Lvz2/e;->m:Lvz2/e$d;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lvz2/e;->o:Ljava/util/LinkedList;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lvz2/e;->p:Ljava/util/LinkedList;

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object v1

    iput-object v1, p0, Lvz2/e;->q:Llh3/e;

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object v1

    iput-object v1, p0, Lvz2/e;->r:Llh3/e;

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object v1

    iput-object v1, p0, Lvz2/e;->s:Llh3/e;

    new-instance v1, Lmh3/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lvz2/e;->t:Lmh3/c;

    sget-object v3, Lvz2/g;->OFF:Lvz2/g;

    invoke-static {v3, v2}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object v3

    iput-object v3, p0, Lvz2/e;->u:Llh3/b;

    new-instance v3, Lvz2/f;

    invoke-direct {v3, v2, v2}, Lvz2/f;-><init>(ZZ)V

    invoke-static {v3, v2}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object v2

    iput-object v2, p0, Lvz2/e;->v:Llh3/b;

    new-instance v2, Lvz2/c;

    invoke-direct {v2, p0}, Lvz2/c;-><init>(Lvz2/e;)V

    iput-object v2, p0, Lvz2/e;->A:Landroid/media/ImageReader$OnImageAvailableListener;

    new-instance v2, Lvz2/e$a;

    invoke-direct {v2, p0}, Lvz2/e$a;-><init>(Lvz2/e;)V

    iput-object v2, p0, Lvz2/e;->B:Landroid/hardware/camera2/CameraDevice$StateCallback;

    new-instance v2, Lvz2/e$b;

    invoke-direct {v2, p0}, Lvz2/e$b;-><init>(Lvz2/e;)V

    iput-object v2, p0, Lvz2/e;->C:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    iput-object p2, p0, Lvz2/e;->a:Landroid/content/Context;

    const-string v2, "Selfie.CameraApi"

    invoke-static {v2}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    iput-object v2, p0, Lvz2/e;->b:Ltr2/n;

    iput-object p1, p0, Lvz2/e;->n:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    const-string v2, "camera"

    invoke-virtual {p2, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/camera2/CameraManager;

    iput-object p2, p0, Lvz2/e;->d:Landroid/hardware/camera2/CameraManager;

    iput-object p4, p0, Lvz2/e;->w:Lxg3/g;

    iput-object p3, p0, Lvz2/e;->x:Lxg3/g;

    const-string p2, "cameraFacingFront"

    iget-boolean p3, p0, Lvz2/e;->y:Z

    invoke-virtual {v0, p2, p3}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lvz2/e;->y:Z

    invoke-virtual {p1}, Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;->b()Lxg3/g;

    move-result-object p1

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance p2, Lvz2/d;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lvz2/d;-><init>(Lvz2/e;I)V

    invoke-virtual {p1, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    invoke-virtual {v1, p1}, Lmh3/c;->c(Lxg3/t;)V

    return-void
.end method

.method private A()V
    .locals 3

    iget-object v0, p0, Lvz2/e;->z:Lwz2/b;

    invoke-virtual {v0}, Lwz2/b;->i()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lvz2/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lvz2/b;-><init>(Lvz2/e;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private C()Z
    .locals 1

    iget-boolean v0, p0, Lvz2/e;->y:Z

    return v0
.end method

.method private synthetic F(Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lvz2/e;->Z()V

    :cond_0
    return-void
.end method

.method private synthetic G()V
    .locals 1

    iget-object v0, p0, Lvz2/e;->z:Lwz2/b;

    invoke-virtual {v0}, Lwz2/b;->w()V

    return-void
.end method

.method private synthetic H()V
    .locals 1

    iget-object v0, p0, Lvz2/e;->z:Lwz2/b;

    invoke-virtual {v0}, Lwz2/b;->w()V

    invoke-direct {p0}, Lvz2/e;->z()V

    return-void
.end method

.method private synthetic I(Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p0}, Lvz2/e;->L()V

    return-void
.end method

.method private synthetic J(Landroid/media/ImageReader;)V
    .locals 2

    invoke-virtual {p1}, Landroid/media/ImageReader;->acquireNextImage()Landroid/media/Image;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v0

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lvz2/e;->q:Llh3/e;

    invoke-virtual {v0, v1}, Llh3/e;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/media/Image;->close()V

    return-void

    :goto_1
    if-eqz p1, :cond_1

    :try_start_1
    invoke-virtual {p1}, Landroid/media/Image;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    throw v0
.end method

.method private K()V
    .locals 4

    iget-object v0, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lvz2/e;->m:Lvz2/e$d;

    sget-object v1, Lvz2/e$e;->LOCKING:Lvz2/e$e;

    invoke-virtual {v0, v1}, Lvz2/e$d;->d(Lvz2/e$e;)V

    iget-object v0, p0, Lvz2/e;->l:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lvz2/e;->m:Lvz2/e$d;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lvz2/e;->b:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Failed to lock focus."

    invoke-interface {v1, v3, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_0
    return-void
.end method

.method private Q()V
    .locals 4

    iget-object v0, p0, Lvz2/e;->j:Landroid/media/ImageReader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    :cond_0
    iget-object v0, p0, Lvz2/e;->p:Ljava/util/LinkedList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lvz2/e;->p:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvz2/h;

    invoke-virtual {v0}, Lvz2/h;->c()I

    move-result v1

    invoke-virtual {v0}, Lvz2/h;->b()I

    move-result v0

    const/16 v2, 0x100

    const/4 v3, 0x2

    invoke-static {v1, v0, v2, v3}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v0

    iput-object v0, p0, Lvz2/e;->j:Landroid/media/ImageReader;

    iget-object v1, p0, Lvz2/e;->A:Landroid/media/ImageReader$OnImageAvailableListener;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    :cond_1
    return-void
.end method

.method private S()V
    .locals 4

    iget-object v0, p0, Lvz2/e;->h:Landroid/hardware/camera2/CameraCharacteristics;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    array-length v2, v0

    if-eqz v2, :cond_1

    array-length v2, v0

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    aget v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v3, p0, Lvz2/e;->i:Z

    iget-object v0, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void

    :cond_1
    :goto_0
    iput-boolean v1, p0, Lvz2/e;->i:Z

    iget-object v0, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method

.method private T()V
    .locals 10

    const/4 v0, 0x0

    iput-object v0, p0, Lvz2/e;->f:Ljava/lang/String;

    iput-object v0, p0, Lvz2/e;->h:Landroid/hardware/camera2/CameraCharacteristics;

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Lvz2/e;->d:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v2}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    if-nez v3, :cond_0

    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "No camera found"

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lvz2/e;->b:Ltr2/n;

    const-string v4, "No camera found."

    new-array v5, v0, [Lqr2/a$a;

    invoke-interface {v3, v4, v2, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lvz2/e;->r:Llh3/e;

    invoke-virtual {v1, v2}, Llh3/e;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v2, v0

    goto/16 :goto_3

    :catchall_0
    move-exception v1

    move-object v2, v1

    move v1, v0

    goto/16 :goto_5

    :catch_0
    move-exception v1

    move v2, v0

    move v3, v2

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    move-object v2, v0

    move v0, v1

    goto/16 :goto_5

    :catch_1
    move-exception v2

    move v3, v1

    move-object v1, v2

    move v2, v3

    goto/16 :goto_4

    :cond_0
    :try_start_2
    iput v0, p0, Lvz2/e;->g:I

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    array-length v4, v2

    move v5, v0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v2, v5

    iget-object v7, p0, Lvz2/e;->d:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v7, v6}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v6

    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v6, v7}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v0

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Lvz2/e;->d:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v6, v5}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v6

    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v6, v7}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean v7, p0, Lvz2/e;->y:Z

    if-eqz v7, :cond_4

    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v6, v7}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-nez v7, :cond_4

    iput-object v5, p0, Lvz2/e;->f:Ljava/lang/String;

    iput v4, p0, Lvz2/e;->g:I

    iput-object v6, p0, Lvz2/e;->h:Landroid/hardware/camera2/CameraCharacteristics;

    :cond_4
    iget-boolean v7, p0, Lvz2/e;->y:Z

    if-nez v7, :cond_5

    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v6, v7}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v1, :cond_5

    iput-object v5, p0, Lvz2/e;->f:Ljava/lang/String;

    iput v4, p0, Lvz2/e;->g:I

    iput-object v6, p0, Lvz2/e;->h:Landroid/hardware/camera2/CameraCharacteristics;

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    iget-object v3, p0, Lvz2/e;->f:Ljava/lang/String;

    if-nez v3, :cond_7

    aget-object v2, v2, v0

    iput-object v2, p0, Lvz2/e;->f:Ljava/lang/String;

    iget-object v3, p0, Lvz2/e;->d:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v3, v2}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v2

    iput-object v2, p0, Lvz2/e;->h:Landroid/hardware/camera2/CameraCharacteristics;
    :try_end_2
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move v2, v0

    goto :goto_2

    :cond_7
    move v2, v1

    :goto_2
    :try_start_3
    iget-object v3, p0, Lvz2/e;->h:Landroid/hardware/camera2/CameraCharacteristics;

    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->FLASH_INFO_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v3, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    if-nez v3, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    iget-object v1, p0, Lvz2/e;->v:Llh3/b;

    new-instance v3, Lvz2/f;

    invoke-direct {v3, v0, v2}, Lvz2/f;-><init>(ZZ)V

    invoke-virtual {v1, v3}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void

    :catchall_2
    move-exception v0

    move v9, v2

    move-object v2, v0

    move v0, v1

    move v1, v9

    goto :goto_5

    :catch_2
    move-exception v3

    move v9, v2

    move v2, v1

    move-object v1, v3

    move v3, v9

    :goto_4
    :try_start_4
    iget-object v4, p0, Lvz2/e;->b:Ltr2/n;

    const-string v5, "Could not retrieve camera devices"

    new-array v6, v0, [Lqr2/a$a;

    invoke-interface {v4, v5, v1, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    iget-object v2, p0, Lvz2/e;->r:Llh3/e;

    invoke-virtual {v2, v1}, Llh3/e;->onError(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    iget-object v1, p0, Lvz2/e;->v:Llh3/b;

    new-instance v2, Lvz2/f;

    invoke-direct {v2, v0, v0}, Lvz2/f;-><init>(ZZ)V

    invoke-virtual {v1, v2}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void

    :catchall_3
    move-exception v1

    move v0, v2

    move-object v2, v1

    move v1, v3

    :goto_5
    iget-object v3, p0, Lvz2/e;->v:Llh3/b;

    new-instance v4, Lvz2/f;

    invoke-direct {v4, v0, v1}, Lvz2/f;-><init>(ZZ)V

    invoke-virtual {v3, v4}, Llh3/b;->onNext(Ljava/lang/Object;)V

    throw v2
.end method

.method private V(Z)V
    .locals 2

    iget-object v0, p0, Lvz2/e;->c:Lu92/d;

    const-string v1, "cameraFacingFront"

    invoke-virtual {v0, v1, p1}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lvz2/e;->y:Z

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lvz2/e;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-boolean p1, p0, Lvz2/e;->y:Z

    invoke-virtual {p0}, Lvz2/e;->b0()V

    invoke-virtual {p0}, Lvz2/e;->X()V

    invoke-virtual {p0}, Lvz2/e;->L()V

    :cond_1
    :goto_0
    return-void
.end method

.method private Y()V
    .locals 4

    invoke-virtual {p0}, Lvz2/e;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvz2/e;->j:Landroid/media/ImageReader;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lvz2/e;->w()Lvz2/h;

    move-result-object v0

    iget-object v1, p0, Lvz2/e;->z:Lwz2/b;

    invoke-virtual {v1}, Lwz2/b;->j()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    invoke-virtual {v0}, Lvz2/h;->c()I

    move-result v2

    invoke-virtual {v0}, Lvz2/h;->b()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    :try_start_0
    iget-object v1, p0, Lvz2/e;->e:Landroid/hardware/camera2/CameraDevice;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v1

    iput-object v1, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    iget-object v1, p0, Lvz2/e;->e:Landroid/hardware/camera2/CameraDevice;

    iget-object v2, p0, Lvz2/e;->j:Landroid/media/ImageReader;

    invoke-virtual {v2}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v2

    filled-new-array {v0, v2}, [Landroid/view/Surface;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lvz2/e;->C:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lvz2/e;->b:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Failed to start camera session"

    invoke-interface {v1, v3, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lvz2/e;->r:Llh3/e;

    invoke-virtual {v1, v0}, Llh3/e;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private Z()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lvz2/e;->d:Landroid/hardware/camera2/CameraManager;

    iget-object v1, p0, Lvz2/e;->f:Ljava/lang/String;

    iget-object v2, p0, Lvz2/e;->B:Landroid/hardware/camera2/CameraDevice$StateCallback;

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lvz2/e;->b:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to open camera: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lvz2/e;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object v1, p0, Lvz2/e;->r:Llh3/e;

    invoke-virtual {v1, v0}, Llh3/e;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic a(Lvz2/e;)V
    .locals 0

    invoke-direct {p0}, Lvz2/e;->H()V

    return-void
.end method

.method public static synthetic b(Lvz2/e;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p1}, Lvz2/e;->I(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic c(Lvz2/e;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p1}, Lvz2/e;->F(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic d(Lvz2/e;Landroid/media/ImageReader;)V
    .locals 0

    invoke-direct {p0, p1}, Lvz2/e;->J(Landroid/media/ImageReader;)V

    return-void
.end method

.method private d0(Lvz2/g;)V
    .locals 3

    iget-object v0, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v0, Lvz2/g;->OFF:Lvz2/g;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lvz2/g;->ON:Lvz2/g;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p1, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lvz2/e;)V
    .locals 0

    invoke-direct {p0}, Lvz2/e;->G()V

    return-void
.end method

.method public static bridge synthetic f(Lvz2/e;)Landroid/hardware/camera2/CameraDevice;
    .locals 0

    iget-object p0, p0, Lvz2/e;->e:Landroid/hardware/camera2/CameraDevice;

    return-object p0
.end method

.method public static bridge synthetic g(Lvz2/e;)Llh3/e;
    .locals 0

    iget-object p0, p0, Lvz2/e;->s:Llh3/e;

    return-object p0
.end method

.method public static bridge synthetic h(Lvz2/e;)Llh3/e;
    .locals 0

    iget-object p0, p0, Lvz2/e;->r:Llh3/e;

    return-object p0
.end method

.method public static bridge synthetic i(Lvz2/e;)Lvz2/e$d;
    .locals 0

    iget-object p0, p0, Lvz2/e;->m:Lvz2/e$d;

    return-object p0
.end method

.method public static bridge synthetic j(Lvz2/e;)Landroid/hardware/camera2/CameraCaptureSession;
    .locals 0

    iget-object p0, p0, Lvz2/e;->l:Landroid/hardware/camera2/CameraCaptureSession;

    return-object p0
.end method

.method public static bridge synthetic k(Lvz2/e;)Llh3/b;
    .locals 0

    iget-object p0, p0, Lvz2/e;->u:Llh3/b;

    return-object p0
.end method

.method public static bridge synthetic l(Lvz2/e;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lvz2/e;->b:Ltr2/n;

    return-object p0
.end method

.method public static bridge synthetic m(Lvz2/e;)Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 0

    iget-object p0, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    return-object p0
.end method

.method public static bridge synthetic n(Lvz2/e;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    iput-object p1, p0, Lvz2/e;->e:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method

.method public static bridge synthetic o(Lvz2/e;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    iput-object p1, p0, Lvz2/e;->l:Landroid/hardware/camera2/CameraCaptureSession;

    return-void
.end method

.method public static bridge synthetic p(Lvz2/e;)V
    .locals 0

    invoke-direct {p0}, Lvz2/e;->v()V

    return-void
.end method

.method public static bridge synthetic q(Lvz2/e;)V
    .locals 0

    invoke-direct {p0}, Lvz2/e;->A()V

    return-void
.end method

.method public static bridge synthetic r(Lvz2/e;)V
    .locals 0

    invoke-direct {p0}, Lvz2/e;->S()V

    return-void
.end method

.method public static bridge synthetic s(Lvz2/e;)V
    .locals 0

    invoke-direct {p0}, Lvz2/e;->Y()V

    return-void
.end method

.method public static bridge synthetic t(Lvz2/e;Lvz2/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lvz2/e;->d0(Lvz2/g;)V

    return-void
.end method

.method private v()V
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lvz2/e;->D()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lvz2/e;->e:Landroid/hardware/camera2/CameraDevice;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v1

    iget-object v3, p0, Lvz2/e;->j:Landroid/media/ImageReader;

    invoke-virtual {v3}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v4, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v4, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v1, v3, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v3, p0, Lvz2/e;->u:Llh3/b;

    invoke-virtual {v3}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvz2/g;

    sget-object v4, Lvz2/g;->OFF:Lvz2/g;

    if-ne v3, v4, :cond_0

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    sget-object v4, Lvz2/g;->ON:Lvz2/g;

    if-ne v3, v4, :cond_1

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :goto_0
    iget-object v2, p0, Lvz2/e;->h:Landroid/hardware/camera2/CameraCharacteristics;

    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v2, v3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    add-int/lit16 v2, v2, 0x168

    rem-int/lit16 v2, v2, 0x168

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v2, p0, Lvz2/e;->l:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {v2}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V

    iget-object v2, p0, Lvz2/e;->l:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    new-instance v3, Lvz2/e$c;

    invoke-direct {v3, p0}, Lvz2/e$c;-><init>(Lvz2/e;)V

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :goto_1
    iget-object v2, p0, Lvz2/e;->b:Ltr2/n;

    const-string v3, "Cannot capture a still picture."

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v2, v3, v1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object v0, p0, Lvz2/e;->q:Llh3/e;

    invoke-virtual {v0, v1}, Llh3/e;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private w()Lvz2/h;
    .locals 6

    iget-object v0, p0, Lvz2/e;->n:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lvz2/e;->n:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    if-ge v0, v1, :cond_0

    move v5, v1

    move v1, v0

    move v0, v5

    :cond_0
    iget-object v2, p0, Lvz2/e;->o:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvz2/h;

    invoke-virtual {v3}, Lvz2/h;->c()I

    move-result v4

    if-lt v4, v0, :cond_1

    invoke-virtual {v3}, Lvz2/h;->b()I

    move-result v4

    if-lt v4, v1, :cond_1

    return-object v3

    :cond_2
    iget-object v0, p0, Lvz2/e;->o:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvz2/h;

    return-object v0
.end method

.method private x()V
    .locals 7

    iget-object v0, p0, Lvz2/e;->h:Landroid/hardware/camera2/CameraCharacteristics;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to get configuration map for camera"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lvz2/e;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lvz2/e;->b:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to get configuration map for camera "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lvz2/e;->f:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v2, v3, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lvz2/e;->r:Llh3/e;

    invoke-virtual {v1, v0}, Llh3/e;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    const-class v2, Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object v2

    const-string v3, "Failed to collect camera info"

    if-eqz v2, :cond_4

    array-length v4, v2

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v4, p0, Lvz2/e;->o:Ljava/util/LinkedList;

    const/16 v5, 0x780

    const/16 v6, 0x438

    invoke-direct {p0, v4, v2, v5, v6}, Lvz2/e;->y(Ljava/util/LinkedList;[Landroid/util/Size;II)V

    const/16 v2, 0x100

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "no jpg output sizes"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lvz2/e;->b:Ltr2/n;

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object v1, p0, Lvz2/e;->r:Llh3/e;

    invoke-virtual {v1, v0}, Llh3/e;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    iget-object v1, p0, Lvz2/e;->p:Ljava/util/LinkedList;

    invoke-direct {p0, v1, v0, v5, v6}, Lvz2/e;->y(Ljava/util/LinkedList;[Landroid/util/Size;II)V

    return-void

    :cond_4
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "no surface texture output sizes"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lvz2/e;->b:Ltr2/n;

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object v1, p0, Lvz2/e;->r:Llh3/e;

    invoke-virtual {v1, v0}, Llh3/e;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private y(Ljava/util/LinkedList;[Landroid/util/Size;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedList<",
            "Lvz2/h;",
            ">;[",
            "Landroid/util/Size;",
            "II)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p2, v2

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-static {v4, v5}, Lvz2/a;->c(II)Z

    move-result v6

    if-eqz v6, :cond_0

    if-gt v4, p3, :cond_0

    if-gt v5, p4, :cond_0

    new-instance v4, Lvz2/h;

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v4, v5, v3}, Lvz2/h;-><init>(II)V

    invoke-virtual {p1, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_2

    array-length p3, p2

    if-lez p3, :cond_2

    aget-object p2, p2, v1

    new-instance p3, Lvz2/h;

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p4

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    invoke-direct {p3, p4, p2}, Lvz2/h;-><init>(II)V

    invoke-virtual {p1, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void
.end method

.method private z()V
    .locals 7

    new-instance v0, Lwz2/b;

    iget-object v1, p0, Lvz2/e;->a:Landroid/content/Context;

    iget-object v2, p0, Lvz2/e;->n:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    invoke-virtual {v2}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v2

    iget-object v3, p0, Lvz2/e;->n:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    iget-object v4, p0, Lvz2/e;->n:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    iget-object v5, p0, Lvz2/e;->x:Lxg3/g;

    iget-object v6, p0, Lvz2/e;->w:Lxg3/g;

    invoke-direct/range {v0 .. v6}, Lwz2/b;-><init>(Landroid/content/Context;Landroid/graphics/SurfaceTexture;IILxg3/g;Lxg3/g;)V

    iput-object v0, p0, Lvz2/e;->z:Lwz2/b;

    iget-object v1, p0, Lvz2/e;->t:Lmh3/c;

    invoke-virtual {v0}, Lwz2/b;->p()Lxg3/g;

    move-result-object v0

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v2

    invoke-virtual {v0, v2}, Lxg3/g;->P(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v2, Lvz2/d;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lvz2/d;-><init>(Lvz2/e;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v0

    invoke-virtual {v1, v0}, Lmh3/c;->c(Lxg3/t;)V

    iget-object v0, p0, Lvz2/e;->z:Lwz2/b;

    invoke-virtual {v0}, Lwz2/b;->start()V

    return-void
.end method


# virtual methods
.method public B()I
    .locals 1

    iget v0, p0, Lvz2/e;->g:I

    return v0
.end method

.method public D()Z
    .locals 1

    iget-object v0, p0, Lvz2/e;->e:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public E()Z
    .locals 1

    iget-boolean v0, p0, Lvz2/e;->y:Z

    return v0
.end method

.method public L()V
    .locals 3

    iget-object v0, p0, Lvz2/e;->z:Lwz2/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvz2/e;->z:Lwz2/b;

    invoke-virtual {v0}, Lwz2/b;->i()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lvz2/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lvz2/b;-><init>(Lvz2/e;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lvz2/e;->f:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lvz2/e;->z()V

    :cond_2
    :goto_0
    return-void
.end method

.method public M()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvz2/e;->r:Llh3/e;

    return-object v0
.end method

.method public N()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lvz2/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvz2/e;->v:Llh3/b;

    return-object v0
.end method

.method public O()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lvz2/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvz2/e;->u:Llh3/b;

    return-object v0
.end method

.method public P()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p0, Lvz2/e;->q:Llh3/e;

    return-object v0
.end method

.method public R()V
    .locals 1

    iget-object v0, p0, Lvz2/e;->t:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->d()V

    return-void
.end method

.method public U()V
    .locals 3

    iget-object v0, p0, Lvz2/e;->c:Lu92/d;

    const-string v1, "cameraFacingFront"

    iget-boolean v2, p0, Lvz2/e;->y:Z

    invoke-virtual {v0, v1, v2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lvz2/e;->y:Z

    return-void
.end method

.method public W(Lvz2/g;)V
    .locals 4

    iget-object v0, p0, Lvz2/e;->u:Llh3/b;

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvz2/g;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lvz2/e;->u:Llh3/b;

    invoke-virtual {v1, p1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    iget-object v1, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Lvz2/e;->d0(Lvz2/g;)V

    iget-object p1, p0, Lvz2/e;->l:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz p1, :cond_1

    :try_start_0
    iget-object v1, p0, Lvz2/e;->k:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lvz2/e;->m:Lvz2/e$d;

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v1, p0, Lvz2/e;->b:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Could not update flash for capture"

    invoke-interface {v1, v3, p1, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lvz2/e;->u:Llh3/b;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public X()V
    .locals 0

    invoke-direct {p0}, Lvz2/e;->T()V

    invoke-direct {p0}, Lvz2/e;->x()V

    invoke-direct {p0}, Lvz2/e;->Q()V

    return-void
.end method

.method public a0()V
    .locals 1

    iget-boolean v0, p0, Lvz2/e;->i:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lvz2/e;->K()V

    return-void

    :cond_0
    invoke-direct {p0}, Lvz2/e;->v()V

    return-void
.end method

.method public b0()V
    .locals 2

    iget-object v0, p0, Lvz2/e;->l:Landroid/hardware/camera2/CameraCaptureSession;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    iput-object v1, p0, Lvz2/e;->l:Landroid/hardware/camera2/CameraCaptureSession;

    :cond_0
    iget-object v0, p0, Lvz2/e;->e:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V

    iput-object v1, p0, Lvz2/e;->e:Landroid/hardware/camera2/CameraDevice;

    :cond_1
    iget-object v0, p0, Lvz2/e;->j:Landroid/media/ImageReader;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    iput-object v1, p0, Lvz2/e;->j:Landroid/media/ImageReader;

    :cond_2
    return-void
.end method

.method public c0()V
    .locals 1

    invoke-direct {p0}, Lvz2/e;->C()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lvz2/e;->V(Z)V

    return-void
.end method

.method public u()V
    .locals 1

    iget-object v0, p0, Lvz2/e;->z:Lwz2/b;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lvz2/e;->L()V

    :cond_0
    return-void
.end method
