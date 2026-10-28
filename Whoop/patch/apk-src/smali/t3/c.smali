.class public final Lt3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/a0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ll3/v0;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lp3/h;

.field public final f:Ly3/c;

.field public final g:Lt3/d;

.field public final h:Ljava/lang/CharSequence;

.field public final i:Lm3/h;

.field public j:Lq30/w0;

.field public final k:Z

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll3/v0;Ljava/util/List;Ljava/util/List;Lp3/h;Ly3/c;)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    iput-object v4, v0, Lt3/c;->a:Ljava/lang/String;

    iput-object v1, v0, Lt3/c;->b:Ll3/v0;

    iput-object v2, v0, Lt3/c;->c:Ljava/util/List;

    move-object/from16 v4, p4

    iput-object v4, v0, Lt3/c;->d:Ljava/util/List;

    move-object/from16 v4, p5

    iput-object v4, v0, Lt3/c;->e:Lp3/h;

    iput-object v3, v0, Lt3/c;->f:Ly3/c;

    new-instance v4, Lt3/d;

    invoke-interface {v3}, Ly3/c;->getDensity()F

    move-result v5

    const/4 v6, 0x1

    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    iput v5, v4, Landroid/text/TextPaint;->density:F

    sget-object v5, Lw3/l;->b:Lw3/l;

    iput-object v5, v4, Lt3/d;->b:Lw3/l;

    const/4 v5, 0x3

    iput v5, v4, Lt3/d;->c:I

    sget-object v7, Li2/z0;->d:Li2/z0;

    iput-object v7, v4, Lt3/d;->d:Li2/z0;

    iput-object v4, v0, Lt3/c;->g:Lt3/d;

    iget-object v7, v1, Ll3/v0;->c:Ll3/g0;

    iget-object v7, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v1, v1, Ll3/v0;->b:Ll3/b0;

    sget-object v8, Lt3/h;->a:Laj/d;

    sget-object v8, Lt3/h;->a:Laj/d;

    iget-object v9, v8, Laj/d;->w:Ljava/lang/Object;

    check-cast v9, Lp1/t2;

    if-eqz v9, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lh6/j;->d()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v8}, Laj/d;->k()Lp1/t2;

    move-result-object v9

    iput-object v9, v8, Laj/d;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sget-object v9, Lt3/i;->a:Lt3/j;

    :goto_0
    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    iput-boolean v8, v0, Lt3/c;->k:Z

    iget v8, v1, Ll3/b0;->b:I

    iget-object v9, v7, Ll3/m0;->k:Ls3/b;

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/4 v13, 0x0

    if-ne v8, v11, :cond_3

    :cond_2
    :goto_1
    move v8, v12

    goto :goto_3

    :cond_3
    if-ne v8, v10, :cond_5

    :cond_4
    move v8, v5

    goto :goto_3

    :cond_5
    if-ne v8, v6, :cond_6

    move v8, v13

    goto :goto_3

    :cond_6
    if-ne v8, v12, :cond_7

    move v8, v6

    goto :goto_3

    :cond_7
    if-ne v8, v5, :cond_8

    goto :goto_2

    :cond_8
    const/high16 v14, -0x80000000

    if-ne v8, v14, :cond_85

    :goto_2
    if-eqz v9, :cond_9

    invoke-virtual {v9}, Ls3/b;->a()Ls3/a;

    move-result-object v8

    iget-object v8, v8, Ls3/a;->a:Ljava/util/Locale;

    if-nez v8, :cond_a

    :cond_9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    :cond_a
    invoke-static {v8}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v8

    if-eqz v8, :cond_2

    if-eq v8, v6, :cond_4

    goto :goto_1

    :goto_3
    iput v8, v0, Lt3/c;->l:I

    new-instance v8, Ll80/m;

    invoke-direct {v8, v0, v6}, Ll80/m;-><init>(Ljava/lang/Object;I)V

    iget-object v1, v1, Ll3/b0;->i:Lw3/s;

    if-nez v1, :cond_b

    sget-object v1, Lw3/s;->c:Lw3/s;

    :cond_b
    iget-boolean v9, v1, Lw3/s;->b:Z

    if-eqz v9, :cond_c

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v9

    or-int/lit16 v9, v9, 0x80

    goto :goto_4

    :cond_c
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v9

    and-int/lit16 v9, v9, -0x81

    :goto_4
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setFlags(I)V

    iget v1, v1, Lw3/s;->a:I

    if-ne v1, v6, :cond_d

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x40

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_5

    :cond_d
    if-ne v1, v12, :cond_e

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_5

    :cond_e
    if-ne v1, v5, :cond_f

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_5

    :cond_f
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    :goto_5
    move-object v1, v2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move v9, v13

    :goto_6
    if-ge v9, v1, :cond_11

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    move-object v14, v15

    check-cast v14, Ll3/e;

    iget-object v14, v14, Ll3/e;->a:Ljava/lang/Object;

    instance-of v14, v14, Ll3/m0;

    if-eqz v14, :cond_10

    goto :goto_7

    :cond_10
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :cond_11
    const/4 v15, 0x0

    :goto_7
    if-eqz v15, :cond_12

    move v1, v6

    goto :goto_8

    :cond_12
    move v1, v13

    :goto_8
    iget-wide v14, v7, Ll3/m0;->b:J

    iget-object v2, v7, Ll3/m0;->c:Lp3/r;

    iget-object v9, v7, Ll3/m0;->d:Lp3/n;

    iget-object v10, v7, Ll3/m0;->g:Ljava/lang/String;

    iget-object v11, v7, Ll3/m0;->k:Ls3/b;

    iget-object v12, v7, Ll3/m0;->a:Lw3/o;

    move/from16 v16, v6

    iget-object v6, v7, Ll3/m0;->j:Lw3/p;

    move-object/from16 p3, v6

    iget-wide v5, v7, Ll3/m0;->h:J

    move-wide/from16 v18, v14

    invoke-static/range {v18 .. v19}, Ly3/o;->b(J)J

    move-result-wide v13

    move v15, v1

    move-object/from16 v20, v2

    const-wide v1, 0x100000000L

    invoke-static {v13, v14, v1, v2}, Ly3/p;->a(JJ)Z

    move-result v21

    if-eqz v21, :cond_13

    move-wide/from16 v1, v18

    invoke-interface {v3, v1, v2}, Ly3/c;->K(J)F

    move-result v1

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_9

    :cond_13
    const-wide v1, 0x200000000L

    invoke-static {v13, v14, v1, v2}, Ly3/p;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_14

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    invoke-static/range {v18 .. v19}, Ly3/o;->c(J)F

    move-result v2

    mul-float/2addr v2, v1

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_14
    :goto_9
    iget-object v1, v7, Ll3/m0;->f:Lp3/i;

    if-nez v1, :cond_16

    if-nez v9, :cond_16

    if-eqz v20, :cond_15

    goto :goto_a

    :cond_15
    move-object/from16 v18, v12

    goto :goto_f

    :cond_16
    :goto_a
    if-nez v20, :cond_17

    sget-object v2, Lp3/r;->F:Lp3/r;

    goto :goto_b

    :cond_17
    move-object/from16 v2, v20

    :goto_b
    if-eqz v9, :cond_18

    iget v9, v9, Lp3/n;->a:I

    goto :goto_c

    :cond_18
    const/4 v9, 0x0

    :goto_c
    iget-object v13, v7, Ll3/m0;->e:Lp3/o;

    if-eqz v13, :cond_19

    iget v13, v13, Lp3/o;->a:I

    goto :goto_d

    :cond_19
    const v13, 0xffff

    :goto_d
    iget-object v14, v8, Ll80/m;->x:Ljava/lang/Object;

    check-cast v14, Lt3/c;

    move-object/from16 v18, v12

    iget-object v12, v14, Lt3/c;->e:Lp3/h;

    check-cast v12, Lp3/j;

    invoke-virtual {v12, v1, v2, v9, v13}, Lp3/j;->b(Lp3/i;Lp3/r;II)Lp3/e0;

    move-result-object v1

    instance-of v2, v1, Lp3/d0;

    if-nez v2, :cond_1a

    new-instance v2, Lq30/w0;

    iget-object v9, v14, Lt3/c;->j:Lq30/w0;

    invoke-direct {v2, v1, v9}, Lq30/w0;-><init>(Lp3/e0;Lq30/w0;)V

    iput-object v2, v14, Lt3/c;->j:Lq30/w0;

    invoke-virtual {v2}, Lq30/w0;->v()Landroid/graphics/Typeface;

    move-result-object v1

    goto :goto_e

    :cond_1a
    check-cast v1, Lp3/d0;

    iget-object v1, v1, Lp3/d0;->w:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type android.graphics.Typeface"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/graphics/Typeface;

    :goto_e
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_f
    const/16 v1, 0xa

    if-eqz v11, :cond_1c

    sget-object v2, Ls3/b;->y:Ls3/b;

    sget-object v2, Ls3/c;->a:Ls/m2;

    invoke-virtual {v2}, Ls/m2;->i()Ls3/b;

    move-result-object v2

    invoke-virtual {v11, v2}, Ls3/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v11, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v9, v11, Ls3/b;->w:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ls3/a;

    iget-object v11, v11, Ls3/a;->a:Ljava/util/Locale;

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_1b
    const/4 v11, 0x0

    new-array v9, v11, [Ljava/util/Locale;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/util/Locale;

    array-length v9, v2

    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/util/Locale;

    new-instance v9, Landroid/os/LocaleList;

    invoke-direct {v9, v2}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    :cond_1c
    if-eqz v10, :cond_1d

    const-string v2, ""

    invoke-virtual {v10, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1d
    if-eqz p3, :cond_1e

    sget-object v2, Lw3/p;->c:Lw3/p;

    move-object/from16 v9, p3

    invoke-virtual {v9, v2}, Lw3/p;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v2

    iget v10, v9, Lw3/p;->a:F

    mul-float/2addr v2, v10

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v2

    iget v9, v9, Lw3/p;->b:F

    add-float/2addr v2, v9

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    :cond_1e
    invoke-interface/range {v18 .. v18}, Lw3/o;->b()J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Lt3/d;->d(J)V

    invoke-interface/range {v18 .. v18}, Lw3/o;->c()Li2/t;

    move-result-object v2

    const-wide v9, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-interface/range {v18 .. v18}, Lw3/o;->a()F

    move-result v11

    invoke-virtual {v4, v2, v9, v10, v11}, Lt3/d;->c(Li2/t;JF)V

    iget-object v2, v7, Ll3/m0;->n:Li2/z0;

    invoke-virtual {v4, v2}, Lt3/d;->f(Li2/z0;)V

    iget-object v2, v7, Ll3/m0;->m:Lw3/l;

    invoke-virtual {v4, v2}, Lt3/d;->g(Lw3/l;)V

    iget-object v2, v7, Ll3/m0;->p:Lk2/f;

    invoke-virtual {v4, v2}, Lt3/d;->e(Lk2/f;)V

    invoke-static {v5, v6}, Ly3/o;->b(J)J

    move-result-wide v9

    const-wide v11, 0x100000000L

    invoke-static {v9, v10, v11, v12}, Ly3/p;->a(JJ)Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_21

    invoke-static {v5, v6}, Ly3/o;->c(J)F

    move-result v2

    cmpg-float v2, v2, v9

    if-nez v2, :cond_1f

    goto :goto_11

    :cond_1f
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v10

    mul-float/2addr v10, v2

    invoke-interface {v3, v5, v6}, Ly3/c;->K(J)F

    move-result v2

    cmpg-float v3, v10, v9

    if-nez v3, :cond_20

    goto :goto_12

    :cond_20
    div-float/2addr v2, v10

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_12

    :cond_21
    :goto_11
    invoke-static {v5, v6}, Ly3/o;->b(J)J

    move-result-wide v2

    const-wide v10, 0x200000000L

    invoke-static {v2, v3, v10, v11}, Ly3/p;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-static {v5, v6}, Ly3/o;->c(J)F

    move-result v2

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    :cond_22
    :goto_12
    iget-wide v2, v7, Ll3/m0;->l:J

    iget-object v4, v7, Ll3/m0;->i:Lw3/a;

    if-eqz v15, :cond_24

    invoke-static {v5, v6}, Ly3/o;->b(J)J

    move-result-wide v10

    const-wide v12, 0x100000000L

    invoke-static {v10, v11, v12, v13}, Ly3/p;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_24

    invoke-static {v5, v6}, Ly3/o;->c(J)F

    move-result v7

    cmpg-float v7, v7, v9

    if-nez v7, :cond_23

    goto :goto_13

    :cond_23
    move/from16 v7, v16

    goto :goto_14

    :cond_24
    :goto_13
    const/4 v7, 0x0

    :goto_14
    sget-wide v10, Li2/x;->n:J

    invoke-static {v2, v3, v10, v11}, Li2/x;->d(JJ)Z

    move-result v12

    if-nez v12, :cond_25

    sget-wide v12, Li2/x;->m:J

    invoke-static {v2, v3, v12, v13}, Li2/x;->d(JJ)Z

    move-result v12

    if-nez v12, :cond_25

    move/from16 v12, v16

    goto :goto_15

    :cond_25
    const/4 v12, 0x0

    :goto_15
    if-eqz v4, :cond_27

    iget v13, v4, Lw3/a;->a:F

    invoke-static {v13, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v13

    if-nez v13, :cond_26

    goto :goto_16

    :cond_26
    move/from16 v13, v16

    goto :goto_17

    :cond_27
    :goto_16
    const/4 v13, 0x0

    :goto_17
    if-nez v7, :cond_28

    if-nez v12, :cond_28

    if-nez v13, :cond_28

    const/4 v2, 0x0

    goto :goto_1c

    :cond_28
    if-eqz v7, :cond_29

    :goto_18
    move-wide/from16 v32, v5

    goto :goto_19

    :cond_29
    sget-wide v5, Ly3/o;->c:J

    goto :goto_18

    :goto_19
    if-eqz v12, :cond_2a

    move-wide/from16 v37, v2

    goto :goto_1a

    :cond_2a
    move-wide/from16 v37, v10

    :goto_1a
    if-eqz v13, :cond_2b

    move-object/from16 v34, v4

    goto :goto_1b

    :cond_2b
    const/16 v34, 0x0

    :goto_1b
    new-instance v22, Ll3/m0;

    const/16 v40, 0x0

    const v41, 0xf67f

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v22 .. v41}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v2, v22

    :goto_1c
    if-eqz v2, :cond_2d

    iget-object v3, v0, Lt3/c;->c:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_1d
    if-ge v5, v3, :cond_2e

    if-nez v5, :cond_2c

    new-instance v6, Ll3/e;

    iget-object v7, v0, Lt3/c;->a:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v11, 0x0

    invoke-direct {v6, v2, v11, v7}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    goto :goto_1e

    :cond_2c
    iget-object v6, v0, Lt3/c;->c:Ljava/util/List;

    add-int/lit8 v7, v5, -0x1

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll3/e;

    :goto_1e
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1d

    :cond_2d
    iget-object v4, v0, Lt3/c;->c:Ljava/util/List;

    :cond_2e
    iget-object v2, v0, Lt3/c;->a:Ljava/lang/String;

    iget-object v3, v0, Lt3/c;->g:Lt3/d;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    iget-object v5, v0, Lt3/c;->b:Ll3/v0;

    iget-object v6, v0, Lt3/c;->d:Ljava/util/List;

    iget-object v13, v0, Lt3/c;->f:Ly3/c;

    iget-boolean v7, v0, Lt3/c;->k:Z

    sget-object v10, Lt3/b;->a:Lt3/a;

    if-eqz v7, :cond_30

    invoke-static {}, Lh6/j;->d()Z

    move-result v7

    if-eqz v7, :cond_30

    iget-object v7, v5, Ll3/v0;->c:Ll3/g0;

    if-eqz v7, :cond_2f

    iget-object v7, v7, Ll3/g0;->b:Ll3/e0;

    :cond_2f
    invoke-static {}, Lh6/j;->a()Lh6/j;

    move-result-object v7

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v11, 0x0

    invoke-virtual {v7, v11, v10, v11, v2}, Lh6/j;->g(IIILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_30
    move-object v7, v2

    :goto_1f
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v10

    const-wide/16 v11, 0x0

    const-wide v14, 0xff00000000L

    if-eqz v10, :cond_31

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_31

    iget-object v10, v5, Ll3/v0;->b:Ll3/b0;

    iget-object v10, v10, Ll3/b0;->d:Lw3/q;

    move/from16 p3, v9

    sget-object v9, Lw3/q;->c:Lw3/q;

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_32

    iget-object v9, v5, Ll3/v0;->b:Ll3/b0;

    iget-wide v9, v9, Ll3/b0;->c:J

    and-long/2addr v9, v14

    cmp-long v9, v9, v11

    if-nez v9, :cond_32

    goto/16 :goto_53

    :cond_31
    move/from16 p3, v9

    :cond_32
    instance-of v9, v7, Landroid/text/Spannable;

    if-eqz v9, :cond_33

    check-cast v7, Landroid/text/Spannable;

    move-object v10, v7

    goto :goto_20

    :cond_33
    new-instance v9, Landroid/text/SpannableString;

    invoke-direct {v9, v7}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v10, v9

    :goto_20
    iget-object v7, v5, Ll3/v0;->a:Ll3/m0;

    iget-object v9, v5, Ll3/v0;->b:Ll3/b0;

    iget-object v7, v7, Ll3/m0;->m:Lw3/l;

    move-wide/from16 v18, v11

    sget-object v11, Lw3/l;->c:Lw3/l;

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/16 v11, 0x21

    if-eqz v7, :cond_34

    sget-object v7, Lt3/b;->a:Lt3/a;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v12, 0x0

    invoke-interface {v10, v7, v12, v2, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_34
    iget-object v2, v5, Ll3/v0;->c:Ll3/g0;

    if-eqz v2, :cond_35

    iget-object v2, v2, Ll3/g0;->b:Ll3/e0;

    if-eqz v2, :cond_35

    iget-boolean v2, v2, Ll3/e0;->a:Z

    goto :goto_21

    :cond_35
    const/4 v2, 0x0

    :goto_21
    if-eqz v2, :cond_38

    iget-object v2, v9, Ll3/b0;->f:Lw3/i;

    if-nez v2, :cond_38

    iget-wide v1, v9, Ll3/b0;->c:J

    invoke-static {v3, v1, v2, v13}, Ldt/b;->L(FJLy3/c;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_36

    new-instance v2, Lo3/f;

    invoke-direct {v2, v1}, Lo3/f;-><init>(F)V

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v12, 0x0

    invoke-interface {v10, v2, v12, v1, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_36
    move-wide/from16 v20, v14

    :cond_37
    const/4 v12, 0x0

    goto :goto_27

    :cond_38
    iget-object v2, v9, Ll3/b0;->f:Lw3/i;

    if-nez v2, :cond_39

    sget-object v2, Lw3/i;->c:Lw3/i;

    :cond_39
    move-wide/from16 v20, v14

    iget-wide v14, v9, Ll3/b0;->c:J

    invoke-static {v3, v14, v15, v13}, Ldt/b;->L(FJLy3/c;)F

    move-result v23

    invoke-static/range {v23 .. v23}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_37

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_3a

    goto :goto_22

    :cond_3a
    invoke-static {v10}, Lyb3/r;->j0(Ljava/lang/CharSequence;)C

    move-result v7

    if-ne v7, v1, :cond_3b

    :goto_22
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    :goto_23
    move/from16 v24, v1

    goto :goto_24

    :cond_3b
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v1

    goto :goto_23

    :goto_24
    new-instance v22, Lo3/g;

    iget v1, v2, Lw3/i;->b:I

    and-int/lit8 v7, v1, 0x1

    if-lez v7, :cond_3c

    move/from16 v25, v16

    goto :goto_25

    :cond_3c
    const/16 v25, 0x0

    :goto_25
    and-int/lit8 v1, v1, 0x10

    if-lez v1, :cond_3d

    move/from16 v26, v16

    goto :goto_26

    :cond_3d
    const/16 v26, 0x0

    :goto_26
    iget v1, v2, Lw3/i;->a:F

    const/16 v28, 0x0

    move/from16 v27, v1

    invoke-direct/range {v22 .. v28}, Lo3/g;-><init>(FIZZFZ)V

    move-object/from16 v1, v22

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v12, 0x0

    invoke-interface {v10, v1, v12, v2, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_27
    iget-object v1, v9, Ll3/b0;->d:Lw3/q;

    if-eqz v1, :cond_3f

    iget-wide v14, v1, Lw3/q;->a:J

    iget-wide v1, v1, Lw3/q;->b:J

    move/from16 v17, v12

    invoke-static/range {v17 .. v17}, Lv63/c;->h(I)J

    move-result-wide v11

    invoke-static {v14, v15, v11, v12}, Ly3/o;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_3e

    invoke-static/range {v17 .. v17}, Lv63/c;->h(I)J

    move-result-wide v11

    invoke-static {v1, v2, v11, v12}, Ly3/o;->a(JJ)Z

    move-result v7

    if-nez v7, :cond_3f

    :cond_3e
    and-long v11, v14, v20

    cmp-long v7, v11, v18

    if-nez v7, :cond_40

    :cond_3f
    :goto_28
    move-object/from16 v18, v6

    goto/16 :goto_2b

    :cond_40
    and-long v11, v1, v20

    cmp-long v7, v11, v18

    if-nez v7, :cond_41

    goto :goto_28

    :cond_41
    invoke-static {v14, v15}, Ly3/o;->b(J)J

    move-result-wide v11

    move-object/from16 v18, v6

    const-wide v6, 0x100000000L

    invoke-static {v11, v12, v6, v7}, Ly3/p;->a(JJ)Z

    move-result v19

    if-eqz v19, :cond_42

    invoke-interface {v13, v14, v15}, Ly3/c;->K(J)F

    move-result v11

    const-wide v6, 0x200000000L

    goto :goto_29

    :cond_42
    const-wide v6, 0x200000000L

    invoke-static {v11, v12, v6, v7}, Ly3/p;->a(JJ)Z

    move-result v11

    if-eqz v11, :cond_43

    invoke-static {v14, v15}, Ly3/o;->c(J)F

    move-result v11

    mul-float/2addr v11, v3

    goto :goto_29

    :cond_43
    move/from16 v11, p3

    :goto_29
    invoke-static {v1, v2}, Ly3/o;->b(J)J

    move-result-wide v14

    const-wide v6, 0x100000000L

    invoke-static {v14, v15, v6, v7}, Ly3/p;->a(JJ)Z

    move-result v12

    if-eqz v12, :cond_44

    invoke-interface {v13, v1, v2}, Ly3/c;->K(J)F

    move-result v1

    goto :goto_2a

    :cond_44
    const-wide v6, 0x200000000L

    invoke-static {v14, v15, v6, v7}, Ly3/p;->a(JJ)Z

    move-result v12

    if-eqz v12, :cond_45

    invoke-static {v1, v2}, Ly3/o;->c(J)F

    move-result v1

    mul-float/2addr v1, v3

    goto :goto_2a

    :cond_45
    move/from16 v1, p3

    :goto_2a
    new-instance v2, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v6, v11

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v6, v6

    float-to-int v6, v6

    float-to-double v11, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-float v1, v11

    float-to-int v1, v1

    invoke-direct {v2, v6, v1}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v6, 0x21

    const/4 v11, 0x0

    invoke-interface {v10, v2, v11, v1, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_2b
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v4

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_2c
    if-ge v7, v6, :cond_4a

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll3/e;

    iget-object v12, v11, Ll3/e;->a:Ljava/lang/Object;

    instance-of v14, v12, Ll3/m0;

    if-eqz v14, :cond_49

    move-object v14, v12

    check-cast v14, Ll3/m0;

    iget-object v15, v14, Ll3/m0;->f:Lp3/i;

    if-nez v15, :cond_47

    iget-object v15, v14, Ll3/m0;->d:Lp3/n;

    if-nez v15, :cond_47

    iget-object v14, v14, Ll3/m0;->c:Lp3/r;

    if-eqz v14, :cond_46

    goto :goto_2d

    :cond_46
    const/4 v14, 0x0

    goto :goto_2e

    :cond_47
    :goto_2d
    move/from16 v14, v16

    :goto_2e
    if-nez v14, :cond_48

    check-cast v12, Ll3/m0;

    iget-object v12, v12, Ll3/m0;->e:Lp3/o;

    if-eqz v12, :cond_49

    :cond_48
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_49
    add-int/lit8 v7, v7, 0x1

    goto :goto_2c

    :cond_4a
    iget-object v5, v5, Ll3/v0;->a:Ll3/m0;

    iget-object v6, v5, Ll3/m0;->f:Lp3/i;

    if-nez v6, :cond_4c

    iget-object v7, v5, Ll3/m0;->d:Lp3/n;

    if-nez v7, :cond_4c

    iget-object v7, v5, Ll3/m0;->c:Lp3/r;

    if-eqz v7, :cond_4b

    goto :goto_2f

    :cond_4b
    const/4 v7, 0x0

    goto :goto_30

    :cond_4c
    :goto_2f
    move/from16 v7, v16

    :goto_30
    if-nez v7, :cond_4e

    iget-object v7, v5, Ll3/m0;->e:Lp3/o;

    if-eqz v7, :cond_4d

    goto :goto_31

    :cond_4d
    const/4 v5, 0x0

    goto :goto_32

    :cond_4e
    :goto_31
    iget-object v7, v5, Ll3/m0;->c:Lp3/r;

    iget-object v11, v5, Ll3/m0;->d:Lp3/n;

    iget-object v5, v5, Ll3/m0;->e:Lp3/o;

    new-instance v22, Ll3/m0;

    const/16 v40, 0x0

    const v41, 0xffc3

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move-object/from16 v27, v7

    move-object/from16 v28, v11

    invoke-direct/range {v22 .. v41}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v22

    :goto_32
    new-instance v6, Lbp0/h;

    const/4 v7, 0x3

    invoke-direct {v6, v7, v10, v8}, Lbp0/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    move/from16 v8, v16

    if-gt v7, v8, :cond_51

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_50

    const/4 v11, 0x0

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll3/e;

    iget-object v7, v7, Ll3/e;->a:Ljava/lang/Object;

    check-cast v7, Ll3/m0;

    if-nez v5, :cond_4f

    goto :goto_33

    :cond_4f
    invoke-virtual {v5, v7}, Ll3/m0;->d(Ll3/m0;)Ll3/m0;

    move-result-object v7

    :goto_33
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/e;

    iget v5, v5, Ll3/e;->b:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/e;

    iget v1, v1, Ll3/e;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v7, v5, v1}, Lbp0/h;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_50
    move-object/from16 v19, v2

    const/16 v17, 0x0

    goto/16 :goto_3a

    :cond_51
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    mul-int/lit8 v8, v7, 0x2

    new-array v11, v8, [I

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v14, 0x0

    :goto_34
    if-ge v14, v12, :cond_52

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll3/e;

    move-object/from16 v19, v2

    iget v2, v15, Ll3/e;->b:I

    aput v2, v11, v14

    add-int v2, v14, v7

    iget v15, v15, Ll3/e;->c:I

    aput v15, v11, v2

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v2, v19

    goto :goto_34

    :cond_52
    move-object/from16 v19, v2

    const/4 v2, 0x1

    if-le v8, v2, :cond_53

    invoke-static {v11}, Ljava/util/Arrays;->sort([I)V

    :cond_53
    if-eqz v8, :cond_84

    const/16 v17, 0x0

    aget v2, v11, v17

    move/from16 v7, v17

    :goto_35
    if-ge v7, v8, :cond_59

    aget v12, v11, v7

    if-ne v12, v2, :cond_54

    move-object/from16 v22, v1

    move-object/from16 v20, v5

    move/from16 v21, v7

    move/from16 v23, v8

    goto :goto_39

    :cond_54
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v14

    move-object/from16 v20, v5

    move/from16 v15, v17

    :goto_36
    if-ge v15, v14, :cond_57

    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v22, v1

    move-object/from16 v1, v21

    check-cast v1, Ll3/e;

    move/from16 v21, v7

    iget v7, v1, Ll3/e;->b:I

    move/from16 v23, v8

    iget v8, v1, Ll3/e;->c:I

    if-eq v7, v8, :cond_56

    invoke-static {v2, v12, v7, v8}, Ll3/h;->b(IIII)Z

    move-result v7

    if-eqz v7, :cond_56

    iget-object v1, v1, Ll3/e;->a:Ljava/lang/Object;

    check-cast v1, Ll3/m0;

    if-nez v5, :cond_55

    :goto_37
    move-object v5, v1

    goto :goto_38

    :cond_55
    invoke-virtual {v5, v1}, Ll3/m0;->d(Ll3/m0;)Ll3/m0;

    move-result-object v1

    goto :goto_37

    :cond_56
    :goto_38
    add-int/lit8 v15, v15, 0x1

    move/from16 v7, v21

    move-object/from16 v1, v22

    move/from16 v8, v23

    goto :goto_36

    :cond_57
    move-object/from16 v22, v1

    move/from16 v21, v7

    move/from16 v23, v8

    if-eqz v5, :cond_58

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v6, v5, v1, v2}, Lbp0/h;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_58
    move v2, v12

    :goto_39
    add-int/lit8 v7, v21, 0x1

    move-object/from16 v5, v20

    move-object/from16 v1, v22

    move/from16 v8, v23

    goto :goto_35

    :cond_59
    :goto_3a
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v1

    move/from16 v2, v17

    move v5, v2

    :goto_3b
    if-ge v2, v1, :cond_6a

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll3/e;

    iget-object v7, v6, Ll3/e;->a:Ljava/lang/Object;

    instance-of v8, v7, Ll3/m0;

    if-eqz v8, :cond_5a

    iget v14, v6, Ll3/e;->b:I

    iget v15, v6, Ll3/e;->c:I

    if-ltz v14, :cond_5a

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v14, v6, :cond_5a

    if-le v15, v14, :cond_5a

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-le v15, v6, :cond_5b

    :cond_5a
    move/from16 v20, v1

    move v6, v2

    move/from16 v21, v5

    move-object v2, v10

    goto/16 :goto_43

    :cond_5b
    check-cast v7, Ll3/m0;

    iget-wide v11, v7, Ll3/m0;->h:J

    iget-object v6, v7, Ll3/m0;->i:Lw3/a;

    iget-object v8, v7, Ll3/m0;->a:Lw3/o;

    if-eqz v6, :cond_5c

    iget v6, v6, Lw3/a;->a:F

    move/from16 v20, v1

    new-instance v1, Lo3/a;

    invoke-direct {v1, v6}, Lo3/a;-><init>(F)V

    const/16 v6, 0x21

    invoke-interface {v10, v1, v14, v15, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_3c
    move v6, v2

    goto :goto_3d

    :cond_5c
    move/from16 v20, v1

    goto :goto_3c

    :goto_3d
    invoke-interface {v8}, Lw3/o;->b()J

    move-result-wide v1

    invoke-static {v10, v1, v2, v14, v15}, Ldt/b;->P(Landroid/text/Spannable;JII)V

    invoke-interface {v8}, Lw3/o;->c()Li2/t;

    move-result-object v1

    invoke-interface {v8}, Lw3/o;->a()F

    move-result v2

    if-eqz v1, :cond_5e

    instance-of v8, v1, Li2/c1;

    if-eqz v8, :cond_5d

    check-cast v1, Li2/c1;

    iget-wide v1, v1, Li2/c1;->c:J

    invoke-static {v10, v1, v2, v14, v15}, Ldt/b;->P(Landroid/text/Spannable;JII)V

    goto :goto_3e

    :cond_5d
    new-instance v8, Lv3/d;

    check-cast v1, Li2/y0;

    invoke-direct {v8, v1, v2}, Lv3/d;-><init>(Li2/y0;F)V

    const/16 v1, 0x21

    invoke-interface {v10, v8, v14, v15, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_5e
    :goto_3e
    iget-object v1, v7, Ll3/m0;->m:Lw3/l;

    if-eqz v1, :cond_61

    iget v1, v1, Lw3/l;->a:I

    new-instance v2, Lo3/k;

    or-int/lit8 v8, v1, 0x1

    if-ne v8, v1, :cond_5f

    const/4 v8, 0x1

    goto :goto_3f

    :cond_5f
    move/from16 v8, v17

    :goto_3f
    move/from16 v21, v5

    or-int/lit8 v5, v1, 0x2

    if-ne v5, v1, :cond_60

    const/4 v1, 0x1

    goto :goto_40

    :cond_60
    move/from16 v1, v17

    :goto_40
    invoke-direct {v2, v8, v1}, Lo3/k;-><init>(ZZ)V

    const/16 v1, 0x21

    invoke-interface {v10, v2, v14, v15, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_41
    move-wide/from16 v22, v11

    goto :goto_42

    :cond_61
    move/from16 v21, v5

    const/16 v1, 0x21

    goto :goto_41

    :goto_42
    iget-wide v11, v7, Ll3/m0;->b:J

    invoke-static/range {v10 .. v15}, Ldt/b;->Q(Landroid/text/Spannable;JLy3/c;II)V

    move-object v2, v10

    iget-object v5, v7, Ll3/m0;->g:Ljava/lang/String;

    if-eqz v5, :cond_62

    new-instance v8, Lc73/d;

    const/4 v10, 0x1

    invoke-direct {v8, v5, v10}, Lc73/d;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v2, v8, v14, v15, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_62
    iget-object v5, v7, Ll3/m0;->j:Lw3/p;

    if-eqz v5, :cond_63

    new-instance v8, Landroid/text/style/ScaleXSpan;

    iget v10, v5, Lw3/p;->a:F

    invoke-direct {v8, v10}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    invoke-interface {v2, v8, v14, v15, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    new-instance v8, Lo3/j;

    iget v5, v5, Lw3/p;->b:F

    invoke-direct {v8, v5}, Lo3/j;-><init>(F)V

    invoke-interface {v2, v8, v14, v15, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_63
    iget-object v5, v7, Ll3/m0;->k:Ls3/b;

    invoke-static {v2, v5, v14, v15}, Ldt/b;->R(Landroid/text/Spannable;Ls3/b;II)V

    iget-wide v10, v7, Ll3/m0;->l:J

    const-wide/16 v24, 0x10

    cmp-long v5, v10, v24

    if-eqz v5, :cond_64

    new-instance v5, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v10, v11}, Li2/w0;->H(J)I

    move-result v8

    invoke-direct {v5, v8}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    invoke-interface {v2, v5, v14, v15, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_64
    iget-object v5, v7, Ll3/m0;->n:Li2/z0;

    if-eqz v5, :cond_66

    iget-wide v10, v5, Li2/z0;->b:J

    new-instance v8, Lo3/i;

    move-object/from16 v24, v2

    iget-wide v1, v5, Li2/z0;->a:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result v1

    const/16 v2, 0x20

    move-wide/from16 v25, v10

    shr-long v10, v25, v2

    long-to-int v2, v10

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v10, 0xffffffffL

    and-long v10, v25, v10

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    iget v5, v5, Li2/z0;->c:F

    cmpg-float v11, v5, p3

    if-nez v11, :cond_65

    const/4 v5, 0x1

    :cond_65
    invoke-direct {v8, v1, v2, v10, v5}, Lo3/i;-><init>(IFFF)V

    move-object/from16 v2, v24

    const/16 v1, 0x21

    invoke-interface {v2, v8, v14, v15, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_66
    iget-object v5, v7, Ll3/m0;->p:Lk2/f;

    if-eqz v5, :cond_67

    new-instance v7, Lv3/c;

    invoke-direct {v7, v5}, Lv3/c;-><init>(Lk2/f;)V

    invoke-interface {v2, v7, v14, v15, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_67
    invoke-static/range {v22 .. v23}, Ly3/o;->b(J)J

    move-result-wide v7

    const-wide v11, 0x100000000L

    invoke-static {v7, v8, v11, v12}, Ly3/p;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_68

    invoke-static/range {v22 .. v23}, Ly3/o;->b(J)J

    move-result-wide v7

    const-wide v10, 0x200000000L

    invoke-static {v7, v8, v10, v11}, Ly3/p;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_69

    :cond_68
    const/4 v5, 0x1

    goto :goto_44

    :cond_69
    :goto_43
    move/from16 v5, v21

    :goto_44
    add-int/lit8 v1, v6, 0x1

    move-object v10, v2

    move v2, v1

    move/from16 v1, v20

    goto/16 :goto_3b

    :cond_6a
    move/from16 v21, v5

    move-object v2, v10

    if-eqz v21, :cond_70

    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v1

    move/from16 v11, v17

    :goto_45
    if-ge v11, v1, :cond_70

    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/e;

    iget-object v6, v5, Ll3/e;->a:Ljava/lang/Object;

    check-cast v6, Ll3/b;

    instance-of v7, v6, Ll3/m0;

    if-eqz v7, :cond_6b

    iget v7, v5, Ll3/e;->b:I

    iget v5, v5, Ll3/e;->c:I

    if-ltz v7, :cond_6b

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-ge v7, v8, :cond_6b

    if-le v5, v7, :cond_6b

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-le v5, v8, :cond_6c

    :cond_6b
    move v8, v1

    move v6, v11

    goto :goto_47

    :cond_6c
    check-cast v6, Ll3/m0;

    iget-wide v14, v6, Ll3/m0;->h:J

    move v6, v11

    invoke-static {v14, v15}, Ly3/o;->b(J)J

    move-result-wide v10

    move v8, v1

    const-wide v0, 0x100000000L

    invoke-static {v10, v11, v0, v1}, Ly3/p;->a(JJ)Z

    move-result v12

    if-eqz v12, :cond_6d

    new-instance v0, Lo3/e;

    invoke-interface {v13, v14, v15}, Ly3/c;->K(J)F

    move-result v1

    invoke-direct {v0, v1}, Lo3/e;-><init>(F)V

    goto :goto_46

    :cond_6d
    const-wide v0, 0x200000000L

    invoke-static {v10, v11, v0, v1}, Ly3/p;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_6e

    new-instance v0, Lo3/d;

    invoke-static {v14, v15}, Ly3/o;->c(J)F

    move-result v1

    invoke-direct {v0, v1}, Lo3/d;-><init>(F)V

    goto :goto_46

    :cond_6e
    const/4 v0, 0x0

    :goto_46
    if-eqz v0, :cond_6f

    const/16 v1, 0x21

    invoke-interface {v2, v0, v7, v5, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_6f
    :goto_47
    add-int/lit8 v11, v6, 0x1

    move-object/from16 v0, p0

    move v1, v8

    goto :goto_45

    :cond_70
    iget-object v0, v9, Ll3/b0;->d:Lw3/q;

    if-eqz v0, :cond_73

    iget-wide v0, v0, Lw3/q;->a:J

    invoke-static {v0, v1}, Ly3/o;->b(J)J

    move-result-wide v5

    const-wide v11, 0x100000000L

    invoke-static {v5, v6, v11, v12}, Ly3/p;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_71

    invoke-interface {v13, v0, v1}, Ly3/c;->K(J)F

    move-result v9

    goto :goto_48

    :cond_71
    const-wide v10, 0x200000000L

    invoke-static {v5, v6, v10, v11}, Ly3/p;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_72

    invoke-static {v0, v1}, Ly3/o;->c(J)F

    move-result v0

    mul-float v9, v0, v3

    goto :goto_48

    :cond_72
    move/from16 v9, p3

    :goto_48
    move v15, v9

    goto :goto_49

    :cond_73
    move/from16 v15, p3

    :goto_49
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v0

    move/from16 v1, v17

    :goto_4a
    if-ge v1, v0, :cond_76

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/e;

    iget-object v6, v5, Ll3/e;->a:Ljava/lang/Object;

    instance-of v7, v6, Ll3/l;

    if-eqz v7, :cond_74

    check-cast v6, Ll3/l;

    goto :goto_4b

    :cond_74
    const/4 v6, 0x0

    :goto_4b
    if-eqz v6, :cond_75

    iget-wide v7, v6, Ll3/l;->a:J

    invoke-static {v3, v7, v8, v13}, Ldt/b;->K(FJLy3/c;)F

    move-result v11

    iget-wide v7, v6, Ll3/l;->b:J

    invoke-static {v3, v7, v8, v13}, Ldt/b;->K(FJLy3/c;)F

    move-result v12

    iget-wide v6, v6, Ll3/l;->c:J

    invoke-static {v3, v6, v7, v13}, Ldt/b;->K(FJLy3/c;)F

    move-result v6

    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_75

    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_75

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_75

    new-instance v10, Lv3/b;

    move-object v14, v13

    move v13, v6

    invoke-direct/range {v10 .. v15}, Lv3/b;-><init>(FFFLy3/c;F)V

    move-object v13, v14

    iget v6, v5, Ll3/e;->b:I

    iget v5, v5, Ll3/e;->c:I

    const/16 v7, 0x21

    invoke-interface {v2, v10, v6, v5, v7}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_75
    add-int/lit8 v1, v1, 0x1

    goto :goto_4a

    :cond_76
    move-object/from16 v6, v18

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v0

    move/from16 v11, v17

    :goto_4c
    if-ge v11, v0, :cond_83

    move-object/from16 v1, v18

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll3/e;

    iget-object v4, v3, Ll3/e;->a:Ljava/lang/Object;

    check-cast v4, Ll3/d0;

    iget v5, v3, Ll3/e;->b:I

    iget v3, v3, Ll3/e;->c:I

    const-class v6, Lh6/y;

    invoke-interface {v2, v5, v3, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v6

    array-length v7, v6

    move/from16 v8, v17

    :goto_4d
    if-ge v8, v7, :cond_77

    aget-object v9, v6, v8

    check-cast v9, Lh6/y;

    invoke-interface {v2, v9}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_4d

    :cond_77
    new-instance v22, Lo3/h;

    invoke-virtual {v4}, Ll3/d0;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Ly3/o;->c(J)F

    move-result v23

    invoke-virtual {v4}, Ll3/d0;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Ly3/o;->b(J)J

    move-result-wide v6

    const-wide v8, 0x100000000L

    invoke-static {v6, v7, v8, v9}, Ly3/p;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_78

    move/from16 v24, v17

    const-wide v14, 0x200000000L

    goto :goto_4e

    :cond_78
    const-wide v14, 0x200000000L

    invoke-static {v6, v7, v14, v15}, Ly3/p;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_79

    const/16 v24, 0x1

    goto :goto_4e

    :cond_79
    const/16 v24, 0x2

    :goto_4e
    invoke-virtual {v4}, Ll3/d0;->a()J

    move-result-wide v6

    invoke-static {v6, v7}, Ly3/o;->c(J)F

    move-result v25

    invoke-virtual {v4}, Ll3/d0;->a()J

    move-result-wide v6

    invoke-static {v6, v7}, Ly3/o;->b(J)J

    move-result-wide v6

    invoke-static {v6, v7, v8, v9}, Ly3/p;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_7a

    move/from16 v26, v17

    goto :goto_4f

    :cond_7a
    invoke-static {v6, v7, v14, v15}, Ly3/p;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_7b

    const/16 v26, 0x1

    goto :goto_4f

    :cond_7b
    const/16 v26, 0x2

    :goto_4f
    invoke-interface {v13}, Ly3/c;->m0()F

    move-result v6

    invoke-interface {v13}, Ly3/c;->getDensity()F

    move-result v7

    mul-float v27, v7, v6

    invoke-virtual {v4}, Ll3/d0;->b()I

    move-result v4

    const/4 v10, 0x1

    invoke-static {v4, v10}, Ll3/s;->a(II)Z

    move-result v6

    if-eqz v6, :cond_7c

    move/from16 v28, v17

    :goto_50
    const/4 v7, 0x3

    :goto_51
    const/4 v12, 0x4

    goto :goto_52

    :cond_7c
    const/4 v6, 0x2

    invoke-static {v4, v6}, Ll3/s;->a(II)Z

    move-result v7

    if-eqz v7, :cond_7d

    move/from16 v28, v10

    goto :goto_50

    :cond_7d
    const/4 v7, 0x3

    invoke-static {v4, v7}, Ll3/s;->a(II)Z

    move-result v12

    if-eqz v12, :cond_7e

    move/from16 v28, v6

    goto :goto_51

    :cond_7e
    const/4 v12, 0x4

    invoke-static {v4, v12}, Ll3/s;->a(II)Z

    move-result v16

    if-eqz v16, :cond_7f

    move/from16 v28, v7

    goto :goto_52

    :cond_7f
    const/4 v6, 0x5

    invoke-static {v4, v6}, Ll3/s;->a(II)Z

    move-result v16

    if-eqz v16, :cond_80

    move/from16 v28, v12

    goto :goto_52

    :cond_80
    const/4 v6, 0x6

    invoke-static {v4, v6}, Ll3/s;->a(II)Z

    move-result v16

    if-eqz v16, :cond_81

    const/16 v28, 0x5

    goto :goto_52

    :cond_81
    const/4 v6, 0x7

    invoke-static {v4, v6}, Ll3/s;->a(II)Z

    move-result v4

    if-eqz v4, :cond_82

    const/16 v28, 0x6

    :goto_52
    invoke-direct/range {v22 .. v28}, Lo3/h;-><init>(FIFIFI)V

    move-object/from16 v4, v22

    const/16 v6, 0x21

    invoke-interface {v2, v4, v5, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v18, v1

    goto/16 :goto_4c

    :cond_82
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid PlaceholderVerticalAlign"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_83
    move-object/from16 v0, p0

    move-object v7, v2

    :goto_53
    iput-object v7, v0, Lt3/c;->h:Ljava/lang/CharSequence;

    new-instance v1, Lm3/h;

    iget-object v2, v0, Lt3/c;->g:Lt3/d;

    iget v3, v0, Lt3/c;->l:I

    invoke-direct {v1, v7, v2, v3}, Lm3/h;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v1, v0, Lt3/c;->i:Lm3/h;

    return-void

    :cond_84
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Array is empty."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_85
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid TextDirection."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final b()Z
    .locals 3

    iget-object v0, p0, Lt3/c;->j:Lq30/w0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq30/w0;->y()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_4

    iget-boolean v0, p0, Lt3/c;->k:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lt3/c;->b:Ll3/v0;

    iget-object v0, v0, Ll3/v0;->c:Ll3/g0;

    sget-object v0, Lt3/h;->a:Laj/d;

    sget-object v0, Lt3/h;->a:Laj/d;

    iget-object v2, v0, Laj/d;->w:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lh6/j;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Laj/d;->k()Lp1/t2;

    move-result-object v2

    iput-object v2, v0, Laj/d;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object v2, Lt3/i;->a:Lt3/j;

    :goto_1
    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    return v1

    :cond_4
    :goto_2
    const/4 v0, 0x1

    return v0
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lt3/c;->i:Lm3/h;

    invoke-virtual {v0}, Lm3/h;->c()F

    move-result v0

    return v0
.end method

.method public final g()F
    .locals 10

    iget-object v0, p0, Lt3/c;->i:Lm3/h;

    iget v1, v0, Lm3/h;->e:F

    iget-object v2, v0, Lm3/h;->b:Landroid/text/TextPaint;

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    iget v0, v0, Lm3/h;->e:F

    return v0

    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v1}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object v1

    new-instance v3, Lm3/d;

    iget-object v4, v0, Lm3/h;->a:Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-direct {v3, v5, v4}, Lm3/d;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v1, v3}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    new-instance v3, Ljava/util/PriorityQueue;

    new-instance v4, Lm3/g;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lm3/g;-><init>(I)V

    const/16 v5, 0xa

    invoke-direct {v3, v5, v4}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    invoke-virtual {v1}, Ljava/text/BreakIterator;->next()I

    move-result v4

    const/4 v6, 0x0

    :goto_0
    const/4 v7, -0x1

    if-eq v4, v7, :cond_3

    invoke-virtual {v3}, Ljava/util/PriorityQueue;->size()I

    move-result v7

    if-ge v7, v5, :cond_1

    new-instance v7, Ll83/k;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v7, v6, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll83/k;

    if-eqz v7, :cond_2

    iget-object v8, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    iget-object v7, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    sub-int/2addr v8, v7

    sub-int v7, v4, v6

    if-ge v8, v7, :cond_2

    invoke-virtual {v3}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    new-instance v7, Ll83/k;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v7, v6, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/text/BreakIterator;->next()I

    move-result v6

    move v9, v6

    move v6, v4

    move v4, v9

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v0}, Lm3/h;->b()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {v5, v4, v3, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    move-result v3

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v5, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v0}, Lm3/h;->b()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-static {v6, v5, v4, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    goto :goto_2

    :cond_5
    move v1, v3

    :goto_3
    iput v1, v0, Lm3/h;->e:F

    return v1

    :cond_6
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
