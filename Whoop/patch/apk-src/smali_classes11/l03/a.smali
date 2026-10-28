.class public final Ll03/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll03/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u001aB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Ll03/a;",
        "",
        "Lc51/n;",
        "settings",
        "<init>",
        "(Lc51/n;)V",
        "Ll03/b;",
        "spec",
        "",
        "size",
        "radiusPx",
        "",
        "pxPerDp",
        "Landroid/graphics/Path;",
        "g",
        "(Ll03/b;IIF)Landroid/graphics/Path;",
        "Landroid/graphics/Shader;",
        "h",
        "(Ll03/b;I)Landroid/graphics/Shader;",
        "gradient",
        "Landroid/graphics/Paint;",
        "d",
        "(Landroid/graphics/Shader;)Landroid/graphics/Paint;",
        "outline",
        "b",
        "(Landroid/graphics/Path;Ll03/b;I)Landroid/graphics/Path;",
        "a",
        "(Ll03/b;I)Landroid/graphics/Paint;",
        "c",
        "(Landroid/graphics/Shader;I)Landroid/graphics/Paint;",
        "f",
        "(Landroid/graphics/Shader;F)Landroid/graphics/Paint;",
        "Landroid/graphics/Bitmap;",
        "e",
        "(Ll03/b;)Landroid/graphics/Bitmap;",
        "Lc51/n;",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final b:Ll03/a$a;

.field public static final c:I


# instance fields
.field private final a:Lc51/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll03/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll03/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll03/a;->b:Ll03/a$a;

    sget v0, Lc51/n;->m:I

    sput v0, Ll03/a;->c:I

    return-void
.end method

.method public constructor <init>(Lc51/n;)V
    .locals 1

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ll03/a;->a:Lc51/n;

    return-void
.end method

.method public synthetic constructor <init>(Lc51/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Lc51/n;

    const/16 v13, 0x7ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Lc51/n;-><init>(FFLc51/w;Lc51/e;Lc51/y;Lc51/t;Ljava/util/List;Ll83/k;FLc51/x;Lc51/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    .line 4
    :goto_0
    invoke-direct {p0, v1}, Ll03/a;-><init>(Lc51/n;)V

    return-void
.end method

.method private final a(Ll03/b;I)Landroid/graphics/Paint;
    .locals 5

    iget-object v0, p0, Ll03/a;->a:Lc51/n;

    invoke-virtual {v0}, Lc51/n;->e()Lc51/t;

    move-result-object v0

    invoke-virtual {v0}, Lc51/t;->b()Ld51/d;

    move-result-object v1

    invoke-virtual {p1}, Ll03/b;->b()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ld51/d;->c(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0}, Lc51/t;->c()Ld51/d;

    move-result-object v2

    invoke-virtual {p1}, Ll03/b;->b()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ld51/d;->c(D)D

    move-result-wide v2

    double-to-float p1, v2

    const v2, 0x3c23d70a    # 0.01f

    add-float/2addr v2, v1

    cmpg-float v3, p1, v2

    if-gez v3, :cond_0

    move p1, v2

    :cond_0
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v0}, Lc51/t;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Li2/w0;->H(J)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/BlurMaskFilter;

    sub-float/2addr p1, v1

    int-to-float p2, p2

    mul-float/2addr p1, p2

    sget-object p2, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v0, p1, p2}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    return-object v2
.end method

.method private final b(Landroid/graphics/Path;Ll03/b;I)Landroid/graphics/Path;
    .locals 3

    iget-object v0, p0, Ll03/a;->a:Lc51/n;

    invoke-virtual {v0}, Lc51/n;->e()Lc51/t;

    move-result-object v0

    invoke-virtual {v0}, Lc51/t;->c()Ld51/d;

    move-result-object v0

    invoke-virtual {p2}, Ll03/b;->b()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v0

    double-to-float p2, v0

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0, p1}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    int-to-float p3, p3

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p3, v1

    invoke-virtual {p1, p2, p2, p3, p3}, Landroid/graphics/Matrix;->setScale(FFFF)V

    invoke-virtual {v0, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method private final c(Landroid/graphics/Shader;I)Landroid/graphics/Paint;
    .locals 2

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    int-to-float p2, p2

    const v1, 0x3f19999a    # 0.6f

    mul-float/2addr v1, p2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    new-instance p1, Landroid/graphics/BlurMaskFilter;

    const v1, 0x3eb33333    # 0.35f

    mul-float/2addr p2, v1

    sget-object v1, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {p1, p2, v1}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    return-object v0
.end method

.method private final d(Landroid/graphics/Shader;)Landroid/graphics/Paint;
    .locals 2

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-object v0
.end method

.method private final f(Landroid/graphics/Shader;F)Landroid/graphics/Paint;
    .locals 2

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Ll03/a;->a:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->j()Lc51/w;

    move-result-object v1

    invoke-virtual {v1}, Lc51/w;->g()F

    move-result v1

    mul-float/2addr v1, p2

    const/high16 p2, 0x40000000    # 2.0f

    mul-float/2addr v1, p2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-object v0
.end method

.method private final g(Ll03/b;IIF)Landroid/graphics/Path;
    .locals 8

    invoke-virtual {p1}, Ll03/b;->c()J

    move-result-wide v0

    new-instance v2, Lg93/e;

    long-to-int v3, v0

    const/16 v4, 0x20

    shr-long/2addr v0, v4

    long-to-int v0, v0

    invoke-direct {v2, v3, v0}, Lg93/e;-><init>(II)V

    iget-object v0, p0, Ll03/a;->a:Lc51/n;

    invoke-virtual {v0}, Lc51/n;->j()Lc51/w;

    move-result-object v0

    invoke-virtual {v0}, Lc51/w;->f()Li93/j;

    move-result-object v0

    invoke-virtual {p1}, Ll03/b;->b()D

    move-result-wide v3

    invoke-static {v0, v3, v4}, Ld51/e;->c(Li93/j;D)I

    move-result v1

    iget v3, v0, Li93/h;->w:I

    iget v0, v0, Li93/h;->x:I

    invoke-static {v1, v3, v0}, Le93/b;->n(III)I

    move-result v0

    iget-object v1, p0, Ll03/a;->a:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->j()Lc51/w;

    move-result-object v1

    invoke-virtual {p1}, Ll03/b;->b()D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lc51/w;->i(D)Li93/f;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    invoke-interface {p1}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-virtual {v2}, Lg93/d;->e()F

    move-result v5

    invoke-interface {p1}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-interface {p1}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    sub-float/2addr v6, v7

    mul-float/2addr v6, v5

    add-float/2addr v6, v4

    mul-float/2addr v6, p4

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sget-object p1, Ld51/a;->a:Ld51/a$a;

    invoke-virtual {p1, v1, p2, p2, p3}, Ld51/a$a;->c(Ljava/util/List;III)Li2/s0;

    move-result-object p1

    instance-of p2, p1, Li2/j;

    if-eqz p2, :cond_1

    check-cast p1, Li2/j;

    iget-object p1, p1, Li2/j;->a:Landroid/graphics/Path;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final h(Ll03/b;I)Landroid/graphics/Shader;
    .locals 9

    iget-object v0, p0, Ll03/a;->a:Lc51/n;

    invoke-virtual {v0}, Lc51/n;->h()F

    move-result v0

    new-instance v1, Landroid/graphics/LinearGradient;

    int-to-float v5, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float v2, v5, p2

    invoke-virtual {p1}, Ll03/b;->e()I

    move-result p2

    invoke-virtual {p1}, Ll03/b;->e()I

    move-result v3

    invoke-virtual {p1}, Ll03/b;->a()I

    move-result v4

    invoke-virtual {p1}, Ll03/b;->a()I

    move-result p1

    filled-new-array {p2, v3, v4, p1}, [I

    move-result-object v6

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float p2, p1, v0

    const/4 v3, 0x4

    new-array v7, v3, [F

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput v3, v7, v4

    const/4 v3, 0x1

    aput v0, v7, v3

    const/4 v0, 0x2

    aput p2, v7, v0

    const/4 p2, 0x3

    aput p1, v7, p2

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v3, 0x0

    move v4, v2

    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    return-object v1
.end method


# virtual methods
.method public final e(Ll03/b;)Landroid/graphics/Bitmap;
    .locals 8

    const-string v0, "spec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll03/b;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    int-to-float v3, v0

    iget-object v4, p0, Ll03/a;->a:Lc51/n;

    invoke-virtual {v4}, Lc51/n;->n()F

    move-result v4

    iget-object v5, p0, Ll03/a;->a:Lc51/n;

    invoke-virtual {v5}, Lc51/n;->k()F

    move-result v5

    add-float/2addr v5, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v5, v4

    div-float/2addr v3, v5

    iget-object v4, p0, Ll03/a;->a:Lc51/n;

    invoke-virtual {v4}, Lc51/n;->n()F

    move-result v4

    mul-float/2addr v4, v3

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    invoke-direct {p0, p1, v0, v4, v3}, Ll03/a;->g(Ll03/b;IIF)Landroid/graphics/Path;

    move-result-object v5

    invoke-direct {p0, p1, v0}, Ll03/a;->h(Ll03/b;I)Landroid/graphics/Shader;

    move-result-object v6

    invoke-direct {p0, v6}, Ll03/a;->d(Landroid/graphics/Shader;)Landroid/graphics/Paint;

    move-result-object v7

    invoke-virtual {v2, v5, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {v2, v5}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    invoke-direct {p0, v6, v4}, Ll03/a;->c(Landroid/graphics/Shader;I)Landroid/graphics/Paint;

    move-result-object v7

    invoke-virtual {v2, v5, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-direct {p0, v5, p1, v0}, Ll03/a;->b(Landroid/graphics/Path;Ll03/b;I)Landroid/graphics/Path;

    move-result-object v0

    invoke-direct {p0, p1, v4}, Ll03/a;->a(Ll03/b;I)Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    invoke-direct {p0, v6, v3}, Ll03/a;->f(Landroid/graphics/Shader;F)Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {v2, v5, p1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-object v1
.end method
