.class public Lwz2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lwz2/a;

.field private b:Landroid/opengl/EGLSurface;

.field private c:I

.field private d:I

.field private e:Ltr2/n;


# direct methods
.method public constructor <init>(Lwz2/a;Landroid/graphics/SurfaceTexture;Ltr2/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    iput-object v0, p0, Lwz2/c;->b:Landroid/opengl/EGLSurface;

    const/4 v0, -0x1

    iput v0, p0, Lwz2/c;->c:I

    iput v0, p0, Lwz2/c;->d:I

    iput-object p1, p0, Lwz2/c;->a:Lwz2/a;

    iput-object p3, p0, Lwz2/c;->e:Ltr2/n;

    invoke-virtual {p1, p2}, Lwz2/a;->b(Ljava/lang/Object;)Landroid/opengl/EGLSurface;

    move-result-object p1

    iput-object p1, p0, Lwz2/c;->b:Landroid/opengl/EGLSurface;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lwz2/c;->a:Lwz2/a;

    iget-object v1, p0, Lwz2/c;->b:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v1}, Lwz2/a;->d(Landroid/opengl/EGLSurface;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lwz2/c;->a:Lwz2/a;

    iget-object v1, p0, Lwz2/c;->b:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v1}, Lwz2/a;->f(Landroid/opengl/EGLSurface;)V

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    iput-object v0, p0, Lwz2/c;->b:Landroid/opengl/EGLSurface;

    const/4 v0, -0x1

    iput v0, p0, Lwz2/c;->c:I

    iput v0, p0, Lwz2/c;->d:I

    return-void
.end method

.method public c()Z
    .locals 4

    iget-object v0, p0, Lwz2/c;->a:Lwz2/a;

    iget-object v1, p0, Lwz2/c;->b:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v1}, Lwz2/a;->g(Landroid/opengl/EGLSurface;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lwz2/c;->e:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "swapBuffers() failed"

    invoke-interface {v1, v3, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return v0
.end method
