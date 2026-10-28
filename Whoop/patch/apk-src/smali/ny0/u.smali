.class public abstract Lny0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001aa\u0010\u0010\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016\u00b2\u0006\u000c\u0010\u0015\u001a\u00020\u00068\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lny0/v;",
        "type",
        "",
        "text",
        "",
        "enabled",
        "Li2/x;",
        "primaryColor",
        "Li2/t;",
        "fillColorOverride",
        "isLoading",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "h",
        "(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "brush",
        "o",
        "(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;",
        "isPressed",
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
.method public static synthetic a(Li2/t;Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0, p1}, Lny0/u;->p(Li2/t;Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lny0/u;->m(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLny0/v;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lny0/u;->k(ZLny0/v;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lny0/u;->j(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lny0/u;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Li2/t;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lny0/u;->q(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Lny0/u;->n(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lny0/v;",
            "Ljava/lang/String;",
            "ZJ",
            "Li2/t;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .annotation runtime Ll83/c;
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v9, p8

    move/from16 v10, p10

    const-string v0, "type"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, 0x40f20617

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v6, v10, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v10, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v10

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v10

    :goto_1
    and-int/lit8 v8, v10, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v0, v8}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v10, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit8 v8, p11, 0x8

    if-eqz v8, :cond_8

    or-int/lit16 v7, v7, 0xc00

    :cond_7
    move/from16 v12, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v12, v10, 0xc00

    if-nez v12, :cond_7

    move/from16 v12, p3

    invoke-virtual {v0, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_9

    const/16 v13, 0x800

    goto :goto_4

    :cond_9
    const/16 v13, 0x400

    :goto_4
    or-int/2addr v7, v13

    :goto_5
    and-int/lit16 v13, v10, 0x6000

    if-nez v13, :cond_c

    and-int/lit8 v13, p11, 0x10

    if-nez v13, :cond_a

    move-wide/from16 v13, p4

    invoke-virtual {v0, v13, v14}, Lp1/q;->f(J)Z

    move-result v15

    if-eqz v15, :cond_b

    const/16 v15, 0x4000

    goto :goto_6

    :cond_a
    move-wide/from16 v13, p4

    :cond_b
    const/16 v15, 0x2000

    :goto_6
    or-int/2addr v7, v15

    goto :goto_7

    :cond_c
    move-wide/from16 v13, p4

    :goto_7
    and-int/lit8 v15, p11, 0x20

    const/high16 v16, 0x30000

    if-eqz v15, :cond_d

    or-int v7, v7, v16

    move-object/from16 v5, p6

    goto :goto_9

    :cond_d
    and-int v16, v10, v16

    move-object/from16 v5, p6

    if-nez v16, :cond_f

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v16, 0x10000

    :goto_8
    or-int v7, v7, v16

    :cond_f
    :goto_9
    and-int/lit8 v16, p11, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_10

    or-int v7, v7, v17

    move/from16 v11, p7

    goto :goto_b

    :cond_10
    and-int v17, v10, v17

    move/from16 v11, p7

    if-nez v17, :cond_12

    invoke-virtual {v0, v11}, Lp1/q;->h(Z)Z

    move-result v18

    if-eqz v18, :cond_11

    const/high16 v18, 0x100000

    goto :goto_a

    :cond_11
    const/high16 v18, 0x80000

    :goto_a
    or-int v7, v7, v18

    :cond_12
    :goto_b
    const/high16 v18, 0xc00000

    and-int v18, v10, v18

    if-nez v18, :cond_14

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x800000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x400000

    :goto_c
    or-int v7, v7, v18

    :cond_14
    const v18, 0x492493

    and-int v4, v7, v18

    move/from16 v18, v1

    const v1, 0x492492

    if-eq v4, v1, :cond_15

    const/4 v1, 0x1

    goto :goto_d

    :cond_15
    const/4 v1, 0x0

    :goto_d
    and-int/lit8 v4, v7, 0x1

    invoke-virtual {v0, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v10, 0x1

    sget-object v4, Lb2/t;->w:Lb2/t;

    const v19, -0xe001

    const/4 v5, 0x6

    if-eqz v1, :cond_18

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_e

    :cond_16
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p11, 0x10

    if-eqz v1, :cond_17

    and-int v7, v7, v19

    :cond_17
    move-object/from16 v1, p6

    move-object/from16 v20, v6

    move/from16 v23, v12

    goto :goto_10

    :cond_18
    :goto_e
    if-eqz v18, :cond_19

    move-object v6, v4

    :cond_19
    if-eqz v8, :cond_1a

    const/4 v12, 0x1

    :cond_1a
    and-int/lit8 v1, p11, 0x10

    if-eqz v1, :cond_1b

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v0, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v13

    and-int v7, v7, v19

    :cond_1b
    if-eqz v15, :cond_1c

    const/4 v1, 0x0

    goto :goto_f

    :cond_1c
    move-object/from16 v1, p6

    :goto_f
    move-object/from16 v20, v6

    move/from16 v23, v12

    if-eqz v16, :cond_1d

    const/4 v11, 0x0

    :cond_1d
    :goto_10
    invoke-virtual {v0}, Lp1/q;->r()V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v6, v8, :cond_1e

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v6

    :cond_1e
    check-cast v6, Lj0/i;

    invoke-static {v6, v0, v5}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v12

    invoke-static {v12}, Lny0/u;->i(Lp1/t2;)Z

    move-result v15

    if-eqz v15, :cond_1f

    const v15, -0x3376eb1f    # -7.1870216E7f

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    move-object/from16 v21, v6

    const/4 v6, 0x0

    invoke-static {v15, v0, v5, v6}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v15

    move-wide v5, v15

    goto :goto_11

    :cond_1f
    move-object/from16 v21, v6

    const/4 v6, 0x0

    const v5, -0x3376e91d    # -7.187433E7f

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    move-wide v5, v13

    :goto_11
    if-eqz v1, :cond_20

    move-object/from16 p0, v1

    move-object/from16 v12, p0

    goto :goto_12

    :cond_20
    invoke-static {v12}, Lny0/u;->i(Lp1/t2;)Z

    move-result v12

    if-eqz v12, :cond_21

    sget-object v24, Li2/t;->b:Li2/s;

    new-instance v12, Li2/x;

    invoke-direct {v12, v13, v14}, Li2/x;-><init>(J)V

    new-instance v15, Li2/x;

    invoke-direct {v15, v13, v14}, Li2/x;-><init>(J)V

    filled-new-array {v12, v15}, [Li2/x;

    move-result-object v12

    invoke-static {v12}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v25

    const-wide/16 v28, 0x0

    const/16 v30, 0xe

    const-wide/16 v26, 0x0

    invoke-static/range {v24 .. v30}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v12

    move-object/from16 p0, v1

    goto :goto_12

    :cond_21
    sget-object v24, Li2/t;->b:Li2/s;

    move-object/from16 p0, v1

    sget-wide v1, Li2/x;->m:J

    new-instance v12, Li2/x;

    invoke-direct {v12, v1, v2}, Li2/x;-><init>(J)V

    new-instance v15, Li2/x;

    invoke-direct {v15, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v12, v15}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v25

    const-wide/16 v28, 0x0

    const/16 v30, 0xe

    const-wide/16 v26, 0x0

    invoke-static/range {v24 .. v30}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v12

    :goto_12
    if-eqz v23, :cond_22

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_13

    :cond_22
    const v1, 0x3e4ccccd    # 0.2f

    :goto_13
    new-instance v2, Li3/i;

    const/4 v15, 0x0

    invoke-direct {v2, v15}, Li3/i;-><init>(I)V

    const/high16 v15, 0x1c00000

    and-int/2addr v7, v15

    const/high16 v15, 0x800000

    if-ne v7, v15, :cond_23

    const/4 v7, 0x1

    goto :goto_14

    :cond_23
    const/4 v7, 0x0

    :goto_14
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v7, :cond_24

    if-ne v15, v8, :cond_25

    :cond_24
    new-instance v15, Le61/e;

    const/4 v7, 0x7

    invoke-direct {v15, v9, v7}, Le61/e;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object/from16 v25, v15

    check-cast v25, Lc93/a;

    const/16 v26, 0x8

    const/16 v22, 0x0

    move-object/from16 v24, v2

    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-eqz p0, :cond_26

    const/4 v15, 0x4

    goto :goto_15

    :cond_26
    const/4 v7, 0x2

    int-to-float v7, v7

    invoke-static {v1, v13, v14}, Li2/x;->c(FJ)J

    move-result-wide v8

    invoke-static {v7, v8, v9}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v7

    const/16 v8, 0x10

    int-to-float v9, v8

    const/4 v15, 0x4

    int-to-float v8, v15

    mul-float/2addr v9, v8

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    iget v9, v7, Lf0/t;->a:F

    iget-object v7, v7, Lf0/t;->b:Li2/t;

    invoke-static {v9, v4, v7, v8}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    :goto_15
    invoke-interface {v2, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v8, 0x10

    int-to-float v4, v8

    int-to-float v7, v15

    mul-float/2addr v4, v7

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v2, v12, v4, v7, v15}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    const/4 v15, 0x0

    invoke-static {v2, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-eqz v9, :cond_27

    invoke-virtual {v0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_27
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_16
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_28

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_29

    :cond_28
    invoke-static {v4, v0, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_29
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lg1/l1;->a:Lp1/b0;

    new-instance v2, Li2/x;

    invoke-direct {v2, v5, v6}, Li2/x;-><init>(J)V

    invoke-virtual {v1, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    new-instance v2, Ljs1/i;

    move-object/from16 v5, p0

    move-object/from16 v4, p1

    invoke-direct {v2, v11, v4, v3, v5}, Ljs1/i;-><init>(ZLny0/v;Ljava/lang/String;Li2/t;)V

    const v6, -0x4058896f

    invoke-static {v6, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v6, 0x38

    invoke-static {v1, v2, v0, v6}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    move-object v7, v5

    move-object/from16 v1, v20

    move/from16 v4, v23

    :goto_17
    move v8, v11

    move-wide v5, v13

    goto :goto_18

    :cond_2a
    move-object v4, v2

    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v7, p6

    move-object v1, v6

    move v4, v12

    goto :goto_17

    :goto_18
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_2b

    new-instance v0, Lny0/t;

    move-object/from16 v2, p1

    move-object/from16 v9, p8

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lny0/t;-><init>(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final i(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final j(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ZLny0/v;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p5, 0x1

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x6

    if-eqz p0, :cond_3

    const v2, 0xdf994a

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    const-string v2, "DateSelectorLottieLoading"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0xc

    int-to-float v2, v2

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v1, v1

    mul-float/2addr v1, v4

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v0, Lgy0/e;->d:I

    invoke-static {v0}, Lv41/r0$d;->b(I)I

    move-result v0

    invoke-static {v0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    new-instance v0, Lma1/a;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Lma1/a;-><init>(I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v9, v0

    check-cast v9, Lc93/a;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_2

    new-instance v0, Lnm1/g;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v10, v0

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const v14, 0x1b0006

    const/16 v15, 0x19c

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v4 .. v15}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_3
    const v2, 0xe61120

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lny0/v;->getPadding()Ll0/k1;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v2, p2

    invoke-virtual {v2, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "toUpperCase(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lny0/v;->getStyle()Lb91/a;

    move-result-object v24

    if-eqz p3, :cond_4

    const v0, 0x73a4759b

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v13, v1, v3}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    :goto_1
    move-wide v6, v0

    goto :goto_2

    :cond_4
    const v0, 0x73a4785c

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    sget-wide v0, Li2/x;->n:J

    goto :goto_1

    :goto_2
    new-instance v0, Lw3/k;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v29, 0x2fdf8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v26, v13

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v26

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move-wide/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brush"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x0

    const v11, 0x7fffb

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x3f7d70a4    # 0.99f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v11}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance v0, Lc51/h;

    const/16 v1, 0x8

    invoke-direct {v0, p1, v1}, Lc51/h;-><init>(Li2/t;I)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Li2/t;Lf2/d;)Lf2/g;
    .locals 2

    const-string v0, "$this$drawWithCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc51/h;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lc51/h;-><init>(Li2/t;I)V

    invoke-virtual {p1, v0}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Li2/t;Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    const/16 v9, 0x9

    const/16 v10, 0x3e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
