.class public Lxz2/a;
.super Lgl/d;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public c(Lal/b;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 5

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p4

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-interface {p1, p3, p4, v0}, Lal/b;->o(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    div-int/lit8 p3, p3, 0x2

    int-to-float p3, p3

    div-int/lit8 p4, p4, 0x2

    int-to-float p4, p4

    const/high16 v3, -0x40800000    # -1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3, v4, p3, p4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-virtual {v1, p2, p3, p3, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-static {p1, v0}, Lgl/c;->b(Lal/b;Landroid/graphics/Bitmap;)Lgl/c;

    move-result-object p1

    iget-object p1, p1, Lgl/c;->x:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    return-object p1
.end method
