.class public abstract Law0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lyv0/e$b;",
        "row",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "c",
        "(Lyv0/e$b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lyv0/f;",
        "zone",
        "e",
        "(Lyv0/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "core-details_release"
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
.method public static synthetic a(Lyv0/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Law0/e;->f(Lyv0/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyv0/e$b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Law0/e;->d(Lyv0/e$b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lyv0/e$b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 18

    move-object/from16 v1, p0

    const-string v0, "row"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x71bad4e5

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v8, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v8

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v6, 0x12

    const/4 v10, 0x1

    if-eq v4, v6, :cond_5

    move v4, v10

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    and-int/2addr v0, v10

    invoke-virtual {v5, v0, v4}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_6

    move-object v0, v11

    goto :goto_5

    :cond_6
    move-object v0, v3

    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v12, v4

    mul-float/2addr v3, v12

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v13, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v3, v13, v5, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-nez v14, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v14, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    invoke-static {v4, v5, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v5, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lyv0/e$b;->a()Lgz0/m0;

    move-result-object v2

    move-object v4, v3

    invoke-virtual {v1}, Lyv0/e$b;->b()Ljava/lang/String;

    move-result-object v3

    move-object v14, v6

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x4

    move-object/from16 v17, v4

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Law0/g;->b(Lgz0/m0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v2

    mul-float/2addr v2, v12

    move-object v3, v15

    const/4 v15, 0x0

    move-object/from16 v4, v16

    const/16 v16, 0xe

    move-object v6, v13

    const/4 v13, 0x0

    move-object v7, v14

    const/4 v14, 0x0

    move/from16 p1, v12

    move v12, v2

    move/from16 v2, p1

    move-object/from16 p1, v0

    move-object v9, v7

    move-object/from16 v7, v17

    const/4 v0, 0x6

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v12, v8

    invoke-static {v12, v2, v6, v5, v0}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v0

    iget-wide v12, v5, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v5, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v5, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    invoke-static {v2, v5, v2, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v5, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x650ee69b

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lyv0/e$b;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyv0/f;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v2, v3, v5, v4, v8}, Law0/e;->e(Lyv0/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_d
    const/4 v2, 0x1

    const/4 v4, 0x0

    invoke-static {v5, v4, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v3, p1

    goto :goto_9

    :cond_e
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, La01/i;

    const/4 v5, 0x7

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final d(Lyv0/e$b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Law0/e;->c(Lyv0/e$b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lyv0/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v0, -0x37c95599

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, p4, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v4, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :goto_3
    and-int/lit8 v7, v3, 0x13

    const/16 v8, 0x12

    const/4 v10, 0x1

    if-eq v7, v8, :cond_5

    move v7, v10

    goto :goto_4

    :cond_5
    const/4 v7, 0x0

    :goto_4
    and-int/2addr v3, v10

    invoke-virtual {v4, v3, v7}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_e

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_6

    move-object v5, v3

    goto :goto_5

    :cond_6
    move-object v5, v6

    :goto_5
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, Lb2/e;->K:Lb2/l;

    sget-object v12, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v12, v11, v4, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v4, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_7

    invoke-virtual {v4, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v4, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    move/from16 p2, v8

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v13, v4, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v4, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v7, v10

    const/16 v9, 0x8

    int-to-float v9, v9

    const/16 v13, 0x36

    invoke-static {v7, v9, v11, v4, v13}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v4, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v4, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v12, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    invoke-static {v10, v4, v10, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v4, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v2, v2

    int-to-float v1, v1

    mul-float/2addr v1, v2

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v0}, Lyv0/f;->a()Ly81/f;

    move-result-object v3

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v1, v7, v8, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v4, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Lyv0/f;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v4, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v1, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v2

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v24, v1, 0x12

    const v25, 0x2fffa

    const/4 v1, 0x0

    move-object/from16 v22, v4

    move-object v6, v5

    const-wide/16 v4, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v11, v9

    const-wide/16 v9, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v15, v13

    const-wide/16 v13, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    const/16 v19, 0x1

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v22

    const/4 v9, 0x1

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v1, v0

    const-wide/16 v5, 0x0

    cmpl-double v1, v1, v5

    if-lez v1, :cond_d

    goto :goto_8

    :cond_d
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v0, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lyv0/f;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lyv0/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lyv0/f;->e()Z

    move-result v2

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Law0/i;->b(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    move-object/from16 v8, v26

    goto :goto_9

    :cond_e
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v8, v6

    :goto_9
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v5, La01/i;

    const/16 v10, 0x8

    move-object/from16 v6, p0

    move/from16 v7, p3

    move/from16 v9, p4

    invoke-direct/range {v5 .. v10}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v5, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final f(Lyv0/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Law0/e;->e(Lyv0/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
