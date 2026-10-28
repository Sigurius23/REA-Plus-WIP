.class public final synthetic Ldb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ldb/k;->w:I

    iput-object p1, p0, Ldb/k;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 5

    iget v0, p0, Ldb/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldb/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    if-ne p2, p6, :cond_0

    if-ne p3, p7, :cond_0

    if-ne p4, p8, :cond_0

    if-eq p5, p9, :cond_1

    :cond_0
    new-instance p2, Llr/e;

    const/16 p3, 0x15

    invoke-direct {p2, v0, p3}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void

    :pswitch_0
    iget-object p3, p0, Ldb/k;->x:Ljava/lang/Object;

    check-cast p3, Ldb/c0;

    iget-object p5, p3, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast p5, Ljo/s;

    invoke-virtual {p5}, Landroid/view/View;->getWidth()I

    move-result p7

    invoke-virtual {p5}, Landroid/view/View;->getPaddingLeft()I

    move-result p9

    sub-int/2addr p7, p9

    invoke-virtual {p5}, Landroid/view/View;->getPaddingRight()I

    move-result p9

    sub-int/2addr p7, p9

    invoke-virtual {p5}, Landroid/view/View;->getHeight()I

    move-result p9

    invoke-virtual {p5}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    sub-int/2addr p9, v0

    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    move-result p5

    sub-int/2addr p9, p5

    iget-object p5, p3, Ldb/c0;->c:Landroid/view/ViewGroup;

    invoke-static {p5}, Ldb/c0;->d(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x0

    if-eqz p5, :cond_2

    invoke-virtual {p5}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p5}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr v3, v2

    goto :goto_0

    :cond_2
    move v3, v1

    :goto_0
    sub-int/2addr v0, v3

    if-nez p5, :cond_3

    move v2, v1

    goto :goto_1

    :cond_3
    invoke-virtual {p5}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    instance-of v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v4, :cond_4

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, v3

    add-int/2addr v2, v4

    :cond_4
    :goto_1
    if-eqz p5, :cond_5

    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {p5}, Landroid/view/View;->getPaddingBottom()I

    move-result p5

    add-int/2addr p5, v3

    goto :goto_2

    :cond_5
    move p5, v1

    :goto_2
    sub-int/2addr v2, p5

    iget-object p5, p3, Ldb/c0;->i:Landroid/view/ViewGroup;

    invoke-static {p5}, Ldb/c0;->d(Landroid/view/View;)I

    move-result p5

    iget-object v3, p3, Ldb/c0;->k:Landroid/view/View;

    invoke-static {v3}, Ldb/c0;->d(Landroid/view/View;)I

    move-result v3

    add-int/2addr v3, p5

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result p5

    iget-object v0, p3, Ldb/c0;->d:Landroid/view/ViewGroup;

    if-nez v0, :cond_6

    move v3, v1

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v4, :cond_7

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, v0

    add-int/2addr v3, v4

    :cond_7
    :goto_3
    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v2

    const/4 v0, 0x1

    if-le p7, p5, :cond_9

    if-gt p9, v3, :cond_8

    goto :goto_4

    :cond_8
    move p5, v1

    goto :goto_5

    :cond_9
    :goto_4
    move p5, v0

    :goto_5
    iget-boolean p7, p3, Ldb/c0;->u:Z

    if-eq p7, p5, :cond_a

    iput-boolean p5, p3, Ldb/c0;->u:Z

    new-instance p5, Ljo/t;

    const/4 p7, 0x1

    invoke-direct {p5, p3, p7}, Ljo/t;-><init>(Ldb/c0;I)V

    invoke-virtual {p1, p5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_a
    sub-int/2addr p4, p2

    sub-int/2addr p8, p6

    if-eq p4, p8, :cond_b

    move v1, v0

    :cond_b
    iget-boolean p2, p3, Ldb/c0;->u:Z

    if-nez p2, :cond_c

    if-eqz v1, :cond_c

    new-instance p2, Ljo/t;

    const/4 p4, 0x2

    invoke-direct {p2, p3, p4}, Ljo/t;-><init>(Ldb/c0;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_c
    return-void

    :pswitch_1
    iget-object v0, p0, Ldb/k;->x:Ljava/lang/Object;

    check-cast v0, Ljo/s;

    iget v1, v0, Ljo/s;->N0:I

    move v2, p2

    move-object p2, p1

    iget-object p1, v0, Ljo/s;->L0:Landroid/widget/PopupWindow;

    sub-int/2addr p4, v2

    sub-int/2addr p5, p3

    sub-int/2addr p8, p6

    sub-int/2addr p9, p7

    if-ne p4, p8, :cond_d

    if-eq p5, p9, :cond_e

    :cond_d
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-virtual {v0}, Ljo/s;->p()V

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result p3

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    move-result p4

    sub-int/2addr p3, p4

    sub-int/2addr p3, v1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getHeight()I

    move-result p4

    neg-int p4, p4

    sub-int/2addr p4, v1

    const/4 p5, -0x1

    const/4 p6, -0x1

    invoke-virtual/range {p1 .. p6}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    :cond_e
    return-void

    :pswitch_2
    move v2, p2

    move-object p2, p1

    iget-object p1, p0, Ldb/k;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/android/replay/e0;

    sub-int/2addr p4, v2

    sub-int/2addr p5, p3

    sub-int/2addr p8, p6

    sub-int/2addr p9, p7

    if-ne p4, p8, :cond_f

    if-ne p5, p9, :cond_f

    goto :goto_7

    :cond_f
    iget-object p3, p1, Lio/sentry/android/replay/e0;->G:Ljava/util/ArrayList;

    invoke-static {p3}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/ref/WeakReference;

    if-eqz p3, :cond_10

    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    goto :goto_6

    :cond_10
    const/4 p3, 0x0

    :goto_6
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_11

    goto :goto_7

    :cond_11
    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lio/sentry/android/replay/e0;->h(Landroid/view/View;)V

    :goto_7
    return-void

    :pswitch_3
    move v2, p2

    move-object p2, p1

    iget-object p1, p0, Ldb/k;->x:Ljava/lang/Object;

    check-cast p1, Ldb/c0;

    iget-object p3, p1, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast p3, Ldb/x;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p5

    invoke-virtual {p3}, Landroid/view/View;->getPaddingLeft()I

    move-result p7

    sub-int/2addr p5, p7

    invoke-virtual {p3}, Landroid/view/View;->getPaddingRight()I

    move-result p7

    sub-int/2addr p5, p7

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p7

    invoke-virtual {p3}, Landroid/view/View;->getPaddingBottom()I

    move-result p9

    sub-int/2addr p7, p9

    invoke-virtual {p3}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    sub-int/2addr p7, p3

    iget-object p3, p1, Ldb/c0;->c:Landroid/view/ViewGroup;

    invoke-static {p3}, Ldb/c0;->c(Landroid/view/View;)I

    move-result p9

    const/4 v0, 0x0

    if-eqz p3, :cond_12

    invoke-virtual {p3}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p3}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr v3, v1

    goto :goto_8

    :cond_12
    move v3, v0

    :goto_8
    sub-int/2addr p9, v3

    if-nez p3, :cond_13

    move v1, v0

    goto :goto_9

    :cond_13
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    instance-of v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v4, :cond_14

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, v3

    add-int/2addr v1, v4

    :cond_14
    :goto_9
    if-eqz p3, :cond_15

    invoke-virtual {p3}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {p3}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    add-int/2addr p3, v3

    goto :goto_a

    :cond_15
    move p3, v0

    :goto_a
    sub-int/2addr v1, p3

    iget-object p3, p1, Ldb/c0;->i:Landroid/view/ViewGroup;

    invoke-static {p3}, Ldb/c0;->c(Landroid/view/View;)I

    move-result p3

    iget-object v3, p1, Ldb/c0;->k:Landroid/view/View;

    invoke-static {v3}, Ldb/c0;->c(Landroid/view/View;)I

    move-result v3

    add-int/2addr v3, p3

    invoke-static {p9, v3}, Ljava/lang/Math;->max(II)I

    move-result p3

    iget-object p9, p1, Ldb/c0;->d:Landroid/view/ViewGroup;

    if-nez p9, :cond_16

    move v3, v0

    goto :goto_b

    :cond_16
    invoke-virtual {p9}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p9

    instance-of v4, p9, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v4, :cond_17

    check-cast p9, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, p9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget p9, p9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, p9

    add-int/2addr v3, v4

    :cond_17
    :goto_b
    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v1

    const/4 p9, 0x1

    if-le p5, p3, :cond_19

    if-gt p7, v3, :cond_18

    goto :goto_c

    :cond_18
    move p3, v0

    goto :goto_d

    :cond_19
    :goto_c
    move p3, p9

    :goto_d
    iget-boolean p5, p1, Ldb/c0;->u:Z

    if-eq p5, p3, :cond_1a

    iput-boolean p3, p1, Ldb/c0;->u:Z

    new-instance p3, Ldb/y;

    const/4 p5, 0x1

    invoke-direct {p3, p1, p5}, Ldb/y;-><init>(Ldb/c0;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1a
    sub-int/2addr p4, v2

    sub-int/2addr p8, p6

    if-eq p4, p8, :cond_1b

    move v0, p9

    :cond_1b
    iget-boolean p3, p1, Ldb/c0;->u:Z

    if-nez p3, :cond_1c

    if-eqz v0, :cond_1c

    new-instance p3, Ldb/y;

    const/4 p4, 0x2

    invoke-direct {p3, p1, p4}, Ldb/y;-><init>(Ldb/c0;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1c
    return-void

    :pswitch_4
    move v2, p2

    move-object p2, p1

    iget-object p1, p0, Ldb/k;->x:Ljava/lang/Object;

    check-cast p1, Ldb/x;

    iget v0, p1, Ldb/x;->L:I

    move v1, p3

    move-object p3, p2

    iget-object p2, p1, Ldb/x;->K:Landroid/widget/PopupWindow;

    sub-int/2addr p4, v2

    sub-int/2addr p5, v1

    sub-int/2addr p8, p6

    sub-int/2addr p9, p7

    if-ne p4, p8, :cond_1d

    if-eq p5, p9, :cond_1e

    :cond_1d
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p4

    if-eqz p4, :cond_1e

    invoke-virtual {p1}, Ldb/x;->q()V

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getWidth()I

    move-result p4

    sub-int/2addr p1, p4

    sub-int p4, p1, v0

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getHeight()I

    move-result p1

    neg-int p1, p1

    sub-int p5, p1, v0

    const/4 p6, -0x1

    const/4 p7, -0x1

    invoke-virtual/range {p2 .. p7}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    :cond_1e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
