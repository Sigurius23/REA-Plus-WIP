.class public final Lv3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# instance fields
.field public final w:F

.field public final x:F

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(FFFLy3/c;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv3/b;->w:F

    iput p2, p0, Lv3/b;->x:F

    add-float/2addr p1, p3

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    iput p1, p0, Lv3/b;->y:I

    invoke-static {p5}, Le93/b;->X(F)I

    move-result p2

    sub-int/2addr p2, p1

    iput p2, p0, Lv3/b;->z:I

    return-void
.end method


# virtual methods
.method public final drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 12

    move-object/from16 v0, p8

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    add-int v1, p5, p7

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v11, v1, v2

    iget v1, p0, Lv3/b;->y:I

    sub-int v1, p3, v1

    if-gez v1, :cond_1

    const/4 v1, 0x0

    :cond_1
    move v10, v1

    const-string v1, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v0

    move/from16 v1, p9

    if-ne v0, v1, :cond_5

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v0

    sget-object v1, Lk2/h;->a:Lk2/h;

    invoke-virtual {v1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v1, p0, Lv3/b;->w:F

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    iget v1, p0, Lv3/b;->x:F

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    const/16 v1, 0x20

    shl-long/2addr v3, v1

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long/2addr v5, v3

    new-instance v3, Lv3/a;

    move-object v4, p0

    move-object v8, p1

    move-object v9, p2

    move/from16 v7, p4

    invoke-direct/range {v3 .. v11}, Lv3/a;-><init>(Lv3/b;JILandroid/graphics/Canvas;Landroid/graphics/Paint;IF)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p2}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    float-to-double v4, p1

    invoke-static {v4, v5}, Ljava/lang/Math;->rint(D)D

    move-result-wide v4

    double-to-float p1, v4

    float-to-int p1, p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_2
    invoke-virtual {v3}, Lv3/a;->invoke()Ljava/lang/Object;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_3
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    return-void
.end method

.method public final getLeadingMargin(Z)I
    .locals 0

    iget p1, p0, Lv3/b;->z:I

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    return p1
.end method
