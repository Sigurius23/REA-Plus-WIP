.class public final Ls40/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, Ls40/c;->w:I

    iput-object p1, p0, Ls40/c;->x:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final b(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final c(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final d(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final e(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final f(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final g(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final h(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final i(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final j(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    iget v0, p0, Ls40/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls40/c;->x:Landroid/view/View;

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iget-object v0, v0, Lcom/stripe/android/view/StripeEditText;->I:Ls40/d1;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-interface {v0, p1}, Ls40/d1;->a(Ljava/lang/String;)V

    :cond_2
    return-void

    :pswitch_0
    iget-object p1, p0, Ls40/c;->x:Landroid/view/View;

    check-cast p1, Lcom/stripe/android/view/PostalCodeEditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ls40/c;->x:Landroid/view/View;

    check-cast p1, Lcom/stripe/android/view/CvcEditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v0, p1, Lcom/stripe/android/view/CvcEditText;->V:Ly00/i;

    invoke-static {p1}, Lcom/stripe/android/view/CvcEditText;->e(Lcom/stripe/android/view/CvcEditText;)Lzx/k;

    move-result-object v1

    iget-object v1, v1, Lzx/k;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ly00/i;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/view/CvcEditText;->getCompletionCallback$payments_core_release()Lc93/a;

    move-result-object p1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_3
    return-void

    :pswitch_2
    iget-object p1, p0, Ls40/c;->x:Landroid/view/View;

    check-cast p1, Lcom/stripe/android/view/CardMultilineWidget;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    return-void

    :pswitch_3
    iget-object p1, p0, Ls40/c;->x:Landroid/view/View;

    check-cast p1, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget p1, p0, Ls40/c;->w:I

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget p1, p0, Ls40/c;->w:I

    return-void
.end method
