.class public abstract Lc41/o4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc41/p4;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lc41/p4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/o4;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lc41/p4;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/o4;->e(Landroidx/compose/ui/Modifier;Lc41/p4;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lc41/p4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/p4;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, 0x7d4d7622

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v8, p2

    :goto_3
    move v11, v6

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v6, v9

    goto :goto_3

    :goto_5
    and-int/lit16 v6, v11, 0x93

    const/16 v9, 0x92

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v6, v9, :cond_8

    move v6, v13

    goto :goto_6

    :cond_8
    move v6, v12

    :goto_6
    and-int/lit8 v9, v11, 0x1

    invoke-virtual {v15, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_15

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v0, v14

    goto :goto_7

    :cond_9
    move-object v0, v5

    :goto_7
    if-eqz v7, :cond_b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_a

    new-instance v5, Lc31/m;

    const/16 v6, 0x16

    invoke-direct {v5, v6}, Lc31/m;-><init>(I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v7, v5

    goto :goto_8

    :cond_b
    move-object v7, v8

    :goto_8
    const/4 v5, 0x3

    int-to-float v5, v5

    int-to-float v3, v3

    invoke-static {v0, v5, v3}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v15, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->a1()J

    move-result-wide v8

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v8, v9, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v8, v13

    const/16 v9, 0xc

    int-to-float v9, v9

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    sget-object v16, Li2/t;->b:Li2/s;

    const v10, 0xffffff

    invoke-static {v10}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v10, Li2/x;

    invoke-direct {v10, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {v5, v15, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->a1()J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v10, v5}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const-wide/16 v20, 0x0

    const/16 v22, 0xe

    const-wide/16 v18, 0x0

    invoke-static/range {v16 .. v22}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v1

    invoke-static {v8, v3, v1, v9}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v5, v15, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-eqz v8, :cond_c

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_9
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v15, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v15, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v3, v15, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v15, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->M:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/16 v10, 0x30

    invoke-static {v9, v1, v15, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v9, v15, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v15, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v15, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    :cond_10
    invoke-static {v9, v15, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v15, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x2a16653d

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lc41/p4;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v18, v2, 0x1

    if-ltz v2, :cond_13

    move-object/from16 v19, v3

    check-cast v19, Lc41/r4;

    const/4 v3, 0x0

    int-to-float v5, v3

    const/16 v6, 0x8

    int-to-float v12, v6

    mul-float/2addr v5, v12

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v21, Lc41/m4;->LIST:Lc41/m4;

    const/16 v32, 0xffd

    const/16 v33, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v19 .. v33}, Lc41/r4;->b(Lc41/r4;Ljava/lang/String;Lc41/m4;Lcom/whoop/design/util/TextResource;Lkd1/o;Lm91/u;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lc41/h4;ILjava/lang/Object;)Lc41/r4;

    move-result-object v6

    and-int/lit16 v9, v11, 0x380

    const/4 v10, 0x0

    move-object v8, v15

    invoke-static/range {v5 .. v10}, Lc41/l4;->p(Landroidx/compose/ui/Modifier;Lc41/r4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v19, v7

    invoke-virtual/range {p1 .. p1}, Lc41/p4;->a()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v5

    if-eq v2, v5, :cond_12

    const v2, -0x54db013f

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x2

    int-to-float v5, v2

    mul-float/2addr v5, v12

    const/4 v6, 0x0

    invoke-static {v14, v5, v6, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x1

    const/16 v16, 0x6

    const/16 v17, 0xfe

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v13, v10

    move v12, v11

    const-wide/16 v10, 0x0

    move/from16 v20, v12

    move/from16 v21, v13

    const-wide/16 v12, 0x0

    move-object/from16 v22, v14

    const/4 v14, 0x0

    move/from16 v2, v21

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_12
    move/from16 v20, v11

    move-object/from16 v22, v14

    const/4 v2, 0x1

    const v5, -0x54d96f94

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    :goto_c
    move/from16 v2, v18

    move-object/from16 v7, v19

    move/from16 v11, v20

    move-object/from16 v14, v22

    goto/16 :goto_b

    :cond_13
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_14
    move-object/from16 v19, v7

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v15, v3, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v1, v0

    move-object/from16 v3, v19

    goto :goto_d

    :cond_15
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v8

    :goto_d
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lc41/d1;

    const/4 v6, 0x5

    move-object/from16 v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lc41/p4;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lc41/o4;->c(Landroidx/compose/ui/Modifier;Lc41/p4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
