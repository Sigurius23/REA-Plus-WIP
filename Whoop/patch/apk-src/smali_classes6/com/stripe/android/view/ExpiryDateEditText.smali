.class public final Lcom/stripe/android/view/ExpiryDateEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R(\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0006R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/view/ExpiryDateEditText;",
        "Lcom/stripe/android/view/StripeEditText;",
        "",
        "include",
        "Ll83/a0;",
        "setIncludeSeparatorGaps",
        "(Z)V",
        "Lkotlin/Function0;",
        "V",
        "Lc93/a;",
        "getCompletionCallback$payments_core_release",
        "()Lc93/a;",
        "setCompletionCallback$payments_core_release",
        "(Lc93/a;)V",
        "completionCallback",
        "<set-?>",
        "a0",
        "Lf93/d;",
        "getIncludeSeparatorGaps$payments_core_release",
        "()Z",
        "setIncludeSeparatorGaps$payments_core_release",
        "includeSeparatorGaps",
        "Ly00/e2;",
        "getValidatedDate",
        "()Ly00/e2;",
        "validatedDate",
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
.field public static final synthetic d0:[Lj93/z;


# instance fields
.field public synthetic V:Lc93/a;

.field public W:Z

.field public final a0:Ls40/g;

.field public final b0:I

.field public c0:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/stripe/android/view/ExpiryDateEditText;

    const-string v2, "includeSeparatorGaps"

    const-string v3, "getIncludeSeparatorGaps$payments_core_release()Z"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/stripe/android/view/ExpiryDateEditText;->d0:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f040208

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Lrx0/f;

    const/16 v0, 0x18

    invoke-direct {p2, v0}, Lrx0/f;-><init>(I)V

    iput-object p2, p0, Lcom/stripe/android/view/ExpiryDateEditText;->V:Lc93/a;

    new-instance p2, Ls40/g;

    invoke-direct {p2, p0}, Ls40/g;-><init>(Lcom/stripe/android/view/ExpiryDateEditText;)V

    iput-object p2, p0, Lcom/stripe/android/view/ExpiryDateEditText;->a0:Ls40/g;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0b005a

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->b0:I

    const-string p1, "/"

    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->c()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->d(Z)V

    new-instance p2, Ls40/l0;

    invoke-direct {p2, p0}, Ls40/l0;-><init>(Lcom/stripe/android/view/ExpiryDateEditText;)V

    invoke-virtual {p0, p2}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const-string p2, "creditCardExpirationDate"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p2

    new-instance v0, Lrq0/e0;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lrq0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    return-void
.end method


# virtual methods
.method public final d(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const-string p1, " / "

    goto :goto_0

    :cond_0
    const-string p1, "/"

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->c0:Ljava/lang/String;

    new-instance p1, Landroid/text/InputFilter$LengthFilter;

    iget-object v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->c0:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->b0:I

    add-int/2addr v0, v1

    invoke-direct {p1, v0}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/text/InputFilter$LengthFilter;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/text/InputFilter;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

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

    const v2, 0x7f140f63

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

    iget-object v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->V:Lc93/a;

    return-object v0
.end method

.method public final getIncludeSeparatorGaps$payments_core_release()Z
    .locals 2

    sget-object v0, Lcom/stripe/android/view/ExpiryDateEditText;->d0:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->a0:Ls40/g;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getValidatedDate()Ly00/e2;
    .locals 8

    iget-boolean v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->W:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    sget-object v0, Ly00/d2;->f:Ly00/d2;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly00/g;->a(Ljava/lang/String;)Ly00/d2;

    move-result-object v0

    iget-object v3, v0, Ly00/d2;->a:Ljava/lang/String;

    iget-object v0, v0, Ly00/d2;->b:Ljava/lang/String;

    :try_start_0
    new-instance v4, Ly00/e2;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    const-string v6, "getInstance(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    div-int/lit8 v5, v2, 0x64

    rem-int/lit8 v2, v2, 0x64

    const/16 v6, 0x14

    const/16 v7, 0x50

    if-le v2, v7, :cond_0

    if-ge v0, v6, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    if-ge v2, v6, :cond_1

    if-le v0, v7, :cond_1

    add-int/lit8 v5, v5, -0x1

    :cond_1
    :goto_0
    mul-int/lit8 v5, v5, 0x64

    add-int/2addr v5, v0

    invoke-direct {v4, v3, v5}, Ly00/e2;-><init>(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v4

    :goto_1
    instance-of v0, v4, Ll83/m;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v4

    :goto_2
    check-cast v1, Ly00/e2;

    return-object v1

    :cond_3
    if-nez v0, :cond_4

    return-object v1

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
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

    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->V:Lc93/a;

    return-void
.end method

.method public final setIncludeSeparatorGaps(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->setIncludeSeparatorGaps$payments_core_release(Z)V

    return-void
.end method

.method public final setIncludeSeparatorGaps$payments_core_release(Z)V
    .locals 2

    sget-object v0, Lcom/stripe/android/view/ExpiryDateEditText;->d0:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->a0:Ls40/g;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method
