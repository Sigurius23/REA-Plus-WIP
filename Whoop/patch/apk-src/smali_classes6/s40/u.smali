.class public final Ls40/u;
.super Ls40/h1;
.source "SourceFile"


# instance fields
.field public E:Lzx/g;

.field public F:Z

.field public final synthetic G:Lcom/stripe/android/view/CardNumberEditText;

.field public w:I

.field public x:I

.field public y:Ljava/lang/Integer;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/CardNumberEditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls40/u;->G:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->e(Lcom/stripe/android/view/CardNumberEditText;)Lzx/g;

    move-result-object p1

    iput-object p1, p0, Ls40/u;->E:Lzx/g;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 9

    iget-object p1, p0, Ls40/u;->G:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->e(Lcom/stripe/android/view/CardNumberEditText;)Lzx/g;

    move-result-object v0

    iget v0, v0, Lzx/g;->e:I

    iget-object v1, p0, Ls40/u;->E:Lzx/g;

    iget v1, v1, Lzx/g;->e:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p1, Lcom/stripe/android/view/StripeEditText;->H:Z

    if-nez v0, :cond_1

    :goto_0
    iget-object v0, p0, Ls40/u;->z:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setTextSilent$payments_core_release(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Ls40/u;->y:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v2, v1}, Le93/b;->n(III)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Ls40/u;->z:Ljava/lang/String;

    iput-object v0, p0, Ls40/u;->y:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->e(Lcom/stripe/android/view/CardNumberEditText;)Lzx/g;

    move-result-object v0

    iget v0, v0, Lzx/g;->e:I

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    const/4 v3, 0x1

    if-ne v0, v1, :cond_8

    iget-boolean v0, p1, Lcom/stripe/android/view/CardNumberEditText;->k0:Z

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v1

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    iput-boolean v1, p1, Lcom/stripe/android/view/CardNumberEditText;->k0:Z

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v1

    if-eqz v1, :cond_3

    move v2, v3

    :cond_3
    xor-int/lit8 v1, v2, 0x1

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService$payments_core_release()Lzx/s;

    move-result-object v1

    invoke-virtual {v1}, Lzx/s;->a()Ly00/b;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->e(Lcom/stripe/android/view/CardNumberEditText;)Lzx/g;

    move-result-object v1

    iget-boolean v1, v1, Lzx/g;->h:Z

    if-eqz v1, :cond_4

    iget-object v1, p1, Lcom/stripe/android/view/CardNumberEditText;->a0:Lyy/j;

    iget-object v2, p1, Lcom/stripe/android/view/CardNumberEditText;->b0:Lb10/b;

    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->s0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lyy/j;->a(Lyy/b;)V

    :cond_4
    if-nez v0, :cond_7

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->e(Lcom/stripe/android/view/CardNumberEditText;)Lzx/g;

    move-result-object v0

    iget-boolean v0, v0, Lzx/g;->f:Z

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService$payments_core_release()Lzx/s;

    move-result-object v0

    invoke-virtual {v0}, Lzx/s;->a()Ly00/b;

    move-result-object v0

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_5
    return-void

    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getCompletionCallback$payments_core_release()Lc93/a;

    move-result-object p1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_7
    return-void

    :cond_8
    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->e(Lcom/stripe/android/view/CardNumberEditText;)Lzx/g;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    iget-object v0, v0, Lzx/g;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eq v4, v1, :cond_b

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->e(Lcom/stripe/android/view/CardNumberEditText;)Lzx/g;

    move-result-object v0

    iget-object v0, v0, Lzx/g;->d:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    sget-object v1, Ly00/i;->M:Lt9/c0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lt9/c0;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ly00/i;->X:Ly00/i;

    if-eq v0, v1, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v0

    if-eqz v0, :cond_a

    move v2, v3

    :cond_a
    iput-boolean v2, p1, Lcom/stripe/android/view/CardNumberEditText;->k0:Z

    invoke-virtual {p1, v3}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void

    :cond_b
    :goto_3
    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v0

    if-eqz v0, :cond_c

    goto :goto_4

    :cond_c
    move v3, v2

    :goto_4
    iput-boolean v3, p1, Lcom/stripe/android/view/CardNumberEditText;->k0:Z

    invoke-virtual {p1, v2}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Ls40/u;->F:Z

    iget-object p1, p0, Ls40/u;->G:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->e(Lcom/stripe/android/view/CardNumberEditText;)Lzx/g;

    move-result-object p1

    iput-object p1, p0, Ls40/u;->E:Lzx/g;

    iput p2, p0, Ls40/u;->w:I

    iput p4, p0, Ls40/u;->x:I

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 9

    new-instance v0, Lzx/g;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-direct {v0, p1}, Lzx/g;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Ls40/u;->G:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService$payments_core_release()Lzx/s;

    move-result-object v2

    iget-boolean v3, p1, Lcom/stripe/android/view/CardNumberEditText;->l0:Z

    invoke-virtual {v2, v0, v3}, Lzx/s;->b(Lzx/g;Z)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le p4, p3, :cond_2

    if-nez p2, :cond_2

    iget-object p2, v0, Lzx/g;->d:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/16 p3, 0xe

    if-lt p2, p3, :cond_2

    move p2, v3

    goto :goto_1

    :cond_2
    move p2, v2

    :goto_1
    iput-boolean p2, p0, Ls40/u;->F:Z

    iget p3, v0, Lzx/g;->e:I

    if-eqz p2, :cond_3

    invoke-virtual {v0, p3}, Lzx/g;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    new-instance p4, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {p4, p2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    new-array p2, v3, [Landroid/text/InputFilter;

    aput-object p4, p2, v2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    :cond_3
    iget-boolean p2, p0, Ls40/u;->F:Z

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result p3

    :goto_2
    invoke-virtual {v0, p3}, Lzx/g;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    iget p4, p0, Ls40/u;->w:I

    iget v0, p0, Ls40/u;->x:I

    sget-object v4, Lzx/i;->b:Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v4, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Set;

    if-nez p3, :cond_5

    sget-object p3, Lzx/i;->a:Ljava/util/Set;

    :cond_5
    check-cast p3, Ljava/lang/Iterable;

    instance-of v4, p3, Ljava/util/Collection;

    if-eqz v4, :cond_6

    move-object v5, p3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    move v6, v2

    goto :goto_4

    :cond_6
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v2

    :cond_7
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    if-gt p4, v7, :cond_7

    add-int v8, p4, v0

    if-lt v8, v7, :cond_7

    add-int/lit8 v6, v6, 0x1

    if-ltz v6, :cond_8

    goto :goto_3

    :cond_8
    invoke-static {}, Lwb3/f;->c0()V

    throw v1

    :cond_9
    :goto_4
    if-eqz v4, :cond_a

    move-object v1, p3

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_b
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-nez v0, :cond_b

    add-int/2addr v1, v3

    if-ne p4, v1, :cond_b

    move v2, v3

    :cond_c
    :goto_5
    add-int/2addr p4, v0

    add-int/2addr p4, v6

    if-eqz v2, :cond_d

    if-lez p4, :cond_d

    add-int/lit8 p4, p4, -0x1

    :cond_d
    if-gt p4, p2, :cond_e

    move p2, p4

    :cond_e
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Ls40/u;->y:Ljava/lang/Integer;

    iput-object p1, p0, Ls40/u;->z:Ljava/lang/String;

    return-void
.end method
