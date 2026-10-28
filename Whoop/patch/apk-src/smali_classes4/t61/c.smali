.class public abstract Lt61/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "Lu61/a;",
        "segments",
        "Li71/g;",
        "dataScroller",
        "Li71/h;",
        "scrollPosition",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Ljava/util/List;Li71/g;Li71/h;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ljava/util/List;Li71/g;Li71/h;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lt61/c;->e(Landroidx/compose/ui/Modifier;Ljava/util/List;Li71/g;Li71/h;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lt61/c;->d(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Ljava/util/List;Li71/g;Li71/h;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/util/List<",
            "Lu61/a;",
            ">;",
            "Li71/g;",
            "Li71/h;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v5, p5

    const-string v1, "segments"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v1, -0x212ac41

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v5, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_7

    and-int/lit8 v6, p6, 0x4

    if-nez v6, :cond_6

    and-int/lit16 v6, v5, 0x200

    if-nez v6, :cond_5

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_5
    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_3
    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v4, v6

    :cond_7
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_a

    and-int/lit8 v6, p6, 0x8

    if-nez v6, :cond_8

    move-object/from16 v6, p3

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x800

    goto :goto_5

    :cond_8
    move-object/from16 v6, p3

    :cond_9
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v4, v7

    goto :goto_6

    :cond_a
    move-object/from16 v6, p3

    :goto_6
    and-int/lit16 v7, v4, 0x493

    const/16 v8, 0x492

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v7, v8, :cond_b

    move v7, v13

    goto :goto_7

    :cond_b
    move v7, v12

    :goto_7
    and-int/lit8 v8, v4, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1e

    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v7, v5, 0x1

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_f

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lp1/q;->X()V

    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_d

    and-int/lit16 v4, v4, -0x381

    :cond_d
    and-int/lit8 v1, p6, 0x8

    if-eqz v1, :cond_e

    and-int/lit16 v4, v4, -0x1c01

    :cond_e
    move-object v9, v0

    move-object v8, v6

    goto :goto_9

    :cond_f
    :goto_8
    if-eqz v1, :cond_10

    move-object v3, v14

    :cond_10
    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_11

    new-instance v0, Li71/i;

    invoke-direct {v0}, Li71/i;-><init>()V

    and-int/lit16 v4, v4, -0x381

    :cond_11
    and-int/lit8 v1, p6, 0x8

    if-eqz v1, :cond_e

    new-instance v15, Li71/h;

    const/16 v23, 0xf

    const/16 v24, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v15 .. v24}, Li71/h;-><init>(JJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v4, v4, -0x1c01

    move-object v9, v0

    move-object v8, v15

    :goto_9
    invoke-virtual {v10}, Lp1/q;->r()V

    sget-object v0, Lb2/e;->G:Lb2/m;

    invoke-static {v0, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_12

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    invoke-static {v1, v10, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x552577a

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lu61/a;

    invoke-virtual {v7}, Lu61/a;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v7}, Lu61/a;->e()Li71/d;

    move-result-object v6

    invoke-interface {v9, v1, v8, v6}, Li71/g;->a(Ljava/util/List;Li71/h;Li71/d;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v7}, Lu61/a;->c()Lk61/a;

    move-result-object v6

    if-nez v6, :cond_15

    const v6, -0x3a2d24c5

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    :goto_c
    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_15
    const v11, -0x3a2d24c4

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    shr-int/lit8 v11, v4, 0x3

    and-int/lit16 v11, v11, 0x380

    shl-int/lit8 v15, v4, 0x3

    and-int/lit16 v15, v15, 0x1c00

    or-int/2addr v11, v15

    invoke-static/range {v6 .. v11}, Ls61/a;->c(Lk61/a;Lu61/a;Li71/h;Li71/g;Landroidx/compose/runtime/Composer;I)V

    goto :goto_c

    :goto_d
    invoke-virtual {v7}, Lu61/a;->f()Lk61/c;

    move-result-object v6

    if-nez v6, :cond_16

    const v6, -0x3a2ba905

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    move-object/from16 v16, v8

    move-object v15, v9

    goto :goto_e

    :cond_16
    const v11, -0x3a2ba904

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    shr-int/lit8 v11, v4, 0x3

    and-int/lit16 v11, v11, 0x380

    shl-int/lit8 v15, v4, 0x3

    and-int/lit16 v15, v15, 0x1c00

    or-int/2addr v11, v15

    invoke-static/range {v6 .. v11}, Ls61/c;->c(Lk61/c;Lu61/a;Li71/h;Li71/g;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v16, v8

    move-object v15, v9

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_e
    const v6, 0x55287ff

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_17
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lu61/e;

    invoke-virtual {v8}, Lu61/e;->d()Lu61/c;

    move-result-object v8

    if-eqz v8, :cond_18

    move v8, v13

    goto :goto_10

    :cond_18
    move v8, v12

    :goto_10
    if-eqz v8, :cond_17

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_19
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu61/e;

    invoke-virtual {v6}, Lu61/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v10, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lu61/e;->a()F

    move-result v8

    invoke-virtual {v6}, Lu61/e;->h()F

    move-result v9

    neg-float v9, v9

    sget-object v11, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v11}, Lp91/a$a;->a()Lp91/a;

    move-result-object v17

    const/16 v22, 0xd

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/high16 v19, -0x41000000    # -0.5f

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v17 .. v23}, Lp91/a;->f(Lp91/a;FFZZILjava/lang/Object;)Lp91/a;

    move-result-object v11

    invoke-static {v14, v8, v9, v11}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_1a

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v11, v9, :cond_1b

    :cond_1a
    new-instance v11, Le61/g;

    const/16 v9, 0x14

    invoke-direct {v11, v7, v9}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v13, v11}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v8, v6

    move-object v6, v7

    invoke-virtual {v8}, Lu61/e;->d()Lu61/c;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v8}, Lu61/e;->g()Lu61/d;

    move-result-object v8

    move-object v9, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lt61/b;->e(Landroidx/compose/ui/Modifier;Lu61/c;Lu61/d;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v9

    goto :goto_11

    :cond_1c
    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    move-object v9, v15

    move-object/from16 v8, v16

    goto/16 :goto_b

    :cond_1d
    move-object/from16 v16, v8

    move-object v15, v9

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object v1, v3

    move-object v3, v15

    move-object/from16 v4, v16

    goto :goto_12

    :cond_1e
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v3

    move-object v4, v6

    move-object v3, v0

    :goto_12
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v0, Lb11/c;

    const/4 v7, 0x7

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb11/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final d(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Ljava/util/List;Li71/g;Li71/h;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lt61/c;->c(Landroidx/compose/ui/Modifier;Ljava/util/List;Li71/g;Li71/h;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
