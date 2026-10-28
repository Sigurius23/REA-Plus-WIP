.class public final Lmr/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lmr/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 9

    iget v0, p0, Lmr/d;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lql/f;

    iget-object v0, p1, Lql/f;->z:Lcom/bumptech/glide/h;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->k(Lql/i;)V

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :pswitch_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v3, 0x2

    if-eqz v0, :cond_6

    if-eq v0, v1, :cond_1

    move v1, v2

    goto/16 :goto_3

    :cond_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lmr/l;

    iget p1, p1, Landroid/os/Message;->arg1:I

    iget-object v4, v0, Lmr/l;->i:Lmr/k;

    iget-object v5, v0, Lmr/l;->v:Landroid/view/accessibility/AccessibilityManager;

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5

    :goto_1
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {v4}, Lmr/k;->getAnimationMode()I

    move-result v4

    if-ne v4, v1, :cond_3

    new-array v3, v3, [F

    fill-array-data v3, :array_0

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v3

    iget-object v4, v0, Lmr/l;->d:Landroid/animation/TimeInterpolator;

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v4, Lmr/b;

    invoke-direct {v4, v0, v2, v2}, Lmr/b;-><init>(Lmr/l;IB)V

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget v4, v0, Lmr/l;->b:I

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v4, Lmr/a;

    invoke-direct {v4, v0, p1, v2}, Lmr/a;-><init>(Lmr/l;II)V

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    goto/16 :goto_3

    :cond_3
    new-instance v3, Landroid/animation/ValueAnimator;

    invoke-direct {v3}, Landroid/animation/ValueAnimator;-><init>()V

    iget-object v4, v0, Lmr/l;->i:Lmr/k;

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    instance-of v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v6, :cond_4

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v5, v4

    :cond_4
    filled-new-array {v2, v5}, [I

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    iget-object v4, v0, Lmr/l;->e:Landroid/animation/TimeInterpolator;

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget v4, v0, Lmr/l;->c:I

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v4, Lmr/a;

    invoke-direct {v4, v0, p1, v1}, Lmr/a;-><init>(Lmr/l;II)V

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance p1, Lmr/b;

    const/4 v4, 0x3

    invoke-direct {p1, v0, v4, v2}, Lmr/b;-><init>(Lmr/l;IB)V

    invoke-virtual {v3, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    goto/16 :goto_3

    :cond_5
    invoke-virtual {v0, p1}, Lmr/l;->d(I)V

    goto/16 :goto_3

    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lmr/l;

    iget-object v0, p1, Lmr/l;->i:Lmr/k;

    iget-object v4, p1, Lmr/l;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    if-nez v5, :cond_9

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v6, v5, Lq4/e;

    if-eqz v6, :cond_7

    check-cast v5, Lq4/e;

    new-instance v6, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    invoke-direct {v6}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;-><init>()V

    iget-object v7, v6, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;->i:Lla/b;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, p1, Lmr/l;->w:Lmr/g;

    iput-object v8, v7, Lla/b;->x:Ljava/lang/Object;

    new-instance v7, Lmr/f;

    invoke-direct {v7, p1}, Lmr/f;-><init>(Lmr/l;)V

    iput-object v7, v6, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Lmr/f;

    invoke-virtual {v5, v6}, Lq4/e;->b(Lq4/b;)V

    invoke-virtual {p1}, Lmr/l;->b()Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_7

    const/16 v6, 0x50

    iput v6, v5, Lq4/e;->g:I

    :cond_7
    iput-boolean v1, v0, Lmr/k;->K:Z

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-boolean v2, v0, Lmr/k;->K:Z

    invoke-virtual {p1}, Lmr/l;->b()Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_8

    goto :goto_2

    :cond_8
    new-array v2, v3, [I

    invoke-virtual {p1}, Lmr/l;->b()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v2, v2, v1

    new-array v3, v3, [I

    invoke-virtual {v4, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v3, v3, v1

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v4, v3

    sub-int v2, v4, v2

    :goto_2
    iput v2, p1, Lmr/l;->q:I

    invoke-virtual {p1}, Lmr/l;->g()V

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lmr/l;->f()V

    goto :goto_3

    :cond_a
    iput-boolean v1, p1, Lmr/l;->t:Z

    :goto_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method
