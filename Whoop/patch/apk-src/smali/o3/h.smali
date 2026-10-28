.class public final Lo3/h;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"


# instance fields
.field public final E:F

.field public final F:I

.field public G:Landroid/graphics/Paint$FontMetricsInt;

.field public H:I

.field public I:I

.field public J:Z

.field public final w:F

.field public final x:I

.field public final y:F

.field public final z:I


# direct methods
.method public constructor <init>(FIFIFI)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    iput p1, p0, Lo3/h;->w:F

    iput p2, p0, Lo3/h;->x:I

    iput p3, p0, Lo3/h;->y:F

    iput p4, p0, Lo3/h;->z:I

    iput p5, p0, Lo3/h;->E:F

    iput p6, p0, Lo3/h;->F:I

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Paint$FontMetricsInt;
    .locals 1

    iget-object v0, p0, Lo3/h;->G:Landroid/graphics/Paint$FontMetricsInt;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "fontMetrics"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final b()I
    .locals 1

    iget-boolean v0, p0, Lo3/h;->J:Z

    if-nez v0, :cond_0

    const-string v0, "PlaceholderSpan is not laid out yet."

    invoke-static {v0}, Lr3/a;->c(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lo3/h;->I:I

    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 2

    const/4 p2, 0x1

    iput-boolean p2, p0, Lo3/h;->J:Z

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result p3

    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    iput-object p1, p0, Lo3/h;->G:Landroid/graphics/Paint$FontMetricsInt;

    invoke-virtual {p0}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    invoke-virtual {p0}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p4

    iget p4, p4, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    if-le p1, p4, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Invalid fontMetrics: line height can not be negative."

    invoke-static {p1}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    iget p1, p0, Lo3/h;->E:F

    iget p4, p0, Lo3/h;->w:F

    const-string v0, "Unsupported unit."

    iget v1, p0, Lo3/h;->x:I

    if-eqz v1, :cond_2

    if-ne v1, p2, :cond_1

    mul-float/2addr p4, p3

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lr3/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_2
    mul-float/2addr p4, p1

    :goto_1
    invoke-static {p4}, Lup/d;->p(F)I

    move-result p4

    iput p4, p0, Lo3/h;->H:I

    iget p4, p0, Lo3/h;->y:F

    iget v1, p0, Lo3/h;->z:I

    if-eqz v1, :cond_4

    if-ne v1, p2, :cond_3

    mul-float/2addr p4, p3

    invoke-static {p4}, Lup/d;->p(F)I

    move-result p1

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lr3/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_4
    mul-float/2addr p4, p1

    invoke-static {p4}, Lup/d;->p(F)I

    move-result p1

    :goto_2
    iput p1, p0, Lo3/h;->I:I

    if-eqz p5, :cond_6

    invoke-virtual {p0}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-virtual {p0}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    invoke-virtual {p0}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->leading:I

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->leading:I

    iget p1, p0, Lo3/h;->F:I

    packed-switch p1, :pswitch_data_0

    const-string p1, "Unknown verticalAlign."

    invoke-static {p1}, Lr3/a;->a(Ljava/lang/String;)V

    goto :goto_3

    :pswitch_0
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Lo3/h;->b()I

    move-result p2

    if-ge p1, p2, :cond_5

    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-virtual {p0}, Lo3/h;->b()I

    move-result p2

    iget p3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iget p4, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    sub-int/2addr p3, p4

    sub-int/2addr p2, p3

    div-int/lit8 p2, p2, 0x2

    sub-int/2addr p1, p2

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-virtual {p0}, Lo3/h;->b()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    goto :goto_3

    :pswitch_1
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    invoke-virtual {p0}, Lo3/h;->b()I

    move-result p3

    sub-int/2addr p2, p3

    if-le p1, p2, :cond_5

    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    invoke-virtual {p0}, Lo3/h;->b()I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    goto :goto_3

    :pswitch_2
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-virtual {p0}, Lo3/h;->b()I

    move-result p2

    add-int/2addr p2, p1

    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    if-le p2, p1, :cond_5

    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-virtual {p0}, Lo3/h;->b()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    goto :goto_3

    :pswitch_3
    iget p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-virtual {p0}, Lo3/h;->b()I

    move-result p2

    neg-int p2, p2

    if-le p1, p2, :cond_5

    invoke-virtual {p0}, Lo3/h;->b()I

    move-result p1

    neg-int p1, p1

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    :cond_5
    :goto_3
    invoke-virtual {p0}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    invoke-virtual {p0}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    :cond_6
    iget-boolean p1, p0, Lo3/h;->J:Z

    if-nez p1, :cond_7

    const-string p1, "PlaceholderSpan is not laid out yet."

    invoke-static {p1}, Lr3/a;->c(Ljava/lang/String;)V

    :cond_7
    iget p1, p0, Lo3/h;->H:I

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
