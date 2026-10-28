.class public abstract Lmr/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Landroid/os/Handler;

.field public static final B:[I

.field public static final C:Ljava/lang/String;

.field public static final x:Lh8/a;

.field public static final y:Landroid/view/animation/LinearInterpolator;

.field public static final z:Lh8/a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Landroid/animation/TimeInterpolator;

.field public final e:Landroid/animation/TimeInterpolator;

.field public final f:Landroid/animation/TimeInterpolator;

.field public final g:Landroid/view/ViewGroup;

.field public final h:Landroid/content/Context;

.field public final i:Lmr/k;

.field public final j:Lmr/m;

.field public k:I

.field public l:Lmr/h;

.field public final m:Lmr/e;

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public u:Ljava/util/ArrayList;

.field public final v:Landroid/view/accessibility/AccessibilityManager;

.field public final w:Lmr/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lkq/a;->b:Lh8/a;

    sput-object v0, Lmr/l;->x:Lh8/a;

    sget-object v0, Lkq/a;->a:Landroid/view/animation/LinearInterpolator;

    sput-object v0, Lmr/l;->y:Landroid/view/animation/LinearInterpolator;

    sget-object v0, Lkq/a;->d:Lh8/a;

    sput-object v0, Lmr/l;->z:Lh8/a;

    const v0, 0x7f0405dd

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Lmr/l;->B:[I

    const-class v0, Lmr/l;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lmr/l;->C:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lmr/d;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lmr/d;-><init>(I)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    sput-object v0, Lmr/l;->A:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Lmr/m;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmr/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lmr/e;-><init>(Lmr/l;I)V

    iput-object v0, p0, Lmr/l;->m:Lmr/e;

    new-instance v0, Lmr/g;

    invoke-direct {v0, p0}, Lmr/g;-><init>(Lmr/l;)V

    iput-object v0, p0, Lmr/l;->w:Lmr/g;

    if-eqz p3, :cond_4

    if-eqz p4, :cond_3

    iput-object p2, p0, Lmr/l;->g:Landroid/view/ViewGroup;

    iput-object p4, p0, Lmr/l;->j:Lmr/m;

    iput-object p1, p0, Lmr/l;->h:Landroid/content/Context;

    sget-object p4, Lcr/m;->a:[I

    const-string v0, "Theme.AppCompat"

    invoke-static {p1, p4, v0}, Lcr/m;->c(Landroid/content/Context;[ILjava/lang/String;)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p4

    sget-object v0, Lmr/l;->B:[I

    invoke-virtual {p1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eq v3, v2, :cond_0

    const v0, 0x7f0d033c

    goto :goto_0

    :cond_0
    const v0, 0x7f0d0167

    :goto_0
    invoke-virtual {p4, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lmr/k;

    iput-object p2, p0, Lmr/l;->i:Lmr/k;

    invoke-static {p2, p0}, Lmr/k;->a(Lmr/k;Lmr/l;)V

    instance-of p4, p3, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    if-eqz p4, :cond_2

    move-object p4, p3

    check-cast p4, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    invoke-virtual {p2}, Lmr/k;->getActionTextColorAlpha()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_1

    iget-object v1, p4, Lcom/google/android/material/snackbar/SnackbarContentLayout;->x:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v1

    const v2, 0x7f040168

    invoke-static {p4, v2}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v2

    invoke-static {v0, v2, v1}, Lrj/o;->x(FII)I

    move-result v0

    iget-object v1, p4, Lcom/google/android/material/snackbar/SnackbarContentLayout;->x:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    invoke-virtual {p2}, Lmr/k;->getMaxInlineActionWidth()I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->setMaxInlineActionWidth(I)V

    :cond_2
    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object p3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setImportantForAccessibility(I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setFitsSystemWindows(Z)V

    new-instance p3, Lmr/f;

    invoke-direct {p3, p0}, Lmr/f;-><init>(Lmr/l;)V

    invoke-static {p2, p3}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    new-instance p3, Lcom/google/android/material/datepicker/j;

    const/4 p4, 0x3

    invoke-direct {p3, p0, p4}, Lcom/google/android/material/datepicker/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2, p3}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    const-string p2, "accessibility"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/accessibility/AccessibilityManager;

    iput-object p2, p0, Lmr/l;->v:Landroid/view/accessibility/AccessibilityManager;

    const/16 p2, 0xfa

    const p3, 0x7f04048a

    invoke-static {p1, p3, p2}, Lvp/c;->k0(Landroid/content/Context;II)I

    move-result p2

    iput p2, p0, Lmr/l;->c:I

    const/16 p2, 0x96

    invoke-static {p1, p3, p2}, Lvp/c;->k0(Landroid/content/Context;II)I

    move-result p2

    iput p2, p0, Lmr/l;->a:I

    const p2, 0x7f04048d

    const/16 p3, 0x4b

    invoke-static {p1, p2, p3}, Lvp/c;->k0(Landroid/content/Context;II)I

    move-result p2

    iput p2, p0, Lmr/l;->b:I

    sget-object p2, Lmr/l;->y:Landroid/view/animation/LinearInterpolator;

    const p3, 0x7f04049a

    invoke-static {p1, p3, p2}, Lvp/c;->l0(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p2

    iput-object p2, p0, Lmr/l;->d:Landroid/animation/TimeInterpolator;

    sget-object p2, Lmr/l;->z:Lh8/a;

    invoke-static {p1, p3, p2}, Lvp/c;->l0(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p2

    iput-object p2, p0, Lmr/l;->f:Landroid/animation/TimeInterpolator;

    sget-object p2, Lmr/l;->x:Lh8/a;

    invoke-static {p1, p3, p2}, Lvp/c;->l0(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, Lmr/l;->e:Landroid/animation/TimeInterpolator;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Transient bottom bar must have non-null callback"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Transient bottom bar must have non-null content"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    invoke-static {}, La00/g;->o()La00/g;

    move-result-object v0

    iget-object v1, p0, Lmr/l;->w:Lmr/g;

    iget-object v2, v0, La00/g;->x:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v0, v1}, La00/g;->r(Lmr/g;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v1, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v1, Lmr/o;

    invoke-virtual {v0, v1, p1}, La00/g;->h(Lmr/o;I)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-object v3, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v3, Lmr/o;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lmr/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Lmr/o;

    invoke-virtual {v0, v1, p1}, La00/g;->h(Lmr/o;I)Z

    :cond_2
    :goto_1
    monitor-exit v2

    return-void

    :goto_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lmr/l;->l:Lmr/h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Lmr/h;->x:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final c()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lmr/l;->i:Lmr/k;

    invoke-virtual {v0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Los/a;->l(Landroid/graphics/Insets;)I

    move-result v0

    iput v0, p0, Lmr/l;->r:I

    invoke-virtual {p0}, Lmr/l;->g()V

    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 3

    invoke-static {}, La00/g;->o()La00/g;

    move-result-object v0

    iget-object v1, p0, Lmr/l;->w:Lmr/g;

    iget-object v2, v0, La00/g;->x:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v0, v1}, La00/g;->r(Lmr/g;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, v0, La00/g;->z:Ljava/lang/Object;

    iget-object v1, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Lmr/o;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, La00/g;->N()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lmr/l;->u:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_1

    iget-object v1, p0, Lmr/l;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmr/i;

    invoke-virtual {v1, p0, p1}, Lmr/i;->onDismissed(Ljava/lang/Object;I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lmr/l;->i:Lmr/k;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lmr/l;->i:Lmr/k;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    return-void

    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final e()V
    .locals 3

    invoke-static {}, La00/g;->o()La00/g;

    move-result-object v0

    iget-object v1, p0, Lmr/l;->w:Lmr/g;

    iget-object v2, v0, La00/g;->x:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v0, v1}, La00/g;->r(Lmr/g;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v1, Lmr/o;

    invoke-virtual {v0, v1}, La00/g;->B(Lmr/o;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lmr/l;->u:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_1

    iget-object v1, p0, Lmr/l;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmr/i;

    invoke-virtual {v1, p0}, Lmr/i;->onShown(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    return-void

    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Lmr/l;->i:Lmr/k;

    iget-object v1, p0, Lmr/l;->v:Landroid/view/accessibility/AccessibilityManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    new-instance v1, Lmr/e;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lmr/e;-><init>(Lmr/l;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-virtual {p0}, Lmr/l;->e()V

    return-void
.end method

.method public final g()V
    .locals 7

    iget-object v0, p0, Lmr/l;->i:Lmr/k;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    sget-object v3, Lmr/l;->C:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v0, "Unable to update margins because layout params are not MarginLayoutParams"

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, v0, Lmr/k;->J:Landroid/graphics/Rect;

    if-nez v2, :cond_1

    const-string v0, "Unable to update margins because original view margins are not set"

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p0}, Lmr/l;->b()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_3

    iget v2, p0, Lmr/l;->q:I

    goto :goto_0

    :cond_3
    iget v2, p0, Lmr/l;->n:I

    :goto_0
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v3, v0, Lmr/k;->J:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v4, v2

    iget v2, v3, Landroid/graphics/Rect;->left:I

    iget v5, p0, Lmr/l;->o:I

    add-int/2addr v2, v5

    iget v5, v3, Landroid/graphics/Rect;->right:I

    iget v6, p0, Lmr/l;->p:I

    add-int/2addr v5, v6

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    if-ne v6, v4, :cond_5

    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v6, v2, :cond_5

    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-ne v6, v5, :cond_5

    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eq v6, v3, :cond_4

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v6, 0x1

    :goto_2
    if-eqz v6, :cond_6

    iput v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_6
    if-nez v6, :cond_7

    iget v1, p0, Lmr/l;->s:I

    iget v2, p0, Lmr/l;->r:I

    if-eq v1, v2, :cond_8

    :cond_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_8

    iget v1, p0, Lmr/l;->r:I

    if-lez v1, :cond_8

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v2, v1, Lq4/e;

    if-eqz v2, :cond_8

    check-cast v1, Lq4/e;

    iget-object v1, v1, Lq4/e;->a:Lq4/b;

    instance-of v1, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lmr/l;->m:Lmr/e;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_8
    :goto_3
    return-void
.end method
