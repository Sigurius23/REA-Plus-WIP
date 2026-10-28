.class public abstract Lm21/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lm21/d;",
        "state",
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/ui/Modifier;Lm21/d;Landroidx/compose/runtime/Composer;II)V",
        "Lm21/a;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lm21/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lm21/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm21/c;->d(Landroidx/compose/ui/Modifier;Lm21/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lm21/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm21/c;->f(Landroidx/compose/ui/Modifier;Lm21/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lm21/a;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, 0x1cd8d978

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p4, 0x1

    if-eqz p2, :cond_0

    or-int/lit8 v0, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_2
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_3

    :cond_5
    move v1, v3

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz p2, :cond_6

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_6
    move-object v2, p0

    invoke-virtual {p1}, Lm21/a;->b()Lgz0/m0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    const/4 p2, 0x6

    invoke-static {p0, v5, p2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object p0

    invoke-virtual {p1}, Lm21/a;->a()Ly81/f;

    move-result-object v1

    invoke-virtual {v1, v5, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    shl-int/lit8 p2, v0, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/lit8 v6, p2, 0x30

    const/4 v7, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v7, v2

    goto :goto_4

    :cond_7
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v7, p0

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance v6, Llq2/c;

    const/4 v11, 0x6

    move-object v8, p1

    move v9, p3

    move/from16 v10, p4

    invoke-direct/range {v6 .. v11}, Llq2/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v6, p0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final d(Landroidx/compose/ui/Modifier;Lm21/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lm21/c;->c(Landroidx/compose/ui/Modifier;Lm21/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lm21/d;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0xd323faa

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    const/4 v3, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_3

    :cond_5
    move v6, v8

    :goto_3
    and-int/2addr v5, v9

    invoke-virtual {v0, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_6

    move-object v1, v5

    goto :goto_4

    :cond_6
    move-object v1, v4

    :goto_4
    sget-object v4, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v4, v0, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v6, v0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v0, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v6, v0, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm21/d;->a()Ljava/util/List;

    move-result-object v4

    const/4 v6, 0x6

    if-nez v4, :cond_a

    const v4, -0xee1c814

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    :goto_6
    move v4, v3

    goto :goto_8

    :cond_a
    const v7, -0xee1c813

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    const v7, 0x4195a270

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm21/a;

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v10, v10

    int-to-float v11, v3

    mul-float/2addr v10, v11

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const-wide/high16 v12, 0x4004000000000000L    # 2.5

    double-to-float v12, v12

    mul-float/2addr v12, v11

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10, v7, v0, v6, v8}, Lm21/c;->c(Landroidx/compose/ui/Modifier;Lm21/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_b
    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v10

    int-to-float v7, v3

    invoke-static {v4, v7, v5, v0, v8}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_6

    :goto_8
    invoke-virtual {v2}, Lm21/d;->c()Ljava/lang/String;

    move-result-object v3

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    invoke-virtual {v7, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v27, 0x0

    const v28, 0x2fffa

    move v12, v4

    const/4 v4, 0x0

    move-object v13, v7

    move v14, v8

    const-wide/16 v7, 0x0

    move v15, v9

    const/4 v9, 0x0

    move/from16 v16, v6

    move-wide/from16 v34, v10

    move-object v11, v5

    move-wide/from16 v5, v34

    const/4 v10, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    move-object/from16 v18, v13

    const-wide/16 v12, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    move-object/from16 v22, v17

    const-wide/16 v16, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move-object/from16 v31, v22

    const/16 v22, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v2, v25

    move-object/from16 v25, v0

    move-object v0, v2

    move/from16 v2, v29

    move-object/from16 v29, v1

    move-object/from16 v1, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {p1 .. p1}, Lm21/d;->b()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_c

    const v0, -0xeda34e2

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    goto :goto_9

    :cond_c
    const v5, -0xeda34e1

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x1

    int-to-float v6, v5

    const/4 v12, 0x4

    int-to-float v7, v12

    invoke-static {v6, v7, v1, v3}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/4 v1, 0x6

    invoke-virtual {v0, v3, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    const/16 v27, 0x0

    const v28, 0x2fffa

    move-object/from16 v25, v3

    move-object v3, v4

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-wide/from16 v34, v0

    move v0, v5

    move-wide/from16 v5, v34

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, v29

    goto :goto_a

    :cond_d
    move-object v3, v0

    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v1, v4

    :goto_a
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Llq2/c;

    const/4 v5, 0x5

    move-object/from16 v2, p1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lm21/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lm21/c;->e(Landroidx/compose/ui/Modifier;Lm21/d;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
