.class public final Lv3/c;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final w:Lk2/f;


# direct methods
.method public constructor <init>(Lk2/f;)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    iput-object p1, p0, Lv3/c;->w:Lk2/f;

    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 4

    if-eqz p1, :cond_9

    sget-object v0, Lk2/h;->a:Lk2/h;

    iget-object v1, p0, Lv3/c;->w:Lk2/f;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void

    :cond_0
    instance-of v0, v1, Lk2/i;

    if-eqz v0, :cond_8

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    check-cast v1, Lk2/i;

    iget v0, v1, Lk2/i;->a:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v0, v1, Lk2/i;->b:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    iget v0, v1, Lk2/i;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-nez v0, :cond_1

    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_1
    if-ne v0, v3, :cond_2

    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_2
    if-ne v0, v2, :cond_3

    sget-object v0, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_3
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    iget v0, v1, Lk2/i;->c:I

    if-nez v0, :cond_4

    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    goto :goto_1

    :cond_4
    if-ne v0, v3, :cond_5

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_1

    :cond_5
    if-ne v0, v2, :cond_6

    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    goto :goto_1

    :cond_6
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    :goto_1
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, v1, Lk2/i;->e:Li2/t0;

    if-eqz v0, :cond_7

    check-cast v0, Li2/k;

    iget-object v0, v0, Li2/k;->a:Landroid/graphics/PathEffect;

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    return-void
.end method
