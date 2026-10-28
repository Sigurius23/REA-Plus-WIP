.class public abstract Lnr0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lnr0/j;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lnr0/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "text",
        "Lkd1/o;",
        "avatar",
        "i",
        "(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "community-highlights_release"
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
.method public static synthetic a(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lnr0/i;->j(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnr0/i;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lnr0/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lnr0/i;->h(Landroidx/compose/ui/Modifier;Lnr0/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lnr0/i;->g(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lnr0/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lnr0/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x5d237c5c

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v4, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    const/16 v9, 0x100

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v4, 0x180

    if-nez v10, :cond_6

    move-object/from16 v10, p2

    invoke-virtual {v8, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    move v11, v9

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v6, v11

    :goto_5
    and-int/lit16 v11, v6, 0x93

    const/16 v12, 0x92

    const/4 v15, 0x0

    if-eq v11, v12, :cond_9

    const/4 v11, 0x1

    goto :goto_6

    :cond_9
    move v11, v15

    :goto_6
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v8, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1b

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object/from16 v0, v16

    goto :goto_7

    :cond_a
    move-object v0, v5

    :goto_7
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_b

    new-instance v7, Lno1/g;

    const/16 v10, 0xc

    invoke-direct {v7, v10}, Lno1/g;-><init>(I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v11, v7

    goto :goto_8

    :cond_c
    move-object v11, v10

    :goto_8
    const/4 v12, 0x3

    int-to-float v7, v12

    int-to-float v3, v3

    mul-float/2addr v7, v3

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const v12, 0x3f428f5c    # 0.76f

    invoke-static {v10, v15, v12}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v2}, Lnr0/j;->g()F

    move-result v12

    invoke-virtual {v2}, Lnr0/j;->f()Ly81/f;

    move-result-object v13

    invoke-virtual {v13, v8, v15}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    invoke-static {v10, v12, v1, v2, v7}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lnr0/j;->j()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v2

    if-nez v2, :cond_d

    const v2, -0x5b739725

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    move-object/from16 v12, v16

    :goto_9
    move-object/from16 v16, v2

    goto :goto_b

    :cond_d
    const v7, -0x5b739724

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    and-int/lit16 v6, v6, 0x380

    if-ne v6, v9, :cond_e

    const/4 v6, 0x1

    goto :goto_a

    :cond_e
    move v6, v15

    :goto_a
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_f

    if-ne v7, v5, :cond_10

    :cond_f
    new-instance v7, Lcw2/b;

    const/4 v5, 0x4

    invoke-direct {v7, v11, v2, v5}, Lcw2/b;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v20, v7

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v12, v16

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_b
    if-nez v16, :cond_11

    move-object v2, v12

    goto :goto_c

    :cond_11
    move-object/from16 v2, v16

    :goto_c
    invoke-interface {v1, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_12

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_12
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_d
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-nez v10, :cond_13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    :cond_13
    invoke-static {v6, v8, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v8, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v1, v5

    invoke-virtual/range {p1 .. p1}, Lnr0/j;->a()Lkd1/o;

    move-result-object v5

    move-object v6, v9

    sget v9, Lkd1/o;->a:I

    const/4 v10, 0x3

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v18, v7

    const/4 v7, 0x0

    move-object/from16 v31, v1

    move-object/from16 v1, v17

    move-object/from16 v32, v18

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object/from16 v27, v8

    move/from16 v33, v9

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v6, v13

    const/16 v13, 0x61b0

    move v8, v14

    const/16 v14, 0x68

    move-object v9, v6

    const/4 v6, 0x0

    move v10, v8

    const/4 v8, 0x0

    move-object/from16 v17, v9

    sget-object v9, Ly2/j;->a:Ly2/b1;

    move/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 p0, v0

    move/from16 p2, v3

    move-object v3, v12

    move-object/from16 v0, v17

    move/from16 v4, v18

    move-object/from16 v34, v19

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v5, 0x3ff4000000000000L    # 1.25

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v9

    mul-float/2addr v7, v6

    invoke-static {v4, v5, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v2, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_15

    invoke-virtual {v8, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v8, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v31

    invoke-static {v8, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_16

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    move-object/from16 v0, v32

    invoke-static {v5, v8, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v8, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lnr0/j;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v1, Li2/w0;->a:Li2/v0;

    const/high16 v4, 0x3f000000    # 0.5f

    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    if-nez v0, :cond_18

    const v0, -0x43b109c

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    move/from16 v0, p2

    move/from16 p2, v4

    move-object v2, v5

    move/from16 p3, v6

    move v4, v7

    const/16 v35, 0x3

    goto/16 :goto_f

    :cond_18
    const/4 v7, 0x0

    const v9, -0x43b109b

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v8, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lnr0/j;->m()Ly81/f;

    move-result-object v9

    invoke-virtual {v9, v8, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v8, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->d()Lb91/a;

    move-result-object v25

    invoke-virtual {v5, v3, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v11, 0x1

    int-to-float v12, v11

    move/from16 v13, p2

    invoke-static {v2, v12, v13}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lnr0/j;->l()Ly81/f;

    move-result-object v12

    invoke-virtual {v12, v8, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    invoke-static {v2, v14, v15, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    mul-float v12, v6, v4

    invoke-static {v2, v12, v12}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v12, Lw3/k;

    const/4 v14, 0x3

    invoke-direct {v12, v14}, Lw3/k;-><init>(I)V

    sget v15, Lb91/a;->d:I

    shl-int/lit8 v29, v15, 0x12

    const v30, 0x2fdf8

    move/from16 v16, v7

    move-object/from16 v27, v8

    move-wide v7, v9

    const-wide/16 v9, 0x0

    move/from16 v36, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v35, v14

    move/from16 v18, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v31, v26

    const/16 v26, 0x0

    move/from16 v32, v28

    const/16 v28, 0x0

    move/from16 p2, v4

    move/from16 p3, v6

    move/from16 v4, v31

    move-object v6, v2

    move-object v2, v5

    move-object v5, v0

    move/from16 v0, v32

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual/range {p1 .. p1}, Lnr0/j;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_19

    const v0, -0x4311da5

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_19
    const v6, -0x4311da4

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v8, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lnr0/j;->e()Ly81/f;

    move-result-object v6

    invoke-virtual {v6, v8, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v8, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    sget-object v9, Lb2/e;->y:Lb2/m;

    invoke-virtual {v2, v3, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x2

    int-to-float v10, v10

    invoke-static {v9, v10, v0}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lnr0/j;->c()Ly81/f;

    move-result-object v9

    invoke-virtual {v9, v8, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-static {v0, v9, v10, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v11, 0x1

    int-to-float v1, v11

    mul-float v1, v1, p3

    mul-float v9, p3, p2

    invoke-static {v0, v1, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v29, v1, 0x12

    const v30, 0x2fff8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v8

    move-wide v7, v6

    move-object v6, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual/range {p1 .. p1}, Lnr0/j;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_1a

    const v0, -0x4280ce2

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    :goto_11
    const/4 v11, 0x1

    goto :goto_12

    :cond_1a
    const v1, -0x4280ce1

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v8, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lnr0/j;->h()Lkd1/o;

    move-result-object v6

    sget-object v0, Lb2/e;->G:Lb2/m;

    invoke-virtual {v2, v3, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    shl-int/lit8 v9, v33, 0x3

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lnr0/i;->i(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_11

    :goto_12
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move-object/from16 v3, v34

    goto :goto_13

    :cond_1b
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v10

    :goto_13
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lm31/h;

    const/16 v6, 0x16

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lnr0/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lnr0/i;->e(Landroidx/compose/ui/Modifier;Lnr0/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 33

    move-object/from16 v0, p1

    move/from16 v6, p4

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v1, -0x7d3b8760

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    const/4 v7, 0x4

    move-object/from16 v8, p0

    if-nez v1, :cond_1

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v7

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v6

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    and-int/lit8 v2, v6, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, v6, 0x40

    if-nez v2, :cond_2

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    move v9, v1

    goto :goto_6

    :cond_6
    and-int/lit16 v3, v6, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_5

    :cond_7
    const/16 v4, 0x80

    :goto_5
    or-int/2addr v1, v4

    goto :goto_4

    :goto_6
    and-int/lit16 v1, v9, 0x93

    const/16 v4, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v1, v4, :cond_8

    move v1, v11

    goto :goto_7

    :cond_8
    move v1, v10

    :goto_7
    and-int/lit8 v4, v9, 0x1

    invoke-virtual {v14, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_10

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_9

    move-object v13, v12

    goto :goto_8

    :cond_9
    move-object v13, v3

    :goto_8
    sget-object v1, Lb2/e;->K:Lb2/l;

    int-to-float v2, v11

    const/16 v3, 0x8

    int-to-float v3, v3

    const/16 v4, 0x36

    invoke-static {v2, v3, v1, v14, v4}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v14, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v14, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v14, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_a
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_9
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v14, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v14, Lp1/q;->S:Z

    if-nez v3, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v2, v14, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v0, :cond_d

    const v1, -0x202678d4

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    move v1, v9

    move v2, v10

    move v3, v11

    move-object v4, v13

    goto :goto_a

    :cond_d
    const v1, -0x202678d3

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    sget v4, Lkd1/o;->a:I

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v14

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    move-object/from16 v29, v3

    const/4 v0, 0x6

    int-to-float v0, v0

    int-to-float v2, v7

    mul-float/2addr v0, v2

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lt0/j;->a:Lt0/i;

    invoke-static {v0, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v15, 0x6030

    const/16 v16, 0x68

    const/4 v8, 0x0

    move v2, v10

    const/4 v10, 0x0

    move v3, v11

    sget-object v11, Ly2/j;->a:Ly2/b1;

    const/4 v12, 0x0

    move-object v4, v13

    const/4 v13, 0x0

    move-object v7, v1

    move v1, v9

    move-object/from16 v14, v29

    move-object v9, v0

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    :goto_a
    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v0, v14, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v0, v14, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v27

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v7, v0

    const-wide/16 v11, 0x0

    cmpl-double v5, v7, v11

    if-lez v5, :cond_e

    move v2, v3

    :cond_e
    if-nez v2, :cond_f

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_f
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v8, v0, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    and-int/lit8 v30, v1, 0xe

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit16 v0, v0, 0xc30

    const v32, 0x2d7f8

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v29, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v7, p0

    move/from16 v31, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v29

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    move-object v3, v4

    goto :goto_b

    :cond_10
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lcom/whoop/profile/view/a;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move v4, v6

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/view/a;-><init>(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final j(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lnr0/i;->i(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
