.class public Lcom/whoop/ui/WhoopEditText;
.super Lcom/google/android/material/textfield/TextInputLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/WhoopEditText$a;
    }
.end annotation


# instance fields
.field e1:Landroid/widget/EditText;

.field private f1:Landroid/graphics/Rect;

.field private g1:Lcom/whoop/ui/p;

.field private h1:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/whoop/ui/WhoopEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/textfield/TextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/WhoopEditText;->f1:Landroid/graphics/Rect;

    .line 4
    sget-object v0, Lvu1/j;->y0:[I

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1}, Lcom/whoop/ui/WhoopEditText;->R(Landroid/content/res/TypedArray;)V

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic O(Lcom/whoop/ui/WhoopEditText;Lbh3/b;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/WhoopEditText;->V(Lbh3/b;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic P(Lcom/whoop/ui/WhoopEditText;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/WhoopEditText;->T(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic Q(Lcom/whoop/ui/WhoopEditText;Lbh3/b;Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/ui/WhoopEditText;->U(Lbh3/b;Landroid/view/View;Z)V

    return-void
.end method

.method private R(Landroid/content/res/TypedArray;)V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/ui/WhoopEditText;->S()V

    const/16 v0, 0x50

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    sget v2, Lvu1/j;->z0:I

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    if-nez v2, :cond_0

    iput-boolean v1, p0, Lcom/whoop/ui/WhoopEditText;->h1:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lvu1/g;->f:I

    invoke-virtual {v2, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    goto :goto_0

    :cond_0
    iput-boolean v0, p0, Lcom/whoop/ui/WhoopEditText;->h1:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lvu1/g;->e:I

    invoke-virtual {v2, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    :goto_0
    sget v2, Lvu1/e;->u:I

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/whoop/ui/WhoopEditText;->e1:Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    if-eqz p1, :cond_7

    move v0, v1

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v2

    if-ge v0, v2, :cond_7

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    sget v3, Lvu1/j;->E0:I

    if-ne v2, v3, :cond_1

    iget-object v3, p0, Lcom/whoop/ui/WhoopEditText;->e1:Landroid/widget/EditText;

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_1
    sget v3, Lvu1/j;->D0:I

    if-ne v2, v3, :cond_2

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    sget v3, Lvu1/j;->A0:I

    if-ne v2, v3, :cond_3

    iget-object v3, p0, Lcom/whoop/ui/WhoopEditText;->e1:Landroid/widget/EditText;

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setInputType(I)V

    goto :goto_2

    :cond_3
    sget v3, Lvu1/j;->B0:I

    if-ne v2, v3, :cond_4

    iget-object v3, p0, Lcom/whoop/ui/WhoopEditText;->e1:Landroid/widget/EditText;

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setImeOptions(I)V

    goto :goto_2

    :cond_4
    sget v3, Lvu1/j;->C0:I

    if-ne v2, v3, :cond_5

    iget-object v3, p0, Lcom/whoop/ui/WhoopEditText;->e1:Landroid/widget/EditText;

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setAllCaps(Z)V

    goto :goto_2

    :cond_5
    sget v3, Lvu1/j;->F0:I

    if-ne v2, v3, :cond_6

    iget-object v3, p0, Lcom/whoop/ui/WhoopEditText;->e1:Landroid/widget/EditText;

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_6
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    new-instance p1, Lb30/k3;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private S()V
    .locals 5

    :try_start_0
    const-class v0, Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "V0"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->d()Ltr2/n;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "WhoopEditText"

    const-string v4, "Failed to reflect CollapsingTextHelper"

    invoke-interface {v1, v3, v4, v0, v2}, Ltr2/n;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_1
    new-instance v1, Lcom/whoop/ui/p;

    invoke-direct {v1, v0}, Lcom/whoop/ui/p;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/whoop/ui/WhoopEditText;->g1:Lcom/whoop/ui/p;

    return-void
.end method

.method private synthetic T(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopEditText;->h1:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_1
    return-void
.end method

.method private synthetic U(Lbh3/b;Landroid/view/View;Z)V
    .locals 0

    if-eqz p3, :cond_0

    invoke-interface {p1, p0}, Lbh3/b;->b(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private synthetic V(Lbh3/b;Landroid/view/View;)V
    .locals 0

    invoke-interface {p1, p0}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getText()Landroid/text/Editable;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopEditText;->e1:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTextString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public onLayout(ZIIII)V
    .locals 2

    invoke-super/range {p0 .. p5}, Lcom/google/android/material/textfield/TextInputLayout;->onLayout(ZIIII)V

    move-object p1, p0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p3, p1, Lcom/whoop/ui/WhoopEditText;->f1:Landroid/graphics/Rect;

    invoke-static {p0, p2, p3}, Lcom/whoop/ui/WhoopEditText$a;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p3, p1, Lcom/whoop/ui/WhoopEditText;->g1:Lcom/whoop/ui/p;

    iget-object p4, p1, Lcom/whoop/ui/WhoopEditText;->f1:Landroid/graphics/Rect;

    iget p4, p4, Landroid/graphics/Rect;->left:I

    invoke-virtual {p2}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    move-result p5

    add-int/2addr p5, p4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p4

    iget-object v0, p1, Lcom/whoop/ui/WhoopEditText;->f1:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p2}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    move-result p2

    sub-int/2addr v0, p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p3, p5, p4, v0, p2}, Lcom/whoop/ui/p;->b(IIII)V

    iget-object p2, p1, Lcom/whoop/ui/WhoopEditText;->g1:Lcom/whoop/ui/p;

    invoke-virtual {p2}, Lcom/whoop/ui/p;->a()V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p4

    const/4 p5, 0x0

    invoke-virtual {p0, p2, p3, p4, p5}, Landroid/view/View;->setPadding(IIII)V

    :cond_0
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lcom/whoop/ui/WhoopEditText$a;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Lcom/whoop/ui/WhoopEditText$a;

    invoke-virtual {p1}, Lv5/b;->b()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object p1, p1, Lcom/whoop/ui/WhoopEditText$a;->y:Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/WhoopEditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Lcom/google/android/material/textfield/TextInputLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/WhoopEditText$a;

    invoke-direct {v1, v0}, Lcom/whoop/ui/WhoopEditText$a;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    iput-object v0, v1, Lcom/whoop/ui/WhoopEditText$a;->y:Ljava/lang/CharSequence;

    return-object v1
.end method

.method public setOnClickOrFocusListener(Lbh3/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/b;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    new-instance v1, Lcom/whoop/ui/q;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0, p1}, Lcom/whoop/ui/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    new-instance v1, Lb13/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, p1}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method public setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public setText(I)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
