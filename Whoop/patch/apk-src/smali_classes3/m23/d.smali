.class public final Lm23/d;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field public E:[I

.field public F:Landroid/view/View;

.field public final G:Landroid/view/ViewGroup;

.field public final H:Landroid/view/View;

.field public final I:Landroid/view/ViewGroup;

.field public final J:Landroid/widget/FrameLayout;

.field public final K:Landroid/widget/ImageView;

.field public final L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

.field public M:Lj23/b;

.field public final N:Lf23/b;

.field public final O:Le10/k0;

.field public final P:Landroid/view/ScaleGestureDetector;

.field public Q:Lg23/a;

.field public R:Z

.field public S:Z

.field public T:Z

.field public U:Lf23/a;

.field public V:Ljava/lang/Object;

.field public W:Li23/a;

.field public a0:Lg73/d;

.field public b0:I

.field public w:Z

.field public x:Z

.field public y:Lc93/a;

.field public z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v2, 0x1

    iput-boolean v2, p0, Lm23/d;->w:Z

    iput-boolean v2, p0, Lm23/d;->x:Z

    filled-new-array {v1, v1, v1, v1}, [I

    move-result-object v1

    iput-object v1, p0, Lm23/d;->E:[I

    sget-object v1, Lm83/y;->w:Lm83/y;

    iput-object v1, p0, Lm23/d;->V:Ljava/lang/Object;

    const v1, 0x7f0d0678

    invoke-static {p1, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f0a0a9a

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lm23/d;->G:Landroid/view/ViewGroup;

    const p1, 0x7f0a019e

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lm23/d;->H:Landroid/view/View;

    const p1, 0x7f0a03ce

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lm23/d;->I:Landroid/view/ViewGroup;

    const p1, 0x7f0a0cc2

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lm23/d;->J:Landroid/widget/FrameLayout;

    const p1, 0x7f0a0cc3

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lm23/d;->K:Landroid/widget/ImageView;

    const p1, 0x7f0a07a1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    iput-object p1, p0, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    new-instance v1, Lm23/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lm23/b;-><init>(Lm23/d;I)V

    const/4 v2, 0x5

    invoke-static {p1, v1, v0, v2}, Lcom/squareup/wire/n;->k(Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;Lm23/b;Lg40/f4;I)Ld23/a;

    new-instance p1, Lf23/b;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm23/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lm23/b;-><init>(Lm23/d;I)V

    invoke-direct {p1, v0, v1}, Lf23/b;-><init>(Landroid/content/Context;Lm23/b;)V

    iput-object p1, p0, Lm23/d;->N:Lf23/b;

    new-instance p1, Le10/k0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Le23/a;

    new-instance v2, Lm23/b;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lm23/b;-><init>(Lm23/d;I)V

    new-instance v3, Lm23/b;

    const/4 v4, 0x3

    invoke-direct {v3, p0, v4}, Lm23/b;-><init>(Lm23/d;I)V

    invoke-direct {v1, v2, v3}, Le23/a;-><init>(Lm23/b;Lm23/b;)V

    invoke-direct {p1, v0, v1}, Le10/k0;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p1, p0, Lm23/d;->O:Le10/k0;

    new-instance p1, Landroid/view/ScaleGestureDetector;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;

    invoke-direct {v1}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    invoke-direct {p1, v0, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object p1, p0, Lm23/d;->P:Landroid/view/ScaleGestureDetector;

    return-void
.end method

.method public static a(Lm23/d;Landroid/view/MotionEvent;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    iget-boolean v0, v0, Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;->L0:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lm23/d;->T:Z

    iget-object v1, p0, Lm23/d;->F:Landroid/view/View;

    if-eqz v1, :cond_4

    if-nez v0, :cond_4

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v0, :cond_1

    move v6, v5

    goto :goto_1

    :cond_1
    move v6, v4

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    const/4 v5, 0x2

    new-array v5, v5, [F

    aput v6, v5, v3

    aput v4, v5, v2

    const-string v2, "alpha"

    invoke-static {v1, v2, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v2, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_3

    new-instance v0, Lar/d;

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3}, Lar/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    invoke-virtual {v2}, Landroid/animation/ObjectAnimator;->start()V

    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_4
    return-void
.end method

.method public static b(Lm23/d;)Z
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lm23/d;->getShouldDismissToBottom()Z

    move-result p0

    return p0
.end method

.method private final getShouldDismissToBottom()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private final setStartPosition(I)V
    .locals 0

    iput p1, p0, Lm23/d;->b0:I

    invoke-virtual {p0, p1}, Lm23/d;->setCurrentPosition$photoview_dialog_release(I)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget-object v0, p0, Lm23/d;->J:Landroid/widget/FrameLayout;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "<this>"

    iget-object v2, p0, Lm23/d;->I:Landroid/view/ViewGroup;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v3

    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_1
    iget v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :goto_1
    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    iget-object v0, p0, Lm23/d;->a0:Lg73/d;

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lm23/d;->getShouldDismissToBottom()Z

    iget-object v0, p0, Lm23/d;->y:Lc93/a;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_3
    return-void

    :cond_4
    const-string v0, "transitionImageAnimator"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final d()V
    .locals 2

    invoke-direct {p0}, Lm23/d;->getShouldDismissToBottom()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm23/d;->Q:Lg23/a;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lg23/a;->w:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lg23/a;->a(F)V

    return-void

    :cond_0
    const-string v0, "swipeDismissHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    invoke-virtual {p0}, Lm23/d;->c()V

    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lm23/d;->F:Landroid/view/View;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v0, Lm23/d;->F:Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-ne v2, v3, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v2, v0, Lm23/d;->a0:Lg73/d;

    if-eqz v2, :cond_19

    iget-boolean v2, v0, Lm23/d;->S:Z

    const/4 v4, 0x2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-ne v2, v4, :cond_1

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-ne v2, v3, :cond_1

    goto/16 :goto_7

    :cond_1
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v5, 0x0

    iget-object v6, v0, Lm23/d;->G:Landroid/view/ViewGroup;

    const-string v7, "swipeDismissHandler"

    iget-object v8, v0, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    const/4 v9, 0x0

    if-ne v2, v3, :cond_4

    iput-boolean v5, v0, Lm23/d;->S:Z

    iget-object v2, v0, Lm23/d;->Q:Lg23/a;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v6, v1}, Lg23/a;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    invoke-virtual {v8, v1}, Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v2, v0, Lm23/d;->F:Landroid/view/View;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_0

    :cond_2
    move v2, v5

    :goto_0
    iput-boolean v2, v0, Lm23/d;->T:Z

    goto :goto_1

    :cond_3
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_4
    :goto_1
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_7

    iput-object v9, v0, Lm23/d;->U:Lf23/a;

    iput-boolean v5, v0, Lm23/d;->R:Z

    invoke-virtual {v8, v1}, Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v2, v0, Lm23/d;->Q:Lg23/a;

    if-eqz v2, :cond_6

    invoke-virtual {v2, v6, v1}, Lg23/a;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    iget-object v2, v0, Lm23/d;->F:Landroid/view/View;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-nez v10, :cond_5

    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_5

    move v2, v3

    goto :goto_2

    :cond_5
    move v2, v5

    :goto_2
    iput-boolean v2, v0, Lm23/d;->T:Z

    goto :goto_3

    :cond_6
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_7
    :goto_3
    iget-object v2, v0, Lm23/d;->P:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v2, v1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v10, v0, Lm23/d;->O:Le10/k0;

    iget-object v10, v10, Le10/k0;->x:Ljava/lang/Object;

    check-cast v10, Landroid/view/GestureDetector;

    invoke-virtual {v10, v1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v10, v0, Lm23/d;->U:Lf23/a;

    if-nez v10, :cond_9

    invoke-virtual {v2}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-gt v2, v3, :cond_8

    iget-boolean v2, v0, Lm23/d;->R:Z

    if-eqz v2, :cond_9

    :cond_8
    iput-boolean v3, v0, Lm23/d;->R:Z

    invoke-virtual {v8, v1}, Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :cond_9
    invoke-virtual {v0}, Lm23/d;->e()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :cond_a
    iget-object v2, v0, Lm23/d;->N:Lf23/b;

    iget-object v10, v2, Lf23/b;->a:Lm23/b;

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v11

    const/4 v12, 0x3

    if-eqz v11, :cond_13

    if-eq v11, v3, :cond_11

    if-eq v11, v4, :cond_b

    if-eq v11, v12, :cond_11

    goto/16 :goto_5

    :cond_b
    iget-boolean v11, v2, Lf23/b;->e:Z

    if-nez v11, :cond_14

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v11

    iget v13, v2, Lf23/b;->c:F

    sub-float/2addr v11, v13

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    iget v13, v2, Lf23/b;->d:F

    sub-float/2addr v5, v13

    mul-float/2addr v11, v11

    mul-float/2addr v5, v5

    add-float/2addr v5, v11

    float-to-double v13, v5

    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    double-to-float v5, v13

    iget v11, v2, Lf23/b;->b:I

    int-to-float v11, v11

    cmpl-float v5, v5, v11

    if-lez v5, :cond_14

    iput-boolean v3, v2, Lf23/b;->e:Z

    iget v5, v2, Lf23/b;->c:F

    iget v2, v2, Lf23/b;->d:F

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v11

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v13

    sub-float/2addr v2, v13

    float-to-double v13, v2

    sub-float/2addr v11, v5

    float-to-double v4, v11

    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v4

    const-wide v13, 0x400921fb54442d18L    # Math.PI

    add-double/2addr v4, v13

    const/16 v2, 0xb4

    move-wide/from16 v16, v13

    int-to-double v13, v2

    mul-double/2addr v4, v13

    div-double v4, v4, v16

    add-double/2addr v4, v13

    const/16 v2, 0x168

    int-to-double v13, v2

    rem-double/2addr v4, v13

    sget-object v2, Lf23/a;->w:Lkr/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v13, 0x0

    cmpg-double v2, v13, v4

    const-wide v13, 0x4046800000000000L    # 45.0

    if-gtz v2, :cond_c

    cmpg-double v2, v4, v13

    if-gtz v2, :cond_c

    sget-object v2, Lf23/a;->F:Lf23/a;

    goto :goto_4

    :cond_c
    cmpg-double v2, v13, v4

    const-wide v13, 0x4060e00000000000L    # 135.0

    if-gtz v2, :cond_d

    cmpg-double v2, v4, v13

    if-gtz v2, :cond_d

    sget-object v2, Lf23/a;->y:Lf23/a;

    goto :goto_4

    :cond_d
    cmpg-double v2, v13, v4

    const-wide v13, 0x406c200000000000L    # 225.0

    if-gtz v2, :cond_e

    cmpg-double v2, v4, v13

    if-gtz v2, :cond_e

    sget-object v2, Lf23/a;->E:Lf23/a;

    goto :goto_4

    :cond_e
    cmpg-double v2, v13, v4

    const-wide v13, 0x4073b00000000000L    # 315.0

    if-gtz v2, :cond_f

    cmpg-double v2, v4, v13

    if-gtz v2, :cond_f

    sget-object v2, Lf23/a;->z:Lf23/a;

    goto :goto_4

    :cond_f
    cmpg-double v2, v13, v4

    if-gtz v2, :cond_10

    const-wide v13, 0x4076800000000000L    # 360.0

    cmpg-double v2, v4, v13

    if-gtz v2, :cond_10

    sget-object v2, Lf23/a;->F:Lf23/a;

    goto :goto_4

    :cond_10
    sget-object v2, Lf23/a;->x:Lf23/a;

    :goto_4
    invoke-virtual {v10, v2}, Lm23/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_11
    iget-boolean v4, v2, Lf23/b;->e:Z

    if-nez v4, :cond_12

    sget-object v4, Lf23/a;->x:Lf23/a;

    invoke-virtual {v10, v4}, Lm23/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    const/4 v4, 0x0

    iput v4, v2, Lf23/b;->d:F

    iput v4, v2, Lf23/b;->c:F

    iput-boolean v5, v2, Lf23/b;->e:Z

    goto :goto_5

    :cond_13
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    iput v4, v2, Lf23/b;->c:F

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    iput v4, v2, Lf23/b;->d:F

    :cond_14
    :goto_5
    iget-object v2, v0, Lm23/d;->U:Lf23/a;

    if-nez v2, :cond_15

    const/4 v2, -0x1

    goto :goto_6

    :cond_15
    sget-object v4, Lm23/c;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    :goto_6
    if-eq v2, v3, :cond_17

    const/4 v15, 0x2

    if-eq v2, v15, :cond_17

    if-eq v2, v12, :cond_16

    const/4 v4, 0x4

    if-eq v2, v4, :cond_16

    goto :goto_7

    :cond_16
    invoke-virtual {v8, v1}, Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :cond_17
    iget-boolean v2, v0, Lm23/d;->x:Z

    if-eqz v2, :cond_19

    iget-boolean v2, v0, Lm23/d;->R:Z

    if-nez v2, :cond_19

    iget-boolean v2, v8, Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;->L0:Z

    if-eqz v2, :cond_19

    iget-object v2, v0, Lm23/d;->Q:Lg23/a;

    if-eqz v2, :cond_18

    invoke-virtual {v2, v6, v1}, Lg23/a;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :cond_18
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_19
    :goto_7
    return v3
.end method

.method public final e()Z
    .locals 4

    iget-object v0, p0, Lm23/d;->M:Lj23/b;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lm23/d;->getCurrentPosition$photoview_dialog_release()I

    move-result v1

    iget-object v0, v0, Lj23/b;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lj23/a;

    iget v3, v3, Lj23/a;->b:I

    if-ne v3, v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lj23/a;

    if-eqz v2, :cond_2

    iget-object v0, v2, Lj23/a;->d:Lio/getstream/photoview/PhotoView;

    invoke-virtual {v0}, Lio/getstream/photoview/PhotoView;->getScale()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final f(Ljava/util/ArrayList;ILi23/a;)V
    .locals 3

    const-string v0, "imageLoader"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm23/d;->V:Ljava/lang/Object;

    iput-object p3, p0, Lm23/d;->W:Li23/a;

    new-instance v0, Lj23/b;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, p0, Lm23/d;->w:Z

    invoke-direct {v0, v1, p1, p3, v2}, Lj23/b;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Li23/a;Z)V

    iput-object v0, p0, Lm23/d;->M:Lj23/b;

    iget-object p1, p0, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lfc/a;)V

    invoke-direct {p0, p2}, Lm23/d;->setStartPosition(I)V

    return-void
.end method

.method public final getContainerPadding$photoview_dialog_release()[I
    .locals 1

    iget-object v0, p0, Lm23/d;->E:[I

    return-object v0
.end method

.method public final getCurrentPosition$photoview_dialog_release()I
    .locals 1

    iget-object v0, p0, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    return v0
.end method

.method public final getImagesMargin$photoview_dialog_release()I
    .locals 1

    iget-object v0, p0, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getPageMargin()I

    move-result v0

    return v0
.end method

.method public final getOnDismiss$photoview_dialog_release()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lm23/d;->y:Lc93/a;

    return-object v0
.end method

.method public final getOnPageChange$photoview_dialog_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lm23/d;->z:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOverlayView$photoview_dialog_release()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lm23/d;->F:Landroid/view/View;

    return-object v0
.end method

.method public setBackgroundColor(I)V
    .locals 1

    const v0, 0x7f0a019e

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public final setContainerPadding$photoview_dialog_release([I)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm23/d;->E:[I

    return-void
.end method

.method public final setCurrentPosition$photoview_dialog_release(I)V
    .locals 1

    iget-object v0, p0, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method public final setImagesMargin$photoview_dialog_release(I)V
    .locals 1

    iget-object v0, p0, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setPageMargin(I)V

    return-void
.end method

.method public final setOnDismiss$photoview_dialog_release(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lm23/d;->y:Lc93/a;

    return-void
.end method

.method public final setOnPageChange$photoview_dialog_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lm23/d;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOverlayView$photoview_dialog_release(Landroid/view/View;)V
    .locals 1

    iput-object p1, p0, Lm23/d;->F:Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lm23/d;->G:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final setSwipeToDismissAllowed$photoview_dialog_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lm23/d;->x:Z

    return-void
.end method

.method public final setZoomingAllowed$photoview_dialog_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lm23/d;->w:Z

    return-void
.end method
