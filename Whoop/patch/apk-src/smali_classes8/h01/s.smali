.class public abstract Lh01/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0012\u00b2\u0006\u000e\u0010\n\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u000e8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lh01/t;",
        "viewState",
        "",
        "isExpandedView",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Lh01/t;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "hasOverflow",
        "isExpanded",
        "Ly3/f;",
        "maxHeight",
        "",
        "titleMaxLines",
        "bodyMaxLinesWhenExpanded",
        "bodyMaxLines",
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
.method public static synthetic a(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lh01/s;->w(Lp1/c1;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lp1/c1;)Ly3/f;
    .locals 0

    invoke-static {p0}, Lh01/s;->u(Lp1/c1;)Ly3/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh01/s;->n(Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lh01/s;->o(Lp1/c1;Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lh01/t;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/t2;Lp1/c1;Lp1/t2;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lh01/s;->m(Lh01/t;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/t2;Lp1/c1;Lp1/t2;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lh01/t;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh01/s;->p(Lkotlin/jvm/functions/Function1;Lh01/t;Ljava/lang/String;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lh01/t;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lh01/s;->q(Lh01/t;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lh01/t;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh01/t;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v9, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x1173321c

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_2

    move/from16 v5, p1

    invoke-virtual {v10, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit16 v6, v9, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_6
    and-int/lit16 v6, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x1

    const/4 v11, 0x0

    if-eq v6, v7, :cond_7

    move v6, v8

    goto :goto_5

    :cond_7
    move v6, v11

    :goto_5
    and-int/2addr v0, v8

    invoke-virtual {v10, v0, v6}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_11

    if-eqz v4, :cond_8

    move v12, v11

    goto :goto_6

    :cond_8
    move v12, v5

    :goto_6
    invoke-virtual {v1}, Lh01/t;->c()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_a

    const v0, -0x53884838

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lh01/t;->e()Lh01/a;

    move-result-object v0

    invoke-virtual {v0}, Lh01/a;->getBorderInformation()Ld11/a;

    move-result-object v0

    if-nez v0, :cond_9

    const v0, -0x53884839

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object v0, v4

    goto :goto_7

    :cond_9
    const v5, -0x7e90c886

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v5

    const/16 v6, 0x30

    invoke-static {v0, v5, v10, v6}, Ld11/f;->y(Ld11/a;FLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v0

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object v15, v0

    goto :goto_8

    :cond_a
    const v0, -0x5387bfdf

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object v15, v4

    :goto_8
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v0, v5, :cond_b

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_c

    invoke-static {v12, v10}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v6

    :cond_c
    move-object v8, v6

    check-cast v8, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_d

    new-instance v6, Lg11/b;

    const/16 v7, 0x10

    invoke-direct {v6, v7, v8}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-static {v6}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v6

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lp1/t2;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_e

    new-instance v7, Lg11/b;

    const/16 v13, 0x11

    invoke-direct {v7, v13, v8}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-static {v7}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lp1/t2;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v5, :cond_f

    const/16 v5, 0x64

    invoke-static {v5, v10}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v13

    :cond_f
    check-cast v13, Lp1/c1;

    invoke-static {v8}, Lh01/s;->s(Lp1/c1;)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-static {v13}, Lh01/s;->j(Lp1/c1;)I

    move-result v5

    goto :goto_9

    :cond_10
    const/4 v5, 0x5

    :goto_9
    invoke-static {v5, v10}, Ld0/g;->c(ILp1/q;)Lp1/t2;

    move-result-object v5

    invoke-virtual {v1}, Lh01/t;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {v14, v10, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lh01/t;->e()Lh01/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lh01/a;->getStyleModifier()Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v3, 0x3

    invoke-static {v11, v4, v3}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v11, 0x23

    int-to-float v11, v11

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v11, v3

    invoke-static {v6}, Lh01/s;->v(Lp1/t2;)F

    move-result v6

    invoke-static {v4, v11, v6}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v4, 0x3

    int-to-float v4, v4

    mul-float/2addr v4, v3

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v16

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->V0()J

    move-result-wide v17

    const/4 v3, 0x0

    int-to-float v3, v3

    move-object v6, v5

    move-object v5, v0

    new-instance v0, Lbm2/p;

    move-object v4, v7

    move-object v7, v13

    move v13, v3

    move-object v3, v14

    invoke-direct/range {v0 .. v8}, Lbm2/p;-><init>(Lh01/t;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/t2;Lp1/c1;Lp1/t2;Lp1/c1;Lp1/c1;)V

    const v1, -0x69262b74

    invoke-static {v1, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/high16 v20, 0xd80000

    const/16 v21, 0x22

    move-object/from16 v19, v10

    move-object v10, v11

    const/4 v11, 0x0

    move-object/from16 v14, v16

    const/16 v16, 0x0

    move v5, v12

    move-wide/from16 v22, v17

    move-object/from16 v18, v0

    move/from16 v17, v13

    move-wide/from16 v12, v22

    invoke-static/range {v10 .. v21}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_a
    move v2, v5

    goto :goto_b

    :cond_11
    move-object/from16 v19, v10

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    goto :goto_a

    :goto_b
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Lbg0/h;

    const/16 v6, 0x9

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v5, p5

    move v4, v9

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final i(Lp1/c1;)Z
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

.method private static final j(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final k(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final l(Lp1/t2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final m(Lh01/t;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/t2;Lp1/c1;Lp1/t2;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 40

    move-object/from16 v0, p4

    and-int/lit8 v1, p9, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v5, p9, 0x1

    move-object/from16 v9, p8

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_15

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    :cond_2
    invoke-static {v5, v9, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lh01/t;->b()Ll0/k1;

    move-result-object v13

    invoke-static {v13, v11}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v13, v3

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v13, v14

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    sget-object v15, Lb2/e;->K:Lb2/l;

    const/16 v4, 0x36

    invoke-static {v13, v15, v9, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v2, v9, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_4

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v9, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2, v9, v2, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v9, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v2, v7

    const-wide/16 v17, 0x0

    cmpl-double v2, v2, v17

    if-lez v2, :cond_7

    goto :goto_3

    :cond_7
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v3, 0x1

    invoke-direct {v2, v7, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    mul-float/2addr v3, v14

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v3, v4, v9, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v9, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v4, v9, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v9, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Ll0/m;->a:Ll0/e;

    sget-object v3, Lb2/e;->J:Lb2/l;

    const/4 v4, 0x0

    invoke-static {v2, v3, v9, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v9, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v9, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v9, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    :cond_c
    invoke-static {v3, v9, v3, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v9, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lh01/t;->g()Lkd1/o;

    move-result-object v6

    const/4 v1, 0x4

    if-nez v6, :cond_e

    const v2, 0x22416714

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    move-object v4, v12

    move v3, v13

    goto :goto_6

    :cond_e
    const v2, 0x22416715

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    int-to-float v2, v1

    mul-float v3, v2, v2

    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    const/16 v14, 0x1b0

    const/16 v15, 0x78

    move-object/from16 v28, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, v12

    const/4 v12, 0x0

    move-object v8, v3

    move v3, v13

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    const/4 v5, 0x2

    int-to-float v5, v5

    const/4 v6, 0x0

    invoke-static {v5, v2, v4, v9, v6}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    :goto_6
    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-static/range {p3 .. p3}, Lh01/s;->x(Lp1/t2;)I

    move-result v23

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_f

    new-instance v7, Lf1/a0;

    const/16 v10, 0x11

    invoke-direct {v7, v10, v0}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v25, v7

    check-cast v25, Lkotlin/jvm/functions/Function1;

    const v30, 0x30030

    const v31, 0x257fa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v9

    move-wide/from16 v38, v5

    move-object/from16 v6, p2

    move-object v5, v8

    move-wide/from16 v8, v38

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v6, 0x1

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lh01/t;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v9, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-static/range {p5 .. p5}, Lh01/s;->l(Lp1/t2;)I

    move-result v23

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_10

    new-instance v2, Lam2/j;

    const/4 v3, 0x4

    move-object/from16 v10, p6

    invoke-direct {v2, v3, v0, v10}, Lam2/j;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v25, v2

    check-cast v25, Lkotlin/jvm/functions/Function1;

    const v30, 0x30030

    const v31, 0x257fa

    move-object/from16 v28, v9

    move-wide v8, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v6, 0x1

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    const/16 v2, 0x19

    int-to-float v2, v2

    int-to-float v1, v1

    mul-float/2addr v2, v1

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lh01/t;->a()Lkd1/o;

    move-result-object v6

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    const/16 v14, 0x1b0

    const/16 v15, 0x78

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, v1

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    const/4 v6, 0x1

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    invoke-static {v0}, Lh01/s;->i(Lp1/c1;)Z

    move-result v0

    if-nez v0, :cond_12

    invoke-static/range {p7 .. p7}, Lh01/s;->s(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_7

    :cond_11
    const/4 v4, 0x0

    goto :goto_9

    :cond_12
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lh01/t;->h()Z

    move-result v0

    if-eqz v0, :cond_11

    const v0, 0x6ed7ae07

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-static/range {p7 .. p7}, Lh01/s;->s(Lp1/c1;)Z

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    move-object/from16 v3, p0

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    move-object/from16 v6, p2

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_13

    if-ne v4, v5, :cond_14

    :cond_13
    new-instance v32, Lam2/d;

    const/16 v37, 0xb

    move-object/from16 v36, p7

    move-object/from16 v33, v1

    move-object/from16 v34, v3

    move-object/from16 v35, v6

    invoke-direct/range {v32 .. v37}, Lam2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v4, v32

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lc93/a;

    const/4 v1, 0x6

    const/4 v2, 0x5

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move/from16 p2, v0

    move/from16 p6, v1

    move/from16 p7, v2

    move-object/from16 p0, v3

    move-object/from16 p4, v4

    move-object/from16 p1, v5

    move/from16 p3, v6

    move-object/from16 p5, v9

    invoke-static/range {p0 .. p7}, Lh01/x;->e(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v6, 0x1

    goto :goto_a

    :goto_9
    const v0, 0x6ede167c

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_a
    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_15
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll3/r0;->e()Z

    move-result p1

    invoke-static {p0, p1}, Lh01/s;->r(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/c1;Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 1

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll3/r0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    invoke-static {p0, p1}, Lh01/s;->r(Lp1/c1;Z)V

    goto :goto_0

    :cond_0
    iget-object p0, p2, Ll3/r0;->b:Ll3/w;

    iget p0, p0, Ll3/w;->f:I

    invoke-static {p1, p0}, Lh01/s;->k(Lp1/c1;I)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;Lh01/t;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p3}, Lh01/s;->s(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p3, v0}, Lh01/s;->t(Lp1/c1;Z)V

    new-instance p3, Lh01/r;

    invoke-virtual {p1}, Lh01/t;->getAppNotificationType()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {p3, p1, p2}, Lh01/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lh01/t;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lh01/s;->h(Lh01/t;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp1/c1;Z)V
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

.method private static final u(Lp1/c1;)Ly3/f;
    .locals 1

    invoke-static {p0}, Lh01/s;->s(Lp1/c1;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/high16 p0, 0x7fc00000    # Float.NaN

    goto :goto_0

    :cond_0
    sget-object p0, Lh01/c;->a:Lh01/c;

    invoke-virtual {p0}, Lh01/c;->b()F

    move-result p0

    :goto_0
    new-instance v0, Ly3/f;

    invoke-direct {v0, p0}, Ly3/f;-><init>(F)V

    return-object v0
.end method

.method private static final v(Lp1/t2;)F
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

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final w(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lh01/s;->s(Lp1/c1;)Z

    move-result p0

    if-eqz p0, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0
.end method

.method private static final x(Lp1/t2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method
