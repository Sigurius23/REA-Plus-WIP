.class public final Lcom/mapbox/maps/renderer/gl/GlUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\u000c\u001a\u00020\u0006*\u00020\t2\n\u0010\u000b\u001a\u00020\t\"\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u000c\u001a\u00020\u0006*\u00020\u000e2\n\u0010\u000b\u001a\u00020\t\"\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u000e*\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00062\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u0008J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/gl/GlUtils;",
        "",
        "<init>",
        "()V",
        "",
        "cmd",
        "Ll83/a0;",
        "throwIfError",
        "(Ljava/lang/String;)V",
        "",
        "",
        "values",
        "put",
        "([F[F)V",
        "Ljava/nio/FloatBuffer;",
        "(Ljava/nio/FloatBuffer;[F)V",
        "toFloatBuffer",
        "([F)Ljava/nio/FloatBuffer;",
        "",
        "type",
        "shaderCode",
        "loadShader",
        "(ILjava/lang/String;)I",
        "checkError",
        "shader",
        "checkCompileStatus",
        "(I)V",
        "getIdentityMatrix",
        "()[F",
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
.field public static final INSTANCE:Lcom/mapbox/maps/renderer/gl/GlUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/maps/renderer/gl/GlUtils;

    invoke-direct {v0}, Lcom/mapbox/maps/renderer/gl/GlUtils;-><init>()V

    sput-object v0, Lcom/mapbox/maps/renderer/gl/GlUtils;->INSTANCE:Lcom/mapbox/maps/renderer/gl/GlUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$throwIfError(Lcom/mapbox/maps/renderer/gl/GlUtils;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/gl/GlUtils;->throwIfError(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic checkError$default(Lcom/mapbox/maps/renderer/gl/GlUtils;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method private final throwIfError(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, " - error in GL : "

    invoke-static {p1, v2}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    const-string v0, "GL_INVALID_FRAMEBUFFER_OPERATION"

    goto :goto_0

    :pswitch_2
    const-string v0, "GL_OUT_OF_MEMORY"

    goto :goto_0

    :pswitch_3
    const-string v0, "GL_INVALID_OPERATION"

    goto :goto_0

    :pswitch_4
    const-string v0, "GL_INVALID_VALUE"

    goto :goto_0

    :pswitch_5
    const-string v0, "GL_INVALID_ENUM"

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x500
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final checkCompileStatus(I)V
    .locals 0

    return-void
.end method

.method public final checkError(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final getIdentityMatrix()[F
    .locals 2

    const/16 v0, 0x10

    new-array v0, v0, [F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    return-object v0
.end method

.method public final loadShader(ILjava/lang/String;)I
    .locals 1

    const-string v0, "shaderCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p1

    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    return p1
.end method

.method public final varargs put(Ljava/nio/FloatBuffer;[F)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    .line 2
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p2, v1

    .line 3
    invoke-virtual {p1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    return-void
.end method

.method public final varargs put([F[F)V
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    aget v3, p2, v1

    add-int/lit8 v4, v2, 0x1

    .line 6
    aput v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final toFloatBuffer([F)Ljava/nio/FloatBuffer;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method
