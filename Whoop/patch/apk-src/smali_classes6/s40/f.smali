.class public final Ls40/f;
.super Ls40/h1;
.source "SourceFile"


# instance fields
.field public w:Z

.field public x:Ljava/lang/Integer;

.field public y:Ljava/lang/String;

.field public final synthetic z:Lcom/stripe/android/view/BecsDebitBsbEditText;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/BecsDebitBsbEditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls40/f;->z:Lcom/stripe/android/view/BecsDebitBsbEditText;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    iget-boolean p1, p0, Ls40/f;->w:Z

    if-eqz p1, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Ls40/f;->w:Z

    iget-object v0, p0, Ls40/f;->z:Lcom/stripe/android/view/BecsDebitBsbEditText;

    iget-boolean v1, v0, Lcom/stripe/android/view/StripeEditText;->H:Z

    const/4 v2, 0x0

    if-nez v1, :cond_1

    iget-object v1, p0, Ls40/f;->y:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Ls40/f;->x:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v2, v3}, Le93/b;->n(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Ls40/f;->y:Ljava/lang/String;

    iput-object v1, p0, Ls40/f;->x:Ljava/lang/Integer;

    iput-boolean v2, p0, Ls40/f;->w:Z

    invoke-static {v0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->d(Lcom/stripe/android/view/BecsDebitBsbEditText;)Ls40/d;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_2

    move v3, p1

    goto :goto_0

    :cond_2
    move v3, v2

    :goto_0
    if-eqz v3, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f140fc6

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage$payments_core_release(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getErrorMessage$payments_core_release()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    move p1, v2

    :goto_1
    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-virtual {v0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->getOnBankChangedCallback()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-static {v0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->d(Lcom/stripe/android/view/BecsDebitBsbEditText;)Ls40/d;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_5

    const p1, 0x7f0807af

    goto :goto_2

    :cond_5
    const p1, 0x7f0807aa

    :goto_2
    invoke-virtual {v0, p1, v2, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    invoke-virtual {v0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->e()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->getOnCompletedCallback()Lc93/a;

    move-result-object p1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_6
    :goto_3
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 6

    iget-boolean p3, p0, Ls40/f;->w:Z

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x4

    if-le p2, p3, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 p2, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, p2

    :goto_1
    if-nez p1, :cond_3

    const-string p1, ""

    :cond_3
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p4, :cond_5

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget p3, Lcom/stripe/android/view/BecsDebitBsbEditText;->b0:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    const/4 p4, 0x3

    if-lt p3, p4, :cond_6

    invoke-static {p4, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p4

    invoke-static {v0, p1}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p3, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "-"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    :cond_6
    iput-object p1, p0, Ls40/f;->y:Ljava/lang/String;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_7
    iput-object p2, p0, Ls40/f;->x:Ljava/lang/Integer;

    return-void
.end method
