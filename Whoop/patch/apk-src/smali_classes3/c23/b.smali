.class public final Lc23/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lro/i;

.field public b:I

.field public c:I

.field public final d:Landroid/view/ScaleGestureDetector;

.field public e:Landroid/view/VelocityTracker;

.field public f:Z

.field public final g:F

.field public final h:F

.field public i:F

.field public j:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lro/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc23/b;->a:Lro/i;

    const/4 p2, -0x1

    iput p2, p0, Lc23/b;->b:I

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lc23/b;->g:F

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lc23/b;->h:F

    new-instance p2, Lc23/a;

    invoke-direct {p2, p0}, Lc23/a;-><init>(Lc23/b;)V

    new-instance v0, Landroid/view/ScaleGestureDetector;

    invoke-direct {v0, p1, p2}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lc23/b;->d:Landroid/view/ScaleGestureDetector;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lc23/b;->a:Lro/i;

    iget-object v2, v2, Lro/i;->x:Ljava/lang/Object;

    check-cast v2, Lc23/o;

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_19

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v7, :cond_10

    const/4 v8, 0x2

    if-eq v3, v8, :cond_3

    const/4 v2, 0x3

    if-eq v3, v2, :cond_2

    const/4 v2, 0x6

    if-eq v3, v2, :cond_0

    goto/16 :goto_f

    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const v3, 0xff00

    and-int/2addr v2, v3

    shr-int/lit8 v2, v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    iget v6, v0, Lc23/b;->b:I

    if-ne v3, v6, :cond_1b

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move v7, v5

    :goto_0
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, v0, Lc23/b;->b:I

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    iput v2, v0, Lc23/b;->i:F

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    iput v2, v0, Lc23/b;->j:F

    goto/16 :goto_f

    :cond_2
    iput v4, v0, Lc23/b;->b:I

    iget-object v2, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_1b

    invoke-virtual {v2}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v6, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    goto/16 :goto_f

    :cond_3
    :try_start_0
    iget v3, v0, Lc23/b;->c:I

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    :goto_1
    :try_start_1
    iget v6, v0, Lc23/b;->c:I

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    :goto_2
    iget v9, v0, Lc23/b;->i:F

    sub-float v9, v3, v9

    iget v10, v0, Lc23/b;->j:F

    sub-float v10, v6, v10

    iget-boolean v11, v0, Lc23/b;->f:Z

    if-nez v11, :cond_5

    mul-float v11, v9, v9

    mul-float v12, v10, v10

    add-float/2addr v12, v11

    float-to-double v11, v12

    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v11

    iget v13, v0, Lc23/b;->g:F

    float-to-double v13, v13

    cmpl-double v11, v11, v13

    if-ltz v11, :cond_4

    move v11, v7

    goto :goto_3

    :cond_4
    move v11, v5

    :goto_3
    iput-boolean v11, v0, Lc23/b;->f:Z

    :cond_5
    iget-boolean v11, v0, Lc23/b;->f:Z

    if-eqz v11, :cond_1b

    iget-object v11, v2, Lc23/o;->J:Lc23/b;

    if-eqz v11, :cond_6

    iget-object v12, v11, Lc23/b;->d:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v12}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v12

    if-ne v12, v7, :cond_6

    goto/16 :goto_6

    :cond_6
    iget-object v12, v2, Lc23/o;->R:Lc23/h;

    const/high16 v13, 0x3f800000    # 1.0f

    if-eqz v12, :cond_8

    check-cast v12, Lhn/p;

    iget-object v12, v12, Lhn/p;->x:Ljava/lang/Object;

    check-cast v12, Lio/getstream/photoview/PhotoView;

    invoke-virtual {v12}, Lio/getstream/photoview/PhotoView;->getScale()F

    move-result v14

    cmpg-float v14, v14, v13

    if-nez v14, :cond_7

    move v14, v7

    goto :goto_4

    :cond_7
    move v14, v5

    :goto_4
    invoke-virtual {v12, v14}, Lio/getstream/photoview/PhotoView;->setAllowParentInterceptOnEdge(Z)V

    :cond_8
    iget-object v12, v2, Lc23/o;->M:Landroid/graphics/Matrix;

    invoke-virtual {v12, v9, v10}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {v2}, Lc23/o;->a()V

    iget-object v12, v2, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v12

    iget-boolean v14, v2, Lc23/o;->G:Z

    if-eqz v14, :cond_e

    if-eqz v11, :cond_9

    iget-object v11, v11, Lc23/b;->d:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v11}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v11

    if-ne v11, v7, :cond_9

    goto :goto_5

    :cond_9
    iget-boolean v11, v2, Lc23/o;->H:Z

    if-nez v11, :cond_e

    iget v11, v2, Lc23/o;->T:I

    if-eq v11, v8, :cond_d

    if-nez v11, :cond_a

    cmpl-float v8, v9, v13

    if-gez v8, :cond_d

    :cond_a
    const/high16 v8, -0x40800000    # -1.0f

    if-ne v11, v7, :cond_b

    cmpg-float v9, v9, v8

    if-lez v9, :cond_d

    :cond_b
    iget v2, v2, Lc23/o;->U:I

    if-nez v2, :cond_c

    cmpl-float v9, v10, v13

    if-gez v9, :cond_d

    :cond_c
    if-ne v2, v7, :cond_f

    cmpg-float v2, v10, v8

    if-gtz v2, :cond_f

    :cond_d
    if-eqz v12, :cond_f

    invoke-interface {v12, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_6

    :cond_e
    :goto_5
    if-eqz v12, :cond_f

    invoke-interface {v12, v7}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_f
    :goto_6
    iput v3, v0, Lc23/b;->i:F

    iput v6, v0, Lc23/b;->j:F

    iget-object v2, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_1b

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    goto/16 :goto_f

    :cond_10
    iput v4, v0, Lc23/b;->b:I

    iget-boolean v3, v0, Lc23/b;->f:Z

    if-eqz v3, :cond_18

    iget-object v3, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    if-eqz v3, :cond_18

    :try_start_2
    iget v3, v0, Lc23/b;->c:I

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :catch_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    :goto_7
    iput v3, v0, Lc23/b;->i:F

    :try_start_3
    iget v3, v0, Lc23/b;->c:I

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_8

    :catch_3
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    :goto_8
    iput v3, v0, Lc23/b;->j:F

    iget-object v3, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object v3, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v7, 0x3e8

    invoke-virtual {v3, v7}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object v3, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v3

    iget-object v7, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v7}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v7

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v9

    cmpg-float v10, v8, v9

    if-gez v10, :cond_11

    move v8, v9

    :cond_11
    iget v9, v0, Lc23/b;->h:F

    cmpl-float v8, v8, v9

    if-ltz v8, :cond_18

    neg-float v3, v3

    neg-float v7, v7

    iget-object v8, v2, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    new-instance v9, Lc23/l;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v9, v2, v10}, Lc23/l;-><init>(Lc23/o;Landroid/content/Context;)V

    iput-object v9, v2, Lc23/o;->S:Lc23/l;

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v10

    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    move-result v11

    sub-int/2addr v10, v11

    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    move-result v11

    sub-int/2addr v10, v11

    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v11

    invoke-virtual {v8}, Landroid/view/View;->getPaddingTop()I

    move-result v12

    sub-int/2addr v11, v12

    invoke-virtual {v8}, Landroid/view/View;->getPaddingBottom()I

    move-result v12

    sub-int/2addr v11, v12

    float-to-int v15, v3

    float-to-int v3, v7

    invoke-virtual {v2}, Lc23/o;->b()Z

    invoke-virtual {v2}, Lc23/o;->c()Landroid/graphics/Matrix;

    move-result-object v7

    iget-object v12, v2, Lc23/o;->N:Landroid/graphics/RectF;

    invoke-virtual {v8}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v13

    if-eqz v13, :cond_12

    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v13

    int-to-float v13, v13

    const/4 v4, 0x0

    invoke-virtual {v12, v4, v4, v14, v13}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v7, v12}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    goto :goto_9

    :cond_12
    move-object v12, v6

    :goto_9
    if-nez v12, :cond_13

    goto :goto_c

    :cond_13
    iget v4, v12, Landroid/graphics/RectF;->left:F

    neg-float v4, v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v13

    int-to-float v4, v10

    invoke-virtual {v12}, Landroid/graphics/RectF;->width()F

    move-result v7

    cmpg-float v7, v4, v7

    if-gez v7, :cond_14

    invoke-virtual {v12}, Landroid/graphics/RectF;->width()F

    move-result v7

    sub-float/2addr v7, v4

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v4

    move/from16 v17, v5

    goto :goto_a

    :cond_14
    move v4, v13

    move/from16 v17, v4

    :goto_a
    iget v7, v12, Landroid/graphics/RectF;->top:F

    neg-float v7, v7

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v14

    int-to-float v7, v11

    invoke-virtual {v12}, Landroid/graphics/RectF;->height()F

    move-result v10

    cmpg-float v10, v7, v10

    if-gez v10, :cond_15

    invoke-virtual {v12}, Landroid/graphics/RectF;->height()F

    move-result v10

    sub-float/2addr v10, v7

    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v7

    move/from16 v19, v5

    goto :goto_b

    :cond_15
    move v7, v14

    move/from16 v19, v7

    :goto_b
    iput v13, v9, Lc23/l;->x:I

    iput v14, v9, Lc23/l;->y:I

    if-ne v13, v4, :cond_16

    if-eq v14, v7, :cond_17

    :cond_16
    const/16 v21, 0x0

    const/16 v22, 0x0

    iget-object v12, v9, Lc23/l;->w:Landroid/widget/OverScroller;

    move/from16 v16, v3

    move/from16 v18, v4

    move/from16 v20, v7

    invoke-virtual/range {v12 .. v22}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    :cond_17
    :goto_c
    iget-object v2, v2, Lc23/o;->S:Lc23/l;

    invoke-virtual {v8, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_18
    iget-object v2, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_1b

    invoke-virtual {v2}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v6, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    goto :goto_f

    :cond_19
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, v0, Lc23/b;->b:I

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, v0, Lc23/b;->e:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_1a

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_1a
    :try_start_4
    iget v2, v0, Lc23/b;->c:I

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_d

    :catch_4
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    :goto_d
    iput v2, v0, Lc23/b;->i:F

    :try_start_5
    iget v2, v0, Lc23/b;->c:I

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_e

    :catch_5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    :goto_e
    iput v2, v0, Lc23/b;->j:F

    iput-boolean v5, v0, Lc23/b;->f:Z

    :cond_1b
    :goto_f
    iget v2, v0, Lc23/b;->b:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1c

    move v5, v2

    :cond_1c
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    iput v1, v0, Lc23/b;->c:I

    return-void
.end method
