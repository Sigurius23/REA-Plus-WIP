.class public final Lcom/mapbox/maps/renderer/gl/TextureRenderer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/renderer/gl/TextureRenderer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\u0015\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/gl/TextureRenderer;",
        "",
        "",
        "depth",
        "<init>",
        "(F)V",
        "Ll83/a0;",
        "prepare",
        "()V",
        "",
        "vertexArray",
        "textureArray",
        "setupVbo",
        "([F[F)V",
        "",
        "textureID",
        "render",
        "(I)V",
        "release",
        "F",
        "program",
        "I",
        "attributePosition",
        "attributeTextureCoord",
        "uniformTexture",
        "",
        "vbo",
        "[I",
        "Companion",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final BYTES_PER_FLOAT:I = 0x4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final COORDS_PER_TEX:I = 0x2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final COORDS_PER_VERTEX:I = 0x3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/mapbox/maps/renderer/gl/TextureRenderer$Companion;

.field private static final FRAGMENT_SHADER_CODE:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TEX_STRIDE:I = 0x8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final VERTEX_COUNT:I = 0x4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final VERTEX_SHADER_CODE:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final VERTEX_STRIDE:I = 0xc
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private attributePosition:I

.field private attributeTextureCoord:I

.field private final depth:F

.field private program:I

.field private uniformTexture:I

.field private vbo:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/renderer/gl/TextureRenderer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/renderer/gl/TextureRenderer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->Companion:Lcom/mapbox/maps/renderer/gl/TextureRenderer$Companion;

    const-string v0, "precision highp float;\nattribute vec4 aPosition;\nattribute vec2 aTexCoord;\nvarying vec2 vTexCoord;\nvoid main()\n{\n    gl_Position = aPosition;\n    vTexCoord = aTexCoord;\n}"

    sput-object v0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->VERTEX_SHADER_CODE:Ljava/lang/String;

    const-string v0, "precision mediump float;\nvarying vec2 vTexCoord;\nuniform sampler2D uTexture;\nvoid main()\n{\n    gl_FragColor = texture2D(uTexture, vTexCoord);\n}"

    sput-object v0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->FRAGMENT_SHADER_CODE:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/mapbox/maps/renderer/gl/TextureRenderer;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->depth:F

    const/4 p1, 0x2

    .line 4
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->vbo:[I

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/gl/TextureRenderer;-><init>(F)V

    return-void
.end method

.method public static final synthetic access$getFRAGMENT_SHADER_CODE$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->FRAGMENT_SHADER_CODE:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getVERTEX_SHADER_CODE$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->VERTEX_SHADER_CODE:Ljava/lang/String;

    return-object v0
.end method

.method private final prepare()V
    .locals 5

    iget v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->depth:F

    const/16 v1, 0xc

    new-array v1, v1, [F

    const/4 v2, 0x0

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v1, v2

    const/4 v2, 0x1

    aput v3, v1, v2

    const/4 v2, 0x2

    aput v0, v1, v2

    const/4 v2, 0x3

    const/high16 v4, 0x3f800000    # 1.0f

    aput v4, v1, v2

    const/4 v2, 0x4

    aput v3, v1, v2

    const/4 v2, 0x5

    aput v0, v1, v2

    const/4 v2, 0x6

    aput v3, v1, v2

    const/4 v2, 0x7

    aput v4, v1, v2

    const/16 v2, 0x8

    aput v0, v1, v2

    const/16 v3, 0x9

    aput v4, v1, v3

    const/16 v3, 0xa

    aput v4, v1, v3

    const/16 v3, 0xb

    aput v0, v1, v3

    new-array v0, v2, [F

    fill-array-data v0, :array_0

    invoke-direct {p0, v1, v0}, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->setupVbo([F[F)V

    sget-object v0, Lcom/mapbox/maps/renderer/gl/GlUtils;->INSTANCE:Lcom/mapbox/maps/renderer/gl/GlUtils;

    const v1, 0x8b31

    sget-object v2, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->VERTEX_SHADER_CODE:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mapbox/maps/renderer/gl/GlUtils;->loadShader(ILjava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/gl/GlUtils;->checkCompileStatus(I)V

    const v2, 0x8b30

    sget-object v3, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->FRAGMENT_SHADER_CODE:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/mapbox/maps/renderer/gl/GlUtils;->loadShader(ILjava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/mapbox/maps/renderer/gl/GlUtils;->checkCompileStatus(I)V

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    iput v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->program:I

    const-string v1, "aPosition"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->attributePosition:I

    iget v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->program:I

    const-string v1, "aTexCoord"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->attributeTextureCoord:I

    iget v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->program:I

    const-string v1, "uTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->uniformTexture:I

    return-void

    :array_0
    .array-data 4
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private final setupVbo([F[F)V
    .locals 5

    iget-object v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->vbo:[I

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGenBuffers(I[II)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->vbo:[I

    aget v0, v0, v2

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    array-length v0, p1

    mul-int/lit8 v0, v0, 0x4

    sget-object v3, Lcom/mapbox/maps/renderer/gl/GlUtils;->INSTANCE:Lcom/mapbox/maps/renderer/gl/GlUtils;

    invoke-virtual {v3, p1}, Lcom/mapbox/maps/renderer/gl/GlUtils;->toFloatBuffer([F)Ljava/nio/FloatBuffer;

    move-result-object p1

    const v4, 0x88e4

    invoke-static {v1, v0, p1, v4}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->vbo:[I

    const/4 v0, 0x1

    aget p1, p1, v0

    invoke-static {v1, p1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    array-length p1, p2

    mul-int/lit8 p1, p1, 0x4

    invoke-virtual {v3, p2}, Lcom/mapbox/maps/renderer/gl/GlUtils;->toFloatBuffer([F)Ljava/nio/FloatBuffer;

    move-result-object p2

    invoke-static {v1, p1, p2, v4}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    return-void
.end method


# virtual methods
.method public final release()V
    .locals 3

    iget v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->program:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->vbo:[I

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glDeleteBuffers(I[II)V

    iget v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->program:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    iput v2, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->program:I

    :cond_0
    return-void
.end method

.method public final render(I)V
    .locals 9

    iget v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->program:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->prepare()V

    :cond_0
    iget v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->program:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->vbo:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const v2, 0x8892

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    iget v3, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->attributePosition:I

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v4, 0x3

    const/16 v5, 0x1406

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    iget v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->attributePosition:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->vbo:[I

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    iget v3, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->attributeTextureCoord:I

    const/16 v7, 0x8

    const/4 v4, 0x2

    invoke-static/range {v3 .. v8}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    iget v0, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->attributeTextureCoord:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const/16 v0, 0xde1

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget p1, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->uniformTexture:I

    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    const/4 p1, 0x5

    const/4 v0, 0x4

    invoke-static {p1, v1, v0}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    iget p1, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->attributePosition:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    iget p1, p0, Lcom/mapbox/maps/renderer/gl/TextureRenderer;->attributeTextureCoord:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    return-void
.end method
