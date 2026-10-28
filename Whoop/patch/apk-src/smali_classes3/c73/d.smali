.class public final Lc73/d;
.super Landroid/text/style/MetricAffectingSpan;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lc73/d;->w:I

    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    iput-object p1, p0, Lc73/d;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 3

    iget v0, p0, Lc73/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc73/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lc73/d;->x:Ljava/lang/Object;

    check-cast v0, La73/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    const v2, 0x3f5eb852    # 0.87f

    mul-float/2addr v1, v2

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    const/16 v1, 0x19

    invoke-static {v0, v1}, Ltx/f;->t(II)I

    move-result v0

    iput v0, p1, Landroid/text/TextPaint;->bgColor:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final updateMeasureState(Landroid/text/TextPaint;)V
    .locals 2

    iget v0, p0, Lc73/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc73/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lc73/d;->x:Ljava/lang/Object;

    check-cast v0, La73/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const v1, 0x3f5eb852    # 0.87f

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
