.class public Lwz2/b;
.super Ljava/lang/Thread;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# static fields
.field private static m0:[F

.field private static n0:[S


# instance fields
.field private E:F

.field private F:Landroid/graphics/SurfaceTexture;

.field private G:Lwz2/c;

.field private H:Landroid/graphics/SurfaceTexture;

.field private I:Lwz2/a;

.field private J:Ljava/lang/String;

.field private K:Ljava/lang/String;

.field private L:Ljava/nio/FloatBuffer;

.field private M:[F

.field private N:I

.field private O:Ljava/nio/FloatBuffer;

.field private P:Ljava/nio/ShortBuffer;

.field private Q:Z

.field private R:I

.field private S:I

.field private T:I

.field private U:I

.field private V:I

.field private W:I

.field private X:I

.field private Y:I

.field private Z:I

.field private a0:[I

.field private b0:[F

.field private c0:Lmh3/c;

.field private d0:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field

.field private e0:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private f0:I

.field private g0:I

.field private h0:Luz2/a;

.field private i0:F

.field private j0:F

.field private k0:F

.field private l0:Ltr2/n;

.field private w:Landroid/content/Context;

.field private x:Landroid/os/Handler;

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/high16 v0, 0x3f800000    # 1.0f

    neg-float v1, v0

    neg-float v2, v0

    neg-float v3, v0

    neg-float v4, v0

    const/16 v5, 0x8

    new-array v5, v5, [F

    const/4 v6, 0x0

    aput v1, v5, v6

    const/4 v1, 0x1

    aput v0, v5, v1

    const/4 v1, 0x2

    aput v0, v5, v1

    const/4 v1, 0x3

    aput v0, v5, v1

    const/4 v1, 0x4

    aput v2, v5, v1

    const/4 v1, 0x5

    aput v3, v5, v1

    const/4 v1, 0x6

    aput v0, v5, v1

    const/4 v0, 0x7

    aput v4, v5, v0

    sput-object v5, Lwz2/b;->m0:[F

    new-array v0, v1, [S

    fill-array-data v0, :array_0

    sput-object v0, Lwz2/b;->n0:[S

    return-void

    :array_0
    .array-data 2
        0x0s
        0x1s
        0x2s
        0x1s
        0x3s
        0x2s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/graphics/SurfaceTexture;IILxg3/g;Lxg3/g;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/graphics/SurfaceTexture;",
            "II",
            "Lxg3/g<",
            "Luz2/a;",
            ">;",
            "Lxg3/g<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lwz2/b;->M:[F

    const/4 v0, 0x1

    new-array v1, v0, [I

    iput-object v1, p0, Lwz2/b;->a0:[I

    const/16 v1, 0x10

    new-array v1, v1, [F

    iput-object v1, p0, Lwz2/b;->b0:[F

    new-instance v1, Lmh3/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lwz2/b;->c0:Lmh3/c;

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object v1

    iput-object v1, p0, Lwz2/b;->d0:Llh3/e;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object v0

    iput-object v0, p0, Lwz2/b;->e0:Llh3/b;

    new-instance v0, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->d()Ltr2/n;

    move-result-object v1

    const-string v2, "Selfie.EglRenderer"

    invoke-direct {v0, v1, v2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object v0, p0, Lwz2/b;->l0:Ltr2/n;

    iput-object p1, p0, Lwz2/b;->w:Landroid/content/Context;

    iput-object p2, p0, Lwz2/b;->F:Landroid/graphics/SurfaceTexture;

    iput p3, p0, Lwz2/b;->y:I

    iput p4, p0, Lwz2/b;->z:I

    int-to-float p1, p3

    int-to-float p2, p4

    div-float/2addr p1, p2

    iput p1, p0, Lwz2/b;->E:F

    iget-object p1, p0, Lwz2/b;->c0:Lmh3/c;

    new-instance p2, Lwz2/b$a;

    invoke-direct {p2, p0}, Lwz2/b$a;-><init>(Lwz2/b;)V

    invoke-virtual {p6, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p2

    invoke-virtual {p1, p2}, Lmh3/c;->c(Lxg3/t;)V

    iget-object p1, p0, Lwz2/b;->c0:Lmh3/c;

    new-instance p2, Lwz2/b$b;

    invoke-direct {p2, p0}, Lwz2/b$b;-><init>(Lwz2/b;)V

    invoke-virtual {p5, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p2

    invoke-virtual {p1, p2}, Lmh3/c;->c(Lxg3/t;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static bridge synthetic a(Lwz2/b;Luz2/a;)V
    .locals 0

    iput-object p1, p0, Lwz2/b;->h0:Luz2/a;

    return-void
.end method

.method public static bridge synthetic b(Lwz2/b;F)V
    .locals 0

    iput p1, p0, Lwz2/b;->k0:F

    return-void
.end method

.method public static bridge synthetic c(Lwz2/b;F)V
    .locals 0

    iput p1, p0, Lwz2/b;->j0:F

    return-void
.end method

.method public static bridge synthetic d(Lwz2/b;F)V
    .locals 0

    iput p1, p0, Lwz2/b;->i0:F

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    :goto_0
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lwz2/b;->l0:Ltr2/n;

    const-string v2, ": glError "

    invoke-static {p1, v2}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private f()V
    .locals 1

    invoke-direct {p0}, Lwz2/b;->g()V

    iget-object v0, p0, Lwz2/b;->G:Lwz2/c;

    invoke-virtual {v0}, Lwz2/c;->b()V

    iget-object v0, p0, Lwz2/b;->I:Lwz2/a;

    invoke-virtual {v0}, Lwz2/a;->e()V

    return-void
.end method

.method private g()V
    .locals 3

    iget-object v0, p0, Lwz2/b;->a0:[I

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    iget v0, p0, Lwz2/b;->N:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    iget-object v0, p0, Lwz2/b;->H:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    iget-object v0, p0, Lwz2/b;->H:Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    return-void
.end method

.method private h()V
    .locals 4

    iget v0, p0, Lwz2/b;->f0:I

    iget v1, p0, Lwz2/b;->g0:I

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v0, 0x4000

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    iget v0, p0, Lwz2/b;->N:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    invoke-direct {p0}, Lwz2/b;->q()V

    sget-object v0, Lwz2/b;->n0:[S

    array-length v0, v0

    const/16 v1, 0x1403

    iget-object v2, p0, Lwz2/b;->P:Ljava/nio/ShortBuffer;

    const/4 v3, 0x4

    invoke-static {v3, v0, v1, v2}, Landroid/opengl/GLES20;->glDrawElements(IIILjava/nio/Buffer;)V

    iget v0, p0, Lwz2/b;->S:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    iget v0, p0, Lwz2/b;->R:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    return-void
.end method

.method private k(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lwz2/b;->w:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private l()V
    .locals 4

    new-instance v0, Lwz2/a;

    const/4 v1, 0x3

    iget-object v2, p0, Lwz2/b;->l0:Ltr2/n;

    invoke-direct {v0, v1, v2}, Lwz2/a;-><init>(ILtr2/n;)V

    iput-object v0, p0, Lwz2/b;->I:Lwz2/a;

    new-instance v1, Lwz2/c;

    iget-object v2, p0, Lwz2/b;->F:Landroid/graphics/SurfaceTexture;

    iget-object v3, p0, Lwz2/b;->l0:Ltr2/n;

    invoke-direct {v1, v0, v2, v3}, Lwz2/c;-><init>(Lwz2/a;Landroid/graphics/SurfaceTexture;Ltr2/n;)V

    iput-object v1, p0, Lwz2/b;->G:Lwz2/c;

    invoke-virtual {v1}, Lwz2/c;->a()V

    invoke-direct {p0}, Lwz2/b;->m()V

    return-void
.end method

.method private m()V
    .locals 2

    invoke-direct {p0}, Lwz2/b;->v()V

    invoke-direct {p0}, Lwz2/b;->u()V

    invoke-direct {p0}, Lwz2/b;->s()V

    invoke-direct {p0}, Lwz2/b;->t()V

    iget-object v0, p0, Lwz2/b;->e0:Llh3/b;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private n()V
    .locals 4

    iget v0, p0, Lwz2/b;->y:I

    iget v1, p0, Lwz2/b;->z:I

    invoke-direct {p0, v0, v1}, Lwz2/b;->r(II)V

    iget-object v0, p0, Lwz2/b;->J:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lwz2/b;->K:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    :try_start_0
    const-string v0, "shaders/cameratint.frag.glsl"

    invoke-direct {p0, v0}, Lwz2/b;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lwz2/b;->J:Ljava/lang/String;

    const-string v0, "shaders/cameratint.vert.glsl"

    invoke-direct {p0, v0}, Lwz2/b;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lwz2/b;->K:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lwz2/b;->l0:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Failed to load shaders"

    invoke-interface {v1, v3, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method private o()V
    .locals 2

    iget v0, p0, Lwz2/b;->N:I

    const-string v1, "camTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lwz2/b;->T:I

    iget v0, p0, Lwz2/b;->N:I

    const-string v1, "camTextureTransform"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lwz2/b;->U:I

    iget v0, p0, Lwz2/b;->N:I

    const-string v1, "camTexCoordinate"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lwz2/b;->R:I

    iget v0, p0, Lwz2/b;->N:I

    const-string v1, "position"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lwz2/b;->S:I

    iget v0, p0, Lwz2/b;->N:I

    const-string v1, "overlay"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lwz2/b;->V:I

    iget v0, p0, Lwz2/b;->N:I

    const-string v1, "tintEnabled"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lwz2/b;->W:I

    iget v0, p0, Lwz2/b;->N:I

    const-string v1, "tintR"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lwz2/b;->X:I

    iget v0, p0, Lwz2/b;->N:I

    const-string v1, "tintG"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lwz2/b;->Y:I

    iget v0, p0, Lwz2/b;->N:I

    const-string v1, "tintB"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lwz2/b;->Z:I

    const-string v0, "attrib and uniform locations"

    invoke-direct {p0, v0}, Lwz2/b;->e(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwz2/b;->Q:Z

    return-void
.end method

.method private q()V
    .locals 8

    iget-boolean v0, p0, Lwz2/b;->Q:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lwz2/b;->o()V

    :cond_0
    iget v0, p0, Lwz2/b;->S:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v1, p0, Lwz2/b;->S:I

    const/16 v5, 0x8

    iget-object v6, p0, Lwz2/b;->O:Ljava/nio/FloatBuffer;

    const/4 v2, 0x2

    const/16 v3, 0x1406

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    iget-object v0, p0, Lwz2/b;->a0:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const v2, 0x8d65

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget v0, p0, Lwz2/b;->T:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    iget v0, p0, Lwz2/b;->R:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v2, p0, Lwz2/b;->R:I

    const/16 v6, 0x8

    iget-object v7, p0, Lwz2/b;->L:Ljava/nio/FloatBuffer;

    const/4 v3, 0x2

    const/16 v4, 0x1406

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v0, p0, Lwz2/b;->U:I

    iget-object v2, p0, Lwz2/b;->b0:[F

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2, v1}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    iget v0, p0, Lwz2/b;->X:I

    iget v2, p0, Lwz2/b;->i0:F

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    iget v0, p0, Lwz2/b;->Y:I

    iget v2, p0, Lwz2/b;->j0:F

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    iget v0, p0, Lwz2/b;->Z:I

    iget v2, p0, Lwz2/b;->k0:F

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    iget v0, p0, Lwz2/b;->W:I

    iget-object v2, p0, Lwz2/b;->h0:Luz2/a;

    sget-object v4, Luz2/a;->TINTED:Luz2/a;

    if-ne v2, v4, :cond_1

    move v1, v3

    :cond_1
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    iget-object v0, p0, Lwz2/b;->h0:Luz2/a;

    sget-object v1, Luz2/a;->DARK:Luz2/a;

    const/high16 v2, 0x3f800000    # 1.0f

    if-ne v0, v1, :cond_2

    iget v0, p0, Lwz2/b;->V:I

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v0, v1, v1, v1, v2}, Landroid/opengl/GLES20;->glUniform4f(IFFFF)V

    return-void

    :cond_2
    iget v0, p0, Lwz2/b;->V:I

    invoke-static {v0, v2, v2, v2, v2}, Landroid/opengl/GLES20;->glUniform4f(IFFFF)V

    return-void
.end method

.method private r(II)V
    .locals 2

    invoke-static {p2}, Lvz2/a;->b(I)I

    move-result v0

    invoke-static {p1}, Lvz2/a;->a(I)I

    move-result v1

    iput p1, p0, Lwz2/b;->f0:I

    iput p2, p0, Lwz2/b;->g0:I

    if-le v0, p1, :cond_0

    iput v0, p0, Lwz2/b;->f0:I

    :cond_0
    if-le v1, p2, :cond_1

    iput v1, p0, Lwz2/b;->g0:I

    :cond_1
    return-void
.end method

.method private s()V
    .locals 3

    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    iget-object v0, p0, Lwz2/b;->a0:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const v2, 0x8d65

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const-string v0, "Texture bound"

    invoke-direct {p0, v0}, Lwz2/b;->e(Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget-object v2, p0, Lwz2/b;->a0:[I

    aget v1, v2, v1

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, p0, Lwz2/b;->H:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    return-void
.end method

.method private t()V
    .locals 5

    const v0, 0x8b31

    invoke-static {v0}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v0

    iget-object v1, p0, Lwz2/b;->K:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const-string v1, "Vertex shader compile"

    invoke-direct {p0, v1}, Lwz2/b;->e(Ljava/lang/String;)V

    const v1, 0x8b30

    invoke-static {v1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v1

    iget-object v2, p0, Lwz2/b;->J:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {v1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const-string v2, "Pixel shader compile"

    invoke-direct {p0, v2}, Lwz2/b;->e(Ljava/lang/String;)V

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v2

    iput v2, p0, Lwz2/b;->N:I

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Lwz2/b;->N:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Lwz2/b;->N:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const-string v0, "Shader program compile"

    invoke-direct {p0, v0}, Lwz2/b;->e(Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v1, v0, [I

    iget v2, p0, Lwz2/b;->N:I

    const v3, 0x8b82

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v1, v1, v4

    if-eq v1, v0, :cond_0

    iget v0, p0, Lwz2/b;->N:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lwz2/b;->l0:Ltr2/n;

    const-string v2, "Error while linking program: "

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return-void
.end method

.method private u()V
    .locals 3

    iget-object v0, p0, Lwz2/b;->M:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lwz2/b;->L:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lwz2/b;->M:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lwz2/b;->L:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v0, 0x1

    iget-object v2, p0, Lwz2/b;->a0:[I

    invoke-static {v0, v2, v1}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    const-string v0, "Texture generated"

    invoke-direct {p0, v0}, Lwz2/b;->e(Ljava/lang/String;)V

    return-void
.end method

.method private v()V
    .locals 3

    sget-object v0, Lwz2/b;->n0:[S

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    iput-object v0, p0, Lwz2/b;->P:Ljava/nio/ShortBuffer;

    sget-object v1, Lwz2/b;->n0:[S

    invoke-virtual {v0, v1}, Ljava/nio/ShortBuffer;->put([S)Ljava/nio/ShortBuffer;

    iget-object v0, p0, Lwz2/b;->P:Ljava/nio/ShortBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ShortBuffer;->position(I)Ljava/nio/Buffer;

    sget-object v0, Lwz2/b;->m0:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lwz2/b;->O:Ljava/nio/FloatBuffer;

    sget-object v2, Lwz2/b;->m0:[F

    invoke-virtual {v0, v2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lwz2/b;->O:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method


# virtual methods
.method public i()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lwz2/b;->x:Landroid/os/Handler;

    return-object v0
.end method

.method public j()Landroid/graphics/SurfaceTexture;
    .locals 1

    iget-object v0, p0, Lwz2/b;->H:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lwz2/b;->H:Landroid/graphics/SurfaceTexture;

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    iget-object p1, p0, Lwz2/b;->H:Landroid/graphics/SurfaceTexture;

    iget-object v0, p0, Lwz2/b;->b0:[F

    invoke-virtual {p1, v0}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    invoke-direct {p0}, Lwz2/b;->h()V

    iget-object p1, p0, Lwz2/b;->G:Lwz2/c;

    invoke-virtual {p1}, Lwz2/c;->a()V

    iget-object p1, p0, Lwz2/b;->G:Lwz2/c;

    invoke-virtual {p1}, Lwz2/c;->c()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lwz2/b;->l0:Ltr2/n;

    const-string v0, "swapBuffers failed, killing renderer thread"

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lwz2/b;->w()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public p()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwz2/b;->e0:Llh3/b;

    return-object v0
.end method

.method public run()V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->prepare()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lwz2/b;->x:Landroid/os/Handler;

    invoke-direct {p0}, Lwz2/b;->l()V

    invoke-static {}, Landroid/os/Looper;->loop()V

    invoke-direct {p0}, Lwz2/b;->f()V

    iget-object v0, p0, Lwz2/b;->d0:Llh3/e;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Llh3/e;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized start()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lwz2/b;->n()V

    invoke-super {p0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public w()V
    .locals 1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/Looper;->quitSafely()V

    :cond_0
    iget-object v0, p0, Lwz2/b;->c0:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->d()V

    const/4 v0, 0x0

    iput-object v0, p0, Lwz2/b;->w:Landroid/content/Context;

    return-void
.end method
