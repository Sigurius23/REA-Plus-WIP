.class public abstract Lg1/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc4/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc4/j0;

    const/4 v1, 0x1

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lc4/j0;-><init>(ZI)V

    sput-object v0, Lg1/f0;->a:Lc4/j0;

    return-void
.end method

.method public static final a(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    move/from16 v9, p9

    move-object/from16 v4, p8

    check-cast v4, Lp1/q;

    const v0, 0x4c05d572    # 3.508372E7f

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    move/from16 v7, p0

    if-nez v0, :cond_1

    invoke-virtual {v4, v7}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v1, v9, 0x30

    if-nez v1, :cond_3

    move-object/from16 v1, p1

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    goto :goto_3

    :cond_3
    move-object/from16 v1, p1

    :goto_3
    and-int/lit8 v3, p10, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v5, v9, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v4, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :goto_5
    and-int/lit8 v6, p10, 0x8

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0xc00

    move-wide/from16 v10, p3

    goto :goto_7

    :cond_7
    and-int/lit16 v8, v9, 0xc00

    move-wide/from16 v10, p3

    if-nez v8, :cond_9

    invoke-virtual {v4, v10, v11}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_6

    :cond_8
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v0, v8

    :cond_9
    :goto_7
    and-int/lit16 v8, v9, 0x6000

    if-nez v8, :cond_c

    and-int/lit8 v8, p10, 0x10

    if-nez v8, :cond_a

    move-object/from16 v8, p5

    invoke-virtual {v4, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_8

    :cond_a
    move-object/from16 v8, p5

    :cond_b
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v0, v12

    goto :goto_9

    :cond_c
    move-object/from16 v8, p5

    :goto_9
    and-int/lit8 v12, p10, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_e

    or-int/2addr v0, v13

    :cond_d
    move-object/from16 v13, p6

    goto :goto_b

    :cond_e
    and-int/2addr v13, v9

    if-nez v13, :cond_d

    move-object/from16 v13, p6

    invoke-virtual {v4, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v0, v14

    :goto_b
    const/high16 v14, 0x180000

    and-int/2addr v14, v9

    if-nez v14, :cond_11

    move-object/from16 v14, p7

    invoke-virtual {v4, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_10
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v0, v15

    goto :goto_d

    :cond_11
    move-object/from16 v14, p7

    :goto_d
    const v15, 0x92493

    and-int/2addr v15, v0

    const/16 p8, 0x20

    const v2, 0x92492

    move/from16 v16, v6

    const/4 v6, 0x1

    if-eq v15, v2, :cond_12

    move v2, v6

    goto :goto_e

    :cond_12
    const/4 v2, 0x0

    :goto_e
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v4, v15, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v2, v9, 0x1

    const v15, -0xe001

    if-eqz v2, :cond_15

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_f

    :cond_13
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int/lit8 v2, p10, 0x10

    if-eqz v2, :cond_14

    and-int/2addr v0, v15

    :cond_14
    move-object/from16 v19, v5

    move-object/from16 v18, v8

    move-object v2, v13

    goto :goto_10

    :cond_15
    :goto_f
    if-eqz v3, :cond_16

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v5, v2

    :cond_16
    if-eqz v16, :cond_17

    const/4 v2, 0x0

    int-to-float v3, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v10, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v10, v10, p8

    const-wide v16, 0xffffffffL

    and-long v2, v2, v16

    or-long/2addr v2, v10

    move-wide v10, v2

    :cond_17
    and-int/lit8 v2, p10, 0x10

    if-eqz v2, :cond_18

    const/4 v2, 0x0

    invoke-static {v2, v4, v6}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v3

    and-int/2addr v0, v15

    move-object v8, v3

    :cond_18
    if-eqz v12, :cond_14

    sget-object v2, Lg1/f0;->a:Lc4/j0;

    move-object/from16 v19, v5

    move-object/from16 v18, v8

    :goto_10
    invoke-virtual {v4}, Lp1/q;->r()V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_19

    new-instance v3, Ld0/q0;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v3, v6}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Ld0/q0;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v3, v6}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    iget-object v6, v3, Ld0/q0;->y:Lp1/k1;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_1a

    iget-object v6, v3, Ld0/q0;->z:Lp1/k1;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_1b

    :cond_1a
    const/4 v6, 0x0

    goto :goto_11

    :cond_1b
    const v0, -0x250b1030

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_11
    const v8, -0x25172cea

    invoke-virtual {v4, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v5, :cond_1c

    sget-wide v12, Li2/e1;->b:J

    new-instance v8, Li2/e1;

    invoke-direct {v8, v12, v13}, Li2/e1;-><init>(J)V

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v8, Lp1/c1;

    sget-object v12, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v4, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly3/c;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v5, :cond_1d

    new-instance v13, Lcom/whoop/profile/view/edit/c;

    const/4 v5, 0x4

    invoke-direct {v13, v5, v8}, Lcom/whoop/profile/view/edit/c;-><init>(ILp1/c1;)V

    invoke-virtual {v4, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v13, Lc93/m;

    move v5, v0

    new-instance v0, Lg1/s2;

    invoke-direct {v0, v10, v11, v12, v13}, Lg1/s2;-><init>(JLy3/c;Lc93/m;)V

    new-instance v15, Lg1/e0;

    const/16 v21, 0x0

    move-object/from16 v16, v3

    move-object/from16 v17, v8

    move-object/from16 v20, v14

    invoke-direct/range {v15 .. v21}, Lg1/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, 0x6a9e70ab

    invoke-static {v3, v4, v15}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    and-int/lit8 v8, v5, 0x70

    or-int/lit16 v8, v8, 0xc00

    shr-int/lit8 v5, v5, 0x9

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v5, v8

    move/from16 v22, v6

    const/4 v6, 0x0

    move/from16 v8, v22

    invoke-static/range {v0 .. v6}, Lc4/r;->a(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    :goto_12
    move-object v7, v2

    move-object/from16 v6, v18

    move-object/from16 v3, v19

    :goto_13
    move-object v0, v4

    move-wide v4, v10

    goto :goto_14

    :cond_1e
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v3, v5

    move-object v6, v8

    move-object v7, v13

    goto :goto_13

    :goto_14
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_1f

    new-instance v0, Lg1/d0;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v8, p7

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lg1/d0;-><init>(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method public static final b(Lc93/a;Landroidx/compose/ui/Modifier;ZLl0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 9

    check-cast p5, Lp1/q;

    const v0, 0x27f7a2e1

    invoke-virtual {p5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p6

    goto :goto_1

    :cond_1
    move v0, p6

    :goto_1
    or-int/lit16 v1, v0, 0x1b0

    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_2

    or-int/lit16 v1, v0, 0xdb0

    goto :goto_3

    :cond_2
    and-int/lit16 v0, p6, 0xc00

    if-nez v0, :cond_4

    invoke-virtual {p5, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x800

    goto :goto_2

    :cond_3
    const/16 v0, 0x400

    :goto_2
    or-int/2addr v1, v0

    :cond_4
    :goto_3
    or-int/lit16 v0, v1, 0x6000

    const v1, 0x12493

    and-int/2addr v1, v0

    const v3, 0x12492

    const/4 v4, 0x1

    if-eq v1, v3, :cond_5

    move v1, v4

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p5, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz v2, :cond_6

    sget-object p3, Lg1/n3;->a:Ll0/l1;

    :cond_6
    const p1, 0x7fffe

    and-int/2addr p1, v0

    invoke-static {p0, p3, p4, p5, p1}, Lg1/o3;->b(Lc93/a;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    move v3, v4

    :goto_5
    move-object v2, p1

    move-object v4, p3

    goto :goto_6

    :cond_7
    invoke-virtual {p5}, Lp1/q;->X()V

    move v3, p2

    goto :goto_5

    :goto_6
    invoke-virtual {p5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lbf0/g;

    const/16 v8, 0x8

    move-object v1, p0

    move-object v5, p4

    move v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ll83/e;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method
