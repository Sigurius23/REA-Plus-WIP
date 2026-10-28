.class public final Lmo/d;
.super Landroid/view/Surface;
.source "SourceFile"


# static fields
.field public static E:Z

.field public static z:I


# instance fields
.field public final w:Z

.field public final x:Lmo/c;

.field public y:Z


# direct methods
.method public constructor <init>(Lmo/c;Landroid/graphics/SurfaceTexture;Z)V
    .locals 0

    invoke-direct {p0, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object p1, p0, Lmo/d;->x:Lmo/c;

    iput-boolean p3, p0, Lmo/d;->w:Z

    return-void
.end method

.method public static b(Landroid/content/Context;)I
    .locals 5

    sget v0, Llo/y;->a:I

    const/16 v1, 0x18

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/16 v1, 0x1a

    if-ge v0, v1, :cond_1

    const-string v3, "samsung"

    sget-object v4, Llo/y;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "XT1650"

    sget-object v4, Llo/y;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    if-ge v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v1, "android.hardware.vr.high_performance"

    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object p0

    const/16 v1, 0x3055

    invoke-static {p0, v1}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    const-string v3, "EGL_EXT_protected_content"

    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_5

    const/16 p0, 0x11

    if-ge v0, p0, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object p0

    invoke-static {p0, v1}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    const-string v0, "EGL_KHR_surfaceless_context"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_0
    const/4 p0, 0x2

    return p0

    :cond_5
    :goto_1
    return v2
.end method

.method public static declared-synchronized f(Landroid/content/Context;)Z
    .locals 3

    const-class v0, Lmo/d;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lmo/d;->E:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    invoke-static {p0}, Lmo/d;->b(Landroid/content/Context;)I

    move-result p0

    sput p0, Lmo/d;->z:I

    sput-boolean v2, Lmo/d;->E:Z

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_0
    sget p0, Lmo/d;->z:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    monitor-exit v0

    return v2

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static h(Landroid/content/Context;Z)Lmo/d;
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-static {p0}, Lmo/d;->f(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move p0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move p0, v0

    :goto_1
    invoke-static {p0}, Llo/a;->i(Z)V

    new-instance p0, Lmo/c;

    const-string v2, "ExoPlayer:DummySurface"

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3}, Lmo/c;-><init>(Ljava/lang/String;I)V

    if-eqz p1, :cond_2

    sget p1, Lmo/d;->z:I

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    new-instance v2, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v2, p0, Lmo/c;->x:Landroid/os/Handler;

    new-instance v3, Llo/c;

    invoke-direct {v3, v2}, Llo/c;-><init>(Landroid/os/Handler;)V

    iput-object v3, p0, Lmo/c;->E:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lmo/c;->x:Landroid/os/Handler;

    invoke-virtual {v2, v0, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :goto_3
    iget-object p1, p0, Lmo/c;->F:Landroid/view/Surface;

    check-cast p1, Lmo/d;

    if-nez p1, :cond_3

    iget-object p1, p0, Lmo/c;->z:Ljava/lang/RuntimeException;

    if-nez p1, :cond_3

    iget-object p1, p0, Lmo/c;->y:Ljava/lang/Error;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_3

    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move v1, v0

    goto :goto_3

    :cond_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    iget-object p1, p0, Lmo/c;->z:Ljava/lang/RuntimeException;

    if-nez p1, :cond_6

    iget-object p1, p0, Lmo/c;->y:Ljava/lang/Error;

    if-nez p1, :cond_5

    iget-object p0, p0, Lmo/c;->F:Landroid/view/Surface;

    check-cast p0, Lmo/d;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0

    :cond_5
    throw p1

    :cond_6
    throw p1

    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method


# virtual methods
.method public final release()V
    .locals 3

    invoke-super {p0}, Landroid/view/Surface;->release()V

    iget-object v0, p0, Lmo/d;->x:Lmo/c;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lmo/d;->y:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lmo/d;->x:Lmo/c;

    iget-object v2, v1, Lmo/c;->x:Landroid/os/Handler;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lmo/c;->x:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lmo/d;->y:Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
