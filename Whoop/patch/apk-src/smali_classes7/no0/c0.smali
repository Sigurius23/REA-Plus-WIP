.class public abstract Lno0/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0004*\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Llo0/b0$a;",
        "viewState",
        "Lkotlin/Function1;",
        "Llo0/z;",
        "Ll83/a0;",
        "onEvent",
        "k",
        "(Llo0/b0$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ll0/u;",
        "h",
        "(Ll0/u;Llo0/b0$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "clinician-in-the-loop_release"
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
.method public static synthetic a(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/c0;->m(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llo0/b0$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/c0;->p(Llo0/b0$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/c0;->i(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ll0/u;Llo0/b0$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/c0;->j(Ll0/u;Llo0/b0$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/c0;->o(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/c0;->n(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llo0/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lno0/c0;->l(Llo0/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ll0/u;Llo0/b0$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/u;",
            "Llo0/b0$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x674d74e4

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v5, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_4

    and-int/lit8 v6, v4, 0x40

    if-nez v6, :cond_2

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_2
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    const/16 v8, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v8

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_6
    and-int/lit16 v6, v0, 0x93

    const/16 v10, 0x92

    const/4 v12, 0x0

    const/4 v11, 0x1

    if-eq v6, v10, :cond_7

    move v6, v11

    goto :goto_5

    :cond_7
    move v6, v12

    :goto_5
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v9, v10, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v2}, Llo0/b0$a;->d()Lsz0/q0;

    move-result-object v6

    invoke-virtual {v6}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v6

    instance-of v6, v6, Lsz0/p0$b;

    if-eqz v6, :cond_d

    const v6, 0x6eb931ec

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    and-int/lit8 v6, v0, 0x70

    if-eq v6, v7, :cond_9

    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_8

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_6

    :cond_8
    move v6, v12

    goto :goto_7

    :cond_9
    :goto_6
    move v6, v11

    :goto_7
    and-int/lit16 v0, v0, 0x380

    if-ne v0, v8, :cond_a

    move v0, v11

    goto :goto_8

    :cond_a
    move v0, v12

    :goto_8
    or-int/2addr v0, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_b

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v6, v0, :cond_c

    :cond_b
    new-instance v6, Lno0/b0;

    const/4 v0, 0x3

    invoke-direct {v6, v2, v3, v0}, Lno0/b0;-><init>(Llo0/b0$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lc93/a;

    sget-object v0, Lb2/t;->w:Lb2/t;

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-interface {v1, v0, v7}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    int-to-float v0, v11

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v14, v0, v7

    int-to-float v0, v5

    mul-float v15, v0, v7

    const/16 v17, 0x0

    const/16 v18, 0xc

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lno0/t0;->a:Lno0/t0;

    invoke-virtual {v5}, Lno0/t0;->b()Lc93/m;

    move-result-object v8

    const/16 v10, 0x6000

    const/16 v11, 0xc

    const/4 v7, 0x0

    move-object v5, v6

    move-object v6, v0

    invoke-static/range {v5 .. v11}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    const v0, 0x6ec07f5e

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Ll72/n;

    const/16 v5, 0x14

    invoke-direct/range {v0 .. v5}, Ll72/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final i(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Llo0/b0$a;->a()Llo0/z;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ll0/u;Llo0/b0$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lno0/c0;->h(Ll0/u;Llo0/b0$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Llo0/b0$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo0/b0$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v0, -0xb1737c8

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v4

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_6

    move v6, v8

    goto :goto_5

    :cond_6
    move v6, v9

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v14, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1c

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_7

    new-instance v3, Ln72/b;

    const/16 v5, 0x10

    invoke-direct {v3, v5}, Ln72/b;-><init>(I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v3, v5

    :goto_6
    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v14, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v14, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v14, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-nez v11, :cond_a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    :cond_a
    invoke-static {v10, v14, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v14, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, -0x5e772f04

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Llo0/b0$a;->d()Lsz0/q0;

    move-result-object v5

    invoke-virtual {v5}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v7

    instance-of v7, v7, Lsz0/p0$h;

    if-eqz v7, :cond_11

    const v7, 0x55e5f73c

    invoke-static {v14, v7, v5}, Lvl/b;->d(Lp1/q;ILsz0/q0;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    and-int/lit8 v7, v0, 0xe

    if-eq v7, v2, :cond_d

    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_c

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_8

    :cond_c
    move v2, v9

    goto :goto_9

    :cond_d
    :goto_8
    move v2, v8

    :goto_9
    and-int/lit8 v7, v0, 0x70

    if-ne v7, v4, :cond_e

    move v4, v8

    goto :goto_a

    :cond_e
    move v4, v9

    :goto_a
    or-int/2addr v2, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_f

    if-ne v4, v6, :cond_10

    :cond_f
    new-instance v4, Lno0/b0;

    const/4 v2, 0x0

    invoke-direct {v4, v1, v3, v2}, Lno0/b0;-><init>(Llo0/b0$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v19, v4

    check-cast v19, Lc93/a;

    new-instance v15, Lsz0/p0$h;

    const-wide/16 v17, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v21}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lsz0/q0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v4, Lsz0/p0$h;->h:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int/2addr v4, v5

    const/16 v16, 0x0

    const/16 v17, 0xffc

    move-object v5, v3

    move-object v3, v2

    move-object v2, v15

    move v15, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    move v11, v8

    const/4 v8, 0x0

    move v12, v9

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v20, v13

    const/4 v13, 0x0

    move/from16 p2, v0

    move/from16 v0, v19

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object/from16 v13, v20

    goto/16 :goto_13

    :cond_11
    move/from16 p2, v0

    move-object/from16 v20, v3

    move v0, v9

    const v3, 0x55eb0c63

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Llo0/b0$a;->d()Lsz0/q0;

    move-result-object v3

    and-int/lit8 v5, p2, 0xe

    if-eq v5, v2, :cond_13

    and-int/lit8 v7, p2, 0x8

    if-eqz v7, :cond_12

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    goto :goto_b

    :cond_12
    move v8, v0

    goto :goto_c

    :cond_13
    :goto_b
    const/4 v8, 0x1

    :goto_c
    and-int/lit8 v7, p2, 0x70

    if-ne v7, v4, :cond_14

    const/4 v9, 0x1

    goto :goto_d

    :cond_14
    move v9, v0

    :goto_d
    or-int/2addr v8, v9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_16

    if-ne v9, v6, :cond_15

    goto :goto_e

    :cond_15
    move-object/from16 v13, v20

    goto :goto_f

    :cond_16
    :goto_e
    new-instance v9, Lno0/b0;

    const/4 v8, 0x1

    move-object/from16 v13, v20

    invoke-direct {v9, v1, v13, v8}, Lno0/b0;-><init>(Llo0/b0$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v9, Lc93/a;

    if-eq v5, v2, :cond_18

    and-int/lit8 v2, p2, 0x8

    if-eqz v2, :cond_17

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    goto :goto_10

    :cond_17
    move v8, v0

    goto :goto_11

    :cond_18
    :goto_10
    const/4 v8, 0x1

    :goto_11
    if-ne v7, v4, :cond_19

    const/4 v2, 0x1

    goto :goto_12

    :cond_19
    move v2, v0

    :goto_12
    or-int/2addr v2, v8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1a

    if-ne v4, v6, :cond_1b

    :cond_1a
    new-instance v4, Lno0/b0;

    const/4 v2, 0x2

    invoke-direct {v4, v1, v13, v2}, Lno0/b0;-><init>(Llo0/b0$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v4, Lc93/a;

    sget v6, Lsz0/q0;->k:I

    const/4 v7, 0x0

    move-object v2, v3

    move-object v3, v9

    move-object v5, v14

    invoke-static/range {v2 .. v7}, Lsz0/n0;->p(Lsz0/q0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    shl-int/lit8 v0, p2, 0x3

    and-int/lit8 v2, v0, 0x70

    const/4 v3, 0x6

    or-int/2addr v2, v3

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v2

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-static {v2, v1, v13, v14, v0}, Lno0/c0;->h(Ll0/u;Llo0/b0$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v11, 0x1

    invoke-virtual {v14, v11}, Lp1/q;->q(Z)V

    move-object v3, v13

    goto :goto_14

    :cond_1c
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v5

    :goto_14
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1d

    new-instance v0, Llq2/c;

    const/16 v5, 0x19

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final l(Llo0/z;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Llo0/b0$a;->b()Llo0/z;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Llo0/b0$a;->b()Llo0/z;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Llo0/b0$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Llo0/b0$a;->c()Llo0/z;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Llo0/b0$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lno0/c0;->k(Llo0/b0$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
