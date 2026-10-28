.class public abstract Lo52/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\t\u001a\u00020\u000e8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lo52/n;",
        "supportViewModel",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "Ll83/a0;",
        "f",
        "(Lo52/n;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lfz0/d;",
        "viewState",
        "d",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "Lo52/f0;",
        "viewModel",
        "Lpv2/a;",
        "realtime-activity_release"
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
.method public static synthetic a(Lo52/n;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lo52/e0;->j(Lo52/n;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lo52/e0;->e(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ll83/h;Lo52/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lo52/e0;->h(Ll83/h;Lo52/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfz0/d;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x56675969    # 6.35928E13f

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v5, v7

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    const/4 v8, 0x3

    invoke-static {v3, v5, v6, v8}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v4, v4

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v9, v4

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v2, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_3

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v2, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v2, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-nez v14, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    :cond_4
    invoke-static {v10, v2, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v2, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, Lb2/e;->J:Lb2/l;

    const/4 v15, 0x6

    invoke-static {v4, v14, v2, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v14, v2, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v2}, Lp1/q;->i0()V

    move/from16 p1, v8

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-eqz v8, :cond_6

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v2, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v9, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v2, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v14, v2, v14, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v2, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x1484d1d3

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lfz0/d;

    float-to-double v8, v5

    const-wide/16 v10, 0x0

    cmpl-double v8, v8, v10

    if-lez v8, :cond_9

    goto :goto_6

    :cond_9
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v8, v5, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v9, Lfz0/d;->h:I

    shl-int/lit8 v9, v9, 0x3

    invoke-static {v8, v4, v2, v9, v6}, Ln71/h;->e(Landroidx/compose/ui/Modifier;Lfz0/d;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_a
    invoke-static {v2, v6, v7, v7}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_7

    :cond_b
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_c

    new-instance v3, Lbm0/o;

    const/16 v4, 0xc

    invoke-direct {v3, v0, v1, v4}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final e(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lo52/e0;->d(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Lo52/n;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "supportViewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x326b9093

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/4 v2, 0x1

    const/4 v7, 0x0

    if-eq v0, v1, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    move v0, v7

    :goto_3
    and-int/2addr p2, v2

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_a

    const p2, -0x649fae96

    invoke-virtual {v4, p2}, Lp1/q;->f0(I)V

    sget-object p2, Lpf3/a;->b:Lnf3/a;

    if-eqz p2, :cond_9

    iget-object p2, p2, Lnf3/a;->a:Lwf3/a;

    iget-object p2, p2, Lwf3/a;->d:Lxf3/c;

    const v0, -0x649fad62

    const v1, -0x384098

    invoke-static {v4, v0, v4, v7, v1}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_5

    if-ne v3, v5, :cond_6

    :cond_5
    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lo52/e0$a;

    invoke-direct {v3, p2, v1, v1, v0}, Lo52/e0$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    check-cast v3, Ll83/h;

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    invoke-virtual {p0}, Lo52/n;->f0()Landroidx/lifecycle/u0;

    move-result-object p2

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    if-ne v1, v5, :cond_8

    :cond_7
    new-instance v0, Lno0/q;

    const/4 v1, 0x2

    invoke-direct {v0, v3, v1}, Lno0/q;-><init>(Ll83/h;I)V

    new-instance v1, Lo52/e0$b;

    invoke-direct {v1, v0}, Lo52/e0$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v1, Landroidx/lifecycle/v0;

    invoke-virtual {p2, p1, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-static {v3}, Lo52/e0;->g(Ll83/h;)Lo52/f0;

    move-result-object p2

    invoke-virtual {p2}, Lo52/f0;->getViewState()Lec3/l;

    move-result-object v1

    new-instance v2, Lpv2/a;

    sget-object p2, Lm83/y;->w:Lm83/y;

    invoke-direct {v2, p2}, Lpv2/a;-><init>(Ljava/util/List;)V

    sget p2, Lpv2/a;->b:I

    shl-int/lit8 v5, p2, 0x3

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p2

    invoke-static {p2}, Lo52/e0;->i(Lp1/t2;)Lpv2/a;

    move-result-object p2

    invoke-virtual {p2}, Lpv2/a;->a()Ljava/util/List;

    move-result-object p2

    invoke-static {p2, v4, v7}, Lo52/e0;->d(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "KoinApplication has not been started"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lmx1/i;

    const/16 v1, 0x18

    invoke-direct {v0, p0, p1, p3, v1}, Lmx1/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final g(Ll83/h;)Lo52/f0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lo52/f0;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo52/f0;

    return-object p0
.end method

.method private static final h(Ll83/h;Lo52/f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lo52/e0;->g(Ll83/h;)Lo52/f0;

    move-result-object p0

    invoke-virtual {p1}, Lo52/f;->h()I

    move-result p1

    invoke-virtual {p0, p1}, Lo52/f0;->l(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/t2;)Lpv2/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lpv2/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpv2/a;

    return-object p0
.end method

.method private static final j(Lo52/n;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lo52/e0;->f(Lo52/n;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
