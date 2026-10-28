.class public abstract Lsz2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsz2/b$a;,
        Lsz2/b$b;
    }
.end annotation


# static fields
.field private static d0:[F

.field private static e0:[S

.field private static final f0:Landroid/util/SparseIntArray;


# instance fields
.field protected E:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field protected F:I

.field protected G:I

.field protected H:Landroid/graphics/SurfaceTexture;

.field private I:Ljava/lang/String;

.field private J:Ljava/lang/String;

.field private K:Ljava/nio/FloatBuffer;

.field private L:[F

.field protected M:I

.field private N:Ljava/nio/FloatBuffer;

.field private O:Ljava/nio/ShortBuffer;

.field private P:I

.field private Q:I

.field private R:[I

.field private S:[I

.field private T:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lsz2/b$b;",
            ">;"
        }
    .end annotation
.end field

.field private U:[F

.field private V:F

.field private W:Lsz2/b$a;

.field private X:I

.field private Y:I

.field private Z:Lrz2/c;

.field private a0:Ljava/lang/String;

.field private b0:Ljava/lang/String;

.field private c0:Z

.field private w:Ltr2/o;

.field private x:I

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

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

    const/4 v7, 0x2

    aput v0, v5, v7

    const/4 v8, 0x3

    aput v0, v5, v8

    const/4 v9, 0x4

    aput v2, v5, v9

    const/4 v2, 0x5

    aput v3, v5, v2

    const/4 v2, 0x6

    aput v0, v5, v2

    const/4 v0, 0x7

    aput v4, v5, v0

    sput-object v5, Lsz2/b;->d0:[F

    new-array v0, v2, [S

    fill-array-data v0, :array_0

    sput-object v0, Lsz2/b;->e0:[S

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lsz2/b;->f0:Landroid/util/SparseIntArray;

    const/16 v2, 0x5a

    invoke-virtual {v0, v6, v2}, Landroid/util/SparseIntArray;->append(II)V

    invoke-virtual {v0, v1, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x10e

    invoke-virtual {v0, v7, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0xb4

    invoke-virtual {v0, v8, v1}, Landroid/util/SparseIntArray;->append(II)V

    return-void

    nop

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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lsz2/b;->x:I

    const-string v1, "shaders/video.frag.glsl"

    iput-object v1, p0, Lsz2/b;->y:Ljava/lang/String;

    const-string v2, "shaders/video.vert.glsl"

    iput-object v2, p0, Lsz2/b;->z:Ljava/lang/String;

    const/16 v3, 0x8

    new-array v3, v3, [F

    fill-array-data v3, :array_0

    iput-object v3, p0, Lsz2/b;->L:[F

    const/16 v3, 0x10

    new-array v4, v3, [I

    iput-object v4, p0, Lsz2/b;->R:[I

    new-array v4, v3, [I

    fill-array-data v4, :array_1

    iput-object v4, p0, Lsz2/b;->S:[I

    new-array v3, v3, [F

    iput-object v3, p0, Lsz2/b;->U:[F

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, p0, Lsz2/b;->V:F

    iput-boolean v0, p0, Lsz2/b;->c0:Z

    invoke-direct {p0, p1, v1, v2}, Lsz2/b;->o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->d()Ltr2/n;

    move-result-object v0

    const-string v1, "WhoopVideoRendererBase"

    invoke-direct {p1, v0, v1}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object p1, p0, Lsz2/b;->w:Ltr2/o;

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

    :array_1
    .array-data 4
        0x84c1
        0x84c2
        0x84c3
        0x84c4
        0x84c5
        0x84c6
        0x84c7
        0x84c8
        0x84c9
        0x84ca
        0x84cb
        0x84cc
        0x84cd
        0x84ce
        0x84cf
        0x84d0
    .end array-data
.end method

.method private o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lsz2/b;->E:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lsz2/b;->a0:Ljava/lang/String;

    iput-object p3, p0, Lsz2/b;->b0:Ljava/lang/String;

    invoke-direct {p0, p2, p3}, Lsz2/b;->q(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsz2/b;->E:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p0, v0, p1}, Lsz2/b;->m(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lsz2/b;->J:Ljava/lang/String;

    iget-object p1, p0, Lsz2/b;->E:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, Lsz2/b;->m(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lsz2/b;->I:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "loadFromShadersFromAssets() failed. Check paths to assets.\n"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "WhoopVideoRendererBase"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private s()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    iget-object v0, p0, Lsz2/b;->R:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const v1, 0x8d65

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const-string v0, "Texture bind"

    invoke-virtual {p0, v0}, Lsz2/b;->h(Ljava/lang/String;)V

    return-void
.end method

.method public B()V
    .locals 5

    const v0, 0x8b31

    invoke-static {v0}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v0

    iget-object v1, p0, Lsz2/b;->I:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const-string v1, "Vertex shader compile"

    invoke-virtual {p0, v1}, Lsz2/b;->h(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "vertexShader info log:\n "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WhoopVideoRendererBase"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const v1, 0x8b30

    invoke-static {v1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v1

    iget-object v3, p0, Lsz2/b;->J:Ljava/lang/String;

    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {v1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const-string v3, "Pixel shader compile"

    invoke-virtual {p0, v3}, Lsz2/b;->h(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "fragmentShader info log:\n "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v2

    iput v2, p0, Lsz2/b;->M:I

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Lsz2/b;->M:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Lsz2/b;->M:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const-string v0, "Shader program compile"

    invoke-virtual {p0, v0}, Lsz2/b;->h(Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v1, v0, [I

    iget v2, p0, Lsz2/b;->M:I

    const v3, 0x8b82

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v1, v1, v4

    if-eq v1, v0, :cond_0

    iget v0, p0, Lsz2/b;->M:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error while linking program:\n"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SurfaceTest"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public C()V
    .locals 3

    iget-object v0, p0, Lsz2/b;->L:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lsz2/b;->K:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lsz2/b;->L:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lsz2/b;->K:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    const/16 v0, 0x10

    iget-object v2, p0, Lsz2/b;->R:[I

    invoke-static {v0, v2, v1}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    const-string v0, "Texture generate"

    invoke-virtual {p0, v0}, Lsz2/b;->h(Ljava/lang/String;)V

    return-void
.end method

.method public D()V
    .locals 3

    sget-object v0, Lsz2/b;->e0:[S

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    iput-object v0, p0, Lsz2/b;->O:Ljava/nio/ShortBuffer;

    sget-object v1, Lsz2/b;->e0:[S

    invoke-virtual {v0, v1}, Ljava/nio/ShortBuffer;->put([S)Ljava/nio/ShortBuffer;

    iget-object v0, p0, Lsz2/b;->O:Ljava/nio/ShortBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ShortBuffer;->position(I)Ljava/nio/Buffer;

    sget-object v0, Lsz2/b;->d0:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lsz2/b;->N:Ljava/nio/FloatBuffer;

    sget-object v2, Lsz2/b;->d0:[F

    invoke-virtual {v0, v2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lsz2/b;->N:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public E(ILandroid/graphics/Bitmap;)V
    .locals 2

    iget-object v0, p0, Lsz2/b;->S:[I

    add-int/lit8 v1, p1, -0x1

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const-string v0, "Texture generate"

    invoke-virtual {p0, v0}, Lsz2/b;->h(Ljava/lang/String;)V

    iget-object v0, p0, Lsz2/b;->R:[I

    aget p1, v0, p1

    const/16 v0, 0xde1

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const-string p1, "Texture bind"

    invoke-virtual {p0, p1}, Lsz2/b;->h(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {v0, p1, p1, p1, p2}, Landroid/opengl/GLUtils;->texSubImage2D(IIIILandroid/graphics/Bitmap;)V

    const-string p1, "Tex Sub Image"

    invoke-virtual {p0, p1}, Lsz2/b;->h(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    return-void
.end method

.method public a()V
    .locals 1

    invoke-virtual {p0}, Lsz2/b;->i()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsz2/b;->T:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lsz2/b;->p()V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lsz2/b;->H:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lsz2/b;->c0:Z

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsz2/b;->c0:Z

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lsz2/b;->Z:Lrz2/c;

    invoke-virtual {v0}, Lrz2/c;->K()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lsz2/b;->Z:Lrz2/c;

    invoke-virtual {v0}, Lrz2/c;->K()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    iput-object v0, p0, Lsz2/b;->H:Landroid/graphics/SurfaceTexture;

    return-void

    :cond_2
    iget-object v0, p0, Lsz2/b;->Z:Lrz2/c;

    invoke-virtual {p0}, Lsz2/b;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Lrz2/c;->N(I)V

    return-void
.end method

.method public d()V
    .locals 0

    invoke-virtual {p0}, Lsz2/b;->i()V

    return-void
.end method

.method public e()V
    .locals 6

    iget v0, p0, Lsz2/b;->x:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    iget v2, p0, Lsz2/b;->x:I

    if-ge v0, v2, :cond_0

    :try_start_0
    iget-object v2, p0, Lsz2/b;->H:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    iget-object v2, p0, Lsz2/b;->H:Landroid/graphics/SurfaceTexture;

    iget-object v3, p0, Lsz2/b;->U:[F

    invoke-virtual {v2, v3}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    iget v2, p0, Lsz2/b;->x:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lsz2/b;->x:I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    iget-object v3, p0, Lsz2/b;->w:Ltr2/o;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Surface Texture Couldn\'t able to update tex image "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v1, [Lqr2/a$a;

    invoke-virtual {v3, v2, v4}, Ltr2/o;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lsz2/b;->X:I

    iget v2, p0, Lsz2/b;->Y:I

    invoke-static {v1, v1, v0, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const/4 v0, 0x0

    const v1, 0x3ea8a8b1

    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v0, 0x4000

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    iget v0, p0, Lsz2/b;->M:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    invoke-virtual {p0}, Lsz2/b;->y()V

    invoke-virtual {p0}, Lsz2/b;->v()V

    invoke-virtual {p0}, Lsz2/b;->k()V

    invoke-virtual {p0}, Lsz2/b;->r()V

    return-void
.end method

.method public f(ILandroid/graphics/Bitmap;Ljava/lang/String;Z)I
    .locals 7

    iget-object v0, p0, Lsz2/b;->T:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    invoke-static {p1}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const-string v0, "Texture generate"

    invoke-virtual {p0, v0}, Lsz2/b;->h(Ljava/lang/String;)V

    iget-object v0, p0, Lsz2/b;->R:[I

    aget v0, v0, v3

    const/16 v1, 0xde1

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const-string v0, "Texture bind"

    invoke-virtual {p0, v0}, Lsz2/b;->h(Ljava/lang/String;)V

    const/16 v0, 0x2801

    const/high16 v2, 0x46180000    # 9728.0f

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2800

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/4 v0, 0x0

    invoke-static {v1, v0, p2, v0}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    if-eqz p4, :cond_0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    new-instance v1, Lsz2/b$b;

    const/4 v6, 0x0

    move-object v2, p0

    move v4, p1

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lsz2/b$b;-><init>(Lsz2/b;IILjava/lang/String;I)V

    iget-object p1, v2, Lsz2/b;->T:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, v2, Lsz2/b;->T:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "addedTexture() "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, v2, Lsz2/b;->R:[I

    aget p2, p2, v3

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " : "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "WhoopVideoRendererBase"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return v3
.end method

.method public g(Landroid/graphics/Bitmap;Ljava/lang/String;)I
    .locals 4

    iget-object v0, p0, Lsz2/b;->S:[I

    iget-object v1, p0, Lsz2/b;->T:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    aget v0, v0, v1

    iget-object v1, p0, Lsz2/b;->T:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    const/16 v3, 0x10

    if-ge v1, v3, :cond_0

    invoke-virtual {p0, v0, p1, p2, v2}, Lsz2/b;->f(ILandroid/graphics/Bitmap;Ljava/lang/String;Z)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Too many textures! Please don\'t use so many :("

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(Ljava/lang/String;)V
    .locals 2

    :goto_0
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, ": glError "

    invoke-static {p1, v1}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SurfaceTest"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()V
    .locals 0

    invoke-virtual {p0}, Lsz2/b;->j()V

    return-void
.end method

.method public j()V
    .locals 3

    iget-object v0, p0, Lsz2/b;->R:[I

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    iget v0, p0, Lsz2/b;->M:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    return-void
.end method

.method public k()V
    .locals 4

    sget-object v0, Lsz2/b;->e0:[S

    array-length v0, v0

    const/16 v1, 0x1403

    iget-object v2, p0, Lsz2/b;->O:Ljava/nio/ShortBuffer;

    const/4 v3, 0x4

    invoke-static {v3, v0, v1, v2}, Landroid/opengl/GLES20;->glDrawElements(IIILjava/nio/Buffer;)V

    return-void
.end method

.method public l()I
    .locals 2

    iget-object v0, p0, Lsz2/b;->R:[I

    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public m(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lsz2/b;->n(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public n(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    new-instance p2, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p2, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {p2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    if-eqz p3, :cond_0

    const-string v2, "\n"

    goto :goto_1

    :cond_0
    const-string v2, ""

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    iget p1, p0, Lsz2/b;->x:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lsz2/b;->x:I

    iget-object p1, p0, Lsz2/b;->H:Landroid/graphics/SurfaceTexture;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lsz2/b;->Z:Lrz2/c;

    invoke-virtual {p1}, Lrz2/c;->K()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lsz2/b;->Z:Lrz2/c;

    invoke-virtual {p1}, Lrz2/c;->K()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    iput-object p1, p0, Lsz2/b;->H:Landroid/graphics/SurfaceTexture;

    :cond_1
    :goto_0
    return-void
.end method

.method public onSurfaceChanged(II)V
    .locals 1

    iput p2, p0, Lsz2/b;->G:I

    iput p1, p0, Lsz2/b;->F:I

    iput p2, p0, Lsz2/b;->Y:I

    iput p1, p0, Lsz2/b;->X:I

    const/high16 v0, 0x3f800000    # 1.0f

    int-to-float p1, p1

    mul-float/2addr p1, v0

    int-to-float p2, p2

    div-float/2addr p1, p2

    iput p1, p0, Lsz2/b;->V:F

    return-void
.end method

.method public p()V
    .locals 0

    invoke-direct {p0}, Lsz2/b;->s()V

    invoke-virtual {p0}, Lsz2/b;->D()V

    invoke-virtual {p0}, Lsz2/b;->C()V

    invoke-virtual {p0}, Lsz2/b;->A()V

    invoke-virtual {p0}, Lsz2/b;->B()V

    invoke-virtual {p0}, Lsz2/b;->t()V

    return-void
.end method

.method public r()V
    .locals 1

    iget v0, p0, Lsz2/b;->Q:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    iget v0, p0, Lsz2/b;->P:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    return-void
.end method

.method public t()V
    .locals 1

    iget-object v0, p0, Lsz2/b;->W:Lsz2/b$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lsz2/b$a;->n()V

    :cond_0
    return-void
.end method

.method public u(F)V
    .locals 0

    iput p1, p0, Lsz2/b;->V:F

    return-void
.end method

.method public v()V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lsz2/b;->T:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lsz2/b;->T:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsz2/b$b;

    iget v2, p0, Lsz2/b;->M:I

    iget-object v3, v1, Lsz2/b$b;->c:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iget v3, v1, Lsz2/b$b;->b:I

    invoke-static {v3}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    iget-object v3, p0, Lsz2/b;->R:[I

    iget v4, v1, Lsz2/b$b;->a:I

    aget v3, v3, v4

    const/16 v4, 0xde1

    invoke-static {v4, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget v1, v1, Lsz2/b$b;->a:I

    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w(Lsz2/b$a;)V
    .locals 0

    iput-object p1, p0, Lsz2/b;->W:Lsz2/b$a;

    return-void
.end method

.method public x(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    iput-object p1, p0, Lsz2/b;->H:Landroid/graphics/SurfaceTexture;

    invoke-virtual {p1, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    return-void
.end method

.method public y()V
    .locals 10

    iget v0, p0, Lsz2/b;->M:I

    const-string v1, "camTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iget v1, p0, Lsz2/b;->M:I

    const-string v2, "camTextureTransform"

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v1

    iget v2, p0, Lsz2/b;->M:I

    const-string v3, "camTexCoordinate"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, p0, Lsz2/b;->P:I

    iget v2, p0, Lsz2/b;->M:I

    const-string v3, "position"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, p0, Lsz2/b;->Q:I

    invoke-static {v2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v3, p0, Lsz2/b;->Q:I

    const/16 v7, 0x8

    iget-object v8, p0, Lsz2/b;->N:Ljava/nio/FloatBuffer;

    const/4 v4, 0x2

    const/16 v5, 0x1406

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    const v2, 0x84c0

    invoke-static {v2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    iget-object v2, p0, Lsz2/b;->R:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    const v4, 0x8d65

    invoke-static {v4, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glUniform1i(II)V

    iget v0, p0, Lsz2/b;->P:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v4, p0, Lsz2/b;->P:I

    const/16 v8, 0x8

    iget-object v9, p0, Lsz2/b;->K:Ljava/nio/FloatBuffer;

    const/4 v5, 0x2

    const/16 v6, 0x1406

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    const/4 v0, 0x1

    iget-object v2, p0, Lsz2/b;->U:[F

    invoke-static {v1, v0, v3, v2, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    return-void
.end method

.method public z(Lrz2/c;)V
    .locals 1

    iput-object p1, p0, Lsz2/b;->Z:Lrz2/c;

    invoke-virtual {p0}, Lsz2/b;->l()I

    move-result v0

    invoke-virtual {p1, v0}, Lrz2/c;->N(I)V

    return-void
.end method
