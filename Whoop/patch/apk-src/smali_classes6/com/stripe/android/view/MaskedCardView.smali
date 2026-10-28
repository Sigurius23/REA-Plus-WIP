.class public final Lcom/stripe/android/view/MaskedCardView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R(\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00128G@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/view/MaskedCardView;",
        "Landroid/widget/LinearLayout;",
        "",
        "selected",
        "Ll83/a0;",
        "setSelected",
        "(Z)V",
        "Ly00/o4;",
        "paymentMethod",
        "setPaymentMethod",
        "(Ly00/o4;)V",
        "Ly00/i;",
        "value",
        "w",
        "Ly00/i;",
        "getCardBrand",
        "()Ly00/i;",
        "cardBrand",
        "",
        "x",
        "Ljava/lang/String;",
        "getLast4",
        "()Ljava/lang/String;",
        "last4",
        "Liz/c;",
        "y",
        "Liz/c;",
        "getViewBinding$payments_core_release",
        "()Liz/c;",
        "viewBinding",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public w:Ly00/i;

.field public x:Ljava/lang/String;

.field public final y:Liz/c;

.field public final z:Lq3/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p2, Ly00/i;->X:Ly00/i;

    iput-object p2, p0, Lcom/stripe/android/view/MaskedCardView;->w:Ly00/i;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d065b

    invoke-virtual {p2, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p2, 0x7f0a01e9

    invoke-static {p0, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v0, :cond_0

    const p2, 0x7f0a025b

    invoke-static {p0, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v1, :cond_0

    const p2, 0x7f0a03c0

    invoke-static {p0, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v2, :cond_0

    new-instance p2, Liz/c;

    invoke-direct {p2, p0, v0, v1, v2}, Liz/c;-><init>(Lcom/stripe/android/view/MaskedCardView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatTextView;)V

    iput-object p2, p0, Lcom/stripe/android/view/MaskedCardView;->y:Liz/c;

    new-instance p2, Ls40/i1;

    invoke-direct {p2, p1}, Ls40/i1;-><init>(Landroid/content/Context;)V

    new-instance p1, Lq3/i;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "getResources(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v2, p2}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/stripe/android/view/MaskedCardView;->z:Lq3/i;

    iget p1, p2, Ls40/i1;->a:I

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/NullPointerException;

    const-string v0, "Missing required view with ID: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a()V
    .locals 13

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->y:Liz/c;

    iget-object v1, v0, Liz/c;->b:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/view/MaskedCardView;->w:Ly00/i;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    const v3, 0x7f080851

    goto :goto_0

    :pswitch_1
    const v3, 0x7f0807d7

    goto :goto_0

    :pswitch_2
    const v3, 0x7f0807bd

    goto :goto_0

    :pswitch_3
    const v3, 0x7f08084f

    goto :goto_0

    :pswitch_4
    const v3, 0x7f0807ca

    goto :goto_0

    :pswitch_5
    const v3, 0x7f0807da

    goto :goto_0

    :pswitch_6
    const v3, 0x7f0807cd

    goto :goto_0

    :pswitch_7
    const v3, 0x7f0807a6

    goto :goto_0

    :pswitch_8
    const v3, 0x7f0807de

    goto :goto_0

    :pswitch_9
    const v3, 0x7f080854

    :goto_0
    invoke-static {v2, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, v0, Liz/c;->d:Landroidx/appcompat/widget/AppCompatTextView;

    iget-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->w:Ly00/i;

    iget-object v2, p0, Lcom/stripe/android/view/MaskedCardView;->x:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v3

    iget-object v4, p0, Lcom/stripe/android/view/MaskedCardView;->z:Lq3/i;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "brand"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Ly00/i;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x0

    const-string v7, "sans-serif-medium"

    const/16 v8, 0x21

    if-eqz v2, :cond_3

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_3

    :cond_0
    iget-object v5, v4, Lq3/i;->w:Ljava/lang/Object;

    check-cast v5, Landroid/content/res/Resources;

    const v9, 0x7f140fd8

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v5, v9, v10}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "getString(...)"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x6

    invoke-static {v5, v2, v6, v6, v10}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v11

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v11

    invoke-static {v5, v1, v6, v6, v10}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v10

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    iget-object v4, v4, Lq3/i;->x:Ljava/lang/Object;

    check-cast v4, Ls40/i1;

    if-eqz v3, :cond_1

    iget v12, v4, Ls40/i1;->a:I

    goto :goto_1

    :cond_1
    iget v12, v4, Ls40/i1;->b:I

    :goto_1
    if-eqz v3, :cond_2

    iget v3, v4, Ls40/i1;->c:I

    goto :goto_2

    :cond_2
    iget v3, v4, Ls40/i1;->d:I

    :goto_2
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v5, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v4, v5, v6, v9, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    new-instance v3, Landroid/text/style/TypefaceSpan;

    invoke-direct {v3, v7}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3, v10, v1, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v3, v12}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v4, v3, v10, v1, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    new-instance v1, Landroid/text/style/TypefaceSpan;

    invoke-direct {v1, v7}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1, v11, v2, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v1, v12}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v4, v1, v11, v2, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_4

    :cond_3
    :goto_3
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v1, Landroid/text/style/TypefaceSpan;

    invoke-direct {v1, v7}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1, v6, v5, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :goto_4
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getCardBrand()Ly00/i;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->w:Ly00/i;

    return-object v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final getViewBinding$payments_core_release()Liz/c;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->y:Liz/c;

    return-object v0
.end method

.method public final setPaymentMethod(Ly00/o4;)V
    .locals 3

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ly00/o4;->H:Ly00/z3;

    sget-object v0, Ly00/i;->M:Lt9/c0;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object v2, p1, Ly00/z3;->L:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object v0

    sget-object v2, Ly00/i;->X:Ly00/i;

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    iget-object v0, p1, Ly00/z3;->w:Ly00/i;

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v2, v0

    :goto_3
    iput-object v2, p0, Lcom/stripe/android/view/MaskedCardView;->w:Ly00/i;

    if-eqz p1, :cond_4

    iget-object v1, p1, Ly00/z3;->H:Ljava/lang/String;

    :cond_4
    iput-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->x:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->a()V

    return-void
.end method

.method public setSelected(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    iget-object p1, p0, Lcom/stripe/android/view/MaskedCardView;->y:Liz/c;

    iget-object p1, p1, Liz/c;->c:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->a()V

    return-void
.end method
