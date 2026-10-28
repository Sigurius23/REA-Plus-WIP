.class public abstract Lw71/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001ae\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000c0\u000bH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012\u00b2\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00108\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "timeString",
        "",
        "curTime",
        "startTime",
        "endTime",
        "question",
        "context",
        "",
        "isSubQuestion",
        "enabled",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "selectedTime",
        "e",
        "(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "positionWhileDragging",
        "design_release"
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
.method public static synthetic a(Lw71/c0;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw71/e0;->h(Lw71/c0;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw71/e0;->i(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p15}, Lw71/e0;->k(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lw71/c0;Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw71/e0;->j(Lkotlin/jvm/functions/Function1;Lw71/c0;Lp1/c1;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "JJJ",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p13

    const-string v0, "timeString"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "question"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedTime"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p12

    check-cast v6, Lp1/q;

    const v0, 0x25e5d37c

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v13, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v13

    goto :goto_1

    :cond_1
    move v0, v13

    :goto_1
    and-int/lit8 v4, v13, 0x30

    if-nez v4, :cond_3

    move-wide/from16 v4, p1

    invoke-virtual {v6, v4, v5}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    goto :goto_3

    :cond_3
    move-wide/from16 v4, p1

    :goto_3
    and-int/lit16 v7, v13, 0x180

    if-nez v7, :cond_5

    move-wide/from16 v7, p3

    invoke-virtual {v6, v7, v8}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_4

    :cond_4
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p3

    :goto_5
    and-int/lit16 v10, v13, 0xc00

    move-wide/from16 v14, p5

    if-nez v10, :cond_7

    invoke-virtual {v6, v14, v15}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_6

    :cond_6
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v0, v10

    :cond_7
    and-int/lit16 v10, v13, 0x6000

    if-nez v10, :cond_9

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_7

    :cond_8
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v0, v10

    :cond_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v13

    if-nez v10, :cond_b

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v10, 0x10000

    :goto_8
    or-int/2addr v0, v10

    :cond_b
    and-int/lit8 v10, p14, 0x40

    const/high16 v16, 0x180000

    if-eqz v10, :cond_c

    or-int v0, v0, v16

    move/from16 v9, p9

    goto :goto_a

    :cond_c
    and-int v16, v13, v16

    move/from16 v9, p9

    if-nez v16, :cond_e

    invoke-virtual {v6, v9}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v16, 0x80000

    :goto_9
    or-int v0, v0, v16

    :cond_e
    :goto_a
    const/high16 v16, 0xc00000

    and-int v16, v13, v16

    if-nez v16, :cond_10

    invoke-virtual {v6, v11}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x800000

    goto :goto_b

    :cond_f
    const/high16 v16, 0x400000

    :goto_b
    or-int v0, v0, v16

    :cond_10
    const/high16 v16, 0x6000000

    and-int v16, v13, v16

    if-nez v16, :cond_12

    invoke-virtual {v6, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x4000000

    goto :goto_c

    :cond_11
    const/high16 v16, 0x2000000

    :goto_c
    or-int v0, v0, v16

    :cond_12
    const v16, 0x2492493

    move/from16 v21, v0

    and-int v0, v21, v16

    const v2, 0x2492492

    if-eq v0, v2, :cond_13

    const/4 v0, 0x1

    goto :goto_d

    :cond_13
    const/4 v0, 0x0

    :goto_d
    and-int/lit8 v2, v21, 0x1

    invoke-virtual {v6, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_28

    if-eqz v10, :cond_14

    const/4 v9, 0x0

    :cond_14
    new-instance v14, Lw71/c0;

    move-wide/from16 v15, p1

    move-wide/from16 v19, p5

    move-wide/from16 v17, v7

    invoke-direct/range {v14 .. v20}, Lw71/c0;-><init>(JJJ)V

    move-object v0, v14

    sget-object v2, Lw71/c;->a:Lw71/c;

    if-eqz v9, :cond_15

    invoke-virtual {v2}, Lw71/c;->b()F

    move-result v2

    :goto_e
    move v15, v2

    goto :goto_f

    :cond_15
    invoke-virtual {v2}, Lw71/c;->a()F

    move-result v2

    goto :goto_e

    :goto_f
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v2, v7, :cond_16

    const/4 v2, 0x0

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v10, v2

    check-cast v10, Lp1/c1;

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, Lb2/e;->K:Lb2/l;

    sget-object v2, Ll0/m;->g:Ll0/h;

    const/16 v5, 0x36

    invoke-static {v2, v14, v6, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v40, v9

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-eqz v14, :cond_17

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_17
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_10
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v6, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    move-object/from16 v18, v7

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_18

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_19

    :cond_18
    invoke-static {v4, v6, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v6, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x40000000    # 2.0f

    float-to-double v7, v4

    const-wide/16 v19, 0x0

    cmpl-double v7, v7, v19

    const-string v22, "invalid weight; must be greater than zero"

    if-lez v7, :cond_1a

    goto :goto_11

    :cond_1a
    invoke-static/range {v22 .. v22}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_11
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v23, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v8, v4, v23

    if-lez v8, :cond_1b

    move/from16 v4, v23

    :cond_1b
    const/4 v8, 0x1

    invoke-direct {v7, v4, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    move-object/from16 v41, v0

    move/from16 v24, v15

    const/4 v15, 0x0

    invoke-static {v4, v8, v6, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    move-object/from16 v42, v10

    iget-wide v10, v6, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v15, v6, Lp1/q;->S:Z

    if-eqz v15, :cond_1c

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1c
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v6, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_1d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    :cond_1d
    invoke-static {v10, v6, v10, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v6, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v21, 0xf

    and-int/lit8 v0, v0, 0xe

    invoke-static {v3, v6, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1f

    move-object v0, v4

    const/4 v4, 0x1

    goto :goto_13

    :cond_1f
    move-object v0, v4

    const/4 v4, 0x0

    :goto_13
    shr-int/lit8 v7, v21, 0xc

    and-int/lit8 v7, v7, 0x7e

    move-object v10, v8

    const/16 v8, 0x8

    move-object v11, v5

    const/4 v5, 0x0

    move-object v15, v0

    move-object/from16 v43, v10

    move-object/from16 v12, v18

    const/4 v0, 0x1

    move-object v10, v2

    move-object/from16 v2, p7

    invoke-static/range {v2 .. v8}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v3, v2

    cmpl-double v3, v3, v19

    if-lez v3, :cond_20

    goto :goto_14

    :cond_20
    invoke-static/range {v22 .. v22}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_14
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v4, v2, v23

    if-lez v4, :cond_21

    move/from16 v2, v23

    goto :goto_15

    :cond_21
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_15
    invoke-direct {v3, v2, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v2, v43

    const/4 v4, 0x0

    invoke-static {v15, v2, v6, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_22

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_22
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v6, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_23

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    :cond_23
    invoke-static {v4, v6, v4, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    invoke-static {v6, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lb2/e;->O:Lb2/k;

    new-instance v15, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v15, v2}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    and-int/lit8 v2, v21, 0xe

    invoke-static {v1, v6, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->X()J

    move-result-wide v16

    invoke-virtual {v3, v6, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->s()Lb91/a;

    move-result-object v34

    const/16 v38, 0x0

    const v39, 0x2fff8

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v5, v24

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v36, v14

    move-object v14, v2

    move-object/from16 v2, v36

    move-object/from16 v36, v6

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v12, 0x2

    invoke-static {v7, v5, v8, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Ll0/m;->e:Ll0/h;

    sget-object v8, Lb2/e;->J:Lb2/l;

    invoke-static {v7, v8, v6, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v14, v6, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-eqz v14, :cond_25

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_25
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v6, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_26

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    :cond_26
    invoke-static {v8, v6, v8, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v6, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->X()J

    move-result-wide v14

    new-instance v2, Lay/a0;

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v3, v41

    move-object/from16 v4, v42

    invoke-direct {v2, v3, v11, v12, v4}, Lay/a0;-><init>(Lw71/c0;ZLkotlin/jvm/functions/Function1;Lp1/c1;)V

    const v3, 0x256762be

    invoke-static {v3, v6, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v22

    const/16 v24, 0x6000

    const/16 v25, 0xe

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    move-object/from16 v23, v6

    invoke-static/range {v14 .. v25}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move/from16 v10, v40

    goto :goto_18

    :cond_28
    invoke-virtual {v6}, Lp1/q;->X()V

    move v10, v9

    :goto_18
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_29

    new-instance v0, Lw71/d0;

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lw71/d0;-><init>(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final f(Lp1/c1;)Ljava/lang/Float;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/Float;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    return-object p0
.end method

.method private static final g(Lp1/c1;Ljava/lang/Float;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/Float;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lw71/c0;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    and-int/lit8 v3, p5, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eq v3, v6, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    and-int/lit8 v5, p5, 0x1

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {v2}, Lw71/e0;->f(Lp1/c1;)Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_1
    move v9, v3

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lw71/c0;->a()F

    move-result v3

    goto :goto_1

    :goto_2
    invoke-virtual {v0}, Lw71/c0;->c()J

    move-result-wide v7

    const-wide/16 v10, 0x1

    sub-long/2addr v7, v10

    long-to-float v3, v7

    new-instance v10, Li93/e;

    const/4 v5, 0x0

    invoke-direct {v10, v5, v3}, Li93/e;-><init>(FF)V

    invoke-virtual {v0}, Lw71/c0;->c()J

    move-result-wide v7

    int-to-long v5, v6

    sub-long/2addr v7, v5

    long-to-int v3, v7

    if-gez v3, :cond_2

    move v11, v4

    goto :goto_3

    :cond_2
    move v11, v3

    :goto_3
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_3

    new-instance v3, Luz1/g;

    const/16 v5, 0xb

    invoke-direct {v3, v5, v2}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v12, v3

    check-cast v12, Lc93/a;

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_4

    if-ne v5, v4, :cond_5

    :cond_4
    new-instance v5, Ls90/f;

    const/16 v3, 0x1b

    invoke-direct {v5, v1, v0, v2, v3}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const v15, 0x30006

    const/16 v16, 0x0

    sget-object v7, Lb2/t;->w:Lb2/t;

    move/from16 v8, p1

    invoke-static/range {v7 .. v16}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lw71/e0;->g(Lp1/c1;Ljava/lang/Float;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lw71/c0;Lp1/c1;F)Ll83/a0;
    .locals 1

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {p2, v0}, Lw71/e0;->g(Lp1/c1;Ljava/lang/Float;)V

    invoke-virtual {p1, p3}, Lw71/c0;->b(F)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    or-int/lit8 v0, p12, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v14

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v15, p13

    move-object/from16 v13, p14

    invoke-static/range {v1 .. v15}, Lw71/e0;->e(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
