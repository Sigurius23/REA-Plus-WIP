.class public abstract Lck1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lck1/n;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismissRequest",
        "Lkotlin/Function1;",
        "Lcom/whoop/navigation/e;",
        "onSecondaryButtonClick",
        "g",
        "(Lck1/n;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ll3/g;",
        "n",
        "(Lck1/n;Landroidx/compose/runtime/Composer;I)Ll3/g;",
        "health-monitor_release"
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
.method public static synthetic a(Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck1/m;->h(Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lck1/m;->i(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck1/m;->k(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lck1/n;Lhy0/a2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lck1/m;->l(Lck1/n;Lhy0/a2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lck1/n;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lck1/m;->m(Lck1/n;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lck1/m;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final g(Lck1/n;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lck1/n;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismissRequest"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v3, 0x59878b43

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v4, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v4

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    and-int/lit8 v5, v4, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    const/16 v7, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v7

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit16 v9, v3, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v9, v10, :cond_8

    move v9, v11

    goto :goto_6

    :cond_8
    move v9, v12

    :goto_6
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_16

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_9

    new-instance v5, Lcj2/a;

    const/16 v8, 0xe

    invoke-direct {v5, v8}, Lcj2/a;-><init>(I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v5, v8

    :goto_7
    invoke-virtual {v1}, Lck1/n;->g()Lhy0/b2;

    move-result-object v8

    invoke-static {v8, v0, v12}, Lhy0/z1;->g(Lhy0/b2;Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v8

    sget-object v18, Lj11/p;->START_ICON:Lj11/p;

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v13, Lny0/p0;->o:I

    or-int/2addr v13, v10

    and-int/lit8 v14, v3, 0xe

    or-int/2addr v13, v14

    invoke-static {v1, v0, v13}, Lck1/m;->n(Lck1/n;Landroidx/compose/runtime/Composer;I)Ll3/g;

    move-result-object v23

    invoke-virtual {v1}, Lck1/n;->d()Lny0/p0;

    move-result-object v13

    const/4 v14, 0x0

    if-eqz v13, :cond_b

    invoke-virtual {v13}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    goto :goto_8

    :cond_b
    move-object v13, v14

    :goto_8
    invoke-virtual {v1}, Lck1/n;->d()Lny0/p0;

    move-result-object v15

    if-eqz v15, :cond_c

    invoke-virtual {v15}, Lny0/p0;->j()Lcom/whoop/navigation/e;

    move-result-object v15

    goto :goto_9

    :cond_c
    move-object v15, v14

    :goto_9
    if-nez v15, :cond_d

    const v7, -0x5b915848

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    :goto_a
    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_d
    const v14, -0x5b915847

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    and-int/lit16 v14, v3, 0x380

    if-ne v14, v7, :cond_e

    move v7, v11

    goto :goto_b

    :cond_e
    move v7, v12

    :goto_b
    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v7, v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v7, :cond_f

    if-ne v14, v9, :cond_10

    :cond_f
    new-instance v14, Lck1/l;

    const/4 v7, 0x0

    invoke-direct {v14, v5, v15, v7}, Lck1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;I)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v14, Lc93/a;

    goto :goto_a

    :goto_c
    if-nez v14, :cond_12

    const v7, -0x5b90b9e3

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v9, :cond_11

    new-instance v7, Lcj0/f;

    const/16 v14, 0x8

    invoke-direct {v7, v14}, Lcj0/f;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v14, v7

    check-cast v14, Lc93/a;

    :goto_d
    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    move-object/from16 v28, v14

    goto :goto_e

    :cond_12
    const v7, 0x15d1fffc

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    goto :goto_d

    :goto_e
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v6, :cond_13

    goto :goto_f

    :cond_13
    move v11, v12

    :goto_f
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v11, :cond_14

    if-ne v3, v9, :cond_15

    :cond_14
    new-instance v3, La31/e;

    const/16 v6, 0xa

    invoke-direct {v3, v2, v6}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v27, v3

    check-cast v27, Lc93/a;

    new-instance v3, La0;

    const/16 v6, 0xe

    invoke-direct {v3, v6, v1, v8}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, -0x6253c92e

    invoke-static {v6, v0, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v31

    shl-int/lit8 v3, v10, 0x1b

    or-int/lit16 v3, v3, 0x6000

    const/high16 v36, 0x180000

    const v37, 0xb39ddef

    move-object v8, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x1

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object v15, v14

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v29, v26

    const/16 v26, 0x0

    move-object/from16 v30, v29

    const/16 v29, 0x0

    move-object/from16 v32, v30

    const/16 v30, 0x0

    move-object/from16 v33, v32

    const/16 v32, 0x0

    const v35, 0xc00c00

    move-object/from16 v34, v33

    move-object/from16 v33, v0

    move-object/from16 v0, v34

    move/from16 v34, v3

    invoke-static/range {v5 .. v37}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object v3, v0

    goto :goto_10

    :cond_16
    move-object/from16 v33, v0

    invoke-virtual/range {v33 .. v33}, Lp1/q;->X()V

    move-object v3, v8

    :goto_10
    invoke-virtual/range {v33 .. v33}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, Lc41/d1;

    const/16 v6, 0xb

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final h(Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lck1/n;Lhy0/a2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v0, v4, v10, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    :cond_2
    invoke-static {v6, v10, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lck1/n;->c()I

    move-result v8

    const/4 v9, 0x6

    invoke-static {v8, v10, v9}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    const/16 v11, 0x20

    int-to-float v11, v11

    invoke-static {v11, v13}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v12, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->b1()J

    move-result-wide v16

    move-object/from16 v18, v7

    move-object v7, v11

    const/16 v11, 0x1b0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move-object/from16 p3, v0

    move/from16 p2, v1

    move-object v2, v5

    move-object v5, v8

    move v0, v9

    move-wide/from16 v8, v16

    move-object/from16 v3, v18

    move-object/from16 v31, v19

    move-object/from16 v1, v20

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/16 v5, 0xc

    int-to-float v5, v5

    invoke-static {v5, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    invoke-static {v7, v6, v10, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v10, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v7, v10, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v10, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lck1/n;->g()Lhy0/b2;

    move-result-object v6

    sget-object v7, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    if-eq v6, v7, :cond_b

    const v6, -0x10287b82

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/16 v6, 0x18

    int-to-float v6, v6

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x2

    int-to-float v7, v7

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v6, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lhy0/a2;->c()J

    move-result-wide v7

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v7, v8, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->E:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v10, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v8, v10, v8, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lhy0/a2;->f()Ljava/lang/Integer;

    move-result-object v6

    if-nez v6, :cond_a

    const v0, 0x732e6474

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    :goto_4
    const/4 v0, 0x1

    goto :goto_5

    :cond_a
    const v7, 0x732e6475

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {v6, v10, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    invoke-static {v5, v13}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lhy0/a2;->e()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    move-object v5, v0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x0

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    goto :goto_4

    :goto_5
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v13, v0, v10, v8}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    :goto_6
    move-object/from16 v0, p3

    goto :goto_7

    :cond_b
    const/4 v8, 0x0

    const v0, -0x1016c4ca

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :goto_7
    invoke-static {v0, v4, v10, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_c

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v10, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    invoke-static {v4, v10, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v1, p2

    move-object/from16 v0, v31

    invoke-virtual {v0, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lck1/n;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v7

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v29, v2, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v0, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lck1/n;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lhy0/a2;->j()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v0, 0x1

    invoke-static {v10, v0, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_9

    :cond_f
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lck1/n;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lck1/m;->g(Lck1/n;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lck1/n;Landroidx/compose/runtime/Composer;I)Ll3/g;
    .locals 10

    check-cast p1, Lp1/q;

    const p2, 0x1a572402

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    new-instance p2, Ll3/d;

    invoke-direct {p2}, Ll3/d;-><init>()V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, p1, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v4

    invoke-virtual {v0, p1, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v0, p1, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->e()Lb91/a;

    move-result-object v0

    new-instance v1, Ll3/b0;

    const/16 v7, 0x1fe

    const/4 v8, 0x5

    const/4 v9, 0x0

    invoke-direct {v1, v8, v9, v7}, Ll3/b0;-><init>(ILw3/q;I)V

    invoke-virtual {p2, v1}, Ll3/d;->i(Ll3/b0;)I

    move-result v1

    :try_start_0
    invoke-virtual {v4}, Lb91/a;->d()Ll3/v0;

    move-result-object v4

    iget-object v4, v4, Ll3/v0;->a:Ll3/m0;

    const v7, 0xfffe

    invoke-static {v4, v2, v3, v9, v7}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v2

    invoke-virtual {p2, v2}, Ll3/d;->j(Ll3/m0;)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0}, Lck1/n;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {p2, v2}, Ll3/d;->f(I)V

    const-string v2, "\n\n"

    invoke-virtual {p2, v2}, Ll3/d;->b(Ljava/lang/String;)V

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v0

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    invoke-static {v0, v5, v6, v9, v7}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll3/d;->j(Ll3/m0;)I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p0}, Lck1/n;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {p2, v0}, Ll3/d;->f(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {p2, v1}, Ll3/d;->f(I)V

    invoke-virtual {p2}, Ll3/d;->k()Ll3/g;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_5
    invoke-virtual {p2, v0}, Ll3/d;->f(I)V

    throw p0

    :catchall_2
    move-exception p0

    invoke-virtual {p2, v2}, Ll3/d;->f(I)V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_0
    invoke-virtual {p2, v1}, Ll3/d;->f(I)V

    throw p0
.end method
