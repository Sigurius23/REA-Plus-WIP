.class public abstract Lgp2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0004*\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lep2/c$b;",
        "viewState",
        "Lkotlin/Function1;",
        "Lep2/a;",
        "Ll83/a0;",
        "onEvent",
        "j",
        "(Lep2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ll0/u;",
        "g",
        "(Ll0/u;Lep2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "universal-checkout_release"
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
.method public static synthetic a(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgp2/c;->l(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgp2/c;->m(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgp2/c;->h(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ll0/u;Lep2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgp2/c;->i(Ll0/u;Lep2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lep2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgp2/c;->n(Lep2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgp2/c;->k(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ll0/u;Lep2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/u;",
            "Lep2/c$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move/from16 v1, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x5a3f7eed

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_4

    and-int/lit8 v6, v1, 0x40

    if-nez v6, :cond_2

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_2
    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit16 v6, v1, 0x180

    const/16 v8, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v9, 0x92

    const/4 v13, 0x0

    const/4 v11, 0x1

    if-eq v6, v9, :cond_7

    move v6, v11

    goto :goto_5

    :cond_7
    move v6, v13

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v10, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v4}, Lep2/c$b;->d()Lsz0/q0;

    move-result-object v6

    invoke-virtual {v6}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v6

    instance-of v6, v6, Lsz0/p0$b;

    if-eqz v6, :cond_d

    const v6, 0x43164e39

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    and-int/lit8 v6, v0, 0x70

    if-eq v6, v7, :cond_9

    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_8

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_6

    :cond_8
    move v6, v13

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
    move v0, v13

    :goto_8
    or-int/2addr v0, v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_b

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v6, v0, :cond_c

    :cond_b
    new-instance v6, Lgp2/b;

    const/4 v0, 0x3

    invoke-direct {v6, v4, v5, v0}, Lgp2/b;-><init>(Lep2/c$b;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lc93/a;

    sget-object v0, Lb2/t;->w:Lb2/t;

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-interface {v3, v0, v7}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    int-to-float v0, v11

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v15, v0, v7

    int-to-float v0, v2

    mul-float v16, v0, v7

    const/16 v18, 0x0

    const/16 v19, 0xc

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v0, Lgp2/a;->a:Lgp2/a;

    invoke-virtual {v0}, Lgp2/a;->b()Lc93/m;

    move-result-object v9

    const/16 v11, 0x6000

    const/16 v12, 0xc

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    const v0, 0x431dc135

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lcy1/b;

    const/16 v2, 0x19

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final h(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lep2/c$b;->a()Lep2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ll0/u;Lep2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lgp2/c;->g(Ll0/u;Lep2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lep2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lep2/c$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, -0x5d32ad36

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v5, v8, :cond_5

    move v5, v9

    goto :goto_4

    :cond_5
    move v5, v10

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v7, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_19

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v7, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v7, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-nez v12, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    :cond_7
    invoke-static {v11, v7, v11, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v7, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0xe62a08e

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lep2/c$b;->d()Lsz0/q0;

    move-result-object v5

    invoke-virtual {v5}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v8

    instance-of v8, v8, Lsz0/p0$h;

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_e

    const v8, 0x676c742a

    invoke-static {v7, v8, v5}, Lvl/b;->d(Lp1/q;ILsz0/q0;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    and-int/lit8 v8, v3, 0xe

    if-eq v8, v4, :cond_a

    and-int/lit8 v4, v3, 0x8

    if-eqz v4, :cond_9

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_6

    :cond_9
    move v4, v10

    goto :goto_7

    :cond_a
    :goto_6
    move v4, v9

    :goto_7
    and-int/lit8 v8, v3, 0x70

    if-ne v8, v6, :cond_b

    move v6, v9

    goto :goto_8

    :cond_b
    move v6, v10

    :goto_8
    or-int/2addr v4, v6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_c

    if-ne v6, v11, :cond_d

    :cond_c
    new-instance v6, Lgp2/b;

    const/4 v4, 0x0

    invoke-direct {v6, v0, v1, v4}, Lgp2/b;-><init>(Lep2/c$b;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v16, v6

    check-cast v16, Lc93/a;

    new-instance v12, Lsz0/p0$h;

    const-wide/16 v14, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lsz0/q0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v4, Lsz0/p0$h;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v17, v4, v6

    const/16 v18, 0x0

    const/16 v19, 0xffc

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v4, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v14, v4

    move-object v4, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 p2, v3

    move/from16 v3, v21

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v16

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_e
    move/from16 p2, v3

    move v3, v10

    const v5, 0x67718951

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lep2/c$b;->d()Lsz0/q0;

    move-result-object v5

    and-int/lit8 v8, p2, 0xe

    if-eq v8, v4, :cond_10

    and-int/lit8 v9, p2, 0x8

    if-eqz v9, :cond_f

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    goto :goto_9

    :cond_f
    move v9, v3

    goto :goto_a

    :cond_10
    :goto_9
    const/4 v9, 0x1

    :goto_a
    and-int/lit8 v10, p2, 0x70

    if-ne v10, v6, :cond_11

    const/4 v12, 0x1

    goto :goto_b

    :cond_11
    move v12, v3

    :goto_b
    or-int/2addr v9, v12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_12

    if-ne v12, v11, :cond_13

    :cond_12
    new-instance v12, Lgp2/b;

    const/4 v9, 0x1

    invoke-direct {v12, v0, v1, v9}, Lgp2/b;-><init>(Lep2/c$b;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v12, Lc93/a;

    if-eq v8, v4, :cond_15

    and-int/lit8 v4, p2, 0x8

    if-eqz v4, :cond_14

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    goto :goto_c

    :cond_14
    move v9, v3

    goto :goto_d

    :cond_15
    :goto_c
    const/4 v9, 0x1

    :goto_d
    if-ne v10, v6, :cond_16

    const/4 v4, 0x1

    goto :goto_e

    :cond_16
    move v4, v3

    :goto_e
    or-int/2addr v4, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_17

    if-ne v6, v11, :cond_18

    :cond_17
    new-instance v6, Lgp2/b;

    const/4 v4, 0x2

    invoke-direct {v6, v0, v1, v4}, Lgp2/b;-><init>(Lep2/c$b;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v6, Lc93/a;

    sget v8, Lsz0/q0;->k:I

    const/4 v9, 0x0

    move-object v4, v5

    move-object v5, v12

    invoke-static/range {v4 .. v9}, Lsz0/n0;->p(Lsz0/q0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    shl-int/lit8 v3, p2, 0x3

    and-int/lit8 v4, v3, 0x70

    const/4 v5, 0x6

    or-int/2addr v4, v5

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v4

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-static {v4, v0, v1, v7, v3}, Lgp2/c;->g(Ll0/u;Lep2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v14, 0x1

    invoke-virtual {v7, v14}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_19
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_1a

    new-instance v4, Lf01/b;

    const/16 v5, 0xa

    invoke-direct {v4, v0, v1, v2, v5}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final k(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lep2/c$b;->b()Lep2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lep2/c$b;->b()Lep2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lep2/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lep2/c$b;->c()Lep2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lep2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lgp2/c;->j(Lep2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
