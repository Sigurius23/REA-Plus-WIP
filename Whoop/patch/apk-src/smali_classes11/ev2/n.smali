.class public abstract Lev2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001aK\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u001e\u0010\u0008\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001aK\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u001e\u0010\u0008\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000c*\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ldv2/e$b;",
        "viewState",
        "Lkotlin/Function1;",
        "Ldv2/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function3;",
        "",
        "onAnalyticsEvent",
        "q",
        "(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V",
        "s",
        "Landroidx/compose/ui/Modifier;",
        "",
        "percentage",
        "L",
        "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;",
        "",
        "showFilterListBottomSheet",
        "weightlifting_release"
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
.method private static final A(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Ln0/u;Lg2/i;Lkotlin/jvm/functions/Function3;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    move-object/from16 v8, p1

    and-int/lit8 v0, p9, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    move v0, v9

    goto :goto_0

    :cond_0
    move v0, v10

    :goto_0
    and-int/lit8 v2, p9, 0x1

    move-object/from16 v11, p8

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_b

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v0}, Lr;->f(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v11, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v11, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v11, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v0, v9

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v4, v0, v3

    const/4 v6, 0x0

    const/16 v7, 0xb

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object/from16 v21, v2

    move/from16 v20, v5

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcu2/h;->E:I

    const/4 v2, 0x0

    invoke-direct {v13, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Luv0/c;->E:I

    invoke-static {v11, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v26

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/a;->e()I

    move-result v14

    invoke-interface/range {p0 .. p0}, Ldv2/e$b;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const v0, 0x5bbf8f46

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lev2/m;

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v3, p3

    move-object/from16 v2, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v7}, Lev2/m;-><init>(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lg2/i;Lbc3/c0;Lg1/y3;Lp1/c1;I)V

    move-object v1, v0

    move-object v0, v2

    const v2, 0x3038be8b

    invoke-static {v2, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    :goto_2
    move-object/from16 v32, v2

    goto :goto_3

    :cond_4
    move-object/from16 v0, p4

    const v1, 0x5bcc285d

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    goto :goto_2

    :goto_3
    new-instance v22, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    const v39, 0xfde2

    const/16 v40, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    move-object/from16 v23, v13

    invoke-direct/range {v22 .. v40}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_5

    if-ne v2, v3, :cond_6

    :cond_5
    new-instance v2, Lev2/c;

    const/4 v1, 0x0

    invoke-direct {v2, v8, v1}, Lev2/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v14, v2

    check-cast v14, Lc93/a;

    sget v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v18, v1, 0x6

    const/16 v19, 0x34

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v11

    move-object v11, v12

    move-object/from16 v12, v22

    invoke-static/range {v11 .. v19}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, p3

    move-object/from16 v11, v17

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    move-object/from16 v4, p5

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    move-object/from16 v6, p6

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_8

    if-ne v5, v3, :cond_7

    goto :goto_4

    :cond_7
    move-object v12, v0

    move-object v1, v8

    move-object/from16 v8, p0

    goto :goto_5

    :cond_8
    :goto_4
    new-instance v0, Lev2/d;

    const/4 v7, 0x0

    move-object/from16 v2, p4

    move-object/from16 v5, p7

    move-object v3, v4

    move-object v4, v8

    move-object/from16 v8, p0

    invoke-direct/range {v0 .. v7}, Lev2/d;-><init>(Lg2/i;Lkotlin/jvm/functions/Function3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Lg1/y3;I)V

    move-object v12, v2

    move-object v1, v4

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :goto_5
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object/from16 v0, p2

    invoke-static {v8, v0, v5, v11, v10}, Lev2/u;->K0(Ldv2/e$b;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v8}, Ldv2/e$b;->b()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_9

    const v2, 0x5bdbf561

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Lev2/u;->n1()F

    move-result v3

    const/4 v6, 0x0

    const/16 v7, 0x8

    move/from16 v5, v20

    move/from16 v4, v20

    move-object/from16 v2, v21

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Lev2/e;

    const/4 v4, 0x0

    invoke-direct {v3, v8, v12, v1, v4}, Lev2/e;-><init>(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;I)V

    const v4, -0x21109d37

    invoke-static {v4, v11, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    const/high16 v19, 0x180000

    const/16 v20, 0x3e

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v11

    move-object v11, v2

    invoke-static/range {v11 .. v20}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v18

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v2, 0x5bec43b9

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    :goto_6
    const/4 v2, 0x6

    sget-object v3, Ll0/z;->a:Ll0/z;

    move-object/from16 p4, v0

    move-object/from16 p6, v1

    move/from16 p8, v2

    move-object/from16 p3, v3

    move-object/from16 p5, v8

    move-object/from16 p7, v11

    invoke-static/range {p3 .. p8}, Lev2/u;->e0(Ll0/y;Ln0/u;Ldv2/e$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {p0 .. p0}, Ldv2/e$b;->f()Z

    move-result v0

    if-nez v0, :cond_a

    const v0, 0x5bee1174

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-interface/range {p0 .. p0}, Ldv2/e$b;->a()Leu2/b;

    move-result-object v0

    invoke-interface/range {p0 .. p0}, Ldv2/e$b;->e()Leu2/b;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object/from16 p5, p1

    move-object/from16 p3, v0

    move-object/from16 p4, v1

    move/from16 p7, v2

    move/from16 p8, v3

    move-object/from16 p2, v4

    move-object/from16 p6, v11

    invoke-static/range {p2 .. p8}, Leu2/j;->e(Landroidx/compose/ui/Modifier;Leu2/b;Leu2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    const v0, 0x5bf004b9

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lg2/i;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    and-int/lit8 v0, p7, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p7, v2

    check-cast p6, Lp1/q;

    invoke-virtual {p6, p7, v0}, Lp1/q;->U(IZ)Z

    move-result p7

    if-eqz p7, :cond_5

    invoke-interface {p0}, Ldv2/e$b;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-virtual {p6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p7

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez p7, :cond_1

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Lev2/i;

    const/4 p7, 0x0

    invoke-direct {v0, p7, p1}, Lev2/i;-><init>(ILkotlin/jvm/functions/Function3;)V

    invoke-virtual {p6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object p1, v0

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p6, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p7

    invoke-virtual {p6, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p7, v0

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p7, :cond_3

    if-ne v0, v1, :cond_4

    :cond_3
    new-instance v0, Lev2/j;

    const/4 p7, 0x0

    invoke-direct {v0, p7, p3, p4, p5}, Lev2/j;-><init>(ILbc3/c0;Lg1/y3;Lp1/c1;)V

    invoke-virtual {p6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object p3, v0

    check-cast p3, Lc93/a;

    sget p5, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object p4, p6

    invoke-static/range {p0 .. p5}, Lev2/u;->a1(Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lg2/i;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_5
    move-object p4, p6

    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function3;Ljava/lang/String;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Exercise List"

    const-string v1, ""

    invoke-interface {p0, p1, v0, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lbc3/c0;Lg1/y3;Lp1/c1;)Ll83/a0;
    .locals 2

    new-instance v0, Lev2/n$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lev2/n$e;-><init>(Lg1/y3;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ldv2/b$b;->a:Ldv2/b$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lg2/i;Lkotlin/jvm/functions/Function3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Lg1/y3;Ldv2/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p6, Ldv2/b$l;

    if-eqz v0, :cond_0

    const/4 p3, 0x1

    invoke-static {p4, p3}, Lev2/n;->u(Lp1/c1;Z)V

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    const-string p0, "Exercise Filtering"

    const-string p3, ""

    const-string p4, "Open"

    invoke-interface {p1, p4, p0, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lev2/n$f;

    const/4 p1, 0x0

    invoke-direct {p0, p5, p1}, Lev2/n$f;-><init>(Lg1/y3;Lq83/d;)V

    const/4 p3, 0x3

    invoke-static {p2, p1, p1, p0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    invoke-interface {p3, p6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 36

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "$this$FlowRow"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p5, 0x11

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    and-int/lit8 v3, p5, 0x1

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface/range {p0 .. p0}, Ldv2/e$b;->b()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v11, v7, v8

    const/4 v13, 0x0

    const/16 v14, 0x9

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v10, 0x0

    move v12, v11

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_1

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v8, v7, :cond_2

    :cond_1
    new-instance v8, Lev2/h;

    const/4 v7, 0x0

    invoke-direct {v8, v0, v3, v1, v7}, Lev2/h;-><init>(Lkotlin/jvm/functions/Function3;Ll83/k;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v19, v8

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v6, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v6, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-nez v10, :cond_4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    invoke-static {v9, v6, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v6, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v3, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/weightlifting/data/domain/FilterItem;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/FilterItem;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v7, Ly71/g;

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8}, Lyb0/f;->a(Lx81/d;)I

    move-result v8

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-direct {v7, v8, v10, v9, v10}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v32, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v8, Ly71/g;->c:I

    shl-int/lit8 v33, v8, 0x9

    const/16 v34, 0x0

    const v35, 0x7fdffe

    move-object/from16 v21, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v31, v6

    move-object v6, v3

    invoke-static/range {v6 .. v35}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v3, v31

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    move-object v6, v3

    goto/16 :goto_1

    :cond_6
    move-object v3, v6

    invoke-virtual {v3}, Lp1/q;->X()V

    :cond_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final H(Lkotlin/jvm/functions/Function3;Ll83/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/domain/FilterItem;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/FilterItem;->getKey()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Remove Filter Tag"

    const-string v2, "Exercise Filtering"

    invoke-interface {p0, v1, v2, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ldv2/b$c;

    invoke-direct {p0, p1}, Ldv2/b$c;-><init>(Ll83/k;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lev2/n;->s(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic J(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lev2/n;->t(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic K(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lev2/n;->u(Lp1/c1;Z)V

    return-void
.end method

.method public static final L(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lev2/g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lev2/g;-><init>(FI)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final M(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string p3, "$this$composed"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p3, 0x42e91411

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    sget-object p3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {p2, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/content/res/Configuration;

    iget p3, p3, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float p3, p3

    mul-float/2addr p3, p0

    const/4 p0, 0x1

    const/4 v0, 0x0

    invoke-static {p1, v0, p3, p0}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lev2/n;->E(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ldv2/e$b;Lbm/t;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lg1/y3;Lp1/c1;Ln0/u;Ljava/util/List;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lev2/n;->w(Ldv2/e$b;Lbm/t;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lg1/y3;Lp1/c1;Ln0/u;Ljava/util/List;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lo11/m$c$b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lev2/n;->v(Lo11/m$c$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lg2/i;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lev2/n;->B(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lg2/i;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lbc3/c0;Lg1/y3;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lev2/n;->D(Lbc3/c0;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm91/a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lev2/n;->z(Lm91/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lg2/i;Lkotlin/jvm/functions/Function3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Lg1/y3;Ldv2/b;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lev2/n;->F(Lg2/i;Lkotlin/jvm/functions/Function3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Lg1/y3;Ldv2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lev2/n;->G(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function3;Ll83/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lev2/n;->H(Lkotlin/jvm/functions/Function3;Ll83/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Ln0/u;Lg2/i;Lkotlin/jvm/functions/Function3;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lev2/n;->A(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Ln0/u;Lg2/i;Lkotlin/jvm/functions/Function3;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lev2/n;->I(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 1

    sget-object v0, Ll0/z;->a:Ll0/z;

    invoke-static {p0, v0, p1, p2}, Lev2/n;->y(Ljava/util/List;Ll0/y;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/util/Set;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lev2/n;->x(Lkotlin/jvm/functions/Function1;Ljava/util/Set;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function3;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lev2/n;->C(Lkotlin/jvm/functions/Function3;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lev2/n;->M(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lev2/n;->r(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv2/e$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAnalyticsEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x6f69f5b4

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p4

    goto :goto_2

    :cond_2
    move v0, p4

    :goto_2
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_4

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_6

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v1, 0x100

    goto :goto_4

    :cond_5
    const/16 v1, 0x80

    :goto_4
    or-int/2addr v0, v1

    :cond_6
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    const/4 v3, 0x0

    if-eq v1, v2, :cond_7

    const/4 v1, 0x1

    goto :goto_5

    :cond_7
    move v1, v3

    :goto_5
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, p3, v2}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    const-string v2, "st-select-exercise-bottom-sheet-logic"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    const v1, -0x5ba332af

    invoke-virtual {p3, v1}, Lp1/q;->e0(I)V

    and-int/lit16 v0, v0, 0x3fe

    invoke-static {p0, p1, p2, p3, v0}, Lev2/n;->s(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    const v1, -0x5ba1961e

    invoke-virtual {p3, v1}, Lp1/q;->e0(I)V

    and-int/lit16 v0, v0, 0x3fe

    invoke-static {p0, p1, p2, p3, v0}, Lev2/u;->u0(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v0, Lev2/k;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lev2/k;-><init>(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final r(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lev2/n;->q(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv2/e$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    move/from16 v11, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAnalyticsEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x622ff8f3

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    const/4 v3, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, v11, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    or-int/2addr v0, v11

    goto :goto_2

    :cond_2
    move v0, v11

    :goto_2
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :cond_4
    and-int/lit16 v4, v11, 0x180

    if-nez v4, :cond_6

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_6
    and-int/lit16 v4, v0, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x1

    const/4 v9, 0x0

    if-eq v4, v6, :cond_7

    move v4, v7

    goto :goto_5

    :cond_7
    move v4, v9

    :goto_5
    and-int/2addr v0, v7

    invoke-virtual {v8, v0, v4}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v0, v4, :cond_8

    invoke-static {v8}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v0

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v6, v0

    check-cast v6, Lbc3/c0;

    sget-object v0, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v8, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lg2/i;

    sget-object v12, Lg1/z3;->w:Lg1/z3;

    const/16 v17, 0xc06

    const/16 v18, 0x6

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object/from16 v16, v8

    invoke-static/range {v12 .. v18}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v7

    move-object/from16 v12, v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_9

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v8, v0

    check-cast v8, Lp1/c1;

    invoke-static {v9, v12, v9}, Lj93/l0;->U(ILandroidx/compose/runtime/Composer;I)Lbm/t;

    move-result-object v2

    const/4 v13, 0x3

    invoke-static {v9, v9, v12, v13}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v14

    invoke-static {v9, v9, v12, v13}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v0

    invoke-interface {v1}, Ldv2/e$b;->c()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_a

    new-instance v10, Lev2/b;

    const/4 v15, 0x1

    invoke-direct {v10, v15}, Lev2/b;-><init>(I)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/16 v15, 0x30

    invoke-static {v9, v10, v12, v15}, Lm91/c;->c(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v7}, Lg1/y3;->b()Lg1/z3;

    move-result-object v10

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    move/from16 p3, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v15, :cond_b

    if-ne v13, v4, :cond_c

    :cond_b
    new-instance v13, Lev2/n$a;

    const/4 v15, 0x0

    invoke-direct {v13, v7, v8, v15}, Lev2/n$a;-><init>(Lg1/y3;Lp1/c1;Lq83/d;)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v13, Lc93/m;

    invoke-static {v12, v13, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v13, Lv41/g;

    const/16 v28, 0x7f

    const/16 v29, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v20, v13

    invoke-direct/range {v20 .. v29}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v14

    new-instance v14, Lv41/f$a;

    invoke-direct {v14, v7}, Lv41/f$a;-><init>(Lg1/y3;)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_d

    sget-object v10, Lev2/n$b;->w:Lev2/n$b;

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v10, 0x3f733333    # 0.95f

    invoke-static {v4, v10}, Lev2/n;->L(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v24, v3, v4

    const/16 v25, 0x7

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v25

    move-object v3, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v0

    new-instance v0, Lev2/l;

    const/4 v10, 0x0

    move-object/from16 v4, p1

    invoke-direct/range {v0 .. v10}, Lev2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x38afba3b

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    new-instance v0, Lbm2/p;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    move-object v8, v7

    move-object/from16 v4, v19

    move-object v7, v6

    move-object v6, v3

    move-object v3, v15

    invoke-direct/range {v0 .. v8}, Lbm2/p;-><init>(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Ln0/u;Lg2/i;Lkotlin/jvm/functions/Function3;Lbc3/c0;Lg1/y3;Lp1/c1;)V

    const v1, -0x1b62a401

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v26

    sget v0, Lv41/g;->h:I

    shl-int/lit8 v0, v0, 0x3

    const/high16 v1, 0xc00000

    or-int/2addr v0, v1

    sget v1, Lv41/f$a;->c:I

    shl-int/lit8 v1, v1, 0x6

    or-int v28, v0, v1

    const/16 v29, 0x6000

    const/16 v30, 0x1f71

    move-object/from16 v27, v12

    const/4 v12, 0x0

    move-object/from16 v15, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v19, v9

    invoke-static/range {v12 .. v30}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    const/4 v9, 0x0

    const/16 v10, 0x7e

    const-string v1, "OVERLAY_STRENGTH_BUILDER_EXERCISE_LIBRARY"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v27

    invoke-static/range {v1 .. v10}, Lm12/d;->z(Ljava/lang/String;Lm12/e;ZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_e
    move-object/from16 v27, v8

    invoke-virtual/range {v27 .. v27}, Lp1/q;->X()V

    :goto_6
    invoke-virtual/range {v27 .. v27}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lev2/k;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v11

    invoke-direct/range {v0 .. v5}, Lev2/k;-><init>(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final t(Lp1/c1;)Z
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

.method private static final u(Lp1/c1;Z)V
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

.method private static final v(Lo11/m$c$b;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo11/m$c$b;->I()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Ldv2/e$b;Lbm/t;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lg1/y3;Lp1/c1;Ln0/u;Ljava/util/List;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    move-object/from16 v0, p3

    move-object/from16 v1, p5

    move-object/from16 v2, p8

    const-string v3, "$this$BottomSheet"

    move-object/from16 v4, p9

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p11, 0x11

    const/16 v4, 0x10

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    and-int/lit8 v4, p11, 0x1

    move-object/from16 v13, p10

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v3, :cond_c

    invoke-static/range {p6 .. p6}, Lev2/n;->t(Lp1/c1;)Z

    move-result v3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_3

    const v1, -0x56664224

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-interface/range {p0 .. p0}, Ldv2/e$b;->g()Lcom/whoop/weightlifting/data/domain/FilterOptions;

    move-result-object v1

    invoke-interface/range {p0 .. p0}, Ldv2/e$b;->b()Ljava/util/Set;

    move-result-object v8

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    if-ne v3, v7, :cond_2

    :cond_1
    new-instance v3, Lev2/f;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v2}, Lev2/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v11, v3

    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v12, p4

    move-object v7, v1

    invoke-static/range {v7 .. v14}, Lev2/u;->l0(Lcom/whoop/weightlifting/data/domain/FilterOptions;Ljava/util/Set;Lbm/t;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    return-object v4

    :cond_3
    const v3, -0x565ea00d

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-interface/range {p0 .. p0}, Ldv2/e$b;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    const v3, -0x565e64b7

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_4

    if-ne v8, v7, :cond_5

    :cond_4
    new-instance v8, Lev2/n$c;

    const/4 v3, 0x0

    invoke-direct {v8, v1, v3}, Lev2/n$c;-><init>(Lg1/y3;Lq83/d;)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v8, Lc93/m;

    invoke-static {v13, v8, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_6
    const v1, -0x565c8bb9

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    :goto_1
    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lb2/e;->N:Lb2/k;

    const/4 v9, 0x2

    int-to-float v9, v9

    const/16 v10, 0x8

    int-to-float v10, v10

    const/16 v11, 0x36

    invoke-static {v9, v10, v8, v13, v11}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_2
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v13, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v13, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    invoke-static {v9, v13, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v13, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v1, Lcu2/h;->F:I

    invoke-static {v13, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v3, v13, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->r()Lb91/a;

    move-result-object v27

    invoke-virtual {v3, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v9

    new-instance v3, Lw3/k;

    const/4 v11, 0x3

    invoke-direct {v3, v11}, Lw3/k;-><init>(I)V

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v31, v11, 0x12

    const v32, 0x2fdf8

    const-wide/16 v11, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x30

    move-object/from16 v19, v7

    move-object v7, v1

    move-object/from16 v1, v19

    move-object/from16 v19, v3

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v29

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_a

    if-ne v7, v1, :cond_b

    :cond_a
    new-instance v7, La81/h;

    const/4 v1, 0x2

    invoke-direct {v7, v2, v1, v0}, La81/h;-><init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v15, v7

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v17, 0x0

    const/16 v18, 0x1fd

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v8, p7

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v16

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    return-object v4

    :cond_c
    invoke-virtual {v13}, Lp1/q;->X()V

    return-object v4
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Ljava/util/Set;)Ll83/a0;
    .locals 1

    const-string v0, "newFilters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldv2/b$g;

    invoke-direct {v0, p1}, Ldv2/b$g;-><init>(Ljava/util/Set;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Ljava/util/List;Ll0/y;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$LazyColumn"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lev2/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lev2/b;-><init>(I)V

    sget-object v1, Lev2/n$g;->w:Lev2/n$g;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Lev2/n$h;

    invoke-direct {v3, v0, p0}, Lev2/n$h;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lev2/n$i;

    invoke-direct {v0, v1, p0}, Lev2/n$i;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v1, Lev2/n$j;

    invoke-direct {v1, p0, p1, p2}, Lev2/n$j;-><init>(Ljava/util/List;Ll0/y;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, 0x2fd4df92

    invoke-direct {p0, v1, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p3, Ln0/f;

    invoke-virtual {p3, v2, v3, v0, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lm91/a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/a;->c()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
