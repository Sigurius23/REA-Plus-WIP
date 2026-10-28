.class public abstract Lsl0/i3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a?\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000f\u00b2\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "text",
        "",
        "Lm91/u;",
        "items",
        "",
        "isSuggestion",
        "messageId",
        "Ll83/a0;",
        "f",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "imageUrl",
        "startAnimation",
        "",
        "alpha",
        "bot_release"
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
.method public static synthetic a(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsl0/i3;->n(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/i3;->j(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/i3;->p(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lsl0/i3;->h(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/i3;->o(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "text"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x535db26a

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v5, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, p6, 0x4

    const/16 v13, 0x100

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v13

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit8 v7, p6, 0x8

    const/16 v8, 0x800

    if-eqz v7, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_8

    move-object/from16 v9, p3

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    move v11, v8

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v0, v11

    :goto_7
    and-int/lit16 v11, v0, 0x493

    const/16 v12, 0x492

    const/4 v14, 0x0

    if-eq v11, v12, :cond_b

    const/4 v11, 0x1

    goto :goto_8

    :cond_b
    move v11, v14

    :goto_8
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_25

    if-eqz v2, :cond_c

    sget-object v2, Lm83/y;->w:Lm83/y;

    goto :goto_9

    :cond_c
    move-object v2, v3

    :goto_9
    if-eqz v4, :cond_d

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_a

    :cond_d
    move-object v3, v6

    :goto_a
    const/4 v4, 0x0

    if-eqz v7, :cond_e

    move-object v9, v4

    :cond_e
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_f

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lp1/c1;

    invoke-static {v6}, Lsl0/i3;->g(Lp1/c1;)Ljava/lang/String;

    move-result-object v17

    if-nez v17, :cond_10

    const v12, -0x6499e6e5

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    const/16 p1, 0x30

    goto :goto_b

    :cond_10
    const v12, -0x6499e6e4

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    new-instance v16, Lkd1/o$c;

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v12, v16

    const/16 p1, 0x30

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v7, :cond_11

    new-instance v11, Lsl0/b1;

    const/16 v15, 0xa

    invoke-direct {v11, v15, v6}, Lsl0/b1;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v11, Lc93/a;

    sget v15, Lkd1/o$c;->f:I

    or-int/lit8 v15, v15, 0x30

    invoke-static {v12, v11, v10, v15}, Lkd1/q;->d(Lkd1/o;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_b
    and-int/lit16 v11, v0, 0x1c00

    if-ne v11, v8, :cond_12

    const/4 v8, 0x1

    goto :goto_c

    :cond_12
    move v8, v14

    :goto_c
    and-int/lit16 v0, v0, 0x380

    if-ne v0, v13, :cond_13

    const/4 v11, 0x1

    goto :goto_d

    :cond_13
    move v11, v14

    :goto_d
    or-int/2addr v8, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_14

    if-ne v11, v7, :cond_15

    :cond_14
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v15, v11

    check-cast v15, Lp1/c1;

    invoke-static {v15}, Lsl0/i3;->k(Lp1/c1;)Z

    move-result v8

    const/high16 v11, 0x3f800000    # 1.0f

    if-eqz v8, :cond_16

    move v8, v11

    goto :goto_e

    :cond_16
    const/4 v8, 0x0

    :goto_e
    const/16 v12, 0x12c

    const/4 v13, 0x6

    invoke-static {v12, v14, v4, v13}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v12

    move/from16 v17, v11

    const/16 v11, 0xc30

    move-object/from16 v18, v7

    move-object v7, v12

    const/16 v12, 0x14

    move-object/from16 v19, v6

    move v6, v8

    const-string v8, "fadeIn"

    move-object/from16 v20, v9

    const/4 v9, 0x0

    move-object/from16 v14, v18

    move-object/from16 v23, v19

    move-object/from16 v13, v20

    invoke-static/range {v6 .. v12}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v6

    const/16 v7, 0x100

    if-ne v0, v7, :cond_17

    const/4 v0, 0x1

    goto :goto_f

    :cond_17
    const/4 v0, 0x0

    :goto_f
    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v0, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_18

    if-ne v7, v14, :cond_19

    :cond_18
    new-instance v7, Lsl0/i3$a;

    invoke-direct {v7, v3, v15, v4}, Lsl0/i3$a;-><init>(Ljava/lang/Boolean;Lp1/c1;Lq83/d;)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v7, Lc93/m;

    invoke-static {v13, v3, v7, v10}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {v6}, Lsl0/i3;->m(Lp1/t2;)F

    move-result v11

    goto :goto_10

    :cond_1a
    const/high16 v11, 0x3f800000    # 1.0f

    :goto_10
    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const-wide/high16 v6, 0x4021000000000000L    # 8.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v25, v6, v7

    const/4 v6, 0x1

    int-to-float v8, v6

    mul-float v27, v8, v7

    const-wide/high16 v8, 0x400c000000000000L    # 3.5

    double-to-float v6, v8

    mul-float v26, v6, v7

    const/16 v28, 0x0

    const/16 v29, 0x8

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->O:Lb2/k;

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    invoke-static {v8, v7, v10, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_1b

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_11
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v10, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_1c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    :cond_1c
    invoke-static {v8, v10, v8, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_21

    const v6, -0x2c4c154a

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Ll0/m;->b:Ll0/e;

    sget-object v8, Lb2/e;->J:Lb2/l;

    const/4 v9, 0x6

    invoke-static {v6, v8, v10, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 p1, v2

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-eqz v2, :cond_1e

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v10, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_1f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    :cond_1f
    invoke-static {v8, v10, v8, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v10, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lsl0/g;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lsl0/g;-><init>(Ljava/lang/Object;I)V

    const v2, 0x45bf0ebe

    invoke-static {v2, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/4 v2, 0x0

    const/16 v9, 0x30

    invoke-static {v2, v0, v10, v9}, Lf1/y0;->d(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v6, 0x1

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_21
    move-object/from16 p1, v2

    const/4 v0, 0x0

    const v2, -0x2c3dd47e

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_13
    const v0, -0x227597b6

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lm91/u;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_22

    new-instance v2, Lsl0/h3;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_23

    new-instance v2, Lsl0/h;

    const/4 v4, 0x7

    move-object/from16 v15, v23

    invoke-direct {v2, v4, v15}, Lsl0/h;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_15

    :cond_23
    move-object/from16 v15, v23

    :goto_15
    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v2, Lm91/p;->b:I

    shl-int/lit8 v2, v2, 0x3

    or-int/lit16 v11, v2, 0xc00

    const/4 v12, 0x4

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v23, v15

    goto :goto_14

    :cond_24
    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    const/4 v6, 0x1

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    move-object/from16 v2, p1

    move-object v4, v13

    goto :goto_16

    :cond_25
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v6

    move-object v4, v9

    :goto_16
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_26

    new-instance v0, Lsl0/k2;

    const/4 v7, 0x1

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lsl0/k2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final g(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final h(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lsl0/i3;->f(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lsl0/i3;->i(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
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

.method private static final l(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final m(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final n(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v4, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v5

    const/4 v7, 0x3

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v8, v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8, v9, v5, v6}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    int-to-float v8, v3

    mul-float/2addr v8, v7

    invoke-static {v5, v6, v8}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v6, v4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v4, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    sget-object v5, Lb2/e;->F:Lb2/m;

    invoke-virtual {v2, v9, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0, v4, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v0, v4, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v28, v0, 0x12

    const v29, 0x2fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lsl0/m0;->c()Lm91/p;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm91/q;->b(Lm91/p;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lh51/f;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lsl0/x0;

    invoke-direct {v1}, Lsl0/x0;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lsl0/i3;->i(Lp1/c1;Ljava/lang/String;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic q(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/i3;->l(Lp1/c1;Z)V

    return-void
.end method
