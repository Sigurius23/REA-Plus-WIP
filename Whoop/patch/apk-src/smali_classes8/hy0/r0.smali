.class public abstract Lhy0/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ln2/a;",
        "painter",
        "",
        "revealStartRatio",
        "Ly3/f;",
        "blurRadius",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly2/k;",
        "contentScale",
        "Ll83/a0;",
        "c",
        "(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(FLk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lhy0/r0;->d(FLk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lhy0/r0;->e(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v10, p1

    move/from16 v11, p2

    move/from16 v12, p6

    const-string v1, "painter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    const v1, 0xd103541

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v12, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

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

    invoke-virtual {v7, v10}, Lp1/q;->d(F)Z

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

    invoke-virtual {v7, v11}, Lp1/q;->d(F)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_7

    or-int/lit16 v1, v1, 0xc00

    :cond_6
    move-object/from16 v3, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v3, v12, 0xc00

    if-nez v3, :cond_6

    move-object/from16 v3, p3

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x800

    goto :goto_4

    :cond_8
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v1, v4

    :goto_5
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_a

    or-int/lit16 v1, v1, 0x6000

    :cond_9
    move-object/from16 v5, p4

    :goto_6
    move v14, v1

    goto :goto_8

    :cond_a
    and-int/lit16 v5, v12, 0x6000

    if-nez v5, :cond_9

    move-object/from16 v5, p4

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v6, 0x4000

    goto :goto_7

    :cond_b
    const/16 v6, 0x2000

    :goto_7
    or-int/2addr v1, v6

    goto :goto_6

    :goto_8
    and-int/lit16 v1, v14, 0x2493

    const/16 v6, 0x2492

    const/4 v15, 0x0

    if-eq v1, v6, :cond_c

    const/4 v1, 0x1

    goto :goto_9

    :cond_c
    move v1, v15

    :goto_9
    and-int/lit8 v6, v14, 0x1

    invoke-virtual {v7, v6, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_15

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_d

    move-object v2, v1

    goto :goto_a

    :cond_d
    move-object v2, v3

    :goto_a
    if-eqz v4, :cond_e

    sget-object v3, Ly2/j;->a:Ly2/b1;

    move-object v4, v3

    goto :goto_b

    :cond_e
    move-object v4, v5

    :goto_b
    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_f
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_c
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-static {v5, v7, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object v3, v2

    invoke-virtual {v15, v1}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 v5, v14, 0xe

    or-int/lit8 v5, v5, 0x30

    const v6, 0xe000

    and-int/2addr v6, v14

    or-int v8, v5, v6

    const/16 v9, 0x68

    move-object v5, v1

    const/4 v1, 0x0

    move-object v6, v3

    const/4 v3, 0x0

    move-object/from16 v17, v5

    const/4 v5, 0x0

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move-object/from16 v13, v17

    const/4 v12, 0x1

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v13}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/16 v28, 0x1

    const v29, 0x6ffff

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v19 .. v29}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v0

    and-int/lit8 v1, v14, 0x70

    const/16 v2, 0x20

    if-ne v1, v2, :cond_12

    move v15, v12

    goto :goto_d

    :cond_12
    const/4 v15, 0x0

    :goto_d
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v15, :cond_13

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_14

    :cond_13
    new-instance v1, Lb01/k;

    const/4 v2, 0x4

    invoke-direct {v1, v10, v2}, Lb01/k;-><init>(FI)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v0}, Lds/p;->s(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v9, 0x68

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    move-object v5, v4

    move-object/from16 v4, v18

    goto :goto_e

    :cond_15
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v4, v3

    :goto_e
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Lhy0/q0;

    move-object/from16 v1, p0

    move/from16 v6, p6

    move/from16 v7, p7

    move v2, v10

    move v3, v11

    invoke-direct/range {v0 .. v7}, Lhy0/q0;-><init>(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final d(FLk2/c;)Ll83/a0;
    .locals 13

    const-string v0, "$this$drawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v3, Li2/x;->m:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, p0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 p0, 0x3f800000    # 1.0f

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    sget-wide v4, Li2/x;->b:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, p0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v3, v4}, [Ll83/k;

    move-result-object p0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v4

    const/4 v11, 0x6

    const/16 v12, 0x3e

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v12}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lhy0/r0;->c(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
