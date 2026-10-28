.class public abstract Ly51/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a=\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Ly51/c;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onClick",
        "f",
        "(Ly51/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "cta",
        "",
        "target",
        "i",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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

    invoke-static {p0}, Ly51/b;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ly51/b;->l(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly51/b;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Ly51/b;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ly51/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ly51/b;->h(Ly51/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ly51/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly51/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const v0, 0x556c84b2

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_4
    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v7, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v5, v7, :cond_5

    move v5, v10

    goto :goto_4

    :cond_5
    move v5, v9

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v6, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_c

    if-eqz v3, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_6

    new-instance v3, Ly41/b;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Ly41/b;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, v3

    goto :goto_5

    :cond_7
    move-object v5, p1

    :goto_5
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v2, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v10

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v3, v4, v6, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v11, v6, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-eqz v12, :cond_8

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v6, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v4, v6, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly51/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Ly51/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Ly51/c;->c()Ljava/lang/String;

    move-result-object v4

    shl-int/2addr v0, v7

    and-int/lit16 v7, v0, 0x1c00

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Ly51/b;->i(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v0, v5

    const v2, 0x4321d41d

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Ly51/c;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/u;

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_b
    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    move-object v3, v0

    goto :goto_8

    :cond_c
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, p1

    :goto_8
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_d

    new-instance v0, Lwq1/b;

    const/16 v5, 0x12

    move-object v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ly51/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ly51/b;->f(Ly51/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v3, p5

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v4, -0x3f2e846

    invoke-virtual {v15, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit8 v5, v3, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v3, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, p6, 0x8

    const/16 v7, 0x800

    if-eqz v5, :cond_7

    or-int/lit16 v4, v4, 0xc00

    :cond_6
    move-object/from16 v8, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v3, 0xc00

    if-nez v8, :cond_6

    move-object/from16 v8, p3

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move v9, v7

    goto :goto_4

    :cond_8
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v4, v9

    :goto_5
    and-int/lit16 v9, v4, 0x493

    const/16 v10, 0x492

    const/16 v30, 0x0

    const/4 v11, 0x1

    if-eq v9, v10, :cond_9

    move v9, v11

    goto :goto_6

    :cond_9
    move/from16 v9, v30

    :goto_6
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v15, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_13

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_a

    new-instance v5, Ly41/b;

    const/4 v8, 0x4

    invoke-direct {v5, v8}, Ly41/b;-><init>(I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v5, v8

    :goto_7
    sget-object v8, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v10, v12, v15, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v6, v15, Lp1/q;->S:Z

    if-eqz v6, :cond_c

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_8
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v15, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v15, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-nez v10, :cond_d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    :cond_d
    invoke-static {v12, v15, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v15, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v6, v4, 0xe

    invoke-static {v1, v15, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v8, v15, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->L()Lb91/a;

    move-result-object v24

    invoke-virtual {v8, v15, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b1()J

    move-result-wide v12

    const/16 v28, 0x0

    const v29, 0x2fffa

    move-object v10, v5

    const/4 v5, 0x0

    move-object v14, v8

    move-object/from16 v16, v9

    const-wide/16 v8, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v7

    move-wide/from16 v37, v12

    move v13, v4

    move-object v4, v6

    move-wide/from16 v6, v37

    const/4 v12, 0x0

    move/from16 v20, v13

    move-object/from16 v21, v14

    const-wide/16 v13, 0x0

    move-object/from16 v26, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    const/16 v16, 0x0

    move-object/from16 v23, v17

    move/from16 v25, v18

    const-wide/16 v17, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move/from16 v31, v20

    const/16 v20, 0x0

    move-object/from16 v32, v21

    const/16 v21, 0x0

    move-object/from16 v33, v22

    const/16 v22, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v36, v27

    const/16 v27, 0x0

    move/from16 v1, v31

    move-object/from16 v0, v33

    move/from16 v3, v36

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v26

    new-instance v6, Ly71/g;

    invoke-static/range {v32 .. v32}, Lih0/d0;->E(Lx81/d;)I

    move-result v4

    invoke-direct {v6, v4, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    and-int/lit16 v4, v1, 0x1c00

    if-ne v4, v3, :cond_f

    const/4 v11, 0x1

    goto :goto_9

    :cond_f
    move/from16 v11, v30

    :goto_9
    and-int/lit16 v3, v1, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_10

    const/16 v30, 0x1

    :cond_10
    or-int v3, v11, v30

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_12

    if-ne v4, v0, :cond_11

    goto :goto_a

    :cond_11
    move-object/from16 v3, p2

    move-object/from16 v10, v34

    goto :goto_b

    :cond_12
    :goto_a
    new-instance v4, La23/c;

    const/16 v0, 0x8

    move-object/from16 v3, p2

    move-object/from16 v10, v34

    invoke-direct {v4, v10, v3, v0}, La23/c;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    move-object v14, v4

    check-cast v14, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v1, 0x3

    and-int/lit16 v0, v0, 0x380

    const/16 v17, 0x0

    const/16 v18, 0xfeb

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v34, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v4, p1

    move/from16 v16, v0

    invoke-static/range {v2 .. v18}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, v34

    goto :goto_c

    :cond_13
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v4, v8

    :goto_c
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lw71/k;

    const/16 v7, 0xc

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final j(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Ly51/b;->i(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
