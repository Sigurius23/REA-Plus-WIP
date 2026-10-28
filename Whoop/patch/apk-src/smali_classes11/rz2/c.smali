.class public Lrz2/c;
.super Landroidx/fragment/app/m0;
.source "SourceFile"

# interfaces
.implements Lsz2/b$a;


# static fields
.field private static V:Lrz2/c;

.field private static W:Ltr2/o;


# instance fields
.field private E:Landroid/hardware/camera2/CameraCaptureSession;

.field private F:I

.field private G:Landroid/hardware/camera2/CaptureRequest$Builder;

.field private H:Landroid/os/HandlerThread;

.field private I:Landroid/os/Handler;

.field private J:Landroid/graphics/SurfaceTexture;

.field protected K:I

.field private final L:Ljava/util/concurrent/Semaphore;

.field private M:Z

.field private N:Z

.field private O:Z

.field private P:Z

.field private final Q:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lvz2/h;",
            ">;"
        }
    .end annotation
.end field

.field private final R:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

.field private final S:Landroid/hardware/camera2/CameraDevice$StateCallback;

.field private T:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field private final U:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

.field private final w:Lu92/d;

.field private x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

.field private y:Lsz2/b;

.field private z:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lvf3/c;

    const-string v1, "mainPrefs"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const-class v2, Lu92/d;

    invoke-static {v2, v0, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu92/d;

    iput-object v0, p0, Lrz2/c;->w:Lu92/d;

    const/4 v0, 0x0

    iput v0, p0, Lrz2/c;->K:I

    new-instance v1, Ljava/util/concurrent/Semaphore;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v1, p0, Lrz2/c;->L:Ljava/util/concurrent/Semaphore;

    iput-boolean v0, p0, Lrz2/c;->M:Z

    iput-boolean v0, p0, Lrz2/c;->N:Z

    iput-boolean v0, p0, Lrz2/c;->O:Z

    iput-boolean v2, p0, Lrz2/c;->P:Z

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lrz2/c;->Q:Ljava/util/LinkedList;

    new-instance v0, Lrz2/c$a;

    invoke-direct {v0, p0}, Lrz2/c$a;-><init>(Lrz2/c;)V

    iput-object v0, p0, Lrz2/c;->R:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    new-instance v0, Lrz2/c$b;

    invoke-direct {v0, p0}, Lrz2/c$b;-><init>(Lrz2/c;)V

    iput-object v0, p0, Lrz2/c;->S:Landroid/hardware/camera2/CameraDevice$StateCallback;

    new-instance v0, Lrz2/c$c;

    invoke-direct {v0, p0}, Lrz2/c$c;-><init>(Lrz2/c;)V

    iput-object v0, p0, Lrz2/c;->U:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    return-void
.end method

.method public static bridge synthetic A(Lrz2/c;Z)V
    .locals 0

    iput-boolean p1, p0, Lrz2/c;->M:Z

    return-void
.end method

.method public static bridge synthetic B(Lrz2/c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    iput-object p1, p0, Lrz2/c;->E:Landroid/hardware/camera2/CameraCaptureSession;

    return-void
.end method

.method public static bridge synthetic C(Lrz2/c;)V
    .locals 0

    invoke-direct {p0}, Lrz2/c;->S()V

    return-void
.end method

.method public static bridge synthetic D(Lrz2/c;)V
    .locals 0

    invoke-direct {p0}, Lrz2/c;->V()V

    return-void
.end method

.method public static bridge synthetic E()Ltr2/o;
    .locals 1

    sget-object v0, Lrz2/c;->W:Ltr2/o;

    return-object v0
.end method

.method private F()Lvz2/h;
    .locals 6

    iget-object v0, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    if-ge v0, v1, :cond_0

    move v5, v1

    move v1, v0

    move v0, v5

    :cond_0
    iget-object v2, p0, Lrz2/c;->Q:Ljava/util/LinkedList;

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
    iget-object v0, p0, Lrz2/c;->Q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvz2/h;

    return-object v0
.end method

.method private H(Ljava/util/LinkedList;[Landroid/util/Size;II)V
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

.method public static J()Lrz2/c;
    .locals 3

    sget-object v0, Lrz2/c;->V:Lrz2/c;

    if-nez v0, :cond_0

    new-instance v0, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->d()Ltr2/n;

    move-result-object v1

    const-string v2, "WhoopVideoFragment"

    invoke-direct {v0, v1, v2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    sput-object v0, Lrz2/c;->W:Ltr2/o;

    new-instance v0, Lrz2/c;

    invoke-direct {v0}, Lrz2/c;-><init>()V

    sput-object v0, Lrz2/c;->V:Lrz2/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/m0;->setRetainInstance(Z)V

    :cond_0
    sget-object v0, Lrz2/c;->V:Lrz2/c;

    return-object v0
.end method

.method private Q(II)V
    .locals 2

    iget-object v0, p0, Lrz2/c;->T:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrz2/c;->T:Ljava/util/List;

    :cond_0
    iget v0, p0, Lrz2/c;->F:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lrz2/c;->y:Lsz2/b;

    invoke-virtual {v0}, Lsz2/b;->l()I

    move-result v0

    iput v0, p0, Lrz2/c;->F:I

    :cond_1
    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget v1, p0, Lrz2/c;->F:I

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, p0, Lrz2/c;->J:Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lrz2/c;->y:Lsz2/b;

    invoke-virtual {v1, v0}, Lsz2/b;->x(Landroid/graphics/SurfaceTexture;)V

    iget-object v0, p0, Lrz2/c;->T:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lrz2/c;->T:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lrz2/c;->T:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_3
    iget-object v0, p0, Lrz2/c;->J:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance p1, Landroid/view/Surface;

    iget-object p2, p0, Lrz2/c;->J:Landroid/graphics/SurfaceTexture;

    invoke-direct {p1, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iget-object p2, p0, Lrz2/c;->T:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private R()V
    .locals 3

    sget-object v0, Lrz2/c;->W:Ltr2/o;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Starting background thread"

    invoke-virtual {v0, v2, v1}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "CameraBackground"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lrz2/c;->H:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lrz2/c;->H:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lrz2/c;->I:Landroid/os/Handler;

    return-void
.end method

.method private S()V
    .locals 9

    const-string v0, "Surface texture is null while setting up default buffer size  "

    const-string v1, "Setting up surfaces "

    const-string v2, "Preview Height "

    iget-object v3, p0, Lrz2/c;->z:Landroid/hardware/camera2/CameraDevice;

    if-nez v3, :cond_0

    return-void

    :cond_0
    const/4 v4, 0x3

    :try_start_0
    invoke-virtual {v3, v4}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v3

    iput-object v3, p0, Lrz2/c;->G:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v3

    const-string v4, "camera"

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v3}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Lrz2/c;->K:I

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v3

    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v3, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/hardware/camera2/params/StreamConfigurationMap;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lrz2/c;->Q:Ljava/util/LinkedList;

    const-class v5, Landroid/graphics/SurfaceTexture;

    invoke-virtual {v3, v5}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object v3

    const/16 v5, 0x780

    const/16 v6, 0x438

    invoke-direct {p0, v4, v3, v5, v6}, Lrz2/c;->H(Ljava/util/LinkedList;[Landroid/util/Size;II)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-direct {p0}, Lrz2/c;->F()Lvz2/h;

    move-result-object v3

    invoke-virtual {v3}, Lvz2/h;->c()I

    move-result v4

    invoke-virtual {v3}, Lvz2/h;->b()I

    move-result v5

    sget-object v6, Lrz2/c;->W:Ltr2/o;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " Preview Width: "

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    new-array v8, v7, [Lqr2/a$a;

    invoke-virtual {v6, v2, v8}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-boolean v2, p0, Lrz2/c;->P:Z

    if-eqz v2, :cond_2

    invoke-direct {p0, v4, v5}, Lrz2/c;->Q(II)V

    const/4 v2, 0x1

    iput-boolean v2, p0, Lrz2/c;->P:Z

    :cond_2
    sget-object v2, Lrz2/c;->W:Ltr2/o;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lrz2/c;->P:Z

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v4, v7, [Lqr2/a$a;

    invoke-virtual {v2, v1, v4}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lrz2/c;->J:Landroid/graphics/SurfaceTexture;

    if-eqz v1, :cond_3

    invoke-virtual {v3}, Lvz2/h;->c()I

    move-result v0

    invoke-virtual {v3}, Lvz2/h;->b()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    goto :goto_1

    :cond_3
    sget-object v1, Lrz2/c;->W:Ltr2/o;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lrz2/c;->J:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v7, [Lqr2/a$a;

    invoke-virtual {v1, v0, v2}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_1
    iget-object v0, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v2, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    invoke-virtual {v3}, Lvz2/h;->b()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v1

    invoke-virtual {v3}, Lvz2/h;->c()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v2, v1

    div-float/2addr v0, v2

    iget-object v1, p0, Lrz2/c;->y:Lsz2/b;

    invoke-virtual {v1, v0}, Lsz2/b;->u(F)V

    iget-object v0, p0, Lrz2/c;->G:Landroid/hardware/camera2/CaptureRequest$Builder;

    iget-object v1, p0, Lrz2/c;->T:Ljava/util/List;

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    iget-object v0, p0, Lrz2/c;->z:Landroid/hardware/camera2/CameraDevice;

    iget-object v1, p0, Lrz2/c;->T:Ljava/util/List;

    iget-object v2, p0, Lrz2/c;->R:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    iget-object v3, p0, Lrz2/c;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private T()V
    .locals 3

    const-string v0, "WhoopVideoFragment"

    const-string v1, "RELEASE TEXTURE"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lrz2/c;->W:Ltr2/o;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Stopping background thread and releasing surface texture"

    invoke-virtual {v0, v2, v1}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lrz2/c;->J:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lrz2/c;->J:Landroid/graphics/SurfaceTexture;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrz2/c;->P:Z

    iget-object v0, p0, Lrz2/c;->T:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method

.method private V()V
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lrz2/c;->z:Landroid/hardware/camera2/CameraDevice;

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lrz2/c;->G:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget v1, p0, Lrz2/c;->K:I

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lrz2/c;->N:Z

    if-eqz v1, :cond_1

    iget-object v0, p0, Lrz2/c;->G:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lrz2/c;->G:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v1, v2, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lrz2/c;->G:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v1, v2, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lrz2/c;->E:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lrz2/c;->G:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lrz2/c;->U:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    iget-object v3, p0, Lrz2/c;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    iget-object v0, p0, Lrz2/c;->J:Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lrz2/c;->y:Lsz2/b;

    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static bridge synthetic y(Lrz2/c;)Ljava/util/concurrent/Semaphore;
    .locals 0

    iget-object p0, p0, Lrz2/c;->L:Ljava/util/concurrent/Semaphore;

    return-object p0
.end method

.method public static bridge synthetic z(Lrz2/c;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    iput-object p1, p0, Lrz2/c;->z:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public G()V
    .locals 5

    const-string v0, "Interrupted while trying to lock camera closing.  "

    const-string v1, "Failed to stop repeaing preview request  "

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lrz2/c;->L:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v3}, Ljava/util/concurrent/Semaphore;->acquire()V

    iget-object v3, p0, Lrz2/c;->z:Landroid/hardware/camera2/CameraDevice;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lrz2/c;->E:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {v3}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V

    iget-object v3, p0, Lrz2/c;->z:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v3}, Landroid/hardware/camera2/CameraDevice;->close()V

    const/4 v3, 0x0

    iput-object v3, p0, Lrz2/c;->z:Landroid/hardware/camera2/CameraDevice;

    iput-boolean v2, p0, Lrz2/c;->M:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v0, p0, Lrz2/c;->L:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    return-void

    :goto_1
    :try_start_1
    sget-object v3, Lrz2/c;->W:Ltr2/o;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Lqr2/a$a;

    invoke-virtual {v3, v1, v2}, Ltr2/o;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const-string v1, "WhoopVideoFragment"

    const-string v2, "Failed to stop repeaing preview request"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :goto_2
    sget-object v3, Lrz2/c;->W:Ltr2/o;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-virtual {v3, v0, v1}, Ltr2/o;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Interrupted while trying to lock camera closing."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    iget-object v1, p0, Lrz2/c;->L:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->release()V

    throw v0
.end method

.method public I()I
    .locals 1

    iget v0, p0, Lrz2/c;->K:I

    return v0
.end method

.method public K()Landroid/graphics/SurfaceTexture;
    .locals 1

    iget-object v0, p0, Lrz2/c;->J:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public L()V
    .locals 7

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lrz2/c;->z:Landroid/hardware/camera2/CameraDevice;

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lrz2/c;->M:Z

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "camera"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/camera2/CameraManager;

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lrz2/c;->L:Ljava/util/concurrent/Semaphore;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x9c4

    invoke-virtual {v3, v5, v6, v4}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lrz2/c;->K:I

    array-length v5, v3

    if-lt v4, v5, :cond_2

    iput v2, p0, Lrz2/c;->K:I

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_2
    :goto_0
    iget v4, p0, Lrz2/c;->K:I

    aget-object v3, v3, v4

    iget-object v4, p0, Lrz2/c;->S:Landroid/hardware/camera2/CameraDevice$StateCallback;

    const/4 v5, 0x0

    invoke-virtual {v1, v3, v4, v5}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V

    return-void

    :cond_3
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v3, "Time out waiting to lock camera opening."

    invoke-direct {v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    :catch_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Interrupted while trying to lock camera opening."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_2

    :catch_2
    const-string v1, "Cannot access the camera."

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_4
    :goto_2
    return-void
.end method

.method public M(I)V
    .locals 0

    iput p1, p0, Lrz2/c;->K:I

    return-void
.end method

.method public N(I)V
    .locals 0

    iput p1, p0, Lrz2/c;->F:I

    return-void
.end method

.method public O(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)V
    .locals 0

    iput-object p1, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    return-void
.end method

.method public P(Lsz2/b;)V
    .locals 4

    iget-object v0, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iput-object p1, p0, Lrz2/c;->y:Lsz2/b;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p0}, Lsz2/b;->w(Lsz2/b$a;)V

    iget-object p1, p0, Lrz2/c;->y:Lsz2/b;

    invoke-virtual {p1, p0}, Lsz2/b;->z(Lrz2/c;)V

    iget-object p1, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    iget-object v0, p0, Lrz2/c;->y:Lsz2/b;

    invoke-virtual {p1, v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->setRendererCallbacks(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;)V

    iget-object p1, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-static {p1}, Lvz2/a;->b(I)I

    move-result p1

    iget-object v0, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-static {v0}, Lvz2/a;->a(I)I

    move-result v0

    iget-object v1, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v2, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    iget-object v3, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    if-le p1, v3, :cond_1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    iget-object v1, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    if-le v0, v1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    iget-object v1, p0, Lrz2/c;->y:Lsz2/b;

    invoke-virtual {v1, p1, v0}, Lsz2/b;->onSurfaceChanged(II)V

    return-void
.end method

.method public U()V
    .locals 5

    iget v0, p0, Lrz2/c;->K:I

    const-string v1, "cameraFacingFront"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    iput v2, p0, Lrz2/c;->K:I

    iget-object v0, p0, Lrz2/c;->w:Lu92/d;

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    iput v3, p0, Lrz2/c;->K:I

    iget-object v0, p0, Lrz2/c;->w:Lu92/d;

    invoke-virtual {v0, v1, v3}, Lu92/d;->q(Ljava/lang/String;Z)V

    :goto_0
    sget-object v0, Lrz2/c;->W:Ltr2/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Swap Camera clicked setting up "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lrz2/c;->K:I

    const-string v4, " to use"

    invoke-static {v1, v3, v4}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v2, [Lqr2/a$a;

    invoke-virtual {v0, v1, v3}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-boolean v0, p0, Lrz2/c;->M:Z

    if-eqz v0, :cond_1

    sget-object v0, Lrz2/c;->W:Ltr2/o;

    const-string v1, "Closing camera and setting up surface to false and opening camera again"

    new-array v3, v2, [Lqr2/a$a;

    invoke-virtual {v0, v1, v3}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lrz2/c;->G()V

    iput-boolean v2, p0, Lrz2/c;->P:Z

    invoke-virtual {p0}, Lrz2/c;->L()V

    :cond_1
    return-void
.end method

.method public n()V
    .locals 2

    iget-boolean v0, p0, Lrz2/c;->O:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lrz2/c$d;

    invoke-direct {v1, p0}, Lrz2/c$d;-><init>(Lrz2/c;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onPause()V

    invoke-virtual {p0}, Lrz2/c;->G()V

    invoke-direct {p0}, Lrz2/c;->T()V

    iget-object v0, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lrz2/c;->x:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->setRendererCallbacks(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;)V

    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-direct {p0}, Lrz2/c;->R()V

    return-void
.end method
