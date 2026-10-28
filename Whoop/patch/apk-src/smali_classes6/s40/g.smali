.class public final Ls40/g;
.super Lf93/b;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls40/g;->w:I

    iput-object p1, p0, Ls40/g;->x:Landroid/view/View;

    .line 1
    const-string p1, ""

    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/view/CardNumberTextInputLayout;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls40/g;->w:I

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Ls40/g;->x:Landroid/view/View;

    .line 2
    invoke-direct {p0, v0}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/view/CountryTextInputLayout;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ls40/g;->w:I

    iput-object p1, p0, Ls40/g;->x:Landroid/view/View;

    const/4 p1, 0x0

    .line 3
    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/view/ExpiryDateEditText;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ls40/g;->w:I

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Ls40/g;->x:Landroid/view/View;

    .line 4
    invoke-direct {p0, v0}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/view/PostalCodeEditText;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Ls40/g;->w:I

    sget-object v0, Ls40/v0;->w:Ls40/v0;

    iput-object p1, p0, Ls40/g;->x:Landroid/view/View;

    .line 5
    invoke-direct {p0, v0}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final afterChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Ls40/g;->w:I

    const/4 v1, 0x0

    const-string v2, "property"

    iget-object v3, p0, Ls40/g;->x:Landroid/view/View;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lcom/stripe/android/view/PostalCodeEditText;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ls40/v0;

    check-cast p2, Ls40/v0;

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    sget-object p1, Lcom/stripe/android/view/PostalCodeEditText;->W:[Lj93/z;

    const p1, 0x7f140f9a

    invoke-virtual {v3, p1}, Lcom/stripe/android/view/PostalCodeEditText;->d(I)V

    new-instance p1, Landroid/text/InputFilter$LengthFilter;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    filled-new-array {p1}, [Landroid/text/InputFilter$LengthFilter;

    move-result-object p1

    check-cast p1, [Landroid/text/InputFilter;

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    invoke-static {v1, p2}, Landroid/text/method/DigitsKeyListener;->getInstance(ZZ)Landroid/text/method/DigitsKeyListener;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroidx/appcompat/widget/AppCompatEditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    invoke-virtual {v3}, Lcom/stripe/android/view/StripeEditText;->c()V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lcom/stripe/android/view/PostalCodeEditText;->W:[Lj93/z;

    const p1, 0x7f140f8e

    invoke-virtual {v3, p1}, Lcom/stripe/android/view/PostalCodeEditText;->d(I)V

    invoke-static {}, Landroid/text/method/TextKeyListener;->getInstance()Landroid/text/method/TextKeyListener;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroidx/appcompat/widget/AppCompatEditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    const/16 p1, 0x70

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setInputType(I)V

    new-array p1, v1, [Landroid/text/InputFilter;

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    :goto_0
    return-void

    :pswitch_0
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v3, Lcom/stripe/android/view/ExpiryDateEditText;

    sget-object p2, Lcom/stripe/android/view/ExpiryDateEditText;->d0:[Lj93/z;

    invoke-virtual {v3, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->d(Z)V

    return-void

    :pswitch_1
    check-cast v3, Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/stripe/android/core/model/CountryCode;

    check-cast p2, Lcom/stripe/android/core/model/CountryCode;

    if-eqz p3, :cond_2

    invoke-virtual {v3}, Lcom/stripe/android/view/CountryTextInputLayout;->getCountryCodeChangeCallback()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lvy/a;->a:Ljava/util/Set;

    invoke-static {v3}, Lcom/stripe/android/view/CountryTextInputLayout;->P(Lcom/stripe/android/view/CountryTextInputLayout;)Ljava/util/Locale;

    move-result-object p1

    invoke-static {p3, p1}, Lvy/a;->a(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v3}, Lcom/stripe/android/view/CountryTextInputLayout;->getCountryChangeCallback$payments_core_release()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void

    :pswitch_2
    check-cast v3, Lcom/stripe/android/view/CardNumberTextInputLayout;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eq p2, p1, :cond_4

    if-eqz p1, :cond_3

    iget-object p1, v3, Lcom/stripe/android/view/CardNumberTextInputLayout;->e1:Ls40/a0;

    iget-object p2, p1, Ls40/a0;->w:Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_1

    :cond_3
    iget-object p1, v3, Lcom/stripe/android/view/CardNumberTextInputLayout;->e1:Ls40/a0;

    iget-object p2, p1, Ls40/a0;->x:Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_4
    :goto_1
    return-void

    :pswitch_3
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast v3, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    invoke-static {p3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 p3, 0x0

    :goto_2
    if-eqz p3, :cond_6

    iget-object p1, v3, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->w:Lgm/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lgm/j;->w:Landroid/content/Context;

    const p2, 0x7f140fc0

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    const-string p1, ""

    :goto_3
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
