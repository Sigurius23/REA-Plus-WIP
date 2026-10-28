.class public abstract Lis0/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001aA\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000c\u001a\u00020\u0000*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001b\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0016\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00048\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\u00118\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lis0/s0;",
        "viewState",
        "",
        "initiallyExpanded",
        "Lkotlin/Function1;",
        "Lis0/r0;",
        "Ll83/a0;",
        "onEvent",
        "z",
        "(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "B0",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "pendingExpand",
        "openedWithoutGesture",
        "expandWithKeyboard",
        "",
        "collapsedHeightPx",
        "expandedHeightPx",
        "",
        "collapsedPanelHeightPx",
        "scrimTopInWindowPx",
        "",
        "draftText",
        "showExpandedContent",
        "settledExpandedPx",
        "community-reactions-arch-mini_release"
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
.method private static final A(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/x2;",
            "Lg2/i;",
            "Lbc3/c0;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lis0/m0;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lis0/j0;->W(Lp1/c1;Z)V

    invoke-static {p4, v0}, Lis0/j0;->s0(Lp1/c1;Z)V

    if-eqz p0, :cond_0

    check-cast p0, Lb3/x1;

    invoke-virtual {p0}, Lb3/x1;->a()V

    :cond_0
    const/4 p0, 0x1

    check-cast p1, Lg2/l;

    invoke-virtual {p1, p0}, Lg2/l;->b(Z)V

    new-instance p0, Lis0/j0$e;

    const/4 p1, 0x0

    invoke-direct {p0, p5, p1}, Lis0/j0$e;-><init>(Lis0/m0;Lq83/d;)V

    const/4 p3, 0x3

    invoke-static {p2, p1, p1, p0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final synthetic A0(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lis0/j0;->s0(Lp1/c1;Z)V

    return-void
.end method

.method private static final B(Lp1/c1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lis0/j0;->W(Lp1/c1;Z)V

    return-void
.end method

.method private static final B0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    sget-object v1, Lis0/j0$g;->w:Lis0/j0$g;

    invoke-static {p0, v0, v1}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lis0/r0;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Z)Lp1/c1;
    .locals 0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p0

    return-object p0
.end method

.method private static final E()Lp1/z0;
    .locals 2

    new-instance v0, Lp1/g1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/g1;-><init>(F)V

    return-object v0
.end method

.method private static final F(Lp1/z0;)F
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p0

    return p0
.end method

.method private static final G(Lp1/z0;F)V
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method private static final H(Lp1/z0;)F
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p0

    return p0
.end method

.method private static final I(Lp1/z0;F)V
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method private static final J()Lp1/a1;
    .locals 2

    new-instance v0, Lp1/h1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/h1;-><init>(I)V

    return-object v0
.end method

.method private static final K(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final L(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final M(Lp1/c1;)Z
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

.method private static final N(Lp1/z0;)F
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p0

    return p0
.end method

.method private static final O(Lp1/z0;F)V
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method private static final P()Lp1/c1;
    .locals 1

    const-string v0, ""

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final Q(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final R(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final S(Lis0/m0;Lp1/c1;)Z
    .locals 1

    invoke-static {p1}, Lis0/j0;->M(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lis0/m0;->k()Lis0/b0;

    move-result-object p1

    sget-object v0, Lis0/b0;->Expanded:Lis0/b0;

    if-eq p1, v0, :cond_1

    invoke-virtual {p0}, Lis0/m0;->i()F

    move-result p0

    const p1, 0x3c23d70a    # 0.01f

    cmpl-float p0, p0, p1

    if-lez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final T(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
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

.method private static final U(Lis0/m0;)F
    .locals 2

    invoke-virtual {p0}, Lis0/m0;->i()F

    move-result p0

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p0, v0, v1}, Le93/b;->m(FFF)F

    move-result p0

    return p0
.end method

.method private static final V(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lis0/j0;->A(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final W(Lp1/c1;Z)V
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

.method private static final X(Lis0/m0;Lp1/z0;Lc93/a;Lp1/c1;Lp1/c1;Lb3/x2;Lg2/i;Lbc3/c0;Lp1/t2;Lp1/a1;Lm91/w;FFLp1/z0;Lp1/z0;Lis0/s0;Lp1/c1;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    move-object/from16 v3, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v9, p8

    move-object/from16 v0, p14

    move-object/from16 v6, p18

    const-string v15, "$this$BoxWithConstraints"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v15, p20, 0x6

    move/from16 v16, v15

    if-nez v16, :cond_1

    move-object/from16 v15, p19

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_0

    const/4 v15, 0x4

    goto :goto_0

    :cond_0
    const/4 v15, 0x2

    :goto_0
    or-int v15, p20, v15

    goto :goto_1

    :cond_1
    move/from16 v15, p20

    :goto_1
    and-int/lit8 v6, v15, 0x13

    move/from16 p20, v15

    const/16 v15, 0x12

    const/4 v14, 0x1

    if-eq v6, v15, :cond_2

    move v6, v14

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-int/lit8 v15, p20, 0x1

    move-object/from16 v14, p19

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v15, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_28

    sget-object v6, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v14, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/c;

    move-object/from16 v15, p18

    check-cast v15, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v15}, Landroidx/compose/foundation/layout/c;->c()F

    move-result v15

    const v18, 0x3f666666    # 0.9f

    mul-float v15, v15, v18

    invoke-interface {v6, v15}, Ly3/c;->q0(F)F

    move-result v6

    move-object/from16 v22, v14

    invoke-static/range {p13 .. p13}, Lis0/j0;->H(Lp1/z0;)F

    move-result v14

    invoke-static {v14, v6}, Ljava/lang/Math;->min(FF)F

    move-result v18

    invoke-static {}, Lis0/n0;->c()Ld0/e2;

    move-result-object v19

    const/16 v23, 0xc30

    const/16 v24, 0x14

    const-string v20, "reactionsExpandedHeight"

    const/16 v21, 0x0

    invoke-static/range {v18 .. v24}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v14

    move/from16 p19, v6

    move-object/from16 p18, v14

    move-object/from16 v14, v22

    invoke-virtual {v3}, Lis0/m0;->j()Lis0/b0;

    move-result-object v6

    move/from16 v19, v15

    sget-object v15, Lis0/b0;->Expanded:Lis0/b0;

    if-ne v6, v15, :cond_3

    invoke-virtual {v3}, Lis0/m0;->k()Lis0/b0;

    move-result-object v6

    if-ne v6, v15, :cond_3

    invoke-static/range {p18 .. p18}, Lis0/j0;->Y(Lp1/t2;)F

    move-result v18

    :cond_3
    move/from16 v6, v18

    invoke-virtual {v14, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v14, v6}, Lp1/q;->d(F)Z

    move-result v18

    or-int v15, v15, v18

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v15, v15, v18

    move/from16 p18, v15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez p18, :cond_4

    if-ne v15, v12, :cond_5

    :cond_4
    new-instance v15, Lis0/d0;

    invoke-direct {v15, v6, v3, v7}, Lis0/d0;-><init>(FLis0/m0;Lp1/z0;)V

    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v15, Lc93/a;

    invoke-static {v15, v14}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    invoke-static {v9}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v6

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_c

    const v6, -0x70bef0d8

    invoke-virtual {v14, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->u()J

    move-result-wide v6

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-string v13, "ReactionsPanelScrim"

    invoke-static {v11, v13}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v12, :cond_6

    new-instance v13, Lis0/t;

    const/4 v10, 0x3

    invoke-direct {v13, v0, v10}, Lis0/t;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v13}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v14, v6, v7}, Lp1/q;->f(J)Z

    move-result v11

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_7

    if-ne v13, v12, :cond_8

    :cond_7
    new-instance v13, Lis0/g0;

    invoke-direct {v13, v6, v7, v8, v0}, Lis0/g0;-><init>(JLc93/a;Lp1/z0;)V

    invoke-virtual {v14, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v13}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_9

    invoke-static {v14}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v0

    :cond_9
    move-object v10, v0

    check-cast v10, Lj0/i;

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    move-object/from16 v6, p7

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v0, v11

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v0, v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v0, :cond_b

    if-ne v11, v12, :cond_a

    goto :goto_3

    :cond_a
    move-object v13, v3

    move-object v0, v11

    move/from16 v11, p19

    goto :goto_4

    :cond_b
    :goto_3
    new-instance v0, Lis0/j0$c;

    move-object v11, v6

    move-object v6, v3

    move-object v3, v11

    move/from16 v11, p19

    invoke-direct/range {v0 .. v6}, Lis0/j0$c;-><init>(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)V

    move-object v13, v6

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_4
    check-cast v0, Lj93/g;

    move-object v5, v0

    check-cast v5, Lc93/a;

    const/16 v6, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, v10

    move-object/from16 v10, p3

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Lis0/j0;->B0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v14, v1}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_c
    move/from16 v11, p19

    move-object v13, v3

    move-object v10, v4

    const/4 v1, 0x0

    const v0, -0x70b0bf10

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    :goto_5
    sget-object v0, Lb2/e;->H:Lb2/m;

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v1, v15, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    move-object/from16 v2, p9

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    move-object/from16 v3, p10

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_d

    if-ne v4, v12, :cond_e

    :cond_d
    new-instance v4, Lig0/h;

    const/16 v1, 0x14

    invoke-direct {v4, v3, v9, v2, v1}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v4}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v1, p11

    move/from16 v4, p12

    invoke-static {v0, v1, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->w:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v14, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-eqz v2, :cond_f

    invoke-virtual {v14, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_f
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_6
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v14, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    invoke-static {v6, v14, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/4 v1, 0x0

    move/from16 v2, v19

    const/4 v5, 0x1

    invoke-static {v15, v1, v2, v5}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    :cond_12
    invoke-interface {v0, v15}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-static {v9}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v1

    invoke-static/range {p13 .. p13}, Lis0/j0;->H(Lp1/z0;)F

    move-result v0

    invoke-static {v0, v11}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v2, v5

    sub-float v2, v2, p11

    const/4 v6, 0x1

    int-to-float v7, v6

    mul-float/2addr v7, v5

    sub-float v5, v7, v4

    invoke-virtual {v14, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    move-object/from16 v7, p1

    invoke-virtual {v14, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v14, v11}, Lp1/q;->d(F)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_13

    if-ne v6, v12, :cond_14

    :cond_13
    new-instance v6, Lis0/d0;

    invoke-direct {v6, v13, v11, v7}, Lis0/d0;-><init>(Lis0/m0;FLp1/z0;)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v6, Lc93/a;

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v14, v11}, Lp1/q;->d(F)Z

    move-result v16

    or-int v4, v4, v16

    invoke-virtual {v14, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v4, v4, v16

    move/from16 p7, v0

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_15

    if-ne v0, v12, :cond_16

    :cond_15
    new-instance v0, Lis0/h0;

    move-object/from16 v4, p13

    invoke-direct {v0, v11, v9, v4, v7}, Lis0/h0;-><init>(FLp1/t2;Lp1/z0;Lp1/z0;)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    new-instance v0, Lis0/j;

    const/4 v8, 0x0

    move-object v4, v3

    move/from16 v3, p7

    move-object/from16 p7, v15

    move-object v15, v4

    move-object/from16 v11, p4

    move-object/from16 v9, p5

    move-object/from16 v13, p6

    move v4, v2

    const/16 v17, 0x0

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v8}, Lis0/j;-><init>(ZLc93/a;FFFLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {p16 .. p16}, Lis0/j0;->Q(Lp1/c1;)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {p8 .. p8}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual/range {p15 .. p15}, Lis0/s0;->k()Z

    move-result v1

    if-nez v1, :cond_17

    const/16 v21, 0x1

    goto :goto_7

    :cond_17
    move/from16 v21, v17

    :goto_7
    invoke-static {v11}, Lis0/j0;->r0(Lp1/c1;)Z

    move-result v22

    move-object/from16 v1, p16

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_18

    if-ne v3, v12, :cond_19

    :cond_18
    new-instance v3, Lis0/t;

    const/4 v2, 0x1

    invoke-direct {v3, v1, v2}, Lis0/t;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object/from16 v23, v3

    check-cast v23, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1a

    if-ne v3, v12, :cond_1b

    :cond_1a
    new-instance v3, Lis0/e0;

    const/4 v2, 0x0

    invoke-direct {v3, v2, v10, v11}, Lis0/e0;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v24, v3

    check-cast v24, Lc93/a;

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1c

    if-ne v3, v12, :cond_1d

    :cond_1c
    new-instance v3, Lis0/k;

    const/4 v2, 0x1

    invoke-direct {v3, v11, v2}, Lis0/k;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v25, v3

    check-cast v25, Lc93/a;

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1e

    if-ne v3, v12, :cond_1f

    :cond_1e
    new-instance v3, Lis0/e0;

    const/4 v2, 0x1

    invoke-direct {v3, v2, v11, v10}, Lis0/e0;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object/from16 v26, v3

    check-cast v26, Lc93/a;

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    move-object/from16 v6, p17

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_20

    if-ne v3, v12, :cond_21

    :cond_20
    new-instance v3, Lis0/i0;

    const/4 v2, 0x3

    invoke-direct {v3, v2, v1, v6}, Lis0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object/from16 v27, v3

    check-cast v27, Lc93/a;

    new-instance v18, Lis0/a0;

    const/16 v20, 0x1

    invoke-direct/range {v18 .. v27}, Lis0/a0;-><init>(Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_22

    if-ne v2, v12, :cond_23

    :cond_22
    new-instance v2, Lam2/d;

    invoke-direct {v2, v9, v13, v11, v10}, Lam2/d;-><init>(Lb3/x2;Lg2/i;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    move-object v5, v2

    check-cast v5, Lc93/a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v3, p0

    move-object/from16 v10, p2

    move-object/from16 v1, p15

    move-object v2, v0

    move-object v7, v14

    move-object/from16 v4, v18

    move-object/from16 v0, p7

    invoke-static/range {v0 .. v9}, Lis0/x;->o(Landroidx/compose/ui/Modifier;Lis0/s0;Lis0/j;Lis0/m0;Lis0/a0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    move-object/from16 v2, p9

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_24

    if-ne v1, v12, :cond_25

    :cond_24
    new-instance v1, Lim1/a0;

    const/16 v0, 0x8

    invoke-direct {v1, v15, v10, v2, v0}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v1, Lc93/a;

    invoke-static {v1, v14}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v14, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_26

    if-ne v1, v12, :cond_27

    :cond_26
    new-instance v1, Lis0/t;

    const/4 v0, 0x2

    invoke-direct {v1, v15, v0}, Lis0/t;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v15, v1, v14}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_8

    :cond_28
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final Y(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final Z(Lm91/w;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lis0/j0$f;

    invoke-direct {p1, p0}, Lis0/j0$f;-><init>(Lm91/w;)V

    return-object p1
.end method

.method public static synthetic a(Lis0/m0;Lp1/z0;Lc93/a;Lp1/c1;Lp1/c1;Lb3/x2;Lg2/i;Lbc3/c0;Lp1/t2;Lp1/a1;Lm91/w;FFLp1/z0;Lp1/z0;Lis0/s0;Lp1/c1;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p20}, Lis0/j0;->X(Lis0/m0;Lp1/z0;Lc93/a;Lp1/c1;Lp1/c1;Lb3/x2;Lg2/i;Lbc3/c0;Lp1/t2;Lp1/a1;Lm91/w;FFLp1/z0;Lp1/z0;Lis0/s0;Lp1/c1;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(FLis0/m0;Lp1/z0;)Ll83/a0;
    .locals 2

    invoke-static {p2}, Lis0/j0;->F(Lp1/z0;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    cmpl-float v0, p0, v1

    if-lez v0, :cond_0

    invoke-static {p2}, Lis0/j0;->F(Lp1/z0;)F

    move-result p2

    invoke-virtual {p1, p2, p0}, Lis0/m0;->p(FF)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic b(JLc93/a;Lp1/z0;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lis0/j0;->c0(JLc93/a;Lp1/z0;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b0(Lp1/z0;Ly2/y;)Ll83/a0;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-interface {p1, v0, v1}, Ly2/y;->E(J)J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p0, p1}, Lis0/j0;->O(Lp1/z0;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic c(Z)Lp1/c1;
    .locals 0

    invoke-static {p0}, Lis0/j0;->D(Z)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method private static final c0(JLc93/a;Lp1/z0;Lk2/e;)Ll83/a0;
    .locals 12

    const-string v0, "$this$drawBehind"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lis0/j0;->N(Lp1/z0;)F

    move-result v0

    neg-float v0, v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v4, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long/2addr v4, v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    shr-long/2addr v2, v0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v8

    and-long/2addr v8, v6

    long-to-int v3, v8

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {p3}, Lis0/j0;->N(Lp1/z0;)F

    move-result p3

    add-float/2addr v3, p3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long v8, p3

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long v2, p3

    shl-long/2addr v8, v0

    and-long/2addr v2, v6

    or-long v6, v8, v2

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v8

    const/4 v10, 0x0

    const/16 v11, 0x70

    const/4 v9, 0x0

    move-wide v2, p0

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lis0/j0;->h0(Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d0(Lm91/w;Lp1/t2;Lp1/a1;Ly3/l;)Ll83/a0;
    .locals 4

    invoke-static {p1}, Lis0/j0;->T(Lp1/t2;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-wide v0, p3, Ly3/l;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p2, p1}, Lis0/j0;->L(Lp1/a1;I)V

    if-eqz p0, :cond_0

    iget-wide p1, p3, Ly3/l;->a:J

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-virtual {p0, p1}, Lm91/w;->e(I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lis0/j0;->j0(Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e0(Lis0/m0;FLp1/z0;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p2}, Lis0/j0;->F(Lp1/z0;)F

    move-result p2

    invoke-virtual {p0, p2}, Lis0/m0;->d(F)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    const/4 p2, 0x1

    if-ge p1, p2, :cond_0

    move p1, p2

    :cond_0
    if-le p0, p1, :cond_1

    move p0, p1

    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic f()Lp1/z0;
    .locals 1

    invoke-static {}, Lis0/j0;->E()Lp1/z0;

    move-result-object v0

    return-object v0
.end method

.method private static final f0(FLp1/t2;Lp1/z0;Lp1/z0;I)Ll83/a0;
    .locals 2

    int-to-float p4, p4

    invoke-static {p1}, Lis0/j0;->T(Lp1/t2;)Z

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_4

    invoke-static {p4, p0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    sub-float/2addr p0, v0

    cmpg-float p0, p4, p0

    const/4 p3, 0x0

    const/4 p4, 0x1

    if-gez p0, :cond_0

    move p0, p4

    goto :goto_0

    :cond_0
    move p0, p3

    :goto_0
    invoke-static {p2}, Lis0/j0;->H(Lp1/z0;)F

    move-result v1

    add-float/2addr v1, v0

    cmpl-float v1, p1, v1

    if-lez v1, :cond_1

    move v1, p4

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    if-eqz p0, :cond_2

    invoke-static {p2}, Lis0/j0;->H(Lp1/z0;)F

    move-result p0

    sub-float/2addr p0, v0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_2

    move p3, p4

    :cond_2
    invoke-static {p2}, Lis0/j0;->H(Lp1/z0;)F

    move-result p0

    const/4 p4, 0x0

    cmpg-float p0, p0, p4

    if-lez p0, :cond_3

    if-nez v1, :cond_3

    if-eqz p3, :cond_5

    :cond_3
    invoke-static {p2, p1}, Lis0/j0;->I(Lp1/z0;F)V

    goto :goto_2

    :cond_4
    invoke-static {p3}, Lis0/j0;->F(Lp1/z0;)F

    move-result p0

    sub-float/2addr p0, p4

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpl-float p0, p0, v0

    if-lez p0, :cond_5

    invoke-static {p3, p4}, Lis0/j0;->G(Lp1/z0;F)V

    :cond_5
    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic g()Lp1/a1;
    .locals 1

    invoke-static {}, Lis0/j0;->J()Lp1/a1;

    move-result-object v0

    return-object v0
.end method

.method private static final g0(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lis0/j0;->R(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic h()Lp1/c1;
    .locals 1

    invoke-static {}, Lis0/j0;->q0()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method private static final h0(Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lis0/j0;->B(Lp1/c1;)V

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lis0/j0;->s0(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic i(FLis0/m0;Lp1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lis0/j0;->a0(FLis0/m0;Lp1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i0(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lis0/j0;->s0(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic j(Lm91/w;Lp1/t2;Lp1/a1;Ly3/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lis0/j0;->d0(Lm91/w;Lp1/t2;Lp1/a1;Ly3/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j0(Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lis0/j0;->s0(Lp1/c1;Z)V

    invoke-static {p1}, Lis0/j0;->B(Lp1/c1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic k(Lis0/m0;Lp1/c1;)Z
    .locals 0

    invoke-static {p0, p1}, Lis0/j0;->S(Lis0/m0;Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method private static final k0(Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lis0/j0;->Q(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lis0/r0$i;

    invoke-direct {v1, v0}, Lis0/r0$i;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, ""

    invoke-static {p0, p1}, Lis0/j0;->R(Lp1/c1;Ljava/lang/String;)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic l(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lis0/j0;->n0(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l0(Lb3/x2;Lg2/i;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lis0/j0;->s0(Lp1/c1;Z)V

    if-eqz p0, :cond_0

    check-cast p0, Lb3/x1;

    invoke-virtual {p0}, Lb3/x1;->a()V

    :cond_0
    const/4 p0, 0x1

    check-cast p1, Lg2/l;

    invoke-virtual {p1, p0}, Lg2/l;->b(Z)V

    invoke-static {p3}, Lis0/j0;->B(Lp1/c1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic m(Lm91/w;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1}, Lis0/j0;->Z(Lm91/w;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method private static final m0(Lm91/w;Lc93/a;Lp1/a1;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p2}, Lis0/j0;->K(Lp1/a1;)I

    move-result p2

    invoke-virtual {p0, p2}, Lm91/w;->e(I)V

    :cond_0
    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Lm91/w;->f(Lc93/a;)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic n(FLis0/m0;Lp1/z0;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p1, p0, p2}, Lis0/j0;->e0(Lis0/m0;FLp1/z0;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final n0(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lis0/j0;->z(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic o(Lm91/w;Lc93/a;Lp1/a1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lis0/j0;->m0(Lm91/w;Lc93/a;Lp1/a1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o0(Lp1/c1;)Z
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

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lis0/j0;->k0(Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final p0(Lp1/c1;Z)V
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

.method public static synthetic q(Lis0/r0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lis0/j0;->C(Lis0/r0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final q0()Lp1/c1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic r()Lp1/c1;
    .locals 1

    invoke-static {}, Lis0/j0;->P()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method private static final r0(Lp1/c1;)Z
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

.method public static synthetic s(Lis0/m0;)F
    .locals 0

    invoke-static {p0}, Lis0/j0;->U(Lis0/m0;)F

    move-result p0

    return p0
.end method

.method private static final s0(Lp1/c1;Z)V
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

.method public static synthetic t(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lis0/j0;->V(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lis0/j0;->A(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)V

    return-void
.end method

.method public static synthetic u(Lb3/x2;Lg2/i;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lis0/j0;->l0(Lb3/x2;Lg2/i;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u0(Lp1/z0;)F
    .locals 0

    invoke-static {p0}, Lis0/j0;->F(Lp1/z0;)F

    move-result p0

    return p0
.end method

.method public static synthetic v(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lis0/j0;->i0(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(Lp1/z0;)F
    .locals 0

    invoke-static {p0}, Lis0/j0;->H(Lp1/z0;)F

    move-result p0

    return p0
.end method

.method public static synthetic w(FLp1/t2;Lp1/z0;Lp1/z0;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lis0/j0;->f0(FLp1/t2;Lp1/z0;Lp1/z0;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lis0/j0;->M(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic x(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lis0/j0;->g0(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lis0/j0;->W(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic y(Lp1/z0;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lis0/j0;->b0(Lp1/z0;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lis0/j0;->o0(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final z(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lis0/s0;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v0, p5

    const-string v1, "viewState"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p4

    check-cast v1, Lp1/q;

    const v3, -0x31bb3f58

    invoke-virtual {v1, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p6, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p6, 0x4

    const/16 v8, 0x100

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move/from16 v9, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v9, v0, 0x180

    if-nez v9, :cond_5

    move/from16 v9, p2

    invoke-virtual {v1, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_7

    move v10, v8

    goto :goto_3

    :cond_7
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v6, v10

    :goto_4
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v6, v6, 0xc00

    :cond_8
    move-object/from16 v12, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v12, v0, 0xc00

    if-nez v12, :cond_8

    move-object/from16 v12, p3

    invoke-virtual {v1, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_5

    :cond_a
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v6, v13

    :goto_6
    and-int/lit16 v13, v6, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x0

    if-eq v13, v14, :cond_b

    const/4 v13, 0x1

    goto :goto_7

    :cond_b
    move v13, v15

    :goto_7
    and-int/lit8 v14, v6, 0x1

    invoke-virtual {v1, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_2b

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_c

    move-object v3, v13

    goto :goto_8

    :cond_c
    move-object v3, v5

    :goto_8
    if-eqz v7, :cond_d

    move v5, v15

    goto :goto_9

    :cond_d
    move v5, v9

    :goto_9
    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_f

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_e

    new-instance v9, Lis0/y;

    const/16 v10, 0x8

    invoke-direct {v9, v10}, Lis0/y;-><init>(I)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v9, Lkotlin/jvm/functions/Function1;

    move-object/from16 v17, v9

    goto :goto_a

    :cond_f
    move-object/from16 v17, v12

    :goto_a
    new-array v9, v15, [Ljava/lang/Object;

    and-int/lit16 v10, v6, 0x380

    if-ne v10, v8, :cond_10

    const/4 v8, 0x1

    goto :goto_b

    :cond_10
    move v8, v15

    :goto_b
    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_11

    if-ne v10, v7, :cond_12

    :cond_11
    new-instance v10, Lc41/r1;

    const/4 v8, 0x2

    invoke-direct {v10, v5, v8}, Lc41/r1;-><init>(ZI)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v10, Lc93/a;

    invoke-static {v9, v10, v1, v15}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lp1/c1;

    invoke-static {v8}, Lis0/j0;->M(Lp1/c1;)Z

    move-result v9

    invoke-static {v9, v1, v15, v15}, Lis0/n0;->d(ZLandroidx/compose/runtime/Composer;II)Lis0/m0;

    move-result-object v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_13

    invoke-static {v8}, Lis0/j0;->M(Lp1/c1;)Z

    move-result v10

    invoke-static {v10, v1}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v10

    :cond_13
    check-cast v10, Lp1/c1;

    new-array v12, v15, [Ljava/lang/Object;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v7, :cond_14

    new-instance v14, Lis0/i;

    const/16 v11, 0x9

    invoke-direct {v14, v11}, Lis0/i;-><init>(I)V

    invoke-virtual {v1, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v14, Lc93/a;

    const/16 v11, 0x30

    invoke-static {v12, v14, v1, v11}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lp1/c1;

    new-array v14, v15, [Ljava/lang/Object;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_15

    new-instance v4, Lis0/i;

    const/16 v15, 0xa

    invoke-direct {v4, v15}, Lis0/i;-><init>(I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v4, Lc93/a;

    invoke-static {v14, v4, v1, v11}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/z0;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    const/4 v15, 0x0

    if-ne v14, v7, :cond_16

    invoke-static {v15, v1}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v14

    :cond_16
    check-cast v14, Lp1/z0;

    const/4 v15, 0x0

    new-array v11, v15, [Ljava/lang/Object;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v7, :cond_17

    new-instance v15, Lis0/i;

    const/16 v0, 0xb

    invoke-direct {v15, v0}, Lis0/i;-><init>(I)V

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v15, Lc93/a;

    const/16 v0, 0x30

    invoke-static {v11, v15, v1, v0}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lp1/a1;

    invoke-static {}, Lm91/x;->c()Lp1/t1;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/w;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v7, :cond_18

    move-object/from16 p3, v0

    const/4 v0, 0x0

    invoke-static {v0, v1}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v15

    goto :goto_c

    :cond_18
    move-object/from16 p3, v0

    :goto_c
    check-cast v15, Lp1/z0;

    const/4 v0, 0x0

    new-array v2, v0, [Ljava/lang/Object;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_19

    new-instance v0, Lis0/i;

    move/from16 p0, v5

    const/16 v5, 0xc

    invoke-direct {v0, v5}, Lis0/i;-><init>(I)V

    invoke-virtual {v1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_d

    :cond_19
    move/from16 p0, v5

    :goto_d
    check-cast v0, Lc93/a;

    const/16 v5, 0x30

    invoke-static {v2, v0, v1, v5}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/c1;

    sget-object v2, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg2/i;

    sget-object v5, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v1, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb3/x2;

    move-object/from16 p2, v0

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_1a

    invoke-static {v1}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v0, Lbc3/c0;

    invoke-virtual {v1, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    move-object/from16 v26, v10

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v19, :cond_1c

    if-ne v10, v7, :cond_1b

    goto :goto_e

    :cond_1b
    move-object/from16 v27, v11

    goto :goto_f

    :cond_1c
    :goto_e
    new-instance v10, Lis0/i0;

    move-object/from16 v27, v11

    const/4 v11, 0x4

    invoke-direct {v10, v11, v9, v8}, Lis0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v10

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v10, Lp1/t2;

    invoke-virtual {v1, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    move-object/from16 v28, v10

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v11, :cond_1d

    if-ne v10, v7, :cond_1e

    :cond_1d
    new-instance v10, Lis0/k0;

    const/4 v11, 0x1

    invoke-direct {v10, v9, v11}, Lis0/k0;-><init>(Lis0/m0;I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v10, Lc93/a;

    invoke-static/range {v28 .. v28}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v11

    move-object/from16 v29, v10

    if-eqz v11, :cond_1f

    const/4 v11, 0x0

    int-to-float v10, v11

    const/16 v11, 0x8

    goto :goto_10

    :cond_1f
    const/4 v10, 0x2

    const/4 v11, 0x0

    int-to-float v10, v10

    move/from16 v18, v10

    const/16 v11, 0x8

    int-to-float v10, v11

    mul-float v10, v10, v18

    :goto_10
    invoke-static/range {v28 .. v28}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v18

    if-eqz v18, :cond_20

    move/from16 v30, v10

    const/4 v11, 0x0

    int-to-float v10, v11

    goto :goto_11

    :cond_20
    move/from16 v30, v10

    const/4 v10, 0x1

    int-to-float v11, v10

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v10, v11

    :goto_11
    invoke-static/range {v28 .. v28}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v11

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    invoke-virtual {v1, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v18, v18, v19

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v18, v18, v19

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    or-int v18, v18, v19

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    or-int v18, v18, v19

    invoke-virtual {v1, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v18, v18, v19

    move-object/from16 v21, v0

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v18, :cond_22

    if-ne v0, v7, :cond_21

    goto :goto_12

    :cond_21
    move-object/from16 v31, v9

    move-object v9, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v12

    move-object v12, v5

    move-object/from16 v5, v31

    move-object/from16 v31, v21

    goto :goto_13

    :cond_22
    :goto_12
    new-instance v18, La81/l;

    move-object/from16 v20, v2

    move-object/from16 v19, v5

    move-object/from16 v22, v8

    move-object/from16 v24, v9

    move-object/from16 v23, v12

    invoke-direct/range {v18 .. v24}, La81/l;-><init>(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)V

    move-object/from16 v0, v18

    move-object/from16 v12, v19

    move-object/from16 v9, v20

    move-object/from16 v31, v21

    move-object/from16 v5, v23

    move-object/from16 v2, v24

    invoke-virtual {v1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    check-cast v0, Lc93/a;

    move/from16 v32, v10

    const/4 v10, 0x0

    invoke-static {v0, v11, v1, v10, v10}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v8}, Lis0/j0;->M(Lp1/c1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    and-int/lit16 v6, v6, 0x1c00

    const/16 v10, 0x800

    if-ne v6, v10, :cond_23

    const/16 v25, 0x1

    goto :goto_14

    :cond_23
    const/16 v25, 0x0

    :goto_14
    or-int v6, v11, v25

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v6, v10

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v6, v10

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_25

    if-ne v10, v7, :cond_24

    goto :goto_15

    :cond_24
    move-object v6, v4

    move-object v4, v8

    goto :goto_16

    :cond_25
    :goto_15
    new-instance v16, Lis0/j0$a;

    const/16 v23, 0x0

    move-object/from16 v18, v2

    move-object/from16 v21, v4

    move-object/from16 v19, v8

    move-object/from16 v22, v14

    move-object/from16 v20, v26

    invoke-direct/range {v16 .. v23}, Lis0/j0$a;-><init>(Lkotlin/jvm/functions/Function1;Lis0/m0;Lp1/c1;Lp1/c1;Lp1/z0;Lp1/z0;Lq83/d;)V

    move-object/from16 v10, v16

    move-object/from16 v4, v19

    move-object/from16 v6, v21

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v10, Lc93/m;

    invoke-static {v1, v10, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-virtual {v1, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-virtual {v1, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_26

    if-ne v8, v7, :cond_27

    :cond_26
    new-instance v18, Lis0/j0$b;

    const/16 v24, 0x0

    move-object/from16 v19, v2

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v21, v9

    move-object/from16 v20, v12

    invoke-direct/range {v18 .. v24}, Lis0/j0$b;-><init>(Lis0/m0;Lb3/x2;Lg2/i;Lp1/c1;Lp1/c1;Lq83/d;)V

    move-object/from16 v8, v18

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v8, Lc93/m;

    invoke-static {v1, v8, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static/range {v28 .. v28}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v8

    if-eqz v8, :cond_28

    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_17

    :cond_28
    move-object v0, v13

    :goto_17
    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {v28 .. v28}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v7

    if-eqz v7, :cond_29

    invoke-static {v13}, Lis0/j0;->B0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    :cond_29
    invoke-interface {v0, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {v28 .. v28}, Lis0/j0;->T(Lp1/t2;)Z

    move-result v7

    if-eqz v7, :cond_2a

    const-string v7, "ReactionsPanelExpanded"

    goto :goto_18

    :cond_2a
    const-string v7, "ReactionsPanelCollapsed"

    :goto_18
    invoke-static {v0, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    new-instance v0, Lis0/f0;

    move/from16 v21, p0

    move-object/from16 v16, p1

    move-object/from16 v11, p3

    move-object/from16 v33, v1

    move-object v1, v2

    move-object/from16 v20, v3

    move-object v2, v6

    move-object v7, v9

    move-object v6, v12

    move-object/from16 v18, v17

    move-object/from16 v10, v27

    move-object/from16 v9, v28

    move-object/from16 v3, v29

    move/from16 v12, v30

    move-object/from16 v8, v31

    move/from16 v13, v32

    move-object/from16 v17, p2

    invoke-direct/range {v0 .. v18}, Lis0/f0;-><init>(Lis0/m0;Lp1/z0;Lc93/a;Lp1/c1;Lp1/c1;Lb3/x2;Lg2/i;Lbc3/c0;Lp1/t2;Lp1/a1;Lm91/w;FFLp1/z0;Lp1/z0;Lis0/s0;Lp1/c1;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v17, v18

    const v1, 0x658f2a12

    move-object/from16 v6, v33

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0xc00

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v2, v19

    invoke-static/range {v2 .. v8}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v4, v17

    move-object/from16 v1, v20

    move/from16 v3, v21

    goto :goto_19

    :cond_2b
    move-object v6, v1

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v1, v5

    move v3, v9

    move-object v4, v12

    :goto_19
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2c

    new-instance v0, Law0/h;

    const/16 v7, 0xd

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Law0/h;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZLl83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2c
    return-void
.end method

.method public static final synthetic z0(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lis0/j0;->p0(Lp1/c1;Z)V

    return-void
.end method
