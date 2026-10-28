.class public final Lcom/stripe/android/view/CardNumberEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010 \n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001:\u0002abR\"\u0010\t\u001a\u00020\u00028G@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R0\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@@X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0014\u0010\u0015\u0012\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019RB\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R*\u0010*\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010\u0015\u001a\u0004\u0008(\u0010\u0017\"\u0004\u0008)\u0010\u0019RB\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010!\u001a\u0004\u0008,\u0010#\"\u0004\u0008-\u0010%R6\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00120/2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120/8\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105RN\u0010:\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120/\u0012\u0004\u0012\u00020\u001e0\u001d2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120/\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00087\u0010!\u001a\u0004\u00088\u0010#\"\u0004\u00089\u0010%R(\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u001e0;8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR \u0010I\u001a\u00020C8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u0012\u0004\u0008H\u0010\u001b\u001a\u0004\u0008F\u0010GR.\u0010N\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008K\u0010!\u001a\u0004\u0008L\u0010#\"\u0004\u0008M\u0010%R\u0014\u0010R\u001a\u00020O8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010QR\u0016\u0010V\u001a\u0004\u0018\u00010S8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010UR\u0014\u0010Z\u001a\u00020W8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010YR\u0014\u0010\\\u001a\u00020O8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008[\u0010QR\u0014\u0010`\u001a\u00020]8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008^\u0010_\u00a8\u0006c"
    }
    d2 = {
        "Lcom/stripe/android/view/CardNumberEditText;",
        "Lcom/stripe/android/view/StripeEditText;",
        "Lq83/j;",
        "V",
        "Lq83/j;",
        "getWorkContext",
        "()Lq83/j;",
        "setWorkContext",
        "(Lq83/j;)V",
        "workContext",
        "Landroidx/lifecycle/f2;",
        "c0",
        "Landroidx/lifecycle/f2;",
        "getViewModelStoreOwner$payments_core_release",
        "()Landroidx/lifecycle/f2;",
        "setViewModelStoreOwner$payments_core_release",
        "(Landroidx/lifecycle/f2;)V",
        "viewModelStoreOwner",
        "Ly00/i;",
        "value",
        "d0",
        "Ly00/i;",
        "getCardBrand",
        "()Ly00/i;",
        "setCardBrand$payments_core_release",
        "(Ly00/i;)V",
        "getCardBrand$annotations",
        "()V",
        "cardBrand",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "callback",
        "e0",
        "Lkotlin/jvm/functions/Function1;",
        "getBrandChangeCallback$payments_core_release",
        "()Lkotlin/jvm/functions/Function1;",
        "setBrandChangeCallback$payments_core_release",
        "(Lkotlin/jvm/functions/Function1;)V",
        "brandChangeCallback",
        "f0",
        "getImplicitCardBrandForCbc$payments_core_release",
        "setImplicitCardBrandForCbc$payments_core_release",
        "implicitCardBrandForCbc",
        "g0",
        "getImplicitCardBrandChangeCallback$payments_core_release",
        "setImplicitCardBrandChangeCallback$payments_core_release",
        "implicitCardBrandChangeCallback",
        "",
        "h0",
        "Ljava/util/List;",
        "getPossibleCardBrands$payments_core_release",
        "()Ljava/util/List;",
        "setPossibleCardBrands$payments_core_release",
        "(Ljava/util/List;)V",
        "possibleCardBrands",
        "i0",
        "getPossibleCardBrandsCallback$payments_core_release",
        "setPossibleCardBrandsCallback$payments_core_release",
        "possibleCardBrandsCallback",
        "Lkotlin/Function0;",
        "j0",
        "Lc93/a;",
        "getCompletionCallback$payments_core_release",
        "()Lc93/a;",
        "setCompletionCallback$payments_core_release",
        "(Lc93/a;)V",
        "completionCallback",
        "Lzx/s;",
        "m0",
        "Lzx/s;",
        "getAccountRangeService$payments_core_release",
        "()Lzx/s;",
        "getAccountRangeService$payments_core_release$annotations",
        "accountRangeService",
        "",
        "n0",
        "isLoadingCallback$payments_core_release",
        "setLoadingCallback$payments_core_release",
        "isLoadingCallback",
        "",
        "getPanLength$payments_core_release",
        "()I",
        "panLength",
        "Lzx/h;",
        "getValidatedCardNumber$payments_core_release",
        "()Lzx/h;",
        "validatedCardNumber",
        "",
        "getAccessibilityText",
        "()Ljava/lang/String;",
        "accessibilityText",
        "getFormattedPanLength",
        "formattedPanLength",
        "Lzx/g;",
        "getUnvalidatedCardNumber",
        "()Lzx/g;",
        "unvalidatedCardNumber",
        "s40/v",
        "s40/u",
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
.field public static final synthetic p0:I


# instance fields
.field public V:Lq83/j;

.field public final W:Lzx/n;

.field public final a0:Lyy/j;

.field public final b0:Lb10/b;

.field public c0:Landroidx/lifecycle/f2;

.field public d0:Ly00/i;

.field public synthetic e0:Lkotlin/jvm/functions/Function1;

.field public f0:Ly00/i;

.field public g0:Lkotlin/jvm/functions/Function1;

.field public h0:Ljava/util/List;

.field public synthetic i0:Lkotlin/jvm/functions/Function1;

.field public synthetic j0:Lc93/a;

.field public k0:Z

.field public l0:Z

.field public final m0:Lzx/s;

.field public synthetic n0:Lkotlin/jvm/functions/Function1;

.field public o0:Lbc3/c2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lhc3/o;->a:Lbc3/w1;

    sget-object v4, Lkc3/d;->w:Lkc3/d;

    new-instance v0, Lal0/f;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Lal0/f;-><init>(Landroid/content/Context;I)V

    new-instance v1, Lzx/o;

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v1, p1, v2}, Lzx/o;-><init>(Landroid/content/Context;Ljava/util/Set;)V

    iget-object v1, v1, Lzx/o;->e:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lzx/n;

    new-instance v5, Lzx/t;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lyy/j;

    invoke-direct {v1}, Lyy/j;-><init>()V

    new-instance v6, Lb10/b;

    new-instance v7, Lrm/p;

    const/16 v8, 0x8

    invoke-direct {v7, v0, v8}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v6, p1, v7}, Lb10/b;-><init>(Landroid/content/Context;Lk83/a;)V

    const-string v0, "uiContext"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepository"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f040208

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v4, p0, Lcom/stripe/android/view/CardNumberEditText;->V:Lq83/j;

    iput-object v2, p0, Lcom/stripe/android/view/CardNumberEditText;->W:Lzx/n;

    iput-object v1, p0, Lcom/stripe/android/view/CardNumberEditText;->a0:Lyy/j;

    iput-object v6, p0, Lcom/stripe/android/view/CardNumberEditText;->b0:Lb10/b;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->c0:Landroidx/lifecycle/f2;

    sget-object p1, Ly00/i;->X:Ly00/i;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->d0:Ly00/i;

    new-instance p2, Ls32/d;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Ls32/d;-><init>(I)V

    iput-object p2, p0, Lcom/stripe/android/view/CardNumberEditText;->e0:Lkotlin/jvm/functions/Function1;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->f0:Ly00/i;

    new-instance p1, Ls32/d;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Ls32/d;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->g0:Lkotlin/jvm/functions/Function1;

    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->h0:Ljava/util/List;

    new-instance p1, Ls32/d;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Ls32/d;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->i0:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lrx0/f;

    const/16 p2, 0x16

    invoke-direct {p1, p2}, Lrx0/f;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->j0:Lc93/a;

    new-instance v1, Lzx/s;

    new-instance v8, Lq30/u0;

    const/16 p1, 0x10

    invoke-direct {v8, p0, p1}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    const/4 v9, 0x0

    const/16 v10, 0xb0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v10}, Lzx/s;-><init>(Lzx/n;Lq83/j;Lq83/j;Lzx/x;Lux/a;Lux/b;Lq30/u0;Lhc3/d;I)V

    iput-object v1, p0, Lcom/stripe/android/view/CardNumberEditText;->m0:Lzx/s;

    new-instance p1, Ls32/d;

    const/4 p2, 0x5

    invoke-direct {p1, p2}, Ls32/d;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->n0:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->c()V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f14101f

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    new-instance p1, Ls40/u;

    invoke-direct {p1, p0}, Ls40/u;-><init>(Lcom/stripe/android/view/CardNumberEditText;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lrq0/e0;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lrq0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p1, "creditCardNumber"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    invoke-static {p0}, Lcom/stripe/android/view/CardNumberEditText;->f(Lcom/stripe/android/view/CardNumberEditText;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    return-void
.end method

.method public static d(Lcom/stripe/android/view/CardNumberEditText;Z)V
    .locals 2

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getUnvalidatedCardNumber()Lzx/g;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v0

    iget-object p1, p1, Lzx/g;->d:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_0
    return-void
.end method

.method public static final synthetic e(Lcom/stripe/android/view/CardNumberEditText;)Lzx/g;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getUnvalidatedCardNumber()Lzx/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/stripe/android/view/CardNumberEditText;)V
    .locals 3

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getFormattedPanLength()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v1, v0}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public static synthetic getAccountRangeService$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCardBrand$annotations()V
    .locals 0

    return-void
.end method

.method private final getFormattedPanLength()I
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v0

    sget-object v1, Lzx/i;->a:Ljava/util/Set;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    sget-object v2, Lzx/i;->b:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    if-nez v1, :cond_0

    sget-object v1, Lzx/i;->a:Ljava/util/Set;

    :cond_0
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method private final getUnvalidatedCardNumber()Lzx/g;
    .locals 2

    new-instance v0, Lzx/g;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lzx/g;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getAccessibilityText()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f140f60

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getAccountRangeService$payments_core_release()Lzx/s;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->m0:Lzx/s;

    return-object v0
.end method

.method public final getBrandChangeCallback$payments_core_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->e0:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getCardBrand()Ly00/i;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->d0:Ly00/i;

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

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->j0:Lc93/a;

    return-object v0
.end method

.method public final getImplicitCardBrandChangeCallback$payments_core_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->g0:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getImplicitCardBrandForCbc$payments_core_release()Ly00/i;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->f0:Ly00/i;

    return-object v0
.end method

.method public final getPanLength$payments_core_release()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->m0:Lzx/s;

    invoke-virtual {v0}, Lzx/s;->a()Ly00/b;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v0, v1, Ly00/b;->x:I

    return v0

    :cond_0
    iget-object v0, v0, Lzx/s;->d:Lzx/x;

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getUnvalidatedCardNumber()Lzx/g;

    move-result-object v1

    check-cast v0, Lzx/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "cardNumber"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lzx/t;->a(Lzx/g;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/b;

    if-eqz v0, :cond_1

    iget v0, v0, Ly00/b;->x:I

    return v0

    :cond_1
    const/16 v0, 0x10

    return v0
.end method

.method public final getPossibleCardBrands$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly00/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->h0:Ljava/util/List;

    return-object v0
.end method

.method public final getPossibleCardBrandsCallback$payments_core_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->i0:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getValidatedCardNumber$payments_core_release()Lzx/h;
    .locals 4

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getUnvalidatedCardNumber()Lzx/g;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    iget-object v2, v0, Lzx/g;->d:Ljava/lang/String;

    const/16 v3, 0xe

    if-lt v1, v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v1, :cond_0

    iget-boolean v0, v0, Lzx/g;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, Lzx/h;

    invoke-direct {v0, v2}, Lzx/h;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewModelStoreOwner$payments_core_release()Landroidx/lifecycle/f2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->c0:Landroidx/lifecycle/f2;

    return-object v0
.end method

.method public final getWorkContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->V:Lq83/j;

    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Lcom/google/android/material/textfield/TextInputEditText;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->V:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Lkd/f;

    const/16 v2, 0x1d

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->o0:Lbc3/c2;

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->c0:Landroidx/lifecycle/f2;

    new-instance v1, Lr12/a;

    const/16 v2, 0x10

    invoke-direct {v1, p0, v2}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v0, v1}, Ls40/e0;->d(Landroid/view/View;Landroidx/lifecycle/f2;Lc93/m;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->o0:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Lcom/stripe/android/view/CardNumberEditText;->o0:Lbc3/c2;

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->m0:Lzx/s;

    iget-object v2, v0, Lzx/s;->o:Lbc3/k1;

    if-eqz v2, :cond_1

    invoke-interface {v2, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iput-object v1, v0, Lzx/s;->o:Lbc3/k1;

    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatEditText;->onDetachedFromWindow()V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    instance-of v0, p1, Ls40/v;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ls40/v;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-boolean v1, v0, Ls40/v;->x:Z

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-boolean v1, p0, Lcom/stripe/android/view/CardNumberEditText;->l0:Z

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object p1, v0

    :cond_3
    :goto_2
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeEditText;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    invoke-super {p0}, Lcom/stripe/android/view/StripeEditText;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Ls40/v;

    iget-boolean v2, p0, Lcom/stripe/android/view/CardNumberEditText;->l0:Z

    invoke-direct {v1, v0, v2}, Ls40/v;-><init>(Landroid/os/Parcelable;Z)V

    return-object v1
.end method

.method public final setBrandChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->e0:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->d0:Ly00/i;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final setCardBrand$payments_core_release(Ly00/i;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->d0:Ly00/i;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->d0:Ly00/i;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->e0:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lcom/stripe/android/view/CardNumberEditText;->f(Lcom/stripe/android/view/CardNumberEditText;)V

    :cond_0
    return-void
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

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->j0:Lc93/a;

    return-void
.end method

.method public final setImplicitCardBrandChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->g0:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->f0:Ly00/i;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final setImplicitCardBrandForCbc$payments_core_release(Ly00/i;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->f0:Ly00/i;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->f0:Ly00/i;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->g0:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lcom/stripe/android/view/CardNumberEditText;->f(Lcom/stripe/android/view/CardNumberEditText;)V

    :cond_0
    return-void
.end method

.method public final setLoadingCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V
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

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->n0:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setPossibleCardBrands$payments_core_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ly00/i;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->h0:Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->h0:Ljava/util/List;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->i0:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lcom/stripe/android/view/CardNumberEditText;->f(Lcom/stripe/android/view/CardNumberEditText;)V

    :cond_0
    return-void
.end method

.method public final setPossibleCardBrandsCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->i0:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->h0:Ljava/util/List;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final setViewModelStoreOwner$payments_core_release(Landroidx/lifecycle/f2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->c0:Landroidx/lifecycle/f2;

    return-void
.end method

.method public final setWorkContext(Lq83/j;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->V:Lq83/j;

    return-void
.end method
