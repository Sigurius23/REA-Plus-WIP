.class public final Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;
.super Lii/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\u0013\u0008\u0016\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\nJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;",
        "Lii/b;",
        "",
        "topLeft",
        "topRight",
        "bottomLeft",
        "bottomRight",
        "<init>",
        "(FFFF)V",
        "radius",
        "(F)V",
        "Landroid/graphics/Bitmap;",
        "input",
        "Lgi/i;",
        "size",
        "transform",
        "(Landroid/graphics/Bitmap;Lgi/i;Lq83/d;)Ljava/lang/Object;",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "F",
        "",
        "cacheKey",
        "Ljava/lang/String;",
        "getCacheKey",
        "()Ljava/lang/String;",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final bottomLeft:F

.field private final bottomRight:F

.field private final cacheKey:Ljava/lang/String;

.field private final topLeft:F

.field private final topRight:F


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p1, p1, p1}, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;-><init>(FFFF)V

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topLeft:F

    .line 4
    iput p2, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topRight:F

    .line 5
    iput p3, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomLeft:F

    .line 6
    iput p4, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomRight:F

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-ltz v1, :cond_0

    cmpl-float v1, p2, v0

    if-ltz v1, :cond_0

    cmpl-float v1, p3, v0

    if-ltz v1, :cond_0

    cmpl-float v0, p4, v0

    if-ltz v0, :cond_0

    .line 7
    const-class v0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->cacheKey:Ljava/lang/String;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "All radii must be >= 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 9
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;-><init>(FFFF)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;

    if-eqz v1, :cond_1

    iget v1, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topLeft:F

    check-cast p1, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;

    iget v2, p1, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topLeft:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    iget v1, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topRight:F

    iget v2, p1, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topRight:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    iget v1, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomLeft:F

    iget v2, p1, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomLeft:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    iget v1, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomRight:F

    iget p1, p1, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomRight:F

    cmpg-float p1, v1, p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getCacheKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->cacheKey:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topLeft:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topRight:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomLeft:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomRight:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final transform(Landroid/graphics/Bitmap;Lgi/i;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lgi/i;",
            "Lq83/d<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x3

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iget-object v1, p2, Lgi/i;->a:Lgi/c;

    instance-of v2, v1, Lgi/a;

    if-eqz v2, :cond_0

    check-cast v1, Lgi/a;

    iget v1, v1, Lgi/a;->a:I

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    :goto_0
    iget-object p2, p2, Lgi/i;->b:Lgi/c;

    instance-of v2, p2, Lgi/a;

    if-eqz v2, :cond_1

    check-cast p2, Lgi/a;

    iget p2, p2, Lgi/a;->a:I

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    :goto_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sget-object v4, Lgi/g;->w:Lgi/g;

    invoke-static {v2, v3, v1, p2, v4}, Ls/s;->g(IIIILgi/g;)D

    move-result-wide v2

    int-to-double v4, v1

    div-double/2addr v4, v2

    invoke-static {v4, v5}, Le93/b;->W(D)I

    move-result v1

    int-to-double v4, p2

    div-double/2addr v4, v2

    invoke-static {v4, v5}, Le93/b;->W(D)I

    move-result p2

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformationKt;->getSafeConfig(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;

    move-result-object v2

    invoke-static {v1, p2, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v4}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    sub-int/2addr v1, v6

    int-to-float v1, v1

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v1, v6

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sub-int/2addr p2, v7

    int-to-float p2, p2

    div-float/2addr p2, v6

    invoke-virtual {v4, v1, p2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    new-instance p2, Landroid/graphics/BitmapShader;

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {p2, p1, v1, v1}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    invoke-virtual {p2, v4}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget p1, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topLeft:F

    iget p2, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->topRight:F

    iget v1, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomRight:F

    iget v4, p0, Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;->bottomLeft:F

    const/16 v6, 0x8

    new-array v6, v6, [F

    aput p1, v6, v5

    const/4 v5, 0x1

    aput p1, v6, v5

    const/4 p1, 0x2

    aput p2, v6, p1

    aput p2, v6, v0

    const/4 p1, 0x4

    aput v1, v6, p1

    const/4 p1, 0x5

    aput v1, v6, p1

    const/4 p1, 0x6

    aput v4, v6, p1

    const/4 p1, 0x7

    aput v4, v6, p1

    new-instance p1, Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-direct {p1, v1, v1, p2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p2, p1, v6, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    invoke-virtual {v3, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-object v2
.end method
