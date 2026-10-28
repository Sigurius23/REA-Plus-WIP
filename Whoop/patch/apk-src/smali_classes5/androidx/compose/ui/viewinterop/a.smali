.class public abstract Landroidx/compose/ui/viewinterop/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 13

    move/from16 v4, p4

    sget-object v8, Lb4/c;->E:Lb4/c;

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x6a521d79

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, v4, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v10, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_4
    :goto_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v3, v4, 0x180

    if-nez v3, :cond_7

    invoke-virtual {v10, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_4

    :cond_6
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    :goto_5
    and-int/lit16 v3, v0, 0x93

    const/16 v5, 0x92

    if-eq v3, v5, :cond_8

    const/4 v3, 0x1

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    :goto_6
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v10, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    if-eqz v1, :cond_9

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_9
    move-object v6, p1

    if-eqz v2, :cond_a

    move-object v9, v8

    goto :goto_7

    :cond_a
    move-object v9, p2

    :goto_7
    and-int/lit8 p1, v0, 0xe

    or-int/lit16 p1, p1, 0xc00

    and-int/lit8 p2, v0, 0x70

    or-int/2addr p1, p2

    const p2, 0xe000

    shl-int/lit8 v0, v0, 0x6

    and-int/2addr p2, v0

    or-int v11, p1, p2

    const/4 v12, 0x4

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v12}, Landroidx/compose/ui/viewinterop/a;->b(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v6

    move-object v3, v9

    goto :goto_8

    :cond_b
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, p1

    move-object v3, p2

    :goto_8
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Lpj/n;

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lpj/n;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    const v0, -0xabaf393

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    iget-object v0, v7, Lp1/q;->a:Lhb3/a0;

    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    :cond_3
    and-int/lit8 v8, p7, 0x4

    if-eqz v8, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v9, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_4

    move-object/from16 v9, p2

    invoke-virtual {v7, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x100

    goto :goto_3

    :cond_6
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v3, v10

    :goto_4
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_8

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x800

    goto :goto_5

    :cond_7
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v3, v10

    :cond_8
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_a

    invoke-virtual {v7, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x4000

    goto :goto_6

    :cond_9
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v3, v10

    :cond_a
    and-int/lit16 v10, v3, 0x2493

    const/16 v11, 0x2492

    if-eq v10, v11, :cond_b

    const/4 v10, 0x1

    goto :goto_7

    :cond_b
    const/4 v10, 0x0

    :goto_7
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v7, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_12

    const/4 v10, 0x0

    if-eqz v8, :cond_c

    move-object v9, v10

    :cond_c
    iget-wide v13, v7, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    sget-object v11, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;->w:Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;

    invoke-interface {v2, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;->w:Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;

    invoke-interface {v11, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;->w:Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;

    invoke-interface {v11, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-interface {v11, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v7, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v7, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly3/c;

    sget-object v14, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v7, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly3/m;

    move-object/from16 v16, v10

    move-object v10, v13

    move-object v13, v14

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    sget-object v12, Lj8/c;->a:Lp1/t1;

    invoke-virtual {v7, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/lifecycle/g0;

    sget-object v15, Lqb/a;->a:Lp1/t1;

    invoke-virtual {v7, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lpb/f;

    if-eqz v9, :cond_f

    const v2, 0x4e512e78    # 8.773709E8f

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, v3, 0xe

    invoke-static {v1, v7, v2}, Landroidx/compose/ui/viewinterop/a;->d(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lc93/a;

    move-result-object v2

    instance-of v0, v0, La3/q2;

    if-eqz v0, :cond_e

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-eqz v0, :cond_d

    invoke-virtual {v7, v2}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object v2, v9

    move v9, v8

    move-object v8, v11

    move-object v11, v12

    move-object v12, v15

    const/4 v15, 0x1

    goto :goto_9

    :cond_d
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static/range {v7 .. v14}, Landroidx/compose/ui/viewinterop/a;->e(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILy3/c;Landroidx/lifecycle/g0;Lpb/f;Ly3/m;Lp1/p1;)V

    sget-object v0, Lb4/o;->x:Lb4/o;

    invoke-static {v7, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb4/o;->y:Lb4/o;

    invoke-static {v7, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb4/o;->z:Lb4/o;

    invoke-static {v7, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_e
    invoke-static {}, Lp1/x;->w()V

    throw v16

    :cond_f
    move-object v2, v9

    move v9, v8

    move-object v8, v11

    move-object v11, v12

    move-object v12, v15

    const v15, 0x4e5e438f    # 9.3224237E8f

    invoke-virtual {v7, v15}, Lp1/q;->e0(I)V

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v7, v3}, Landroidx/compose/ui/viewinterop/a;->d(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lc93/a;

    move-result-object v3

    instance-of v0, v0, La3/q2;

    if-eqz v0, :cond_11

    invoke-virtual {v7}, Lp1/q;->c0()V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-eqz v0, :cond_10

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_a
    invoke-static/range {v7 .. v14}, Landroidx/compose/ui/viewinterop/a;->e(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILy3/c;Landroidx/lifecycle/g0;Lpb/f;Ly3/m;Lp1/p1;)V

    sget-object v0, Lb4/o;->E:Lb4/o;

    invoke-static {v7, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb4/o;->F:Lb4/o;

    invoke-static {v7, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v15, 0x1

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_b
    move-object v3, v2

    goto :goto_c

    :cond_11
    invoke-static {}, Lp1/x;->w()V

    throw v16

    :cond_12
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v9

    :goto_c
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_13

    new-instance v0, Lb4/p;

    move-object/from16 v2, p1

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lb4/p;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final c(La3/n0;)Lb4/v;
    .locals 0

    iget-object p0, p0, La3/n0;->N:Lb4/l;

    if-eqz p0, :cond_0

    check-cast p0, Lb4/v;

    return-object p0

    :cond_0
    const-string p0, "Required value was null."

    invoke-static {p0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p0

    throw p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lc93/a;
    .locals 9

    check-cast p1, Lp1/q;

    iget-wide v0, p1, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    invoke-static {p1}, Lp1/x;->E(Landroidx/compose/runtime/Composer;)Lp1/o;

    move-result-object v5

    sget-object v0, Ly1/h;->a:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ly1/f;

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/view/View;

    invoke-virtual {p1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v1, p2, 0xe

    xor-int/lit8 v1, v1, 0x6

    const/4 v2, 0x4

    if-le v1, v2, :cond_0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v2, :cond_2

    :cond_1
    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p2, v0

    invoke-virtual {p1, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    invoke-virtual {p1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    invoke-virtual {p1, v7}, Lp1/q;->e(I)Z

    move-result v0

    or-int/2addr p2, v0

    invoke-virtual {p1, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_3

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_4

    :cond_3
    new-instance v2, Lb4/q;

    move-object v4, p0

    invoke-direct/range {v2 .. v8}, Lb4/q;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lp1/o;Ly1/f;ILandroid/view/View;)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v2

    :cond_4
    check-cast v0, Lc93/a;

    return-object v0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILy3/c;Landroidx/lifecycle/g0;Lpb/f;Ly3/m;Lp1/p1;)V
    .locals 1

    sget-object v0, La3/l;->a:La3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p0, v0, p7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p7, Lb4/o;->G:Lb4/o;

    invoke-static {p0, p7, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, Lb4/o;->H:Lb4/o;

    invoke-static {p0, p1, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, Lb4/o;->I:Lb4/o;

    invoke-static {p0, p1, p4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, Lb4/o;->J:Lb4/o;

    invoke-static {p0, p1, p5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, Lb4/o;->K:Lb4/o;

    invoke-static {p0, p1, p6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->j:La3/i;

    check-cast p0, Lp1/q;

    iget-boolean p3, p0, Lp1/q;->S:Z

    if-nez p3, :cond_1

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-static {p2, p0, p2, p1}, Ld;->y(ILp1/q;ILa3/i;)V

    return-void
.end method
