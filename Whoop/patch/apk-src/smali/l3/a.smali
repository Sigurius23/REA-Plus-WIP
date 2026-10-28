.class public final Ll3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt3/c;

.field public final b:I

.field public final c:J

.field public final d:Lm3/m;

.field public final e:Ljava/lang/CharSequence;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt3/c;IIJ)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v4, p2

    move/from16 v11, p3

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v10, v0, Ll3/a;->a:Lt3/c;

    iput v4, v0, Ll3/a;->b:I

    move-wide/from16 v12, p4

    iput-wide v12, v0, Ll3/a;->c:J

    invoke-static {v12, v13}, Ly3/a;->j(J)I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v12, v13}, Ly3/a;->k(J)I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    invoke-static {v1}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    const/4 v14, 0x1

    if-lt v4, v14, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "maxLines should be greater than 0"

    invoke-static {v1}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_1
    iget-object v1, v10, Lt3/c;->b:Ll3/v0;

    iget-object v2, v10, Lt3/c;->h:Ljava/lang/CharSequence;

    const/4 v3, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x2

    if-ne v11, v6, :cond_9

    iget-object v8, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v8, v8, Ll3/m0;->h:J

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Lv63/c;->h(I)J

    move-result-wide v6

    invoke-static {v8, v9, v6, v7}, Ly3/o;->a(JJ)Z

    move-result v6

    if-nez v6, :cond_8

    iget-object v6, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v6, v6, Ll3/m0;->h:J

    sget-wide v8, Ly3/o;->c:J

    invoke-static {v6, v7, v8, v9}, Ly3/o;->a(JJ)Z

    move-result v6

    if-nez v6, :cond_8

    iget-object v6, v1, Ll3/v0;->b:Ll3/b0;

    iget v6, v6, Ll3/b0;->a:I

    const/high16 v7, -0x80000000

    if-ne v6, v7, :cond_2

    goto :goto_3

    :cond_2
    if-ne v6, v3, :cond_3

    goto :goto_3

    :cond_3
    if-ne v6, v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    instance-of v6, v2, Landroid/text/Spannable;

    if-eqz v6, :cond_6

    move-object v6, v2

    check-cast v6, Landroid/text/Spannable;

    goto :goto_2

    :cond_6
    const/4 v6, 0x0

    :goto_2
    if-nez v6, :cond_7

    new-instance v6, Landroid/text/SpannableString;

    invoke-direct {v6, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    :cond_7
    move-object v2, v6

    const-class v6, Lo3/b;

    invoke-static {v2, v6}, Lm3/j;->b(Landroid/text/Spanned;Ljava/lang/Class;)Z

    move-result v6

    if-nez v6, :cond_8

    new-instance v6, Lo3/b;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v7

    sub-int/2addr v7, v14

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v8

    sub-int/2addr v8, v14

    const/16 v9, 0x21

    invoke-interface {v2, v6, v7, v8, v9}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_8
    :goto_3
    move-object v9, v2

    goto :goto_4

    :cond_9
    const/16 v17, 0x0

    goto :goto_3

    :goto_4
    iput-object v9, v0, Ll3/a;->e:Ljava/lang/CharSequence;

    iget-object v2, v1, Ll3/v0;->b:Ll3/b0;

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget v6, v2, Ll3/b0;->a:I

    const/4 v7, 0x3

    if-ne v6, v14, :cond_a

    move v8, v7

    goto :goto_6

    :cond_a
    const/4 v8, 0x2

    if-ne v6, v8, :cond_b

    move v8, v5

    goto :goto_6

    :cond_b
    if-ne v6, v7, :cond_c

    const/4 v8, 0x2

    goto :goto_6

    :cond_c
    if-ne v6, v3, :cond_d

    goto :goto_5

    :cond_d
    const/4 v8, 0x6

    if-ne v6, v8, :cond_e

    move v8, v14

    goto :goto_6

    :cond_e
    :goto_5
    move/from16 v8, v17

    :goto_6
    if-ne v6, v5, :cond_f

    move v6, v14

    goto :goto_7

    :cond_f
    move/from16 v6, v17

    :goto_7
    iget v15, v2, Ll3/b0;->h:I

    const/16 v3, 0x20

    const/4 v5, 0x2

    if-ne v15, v5, :cond_11

    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v15, v3, :cond_10

    move v15, v5

    goto :goto_8

    :cond_10
    const/4 v15, 0x4

    goto :goto_8

    :cond_11
    move/from16 v15, v17

    :goto_8
    iget v2, v2, Ll3/b0;->g:I

    and-int/lit16 v3, v2, 0xff

    if-ne v3, v14, :cond_12

    goto :goto_9

    :cond_12
    if-ne v3, v5, :cond_13

    move v3, v2

    move v2, v6

    move v6, v14

    goto :goto_a

    :cond_13
    if-ne v3, v7, :cond_14

    move v3, v2

    move v2, v6

    const/4 v6, 0x2

    goto :goto_a

    :cond_14
    :goto_9
    move v3, v2

    move v2, v6

    move/from16 v6, v17

    :goto_a
    shr-int/lit8 v5, v3, 0x8

    and-int/lit16 v5, v5, 0xff

    if-ne v5, v14, :cond_15

    goto :goto_b

    :cond_15
    const/4 v14, 0x2

    if-ne v5, v14, :cond_16

    move v5, v7

    const/4 v7, 0x1

    goto :goto_c

    :cond_16
    if-ne v5, v7, :cond_17

    move v5, v7

    const/4 v7, 0x2

    goto :goto_c

    :cond_17
    const/4 v14, 0x4

    if-ne v5, v14, :cond_18

    move v5, v7

    goto :goto_c

    :cond_18
    :goto_b
    move v5, v7

    move/from16 v7, v17

    :goto_c
    shr-int/lit8 v3, v3, 0x10

    and-int/lit16 v3, v3, 0xff

    const/4 v14, 0x1

    if-ne v3, v14, :cond_19

    const/4 v14, 0x2

    goto :goto_d

    :cond_19
    const/4 v14, 0x2

    if-ne v3, v14, :cond_1a

    move-object v3, v1

    move v1, v8

    const/4 v8, 0x1

    goto :goto_e

    :cond_1a
    :goto_d
    move-object v3, v1

    move v1, v8

    move/from16 v8, v17

    :goto_e
    if-ne v11, v14, :cond_1b

    sget-object v16, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    :goto_f
    move v5, v15

    const/16 v18, 0x20

    move-object v15, v3

    move-object/from16 v3, v16

    goto :goto_10

    :cond_1b
    const/4 v5, 0x5

    if-ne v11, v5, :cond_1c

    sget-object v16, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    goto :goto_f

    :cond_1c
    const/4 v5, 0x4

    if-ne v11, v5, :cond_1d

    sget-object v16, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    goto :goto_f

    :cond_1d
    move v5, v15

    const/16 v18, 0x20

    move-object v15, v3

    const/4 v3, 0x0

    :goto_10
    invoke-virtual/range {v0 .. v9}, Ll3/a;->a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lm3/m;

    move-result-object v14

    iget-object v0, v14, Lm3/m;->f:Landroid/text/Layout;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    move/from16 v16, v1

    const/16 v1, 0x23

    if-ge v4, v1, :cond_1e

    iget-object v1, v10, Lt3/c;->g:Lt3/d;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v1

    const/4 v4, 0x0

    cmpg-float v1, v1, v4

    if-nez v1, :cond_1f

    :cond_1e
    const/4 v10, 0x2

    move-object/from16 v0, p0

    move/from16 v4, p2

    move/from16 v1, v16

    goto :goto_13

    :cond_1f
    const/4 v1, 0x4

    if-ne v11, v1, :cond_20

    :goto_11
    const/4 v1, 0x0

    goto :goto_12

    :cond_20
    const/4 v1, 0x5

    if-ne v11, v1, :cond_1e

    goto :goto_11

    :goto_12
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v4

    if-lez v4, :cond_1e

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v4

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v0

    add-int/2addr v0, v4

    invoke-interface {v9, v1, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    invoke-interface {v9, v0, v10}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/CharSequence;

    aput-object v4, v9, v1

    const-string v1, "\u2026"

    const/16 v19, 0x1

    aput-object v1, v9, v19

    const/4 v10, 0x2

    aput-object v0, v9, v10

    invoke-static {v9}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    move-object/from16 v0, p0

    move/from16 v4, p2

    move/from16 v1, v16

    invoke-virtual/range {v0 .. v9}, Ll3/a;->a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lm3/m;

    move-result-object v14

    :goto_13
    iget v9, v14, Lm3/m;->g:I

    if-ne v11, v10, :cond_25

    invoke-virtual {v14}, Lm3/m;->a()I

    move-result v11

    move/from16 v16, v10

    invoke-static {v12, v13}, Ly3/a;->h(J)I

    move-result v10

    if-le v11, v10, :cond_26

    const/4 v10, 0x1

    if-le v4, v10, :cond_26

    invoke-static {v12, v13}, Ly3/a;->h(J)I

    move-result v4

    const/4 v10, 0x0

    :goto_14
    if-ge v10, v9, :cond_22

    invoke-virtual {v14, v10}, Lm3/m;->e(I)F

    move-result v11

    int-to-float v12, v4

    cmpl-float v11, v11, v12

    if-lez v11, :cond_21

    goto :goto_15

    :cond_21
    add-int/lit8 v10, v10, 0x1

    goto :goto_14

    :cond_22
    move v10, v9

    :goto_15
    if-ltz v10, :cond_24

    iget v4, v0, Ll3/a;->b:I

    if-eq v10, v4, :cond_24

    const/4 v4, 0x1

    if-ge v10, v4, :cond_23

    const/4 v4, 0x1

    goto :goto_16

    :cond_23
    move v4, v10

    :goto_16
    iget-object v9, v0, Ll3/a;->e:Ljava/lang/CharSequence;

    invoke-virtual/range {v0 .. v9}, Ll3/a;->a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lm3/m;

    move-result-object v14

    :cond_24
    iput-object v14, v0, Ll3/a;->d:Lm3/m;

    goto :goto_17

    :cond_25
    move/from16 v16, v10

    :cond_26
    iput-object v14, v0, Ll3/a;->d:Lm3/m;

    :goto_17
    iget-object v1, v0, Ll3/a;->a:Lt3/c;

    iget-object v1, v1, Lt3/c;->g:Lt3/d;

    iget-object v2, v15, Ll3/m0;->a:Lw3/o;

    invoke-interface {v2}, Lw3/o;->c()Li2/t;

    move-result-object v2

    invoke-virtual {v0}, Ll3/a;->d()F

    move-result v3

    invoke-virtual {v0}, Ll3/a;->b()F

    move-result v4

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v5, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long v5, v5, v18

    const-wide v7, 0xffffffffL

    and-long/2addr v3, v7

    or-long/2addr v3, v5

    iget-object v5, v15, Ll3/m0;->a:Lw3/o;

    invoke-interface {v5}, Lw3/o;->a()F

    move-result v5

    invoke-virtual {v1, v2, v3, v4, v5}, Lt3/d;->c(Li2/t;JF)V

    iget-object v1, v0, Ll3/a;->d:Lm3/m;

    iget-object v1, v1, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    instance-of v2, v2, Landroid/text/Spanned;

    if-nez v2, :cond_28

    :cond_27
    const/4 v1, 0x0

    goto :goto_18

    :cond_28
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/text/Spanned;

    const/4 v4, -0x1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const-class v6, Lv3/d;

    invoke-interface {v2, v4, v5, v6}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v4

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-eq v4, v2, :cond_27

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/text/Spanned;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v3, 0x0

    invoke-interface {v2, v3, v1, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lv3/d;

    :goto_18
    if-eqz v1, :cond_29

    invoke-static {v1}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object v1

    :goto_19
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv3/d;

    invoke-virtual {v0}, Ll3/a;->d()F

    move-result v3

    invoke-virtual {v0}, Ll3/a;->b()F

    move-result v4

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v5, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long v5, v5, v18

    and-long/2addr v3, v7

    or-long/2addr v3, v5

    iget-object v2, v2, Lv3/d;->y:Lp1/k1;

    new-instance v5, Lh2/e;

    invoke-direct {v5, v3, v4}, Lh2/e;-><init>(J)V

    invoke-virtual {v2, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_19

    :cond_29
    iget-object v1, v0, Ll3/a;->e:Ljava/lang/CharSequence;

    instance-of v2, v1, Landroid/text/Spanned;

    if-nez v2, :cond_2a

    sget-object v1, Lm83/y;->w:Lm83/y;

    goto/16 :goto_26

    :cond_2a
    move-object v2, v1

    check-cast v2, Landroid/text/Spanned;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v3, Lo3/h;

    const/4 v4, 0x0

    invoke-interface {v2, v4, v1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v1

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v1

    const/4 v7, 0x0

    :goto_1a
    if-ge v7, v4, :cond_35

    aget-object v5, v1, v7

    check-cast v5, Lo3/h;

    invoke-interface {v2, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {v2, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v8

    iget-object v9, v0, Ll3/a;->d:Lm3/m;

    iget-object v9, v9, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v9, v6}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v9

    iget v10, v0, Ll3/a;->b:I

    if-lt v9, v10, :cond_2b

    const/4 v10, 0x1

    goto :goto_1b

    :cond_2b
    const/4 v10, 0x0

    :goto_1b
    iget-object v11, v0, Ll3/a;->d:Lm3/m;

    iget-object v11, v11, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v11, v9}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v11

    if-lez v11, :cond_2c

    iget-object v11, v0, Ll3/a;->d:Lm3/m;

    iget-object v11, v11, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v11, v9}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v11

    if-le v8, v11, :cond_2c

    const/4 v11, 0x1

    goto :goto_1c

    :cond_2c
    const/4 v11, 0x0

    :goto_1c
    iget-object v12, v0, Ll3/a;->d:Lm3/m;

    invoke-virtual {v12, v9}, Lm3/m;->f(I)I

    move-result v12

    if-le v8, v12, :cond_2d

    const/4 v8, 0x1

    goto :goto_1d

    :cond_2d
    const/4 v8, 0x0

    :goto_1d
    if-nez v11, :cond_2e

    if-nez v8, :cond_2e

    if-eqz v10, :cond_2f

    :cond_2e
    move/from16 v12, v16

    const/4 v11, 0x0

    const/4 v14, 0x1

    goto/16 :goto_24

    :cond_2f
    iget-object v8, v0, Ll3/a;->d:Lm3/m;

    iget-object v8, v8, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v8, v6}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v8

    if-eqz v8, :cond_30

    sget-object v8, Lw3/j;->x:Lw3/j;

    goto :goto_1e

    :cond_30
    sget-object v8, Lw3/j;->w:Lw3/j;

    :goto_1e
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    const-string v10, "PlaceholderSpan is not laid out yet."

    if-eqz v8, :cond_33

    const/4 v14, 0x1

    if-ne v8, v14, :cond_32

    iget-object v8, v0, Ll3/a;->d:Lm3/m;

    const/4 v11, 0x0

    invoke-virtual {v8, v6, v11}, Lm3/m;->h(IZ)F

    move-result v6

    iget-boolean v8, v5, Lo3/h;->J:Z

    if-nez v8, :cond_31

    invoke-static {v10}, Lr3/a;->c(Ljava/lang/String;)V

    :cond_31
    iget v8, v5, Lo3/h;->H:I

    int-to-float v8, v8

    sub-float/2addr v6, v8

    const/4 v11, 0x0

    goto :goto_1f

    :cond_32
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_33
    const/4 v14, 0x1

    iget-object v8, v0, Ll3/a;->d:Lm3/m;

    const/4 v11, 0x0

    invoke-virtual {v8, v6, v11}, Lm3/m;->h(IZ)F

    move-result v6

    :goto_1f
    iget-boolean v8, v5, Lo3/h;->J:Z

    if-nez v8, :cond_34

    invoke-static {v10}, Lr3/a;->c(Ljava/lang/String;)V

    :cond_34
    iget v8, v5, Lo3/h;->H:I

    int-to-float v8, v8

    add-float/2addr v8, v6

    iget-object v10, v0, Ll3/a;->d:Lm3/m;

    iget v12, v5, Lo3/h;->F:I

    packed-switch v12, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "unexpected verticalAlignment"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-virtual {v5}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v12

    iget v13, v12, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iget v12, v12, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int/2addr v13, v12

    invoke-virtual {v5}, Lo3/h;->b()I

    move-result v12

    sub-int/2addr v13, v12

    div-int/lit8 v13, v13, 0x2

    int-to-float v12, v13

    invoke-virtual {v10, v9}, Lm3/m;->d(I)F

    move-result v9

    :goto_20
    add-float/2addr v9, v12

    :goto_21
    move/from16 v12, v16

    goto :goto_23

    :pswitch_1
    invoke-virtual {v5}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v12

    iget v12, v12, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    int-to-float v12, v12

    invoke-virtual {v10, v9}, Lm3/m;->d(I)F

    move-result v9

    add-float/2addr v9, v12

    invoke-virtual {v5}, Lo3/h;->b()I

    move-result v10

    int-to-float v10, v10

    sub-float/2addr v9, v10

    goto :goto_21

    :pswitch_2
    invoke-virtual {v5}, Lo3/h;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v12

    iget v12, v12, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    int-to-float v12, v12

    invoke-virtual {v10, v9}, Lm3/m;->d(I)F

    move-result v9

    goto :goto_20

    :pswitch_3
    invoke-virtual {v10, v9}, Lm3/m;->g(I)F

    move-result v12

    invoke-virtual {v10, v9}, Lm3/m;->e(I)F

    move-result v9

    add-float/2addr v9, v12

    invoke-virtual {v5}, Lo3/h;->b()I

    move-result v10

    int-to-float v10, v10

    sub-float/2addr v9, v10

    move/from16 v12, v16

    int-to-float v10, v12

    div-float/2addr v9, v10

    goto :goto_23

    :pswitch_4
    move/from16 v12, v16

    invoke-virtual {v10, v9}, Lm3/m;->e(I)F

    move-result v9

    invoke-virtual {v5}, Lo3/h;->b()I

    move-result v10

    :goto_22
    int-to-float v10, v10

    sub-float/2addr v9, v10

    goto :goto_23

    :pswitch_5
    move/from16 v12, v16

    invoke-virtual {v10, v9}, Lm3/m;->g(I)F

    move-result v9

    goto :goto_23

    :pswitch_6
    move/from16 v12, v16

    invoke-virtual {v10, v9}, Lm3/m;->d(I)F

    move-result v9

    invoke-virtual {v5}, Lo3/h;->b()I

    move-result v10

    goto :goto_22

    :goto_23
    invoke-virtual {v5}, Lo3/h;->b()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v9

    new-instance v10, Lh2/c;

    invoke-direct {v10, v6, v9, v8, v5}, Lh2/c;-><init>(FFFF)V

    goto :goto_25

    :goto_24
    const/4 v10, 0x0

    :goto_25
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    move/from16 v16, v12

    goto/16 :goto_1a

    :cond_35
    move-object v1, v3

    :goto_26
    iput-object v1, v0, Ll3/a;->f:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lm3/m;
    .locals 16

    invoke-virtual/range {p0 .. p0}, Ll3/a;->d()F

    move-result v2

    move-object/from16 v15, p0

    iget-object v0, v15, Ll3/a;->a:Lt3/c;

    iget-object v3, v0, Lt3/c;->g:Lt3/d;

    iget v6, v0, Lt3/c;->l:I

    iget-object v14, v0, Lt3/c;->i:Lm3/h;

    iget-object v0, v0, Lt3/c;->b:Ll3/v0;

    sget-object v1, Lt3/b;->a:Lt3/a;

    iget-object v0, v0, Ll3/v0;->c:Ll3/g0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll3/g0;->b:Ll3/e0;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ll3/e0;->a:Z

    :goto_0
    move v7, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v0, Lm3/m;

    move/from16 v4, p1

    move/from16 v13, p2

    move-object/from16 v5, p3

    move/from16 v8, p4

    move/from16 v12, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move-object/from16 v1, p9

    invoke-direct/range {v0 .. v14}, Lm3/m;-><init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILm3/h;)V

    return-object v0
.end method

.method public final b()F
    .locals 1

    iget-object v0, p0, Ll3/a;->d:Lm3/m;

    invoke-virtual {v0}, Lm3/m;->a()I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method public final c(Lh2/c;ILi7/g;)J
    .locals 7

    invoke-static {p1}, Li2/w0;->F(Lh2/c;)Landroid/graphics/RectF;

    move-result-object v3

    const/4 p1, 0x0

    invoke-static {p2, p1}, Ll3/s;->b(II)Z

    move-result v0

    const/4 v6, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2, v6}, Ll3/s;->b(II)Z

    move-result p2

    if-eqz p2, :cond_1

    move v4, v6

    goto :goto_1

    :cond_1
    :goto_0
    move v4, p1

    :goto_1
    new-instance v5, Lkk1/b;

    const/16 p2, 0xb

    invoke-direct {v5, p3, p2}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x22

    iget-object v0, p0, Ll3/a;->d:Lm3/m;

    if-lt p2, p3, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v3, v4, v5}, Lb3/g1;->f(Lm3/m;Landroid/graphics/RectF;ILkk1/b;)[I

    move-result-object p2

    goto :goto_2

    :cond_2
    iget-object v1, v0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0}, Lm3/m;->c()Lb30/m;

    move-result-object v2

    invoke-static/range {v0 .. v5}, Ldp/d;->L(Lm3/m;Landroid/text/Layout;Lb30/m;Landroid/graphics/RectF;ILkk1/b;)[I

    move-result-object p2

    :goto_2
    if-nez p2, :cond_3

    sget-wide p1, Ll3/u0;->b:J

    return-wide p1

    :cond_3
    aget p1, p2, p1

    aget p2, p2, v6

    invoke-static {p1, p2}, Lj93/l0;->f(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public final d()F
    .locals 2

    iget-wide v0, p0, Ll3/a;->c:J

    invoke-static {v0, v1}, Ly3/a;->i(J)I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method public final e(Li2/v;)V
    .locals 5

    invoke-static {p1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object p1

    iget-object v0, p0, Ll3/a;->d:Lm3/m;

    iget-boolean v1, v0, Lm3/m;->d:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0}, Ll3/a;->d()F

    move-result v1

    invoke-virtual {p0}, Ll3/a;->b()F

    move-result v3

    invoke-virtual {p1, v2, v2, v1, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    :cond_0
    iget v1, v0, Lm3/m;->h:I

    iget-object v3, v0, Lm3/m;->p:Landroid/graphics/Rect;

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    int-to-float v3, v1

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_2
    sget-object v3, Lm3/n;->a:Lm3/l;

    iput-object p1, v3, Lm3/l;->a:Landroid/graphics/Canvas;

    iget-object v4, v0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v4, v3}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    if-eqz v1, :cond_3

    const/4 v3, -0x1

    int-to-float v3, v3

    int-to-float v1, v1

    mul-float/2addr v3, v1

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_3
    :goto_0
    iget-boolean v0, v0, Lm3/m;->d:Z

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_4
    return-void
.end method

.method public final f(Li2/v;JLi2/z0;Lw3/l;Lk2/f;)V
    .locals 2

    iget-object v0, p0, Ll3/a;->a:Lt3/c;

    iget-object v0, v0, Lt3/c;->g:Lt3/d;

    iget v1, v0, Lt3/d;->c:I

    invoke-virtual {v0, p2, p3}, Lt3/d;->d(J)V

    invoke-virtual {v0, p4}, Lt3/d;->f(Li2/z0;)V

    invoke-virtual {v0, p5}, Lt3/d;->g(Lw3/l;)V

    invoke-virtual {v0, p6}, Lt3/d;->e(Lk2/f;)V

    const/4 p2, 0x3

    invoke-virtual {v0, p2}, Lt3/d;->b(I)V

    invoke-virtual {p0, p1}, Ll3/a;->e(Li2/v;)V

    invoke-virtual {v0, v1}, Lt3/d;->b(I)V

    return-void
.end method

.method public final g(Li2/v;Li2/t;FLi2/z0;Lw3/l;Lk2/f;)V
    .locals 8

    iget-object v0, p0, Ll3/a;->a:Lt3/c;

    iget-object v0, v0, Lt3/c;->g:Lt3/d;

    iget v1, v0, Lt3/d;->c:I

    invoke-virtual {p0}, Ll3/a;->d()F

    move-result v2

    invoke-virtual {p0}, Ll3/a;->b()F

    move-result v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v4, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    const-wide v6, 0xffffffffL

    and-long/2addr v2, v6

    or-long/2addr v2, v4

    invoke-virtual {v0, p2, v2, v3, p3}, Lt3/d;->c(Li2/t;JF)V

    invoke-virtual {v0, p4}, Lt3/d;->f(Li2/z0;)V

    invoke-virtual {v0, p5}, Lt3/d;->g(Lw3/l;)V

    invoke-virtual {v0, p6}, Lt3/d;->e(Lk2/f;)V

    const/4 p2, 0x3

    invoke-virtual {v0, p2}, Lt3/d;->b(I)V

    invoke-virtual {p0, p1}, Ll3/a;->e(Li2/v;)V

    invoke-virtual {v0, v1}, Lt3/d;->b(I)V

    return-void
.end method
