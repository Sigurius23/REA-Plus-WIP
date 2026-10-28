.class public final Ls9/i;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# static fields
.field public static final synthetic L:I


# instance fields
.field public final E:Landroid/os/Handler;

.field public final F:Ls9/h;

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

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ls9/i;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ls9/i;->E:Landroid/os/Handler;

    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Ls9/i;->x:Landroid/hardware/SensorManager;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    if-nez v1, :cond_0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    :cond_0
    iput-object v1, p0, Ls9/i;->y:Landroid/hardware/Sensor;

    new-instance v0, Ls9/h;

    invoke-direct {v0}, Ls9/h;-><init>()V

    iput-object v0, p0, Ls9/i;->F:Ls9/h;

    new-instance v1, Lno/l;

    invoke-direct {v1, p0, v0}, Lno/l;-><init>(Ls9/i;Ls9/h;)V

    new-instance v0, Lno/n;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lno/n;-><init>(Landroid/content/Context;Lno/l;B)V

    const-string v3, "window"

    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    new-instance v3, Lno/d;

    const/4 v4, 0x2

    new-array v5, v4, [Ls9/c;

    aput-object v0, v5, v2

    const/4 v2, 0x1

    aput-object v1, v5, v2

    invoke-direct {v3, p1, v5}, Lno/d;-><init>(Landroid/view/Display;[Ls9/c;)V

    iput-object v3, p0, Ls9/i;->z:Lno/d;

    iput-boolean v2, p0, Ls9/i;->I:Z

    invoke-virtual {p0, v4}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    invoke-virtual {p0, v1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-boolean v0, p0, Ls9/i;->I:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ls9/i;->J:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Ls9/i;->y:Landroid/hardware/Sensor;

    if-eqz v2, :cond_3

    iget-boolean v3, p0, Ls9/i;->K:Z

    if-ne v0, v3, :cond_1

    goto :goto_2

    :cond_1
    iget-object v3, p0, Ls9/i;->z:Lno/d;

    iget-object v4, p0, Ls9/i;->x:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_2

    invoke-virtual {v4, v3, v2, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v4, v3}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    :goto_1
    iput-boolean v0, p0, Ls9/i;->K:Z

    :cond_3
    :goto_2
    return-void
.end method

.method public getCameraMotionListener()Ls9/a;
    .locals 1

    iget-object v0, p0, Ls9/i;->F:Ls9/h;

    return-object v0
.end method

.method public getVideoFrameMetadataListener()Lr9/m;
    .locals 1

    iget-object v0, p0, Ls9/i;->F:Ls9/h;

    return-object v0
.end method

.method public getVideoSurface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Ls9/i;->H:Landroid/view/Surface;

    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    new-instance v0, Llr/e;

    const/16 v1, 0x12

    invoke-direct {v0, p0, v1}, Llr/e;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Ls9/i;->E:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onPause()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls9/i;->J:Z

    invoke-virtual {p0}, Ls9/i;->a()V

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls9/i;->J:Z

    invoke-virtual {p0}, Ls9/i;->a()V

    return-void
.end method

.method public setDefaultStereoMode(I)V
    .locals 1

    iget-object v0, p0, Ls9/i;->F:Ls9/h;

    iput p1, v0, Ls9/h;->K:I

    return-void
.end method

.method public setUseSensorRotation(Z)V
    .locals 0

    iput-boolean p1, p0, Ls9/i;->I:Z

    invoke-virtual {p0}, Ls9/i;->a()V

    return-void
.end method
