.class public abstract Lzc1/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "k",
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
.method public static synthetic a(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n1;->q(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n1;->t(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n1;->r(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n1;->m(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n1;->l(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n1;->n(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n1;->o(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n1;->p(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/n1;->u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n1;->s(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 44

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x3bbfee14

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, p1, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_16

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v1, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v7, v3

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v1, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v1, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v1, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v7, v1, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v1, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Loading"

    const/4 v5, 0x6

    invoke-static {v2, v1, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v2, v7

    const-string v8, "STATUS TITLE"

    move v9, v2

    invoke-static {v6, v9, v1, v8}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v12, La11/c;->LOADING:La11/c;

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v10, :cond_4

    if-ne v11, v13, :cond_5

    :cond_4
    new-instance v11, Lh32/b;

    const/16 v10, 0xc

    invoke-direct {v11, v4, v10}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v15, v11

    check-cast v15, Lkotlin/jvm/functions/Function1;

    sget v20, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v17, v20, 0x3

    const/16 v18, 0x30

    const/16 v19, 0x37fd

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move v10, v3

    const/4 v3, 0x0

    move-object v11, v4

    const/4 v4, 0x0

    move v14, v5

    const/4 v5, 0x0

    move-object/from16 v21, v6

    const/4 v6, 0x0

    move/from16 v22, v7

    const/4 v7, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move/from16 v24, v9

    const/4 v9, 0x0

    move/from16 v25, v10

    const/4 v10, 0x0

    move-object/from16 v26, v11

    const/4 v11, 0x0

    move-object/from16 v27, v13

    const/4 v13, 0x0

    move/from16 v28, v14

    const/4 v14, 0x0

    move-object/from16 v33, v21

    move/from16 v29, v22

    move/from16 v30, v24

    move-object/from16 v0, v26

    move-object/from16 v31, v27

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move/from16 v21, v17

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v22, "Status Subtitle"

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_6

    move-object/from16 v4, v31

    if-ne v5, v4, :cond_7

    goto :goto_2

    :cond_6
    move-object/from16 v4, v31

    :goto_2
    new-instance v5, Lh32/b;

    const/16 v6, 0xd

    invoke-direct {v5, v0, v6}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v15, v5

    check-cast v15, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v5, v20, 0x6

    or-int v17, v21, v5

    const/16 v18, 0x30

    const/16 v19, 0x37f9

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object/from16 v31, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v34, v31

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v24, Lx81/d;->a:Lx81/d;

    invoke-virtual/range {v24 .. v24}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/g0;->d()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_8

    move-object/from16 v4, v34

    if-ne v6, v4, :cond_9

    goto :goto_3

    :cond_8
    move-object/from16 v4, v34

    :goto_3
    new-instance v6, Lh32/b;

    const/16 v7, 0xe

    invoke-direct {v6, v0, v7}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v15, v6

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v18, 0x30

    const/16 v19, 0x37e9

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object/from16 v31, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v35, v31

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v25, v12

    move/from16 v26, v17

    const-string v1, "CONNECTION FAILED"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {v24 .. v24}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/g0;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v12, La11/c;->ERROR:La11/c;

    const/16 v19, 0x77ed

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    move/from16 v17, v21

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    const-string v2, "DATA CATCHING UP"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {v24 .. v24}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->c()Lgz0/k;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/k;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v3, "SYNCED TO"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v27, "10:35AM"

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    move-object/from16 v3, v35

    if-ne v4, v3, :cond_b

    goto :goto_4

    :cond_a
    move-object/from16 v3, v35

    :goto_4
    new-instance v4, Lh32/b;

    const/16 v6, 0xf

    invoke-direct {v4, v0, v6}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v15, v4

    check-cast v15, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v28, v20, 0x12

    or-int v4, v21, v28

    shl-int/lit8 v31, v20, 0x15

    or-int v17, v4, v31

    const/16 v18, 0x30

    const/16 v19, 0x372d

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object/from16 v34, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v12, v25

    move-object/from16 v36, v34

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {v24 .. v24}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/g0;->d()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v4, "Button"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_c

    move-object/from16 v4, v36

    if-ne v6, v4, :cond_d

    goto :goto_5

    :cond_c
    move-object/from16 v4, v36

    :goto_5
    new-instance v6, Lh32/b;

    const/16 v7, 0x10

    invoke-direct {v6, v0, v7}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v15, v6

    check-cast v15, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v6, v20, 0x18

    or-int v17, v26, v6

    const/16 v18, 0x0

    const/16 v19, 0x3ee9

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object/from16 v34, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v37, v34

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    const-string v2, "COMPLETE"

    const/4 v3, 0x6

    invoke-static {v2, v1, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v4, v23

    move/from16 v2, v30

    move-object/from16 v5, v33

    invoke-static {v5, v2, v1, v4}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move v14, v3

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {v24 .. v24}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/g0;->d()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "DATA AT"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v12, La11/c;->COMPLETE:La11/c;

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_e

    move-object/from16 v10, v37

    if-ne v11, v10, :cond_f

    goto :goto_6

    :cond_e
    move-object/from16 v10, v37

    :goto_6
    new-instance v11, Lh32/b;

    const/16 v13, 0x11

    invoke-direct {v11, v0, v13}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v15, v11

    check-cast v15, Lkotlin/jvm/functions/Function1;

    or-int v11, v26, v28

    or-int v17, v11, v31

    const/16 v18, 0x30

    const/16 v19, 0x3729

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object/from16 v23, v4

    const/4 v4, 0x0

    move/from16 v30, v2

    move-object v2, v6

    const/4 v6, 0x0

    move-object/from16 v33, v5

    move-object v5, v7

    move-object v7, v8

    move-object v8, v9

    const/4 v9, 0x0

    move-object/from16 v31, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v25, v0

    move-object/from16 v38, v23

    move-object/from16 v39, v31

    move/from16 v0, v32

    move-object/from16 v40, v33

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    const-string v2, "MISC"

    invoke-static {v2, v1, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v0, v30

    move-object/from16 v2, v38

    move-object/from16 v3, v40

    invoke-static {v3, v0, v1, v2}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object/from16 v33, v3

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {v24 .. v24}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/g0;->d()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v12, La11/c;->ARROW:La11/c;

    move-object/from16 v6, v25

    invoke-virtual {v1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_10

    move-object/from16 v7, v39

    if-ne v8, v7, :cond_11

    goto :goto_7

    :cond_10
    move-object/from16 v7, v39

    :goto_7
    new-instance v8, Lh32/b;

    const/16 v9, 0x12

    invoke-direct {v8, v6, v9}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v15, v8

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v18, 0x30

    const/16 v19, 0x37e9

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object/from16 v23, v2

    move-object v2, v4

    const/4 v4, 0x0

    move-object/from16 v25, v6

    const/4 v6, 0x0

    move-object/from16 v31, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v30, v0

    move-object/from16 v0, v25

    move/from16 v17, v26

    move-object/from16 v41, v31

    move-object/from16 v42, v33

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_12

    move-object/from16 v3, v41

    if-ne v4, v3, :cond_13

    goto :goto_8

    :cond_12
    move-object/from16 v3, v41

    :goto_8
    new-instance v4, Lh32/b;

    const/16 v5, 0x13

    invoke-direct {v4, v0, v5}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v15, v4

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v18, 0x30

    const/16 v19, 0x37fd

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object/from16 v31, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v17, v21

    move-object/from16 v43, v31

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move-object/from16 v4, v23

    move/from16 v2, v30

    move-object/from16 v3, v42

    invoke-static {v3, v2, v1, v4}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v5, "See more"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {v24 .. v24}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/g0;->d()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_14

    move-object/from16 v7, v43

    if-ne v8, v7, :cond_15

    :cond_14
    new-instance v8, Lh32/b;

    const/16 v7, 0x14

    invoke-direct {v8, v0, v7}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v15, v8

    check-cast v15, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v20, 0x9

    or-int v17, v26, v0

    const/16 v18, 0x30

    const/16 v19, 0x37e1

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object/from16 v33, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, v33

    invoke-static/range {v1 .. v19}, La11/q;->z(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move/from16 v2, v29

    const/4 v10, 0x1

    invoke-static {v2, v2, v0, v1, v10}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_9

    :cond_16
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_17

    new-instance v1, Lzc1/w0;

    const/4 v2, 0x2

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/w0;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final l(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "LOADING CLICK"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "LOADING CLICK"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "LOADING CLICK"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "LOADING CLICK"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "CTA CLICK"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "COMPLETE CLICK"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "MISC CLICK"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "MISC CLICK"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "MISC CLICK"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/n1;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
