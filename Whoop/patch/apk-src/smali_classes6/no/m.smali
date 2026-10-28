.class public final Lno/m;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# instance fields
.field public final E:Landroid/os/Handler;

.field public final F:Lno/k;

.field public G:Landroid/graphics/SurfaceTexture;

.field public H:Landroid/view/Surface;

.field public I:Z

.field public J:Z

.field public K:Z

.field public final w:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final x:Landroid/hardware/SensorManager;

.field public final y:Landroid/hardware/Sensor;

.field public final z:Lno/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lno/m;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lno/m;->E:Landroid/os/Handler;

    const-string v1, "sensor"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Landroid/hardware/SensorManager;

    iput-object v1, p0, Lno/m;->x:Landroid/hardware/SensorManager;

    sget v2, Llo/y;->a:I

    const/16 v3, 0x12

    if-lt v2, v3, :cond_0

    const/16 v0, 0xf

    invoke-virtual {v1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    const/16 v0, 0xb

    invoke-virtual {v1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lno/m;->y:Landroid/hardware/Sensor;

    new-instance v0, Lno/k;

    invoke-direct {v0}, Lno/k;-><init>()V

    iput-object v0, p0, Lno/m;->F:Lno/k;

    new-instance v1, Lno/l;

    invoke-direct {v1, p0, v0}, Lno/l;-><init>(Lno/m;Lno/k;)V

    new-instance v0, Lno/n;

    invoke-direct {v0, p1, v1}, Lno/n;-><init>(Landroid/content/Context;Lno/l;)V

    const-string v2, "window"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    new-instance v2, Lno/d;

    const/4 v3, 0x2

    new-array v4, v3, [Lno/c;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    invoke-direct {v2, p1, v4}, Lno/d;-><init>(Landroid/view/Display;[Lno/c;)V

    iput-object v2, p0, Lno/m;->z:Lno/d;

    iput-boolean v5, p0, Lno/m;->I:Z

    invoke-virtual {p0, v3}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    invoke-virtual {p0, v1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-boolean v0, p0, Lno/m;->I:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lno/m;->J:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lno/m;->y:Landroid/hardware/Sensor;

    if-eqz v2, :cond_3

    iget-boolean v3, p0, Lno/m;->K:Z

    if-ne v0, v3, :cond_1

    goto :goto_2

    :cond_1
    iget-object v3, p0, Lno/m;->z:Lno/d;

    iget-object v4, p0, Lno/m;->x:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_2

    invoke-virtual {v4, v3, v2, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v4, v3}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    :goto_1
    iput-boolean v0, p0, Lno/m;->K:Z

    :cond_3
    :goto_2
    return-void
.end method

.method public getCameraMotionListener()Lno/a;
    .locals 1

    iget-object v0, p0, Lno/m;->F:Lno/k;

    return-object v0
.end method

.method public getVideoFrameMetadataListener()Lmo/k;
    .locals 1

    iget-object v0, p0, Lno/m;->F:Lno/k;

    return-object v0
.end method

.method public getVideoSurface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lno/m;->H:Landroid/view/Surface;

    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    new-instance v0, Llr/e;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Llr/e;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lno/m;->E:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onPause()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lno/m;->J:Z

    invoke-virtual {p0}, Lno/m;->a()V

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/m;->J:Z

    invoke-virtual {p0}, Lno/m;->a()V

    return-void
.end method

.method public setDefaultStereoMode(I)V
    .locals 1

    iget-object v0, p0, Lno/m;->F:Lno/k;

    iput p1, v0, Lno/k;->K:I

    return-void
.end method

.method public setUseSensorRotation(Z)V
    .locals 0

    iput-boolean p1, p0, Lno/m;->I:Z

    invoke-virtual {p0}, Lno/m;->a()V

    return-void
.end method
