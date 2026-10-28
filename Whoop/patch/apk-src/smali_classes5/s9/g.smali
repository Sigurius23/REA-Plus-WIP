.class public final Ls9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:[F

.field public static final j:[F

.field public static final k:[F


# instance fields
.field public a:I

.field public b:Lno/h;

.field public c:Lab/i0;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x9

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    sput-object v1, Ls9/g;->i:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_1

    sput-object v1, Ls9/g;->j:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_2

    sput-object v0, Ls9/g;->k:[F

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x41000000    # -0.5f
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static b(Ls9/e;)Z
    .locals 4

    iget-object v0, p0, Ls9/e;->a:Ls9/d;

    iget-object p0, p0, Ls9/e;->b:Ls9/d;

    iget-object v0, v0, Ls9/d;->a:[Lno/f;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    aget-object v0, v0, v2

    iget v0, v0, Lno/f;->a:I

    if-nez v0, :cond_0

    iget-object p0, p0, Ls9/d;->a:[Lno/f;

    array-length v0, p0

    if-ne v0, v3, :cond_0

    aget-object p0, p0, v2

    iget p0, p0, Lno/f;->a:I

    if-nez p0, :cond_0

    return v3

    :cond_0
    return v2
.end method


# virtual methods
.method public final a()V
    .locals 4

    :try_start_0
    new-instance v0, Lab/i0;

    const-string v1, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n"

    const-string v2, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n"

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lab/i0;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput-object v0, p0, Ls9/g;->c:Lab/i0;

    const-string v1, "uMvpMatrix"

    iget v0, v0, Lab/i0;->x:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ls9/g;->d:I

    iget-object v0, p0, Ls9/g;->c:Lab/i0;

    const-string v1, "uTexMatrix"

    iget v0, v0, Lab/i0;->x:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ls9/g;->e:I

    iget-object v0, p0, Ls9/g;->c:Lab/i0;

    const-string v1, "aPosition"

    invoke-virtual {v0, v1}, Lab/i0;->t(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ls9/g;->f:I

    iget-object v0, p0, Ls9/g;->c:Lab/i0;

    const-string v1, "aTexCoords"

    invoke-virtual {v0, v1}, Lab/i0;->t(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ls9/g;->g:I

    iget-object v0, p0, Ls9/g;->c:Lab/i0;

    const-string v1, "uTexture"

    iget v0, v0, Lab/i0;->x:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ls9/g;->h:I
    :try_end_0
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "ProjectionRenderer"

    const-string v2, "Failed to initialize the program"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
