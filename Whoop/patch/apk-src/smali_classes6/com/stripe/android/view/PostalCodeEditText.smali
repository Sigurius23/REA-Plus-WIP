.class public final Lcom/stripe/android/view/PostalCodeEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0005J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/view/PostalCodeEditText;",
        "Lcom/stripe/android/view/StripeEditText;",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "getTextInputLayout",
        "()Lcom/google/android/material/textfield/TextInputLayout;",
        "Ls40/v0;",
        "<set-?>",
        "V",
        "Lf93/d;",
        "getConfig$payments_core_release",
        "()Ls40/v0;",
        "setConfig$payments_core_release",
        "(Ls40/v0;)V",
        "config",
        "",
        "getPostalCode$payments_core_release",
        "()Ljava/lang/String;",
        "postalCode",
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
.field public static final synthetic W:[Lj93/z;

.field public static final a0:Ljava/util/regex/Pattern;


# instance fields
.field public final V:Ls40/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/stripe/android/view/PostalCodeEditText;

    const-string v2, "config"

    const-string v3, "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/stripe/android/view/PostalCodeEditText;->W:[Lj93/z;

    const-string v0, "^[0-9]{5}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/view/PostalCodeEditText;->a0:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f040208

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p1, Ls40/v0;->w:Ls40/v0;

    new-instance p1, Ls40/g;

    invoke-direct {p1, p0}, Ls40/g;-><init>(Lcom/stripe/android/view/PostalCodeEditText;)V

    iput-object p1, p0, Lcom/stripe/android/view/PostalCodeEditText;->V:Ls40/g;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f141027

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    new-instance p1, Ls40/c;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Ls40/c;-><init>(Landroid/view/View;I)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const-string p1, "postalCode"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    return-void
.end method

.method private final getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_1

    instance-of v1, v0, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final d(I)V
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHint(I)V

    :cond_1
    return-void
.end method

.method public final getConfig$payments_core_release()Ls40/v0;
    .locals 2

    sget-object v0, Lcom/stripe/android/view/PostalCodeEditText;->W:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/PostalCodeEditText;->V:Ls40/g;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls40/v0;

    return-object v0
.end method

.method public final getPostalCode$payments_core_release()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getConfig$payments_core_release()Ls40/v0;

    move-result-object v0

    sget-object v1, Ls40/v0;->x:Ls40/v0;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/view/PostalCodeEditText;->a0:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final onFinishInflate()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    const v0, 0x7f140f8e

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PostalCodeEditText;->d(I)V

    invoke-static {}, Landroid/text/method/TextKeyListener;->getInstance()Landroid/text/method/TextKeyListener;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatEditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    const/16 v0, 0x70

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setInputType(I)V

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/text/InputFilter;

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public final setConfig$payments_core_release(Ls40/v0;)V
    .locals 2

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/view/PostalCodeEditText;->W:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/PostalCodeEditText;->V:Ls40/g;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method
