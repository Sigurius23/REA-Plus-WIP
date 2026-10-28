.class public abstract Lpj2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a9\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lnj2/p;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "scrollDepthAnalyticsEvent",
        "Lkotlin/Function0;",
        "onBackPressed",
        "e",
        "(Lnj2/p;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "stress_release"
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
.method public static synthetic a(Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/c;->h(Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpj2/c;->g(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lpj2/c;->f(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lnj2/p;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpj2/c;->i(Lnj2/p;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lnj2/p;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnj2/p;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollDepthAnalyticsEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressed"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x44ab5afc

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v14, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v14

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v5, v8, :cond_6

    move v5, v9

    goto :goto_4

    :cond_6
    move v5, v10

    :goto_4
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-static {v10, v11, v9}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v5

    and-int/lit8 v8, v0, 0x70

    if-ne v8, v6, :cond_7

    move v6, v9

    goto :goto_5

    :cond_7
    move v6, v10

    :goto_5
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_8

    if-ne v8, v12, :cond_9

    :cond_8
    new-instance v8, Lp90/h;

    const/4 v6, 0x1

    invoke-direct {v8, v2, v6}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v8, v11, v10}, Lue1/c;->c(Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v13}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v13}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v13}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v6, 0xe

    invoke-static {v13, v5, v6}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v9

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v6, v13

    const/4 v9, 0x0

    invoke-static {v5, v6, v9, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v9, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    move-object/from16 v18, v8

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_a

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v11, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    invoke-static {v7, v11, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v23, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual/range {p0 .. p0}, Lnj2/p;->e()Lnj2/a;

    move-result-object v2

    invoke-virtual {v2}, Lnj2/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v24

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v26

    sget v2, Lgy0/f;->K:I

    invoke-static {v11, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v27

    const v40, 0xfff2

    const/16 v41, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

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

    invoke-direct/range {v23 .. v41}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v0, v0, 0x380

    const/16 v2, 0x100

    if-ne v0, v2, :cond_d

    const/4 v0, 0x1

    goto :goto_7

    :cond_d
    const/4 v0, 0x0

    :goto_7
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_e

    if-ne v2, v12, :cond_f

    :cond_e
    new-instance v2, Lot1/e;

    const/4 v0, 0x5

    invoke-direct {v2, v3, v0}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lc93/a;

    sget v0, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v5, 0x3

    shl-int/2addr v0, v5

    move v7, v13

    const/16 v13, 0x35

    move/from16 v17, v5

    const/4 v5, 0x0

    move/from16 v21, v7

    const/4 v7, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move-object/from16 p3, v1

    move-object v4, v8

    move-object/from16 v42, v12

    move/from16 v1, v17

    move-object/from16 v16, v18

    move-object/from16 v3, v25

    move v12, v0

    move-object v8, v2

    move-object v0, v6

    move-object/from16 v6, v23

    move-object/from16 v2, v24

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x2

    int-to-float v5, v5

    mul-float v18, v5, v21

    int-to-float v1, v1

    mul-float v20, v1, v21

    const/16 v21, 0x5

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v12, v16

    const/4 v13, 0x0

    invoke-static {v0, v2, v11, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-eqz v6, :cond_10

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v11, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_a

    :cond_11
    :goto_9
    move-object/from16 v0, p3

    goto :goto_b

    :cond_12
    :goto_a
    invoke-static {v2, v11, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v11, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x5d33c3b6

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lnj2/p;->e()Lnj2/a;

    move-result-object v0

    invoke-virtual {v0}, Lnj2/a;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/model/FeatureEducationParagraph;

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getImage()Lcom/whoop/design/model/FeatureEducationImage;

    move-result-object v2

    if-nez v2, :cond_13

    const v2, -0x35ea4890    # -2452956.0f

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move-object v2, v12

    move v3, v13

    move-object/from16 v15, v42

    const/high16 v4, 0x3f800000    # 1.0f

    goto/16 :goto_d

    :cond_13
    const v3, -0x35ea488f

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/model/ParagraphInsets;->getLeading()D

    move-result-wide v3

    double-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v5, v4

    mul-float/2addr v3, v5

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/model/ParagraphInsets;->getTrailing()D

    move-result-wide v6

    double-to-float v4, v6

    mul-float/2addr v4, v5

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/model/ParagraphInsets;->getTop()D

    move-result-wide v6

    double-to-float v6, v6

    mul-float/2addr v6, v5

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/design/model/ParagraphInsets;->getBottom()D

    move-result-wide v7

    double-to-float v7, v7

    mul-float/2addr v7, v5

    invoke-static {v12, v3, v6, v4, v7}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/design/model/FeatureEducationImage;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v15, v42

    if-ne v2, v15, :cond_14

    new-instance v2, Lp6/h1;

    const/16 v6, 0x17

    invoke-direct {v2, v6}, Lp6/h1;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v7, v2

    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v2, Lkd1/o;->a:I

    or-int/lit16 v9, v2, 0x180

    const/4 v10, 0x1

    const/4 v6, 0x0

    move-object v8, v11

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move/from16 v43, v13

    const/16 v13, 0x6030

    const/16 v14, 0x68

    const/4 v8, 0x0

    sget-object v9, Ly2/j;->a:Ly2/b1;

    const/4 v10, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move-object v7, v3

    move-object v2, v12

    move-object/from16 v12, v27

    move/from16 v3, v43

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v12

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_d
    const v5, -0x5d3358b8

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getSentences()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v31

    :goto_e
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/model/FeatureEducationSentence;

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/model/ParagraphInsets;->getLeading()D

    move-result-wide v6

    double-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v8, v7

    mul-float/2addr v6, v8

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/design/model/ParagraphInsets;->getTrailing()D

    move-result-wide v9

    double-to-float v9, v9

    mul-float/2addr v9, v8

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/design/model/ParagraphInsets;->getTop()D

    move-result-wide v12

    double-to-float v10, v12

    mul-float/2addr v10, v8

    invoke-virtual {v1}, Lcom/whoop/design/model/FeatureEducationParagraph;->getInsets()Lcom/whoop/design/model/ParagraphInsets;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/design/model/ParagraphInsets;->getBottom()D

    move-result-wide v12

    double-to-float v12, v12

    mul-float/2addr v12, v8

    invoke-static {v2, v6, v10, v9, v12}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v8, v5

    invoke-virtual {v8}, Lcom/whoop/design/model/FeatureEducationSentence;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8}, Lcom/whoop/design/model/FeatureEducationSentence;->getStyle()Lcom/whoop/design/model/ScreenTextStyle;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/design/model/ScreenTextStyle;->getName()Lb91/a;

    move-result-object v25

    invoke-virtual {v8}, Lcom/whoop/design/model/FeatureEducationSentence;->getStyle()Lcom/whoop/design/model/ScreenTextStyle;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/model/ScreenTextStyle;->getColor()Ly81/f;

    move-result-object v8

    invoke-virtual {v8, v11, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v29, v10, 0x12

    const v30, 0x2fff8

    move/from16 v22, v7

    move-wide v7, v8

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v42, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v32, v28

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    move-object/from16 v15, v42

    goto/16 :goto_e

    :cond_15
    move-object/from16 v42, v15

    const/16 v32, 0x4

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    move-object v12, v2

    move v13, v3

    goto/16 :goto_c

    :cond_16
    move v3, v13

    const/4 v1, 0x1

    invoke-static {v11, v3, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_f

    :cond_17
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_18

    new-instance v0, Lnx1/g;

    const/16 v5, 0x10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lmh/h;)Ll83/a0;
    .locals 1

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/u;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lmh/h;->r:Ljava/lang/Integer;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lnj2/p;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lpj2/c;->e(Lnj2/p;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
