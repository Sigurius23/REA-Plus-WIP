.class public final Lu2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public final b:Landroid/util/SparseLongArray;

.field public final c:Landroid/util/SparseBooleanArray;

.field public final d:Ljava/util/ArrayList;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseLongArray;

    invoke-direct {v0}, Landroid/util/SparseLongArray;-><init>()V

    iput-object v0, p0, Lu2/g;->b:Landroid/util/SparseLongArray;

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lu2/g;->c:Landroid/util/SparseBooleanArray;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lu2/g;->d:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lu2/g;->e:I

    iput v0, p0, Lu2/g;->f:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Lso/q;
    .locals 47

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    iget-object v4, v0, Lu2/g;->b:Landroid/util/SparseLongArray;

    iget-object v5, v0, Lu2/g;->c:Landroid/util/SparseBooleanArray;

    const/4 v6, 0x3

    if-eq v3, v6, :cond_20

    const/4 v7, 0x4

    if-eq v3, v7, :cond_20

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v8, v10, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v8

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v11

    iget v12, v0, Lu2/g;->e:I

    if-ne v8, v12, :cond_1

    iget v12, v0, Lu2/g;->f:I

    if-eq v11, v12, :cond_2

    :cond_1
    iput v8, v0, Lu2/g;->e:I

    iput v11, v0, Lu2/g;->f:I

    invoke-virtual {v5}, Landroid/util/SparseBooleanArray;->clear()V

    invoke-virtual {v4}, Landroid/util/SparseLongArray;->clear()V

    :cond_2
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v8

    const/16 v13, 0x9

    if-eqz v8, :cond_5

    const/4 v14, 0x5

    if-eq v8, v14, :cond_5

    if-eq v8, v13, :cond_4

    :cond_3
    const-wide/16 v16, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v8

    invoke-virtual {v4, v8}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result v14

    if-gez v14, :cond_3

    iget-wide v14, v0, Lu2/g;->a:J

    const-wide/16 v16, 0x1

    add-long v11, v14, v16

    iput-wide v11, v0, Lu2/g;->a:J

    invoke-virtual {v4, v8, v14, v15}, Landroid/util/SparseLongArray;->put(IJ)V

    goto :goto_1

    :cond_5
    const-wide/16 v16, 0x1

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v8

    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v11

    invoke-virtual {v4, v11}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result v12

    if-gez v12, :cond_6

    iget-wide v14, v0, Lu2/g;->a:J

    add-long v9, v14, v16

    iput-wide v9, v0, Lu2/g;->a:J

    invoke-virtual {v4, v11, v14, v15}, Landroid/util/SparseLongArray;->put(IJ)V

    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v8

    if-ne v8, v6, :cond_6

    const/4 v8, 0x1

    invoke-virtual {v5, v11, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    :cond_6
    :goto_1
    const/16 v8, 0xa

    if-eq v3, v13, :cond_8

    const/4 v9, 0x7

    if-eq v3, v9, :cond_8

    if-ne v3, v8, :cond_7

    goto :goto_2

    :cond_7
    const/4 v9, 0x0

    goto :goto_3

    :cond_8
    :goto_2
    const/4 v9, 0x1

    :goto_3
    const/16 v10, 0x8

    if-ne v3, v10, :cond_9

    const/4 v11, 0x1

    goto :goto_4

    :cond_9
    const/4 v11, 0x0

    :goto_4
    if-eqz v9, :cond_a

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v14

    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v14

    const/4 v15, 0x1

    invoke-virtual {v5, v14, v15}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_5

    :cond_a
    const/4 v15, 0x1

    :goto_5
    const/4 v12, 0x6

    if-eq v3, v15, :cond_c

    if-eq v3, v12, :cond_b

    const/4 v3, -0x1

    goto :goto_6

    :cond_b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    goto :goto_6

    :cond_c
    const/4 v3, 0x0

    :goto_6
    iget-object v15, v0, Lu2/g;->d:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v14

    const/4 v12, 0x0

    :goto_7
    if-ge v12, v14, :cond_1a

    if-nez v9, :cond_e

    if-eq v12, v3, :cond_e

    if-eqz v11, :cond_d

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v19

    if-eqz v19, :cond_e

    :cond_d
    const/16 v29, 0x1

    goto :goto_8

    :cond_e
    const/16 v29, 0x0

    :goto_8
    invoke-virtual {v1, v12}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v13

    invoke-virtual {v4, v13}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result v8

    if-ltz v8, :cond_f

    invoke-virtual {v4, v8}, Landroid/util/SparseLongArray;->valueAt(I)J

    move-result-wide v20

    move/from16 v39, v9

    move/from16 v38, v11

    move-wide/from16 v21, v20

    goto :goto_9

    :cond_f
    move/from16 v38, v11

    iget-wide v10, v0, Lu2/g;->a:J

    move/from16 v39, v9

    add-long v8, v10, v16

    iput-wide v8, v0, Lu2/g;->a:J

    invoke-virtual {v4, v13, v10, v11}, Landroid/util/SparseLongArray;->put(IJ)V

    move-wide/from16 v21, v10

    :goto_9
    invoke-virtual {v1, v12}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result v30

    invoke-virtual {v1, v12}, Landroid/view/MotionEvent;->getX(I)F

    move-result v8

    invoke-virtual {v1, v12}, Landroid/view/MotionEvent;->getY(I)F

    move-result v9

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v10, v8

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    const/16 v13, 0x20

    shl-long/2addr v10, v13

    const-wide v23, 0xffffffffL

    and-long v8, v8, v23

    or-long/2addr v8, v10

    const/4 v10, 0x0

    invoke-static {v10, v10, v8, v9, v6}, Lh2/b;->a(FFJI)J

    move-result-wide v36

    if-nez v12, :cond_10

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v8

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v9

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    move/from16 v25, v10

    int-to-long v10, v8

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    shl-long/2addr v10, v13

    and-long v8, v8, v23

    or-long/2addr v8, v10

    invoke-virtual {v2, v8, v9}, Landroidx/compose/ui/platform/AndroidComposeView;->K(J)J

    move-result-wide v10

    :goto_a
    move-wide/from16 v27, v10

    goto :goto_b

    :cond_10
    move/from16 v25, v10

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1d

    if-lt v10, v11, :cond_11

    invoke-static {v1, v12}, Lu2/h;->a(Landroid/view/MotionEvent;I)J

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, Landroidx/compose/ui/platform/AndroidComposeView;->K(J)J

    move-result-wide v10

    goto :goto_a

    :cond_11
    invoke-virtual {v2, v8, v9}, Landroidx/compose/ui/platform/AndroidComposeView;->v(J)J

    move-result-wide v10

    move-wide/from16 v27, v8

    move-wide v8, v10

    :goto_b
    invoke-virtual {v1, v12}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v10

    if-eqz v10, :cond_12

    const/4 v11, 0x1

    if-eq v10, v11, :cond_16

    const/4 v11, 0x2

    if-eq v10, v11, :cond_15

    if-eq v10, v6, :cond_14

    if-eq v10, v7, :cond_13

    :cond_12
    const/16 v31, 0x0

    goto :goto_c

    :cond_13
    move/from16 v31, v7

    goto :goto_c

    :cond_14
    move/from16 v31, v11

    goto :goto_c

    :cond_15
    move/from16 v31, v6

    goto :goto_c

    :cond_16
    const/16 v31, 0x1

    :goto_c
    new-instance v10, Ljava/util/ArrayList;

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v11

    const/4 v6, 0x0

    :goto_d
    if-ge v6, v11, :cond_18

    invoke-virtual {v1, v12, v6}, Landroid/view/MotionEvent;->getHistoricalX(II)F

    move-result v26

    invoke-virtual {v1, v12, v6}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    move-result v32

    invoke-static/range {v26 .. v26}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v33

    const v34, 0x7fffffff

    and-int v7, v33, v34

    move/from16 v33, v13

    const/high16 v13, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v7, v13, :cond_17

    invoke-static/range {v32 .. v32}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    and-int v7, v7, v34

    if-ge v7, v13, :cond_17

    invoke-static/range {v26 .. v26}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    move v13, v3

    int-to-long v2, v7

    invoke-static/range {v32 .. v32}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    move-wide/from16 v34, v2

    int-to-long v2, v7

    shl-long v34, v34, v33

    and-long v2, v2, v23

    or-long v43, v34, v2

    new-instance v40, Lu2/c;

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getHistoricalEventTime(I)J

    move-result-wide v41

    move-wide/from16 v45, v43

    invoke-direct/range {v40 .. v46}, Lu2/c;-><init>(JJJ)V

    move-object/from16 v2, v40

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_17
    move v13, v3

    :goto_e
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v2, p2

    move v3, v13

    move/from16 v13, v33

    const/4 v7, 0x4

    goto :goto_d

    :cond_18
    move/from16 v33, v13

    move v13, v3

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_19

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v6

    const/16 v7, 0x9

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v11

    neg-float v11, v11

    add-float v11, v11, v25

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v2, v6

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    move-wide/from16 v25, v8

    int-to-long v7, v6

    shl-long v2, v2, v33

    and-long v6, v7, v23

    or-long/2addr v2, v6

    :goto_f
    move-wide/from16 v34, v2

    goto :goto_10

    :cond_19
    move-wide/from16 v25, v8

    const-wide/16 v2, 0x0

    goto :goto_f

    :goto_10
    invoke-virtual {v1, v12}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v32

    new-instance v20, Lu2/t;

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v23

    move-object/from16 v33, v10

    invoke-direct/range {v20 .. v37}, Lu2/t;-><init>(JJJJZFIZLjava/util/ArrayList;JJ)V

    move-object/from16 v2, v20

    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, p2

    move v3, v13

    move/from16 v11, v38

    move/from16 v9, v39

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/16 v8, 0xa

    const/16 v10, 0x8

    const/16 v13, 0x9

    goto/16 :goto_7

    :cond_1a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v8, 0x1

    if-eq v2, v8, :cond_1b

    const/4 v3, 0x6

    if-eq v2, v3, :cond_1b

    const/4 v3, 0x0

    goto :goto_11

    :cond_1b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v6

    if-nez v6, :cond_1c

    invoke-virtual {v4, v2}, Landroid/util/SparseLongArray;->delete(I)V

    invoke-virtual {v5, v2}, Landroid/util/SparseBooleanArray;->delete(I)V

    :cond_1c
    :goto_11
    invoke-virtual {v4}, Landroid/util/SparseLongArray;->size()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v6

    if-le v2, v6, :cond_1f

    invoke-virtual {v4}, Landroid/util/SparseLongArray;->size()I

    move-result v2

    const/16 v18, 0x1

    add-int/lit8 v2, v2, -0x1

    const/4 v6, -0x1

    :goto_12
    if-ge v6, v2, :cond_1f

    invoke-virtual {v4, v2}, Landroid/util/SparseLongArray;->keyAt(I)I

    move-result v7

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v8

    move v9, v3

    :goto_13
    if-ge v9, v8, :cond_1e

    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v10

    if-ne v10, v7, :cond_1d

    goto :goto_14

    :cond_1d
    add-int/lit8 v9, v9, 0x1

    goto :goto_13

    :cond_1e
    invoke-virtual {v4, v2}, Landroid/util/SparseLongArray;->removeAt(I)V

    invoke-virtual {v5, v7}, Landroid/util/SparseBooleanArray;->delete(I)V

    :goto_14
    add-int/lit8 v2, v2, -0x1

    goto :goto_12

    :cond_1f
    new-instance v2, Lso/q;

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    invoke-direct {v2, v15, v1}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_20
    invoke-virtual {v4}, Landroid/util/SparseLongArray;->clear()V

    invoke-virtual {v5}, Landroid/util/SparseBooleanArray;->clear()V

    const/4 v1, 0x0

    return-object v1
.end method
