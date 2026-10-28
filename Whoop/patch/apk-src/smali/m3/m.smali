.class public final Lm3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/text/TextPaint;

.field public final b:Landroid/text/TextUtils$TruncateAt;

.field public final c:Z

.field public final d:Z

.field public e:Lcom/google/android/material/textfield/p;

.field public final f:Landroid/text/Layout;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:F

.field public final k:F

.field public final l:Z

.field public final m:Landroid/graphics/Paint$FontMetricsInt;

.field public final n:I

.field public final o:[Lo3/g;

.field public final p:Landroid/graphics/Rect;

.field public q:Lb30/m;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILm3/h;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p2

    move/from16 v3, p4

    move/from16 v7, p7

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p3

    iput-object v4, v1, Lm3/m;->a:Landroid/text/TextPaint;

    move-object/from16 v8, p5

    iput-object v8, v1, Lm3/m;->b:Landroid/text/TextUtils$TruncateAt;

    iput-boolean v7, v1, Lm3/m;->c:Z

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    iput-object v5, v1, Lm3/m;->p:Landroid/graphics/Rect;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-static/range {p6 .. p6}, Lm3/n;->a(I)Landroid/text/TextDirectionHeuristic;

    move-result-object v10

    sget-object v6, Lm3/k;->a:Landroid/text/Layout$Alignment;

    const/4 v11, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v11, :cond_3

    const/4 v6, 0x2

    if-eq v3, v6, :cond_2

    const/4 v6, 0x3

    if-eq v3, v6, :cond_1

    const/4 v6, 0x4

    if-eq v3, v6, :cond_0

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_0
    sget-object v3, Lm3/k;->b:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_1
    sget-object v3, Lm3/k;->a:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_2
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_3
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_4
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :goto_0
    instance-of v6, v2, Landroid/text/Spanned;

    if-eqz v6, :cond_5

    move-object v6, v2

    check-cast v6, Landroid/text/Spanned;

    const/4 v9, -0x1

    const-class v13, Lo3/a;

    invoke-interface {v6, v9, v5, v13}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v6

    if-ge v6, v5, :cond_5

    move v5, v11

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    :goto_1
    const-string v6, "TextLayout:initLayout"

    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual/range {p14 .. p14}, Lm3/h;->a()Landroid/text/BoringLayout$Metrics;

    move-result-object v6

    float-to-double v13, v0

    move-wide v15, v13

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-float v9, v12

    float-to-int v9, v9

    const/16 v12, 0x21

    if-eqz v6, :cond_9

    invoke-virtual/range {p14 .. p14}, Lm3/h;->c()F

    move-result v13

    cmpg-float v0, v13, v0

    if-gtz v0, :cond_9

    if-nez v5, :cond_9

    iput-boolean v11, v1, Lm3/m;->l:Z

    if-ltz v9, :cond_6

    goto :goto_2

    :cond_6
    const-string v0, "negative width"

    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_2
    if-ltz v9, :cond_7

    goto :goto_3

    :cond_7
    const-string v0, "negative ellipsized width"

    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v12, :cond_8

    move v4, v9

    move-object v5, v3

    move-object/from16 v3, p3

    invoke-static/range {v2 .. v9}, Lm3/b;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;Landroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    move-result-object v0

    goto :goto_4

    :cond_8
    move-object v5, v3

    move v4, v9

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object/from16 v8, p5

    move/from16 v7, p7

    invoke-static/range {v2 .. v9}, Lbp/b;->p(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;Landroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    move-result-object v0

    :goto_4
    move/from16 v8, p8

    move-object v3, v0

    move-object v6, v10

    move v0, v12

    goto :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_16

    :cond_9
    move-object v5, v3

    move v4, v9

    const/4 v0, 0x0

    iput-boolean v0, v1, Lm3/m;->l:Z

    move-object v7, v5

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    move-object/from16 v3, p3

    move-object/from16 v9, p5

    move/from16 v8, p8

    move/from16 v13, p9

    move/from16 v14, p10

    move/from16 v15, p11

    move/from16 v16, p12

    move/from16 v11, p13

    move-object v6, v10

    move v0, v12

    move/from16 v12, p7

    move v10, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v16}, Lm3/j;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)Landroid/text/StaticLayout;

    move-result-object v3

    :goto_5
    iput-object v3, v1, Lm3/m;->f:Landroid/text/Layout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-virtual {v3}, Landroid/text/Layout;->getLineCount()I

    move-result v2

    invoke-static {v2, v8}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v1, Lm3/m;->g:I

    add-int/lit8 v4, v2, -0x1

    if-ge v2, v8, :cond_b

    :cond_a
    const/4 v11, 0x0

    goto :goto_6

    :cond_b
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v5

    if-gtz v5, :cond_c

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v5

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-eq v5, v7, :cond_a

    :cond_c
    const/4 v11, 0x1

    :goto_6
    iput-boolean v11, v1, Lm3/m;->d:Z

    sget-wide v7, Lm3/n;->b:J

    const/16 v5, 0x20

    const-wide v9, 0xffffffffL

    if-nez p7, :cond_15

    iget-boolean v11, v1, Lm3/m;->l:Z

    if-eqz v11, :cond_e

    move-object v11, v3

    check-cast v11, Landroid/text/BoringLayout;

    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v12, v0, :cond_d

    invoke-static {v11}, Lm3/c;->b(Landroid/text/BoringLayout;)Z

    move-result v11

    goto :goto_7

    :cond_d
    const/4 v11, 0x0

    goto :goto_7

    :cond_e
    move-object v11, v3

    check-cast v11, Landroid/text/StaticLayout;

    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v12, v0, :cond_f

    invoke-static {v11}, Lm3/c;->c(Landroid/text/StaticLayout;)Z

    move-result v11

    goto :goto_7

    :cond_f
    const/4 v11, 0x1

    :goto_7
    if-eqz v11, :cond_10

    goto :goto_c

    :cond_10
    invoke-virtual {v3}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v11

    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v3, v13}, Landroid/text/Layout;->getLineStart(I)I

    move-result v14

    invoke-virtual {v3, v13}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v15

    invoke-static {v11, v12, v14, v15}, Ldc/a;->z(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    move-result-object v14

    invoke-virtual {v3, v13}, Landroid/text/Layout;->getLineAscent(I)I

    move-result v15

    iget v13, v14, Landroid/graphics/Rect;->top:I

    if-ge v13, v15, :cond_11

    sub-int/2addr v15, v13

    :goto_8
    const/4 v13, 0x1

    goto :goto_9

    :cond_11
    invoke-virtual {v3}, Landroid/text/Layout;->getTopPadding()I

    move-result v15

    goto :goto_8

    :goto_9
    if-ne v2, v13, :cond_12

    goto :goto_a

    :cond_12
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineStart(I)I

    move-result v2

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v13

    invoke-static {v11, v12, v2, v13}, Ldc/a;->z(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    move-result-object v14

    :goto_a
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineDescent(I)I

    move-result v2

    iget v11, v14, Landroid/graphics/Rect;->bottom:I

    if-le v11, v2, :cond_13

    sub-int/2addr v11, v2

    goto :goto_b

    :cond_13
    invoke-virtual {v3}, Landroid/text/Layout;->getBottomPadding()I

    move-result v11

    :goto_b
    if-nez v15, :cond_14

    if-nez v11, :cond_14

    goto :goto_c

    :cond_14
    int-to-long v12, v15

    shl-long/2addr v12, v5

    int-to-long v14, v11

    and-long/2addr v14, v9

    or-long v11, v12, v14

    goto :goto_d

    :cond_15
    :goto_c
    move-wide v11, v7

    :goto_d
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    instance-of v2, v2, Landroid/text/Spanned;

    const/4 v13, 0x0

    if-nez v2, :cond_16

    goto :goto_e

    :cond_16
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const-string v14, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/text/Spanned;

    const-class v15, Lo3/g;

    invoke-static {v2, v15}, Lm3/j;->b(Landroid/text/Spanned;Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_17

    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_17

    :goto_e
    move-object v2, v13

    goto :goto_f

    :cond_17
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/text/Spanned;

    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v14, 0x0

    invoke-interface {v2, v14, v3, v15}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lo3/g;

    :goto_f
    iput-object v2, v1, Lm3/m;->o:[Lo3/g;

    if-eqz v2, :cond_1c

    array-length v3, v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    :goto_10
    if-ge v7, v3, :cond_1a

    aget-object v15, v2, v7

    move/from16 p1, v5

    iget v5, v15, Lo3/g;->K:I

    if-gez v5, :cond_18

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v8, v5

    :cond_18
    iget v5, v15, Lo3/g;->L:I

    if-gez v5, :cond_19

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v14, v5

    :cond_19
    add-int/lit8 v7, v7, 0x1

    move/from16 v5, p1

    goto :goto_10

    :cond_1a
    move/from16 p1, v5

    if-nez v8, :cond_1b

    if-nez v14, :cond_1b

    sget-wide v2, Lm3/n;->b:J

    :goto_11
    move-wide v7, v2

    goto :goto_12

    :cond_1b
    int-to-long v2, v8

    shl-long v2, v2, p1

    int-to-long v7, v14

    and-long/2addr v7, v9

    or-long/2addr v2, v7

    goto :goto_11

    :cond_1c
    move/from16 p1, v5

    :goto_12
    shr-long v2, v11, p1

    long-to-int v2, v2

    shr-long v14, v7, p1

    long-to-int v3, v14

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v1, Lm3/m;->h:I

    and-long v2, v11, v9

    long-to-int v2, v2

    and-long/2addr v7, v9

    long-to-int v3, v7

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v1, Lm3/m;->i:I

    iget-object v7, v1, Lm3/m;->a:Landroid/text/TextPaint;

    iget-object v2, v1, Lm3/m;->o:[Lo3/g;

    iget v3, v1, Lm3/m;->g:I

    const/16 v17, 0x1

    add-int/lit8 v3, v3, -0x1

    iget-object v5, v1, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v5, v3}, Landroid/text/Layout;->getLineStart(I)I

    move-result v8

    invoke-virtual {v5, v3}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v5

    if-ne v8, v5, :cond_1d

    if-eqz v2, :cond_1d

    array-length v5, v2

    if-nez v5, :cond_1e

    :cond_1d
    const/4 v14, 0x0

    goto/16 :goto_14

    :cond_1e
    move-object v10, v6

    new-instance v6, Landroid/text/SpannableString;

    const-string v5, "\u200b"

    invoke-direct {v6, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v2}, Lm83/n;->s0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo3/g;

    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    move-result v5

    if-eqz v3, :cond_1f

    iget-boolean v3, v2, Lo3/g;->z:Z

    if-eqz v3, :cond_1f

    const/4 v12, 0x0

    goto :goto_13

    :cond_1f
    iget-boolean v12, v2, Lo3/g;->z:Z

    :goto_13
    new-instance v3, Lo3/g;

    iget v8, v2, Lo3/g;->w:F

    iget-boolean v9, v2, Lo3/g;->z:Z

    iget v11, v2, Lo3/g;->E:F

    iget-boolean v2, v2, Lo3/g;->F:Z

    move/from16 p11, v2

    move-object/from16 p5, v3

    move/from16 p7, v5

    move/from16 p6, v8

    move/from16 p9, v9

    move/from16 p10, v11

    move/from16 p8, v12

    invoke-direct/range {p5 .. p11}, Lo3/g;-><init>(FIZZFZ)V

    move-object/from16 v2, p5

    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/4 v13, 0x0

    invoke-virtual {v6, v2, v13, v3, v0}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    move-result v9

    iget-boolean v0, v1, Lm3/m;->c:Z

    sget-object v11, Lm3/e;->a:Landroid/text/Layout$Alignment;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v8, 0x7fffffff

    const v12, 0x7fffffff

    const/4 v13, 0x0

    const v14, 0x7fffffff

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v16, v0

    invoke-static/range {v6 .. v20}, Lm3/j;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)Landroid/text/StaticLayout;

    move-result-object v0

    new-instance v13, Landroid/graphics/Paint$FontMetricsInt;

    invoke-direct {v13}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Landroid/text/Layout;->getLineAscent(I)I

    move-result v2

    iput v2, v13, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-virtual {v0, v14}, Landroid/text/StaticLayout;->getLineDescent(I)I

    move-result v2

    iput v2, v13, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    invoke-virtual {v0, v14}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v2

    iput v2, v13, Landroid/graphics/Paint$FontMetricsInt;->top:I

    invoke-virtual {v0, v14}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v0

    iput v0, v13, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    :goto_14
    if-eqz v13, :cond_20

    iget v0, v13, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    invoke-virtual {v1, v4}, Lm3/m;->e(I)F

    move-result v2

    invoke-virtual {v1, v4}, Lm3/m;->g(I)F

    move-result v3

    sub-float/2addr v2, v3

    float-to-int v2, v2

    sub-int v12, v0, v2

    goto :goto_15

    :cond_20
    move v12, v14

    :goto_15
    iput v12, v1, Lm3/m;->n:I

    iput-object v13, v1, Lm3/m;->m:Landroid/graphics/Paint$FontMetricsInt;

    iget-object v0, v1, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-static {v0, v4, v2}, Lpf/c;->x(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result v0

    iput v0, v1, Lm3/m;->j:F

    iget-object v0, v1, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-static {v0, v4, v2}, Lpf/c;->y(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result v0

    iput v0, v1, Lm3/m;->k:F

    return-void

    :goto_16
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget-boolean v0, p0, Lm3/m;->d:Z

    iget-object v1, p0, Lm3/m;->f:Landroid/text/Layout;

    if-eqz v0, :cond_0

    iget v0, p0, Lm3/m;->g:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    move-result v0

    :goto_0
    iget v1, p0, Lm3/m;->h:I

    add-int/2addr v0, v1

    iget v1, p0, Lm3/m;->i:I

    add-int/2addr v0, v1

    iget v1, p0, Lm3/m;->n:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final b(I)F
    .locals 1

    iget v0, p0, Lm3/m;->g:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    iget p1, p0, Lm3/m;->j:F

    iget v0, p0, Lm3/m;->k:F

    add-float/2addr p1, v0

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c()Lb30/m;
    .locals 2

    iget-object v0, p0, Lm3/m;->q:Lb30/m;

    if-nez v0, :cond_0

    new-instance v0, Lb30/m;

    iget-object v1, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-direct {v0, v1}, Lb30/m;-><init>(Landroid/text/Layout;)V

    iput-object v0, p0, Lm3/m;->q:Lb30/m;

    :cond_0
    return-object v0
.end method

.method public final d(I)F
    .locals 2

    iget v0, p0, Lm3/m;->h:I

    int-to-float v0, v0

    iget v1, p0, Lm3/m;->g:I

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lm3/m;->m:Landroid/graphics/Paint$FontMetricsInt;

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lm3/m;->g(I)F

    move-result p1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    int-to-float v1, v1

    sub-float/2addr p1, v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineBaseline(I)I

    move-result p1

    int-to-float p1, p1

    :goto_0
    add-float/2addr v0, p1

    return v0
.end method

.method public final e(I)F
    .locals 3

    iget v0, p0, Lm3/m;->g:I

    add-int/lit8 v1, v0, -0x1

    iget-object v2, p0, Lm3/m;->f:Landroid/text/Layout;

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lm3/m;->m:Landroid/graphics/Paint$FontMetricsInt;

    if-eqz v1, :cond_0

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result p1

    int-to-float p1, p1

    iget v0, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    int-to-float v0, v0

    add-float/2addr p1, v0

    return p1

    :cond_0
    iget v1, p0, Lm3/m;->h:I

    int-to-float v1, v1

    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Lm3/m;->i:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    int-to-float p1, p1

    add-float/2addr v1, p1

    return v1
.end method

.method public final f(I)I
    .locals 3

    sget-object v0, Lm3/n;->a:Lm3/l;

    iget-object v0, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lm3/m;->b:Landroid/text/TextUtils$TruncateAt;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result p1

    return p1
.end method

.method public final g(I)F
    .locals 1

    iget-object v0, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    move-result v0

    int-to-float v0, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p0, Lm3/m;->h:I

    :goto_0
    int-to-float p1, p1

    add-float/2addr v0, p1

    return v0
.end method

.method public final h(IZ)F
    .locals 2

    invoke-virtual {p0}, Lm3/m;->c()Lb30/m;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2}, Lb30/m;->y(IZZ)F

    move-result p2

    iget-object v0, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lm3/m;->b(I)F

    move-result p1

    add-float/2addr p1, p2

    return p1
.end method

.method public final i(IZ)F
    .locals 2

    invoke-virtual {p0}, Lm3/m;->c()Lb30/m;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Lb30/m;->y(IZZ)F

    move-result p2

    iget-object v0, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lm3/m;->b(I)F

    move-result p1

    add-float/2addr p1, p2

    return p1
.end method

.method public final j()Lcom/google/android/material/textfield/p;
    .locals 4

    iget-object v0, p0, Lm3/m;->e:Lcom/google/android/material/textfield/p;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/material/textfield/p;

    iget-object v1, p0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iget-object v3, p0, Lm3/m;->a:Landroid/text/TextPaint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/material/textfield/p;-><init>(Ljava/lang/CharSequence;ILjava/util/Locale;)V

    iput-object v0, p0, Lm3/m;->e:Lcom/google/android/material/textfield/p;

    return-object v0
.end method
