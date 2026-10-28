.class public abstract Lhy0/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "text",
        "subtitle",
        "",
        "isActive",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lhy0/a1;->e(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/String;JJLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lhy0/a1;->f(Ljava/lang/String;Ljava/lang/String;JJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lhy0/a1;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v7, p3

    move-object/from16 v8, p4

    move/from16 v9, p6

    const-string v0, "text"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, 0x277996c7

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v9, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v5, v9, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_3

    :cond_7
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :goto_4
    and-int/lit16 v6, v9, 0xc00

    if-nez v6, :cond_9

    invoke-virtual {v10, v7}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x800

    goto :goto_5

    :cond_8
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v3, v6

    :cond_9
    and-int/lit16 v6, v9, 0x6000

    if-nez v6, :cond_b

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x4000

    goto :goto_6

    :cond_a
    const/16 v6, 0x2000

    :goto_6
    or-int/2addr v3, v6

    :cond_b
    and-int/lit16 v6, v3, 0x2493

    const/16 v12, 0x2492

    const/4 v13, 0x0

    if-eq v6, v12, :cond_c

    const/4 v6, 0x1

    goto :goto_7

    :cond_c
    move v6, v13

    :goto_7
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v10, v12, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_14

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_d

    move-object v12, v15

    goto :goto_8

    :cond_d
    move-object v12, v1

    :goto_8
    if-eqz v4, :cond_e

    const/4 v0, 0x0

    move-object v1, v0

    goto :goto_9

    :cond_e
    move-object v1, v5

    :goto_9
    const/4 v0, 0x6

    if-eqz v7, :cond_f

    const v4, -0x418b91d2

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    new-instance v4, Ll83/q;

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    move-object/from16 v16, v15

    invoke-virtual {v6}, Ly81/i;->W0()J

    move-result-wide v14

    new-instance v6, Li2/x;

    invoke-direct {v6, v14, v15}, Li2/x;-><init>(J)V

    invoke-virtual {v5, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    new-instance v11, Li2/x;

    invoke-direct {v11, v14, v15}, Li2/x;-><init>(J)V

    invoke-virtual {v5, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v14

    new-instance v0, Li2/x;

    invoke-direct {v0, v14, v15}, Li2/x;-><init>(J)V

    invoke-direct {v4, v6, v11, v0}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    move-object/from16 v16, v15

    const v4, -0x4189d5e4

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    new-instance v4, Ll83/q;

    sget-wide v5, Li2/x;->m:J

    new-instance v11, Li2/x;

    invoke-direct {v11, v5, v6}, Li2/x;-><init>(J)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v14

    new-instance v6, Li2/x;

    invoke-direct {v6, v14, v15}, Li2/x;-><init>(J)V

    invoke-virtual {v5, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v14

    new-instance v0, Li2/x;

    invoke-direct {v0, v14, v15}, Li2/x;-><init>(J)V

    invoke-direct {v4, v11, v6, v0}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_a
    iget-object v0, v4, Ll83/q;->w:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget-wide v5, v0, Li2/x;->a:J

    iget-object v0, v4, Ll83/q;->x:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget-wide v14, v0, Li2/x;->a:J

    iget-object v0, v4, Ll83/q;->y:Ljava/lang/Object;

    check-cast v0, Li2/x;

    move-wide/from16 v18, v14

    iget-wide v13, v0, Li2/x;->a:J

    sget-object v0, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v0}, Lkd1/w;->b()Lk91/a;

    move-result-object v0

    invoke-virtual {v0}, Lk91/a;->c()Lt0/i;

    move-result-object v11

    const/4 v4, 0x0

    int-to-float v0, v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v15, v4, :cond_10

    invoke-static {v10}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v15

    :cond_10
    check-cast v15, Lj0/i;

    move/from16 p0, v0

    new-instance v0, Li3/i;

    move-object/from16 p2, v1

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li3/i;-><init>(I)V

    const v20, 0xe000

    and-int v3, v3, v20

    const/16 v1, 0x4000

    if-ne v3, v1, :cond_11

    const/16 v20, 0x1

    goto :goto_b

    :cond_11
    const/16 v20, 0x0

    :goto_b
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v20, :cond_12

    if-ne v1, v4, :cond_13

    :cond_12
    new-instance v1, Lhy0/y0;

    const/4 v3, 0x0

    invoke-direct {v1, v8, v3}, Lhy0/y0;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v20, v1

    check-cast v20, Lc93/a;

    const/16 v21, 0xc

    const/16 v17, 0x0

    move-wide/from16 v3, v18

    const/16 v18, 0x0

    move-object/from16 v19, v16

    move-object/from16 v16, v15

    move-object/from16 v15, v19

    move-object/from16 v19, v0

    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    new-instance v0, Lhy0/z0;

    move-wide/from16 v22, v13

    move-wide v13, v5

    move-wide/from16 v5, v22

    move-object/from16 v1, p2

    move-object/from16 v16, v15

    move/from16 v15, p0

    invoke-direct/range {v0 .. v6}, Lhy0/z0;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    const v2, 0x719d0e44

    invoke-static {v2, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/high16 v18, 0x1b0000

    const/16 v19, 0x18

    move-object v2, v12

    move-wide v12, v13

    const/4 v14, 0x0

    move-object/from16 v17, v10

    move-object/from16 v10, v16

    move-object/from16 v16, v0

    invoke-static/range {v10 .. v19}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v1

    move-object v1, v2

    goto :goto_c

    :cond_14
    move-object/from16 v17, v10

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    move-object v3, v5

    :goto_c
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_15

    new-instance v0, Lbf0/g;

    const/16 v8, 0xe

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move v4, v7

    move v6, v9

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLl83/e;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ljava/lang/String;Ljava/lang/String;JJLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p7, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p7, 0x1

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lb2/e;->E:Lb2/m;

    invoke-static {v0, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v1, v4, v1, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v7, 0x8

    const-wide/high16 v10, 0x3ff4000000000000L    # 1.25

    const/4 v12, 0x6

    const/4 v13, 0x3

    if-eqz p0, :cond_7

    const v14, 0x212b37d6

    invoke-virtual {v4, v14}, Lp1/q;->e0(I)V

    sget-object v14, Lb2/e;->N:Lb2/k;

    double-to-float v10, v10

    int-to-float v7, v7

    mul-float/2addr v10, v7

    invoke-static {v10, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->c:Ll0/g;

    const/16 v15, 0x30

    invoke-static {v11, v14, v4, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v4, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v2, v4, Lp1/q;->S:Z

    if-eqz v2, :cond_4

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v4, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    invoke-static {v14, v4, v14, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v4, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v4, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->s()Lb91/a;

    move-result-object v24

    new-instance v1, Lw3/k;

    invoke-direct {v1, v13}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v29, 0x2fdfa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v2, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move-object/from16 v30, v6

    move/from16 v3, v16

    move-object/from16 v4, p1

    move-object/from16 v16, v1

    move v1, v7

    move-wide/from16 v6, p2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v0, v4, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->d()Lb91/a;

    move-result-object v24

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v5

    mul-float v8, v0, v1

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, v30

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v0, Lw3/k;

    invoke-direct {v0, v3}, Lw3/k;-><init>(I)V

    const v29, 0x2fdf8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v27, 0x30

    move-wide/from16 v6, p4

    move-object/from16 v16, v0

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    :goto_3
    const/4 v0, 0x1

    goto :goto_4

    :cond_7
    move v2, v12

    move v3, v13

    const v0, 0x2136eaf8

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v4, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v24

    double-to-float v0, v10

    int-to-float v1, v7

    mul-float/2addr v0, v1

    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v0, Lw3/k;

    invoke-direct {v0, v3}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v29, 0x2fdf8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x30

    move-wide/from16 v6, p2

    move-object/from16 v16, v0

    move-object/from16 v26, v4

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lhy0/a1;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
