.class public final Lcom/stripe/android/view/BecsDebitBsbEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001R0\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR(\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/view/BecsDebitBsbEditText;",
        "Lcom/stripe/android/view/StripeEditText;",
        "Lkotlin/Function1;",
        "Ls40/d;",
        "Ll83/a0;",
        "W",
        "Lkotlin/jvm/functions/Function1;",
        "getOnBankChangedCallback",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnBankChangedCallback",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onBankChangedCallback",
        "Lkotlin/Function0;",
        "a0",
        "Lc93/a;",
        "getOnCompletedCallback",
        "()Lc93/a;",
        "setOnCompletedCallback",
        "(Lc93/a;)V",
        "onCompletedCallback",
        "getBank",
        "()Ls40/d;",
        "bank",
        "",
        "getBsb$payments_core_release",
        "()Ljava/lang/String;",
        "bsb",
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
.field public static final synthetic b0:I


# instance fields
.field public final V:Ls40/e;

.field public W:Lkotlin/jvm/functions/Function1;

.field public a0:Lc93/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f040208

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Ls40/e;

    invoke-direct {p2, p1}, Ls40/e;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/stripe/android/view/BecsDebitBsbEditText;->V:Ls40/e;

    new-instance p1, Ls32/d;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ls32/d;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitBsbEditText;->W:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lrx0/f;

    const/16 p2, 0x15

    invoke-direct {p1, p2}, Lrx0/f;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitBsbEditText;->a0:Lc93/a;

    new-instance p1, Landroid/text/InputFilter$LengthFilter;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    filled-new-array {p1}, [Landroid/text/InputFilter$LengthFilter;

    move-result-object p1

    check-cast p1, [Landroid/text/InputFilter;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setInputType(I)V

    new-instance p1, Ls40/f;

    invoke-direct {p1, p0}, Ls40/f;-><init>(Lcom/stripe/android/view/BecsDebitBsbEditText;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public static final synthetic d(Lcom/stripe/android/view/BecsDebitBsbEditText;)Ls40/d;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->getBank()Ls40/d;

    move-result-object p0

    return-object p0
.end method

.method private final getBank()Ls40/d;
    .locals 6

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/BecsDebitBsbEditText;->V:Ls40/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "bsb"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Ls40/e;->a:Ljava/util/ArrayList;

    sget-object v3, Ls40/e;->c:Ls40/d;

    iget-boolean v1, v1, Ls40/e;->b:Z

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-static {v3}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v2, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ls40/d;

    iget-object v3, v3, Ls40/d;->w:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {v0, v3, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v4, v2

    :cond_2
    check-cast v4, Ls40/d;

    return-object v4
.end method


# virtual methods
.method public final e()Z
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->getBank()Ls40/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getBsb$payments_core_release()Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f140fc5

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->getBank()Ls40/d;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140fc6

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_0
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage$payments_core_release(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_4

    invoke-interface {v0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v1, v5}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    return-object v2
.end method

.method public final getOnBankChangedCallback()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/BecsDebitBsbEditText;->W:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnCompletedCallback()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/BecsDebitBsbEditText;->a0:Lc93/a;

    return-object v0
.end method

.method public final setOnBankChangedCallback(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitBsbEditText;->W:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnCompletedCallback(Lc93/a;)V
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

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitBsbEditText;->a0:Lc93/a;

    return-void
.end method
