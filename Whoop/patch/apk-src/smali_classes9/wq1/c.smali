.class public abstract Lwq1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aI\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Luq1/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Luq1/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Ltq1/a;",
        "onNavigationEvent",
        "",
        "isHomeTileFFOn",
        "r",
        "(Luq1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V",
        "Lwq1/d;",
        "state",
        "D",
        "(Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "showBottomSheet",
        "behavior-impact_release"
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
.method private static final A(Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p1, p3, :cond_0

    new-instance p1, Luz1/g;

    const/16 p3, 0xd

    invoke-direct {p1, p3, p0}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p1, Lc93/a;

    const/16 p0, 0x30

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-static {v0, p1, p2, p0, p3}, Luw0/n;->r(Ljava/util/List;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lwq1/c;->t(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Luq1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lwq1/c;->r(Luq1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwq1/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x38e8669c

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v8, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v8

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    const/16 v9, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v9

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v6, 0x12

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v4, v6, :cond_5

    move v4, v11

    goto :goto_4

    :cond_5
    move v4, v10

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v5, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_6

    new-instance v2, Lwo1/e0;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lwo1/e0;-><init>(I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v14, v2

    goto :goto_5

    :cond_7
    move-object v14, v3

    :goto_5
    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lwq1/d;->f()Lep0/j;

    move-result-object v3

    sget v13, Lep0/j;->x:I

    shl-int/lit8 v6, v13, 0x3

    const/4 v7, 0x2

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Ldp0/f;->b(Landroidx/compose/ui/Modifier;Lep0/j;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v1}, Lwq1/d;->f()Lep0/j;

    move-result-object v2

    int-to-float v3, v8

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4, v8}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v3

    or-int/lit8 v6, v13, 0x30

    const/4 v7, 0x4

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Ldp0/d;->f(Lep0/j;Ll0/k1;ZLandroidx/compose/runtime/Composer;II)Ll0/k1;

    move-result-object v4

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v9, :cond_8

    move v10, v11

    :cond_8
    or-int v0, v2, v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_9

    if-ne v2, v12, :cond_a

    :cond_9
    new-instance v2, Lwq1/a;

    const/4 v0, 0x0

    invoke-direct {v2, v1, v14, v0}, Lwq1/a;-><init>(Lwq1/d;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x0

    const/16 v13, 0x1fa

    const/4 v3, 0x0

    move-object v11, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v15

    invoke-static/range {v2 .. v13}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v11

    move-object v3, v14

    goto :goto_6

    :cond_b
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lwq1/b;

    const/4 v5, 0x0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final E(Ltq1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lwq1/d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 7

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvv2/d;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0, p1}, Lvv2/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v3, -0x5edac311

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x0

    const/4 v3, 0x3

    invoke-static {p2, v0, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {p0}, Lwq1/d;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lwq1/e;->a:Lwq1/e;

    invoke-virtual {v1}, Lwq1/e;->e()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-static {p2, v0, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    :cond_0
    invoke-virtual {p0}, Lwq1/d;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm91/u;

    new-instance v5, Lno0/h;

    const/16 v6, 0x19

    invoke-direct {v5, v4, p0, p1, v6}, Lno0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v4, Lx1/b;

    const v6, -0x7aa94c93

    invoke-direct {v4, v5, v2, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p2, v0, v4, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    goto :goto_0

    :cond_1
    sget-object p0, Lwq1/e;->a:Lwq1/e;

    invoke-virtual {p0}, Lwq1/e;->f()Lkotlin/jvm/functions/Function3;

    move-result-object p0

    invoke-static {p2, v0, p0, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    const-string v0, "$this$item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_0

    move p2, v2

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    and-int/2addr p4, v2

    move-object v7, p3

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lwq1/d;->e()Lm91/u;

    move-result-object v3

    sget-object p2, Lb2/t;->w:Lb2/t;

    const/16 p3, 0x8

    const/4 p4, 0x4

    if-nez v3, :cond_1

    const p1, -0x539139f2

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const v0, -0x539139f1

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    int-to-float v0, p4

    int-to-float v4, p3

    mul-float/2addr v0, v4

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v5, Lvx0/a;

    const/16 v0, 0xe

    invoke-direct {v5, v0}, Lvx0/a;-><init>(I)V

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v4, v0, :cond_3

    :cond_2
    new-instance v4, Lwo1/h;

    const/16 v0, 0xc

    invoke-direct {v4, p1, v0}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v6, v4

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v4, 0x0

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_1
    int-to-float p1, p4

    int-to-float p3, p3

    mul-float/2addr p1, p3

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {v7, p1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {p0}, Lwq1/d;->c()Lxq1/c;

    move-result-object p0

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 p1, p1, 0x3

    const/4 p4, 0x0

    invoke-static {p4, p0, v7, p1, v2}, Lxq1/b;->b(Landroidx/compose/ui/Modifier;Lxq1/c;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 p0, 0x3ff8000000000000L    # 1.5

    double-to-float p0, p0

    invoke-static {p0, p3, p2, v7}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x2543fd5

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-static {}, Lgb1/b0;->N()Li2/t;

    move-result-object p0

    const/4 p2, 0x1

    int-to-float p2, p2

    const/4 v0, 0x4

    int-to-float v1, v0

    mul-float/2addr p2, v1

    invoke-static {p2}, Lt0/j;->e(F)Lt0/i;

    move-result-object p2

    const/4 v1, 0x0

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, p0, p2, v1, v0}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ltq1/a$c;->a:Ltq1/a$c;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lm91/u;Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string v0, "$this$item"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p5, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p3, v0, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    and-int/2addr p5, v1

    move-object v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p5, p3}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_3

    const/4 p3, 0x4

    int-to-float p3, p3

    const/16 p4, 0x8

    int-to-float p4, p4

    mul-float/2addr p3, p4

    sget-object p4, Lb2/t;->w:Lb2/t;

    invoke-static {p3, p4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    invoke-static {v4, p3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p3, p4

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p3, :cond_1

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p4, p3, :cond_2

    :cond_1
    new-instance p4, Lwq1/a;

    const/4 p3, 0x1

    invoke-direct {p4, p1, p2, p3}, Lwq1/a;-><init>(Lwq1/d;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p4

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lwq1/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    new-instance p0, Ltq1/a$d;

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-direct {p0, p2}, Ltq1/a$d;-><init>(Lcom/whoop/navigation/e;)V

    move-object p2, p0

    goto :goto_1

    :cond_0
    instance-of v0, p2, Ltq1/a$f;

    if-eqz v0, :cond_2

    new-instance p2, Ltq1/a$a;

    invoke-virtual {p0}, Lwq1/d;->a()Ljava/lang/Long;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    invoke-direct {p2, v0, v1}, Ltq1/a$a;-><init>(J)V

    :cond_2
    :goto_1
    instance-of p0, p2, Ltq1/a;

    if-eqz p0, :cond_3

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lwq1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lwq1/c;->D(Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwq1/c;->G(Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(I)I
    .locals 0

    invoke-static {p0}, Lwq1/c;->y(I)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lm91/u;Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lwq1/c;->J(Lm91/u;Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwq1/c;->A(Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ltq1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwq1/c;->E(Ltq1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lwq1/c;->I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lwq1/c;->H(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwq1/c;->B(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwq1/c;->w(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lwq1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lwq1/c;->L(Lwq1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lp1/c1;Ltq1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwq1/c;->v(Lkotlin/jvm/functions/Function1;Lp1/c1;Ltq1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Luq1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lwq1/c;->C(Luq1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwq1/c;->x(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(I)I
    .locals 0

    invoke-static {p0}, Lwq1/c;->z(I)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Lwq1/d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwq1/c;->F(Lwq1/d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lwq1/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwq1/c;->K(Lwq1/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwq1/c;->u(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Luq1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luq1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x33fdfad7

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move/from16 v9, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_6

    move/from16 v9, p3

    invoke-virtual {v12, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_4

    :cond_8
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit16 v10, v0, 0x493

    const/16 v11, 0x492

    const/4 v14, 0x0

    if-eq v10, v11, :cond_9

    const/4 v10, 0x1

    goto :goto_6

    :cond_9
    move v10, v14

    :goto_6
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v12, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_2a

    if-eqz v6, :cond_a

    move/from16 v22, v14

    goto :goto_7

    :cond_a
    move/from16 v22, v9

    :goto_7
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v6, v9, :cond_b

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lp1/c1;

    sget-object v10, Lb2/e;->w:Lb2/m;

    invoke-static {v10, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    move-object/from16 p3, v6

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v12, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v12, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-nez v15, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_e

    :cond_d
    invoke-static {v7, v12, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v12, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x0

    invoke-static {v14, v7, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object v14, v6

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v12, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v23, v14

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_f

    invoke-virtual {v12, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v12, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-static {v5, v12, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v12, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v22, :cond_15

    const v5, 0x2b383705

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x2

    int-to-float v6, v5

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v6, v5

    move-object/from16 v14, v23

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v12, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v23, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    sget v5, Ljj0/a;->a:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v24

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v26

    sget v5, Luv0/c;->E:I

    invoke-static {v12, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v27

    const v40, 0xfff2

    const/16 v41, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v23 .. v41}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v5, v0, 0x380

    const/16 v11, 0x100

    if-ne v5, v11, :cond_12

    const/4 v5, 0x1

    goto :goto_a

    :cond_12
    const/4 v5, 0x0

    :goto_a
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_13

    if-ne v6, v9, :cond_14

    :cond_13
    new-instance v6, Lw01/f;

    const/4 v5, 0x7

    invoke-direct {v6, v3, v5}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v6, Lc93/a;

    sget v5, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v5, v5, 0x3

    move-object v7, v14

    const/16 v14, 0x35

    move-object/from16 v16, v9

    move-object v9, v6

    const/4 v6, 0x0

    move-object/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move/from16 v25, v11

    const/4 v11, 0x0

    move-object v2, v7

    move-object/from16 v43, v17

    move-object/from16 v7, v23

    move-object/from16 v42, v24

    move-object/from16 v17, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v13

    move v13, v5

    move-object/from16 v5, p3

    move-object/from16 p3, v15

    const/4 v15, 0x0

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_15
    move-object/from16 v5, p3

    move-object/from16 v17, v4

    move-object/from16 v43, v8

    move-object v4, v9

    move-object/from16 v42, v10

    move-object/from16 v16, v13

    move-object/from16 p3, v15

    move-object/from16 v2, v23

    const/4 v15, 0x0

    const v6, 0x2b40cecf

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_b
    instance-of v6, v1, Luq1/c$c;

    const/4 v7, 0x0

    if-eqz v6, :cond_19

    const v6, 0x2b42545e

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Luq1/c$c;

    invoke-virtual {v6}, Luq1/c$c;->a()Lwq1/d;

    move-result-object v6

    and-int/lit16 v0, v0, 0x380

    const/16 v11, 0x100

    if-ne v0, v11, :cond_16

    const/4 v13, 0x1

    goto :goto_c

    :cond_16
    move v13, v15

    :goto_c
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_17

    if-ne v0, v4, :cond_18

    :cond_17
    new-instance v0, Lp40/b;

    const/16 v8, 0x13

    invoke-direct {v0, v3, v5, v8}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v0, v12, v15, v15}, Lwq1/c;->D(Lwq1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move v0, v15

    :goto_d
    const/4 v6, 0x1

    goto/16 :goto_17

    :cond_19
    instance-of v6, v1, Luq1/c$a;

    if-eqz v6, :cond_21

    const v6, 0x2b4aabfa

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    new-instance v26, Lsz0/p0$b;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v8, Ljj0/a;->f:I

    const/4 v9, 0x2

    invoke-direct {v6, v8, v7, v9, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v30, 0x6

    const/16 v31, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v27, v6

    invoke-direct/range {v26 .. v31}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v8, Ljj0/a;->c:I

    invoke-direct {v6, v8, v7, v9, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v8, Ljj0/a;->e:I

    invoke-direct {v13, v8, v7, v9, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v10, Ljj0/a;->d:I

    invoke-direct {v8, v10, v7, v9, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v4, :cond_1a

    sget-object v9, Lwq1/c$a;->w:Lwq1/c$a;

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v9}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v9

    invoke-static {v2, v9}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    and-int/lit8 v10, v0, 0x70

    const/16 v11, 0x20

    if-ne v10, v11, :cond_1b

    const/4 v10, 0x1

    goto :goto_e

    :cond_1b
    move v10, v15

    :goto_e
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_1d

    if-ne v11, v4, :cond_1c

    goto :goto_f

    :cond_1c
    move-object/from16 v14, p1

    goto :goto_10

    :cond_1d
    :goto_f
    new-instance v11, Lw01/f;

    const/16 v10, 0x8

    move-object/from16 v14, p1

    invoke-direct {v11, v14, v10}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object v10, v11

    check-cast v10, Lc93/a;

    and-int/lit16 v0, v0, 0x380

    const/16 v11, 0x100

    if-ne v0, v11, :cond_1e

    const/4 v0, 0x1

    goto :goto_11

    :cond_1e
    move v0, v15

    :goto_11
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v0, :cond_1f

    if-ne v11, v4, :cond_20

    :cond_1f
    new-instance v11, Lw01/f;

    const/16 v0, 0x9

    invoke-direct {v11, v3, v0}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v11, Lc93/a;

    const/high16 v0, 0x30000

    sget v16, Lsz0/p0$b;->h:I

    or-int v0, v16, v0

    sget v16, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v17, v16, 0x3

    or-int v0, v0, v17

    shl-int/lit8 v17, v16, 0x9

    or-int v0, v0, v17

    shl-int/lit8 v16, v16, 0x15

    or-int v19, v0, v16

    const/16 v20, 0x0

    const/16 v21, 0xc44

    move v0, v15

    move-object v15, v9

    move-object v9, v8

    const/4 v8, 0x0

    move-object v14, v11

    const/4 v11, 0x1

    move-object/from16 v18, v12

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v7, v6

    move-object/from16 v6, v26

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v18

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_d

    :cond_21
    move v0, v15

    instance-of v6, v1, Luq1/c$b;

    if-eqz v6, :cond_29

    const v6, 0x2b580e15

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    sget-object v6, Ll0/m;->e:Ll0/h;

    sget-object v7, Lb2/e;->N:Lb2/k;

    const/16 v8, 0x36

    invoke-static {v6, v7, v12, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_22

    move-object/from16 v10, v17

    invoke-virtual {v12, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_12
    move-object/from16 v10, v16

    goto :goto_13

    :cond_22
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_12

    :goto_13
    invoke-static {v12, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v42

    invoke-static {v12, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_23

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_24

    :cond_23
    move-object/from16 v6, v43

    goto :goto_15

    :cond_24
    :goto_14
    move-object/from16 v6, p3

    goto :goto_16

    :goto_15
    invoke-static {v7, v12, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_14

    :goto_16
    invoke-static {v12, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_25

    sget-object v8, Lwq1/c$b;->w:Lwq1/c$b;

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v8}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v8

    invoke-static {v2, v8}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget v8, Lsz0/p0$c;->f:I

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v9, 0x3

    or-int v19, v8, v9

    const/16 v20, 0x0

    const/16 v21, 0xdfc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v18

    const/4 v6, 0x1

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-static {v5}, Lwq1/c;->s(Lp1/c1;)Z

    move-result v6

    if-eqz v6, :cond_26

    const v6, -0x5a4c08e    # -2.8459996E35f

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v2, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->t()J

    move-result-wide v8

    sget-object v2, Lwq1/e;->a:Lwq1/e;

    invoke-virtual {v2}, Lwq1/e;->d()Lc93/m;

    move-result-object v14

    const v16, 0x180006

    const/16 v17, 0x3a

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v15, v18

    invoke-static/range {v6 .. v17}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v15

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_26
    const v2, -0x5a310db

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_18
    invoke-static {v5}, Lwq1/c;->s(Lp1/c1;)Z

    move-result v6

    const/16 v2, 0x12c

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static {v2, v0, v8, v7}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_27

    new-instance v10, Lwo1/e0;

    const/4 v11, 0x7

    invoke-direct {v10, v11}, Lwo1/e0;-><init>(I)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v10}, Lc0/w0;->o(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object v9

    invoke-static {v2, v0, v8, v7}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_28

    new-instance v2, Lwo1/e0;

    const/16 v4, 0x8

    invoke-direct {v2, v4}, Lwo1/e0;-><init>(I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Lc0/w0;->s(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v0

    new-instance v2, Lea2/g;

    const/4 v4, 0x6

    invoke-direct {v2, v4, v5}, Lea2/g;-><init>(ILp1/c1;)V

    const v4, -0x7258974b

    invoke-static {v4, v12, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const v13, 0x30d80

    const/16 v14, 0x12

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object v8, v9

    move-object v9, v0

    invoke-static/range {v6 .. v14}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x0

    const/16 v15, 0x7e

    const-string v6, "OVERLAY_BEHAVIOR_INSIGHTS"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v13, v18

    invoke-static/range {v6 .. v15}, Lm12/d;->z(Ljava/lang/String;Lm12/e;ZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    const/4 v6, 0x1

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    move/from16 v4, v22

    goto :goto_19

    :cond_29
    const v1, 0x3b33ad1e

    invoke-static {v1, v12, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_2a
    invoke-virtual {v12}, Lp1/q;->X()V

    move v4, v9

    :goto_19
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2b

    new-instance v0, Lry2/h;

    const/16 v7, 0xb

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lry2/h;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final s(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final t(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ltq1/a$e;->a:Ltq1/a$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Lp1/c1;Ltq1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ltq1/a$a;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    invoke-static {p1, p0}, Lwq1/c;->t(Lp1/c1;Z)V

    goto :goto_0

    :cond_0
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Luq1/a$a;->a:Luq1/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ltq1/a$e;->a:Ltq1/a$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(I)I
    .locals 0

    return p0
.end method

.method private static final z(I)I
    .locals 0

    return p0
.end method
