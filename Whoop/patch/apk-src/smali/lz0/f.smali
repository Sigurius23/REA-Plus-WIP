.class public abstract Llz0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001aQ\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "currentProgress",
        "totalSteps",
        "Li2/t;",
        "background",
        "Li2/x;",
        "unfilledBackground",
        "",
        "addBorders",
        "Ly3/f;",
        "height",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V",
        "",
        "d",
        "(II)F",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;IILi2/t;JZFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Llz0/f;->c(Landroidx/compose/ui/Modifier;IILi2/t;JZFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V
    .locals 18

    move/from16 v9, p9

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v1, 0x323968f8

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x30

    move/from16 v2, p1

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit16 v3, v9, 0x180

    if-nez v3, :cond_3

    move/from16 v3, p2

    invoke-virtual {v0, v3}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v1, v4

    goto :goto_3

    :cond_3
    move/from16 v3, p2

    :goto_3
    and-int/lit16 v4, v9, 0xc00

    if-nez v4, :cond_6

    and-int/lit8 v4, p10, 0x8

    if-nez v4, :cond_4

    move-object/from16 v4, p3

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x800

    goto :goto_4

    :cond_4
    move-object/from16 v4, p3

    :cond_5
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v1, v5

    goto :goto_5

    :cond_6
    move-object/from16 v4, p3

    :goto_5
    and-int/lit16 v5, v9, 0x6000

    if-nez v5, :cond_9

    and-int/lit8 v5, p10, 0x10

    if-nez v5, :cond_7

    move-wide/from16 v5, p4

    invoke-virtual {v0, v5, v6}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_6

    :cond_7
    move-wide/from16 v5, p4

    :cond_8
    const/16 v7, 0x2000

    :goto_6
    or-int/2addr v1, v7

    goto :goto_7

    :cond_9
    move-wide/from16 v5, p4

    :goto_7
    and-int/lit8 v7, p10, 0x20

    const/high16 v8, 0x30000

    if-eqz v7, :cond_b

    or-int/2addr v1, v8

    :cond_a
    move/from16 v8, p6

    goto :goto_9

    :cond_b
    and-int/2addr v8, v9

    if-nez v8, :cond_a

    move/from16 v8, p6

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_c

    const/high16 v10, 0x20000

    goto :goto_8

    :cond_c
    const/high16 v10, 0x10000

    :goto_8
    or-int/2addr v1, v10

    :goto_9
    and-int/lit8 v10, p10, 0x40

    const/high16 v11, 0x180000

    if-eqz v10, :cond_e

    or-int/2addr v1, v11

    :cond_d
    move/from16 v11, p7

    goto :goto_b

    :cond_e
    and-int/2addr v11, v9

    if-nez v11, :cond_d

    move/from16 v11, p7

    invoke-virtual {v0, v11}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_f

    const/high16 v12, 0x100000

    goto :goto_a

    :cond_f
    const/high16 v12, 0x80000

    :goto_a
    or-int/2addr v1, v12

    :goto_b
    const v12, 0x92491

    and-int/2addr v12, v1

    const v13, 0x92490

    const/4 v15, 0x1

    if-eq v12, v13, :cond_10

    move v12, v15

    goto :goto_c

    :cond_10
    const/4 v12, 0x0

    :goto_c
    and-int/2addr v1, v15

    invoke-virtual {v0, v1, v12}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v9, 0x1

    sget-object v12, Lb2/t;->w:Lb2/t;

    const-wide/high16 v14, 0x4004000000000000L    # 2.5

    const/4 v13, 0x6

    if-eqz v1, :cond_13

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_d

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v1, p0

    :cond_12
    const/4 v10, 0x4

    goto :goto_f

    :cond_13
    :goto_d
    and-int/lit8 v1, p10, 0x1

    if-eqz v1, :cond_14

    move-object v1, v12

    goto :goto_e

    :cond_14
    move-object/from16 v1, p0

    :goto_e
    and-int/lit8 v16, p10, 0x8

    if-eqz v16, :cond_15

    invoke-static {}, Lgb1/b0;->F0()Li2/t;

    move-result-object v4

    :cond_15
    and-int/lit8 v16, p10, 0x10

    if-eqz v16, :cond_16

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v0, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->r()J

    move-result-wide v5

    :cond_16
    if-eqz v7, :cond_17

    const/4 v8, 0x1

    :cond_17
    if-eqz v10, :cond_12

    double-to-float v7, v14

    const/4 v10, 0x4

    int-to-float v11, v10

    mul-float/2addr v7, v11

    move v11, v7

    :goto_f
    invoke-virtual {v0}, Lp1/q;->r()V

    invoke-static/range {p1 .. p2}, Llz0/f;->d(II)F

    move-result v7

    const/4 v13, 0x1

    int-to-float v14, v13

    int-to-float v10, v10

    mul-float/2addr v14, v10

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v0, v13}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object/from16 p0, v1

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    mul-float/2addr v1, v10

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v13, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v5, v6, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-eqz v8, :cond_18

    const v13, -0x59171ad9

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    move-wide/from16 v16, v5

    const-wide/high16 v5, 0x3fd0000000000000L    # 0.25

    double-to-float v5, v5

    mul-float/2addr v5, v10

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v6, v0, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    move/from16 p3, v8

    invoke-virtual {v6}, Ly81/i;->t()J

    move-result-wide v8

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    invoke-static {v12, v5, v8, v9, v1}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    mul-float/2addr v5, v10

    invoke-static {v1, v5, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_18
    move-wide/from16 v16, v5

    move/from16 p3, v8

    const/4 v5, 0x0

    const v1, -0x59133186

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    move-object v1, v12

    :goto_10
    invoke-interface {v2, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v5, v0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-eqz v9, :cond_19

    invoke-virtual {v0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_19
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_11
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_1a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1b

    :cond_1a
    invoke-static {v5, v0, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v1, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v13, 0x6

    invoke-static {v1, v4, v2, v5, v13}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v1, v0, v5}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v13, 0x1

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    move/from16 v7, p3

    move-wide/from16 v5, v16

    :goto_12
    move-object/from16 v1, p0

    move v8, v11

    goto :goto_13

    :cond_1c
    invoke-virtual {v0}, Lp1/q;->X()V

    move v7, v8

    goto :goto_12

    :goto_13
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_1d

    new-instance v0, Llz0/e;

    move/from16 v2, p1

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Llz0/e;-><init>(Landroidx/compose/ui/Modifier;IILi2/t;JZFII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;IILi2/t;JZFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-wide/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d(II)F
    .locals 0

    if-lt p0, p1, :cond_0

    const/high16 p0, 0x3f800000    # 1.0f

    return p0

    :cond_0
    if-gtz p0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    int-to-float p0, p0

    int-to-float p1, p1

    div-float/2addr p0, p1

    return p0
.end method
