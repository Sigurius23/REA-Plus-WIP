.class public final Lcom/google/android/material/textfield/l;
.super Lcom/google/android/material/textfield/r;
.source "SourceFile"


# instance fields
.field public final e:I

.field public final f:I

.field public final g:Landroid/animation/TimeInterpolator;

.field public h:Landroid/widget/AutoCompleteTextView;

.field public final i:Lcom/google/android/material/textfield/a;

.field public final j:Lcom/google/android/material/textfield/b;

.field public final k:Lcom/google/android/material/textfield/k;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:J

.field public p:Landroid/view/accessibility/AccessibilityManager;

.field public q:Landroid/animation/ValueAnimator;

.field public r:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/q;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/r;-><init>(Lcom/google/android/material/textfield/q;)V

    new-instance v0, Lcom/google/android/material/textfield/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/google/android/material/textfield/a;-><init>(Lcom/google/android/material/textfield/r;I)V

    iput-object v0, p0, Lcom/google/android/material/textfield/l;->i:Lcom/google/android/material/textfield/a;

    new-instance v0, Lcom/google/android/material/textfield/b;

    invoke-direct {v0, p0, v1}, Lcom/google/android/material/textfield/b;-><init>(Lcom/google/android/material/textfield/r;I)V

    iput-object v0, p0, Lcom/google/android/material/textfield/l;->j:Lcom/google/android/material/textfield/b;

    new-instance v0, Lcom/google/android/material/textfield/k;

    invoke-direct {v0, p0}, Lcom/google/android/material/textfield/k;-><init>(Lcom/google/android/material/textfield/l;)V

    iput-object v0, p0, Lcom/google/android/material/textfield/l;->k:Lcom/google/android/material/textfield/k;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lcom/google/android/material/textfield/l;->o:J

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x43

    const v2, 0x7f040493

    invoke-static {v0, v2, v1}, Lvp/c;->k0(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/l;->f:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x32

    invoke-static {v0, v2, v1}, Lvp/c;->k0(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/l;->e:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f04049c

    sget-object v1, Lkq/a;->a:Landroid/view/animation/LinearInterpolator;

    invoke-static {p1, v0, v1}, Lvp/c;->l0(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/textfield/l;->g:Landroid/animation/TimeInterpolator;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/r;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, Lcom/google/android/material/textfield/a0;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lcom/google/android/material/textfield/a0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final c()I
    .locals 1

    const v0, 0x7f1404e0

    return v0
.end method

.method public final d()I
    .locals 1

    const v0, 0x7f080658

    return v0
.end method

.method public final e()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->j:Lcom/google/android/material/textfield/b;

    return-object v0
.end method

.method public final f()Landroid/view/View$OnClickListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->i:Lcom/google/android/material/textfield/a;

    return-object v0
.end method

.method public final h()Lcom/google/android/material/textfield/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->k:Lcom/google/android/material/textfield/k;

    return-object v0
.end method

.method public final i(I)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/l;->n:Z

    return v0
.end method

.method public final l(Landroid/widget/EditText;)V
    .locals 2

    instance-of v0, p1, Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/widget/AutoCompleteTextView;

    iput-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, Lcom/google/android/material/textfield/i;

    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/i;-><init>(Lcom/google/android/material/textfield/l;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, Lcom/google/android/material/textfield/j;

    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/j;-><init>(Lcom/google/android/material/textfield/l;)V

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/material/textfield/r;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Landroid/widget/TextView;->getInputType()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/textfield/l;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    iget-object p1, p0, Lcom/google/android/material/textfield/r;->d:Lcom/google/android/material/internal/CheckableImageButton;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconVisible(Z)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Li5/f;)V
    .locals 2

    iget-object v0, p1, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v1, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getInputType()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-class v1, Landroid/widget/Spinner;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Li5/f;->h(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isShowingHintText()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHintText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final n(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const v1, 0x8000

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/l;->n:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p1

    if-eq p1, v2, :cond_3

    if-eqz v0, :cond_4

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/l;->t()V

    iput-boolean v2, p0, Lcom/google/android/material/textfield/l;->m:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/material/textfield/l;->o:J

    :cond_4
    return-void
.end method

.method public final q()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/material/textfield/l;->g:Landroid/animation/TimeInterpolator;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget v3, p0, Lcom/google/android/material/textfield/l;->f:I

    int-to-long v3, v3

    invoke-virtual {v1, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v3, Lcom/google/android/material/textfield/c;

    invoke-direct {v3, p0, v0}, Lcom/google/android/material/textfield/c;-><init>(Lcom/google/android/material/textfield/r;I)V

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iput-object v1, p0, Lcom/google/android/material/textfield/l;->r:Landroid/animation/ValueAnimator;

    new-array v1, v0, [F

    fill-array-data v1, :array_1

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget v2, p0, Lcom/google/android/material/textfield/l;->e:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v2, Lcom/google/android/material/textfield/c;

    invoke-direct {v2, p0, v0}, Lcom/google/android/material/textfield/c;-><init>(Lcom/google/android/material/textfield/r;I)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iput-object v1, p0, Lcom/google/android/material/textfield/l;->q:Landroid/animation/ValueAnimator;

    new-instance v0, Lar/d;

    const/4 v2, 0x3

    invoke-direct {v0, p0, v2}, Lar/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/r;->c:Landroid/content/Context;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Lcom/google/android/material/textfield/l;->p:Landroid/view/accessibility/AccessibilityManager;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method public final s(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/l;->n:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/material/textfield/l;->n:Z

    iget-object p1, p0, Lcom/google/android/material/textfield/l;->r:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object p1, p0, Lcom/google/android/material/textfield/l;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method public final t()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/material/textfield/l;->o:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    const/4 v3, 0x0

    if-ltz v2, :cond_1

    const-wide/16 v4, 0x12c

    cmp-long v0, v0, v4

    if-lez v0, :cond_2

    :cond_1
    iput-boolean v3, p0, Lcom/google/android/material/textfield/l;->m:Z

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/material/textfield/l;->m:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/material/textfield/l;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/l;->s(Z)V

    iget-boolean v0, p0, Lcom/google/android/material/textfield/l;->n:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    return-void

    :cond_4
    iput-boolean v3, p0, Lcom/google/android/material/textfield/l;->m:Z

    return-void
.end method
