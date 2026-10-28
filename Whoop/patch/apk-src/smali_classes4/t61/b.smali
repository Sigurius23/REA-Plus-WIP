.class public abstract Lt61/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a+\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lu61/c;",
        "circleState",
        "Lu61/d;",
        "labelState",
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/ui/Modifier;Lu61/c;Lu61/d;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "textOffset",
        "g",
        "(Lu61/d;FLandroidx/compose/runtime/Composer;I)V",
        "",
        "drawBackground",
        "j",
        "(FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;",
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
.method public static synthetic a(Lu61/d;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt61/b;->i(Lu61/d;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lu61/d;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt61/b;->h(Lu61/d;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lu61/c;Lu61/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lt61/b;->f(Landroidx/compose/ui/Modifier;Lu61/c;Lu61/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lt61/b;->k(JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lu61/c;Lu61/d;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "circleState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x2542a2b

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v4

    goto :goto_1

    :cond_2
    move v1, v4

    :goto_1
    and-int/lit8 v2, v4, 0x30

    if-nez v2, :cond_5

    and-int/lit8 v2, v4, 0x40

    if-nez v2, :cond_3

    invoke-virtual {v10, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_3
    invoke-virtual {v10, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_3

    :cond_4
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v4, 0x180

    if-nez v2, :cond_8

    and-int/lit16 v2, v4, 0x200

    if-nez v2, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_4

    :cond_6
    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_4
    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_5

    :cond_7
    const/16 v2, 0x80

    :goto_5
    or-int/2addr v1, v2

    :cond_8
    and-int/lit16 v2, v1, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x0

    const/4 v13, 0x1

    if-eq v2, v5, :cond_9

    move v2, v13

    goto :goto_6

    :cond_9
    move v2, v6

    :goto_6
    and-int/2addr v1, v13

    invoke-virtual {v10, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v0, :cond_a

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_a
    sget-object v0, Lb2/e;->E:Lb2/m;

    invoke-static {v0, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v1, v10, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v10, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_b

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v10, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v10, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    invoke-static {v1, v10, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lu61/c;->d()F

    move-result v8

    invoke-virtual {p1}, Lu61/c;->b()Ly81/e;

    move-result-object v0

    if-nez v0, :cond_e

    const v0, -0x9cce823

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_8

    :cond_e
    const v1, -0x4aa3835c

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-interface {v0, v10, v6}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v0

    invoke-static {v10, v6, v0, v1}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v0

    :goto_8
    if-nez v0, :cond_f

    const v0, -0x4aa37e45

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-static {v0, v10, v1, v6}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    goto :goto_9

    :cond_f
    const v1, -0x4aa38589

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    iget-wide v0, v0, Li2/x;->a:J

    :goto_9
    if-nez v3, :cond_10

    const v2, -0x9cbc8a9

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    const v2, -0x9cbc8a8

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    int-to-float v2, v13

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v2, v5

    add-float/2addr v2, v8

    invoke-static {v3, v2, v10, v6}, Lt61/b;->g(Lu61/d;FLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {p1}, Lu61/c;->c()Lu61/b;

    move-result-object v9

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v5, 0x0

    move-wide v6, v0

    invoke-static/range {v5 .. v12}, Lt61/f;->c(Landroidx/compose/ui/Modifier;JFLu61/b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_b
    move-object v1, p0

    goto :goto_c

    :cond_11
    invoke-virtual {v10}, Lp1/q;->X()V

    goto :goto_b

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_12

    new-instance v0, Laz0/a;

    const/16 v6, 0x9

    move-object v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Laz0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lu61/c;Lu61/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lt61/b;->e(Landroidx/compose/ui/Modifier;Lu61/c;Lu61/d;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lu61/d;FLandroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x28608fcd

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, v2, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v2

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v3, v1}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    move v5, v8

    :goto_4
    and-int/2addr v4, v7

    invoke-virtual {v3, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v0}, Lu61/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_9

    new-instance v4, Lt61/a;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v1, v2, v5}, Lt61/a;-><init>(Lu61/d;FII)V

    :goto_5
    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_6
    invoke-virtual {v0}, Lu61/d;->a()Ly81/e;

    move-result-object v4

    invoke-interface {v4, v3, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-virtual {v0}, Lu61/d;->b()Z

    move-result v4

    if-eqz v4, :cond_7

    move v4, v1

    goto :goto_6

    :cond_7
    neg-float v4, v1

    :goto_6
    invoke-virtual {v0}, Lu61/d;->d()Z

    move-result v7

    invoke-static {v4, v7, v3, v8}, Lt61/b;->j(FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lu61/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v3, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v8, v3, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->E()Lb91/a;

    move-result-object v23

    const/16 v27, 0x0

    const v28, 0x2fff8

    move-object/from16 v25, v3

    move-object v3, v7

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

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_7

    :cond_8
    move-object/from16 v25, v3

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    :goto_7
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_9

    new-instance v4, Lt61/a;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v1, v2, v5}, Lt61/a;-><init>(Lu61/d;FII)V

    goto :goto_5

    :cond_9
    return-void
.end method

.method private static final h(Lu61/d;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lt61/b;->g(Lu61/d;FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lu61/d;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lt61/b;->g(Lu61/d;FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 6

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    check-cast p2, Lp1/q;

    const p1, -0x678ff49e

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {p1, p2, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->o()J

    move-result-wide v4

    const p1, 0x3ecccccd    # 0.4f

    invoke-static {p1, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-static {p3, v3, p0, v2}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p2, v4, v5}, Lp1/q;->f(J)Z

    move-result p1

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p3, p1, :cond_1

    :cond_0
    new-instance p3, Lcom/whoop/data/local/room/dao/persistent/d;

    const/4 p1, 0x3

    invoke-direct {p3, v4, v5, p1}, Lcom/whoop/data/local/room/dao/persistent/d;-><init>(JI)V

    invoke-virtual {p2, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p3, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p3}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    int-to-float p1, v1

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    return-object p0

    :cond_2
    check-cast p2, Lp1/q;

    const p1, -0x678bfd3f

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    invoke-static {p3, v3, p0, v2}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    int-to-float p1, v1

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final k(JLk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$drawBehind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v4, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long v8, v2, v4

    const/4 v11, 0x0

    const/16 v12, 0xf6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    move-wide v2, p0

    move-object v1, p2

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
