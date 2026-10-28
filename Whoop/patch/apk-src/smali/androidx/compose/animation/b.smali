.class public abstract Landroidx/compose/animation/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lc93/m;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move/from16 v12, p8

    move-object/from16 v3, p7

    check-cast v3, Lp1/q;

    const v1, 0x72039c2f

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v12, 0x6

    const/4 v13, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v13

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v12

    goto :goto_1

    :cond_1
    move v1, v12

    :goto_1
    and-int/lit8 v2, v12, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v3, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v12, 0x180

    if-nez v2, :cond_5

    invoke-virtual {v3, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v12, 0xc00

    if-nez v2, :cond_7

    invoke-virtual {v3, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v12, 0x6000

    if-nez v2, :cond_9

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    const/high16 v2, 0x30000

    and-int/2addr v2, v12

    if-nez v2, :cond_b

    invoke-virtual {v3, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v2, 0x10000

    :goto_6
    or-int/2addr v1, v2

    :cond_b
    const/high16 v2, 0x180000

    or-int/2addr v1, v2

    const/high16 v2, 0xc00000

    and-int/2addr v2, v12

    if-nez v2, :cond_d

    invoke-virtual {v3, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/high16 v2, 0x800000

    goto :goto_7

    :cond_c
    const/high16 v2, 0x400000

    :goto_7
    or-int/2addr v1, v2

    :cond_d
    move v14, v1

    const v1, 0x492493

    and-int/2addr v1, v14

    const v2, 0x492492

    const/4 v15, 0x0

    if-eq v1, v2, :cond_e

    const/4 v1, 0x1

    goto :goto_8

    :cond_e
    move v1, v15

    :goto_8
    and-int/lit8 v2, v14, 0x1

    invoke-virtual {v3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_47

    iget-object v1, v0, Ld0/z1;->d:Lp1/k1;

    iget-object v2, v0, Ld0/z1;->a:Lal/a;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_10

    invoke-virtual {v2}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_10

    invoke-virtual {v0}, Ld0/z1;->g()Z

    move-result v1

    if-nez v1, :cond_10

    invoke-virtual {v0}, Ld0/z1;->d()Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_9

    :cond_f
    const v1, -0xdb7cd6d

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_23

    :cond_10
    :goto_9
    const v1, -0xdd8f8c3

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v1, v14, 0xe

    or-int/lit8 v5, v1, 0x30

    and-int/lit8 v4, v5, 0xe

    xor-int/lit8 v15, v4, 0x6

    if-le v15, v13, :cond_11

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_12

    :cond_11
    and-int/lit8 v5, v5, 0x6

    if-ne v5, v13, :cond_13

    :cond_12
    const/4 v5, 0x1

    goto :goto_a

    :cond_13
    const/4 v5, 0x0

    :goto_a
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_14

    if-ne v15, v13, :cond_15

    :cond_14
    invoke-virtual {v2}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v3, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    invoke-virtual {v0}, Ld0/z1;->g()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-virtual {v2}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v15

    :cond_16
    const v2, 0x6defb3b0

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-static {v0, v6, v15, v3}, Landroidx/compose/animation/b;->i(Ld0/z1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lc0/q0;

    move-result-object v5

    const/4 v15, 0x0

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    iget-object v15, v0, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v15}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-static {v0, v6, v15, v3}, Landroidx/compose/animation/b;->i(Ld0/z1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lc0/q0;

    move-result-object v2

    const/4 v15, 0x0

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    or-int/lit16 v4, v4, 0xc00

    move v15, v1

    move-object v1, v5

    move v5, v4

    move-object v4, v3

    const-string v3, "EnterExitTransition"

    invoke-static/range {v0 .. v5}, Ld0/d2;->b(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/z1;

    move-result-object v1

    move-object v3, v4

    invoke-static {v10, v3}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v0

    iget-object v2, v1, Ld0/z1;->a:Lal/a;

    iget-object v4, v1, Ld0/z1;->a:Lal/a;

    iget-object v5, v1, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v2}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v4

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v10, v2, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v4, v4, v19

    move/from16 v19, v4

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v20, v5

    const/4 v5, 0x0

    if-nez v19, :cond_17

    if-ne v4, v13, :cond_18

    :cond_17
    new-instance v4, La6/v;

    const/4 v6, 0x4

    invoke-direct {v4, v1, v0, v5, v6}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v4, Lc93/m;

    invoke-static {v3, v4, v2}, Lp1/x;->A(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)Lp1/c1;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lc0/q0;->y:Lc0/q0;

    if-ne v2, v4, :cond_1a

    invoke-virtual/range {v20 .. v20}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_1a

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_b

    :cond_19
    const v0, -0xdb7e4ad

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_22

    :cond_1a
    :goto_b
    const v0, -0xdc9414d

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const/4 v6, 0x4

    if-ne v15, v6, :cond_1b

    const/4 v4, 0x1

    goto :goto_c

    :cond_1b
    const/4 v4, 0x0

    :goto_c
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_1c

    if-ne v0, v13, :cond_1d

    :cond_1c
    new-instance v0, Lc0/j0;

    invoke-direct {v0}, Lc0/j0;-><init>()V

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object v6, v0

    check-cast v6, Lc0/j0;

    sget-object v0, Lc0/w0;->a:Ld0/f2;

    sget-object v0, Ld0/f;->o:Ld0/f2;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_1e

    sget-object v2, Lc0/t0;->w:Lc0/t0;

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object v15, v2

    check-cast v15, Lc93/a;

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1f

    if-ne v4, v13, :cond_20

    :cond_1f
    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v4, Lp1/c1;

    invoke-virtual/range {v18 .. v18}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_22

    invoke-virtual/range {v18 .. v18}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lc0/q0;->x:Lc0/q0;

    if-ne v2, v5, :cond_22

    invoke-virtual {v1}, Ld0/z1;->g()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface {v4, v8}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_d

    :cond_21
    sget-object v2, Lc0/c1;->a:Lc0/d1;

    invoke-interface {v4, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_d

    :cond_22
    invoke-virtual/range {v20 .. v20}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lc0/q0;->x:Lc0/q0;

    if-ne v2, v5, :cond_23

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc0/c1;

    invoke-virtual {v2, v8}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v2

    invoke-interface {v4, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_23
    :goto_d
    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Lc0/c1;

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_24

    if-ne v4, v13, :cond_25

    :cond_24
    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v4, Lp1/c1;

    invoke-virtual/range {v18 .. v18}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_27

    invoke-virtual/range {v18 .. v18}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lc0/q0;->x:Lc0/q0;

    if-ne v2, v5, :cond_27

    invoke-virtual {v1}, Ld0/z1;->g()Z

    move-result v2

    if-eqz v2, :cond_26

    invoke-interface {v4, v9}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_e

    :cond_26
    sget-object v2, Lc0/e1;->a:Lc0/f1;

    invoke-interface {v4, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_e

    :cond_27
    invoke-virtual/range {v20 .. v20}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lc0/q0;->x:Lc0/q0;

    if-eq v2, v5, :cond_28

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc0/e1;

    invoke-virtual {v2, v9}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v2

    invoke-interface {v4, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_28
    :goto_e
    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Lc0/e1;

    move-object/from16 v2, v23

    check-cast v2, Lc0/d1;

    iget-object v2, v2, Lc0/d1;->b:Lc0/u1;

    iget-object v4, v2, Lc0/u1;->c:Lc0/k0;

    iget-object v5, v2, Lc0/u1;->b:Lc0/s1;

    if-nez v5, :cond_2a

    move-object/from16 v5, v24

    check-cast v5, Lc0/f1;

    iget-object v5, v5, Lc0/f1;->c:Lc0/u1;

    iget-object v5, v5, Lc0/u1;->b:Lc0/s1;

    if-eqz v5, :cond_29

    goto :goto_f

    :cond_29
    const/4 v5, 0x0

    goto :goto_10

    :cond_2a
    :goto_f
    const/4 v5, 0x1

    :goto_10
    move-object/from16 v18, v0

    if-nez v4, :cond_2c

    move-object/from16 v0, v24

    check-cast v0, Lc0/f1;

    iget-object v0, v0, Lc0/f1;->c:Lc0/u1;

    iget-object v0, v0, Lc0/u1;->c:Lc0/k0;

    if-eqz v0, :cond_2b

    goto :goto_11

    :cond_2b
    const/16 v19, 0x0

    goto :goto_12

    :cond_2c
    :goto_11
    const/16 v19, 0x1

    :goto_12
    if-eqz v5, :cond_2e

    const v0, 0x7fa35c5

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_2d

    const-string v0, "Built-in slide"

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v0, Ljava/lang/String;

    move-object v5, v4

    const/16 v4, 0x180

    move-object/from16 v20, v5

    const/4 v5, 0x0

    move-object v10, v2

    move-object/from16 v12, v20

    move-object/from16 v8, v23

    move-object/from16 v9, v24

    const/16 v17, 0x0

    move-object v2, v0

    move-object v0, v1

    move-object/from16 v1, v18

    invoke-static/range {v0 .. v5}, Ld0/d2;->c(Ld0/z1;Ld0/f2;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/s1;

    move-result-object v5

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    move-object/from16 v25, v5

    goto :goto_13

    :cond_2e
    move-object v0, v1

    move-object v10, v2

    move-object v12, v4

    move-object/from16 v8, v23

    move-object/from16 v9, v24

    const/4 v1, 0x0

    const/16 v17, 0x0

    const v2, 0x7fbd310

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    move-object/from16 v25, v17

    :goto_13
    if-eqz v19, :cond_30

    const v1, 0x7fd399f

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    sget-object v1, Ld0/f;->p:Ld0/f2;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_2f

    const-string v2, "Built-in shrink/expand"

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    check-cast v2, Ljava/lang/String;

    const/16 v4, 0x180

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Ld0/d2;->c(Ld0/z1;Ld0/f2;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/s1;

    move-result-object v5

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    move-object/from16 v26, v5

    goto :goto_14

    :cond_30
    const/4 v1, 0x0

    const v2, 0x7feea87

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    move-object/from16 v26, v17

    :goto_14
    if-eqz v19, :cond_32

    const v1, 0x8000a21

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_31

    const-string v1, "Built-in InterruptionHandlingOffset"

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    const/16 v4, 0x180

    const/4 v5, 0x0

    move-object/from16 v1, v18

    invoke-static/range {v0 .. v5}, Ld0/d2;->c(Ld0/z1;Ld0/f2;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/s1;

    move-result-object v5

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    move-object/from16 v27, v5

    goto :goto_15

    :cond_32
    const/4 v1, 0x0

    const v2, 0x802a3c7

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    move-object/from16 v27, v17

    :goto_15
    if-eqz v12, :cond_33

    iget-boolean v1, v12, Lc0/k0;->d:Z

    if-nez v1, :cond_33

    goto :goto_16

    :cond_33
    move-object v1, v9

    check-cast v1, Lc0/f1;

    iget-object v1, v1, Lc0/f1;->c:Lc0/u1;

    iget-object v1, v1, Lc0/u1;->c:Lc0/k0;

    if-eqz v1, :cond_34

    iget-boolean v1, v1, Lc0/k0;->d:Z

    if-nez v1, :cond_34

    goto :goto_16

    :cond_34
    if-nez v19, :cond_35

    :goto_16
    const/4 v12, 0x1

    goto :goto_17

    :cond_35
    const/4 v12, 0x0

    :goto_17
    sget-object v1, Ld0/f;->i:Ld0/f2;

    iget-object v2, v10, Lc0/u1;->a:Lc0/g1;

    if-nez v2, :cond_37

    move-object v2, v9

    check-cast v2, Lc0/f1;

    iget-object v2, v2, Lc0/f1;->c:Lc0/u1;

    iget-object v2, v2, Lc0/u1;->a:Lc0/g1;

    if-eqz v2, :cond_36

    goto :goto_18

    :cond_36
    const/4 v4, 0x0

    goto :goto_19

    :cond_37
    :goto_18
    const/4 v4, 0x1

    :goto_19
    iget-object v2, v10, Lc0/u1;->d:Lc0/l1;

    if-nez v2, :cond_39

    move-object v2, v9

    check-cast v2, Lc0/f1;

    iget-object v2, v2, Lc0/f1;->c:Lc0/u1;

    iget-object v2, v2, Lc0/u1;->d:Lc0/l1;

    if-eqz v2, :cond_38

    goto :goto_1a

    :cond_38
    const/4 v10, 0x0

    goto :goto_1b

    :cond_39
    :goto_1a
    const/4 v10, 0x1

    :goto_1b
    if-eqz v4, :cond_3b

    const v2, -0x29f40b7d

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_3a

    const-string v2, "Built-in alpha"

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3a
    check-cast v2, Ljava/lang/String;

    const/16 v4, 0x180

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Ld0/d2;->c(Ld0/z1;Ld0/f2;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/s1;

    move-result-object v5

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    move-object/from16 v19, v5

    goto :goto_1c

    :cond_3b
    const/4 v2, 0x0

    const v4, -0x29f17598

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    move-object/from16 v19, v17

    :goto_1c
    if-eqz v10, :cond_3d

    const v2, -0x29f06d5d

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_3c

    const-string v2, "Built-in scale"

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3c
    check-cast v2, Ljava/lang/String;

    const/16 v4, 0x180

    const/4 v5, 0x0

    move/from16 v18, v10

    move-object/from16 v10, v19

    invoke-static/range {v0 .. v5}, Ld0/d2;->c(Ld0/z1;Ld0/f2;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/s1;

    move-result-object v5

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    move-object/from16 v20, v5

    goto :goto_1d

    :cond_3d
    move/from16 v18, v10

    move-object/from16 v10, v19

    const/4 v1, 0x0

    const v2, -0x29edd778

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    move-object/from16 v20, v17

    :goto_1d
    if-eqz v18, :cond_3e

    const v2, -0x29eca820

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    move/from16 v16, v1

    sget-object v1, Lc0/w0;->a:Ld0/f2;

    const/16 v4, 0x180

    const/4 v5, 0x0

    const-string v2, "TransformOriginInterruptionHandling"

    move/from16 v28, v14

    move/from16 v11, v16

    move-object/from16 v14, v20

    invoke-static/range {v0 .. v5}, Ld0/d2;->c(Ld0/z1;Ld0/f2;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/s1;

    move-result-object v5

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_3e
    move v11, v1

    move/from16 v28, v14

    move-object/from16 v14, v20

    const v1, -0x29ea06f8

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    move-object/from16 v5, v17

    :goto_1e
    invoke-virtual {v3, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v3, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v3, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v3, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_40

    if-ne v2, v13, :cond_3f

    goto :goto_1f

    :cond_3f
    move-object/from16 v23, v8

    move-object/from16 v24, v9

    goto :goto_20

    :cond_40
    :goto_1f
    new-instance v18, Lc0/r0;

    move-object/from16 v21, v0

    move-object/from16 v24, v5

    move-object/from16 v22, v8

    move-object/from16 v23, v9

    move-object/from16 v19, v10

    move-object/from16 v20, v14

    invoke-direct/range {v18 .. v24}, Lc0/r0;-><init>(Ld0/s1;Ld0/s1;Ld0/z1;Lc0/c1;Lc0/e1;Ld0/s1;)V

    move-object/from16 v2, v18

    move-object/from16 v24, v23

    move-object/from16 v23, v22

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_20
    check-cast v2, Lc0/r0;

    invoke-virtual {v3, v12}, Lp1/q;->h(Z)Z

    move-result v1

    invoke-virtual {v3, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_41

    if-ne v4, v13, :cond_42

    :cond_41
    new-instance v4, Lc0/u0;

    invoke-direct {v4, v15, v12}, Lc0/u0;-><init>(Lc93/a;Z)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_42
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v4}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v18, Landroidx/compose/animation/EnterExitTransitionElement;

    move-object/from16 v19, v0

    move-object/from16 v22, v25

    move-object/from16 v20, v26

    move-object/from16 v21, v27

    move-object/from16 v26, v2

    move-object/from16 v25, v15

    invoke-direct/range {v18 .. v26}, Landroidx/compose/animation/EnterExitTransitionElement;-><init>(Ld0/z1;Ld0/s1;Ld0/s1;Ld0/s1;Lc0/c1;Lc0/e1;Lc93/a;Lc0/r0;)V

    move-object/from16 v0, v18

    invoke-interface {v4, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v2, -0x715e89

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_43

    new-instance v1, Lc0/y;

    invoke-direct {v1, v6}, Lc0/y;-><init>(Lc0/j0;)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_43
    check-cast v1, Lc0/y;

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_44

    invoke-virtual {v3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_21

    :cond_44
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_21
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v3, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v3, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_45

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_46

    :cond_45
    invoke-static {v2, v3, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_46
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v3, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v28, 0x12

    and-int/lit8 v0, v0, 0x70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v11, p6

    invoke-interface {v11, v6, v3, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    const/4 v15, 0x0

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    :goto_22
    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    goto :goto_23

    :cond_47
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_23
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_48

    new-instance v0, Lc0/z;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p8

    move-object v3, v7

    move-object v7, v11

    invoke-direct/range {v0 .. v8}, Lc0/z;-><init>(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lc93/m;Lkotlin/jvm/functions/Function3;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_48
    return-void
.end method

.method public static final b(Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v7, p7

    move-object/from16 v14, p6

    check-cast v14, Lp1/q;

    const v0, 0x272964f3

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v7, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v7

    goto :goto_2

    :cond_2
    move v0, v7

    :goto_2
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit16 v4, v7, 0x180

    move-object/from16 v11, p2

    if-nez v4, :cond_7

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x100

    goto :goto_5

    :cond_6
    const/16 v4, 0x80

    :goto_5
    or-int/2addr v0, v4

    :cond_7
    or-int/lit16 v0, v0, 0x6c00

    const/high16 v4, 0x30000

    and-int/2addr v4, v7

    move-object/from16 v13, p5

    if-nez v4, :cond_9

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/high16 v4, 0x20000

    goto :goto_6

    :cond_8
    const/high16 v4, 0x10000

    :goto_6
    or-int/2addr v0, v4

    :cond_9
    const v4, 0x12493

    and-int/2addr v4, v0

    const v5, 0x12492

    if-eq v4, v5, :cond_a

    const/4 v4, 0x1

    goto :goto_7

    :cond_a
    const/4 v4, 0x0

    :goto_7
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v14, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_d

    if-eqz v2, :cond_b

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v10, v2

    goto :goto_8

    :cond_b
    move-object v10, v3

    :goto_8
    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {v2, v3}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v3

    const/16 v4, 0xf

    invoke-static {v2, v4}, Lc0/w0;->k(Ld0/e2;I)Lc0/f1;

    move-result-object v2

    invoke-virtual {v3, v2}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v12

    and-int/lit8 v2, v0, 0xe

    shr-int/lit8 v3, v0, 0x9

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    const-string v3, "AnimatedVisibility"

    invoke-static {v1, v3, v14, v2}, Ld0/d2;->e(Lal/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/z1;

    move-result-object v8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_c

    sget-object v2, Lc0/c;->G:Lc0/c;

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v2, v0, 0x3

    and-int/lit16 v4, v2, 0x380

    or-int/lit8 v4, v4, 0x30

    and-int/lit16 v5, v2, 0x1c00

    or-int/2addr v4, v5

    const v5, 0xe000

    and-int/2addr v2, v5

    or-int/2addr v2, v4

    const/high16 v4, 0x70000

    and-int/2addr v0, v4

    or-int v15, v2, v0

    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/b;->h(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v3

    move-object v2, v10

    move-object v4, v12

    goto :goto_9

    :cond_d
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object v2, v3

    :goto_9
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_e

    new-instance v0, Lpj/q;

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lpj/q;-><init>(Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final c(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/f1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move/from16 v7, p7

    move-object/from16 v14, p6

    check-cast v14, Lp1/q;

    const v0, -0x65501672

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    move-object/from16 v8, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v1, v7, 0x30

    move-object/from16 v9, p1

    if-nez v1, :cond_3

    invoke-virtual {v14, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    or-int/lit16 v0, v0, 0x180

    and-int/lit16 v1, v7, 0xc00

    move-object/from16 v11, p3

    if-nez v1, :cond_5

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x800

    goto :goto_3

    :cond_4
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v7, 0x6000

    move-object/from16 v12, p4

    if-nez v1, :cond_7

    invoke-virtual {v14, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x4000

    goto :goto_4

    :cond_6
    const/16 v1, 0x2000

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    const/high16 v1, 0x30000

    and-int/2addr v1, v7

    move-object/from16 v13, p5

    if-nez v1, :cond_9

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/high16 v1, 0x20000

    goto :goto_5

    :cond_8
    const/high16 v1, 0x10000

    :goto_5
    or-int/2addr v0, v1

    :cond_9
    const v1, 0x12493

    and-int/2addr v1, v0

    const v2, 0x12492

    if-eq v1, v2, :cond_a

    const/4 v1, 0x1

    goto :goto_6

    :cond_a
    const/4 v1, 0x0

    :goto_6
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v14, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    const v1, 0x7fffe

    and-int v15, v0, v1

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/b;->h(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v10

    goto :goto_7

    :cond_b
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object/from16 v3, p2

    :goto_7
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_c

    new-instance v0, Lc0/c0;

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v8}, Lc0/c0;-><init>(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final d(Ll0/y;Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v2, p1

    move/from16 v8, p8

    move-object/from16 v15, p7

    check-cast v15, Lp1/q;

    const v0, -0x49d6a37d

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x30

    if-nez v0, :cond_2

    and-int/lit8 v0, v8, 0x40

    if-nez v0, :cond_0

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr v0, v8

    goto :goto_2

    :cond_2
    move v0, v8

    :goto_2
    or-int/lit16 v0, v0, 0x180

    and-int/lit16 v1, v8, 0xc00

    move-object/from16 v12, p3

    if-nez v1, :cond_4

    invoke-virtual {v15, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x800

    goto :goto_3

    :cond_3
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, p9, 0x8

    if-eqz v1, :cond_6

    or-int/lit16 v0, v0, 0x6000

    :cond_5
    move-object/from16 v3, p4

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v8, 0x6000

    if-nez v3, :cond_5

    move-object/from16 v3, p4

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x4000

    goto :goto_4

    :cond_7
    const/16 v4, 0x2000

    :goto_4
    or-int/2addr v0, v4

    :goto_5
    const/high16 v4, 0x30000

    or-int/2addr v0, v4

    const/high16 v4, 0x180000

    and-int/2addr v4, v8

    move-object/from16 v7, p6

    if-nez v4, :cond_9

    invoke-virtual {v15, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/high16 v4, 0x100000

    goto :goto_6

    :cond_8
    const/high16 v4, 0x80000

    :goto_6
    or-int/2addr v0, v4

    :cond_9
    const v4, 0x92491

    and-int/2addr v4, v0

    const v5, 0x92490

    if-eq v4, v5, :cond_a

    const/4 v4, 0x1

    goto :goto_7

    :cond_a
    const/4 v4, 0x0

    :goto_7
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v15, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_d

    if-eqz v1, :cond_b

    const/16 v1, 0xf

    const/4 v3, 0x0

    invoke-static {v3, v3, v3, v1}, Lc0/w0;->l(Ld0/c0;Lb2/l;Lkotlin/jvm/functions/Function1;I)Lc0/f1;

    move-result-object v1

    const/4 v4, 0x3

    invoke-static {v3, v4}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v3

    invoke-virtual {v1, v3}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v1

    move-object v13, v1

    goto :goto_8

    :cond_b
    move-object v13, v3

    :goto_8
    shr-int/lit8 v1, v0, 0x3

    and-int/lit8 v3, v1, 0xe

    shr-int/lit8 v4, v0, 0xc

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    const-string v4, "AnimatedVisibility"

    invoke-static {v2, v4, v15, v3}, Ld0/d2;->e(Lal/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/z1;

    move-result-object v9

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_c

    sget-object v3, Lc0/c;->z:Lc0/c;

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v10, v3

    check-cast v10, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v3, v0, 0x380

    or-int/lit8 v3, v3, 0x30

    and-int/lit16 v5, v0, 0x1c00

    or-int/2addr v3, v5

    const v5, 0xe000

    and-int/2addr v0, v5

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v1, v3

    or-int v16, v0, v1

    sget-object v11, Lb2/t;->w:Lb2/t;

    move-object v14, v7

    invoke-static/range {v9 .. v16}, Landroidx/compose/animation/b;->h(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    move-object v6, v4

    move-object v3, v11

    move-object v5, v13

    goto :goto_9

    :cond_d
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v6, p5

    move-object v5, v3

    move-object/from16 v3, p2

    :goto_9
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_e

    new-instance v0, Lc0/b0;

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lc0/b0;-><init>(Ll0/y;Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 13

    move/from16 v8, p8

    move-object/from16 v6, p7

    check-cast v6, Lp1/q;

    const v0, 0x6b47faab

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x30

    if-nez v0, :cond_1

    invoke-virtual {v6, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v1, p9, 0x2

    if-eqz v1, :cond_2

    or-int/lit16 v0, v0, 0x180

    goto :goto_3

    :cond_2
    and-int/lit16 v2, v8, 0x180

    if-nez v2, :cond_4

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x100

    goto :goto_2

    :cond_3
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v0, v3

    :cond_4
    :goto_3
    and-int/lit8 v3, p9, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0xc00

    :cond_5
    move-object/from16 v4, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v8, 0xc00

    if-nez v4, :cond_5

    move-object/from16 v4, p3

    invoke-virtual {v6, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x800

    goto :goto_4

    :cond_7
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v0, v5

    :goto_5
    and-int/lit8 v5, p9, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v0, v0, 0x6000

    :cond_8
    move-object/from16 v7, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v8, 0x6000

    if-nez v7, :cond_8

    move-object/from16 v7, p4

    invoke-virtual {v6, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_6

    :cond_a
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v0, v9

    :goto_7
    const/high16 v9, 0x30000

    or-int/2addr v0, v9

    const/high16 v9, 0x180000

    and-int/2addr v9, v8

    if-nez v9, :cond_c

    move-object/from16 v9, p6

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/high16 v10, 0x100000

    goto :goto_8

    :cond_b
    const/high16 v10, 0x80000

    :goto_8
    or-int/2addr v0, v10

    goto :goto_9

    :cond_c
    move-object/from16 v9, p6

    :goto_9
    const v10, 0x92491

    and-int/2addr v10, v0

    const v11, 0x92490

    const/4 v12, 0x0

    if-eq v10, v11, :cond_d

    const/4 v10, 0x1

    goto :goto_a

    :cond_d
    move v10, v12

    :goto_a
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v6, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_12

    if-eqz v1, :cond_e

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v2, v1

    goto :goto_b

    :cond_e
    move-object v2, p2

    :goto_b
    const/16 v1, 0xf

    const/4 v10, 0x3

    const/4 v11, 0x0

    if-eqz v3, :cond_f

    invoke-static {v11, v10}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v3

    invoke-static {v11, v11, v1}, Lc0/w0;->d(Ld0/c0;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object v4

    invoke-virtual {v3, v4}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v3

    goto :goto_c

    :cond_f
    move-object v3, v4

    :goto_c
    if-eqz v5, :cond_10

    invoke-static {v11, v10}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v4

    invoke-static {v11, v11, v11, v1}, Lc0/w0;->l(Ld0/c0;Lb2/l;Lkotlin/jvm/functions/Function1;I)Lc0/f1;

    move-result-object v1

    invoke-virtual {v4, v1}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v1

    move-object v4, v1

    goto :goto_d

    :cond_10
    move-object v4, v7

    :goto_d
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    shr-int/lit8 v5, v0, 0x3

    and-int/lit8 v7, v5, 0xe

    shr-int/lit8 v10, v0, 0xc

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v7, v10

    const-string v10, "AnimatedVisibility"

    invoke-static {v1, v10, v6, v7, v12}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v7, v11, :cond_11

    sget-object v7, Lc0/c;->F:Lc0/c;

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v11, v0, 0x380

    or-int/lit8 v11, v11, 0x30

    and-int/lit16 v12, v0, 0x1c00

    or-int/2addr v11, v12

    const v12, 0xe000

    and-int/2addr v0, v12

    or-int/2addr v0, v11

    const/high16 v11, 0x70000

    and-int/2addr v5, v11

    or-int/2addr v0, v5

    move-object v5, v7

    move v7, v0

    move-object v0, v1

    move-object v1, v5

    move-object v5, v9

    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/b;->h(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v4

    move-object v0, v6

    move-object v6, v10

    move-object v4, v3

    move-object v3, v2

    goto :goto_e

    :cond_12
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, p2

    move-object v0, v6

    move-object v5, v7

    move-object/from16 v6, p5

    :goto_e
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_13

    new-instance v0, Lc0/f0;

    move-object v1, p0

    move v2, p1

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lc0/f0;-><init>(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move/from16 v7, p7

    move-object/from16 v14, p6

    check-cast v14, Lp1/q;

    const v0, -0x5659dfc5

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    move/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->h(Z)Z

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
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, p8, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

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

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/16 v11, 0x4000

    goto :goto_8

    :cond_d
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v0, v11

    :goto_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v7

    move-object/from16 v13, p5

    if-nez v11, :cond_f

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/high16 v11, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v11, 0x10000

    :goto_a
    or-int/2addr v0, v11

    :cond_f
    const v11, 0x12493

    and-int/2addr v11, v0

    const v12, 0x12492

    const/4 v15, 0x0

    if-eq v11, v12, :cond_10

    const/4 v11, 0x1

    goto :goto_b

    :cond_10
    move v11, v15

    :goto_b
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v14, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_16

    if-eqz v2, :cond_11

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v10, v2

    goto :goto_c

    :cond_11
    move-object v10, v3

    :goto_c
    const/16 v2, 0xf

    const/4 v3, 0x3

    const/4 v11, 0x0

    if-eqz v4, :cond_12

    invoke-static {v11, v3}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v4

    invoke-static {v11, v2}, Lc0/w0;->c(Ld0/e2;I)Lc0/d1;

    move-result-object v5

    invoke-virtual {v4, v5}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v4

    goto :goto_d

    :cond_12
    move-object v4, v5

    :goto_d
    if-eqz v6, :cond_13

    invoke-static {v11, v2}, Lc0/w0;->k(Ld0/e2;I)Lc0/f1;

    move-result-object v2

    invoke-static {v11, v3}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v3

    invoke-virtual {v2, v3}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v2

    move-object v12, v2

    goto :goto_e

    :cond_13
    move-object v12, v8

    :goto_e
    if-eqz v9, :cond_14

    const-string v2, "AnimatedVisibility"

    goto :goto_f

    :cond_14
    move-object/from16 v2, p4

    :goto_f
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    and-int/lit8 v5, v0, 0xe

    shr-int/lit8 v6, v0, 0x9

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v5, v6

    invoke-static {v3, v2, v14, v5, v15}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_15

    sget-object v3, Lc0/d;->y:Lc0/d;

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v9, v3

    check-cast v9, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v3, v0, 0x3

    and-int/lit16 v5, v3, 0x380

    or-int/lit8 v5, v5, 0x30

    and-int/lit16 v6, v3, 0x1c00

    or-int/2addr v5, v6

    const v6, 0xe000

    and-int/2addr v3, v6

    or-int/2addr v3, v5

    const/high16 v5, 0x70000

    and-int/2addr v0, v5

    or-int v15, v3, v0

    move-object v11, v4

    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/b;->h(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v2

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    goto :goto_10

    :cond_16
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v5

    move-object v4, v8

    move-object/from16 v5, p4

    :goto_10
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v0, Lc0/d0;

    move-object/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lc0/d0;-><init>(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final g(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move/from16 v7, p7

    move-object/from16 v14, p6

    check-cast v14, Lp1/q;

    const v0, 0xdf36d93

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x30

    move/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    or-int/lit16 v2, v0, 0x180

    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_3

    or-int/lit16 v2, v0, 0xd80

    :cond_2
    move-object/from16 v0, p2

    goto :goto_3

    :cond_3
    and-int/lit16 v0, v7, 0xc00

    if-nez v0, :cond_2

    move-object/from16 v0, p2

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x800

    goto :goto_2

    :cond_4
    const/16 v4, 0x400

    :goto_2
    or-int/2addr v2, v4

    :goto_3
    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x6000

    :cond_5
    move-object/from16 v5, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v7, 0x6000

    if-nez v5, :cond_5

    move-object/from16 v5, p3

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x4000

    goto :goto_4

    :cond_7
    const/16 v6, 0x2000

    :goto_4
    or-int/2addr v2, v6

    :goto_5
    const/high16 v6, 0x30000

    or-int/2addr v2, v6

    const/high16 v6, 0x180000

    and-int/2addr v6, v7

    move-object/from16 v13, p5

    if-nez v6, :cond_9

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/high16 v6, 0x100000

    goto :goto_6

    :cond_8
    const/high16 v6, 0x80000

    :goto_6
    or-int/2addr v2, v6

    :cond_9
    const v6, 0x92491

    and-int/2addr v6, v2

    const v8, 0x92490

    const/4 v9, 0x0

    if-eq v6, v8, :cond_a

    const/4 v6, 0x1

    goto :goto_7

    :cond_a
    move v6, v9

    :goto_7
    and-int/lit8 v8, v2, 0x1

    invoke-virtual {v14, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    const/4 v6, 0x3

    const/4 v8, 0x0

    if-eqz v3, :cond_b

    invoke-static {v8, v6}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v0

    const/16 v3, 0xf

    invoke-static {v8, v8, v3}, Lc0/w0;->a(Ld0/i1;Lb2/k;I)Lc0/d1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v0

    :cond_b
    move-object v11, v0

    if-eqz v4, :cond_c

    invoke-static {v8, v6}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v0

    invoke-static {}, Lc0/w0;->i()Lc0/f1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v0

    move-object v12, v0

    goto :goto_8

    :cond_c
    move-object v12, v5

    :goto_8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    shr-int/lit8 v3, v2, 0x3

    and-int/lit8 v4, v3, 0xe

    shr-int/lit8 v5, v2, 0xc

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v4, v5

    const-string v5, "AnimatedVisibility"

    invoke-static {v0, v5, v14, v4, v9}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v0, v4, :cond_d

    sget-object v0, Lc0/c;->E:Lc0/c;

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v0, v2, 0x380

    or-int/lit8 v0, v0, 0x30

    and-int/lit16 v4, v2, 0x1c00

    or-int/2addr v0, v4

    const v4, 0xe000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v3

    or-int v15, v0, v2

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/b;->h(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    goto :goto_9

    :cond_e
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object v3, v0

    move-object v4, v5

    move-object/from16 v5, p4

    :goto_9
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_f

    new-instance v0, Lc0/e0;

    move-object/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lc0/e0;-><init>(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lx1/b;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final h(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v9, p2

    move/from16 v10, p7

    move-object/from16 v7, p6

    check-cast v7, Lp1/q;

    const v2, 0x65b46798

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v10, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v10

    goto :goto_1

    :cond_1
    move v2, v10

    :goto_1
    and-int/lit8 v4, v10, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v10, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v7, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    :cond_5
    and-int/lit16 v4, v10, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v2, v6

    goto :goto_5

    :cond_7
    move-object/from16 v4, p3

    :goto_5
    and-int/lit16 v6, v10, 0x6000

    if-nez v6, :cond_9

    move-object/from16 v6, p4

    invoke-virtual {v7, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_6

    :cond_8
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v2, v8

    goto :goto_7

    :cond_9
    move-object/from16 v6, p4

    :goto_7
    const/high16 v8, 0x30000

    and-int v11, v10, v8

    if-nez v11, :cond_b

    move-object/from16 v11, p5

    invoke-virtual {v7, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/high16 v12, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v12, 0x10000

    :goto_8
    or-int/2addr v2, v12

    goto :goto_9

    :cond_b
    move-object/from16 v11, p5

    :goto_9
    const v12, 0x12493

    and-int/2addr v12, v2

    const v13, 0x12492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_c

    move v12, v15

    goto :goto_a

    :cond_c
    move v12, v14

    :goto_a
    and-int/lit8 v13, v2, 0x1

    invoke-virtual {v7, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_12

    and-int/lit8 v12, v2, 0x70

    if-ne v12, v5, :cond_d

    move v5, v15

    goto :goto_b

    :cond_d
    move v5, v14

    :goto_b
    and-int/lit8 v13, v2, 0xe

    if-ne v13, v3, :cond_e

    move v14, v15

    :cond_e
    or-int v3, v5, v14

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_f

    if-ne v5, v14, :cond_10

    :cond_f
    new-instance v5, Lc0/h0;

    invoke-direct {v5, v1, v0}, Lc0/h0;-><init>(Lkotlin/jvm/functions/Function1;Ld0/z1;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lkotlin/jvm/functions/Function3;

    invoke-static {v9, v5}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v14, :cond_11

    sget-object v5, Lc0/l;->y:Lc0/l;

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lc93/m;

    or-int/2addr v8, v13

    or-int/2addr v8, v12

    and-int/lit16 v12, v2, 0x1c00

    or-int/2addr v8, v12

    const v12, 0xe000

    and-int/2addr v12, v2

    or-int/2addr v8, v12

    const/high16 v12, 0x1c00000

    shl-int/lit8 v2, v2, 0x6

    and-int/2addr v2, v12

    or-int/2addr v8, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object v6, v11

    invoke-static/range {v0 .. v8}, Landroidx/compose/animation/b;->a(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lc93/m;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_c

    :cond_12
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_13

    new-instance v0, Lc0/c0;

    const/4 v8, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object v3, v9

    move v7, v10

    invoke-direct/range {v0 .. v8}, Lc0/c0;-><init>(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final i(Ld0/z1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lc0/q0;
    .locals 3

    check-cast p3, Lp1/q;

    const v0, -0x192ea059

    invoke-virtual {p3, v0, p0}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-virtual {p0}, Ld0/z1;->g()Z

    move-result v0

    iget-object p0, p0, Ld0/z1;->a:Lal/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const v0, -0xca519e1

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p0, Lc0/q0;->x:Lc0/q0;

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lc0/q0;->y:Lc0/q0;

    goto :goto_1

    :cond_1
    sget-object p0, Lc0/q0;->w:Lc0/q0;

    goto :goto_1

    :cond_2
    const v0, -0xca0eb0c

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lp1/c1;

    invoke-virtual {p0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, Lc0/q0;->x:Lc0/q0;

    goto :goto_0

    :cond_5
    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_6

    sget-object p0, Lc0/q0;->y:Lc0/q0;

    goto :goto_0

    :cond_6
    sget-object p0, Lc0/q0;->w:Lc0/q0;

    :goto_0
    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    :goto_1
    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    return-object p0
.end method
