.class public final synthetic Ljo/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ldb/c0;


# direct methods
.method public synthetic constructor <init>(Ldb/c0;I)V
    .locals 0

    iput p2, p0, Ljo/t;->w:I

    iput-object p1, p0, Ljo/t;->x:Ldb/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    iget v0, p0, Ljo/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljo/t;->x:Ldb/c0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ldb/c0;->k(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ljo/t;->x:Ldb/c0;

    iget-object v1, v0, Ldb/c0;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    iget-object v1, v0, Ldb/c0;->A:Ljava/lang/Runnable;

    check-cast v1, Ljo/t;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Ldb/c0;->g(Ljava/lang/Runnable;J)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ljo/t;->x:Ldb/c0;

    iget-object v0, v0, Ldb/c0;->m:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :pswitch_2
    iget-object v0, p0, Ljo/t;->x:Ldb/c0;

    iget-object v0, v0, Ldb/c0;->n:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :pswitch_3
    iget-object v0, p0, Ljo/t;->x:Ldb/c0;

    iget-object v1, v0, Ldb/c0;->r:Landroid/animation/ValueAnimator;

    iget-object v2, v0, Ldb/c0;->k:Landroid/view/View;

    iget-object v3, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v3, Ljo/s;

    iget-object v4, v0, Ldb/c0;->g:Landroid/view/ViewGroup;

    iget-object v5, v0, Ldb/c0;->f:Landroid/view/ViewGroup;

    if-eqz v5, :cond_8

    if-nez v4, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v6

    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v6, v3

    :goto_0
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-le v3, v8, :cond_1

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v5, v8, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v3, v0, Ldb/c0;->i:Landroid/view/ViewGroup;

    invoke-static {v3}, Ldb/c0;->d(Landroid/view/View;)I

    move-result v3

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    sub-int/2addr v9, v8

    move v10, v7

    :goto_1
    if-ge v10, v9, :cond_3

    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-static {v11}, Ldb/c0;->d(Landroid/view/View;)I

    move-result v11

    add-int/2addr v3, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_3
    if-le v3, v6, :cond_7

    if-eqz v2, :cond_4

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v2}, Ldb/c0;->d(Landroid/view/View;)I

    move-result v0

    add-int/2addr v3, v0

    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move v1, v7

    :goto_2
    if-ge v1, v9, :cond_6

    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Ldb/c0;->d(Landroid/view/View;)I

    move-result v10

    sub-int/2addr v3, v10

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-gt v3, v6, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v5, v7, v1}, Landroid/view/ViewGroup;->removeViews(II)V

    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v7, v1, :cond_8

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int/2addr v1, v8

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v4, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_7
    iget-object v2, v0, Ldb/c0;->h:Landroid/view/ViewGroup;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v0, v0, Ldb/c0;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    :cond_8
    :goto_5
    return-void

    :pswitch_4
    iget-object v0, p0, Ljo/t;->x:Ldb/c0;

    iget-object v1, v0, Ldb/c0;->j:Landroid/view/View;

    iget-object v2, v0, Ldb/c0;->e:Landroid/view/ViewGroup;

    const/4 v3, 0x4

    const/4 v4, 0x0

    if-eqz v2, :cond_a

    iget-boolean v5, v0, Ldb/c0;->u:Z

    if-eqz v5, :cond_9

    move v5, v4

    goto :goto_6

    :cond_9
    move v5, v3

    :goto_6
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    if-eqz v1, :cond_11

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v5, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v5, Ljo/s;

    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0700e1

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    iget-boolean v6, v0, Ldb/c0;->u:Z

    if-eqz v6, :cond_b

    move v5, v4

    :cond_b
    iput v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    instance-of v2, v1, Ljo/e;

    if-eqz v2, :cond_11

    check-cast v1, Ljo/e;

    iget-object v2, v1, Ljo/e;->w:Landroid/graphics/Rect;

    iget-object v5, v1, Ljo/e;->h0:Landroid/animation/ValueAnimator;

    iget-boolean v6, v0, Ldb/c0;->u:Z

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_d

    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_c
    iput-boolean v8, v1, Ljo/e;->j0:Z

    iput v7, v1, Ljo/e;->i0:F

    invoke-virtual {v1, v2}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    goto :goto_7

    :cond_d
    iget v6, v0, Ldb/c0;->t:I

    if-ne v6, v8, :cond_f

    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_e
    iput-boolean v4, v1, Ljo/e;->j0:Z

    iput v7, v1, Ljo/e;->i0:F

    invoke-virtual {v1, v2}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    goto :goto_7

    :cond_f
    const/4 v7, 0x3

    if-eq v6, v7, :cond_11

    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_10
    iput-boolean v4, v1, Ljo/e;->j0:Z

    const/high16 v5, 0x3f800000    # 1.0f

    iput v5, v1, Ljo/e;->i0:F

    invoke-virtual {v1, v2}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    :cond_11
    :goto_7
    iget-object v1, v0, Ldb/c0;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    iget-boolean v5, v0, Ldb/c0;->u:Z

    if-eqz v5, :cond_12

    invoke-static {v2}, Ldb/c0;->m(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_12

    move v5, v3

    goto :goto_9

    :cond_12
    move v5, v4

    :goto_9
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_8

    :cond_13
    return-void

    :pswitch_5
    iget-object v0, p0, Ljo/t;->x:Ldb/c0;

    invoke-virtual {v0}, Ldb/c0;->n()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
