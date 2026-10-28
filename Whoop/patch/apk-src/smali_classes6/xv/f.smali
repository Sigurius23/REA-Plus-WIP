.class public final Lxv/f;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lxv/b;


# instance fields
.field public E:Ljava/lang/String;

.field public F:F

.field public G:F

.field public H:Z

.field public final I:Lm/f;

.field public final J:Ljava/text/DecimalFormat;

.field public K:Z

.field public L:Landroid/graphics/Canvas;

.field public M:Lyv/b;

.field public N:Lxv/h;

.field public O:F

.field public w:Ljava/util/List;

.field public final x:Landroid/graphics/Paint;

.field public final y:Landroid/graphics/Paint;

.field public final z:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget-object p1, Lxv/c;->a:Ljava/util/List;

    iput-object p1, p0, Lxv/f;->w:Ljava/util/List;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lxv/f;->x:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lxv/f;->y:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lxv/f;->z:Landroid/graphics/Paint;

    const-string v2, " m"

    iput-object v2, p0, Lxv/f;->E:Ljava/lang/String;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Lxv/f;->G:F

    new-instance v2, Ljava/text/DecimalFormat;

    const-string v3, "0.#"

    invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lxv/f;->J:Ljava/text/DecimalFormat;

    sget-object v2, Lxv/e;->x:Lxv/e;

    invoke-static {v2}, Lrv/n;->b(Lkotlin/jvm/functions/Function1;)Lyv/b;

    move-result-object v2

    iput-object v2, p0, Lxv/f;->M:Lyv/b;

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 p1, -0x1

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p1, Lm/f;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Lm/f;-><init>(Landroid/os/Looper;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p1, Lm/f;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lxv/f;->getUseContinuousRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    iput-object p1, p0, Lxv/f;->I:Lm/f;

    return-void
.end method

.method public static b(F)F
    .locals 1

    const/16 v0, 0xa

    int-to-float v0, v0

    mul-float/2addr p0, v0

    float-to-int p0, p0

    int-to-float p0, p0

    const/high16 v0, 0x41200000    # 10.0f

    div-float/2addr p0, v0

    return p0
.end method


# virtual methods
.method public final a(FFLjava/util/List;Landroid/graphics/Paint;FLjava/lang/String;I)Lxv/h;
    .locals 20

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p6

    const-string v3, "scaleTable"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "textPaint"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "unit"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/util/Pair;

    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    int-to-float v5, v5

    cmpg-float v5, v5, p1

    if-gtz v5, :cond_0

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    check-cast v4, Landroid/util/Pair;

    const/4 v3, 0x0

    if-nez v4, :cond_2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/util/Pair;

    :cond_2
    iget-object v0, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    int-to-float v0, v0

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    const-string v5, "pair.second"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    int-to-float v5, v4

    div-float v5, v0, v5

    :goto_1
    int-to-float v6, v4

    mul-float/2addr v6, v5

    cmpl-float v6, v6, p1

    if-lez v6, :cond_3

    if-lez v4, :cond_3

    add-int/lit8 v4, v4, -0x1

    int-to-float v0, v4

    mul-float/2addr v0, v5

    goto :goto_1

    :cond_3
    if-nez v4, :cond_4

    invoke-static/range {p1 .. p1}, Lxv/f;->b(F)F

    move-result v5

    move v0, v5

    const/4 v4, 0x1

    :cond_4
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    move v11, v9

    const/4 v10, 0x1

    :goto_2
    if-eqz v10, :cond_17

    int-to-float v5, v4

    div-float v5, v0, v5

    div-float v10, v5, p2

    invoke-static {v10}, Lxv/f;->b(F)F

    move-result v11

    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    if-ltz v4, :cond_12

    move v10, v3

    :goto_3
    int-to-float v12, v10

    mul-float v13, v5, v12

    cmpg-float v14, v13, v9

    if-nez v14, :cond_5

    const-string v13, "0"

    move/from16 p3, v4

    move-object v3, v7

    move/from16 p1, v9

    move-object/from16 v9, p0

    goto/16 :goto_5

    :cond_5
    const-string v14, " m"

    invoke-virtual {v14, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    move/from16 p1, v9

    move-object/from16 v9, p0

    iget-object v15, v9, Lxv/f;->J:Ljava/text/DecimalFormat;

    if-eqz v14, :cond_7

    const/high16 v14, 0x447a0000    # 1000.0f

    cmpg-float v14, v13, v14

    if-gez v14, :cond_6

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v15, v13}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    move/from16 p3, v4

    move-object v3, v7

    goto :goto_5

    :cond_6
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 p3, v4

    float-to-double v3, v13

    mul-double v3, v3, v16

    const/16 v13, 0x3e8

    move-object/from16 v19, v7

    int-to-double v6, v13

    div-double/2addr v3, v6

    invoke-virtual {v15, v3, v4}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " km"

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    :goto_4
    move-object/from16 v3, v19

    goto :goto_5

    :cond_7
    move/from16 p3, v4

    move-object/from16 v19, v7

    const/high16 v3, 0x45a50000    # 5280.0f

    cmpg-float v3, v13, v3

    if-gez v3, :cond_8

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v6, v13

    mul-double v6, v6, v16

    const/16 v4, 0x14a0

    int-to-double v13, v4

    div-double/2addr v6, v13

    invoke-virtual {v15, v6, v7}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " mi"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    :goto_5
    invoke-virtual {v3, v10, v13}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    mul-float/2addr v12, v11

    if-nez v10, :cond_9

    sget-object v6, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    goto :goto_6

    :cond_9
    sget-object v6, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    :goto_6
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    const/high16 v7, 0x40000000    # 2.0f

    div-float v7, p5, v7

    add-float v13, v12, v7

    sget-object v14, Lxv/d;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aget v15, v14, v15

    move/from16 v16, v0

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq v15, v1, :cond_c

    if-eq v15, v0, :cond_b

    const/4 v1, 0x3

    if-ne v15, v1, :cond_a

    move/from16 v1, p1

    goto :goto_7

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    int-to-float v1, v0

    div-float v1, v4, v1

    goto :goto_7

    :cond_c
    move v1, v4

    :goto_7
    add-float/2addr v13, v1

    move/from16 v1, p7

    int-to-float v15, v1

    cmpl-float v19, v13, v15

    if-lez v19, :cond_d

    sub-float v15, v13, v15

    sub-float/2addr v12, v15

    :cond_d
    sub-float v7, v12, v7

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v14, v6

    const/4 v14, 0x1

    if-eq v6, v14, :cond_10

    if-eq v6, v0, :cond_f

    const/4 v14, 0x3

    if-ne v6, v14, :cond_e

    goto :goto_8

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    int-to-float v6, v0

    div-float/2addr v4, v6

    goto :goto_8

    :cond_10
    move/from16 v4, p1

    :goto_8
    sub-float/2addr v7, v4

    cmpg-float v4, v7, p1

    if-gez v4, :cond_11

    int-to-float v0, v0

    div-float v0, p5, v0

    add-float/2addr v7, v0

    add-float/2addr v12, v0

    add-float/2addr v13, v0

    :cond_11
    new-instance v0, Ll83/q;

    invoke-static {v7}, Lxv/f;->b(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v13}, Lxv/f;->b(F)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-static {v12}, Lxv/f;->b(F)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-direct {v0, v4, v6, v7}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v10, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move/from16 v4, p3

    if-eq v10, v4, :cond_13

    add-int/lit8 v10, v10, 0x1

    move/from16 v9, p1

    move-object/from16 v1, p4

    move-object v7, v3

    move/from16 v0, v16

    const/4 v3, 0x0

    goto/16 :goto_3

    :cond_12
    move/from16 v1, p7

    move/from16 v16, v0

    move-object v3, v7

    move/from16 p1, v9

    move-object/from16 v9, p0

    :cond_13
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v18, 0x1

    add-int/lit8 v0, v0, -0x1

    const/4 v6, 0x0

    :cond_14
    if-ge v6, v0, :cond_16

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll83/q;

    iget-object v7, v7, Ll83/q;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll83/q;

    iget-object v10, v10, Ll83/q;->w:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    cmpl-float v7, v7, v10

    if-ltz v7, :cond_14

    const/4 v14, 0x1

    if-ne v4, v14, :cond_15

    const-string v0, ""

    const/4 v7, 0x0

    invoke-virtual {v3, v7, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_15
    const/4 v7, 0x0

    add-int/lit8 v4, v4, -0x1

    move v0, v7

    move-object v7, v3

    move v3, v0

    move/from16 v9, p1

    move-object/from16 v1, p4

    move v10, v14

    move/from16 v0, v16

    goto/16 :goto_2

    :cond_16
    const/4 v7, 0x0

    const/4 v14, 0x1

    :goto_9
    move/from16 v9, p1

    move-object/from16 v1, p4

    move v10, v7

    move/from16 v0, v16

    move-object v7, v3

    move v3, v10

    goto/16 :goto_2

    :cond_17
    move-object/from16 v9, p0

    move-object v3, v7

    new-instance v0, Lxv/h;

    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-static {v8}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v5, v0, Lxv/h;->a:F

    iput v11, v0, Lxv/h;->b:F

    iput v4, v0, Lxv/h;->c:I

    iput-object v1, v0, Lxv/h;->d:Ljava/util/List;

    iput-object v2, v0, Lxv/h;->e:Ljava/util/List;

    return-object v0
.end method

.method public final getBarPaint$plugin_scalebar_release()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lxv/f;->y:Landroid/graphics/Paint;

    return-object v0
.end method

.method public getDistancePerPixel()F
    .locals 1

    iget v0, p0, Lxv/f;->O:F

    return v0
.end method

.method public getEnable()Z
    .locals 1

    iget-boolean v0, p0, Lxv/f;->K:Z

    return v0
.end method

.method public getMapViewWidth()F
    .locals 1

    iget v0, p0, Lxv/f;->F:F

    return v0
.end method

.method public getPixelRatio()F
    .locals 1

    iget v0, p0, Lxv/f;->G:F

    return v0
.end method

.method public final getScaleTable$plugin_scalebar_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lxv/f;->w:Ljava/util/List;

    return-object v0
.end method

.method public getSettings()Lyv/b;
    .locals 1

    iget-object v0, p0, Lxv/f;->M:Lyv/b;

    return-object v0
.end method

.method public final getStrokePaint$plugin_scalebar_release()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lxv/f;->z:Landroid/graphics/Paint;

    return-object v0
.end method

.method public final getTextPaint$plugin_scalebar_release()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lxv/f;->x:Landroid/graphics/Paint;

    return-object v0
.end method

.method public final getUnit$plugin_scalebar_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxv/f;->E:Ljava/lang/String;

    return-object v0
.end method

.method public getUseContinuousRendering()Z
    .locals 1

    iget-boolean v0, p0, Lxv/f;->H:Z

    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    const-string v1, "canvas"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lxv/f;->getUseContinuousRendering()Z

    move-result v1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lxv/f;->K:Z

    if-nez v1, :cond_0

    invoke-virtual {v8, v9, v9, v9, v9}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    return-void

    :cond_0
    iget-object v1, v0, Lxv/f;->L:Landroid/graphics/Canvas;

    if-eqz v1, :cond_2

    :cond_1
    :goto_0
    move-object v7, v0

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v0}, Lxv/f;->getDistancePerPixel()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-lez v1, :cond_1

    invoke-virtual {v0}, Lxv/f;->getMapViewWidth()F

    move-result v1

    cmpg-float v1, v1, v2

    if-lez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-gtz v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lxv/f;->getSettings()Lyv/b;

    move-result-object v10

    invoke-virtual {v0}, Lxv/f;->getMapViewWidth()F

    move-result v1

    invoke-virtual {v0}, Lxv/f;->getDistancePerPixel()F

    move-result v2

    mul-float/2addr v2, v1

    iget v1, v10, Lyv/b;->R:F

    iget v11, v10, Lyv/b;->H:I

    iget v12, v10, Lyv/b;->J:F

    iget v13, v10, Lyv/b;->I:I

    iget v14, v10, Lyv/b;->K:F

    iget v15, v10, Lyv/b;->L:F

    iget v3, v10, Lyv/b;->N:F

    mul-float/2addr v1, v2

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v2, v1, v2

    if-gtz v2, :cond_4

    invoke-virtual {v8, v9, v9, v9, v9}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    return-void

    :cond_4
    invoke-virtual {v0}, Lxv/f;->getDistancePerPixel()F

    move-result v2

    move v4, v3

    iget-object v3, v0, Lxv/f;->w:Ljava/util/List;

    iget-object v5, v0, Lxv/f;->z:Landroid/graphics/Paint;

    move-object v6, v5

    invoke-virtual {v6}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v5

    move-object v7, v6

    iget-object v6, v0, Lxv/f;->E:Ljava/lang/String;

    move-object/from16 v16, v7

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v7

    move/from16 v17, v4

    iget-object v4, v0, Lxv/f;->x:Landroid/graphics/Paint;

    move-object/from16 v8, v16

    move/from16 v9, v17

    invoke-virtual/range {v0 .. v7}, Lxv/f;->a(FFLjava/util/List;Landroid/graphics/Paint;FLjava/lang/String;I)Lxv/h;

    move-result-object v6

    move-object v7, v0

    iget v0, v6, Lxv/h;->b:F

    iget v1, v6, Lxv/h;->c:I

    iput-object v6, v7, Lxv/f;->N:Lxv/h;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iget-object v5, v7, Lxv/f;->y:Landroid/graphics/Paint;

    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v5, v13}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v2, v1

    mul-float v16, v0, v2

    add-float v3, v15, v9

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float v17, v12, v2

    sub-float v3, v3, v17

    mul-float v17, v12, v2

    add-float v17, v17, v16

    add-float v18, v15, v9

    add-float v18, v18, v14

    mul-float v19, v12, v2

    add-float v19, v19, v18

    move/from16 v18, v1

    const/4 v1, 0x0

    move/from16 v20, v18

    move/from16 v18, v12

    move/from16 v12, v20

    move/from16 v20, v13

    move-object v13, v4

    move/from16 v4, v19

    move/from16 v19, v2

    move v2, v3

    move/from16 v3, v17

    move/from16 v17, v0

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, v10, Lyv/b;->J:F

    add-float v3, v15, v9

    sub-float v2, v3, v1

    add-float v3, v16, v1

    add-float v0, v15, v9

    add-float/2addr v0, v14

    add-float v4, v0, v1

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    if-ltz v12, :cond_9

    const/4 v10, 0x0

    :goto_1
    rem-int/lit8 v1, v10, 0x2

    if-nez v1, :cond_5

    move v1, v11

    goto :goto_2

    :cond_5
    move/from16 v1, v20

    :goto_2
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, v6, Lxv/h;->d:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v10, :cond_6

    sget-object v2, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    goto :goto_3

    :cond_6
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    :goto_3
    iget-object v2, v6, Lxv/h;->e:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/q;

    iget-object v2, v2, Ll83/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v7}, Lxv/f;->getSettings()Lyv/b;

    move-result-object v3

    iget-boolean v3, v3, Lyv/b;->Q:Z

    if-eqz v3, :cond_7

    invoke-virtual {v0, v1, v2, v9, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_7
    invoke-virtual {v0, v1, v2, v9, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    if-eq v10, v12, :cond_8

    mul-float v1, v18, v19

    int-to-float v2, v10

    mul-float v2, v2, v17

    add-float/2addr v1, v2

    add-float v2, v15, v9

    add-int/lit8 v3, v10, 0x1

    int-to-float v3, v3

    mul-float v3, v3, v17

    add-float v4, v15, v9

    add-float/2addr v4, v14

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_8
    if-eq v10, v12, :cond_9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_9
    invoke-virtual {v7}, Lxv/f;->getUseContinuousRendering()Z

    move-result v1

    if-eqz v1, :cond_a

    iput-object v0, v7, Lxv/f;->L:Landroid/graphics/Canvas;

    :cond_a
    :goto_4
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    invoke-virtual {p0}, Lxv/f;->getMapViewWidth()F

    move-result p1

    invoke-virtual {p0}, Lxv/f;->getSettings()Lyv/b;

    move-result-object p2

    iget p2, p2, Lyv/b;->R:F

    mul-float/2addr p1, p2

    const/16 p2, 0xa

    int-to-float p2, p2

    invoke-virtual {p0}, Lxv/f;->getPixelRatio()F

    move-result v0

    mul-float/2addr v0, p2

    add-float/2addr v0, p1

    invoke-virtual {p0}, Lxv/f;->getSettings()Lyv/b;

    move-result-object p1

    iget p2, p1, Lyv/b;->L:F

    iget v1, p1, Lyv/b;->N:F

    add-float/2addr p2, v1

    iget v1, p1, Lyv/b;->K:F

    add-float/2addr p2, v1

    iget p1, p1, Lyv/b;->J:F

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float/2addr p1, v1

    add-float/2addr p1, p2

    new-instance p2, Landroid/util/Pair;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    float-to-int p1, p1

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setDistancePerPixel(F)V
    .locals 9

    invoke-virtual {p0}, Lxv/f;->getSettings()Lyv/b;

    move-result-object v0

    iget-boolean v0, v0, Lyv/b;->O:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x4051f8a1

    mul-float/2addr p1, v0

    :goto_0
    iget v0, p0, Lxv/f;->O:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_1

    return-void

    :cond_1
    iput p1, p0, Lxv/f;->O:F

    invoke-virtual {p0}, Lxv/f;->getUseContinuousRendering()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lxv/f;->L:Landroid/graphics/Canvas;

    return-void

    :cond_2
    invoke-virtual {p0}, Lxv/f;->getMapViewWidth()F

    move-result p1

    invoke-virtual {p0}, Lxv/f;->getDistancePerPixel()F

    move-result v0

    mul-float/2addr v0, p1

    invoke-virtual {p0}, Lxv/f;->getSettings()Lyv/b;

    move-result-object p1

    iget p1, p1, Lyv/b;->R:F

    mul-float v2, v0, p1

    iget v3, p0, Lxv/f;->O:F

    iget-object v4, p0, Lxv/f;->w:Ljava/util/List;

    iget-object p1, p0, Lxv/f;->z:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v6

    iget-object v7, p0, Lxv/f;->E:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v8

    iget-object v5, p0, Lxv/f;->x:Landroid/graphics/Paint;

    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Lxv/f;->a(FFLjava/util/List;Landroid/graphics/Paint;FLjava/lang/String;I)Lxv/h;

    move-result-object p1

    iget-object v0, v1, Lxv/f;->N:Lxv/h;

    invoke-virtual {p1, v0}, Lxv/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, v1, Lxv/f;->I:Lm/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lxv/f;->getSettings()Lyv/b;

    move-result-object v2

    iget-wide v2, v2, Lyv/b;->P:J

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_3
    return-void
.end method

.method public setEnable(Z)V
    .locals 1

    iput-boolean p1, p0, Lxv/f;->K:Z

    invoke-virtual {p0}, Lxv/f;->getUseContinuousRendering()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public setMapViewWidth(F)V
    .locals 1

    iput p1, p0, Lxv/f;->F:F

    new-instance p1, Llr/e;

    const/16 v0, 0x1a

    invoke-direct {p1, p0, v0}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setPixelRatio(F)V
    .locals 0

    iput p1, p0, Lxv/f;->G:F

    return-void
.end method

.method public final setScaleTable$plugin_scalebar_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxv/f;->w:Ljava/util/List;

    return-void
.end method

.method public setSettings(Lyv/b;)V
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Lyv/b;->G:I

    iget-object v1, p0, Lxv/f;->x:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p1, Lyv/b;->N:F

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, p0, Lxv/f;->z:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-boolean v0, p1, Lyv/b;->O:Z

    if-eqz v0, :cond_0

    sget-object v2, Lxv/c;->a:Ljava/util/List;

    goto :goto_0

    :cond_0
    sget-object v2, Lxv/c;->b:Ljava/util/List;

    :goto_0
    iput-object v2, p0, Lxv/f;->w:Ljava/util/List;

    if-eqz v0, :cond_1

    const-string v0, " m"

    goto :goto_1

    :cond_1
    const-string v0, " ft"

    :goto_1
    iput-object v0, p0, Lxv/f;->E:Ljava/lang/String;

    iget-boolean v0, p1, Lyv/b;->Q:Z

    if-eqz v0, :cond_2

    iget v0, p1, Lyv/b;->M:F

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-boolean v0, p1, Lyv/b;->w:Z

    invoke-virtual {p0, v0}, Lxv/f;->setEnable(Z)V

    iget-boolean v0, p1, Lyv/b;->S:Z

    invoke-virtual {p0, v0}, Lxv/f;->setUseContinuousRendering(Z)V

    invoke-virtual {p0}, Lxv/f;->getUseContinuousRendering()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iput-object v1, p0, Lxv/f;->L:Landroid/graphics/Canvas;

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lxv/f;->I:Lm/f;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v3

    if-nez v3, :cond_4

    iget-wide v3, p1, Lyv/b;->P:J

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_4
    :goto_3
    iput-object p1, p0, Lxv/f;->M:Lyv/b;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v2, v0, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v2, :cond_5

    move-object v1, v0

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    :cond_5
    if-eqz v1, :cond_6

    iget v0, p1, Lyv/b;->x:I

    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget v0, p1, Lyv/b;->y:F

    float-to-int v0, v0

    iget v2, p1, Lyv/b;->z:F

    float-to-int v2, v2

    iget v3, p1, Lyv/b;->E:F

    float-to-int v3, v3

    iget p1, p1, Lyv/b;->F:F

    float-to-int p1, p1

    invoke-virtual {v1, v0, v2, v3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    :cond_6
    invoke-virtual {p0}, Lxv/f;->getMapViewWidth()F

    move-result p1

    invoke-virtual {p0, p1}, Lxv/f;->setMapViewWidth(F)V

    return-void
.end method

.method public final setUnit$plugin_scalebar_release(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxv/f;->E:Ljava/lang/String;

    return-void
.end method

.method public setUseContinuousRendering(Z)V
    .locals 4

    const/4 v0, 0x1

    iget-object v1, p0, Lxv/f;->I:Lm/f;

    if-eqz p1, :cond_1

    iget-boolean v2, p0, Lxv/f;->K:Z

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_1
    iget-boolean v2, p0, Lxv/f;->K:Z

    if-nez v2, :cond_2

    const/16 v2, 0x8

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lxv/f;->L:Landroid/graphics/Canvas;

    :goto_0
    iput-boolean p1, p0, Lxv/f;->H:Z

    return-void
.end method
