.class public Lpq/k;
.super Lm/c0;
.source "SourceFile"


# instance fields
.field private F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroid/widget/FrameLayout;",
            ">;"
        }
    .end annotation
.end field

.field private G:Landroid/widget/FrameLayout;

.field private H:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field private I:Landroid/widget/FrameLayout;

.field J:Z

.field K:Z

.field private L:Z

.field private M:Z

.field private N:Lpq/j;

.field private O:Z

.field private P:Ler/f;

.field private Q:Lpq/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    const/4 v0, 0x1

    if-nez p2, :cond_1

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x7f0400a7

    invoke-virtual {v1, v2, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    goto :goto_0

    :cond_0
    const p2, 0x7f150397

    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2}, Lm/c0;-><init>(Landroid/content/Context;I)V

    iput-boolean v0, p0, Lpq/k;->K:Z

    iput-boolean v0, p0, Lpq/k;->L:Z

    new-instance p1, Lpq/i;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lpq/i;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lpq/k;->Q:Lpq/c;

    invoke-virtual {p0, v0}, Lm/c0;->f(I)Z

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const p2, 0x7f04020e

    filled-new-array {p2}, [I

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lpq/k;->O:Z

    return-void
.end method

.method public static synthetic g(Lpq/k;)Lpq/j;
    .locals 0

    iget-object p0, p0, Lpq/k;->N:Lpq/j;

    return-object p0
.end method

.method public static synthetic h(Lpq/k;Lpq/j;)Lpq/j;
    .locals 0

    iput-object p1, p0, Lpq/k;->N:Lpq/j;

    return-object p1
.end method

.method public static synthetic i(Lpq/k;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 0

    iget-object p0, p0, Lpq/k;->F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    return-object p0
.end method

.method public static synthetic j(Lpq/k;)Landroid/widget/FrameLayout;
    .locals 0

    iget-object p0, p0, Lpq/k;->I:Landroid/widget/FrameLayout;

    return-object p0
.end method


# virtual methods
.method public cancel()V
    .locals 3

    invoke-virtual {p0}, Lpq/k;->l()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    iget-boolean v1, p0, Lpq/k;->J:Z

    if-eqz v1, :cond_1

    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W(I)V

    return-void

    :cond_1
    :goto_0
    invoke-super {p0}, Landroid/app/Dialog;->cancel()V

    return-void
.end method

.method public final k()V
    .locals 3

    iget-object v0, p0, Lpq/k;->G:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0d0166

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lpq/k;->G:Landroid/widget/FrameLayout;

    const v1, 0x7f0a0350

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object v0, p0, Lpq/k;->H:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v0, p0, Lpq/k;->G:Landroid/widget/FrameLayout;

    const v1, 0x7f0a03ba

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lpq/k;->I:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    iput-object v0, p0, Lpq/k;->F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v1, p0, Lpq/k;->Q:Lpq/c;

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(Lpq/c;)V

    iget-object v0, p0, Lpq/k;->F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-boolean v1, p0, Lpq/k;->K:Z

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U(Z)V

    new-instance v0, Ler/f;

    iget-object v1, p0, Lpq/k;->F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v2, p0, Lpq/k;->I:Landroid/widget/FrameLayout;

    invoke-direct {v0, v1, v2}, Ler/f;-><init>(Ler/b;Landroid/view/View;)V

    iput-object v0, p0, Lpq/k;->P:Ler/f;

    :cond_0
    return-void
.end method

.method public l()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroid/widget/FrameLayout;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpq/k;->F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lpq/k;->k()V

    :cond_0
    iget-object v0, p0, Lpq/k;->F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lpq/k;->J:Z

    return v0
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lpq/k;->F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v1, p0, Lpq/k;->Q:Lpq/c;

    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public o()Z
    .locals 3

    iget-boolean v0, p0, Lpq/k;->M:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x101035b

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lpq/k;->L:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    iput-boolean v2, p0, Lpq/k;->M:Z

    :cond_0
    iget-boolean v0, p0, Lpq/k;->L:Z

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 6

    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Lpq/k;->O:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getNavigationBarColor()I

    move-result v2

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    const/16 v4, 0xff

    if-ge v2, v4, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    iget-object v4, p0, Lpq/k;->G:Landroid/widget/FrameLayout;

    if-eqz v4, :cond_1

    xor-int/lit8 v5, v2, 0x1

    invoke-virtual {v4, v5}, Landroid/view/View;->setFitsSystemWindows(Z)V

    :cond_1
    iget-object v4, p0, Lpq/k;->H:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    if-eqz v4, :cond_2

    xor-int/lit8 v5, v2, 0x1

    invoke-virtual {v4, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setFitsSystemWindows(Z)V

    :cond_2
    xor-int/2addr v2, v3

    invoke-static {v0, v2}, Lpf/c;->V(Landroid/view/Window;Z)V

    iget-object v2, p0, Lpq/k;->N:Lpq/j;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v0}, Lpq/j;->e(Landroid/view/Window;)V

    :cond_3
    iget-object v0, p0, Lpq/k;->P:Ler/f;

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v2, v0, Ler/f;->c:Landroid/view/View;

    iget-object v3, v0, Ler/f;->a:Ler/c;

    iget-boolean v4, p0, Lpq/k;->K:Z

    if-eqz v4, :cond_5

    if-eqz v3, :cond_6

    iget-object v0, v0, Ler/f;->b:Ler/b;

    invoke-virtual {v3, v0, v2, v1}, Ler/c;->b(Ler/b;Landroid/view/View;Z)V

    return-void

    :cond_5
    if-eqz v3, :cond_6

    invoke-virtual {v3, v2}, Ler/c;->c(Landroid/view/View;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lm/c0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    const/high16 v0, -0x80000000

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    const/4 v0, -0x1

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setLayout(II)V

    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    iget-object v0, p0, Lpq/k;->N:Lpq/j;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lpq/j;->e(Landroid/view/Window;)V

    :cond_0
    iget-object v0, p0, Lpq/k;->P:Ler/f;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ler/f;->a:Ler/c;

    if-eqz v1, :cond_1

    iget-object v0, v0, Ler/f;->c:Landroid/view/View;

    invoke-virtual {v1, v0}, Ler/c;->c(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Lg/m;->onStart()V

    iget-object v0, p0, Lpq/k;->F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    if-eqz v0, :cond_0

    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W(I)V

    :cond_0
    return-void
.end method

.method public final p(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Landroid/widget/FrameLayout;
    .locals 3

    invoke-virtual {p0}, Lpq/k;->k()V

    iget-object v0, p0, Lpq/k;->G:Landroid/widget/FrameLayout;

    const v1, 0x7f0a0350

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    if-eqz p2, :cond_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Dialog;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    :cond_0
    iget-boolean p2, p0, Lpq/k;->O:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lpq/k;->I:Landroid/widget/FrameLayout;

    new-instance v1, Lpq/f;

    invoke-direct {v1, p0}, Lpq/f;-><init>(Lpq/k;)V

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p2, v1}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    :cond_1
    iget-object p2, p0, Lpq/k;->I:Landroid/widget/FrameLayout;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    if-nez p3, :cond_2

    iget-object p2, p0, Lpq/k;->I:Landroid/widget/FrameLayout;

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lpq/k;->I:Landroid/widget/FrameLayout;

    invoke-virtual {p2, p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    const p1, 0x7f0a0cb9

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lpq/g;

    invoke-direct {p2, p0}, Lpq/g;-><init>(Lpq/k;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lpq/k;->I:Landroid/widget/FrameLayout;

    new-instance p2, Lpq/h;

    invoke-direct {p2, p0}, Lpq/h;-><init>(Lpq/k;)V

    invoke-static {p1, p2}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    iget-object p1, p0, Lpq/k;->I:Landroid/widget/FrameLayout;

    new-instance p2, Lmr/j;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lmr/j;-><init>(I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object p1, p0, Lpq/k;->G:Landroid/widget/FrameLayout;

    return-object p1
.end method

.method public setCancelable(Z)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-boolean v0, p0, Lpq/k;->K:Z

    if-eq v0, p1, :cond_3

    iput-boolean p1, p0, Lpq/k;->K:Z

    iget-object v0, p0, Lpq/k;->F:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U(Z)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lpq/k;->P:Ler/f;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p1, Ler/f;->c:Landroid/view/View;

    iget-object v1, p1, Ler/f;->a:Ler/c;

    iget-boolean v2, p0, Lpq/k;->K:Z

    if-eqz v2, :cond_2

    if-eqz v1, :cond_3

    iget-object p1, p1, Ler/f;->b:Ler/b;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Ler/c;->b(Ler/b;Landroid/view/View;Z)V

    return-void

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Ler/c;->c(Landroid/view/View;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public setCanceledOnTouchOutside(Z)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-boolean v1, p0, Lpq/k;->K:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Lpq/k;->K:Z

    :cond_0
    iput-boolean p1, p0, Lpq/k;->L:Z

    iput-boolean v0, p0, Lpq/k;->M:Z

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, v0}, Lpq/k;->p(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-super {p0, p1}, Lm/c0;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v1}, Lpq/k;->p(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-super {p0, p1}, Lm/c0;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0, p2}, Lpq/k;->p(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-super {p0, p1}, Lm/c0;->setContentView(Landroid/view/View;)V

    return-void
.end method
