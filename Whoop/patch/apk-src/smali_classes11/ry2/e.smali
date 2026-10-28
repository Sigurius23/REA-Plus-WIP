.class public abstract Lry2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a?\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000c2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lty2/a;",
        "viewState",
        "",
        "shouldShowWebView",
        "Lkotlin/Function1;",
        "Lny2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "onNavEvent",
        "u",
        "(Lty2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lty2/a$i;",
        "N",
        "(Lty2/a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "whooplabs_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$g;->a:Lcom/whoop/whooplabs/feature/navigation/c$g;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lty2/a;)Ll83/a0;
    .locals 1

    new-instance v0, Lny2/a$r;

    check-cast p1, Lty2/a$d;

    invoke-virtual {p1}, Lty2/a$d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lny2/a$r;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$j;->a:Lny2/a$j;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$i;->a:Lny2/a$i;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$f;->a:Lny2/a$f;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Lny2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$v;->a:Lny2/a$v;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$s;->a:Lny2/a$s;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$f;->a:Lny2/a$f;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final M(Lty2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lry2/e;->u(Lty2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final N(Lty2/a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a$i;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x8d9c5ba

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_4

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x100

    goto :goto_3

    :cond_3
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit16 v5, v0, 0x83

    const/16 v6, 0x82

    const/4 v14, 0x1

    const/4 v7, 0x0

    if-eq v5, v6, :cond_5

    move v5, v14

    goto :goto_4

    :cond_5
    move v5, v7

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v12, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_14

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_6

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-nez v11, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v6, v12, v6, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v12, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v6, v5

    invoke-virtual {v1}, Lty2/a$i;->a()Lkd1/o;

    move-result-object v5

    move-object v10, v9

    sget v9, Lkd1/o;->a:I

    move-object v13, v10

    const/4 v10, 0x3

    move-object/from16 v19, v6

    const/4 v6, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v16, v12

    move-object v12, v8

    move-object/from16 v8, v16

    const/16 v16, 0x0

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v10, v13

    const v13, 0x361b0

    move v9, v14

    const/16 v14, 0x48

    move/from16 v21, v6

    const/4 v6, 0x0

    move-object/from16 v22, v12

    move-object v12, v8

    const/4 v8, 0x0

    move/from16 v23, v9

    sget-object v9, Ly2/j;->a:Ly2/b1;

    move-object/from16 v24, v10

    const v10, 0x3e99999a    # 0.3f

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move-object/from16 v27, v19

    move-object/from16 v26, v20

    move-object/from16 v28, v22

    move-object/from16 v2, v24

    move-object/from16 v29, v25

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v5, v2}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Li2/t;->b:Li2/s;

    sget-wide v7, Li2/x;->m:J

    new-instance v9, Li2/x;

    invoke-direct {v9, v7, v8}, Li2/x;-><init>(J)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->t()J

    move-result-wide v10

    new-instance v13, Li2/x;

    invoke-direct {v13, v10, v11}, Li2/x;-><init>(J)V

    invoke-virtual {v7, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->u()J

    move-result-wide v10

    new-instance v14, Li2/x;

    invoke-direct {v14, v10, v11}, Li2/x;-><init>(J)V

    sget-wide v10, Li2/x;->b:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v10, v11}, Li2/x;-><init>(J)V

    filled-new-array {v9, v13, v14, v4}, [Li2/x;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v9, 0x0

    const/16 v10, 0xe

    invoke-static {v6, v4, v9, v9, v10}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v11, 0x6

    invoke-static {v5, v4, v6, v9, v11}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v12, v5}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v4, 0x2

    int-to-float v4, v4

    const/16 v9, 0x8

    int-to-float v13, v9

    mul-float v14, v4, v13

    const/4 v9, 0x5

    int-to-float v11, v9

    mul-float/2addr v11, v13

    invoke-static {v6, v14, v11}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v11, 0x1

    invoke-static {v5, v12, v11}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v13

    invoke-static {v6, v13, v10}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v11, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v13, v26

    goto :goto_7

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v12, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v27

    invoke-static {v12, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    :cond_a
    move-object/from16 v10, v28

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v5, v29

    goto :goto_a

    :goto_9
    invoke-static {v5, v12, v5, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v12, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v10, v5

    const-wide/16 v5, 0x0

    cmpl-double v5, v10, v5

    if-lez v5, :cond_c

    const/4 v14, 0x1

    goto :goto_b

    :cond_c
    const/4 v14, 0x0

    :goto_b
    if-nez v14, :cond_d

    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_d
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v11, 0x1

    invoke-direct {v5, v6, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v12, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lty2/a$i;->c()I

    move-result v5

    const/4 v6, 0x0

    invoke-static {v5, v12, v6}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    invoke-virtual {v7, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->a()J

    move-result-wide v10

    new-instance v6, Li2/p;

    invoke-direct {v6, v10, v11, v9}, Li2/p;-><init>(JI)V

    const/16 v13, 0x1b0

    const/16 v14, 0x38

    move-object v11, v6

    const-string v6, ""

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v15, v10

    const/4 v10, 0x0

    move-object/from16 v18, v7

    move-object v7, v2

    move-object/from16 v2, v18

    const/16 v18, 0x8

    const/16 v19, 0x6

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v7

    const/4 v5, 0x4

    int-to-float v7, v5

    mul-float v8, v4, v7

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lty2/a$i;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v8, v12, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    move v11, v5

    move-object v5, v8

    const/4 v10, 0x0

    invoke-static {v12, v10}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v8

    sget v13, Liz0/m;->p:I

    shl-int/lit8 v13, v13, 0x9

    const/16 v16, 0x1f6

    move-object/from16 v24, v6

    const/4 v6, 0x0

    move v14, v7

    const/4 v7, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move/from16 v22, v11

    const/4 v11, 0x0

    move/from16 v25, v14

    move-object v14, v12

    const/4 v12, 0x0

    move/from16 v26, v15

    move v15, v13

    const/4 v13, 0x0

    move/from16 v22, v0

    move-object/from16 v0, v24

    move/from16 v1, v25

    move/from16 v3, v26

    invoke-static/range {v5 .. v16}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    const/16 v5, 0xb

    int-to-float v5, v5

    invoke-static {v5, v1, v0, v12}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lty2/a$i;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v2, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v4

    const/16 v5, 0x10

    int-to-float v5, v5

    mul-float/2addr v1, v5

    sget-object v5, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v2, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->V0()J

    move-result-wide v5

    invoke-virtual {v2, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v7

    const/4 v14, 0x0

    const/16 v15, 0xc

    const-wide/16 v9, 0x0

    move-object v13, v12

    const-wide/16 v11, 0x0

    invoke-static/range {v5 .. v15}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v12

    move/from16 v2, v22

    and-int/lit16 v3, v2, 0x380

    const/16 v5, 0x100

    if-ne v3, v5, :cond_e

    const/4 v14, 0x1

    goto :goto_c

    :cond_e
    move/from16 v14, v20

    :goto_c
    and-int/lit8 v3, v2, 0xe

    const/4 v11, 0x4

    if-eq v3, v11, :cond_10

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_f

    move-object/from16 v2, p0

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    goto :goto_d

    :cond_f
    move-object/from16 v2, p0

    goto :goto_e

    :cond_10
    move-object/from16 v2, p0

    :goto_d
    const/16 v20, 0x1

    :cond_11
    :goto_e
    or-int v3, v14, v20

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_13

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_12

    goto :goto_f

    :cond_12
    move-object/from16 v6, p2

    goto :goto_10

    :cond_13
    :goto_f
    new-instance v5, Lqt2/e;

    const/16 v3, 0x15

    move-object/from16 v6, p2

    invoke-direct {v5, v3, v6, v2}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object/from16 v18, v5

    check-cast v18, Lc93/a;

    shl-int/lit8 v3, v17, 0x12

    or-int/lit8 v20, v3, 0x6

    const/16 v21, 0x6

    const/16 v22, 0x193e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v11, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v5, v0

    move v15, v1

    move-object/from16 v19, v14

    move-object v14, v4

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v19

    const/4 v11, 0x1

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_14
    move-object v2, v1

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_15

    new-instance v0, Lnx1/g;

    const/16 v5, 0x1d

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object v1, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final O(Lkotlin/jvm/functions/Function1;Lty2/a$i;)Ll83/a0;
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/feature/navigation/c$i;

    invoke-virtual {p1}, Lty2/a$i;->d()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/whooplabs/feature/navigation/c$i;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lty2/a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lry2/e;->N(Lty2/a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lny2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lry2/e;->F(Lkotlin/jvm/functions/Function1;Lny2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/e;->H(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/e;->E(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/e;->J(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lty2/a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lry2/e;->P(Lty2/a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lny2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lry2/e;->x(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lny2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lty2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lry2/e;->M(Lty2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/e;->D(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lty2/a;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lry2/e;->w(Lty2/a;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lty2/a$i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lry2/e;->O(Lkotlin/jvm/functions/Function1;Lty2/a$i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lty2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lry2/e;->y(Lty2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lb3/x2;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lny2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lry2/e;->v(Lb3/x2;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lny2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lty2/a$d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lry2/e;->B(Lkotlin/jvm/functions/Function1;Lty2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/e;->C(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/e;->G(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p()Ll83/a0;
    .locals 1

    invoke-static {}, Lry2/e;->L()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/e;->K(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/e;->A(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/e;->I(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Lty2/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lry2/e;->z(Lkotlin/jvm/functions/Function1;Lty2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Lty2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v8, p3

    move/from16 v9, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v0, 0x6870bd50

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_2

    move/from16 v4, p1

    invoke-virtual {v14, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit16 v5, v9, 0x180

    const/16 v6, 0x100

    if-nez v5, :cond_6

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v6

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_6
    and-int/lit16 v5, v9, 0xc00

    if-nez v5, :cond_8

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x800

    goto :goto_5

    :cond_7
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    :cond_8
    and-int/lit16 v5, v0, 0x493

    const/16 v7, 0x492

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v5, v7, :cond_9

    move v5, v11

    goto :goto_6

    :cond_9
    move v5, v10

    :goto_6
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v14, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    if-eqz v3, :cond_a

    move/from16 v17, v11

    goto :goto_7

    :cond_a
    move/from16 v17, v4

    :goto_7
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_b

    invoke-static {v14}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v3

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lbc3/c0;

    sget-object v5, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v14, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb3/x2;

    move v7, v10

    sget-object v10, Lg1/z3;->w:Lg1/z3;

    const/4 v15, 0x6

    const/16 v16, 0xe

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    invoke-static/range {v10 .. v16}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v10

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-virtual {v14, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v6, :cond_c

    const/4 v0, 0x1

    goto :goto_8

    :cond_c
    move v0, v7

    :goto_8
    or-int/2addr v0, v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_e

    if-ne v6, v4, :cond_d

    goto :goto_9

    :cond_d
    move-object v11, v4

    move-object v4, v3

    move-object v3, v10

    move v10, v7

    goto :goto_a

    :cond_e
    :goto_9
    new-instance v2, Lry2/d;

    move v0, v7

    const/4 v7, 0x0

    move-object v11, v4

    move-object v6, v10

    move v10, v0

    move-object v4, v3

    move-object v3, v5

    move-object/from16 v5, p2

    invoke-direct/range {v2 .. v7}, Lry2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v3, v6

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v2

    :goto_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    new-instance v18, Lv41/g;

    const/16 v26, 0x7f

    const/16 v27, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v18 .. v27}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lv41/f$a;

    invoke-direct {v12, v3}, Lv41/f$a;-><init>(Lg1/y3;)V

    new-instance v0, Lat2/r;

    const/16 v5, 0x15

    move-object v2, v4

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Lat2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    const v1, 0x219178fe

    invoke-static {v1, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    new-instance v0, Lb30/m1;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object v4, v6

    move-object v3, v8

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lb30/m1;-><init>(Lty2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V

    const v1, -0x23e03e3e

    invoke-static {v1, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v24

    sget v0, Lv41/g;->h:I

    shl-int/lit8 v0, v0, 0x3

    const/high16 v1, 0xc00000

    or-int/2addr v0, v1

    sget v1, Lv41/f$a;->c:I

    shl-int/lit8 v1, v1, 0x6

    or-int v26, v0, v1

    const/16 v27, 0x6000

    const/16 v28, 0x3f79

    move v0, v10

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v1, v11

    move-object/from16 v11, v18

    const/16 v18, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v7

    invoke-static/range {v10 .. v28}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v25

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_f

    new-instance v2, Lrx0/f;

    const/4 v1, 0x5

    invoke-direct {v2, v1}, Lrx0/f;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lc93/a;

    const/16 v1, 0x36

    const/4 v12, 0x1

    invoke-static {v2, v12, v14, v1, v0}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move v2, v5

    goto :goto_b

    :cond_10
    invoke-virtual {v14}, Lp1/q;->X()V

    move v2, v4

    :goto_b
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_11

    new-instance v0, Law0/h;

    const/16 v7, 0x1d

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    move v5, v9

    invoke-direct/range {v0 .. v7}, Law0/h;-><init>(Ljava/lang/Object;ZLl83/e;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final v(Lb3/x2;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lny2/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Lny2/a$k;

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    check-cast p0, Lb3/x1;

    invoke-virtual {p0}, Lb3/x1;->a()V

    :cond_0
    new-instance p0, Lry2/e$c;

    const/4 v0, 0x0

    invoke-direct {p0, p3, v0}, Lry2/e$c;-><init>(Lg1/y3;Lq83/d;)V

    const/4 p3, 0x3

    invoke-static {p1, v0, v0, p0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    invoke-interface {p2, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lty2/a;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "$this$BottomSheet"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p4, p6, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p4, v0, :cond_0

    move p4, v2

    goto :goto_0

    :cond_0
    move p4, v1

    :goto_0
    and-int/2addr p6, v2

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p6, p4}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-static {p0}, Lty2/b;->a(Lty2/a;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-virtual {p5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {p5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p6

    or-int/2addr p4, p6

    invoke-virtual {p5, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p6

    or-int/2addr p4, p6

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p6

    if-nez p4, :cond_1

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne p6, p4, :cond_2

    :cond_1
    new-instance p6, Lkl2/j;

    const/4 p4, 0x6

    invoke-direct {p6, p1, p3, p2, p4}, Lkl2/j;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;I)V

    invoke-virtual {p5, p6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p6, Lkotlin/jvm/functions/Function1;

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {p0, p6, p5, p1, v1}, Lry2/c;->e(Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {p5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lny2/a;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lry2/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lry2/e$a;-><init>(Lg1/y3;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p0, v1, v1, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lty2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    and-int/lit8 v4, p6, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v7

    :goto_0
    and-int/lit8 v5, p6, 0x1

    move-object/from16 v15, p5

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_33

    sget-object v4, Lty2/a$g;->a:Lty2/a$g;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const v0, 0x13960674

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    sget-object v8, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v0, Lsz0/p0$c;->f:I

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x3

    or-int v21, v0, v1

    const/16 v22, 0x0

    const/16 v23, 0xffc

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v8 .. v23}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v20

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_1
    instance-of v4, v0, Lty2/a$c;

    const/high16 v5, 0x30000

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_6

    const v3, 0x1399d82a

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    new-instance v9, Lsz0/p0$b;

    move-object v3, v0

    check-cast v3, Lty2/a$c;

    invoke-virtual {v3}, Lty2/a$c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lty2/a$c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v3}, Lty2/a$c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v3}, Lty2/a$c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v0, :cond_2

    if-ne v10, v8, :cond_3

    :cond_2
    new-instance v10, Lqt2/e;

    const/16 v0, 0x16

    invoke-direct {v10, v0, v1, v3}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v12, v10

    check-cast v12, Lc93/a;

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4

    if-ne v1, v8, :cond_5

    :cond_4
    new-instance v1, Lqn0/j;

    const/16 v0, 0x15

    invoke-direct {v1, v2, v0}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v16, v1

    check-cast v16, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    or-int/2addr v0, v5

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v1, 0x3

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x9

    or-int/2addr v0, v2

    shl-int/lit8 v1, v1, 0x15

    or-int v21, v0, v1

    const/16 v22, 0x6

    const/16 v23, 0xa44

    const/4 v10, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    move-object v8, v9

    move-object/from16 v20, v15

    move-object v9, v4

    move-object v15, v6

    invoke-static/range {v8 .. v23}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v20

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_6
    instance-of v4, v0, Lty2/a$a;

    if-eqz v4, :cond_18

    const v4, 0x13a5d88e

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    move-object v4, v0

    check-cast v4, Lty2/a$a;

    invoke-virtual {v4}, Lty2/a$a;->e()Z

    move-result v5

    if-eqz v5, :cond_b

    const v0, 0x13a4e10a

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lty2/a$a;->a()Lty2/c;

    move-result-object v0

    invoke-virtual {v0}, Lty2/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v4}, Lty2/a$a;->a()Lty2/c;

    move-result-object v2

    invoke-virtual {v2}, Lty2/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v4}, Lty2/a$a;->a()Lty2/c;

    move-result-object v2

    invoke-virtual {v2}, Lty2/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    if-ne v3, v8, :cond_8

    :cond_7
    new-instance v3, Lqn0/j;

    const/16 v2, 0x16

    invoke-direct {v3, v1, v2}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v11, v3

    check-cast v11, Lc93/a;

    invoke-virtual {v4}, Lty2/a$a;->a()Lty2/c;

    move-result-object v2

    invoke-virtual {v2}, Lty2/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    if-ne v3, v8, :cond_a

    :cond_9
    new-instance v3, Lqn0/j;

    const/16 v2, 0xe

    invoke-direct {v3, v1, v2}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v13, v3

    check-cast v13, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v1, 0x3

    or-int/2addr v2, v1

    shl-int/lit8 v3, v1, 0x6

    or-int/2addr v2, v3

    shl-int/lit8 v1, v1, 0xc

    or-int v16, v2, v1

    const/16 v17, 0x40

    const/4 v14, 0x0

    move-object v8, v0

    invoke-static/range {v8 .. v17}, Lkz2/c;->y(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_3

    :cond_b
    const v5, 0x13af010d

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lty2/a$a;->d()Z

    move-result v5

    if-eqz v5, :cond_e

    const v5, 0x13ae284b

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_c

    if-ne v6, v8, :cond_d

    :cond_c
    new-instance v6, Lp90/h;

    const/16 v5, 0x17

    invoke-direct {v6, v1, v5}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v15, v7}, Lry2/b;->g(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_e
    const v1, 0x13b057a0

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    :goto_1
    instance-of v1, v4, Lty2/a$a$g;

    if-eqz v1, :cond_f

    const v1, 0x13b29fc8

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$a$g;

    invoke-static {v0, v3, v2, v15, v7}, Lsy2/f;->d(Lty2/a$a$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :cond_f
    instance-of v1, v4, Lty2/a$a$i;

    if-eqz v1, :cond_10

    const v1, 0x13b8ee15

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$a$i;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v3

    move-object v4, v15

    move/from16 v3, p4

    invoke-static/range {v0 .. v6}, Lsy2/t;->p(Lty2/a$a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :cond_10
    move-object v1, v3

    instance-of v3, v4, Lty2/a$a$c;

    if-eqz v3, :cond_11

    const v3, 0x13bf6f3e

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$a$c;

    invoke-static {v0, v1, v2, v15, v7}, Lsy2/k;->j(Lty2/a$a$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :cond_11
    instance-of v3, v4, Lty2/a$a$a;

    if-eqz v3, :cond_12

    const v3, 0x13c560e8

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$a$a;

    invoke-static {v0, v1, v2, v15, v7}, Lsy2/b;->d(Lty2/a$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_12
    instance-of v3, v4, Lty2/a$a$e;

    if-eqz v3, :cond_13

    const v3, 0x13cb58fd

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$a$e;

    invoke-static {v0, v1, v2, v15, v7}, Lsy2/n;->d(Lty2/a$a$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_13
    instance-of v2, v4, Lty2/a$a$d;

    if-eqz v2, :cond_14

    const v2, 0x13d16434

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$a$d;

    invoke-static {v0, v1, v15, v7}, Lsy2/m;->g(Lty2/a$a$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_14
    instance-of v2, v4, Lty2/a$a$f;

    if-eqz v2, :cond_15

    const v2, 0x13d6983c

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$a$f;

    invoke-static {v0, v1, v15, v7}, Lsy2/p;->k(Lty2/a$a$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_15
    instance-of v2, v4, Lty2/a$a$h;

    if-eqz v2, :cond_16

    const v2, 0x13dbb1bf

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$a$h;

    invoke-static {v0, v1, v15, v7}, Lsy2/q;->d(Lty2/a$a$h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_16
    instance-of v2, v4, Lty2/a$a$b;

    if-eqz v2, :cond_17

    const v2, 0x13e0cffb

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$a$b;

    invoke-static {v0, v1, v15, v7}, Lsy2/e;->k(Lty2/a$a$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_17
    const v0, 0x53374cc2

    invoke-static {v0, v15, v7}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_18
    instance-of v3, v0, Lty2/a$j;

    if-eqz v3, :cond_19

    const v1, 0x13e5d5c1

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$j;

    invoke-virtual {v0}, Lty2/a$j;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v15, v1, v7}, Lkz2/c;->u(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_19
    instance-of v3, v0, Lty2/a$h;

    if-eqz v3, :cond_1c

    const v2, 0x13e7af1c

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$h;

    invoke-virtual {v0}, Lty2/a$h;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lty2/a$h;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1a

    if-ne v4, v8, :cond_1b

    :cond_1a
    new-instance v4, Lqn0/j;

    const/16 v3, 0xf

    invoke-direct {v4, v1, v3}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v4, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v1, 0x3

    or-int/2addr v1, v3

    const/4 v3, 0x0

    move-object/from16 p1, v0

    move/from16 p4, v1

    move-object/from16 p0, v2

    move/from16 p5, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v15

    invoke-static/range {p0 .. p5}, Lkz2/c;->r(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_1c
    instance-of v3, v0, Lty2/a$i;

    if-eqz v3, :cond_1d

    const v3, 0x13ec94ac

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$i;

    invoke-static {v0, v1, v2, v15, v7}, Lry2/e;->N(Lty2/a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_1d
    instance-of v3, v0, Lty2/a$e;

    if-eqz v3, :cond_22

    const v2, 0x13f10f4f

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    check-cast v0, Lty2/a$e;

    invoke-virtual {v0}, Lty2/a$e;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v0}, Lty2/a$e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v0}, Lty2/a$e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lty2/a$e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1e

    if-ne v2, v8, :cond_1f

    :cond_1e
    new-instance v2, Lqn0/j;

    const/16 v0, 0x10

    invoke-direct {v2, v1, v0}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v2, Lc93/a;

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_20

    if-ne v3, v8, :cond_21

    :cond_20
    new-instance v3, Lqn0/j;

    const/16 v0, 0x11

    invoke-direct {v3, v1, v0}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object v10, v3

    check-cast v10, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v0, 0x3

    shl-int/lit8 v3, v0, 0x9

    or-int/2addr v1, v3

    shl-int/lit8 v3, v0, 0xc

    or-int/2addr v1, v3

    shl-int/lit8 v0, v0, 0xf

    or-int v16, v1, v0

    const/16 v17, 0x40

    const/4 v14, 0x0

    move-object v8, v2

    invoke-static/range {v8 .. v17}, Lkz2/c;->n(Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_22
    instance-of v3, v0, Lty2/a$f;

    if-eqz v3, :cond_2a

    const v1, 0x13f8f8f7

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Lgb1/b0;->S(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v15, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v15, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-eqz v10, :cond_23

    invoke-virtual {v15, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_23
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v15, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v15, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_24

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_25

    :cond_24
    invoke-static {v4, v15, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v15, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v21, Lj11/p;->LOTTIE:Lj11/p;

    check-cast v0, Lty2/a$f;

    invoke-virtual {v0}, Lty2/a$f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lty2/a$f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lty2/a$f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_26

    if-ne v1, v8, :cond_27

    :cond_26
    new-instance v1, Lqn0/j;

    const/16 v0, 0x12

    invoke-direct {v1, v2, v0}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object/from16 v30, v1

    check-cast v30, Lc93/a;

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_28

    if-ne v1, v8, :cond_29

    :cond_28
    new-instance v1, Lqn0/j;

    const/16 v0, 0x13

    invoke-direct {v1, v2, v0}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    move-object/from16 v32, v1

    check-cast v32, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v0, 0x3

    or-int/lit16 v1, v1, 0x6000

    shl-int/lit8 v2, v0, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x9

    or-int v37, v1, v0

    const/16 v39, 0x0

    const v40, 0xebfdfe1

    const/4 v8, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v4, v20

    const/16 v20, 0x0

    const/16 v22, 0x0

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

    const/16 v35, 0x0

    const/16 v38, 0xc00

    move-object/from16 v36, v4

    invoke-static/range {v8 .. v40}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v15, v36

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_2a
    instance-of v3, v0, Lty2/a$b;

    if-eqz v3, :cond_2d

    const v1, 0x1406b50b

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_2b

    if-ne v3, v8, :cond_2c

    :cond_2b
    new-instance v3, Lry2/e$b;

    const/4 v1, 0x0

    invoke-direct {v3, v2, v0, v1}, Lry2/e$b;-><init>(Lkotlin/jvm/functions/Function1;Lty2/a;Lq83/d;)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v3, Lc93/m;

    invoke-static {v15, v3, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_2d
    instance-of v2, v0, Lty2/a$d;

    if-eqz v2, :cond_32

    const v2, 0x140c4f66

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    new-instance v9, Lsz0/p0$b;

    move-object v2, v0

    check-cast v2, Lty2/a$d;

    invoke-virtual {v2}, Lty2/a$d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lty2/a$d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2}, Lty2/a$d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v2}, Lty2/a$d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_2e

    if-ne v6, v8, :cond_2f

    :cond_2e
    new-instance v6, Lqt2/e;

    const/16 v0, 0x17

    invoke-direct {v6, v0, v1, v2}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    move-object v12, v6

    check-cast v12, Lc93/a;

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_30

    if-ne v2, v8, :cond_31

    :cond_30
    new-instance v2, Lqn0/j;

    const/16 v0, 0x14

    invoke-direct {v2, v1, v0}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    move-object/from16 v16, v2

    check-cast v16, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    or-int/2addr v0, v5

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v1, 0x3

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x9

    or-int/2addr v0, v2

    shl-int/lit8 v1, v1, 0x15

    or-int v21, v0, v1

    const/16 v22, 0x6

    const/16 v23, 0xa44

    const/4 v10, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    move-object v8, v9

    move-object/from16 v20, v15

    move-object v9, v3

    move-object v15, v4

    invoke-static/range {v8 .. v23}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v20

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_32
    const v0, 0x53367bae

    invoke-static {v0, v15, v7}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_33
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lty2/a;)Ll83/a0;
    .locals 2

    new-instance v0, Lny2/a$u;

    check-cast p1, Lty2/a$c;

    invoke-virtual {p1}, Lty2/a$c;->b()I

    move-result v1

    invoke-virtual {p1}, Lty2/a$c;->e()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lny2/a$u;-><init>(ILjava/lang/Integer;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
