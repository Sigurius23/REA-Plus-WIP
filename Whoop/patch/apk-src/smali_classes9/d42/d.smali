.class public abstract Ld42/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lc42/g;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackPressed",
        "c",
        "(Lc42/g;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "pregnancy_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lc42/g;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ld42/d;->e(Lc42/g;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld42/d;->d(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lc42/g;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc42/g;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onBackPressed"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    const v3, 0x49b17170    # 1453614.0f

    invoke-virtual {v10, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v15, 0x12

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v15, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v10, v8, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_11

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v4, v8}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v7, v10, v6}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v11

    const/16 v12, 0xe

    invoke-static {v9, v11, v12}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v22, v15

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_5

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v7, v10, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v10, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v5, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v0}, Lc42/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v25

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v27

    sget v7, Lgy0/f;->K:I

    invoke-static {v10, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v28

    const v41, 0xfff2

    const/16 v42, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    move-object/from16 v24, v5

    invoke-direct/range {v24 .. v42}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v3, v3, 0x70

    const/16 v7, 0x20

    if-ne v3, v7, :cond_8

    const/4 v3, 0x1

    goto :goto_5

    :cond_8
    const/4 v3, 0x0

    :goto_5
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_9

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v7, v3, :cond_a

    :cond_9
    new-instance v7, La31/e;

    const/16 v3, 0x15

    invoke-direct {v7, v1, v3}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lc93/a;

    sget v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v9, 0x3

    shl-int/2addr v3, v9

    move-object/from16 v19, v12

    const/16 v12, 0x35

    move-object/from16 v20, v4

    const/4 v4, 0x0

    move-object/from16 v21, v6

    const/4 v6, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move/from16 v25, v9

    const/4 v9, 0x0

    move-object/from16 p2, v11

    move v11, v3

    move-object/from16 v3, p2

    move-object/from16 p2, v13

    move-object/from16 v0, v19

    move-object/from16 v16, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v24

    move/from16 v13, v25

    invoke-static/range {v4 .. v12}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x2

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v18, v4, v5

    int-to-float v4, v13

    mul-float v20, v4, v5

    const/16 v21, 0x5

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v13, v16

    const/4 v5, 0x0

    invoke-static {v3, v0, v10, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_b

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v10, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_8

    :cond_c
    :goto_7
    move-object/from16 v0, p2

    goto :goto_9

    :cond_d
    :goto_8
    invoke-static {v3, v10, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v10, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x16aa13f4

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc42/g;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/model/FeatureEducationParagraph;

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getImage()Lcom/whoop/design/model/FeatureEducationImage;

    move-result-object v2

    if-nez v2, :cond_e

    const v2, 0x7dfce218

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move v2, v5

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_b

    :cond_e
    const v3, 0x7dfce219

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    new-instance v3, Lmh/h;

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-direct {v3, v4}, Lmh/h;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/whoop/design/model/FeatureEducationImage;->getUrl()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lmh/h;->c:Ljava/lang/Object;

    invoke-virtual {v3}, Lmh/h;->a()Lmh/j;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/model/ParagraphInsets;->getLeading()D

    move-result-wide v2

    double-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v6, v3

    mul-float/2addr v2, v6

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/model/ParagraphInsets;->getTrailing()D

    move-result-wide v7

    double-to-float v3, v7

    mul-float/2addr v3, v6

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/design/model/ParagraphInsets;->getTop()D

    move-result-wide v7

    double-to-float v7, v7

    mul-float/2addr v7, v6

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/model/ParagraphInsets;->getBottom()D

    move-result-wide v8

    double-to-float v8, v8

    mul-float/2addr v8, v6

    invoke-static {v13, v2, v7, v3, v8}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v11, 0x180030

    const/16 v12, 0x3b8

    move/from16 v43, v5

    const/4 v5, 0x0

    const/4 v7, 0x0

    sget-object v8, Ly2/j;->d:Ly2/b1;

    const/4 v9, 0x0

    move/from16 v2, v43

    invoke-static/range {v4 .. v12}, Ldc/a;->c(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/m;Ly2/k;FLp1/q;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_b
    const v4, -0x16a9ab24

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getSentences()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v30

    :goto_c
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/model/FeatureEducationSentence;

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/design/model/ParagraphInsets;->getLeading()D

    move-result-wide v5

    double-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v7, v6

    mul-float/2addr v5, v7

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/model/ParagraphInsets;->getTrailing()D

    move-result-wide v8

    double-to-float v8, v8

    mul-float/2addr v8, v7

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/design/model/ParagraphInsets;->getTop()D

    move-result-wide v11

    double-to-float v9, v11

    mul-float/2addr v9, v7

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/design/model/ParagraphInsets;->getBottom()D

    move-result-wide v11

    double-to-float v11, v11

    mul-float/2addr v11, v7

    invoke-static {v13, v5, v9, v8, v11}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v7, v4

    invoke-virtual {v7}, Lcom/whoop/design/model/FeatureEducationSentence;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Lcom/whoop/design/model/FeatureEducationSentence;->getStyle()Lcom/whoop/design/model/ScreenTextStyle;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/model/ScreenTextStyle;->getName()Lb91/a;

    move-result-object v24

    invoke-virtual {v7}, Lcom/whoop/design/model/FeatureEducationSentence;->getStyle()Lcom/whoop/design/model/ScreenTextStyle;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/design/model/ScreenTextStyle;->getColor()Ly81/f;

    move-result-object v7

    invoke-virtual {v7, v10, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v28, v9, 0x12

    const v29, 0x2fff8

    move/from16 v23, v6

    move-wide v6, v7

    const-wide/16 v8, 0x0

    move-object/from16 v26, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move-object/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v26

    move-object/from16 v13, v32

    move/from16 v22, v33

    goto/16 :goto_c

    :cond_f
    move-object/from16 v32, v13

    move/from16 v33, v22

    const/16 v31, 0x4

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move v5, v2

    goto/16 :goto_a

    :cond_10
    move v2, v5

    const/4 v1, 0x1

    invoke-static {v10, v2, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_d

    :cond_11
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v1, Lce2/b;

    const/16 v2, 0xf

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Lce2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lc42/g;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ld42/d;->c(Lc42/g;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
