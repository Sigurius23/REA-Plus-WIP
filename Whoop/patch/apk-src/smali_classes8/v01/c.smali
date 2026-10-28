.class public abstract Lv01/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001am\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001aA\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u00082\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\n\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lv01/a;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "q",
        "(Lv01/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "selectedPeriod",
        "selectedSort",
        "onPeriodSelect",
        "onSortSelect",
        "B",
        "(Lv01/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "Lv01/d;",
        "options",
        "selectedValue",
        "onSelect",
        "I",
        "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method private static final A(Lv01/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lv01/c;->q(Lv01/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final B(Lv01/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv01/a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v7, p7

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p6

    check-cast v12, Lp1/q;

    const v0, 0x4e9439de

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v2, v7, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p8, 0x2

    if-nez v2, :cond_2

    move-object/from16 v2, p1

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    move-object/from16 v2, p1

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    goto :goto_3

    :cond_4
    move-object/from16 v2, p1

    :goto_3
    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_7

    and-int/lit8 v4, p8, 0x4

    if-nez v4, :cond_5

    move-object/from16 v4, p2

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    move-object/from16 v4, p2

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    goto :goto_5

    :cond_7
    move-object/from16 v4, p2

    :goto_5
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v7, 0xc00

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v0, v9

    :goto_7
    and-int/lit8 v9, p8, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v0, v0, 0x6000

    :cond_b
    move-object/from16 v10, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_b

    move-object/from16 v10, p4

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/16 v11, 0x4000

    goto :goto_8

    :cond_d
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v0, v11

    :goto_9
    and-int/lit8 v11, p8, 0x20

    const/high16 v14, 0x30000

    if-eqz v11, :cond_f

    or-int/2addr v0, v14

    :cond_e
    move-object/from16 v14, p5

    goto :goto_b

    :cond_f
    and-int/2addr v14, v7

    if-nez v14, :cond_e

    move-object/from16 v14, p5

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v0, v15

    :goto_b
    const v15, 0x12493

    and-int/2addr v15, v0

    const v5, 0x12492

    move/from16 p6, v9

    const/4 v9, 0x0

    if-eq v15, v5, :cond_11

    const/4 v5, 0x1

    goto :goto_c

    :cond_11
    move v5, v9

    :goto_c
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v12, v15, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_2a

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v5, v7, 0x1

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_15

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_12

    goto :goto_d

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v5, p8, 0x2

    if-eqz v5, :cond_13

    and-int/lit8 v0, v0, -0x71

    :cond_13
    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_14

    and-int/lit16 v0, v0, -0x381

    :cond_14
    move-object/from16 v5, p5

    goto :goto_e

    :cond_15
    :goto_d
    and-int/lit8 v5, p8, 0x2

    if-eqz v5, :cond_16

    invoke-virtual {v1}, Lv01/a;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lv01/h;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    and-int/lit8 v0, v0, -0x71

    :cond_16
    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_17

    invoke-virtual {v1}, Lv01/a;->d()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lv01/h;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    and-int/lit16 v0, v0, -0x381

    :cond_17
    if-eqz v6, :cond_19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_18

    new-instance v5, Luk2/a;

    const/16 v6, 0x19

    invoke-direct {v5, v6}, Luk2/a;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v8, v5

    :cond_19
    if-eqz p6, :cond_1b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_1a

    new-instance v5, Luk2/a;

    const/16 v6, 0x1a

    invoke-direct {v5, v6}, Luk2/a;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v10, v5

    :cond_1b
    if-eqz v11, :cond_14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_1c

    new-instance v5, Luk2/a;

    const/16 v6, 0x1b

    invoke-direct {v5, v6}, Luk2/a;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    :goto_e
    invoke-virtual {v12}, Lp1/q;->r()V

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v3, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object/from16 v16, v10

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_1d

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v12, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_1e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1f

    :cond_1e
    invoke-static {v9, v12, v9, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lv01/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lv01/a;->b()Ljava/util/List;

    move-result-object v6

    shl-int/lit8 v9, v0, 0x3

    and-int/lit16 v9, v9, 0x380

    and-int/lit16 v10, v0, 0x1c00

    or-int/2addr v9, v10

    move-object/from16 p3, v2

    move-object/from16 p1, v3

    move-object/from16 p2, v6

    move-object/from16 p4, v8

    move/from16 p6, v9

    move-object/from16 p5, v12

    invoke-static/range {p1 .. p6}, Lv01/c;->I(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v3, p4

    const/4 v6, 0x5

    int-to-float v6, v6

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v6, v8

    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lv01/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lv01/a;->d()Ljava/util/List;

    move-result-object v9

    and-int/lit16 v10, v0, 0x380

    shr-int/lit8 v13, v0, 0x3

    and-int/lit16 v13, v13, 0x1c00

    or-int/2addr v13, v10

    move-object/from16 p3, v4

    move-object/from16 p1, v8

    move-object/from16 p2, v9

    move/from16 p6, v13

    move-object/from16 p4, v16

    invoke-static/range {p1 .. p6}, Lv01/c;->I(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v12, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lv01/a;->a()Lm91/o;

    move-result-object v8

    if-eqz v8, :cond_29

    const v6, 0x5da488a8

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    new-instance v6, Lqx0/a;

    const/16 v9, 0x16

    invoke-direct {v6, v9}, Lqx0/a;-><init>(I)V

    const/high16 v9, 0x70000

    and-int/2addr v9, v0

    const/high16 v11, 0x20000

    if-ne v9, v11, :cond_20

    const/4 v9, 0x1

    goto :goto_10

    :cond_20
    const/4 v9, 0x0

    :goto_10
    and-int/lit8 v11, v0, 0x70

    xor-int/lit8 v11, v11, 0x30

    const/16 v13, 0x20

    if-le v11, v13, :cond_21

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_22

    :cond_21
    and-int/lit8 v11, v0, 0x30

    if-ne v11, v13, :cond_23

    :cond_22
    const/4 v11, 0x1

    goto :goto_11

    :cond_23
    const/4 v11, 0x0

    :goto_11
    or-int/2addr v9, v11

    xor-int/lit16 v10, v10, 0x180

    const/16 v11, 0x100

    if-le v10, v11, :cond_24

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_25

    :cond_24
    and-int/lit16 v0, v0, 0x180

    if-ne v0, v11, :cond_26

    :cond_25
    const/4 v0, 0x1

    goto :goto_12

    :cond_26
    const/4 v0, 0x0

    :goto_12
    or-int/2addr v0, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_27

    if-ne v9, v15, :cond_28

    :cond_27
    new-instance v9, Lpp1/f;

    const/4 v0, 0x1

    invoke-direct {v9, v0, v2, v4, v5}, Lpp1/f;-><init>(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    move-object v11, v9

    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    const/4 v14, 0x2

    const/4 v9, 0x0

    move-object v10, v6

    const/4 v0, 0x0

    const/4 v6, 0x1

    invoke-static/range {v8 .. v14}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_29
    const/4 v0, 0x0

    const/4 v6, 0x1

    const v8, 0x5da8d84e

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    move-object v6, v4

    move-object v4, v3

    move-object v3, v6

    move-object v6, v5

    move-object/from16 v5, v16

    goto :goto_14

    :cond_2a
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v6, p5

    move-object v3, v4

    move-object v4, v8

    move-object v5, v10

    :goto_14
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_2b

    new-instance v0, Lp72/a;

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lp72/a;-><init>(Lv01/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final C(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x5a9903bf

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object p2, Ll0/a1;->w:Ll0/a1;

    invoke-static {p0, p2}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final G(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lv01/e$a;

    invoke-direct {p3, p1, p2}, Lv01/e$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lv01/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lv01/c;->B(Lv01/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lv01/d;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v7, p4

    check-cast v7, Lp1/q;

    const v0, 0x58217a31

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v0, v6

    :cond_7
    and-int/lit16 v6, v0, 0x493

    const/16 v8, 0x492

    const/4 v9, 0x1

    if-eq v6, v8, :cond_8

    move v6, v9

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v7, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lv01/b;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lv01/b;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V

    :goto_6
    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_9
    and-int/lit8 v0, v0, 0xe

    invoke-static {v1, v7, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v2, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v2, v7, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->P()Lb91/a;

    move-result-object v20

    const/16 v24, 0x0

    const v25, 0x2fffa

    const/4 v1, 0x0

    move-wide v2, v4

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v22, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v11, v9

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v22

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1, v2, v7}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/4 v11, 0x1

    int-to-float v0, v11

    mul-float/2addr v0, v1

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    new-instance v0, Lno0/h;

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    invoke-direct {v0, v11, v10, v12}, Lno0/h;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    const v3, -0x40551b54

    invoke-static {v3, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x1801b0

    const/16 v9, 0x39

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_a
    move-object v10, v2

    move-object v11, v3

    move-object v12, v4

    move-object/from16 v22, v7

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    :goto_7
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lv01/b;

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move/from16 v5, p5

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    invoke-direct/range {v0 .. v6}, Lv01/b;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V

    goto/16 :goto_6

    :cond_b
    return-void
.end method

.method private static final J(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lv01/c;->I(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 36

    move-object/from16 v0, p2

    const-string v1, "$this$FlowRow"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p5, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p5, 0x1

    move-object/from16 v7, p4

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    move-object/from16 v1, p0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv01/d;

    invoke-virtual {v2}, Lv01/d;->b()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v10, p1

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    new-instance v11, Lhy0/h1;

    invoke-virtual {v2}, Lv01/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    if-eqz v4, :cond_1

    sget-object v5, Ly81/f;->BRAND_WHITE:Ly81/f;

    :goto_2
    move-object v14, v5

    goto :goto_3

    :cond_1
    sget-object v5, Ly81/f;->WHITE_10:Ly81/f;

    goto :goto_2

    :goto_3
    if-eqz v4, :cond_2

    sget-object v4, Ly81/f;->BRAND_BLACK:Ly81/f;

    :goto_4
    move-object/from16 v16, v4

    goto :goto_5

    :cond_2
    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_4

    :goto_5
    sget-object v19, Lhy0/o1;->CONTEXT_CARD:Lhy0/o1;

    const/4 v4, 0x3

    int-to-float v4, v4

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v21

    int-to-float v4, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v22, v4, v5

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v8

    mul-float v23, v4, v5

    const v34, 0x3ff16a

    const/16 v35, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v11 .. v35}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, Lui0/q;

    const/4 v4, 0x6

    invoke-direct {v5, v4, v0, v2}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v6, v5

    check-cast v6, Lc93/a;

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v5, 0x0

    move-object v4, v11

    invoke-static/range {v4 .. v9}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v7}, Lp1/q;->X()V

    :cond_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final L(Lkotlin/jvm/functions/Function1;Lv01/d;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lv01/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lv01/c;->I(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lv01/c;->G(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lv01/c;->y(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lv01/c;->K(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv01/c;->C(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lv01/c;->z(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lv01/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lv01/c;->L(Lkotlin/jvm/functions/Function1;Lv01/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lv01/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lv01/c;->A(Lv01/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lv01/a;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lv01/c;->x(Lv01/a;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv01/c;->r(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lv01/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lv01/c;->H(Lv01/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv01/c;->E(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lv01/c;->M(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv01/c;->w(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv01/c;->D(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lv01/c;->J(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lv01/c;->F(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Lv01/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv01/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v0, -0x459b230f

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v4

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v14, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_f

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_6

    new-instance v3, Luk2/a;

    const/16 v5, 0x1c

    invoke-direct {v3, v5}, Luk2/a;-><init>(I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v3, v5

    :goto_5
    const/4 v5, 0x6

    const/4 v7, 0x0

    invoke-static {v5, v7, v14, v2}, Ll1/n2;->g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object v7

    invoke-virtual {v1}, Lv01/a;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_8

    if-ne v5, v6, :cond_9

    :cond_8
    invoke-virtual {v1}, Lv01/a;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lv01/h;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v2, v5

    check-cast v2, Lp1/c1;

    invoke-virtual {v1}, Lv01/a;->d()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_a

    if-ne v10, v6, :cond_b

    :cond_a
    invoke-virtual {v1}, Lv01/a;->d()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lv01/h;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v10, Lp1/c1;

    new-instance v15, Lv41/g;

    const/16 v23, 0x7f

    const/16 v24, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v15 .. v24}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v4, :cond_c

    move v8, v9

    :cond_c
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_d

    if-ne v0, v6, :cond_e

    :cond_d
    new-instance v0, Luf0/e;

    const/4 v4, 0x6

    invoke-direct {v0, v3, v4}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v6, v0

    check-cast v6, Lc93/a;

    new-instance v0, Lat2/r;

    const/16 v5, 0x19

    move-object v4, v3

    move-object v3, v10

    invoke-direct/range {v0 .. v5}, Lat2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    move-object v1, v0

    move-object v0, v4

    const v2, -0x73482c35

    invoke-static {v2, v14, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/16 v16, 0x180

    const/16 v17, 0xfb9

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v7

    move-object v7, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v3, v15

    const/4 v15, 0x0

    invoke-static/range {v1 .. v17}, Lv41/e;->g(Landroidx/compose/ui/Modifier;Ll1/w3;Lv41/g;Ly81/e;Lc93/a;Lc93/a;Lc93/a;Li2/a1;ZLny0/q;Li2/t;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v3, v0

    goto :goto_6

    :cond_f
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v5

    :goto_6
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lt80/b;

    const/16 v5, 0xc

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final r(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final t(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final u(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final v(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lv01/e$c;->a:Lv01/e$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lv01/a;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    const-string v0, "$this$BottomSheetM3"

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

    move-object v6, p5

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p6, p4}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-static {p1}, Lv01/c;->s(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lv01/c;->u(Lp1/c1;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    sget-object p6, Lp1/l;->a:Lp1/v0;

    if-nez p4, :cond_1

    if-ne p5, p6, :cond_2

    :cond_1
    new-instance p5, Lq12/c;

    const/16 p4, 0x13

    invoke-direct {p5, p4, p1}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v6, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p5

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p1, :cond_3

    if-ne p4, p6, :cond_4

    :cond_3
    new-instance p4, Lq12/c;

    const/16 p1, 0x14

    invoke-direct {p4, p1, p2}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v6, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v4, p4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v5, p3

    invoke-static/range {v0 .. v8}, Lv01/c;->B(Lv01/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lv01/c;->t(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lv01/c;->v(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
