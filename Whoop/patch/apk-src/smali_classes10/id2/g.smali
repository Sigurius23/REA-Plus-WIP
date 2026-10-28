.class public abstract Lid2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001aA\u0010\u0010\u001a\u00020\u00042\u0008\u0008\u0001\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Lid2/d;",
        "Ll83/a0;",
        "onEvent",
        "i",
        "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "icon",
        "",
        "label",
        "",
        "isPrimary",
        "Lkotlin/Function0;",
        "onClick",
        "g",
        "(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "share_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lid2/g;->k(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lid2/g;->l(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lid2/g;->h(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lid2/g;->n(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lid2/g;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lid2/g;->m(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v1, p0

    move/from16 v7, p2

    move/from16 v2, p6

    move-object/from16 v13, p5

    check-cast v13, Lp1/q;

    const v0, -0x67244712

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v2, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v2

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    move-object/from16 v8, p1

    if-nez v4, :cond_3

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v2, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v13, v7}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    and-int/lit16 v4, v2, 0xc00

    move-object/from16 v5, p3

    if-nez v4, :cond_7

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v0, v4

    :cond_7
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_9

    or-int/lit16 v0, v0, 0x6000

    :cond_8
    move-object/from16 v6, p4

    goto :goto_6

    :cond_9
    and-int/lit16 v6, v2, 0x6000

    if-nez v6, :cond_8

    move-object/from16 v6, p4

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_5

    :cond_a
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit16 v9, v0, 0x2493

    const/16 v10, 0x2492

    const/4 v12, 0x0

    if-eq v9, v10, :cond_b

    const/4 v9, 0x1

    goto :goto_7

    :cond_b
    move v9, v12

    :goto_7
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v13, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_15

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_c

    move-object v6, v9

    :cond_c
    if-eqz v7, :cond_d

    const v4, -0x2f2eaf88

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v4, v13, v10, v12}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v14

    goto :goto_8

    :cond_d
    const v4, -0x2f2eab4b

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v4, v13, v10, v12}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v14

    :goto_8
    if-eqz v7, :cond_e

    const v4, -0x2f2ea3c8

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v4, v13, v10, v12}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    :goto_9
    move-wide/from16 v20, v16

    goto :goto_a

    :cond_e
    const v4, -0x2f2e9f88

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v4, v13, v10, v12}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    goto :goto_9

    :goto_a
    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    double-to-float v10, v11

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v10, v11

    invoke-static {v10, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->N:Lb2/k;

    sget-object v12, Ll0/m;->c:Ll0/g;

    const/16 v4, 0x30

    invoke-static {v12, v11, v13, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 v22, v0

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-eqz v0, :cond_f

    invoke-virtual {v13, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_b
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v13, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v13, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    invoke-static {v11, v13, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v13, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0xe

    int-to-float v10, v5

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v10, v11

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move/from16 v23, v5

    const/4 v5, 0x3

    move-object/from16 v34, v6

    int-to-float v6, v5

    mul-float/2addr v6, v11

    move/from16 v24, v5

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v10, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v14, v15, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v17, 0x0

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, p3

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, Lb2/e;->E:Lb2/m;

    const/4 v14, 0x0

    invoke-static {v10, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_12

    invoke-virtual {v13, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v13, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_13

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    invoke-static {v14, v13, v14, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v13, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shl-int/lit8 v0, v22, 0x3

    and-int/lit8 v0, v0, 0x70

    const/4 v2, 0x6

    or-int/2addr v0, v2

    invoke-static {v1, v13, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    int-to-float v2, v2

    mul-float/2addr v2, v11

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    and-int/lit8 v2, v22, 0x70

    or-int/lit16 v14, v2, 0x180

    const/4 v15, 0x0

    move-object v2, v8

    move-object v8, v0

    move-object v0, v9

    move-object v9, v2

    move-wide/from16 v11, v20

    const/4 v2, 0x1

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {v13, v2, v0, v6, v13}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v0, v13, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v13, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v10

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v29

    shr-int/lit8 v0, v22, 0x3

    and-int/lit8 v31, v0, 0xe

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v0, v0, 0x12

    const v3, 0xc00db0

    or-int v32, v0, v3

    const v33, 0xc7fa

    const/4 v9, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/16 v25, 0x2

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object/from16 v4, v34

    goto :goto_d

    :cond_15
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v4, v6

    :goto_d
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Lid2/f;

    move-object/from16 v6, p1

    move/from16 v7, p2

    move-object/from16 v5, p3

    move/from16 v2, p6

    move/from16 v3, p7

    invoke-direct/range {v0 .. v7}, Lid2/f;-><init>(IIILandroidx/compose/ui/Modifier;Lc93/a;Ljava/lang/String;Z)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final h(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lid2/g;->g(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    const-string v0, "onEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, 0x7b45e82e

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    const/16 v11, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v11

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v4, v5, :cond_5

    move v4, v13

    goto :goto_3

    :cond_5
    move v4, v12

    :goto_3
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v8, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_16

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v1, v14

    :cond_6
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->f:Ll0/h;

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v5, v6, v8, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v6, v8, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    invoke-virtual {v15}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a;->d()I

    move-result v4

    sget v5, Lad2/a;->a:I

    invoke-static {v5, v8, v12}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v11, :cond_a

    move v6, v13

    goto :goto_5

    :cond_a
    move v6, v12

    :goto_5
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_b

    if-ne v7, v9, :cond_c

    :cond_b
    new-instance v7, Lid2/e;

    const/4 v6, 0x0

    invoke-direct {v7, v2, v6}, Lid2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v6, v7

    check-cast v6, Lc93/a;

    sget-object v7, Ll0/t1;->a:Ll0/t1;

    move-object v10, v7

    invoke-virtual {v10, v14, v13, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v16, v9

    const/16 v9, 0x180

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v3

    move v3, v4

    move-object v4, v5

    const/4 v5, 0x1

    move-object/from16 v13, v16

    move-object/from16 v19, v17

    move/from16 v0, v18

    invoke-static/range {v3 .. v10}, Lid2/g;->g(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/k0;->o()I

    move-result v3

    sget v4, Lad2/a;->b:I

    invoke-static {v4, v8, v12}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    if-ne v0, v11, :cond_d

    const/4 v5, 0x1

    goto :goto_6

    :cond_d
    move v5, v12

    :goto_6
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_e

    if-ne v6, v13, :cond_f

    :cond_e
    new-instance v6, Lid2/e;

    const/4 v5, 0x1

    invoke-direct {v6, v2, v5}, Lid2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lc93/a;

    move-object/from16 v9, v19

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    invoke-virtual {v9, v14, v7, v5}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move-object/from16 v17, v9

    const/16 v9, 0x180

    move-object v7, v10

    const/4 v10, 0x0

    const/4 v5, 0x1

    move-object/from16 v20, v17

    invoke-static/range {v3 .. v10}, Lid2/g;->g(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o;->z()I

    move-result v3

    sget v4, Lad2/a;->c:I

    invoke-static {v4, v8, v12}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    if-ne v0, v11, :cond_10

    const/4 v5, 0x1

    goto :goto_7

    :cond_10
    move v5, v12

    :goto_7
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_11

    if-ne v6, v13, :cond_12

    :cond_11
    new-instance v6, Lid2/e;

    const/4 v5, 0x2

    invoke-direct {v6, v2, v5}, Lid2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v6, Lc93/a;

    move-object/from16 v9, v20

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    invoke-virtual {v9, v14, v7, v5}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move-object/from16 v17, v9

    const/16 v9, 0x180

    move-object v7, v10

    const/4 v10, 0x0

    const/4 v5, 0x1

    move-object/from16 v21, v17

    invoke-static/range {v3 .. v10}, Lid2/g;->g(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/k0;->e0()I

    move-result v3

    sget v4, Lad2/a;->d:I

    invoke-static {v4, v8, v12}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    if-ne v0, v11, :cond_13

    const/4 v12, 0x1

    :cond_13
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v12, :cond_14

    if-ne v0, v13, :cond_15

    :cond_14
    new-instance v0, Lid2/e;

    const/4 v5, 0x3

    invoke-direct {v0, v2, v5}, Lid2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v6, v0

    check-cast v6, Lc93/a;

    move-object/from16 v9, v21

    const/4 v0, 0x1

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v9, v14, v0, v5}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v9, 0x180

    const/4 v10, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v10}, Lid2/g;->g(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_16
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_17

    new-instance v0, Lb03/c;

    const/4 v5, 0x1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lb03/c;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lid2/d$a;->a:Lid2/d$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lid2/d$b;->a:Lid2/d$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lid2/d$c;->a:Lid2/d$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lid2/d$d;->a:Lid2/d$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lid2/g;->i(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
