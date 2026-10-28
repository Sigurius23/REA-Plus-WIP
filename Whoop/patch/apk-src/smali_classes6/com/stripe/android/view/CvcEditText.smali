.class public final Lcom/stripe/android/view/CvcEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001R(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/view/CvcEditText;",
        "Lcom/stripe/android/view/StripeEditText;",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "W",
        "Lc93/a;",
        "getCompletionCallback$payments_core_release",
        "()Lc93/a;",
        "setCompletionCallback$payments_core_release",
        "(Lc93/a;)V",
        "completionCallback",
        "Lzx/k;",
        "getUnvalidatedCvc",
        "()Lzx/k;",
        "unvalidatedCvc",
        "Lzx/l;",
        "getCvc$payments_core_release",
        "()Lzx/l;",
        "cvc",
        "",
        "getAccessibilityText",
        "()Ljava/lang/String;",
        "accessibilityText",
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


# static fields
.field public static final synthetic a0:I


# instance fields
.field public V:Ly00/i;

.field public synthetic W:Lc93/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f040208

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p1, Ly00/i;->X:Ly00/i;

    iput-object p1, p0, Lcom/stripe/android/view/CvcEditText;->V:Ly00/i;

    new-instance p2, Lrx0/f;

    const/16 v0, 0x17

    invoke-direct {p2, v0}, Lrx0/f;-><init>(I)V

    iput-object p2, p0, Lcom/stripe/android/view/CvcEditText;->W:Lc93/a;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f141020

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    const p2, 0x7f140fef

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setHint(I)V

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    invoke-virtual {p1}, Ly00/i;->b()I

    move-result p1

    invoke-direct {v0, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    new-array p1, p2, [Landroid/text/InputFilter;

    const/4 p2, 0x0

    aput-object v0, p1, p2

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->c()V

    const-string p1, "creditCardSecurityCode"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    new-instance p1, Ls40/c;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Ls40/c;-><init>(Landroid/view/View;I)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance v0, Lrq0/e0;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lrq0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutDirection(I)V

    return-void
.end method

.method public static d(Lcom/stripe/android/view/CvcEditText;Z)V
    .locals 2

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lzx/k;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/view/CvcEditText;->V:Ly00/i;

    invoke-virtual {v0}, Ly00/i;->b()I

    move-result v0

    iget-object v1, p1, Lzx/k;->x:Ljava/lang/String;

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iget-object p1, p1, Lzx/k;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_0
    return-void
.end method

.method public static final synthetic e(Lcom/stripe/android/view/CvcEditText;)Lzx/k;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lzx/k;

    move-result-object p0

    return-object p0
.end method

.method private final getUnvalidatedCvc()Lzx/k;
    .locals 2

    new-instance v0, Lzx/k;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lzx/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final f(Ly00/i;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 5

    const-string v0, "cardBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CvcEditText;->V:Ly00/i;

    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    invoke-virtual {p1}, Ly00/i;->b()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v1, 0x1

    new-array v2, v1, [Landroid/text/InputFilter;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    if-nez p2, :cond_1

    sget-object p2, Ly00/i;->Q:Ly00/i;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f140fec

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f140fef

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lzx/k;

    move-result-object v0

    iget-object v0, v0, Lzx/k;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lzx/k;

    move-result-object v0

    invoke-virtual {p1}, Ly00/i;->b()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v4, v2}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    iget-object v0, v0, Lzx/k;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lzx/l;

    invoke-direct {v2, v0}, Lzx/l;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_3

    move v3, v1

    :cond_3
    invoke-virtual {p0, v3}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_4
    if-eqz p4, :cond_7

    invoke-virtual {p4, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget-object p3, Ls40/j0;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    if-ne p1, v1, :cond_6

    const p1, 0x7f140fee

    goto :goto_2

    :cond_6
    const p1, 0x7f140fed

    :goto_2
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string p1, "getString(...)"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    invoke-virtual {p4, p3}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    return-void

    :cond_7
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getAccessibilityText()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f140f61

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getCompletionCallback$payments_core_release()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CvcEditText;->W:Lc93/a;

    return-object v0
.end method

.method public final getCvc$payments_core_release()Lzx/l;
    .locals 3

    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lzx/k;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CvcEditText;->V:Ly00/i;

    invoke-virtual {v1}, Ly00/i;->b()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v2, v1}, [Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    iget-object v0, v0, Lzx/k;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lzx/l;

    invoke-direct {v1, v0}, Lzx/l;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final setCompletionCallback$payments_core_release(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CvcEditText;->W:Lc93/a;

    return-void
.end method
