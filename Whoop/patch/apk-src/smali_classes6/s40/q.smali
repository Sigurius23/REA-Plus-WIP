.class public final synthetic Ls40/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls40/d1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/stripe/android/view/CardMultilineWidget;


# direct methods
.method public synthetic constructor <init>(ILcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    iput p1, p0, Ls40/q;->a:I

    iput-object p2, p0, Ls40/q;->b:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    iget v0, p0, Ls40/q;->a:I

    iget-object v1, p0, Ls40/q;->b:Lcom/stripe/android/view/CardMultilineWidget;

    packed-switch v0, :pswitch_data_0

    sget-object p1, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    iget-boolean p1, v1, Lcom/stripe/android/view/CardMultilineWidget;->R:Z

    if-nez p1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getUsZipCodeRequired()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_0
    iget-boolean p1, v1, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    if-eqz p1, :cond_2

    iget-object p1, v1, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/PostalCodeEditText;->getConfig$payments_core_release()Ls40/v0;

    move-result-object v0

    sget-object v1, Ls40/v0;->x:Ls40/v0;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/stripe/android/view/PostalCodeEditText;->a0:Ljava/util/regex/Pattern;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p1}, Lcom/stripe/android/view/PostalCodeEditText;->getConfig$payments_core_release()Ls40/v0;

    move-result-object v0

    sget-object v1, Ls40/v0;->w:Ls40/v0;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    return-void

    :pswitch_0
    iget-object v0, v1, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    sget-object v2, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    iget-object v2, v1, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardNumberEditText;->getImplicitCardBrandForCbc$payments_core_release()Ly00/i;

    move-result-object v3

    sget-object v4, Ly00/i;->X:Ly00/i;

    if-ne v3, v4, :cond_3

    const/4 v3, 0x0

    :cond_3
    if-nez v3, :cond_4

    invoke-virtual {v2}, Lcom/stripe/android/view/CardNumberEditText;->getCardBrand()Ly00/i;

    move-result-object v3

    :cond_4
    invoke-virtual {v3, p1}, Ly00/i;->d(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->b()V

    iget-boolean p1, v1, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    if-eqz p1, :cond_7

    new-instance p1, Ls40/n;

    const/4 v2, 0x1

    invoke-direct {p1, v2, v1}, Ls40/n;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_5
    iget-boolean p1, v1, Lcom/stripe/android/view/CardMultilineWidget;->a0:Z

    if-nez p1, :cond_7

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Ly00/i;

    move-result-object p1

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ly00/i;->d(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    iget-object p1, v1, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    iget-boolean v1, v1, Lcom/stripe/android/view/CardMultilineWidget;->V:Z

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardBrandView;->setShouldShowErrorIcon(Z)V

    :cond_7
    :goto_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
