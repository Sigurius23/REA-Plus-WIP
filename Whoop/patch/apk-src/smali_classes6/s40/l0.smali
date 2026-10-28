.class public final Ls40/l0;
.super Ls40/h1;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/String;

.field public final synthetic F:Lcom/stripe/android/view/ExpiryDateEditText;

.field public w:I

.field public x:I

.field public y:Ly00/d2;

.field public z:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/ExpiryDateEditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls40/l0;->F:Lcom/stripe/android/view/ExpiryDateEditText;

    sget-object p1, Ly00/d2;->f:Ly00/d2;

    iput-object p1, p0, Ls40/l0;->y:Ly00/d2;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 10

    iget-object p1, p0, Ls40/l0;->E:Ljava/lang/String;

    const/4 v0, 0x0

    iget-object v1, p0, Ls40/l0;->F:Lcom/stripe/android/view/ExpiryDateEditText;

    if-eqz p1, :cond_0

    invoke-virtual {v1, p1}, Lcom/stripe/android/view/StripeEditText;->setTextSilent$payments_core_release(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Ls40/l0;->z:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1, v0, v2}, Le93/b;->n(III)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_0
    iget-object p1, p0, Ls40/l0;->y:Ly00/d2;

    iget-object v2, p1, Ly00/d2;->a:Ljava/lang/String;

    iget-object p1, p1, Ly00/d2;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-ne v3, v5, :cond_1

    iget-object v3, p0, Ls40/l0;->y:Ly00/d2;

    iget-boolean v3, v3, Ly00/d2;->c:Z

    if-nez v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    move v3, v0

    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-ne v6, v5, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-ne v6, v5, :cond_9

    iget-boolean v3, v1, Lcom/stripe/android/view/ExpiryDateEditText;->W:Z

    const/4 v6, -0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    if-eq v8, v5, :cond_2

    move v2, v6

    goto :goto_2

    :cond_2
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_1
    instance-of v8, v2, Ll83/m;

    if-eqz v8, :cond_3

    move-object v2, v7

    :cond_3
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    if-eq v8, v5, :cond_4

    goto :goto_6

    :cond_4
    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    const-string v6, "getInstance(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    div-int/lit8 v6, v5, 0x64

    rem-int/lit8 v5, v5, 0x64

    const/16 v8, 0x14

    const/16 v9, 0x50

    if-le v5, v9, :cond_5

    if-ge p1, v8, :cond_5

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_5
    if-ge v5, v8, :cond_6

    if-le p1, v9, :cond_6

    add-int/lit8 v6, v6, -0x1

    :cond_6
    :goto_3
    mul-int/lit8 v6, v6, 0x64

    add-int/2addr v6, p1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_4
    instance-of v5, p1, Ll83/m;

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    move-object v7, p1

    :goto_5
    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v6

    :goto_6
    invoke-static {v2, v6}, Lv8/b;->I(II)Z

    move-result p1

    iput-boolean p1, v1, Lcom/stripe/android/view/ExpiryDateEditText;->W:Z

    xor-int/lit8 v2, p1, 0x1

    if-nez v3, :cond_8

    if-eqz p1, :cond_8

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getCompletionCallback$payments_core_release()Lc93/a;

    move-result-object p1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_8
    move v3, v2

    goto :goto_7

    :cond_9
    iput-boolean v0, v1, Lcom/stripe/android/view/ExpiryDateEditText;->W:Z

    :goto_7
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iget-object v2, p0, Ls40/l0;->y:Ly00/d2;

    iget-boolean v5, v2, Ly00/d2;->e:Z

    if-eqz v5, :cond_a

    const v2, 0x7f141016

    goto :goto_8

    :cond_a
    iget-boolean v2, v2, Ly00/d2;->c:Z

    if-nez v2, :cond_b

    const v2, 0x7f141022

    goto :goto_8

    :cond_b
    const v2, 0x7f141023

    :goto_8
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    if-eqz v3, :cond_d

    iget-object p1, p0, Ls40/l0;->y:Ly00/d2;

    iget-boolean v2, p1, Ly00/d2;->e:Z

    if-nez v2, :cond_c

    iget-boolean p1, p1, Ly00/d2;->d:Z

    if-eqz p1, :cond_d

    :cond_c
    move v0, v4

    :cond_d
    invoke-virtual {v1, v0}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    const/4 p1, 0x0

    iput-object p1, p0, Ls40/l0;->E:Ljava/lang/String;

    iput-object p1, p0, Ls40/l0;->z:Ljava/lang/Integer;

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iput p2, p0, Ls40/l0;->w:I

    iput p4, p0, Ls40/l0;->x:I

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 7

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
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    const/4 p4, 0x0

    move v0, p4

    :goto_1
    if-ge v0, p3, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_4

    iget p2, p0, Ls40/l0;->w:I

    if-nez p2, :cond_4

    iget p2, p0, Ls40/l0;->x:I

    if-ne p2, v0, :cond_4

    invoke-virtual {p1, p4}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v1, 0x30

    if-eq p2, v1, :cond_5

    const/16 v1, 0x31

    if-eq p2, v1, :cond_5

    const-string p2, "0"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget p2, p0, Ls40/l0;->x:I

    add-int/2addr p2, v0

    iput p2, p0, Ls40/l0;->x:I

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-ne p2, p3, :cond_5

    iget p2, p0, Ls40/l0;->w:I

    if-ne p2, p3, :cond_5

    iget p2, p0, Ls40/l0;->x:I

    if-nez p2, :cond_5

    invoke-virtual {p1, p4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string p2, "substring(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    :goto_2
    sget-object p2, Ly00/d2;->f:Ly00/d2;

    invoke-static {p1}, Ly00/g;->a(Ljava/lang/String;)Ly00/d2;

    move-result-object p2

    iput-object p2, p0, Ls40/l0;->y:Ly00/d2;

    iget-boolean v1, p2, Ly00/d2;->c:Z

    iget-object v2, p2, Ly00/d2;->a:Ljava/lang/String;

    invoke-static {v2}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v4, p0, Ls40/l0;->F:Lcom/stripe/android/view/ExpiryDateEditText;

    if-ne v2, p3, :cond_6

    iget v2, p0, Ls40/l0;->x:I

    if-lez v2, :cond_6

    if-nez v1, :cond_7

    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-le p1, p3, :cond_8

    :cond_7
    iget-object p1, v4, Lcom/stripe/android/view/ExpiryDateEditText;->c0:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-object p1, p2, Ly00/d2;->b:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    iget v1, p0, Ls40/l0;->w:I

    iget v2, p0, Ls40/l0;->x:I

    iget v3, v4, Lcom/stripe/android/view/ExpiryDateEditText;->b0:I

    iget-object v5, v4, Lcom/stripe/android/view/ExpiryDateEditText;->c0:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v3

    if-gt v1, p3, :cond_9

    add-int v3, v1, v2

    if-lt v3, p3, :cond_9

    iget-object v3, v4, Lcom/stripe/android/view/ExpiryDateEditText;->c0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    goto :goto_3

    :cond_9
    move v3, p4

    :goto_3
    if-nez v2, :cond_a

    iget-object v6, v4, Lcom/stripe/android/view/ExpiryDateEditText;->c0:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, p3

    if-ne v1, v6, :cond_a

    goto :goto_4

    :cond_a
    move v0, p4

    :goto_4
    add-int/2addr v1, v2

    add-int/2addr v1, v3

    if-eqz v0, :cond_b

    if-lez v1, :cond_b

    iget-object p3, v4, Lcom/stripe/android/view/ExpiryDateEditText;->c0:Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p4

    :cond_b
    sub-int/2addr v1, p4

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v5, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Ls40/l0;->z:Ljava/lang/Integer;

    iput-object p1, p0, Ls40/l0;->E:Ljava/lang/String;

    return-void
.end method
