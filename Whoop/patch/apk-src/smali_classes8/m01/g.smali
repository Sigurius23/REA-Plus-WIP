.class public abstract Lm01/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm01/g$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a[\u0010\u000f\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "originX",
        "originY",
        "",
        "Li2/x;",
        "colors",
        "",
        "particleCount",
        "",
        "trigger",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onComplete",
        "d",
        "(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/util/List;Ljava/util/List;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lm01/g;->f(Ljava/util/List;Ljava/util/List;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lm01/g;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lm01/g;->g(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "FF",
            "Ljava/util/List<",
            "Li2/x;",
            ">;IZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move/from16 v8, p8

    const-string v0, "colors"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, 0x40b9fa3d

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v5, v8, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v8, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v8

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v8

    :goto_1
    and-int/lit8 v7, v8, 0x30

    move/from16 v11, p1

    if-nez v7, :cond_4

    invoke-virtual {v0, v11}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v8, 0x180

    move/from16 v12, p2

    if-nez v7, :cond_6

    invoke-virtual {v0, v12}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v8, 0xc00

    if-nez v7, :cond_8

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x800

    goto :goto_4

    :cond_7
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v6, v7

    :cond_8
    and-int/lit8 v7, p9, 0x10

    if-eqz v7, :cond_a

    or-int/lit16 v6, v6, 0x6000

    :cond_9
    move/from16 v13, p4

    goto :goto_6

    :cond_a
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_9

    move/from16 v13, p4

    invoke-virtual {v0, v13}, Lp1/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x4000

    goto :goto_5

    :cond_b
    const/16 v14, 0x2000

    :goto_5
    or-int/2addr v6, v14

    :goto_6
    and-int/lit8 v14, p9, 0x20

    const/high16 v16, 0x30000

    if-eqz v14, :cond_c

    or-int v6, v6, v16

    move/from16 v15, p5

    goto :goto_8

    :cond_c
    and-int v16, v8, v16

    move/from16 v15, p5

    if-nez v16, :cond_e

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v16, 0x10000

    :goto_7
    or-int v6, v6, v16

    :cond_e
    :goto_8
    and-int/lit8 v16, p9, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_f

    or-int v6, v6, v17

    move-object/from16 v2, p6

    goto :goto_a

    :cond_f
    and-int v17, v8, v17

    move-object/from16 v2, p6

    if-nez v17, :cond_11

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x100000

    goto :goto_9

    :cond_10
    const/high16 v17, 0x80000

    :goto_9
    or-int v6, v6, v17

    :cond_11
    :goto_a
    const v17, 0x92493

    and-int v3, v6, v17

    const v10, 0x92492

    if-eq v3, v10, :cond_12

    const/4 v3, 0x1

    goto :goto_b

    :cond_12
    const/4 v3, 0x0

    :goto_b
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v0, v10, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_2e

    if-eqz v1, :cond_13

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_c

    :cond_13
    move-object v1, v5

    :goto_c
    if-eqz v7, :cond_14

    const/16 v3, 0x5a

    goto :goto_d

    :cond_14
    move v3, v13

    :goto_d
    if-eqz v14, :cond_15

    const/16 v25, 0x0

    goto :goto_e

    :cond_15
    move/from16 v25, v15

    :goto_e
    const/4 v5, 0x6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v16, :cond_17

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_16

    new-instance v2, Llt2/a;

    invoke-direct {v2, v5}, Llt2/a;-><init>(I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v2, Lc93/a;

    :cond_17
    move-object/from16 v28, v2

    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    and-int/lit8 v10, v6, 0x70

    const/16 v13, 0x20

    if-ne v10, v13, :cond_18

    const/4 v10, 0x1

    goto :goto_f

    :cond_18
    const/4 v10, 0x0

    :goto_f
    and-int/lit16 v13, v6, 0x380

    const/16 v14, 0x100

    if-ne v13, v14, :cond_19

    const/4 v13, 0x1

    goto :goto_10

    :cond_19
    const/4 v13, 0x0

    :goto_10
    or-int/2addr v10, v13

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_1b

    if-ne v13, v7, :cond_1a

    goto :goto_11

    :cond_1a
    move/from16 v30, v3

    const/high16 v4, 0x20000

    const/16 v24, 0x1

    goto/16 :goto_16

    :cond_1b
    :goto_11
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v13, 0x0

    :goto_12
    if-ge v13, v3, :cond_24

    sget-object v14, Lg93/d;->w:Lg93/c;

    sget-object v14, Lg93/d;->x:Lg93/a;

    move-object/from16 p0, v10

    const-wide v9, 0x401921fb54442d18L    # 6.283185307179586

    invoke-virtual {v14, v9, v10}, Lg93/d;->d(D)D

    move-result-wide v9

    invoke-virtual {v14}, Lg93/a;->e()F

    move-result v15

    const v16, 0x3e99999a    # 0.3f

    cmpg-float v16, v15, v16

    const/high16 v17, 0x43c80000    # 400.0f

    if-gez v16, :cond_1c

    invoke-virtual {v14}, Lg93/a;->e()F

    move-result v15

    const/high16 v16, 0x43960000    # 300.0f

    mul-float v15, v15, v16

    add-float v15, v15, v17

    goto :goto_14

    :cond_1c
    const v16, 0x3f333333    # 0.7f

    cmpg-float v15, v15, v16

    if-gez v15, :cond_1d

    invoke-virtual {v14}, Lg93/a;->e()F

    move-result v15

    mul-float v15, v15, v17

    const/high16 v16, 0x44160000    # 600.0f

    :goto_13
    add-float v15, v15, v16

    goto :goto_14

    :cond_1d
    invoke-virtual {v14}, Lg93/a;->e()F

    move-result v15

    const/high16 v16, 0x43fa0000    # 500.0f

    mul-float v15, v15, v16

    const/high16 v16, 0x44480000    # 800.0f

    goto :goto_13

    :goto_14
    invoke-virtual {v14}, Lg93/a;->e()F

    move-result v16

    const v17, 0x3f4ccccd    # 0.8f

    mul-float v16, v16, v17

    const v18, 0x3f19999a    # 0.6f

    add-float v5, v16, v18

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v19

    move/from16 v30, v3

    float-to-double v3, v15

    mul-double v19, v19, v3

    move-wide v15, v3

    float-to-double v3, v5

    move-wide/from16 v21, v3

    mul-double v3, v19, v21

    double-to-float v3, v3

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v4, v15

    mul-double v4, v4, v21

    double-to-float v4, v4

    invoke-static {}, Lm01/i;->getEntries()Lt83/a;

    move-result-object v5

    const/4 v9, 0x0

    new-array v10, v9, [Lm01/i;

    invoke-interface {v5, v10}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    const-string v9, "<this>"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v9, v5

    if-eqz v9, :cond_23

    array-length v9, v5

    invoke-virtual {v14, v9}, Lg93/a;->g(I)I

    move-result v9

    aget-object v5, v5, v9

    move-object/from16 v21, v5

    check-cast v21, Lm01/i;

    const/16 v5, 0xc

    const/4 v9, 0x6

    invoke-virtual {v14, v9, v5}, Lg93/d;->h(II)I

    move-result v5

    int-to-float v5, v5

    invoke-interface {v2, v5}, Ly3/c;->q0(F)F

    move-result v5

    sget-object v10, Lm01/g$b;->a:[I

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aget v10, v10, v15

    const/4 v15, 0x1

    if-eq v10, v15, :cond_22

    const/4 v9, 0x2

    if-eq v10, v9, :cond_21

    const/4 v9, 0x3

    if-eq v10, v9, :cond_20

    const/4 v9, 0x4

    if-eq v10, v9, :cond_1f

    const/4 v9, 0x5

    if-ne v10, v9, :cond_1e

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const v10, 0x3fa66666    # 1.3f

    mul-float/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    new-instance v10, Ll83/k;

    invoke-direct {v10, v9, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_1e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1f
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    new-instance v10, Ll83/k;

    invoke-direct {v10, v9, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_20
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    new-instance v10, Ll83/k;

    invoke-direct {v10, v9, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_21
    mul-float v18, v18, v5

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const v10, 0x400ccccd    # 2.2f

    mul-float/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    new-instance v10, Ll83/k;

    invoke-direct {v10, v9, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_22
    invoke-virtual {v14}, Lg93/a;->e()F

    move-result v9

    mul-float/2addr v9, v5

    const/high16 v10, 0x3f000000    # 0.5f

    mul-float/2addr v9, v10

    add-float/2addr v9, v10

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const v10, 0x3fe66666    # 1.8f

    mul-float/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    new-instance v10, Ll83/k;

    invoke-direct {v10, v9, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_15
    iget-object v5, v10, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v19

    iget-object v5, v10, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v20

    new-instance v10, Lm01/h;

    move-object/from16 v5, p3

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lm83/s;->i1(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    move-object/from16 p5, v2

    move v9, v3

    iget-wide v2, v5, Li2/x;->a:J

    invoke-virtual {v14}, Lg93/a;->e()F

    move-result v5

    const/high16 v16, 0x43b40000    # 360.0f

    mul-float v5, v5, v16

    invoke-virtual {v14}, Lg93/a;->e()F

    move-result v18

    const/high16 v22, 0x44340000    # 720.0f

    mul-float v18, v18, v22

    sub-float v18, v18, v16

    invoke-virtual {v14}, Lg93/a;->e()F

    move-result v14

    const v16, 0x3e19999a    # 0.15f

    mul-float v14, v14, v16

    add-float v22, v14, v17

    const/16 v23, 0x0

    move v14, v4

    move/from16 v17, v5

    move/from16 v24, v15

    const/high16 v4, 0x20000

    move-wide v15, v2

    move v3, v13

    move-object/from16 v2, p0

    move v13, v9

    invoke-direct/range {v10 .. v23}, Lm01/h;-><init>(FFFFJFFFFLm01/i;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v3, 0x1

    move/from16 v11, p1

    move/from16 v12, p2

    move-object/from16 v4, p3

    move-object v10, v2

    move/from16 v3, v30

    const/4 v5, 0x6

    move-object/from16 v2, p5

    goto/16 :goto_12

    :cond_23
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Array is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    move/from16 v30, v3

    move-object v2, v10

    const/high16 v4, 0x20000

    const/16 v24, 0x1

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v13, v2

    :goto_16
    check-cast v13, Ljava/util/List;

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_25

    if-ne v3, v7, :cond_27

    :cond_25
    move-object v2, v13

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_26

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm01/h;

    const/4 v5, 0x0

    invoke-static {v5}, Ld0/f;->a(F)Ld0/e;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_26
    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v3, Ljava/util/List;

    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/high16 v5, 0x70000

    and-int/2addr v5, v6

    if-ne v5, v4, :cond_28

    move/from16 v9, v24

    goto :goto_18

    :cond_28
    const/4 v9, 0x0

    :goto_18
    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v9

    const/high16 v5, 0x380000

    and-int/2addr v5, v6

    const/high16 v6, 0x100000

    if-ne v5, v6, :cond_29

    move/from16 v9, v24

    goto :goto_19

    :cond_29
    const/4 v9, 0x0

    :goto_19
    or-int/2addr v4, v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_2a

    if-ne v5, v7, :cond_2b

    :cond_2a
    new-instance v24, Lm01/g$a;

    const/16 v29, 0x0

    const/16 v27, 0x9c4

    move-object/from16 v26, v3

    invoke-direct/range {v24 .. v29}, Lm01/g$a;-><init>(ZLjava/util/List;ILc93/a;Lq83/d;)V

    move-object/from16 v5, v24

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v5, Lc93/m;

    invoke-static {v0, v5, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v4, "ConfettiEffect"

    invoke-static {v2, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_2d

    if-ne v5, v7, :cond_2c

    goto :goto_1a

    :cond_2c
    const/4 v9, 0x0

    goto :goto_1b

    :cond_2d
    :goto_1a
    new-instance v5, Lm01/e;

    const/4 v9, 0x0

    invoke-direct {v5, v9, v13, v3}, Lm01/e;-><init>(ILjava/util/List;Ljava/util/List;)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v5, v0, v9}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move/from16 v6, v25

    move-object/from16 v7, v28

    move/from16 v5, v30

    goto :goto_1c

    :cond_2e
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v7, v2

    move-object v1, v5

    move v5, v13

    move v6, v15

    :goto_1c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_2f

    new-instance v0, Lm01/f;

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lm01/f;-><init>(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Ljava/util/List;Ljava/util/List;Lk2/e;)Ll83/a0;
    .locals 24

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v13, v2, 0x1

    if-ltz v2, :cond_7

    check-cast v3, Lm01/h;

    move-object/from16 v14, p1

    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld0/e;

    invoke-virtual {v2}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v4, 0x0

    cmpl-float v4, v2, v4

    if-lez v4, :cond_6

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v2

    const/high16 v5, -0x41000000    # -0.5f

    mul-float/2addr v5, v4

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->exp(D)D

    move-result-wide v5

    double-to-float v5, v5

    invoke-virtual {v3}, Lm01/h;->g()F

    move-result v6

    invoke-virtual {v3}, Lm01/h;->i()F

    move-result v7

    const/high16 v8, 0x3f000000    # 0.5f

    div-float/2addr v7, v8

    const/4 v9, 0x1

    int-to-float v10, v9

    sub-float/2addr v10, v5

    mul-float/2addr v7, v10

    add-float/2addr v7, v6

    invoke-virtual {v3}, Lm01/h;->h()F

    move-result v5

    invoke-virtual {v3}, Lm01/h;->j()F

    move-result v6

    const/high16 v11, 0x44e10000    # 1800.0f

    sub-float/2addr v6, v11

    div-float/2addr v6, v8

    mul-float/2addr v6, v10

    add-float/2addr v6, v5

    mul-float/2addr v11, v4

    add-float/2addr v11, v6

    const/high16 v4, 0x3f400000    # 0.75f

    cmpg-float v5, v2, v4

    const/high16 v6, 0x3f800000    # 1.0f

    if-gez v5, :cond_0

    goto :goto_1

    :cond_0
    sub-float/2addr v2, v4

    const/high16 v4, 0x3e800000    # 0.25f

    div-float/2addr v2, v4

    sub-float/2addr v6, v2

    :goto_1
    invoke-virtual {v3}, Lm01/h;->a()F

    move-result v2

    mul-float/2addr v2, v6

    invoke-virtual {v3}, Lm01/h;->d()F

    move-result v4

    invoke-virtual {v3}, Lm01/h;->e()F

    move-result v5

    div-float/2addr v5, v8

    mul-float/2addr v5, v10

    add-float/2addr v5, v4

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v9, v4

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    move-object v15, v0

    int-to-long v0, v4

    const/16 v4, 0x20

    shl-long v8, v9, v4

    const-wide v16, 0xffffffffL

    and-long v0, v0, v16

    or-long/2addr v0, v8

    invoke-interface/range {p2 .. p2}, Lk2/e;->t0()La3/p;

    move-result-object v12

    invoke-virtual {v12}, La3/p;->A()J

    move-result-wide v8

    invoke-virtual {v12}, La3/p;->w()Li2/v;

    move-result-object v6

    invoke-interface {v6}, Li2/v;->q()V

    :try_start_0
    iget-object v6, v12, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Laj/d;

    invoke-virtual {v6, v5, v0, v1}, Laj/d;->v(FJ)V

    invoke-virtual {v3}, Lm01/h;->f()Lm01/i;

    move-result-object v0

    sget-object v1, Lm01/g$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    const/4 v1, 0x2

    const/4 v5, 0x1

    if-eq v0, v5, :cond_5

    if-eq v0, v1, :cond_4

    const/4 v5, 0x3

    if-eq v0, v5, :cond_3

    const/4 v5, 0x4

    if-eq v0, v5, :cond_2

    const/4 v5, 0x5

    if-ne v0, v5, :cond_1

    :try_start_1
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    move/from16 p0, v4

    move-wide/from16 v18, v5

    int-to-long v4, v0

    shl-long v18, v18, p0

    and-long v4, v4, v16

    or-long v4, v18, v4

    invoke-interface/range {p2 .. p2}, Lk2/e;->t0()La3/p;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move-wide/from16 v18, v8

    :try_start_2
    invoke-virtual {v6}, La3/p;->A()J

    move-result-wide v8

    invoke-virtual {v6}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    iget-object v0, v6, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    const/high16 v10, 0x42340000    # 45.0f

    invoke-virtual {v0, v10, v4, v5}, Laj/d;->v(FJ)V

    invoke-virtual {v3}, Lm01/h;->b()J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    sub-float/2addr v7, v0

    invoke-virtual {v3}, Lm01/h;->c()F

    move-result v0

    div-float/2addr v0, v1

    sub-float/2addr v11, v0

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v10, v2

    shl-long v0, v0, p0

    and-long v10, v10, v16

    or-long/2addr v0, v10

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v2

    invoke-virtual {v3}, Lm01/h;->c()F

    move-result v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v10, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    int-to-long v2, v2

    shl-long v10, v10, p0

    and-long v2, v2, v16

    or-long/2addr v2, v10

    const/4 v10, 0x0

    const/16 v11, 0x78

    move-wide/from16 v16, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 p0, v6

    move-wide/from16 v20, v18

    move-wide v6, v2

    move-wide v2, v4

    move-object/from16 v18, v12

    move-wide v4, v0

    move v0, v13

    move-wide/from16 v12, v16

    move-object/from16 v1, p2

    :try_start_4
    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual/range {p0 .. p0}, La3/p;->w()Li2/v;

    move-result-object v1

    invoke-interface {v1}, Li2/v;->g()V

    move-object/from16 v1, p0

    invoke-virtual {v1, v12, v13}, La3/p;->U(J)V

    :goto_2
    move-object/from16 v13, v18

    :goto_3
    move-wide/from16 v1, v20

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    :goto_4
    move-object/from16 v13, v18

    :goto_5
    move-wide/from16 v1, v20

    goto/16 :goto_9

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v1, v6

    move-wide/from16 v20, v18

    move-object/from16 v18, v12

    move-wide v12, v8

    :goto_6
    invoke-virtual {v1}, La3/p;->w()Li2/v;

    move-result-object v2

    invoke-interface {v2}, Li2/v;->g()V

    invoke-virtual {v1, v12, v13}, La3/p;->U(J)V

    throw v0

    :catchall_3
    move-exception v0

    move-wide/from16 v20, v18

    :goto_7
    move-object/from16 v18, v12

    goto :goto_4

    :catchall_4
    move-exception v0

    move-wide/from16 v20, v8

    goto :goto_7

    :cond_1
    move-wide/from16 v20, v8

    move-object/from16 v18, v12

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    move/from16 p0, v4

    move-wide/from16 v20, v8

    move-object/from16 v18, v12

    move v0, v13

    invoke-virtual {v3}, Lm01/h;->b()J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v6, v1

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v8, v1

    shl-long v6, v6, p0

    and-long v8, v8, v16

    or-long/2addr v6, v8

    const/4 v8, 0x0

    const/16 v9, 0x78

    move-wide/from16 v22, v4

    move v4, v2

    move-wide/from16 v2, v22

    move-wide v5, v6

    const/4 v7, 0x0

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v9}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    goto :goto_2

    :cond_3
    move/from16 p0, v4

    move-wide/from16 v20, v8

    move-object/from16 v18, v12

    move v0, v13

    invoke-virtual {v3}, Lm01/h;->b()J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    sub-float/2addr v7, v2

    invoke-virtual {v3}, Lm01/h;->c()F

    move-result v2

    div-float/2addr v2, v1

    sub-float/2addr v11, v2

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    shl-long v1, v1, p0

    and-long v6, v6, v16

    or-long/2addr v1, v6

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v6

    invoke-virtual {v3}, Lm01/h;->c()F

    move-result v3

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v8, v3

    shl-long v6, v6, p0

    and-long v8, v8, v16

    or-long/2addr v6, v8

    const/4 v10, 0x0

    const/16 v11, 0x78

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide/from16 v22, v4

    move-wide v4, v1

    move-wide/from16 v2, v22

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    goto/16 :goto_2

    :cond_4
    move/from16 p0, v4

    move-wide/from16 v20, v8

    move-object/from16 v18, v12

    move v0, v13

    invoke-virtual {v3}, Lm01/h;->b()J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    sub-float/2addr v7, v2

    invoke-virtual {v3}, Lm01/h;->c()F

    move-result v2

    div-float/2addr v2, v1

    sub-float/2addr v11, v2

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v6, v2

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v8, v2

    shl-long v6, v6, p0

    and-long v8, v8, v16

    or-long/2addr v6, v8

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v2

    invoke-virtual {v3}, Lm01/h;->c()F

    move-result v8

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v9, v2

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v11, v2

    shl-long v8, v9, p0

    and-long v10, v11, v16

    or-long/2addr v8, v10

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v2

    div-float/2addr v2, v1

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v3

    div-float/2addr v3, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    int-to-long v10, v3

    shl-long v1, v1, p0

    and-long v10, v10, v16

    or-long/2addr v1, v10

    const/4 v11, 0x0

    const/16 v12, 0xf0

    const/4 v10, 0x0

    move-wide/from16 v22, v8

    move-wide v8, v1

    move-wide v2, v4

    move-wide v4, v6

    move-wide/from16 v6, v22

    move-object/from16 v1, p2

    move-object/from16 v13, v18

    :try_start_6
    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    goto/16 :goto_3

    :catchall_5
    move-exception v0

    goto/16 :goto_5

    :cond_5
    move/from16 p0, v4

    move-wide/from16 v20, v8

    move v0, v13

    move-object v13, v12

    invoke-virtual {v3}, Lm01/h;->b()J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    sub-float/2addr v7, v2

    invoke-virtual {v3}, Lm01/h;->c()F

    move-result v2

    div-float/2addr v2, v1

    sub-float/2addr v11, v2

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    shl-long v1, v1, p0

    and-long v6, v6, v16

    or-long/2addr v1, v6

    invoke-virtual {v3}, Lm01/h;->k()F

    move-result v6

    invoke-virtual {v3}, Lm01/h;->c()F

    move-result v3

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v8, v3

    shl-long v6, v6, p0

    and-long v8, v8, v16

    or-long/2addr v6, v8

    const/4 v10, 0x0

    const/16 v11, 0x78

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide/from16 v22, v4

    move-wide v4, v1

    move-wide/from16 v2, v22

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto/16 :goto_3

    :goto_8
    invoke-static {v13, v1, v2}, Ld;->z(La3/p;J)V

    goto :goto_a

    :catchall_6
    move-exception v0

    move-wide v1, v8

    move-object v13, v12

    :goto_9
    invoke-static {v13, v1, v2}, Ld;->z(La3/p;J)V

    throw v0

    :cond_6
    move-object v15, v0

    move v0, v13

    :goto_a
    move-object/from16 v1, p2

    move v2, v0

    move-object v0, v15

    goto/16 :goto_0

    :cond_7
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lm01/g;->d(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
