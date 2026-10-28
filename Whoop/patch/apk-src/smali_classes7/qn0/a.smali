.class public abstract Lqn0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "Lnn0/b;",
        "items",
        "Ll83/a0;",
        "c",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "item",
        "e",
        "(Lnn0/b;Landroidx/compose/runtime/Composer;I)V",
        "challenge-details_release"
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
.method public static synthetic a(Lnn0/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqn0/a;->f(Lnn0/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqn0/a;->d(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnn0/b;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "items"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p1

    check-cast v13, Lp1/q;

    const v2, -0x17ec3acd

    invoke-virtual {v13, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v4, v3, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    and-int/2addr v2, v6

    invoke-virtual {v13, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    int-to-float v2, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v8, v2, v4

    const/4 v9, 0x0

    const/4 v12, 0x2

    sget-object v7, Lb2/t;->w:Lb2/t;

    move v10, v8

    move v11, v8

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v4, v8

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->a1()J

    move-result-wide v8

    sget-object v10, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v10}, Lkd1/w;->a()Lk91/a;

    move-result-object v10

    invoke-virtual {v10}, Lk91/a;->c()Lt0/i;

    move-result-object v10

    invoke-static {v2, v8, v9, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v13, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_3
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v13, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v13, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    invoke-static {v9, v13, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v13, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x6b396064

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v8, v5

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v16, v8, 0x1

    if-ltz v8, :cond_7

    check-cast v9, Lnn0/b;

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v13, v10}, Lqn0/a;->e(Lnn0/b;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    sub-int/2addr v9, v6

    if-ge v8, v9, :cond_6

    const v8, -0x74399c61

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-static {v7, v4, v8, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v14, 0x6

    const/16 v15, 0xfe

    move v9, v4

    const/4 v4, 0x0

    move v10, v5

    const/4 v5, 0x0

    move v11, v6

    const/4 v6, 0x0

    move-object v12, v7

    const/4 v7, 0x0

    move/from16 v18, v3

    move-object v3, v8

    move/from16 v17, v9

    const-wide/16 v8, 0x0

    move/from16 v19, v10

    move/from16 v20, v11

    const-wide/16 v10, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 p1, v2

    move/from16 v2, v19

    move/from16 v0, v20

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    move-object/from16 p1, v2

    move/from16 v18, v3

    move/from16 v17, v4

    move v2, v5

    move v0, v6

    move-object/from16 v21, v7

    const v3, -0x74379a18

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_5
    move v6, v0

    move v5, v2

    move/from16 v8, v16

    move/from16 v4, v17

    move/from16 v3, v18

    move-object/from16 v7, v21

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    goto :goto_4

    :cond_7
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_8
    move v2, v5

    move v0, v6

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v2, Lbm0/o;

    const/16 v3, 0x12

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v1, v3}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final d(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lqn0/a;->c(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lnn0/b;Landroidx/compose/runtime/Composer;I)V
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x2ddbc27e

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    or-int v2, p2, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p2

    :goto_2
    and-int/lit8 v5, v2, 0x3

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v5, v4, :cond_3

    move v5, v11

    goto :goto_3

    :cond_3
    move v5, v10

    :goto_3
    and-int/2addr v2, v11

    invoke-virtual {v7, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v13, v5

    mul-float/2addr v4, v13

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    mul-float/2addr v4, v13

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/16 v6, 0x36

    invoke-static {v4, v5, v7, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v7, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v5, v7, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v7, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x5

    int-to-float v2, v2

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lnn0/b;->a()Lgz0/m0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    const/4 v8, 0x6

    invoke-static {v3, v7, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    invoke-virtual {v0}, Lnn0/b;->b()Ly81/f;

    move-result-object v8

    invoke-virtual {v8, v7, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    move-object/from16 v16, v5

    move-wide/from16 v37, v8

    move-object v9, v6

    move-wide/from16 v5, v37

    const/16 v8, 0x1b0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v18, v4

    move-object v4, v2

    move-object v2, v3

    const/4 v3, 0x0

    move-object/from16 v29, v16

    move-object/from16 v28, v17

    move-object/from16 v11, v18

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, v7, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_7

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v7, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-nez v2, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    move-object/from16 v9, v28

    goto :goto_7

    :cond_9
    :goto_6
    move-object/from16 v2, v29

    goto :goto_8

    :goto_7
    invoke-static {v3, v7, v3, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_6

    :goto_8
    invoke-static {v7, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnn0/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v7, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v26, v6, 0x12

    const v27, 0x2fffa

    move v6, v3

    const/4 v3, 0x0

    move v11, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move v14, v5

    move-wide/from16 v37, v8

    move-object v9, v4

    move-wide/from16 v4, v37

    const/4 v8, 0x0

    move-object v15, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v17, v11

    move-object/from16 v18, v12

    const-wide/16 v11, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    move/from16 v23, v16

    const-wide/16 v15, 0x0

    move/from16 v25, v17

    const/16 v17, 0x0

    move-object/from16 v28, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move/from16 v30, v20

    const/16 v20, 0x0

    move-object/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move/from16 v33, v25

    const/16 v25, 0x0

    move-object/from16 v36, v28

    move/from16 v0, v29

    move/from16 v35, v30

    move-object/from16 v34, v31

    move/from16 v1, v32

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual/range {p0 .. p0}, Lnn0/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_a

    const v0, 0x3d712b62

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_9
    const/4 v0, 0x1

    goto :goto_a

    :cond_a
    const v3, 0x3d712b63

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    move-object/from16 v4, v36

    invoke-static {v3, v0, v4, v7}, Ld;->w(FFLb2/t;Lp1/q;)V

    move/from16 v6, v33

    invoke-static {v2, v7, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v15, v34

    move/from16 v14, v35

    invoke-virtual {v15, v7, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v15, v7, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    const/16 v25, 0x0

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_a
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_b
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v1, Los0/d;

    const/16 v2, 0x13

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final f(Lnn0/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lqn0/a;->e(Lnn0/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
