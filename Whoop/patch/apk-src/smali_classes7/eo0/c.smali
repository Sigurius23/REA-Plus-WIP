.class public abstract Leo0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\'\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\u000c\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "",
        "Lwn0/g;",
        "validationResults",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "h",
        "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "errorMessage",
        "",
        "isValid",
        "f",
        "(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)V",
        "",
        "iconImage",
        "Li2/x;",
        "iconColor",
        "iconBackgroundColor",
        "d",
        "(IJJLandroidx/compose/runtime/Composer;I)V",
        "change-password_release"
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
.method public static synthetic a(IJJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Leo0/c;->e(IJJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p5}, Leo0/c;->i(Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/util/TextResource;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Leo0/c;->g(Lcom/whoop/design/util/TextResource;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(IJJLandroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v3, p0

    move-wide/from16 v6, p3

    move/from16 v4, p6

    move-object/from16 v13, p5

    check-cast v13, Lp1/q;

    const v0, -0x3fcc45fe

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v13, v3}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    move-wide/from16 v11, p1

    if-nez v5, :cond_3

    invoke-virtual {v13, v11, v12}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v13, v6, v7}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v5, v8, :cond_6

    move v5, v10

    goto :goto_4

    :cond_6
    move v5, v9

    :goto_4
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v13, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_a

    int-to-float v2, v2

    mul-float v5, v2, v2

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v14, v10

    invoke-static {v5, v14, v2}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v6, v7, v14}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, Lb2/e;->E:Lb2/m;

    invoke-static {v14, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-eqz v1, :cond_7

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_5
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v13, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v13, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v14, v13, v14, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v13, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shl-int/lit8 v1, v0, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/lit8 v1, v1, 0x6

    invoke-static {v3, v13, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    const/4 v5, 0x2

    int-to-float v5, v5

    mul-float/2addr v5, v2

    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v14, v0, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    move-object v8, v1

    const/4 v0, 0x1

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_b

    new-instance v0, Leo0/b;

    const/4 v5, 0x0

    move-wide/from16 v1, p1

    invoke-direct/range {v0 .. v7}, Leo0/b;-><init>(JIIIJ)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final e(IJJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Leo0/c;->d(IJJLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, 0x7e5de0ed

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    move v10, v3

    and-int/lit8 v3, v10, 0x13

    const/16 v11, 0x12

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v3, v11, :cond_5

    move v3, v12

    goto :goto_4

    :cond_5
    move v3, v13

    :goto_4
    and-int/lit8 v4, v10, 0x1

    invoke-virtual {v8, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    sget-object v3, Lb2/e;->K:Lb2/l;

    int-to-float v4, v12

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v3, v8, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_6

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    invoke-static {v4, v8, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v3

    if-eqz v1, :cond_9

    invoke-virtual {v3}, Lgz0/i0;->i()I

    move-result v3

    goto :goto_6

    :cond_9
    invoke-virtual {v3}, Lgz0/i0;->b()I

    move-result v3

    :goto_6
    if-eqz v1, :cond_a

    const v4, -0x495c1e8c

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->j()J

    move-result-wide v4

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    const v4, -0x495afbec

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->f()J

    move-result-wide v4

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_7
    if-eqz v1, :cond_b

    const v6, -0x4959326e

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->k()J

    move-result-wide v6

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    const v6, -0x4958080e

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->g()J

    move-result-wide v6

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Leo0/c;->d(IJJLandroidx/compose/runtime/Composer;I)V

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v4, v10, 0xe

    or-int/2addr v3, v4

    invoke-static {v0, v8, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_c

    const v4, 0x798162d3

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-static {v4, v8, v5, v13}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    :goto_9
    move-wide v5, v4

    goto :goto_a

    :cond_c
    const v4, 0x79816710

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v4

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_a
    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v4, v8, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v27, v4, 0x12

    const v28, 0x2fffa

    const/4 v4, 0x0

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v14, v12

    const-wide/16 v12, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v29, v26

    const/16 v26, 0x0

    move/from16 v0, v29

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_d
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v3, Lam0/b;

    const/16 v4, 0x9

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Leo0/c;->f(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwn0/g;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "validationResults"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lp1/q;

    const v2, 0x86ac846

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_2

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_4
    :goto_3
    and-int/lit8 v5, v2, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v7

    :goto_4
    and-int/2addr v2, v8

    invoke-virtual {v0, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    if-eqz v3, :cond_6

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_6
    move-object v2, p1

    :goto_5
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v0, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    invoke-static {v4, v0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x40fecf44

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    move-object v3, p0

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn0/g;

    invoke-virtual {v4}, Lwn0/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lwn0/g;->b()Z

    move-result v4

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v4, v0, v6}, Leo0/c;->f(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_a
    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v2, p1

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Le81/g;

    const/4 v5, 0x1

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Le81/g;-><init>(Ljava/util/List;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final i(Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Leo0/c;->h(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
