.class public final Lg1/j6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p6, p0, Lg1/j6;->w:I

    iput-object p1, p0, Lg1/j6;->x:Ljava/lang/Object;

    iput-object p2, p0, Lg1/j6;->y:Ljava/lang/Object;

    iput-object p3, p0, Lg1/j6;->z:Ljava/lang/Object;

    iput-object p4, p0, Lg1/j6;->E:Ljava/lang/Object;

    iput-object p5, p0, Lg1/j6;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Lg1/j6;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v4, v0, Lg1/j6;->E:Ljava/lang/Object;

    check-cast v4, Lc93/a;

    iget-object v5, v0, Lg1/j6;->z:Ljava/lang/Object;

    check-cast v5, Lc93/a;

    iget-object v6, v0, Lg1/j6;->y:Ljava/lang/Object;

    check-cast v6, Lg2/i;

    iget-object v7, v0, Lg1/j6;->x:Ljava/lang/Object;

    check-cast v7, Lo00/a;

    const-string v8, "$this$ScrollableTopLevelColumn"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    new-instance v1, Lay/n;

    iget-object v8, v0, Lg1/j6;->F:Ljava/lang/Object;

    check-cast v8, Lb30/m0;

    const/4 v9, 0x7

    invoke-direct {v1, v8, v9}, Lay/n;-><init>(Ljava/lang/Object;I)V

    const v8, -0x7445f678

    invoke-static {v8, v2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static {v9, v1, v2, v8, v10}, Lg00/a;->a(Ld40/m;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    iget-boolean v1, v7, Lo00/a;->d:Z

    if-eqz v1, :cond_2

    invoke-virtual {v7}, Lo00/a;->b()Z

    move-result v1

    if-nez v1, :cond_2

    const v1, 0x7f141043

    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v9

    :cond_2
    move-object v15, v2

    check-cast v15, Lp1/q;

    const v1, -0x7ffb4e31

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-nez v9, :cond_3

    move-object/from16 v2, v16

    goto :goto_1

    :cond_3
    int-to-float v1, v3

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v1

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v2, v16

    sget-object v8, Lq00/p;->x:Lq00/p;

    const/16 v11, 0x1b0

    invoke-static {v9, v8, v1, v15, v11}, Lse/h;->l(Lzy/c;Lq00/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    const/4 v1, 0x0

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    iget-object v8, v7, Lo00/a;->g:Lzy/c;

    const v9, -0x7ffb31b3

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    if-nez v8, :cond_4

    goto :goto_2

    :cond_4
    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v9, 0x8

    int-to-float v9, v9

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v9

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v8, v15}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v11

    const/16 v16, 0x30

    const/16 v17, 0xc

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v17}, Lkotlin/jvm/internal/j;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ls2/e;Ll0/i;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    int-to-float v3, v3

    const/4 v8, 0x0

    invoke-static {v2, v8, v3, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    iget-object v2, v7, Lo00/a;->c:Lzy/c;

    invoke-static {v2, v15}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v12

    iget-object v2, v7, Lo00/a;->e:Lh20/a;

    if-eqz v2, :cond_6

    iget-boolean v2, v7, Lo00/a;->h:Z

    if-eqz v2, :cond_5

    sget-object v2, Lh00/o0;->z:Lh00/o0;

    :goto_3
    move-object v13, v2

    goto :goto_4

    :cond_5
    sget-object v2, Lh00/o0;->x:Lh00/o0;

    goto :goto_3

    :cond_6
    sget-object v2, Lh00/o0;->y:Lh00/o0;

    goto :goto_3

    :goto_4
    const v2, -0x7ffaf8c3

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_7

    if-ne v3, v7, :cond_8

    :cond_7
    new-instance v3, Li20/b1;

    const/4 v2, 0x3

    invoke-direct {v3, v6, v5, v2}, Li20/b1;-><init>(Lg2/i;Lc93/a;I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v14, v3

    check-cast v14, Lc93/a;

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    const v2, -0x7ffae8c5

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    if-ne v3, v7, :cond_a

    :cond_9
    new-instance v3, Llq2/k;

    const/16 v2, 0x18

    invoke-direct {v3, v4, v2}, Llq2/k;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v16, v3

    check-cast v16, Lc93/a;

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    const/16 v18, 0x6006

    const/16 v19, 0xc0

    move-object/from16 v17, v15

    const/4 v15, 0x1

    invoke-static/range {v11 .. v19}, Lh00/n0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lh00/o0;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lc93/m;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v4, v0, Lg1/j6;->F:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lg1/j6;->E:Ljava/lang/Object;

    check-cast v5, Lg1/w2;

    iget-object v6, v0, Lg1/j6;->x:Ljava/lang/Object;

    check-cast v6, Lg1/l6;

    and-int/lit8 v7, v3, 0x6

    if-nez v7, :cond_c

    move-object v7, v2

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    const/4 v7, 0x4

    goto :goto_6

    :cond_b
    const/4 v7, 0x2

    :goto_6
    or-int/2addr v3, v7

    :cond_c
    and-int/lit8 v7, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v7, v8, :cond_d

    move v7, v9

    goto :goto_7

    :cond_d
    move v7, v10

    :goto_7
    and-int/lit8 v8, v3, 0x1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1f

    iget-object v7, v0, Lg1/j6;->y:Ljava/lang/Object;

    check-cast v7, Lg1/l6;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    const/16 v7, 0x4b

    if-eqz v13, :cond_e

    const/16 v8, 0x96

    goto :goto_8

    :cond_e
    move v8, v7

    :goto_8
    if-eqz v13, :cond_f

    iget-object v11, v0, Lg1/j6;->z:Ljava/lang/Object;

    check-cast v11, Ljava/util/ArrayList;

    invoke-static {v11}, La4/b;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-eq v11, v9, :cond_f

    goto :goto_9

    :cond_f
    move v7, v10

    :goto_9
    sget-object v11, Ld0/b0;->c:Lb23/h;

    new-instance v14, Ld0/e2;

    invoke-direct {v14, v8, v7, v11}, Ld0/e2;-><init>(IILd0/z;)V

    invoke-virtual {v2, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v2, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v11, :cond_10

    if-ne v12, v15, :cond_11

    :cond_10
    new-instance v12, Lf1/w1;

    const/16 v11, 0xa

    invoke-direct {v12, v11, v6, v5}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v12, Lc93/a;

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    const/high16 v17, 0x3f800000    # 1.0f

    if-ne v5, v15, :cond_13

    if-nez v13, :cond_12

    move/from16 v5, v17

    goto :goto_a

    :cond_12
    const/4 v5, 0x0

    :goto_a
    invoke-static {v5}, Ld0/f;->a(F)Ld0/e;

    move-result-object v5

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Ld0/e;

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v2, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v2, v13}, Lp1/q;->h(Z)Z

    move-result v18

    or-int v16, v16, v18

    invoke-virtual {v2, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    or-int v16, v16, v18

    invoke-virtual {v2, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v16, v16, v18

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v16, :cond_14

    if-ne v9, v15, :cond_15

    :cond_14
    move-object v9, v11

    goto :goto_b

    :cond_15
    move-object v12, v11

    move-object v11, v9

    move-object v9, v12

    move-object v12, v5

    move-object v5, v15

    goto :goto_c

    :goto_b
    new-instance v11, La30/u;

    const/16 v16, 0x0

    move-object/from16 v22, v12

    move-object v12, v5

    move-object v5, v15

    move-object/from16 v15, v22

    invoke-direct/range {v11 .. v16}, La30/u;-><init>(Ld0/e;ZLd0/e2;Lc93/a;Lq83/d;)V

    invoke-virtual {v2, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v11, Lc93/m;

    invoke-static {v2, v11, v9}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v9, v12, Ld0/e;->c:Ld0/m;

    sget-object v11, Ld0/b0;->a:Ld0/v;

    new-instance v14, Ld0/e2;

    invoke-direct {v14, v8, v7, v11}, Ld0/e2;-><init>(IILd0/z;)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_17

    if-nez v13, :cond_16

    goto :goto_d

    :cond_16
    const v17, 0x3f4ccccd    # 0.8f

    :goto_d
    invoke-static/range {v17 .. v17}, Ld0/f;->a(F)Ld0/e;

    move-result-object v7

    invoke-virtual {v2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v12, v7

    check-cast v12, Ld0/e;

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v2, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v2, v13}, Lp1/q;->h(Z)Z

    move-result v11

    or-int/2addr v8, v11

    invoke-virtual {v2, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v8, v11

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_18

    if-ne v11, v5, :cond_19

    :cond_18
    new-instance v11, Landroidx/room/y0;

    const/16 v16, 0x2

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v16}, Landroidx/room/y0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V

    invoke-virtual {v2, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v11, Lc93/m;

    invoke-static {v2, v11, v7}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v7, v12, Ld0/e;->c:Ld0/m;

    iget-object v8, v7, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v8}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v15

    iget-object v7, v7, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v16

    iget-object v7, v9, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v17

    const/16 v19, 0x0

    const v20, 0x1fff8

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Landroidx/compose/ui/graphics/a;->b(Landroidx/compose/ui/Modifier;FFFFLi2/a1;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v2, v13}, Lp1/q;->h(Z)Z

    move-result v8

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v2, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_1a

    if-ne v9, v5, :cond_1b

    :cond_1a
    new-instance v9, Lam2/i0;

    const/4 v5, 0x5

    invoke-direct {v9, v13, v4, v6, v5}, Lam2/i0;-><init>(ZLjava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v10, v9}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v2, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-eqz v9, :cond_1c

    invoke-virtual {v2, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1c
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_e
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v2, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v2, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v2, Lp1/q;->S:Z

    if-nez v7, :cond_1d

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    :cond_1d
    invoke-static {v6, v2, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v2, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v3, v3, 0xe

    const/4 v4, 0x1

    invoke-static {v3, v1, v2, v4}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_f

    :cond_1f
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_f
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
