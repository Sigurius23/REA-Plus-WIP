.class public final Lc73/c;
.super Landroid/text/style/MetricAffectingSpan;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# instance fields
.field public final w:La73/e;

.field public final x:Landroid/graphics/Rect;

.field public final y:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(La73/e;)V
    .locals 1

    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    sget-object v0, Lc73/h;->a:Landroid/graphics/Rect;

    iput-object v0, p0, Lc73/c;->x:Landroid/graphics/Rect;

    sget-object v0, Lc73/h;->c:Landroid/graphics/Paint;

    iput-object v0, p0, Lc73/c;->y:Landroid/graphics/Paint;

    iput-object p1, p0, Lc73/c;->w:La73/e;

    return-void
.end method


# virtual methods
.method public final drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 1

    sget-object p6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    iget-object p8, p0, Lc73/c;->y:Landroid/graphics/Paint;

    invoke-virtual {p8, p6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p6, p0, Lc73/c;->w:La73/e;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result p2

    const/16 p6, 0x19

    invoke-static {p2, p6}, Ltx/f;->t(II)I

    move-result p2

    invoke-virtual {p8, p2}, Landroid/graphics/Paint;->setColor(I)V

    if-lez p4, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p2

    sub-int p2, p3, p2

    move v0, p3

    move p3, p2

    move p2, v0

    :goto_0
    iget-object p4, p0, Lc73/c;->x:Landroid/graphics/Rect;

    invoke-virtual {p4, p3, p5, p2, p7}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p1, p4, p8}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final getLeadingMargin(Z)I
    .locals 0

    iget-object p1, p0, Lc73/c;->w:La73/e;

    iget p1, p1, La73/e;->d:I

    return p1
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    iget-object v0, p0, Lc73/c;->w:La73/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const v1, 0x3f5eb852    # 0.87f

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public final updateMeasureState(Landroid/text/TextPaint;)V
    .locals 2

    iget-object v0, p0, Lc73/c;->w:La73/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const v1, 0x3f5eb852    # 0.87f

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method
