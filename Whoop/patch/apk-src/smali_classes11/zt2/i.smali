.class public abstract Lzt2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lzt2/h;",
        "goalSectionItemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onActionButtonClicked",
        "h",
        "(Lzt2/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "weekly-plan_release"
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
.method public static synthetic a(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzt2/i;->l(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lzt2/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzt2/i;->k(Lzt2/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lzt2/i;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzt2/i;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzt2/i;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzt2/i;->n(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lzt2/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lzt2/i;->o(Lzt2/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lzt2/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzt2/h;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    sget-object v0, Lb2/e;->K:Lb2/l;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const-string v3, "goalSectionItemState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v3, -0x32bb7a45

    invoke-virtual {v10, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    and-int/lit8 v7, p6, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v3, v3, 0x30

    :cond_2
    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_2

    move-object/from16 v8, p1

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v3, v9

    :goto_3
    and-int/lit8 v9, p6, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v5, 0x180

    if-nez v12, :cond_5

    move-object/from16 v12, p2

    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    const/16 v13, 0x100

    goto :goto_4

    :cond_7
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v3, v13

    :goto_5
    and-int/lit8 v13, p6, 0x8

    if-eqz v13, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v15, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v15, v5, 0xc00

    if-nez v15, :cond_8

    move-object/from16 v15, p3

    invoke-virtual {v10, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v3, v3, v16

    :goto_7
    and-int/lit16 v6, v3, 0x493

    const/16 v11, 0x492

    move/from16 v17, v7

    move/from16 v18, v13

    const/4 v13, 0x0

    if-eq v6, v11, :cond_b

    const/4 v6, 0x1

    goto :goto_8

    :cond_b
    move v6, v13

    :goto_8
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v10, v11, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_41

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v17, :cond_c

    move-object v8, v6

    :cond_c
    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v11, :cond_d

    new-instance v9, Lzm1/d;

    const/16 v12, 0xf

    invoke-direct {v9, v12}, Lzm1/d;-><init>(I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_e
    move-object v9, v12

    :goto_9
    if-eqz v18, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v11, :cond_f

    new-instance v12, Lzi1/e0;

    const/16 v15, 0xe

    invoke-direct {v12, v15}, Lzi1/e0;-><init>(I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v12, Lc93/a;

    goto :goto_a

    :cond_10
    move-object v12, v15

    :goto_a
    invoke-virtual {v1}, Lzt2/h;->getId()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_11

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v15, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v15, "toLowerCase(...)"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "_edit_button"

    invoke-virtual {v4, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_b

    :cond_11
    const/4 v4, 0x0

    :goto_b
    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v7, Ll0/m;->c:Ll0/g;

    invoke-static {v7, v2, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object/from16 p2, v14

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    move-object/from16 v15, p2

    invoke-static {v10, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v26, v8

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_12

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v10, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    move-object/from16 p2, v9

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v27, v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_14

    goto :goto_d

    :cond_13
    move-object/from16 v27, v11

    :goto_d
    invoke-static {v13, v10, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v10, v9, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v11, v0, v10, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v15

    move-object/from16 v28, v14

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    move-object/from16 v30, v12

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v32, v2

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-eqz v2, :cond_15

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v10, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    move-object/from16 v2, v28

    goto :goto_f

    :cond_17
    move-object/from16 v2, v28

    goto :goto_10

    :goto_f
    invoke-static {v13, v10, v13, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_10
    invoke-static {v10, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lzt2/h;->m()Lkd1/o;

    move-result-object v12

    sget-object v13, Ll0/t1;->a:Ll0/t1;

    if-nez v12, :cond_18

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v14, 0x1

    invoke-virtual {v13, v6, v14, v12}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v15

    :goto_11
    const/16 v14, 0x30

    goto :goto_12

    :cond_18
    move-object v15, v6

    goto :goto_11

    :goto_12
    invoke-static {v11, v0, v10, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    move-object/from16 v19, v15

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    move-object/from16 v28, v11

    move-object/from16 v11, v19

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v31, v13

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_19

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_19
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v10, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v7, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_1a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1b

    :cond_1a
    invoke-static {v14, v10, v14, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v10, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lzt2/h;->m()Lkd1/o;

    move-result-object v11

    if-eqz v11, :cond_1c

    const v11, -0x3b98adc6

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    new-instance v11, Lzt2/f;

    invoke-virtual {v1}, Lzt2/h;->m()Lkd1/o;

    move-result-object v15

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v25, 0x6

    const/16 v33, 0x3

    invoke-direct {v11, v15, v14, v12, v13}, Lzt2/f;-><init>(Lkd1/o;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v12, Lkd1/o;->a:I

    shl-int/lit8 v12, v12, 0x3

    or-int/lit8 v12, v12, 0x6

    invoke-static {v6, v11, v10, v12}, Lzt2/g;->b(Landroidx/compose/ui/Modifier;Lzt2/f;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object/from16 v38, p2

    move-object/from16 v33, v0

    move-object/from16 v42, v2

    move-object/from16 p1, v5

    move-object v2, v6

    move-object/from16 v41, v7

    move-object/from16 v40, v8

    move-object/from16 v43, v9

    move v0, v14

    move-object/from16 v37, v26

    move-object/from16 v47, v27

    move-object/from16 v44, v28

    move-object/from16 v39, v30

    move-object/from16 v5, v31

    :goto_14
    const/4 v11, 0x1

    goto/16 :goto_18

    :cond_1c
    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v25, 0x6

    const/16 v33, 0x3

    const v11, -0x3b945c11

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lzt2/h;->g()Z

    move-result v11

    if-eqz v11, :cond_1e

    const v11, -0x3b9394bf

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lzt2/h;->n()Lhy0/f;

    move-result-object v11

    sget-object v12, Lhy0/f;->CENTERED:Lhy0/f;

    if-ne v11, v12, :cond_1d

    const v11, -0x3b9148f5

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    const/4 v11, 0x1

    int-to-float v12, v11

    const/16 v24, 0x7

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v6

    move/from16 v23, v12

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v12, v9

    invoke-virtual {v1}, Lzt2/h;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object v15, v8

    invoke-virtual {v1}, Lzt2/h;->n()Lhy0/f;

    move-result-object v8

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v11, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v21

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v11, 0x9

    or-int/lit8 v11, v11, 0x6

    const/4 v13, 0x1

    const/16 v18, 0xd2

    move-object/from16 v23, v7

    const/4 v7, 0x0

    move-object/from16 v16, v10

    const/16 v24, 0x100

    const/4 v10, 0x0

    move/from16 v34, v13

    move/from16 v35, v14

    const-wide/16 v13, 0x0

    move-object/from16 v36, v15

    const/4 v15, 0x0

    move-object/from16 v38, p2

    move-object/from16 v33, v0

    move-object/from16 v42, v2

    move-object/from16 p1, v5

    move/from16 v17, v11

    move-object/from16 v43, v12

    move-object/from16 v2, v19

    move-wide/from16 v11, v21

    move-object/from16 v41, v23

    move-object/from16 v37, v26

    move-object/from16 v47, v27

    move-object/from16 v44, v28

    move-object/from16 v39, v30

    move-object/from16 v5, v31

    move-object/from16 v40, v36

    const/4 v0, 0x4

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    const/4 v6, 0x7

    int-to-float v6, v6

    int-to-float v7, v0

    const/4 v8, 0x0

    invoke-static {v6, v7, v2, v10, v8}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    move v0, v8

    goto :goto_15

    :cond_1d
    move-object/from16 v38, p2

    move-object/from16 v33, v0

    move-object/from16 v42, v2

    move-object/from16 p1, v5

    move-object v2, v6

    move-object/from16 v41, v7

    move-object/from16 v40, v8

    move-object/from16 v43, v9

    move v8, v14

    move-object/from16 v37, v26

    move-object/from16 v47, v27

    move-object/from16 v44, v28

    move-object/from16 v39, v30

    move-object/from16 v5, v31

    const/4 v0, 0x4

    const v6, -0x3b899e26

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/4 v11, 0x1

    int-to-float v6, v11

    const/16 v7, 0x8

    int-to-float v9, v7

    mul-float v22, v6, v9

    const/16 v21, 0x0

    const/16 v24, 0x3

    const/16 v20, 0x0

    move-object/from16 v19, v2

    move/from16 v23, v6

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v1}, Lzt2/h;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move/from16 v25, v8

    invoke-virtual {v1}, Lzt2/h;->n()Lhy0/f;

    move-result-object v8

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v7, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v11

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v17, v7, 0x9

    const/16 v18, 0xd2

    const/4 v7, 0x0

    move-object/from16 v28, v10

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move/from16 v0, v25

    move-object/from16 v16, v28

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_17

    :cond_1e
    move-object/from16 v38, p2

    move-object/from16 v33, v0

    move-object/from16 v42, v2

    move-object/from16 p1, v5

    move-object v2, v6

    move-object/from16 v41, v7

    move-object/from16 v40, v8

    move-object/from16 v43, v9

    move v0, v14

    move-object/from16 v37, v26

    move-object/from16 v47, v27

    move-object/from16 v44, v28

    move-object/from16 v39, v30

    move-object/from16 v5, v31

    const v6, -0x3b834170

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lzt2/h;->o()Z

    move-result v6

    if-eqz v6, :cond_1f

    const v6, -0x3b81e31d

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lzt2/h;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v8

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v30, v7, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_1f
    const v6, -0x3b7efb5b

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lzt2/h;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->L()Lb91/a;

    move-result-object v26

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v8

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v30, v7, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_14

    :goto_18
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lzt2/h;->g()Z

    move-result v6

    if-nez v6, :cond_20

    invoke-virtual {v1}, Lzt2/h;->o()Z

    move-result v6

    if-nez v6, :cond_20

    const v6, 0x3b1abefb

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-virtual {v5, v2, v11, v12}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_20
    const v6, 0x3b1bc5c1

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_19
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    and-int/lit16 v7, v3, 0x380

    const/16 v8, 0x100

    if-ne v7, v8, :cond_21

    const/4 v9, 0x1

    goto :goto_1a

    :cond_21
    move v9, v0

    :goto_1a
    or-int/2addr v6, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_23

    move-object/from16 v6, v47

    if-ne v9, v6, :cond_22

    goto :goto_1b

    :cond_22
    move-object/from16 v12, v38

    goto :goto_1c

    :cond_23
    move-object/from16 v6, v47

    :goto_1b
    new-instance v9, Lyo1/b;

    const/16 v11, 0x1a

    move-object/from16 v12, v38

    invoke-direct {v9, v1, v12, v11}, Lyo1/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1c
    move-object/from16 v23, v9

    check-cast v23, Lc93/a;

    const/16 v24, 0xf

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v2

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v4}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->J:Lb2/l;

    move-object/from16 v9, v44

    invoke-static {v9, v4, v10, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_24

    move-object/from16 v14, p1

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    :goto_1d
    move-object/from16 v15, v40

    goto :goto_1e

    :cond_24
    move-object/from16 v14, p1

    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_1d

    :goto_1e
    invoke-static {v10, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v41

    invoke-static {v10, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_25

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_26

    :cond_25
    move-object/from16 v8, v42

    goto :goto_20

    :cond_26
    move-object/from16 v8, v42

    :goto_1f
    move-object/from16 v11, v43

    goto :goto_21

    :goto_20
    invoke-static {v11, v10, v11, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1f

    :goto_21
    invoke-static {v10, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lzt2/h;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_27

    const v2, 0x64ad6c74

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lzt2/h;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v10, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->k()Lb91/a;

    move-result-object v26

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {v13, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v17

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v30, v0, 0x12

    const v31, 0x2fffa

    move v0, v7

    const/4 v7, 0x0

    move-object/from16 v28, v10

    move-object/from16 v43, v11

    const-wide/16 v10, 0x0

    move-object/from16 v38, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v40, v15

    const/16 v45, 0x100

    const-wide/16 v15, 0x0

    move-object/from16 v42, v8

    move-object/from16 v44, v9

    move-wide/from16 v8, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v22, v19

    move-object/from16 v21, v20

    const-wide/16 v19, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v27, v24

    const/16 v24, 0x0

    move-object/from16 v29, v25

    const/16 v25, 0x0

    move-object/from16 v36, v27

    const/16 v27, 0x0

    move-object/from16 v41, v29

    const/16 v29, 0x0

    move/from16 v49, v0

    move-object/from16 v50, v6

    move-object/from16 p2, v38

    move-object/from16 v1, v40

    move-object/from16 v0, v44

    move-object v6, v2

    move-object/from16 v38, v5

    move-object/from16 v5, v36

    move-object/from16 v2, v41

    move/from16 v36, v3

    move-object/from16 v3, v42

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_22

    :cond_27
    move/from16 v36, v3

    move-object/from16 v38, v5

    move-object/from16 v50, v6

    move/from16 v49, v7

    move-object v3, v8

    move-object/from16 v43, v11

    move-object/from16 p2, v12

    move-object v2, v14

    move-object v1, v15

    move-object/from16 v5, v19

    move v14, v0

    move-object v0, v9

    const v6, 0x64afb0bc

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_22
    invoke-virtual/range {p0 .. p0}, Lzt2/h;->i()Ly71/g;

    move-result-object v6

    if-eqz v6, :cond_28

    const v6, 0x64b0c113

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/4 v11, 0x1

    int-to-float v6, v11

    const/4 v7, 0x4

    int-to-float v8, v7

    mul-float/2addr v6, v8

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->i()Ly71/g;

    move-result-object v6

    invoke-virtual {v6}, Ly71/g;->b()I

    move-result v6

    const/4 v14, 0x6

    invoke-static {v6, v10, v14}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->i()Ly71/g;

    move-result-object v7

    invoke-virtual {v7}, Ly71/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v10, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v9, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v11

    const-wide/high16 v14, 0x400a000000000000L    # 3.25

    double-to-float v9, v14

    mul-float/2addr v9, v8

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v28, v10

    move-wide v9, v11

    const/16 v12, 0x180

    const/4 v13, 0x0

    move-object/from16 v11, v28

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_23
    const/4 v11, 0x1

    goto :goto_24

    :cond_28
    const/4 v14, 0x0

    const v6, 0x64b7749c

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_23

    :goto_24
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-eqz v6, :cond_2c

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v6

    if-eqz v6, :cond_2c

    const v6, 0x6039ef15

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    move-object/from16 v6, v33

    const/16 v7, 0x30

    invoke-static {v0, v6, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_29

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_25

    :cond_29
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_25
    invoke-static {v10, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_2b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto :goto_27

    :cond_2a
    :goto_26
    move-object/from16 v12, v43

    goto :goto_28

    :cond_2b
    :goto_27
    invoke-static {v8, v10, v8, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_26

    :goto_28
    invoke-static {v10, v12, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v8

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v30, v1, 0x12

    const v31, 0x2fffa

    move/from16 v29, v7

    const/4 v7, 0x0

    move-object/from16 v28, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v48, 0x6

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 v46, v29

    const/16 v29, 0x0

    move-object v1, v6

    move-object v6, v0

    move-object v0, v1

    move/from16 v1, v46

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    const/4 v11, 0x1

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    int-to-float v2, v11

    const/16 v7, 0x8

    int-to-float v3, v7

    const/4 v14, 0x0

    invoke-static {v2, v3, v5, v10, v14}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_29

    :cond_2c
    move-object/from16 v0, v33

    const/16 v1, 0x30

    const/4 v14, 0x0

    const/16 v48, 0x6

    const v2, 0x603e463d

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_29
    const v2, -0x1ded7276

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->h()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_31

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lm91/u;

    move-object/from16 v3, v37

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v13, 0x3

    int-to-float v7, v13

    const/4 v14, 0x4

    int-to-float v8, v14

    mul-float/2addr v7, v8

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v15, v50

    if-ne v4, v15, :cond_2d

    new-instance v4, Lzm1/d;

    const/16 v7, 0x10

    invoke-direct {v4, v7}, Lzm1/d;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v7

    move/from16 v4, v49

    const/16 v8, 0x100

    if-ne v4, v8, :cond_2e

    const/4 v9, 0x1

    goto :goto_2b

    :cond_2e
    const/4 v9, 0x0

    :goto_2b
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_30

    if-ne v11, v15, :cond_2f

    goto :goto_2c

    :cond_2f
    move-object/from16 v12, p2

    goto :goto_2d

    :cond_30
    :goto_2c
    new-instance v11, Lzr1/a;

    const/4 v9, 0x1

    move-object/from16 v12, p2

    invoke-direct {v11, v12, v9}, Lzr1/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2d
    move-object v9, v11

    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v11, Lm91/p;->b:I

    shl-int/2addr v11, v13

    move-object/from16 v16, v12

    const/4 v12, 0x4

    move/from16 v45, v8

    const/4 v8, 0x0

    move-object/from16 v33, v16

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v37, v3

    move/from16 v49, v4

    move-object/from16 v50, v15

    move-object/from16 p2, v33

    goto :goto_2a

    :cond_31
    move-object/from16 v33, p2

    move-object/from16 v3, v37

    move-object/from16 v15, v50

    const/4 v8, 0x0

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_32

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    const v2, 0x60485bd6

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v6

    const/16 v7, 0x8

    int-to-float v4, v7

    const/4 v14, 0x0

    invoke-static {v2, v4, v5, v10, v14}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_2e
    const/high16 v12, 0x3f800000    # 1.0f

    goto :goto_2f

    :cond_32
    const/4 v14, 0x0

    const v2, 0x6049665d

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_2e

    :goto_2f
    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->a:Ll0/e;

    invoke-static {v4, v0, v10, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_33

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_30

    :cond_33
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_30
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_34

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_35

    :cond_34
    invoke-static {v4, v10, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_35
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_39

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_39

    const v2, 0x25f332fd

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x40400000    # 3.0f

    move-object/from16 v9, v38

    const/4 v11, 0x1

    invoke-virtual {v9, v5, v11, v2}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, Ll0/m;->c:Ll0/g;

    move-object/from16 v12, v32

    invoke-static {v11, v12, v10, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_36

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_31

    :cond_36
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_31
    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_37

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_38

    :cond_37
    invoke-static {v12, v10, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_38
    invoke-static {v10, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v10, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v10, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-virtual {v11, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v11

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v30, v13, 0x12

    const v31, 0x2fffa

    move-object v13, v7

    const/4 v7, 0x0

    move-object/from16 v38, v9

    move-object/from16 v28, v10

    move-wide/from16 v53, v11

    move-object v12, v8

    move-wide/from16 v8, v53

    const-wide/16 v10, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v27, v15

    move-object/from16 v18, v16

    const-wide/16 v15, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    move-object/from16 v21, v20

    const-wide/16 v19, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move-object/from16 v32, v25

    const/16 v25, 0x0

    move-object/from16 v47, v27

    const/16 v27, 0x0

    move-object/from16 v37, v29

    const/16 v29, 0x0

    move-object/from16 v52, v6

    move-object/from16 v51, v37

    move-object/from16 v1, v38

    move-object v6, v2

    move-object/from16 v37, v3

    move-object/from16 v2, v32

    move-object/from16 v3, v47

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    const/4 v11, 0x1

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_32

    :cond_39
    move-object/from16 v37, v3

    move-object/from16 v52, v6

    move-object v2, v7

    move-object/from16 v51, v8

    move-object v3, v15

    move-object/from16 v1, v38

    const/4 v14, 0x0

    const v6, 0x25faa238

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_32
    invoke-virtual/range {p0 .. p0}, Lzt2/h;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/high16 v7, 0x40000000    # 2.0f

    if-eqz v6, :cond_40

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_40

    const v6, 0x25fca55a

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/4 v11, 0x1

    invoke-virtual {v1, v5, v11, v7}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lb2/e;->O:Lb2/k;

    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v14, 0x30

    invoke-static {v7, v6, v10, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_3a

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    :goto_33
    move-object/from16 v12, v51

    goto :goto_34

    :cond_3a
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_33

    :goto_34
    invoke-static {v10, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_3b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c

    :cond_3b
    move-object/from16 v0, v52

    invoke-static {v7, v10, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3c
    invoke-static {v10, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v11, 0x1

    int-to-float v0, v11

    const/16 v7, 0x8

    int-to-float v1, v7

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    const/4 v12, 0x2

    invoke-static {v5, v0, v1, v12}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual/range {p0 .. p0}, Lzt2/h;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v0, Ly71/g;

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1}, Lih0/d0;->E(Lx81/d;)I

    move-result v1

    const/4 v13, 0x0

    invoke-direct {v0, v1, v13, v12, v13}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v1, v36

    and-int/lit16 v1, v1, 0x1c00

    const/16 v2, 0x800

    if-ne v1, v2, :cond_3d

    const/4 v1, 0x1

    goto :goto_35

    :cond_3d
    const/4 v1, 0x0

    :goto_35
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3f

    if-ne v2, v3, :cond_3e

    goto :goto_36

    :cond_3e
    move-object/from16 v3, v39

    goto :goto_37

    :cond_3f
    :goto_36
    new-instance v2, Lpy0/a;

    const/16 v1, 0x1b

    move-object/from16 v3, v39

    invoke-direct {v2, v3, v1}, Lpy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_37
    move-object/from16 v18, v2

    check-cast v18, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x6

    or-int/lit8 v1, v1, 0x36

    sget v2, Ly71/g;->c:I

    shl-int/lit8 v2, v2, 0xc

    or-int v20, v1, v2

    const/16 v21, 0x0

    const/16 v22, 0xfe8

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v10

    move-object v10, v0

    invoke-static/range {v6 .. v22}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v19

    const/4 v11, 0x1

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_38

    :cond_40
    move-object/from16 v3, v39

    const/4 v11, 0x1

    const/4 v14, 0x0

    const v0, 0x26069832

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v5, v11, v7}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_38
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object v4, v3

    move-object/from16 v3, v33

    move-object/from16 v2, v37

    goto :goto_39

    :cond_41
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v8

    move-object v3, v12

    move-object v4, v15

    :goto_39
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_42

    new-instance v0, Lw71/k;

    const/16 v7, 0x16

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_42
    return-void
.end method

.method private static final i(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Lzt2/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lzt2/h;->f()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lm91/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lg41/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lg41/a;

    invoke-direct {v3}, Lg41/a;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v2, Lzt2/n;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lzt2/k;

    invoke-direct {v3}, Lzt2/k;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lzt2/b;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lzt2/a;

    invoke-direct {v1}, Lzt2/a;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lzt2/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lzt2/i;->h(Lzt2/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
