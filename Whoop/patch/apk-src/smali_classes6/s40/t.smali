.class public final Ls40/t;
.super Lf93/b;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/view/CardMultilineWidget;


# direct methods
.method public constructor <init>(ILcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    iput p1, p0, Ls40/t;->w:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p2, p0, Ls40/t;->x:Lcom/stripe/android/view/CardMultilineWidget;

    .line 2
    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    const p1, 0x7f140fff

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p2, p0, Ls40/t;->x:Lcom/stripe/android/view/CardMultilineWidget;

    .line 4
    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ls40/k0;Lcom/stripe/android/view/CardMultilineWidget;I)V
    .locals 0

    .line 1
    iput p3, p0, Ls40/t;->w:I

    iput-object p2, p0, Ls40/t;->x:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final afterChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ls40/t;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ls40/f1;

    check-cast p2, Ls40/f1;

    iget-object p1, p0, Ls40/t;->x:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardMultilineWidget;->getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    return-void

    :pswitch_0
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ls40/f1;

    check-cast p2, Ls40/f1;

    iget-object p1, p0, Ls40/t;->x:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    return-void

    :pswitch_1
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ls40/f1;

    check-cast p2, Ls40/f1;

    iget-object p1, p0, Ls40/t;->x:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    return-void

    :pswitch_2
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ls40/f1;

    check-cast p2, Ls40/f1;

    iget-object p1, p0, Ls40/t;->x:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberEditText()Lcom/stripe/android/view/CardNumberEditText;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    return-void

    :pswitch_3
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    iget-object p1, p0, Ls40/t;->x:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p2

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-virtual {p2, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_4
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Ls40/t;->x:Lcom/stripe/android/view/CardMultilineWidget;

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Lcom/stripe/android/view/CardMultilineWidget;->getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;

    move-result-object p1

    sget-object p2, Ls40/v0;->x:Ls40/v0;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Ls40/v0;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lcom/stripe/android/view/CardMultilineWidget;->getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;

    move-result-object p1

    sget-object p2, Ls40/v0;->w:Ls40/v0;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Ls40/v0;)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
