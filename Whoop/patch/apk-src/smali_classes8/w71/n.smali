.class public abstract Lw71/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aK\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "context",
        "",
        "number",
        "",
        "isSubQuestion",
        "enabled",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "tapAction",
        "d",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Double;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Double;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lw71/n;->g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Double;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw71/n;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Double;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw71/n;->e(Ljava/lang/Double;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Double;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/Double;",
            "ZZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p5

    move/from16 v10, p7

    const-string v1, "question"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "tapAction"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    const v1, 0x6e5d1297

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_1
    move v1, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v10, 0x180

    if-nez v2, :cond_5

    invoke-virtual {v4, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_7

    or-int/lit16 v1, v1, 0xc00

    :cond_6
    move/from16 v3, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v3, v10, 0xc00

    if-nez v3, :cond_6

    move/from16 v3, p3

    invoke-virtual {v4, v3}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x800

    goto :goto_4

    :cond_8
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v1, v5

    :goto_5
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_a

    or-int/lit16 v1, v1, 0x6000

    :cond_9
    move/from16 v6, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v6, v10, 0x6000

    if-nez v6, :cond_9

    move/from16 v6, p4

    invoke-virtual {v4, v6}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_6

    :cond_b
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v1, v11

    :goto_7
    const/high16 v11, 0x30000

    and-int/2addr v11, v10

    if-nez v11, :cond_d

    invoke-virtual {v4, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x20000

    goto :goto_8

    :cond_c
    const/high16 v11, 0x10000

    :goto_8
    or-int/2addr v1, v11

    :cond_d
    const v11, 0x12493

    and-int/2addr v11, v1

    const v12, 0x12492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_e

    move v11, v14

    goto :goto_9

    :cond_e
    move v11, v13

    :goto_9
    and-int/lit8 v12, v1, 0x1

    invoke-virtual {v4, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_28

    if-eqz v2, :cond_f

    move/from16 v23, v13

    goto :goto_a

    :cond_f
    move/from16 v23, v3

    :goto_a
    if-eqz v5, :cond_10

    move v11, v14

    goto :goto_b

    :cond_10
    move v11, v6

    :goto_b
    sget-object v2, Lw71/c;->a:Lw71/c;

    if-eqz v23, :cond_11

    invoke-virtual {v2}, Lw71/c;->b()F

    move-result v2

    :goto_c
    move/from16 v16, v2

    goto :goto_d

    :cond_11
    invoke-virtual {v2}, Lw71/c;->a()F

    move-result v2

    goto :goto_c

    :goto_d
    const-wide/16 v21, 0x0

    if-eqz v8, :cond_12

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    goto :goto_e

    :cond_12
    move-wide/from16 v2, v21

    :goto_e
    cmpl-double v2, v2, v21

    const/4 v3, 0x6

    if-lez v2, :cond_13

    const v2, 0x4b6301df    # 1.4877151E7f

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->X()J

    move-result-wide v2

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    :goto_f
    move-wide/from16 v24, v2

    goto :goto_10

    :cond_13
    const v2, 0x4b6307bf    # 1.4878655E7f

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/b;->a:Lx81/b;

    invoke-virtual {v2, v4, v3}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v2

    invoke-virtual {v2}, Ly81/a;->d()J

    move-result-wide v2

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    const/16 v12, 0x30

    if-eqz v8, :cond_19

    const v2, 0x20feea51

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2e

    invoke-static {v2, v3, v13}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v5

    if-nez v5, :cond_14

    goto :goto_14

    :cond_14
    invoke-static {v2}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v5

    :goto_11
    const-string v6, ""

    const-string v15, "substring(...)"

    const/4 v3, -0x1

    if-ge v3, v5, :cond_16

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v12, :cond_15

    add-int/lit8 v5, v5, -0x1

    const/16 v3, 0x2e

    goto :goto_11

    :cond_15
    invoke-static {v5, v2, v14, v13, v15}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_12

    :cond_16
    move-object v2, v6

    :goto_12
    invoke-static {v2}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v3

    :goto_13
    const/4 v5, -0x1

    if-ge v5, v3, :cond_18

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v12, 0x2e

    if-ne v5, v12, :cond_17

    add-int/lit8 v3, v3, -0x1

    const/16 v12, 0x30

    goto :goto_13

    :cond_17
    invoke-static {v3, v2, v14, v13, v15}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_14

    :cond_18
    move-object v2, v6

    :goto_14
    shr-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v7, v4, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    :goto_15
    move-object v12, v2

    goto :goto_16

    :cond_19
    const v2, 0x21023af1

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    sget v2, Lgy0/f;->u1:I

    invoke-static {v4, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    goto :goto_15

    :goto_16
    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v15, 0x36

    invoke-static {v6, v5, v4, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-eqz v3, :cond_1a

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_1a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_17
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v4, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v4, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-nez v15, :cond_1b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    :cond_1b
    invoke-static {v6, v4, v6, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v4, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x40000000    # 2.0f

    move/from16 v17, v1

    float-to-double v1, v0

    cmpl-double v1, v1, v21

    const-string v18, "invalid weight; must be greater than zero"

    if-lez v1, :cond_1d

    goto :goto_18

    :cond_1d
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_18
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v19, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v2, v0, v19

    if-lez v2, :cond_1e

    move/from16 v0, v19

    :cond_1e
    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Lb2/e;->M:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v2, v0, v4, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v8, v4, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_1f

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_1f
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v4, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_20

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    :cond_20
    invoke-static {v6, v4, v6, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    invoke-static {v4, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    shr-int/lit8 v0, v17, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v7, v4, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_22

    const/4 v0, 0x1

    goto :goto_1a

    :cond_22
    const/4 v0, 0x0

    :goto_1a
    and-int/lit8 v6, v17, 0xe

    move-object v8, v5

    move v5, v6

    const/16 v6, 0x8

    move-object v9, v3

    const/4 v3, 0x0

    move-object/from16 v27, v2

    move-object/from16 v26, v8

    const/high16 v8, 0x3f800000    # 1.0f

    move v2, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    float-to-double v0, v8

    cmpl-double v0, v0, v21

    if-lez v0, :cond_23

    goto :goto_1b

    :cond_23
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1b
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v1, v8, v19

    if-lez v1, :cond_24

    move/from16 v3, v19

    :goto_1c
    const/4 v2, 0x1

    goto :goto_1d

    :cond_24
    move v3, v8

    goto :goto_1c

    :goto_1d
    invoke-direct {v0, v3, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v1, Lb2/e;->O:Lb2/k;

    move-object/from16 v3, v27

    const/16 v6, 0x30

    invoke-static {v3, v1, v4, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_25

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1e

    :cond_25
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1e
    invoke-static {v4, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v26

    invoke-static {v4, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_26

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    :cond_26
    invoke-static {v3, v4, v3, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v4, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lay/a0;

    move-object/from16 v8, p2

    move-object/from16 v9, p5

    invoke-direct {v0, v8, v12, v11, v9}, Lay/a0;-><init>(Ljava/lang/Double;Ljava/lang/String;ZLc93/a;)V

    const v1, -0x68842de1

    invoke-static {v1, v4, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v19

    const/16 v21, 0x6000

    const/16 v22, 0xd

    move v14, v11

    const-wide/16 v11, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    move-object/from16 v20, v4

    move v6, v14

    move-wide/from16 v13, v24

    invoke-static/range {v11 .. v22}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    :goto_1f
    move v5, v6

    goto :goto_20

    :cond_28
    invoke-virtual {v4}, Lp1/q;->X()V

    move/from16 v23, v3

    goto :goto_1f

    :goto_20
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_29

    new-instance v0, Lb01/n;

    const/4 v9, 0x6

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    move-object v2, v7

    move-object v3, v8

    move v7, v10

    move/from16 v4, v23

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lb01/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZLl83/e;III)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final e(Ljava/lang/Double;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 19

    move-object/from16 v0, p3

    and-int/lit8 v1, p5, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v5, p5, 0x1

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    const/4 v7, 0x3

    invoke-static {v1, v5, v7}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v10, Lny0/v0$c;

    sget-object v7, Lny0/e1;->FLEXIBLE:Lny0/e1;

    invoke-direct {v10, v7, v5, v4, v5}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz p0, :cond_1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    const-wide/16 v7, 0x0

    cmpl-double v4, v4, v7

    if-lez v4, :cond_1

    move v11, v3

    goto :goto_1

    :cond_1
    move v11, v2

    :goto_1
    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_3

    :cond_2
    new-instance v3, Lry2/g;

    const/16 v2, 0x15

    invoke-direct {v3, v0, v2}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v15, v3

    check-cast v15, Lc93/a;

    const/16 v17, 0x6

    const/16 v18, 0x18c

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v7, p1

    move/from16 v12, p2

    move-object/from16 v16, v6

    move-object v6, v1

    invoke-static/range {v6 .. v18}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_4
    move-object/from16 v16, v6

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Double;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lw71/n;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Double;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
