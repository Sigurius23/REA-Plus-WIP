.class final Lwz2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/opengl/EGLDisplay;

.field private b:Landroid/opengl/EGLContext;

.field private c:Landroid/opengl/EGLConfig;

.field private d:I

.field private e:Ltr2/n;


# direct methods
.method public constructor <init>(ILtr2/n;)V
    .locals 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    iput-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    iput-object v0, p0, Lwz2/a;->b:Landroid/opengl/EGLContext;

    const/4 v1, 0x0

    iput-object v1, p0, Lwz2/a;->c:Landroid/opengl/EGLConfig;

    const/4 v2, -0x1

    iput v2, p0, Lwz2/a;->d:I

    iput-object p2, p0, Lwz2/a;->e:Ltr2/n;

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v3

    iput-object v3, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-eq v3, v4, :cond_4

    const/4 v4, 0x2

    new-array v5, v4, [I

    const/4 v6, 0x1

    invoke-static {v3, v5, v2, v5, v6}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v3

    if-eqz v3, :cond_3

    and-int/lit8 v1, p1, 0x2

    const/16 v3, 0x3038

    const/16 v5, 0x3098

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    invoke-direct {p0, p1, v1}, Lwz2/a;->c(II)Landroid/opengl/EGLConfig;

    move-result-object v7

    if-eqz v7, :cond_0

    filled-new-array {v5, v1, v3}, [I

    move-result-object v8

    iget-object v9, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    invoke-static {v9, v7, v0, v8, v2}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v8

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v9

    const/16 v10, 0x3000

    if-ne v9, v10, :cond_0

    iput-object v7, p0, Lwz2/a;->c:Landroid/opengl/EGLConfig;

    iput-object v8, p0, Lwz2/a;->b:Landroid/opengl/EGLContext;

    iput v1, p0, Lwz2/a;->d:I

    :cond_0
    iget-object v1, p0, Lwz2/a;->b:Landroid/opengl/EGLContext;

    sget-object v7, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    if-ne v1, v7, :cond_2

    invoke-direct {p0, p1, v4}, Lwz2/a;->c(II)Landroid/opengl/EGLConfig;

    move-result-object p1

    if-eqz p1, :cond_1

    filled-new-array {v5, v4, v3}, [I

    move-result-object v1

    iget-object v3, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    invoke-static {v3, p1, v0, v1, v2}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v0

    const-string v1, "eglCreateContext"

    invoke-direct {p0, v1}, Lwz2/a;->a(Ljava/lang/String;)V

    iput-object p1, p0, Lwz2/a;->c:Landroid/opengl/EGLConfig;

    iput-object v0, p0, Lwz2/a;->b:Landroid/opengl/EGLContext;

    iput v4, p0, Lwz2/a;->d:I

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unable to find a suitable EGLConfig"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    new-array p1, v6, [I

    iget-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lwz2/a;->b:Landroid/opengl/EGLContext;

    invoke-static {v0, v1, v5, p1, v2}, Landroid/opengl/EGL14;->eglQueryContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;I[II)Z

    const-string v0, "eglQueryContext"

    invoke-direct {p0, v0}, Lwz2/a;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EGLContext created, client version "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget p1, p1, v2

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_3
    iput-object v1, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "unable to initialize EGL14"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unable to get EGL14 display"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v0

    const/16 v1, 0x3000

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, ": EGL error: 0x"

    invoke-static {p1, v2}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private c(II)Landroid/opengl/EGLConfig;
    .locals 13

    const/4 v0, 0x4

    const/4 v1, 0x3

    if-lt p2, v1, :cond_0

    const/16 v2, 0x44

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const/16 v3, 0xd

    new-array v5, v3, [I

    const/16 v3, 0x3024

    const/4 v12, 0x0

    aput v3, v5, v12

    const/4 v3, 0x1

    const/16 v4, 0x8

    aput v4, v5, v3

    const/4 v6, 0x2

    const/16 v7, 0x3023

    aput v7, v5, v6

    aput v4, v5, v1

    const/16 v1, 0x3022

    aput v1, v5, v0

    const/4 v0, 0x5

    aput v4, v5, v0

    const/4 v0, 0x6

    const/16 v1, 0x3021

    aput v1, v5, v0

    const/4 v0, 0x7

    aput v4, v5, v0

    const/16 v0, 0x3040

    aput v0, v5, v4

    const/16 v0, 0x9

    aput v2, v5, v0

    const/16 v0, 0xa

    const/16 v1, 0x3038

    aput v1, v5, v0

    const/16 v2, 0xb

    aput v12, v5, v2

    const/16 v4, 0xc

    aput v1, v5, v4

    and-int/2addr p1, v3

    if-eqz p1, :cond_1

    const/16 p1, 0x3142

    aput p1, v5, v0

    aput v3, v5, v2

    :cond_1
    const/4 v9, 0x1

    new-array v7, v9, [Landroid/opengl/EGLConfig;

    new-array v10, v3, [I

    iget-object v4, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v11}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lwz2/a;->e:Ltr2/n;

    const-string v0, "unable to find RGB8888 / "

    const-string v1, " EGLConfig"

    invoke-static {p2, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v12, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1

    :cond_2
    aget-object p1, v7, v12

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/Object;)Landroid/opengl/EGLSurface;
    .locals 4

    instance-of v0, p1, Landroid/view/Surface;

    if-nez v0, :cond_1

    instance-of v0, p1, Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Invalid surface: "

    invoke-static {p1, v1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/16 v0, 0x3038

    filled-new-array {v0}, [I

    move-result-object v0

    iget-object v1, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lwz2/a;->c:Landroid/opengl/EGLConfig;

    const/4 v3, 0x0

    invoke-static {v1, v2, p1, v0, v3}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    move-result-object p1

    const-string v0, "eglCreateWindowSurface"

    invoke-direct {p0, v0}, Lwz2/a;->a(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Surface was null"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Landroid/opengl/EGLSurface;)V
    .locals 3

    iget-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lwz2/a;->e:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "makeCurrent without display"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    iget-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lwz2/a;->b:Landroid/opengl/EGLContext;

    invoke-static {v0, p1, p1, v1}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "eglMakeCurrent failed"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-eq v0, v1, :cond_0

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    iget-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lwz2/a;->b:Landroid/opengl/EGLContext;

    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    iget-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    :cond_0
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    iput-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    iput-object v0, p0, Lwz2/a;->b:Landroid/opengl/EGLContext;

    const/4 v0, 0x0

    iput-object v0, p0, Lwz2/a;->c:Landroid/opengl/EGLConfig;

    return-void
.end method

.method public f(Landroid/opengl/EGLSurface;)V
    .locals 1

    iget-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    invoke-static {v0, p1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    return-void
.end method

.method public finalize()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lwz2/a;->e:Ltr2/n;

    const-string v1, "EglCore was not explicitly released -- state may be leaked"

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lwz2/a;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :goto_1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public g(Landroid/opengl/EGLSurface;)Z
    .locals 1

    iget-object v0, p0, Lwz2/a;->a:Landroid/opengl/EGLDisplay;

    invoke-static {v0, p1}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    move-result p1

    return p1
.end method
