.class public abstract Lzc1/z4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/z4;->e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/z4;->d()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v0, p1

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    const v1, -0x532f5904

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v0, :cond_0

    move v1, v14

    goto :goto_0

    :cond_0
    move v1, v13

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v10, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "Metric Education "

    const/4 v15, 0x6

    invoke-static {v1, v10, v15}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v10, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v10, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x74787aac

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-static {v10, v13}, Lr21/b;->a(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr21/c;

    move v4, v2

    invoke-virtual {v1}, Lr21/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object v5, v1

    move-object v1, v3

    invoke-virtual {v5}, Lr21/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move v6, v4

    invoke-virtual {v5}, Lr21/c;->f()Lr21/a;

    move-result-object v4

    invoke-virtual {v5}, Lr21/c;->c()Ly71/g;

    move-result-object v7

    if-eqz v7, :cond_4

    new-instance v8, Lkd1/o$a;

    invoke-virtual {v7}, Ly71/g;->b()I

    move-result v7

    invoke-direct {v8, v7}, Lkd1/o$a;-><init>(I)V

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    :goto_3
    invoke-virtual {v5}, Lr21/c;->b()Z

    move-result v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v7, v9, :cond_5

    new-instance v7, Lz91/a;

    const/16 v9, 0x14

    invoke-direct {v7, v9}, Lz91/a;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v9, v7

    check-cast v9, Lc93/a;

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v7, 0x3

    const v12, 0x6000006

    or-int/2addr v11, v12

    shl-int/2addr v7, v15

    or-int/2addr v7, v11

    sget v11, Lkd1/o$a;->c:I

    shl-int/lit8 v11, v11, 0xc

    or-int/2addr v11, v7

    const/16 v12, 0xc0

    const/4 v7, 0x0

    move/from16 v17, v6

    move v6, v5

    move-object v5, v8

    const/4 v8, 0x0

    move/from16 v15, v17

    invoke-static/range {v1 .. v12}, Lr21/f;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    int-to-float v2, v14

    invoke-static {v2, v15, v1, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    move-object v3, v1

    move v2, v15

    const/4 v15, 0x6

    goto :goto_2

    :cond_6
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Lzc1/s3;

    const/16 v3, 0x1d

    invoke-direct {v2, v0, v3}, Lzc1/s3;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final d()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/z4;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
