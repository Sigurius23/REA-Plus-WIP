.class public abstract Lhy0/k2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ak\u0010\u000f\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "enabled",
        "",
        "value",
        "Li93/f;",
        "valueRange",
        "",
        "steps",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onValueChangeFinished",
        "Lkotlin/Function1;",
        "onValueChange",
        "d",
        "(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;ZFLkotlin/jvm/functions/Function1;Li93/f;ILc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lhy0/k2;->e(Landroidx/compose/ui/Modifier;ZFLkotlin/jvm/functions/Function1;Li93/f;ILc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lhy0/k2;->f(Lkotlin/jvm/functions/Function1;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lhy0/k2;->g(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "ZF",
            "Li93/f;",
            "I",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v7, p6

    move/from16 v8, p8

    const-string v0, "onValueChange"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p7

    check-cast v9, Lp1/q;

    const v0, -0x2d0b3a16

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v8, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v8, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v8

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v8

    :goto_1
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_3

    move/from16 v4, p1

    invoke-virtual {v9, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_7

    move/from16 v5, p2

    invoke-virtual {v9, v5}, Lp1/q;->d(F)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_5

    :cond_7
    move/from16 v5, p2

    :goto_5
    and-int/lit16 v6, v8, 0xc00

    if-nez v6, :cond_a

    and-int/lit8 v6, p9, 0x8

    if-nez v6, :cond_8

    move-object/from16 v6, p3

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_6

    :cond_8
    move-object/from16 v6, p3

    :cond_9
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v2, v10

    goto :goto_7

    :cond_a
    move-object/from16 v6, p3

    :goto_7
    and-int/lit8 v10, p9, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v2, v2, 0x6000

    :cond_b
    move/from16 v11, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v8, 0x6000

    if-nez v11, :cond_b

    move/from16 v11, p4

    invoke-virtual {v9, v11}, Lp1/q;->e(I)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_8

    :cond_d
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v2, v12

    :goto_9
    and-int/lit8 v12, p9, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_f

    or-int/2addr v2, v13

    :cond_e
    move-object/from16 v13, p5

    goto :goto_b

    :cond_f
    and-int/2addr v13, v8

    if-nez v13, :cond_e

    move-object/from16 v13, p5

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v2, v14

    :goto_b
    const/high16 v14, 0x180000

    and-int/2addr v14, v8

    if-nez v14, :cond_12

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    const/high16 v14, 0x100000

    goto :goto_c

    :cond_11
    const/high16 v14, 0x80000

    :goto_c
    or-int/2addr v2, v14

    :cond_12
    const v14, 0x92493

    and-int/2addr v14, v2

    const v15, 0x92492

    const/16 v16, 0x0

    const/16 v17, 0x1

    if-eq v14, v15, :cond_13

    move/from16 v14, v17

    goto :goto_d

    :cond_13
    move/from16 v14, v16

    :goto_d
    and-int/lit8 v2, v2, 0x1

    invoke-virtual {v9, v2, v14}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v2, v8, 0x1

    if-eqz v2, :cond_15

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_e

    :cond_14
    invoke-virtual {v9}, Lp1/q;->X()V

    move v2, v4

    move-object v5, v6

    move v6, v11

    move-object v7, v13

    goto :goto_11

    :cond_15
    :goto_e
    if-eqz v0, :cond_16

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_f

    :cond_16
    move-object v0, v1

    :goto_f
    if-eqz v3, :cond_17

    goto :goto_10

    :cond_17
    move/from16 v17, v4

    :goto_10
    and-int/lit8 v1, p9, 0x8

    if-eqz v1, :cond_18

    new-instance v1, Li93/e;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Li93/e;-><init>(FF)V

    move-object v6, v1

    :cond_18
    if-eqz v10, :cond_19

    move/from16 v11, v16

    :cond_19
    if-eqz v12, :cond_1a

    const/4 v1, 0x0

    move-object v7, v1

    move-object v5, v6

    move v6, v11

    move/from16 v2, v17

    move-object v1, v0

    goto :goto_11

    :cond_1a
    move-object v1, v0

    move-object v5, v6

    move v6, v11

    move-object v7, v13

    move/from16 v2, v17

    :goto_11
    invoke-virtual {v9}, Lp1/q;->r()V

    sget-object v0, Lb3/v1;->n:Lp1/u2;

    sget-object v3, Ly3/m;->w:Ly3/m;

    invoke-virtual {v0, v3}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v10

    new-instance v0, Lch0/g;

    move/from16 v3, p2

    move-object/from16 v4, p6

    invoke-direct/range {v0 .. v7}, Lch0/g;-><init>(Landroidx/compose/ui/Modifier;ZFLkotlin/jvm/functions/Function1;Li93/f;ILc93/a;)V

    const v3, -0x723c8556

    invoke-static {v3, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v3, 0x38

    invoke-static {v10, v0, v9, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v5

    move v5, v6

    move-object v6, v7

    goto :goto_12

    :cond_1b
    invoke-virtual {v9}, Lp1/q;->X()V

    move v2, v4

    move-object v4, v6

    move v5, v11

    move-object v6, v13

    :goto_12
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1c

    new-instance v0, Lhy0/j2;

    move/from16 v3, p2

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lhy0/j2;-><init>(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final e(Landroidx/compose/ui/Modifier;ZFLkotlin/jvm/functions/Function1;Li93/f;ILc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    move-object/from16 v0, p3

    and-int/lit8 v1, p8, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p8, 0x1

    move-object/from16 v11, p7

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static/range {p0 .. p1}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "whoop slider"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v2, v11, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    sget-object v6, Lx81/b;->a:Lx81/b;

    invoke-virtual {v6, v11, v3}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v7

    invoke-virtual {v7}, Ly81/a;->a()J

    move-result-wide v7

    invoke-virtual {v2, v11, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->Y0()J

    move-result-wide v9

    invoke-virtual {v2, v11, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    invoke-virtual {v6, v11, v3}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v6

    invoke-virtual {v6}, Ly81/a;->a()J

    move-result-wide v14

    invoke-virtual {v2, v11, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->Y0()J

    move-result-wide v2

    move-object/from16 v23, v11

    move-wide/from16 v26, v12

    move-wide/from16 v28, v14

    move-wide v13, v2

    move-wide v3, v4

    move-wide/from16 v5, v26

    move-wide/from16 v11, v28

    sget-wide v15, Li2/x;->m:J

    const/high16 v24, 0x36d80000

    const/16 v25, 0x0

    move-wide/from16 v17, v15

    move-wide/from16 v19, v15

    move-wide/from16 v21, v15

    invoke-static/range {v3 .. v25}, Lse/b;->v(JJJJJJJJJJLandroidx/compose/runtime/Composer;II)Lg1/w1;

    move-result-object v10

    move-object/from16 v11, v23

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, Lhy0/t0;

    const/4 v2, 0x2

    invoke-direct {v3, v0, v2}, Lhy0/t0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x0

    const/16 v13, 0x80

    move/from16 v6, p1

    move/from16 v3, p2

    move-object/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v9, p6

    move-object v5, v1

    invoke-static/range {v3 .. v13}, Lg1/g6;->b(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLi93/f;ILc93/a;Lg1/w1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    move-object/from16 v23, v11

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;F)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
