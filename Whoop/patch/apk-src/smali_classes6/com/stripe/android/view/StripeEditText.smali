.class public Lcom/stripe/android/view/StripeEditText;
.super Lcom/google/android/material/textfield/TextInputEditText;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\r\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0019\n\u0002\u0010!\n\u0002\u0008\u000f\u0008\u0017\u0018\u00002\u00020\u0001:\u0005\u000e\n\u0012PQJ\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\tJ\u0017\u0010\u001e\u001a\u00020\u00042\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001cH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010#\u001a\n \"*\u0004\u0018\u00010\u001c0\u001cH\u0007\u00a2\u0006\u0004\u0008#\u0010!J\u0019\u0010(\u001a\u00020\u00042\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0000\u00a2\u0006\u0004\u0008&\u0010\'R(\u00102\u001a\u00020)8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008*\u0010+\u0012\u0004\u00080\u00101\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R*\u00109\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028\u0000@AX\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107\"\u0004\u00088\u0010\u0006R*\u0010:\u001a\u00020)2\u0006\u0010:\u001a\u00020)8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010+\u001a\u0004\u0008<\u0010-\"\u0004\u0008=\u0010/R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010\u0019R \u0010H\u001a\u0008\u0012\u0004\u0012\u00020\u001c0C8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010GR\u0014\u0010J\u001a\u00020\u00168@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010AR\u0011\u0010M\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010LR\u001c\u0010N\u001a\u0004\u0018\u00010\u00168\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010?\u001a\u0004\u0008O\u0010A\u00a8\u0006R"
    }
    d2 = {
        "Lcom/stripe/android/view/StripeEditText;",
        "Lcom/google/android/material/textfield/TextInputEditText;",
        "Landroid/content/res/ColorStateList;",
        "colors",
        "Ll83/a0;",
        "setTextColor",
        "(Landroid/content/res/ColorStateList;)V",
        "",
        "color",
        "(I)V",
        "Ls40/d1;",
        "afterTextChangedListener",
        "setAfterTextChangedListener",
        "(Ls40/d1;)V",
        "Ls40/e1;",
        "deleteEmptyListener",
        "setDeleteEmptyListener",
        "(Ls40/e1;)V",
        "Ls40/f1;",
        "errorMessageListener",
        "setErrorMessageListener",
        "(Ls40/f1;)V",
        "",
        "errorMessage",
        "setErrorMessage",
        "(Ljava/lang/String;)V",
        "errorColor",
        "setErrorColor",
        "Landroid/view/View$OnFocusChangeListener;",
        "listener",
        "setOnFocusChangeListener",
        "(Landroid/view/View$OnFocusChangeListener;)V",
        "getOnFocusChangeListener",
        "()Landroid/view/View$OnFocusChangeListener;",
        "kotlin.jvm.PlatformType",
        "getParentOnFocusChangeListener",
        "",
        "text",
        "setTextSilent$payments_core_release",
        "(Ljava/lang/CharSequence;)V",
        "setTextSilent",
        "",
        "H",
        "Z",
        "isLastKeyDelete$payments_core_release",
        "()Z",
        "setLastKeyDelete$payments_core_release",
        "(Z)V",
        "isLastKeyDelete$payments_core_release$annotations",
        "()V",
        "isLastKeyDelete",
        "value",
        "K",
        "Landroid/content/res/ColorStateList;",
        "getDefaultColorStateList$payments_core_release",
        "()Landroid/content/res/ColorStateList;",
        "setDefaultColorStateList$payments_core_release",
        "defaultColorStateList",
        "shouldShowError",
        "P",
        "getShouldShowError",
        "setShouldShowError",
        "Q",
        "Ljava/lang/String;",
        "getErrorMessage$payments_core_release",
        "()Ljava/lang/String;",
        "setErrorMessage$payments_core_release",
        "",
        "S",
        "Ljava/util/List;",
        "getInternalFocusChangeListeners",
        "()Ljava/util/List;",
        "internalFocusChangeListeners",
        "getFieldText$payments_core_release",
        "fieldText",
        "getDefaultErrorColorInt",
        "()I",
        "defaultErrorColorInt",
        "accessibilityText",
        "getAccessibilityText",
        "j5/b",
        "s40/g1",
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
.field public static final synthetic U:I


# instance fields
.field public H:Z

.field public I:Ls40/d1;

.field public J:Ls40/e1;

.field public K:Landroid/content/res/ColorStateList;

.field public L:Landroid/content/res/ColorStateList;

.field public M:I

.field public N:Ljava/lang/Integer;

.field public final O:Ljava/util/ArrayList;

.field public P:Z

.field public Q:Ljava/lang/String;

.field public R:Ls40/f1;

.field public final S:Ljava/util/ArrayList;

.field public T:Landroid/view/View$OnFocusChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f040208

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/textfield/TextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Ls40/s;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Ls40/s;-><init>(Landroid/view/View;I)V

    .line 4
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/view/StripeEditText;->O:Ljava/util/ArrayList;

    const/4 p3, 0x1

    .line 5
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 6
    new-instance p3, Ls40/c;

    const/4 v0, 0x4

    invoke-direct {p3, p0, v0}, Ls40/c;-><init>(Landroid/view/View;I)V

    .line 7
    invoke-virtual {p0, p3}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 8
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 9
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 10
    :cond_0
    new-instance p1, Ls40/c1;

    invoke-direct {p1, p0}, Ls40/c1;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 11
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->K:Landroid/content/res/ColorStateList;

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->b()V

    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 14
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->S:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final addTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->O:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText;->K:Landroid/content/res/ColorStateList;

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    int-to-double v2, v2

    const-wide v4, 0x3fd322d0e5604189L    # 0.299

    mul-double/2addr v2, v4

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v4

    int-to-double v4, v4

    const-wide v6, 0x3fe2c8b439581062L    # 0.587

    mul-double/2addr v4, v6

    add-double/2addr v4, v2

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    int-to-double v1, v1

    const-wide v6, 0x3fbd2f1a9fbe76c9L    # 0.114

    mul-double/2addr v1, v6

    add-double/2addr v1, v4

    const/16 v3, 0xff

    int-to-double v3, v3

    div-double/2addr v1, v3

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v1, v1, v3

    if-gtz v1, :cond_0

    const v1, 0x7f0604e1

    goto :goto_0

    :cond_0
    const v1, 0x7f0604e0

    :goto_0
    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/view/StripeEditText;->M:I

    return-void
.end method

.method public final c()V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    const/16 v1, 0x12

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setInputType(I)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-static {}, Landroid/text/method/HideReturnsTransformationMethod;->getInstance()Landroid/text/method/HideReturnsTransformationMethod;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    return-void
.end method

.method public getAccessibilityText()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDefaultColorStateList$payments_core_release()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->K:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getDefaultErrorColorInt()I
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->b()V

    iget v0, p0, Lcom/stripe/android/view/StripeEditText;->M:I

    return v0
.end method

.method public final getErrorMessage$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->Q:Ljava/lang/String;

    return-object v0
.end method

.method public final getFieldText$payments_core_release()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method public final getInternalFocusChangeListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View$OnFocusChangeListener;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->S:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->T:Landroid/view/View$OnFocusChangeListener;

    return-object v0
.end method

.method public final getParentOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    invoke-super {p0}, Landroid/view/View;->getOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    return-object v0
.end method

.method public final getShouldShowError()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->P:Z

    return v0
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    const-string v0, "outAttrs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lj5/b;

    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText;->J:Ls40/e1;

    check-cast p1, Lj6/b;

    invoke-direct {v0, p1, v1}, Lj5/b;-><init>(Lj6/b;Ls40/e1;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->P:Z

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getAccessibilityText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->Q:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/view/StripeEditText;->P:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Ls40/g1;

    if-eqz v0, :cond_0

    check-cast p1, Ls40/g1;

    iget-object v0, p1, Ls40/g1;->w:Landroid/os/Parcelable;

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object v0, p1, Ls40/g1;->x:Ljava/lang/String;

    iput-object v0, p0, Lcom/stripe/android/view/StripeEditText;->Q:Ljava/lang/String;

    iget-boolean p1, p1, Ls40/g1;->y:Z

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    new-instance v0, Ls40/g1;

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/view/StripeEditText;->Q:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/stripe/android/view/StripeEditText;->P:Z

    invoke-direct {v0, v1, v2, v3}, Ls40/g1;-><init>(Landroid/os/Parcelable;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final removeTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->O:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setAfterTextChangedListener(Ls40/d1;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->I:Ls40/d1;

    return-void
.end method

.method public final setDefaultColorStateList$payments_core_release(Landroid/content/res/ColorStateList;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->K:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public final setDeleteEmptyListener(Ls40/e1;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->J:Ls40/e1;

    return-void
.end method

.method public final setErrorColor(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->N:Ljava/lang/Integer;

    return-void
.end method

.method public final setErrorMessage(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->Q:Ljava/lang/String;

    return-void
.end method

.method public final setErrorMessage$payments_core_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->Q:Ljava/lang/String;

    return-void
.end method

.method public final setErrorMessageListener(Ls40/f1;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->R:Ls40/f1;

    return-void
.end method

.method public final setLastKeyDelete$payments_core_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->H:Z

    return-void
.end method

.method public final setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 2

    new-instance v0, Lrq0/e0;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lrq0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-super {p0, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->T:Landroid/view/View$OnFocusChangeListener;

    return-void
.end method

.method public final setShouldShowError(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->Q:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText;->R:Ls40/f1;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v1, Ls40/k0;

    iget-object v1, v1, Ls40/k0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    if-nez v0, :cond_1

    invoke-virtual {v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_1
    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->P:Z

    if-eq v0, p1, :cond_6

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->N:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_3
    iget v0, p0, Lcom/stripe/android/view/StripeEditText;->M:I

    :goto_2
    invoke-super {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->L:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->K:Landroid/content/res/ColorStateList;

    :cond_5
    invoke-super {p0, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    :cond_6
    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->P:Z

    return-void
.end method

.method public setTextColor(I)V
    .locals 0

    .line 3
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->L:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public final setTextSilent$payments_core_release(Ljava/lang/CharSequence;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->O:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/text/TextWatcher;

    invoke-super {p0, v2}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextWatcher;

    invoke-super {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_1
    return-void
.end method
