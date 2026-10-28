.class public abstract Lny0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ly71/g;",
        "icon",
        "Li2/x;",
        "toggleBackgroundColor",
        "",
        "enabled",
        "initialToggle",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onToggle",
        "c",
        "(Ly71/g;JZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ly71/g;JZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lny0/s;->e(Ly71/g;JZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lny0/s;->d(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly71/g;JZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly71/g;",
            "JZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    move/from16 v7, p7

    const-string v0, "icon"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onToggle"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v0, -0x7dee04a1

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, p8, 0x2

    if-nez v4, :cond_2

    move-wide/from16 v4, p1

    invoke-virtual {v13, v4, v5}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p1

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    goto :goto_3

    :cond_4
    move-wide/from16 v4, p1

    :goto_3
    and-int/lit8 v8, p8, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v9, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v7, 0x180

    if-nez v9, :cond_5

    move/from16 v9, p3

    invoke-virtual {v13, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit8 v10, p8, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move/from16 v11, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_8

    move/from16 v11, p4

    invoke-virtual {v13, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v0, v12

    :goto_7
    and-int/lit16 v12, v7, 0x6000

    if-nez v12, :cond_c

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_8

    :cond_b
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v0, v12

    :cond_c
    and-int/lit16 v12, v0, 0x2493

    const/16 v15, 0x2492

    const/4 v14, 0x0

    if-eq v12, v15, :cond_d

    const/4 v12, 0x1

    goto :goto_9

    :cond_d
    move v12, v14

    :goto_9
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v13, v15, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1b

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v12, v7, 0x1

    const/4 v15, 0x6

    if-eqz v12, :cond_10

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v8, p8, 0x2

    if-eqz v8, :cond_f

    and-int/lit8 v0, v0, -0x71

    :cond_f
    move/from16 v18, v9

    move/from16 v17, v11

    goto :goto_b

    :cond_10
    :goto_a
    and-int/lit8 v12, p8, 0x2

    if-eqz v12, :cond_11

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v13, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->a()J

    move-result-wide v4

    and-int/lit8 v0, v0, -0x71

    :cond_11
    if-eqz v8, :cond_12

    const/4 v9, 0x1

    :cond_12
    if-eqz v10, :cond_f

    move/from16 v18, v9

    move/from16 v17, v14

    :goto_b
    invoke-virtual {v13}, Lp1/q;->r()V

    if-eqz v17, :cond_13

    const v8, 0x4580c074

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    move-wide v8, v4

    goto :goto_c

    :cond_13
    const v8, 0x4580c606

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v13, v15, v14}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    :goto_c
    if-eqz v17, :cond_14

    const v10, 0x4580cd89

    invoke-virtual {v13, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-static {v10, v13, v15, v14}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v10

    :goto_d
    move-wide v11, v10

    goto :goto_e

    :cond_14
    const v10, 0x4580d1c9

    invoke-virtual {v13, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-static {v10, v13, v15, v14}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v10

    goto :goto_d

    :goto_e
    const/16 v10, 0x8

    int-to-float v10, v10

    int-to-float v2, v2

    mul-float/2addr v10, v2

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    int-to-float v3, v3

    invoke-static {v10, v3, v2}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const v3, 0xe000

    and-int/2addr v0, v3

    const/16 v3, 0x4000

    if-ne v0, v3, :cond_15

    const/4 v0, 0x1

    goto :goto_f

    :cond_15
    move v0, v14

    :goto_f
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_16

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v3, v0, :cond_17

    :cond_16
    new-instance v3, Lno0/l;

    const/16 v0, 0xd

    invoke-direct {v3, v6, v0}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v20, v3

    check-cast v20, Lkotlin/jvm/functions/Function1;

    const/16 v21, 0xc

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/selection/d;->b(Landroidx/compose/ui/Modifier;ZZLi3/i;Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v3, v18

    invoke-static {v0, v3}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v8, v9, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, Lb2/e;->E:Lb2/m;

    invoke-static {v8, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-eqz v1, :cond_18

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_18
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_10
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v13, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v13, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1a

    :cond_19
    invoke-static {v9, v13, v9, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v13, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ly71/g;->b()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v13, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Ly71/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v13, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v3}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v0, 0x1

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    move-wide/from16 v22, v4

    move v4, v3

    move-wide/from16 v2, v22

    move/from16 v5, v17

    goto :goto_11

    :cond_1b
    invoke-virtual {v13}, Lp1/q;->X()V

    move-wide v2, v4

    move v4, v9

    move v5, v11

    :goto_11
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1c

    new-instance v0, Lny0/r;

    move-object/from16 v1, p0

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lny0/r;-><init>(Ly71/g;JZZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ly71/g;JZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lny0/s;->c(Ly71/g;JZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
