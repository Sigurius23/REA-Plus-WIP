.class public final Li2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/v;


# instance fields
.field public a:Landroid/graphics/Canvas;

.field public b:Landroid/graphics/Rect;

.field public c:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Li2/d;->a:Landroid/graphics/Canvas;

    iput-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 1

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->scale(FF)V

    return-void
.end method

.method public final b(FFFFLi2/q0;)V
    .locals 6

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    check-cast p5, Li2/h;

    iget-object v5, p5, Li2/h;->a:Landroid/graphics/Paint;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final c(Li2/g;JJJLi2/q0;)V
    .locals 8

    iget-object v0, p0, Li2/c;->b:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Li2/c;->b:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Li2/c;->c:Landroid/graphics/Rect;

    :cond_0
    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-static {p1}, Li2/w0;->o(Li2/g;)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v1, p0, Li2/c;->b:Landroid/graphics/Rect;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v2, 0x20

    shr-long v3, p2, v2

    long-to-int v3, v3

    iput v3, v1, Landroid/graphics/Rect;->left:I

    const-wide v4, 0xffffffffL

    and-long/2addr p2, v4

    long-to-int p2, p2

    iput p2, v1, Landroid/graphics/Rect;->top:I

    shr-long v6, p4, v2

    long-to-int p3, v6

    add-int/2addr v3, p3

    iput v3, v1, Landroid/graphics/Rect;->right:I

    and-long v6, p4, v4

    long-to-int p3, v6

    add-int/2addr p2, p3

    iput p2, v1, Landroid/graphics/Rect;->bottom:I

    iget-object p2, p0, Li2/c;->c:Landroid/graphics/Rect;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-wide/16 v6, 0x0

    long-to-int p3, v6

    iput p3, p2, Landroid/graphics/Rect;->left:I

    long-to-int v3, v6

    iput v3, p2, Landroid/graphics/Rect;->top:I

    shr-long v6, p6, v2

    long-to-int v2, v6

    add-int/2addr p3, v2

    iput p3, p2, Landroid/graphics/Rect;->right:I

    and-long/2addr v4, p6

    long-to-int p3, v4

    add-int/2addr v3, p3

    iput v3, p2, Landroid/graphics/Rect;->bottom:I

    move-object/from16 p3, p8

    check-cast p3, Li2/h;

    iget-object p3, p3, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v1, p2, p3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final d(Li2/g;Li2/q0;)V
    .locals 4

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-static {p1}, Li2/w0;->o(Li2/g;)Landroid/graphics/Bitmap;

    move-result-object p1

    const-wide/16 v1, 0x0

    long-to-int v3, v1

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    check-cast p2, Li2/h;

    iget-object p2, p2, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v3, v1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final e(FFFFI)V
    .locals 6

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    if-nez p5, :cond_0

    sget-object p5, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    :goto_0
    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    goto :goto_1

    :cond_0
    sget-object p5, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    goto :goto_0

    :goto_1
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    return-void
.end method

.method public final f(FF)V
    .locals 1

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Li2/w0;->r(Landroid/graphics/Canvas;Z)V

    return-void
.end method

.method public final j(F)V
    .locals 1

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->rotate(F)V

    return-void
.end method

.method public final k(JJLi2/q0;)V
    .locals 7

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    const/16 v1, 0x20

    shr-long v2, p1, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    shr-long v5, p3, v1

    long-to-int p2, v5

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    and-long/2addr p3, v3

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    check-cast p5, Li2/h;

    iget-object v5, p5, Li2/h;->a:Landroid/graphics/Paint;

    move v3, p2

    move v1, v2

    move v2, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final l(JLi2/q0;F)V
    .locals 4

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    const/16 v1, 0x20

    shr-long v1, p1, v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    check-cast p3, Li2/h;

    iget-object p2, p3, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, p1, p4, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final m(Ljava/util/ArrayList;Li2/q0;)V
    .locals 8

    const/4 v0, 0x1

    invoke-static {v0}, Lvd/e;->u(I)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1, p2, v2}, Li2/c;->v(Ljava/util/ArrayList;Li2/q0;I)V

    return-void

    :cond_0
    invoke-static {v2}, Lvd/e;->u(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1, p2, v0}, Li2/c;->v(Ljava/util/ArrayList;Li2/q0;I)V

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lvd/e;->u(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/b;

    iget-wide v2, v2, Lh2/b;->a:J

    iget-object v4, p0, Li2/c;->a:Landroid/graphics/Canvas;

    const/16 v5, 0x20

    shr-long v5, v2, v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    const-wide v6, 0xffffffffL

    and-long/2addr v2, v6

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    move-object v3, p2

    check-cast v3, Li2/h;

    iget-object v3, v3, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {v4, v5, v2, v3}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final n(Li2/s0;I)V
    .locals 2

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    instance-of v1, p1, Li2/j;

    if-eqz v1, :cond_1

    check-cast p1, Li2/j;

    iget-object p1, p1, Li2/j;->a:Landroid/graphics/Path;

    if-nez p2, :cond_0

    sget-object p2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    goto :goto_0

    :cond_0
    sget-object p2, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    :goto_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    return-void

    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(FFFFFFLi2/q0;)V
    .locals 8

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    check-cast p7, Li2/h;

    iget-object v7, p7, Li2/h;->a:Landroid/graphics/Paint;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final p(Lh2/c;Li2/q0;)V
    .locals 7

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    iget v1, p1, Lh2/c;->a:F

    iget v2, p1, Lh2/c;->b:F

    iget v3, p1, Lh2/c;->c:F

    iget v4, p1, Lh2/c;->d:F

    check-cast p2, Li2/h;

    iget-object v5, p2, Li2/h;->a:Landroid/graphics/Paint;

    const/16 v6, 0x1f

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    return-void
.end method

.method public final q()V
    .locals 1

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    return-void
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Li2/w0;->r(Landroid/graphics/Canvas;Z)V

    return-void
.end method

.method public final s([F)V
    .locals 1

    invoke-static {p1}, Li2/w0;->v([F)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-static {v0, p1}, Li2/w0;->A(Landroid/graphics/Matrix;[F)V

    iget-object p1, p0, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public final t(Li2/s0;Li2/q0;)V
    .locals 2

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    instance-of v1, p1, Li2/j;

    if-eqz v1, :cond_0

    check-cast p1, Li2/j;

    iget-object p1, p1, Li2/j;->a:Landroid/graphics/Path;

    check-cast p2, Li2/h;

    iget-object p2, p2, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final u(FFFFFFZLi2/q0;)V
    .locals 9

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    move-object/from16 v1, p8

    check-cast v1, Li2/h;

    iget-object v8, v1, Li2/h;->a:Landroid/graphics/Paint;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    invoke-virtual/range {v0 .. v8}, Landroid/graphics/Canvas;->drawArc(FFFFFFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public final v(Ljava/util/ArrayList;Li2/q0;I)V
    .locals 12

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    check-cast p2, Li2/h;

    iget-object v5, p2, Li2/h;->a:Landroid/graphics/Paint;

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge p2, v0, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    iget-wide v0, v0, Lh2/b;->a:J

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/b;

    iget-wide v2, v2, Lh2/b;->a:J

    move-wide v6, v0

    iget-object v0, p0, Li2/c;->a:Landroid/graphics/Canvas;

    const/16 v1, 0x20

    shr-long v8, v6, v1

    long-to-int v4, v8

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    shr-long v10, v2, v1

    long-to-int v1, v10

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    and-long/2addr v2, v8

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    move v3, v1

    move v1, v4

    move v4, v2

    move v2, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr p2, p3

    goto :goto_0

    :cond_0
    return-void
.end method
