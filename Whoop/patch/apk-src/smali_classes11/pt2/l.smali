.class public abstract Lpt2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aC\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aC\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0015\u00b2\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lot2/m;",
        "viewState",
        "Lkotlin/Function1;",
        "Lnt2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lmt2/g;",
        "onNavigationEvent",
        "x",
        "(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lot2/c;",
        "B",
        "(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "u",
        "(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lb3/x2;",
        "keyboard",
        "Lpt2/a;",
        "bottomSheetType",
        "Lv41/g;",
        "bottomSheetTopBar",
        "weekly-plan_release"
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
.method private static final A(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lpt2/l;->x(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lot2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x255abd64

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move v2, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit16 v8, v2, 0x93

    const/16 v10, 0x92

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v8, v10, :cond_8

    move v8, v15

    goto :goto_6

    :cond_8
    move v8, v14

    :goto_6
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v9, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_18

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_9

    new-instance v3, Lpt2/k;

    const/4 v5, 0x2

    invoke-direct {v3, v5}, Lpt2/k;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v19, v3

    goto :goto_7

    :cond_a
    move-object/from16 v19, v5

    :goto_7
    if-eqz v6, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_b

    new-instance v3, Lpt2/k;

    const/4 v5, 0x3

    invoke-direct {v3, v5}, Lpt2/k;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v20, v3

    goto :goto_8

    :cond_c
    move-object/from16 v20, v7

    :goto_8
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_d

    invoke-static {v9}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lbc3/c0;

    invoke-virtual {v0}, Lot2/c;->b()Lkm0/e;

    move-result-object v5

    invoke-virtual {v5}, Lkm0/e;->e()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lot2/c;->b()Lkm0/e;

    move-result-object v6

    invoke-virtual {v6}, Lkm0/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v16

    sget-object v5, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v9, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v9}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v5

    move-object v6, v5

    sget-object v5, Lg1/z3;->w:Lg1/z3;

    const/16 v10, 0xc06

    const/4 v11, 0x6

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v18, v8

    const/4 v8, 0x1

    move-object/from16 v12, v17

    move-object/from16 v1, v18

    invoke-static/range {v5 .. v11}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_e

    sget-object v6, Lpt2/a$b;->a:Lpt2/a$b;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v6, Lp1/c1;

    new-instance v7, Lv41/f$a;

    invoke-direct {v7, v5}, Lv41/f$a;-><init>(Lg1/y3;)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    const/4 v10, 0x0

    if-ne v8, v1, :cond_f

    new-instance v21, Lv41/g;

    invoke-virtual {v0}, Lot2/c;->b()Lkm0/e;

    move-result-object v8

    invoke-virtual {v8}, Lkm0/e;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v22

    new-instance v8, Ly71/g;

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-static {v11}, Lyb0/f;->a(Lx81/d;)I

    move-result v11

    const/4 v13, 0x2

    invoke-direct {v8, v11, v10, v13, v10}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v29, 0x7c

    const/16 v30, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v23, v8

    invoke-direct/range {v21 .. v30}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v21 .. v21}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lp1/c1;

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_10

    if-ne v13, v1, :cond_11

    :cond_10
    new-instance v13, Lpt2/l$a;

    invoke-direct {v13, v5, v12, v10}, Lpt2/l$a;-><init>(Lg1/y3;Lp1/t2;Lq83/d;)V

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v13, Lc93/m;

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    invoke-static {v9, v13, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v13, v16

    move-object/from16 v16, v6

    invoke-static {v8}, Lpt2/l;->U(Lp1/c1;)Lv41/g;

    move-result-object v6

    sget-object v21, Lny0/q$b;->f:Lny0/q$b;

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_12

    if-ne v11, v1, :cond_13

    :cond_12
    new-instance v11, Lat2/s;

    const/4 v10, 0x5

    invoke-direct {v11, v3, v7, v10}, Lat2/s;-><init>(Lbc3/c0;Lv41/f$a;I)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v23, v11

    check-cast v23, Lc93/a;

    new-instance v10, Lat2/a0;

    const/16 v17, 0x2

    move-object v11, v0

    move-object v12, v7

    move v0, v14

    move-object/from16 v15, v19

    const/16 v7, 0x20

    move-object v14, v3

    const/16 v3, 0x100

    invoke-direct/range {v10 .. v17}, Lat2/a0;-><init>(Ljava/lang/Object;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    move-object/from16 v31, v15

    move-object v15, v12

    move-object/from16 v12, v31

    const v11, -0x5720e5b6

    invoke-static {v11, v9, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    new-instance v10, Lbm2/p0;

    move-object/from16 v11, p0

    move-object/from16 v17, v8

    move-object/from16 v13, v20

    invoke-direct/range {v10 .. v17}, Lbm2/p0;-><init>(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;)V

    move-object/from16 v24, v12

    move-object/from16 v25, v13

    const v8, -0x340094f2    # -3.3478172E7f

    invoke-static {v8, v9, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v19

    sget v8, Lv41/g;->h:I

    shl-int/lit8 v8, v8, 0x3

    const v10, 0xc00006

    or-int/2addr v8, v10

    sget v10, Lv41/f$a;->c:I

    shl-int/lit8 v10, v10, 0x6

    or-int/2addr v8, v10

    sget v10, Lny0/q$b;->g:I

    shl-int/lit8 v10, v10, 0x1b

    or-int/2addr v8, v10

    move-object/from16 v17, v5

    move-object/from16 v5, v22

    const/16 v22, 0x6000

    move-object/from16 v11, v23

    const/16 v23, 0x3d68

    move-object v10, v14

    move-object/from16 v14, v21

    move/from16 v21, v8

    const/4 v8, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object/from16 v20, v9

    move-object v9, v11

    const/4 v11, 0x0

    const/4 v13, 0x0

    move/from16 v16, v7

    move-object v7, v15

    const/4 v15, 0x0

    move/from16 v26, v16

    const/16 v16, 0x0

    move-object/from16 v27, v17

    const/16 v17, 0x0

    move-object/from16 v28, v12

    move-object/from16 v12, v18

    const/16 v18, 0x0

    move/from16 v4, v26

    move-object/from16 v3, v27

    move-object/from16 v0, v28

    invoke-static/range {v5 .. v23}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object v15, v7

    move-object/from16 v9, v20

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v9, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    and-int/lit8 v6, v2, 0x70

    if-ne v6, v4, :cond_14

    const/4 v14, 0x1

    goto :goto_9

    :cond_14
    const/4 v14, 0x0

    :goto_9
    or-int v4, v5, v14

    and-int/lit16 v2, v2, 0x380

    const/16 v5, 0x100

    if-ne v2, v5, :cond_15

    const/4 v14, 0x1

    goto :goto_a

    :cond_15
    const/4 v14, 0x0

    :goto_a
    or-int v2, v4, v14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_17

    if-ne v4, v1, :cond_16

    goto :goto_b

    :cond_16
    move-object/from16 v12, v24

    move-object/from16 v13, v25

    goto :goto_c

    :cond_17
    :goto_b
    new-instance v16, Lpt2/g;

    const/16 v22, 0x1

    move-object/from16 v18, v0

    move-object/from16 v17, v3

    move-object/from16 v21, v15

    move-object/from16 v19, v24

    move-object/from16 v20, v25

    invoke-direct/range {v16 .. v22}, Lpt2/g;-><init>(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv41/f$a;I)V

    move-object/from16 v4, v16

    move-object/from16 v12, v19

    move-object/from16 v13, v20

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v4, Lc93/a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v4, v0, v9, v0, v1}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v2, v12

    move-object v3, v13

    goto :goto_d

    :cond_18
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v5

    move-object v3, v7

    :goto_d
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v0, Lot1/f;

    const/16 v6, 0x17

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final C(Lnt2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lmt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lbc3/c0;Lv41/f$a;)Ll83/a0;
    .locals 2

    new-instance v0, Lpt2/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lpt2/l$b;-><init>(Lv41/f$a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lot2/c;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    const-string v0, "$this$BottomSheet"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p8, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p8, 0x1

    move-object/from16 v8, p7

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lot2/c;->b()Lkm0/e;

    move-result-object v2

    invoke-static/range {p5 .. p5}, Lpt2/l;->S(Lp1/c1;)Lpt2/a;

    move-result-object v4

    sget p0, Lkm0/e;->n:I

    sget v0, Lv41/f$a;->c:I

    shl-int/lit8 v0, v0, 0x3

    or-int v9, p0, v0

    const/4 v10, 0x0

    move-object v3, p1

    move v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-static/range {v2 .. v10}, Lpt2/b0;->g(Lkm0/e;Lv41/f$a;Lpt2/a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v8, p2

    and-int/lit8 v0, p8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v10

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    and-int/lit8 v4, p8, 0x1

    move-object/from16 v5, p7

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6}, Lgb1/b0;->S(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v11, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v11, v5, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_1

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v5, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v5, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-nez v12, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    :cond_2
    invoke-static {v11, v5, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v5, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v6, "Close_Button"

    invoke-static {v4, v6}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    new-instance v12, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v1}, Lot2/c;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v15, Ly71/g;

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-static {v6}, Lyb0/f;->a(Lx81/d;)I

    move-result v6

    sget v7, Luv0/c;->E:I

    invoke-static {v5, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct {v15, v6, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/16 v28, 0x7ffa

    const/16 v29, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v12 .. v29}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_4

    if-ne v7, v13, :cond_5

    :cond_4
    new-instance v7, Ldc0/c;

    const/16 v6, 0xf

    invoke-direct {v7, v2, v6, v8}, Ldc0/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v14, v7

    check-cast v14, Lc93/a;

    sget v6, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v18, v6, 0x3

    const/16 v19, 0x34

    move-object v6, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v5

    invoke-static/range {v11 .. v19}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v17

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v12, 0x4004000000000000L    # 2.5

    double-to-float v5, v12

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v5, v7

    const/4 v7, 0x0

    invoke-static {v4, v5, v7, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    float-to-double v4, v0

    const-wide/16 v12, 0x0

    cmpl-double v4, v4, v12

    if-lez v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    invoke-static {v3, v10, v0}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    move-object/from16 v3, p3

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    move-object/from16 v4, p4

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_7

    if-ne v5, v6, :cond_8

    :cond_7
    new-instance v0, Lam2/b;

    const/16 v7, 0x11

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :cond_8
    move-object/from16 v19, v5

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/16 v21, 0x0

    const/16 v22, 0x1fe

    move-object/from16 v17, v11

    move-object v11, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v11 .. v22}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v20

    invoke-static {v1, v2, v8, v11, v9}, Lpt2/l;->u(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_9
    move-object v11, v5

    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 4

    new-instance v0, Lnt2/a$f;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lnt2/a$f;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lmt2/g$b;

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->BEHAVIORS:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-direct {p0, v0}, Lmt2/g$b;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lot2/c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v8, p6

    const-string v0, "$this$LazyColumn"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpt2/j;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpt2/j;-><init>(Lot2/c;I)V

    new-instance v2, Lx1/b;

    const/4 v9, 0x1

    const v3, -0x122aa11d

    invoke-direct {v2, v0, v9, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v10, 0x0

    const/4 v11, 0x3

    invoke-static {v8, v10, v2, v11}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v1}, Lot2/c;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const v2, 0x2fd4df92

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lot2/c;->l()Ljava/util/List;

    move-result-object v13

    new-instance v0, Lpl0/b;

    const/16 v3, 0x1c

    invoke-direct {v0, v3}, Lpl0/b;-><init>(I)V

    sget-object v3, Lpt2/l$g;->w:Lpt2/l$g;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Lpt2/l$h;

    invoke-direct {v5, v0, v13}, Lpt2/l$h;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lpt2/l$i;

    invoke-direct {v0, v3, v13}, Lpt2/l$i;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v12, Lpt2/l$j;

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    move-object/from16 v16, p3

    move-object/from16 v17, p4

    move-object/from16 v18, p5

    invoke-direct/range {v12 .. v18}, Lpt2/l$j;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;)V

    new-instance v3, Lx1/b;

    invoke-direct {v3, v12, v9, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v6, v8

    check-cast v6, Ln0/f;

    invoke-virtual {v6, v4, v5, v0, v3}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    :cond_0
    new-instance v0, Lpt2/j;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lpt2/j;-><init>(Lot2/c;I)V

    new-instance v3, Lx1/b;

    const v4, 0x386d674c

    invoke-direct {v3, v0, v9, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v8, v10, v3, v11}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v1}, Lot2/c;->g()Ljava/util/List;

    move-result-object v15

    new-instance v0, Lpl0/b;

    const/16 v3, 0x1d

    invoke-direct {v0, v3}, Lpl0/b;-><init>(I)V

    sget-object v3, Lpt2/l$k;->w:Lpt2/l$k;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Lpt2/l$l;

    invoke-direct {v5, v0, v15}, Lpt2/l$l;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lpt2/l$m;

    invoke-direct {v0, v3, v15}, Lpt2/l$m;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v14, Lpt2/l$n;

    move-object/from16 v16, p1

    move-object/from16 v17, p2

    move-object/from16 v18, p3

    move-object/from16 v19, p4

    move-object/from16 v20, p5

    invoke-direct/range {v14 .. v20}, Lpt2/l$n;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;)V

    new-instance v3, Lx1/b;

    invoke-direct {v3, v14, v9, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v2, v8

    check-cast v2, Ln0/f;

    invoke-virtual {v2, v4, v5, v0, v3}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    new-instance v0, Lat2/y;

    const/4 v7, 0x6

    move-object/from16 v3, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v7}, Lat2/y;-><init>(Ljava/lang/Object;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp1/c1;Lp1/c1;I)V

    new-instance v1, Lx1/b;

    const v2, 0x62eff0ab

    invoke-direct {v1, v0, v9, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v8, v10, v1, v11}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final J(Lot2/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v4, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lot2/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v4, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v4, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v7, v4, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->P()Lb91/a;

    move-result-object v24

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v28, v11, 0x12

    const v29, 0x2fffa

    move-object v11, v5

    const/4 v5, 0x0

    move v12, v6

    move-object v13, v7

    move-wide v6, v9

    move v10, v8

    const-wide/16 v8, 0x0

    move v14, v10

    const/4 v10, 0x0

    move-object v15, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    move/from16 v18, v14

    const-wide/16 v13, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v21, v17

    move/from16 v22, v18

    const-wide/16 v17, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v25, v20

    const/16 v20, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move-object/from16 v2, v30

    move/from16 v30, v1

    move-object v1, v2

    move-object/from16 v2, v26

    move-object/from16 v26, v4

    move-object v4, v0

    move/from16 v0, v31

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    int-to-float v3, v3

    mul-float v3, v3, v30

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v4, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lot2/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v4, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move/from16 v5, v32

    invoke-virtual {v2, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v2, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    move-object v4, v3

    move/from16 v3, v32

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual/range {p0 .. p0}, Lot2/c;->l()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual/range {p0 .. p0}, Lot2/c;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_1

    const v5, -0xec76c07

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float v5, v5, v30

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lot2/c;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v4, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v2, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->L()Lb91/a;

    move-result-object v24

    const/16 v27, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v26, v4

    move-object v4, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v2

    move/from16 v2, v30

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v4, v3}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    const v0, -0xec0c3c1

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final K(Lm91/u;)Ljava/lang/Object;
    .locals 2

    const-string v0, "topItem"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lf41/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lf41/e;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lf41/e;->getId()Ljava/lang/String;

    move-result-object p0

    const-string v0, "_topItem"

    invoke-static {p0, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    const-string p0, ""

    return-object p0

    :cond_2
    return-object v1
.end method

.method private static final L(Lot2/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lot2/c;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/16 v4, 0x8

    if-nez v0, :cond_1

    const v0, -0x7c9726d1

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v0, v5

    int-to-float v5, v4

    invoke-static {v0, v5, v1, v2, v3}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_1

    :cond_1
    const v0, -0x7c9580af

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x4

    int-to-float v0, v0

    int-to-float v5, v4

    invoke-static {v0, v5, v1, v2, v3}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lot2/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v2, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v3, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->L()Lb91/a;

    move-result-object v24

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v28, v3, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 v26, v4

    move-object v4, v0

    move/from16 v0, v26

    move-object/from16 v26, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    int-to-float v0, v0

    invoke-static {v3, v0, v1, v2}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final M(Lm91/u;)Ljava/lang/Object;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lf41/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lf41/e;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lf41/e;->getId()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    const-string p0, ""

    return-object p0

    :cond_2
    return-object v1
.end method

.method private static final N(Lot2/c;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    const-string v0, "$this$item"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p8, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p8, 0x1

    move-object/from16 v2, p7

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual/range {p0 .. p0}, Lot2/c;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/16 v4, 0x8

    if-nez v0, :cond_1

    const v0, 0x7018df70

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v0, v5

    int-to-float v5, v4

    invoke-static {v0, v5, v1, v2, v3}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_1

    :cond_1
    const v0, 0x701a6217

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    :goto_1
    new-instance v5, Ly71/o;

    invoke-virtual/range {p0 .. p0}, Lot2/c;->a()Lot2/b;

    move-result-object v0

    invoke-virtual {v0}, Lot2/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v8, Ly71/l$b;

    new-instance v11, Ly71/g;

    invoke-virtual/range {p0 .. p0}, Lot2/c;->a()Lot2/b;

    move-result-object v0

    invoke-virtual {v0}, Lot2/b;->a()I

    move-result v0

    const/4 v3, 0x2

    const/4 v6, 0x0

    invoke-direct {v11, v0, v6, v3, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0xffb

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v8 .. v22}, Ly71/l$b;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x7fdd

    move-object v11, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v5 .. v22}, Ly71/o;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v6, p2

    invoke-virtual {v2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    move-object/from16 v7, p0

    invoke-virtual {v2, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v3, v8

    move-object/from16 v8, p3

    invoke-virtual {v2, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v3, v9

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v9, v3, :cond_3

    :cond_2
    new-instance v23, La81/l;

    const/16 v30, 0x9

    move-object/from16 v28, p4

    move-object/from16 v29, p5

    move-object/from16 v24, v0

    move-object/from16 v25, v6

    move-object/from16 v26, v7

    move-object/from16 v27, v8

    invoke-direct/range {v23 .. v30}, La81/l;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v9, v23

    invoke-virtual {v2, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v9, Lc93/a;

    sget v0, Ly71/o;->q:I

    shl-int/lit8 v0, v0, 0x3

    const/4 v3, 0x1

    const/4 v6, 0x0

    move/from16 p4, v0

    move-object/from16 p3, v2

    move/from16 p5, v3

    move-object/from16 p1, v5

    move-object/from16 p0, v6

    move-object/from16 p2, v9

    invoke-static/range {p0 .. p5}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, p3

    const/4 v2, 0x5

    int-to-float v2, v2

    int-to-float v3, v4

    invoke-static {v2, v3, v1, v0}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_4
    move-object v0, v2

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final O(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lot2/c;Lv41/f$a;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 7

    new-instance v0, Lpt2/l$e;

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lpt2/l$e;-><init>(Lkotlin/jvm/functions/Function1;Lot2/c;Lv41/f$a;Lp1/c1;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {p0, p2, p2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv41/f$a;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lg1/y3;->e()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    new-instance p0, Lpt2/l$f;

    invoke-direct {p0, p4, v0}, Lpt2/l$f;-><init>(Lv41/f$a;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p1, v0, v0, p0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    new-instance p0, Lnt2/a$f;

    const/4 p1, 0x0

    const/4 p4, 0x1

    invoke-direct {p0, p1, p4, v0}, Lnt2/a$f;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lmt2/g$b;

    sget-object p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->BEHAVIORS:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-direct {p0, p1}, Lmt2/g$b;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lpt2/l;->B(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lp1/t2;)Lb3/x2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lb3/x2;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb3/x2;

    return-object p0
.end method

.method private static final S(Lp1/c1;)Lpt2/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lpt2/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpt2/a;

    return-object p0
.end method

.method private static final T(Lp1/c1;Lpt2/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lpt2/a;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final U(Lp1/c1;)Lv41/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lv41/g;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv41/g;

    return-object p0
.end method

.method private static final V(Lp1/c1;Lv41/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lv41/g;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic W(Lp1/t2;)Lb3/x2;
    .locals 0

    invoke-static {p0}, Lpt2/l;->R(Lp1/t2;)Lb3/x2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic X(Lp1/c1;Lpt2/a;)V
    .locals 0

    invoke-static {p0, p1}, Lpt2/l;->T(Lp1/c1;Lpt2/a;)V

    return-void
.end method

.method public static final synthetic Y(Lp1/c1;Lv41/g;)V
    .locals 0

    invoke-static {p0, p1}, Lpt2/l;->V(Lp1/c1;Lv41/g;)V

    return-void
.end method

.method public static synthetic a(Lm91/u;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lpt2/l;->M(Lm91/u;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpt2/l;->w(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbc3/c0;Lv41/f$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpt2/l;->E(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm91/u;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lpt2/l;->K(Lm91/u;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lot2/c;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lpt2/l;->N(Lot2/c;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lnt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpt2/l;->y(Lnt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lot2/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpt2/l;->J(Lot2/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lmt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpt2/l;->z(Lmt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lpt2/l;->A(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lot2/c;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lpt2/l;->F(Lot2/c;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lmt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpt2/l;->D(Lmt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lnt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpt2/l;->C(Lnt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpt2/l;->v(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lpt2/l;->Q(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lot2/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpt2/l;->L(Lot2/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lot2/c;Lv41/f$a;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpt2/l;->O(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lot2/c;Lv41/f$a;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv41/f$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpt2/l;->P(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv41/f$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lpt2/l;->G(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lot2/c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lpt2/l;->I(Lot2/c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpt2/l;->H(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lot2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x7ec5a218

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v4, 0x6

    const/4 v5, 0x4

    const/4 v6, 0x2

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_3
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v7, 0x93

    const/16 v11, 0x92

    const/4 v13, 0x0

    if-eq v8, v11, :cond_6

    const/4 v8, 0x1

    goto :goto_4

    :cond_6
    move v8, v13

    :goto_4
    and-int/lit8 v11, v7, 0x1

    invoke-virtual {v0, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v8}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    int-to-float v11, v6

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float v16, v11, v15

    const/16 v18, 0x0

    const/16 v19, 0xd

    move v11, v15

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v9, v0, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move/from16 v17, v11

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_7

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v10, v0, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lot2/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x5

    if-nez v9, :cond_a

    const v9, -0x44f29eaa

    invoke-virtual {v0, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    move-object v5, v0

    move v0, v7

    move-object v3, v8

    move v1, v11

    move v2, v13

    move/from16 v32, v16

    goto/16 :goto_6

    :cond_a
    const v12, -0x44f29ea9

    invoke-virtual {v0, v12}, Lp1/q;->e0(I)V

    int-to-float v12, v11

    int-to-float v14, v5

    mul-float/2addr v12, v14

    invoke-static {v8, v12, v10, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v0, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v14, v0, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->c1()J

    move-result-wide v20

    invoke-virtual {v14, v0, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    new-instance v14, Lw3/k;

    const/4 v15, 0x3

    invoke-direct {v14, v15}, Lw3/k;-><init>(I)V

    sget v22, Lb91/a;->d:I

    shl-int/lit8 v29, v22, 0x12

    const v30, 0x2fdf8

    move/from16 v23, v5

    move-object v5, v9

    move/from16 v22, v10

    const-wide/16 v9, 0x0

    move/from16 v24, v11

    const/4 v11, 0x0

    move/from16 v26, v6

    move-object v6, v12

    const/4 v12, 0x0

    move/from16 v27, v13

    const/4 v13, 0x0

    move/from16 v31, v15

    move/from16 v28, v17

    move-object/from16 v17, v14

    const-wide/16 v14, 0x0

    move/from16 v32, v16

    const/16 v16, 0x0

    const/16 v33, 0x100

    const/16 v34, 0x1

    const-wide/16 v18, 0x0

    move-object/from16 v35, v8

    move-wide/from16 v42, v20

    move/from16 v21, v7

    move-wide/from16 v7, v42

    const/16 v20, 0x0

    move/from16 v36, v21

    const/16 v21, 0x0

    move/from16 v37, v22

    const/16 v22, 0x0

    move/from16 v38, v23

    const/16 v23, 0x0

    move/from16 v39, v24

    const/16 v24, 0x0

    move/from16 v40, v26

    const/16 v26, 0x0

    move/from16 v41, v28

    const/16 v28, 0x30

    move/from16 v2, v27

    move/from16 v4, v31

    move-object/from16 v3, v35

    move/from16 v1, v41

    move-object/from16 v27, v0

    move/from16 v0, v36

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    int-to-float v4, v4

    invoke-static {v4, v1, v3, v5, v2}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    const/4 v1, 0x5

    :goto_6
    int-to-float v1, v1

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v1, v4

    const/4 v4, 0x0

    const/4 v6, 0x2

    invoke-static {v3, v1, v4, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v4, "Save_Behaviors_Button"

    invoke-static {v1, v4}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lot2/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lot2/c;->e()Z

    move-result v6

    and-int/lit8 v4, v0, 0x70

    const/16 v7, 0x20

    if-ne v4, v7, :cond_b

    const/4 v12, 0x1

    goto :goto_7

    :cond_b
    move v12, v2

    :goto_7
    and-int/lit16 v0, v0, 0x380

    const/16 v15, 0x100

    if-ne v0, v15, :cond_c

    const/4 v2, 0x1

    :cond_c
    or-int v0, v12, v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_e

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_d

    goto :goto_8

    :cond_d
    move-object/from16 v4, p1

    move-object/from16 v7, p2

    goto :goto_9

    :cond_e
    :goto_8
    new-instance v2, Ldc0/c;

    const/16 v0, 0x10

    move-object/from16 v4, p1

    move-object/from16 v7, p2

    invoke-direct {v2, v4, v0, v7}, Ldc0/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    move-object/from16 v18, v2

    check-cast v18, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v0, 0x12

    const/16 v21, 0x0

    const/16 v22, 0x1fbc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v5

    move-object v5, v1

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v19

    move/from16 v11, v32

    const/4 v0, 0x1

    invoke-static {v3, v11, v5, v0}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_a

    :cond_f
    move-object v5, v0

    move-object v4, v2

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lnx1/g;

    const/16 v5, 0x14

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object v2, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    sget-object v0, Lnt2/a$i;->a:Lnt2/a$i;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lmt2/g$b;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lmt2/g$b;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lpt2/l;->u(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lot2/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x1e0c7cfb    # -5.6149997E20f

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, v4, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_4
    :goto_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v3, v4, 0x180

    if-nez v3, :cond_7

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_4

    :cond_6
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    :goto_5
    and-int/lit16 v3, v0, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x1

    const/4 v11, 0x0

    if-eq v3, v5, :cond_8

    move v3, v6

    goto :goto_6

    :cond_8
    move v3, v11

    :goto_6
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v8, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_13

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_9

    new-instance p1, Lpt2/k;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Lpt2/k;-><init>(I)V

    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_a
    if-eqz v2, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v3, :cond_b

    new-instance p2, Lpt2/k;

    const/4 v1, 0x1

    invoke-direct {p2, v1}, Lpt2/k;-><init>(I)V

    invoke-virtual {v8, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_c
    move-object v7, p2

    instance-of p2, p0, Lot2/m$i;

    if-eqz p2, :cond_f

    const p2, 0x30c04358

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    move-object p2, p0

    check-cast p2, Lot2/m$i;

    invoke-virtual {p2}, Lot2/m$i;->b()Lot2/c;

    move-result-object v5

    if-nez v5, :cond_d

    const p2, 0x30c0a4b3

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    const/4 p2, 0x0

    goto :goto_7

    :cond_d
    const p2, 0x30c0a4b4

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    and-int/lit16 v9, v0, 0x3f0

    const/4 v10, 0x0

    move-object v6, p1

    invoke-static/range {v5 .. v10}, Lpt2/l;->B(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    :goto_7
    if-nez p2, :cond_e

    const p2, 0x331f19e2

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    shr-int/lit8 p2, v0, 0x6

    and-int/lit8 p2, p2, 0xe

    invoke-static {v7, v8, p2, v11}, Lqt2/k;->d(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_8
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    const p2, 0x331ef9ea

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    goto :goto_8

    :goto_9
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_f
    const p2, 0x30c4ffbc

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    sget-object p2, Ll0/m;->c:Ll0/g;

    sget-object v0, Lb2/e;->M:Lb2/k;

    invoke-static {p2, v0, v8, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p2

    iget-wide v0, v8, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-eqz v5, :cond_10

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_a
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v8, v3, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v8, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    :cond_11
    invoke-static {v0, v8, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v8, p2, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_b
    move-object v3, v7

    :goto_c
    move-object v2, p1

    goto :goto_d

    :cond_13
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, p2

    goto :goto_c

    :goto_d
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_14

    new-instance v0, Lpt2/f;

    const/4 v6, 0x1

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lpt2/f;-><init>(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final y(Lnt2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lmt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
