.class public abstract Lpp2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lnp2/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lnp2/a;",
        "Ll83/a0;",
        "onEvent",
        "f",
        "(Lnp2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lnp2/c$f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lpp2/l;->j(Lnp2/c$f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lnp2/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpp2/l;->h(Lnp2/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lnp2/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpp2/l;->i(Lnp2/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lnp2/c$f;Lkotlin/jvm/functions/Function1;Lnp2/c;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpp2/l;->g(Lnp2/c$f;Lkotlin/jvm/functions/Function1;Lnp2/c;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lnp2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpp2/l;->k(Lnp2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lnp2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, -0x480fc87c

    invoke-virtual {v6, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_4

    move v0, v3

    goto :goto_3

    :cond_4
    move v0, v2

    :goto_3
    and-int/2addr p2, v3

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lnp2/c;->f()Lnp2/c$f;

    move-result-object p2

    if-eqz p2, :cond_5

    move v2, v3

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v0, Lno0/h;

    const/16 v2, 0xa

    invoke-direct {v0, p2, p1, p0, v2}, Lno0/h;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const p2, 0x12781a83

    invoke-static {p2, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6c00

    const/4 v8, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    invoke-static/range {v1 .. v8}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lpp2/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lpp2/i;-><init>(Lnp2/c;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final g(Lnp2/c$f;Lkotlin/jvm/functions/Function1;Lnp2/c;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    and-int/lit8 v4, p5, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p5, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p5

    :goto_1
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_2

    move v5, v8

    goto :goto_2

    :cond_2
    move v5, v7

    :goto_2
    and-int/2addr v4, v8

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    if-eqz v3, :cond_9

    if-eqz v0, :cond_9

    const v3, 0x4696f3c2

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lnp2/c$f;->c()Lkp2/a;

    move-result-object v3

    instance-of v3, v3, Lkp2/a$a;

    if-eqz v3, :cond_3

    new-instance v3, Lnp2/a$g;

    invoke-virtual {v0}, Lnp2/c$f;->c()Lkp2/a;

    move-result-object v4

    check-cast v4, Lkp2/a$a;

    invoke-virtual {v4}, Lkp2/a$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lnp2/a$g;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v0}, Lnp2/c$f;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lnp2/c$f;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Lnp2/c$f;->e()Ly81/e;

    move-result-object v3

    if-nez v3, :cond_4

    sget-object v3, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_4
    move-object v13, v3

    invoke-virtual {v0}, Lnp2/c$f;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v0}, Lnp2/c$f;->h()Z

    move-result v20

    invoke-virtual {v0}, Lnp2/c$f;->j()Lj11/p;

    move-result-object v21

    sget-object v22, Lj11/o;->CENTER:Lj11/o;

    invoke-virtual {v0}, Lnp2/c$f;->k()Z

    move-result v12

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_5

    if-ne v4, v5, :cond_6

    :cond_5
    new-instance v4, Lpp2/j;

    const/4 v3, 0x0

    invoke-direct {v4, v2, v1, v3}, Lpp2/j;-><init>(Lnp2/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v30, v4

    check-cast v30, Lc93/a;

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    if-ne v4, v5, :cond_8

    :cond_7
    new-instance v4, Lpp2/j;

    const/4 v3, 0x1

    invoke-direct {v4, v2, v1, v3}, Lpp2/j;-><init>(Lnp2/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v32, v4

    check-cast v32, Lc93/a;

    new-instance v1, Lpp2/k;

    invoke-direct {v1, v0}, Lpp2/k;-><init>(Lnp2/c$f;)V

    const v0, 0x19b4f771

    invoke-static {v0, v6, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v35

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v0, 0x3

    or-int/lit16 v1, v1, 0x180

    shl-int/lit8 v2, v0, 0x9

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x1b

    or-int v37, v1, v0

    const/high16 v39, 0xc00000

    const v40, 0x6bf8dc1

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v38, 0x6000

    move-object/from16 v36, v6

    invoke-static/range {v8 .. v40}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_9
    move-object v0, v6

    const v1, 0x46ae5ebf

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_a
    move-object v0, v6

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lnp2/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lnp2/c;->f()Lnp2/c$f;

    move-result-object p0

    invoke-virtual {p0}, Lnp2/c$f;->d()Lnp2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lnp2/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lnp2/c;->f()Lnp2/c$f;

    move-result-object p0

    invoke-virtual {p0}, Lnp2/c$f;->a()Lnp2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lnp2/c$f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lnp2/c$f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v11, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Liz0/l;->a:Liz0/l;

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v11, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v4

    invoke-static {v1, v11, v3}, Lih0/d0;->r(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v12

    const/16 v25, 0x0

    const v26, 0xff7fff

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x3

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v12 .. v26}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v3

    sget v1, Liz0/l;->b:I

    shl-int/lit8 v26, v1, 0xf

    const/16 v27, 0x7ffc

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v24, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-virtual/range {v2 .. v27}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v5

    sget v1, Liz0/m;->p:I

    shl-int/lit8 v1, v1, 0x9

    or-int/lit16 v12, v1, 0x180

    const/16 v13, 0x1f2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, v0

    move-object/from16 v11, v24

    invoke-static/range {v2 .. v13}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v11

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Lnp2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lpp2/l;->f(Lnp2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
