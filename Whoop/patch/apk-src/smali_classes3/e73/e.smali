.class public final Le73/e;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"


# instance fields
.field public final E:Z

.field public final F:Z

.field public final G:Landroid/graphics/Rect;

.field public final H:Landroid/graphics/Paint;

.field public I:I

.field public J:I

.field public final w:Lc9/k;

.field public final x:Ljava/util/List;

.field public final y:Ljava/util/ArrayList;

.field public final z:Landroid/text/TextPaint;


# direct methods
.method public constructor <init>(Lc9/k;Ljava/util/ArrayList;ZZ)V
    .locals 2

    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Le73/e;->G:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Le73/e;->H:Landroid/graphics/Paint;

    iput-object p1, p0, Le73/e;->w:Lc9/k;

    iput-object p2, p0, Le73/e;->x:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Le73/e;->y:Ljava/util/ArrayList;

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Le73/e;->z:Landroid/text/TextPaint;

    iput-boolean p3, p0, Le73/e;->E:Z

    iput-boolean p4, p0, Le73/e;->F:Z

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v3, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move-object/from16 v7, p9

    instance-of v8, v0, Landroid/text/Spanned;

    const-class v9, Lc73/j;

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v8, :cond_3

    move-object v8, v0

    check-cast v8, Landroid/text/Spanned;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v12

    invoke-interface {v8, v11, v12, v9}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Lc73/j;

    if-eqz v12, :cond_0

    array-length v13, v12

    if-lez v13, :cond_0

    aget-object v12, v12, v11

    iget-object v12, v12, Lc73/j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v12}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/text/Layout;

    goto :goto_0

    :cond_0
    move-object v12, v10

    :goto_0
    if-eqz v12, :cond_1

    invoke-virtual {v12}, Landroid/text/Layout;->getWidth()I

    move-result v8

    goto :goto_2

    :cond_1
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v12

    const-class v13, Lc73/k;

    invoke-interface {v8, v11, v12, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Lc73/k;

    if-eqz v8, :cond_3

    array-length v12, v8

    if-gtz v12, :cond_2

    goto :goto_1

    :cond_2
    aget-object v0, v8, v11

    throw v10

    :cond_3
    :goto_1
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v8

    :goto_2
    iget v12, v1, Le73/e;->I:I

    iget-boolean v15, v1, Le73/e;->E:Z

    move-object/from16 p7, v10

    iget-object v10, v1, Le73/e;->y:Ljava/util/ArrayList;

    const/high16 v16, 0x3f800000    # 1.0f

    const/high16 v17, 0x3f000000    # 0.5f

    iget-object v14, v1, Le73/e;->w:Lc9/k;

    if-eq v12, v8, :cond_b

    iput v8, v1, Le73/e;->I:I

    instance-of v8, v7, Landroid/text/TextPaint;

    iget-object v12, v1, Le73/e;->z:Landroid/text/TextPaint;

    if-eqz v8, :cond_4

    move-object v8, v7

    check-cast v8, Landroid/text/TextPaint;

    invoke-virtual {v12, v8}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v12, v7}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    :goto_3
    invoke-virtual {v12, v15}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    iget-object v8, v1, Le73/e;->x:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    iget v13, v14, Lc9/k;->x:I

    move-object/from16 v20, v12

    const/4 v12, 0x2

    mul-int/2addr v13, v12

    iget v12, v1, Le73/e;->I:I

    int-to-float v12, v12

    mul-float v12, v12, v16

    int-to-float v11, v11

    div-float/2addr v12, v11

    add-float v12, v12, v17

    float-to-int v11, v12

    sub-int v21, v11, v13

    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_4
    if-ge v12, v11, :cond_b

    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Le73/d;

    move-object/from16 v27, v8

    iget-object v8, v13, Le73/d;->b:Lz63/g;

    new-instance v18, Landroid/text/StaticLayout;

    iget v13, v13, Le73/d;->a:I

    move-object/from16 v19, v8

    const/4 v8, 0x1

    if-eq v13, v8, :cond_6

    const/4 v8, 0x2

    if-eq v13, v8, :cond_5

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :goto_5
    move-object/from16 v22, v13

    goto :goto_6

    :cond_5
    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_5

    :cond_6
    const/4 v8, 0x2

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_5

    :goto_6
    const/16 v24, 0x0

    const/16 v25, 0x0

    const/high16 v23, 0x3f800000    # 1.0f

    invoke-direct/range {v18 .. v25}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    move-object/from16 v8, v18

    move-object/from16 v13, v19

    move/from16 v18, v11

    invoke-virtual {v13}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    move/from16 v19, v15

    const/4 v15, 0x0

    invoke-virtual {v13, v15, v11, v9}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Lc73/j;

    if-eqz v11, :cond_7

    array-length v15, v11

    move-object/from16 v22, v9

    const/4 v9, 0x0

    :goto_7
    if-ge v9, v15, :cond_8

    move/from16 v23, v9

    aget-object v9, v11, v23

    invoke-virtual {v13, v9}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v9, v23, 0x1

    goto :goto_7

    :cond_7
    move-object/from16 v22, v9

    :cond_8
    new-instance v9, Lc73/j;

    invoke-direct {v9, v8}, Lc73/j;-><init>(Landroid/text/StaticLayout;)V

    invoke-virtual {v13}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    const/16 v15, 0x12

    const/4 v6, 0x0

    invoke-virtual {v13, v9, v6, v11, v15}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v13}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v9

    const-class v11, Lg73/b;

    invoke-virtual {v13, v6, v9, v11}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Lg73/b;

    if-eqz v9, :cond_a

    array-length v11, v9

    if-lez v11, :cond_a

    array-length v11, v9

    if-gtz v11, :cond_9

    goto :goto_8

    :cond_9
    aget-object v0, v9, v6

    throw p7

    :cond_a
    :goto_8
    invoke-virtual {v10, v12, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v11, v18

    move/from16 v15, v19

    move-object/from16 v9, v22

    move-object/from16 v8, v27

    goto/16 :goto_4

    :cond_b
    move/from16 v19, v15

    iget v6, v14, Lc9/k;->x:I

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v8

    iget v9, v1, Le73/e;->I:I

    int-to-float v11, v9

    mul-float v11, v11, v16

    int-to-float v12, v8

    div-float/2addr v11, v12

    add-float v11, v11, v17

    float-to-int v11, v11

    div-int/2addr v9, v8

    sub-int v9, v11, v9

    iget-object v12, v1, Le73/e;->H:Landroid/graphics/Paint;

    if-eqz v19, :cond_c

    const/4 v15, 0x0

    invoke-virtual {v12, v15}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v13, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_9

    :cond_c
    iget-boolean v13, v1, Le73/e;->F:Z

    if-eqz v13, :cond_d

    invoke-virtual {v12}, Landroid/graphics/Paint;->getColor()I

    move-result v13

    const/16 v15, 0x16

    invoke-static {v13, v15}, Ltx/f;->t(II)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v13, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_9

    :cond_d
    const/4 v15, 0x0

    invoke-virtual {v12, v15}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v13, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :goto_9
    invoke-virtual {v12}, Landroid/graphics/Paint;->getColor()I

    move-result v13

    iget-object v15, v1, Le73/e;->G:Landroid/graphics/Rect;

    if-eqz v13, :cond_e

    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    move-result v13

    move/from16 p7, v9

    :try_start_0
    iget v9, v1, Le73/e;->I:I

    move/from16 v16, v11

    sub-int v11, p8, v5

    move/from16 v18, v6

    const/4 v6, 0x0

    invoke-virtual {v15, v6, v6, v9, v11}, Landroid/graphics/Rect;->set(IIII)V

    int-to-float v6, v5

    invoke-virtual {v2, v4, v6}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v2, v15, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v13}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_a

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v13}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_e
    move/from16 v18, v6

    move/from16 p7, v9

    move/from16 v16, v11

    :goto_a
    invoke-virtual {v12, v7}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    invoke-virtual {v12}, Landroid/graphics/Paint;->getColor()I

    move-result v6

    const/16 v7, 0x4b

    invoke-static {v6, v7}, Ltx/f;->t(II)I

    move-result v6

    invoke-virtual {v12, v6}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v12, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v6, v14, Lc9/k;->y:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_f

    invoke-virtual {v12}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v6

    add-float v6, v6, v17

    float-to-int v6, v6

    :cond_f
    if-lez v6, :cond_10

    const/4 v7, 0x1

    goto :goto_b

    :cond_10
    const/4 v7, 0x0

    :goto_b
    sub-int v9, p8, v5

    iget v11, v1, Le73/e;->J:I

    sub-int v11, v9, v11

    div-int/lit8 v11, v11, 0x4

    if-eqz v7, :cond_12

    move-object v13, v0

    check-cast v13, Landroid/text/Spanned;

    const-class v14, Le73/f;

    move/from16 p9, v7

    move/from16 v7, p4

    invoke-interface {v13, v3, v7, v14}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Le73/f;

    if-eqz v7, :cond_11

    array-length v13, v7

    if-lez v13, :cond_11

    const/16 v26, 0x0

    aget-object v7, v7, v26

    invoke-static {v0, v7, v3}, Luf/c0;->j0(Ljava/lang/CharSequence;Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_11

    float-to-int v0, v4

    iget v3, v1, Le73/e;->I:I

    add-int v7, v5, v6

    invoke-virtual {v15, v0, v5, v3, v7}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v2, v15, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    const/4 v13, 0x1

    goto :goto_c

    :cond_11
    const/4 v13, 0x0

    :goto_c
    float-to-int v0, v4

    sub-int v3, p8, v6

    iget v7, v1, Le73/e;->I:I

    move/from16 v14, p8

    invoke-virtual {v15, v0, v3, v7, v14}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v2, v15, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_d

    :cond_12
    move/from16 p9, v7

    const/4 v13, 0x0

    :goto_d
    div-int/lit8 v0, v6, 0x2

    if-eqz v13, :cond_13

    move v3, v6

    goto :goto_e

    :cond_13
    const/4 v3, 0x0

    :goto_e
    sub-int/2addr v9, v6

    const/4 v7, 0x0

    const/4 v13, 0x0

    :goto_f
    if-ge v7, v8, :cond_17

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    move-result v1

    mul-int v4, v7, v16

    int-to-float v4, v4

    add-float v4, p5, v4

    move/from16 v17, v8

    int-to-float v8, v5

    :try_start_1
    invoke-virtual {v2, v4, v8}, Landroid/graphics/Canvas;->translate(FF)V

    if-eqz p9, :cond_15

    if-nez v7, :cond_14

    const/4 v4, 0x0

    invoke-virtual {v15, v4, v3, v6, v9}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_10

    :catchall_1
    move-exception v0

    goto :goto_11

    :cond_14
    const/4 v4, 0x0

    neg-int v8, v0

    invoke-virtual {v15, v8, v3, v0, v9}, Landroid/graphics/Rect;->set(IIII)V

    :goto_10
    invoke-virtual {v2, v15, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    add-int/lit8 v8, v17, -0x1

    if-ne v7, v8, :cond_15

    sub-int v8, v16, v6

    sub-int v8, v8, p7

    sub-int v4, v16, p7

    invoke-virtual {v15, v8, v3, v4, v9}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v2, v15, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_15
    move/from16 v4, v18

    int-to-float v8, v4

    move/from16 p2, v0

    add-int v0, v4, v11

    int-to-float v0, v0

    invoke-virtual {v2, v8, v0}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v14, v2}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v14}, Landroid/text/Layout;->getHeight()I

    move-result v0

    if-le v0, v13, :cond_16

    invoke-virtual {v14}, Landroid/text/Layout;->getHeight()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v13, v0

    :cond_16
    invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p0

    move/from16 v0, p2

    move/from16 v18, v4

    move/from16 v8, v17

    move/from16 v4, p5

    goto :goto_f

    :goto_11
    invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_17
    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    iget-object p1, p0, Le73/e;->y:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_2

    if-eqz p5, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    move p3, p2

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/text/Layout;

    invoke-virtual {p4}, Landroid/text/Layout;->getHeight()I

    move-result p4

    if-le p4, p3, :cond_0

    move p3, p4

    goto :goto_0

    :cond_1
    iput p3, p0, Le73/e;->J:I

    iget-object p1, p0, Le73/e;->w:Lc9/k;

    iget p1, p1, Lc9/k;->x:I

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p3

    neg-int p1, p1

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    :cond_2
    iget p1, p0, Le73/e;->I:I

    return p1
.end method
