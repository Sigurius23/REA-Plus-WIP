.class public final Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/renderer/widget/WidgetRenderer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$Companion;,
        Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0001\u0018\u0000 O2\u00020\u0001:\u0001OB\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\nJ\u001f\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\nJ\u0017\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u000bH\u0017\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0017\u00a2\u0006\u0004\u0008\u001e\u0010\rJ\u0017\u0010 \u001a\u00020\u00082\u0006\u0010\u001f\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008\"\u0010#R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010$R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010*R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010-R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010-R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u0010-R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u0010-R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u0010-R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u0010-R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u0010-R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u0010-R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010;R\u0014\u0010=\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010;R\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010;R\u0014\u0010?\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010;R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0016\u0010\u0019\u001a\u00020C8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010DR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010DR\u0014\u0010F\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010BR\u0014\u0010G\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010BR\u0016\u0010H\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010*R*\u0010J\u001a\u00020C2\u0006\u0010I\u001a\u00020C8W@WX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008J\u0010D\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010N\u00a8\u0006P"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;",
        "Lcom/mapbox/maps/renderer/widget/WidgetRenderer;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "Lcom/mapbox/maps/renderer/widget/WidgetPosition;",
        "position",
        "<init>",
        "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V",
        "Ll83/a0;",
        "updateVertexBuffer",
        "()V",
        "",
        "topY",
        "()F",
        "leftX",
        "textureFromBitmapIfChanged",
        "updateTranslateMatrix",
        "",
        "width",
        "height",
        "onSurfaceChanged",
        "(II)V",
        "prepare",
        "render",
        "release",
        "updateBitmap",
        "(Landroid/graphics/Bitmap;)V",
        "angleDegrees",
        "setRotation",
        "(F)V",
        "getRotation",
        "widgetPosition",
        "setPosition",
        "(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V",
        "getPosition",
        "()Lcom/mapbox/maps/renderer/widget/WidgetPosition;",
        "Landroid/graphics/Bitmap;",
        "Lcom/mapbox/maps/renderer/widget/WidgetPosition;",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "lock",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "halfBitmapWidth",
        "F",
        "halfBitmapHeight",
        "surfaceWidth",
        "I",
        "surfaceHeight",
        "program",
        "vertexShader",
        "fragmentShader",
        "attributeVertexPosition",
        "attributeTexturePosition",
        "uniformTexture",
        "uniformMvpMatrix",
        "",
        "textures",
        "[I",
        "",
        "screenMatrix",
        "[F",
        "translateRotate",
        "rotationMatrix",
        "translateMatrix",
        "mvpMatrix",
        "Ljava/nio/FloatBuffer;",
        "mvpMatrixBuffer",
        "Ljava/nio/FloatBuffer;",
        "",
        "Z",
        "updateMatrix",
        "vertexPositionBuffer",
        "texturePositionBuffer",
        "rotationDegrees",
        "<set-?>",
        "needRender",
        "getNeedRender",
        "()Z",
        "setNeedRender",
        "(Z)V",
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

.field public static final COORDS_PER_VERTEX:I = 0x2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$Companion;

.field private static final FRAGMENT_SHADER_CODE:Ljava/lang/String;
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

.field public static final VERTEX_STRIDE:I = 0x8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private attributeTexturePosition:I

.field private attributeVertexPosition:I

.field private bitmap:Landroid/graphics/Bitmap;

.field private fragmentShader:I

.field private halfBitmapHeight:F

.field private halfBitmapWidth:F

.field private final lock:Ljava/util/concurrent/locks/ReentrantLock;

.field private final mvpMatrix:[F

.field private final mvpMatrixBuffer:Ljava/nio/FloatBuffer;

.field private needRender:Z

.field private volatile position:Lcom/mapbox/maps/renderer/widget/WidgetPosition;

.field private program:I

.field private volatile rotationDegrees:F

.field private final rotationMatrix:[F

.field private screenMatrix:[F

.field private surfaceHeight:I

.field private surfaceWidth:I

.field private final texturePositionBuffer:Ljava/nio/FloatBuffer;

.field private final textures:[I

.field private final translateMatrix:[F

.field private translateRotate:[F

.field private uniformMvpMatrix:I

.field private uniformTexture:I

.field private updateBitmap:Z

.field private updateMatrix:Z

.field private final vertexPositionBuffer:Ljava/nio/FloatBuffer;

.field private vertexShader:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->Companion:Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$Companion;

    const-string v0, "precision highp float;\nuniform mat4 uMvpMatrix;\nattribute vec2 aPosition;\nattribute vec2 aCoordinate;\nvarying vec2 vCoordinate;\nvoid main() {\n  vCoordinate = aCoordinate;\n  gl_Position = uMvpMatrix * vec4(aPosition, 0.0, 1.0);\n}"

    sput-object v0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->VERTEX_SHADER_CODE:Ljava/lang/String;

    const-string v0, "precision mediump float;\nuniform sampler2D uTexture;\nvarying vec2 vCoordinate;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vCoordinate);\n}"

    sput-object v0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->FRAGMENT_SHADER_CODE:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V
    .locals 2

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->bitmap:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->position:Lcom/mapbox/maps/renderer/widget/WidgetPosition;

    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    iget-object p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->bitmap:Landroid/graphics/Bitmap;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    int-to-float p1, p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    iput p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapWidth:F

    iget-object p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->bitmap:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    int-to-float p1, p1

    div-float/2addr p1, v0

    iput p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapHeight:F

    filled-new-array {p2}, [I

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->textures:[I

    const/16 p1, 0x10

    new-array p2, p1, [F

    iput-object p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->screenMatrix:[F

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->translateRotate:[F

    sget-object p1, Lcom/mapbox/maps/renderer/gl/GlUtils;->INSTANCE:Lcom/mapbox/maps/renderer/gl/GlUtils;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/gl/GlUtils;->getIdentityMatrix()[F

    move-result-object p2

    iput-object p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->rotationMatrix:[F

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/gl/GlUtils;->getIdentityMatrix()[F

    move-result-object p2

    iput-object p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->translateMatrix:[F

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/gl/GlUtils;->getIdentityMatrix()[F

    move-result-object p2

    iput-object p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->mvpMatrix:[F

    invoke-virtual {p1, p2}, Lcom/mapbox/maps/renderer/gl/GlUtils;->toFloatBuffer([F)Ljava/nio/FloatBuffer;

    move-result-object p2

    iput-object p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->mvpMatrixBuffer:Ljava/nio/FloatBuffer;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateBitmap:Z

    iput-boolean p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateMatrix:Z

    const/16 v0, 0x8

    new-array v1, v0, [F

    invoke-virtual {p1, v1}, Lcom/mapbox/maps/renderer/gl/GlUtils;->toFloatBuffer([F)Ljava/nio/FloatBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->vertexPositionBuffer:Ljava/nio/FloatBuffer;

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/renderer/gl/GlUtils;->toFloatBuffer([F)Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->texturePositionBuffer:Ljava/nio/FloatBuffer;

    iput-boolean p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->needRender:Z

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static final synthetic access$getFRAGMENT_SHADER_CODE$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->FRAGMENT_SHADER_CODE:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getVERTEX_SHADER_CODE$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->VERTEX_SHADER_CODE:Ljava/lang/String;

    return-object v0
.end method

.method private final leftX()F
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->position:Lcom/mapbox/maps/renderer/widget/WidgetPosition;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/widget/WidgetPosition;->getOffsetX()F

    move-result v0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->position:Lcom/mapbox/maps/renderer/widget/WidgetPosition;

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/widget/WidgetPosition;->getHorizontalAlignment()Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;

    move-result-object v1

    sget-object v2, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->surfaceWidth:I

    int-to-float v1, v1

    iget v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapWidth:F

    sub-float/2addr v1, v2

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->surfaceWidth:I

    int-to-float v1, v1

    int-to-float v2, v2

    div-float/2addr v1, v2

    goto :goto_0

    :cond_2
    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapWidth:F

    :goto_0
    add-float/2addr v0, v1

    return v0
.end method

.method private final textureFromBitmapIfChanged()V
    .locals 4

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateBitmap:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->bitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->textures:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    if-nez v2, :cond_0

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->textures:[I

    aget v0, v0, v1

    const/16 v2, 0xde1

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const/16 v0, 0x2801

    const/high16 v3, 0x46180000    # 9728.0f

    invoke-static {v2, v0, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2800

    const v3, 0x46180400    # 9729.0f

    invoke-static {v2, v0, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2802

    const v3, 0x47012f00    # 33071.0f

    invoke-static {v2, v0, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2803

    invoke-static {v2, v0, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v2, v1, v0, v1}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iput-boolean v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateBitmap:Z

    :cond_1
    return-void
.end method

.method private final topY()F
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->position:Lcom/mapbox/maps/renderer/widget/WidgetPosition;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/widget/WidgetPosition;->getOffsetY()F

    move-result v0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->position:Lcom/mapbox/maps/renderer/widget/WidgetPosition;

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/widget/WidgetPosition;->getVerticalAlignment()Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;

    move-result-object v1

    sget-object v2, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->surfaceHeight:I

    int-to-float v1, v1

    iget v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapHeight:F

    sub-float/2addr v1, v2

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->surfaceHeight:I

    int-to-float v1, v1

    int-to-float v2, v2

    div-float/2addr v1, v2

    goto :goto_0

    :cond_2
    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapHeight:F

    :goto_0
    add-float/2addr v0, v1

    return v0
.end method

.method private final updateTranslateMatrix()V
    .locals 5

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->translateMatrix:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->translateMatrix:[F

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->leftX()F

    move-result v2

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->topY()F

    move-result v3

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateMatrix:Z

    invoke-virtual {p0, v0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->setNeedRender(Z)V

    return-void
.end method

.method private final updateVertexBuffer()V
    .locals 10

    sget-object v0, Lcom/mapbox/maps/renderer/gl/GlUtils;->INSTANCE:Lcom/mapbox/maps/renderer/gl/GlUtils;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->vertexPositionBuffer:Ljava/nio/FloatBuffer;

    iget v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapWidth:F

    neg-float v3, v2

    iget v4, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapHeight:F

    neg-float v5, v4

    neg-float v6, v2

    neg-float v7, v4

    const/16 v8, 0x8

    new-array v8, v8, [F

    const/4 v9, 0x0

    aput v3, v8, v9

    const/4 v3, 0x1

    aput v5, v8, v3

    const/4 v3, 0x2

    aput v6, v8, v3

    const/4 v3, 0x3

    aput v4, v8, v3

    const/4 v3, 0x4

    aput v2, v8, v3

    const/4 v3, 0x5

    aput v7, v8, v3

    const/4 v3, 0x6

    aput v2, v8, v3

    const/4 v2, 0x7

    aput v4, v8, v2

    invoke-virtual {v0, v1, v8}, Lcom/mapbox/maps/renderer/gl/GlUtils;->put(Ljava/nio/FloatBuffer;[F)V

    return-void
.end method


# virtual methods
.method public getNeedRender()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->needRender:Z

    return v0
.end method

.method public getPosition()Lcom/mapbox/maps/renderer/widget/WidgetPosition;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->position:Lcom/mapbox/maps/renderer/widget/WidgetPosition;

    return-object v0
.end method

.method public getRotation()F
    .locals 1

    iget v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->rotationDegrees:F

    return v0
.end method

.method public onSurfaceChanged(II)V
    .locals 5

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iput p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->surfaceWidth:I

    iput p2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->surfaceHeight:I

    sget-object v1, Lcom/mapbox/maps/renderer/gl/GlUtils;->INSTANCE:Lcom/mapbox/maps/renderer/gl/GlUtils;

    iget-object v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->screenMatrix:[F

    const/high16 v3, 0x40000000    # 2.0f

    int-to-float p1, p1

    div-float/2addr v3, p1

    const/high16 p1, -0x40000000    # -2.0f

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/16 p2, 0x10

    new-array p2, p2, [F

    const/4 v4, 0x0

    aput v3, p2, v4

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput v4, p2, v3

    const/4 v3, 0x2

    aput v4, p2, v3

    const/4 v3, 0x3

    aput v4, p2, v3

    const/4 v3, 0x4

    aput v4, p2, v3

    const/4 v3, 0x5

    aput p1, p2, v3

    const/4 p1, 0x6

    aput v4, p2, p1

    const/4 p1, 0x7

    aput v4, p2, p1

    const/16 p1, 0x8

    aput v4, p2, p1

    const/16 p1, 0x9

    aput v4, p2, p1

    const/16 p1, 0xa

    aput v4, p2, p1

    const/16 p1, 0xb

    aput v4, p2, p1

    const/16 p1, 0xc

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, p2, p1

    const/16 p1, 0xd

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, p2, p1

    const/16 p1, 0xe

    aput v4, p2, p1

    const/16 p1, 0xf

    aput v3, p2, p1

    invoke-virtual {v1, v2, p2}, Lcom/mapbox/maps/renderer/gl/GlUtils;->put([F[F)V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateVertexBuffer()V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateTranslateMatrix()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public prepare()V
    .locals 5

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x1

    :try_start_0
    new-array v2, v1, [I

    const v3, 0x8869

    const/4 v4, 0x0

    invoke-static {v3, v2, v4}, Landroid/opengl/GLES20;->glGetIntegerv(I[II)V

    sget-object v2, Lcom/mapbox/maps/renderer/gl/GlUtils;->INSTANCE:Lcom/mapbox/maps/renderer/gl/GlUtils;

    sget-object v3, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->VERTEX_SHADER_CODE:Ljava/lang/String;

    const v4, 0x8b31

    invoke-virtual {v2, v4, v3}, Lcom/mapbox/maps/renderer/gl/GlUtils;->loadShader(ILjava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/renderer/gl/GlUtils;->checkCompileStatus(I)V

    iput v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->vertexShader:I

    sget-object v3, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->FRAGMENT_SHADER_CODE:Ljava/lang/String;

    const v4, 0x8b30

    invoke-virtual {v2, v4, v3}, Lcom/mapbox/maps/renderer/gl/GlUtils;->loadShader(ILjava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/renderer/gl/GlUtils;->checkCompileStatus(I)V

    iput v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->fragmentShader:I

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v2

    iget v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->vertexShader:I

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->fragmentShader:I

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-static {v2}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    iput v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    const-string v3, "uMvpMatrix"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->uniformMvpMatrix:I

    iget v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    const-string v3, "aPosition"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->attributeVertexPosition:I

    iget v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    const-string v3, "aCoordinate"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->attributeTexturePosition:I

    iget v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    const-string v3, "uTexture"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->uniformTexture:I

    invoke-virtual {p0, v1}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->setNeedRender(Z)V

    iput-boolean v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateBitmap:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public release()V
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->attributeVertexPosition:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    iget v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->vertexShader:I

    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glDetachShader(II)V

    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    iget v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->fragmentShader:I

    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glDetachShader(II)V

    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->vertexShader:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->fragmentShader:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->textures:[I

    array-length v3, v1

    invoke-static {v3, v1, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    iget v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    iput v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0, v2}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->setNeedRender(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public render()V
    .locals 15

    iget-object v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->prepare()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    :cond_0
    :goto_0
    iget v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->program:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    sget-object v0, Lcom/mapbox/maps/renderer/gl/GlUtils;->INSTANCE:Lcom/mapbox/maps/renderer/gl/GlUtils;

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateMatrix:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->mvpMatrix:[F

    invoke-static {v0, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    iget-object v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->translateRotate:[F

    iget-object v5, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->translateMatrix:[F

    iget-object v7, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->rotationMatrix:[F

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v9, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->mvpMatrix:[F

    iget-object v11, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->screenMatrix:[F

    iget-object v13, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->translateRotate:[F

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->mvpMatrixBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->mvpMatrixBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->mvpMatrix:[F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->mvpMatrixBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    iput-boolean v2, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateMatrix:Z

    :cond_1
    iget v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->uniformMvpMatrix:I

    iget-object v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->mvpMatrixBuffer:Ljava/nio/FloatBuffer;

    const/4 v4, 0x1

    invoke-static {v0, v4, v2, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZLjava/nio/FloatBuffer;)V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->textureFromBitmapIfChanged()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->textures:[I

    aget v0, v0, v2

    const/16 v3, 0xde1

    invoke-static {v3, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->uniformTexture:I

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glUniform1i(II)V

    iget v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->attributeVertexPosition:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v4, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->attributeVertexPosition:I

    iget-object v9, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->vertexPositionBuffer:Ljava/nio/FloatBuffer;

    const/4 v5, 0x2

    const/16 v6, 0x1406

    const/4 v7, 0x0

    const/16 v8, 0x8

    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->attributeTexturePosition:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v4, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->attributeTexturePosition:I

    iget-object v9, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->texturePositionBuffer:Ljava/nio/FloatBuffer;

    const/4 v5, 0x2

    const/16 v6, 0x1406

    const/4 v7, 0x0

    const/16 v8, 0x8

    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    const/4 v0, 0x5

    const/4 v4, 0x4

    invoke-static {v0, v2, v4}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    iget v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->attributeVertexPosition:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    iget v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->attributeTexturePosition:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    const v0, 0x8892

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    invoke-static {v3, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    invoke-static {v2}, Landroid/opengl/GLES20;->glUseProgram(I)V

    invoke-virtual {p0, v2}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->setNeedRender(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_1
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public setNeedRender(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->needRender:Z

    return-void
.end method

.method public setPosition(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V
    .locals 1

    const-string v0, "widgetPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iput-object p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->position:Lcom/mapbox/maps/renderer/widget/WidgetPosition;

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateTranslateMatrix()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public setRotation(F)V
    .locals 9

    iget-object v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iput p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->rotationDegrees:F

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->rotationMatrix:[F

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    iget-object v3, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->rotationMatrix:[F

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v6, 0x0

    move v5, p1

    invoke-static/range {v3 .. v8}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateMatrix:Z

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->setNeedRender(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final updateBitmap(Landroid/graphics/Bitmap;)V
    .locals 3

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iput-object p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iput v1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapWidth:F

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v2

    iput p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->halfBitmapHeight:F

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateTranslateMatrix()V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateVertexBuffer()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateBitmap:Z

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->updateMatrix:Z

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;->setNeedRender(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
