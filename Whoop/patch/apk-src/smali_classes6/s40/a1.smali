.class public final Ls40/a1;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:Liz/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Ls40/b1;

    invoke-direct {v0, p1}, Ls40/b1;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d0662

    invoke-virtual {v1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v1, 0x7f0a03b3

    invoke-static {p0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_3

    const v1, 0x7f0a093f

    invoke-static {p0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_3

    const v1, 0x7f0a0a0f

    invoke-static {p0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_3

    const v1, 0x7f0a0afd

    invoke-static {p0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v8, :cond_3

    new-instance v3, Liz/e;

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Liz/e;-><init>(Ls40/a1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatImageView;)V

    iput-object v3, v4, Ls40/a1;->z:Liz/e;

    iget v1, v0, Ls40/b1;->b:I

    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    const v1, 0x7f0604ce

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    :cond_0
    iput v1, v4, Ls40/a1;->w:I

    iget v1, v0, Ls40/b1;->d:I

    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    if-ge v2, v3, :cond_1

    const v1, 0x7f0604dc

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    :cond_1
    iput v1, v4, Ls40/a1;->y:I

    iget v0, v0, Ls40/b1;->e:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    if-ge v1, v3, :cond_2

    const v0, 0x7f0604dd

    invoke-static {p1, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    :cond_2
    iput v0, v4, Ls40/a1;->x:I

    return-void

    :cond_3
    move-object v4, p0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public setSelected(Z)V
    .locals 3

    iget-object v0, p0, Ls40/a1;->z:Liz/e;

    if-eqz p1, :cond_0

    iget-object p1, v0, Liz/e;->c:Landroid/widget/TextView;

    iget v1, p0, Ls40/a1;->w:I

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, v0, Liz/e;->b:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, v0, Liz/e;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, v0, Liz/e;->e:Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object p1, v0, Liz/e;->c:Landroid/widget/TextView;

    iget v1, p0, Ls40/a1;->y:I

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, v0, Liz/e;->b:Landroid/widget/TextView;

    iget v2, p0, Ls40/a1;->x:I

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, v0, Liz/e;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, v0, Liz/e;->e:Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final setShippingMethod(Ly00/j6;)V
    .locals 9

    const-string v0, "shippingMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls40/a1;->z:Liz/e;

    iget-object v1, v0, Liz/e;->c:Landroid/widget/TextView;

    iget-object v2, p1, Ly00/j6;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Liz/e;->b:Landroid/widget/TextView;

    iget-object v2, p1, Ly00/j6;->E:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Liz/e;->d:Landroid/widget/TextView;

    iget-wide v1, p1, Ly00/j6;->y:J

    iget-object p1, p1, Ly00/j6;->z:Ljava/util/Currency;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f1410d8

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "currency"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v4, v1, v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/text/NumberFormat;->getCurrencyInstance()Ljava/text/NumberFormat;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type java.text.DecimalFormat"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/text/DecimalFormat;

    invoke-virtual {v3}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v5

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/util/Currency;->getSymbol(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/text/DecimalFormatSymbols;->setCurrencySymbol(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/text/DecimalFormat;->setDecimalFormatSymbols(Ljava/text/DecimalFormatSymbols;)V

    long-to-double v1, v1

    invoke-virtual {p1}, Ljava/util/Currency;->getDefaultFractionDigits()I

    move-result v3

    int-to-double v5, v3

    const-wide/high16 v7, 0x4024000000000000L    # 10.0

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    div-double/2addr v1, v5

    invoke-static {}, Ljava/text/NumberFormat;->getCurrencyInstance()Ljava/text/NumberFormat;

    move-result-object v3

    :try_start_0
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v3

    check-cast v4, Ljava/text/DecimalFormat;

    invoke-virtual {v4}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v4

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/util/Currency;->getSymbol(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/text/DecimalFormatSymbols;->setCurrencySymbol(Ljava/lang/String;)V

    move-object p1, v3

    check-cast p1, Ljava/text/DecimalFormat;

    invoke-virtual {p1, v4}, Ljava/text/DecimalFormat;->setDecimalFormatSymbols(Ljava/text/DecimalFormatSymbols;)V

    move-object p1, v3

    check-cast p1, Ljava/text/DecimalFormat;

    invoke-virtual {p1, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, p1

    goto :goto_0

    :catch_0
    invoke-virtual {v3, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
