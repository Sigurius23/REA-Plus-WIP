.class public Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;
.super Lcom/google/android/material/button/MaterialButton;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0010\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;",
        "Lcom/google/android/material/button/MaterialButton;",
        "Lm30/b;",
        "buttonCustomization",
        "Ll83/a0;",
        "setButtonCustomization",
        "(Lm30/b;)V",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/button/MaterialButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final setButtonCustomization(Lm30/b;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, p1

    check-cast v0, Lm30/a;

    iget-object v1, v0, Lm30/a;->x:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    check-cast p1, Lm30/d;

    iget-object v1, p1, Lm30/d;->z:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/material/button/MaterialButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_2
    iget p1, p1, Lm30/d;->E:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, 0x0

    if-ltz v1, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setCornerRadius(I)V

    :cond_4
    iget p1, v0, Lm30/a;->y:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-lez v1, :cond_5

    move-object v2, p1

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p1

    const/4 v1, 0x2

    int-to-float p1, p1

    invoke-virtual {p0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_6
    iget-object p1, v0, Lm30/a;->w:Ljava/lang/String;

    if-eqz p1, :cond_7

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_7
    :goto_1
    return-void
.end method
