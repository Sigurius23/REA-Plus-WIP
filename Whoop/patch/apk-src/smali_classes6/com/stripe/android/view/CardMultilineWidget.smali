.class public final Lcom/stripe/android/view/CardMultilineWidget;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008*\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000bJ\u001b\u0010\u0012\u001a\u00020\u00052\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00052\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00052\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0007\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00052\u0008\u0010!\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0019\u0010#\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007\u00a2\u0006\u0004\u0008#\u0010\u0007J\u0015\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'J\u0019\u0010)\u001a\u00020\u00052\u0008\u0010(\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0004\u0008)\u0010\u001eJ\u0019\u0010+\u001a\u00020\u00052\u0008\u0010*\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0004\u0008+\u0010\u001eJ\u0019\u0010.\u001a\u00020\u00052\u0008\u0010-\u001a\u0004\u0018\u00010,H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u0019\u00101\u001a\u00020\u00052\u0008\u00100\u001a\u0004\u0018\u00010,H\u0016\u00a2\u0006\u0004\u00081\u0010/J\u0019\u00103\u001a\u00020\u00052\u0008\u00102\u001a\u0004\u0018\u00010,H\u0016\u00a2\u0006\u0004\u00083\u0010/J\u0019\u00105\u001a\u00020\u00052\u0008\u00104\u001a\u0004\u0018\u00010,H\u0016\u00a2\u0006\u0004\u00085\u0010/J\u0017\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020$H\u0016\u00a2\u0006\u0004\u00087\u0010\'R\u001a\u0010=\u001a\u0002088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R\u001a\u0010C\u001a\u00020>8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010BR\u001a\u0010I\u001a\u00020D8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010HR\u001a\u0010O\u001a\u00020J8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010NR\u001a\u0010U\u001a\u00020P8\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008Q\u0010R\u001a\u0004\u0008S\u0010TR\u001a\u0010Z\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u001a\u0004\u0008X\u0010YR\u001a\u0010`\u001a\u00020[8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\\\u0010]\u001a\u0004\u0008^\u0010_R\u001a\u0010f\u001a\u00020a8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010eR\u001a\u0010i\u001a\u00020a8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008g\u0010c\u001a\u0004\u0008h\u0010eR\u001a\u0010l\u001a\u00020a8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008j\u0010c\u001a\u0004\u0008k\u0010eR\"\u0010r\u001a\u00020$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008m\u0010n\u001a\u0004\u0008o\u0010p\"\u0004\u0008q\u0010\'R+\u0010x\u001a\u00020$2\u0006\u0010s\u001a\u00020$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008t\u0010u\u001a\u0004\u0008v\u0010p\"\u0004\u0008w\u0010\'R%\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008z\u0010{\u001a\u0004\u0008|\u0010}\"\u0004\u0008~\u0010\u007fR5\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001\"\u0005\u0008\u0086\u0001\u0010\u001eR7\u0010\u008d\u0001\u001a\u00020$2\u0007\u0010\u0081\u0001\u001a\u00020$8\u0000@@X\u0081\u000e\u00a2\u0006\u001d\n\u0005\u0008\u0088\u0001\u0010n\u0012\u0006\u0008\u008b\u0001\u0010\u008c\u0001\u001a\u0005\u0008\u0089\u0001\u0010p\"\u0005\u0008\u008a\u0001\u0010\'R4\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00032\u0008\u0010s\u001a\u0004\u0018\u00010\u00038@@@X\u0080\u008e\u0002\u00a2\u0006\u0016\n\u0005\u0008\u008e\u0001\u0010u\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001\"\u0005\u0008\u0091\u0001\u0010\u0007R0\u0010\u0097\u0001\u001a\u00020\u00082\u0006\u0010s\u001a\u00020\u00088@@@X\u0080\u008e\u0002\u00a2\u0006\u0016\n\u0005\u0008\u0093\u0001\u0010u\u001a\u0006\u0008\u0094\u0001\u0010\u0095\u0001\"\u0005\u0008\u0096\u0001\u0010\u000bR0\u0010\u009b\u0001\u001a\u00020\u00082\u0006\u0010s\u001a\u00020\u00088@@@X\u0080\u008e\u0002\u00a2\u0006\u0016\n\u0005\u0008\u0098\u0001\u0010u\u001a\u0006\u0008\u0099\u0001\u0010\u0095\u0001\"\u0005\u0008\u009a\u0001\u0010\u000bR0\u0010\u009f\u0001\u001a\u00020\u00082\u0006\u0010s\u001a\u00020\u00088@@@X\u0080\u008e\u0002\u00a2\u0006\u0016\n\u0005\u0008\u009c\u0001\u0010u\u001a\u0006\u0008\u009d\u0001\u0010\u0095\u0001\"\u0005\u0008\u009e\u0001\u0010\u000bR4\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u00082\u0008\u0010s\u001a\u0004\u0018\u00010\u00088@@@X\u0080\u008e\u0002\u00a2\u0006\u0016\n\u0005\u0008\u00a0\u0001\u0010u\u001a\u0006\u0008\u00a1\u0001\u0010\u0095\u0001\"\u0005\u0008\u00a2\u0001\u0010\u000bR\u001f\u0010\u00a8\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a5\u00010\u00a4\u00018@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R\u0014\u0010\u00ab\u0001\u001a\u00020\u00108F\u00a2\u0006\u0008\u001a\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001R\"\u0010\u00b0\u0001\u001a\u0005\u0018\u00010\u00ac\u00018VX\u0097\u0004\u00a2\u0006\u0010\u0012\u0006\u0008\u00af\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001R\u001a\u0010\u00b4\u0001\u001a\u0005\u0018\u00010\u00b1\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001R\u001a\u0010\u00b8\u0001\u001a\u0005\u0018\u00010\u00b5\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R\u0017\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00b9\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001R\u0017\u0010\u00c0\u0001\u001a\u0005\u0018\u00010\u00bd\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00be\u0001\u0010\u00bf\u0001R\u001a\u0010\u00c4\u0001\u001a\u0005\u0018\u00010\u00c1\u00018@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001R\u001a\u0010\u00c8\u0001\u001a\u0005\u0018\u00010\u00c5\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001R\u001f\u0010\u00cd\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ca\u00010\u00c9\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001\u00a8\u0006\u00ce\u0001"
    }
    d2 = {
        "Lcom/stripe/android/view/CardMultilineWidget;",
        "Landroid/widget/LinearLayout;",
        "",
        "",
        "resId",
        "Ll83/a0;",
        "setExpirationDatePlaceholderRes",
        "(Ljava/lang/Integer;)V",
        "Ls40/f1;",
        "listener",
        "setCardNumberErrorListener",
        "(Ls40/f1;)V",
        "setExpirationDateErrorListener",
        "setCvcErrorListener",
        "setPostalCodeErrorListener",
        "",
        "Ly00/i;",
        "preferredNetworks",
        "setPreferredNetworks",
        "(Ljava/util/List;)V",
        "Ls40/l;",
        "setCardInputListener",
        "(Ls40/l;)V",
        "Ls40/y;",
        "callback",
        "setCardValidCallback",
        "(Ls40/y;)V",
        "",
        "cardHint",
        "setCardHint",
        "(Ljava/lang/String;)V",
        "cvcPlaceholderText",
        "setCvcPlaceholderText",
        "cvcLabel",
        "setCvcLabel",
        "setCvcIcon",
        "",
        "shouldShowPostalCode",
        "setShouldShowPostalCode",
        "(Z)V",
        "cardNumber",
        "setCardNumber",
        "cvcCode",
        "setCvcCode",
        "Landroid/text/TextWatcher;",
        "cardNumberTextWatcher",
        "setCardNumberTextWatcher",
        "(Landroid/text/TextWatcher;)V",
        "expiryDateTextWatcher",
        "setExpiryDateTextWatcher",
        "cvcNumberTextWatcher",
        "setCvcNumberTextWatcher",
        "postalCodeTextWatcher",
        "setPostalCodeTextWatcher",
        "enabled",
        "setEnabled",
        "Lcom/stripe/android/view/CardNumberEditText;",
        "x",
        "Lcom/stripe/android/view/CardNumberEditText;",
        "getCardNumberEditText",
        "()Lcom/stripe/android/view/CardNumberEditText;",
        "cardNumberEditText",
        "Lcom/stripe/android/view/CardBrandView;",
        "y",
        "Lcom/stripe/android/view/CardBrandView;",
        "getCardBrandView$payments_core_release",
        "()Lcom/stripe/android/view/CardBrandView;",
        "cardBrandView",
        "Lcom/stripe/android/view/ExpiryDateEditText;",
        "z",
        "Lcom/stripe/android/view/ExpiryDateEditText;",
        "getExpiryDateEditText",
        "()Lcom/stripe/android/view/ExpiryDateEditText;",
        "expiryDateEditText",
        "Lcom/stripe/android/view/CvcEditText;",
        "E",
        "Lcom/stripe/android/view/CvcEditText;",
        "getCvcEditText",
        "()Lcom/stripe/android/view/CvcEditText;",
        "cvcEditText",
        "Lcom/stripe/android/view/PostalCodeEditText;",
        "F",
        "Lcom/stripe/android/view/PostalCodeEditText;",
        "getPostalCodeEditText$payments_core_release",
        "()Lcom/stripe/android/view/PostalCodeEditText;",
        "postalCodeEditText",
        "G",
        "Landroid/widget/LinearLayout;",
        "getSecondRowLayout",
        "()Landroid/widget/LinearLayout;",
        "secondRowLayout",
        "Lcom/stripe/android/view/CardNumberTextInputLayout;",
        "H",
        "Lcom/stripe/android/view/CardNumberTextInputLayout;",
        "getCardNumberTextInputLayout",
        "()Lcom/stripe/android/view/CardNumberTextInputLayout;",
        "cardNumberTextInputLayout",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "I",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "getExpiryTextInputLayout",
        "()Lcom/google/android/material/textfield/TextInputLayout;",
        "expiryTextInputLayout",
        "J",
        "getCvcInputLayout",
        "cvcInputLayout",
        "K",
        "getPostalInputLayout$payments_core_release",
        "postalInputLayout",
        "R",
        "Z",
        "getPostalCodeRequired",
        "()Z",
        "setPostalCodeRequired",
        "postalCodeRequired",
        "<set-?>",
        "S",
        "Lf93/d;",
        "getUsZipCodeRequired",
        "setUsZipCodeRequired",
        "usZipCodeRequired",
        "Landroidx/lifecycle/f2;",
        "T",
        "Landroidx/lifecycle/f2;",
        "getViewModelStoreOwner$payments_core_release",
        "()Landroidx/lifecycle/f2;",
        "setViewModelStoreOwner$payments_core_release",
        "(Landroidx/lifecycle/f2;)V",
        "viewModelStoreOwner",
        "value",
        "U",
        "Ljava/lang/String;",
        "getOnBehalfOf",
        "()Ljava/lang/String;",
        "setOnBehalfOf",
        "onBehalfOf",
        "V",
        "getShouldShowErrorIcon$payments_core_release",
        "setShouldShowErrorIcon$payments_core_release",
        "getShouldShowErrorIcon$payments_core_release$annotations",
        "()V",
        "shouldShowErrorIcon",
        "W",
        "getExpirationDatePlaceholderRes$payments_core_release",
        "()Ljava/lang/Integer;",
        "setExpirationDatePlaceholderRes$payments_core_release",
        "expirationDatePlaceholderRes",
        "b0",
        "getCardNumberErrorListener$payments_core_release",
        "()Ls40/f1;",
        "setCardNumberErrorListener$payments_core_release",
        "cardNumberErrorListener",
        "c0",
        "getExpirationDateErrorListener$payments_core_release",
        "setExpirationDateErrorListener$payments_core_release",
        "expirationDateErrorListener",
        "d0",
        "getCvcErrorListener$payments_core_release",
        "setCvcErrorListener$payments_core_release",
        "cvcErrorListener",
        "e0",
        "getPostalCodeErrorListener$payments_core_release",
        "setPostalCodeErrorListener$payments_core_release",
        "postalCodeErrorListener",
        "",
        "Ls40/x;",
        "getInvalidFields$payments_core_release",
        "()Ljava/util/Set;",
        "invalidFields",
        "getBrand",
        "()Ly00/i;",
        "brand",
        "Ly00/m;",
        "getCardParams",
        "()Ly00/m;",
        "getCardParams$annotations",
        "cardParams",
        "Ly00/s4;",
        "getPaymentMethodCard",
        "()Ly00/s4;",
        "paymentMethodCard",
        "Ly00/d5;",
        "getPaymentMethodCreateParams",
        "()Ly00/d5;",
        "paymentMethodCreateParams",
        "Ly00/v3;",
        "getPaymentMethodBillingDetails",
        "()Ly00/v3;",
        "paymentMethodBillingDetails",
        "Ly00/u3;",
        "getPaymentMethodBillingDetailsBuilder",
        "()Ly00/u3;",
        "paymentMethodBillingDetailsBuilder",
        "Lzx/h;",
        "getValidatedCardNumber$payments_core_release",
        "()Lzx/h;",
        "validatedCardNumber",
        "Ly00/e2;",
        "getExpirationDate",
        "()Ly00/e2;",
        "expirationDate",
        "",
        "Lcom/stripe/android/view/StripeEditText;",
        "getAllFields",
        "()Ljava/util/Collection;",
        "allFields",
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
.field public static final synthetic f0:[Lj93/z;


# instance fields
.field public final E:Lcom/stripe/android/view/CvcEditText;

.field public final F:Lcom/stripe/android/view/PostalCodeEditText;

.field public final G:Landroid/widget/LinearLayout;

.field public final H:Lcom/stripe/android/view/CardNumberTextInputLayout;

.field public final I:Lcom/google/android/material/textfield/TextInputLayout;

.field public final J:Lcom/google/android/material/textfield/TextInputLayout;

.field public final K:Lcom/google/android/material/textfield/TextInputLayout;

.field public final L:Ls40/m0;

.field public final M:Ljava/util/List;

.field public final N:Ls40/s;

.field public O:Z

.field public P:Ljava/lang/String;

.field public Q:Ljava/lang/String;

.field public R:Z

.field public final S:Ls40/t;

.field public T:Landroidx/lifecycle/f2;

.field public U:Ljava/lang/String;

.field public V:Z

.field public final W:Ls40/t;

.field public a0:Z

.field public final b0:Ls40/t;

.field public final c0:Ls40/t;

.field public final d0:Ls40/t;

.field public final e0:Ls40/t;

.field public w:Z

.field public final x:Lcom/stripe/android/view/CardNumberEditText;

.field public final y:Lcom/stripe/android/view/CardBrandView;

.field public final z:Lcom/stripe/android/view/ExpiryDateEditText;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/stripe/android/view/CardMultilineWidget;

    const-string v2, "usZipCodeRequired"

    const-string v3, "getUsZipCodeRequired()Z"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const-string v3, "expirationDatePlaceholderRes"

    const-string v5, "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;"

    invoke-static {v1, v3, v5, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v3

    const-string v5, "cardNumberErrorListener"

    const-string v6, "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;"

    invoke-static {v1, v5, v6, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v5

    const-string v6, "expirationDateErrorListener"

    const-string v7, "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;"

    invoke-static {v1, v6, v7, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v6

    const-string v7, "cvcErrorListener"

    const-string v8, "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;"

    invoke-static {v1, v7, v8, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v7

    const-string v8, "postalCodeErrorListener"

    const-string v9, "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;"

    invoke-static {v1, v8, v9, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v1

    const/4 v2, 0x6

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v5, v2, v0

    const/4 v0, 0x3

    aput-object v6, v2, v0

    const/4 v0, 0x4

    aput-object v7, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 12

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v2, 0x7f0d0648

    invoke-virtual {p1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f0a0225

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/CardBrandView;

    if-eqz v2, :cond_3

    const p1, 0x7f0a022b

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    if-eqz v3, :cond_3

    const p1, 0x7f0a0442

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/view/CardNumberEditText;

    if-eqz v3, :cond_3

    const p1, 0x7f0a0444

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/view/CvcEditText;

    if-eqz v4, :cond_3

    const p1, 0x7f0a0445

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/view/ExpiryDateEditText;

    if-eqz v5, :cond_3

    const p1, 0x7f0a0448

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/view/PostalCodeEditText;

    if-eqz v6, :cond_3

    const p1, 0x7f0a0ae5

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    if-eqz v7, :cond_3

    const p1, 0x7f0a0c98

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/stripe/android/view/CardNumberTextInputLayout;

    if-eqz v8, :cond_3

    const p1, 0x7f0a0c9a

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v9, :cond_3

    const p1, 0x7f0a0c9b

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v10, :cond_3

    const p1, 0x7f0a0c9e

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v11, :cond_3

    iput-object v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    iput-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    iput-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    iput-object v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    iput-object v6, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    iput-object v7, p0, Lcom/stripe/android/view/CardMultilineWidget;->G:Landroid/widget/LinearLayout;

    iput-object v8, p0, Lcom/stripe/android/view/CardMultilineWidget;->H:Lcom/stripe/android/view/CardNumberTextInputLayout;

    iput-object v10, p0, Lcom/stripe/android/view/CardMultilineWidget;->I:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v9, p0, Lcom/stripe/android/view/CardMultilineWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v11, p0, Lcom/stripe/android/view/CardMultilineWidget;->K:Lcom/google/android/material/textfield/TextInputLayout;

    new-instance p1, Ls40/m0;

    invoke-direct {p1}, Ls40/m0;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->L:Ls40/m0;

    const/4 p1, 0x4

    new-array v2, p1, [Lcom/google/android/material/textfield/TextInputLayout;

    aput-object v8, v2, v0

    aput-object v10, v2, v1

    const/4 v3, 0x2

    aput-object v9, v2, v3

    const/4 v4, 0x3

    aput-object v11, v2, v4

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->M:Ljava/util/List;

    new-instance v5, Ls40/s;

    invoke-direct {v5, p0, v0}, Ls40/s;-><init>(Landroid/view/View;I)V

    iput-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->N:Ls40/s;

    new-instance v5, Ls40/t;

    invoke-direct {v5, v0, p0}, Ls40/t;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    iput-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->S:Ls40/t;

    new-instance v5, Ls40/t;

    invoke-direct {v5, v1, p0}, Ls40/t;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    iput-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->W:Ls40/t;

    new-instance v5, Ls40/k0;

    invoke-direct {v5, v8}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance v6, Ls40/t;

    invoke-direct {v6, v5, p0, v3}, Ls40/t;-><init>(Ls40/k0;Lcom/stripe/android/view/CardMultilineWidget;I)V

    iput-object v6, p0, Lcom/stripe/android/view/CardMultilineWidget;->b0:Ls40/t;

    new-instance v5, Ls40/k0;

    invoke-direct {v5, v10}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance v6, Ls40/t;

    invoke-direct {v6, v5, p0, v4}, Ls40/t;-><init>(Ls40/k0;Lcom/stripe/android/view/CardMultilineWidget;I)V

    iput-object v6, p0, Lcom/stripe/android/view/CardMultilineWidget;->c0:Ls40/t;

    new-instance v5, Ls40/k0;

    invoke-direct {v5, v9}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance v6, Ls40/t;

    invoke-direct {v6, v5, p0, p1}, Ls40/t;-><init>(Ls40/k0;Lcom/stripe/android/view/CardMultilineWidget;I)V

    iput-object v6, p0, Lcom/stripe/android/view/CardMultilineWidget;->d0:Ls40/t;

    new-instance p1, Ls40/k0;

    invoke-direct {p1, v11}, Ls40/k0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance v5, Ls40/t;

    const/4 v6, 0x5

    invoke-direct {v5, p1, p0, v6}, Ls40/t;-><init>(Ls40/k0;Lcom/stripe/android/view/CardMultilineWidget;I)V

    iput-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->e0:Ls40/t;

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/widget/TextView;->getHintTextColors()Landroid/content/res/ColorStateList;

    move-result-object v5

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v2, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "getContext(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lux/g0;->a:[I

    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    iget-boolean p2, p0, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    invoke-virtual {p1, v3, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    iget-boolean p2, p0, Lcom/stripe/android/view/CardMultilineWidget;->R:Z

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/stripe/android/view/CardMultilineWidget;->R:Z

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getUsZipCodeRequired()Z

    move-result p2

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/stripe/android/view/CardMultilineWidget;->setUsZipCodeRequired(Z)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberErrorListener$payments_core_release()Ls40/f1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpirationDateErrorListener$payments_core_release()Ls40/f1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcErrorListener$payments_core_release()Ls40/f1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getPostalCodeErrorListener$payments_core_release()Ls40/f1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Ls40/f1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance p2, Ls40/o;

    invoke-direct {p2, v0, p0}, Ls40/o;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance p2, Ls40/o;

    invoke-direct {p2, v1, p0}, Ls40/o;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance p2, Ls40/o;

    invoke-direct {p2, v3, p0}, Ls40/o;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance p2, Ls40/o;

    invoke-direct {p2, v4, p0}, Ls40/o;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance p2, Lq30/u0;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p2, v2}, Lq30/u0;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Ls40/e1;)V

    iget-object p2, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    new-instance v2, Lq30/u0;

    invoke-direct {v2, p1}, Lq30/u0;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p2, v2}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Ls40/e1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v2, Lq30/u0;

    invoke-direct {v2, p2}, Lq30/u0;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p1, v2}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Ls40/e1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    new-instance p2, Ls40/m;

    invoke-direct {p2, v0, p0}, Ls40/m;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setCompletionCallback$payments_core_release(Lc93/a;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    new-instance p2, Ls40/p;

    invoke-direct {p2, v0, p0}, Ls40/p;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setBrandChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    new-instance p2, Ls40/p;

    invoke-direct {p2, v1, p0}, Ls40/p;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setImplicitCardBrandChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    new-instance p2, Ls40/p;

    invoke-direct {p2, v3, p0}, Ls40/p;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setPossibleCardBrandsCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance p2, Ls40/m;

    invoke-direct {p2, v1, p0}, Ls40/m;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/ExpiryDateEditText;->setCompletionCallback$payments_core_release(Lc93/a;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    new-instance p2, Ls40/q;

    invoke-direct {p2, v0, p0}, Ls40/q;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setAfterTextChangedListener(Ls40/d1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance p2, Ls40/q;

    invoke-direct {p2, v1, p0}, Ls40/q;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setAfterTextChangedListener(Ls40/d1;)V

    iget-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->a(Z)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->f(Lcom/stripe/android/view/CardNumberEditText;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->b()V

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getAllFields()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/view/StripeEditText;

    new-instance v0, Ls40/c;

    invoke-direct {v0, p0, v1}, Ls40/c;-><init>(Landroid/view/View;I)V

    invoke-virtual {p2, v0}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    new-instance p2, Ls40/p;

    invoke-direct {p2, v4, p0}, Ls40/p;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setLoadingCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    sget-object p2, Ls40/v0;->w:Ls40/v0;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Ls40/v0;)V

    iput-boolean v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->O:Z

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f070548

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iget-object p2, p0, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    new-instance v0, Ls40/r;

    invoke-direct {v0, p1, p0}, Ls40/r;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/NullPointerException;

    const-string v0, "Missing required view with ID: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final getAllFields()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/stripe/android/view/StripeEditText;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    aput-object v2, v0, v1

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public static synthetic getCardParams$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method private final getExpirationDate()Ly00/e2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Ly00/e2;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getShouldShowErrorIcon$payments_core_release$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 5

    if-eqz p1, :cond_0

    const v0, 0x7f141000

    goto :goto_0

    :cond_0
    const v0, 0x7f140f62

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->I:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_1

    const v0, 0x7f0a0448

    goto :goto_1

    :cond_1
    const/4 v0, -0x1

    :goto_1
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusForwardId(I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusDownId(I)V

    const/16 v0, 0x8

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    iget-object v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->K:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    if-ne v3, v0, :cond_3

    const/4 v0, 0x6

    goto :goto_3

    :cond_3
    const/4 v0, 0x5

    :goto_3
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_5

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v2, 0x7f070537

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    :cond_4
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()V
    .locals 5

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Ly00/i;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->P:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->Q:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/stripe/android/view/CvcEditText;->f(Ly00/i;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    iget-boolean v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->V:Z

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardBrandView;->setShouldShowErrorIcon(Z)V

    return-void
.end method

.method public final c()Z
    .locals 9

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpirationDate()Ly00/e2;

    move-result-object v3

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    iget-object v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v4}, Lcom/stripe/android/view/CvcEditText;->getCvc$payments_core_release()Lzx/l;

    move-result-object v5

    if-eqz v5, :cond_2

    move v5, v2

    goto :goto_2

    :cond_2
    move v5, v1

    :goto_2
    xor-int/lit8 v6, v0, 0x1

    iget-object v7, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v7, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    xor-int/lit8 v6, v3, 0x1

    iget-object v7, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v7, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    xor-int/lit8 v6, v5, 0x1

    invoke-virtual {v4, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-boolean v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->R:Z

    iget-object v6, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    if-nez v4, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getUsZipCodeRequired()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    invoke-virtual {v6}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_3

    :cond_4
    move v4, v1

    goto :goto_4

    :cond_5
    :goto_3
    move v4, v2

    :goto_4
    invoke-virtual {v6, v4}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getAllFields()Ljava/util/Collection;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v8}, Lcom/stripe/android/view/StripeEditText;->getShouldShowError()Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    check-cast v7, Lcom/stripe/android/view/StripeEditText;

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Landroid/view/View;->requestFocus()Z

    :cond_8
    if-eqz v0, :cond_9

    if-eqz v3, :cond_9

    if-eqz v5, :cond_9

    invoke-virtual {v6}, Lcom/stripe/android/view/StripeEditText;->getShouldShowError()Z

    move-result v0

    if-nez v0, :cond_9

    return v2

    :cond_9
    return v1
.end method

.method public final synthetic getBrand()Ly00/i;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Ly00/i;

    move-result-object v0

    return-object v0
.end method

.method public final getCardBrandView$payments_core_release()Lcom/stripe/android/view/CardBrandView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    return-object v0
.end method

.method public final getCardNumberEditText()Lcom/stripe/android/view/CardNumberEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    return-object v0
.end method

.method public final getCardNumberErrorListener$payments_core_release()Ls40/f1;
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->b0:Ls40/t;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls40/f1;

    return-object v0
.end method

.method public final getCardNumberTextInputLayout()Lcom/stripe/android/view/CardNumberTextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->H:Lcom/stripe/android/view/CardNumberTextInputLayout;

    return-object v0
.end method

.method public getCardParams()Ly00/m;
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->c()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    return-object v2

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    iget-object v1, v0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Ly00/e2;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v3, v0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v3}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v10, v3

    goto :goto_0

    :cond_1
    move-object v10, v2

    :goto_0
    iget-object v3, v0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v3}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v2

    :goto_1
    iget-boolean v4, v0, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    move-object v3, v2

    :goto_2
    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Ly00/i;

    move-result-object v5

    const-string v4, "CardMultilineView"

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v4

    if-eqz v4, :cond_4

    iget-object v4, v4, Lzx/h;->c:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object v4, v2

    :goto_3
    if-nez v4, :cond_5

    const-string v4, ""

    :cond_5
    move-object v7, v4

    iget v8, v1, Ly00/e2;->a:I

    iget v9, v1, Ly00/e2;->b:I

    if-eqz v3, :cond_7

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_4

    :cond_6
    move-object/from16 v16, v3

    goto :goto_5

    :cond_7
    :goto_4
    move-object/from16 v16, v2

    :goto_5
    new-instance v11, Ly00/c;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v17}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardBrandView;->b()Ly00/b3;

    move-result-object v12

    new-instance v4, Ly00/m;

    const/16 v13, 0x540

    invoke-direct/range {v4 .. v13}, Ly00/m;-><init>(Ly00/i;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ly00/c;Ly00/b3;I)V

    return-object v4

    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final getCvcEditText()Lcom/stripe/android/view/CvcEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    return-object v0
.end method

.method public final getCvcErrorListener$payments_core_release()Ls40/f1;
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->d0:Ls40/t;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls40/f1;

    return-object v0
.end method

.method public final getCvcInputLayout()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getExpirationDateErrorListener$payments_core_release()Ls40/f1;
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->c0:Ls40/t;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls40/f1;

    return-object v0
.end method

.method public final getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->W:Ls40/t;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    return-object v0
.end method

.method public final getExpiryTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->I:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getInvalidFields$payments_core_release()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ls40/x;",
            ">;"
        }
    .end annotation

    sget-object v0, Ls40/x;->w:Ls40/x;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    sget-object v1, Ls40/x;->x:Ls40/x;

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpirationDate()Ly00/e2;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    sget-object v3, Ls40/x;->y:Ls40/x;

    iget-object v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v4}, Lcom/stripe/android/view/CvcEditText;->getCvc$payments_core_release()Lzx/l;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    sget-object v4, Ls40/x;->z:Ls40/x;

    iget-boolean v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->R:Z

    if-nez v5, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getUsZipCodeRequired()Z

    move-result v5

    if-eqz v5, :cond_5

    :cond_3
    iget-boolean v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v5}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    :cond_4
    move-object v2, v4

    :cond_5
    filled-new-array {v0, v1, v3, v2}, [Ls40/x;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getOnBehalfOf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->U:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethodBillingDetails()Ly00/v3;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getPaymentMethodBillingDetailsBuilder()Ly00/u3;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly00/u3;->a()Ly00/v3;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPaymentMethodBillingDetailsBuilder()Ly00/u3;
    .locals 9

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ly00/u3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v7

    new-instance v2, Ly00/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, v0, Ly00/u3;->a:Ly00/c;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPaymentMethodCard()Ly00/s4;
    .locals 12

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Ly00/e2;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto :goto_0

    :cond_1
    move-object v7, v1

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, v2, Lzx/h;->c:Ljava/lang/String;

    :cond_2
    if-nez v1, :cond_3

    const-string v1, ""

    :cond_3
    move-object v4, v1

    iget v1, v0, Ly00/e2;->a:I

    iget v0, v0, Ly00/e2;->b:I

    const-string v2, "CardMultilineView"

    invoke-static {v2}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardBrandView;->d()Ly00/r4;

    move-result-object v10

    new-instance v3, Ly00/s4;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x0

    const/16 v11, 0x10

    invoke-direct/range {v3 .. v11}, Ly00/s4;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ly00/r4;I)V

    return-object v3

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getPaymentMethodCreateParams()Ly00/d5;
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getPaymentMethodCard()Ly00/s4;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getPaymentMethodBillingDetails()Ly00/v3;

    move-result-object v1

    const/16 v2, 0xc

    invoke-static {v0, v1, v2}, Lt9/p;->h(Ly00/s4;Ly00/v3;I)Ly00/d5;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    return-object v0
.end method

.method public final getPostalCodeErrorListener$payments_core_release()Ls40/f1;
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->e0:Ls40/t;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls40/f1;

    return-object v0
.end method

.method public final getPostalCodeRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->R:Z

    return v0
.end method

.method public final getPostalInputLayout$payments_core_release()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->K:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getSecondRowLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->G:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getShouldShowErrorIcon$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->V:Z

    return v0
.end method

.method public final getUsZipCodeRequired()Z
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->S:Ls40/t;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getValidatedCardNumber$payments_core_release()Lzx/h;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lzx/h;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelStoreOwner$payments_core_release()Landroidx/lifecycle/f2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->T:Landroidx/lifecycle/f2;

    return-object v0
.end method

.method public final isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->O:Z

    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->L:Ls40/m0;

    iget-object v2, v0, Ls40/m0;->w:Landroidx/lifecycle/i0;

    invoke-static {p0}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object v3

    if-nez v3, :cond_0

    iget-object v3, v0, Ls40/m0;->y:Lpb/e;

    invoke-virtual {v3, v1}, Lpb/e;->a(Landroid/os/Bundle;)V

    sget-object v1, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    invoke-static {v0}, Landroidx/lifecycle/o1;->f(Lpb/f;)V

    invoke-static {p0, v0}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    invoke-static {p0, v0}, Landroidx/lifecycle/o1;->o(Landroid/view/View;Landroidx/lifecycle/f2;)V

    invoke-static {p0, v0}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    sget-object v0, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->T:Landroidx/lifecycle/f2;

    new-instance v1, Lr12/a;

    const/16 v2, 0xf

    invoke-direct {v1, p0, v2}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v0, v1}, Ls40/e0;->d(Landroid/view/View;Landroidx/lifecycle/f2;Lc93/m;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->L:Ls40/m0;

    iget-object v1, v0, Ls40/m0;->w:Landroidx/lifecycle/i0;

    invoke-static {p0}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v2, Landroidx/lifecycle/v;->ON_PAUSE:Landroidx/lifecycle/v;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    sget-object v2, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    iget-object v0, v0, Ls40/m0;->x:Landroidx/lifecycle/e2;

    invoke-virtual {v0}, Landroidx/lifecycle/e2;->a()V

    :cond_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "state_on_behalf_of"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardMultilineWidget;->setOnBehalfOf(Ljava/lang/String;)V

    const-string v0, "state_remaining_state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "state_remaining_state"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->U:Ljava/lang/String;

    new-instance v2, Ll83/k;

    const-string v3, "state_on_behalf_of"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->b()V

    :cond_0
    return-void
.end method

.method public setCardHint(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cardHint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->H:Lcom/stripe/android/view/CardNumberTextInputLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCardInputListener(Ls40/l;)V
    .locals 0

    return-void
.end method

.method public setCardNumber(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setCardNumberErrorListener(Ls40/f1;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setCardNumberErrorListener$payments_core_release(Ls40/f1;)V

    return-void
.end method

.method public final setCardNumberErrorListener$payments_core_release(Ls40/f1;)V
    .locals 2

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->b0:Ls40/t;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public setCardNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setCardValidCallback(Ls40/y;)V
    .locals 3

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getAllFields()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->N:Ls40/s;

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getAllFields()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0, v2}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public setCvcCode(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setCvcErrorListener(Ls40/f1;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setCvcErrorListener$payments_core_release(Ls40/f1;)V

    return-void
.end method

.method public final setCvcErrorListener$payments_core_release(Ls40/f1;)V
    .locals 2

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->d0:Ls40/t;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setCvcIcon(Ljava/lang/Integer;)V
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v0, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->a0:Z

    return-void
.end method

.method public final setCvcLabel(Ljava/lang/String;)V
    .locals 4

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->P:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Ly00/i;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->P:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->Q:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v3, p1, v0, v1, v2}, Lcom/stripe/android/view/CvcEditText;->f(Ly00/i;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-void
.end method

.method public setCvcNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setCvcPlaceholderText(Ljava/lang/String;)V
    .locals 4

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->Q:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Ly00/i;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->P:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->Q:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v3, p1, v0, v1, v2}, Lcom/stripe/android/view/CvcEditText;->f(Ly00/i;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->M:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->O:Z

    return-void
.end method

.method public final setExpirationDateErrorListener(Ls40/f1;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setExpirationDateErrorListener$payments_core_release(Ls40/f1;)V

    return-void
.end method

.method public final setExpirationDateErrorListener$payments_core_release(Ls40/f1;)V
    .locals 2

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->c0:Ls40/t;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setExpirationDatePlaceholderRes(Ljava/lang/Integer;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setExpirationDatePlaceholderRes$payments_core_release(Ljava/lang/Integer;)V

    return-void
.end method

.method public final setExpirationDatePlaceholderRes$payments_core_release(Ljava/lang/Integer;)V
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->W:Ls40/t;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public setExpiryDateTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->z:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setOnBehalfOf(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->U:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->T:Landroidx/lifecycle/f2;

    new-instance v1, Lb30/z;

    const/16 v2, 0xc

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    invoke-static {p0, v0, v1}, Ls40/e0;->d(Landroid/view/View;Landroidx/lifecycle/f2;Lc93/m;)V

    :cond_0
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->U:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public final setPostalCodeErrorListener(Ls40/f1;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setPostalCodeErrorListener$payments_core_release(Ls40/f1;)V

    return-void
.end method

.method public final setPostalCodeErrorListener$payments_core_release(Ls40/f1;)V
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->e0:Ls40/t;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setPostalCodeRequired(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->R:Z

    return-void
.end method

.method public setPostalCodeTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->F:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setPreferredNetworks(Ljava/util/List;)V
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

    const-string v0, "preferredNetworks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardBrandView;->setMerchantPreferredNetworks(Ljava/util/List;)V

    return-void
.end method

.method public final setShouldShowErrorIcon$payments_core_release(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->V:Z

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->V:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->b()V

    :cond_1
    return-void
.end method

.method public final setShouldShowPostalCode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->w:Z

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->a(Z)V

    return-void
.end method

.method public final setUsZipCodeRequired(Z)V
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->S:Ls40/t;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setViewModelStoreOwner$payments_core_release(Landroidx/lifecycle/f2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->T:Landroidx/lifecycle/f2;

    return-void
.end method
