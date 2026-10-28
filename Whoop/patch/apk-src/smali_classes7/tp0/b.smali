.class public abstract Ltp0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aq\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000fH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "isDateExpanded",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDateButtonClicked",
        "isTimeExpanded",
        "onTimeButtonClicked",
        "Lsp0/d;",
        "viewState",
        "Lor2/u0;",
        "localizedDateTimeFormatter",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lkotlin/Function1;",
        "Lorg/joda/time/LocalDateTime;",
        "onDateTimeChange",
        "e",
        "(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "add-activity_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Ltp0/b;->i(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lsp0/d;II)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltp0/b;->h(Lkotlin/jvm/functions/Function1;Lsp0/d;II)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lsp0/d;Lc93/a;Lorg/joda/time/LocalDate;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltp0/b;->g(Lkotlin/jvm/functions/Function1;Lsp0/d;Lc93/a;Lorg/joda/time/LocalDate;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lsp0/d;Lzr2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ltp0/b;->f(Lsp0/d;Lzr2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 51
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lc93/a;",
            "Z",
            "Lc93/a;",
            "Lsp0/d;",
            "Lor2/u0;",
            "Lzr2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p2

    move/from16 v13, p3

    move-object/from16 v14, p4

    move-object/from16 v15, p5

    move-object/from16 v0, p6

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    move/from16 v3, p10

    const-string v5, "onDateButtonClicked"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onTimeButtonClicked"

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "viewState"

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "localizedDateTimeFormatter"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "dateAndTimeProvider"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onDateTimeChange"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p9

    check-cast v10, Lp1/q;

    const v5, -0x44695819

    invoke-virtual {v10, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, p11, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v7, v3, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v3, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v3

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v3

    :goto_1
    and-int/lit8 v9, v3, 0x30

    if-nez v9, :cond_4

    move/from16 v9, p1

    invoke-virtual {v10, v9}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_3

    const/16 v11, 0x20

    goto :goto_2

    :cond_3
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v8, v11

    goto :goto_3

    :cond_4
    move/from16 v9, p1

    :goto_3
    and-int/lit16 v11, v3, 0x180

    if-nez v11, :cond_6

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x100

    goto :goto_4

    :cond_5
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v8, v11

    :cond_6
    and-int/lit16 v11, v3, 0xc00

    if-nez v11, :cond_8

    invoke-virtual {v10, v13}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x800

    goto :goto_5

    :cond_7
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v8, v11

    :cond_8
    and-int/lit16 v11, v3, 0x6000

    if-nez v11, :cond_a

    invoke-virtual {v10, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x4000

    goto :goto_6

    :cond_9
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v8, v11

    :cond_a
    const/high16 v11, 0x30000

    and-int/2addr v11, v3

    if-nez v11, :cond_c

    invoke-virtual {v10, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/high16 v11, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v11, 0x10000

    :goto_7
    or-int/2addr v8, v11

    :cond_c
    const/high16 v42, 0x180000

    and-int v11, v3, v42

    if-nez v11, :cond_f

    const/high16 v11, 0x200000

    and-int/2addr v11, v3

    if-nez v11, :cond_d

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    goto :goto_8

    :cond_d
    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    :goto_8
    if-eqz v11, :cond_e

    const/high16 v11, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v11, 0x80000

    :goto_9
    or-int/2addr v8, v11

    :cond_f
    const/high16 v11, 0xc00000

    and-int/2addr v11, v3

    if-nez v11, :cond_11

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    const/high16 v11, 0x800000

    goto :goto_a

    :cond_10
    const/high16 v11, 0x400000

    :goto_a
    or-int/2addr v8, v11

    :cond_11
    const/high16 v11, 0x6000000

    and-int/2addr v11, v3

    if-nez v11, :cond_13

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_12

    const/high16 v11, 0x4000000

    goto :goto_b

    :cond_12
    const/high16 v11, 0x2000000

    :goto_b
    or-int/2addr v8, v11

    :cond_13
    move/from16 v43, v8

    const v8, 0x2492493

    and-int v8, v43, v8

    const v11, 0x2492492

    const/4 v14, 0x0

    const/4 v2, 0x1

    if-eq v8, v11, :cond_14

    move v8, v2

    goto :goto_c

    :cond_14
    move v8, v14

    :goto_c
    and-int/lit8 v11, v43, 0x1

    invoke-virtual {v10, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_25

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_15

    move-object/from16 v16, v8

    goto :goto_d

    :cond_15
    move-object/from16 v16, v7

    :goto_d
    int-to-float v5, v2

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v17, v5, v7

    const/16 v20, 0x0

    const/16 v21, 0xe

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v44, v16

    move/from16 v7, v17

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v10, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    move/from16 p0, v7

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_16

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_e
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v10, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    :cond_17
    invoke-static {v6, v10, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->g:Ll0/h;

    sget-object v2, Lb2/e;->K:Lb2/l;

    const/16 v1, 0x36

    invoke-static {v6, v2, v10, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-eqz v6, :cond_19

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_19
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v10, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_1a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    :cond_1a
    invoke-static {v2, v10, v2, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v15}, Lsp0/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v36

    invoke-virtual {v1, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v18

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v40, v1, 0x12

    const v41, 0x2fffa

    const/16 v17, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    move-object/from16 v38, v10

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v5, v1

    const-wide/16 v16, 0x0

    cmpl-double v3, v5, v16

    if-lez v3, :cond_1c

    const/4 v3, 0x1

    goto :goto_10

    :cond_1c
    const/4 v3, 0x0

    :goto_10
    if-nez v3, :cond_1d

    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_1d
    const/4 v3, 0x1

    invoke-static {v1, v3, v10}, Ldc/b;->y(FZLp1/q;)V

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v19, p0

    move-object/from16 v16, v8

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v5, v16

    sget-object v6, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v6, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v3, v10, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_1e

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v10, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_1f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_20

    :cond_1f
    invoke-static {v3, v10, v3, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v10, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v14, 0x0

    const/4 v0, 0x3

    move v1, v0

    invoke-static {v5, v14, v1}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v15}, Lsp0/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lny0/v0$d;

    sget-object v6, Lny0/e1;->FLEXIBLE:Lny0/e1;

    const/4 v12, 0x2

    invoke-direct {v4, v6, v14, v12, v14}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v7, Lny0/v0$d;->f:I

    shl-int/lit8 v7, v7, 0xc

    const/4 v8, 0x6

    or-int/lit8 v16, v7, 0x6

    shl-int/lit8 v7, v43, 0xc

    const/high16 v17, 0x70000

    and-int v7, v7, v17

    or-int v7, v16, v7

    shl-int/lit8 v11, v43, 0x15

    const/high16 v18, 0x70000000

    and-int v11, v11, v18

    or-int/2addr v11, v7

    move/from16 v45, v12

    const/16 v12, 0x1cc

    move v7, v2

    const/4 v2, 0x0

    move/from16 v19, v1

    move-object v1, v3

    const/4 v3, 0x0

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move/from16 v21, v7

    const/4 v7, 0x0

    move/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v50, v5

    move v5, v9

    move-object/from16 v49, v20

    move/from16 v48, v21

    const/4 v14, 0x1

    const/16 v46, 0x0

    move-object/from16 v9, p2

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    new-instance v0, Lat2/r;

    const/16 v5, 0x16

    move-object/from16 v4, p2

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move-object v1, v15

    invoke-direct/range {v0 .. v5}, Lat2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x6cd945ba

    invoke-static {v1, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    shr-int/lit8 v0, v43, 0x3

    and-int/lit8 v1, v0, 0xe

    or-int v1, v1, v42

    and-int/lit8 v0, v0, 0x70

    or-int v9, v1, v0

    move-object/from16 v38, v10

    const/16 v10, 0x3c

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v8, v38

    invoke-static/range {v0 .. v10}, Lg1/f0;->a(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v8

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object/from16 v0, v50

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15}, Lsp0/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move/from16 v7, v48

    invoke-static {v3, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lny0/v0$d;

    move-object/from16 v5, v49

    const/4 v12, 0x2

    invoke-direct {v4, v5, v2, v12, v2}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    shl-int/lit8 v2, v43, 0x6

    and-int v2, v2, v17

    or-int v2, v16, v2

    shl-int/lit8 v5, v43, 0xf

    and-int v5, v5, v18

    or-int v11, v2, v5

    const/16 v12, 0x1cc

    const/4 v2, 0x0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v9, v13

    move-object v13, v5

    move v5, v9

    move-object/from16 v9, p4

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    if-eqz p3, :cond_24

    const v0, -0x430ba465

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lsp0/d;->a()Lorg/joda/time/LocalDateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/LocalDateTime;->toLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v8

    invoke-virtual/range {p6 .. p6}, Lor2/u0;->l()Z

    move-result v7

    const/4 v0, 0x6

    invoke-static {v13, v10, v0}, Lgb1/n;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/high16 v0, 0xe000000

    and-int v0, v43, v0

    const/high16 v1, 0x4000000

    if-ne v0, v1, :cond_21

    move v2, v14

    goto :goto_12

    :cond_21
    move/from16 v2, v46

    :goto_12
    invoke-virtual {v10, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_23

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_22

    goto :goto_13

    :cond_22
    move-object/from16 v9, p8

    goto :goto_14

    :cond_23
    :goto_13
    new-instance v1, Lpp2/o;

    const/16 v0, 0xb

    move-object/from16 v9, p8

    invoke-direct {v1, v9, v15, v0}, Lpp2/o;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v1, Lc93/m;

    const/16 v17, 0xc00

    const/16 v18, 0xb1

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object/from16 v38, v10

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move/from16 v47, v14

    const/4 v14, 0x0

    move-object v15, v1

    move-object/from16 v16, v38

    move/from16 v0, v46

    move/from16 v3, v47

    invoke-static/range {v6 .. v18}, Ll41/d;->g(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_24
    move v3, v14

    move/from16 v0, v46

    const v1, -0x4305b69b

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object/from16 v1, v44

    goto :goto_16

    :cond_25
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v7

    :goto_16
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_26

    new-instance v0, Llq2/j;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Llq2/j;-><init>(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final f(Lsp0/d;Lzr2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string v0, "$this$DropdownMenu"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p4, p6, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p4, v0, :cond_0

    move p4, v1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    and-int/2addr p6, v1

    move-object v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p6, p4}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-virtual {p0}, Lsp0/d;->d()Lorg/joda/time/LocalDateTime;

    move-result-object p4

    invoke-virtual {p4}, Lorg/joda/time/LocalDateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object v0

    const-string p4, "toLocalDate(...)"

    invoke-static {v0, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p4, p5

    invoke-virtual {v4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p4, p5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_1

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne p5, p4, :cond_2

    :cond_1
    new-instance p5, Ls90/f;

    const/16 p4, 0xa

    invoke-direct {p5, p2, p0, p3, p4}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p5

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/16 v5, 0x30

    const/4 v6, 0x0

    const/4 v1, 0x5

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Lj11/r;->d(Lorg/joda/time/LocalDate;ILzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lsp0/d;Lc93/a;Lorg/joda/time/LocalDate;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lsp0/d;->a()Lorg/joda/time/LocalDateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/LocalDateTime;->toLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p1

    invoke-virtual {p3, p1}, Lorg/joda/time/LocalDate;->toLocalDateTime(Lorg/joda/time/LocalTime;)Lorg/joda/time/LocalDateTime;

    move-result-object p1

    const-string p3, "toLocalDateTime(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lsp0/d;II)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lsp0/d;->a()Lorg/joda/time/LocalDateTime;

    move-result-object p1

    invoke-virtual {p1, p2}, Lorg/joda/time/LocalDateTime;->withHourOfDay(I)Lorg/joda/time/LocalDateTime;

    move-result-object p1

    invoke-virtual {p1, p3}, Lorg/joda/time/LocalDateTime;->withMinuteOfHour(I)Lorg/joda/time/LocalDateTime;

    move-result-object p1

    const-string p2, "withMinuteOfHour(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Ltp0/b;->e(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
