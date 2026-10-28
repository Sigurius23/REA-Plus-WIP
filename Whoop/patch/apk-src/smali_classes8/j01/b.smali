.class public abstract Lj01/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a/\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lj01/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "i",
        "(Landroidx/compose/ui/Modifier;Lj01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "icon",
        "",
        "time",
        "title",
        "",
        "hasTheme",
        "g",
        "(ILjava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lj01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lj01/b;->l(Lj01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lj01/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lj01/b;->m(Lj01/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILjava/lang/String;Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lj01/b;->h(ILjava/lang/String;Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lj01/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj01/b;->k(Lj01/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lj01/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lj01/b;->n(Landroidx/compose/ui/Modifier;Lj01/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lj01/b;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(ILjava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V
    .locals 40

    move/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v2, p5

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x77938191

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v2, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->e(I)Z

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
    and-int/lit8 v7, v2, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v2, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v2, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v11, v5}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    const/4 v9, 0x0

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v9

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_e

    const/4 v15, 0x6

    if-eqz v5, :cond_9

    const v7, 0x3674684a

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->f0()J

    move-result-wide v7

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v7, 0x367516e8

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7, v11, v15, v9}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v7

    :goto_6
    if-eqz v5, :cond_a

    const v10, 0x36763d2a

    invoke-virtual {v11, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-virtual {v10, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->f0()J

    move-result-wide v12

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    :goto_7
    move-wide/from16 v16, v12

    goto :goto_8

    :cond_a
    const v10, 0x3676ec25

    invoke-virtual {v11, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-static {v10, v11, v15, v9}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v12

    goto :goto_7

    :goto_8
    sget-object v9, Lb2/e;->N:Lb2/k;

    sget-object v10, Ll0/m;->c:Ll0/g;

    const/16 v12, 0x30

    invoke-static {v10, v9, v11, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v19, v15

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v11, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v11, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v11, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    :cond_c
    invoke-static {v10, v11, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shl-int/lit8 v6, v0, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int/lit8 v6, v6, 0x6

    invoke-static {v1, v11, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    move/from16 v9, v19

    int-to-float v10, v9

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v10, v9

    invoke-static {v10, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v12, 0x1b0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-wide/from16 v38, v7

    move-object v8, v9

    move-wide/from16 v9, v38

    const/4 v7, 0x0

    move-object/from16 v32, v18

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-wide/from16 v33, v9

    shr-int/lit8 v6, v0, 0x3

    and-int/lit8 v6, v6, 0xe

    invoke-static {v3, v11, v6}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v7, v11, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->C()Lb91/a;

    move-result-object v26

    new-instance v8, Lw3/k;

    const/4 v10, 0x3

    invoke-direct {v8, v10}, Lw3/k;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0x2fdfa

    move-object v10, v7

    const/4 v7, 0x0

    move-object v12, v10

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v18, v8

    move/from16 v19, v9

    move-wide/from16 v8, v16

    move-object/from16 v17, v15

    const-wide/16 v15, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v22, v19

    move-object/from16 v21, v20

    const-wide/16 v19, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v27, v24

    const/16 v24, 0x0

    move-object/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v35, v27

    const/16 v27, 0x0

    move-object/from16 v36, v29

    const/16 v29, 0x0

    move/from16 v37, v0

    move/from16 v1, v35

    move-object/from16 v0, v36

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    shr-int/lit8 v6, v37, 0x6

    and-int/lit8 v6, v6, 0xe

    invoke-static {v4, v11, v6}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v20, v7, v8

    const/16 v22, 0x0

    const/16 v23, 0xd

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v32

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->t()Lb91/a;

    move-result-object v26

    const v31, 0x2fff8

    const-wide/16 v10, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v29, 0x30

    move-wide/from16 v8, v33

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_e
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lbg0/h;

    move/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lbg0/h;-><init>(IILjava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final h(ILjava/lang/String;Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lj01/b;->g(ILjava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Lj01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lj01/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, 0x5ff70b5f

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    const/16 v7, 0x100

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v7

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v4, v9

    :goto_4
    and-int/lit16 v9, v4, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v9, v10, :cond_8

    move v9, v12

    goto :goto_5

    :cond_8
    move v9, v11

    :goto_5
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v13, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_f

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v3, v14

    :cond_9
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_a

    new-instance v6, Liz0/d;

    const/16 v8, 0xb

    invoke-direct {v6, v8}, Liz0/d;-><init>(I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_b
    move-object v6, v8

    :goto_6
    const/4 v8, 0x3

    int-to-float v8, v8

    int-to-float v2, v2

    mul-float/2addr v8, v2

    invoke-static {v8}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v9, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->W0()J

    move-result-wide v9

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    and-int/lit16 v4, v4, 0x380

    if-ne v4, v7, :cond_c

    goto :goto_7

    :cond_c
    move v12, v11

    :goto_7
    or-int v4, v15, v12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_d

    if-ne v7, v0, :cond_e

    :cond_d
    new-instance v7, Li01/d;

    const/16 v0, 0x1d

    invoke-direct {v7, v0, v5, v6}, Li01/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v18, v7

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v4, v11

    mul-float v11, v4, v2

    new-instance v2, Lf01/f;

    const/16 v4, 0x1d

    invoke-direct {v2, v4, v5, v6}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x18d54edc

    invoke-static {v4, v13, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/high16 v14, 0x1b0000

    const/16 v15, 0x18

    move-object v7, v8

    move-wide v8, v9

    const/4 v10, 0x0

    move-object/from16 v20, v6

    move-object v6, v0

    move-object/from16 v0, v20

    invoke-static/range {v6 .. v15}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v0

    :goto_8
    move-object v4, v3

    goto :goto_9

    :cond_f
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v6, v8

    goto :goto_8

    :goto_9
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lhy0/v;

    const/16 v3, 0x17

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final j(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lj01/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lj01/d;->e()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lj01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 45

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    and-int/lit8 v2, p3, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    and-int/lit8 v6, p3, 0x1

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_11

    int-to-float v2, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v2, v5

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v11, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_1

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3

    :cond_2
    invoke-static {v8, v11, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v11, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v14

    mul-float v14, v6, v5

    const/4 v15, 0x0

    const/16 v17, 0x5

    move-object v6, v13

    const/4 v13, 0x0

    move/from16 v16, v2

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v33, v16

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v14, Ll0/m;->g:Ll0/h;

    sget-object v15, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v14, v15, v11, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v13

    move/from16 p3, v5

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v11, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4, v11, v4, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v11, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lj01/d;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v11, v3}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v11, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->s()Lb91/a;

    move-result-object v27

    invoke-virtual {v4, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    const/16 v31, 0x0

    const v32, 0x2fffa

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v17, v11

    move-object/from16 v18, v12

    const-wide/16 v11, 0x0

    move-object/from16 v19, v9

    move-wide/from16 v43, v13

    move-object v14, v10

    move-wide/from16 v9, v43

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    move-object/from16 v29, v17

    const-wide/16 v16, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    move-object/from16 v26, v21

    const-wide/16 v20, 0x0

    move-object/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v34, v24

    const/16 v24, 0x0

    move-object/from16 v35, v25

    const/16 v25, 0x0

    move-object/from16 v36, v26

    const/16 v26, 0x0

    move-object/from16 v37, v28

    const/16 v28, 0x0

    move-object/from16 v38, v30

    const/16 v30, 0x0

    move-object/from16 v39, v7

    move-object/from16 v40, v34

    move-object/from16 v42, v36

    move-object/from16 v41, v37

    move-object/from16 v3, v38

    move-object v7, v2

    move-object/from16 v2, v35

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v29

    invoke-virtual {v0}, Lj01/d;->e()Lcom/whoop/navigation/e;

    move-result-object v7

    if-eqz v7, :cond_7

    const v7, 0x10467ca9

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/w;->s()I

    move-result v7

    invoke-static {v7, v11, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    const-string v8, "navigate"

    invoke-static {v8, v11, v5}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    invoke-static {v3, v9}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v9, 0x5

    int-to-float v9, v9

    const/4 v12, 0x4

    int-to-float v12, v12

    mul-float/2addr v9, v12

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v4, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v12

    move-object/from16 v17, v11

    move-wide v10, v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v12, v17

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v11, v12

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    :goto_3
    const/4 v9, 0x1

    goto :goto_4

    :cond_7
    const/4 v7, 0x0

    const v8, 0x104ceca0

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    const/4 v15, 0x0

    const/16 v17, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v12, v3

    move/from16 v16, v33

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v13, v12

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    move-object/from16 v9, v42

    invoke-static {v7, v9, v11, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_8

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v11, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v39

    invoke-static {v11, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_9
    move-object/from16 v2, v40

    goto :goto_7

    :cond_a
    :goto_6
    move-object/from16 v2, v41

    goto :goto_8

    :goto_7
    invoke-static {v8, v11, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_6

    :goto_8
    invoke-static {v11, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->a()I

    move-result v7

    invoke-virtual {v0}, Lj01/d;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lj01/d;->c()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v12, 0xc00

    invoke-static/range {v7 .. v12}, Lj01/b;->g(ILjava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x1

    int-to-float v2, v9

    mul-float v2, v2, p3

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v11, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v6, v3

    const-wide/16 v20, 0x0

    cmpl-double v6, v6, v20

    const-string v22, "invalid weight; must be greater than zero"

    if-lez v6, :cond_b

    goto :goto_9

    :cond_b
    invoke-static/range {v22 .. v22}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v23, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v7, v3, v23

    if-lez v7, :cond_c

    move/from16 v3, v23

    :goto_a
    const/4 v9, 0x1

    goto :goto_b

    :cond_c
    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_a

    :goto_b
    invoke-direct {v6, v3, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v4, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->Y0()J

    move-result-wide v7

    new-instance v3, Lhy0/h;

    const/4 v9, 0x0

    move/from16 v10, p3

    invoke-direct {v3, v10, v9}, Lhy0/h;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6, v7, v8, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v18, 0x0

    const/16 v19, 0xfe

    const/4 v8, 0x0

    move-object v3, v9

    move v6, v10

    const/4 v10, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v3, v30

    invoke-static/range {v7 .. v19}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v17

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v11, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/c0;->e()I

    move-result v7

    invoke-virtual {v0}, Lj01/d;->f()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lj01/d;->g()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    const/16 v12, 0xc00

    invoke-static/range {v7 .. v12}, Lj01/b;->g(ILjava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v11, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v8, v7

    cmpl-double v8, v8, v20

    if-lez v8, :cond_d

    goto :goto_c

    :cond_d
    invoke-static/range {v22 .. v22}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v9, v7, v23

    if-lez v9, :cond_e

    move/from16 v13, v23

    :goto_d
    const/4 v9, 0x1

    goto :goto_e

    :cond_e
    move v13, v7

    goto :goto_d

    :goto_e
    invoke-direct {v8, v13, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v4, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->Y0()J

    move-result-wide v9

    new-instance v5, Lhy0/h;

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Lhy0/h;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8, v9, v10, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v18, 0x0

    const/16 v19, 0xfe

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v7 .. v19}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v17

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->o()I

    move-result v7

    invoke-virtual {v0}, Lj01/d;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lj01/d;->j()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v12, 0xc00

    invoke-static/range {v7 .. v12}, Lj01/b;->g(ILjava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x1

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    new-instance v2, Lc41/r0;

    invoke-direct {v2}, Lc41/r0;-><init>()V

    invoke-virtual {v0}, Lj01/d;->a()Lc41/t0;

    move-result-object v3

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_f

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_10

    :cond_f
    new-instance v5, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v4, 0x19

    invoke-direct {v5, v4, v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-virtual {v2, v3, v5, v11, v7}, Lc41/r0;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x1

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_11
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lj01/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lj01/d;->e()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Lj01/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lj01/b;->i(Landroidx/compose/ui/Modifier;Lj01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
