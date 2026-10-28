.class public final Lcom/stripe/android/view/ShippingInfoWidget;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000fJ\u001b\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR6\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R6\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0012\u001a\u0004\u0008\u0019\u0010\u0014\"\u0004\u0008\u001a\u0010\u0016R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/view/ShippingInfoWidget;",
        "Landroid/widget/LinearLayout;",
        "",
        "",
        "allowedCountryCodes",
        "Ll83/a0;",
        "setAllowedCountryCodes",
        "(Ljava/util/Set;)V",
        "Liz/b;",
        "w",
        "Ll83/h;",
        "getViewBinding",
        "()Liz/b;",
        "viewBinding",
        "",
        "Ls40/x0;",
        "value",
        "y",
        "Ljava/util/List;",
        "getOptionalFields",
        "()Ljava/util/List;",
        "setOptionalFields",
        "(Ljava/util/List;)V",
        "optionalFields",
        "z",
        "getHiddenFields",
        "setHiddenFields",
        "hiddenFields",
        "Ly00/i6;",
        "getShippingInformation",
        "()Ly00/i6;",
        "shippingInformation",
        "getRawShippingInformation",
        "rawShippingInformation",
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
.field public static final synthetic T:I


# instance fields
.field public final E:Lcom/stripe/android/view/CountryTextInputLayout;

.field public final F:Lcom/google/android/material/textfield/TextInputLayout;

.field public final G:Lcom/google/android/material/textfield/TextInputLayout;

.field public final H:Lcom/google/android/material/textfield/TextInputLayout;

.field public final I:Lcom/google/android/material/textfield/TextInputLayout;

.field public final J:Lcom/google/android/material/textfield/TextInputLayout;

.field public final K:Lcom/google/android/material/textfield/TextInputLayout;

.field public final L:Lcom/google/android/material/textfield/TextInputLayout;

.field public final M:Lcom/stripe/android/view/StripeEditText;

.field public final N:Lcom/stripe/android/view/StripeEditText;

.field public final O:Lcom/stripe/android/view/StripeEditText;

.field public final P:Lcom/stripe/android/view/StripeEditText;

.field public final Q:Lcom/stripe/android/view/StripeEditText;

.field public final R:Lcom/stripe/android/view/StripeEditText;

.field public final S:Lcom/stripe/android/view/StripeEditText;

.field public final w:Ll83/p;

.field public final x:Ls40/w0;

.field public y:Ljava/util/List;

.field public z:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 23

    move-object/from16 v2, p0

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    move-object/from16 v3, p2

    invoke-direct {v2, v0, v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v1, Lqt2/e;

    const/16 v3, 0x1d

    invoke-direct {v1, v3, v0, v2}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, v2, Lcom/stripe/android/view/ShippingInfoWidget;->w:Ll83/p;

    new-instance v0, Ls40/w0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, v2, Lcom/stripe/android/view/ShippingInfoWidget;->x:Ls40/w0;

    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, v2, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    iput-object v0, v2, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v8, v0, Liz/b;->b:Lcom/stripe/android/view/CountryTextInputLayout;

    iput-object v8, v2, Lcom/stripe/android/view/ShippingInfoWidget;->E:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v9, v0, Liz/b;->j:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v9, v2, Lcom/stripe/android/view/ShippingInfoWidget;->F:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v0, v0, Liz/b;->k:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v0, v2, Lcom/stripe/android/view/ShippingInfoWidget;->G:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v10, v0, Liz/b;->l:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v10, v2, Lcom/stripe/android/view/ShippingInfoWidget;->H:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v11, v0, Liz/b;->m:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v11, v2, Lcom/stripe/android/view/ShippingInfoWidget;->I:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v12, v0, Liz/b;->o:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v12, v2, Lcom/stripe/android/view/ShippingInfoWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v13, v0, Liz/b;->p:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v13, v2, Lcom/stripe/android/view/ShippingInfoWidget;->K:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v14, v0, Liz/b;->n:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v14, v2, Lcom/stripe/android/view/ShippingInfoWidget;->L:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v15, v0, Liz/b;->c:Lcom/stripe/android/view/StripeEditText;

    iput-object v15, v2, Lcom/stripe/android/view/ShippingInfoWidget;->M:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v0, v0, Liz/b;->d:Lcom/stripe/android/view/StripeEditText;

    iput-object v0, v2, Lcom/stripe/android/view/ShippingInfoWidget;->N:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v0

    iget-object v0, v0, Liz/b;->e:Lcom/stripe/android/view/StripeEditText;

    iput-object v0, v2, Lcom/stripe/android/view/ShippingInfoWidget;->O:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v1

    iget-object v1, v1, Liz/b;->f:Lcom/stripe/android/view/StripeEditText;

    iput-object v1, v2, Lcom/stripe/android/view/ShippingInfoWidget;->P:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v3

    iget-object v3, v3, Liz/b;->h:Lcom/stripe/android/view/StripeEditText;

    iput-object v3, v2, Lcom/stripe/android/view/ShippingInfoWidget;->Q:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v4

    iget-object v4, v4, Liz/b;->i:Lcom/stripe/android/view/StripeEditText;

    iput-object v4, v2, Lcom/stripe/android/view/ShippingInfoWidget;->R:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->getViewBinding()Liz/b;

    move-result-object v5

    iget-object v5, v5, Liz/b;->g:Lcom/stripe/android/view/StripeEditText;

    iput-object v5, v2, Lcom/stripe/android/view/ShippingInfoWidget;->S:Lcom/stripe/android/view/StripeEditText;

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const-string v6, "name"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    const-string v6, "postalAddress"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    const-string v6, "postalCode"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    const-string v6, "phone"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    move-object v6, v0

    new-instance v0, Lq00/h0;

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/16 v7, 0x8

    move-object/from16 v17, v1

    const/4 v1, 0x1

    move-object/from16 v18, v3

    const-class v3, Lcom/stripe/android/view/ShippingInfoWidget;

    move-object/from16 v19, v4

    const-string v4, "updateConfigForCountry"

    move-object/from16 v20, v5

    const-string v5, "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V"

    move-object/from16 p1, v14

    move-object/from16 v14, v16

    move-object/from16 v21, v18

    move-object/from16 v22, v19

    move-object/from16 v16, v13

    move-object/from16 v13, v17

    move-object/from16 v17, v12

    move-object/from16 v12, v20

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v8, v0}, Lcom/stripe/android/view/CountryTextInputLayout;->setCountryChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Landroid/telephony/PhoneNumberFormattingTextWatcher;

    invoke-direct {v0}, Landroid/telephony/PhoneNumberFormattingTextWatcher;-><init>()V

    invoke-virtual {v12, v0}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance v0, Ls40/k0;

    invoke-direct {v0, v9}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {v15, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    new-instance v0, Ls40/k0;

    invoke-direct {v0, v10}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {v14, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    new-instance v0, Ls40/k0;

    invoke-direct {v0, v11}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {v13, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    new-instance v0, Ls40/k0;

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    new-instance v0, Ls40/k0;

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    new-instance v0, Ls40/k0;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {v12, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140fa5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f6a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f9e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f9f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/ShippingInfoWidget;->b()V

    invoke-virtual {v8}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountry$payments_core_release()Lcom/stripe/android/core/model/Country;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v2, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->c(Lcom/stripe/android/core/model/Country;)V

    :cond_0
    return-void
.end method

.method private final getRawShippingInformation()Ly00/i6;
    .locals 9

    new-instance v0, Ly00/i6;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->O:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v3

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->E:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v1}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountry$payments_core_release()Lcom/stripe/android/core/model/Country;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v2

    :cond_1
    move-object v4, v2

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->M:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->N:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->Q:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->R:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v8

    new-instance v2, Ly00/c;

    invoke-direct/range {v2 .. v8}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->P:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/stripe/android/view/ShippingInfoWidget;->S:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v3}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, Ly00/i6;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getViewBinding()Liz/b;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liz/b;

    return-object v0
.end method


# virtual methods
.method public final a(Ls40/x0;)Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b()V
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f80

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->I:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v0, Ls40/x0;->y:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f140f79

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f140f78

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lcom/stripe/android/view/ShippingInfoWidget;->H:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v1, Ls40/x0;->F:Ls40/x0;

    iget-object v3, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f140f8c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f140f8b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    iget-object v4, p0, Lcom/stripe/android/view/ShippingInfoWidget;->L:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v3, Ls40/x0;->w:Ls40/x0;

    iget-object v5, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    const/16 v5, 0x8

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/stripe/android/view/ShippingInfoWidget;->F:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    sget-object v3, Ls40/x0;->x:Ls40/x0;

    iget-object v6, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/stripe/android/view/ShippingInfoWidget;->G:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    sget-object v3, Ls40/x0;->E:Ls40/x0;

    iget-object v6, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/stripe/android/view/ShippingInfoWidget;->K:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    iget-object v3, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    sget-object v0, Ls40/x0;->z:Ls40/x0;

    iget-object v2, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    return-void
.end method

.method public final c(Lcom/stripe/android/core/model/Country;)V
    .locals 14

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x7f140f74

    const v3, 0x7f140f6d

    const v4, 0x7f140f72

    iget-object v5, p0, Lcom/stripe/android/view/ShippingInfoWidget;->R:Lcom/stripe/android/view/StripeEditText;

    iget-object v6, p0, Lcom/stripe/android/view/ShippingInfoWidget;->K:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v7, p0, Lcom/stripe/android/view/ShippingInfoWidget;->G:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v8, p0, Lcom/stripe/android/view/ShippingInfoWidget;->F:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v9, p0, Lcom/stripe/android/view/ShippingInfoWidget;->Q:Lcom/stripe/android/view/StripeEditText;

    iget-object v10, p0, Lcom/stripe/android/view/ShippingInfoWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v1, :cond_3

    sget-object v0, Ls40/x0;->w:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v8, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v0, Ls40/x0;->z:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f9b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f9a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v10, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v0, Ls40/x0;->E:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f97

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f96

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v6, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140fa9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140fa7

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_3
    sget-object v1, Ljava/util/Locale;->UK:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v11, 0x7f140f71

    const v12, 0x7f140f6e

    const v13, 0x7f140f6f

    if-eqz v1, :cond_7

    sget-object v0, Ls40/x0;->w:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v8, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v0, Ls40/x0;->z:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f91

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f90

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v10, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v0, Ls40/x0;->E:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f7d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f7c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {v6, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140fa2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f6c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_7
    sget-object v1, Ljava/util/Locale;->CANADA:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Ls40/x0;->w:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-virtual {v8, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v0, Ls40/x0;->z:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f8f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f8e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_7
    invoke-virtual {v10, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v0, Ls40/x0;->E:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f93

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_8

    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f92

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_8
    invoke-virtual {v6, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140fa1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140fa3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_b
    sget-object v0, Ls40/x0;->w:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_c
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_9
    invoke-virtual {v8, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v0, Ls40/x0;->z:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f9d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_a

    :cond_d
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f9c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_a
    invoke-virtual {v10, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    sget-object v0, Ls40/x0;->E:Ls40/x0;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f95

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_b

    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140f94

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_b
    invoke-virtual {v6, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140faa

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f140fa4

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    :goto_c
    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->CANADA:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$AllCaps;

    invoke-direct {v2}, Landroid/text/InputFilter$AllCaps;-><init>()V

    aput-object v2, v0, v1

    goto :goto_d

    :cond_f
    new-array v0, v1, [Landroid/text/InputFilter;

    :goto_d
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    sget-object v0, Lvy/a;->a:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvy/a;->b:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    sget-object p1, Ls40/x0;->z:Ls40/x0;

    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_e

    :cond_10
    const/16 v1, 0x8

    :goto_e
    invoke-virtual {v10, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final getHiddenFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls40/x0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    return-object v0
.end method

.method public final getOptionalFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls40/x0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    return-object v0
.end method

.method public final getShippingInformation()Ly00/i6;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/view/ShippingInfoWidget;->M:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, v0, Lcom/stripe/android/view/ShippingInfoWidget;->P:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v4}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    iget-object v6, v0, Lcom/stripe/android/view/ShippingInfoWidget;->O:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v6}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    goto :goto_0

    :cond_2
    iget-object v8, v0, Lcom/stripe/android/view/ShippingInfoWidget;->R:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v8}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_3

    goto :goto_0

    :cond_3
    iget-object v10, v0, Lcom/stripe/android/view/ShippingInfoWidget;->Q:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v10}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v11

    if-eqz v11, :cond_5

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_4

    goto :goto_0

    :cond_4
    iget-object v12, v0, Lcom/stripe/android/view/ShippingInfoWidget;->S:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v12}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v13

    if-eqz v13, :cond_5

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_6

    :cond_5
    :goto_0
    const/16 v16, 0x0

    goto/16 :goto_9

    :cond_6
    iget-object v14, v0, Lcom/stripe/android/view/ShippingInfoWidget;->E:Lcom/stripe/android/view/CountryTextInputLayout;

    iget-object v15, v14, Lcom/stripe/android/view/CountryTextInputLayout;->f1:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v15}, Landroid/widget/AutoCompleteTextView;->performValidation()V

    invoke-virtual {v14}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountry$payments_core_release()Lcom/stripe/android/core/model/Country;

    move-result-object v14

    if-eqz v14, :cond_7

    invoke-virtual {v14}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v15

    if-eqz v15, :cond_7

    invoke-virtual {v15}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v15

    :goto_1
    const/16 v16, 0x0

    goto :goto_2

    :cond_7
    const/4 v15, 0x0

    goto :goto_1

    :goto_2
    iget-object v3, v0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    move-object/from16 v17, v2

    iget-object v2, v0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    move-object/from16 v18, v5

    iget-object v5, v0, Lcom/stripe/android/view/ShippingInfoWidget;->x:Ls40/w0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "optionalShippingInfoFields"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "hiddenShippingInfoFields"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v19, 0x0

    if-nez v15, :cond_9

    :cond_8
    move/from16 v2, v19

    goto :goto_4

    :cond_9
    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v20

    if-eqz v20, :cond_b

    sget-object v5, Ls40/x0;->z:Ls40/x0;

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    :cond_a
    :goto_3
    const/4 v2, 0x1

    goto :goto_4

    :cond_b
    sget-object v2, Ls40/w0;->a:Ljava/util/Map;

    invoke-interface {v2, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/regex/Pattern;

    if-eqz v2, :cond_c

    invoke-virtual {v2, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    goto :goto_4

    :cond_c
    sget-object v2, Lvy/a;->b:Ljava/util/Set;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v15, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "toUpperCase(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_3

    :goto_4
    xor-int/lit8 v3, v2, 0x1

    invoke-virtual {v10, v3}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-static/range {v17 .. v17}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_d

    sget-object v3, Ls40/x0;->w:Ls40/x0;

    invoke-virtual {v0, v3}, Lcom/stripe/android/view/ShippingInfoWidget;->a(Ls40/x0;)Z

    move-result v3

    if-eqz v3, :cond_d

    const/4 v3, 0x1

    goto :goto_5

    :cond_d
    move/from16 v3, v19

    :goto_5
    invoke-virtual {v1, v3}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v1, Ls40/x0;->y:Ls40/x0;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ShippingInfoWidget;->a(Ls40/x0;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x1

    goto :goto_6

    :cond_e
    move/from16 v1, v19

    :goto_6
    invoke-virtual {v6, v1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-static/range {v18 .. v18}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    invoke-virtual {v4, v5}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-static {v9}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v4, Ls40/x0;->E:Ls40/x0;

    invoke-virtual {v0, v4}, Lcom/stripe/android/view/ShippingInfoWidget;->a(Ls40/x0;)Z

    move-result v4

    if-eqz v4, :cond_f

    const/4 v4, 0x1

    goto :goto_7

    :cond_f
    move/from16 v4, v19

    :goto_7
    invoke-virtual {v8, v4}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-static {v13}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_10

    sget-object v6, Ls40/x0;->F:Ls40/x0;

    invoke-virtual {v0, v6}, Lcom/stripe/android/view/ShippingInfoWidget;->a(Ls40/x0;)Z

    move-result v6

    if-eqz v6, :cond_10

    const/4 v6, 0x1

    goto :goto_8

    :cond_10
    move/from16 v6, v19

    :goto_8
    invoke-virtual {v12, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    if-eqz v2, :cond_11

    if-nez v3, :cond_11

    if-nez v1, :cond_11

    if-nez v4, :cond_11

    if-nez v5, :cond_11

    if-nez v6, :cond_11

    if-eqz v14, :cond_11

    invoke-direct {v0}, Lcom/stripe/android/view/ShippingInfoWidget;->getRawShippingInformation()Ly00/i6;

    move-result-object v1

    return-object v1

    :cond_11
    :goto_9
    return-object v16
.end method

.method public final setAllowedCountryCodes(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "allowedCountryCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->E:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->setAllowedCountryCodes$payments_core_release(Ljava/util/Set;)V

    return-void
.end method

.method public final setHiddenFields(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ls40/x0;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->z:Ljava/util/List;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->b()V

    iget-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->E:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {p1}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountry$payments_core_release()Lcom/stripe/android/core/model/Country;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/ShippingInfoWidget;->c(Lcom/stripe/android/core/model/Country;)V

    :cond_0
    return-void
.end method

.method public final setOptionalFields(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ls40/x0;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->y:Ljava/util/List;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->b()V

    iget-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->E:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {p1}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountry$payments_core_release()Lcom/stripe/android/core/model/Country;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/ShippingInfoWidget;->c(Lcom/stripe/android/core/model/Country;)V

    :cond_0
    return-void
.end method
