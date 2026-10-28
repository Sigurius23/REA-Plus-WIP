.class public abstract Lou/e;
.super Lou/a;
.source "SourceFile"


# instance fields
.field public final i:F

.field public j:F

.field public final k:Lng3/o;

.field public final l:Ljava/util/ArrayList;

.field public final m:Ljava/util/HashMap;

.field public n:Landroid/graphics/PointF;

.field public o:Landroid/util/DisplayMetrics;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lou/a;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    new-instance p2, Lng3/o;

    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lng3/o;-><init>(IZ)V

    iput-object p2, p0, Lou/e;->k:Lng3/o;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lou/e;->l:Ljava/util/ArrayList;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lou/e;->m:Ljava/util/HashMap;

    new-instance p2, Landroid/graphics/PointF;

    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    iput-object p2, p0, Lou/e;->n:Landroid/graphics/PointF;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledEdgeSlop()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lou/e;->i:F

    invoke-virtual {p0}, Lou/e;->f()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lou/e;->f()V

    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    iget-object v4, v0, Lou/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v6, v0, Lou/e;->k:Lng3/o;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x1

    const/16 v7, 0x8

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0xff

    if-nez v5, :cond_1

    move-wide v12, v8

    goto :goto_2

    :cond_1
    sub-int v12, v3, v5

    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    move-result v12

    if-le v12, v6, :cond_2

    :goto_0
    move-wide v12, v10

    goto :goto_2

    :cond_2
    if-le v3, v5, :cond_3

    const-wide/16 v12, 0x5

    goto :goto_2

    :cond_3
    if-ge v3, v5, :cond_4

    goto :goto_0

    :cond_4
    if-ne v3, v6, :cond_5

    const-wide/16 v12, 0x1

    goto :goto_1

    :cond_5
    const-wide/16 v12, 0x6

    :goto_1
    shl-long/2addr v12, v7

    const-wide/16 v14, 0x2

    add-long/2addr v12, v14

    :goto_2
    int-to-long v14, v2

    cmp-long v3, v14, v12

    const/4 v5, 0x2

    const/16 v16, 0x0

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    cmp-long v3, v12, v8

    if-eqz v3, :cond_9

    and-long v17, v12, v10

    cmp-long v3, v14, v17

    if-nez v3, :cond_8

    :goto_4
    if-ne v2, v5, :cond_7

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_9

    goto :goto_5

    :cond_7
    move/from16 v3, v16

    goto :goto_6

    :cond_8
    shr-long/2addr v12, v7

    goto :goto_3

    :cond_9
    move v3, v6

    :goto_6
    iget-object v7, v0, Lou/e;->m:Ljava/util/HashMap;

    if-eqz v3, :cond_b

    instance-of v8, v0, Lou/h;

    if-eqz v8, :cond_a

    move-object v8, v0

    check-cast v8, Lou/h;

    iget-boolean v9, v8, Lou/h;->q:Z

    if-eqz v9, :cond_a

    invoke-virtual {v8}, Lou/h;->i()V

    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v7}, Ljava/util/HashMap;->clear()V

    :cond_b
    if-eqz v3, :cond_c

    if-nez v2, :cond_10

    :cond_c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v8

    if-eqz v8, :cond_f

    const/4 v9, 0x5

    if-ne v8, v9, :cond_d

    goto :goto_7

    :cond_d
    if-eq v8, v6, :cond_e

    const/4 v9, 0x6

    if-ne v8, v9, :cond_10

    :cond_e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v8

    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_f
    :goto_7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v8

    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    :goto_8
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    move/from16 v11, v16

    :goto_9
    if-ge v11, v8, :cond_11

    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    move-result v12

    add-float/2addr v9, v12

    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    move-result v12

    add-float/2addr v10, v12

    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_11
    new-instance v1, Landroid/graphics/PointF;

    int-to-float v8, v8

    div-float/2addr v9, v8

    div-float/2addr v10, v8

    invoke-direct {v1, v9, v10}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v1, v0, Lou/e;->n:Landroid/graphics/PointF;

    if-eqz v3, :cond_12

    const-string v1, "MultiFingerGesture"

    const-string v2, "Some MotionEvents were not passed to the library or events from different view trees are merged."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v16

    :cond_12
    if-ne v2, v5, :cond_15

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0}, Lou/e;->d()I

    move-result v2

    if-lt v1, v2, :cond_15

    iget-object v1, v0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPressure()F

    move-result v1

    iget-object v2, v0, Lou/a;->e:Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getPressure()F

    move-result v2

    div-float/2addr v1, v2

    const v2, 0x3f2b851f    # 0.67f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_15

    invoke-virtual {v7}, Ljava/util/HashMap;->clear()V

    move/from16 v1, v16

    :goto_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v6

    if-ge v1, v2, :cond_14

    add-int/lit8 v2, v1, 0x1

    move v3, v2

    :goto_b
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v3, v5, :cond_13

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v11, v0, Lou/a;->e:Landroid/view/MotionEvent;

    invoke-virtual {v11, v8}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v12

    invoke-virtual {v11, v12}, Landroid/view/MotionEvent;->getX(I)F

    move-result v11

    iget-object v12, v0, Lou/a;->e:Landroid/view/MotionEvent;

    invoke-virtual {v12, v8}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/view/MotionEvent;->getY(I)F

    move-result v12

    iget-object v13, v0, Lou/a;->e:Landroid/view/MotionEvent;

    invoke-virtual {v13, v10}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v14

    invoke-virtual {v13, v14}, Landroid/view/MotionEvent;->getX(I)F

    move-result v13

    iget-object v14, v0, Lou/a;->e:Landroid/view/MotionEvent;

    invoke-virtual {v14, v10}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v15

    invoke-virtual {v14, v15}, Landroid/view/MotionEvent;->getY(I)F

    move-result v14

    sub-float/2addr v13, v11

    sub-float/2addr v14, v12

    iget-object v11, v0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v11, v8}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v12

    invoke-virtual {v11, v12}, Landroid/view/MotionEvent;->getX(I)F

    move-result v11

    iget-object v12, v0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v12, v8}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v8

    invoke-virtual {v12, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v8

    iget-object v12, v0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v12, v10}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v15

    invoke-virtual {v12, v15}, Landroid/view/MotionEvent;->getX(I)F

    move-result v12

    iget-object v15, v0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v15, v10}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v10

    invoke-virtual {v15, v10}, Landroid/view/MotionEvent;->getY(I)F

    move-result v10

    sub-float/2addr v12, v11

    sub-float/2addr v10, v8

    new-instance v8, Lou/g;

    invoke-direct {v8, v5, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lou/d;

    invoke-direct {v5, v13, v14, v12, v10}, Lou/d;-><init>(FFFF)V

    invoke-virtual {v7, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_13
    move v1, v2

    goto/16 :goto_a

    :cond_14
    invoke-virtual {v0}, Lou/e;->e()Z

    move-result v1

    if-nez v1, :cond_15

    invoke-virtual {v0}, Lou/e;->c()Z

    move-result v1

    return v1

    :cond_15
    return v16
.end method

.method public b(I)Z
    .locals 0

    invoke-super {p0, p1}, Lou/a;->b(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lou/e;->e()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public e()Z
    .locals 10

    iget-object v0, p0, Lou/e;->o:Landroid/util/DisplayMetrics;

    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    iget v2, p0, Lou/e;->i:F

    sub-float/2addr v1, v2

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v0, v0

    sub-float/2addr v0, v2

    iget-object v3, p0, Lou/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v5, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    iget-object v5, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getRawX()F

    move-result v6

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    sub-float/2addr v6, v7

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v7

    const/4 v8, 0x0

    if-ge v4, v7, :cond_1

    invoke-virtual {v5, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    add-float/2addr v5, v6

    goto :goto_0

    :cond_1
    move v5, v8

    :goto_0
    iget-object v6, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v6}, Landroid/view/MotionEvent;->getRawY()F

    move-result v7

    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    sub-float/2addr v7, v9

    invoke-virtual {v6}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v9

    if-ge v4, v9, :cond_2

    invoke-virtual {v6, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    add-float v8, v4, v7

    :cond_2
    cmpg-float v4, v5, v2

    if-ltz v4, :cond_5

    cmpg-float v4, v8, v2

    if-ltz v4, :cond_5

    cmpl-float v4, v5, v1

    if-gtz v4, :cond_5

    cmpl-float v4, v8, v0

    if-lez v4, :cond_0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lou/e;->m:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lou/d;

    iget v1, v1, Lou/d;->e:F

    iget v2, p0, Lou/e;->j:F

    cmpg-float v1, v1, v2

    if-gez v1, :cond_4

    :cond_5
    :goto_1
    const/4 v0, 0x1

    return v0

    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lou/a;->b:Landroid/view/WindowManager;

    if-eqz v0, :cond_0

    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v1, p0, Lou/e;->o:Landroid/util/DisplayMetrics;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lou/e;->o:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    return-void

    :cond_0
    iget-object v0, p0, Lou/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iput-object v0, p0, Lou/e;->o:Landroid/util/DisplayMetrics;

    return-void
.end method

.method public abstract g()V
.end method
