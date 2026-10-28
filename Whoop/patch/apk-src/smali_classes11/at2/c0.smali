.class public abstract Lat2/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0012\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lys2/e$j;",
        "viewState",
        "Lkotlin/Function1;",
        "Lws2/i;",
        "Ll83/a0;",
        "onViewEvent",
        "w",
        "(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Q",
        "(Lys2/e$j;Landroidx/compose/runtime/Composer;I)V",
        "s",
        "(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lat2/a;",
        "bottomSheetType",
        "Lv41/g;",
        "bottomSheetTopBar",
        "Lb3/x2;",
        "keyboard",
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
.method private static final A(Lkotlin/jvm/functions/Function1;Lys2/e$j;)Ll83/a0;
    .locals 4

    new-instance v0, Lws2/i$a;

    invoke-virtual {p1}, Lys2/e$j;->i()Lws2/g;

    move-result-object p1

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lws2/i$a;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lys2/e$j;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 16

    move-object/from16 v3, p0

    move-object/from16 v8, p6

    const-string v0, "$this$LazyColumn"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lat2/x;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v1}, Lat2/x;-><init>(Lys2/e$j;I)V

    new-instance v1, Lx1/b;

    const/4 v9, 0x1

    const v2, 0x4a1f55d7    # 2610549.8f

    invoke-direct {v1, v0, v9, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v10, 0x0

    const/4 v11, 0x3

    invoke-static {v8, v10, v1, v11}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v3}, Lys2/e$j;->n()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const v12, 0x2fd4df92

    if-nez v0, :cond_0

    invoke-virtual {v3}, Lys2/e$j;->n()Ljava/util/List;

    move-result-object v1

    new-instance v0, Laq0/p;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Laq0/p;-><init>(I)V

    sget-object v2, Lat2/c0$g;->w:Lat2/c0$g;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v13

    new-instance v14, Lat2/c0$h;

    invoke-direct {v14, v0, v1}, Lat2/c0$h;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v15, Lat2/c0$i;

    invoke-direct {v15, v2, v1}, Lat2/c0$i;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lat2/c0$j;

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-direct/range {v0 .. v7}, Lat2/c0$j;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lys2/e$j;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;)V

    new-instance v1, Lx1/b;

    invoke-direct {v1, v0, v9, v12}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v0, v8

    check-cast v0, Ln0/f;

    invoke-virtual {v0, v13, v14, v15, v1}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    :cond_0
    new-instance v0, Lat2/x;

    const/4 v1, 0x1

    invoke-direct {v0, v3, v1}, Lat2/x;-><init>(Lys2/e$j;I)V

    new-instance v1, Lx1/b;

    const v2, 0x6374d6ce

    invoke-direct {v1, v0, v9, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v8, v10, v1, v11}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v3}, Lys2/e$j;->g()Ljava/util/List;

    move-result-object v1

    new-instance v0, Laq0/p;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Laq0/p;-><init>(I)V

    sget-object v2, Lat2/c0$k;->w:Lat2/c0$k;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v13

    new-instance v14, Lat2/c0$l;

    invoke-direct {v14, v0, v1}, Lat2/c0$l;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v15, Lat2/c0$m;

    invoke-direct {v15, v2, v1}, Lat2/c0$m;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lat2/c0$n;

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-direct/range {v0 .. v7}, Lat2/c0$n;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lys2/e$j;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;)V

    new-instance v1, Lx1/b;

    invoke-direct {v1, v0, v9, v12}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v0, v8

    check-cast v0, Ln0/f;

    invoke-virtual {v0, v13, v14, v15, v1}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    new-instance v0, Lat2/y;

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v7}, Lat2/y;-><init>(Ljava/lang/Object;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp1/c1;Lp1/c1;I)V

    new-instance v1, Lx1/b;

    const v2, -0x28ac80f1

    invoke-direct {v1, v0, v9, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v8, v10, v1, v11}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final C(Lys2/e$j;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->e()Lys2/f;

    move-result-object v0

    invoke-virtual {v0}, Lys2/f;->d()Lcom/whoop/design/util/TextResource;

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

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->e()Lys2/f;

    move-result-object v3

    invoke-virtual {v3}, Lys2/f;->c()Lcom/whoop/design/util/TextResource;

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

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->n()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_1

    const v5, -0x4b6dfd5b

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float v5, v5, v30

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->m()Lcom/whoop/design/util/TextResource;

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

    const v0, -0x4b675515

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D(Lm91/u;)Ljava/lang/Object;
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

.method private static final E(Lys2/e$j;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 5

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    and-int/2addr p3, v1

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lys2/e$j;->n()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/16 v0, 0x8

    if-nez p1, :cond_1

    const p1, -0x264ddd93

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const-wide/high16 v3, 0x4004000000000000L    # 2.5

    double-to-float p1, v3

    int-to-float v1, v0

    invoke-static {p1, v1, p3, p2, v2}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_1

    :cond_1
    const p1, -0x264c3771

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x4

    int-to-float p1, p1

    int-to-float v1, v0

    invoke-static {p1, v1, p3, p2, v2}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_1
    invoke-static {p0, p2, v2}, Lat2/c0;->Q(Lys2/e$j;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 p0, 0x3ff8000000000000L    # 1.5

    double-to-float p0, p0

    int-to-float p1, v0

    invoke-static {p0, p1, p3, p2}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lm91/u;)Ljava/lang/Object;
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

.method private static final G(Lys2/e$j;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->n()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/16 v4, 0x8

    if-nez v0, :cond_1

    const v0, -0x426ff974

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v0, v5

    int-to-float v5, v4

    invoke-static {v0, v5, v1, v2, v3}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_1

    :cond_1
    const v0, -0x426e76cd

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    :goto_1
    new-instance v5, Ly71/o;

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->a()Lys2/a;

    move-result-object v0

    invoke-virtual {v0}, Lys2/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v8, Ly71/l$b;

    new-instance v11, Ly71/g;

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->a()Lys2/a;

    move-result-object v0

    invoke-virtual {v0}, Lys2/a;->a()I

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

    const/16 v30, 0x2

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

.method private static final H(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lys2/e$j;Lv41/f$a;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 7

    new-instance v0, Lat2/c0$e;

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lat2/c0$e;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$j;Lv41/f$a;Lp1/c1;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {p0, p2, p2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lys2/e$j;Lv41/f$a;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lg1/y3;->e()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    new-instance p0, Lat2/c0$f;

    invoke-direct {p0, p4, v0}, Lat2/c0$f;-><init>(Lv41/f$a;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p1, v0, v0, p0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_0
    new-instance p0, Lws2/i$a;

    invoke-virtual {p3}, Lys2/e$j;->i()Lws2/g;

    move-result-object p1

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result p1

    const/4 p3, 0x0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, p3

    :goto_0
    const/4 p4, 0x2

    invoke-direct {p0, p1, p3, p4, v0}, Lws2/i$a;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lys2/e$j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lat2/c0;->w(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/c1;)Lat2/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lat2/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lat2/a;

    return-object p0
.end method

.method private static final L(Lp1/c1;Lat2/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lat2/a;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final M(Lp1/c1;)Lv41/g;
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

.method private static final N(Lp1/c1;Lv41/g;)V
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

.method private static final O(Lp1/t2;)Lb3/x2;
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

.method private static final P(Lbc3/c0;Lv41/f$a;)Ll83/a0;
    .locals 2

    new-instance v0, Lat2/c0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lat2/c0$b;-><init>(Lv41/f$a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lys2/e$j;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x30d2bee5

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

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
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v9, v8, v2, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v2, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v2, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v2, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-nez v10, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    invoke-static {v9, v2, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v2, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v8, v3

    const-wide/16 v10, 0x0

    cmpl-double v5, v8, v10

    if-lez v5, :cond_6

    goto :goto_4

    :cond_6
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v5, v3, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v0}, Lys2/e$j;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v2, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v2, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    invoke-virtual {v9, v2, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->L()Lb91/a;

    move-result-object v22

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v26, v13, 0x12

    const v27, 0x2fff8

    move v13, v6

    move v14, v7

    const-wide/16 v6, 0x0

    move v15, v8

    const/4 v8, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v24, v2

    move-object v2, v3

    move-object/from16 v18, v4

    move-object v3, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    move-object/from16 v23, v16

    const-wide/16 v15, 0x0

    move/from16 v25, v17

    const/16 v17, 0x0

    move-object/from16 v28, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move-object/from16 v32, v23

    const/16 v23, 0x0

    move/from16 v33, v25

    const/16 v25, 0x0

    move-object/from16 v1, v28

    move/from16 v0, v31

    move/from16 v34, v33

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    new-instance v3, Lhy0/c2;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v6, Lhy0/b2;->POSITIVE_GREEN:Lhy0/b2;

    sget-object v9, Lhy0/s0;->END:Lhy0/s0;

    const/16 v19, 0x7fd8

    const/16 v20, 0x0

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v3 .. v20}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v4, Lhy0/c2;->p:I

    invoke-static {v3, v2, v4}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    const-wide v5, 0x3fd3333333333333L    # 0.3

    double-to-float v3, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v2, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v6, Lhy0/c2;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v9, Lhy0/b2;->NEGATIVE_YELLOW:Lhy0/b2;

    sget-object v12, Lhy0/s0;->START:Lhy0/s0;

    const/16 v22, 0x7fd8

    const/4 v8, 0x1

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v6 .. v23}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6, v2, v4}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    const/4 v14, 0x1

    int-to-float v3, v14

    mul-float/2addr v3, v5

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v2, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_7

    const v0, -0x6c89a6ba

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    :goto_5
    const/4 v14, 0x1

    goto :goto_6

    :cond_7
    const v3, -0x6c89a6b9

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-static {v1, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v32

    move/from16 v3, v34

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v4

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->t()Lb91/a;

    move-result-object v22

    const/16 v25, 0x0

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v13, 0x0

    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    invoke-virtual {v2, v14}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, La41/i;

    const/4 v2, 0x3

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final R(Lys2/e$j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lat2/c0;->Q(Lys2/e$j;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic S(Lp1/c1;Lat2/a;)V
    .locals 0

    invoke-static {p0, p1}, Lat2/c0;->L(Lp1/c1;Lat2/a;)V

    return-void
.end method

.method public static final synthetic T(Lp1/c1;Lv41/g;)V
    .locals 0

    invoke-static {p0, p1}, Lat2/c0;->N(Lp1/c1;Lv41/g;)V

    return-void
.end method

.method public static final synthetic U(Lp1/t2;)Lb3/x2;
    .locals 0

    invoke-static {p0}, Lat2/c0;->O(Lp1/t2;)Lb3/x2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lys2/e$j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lat2/c0;->J(Lys2/e$j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lys2/e$j;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lat2/c0;->y(Lys2/e$j;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lys2/e$j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/c0;->t(Lkotlin/jvm/functions/Function1;Lys2/e$j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lys2/e$j;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lat2/c0;->C(Lys2/e$j;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lys2/e$j;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lat2/c0;->z(Lys2/e$j;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm91/u;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lat2/c0;->D(Lm91/u;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lbc3/c0;Lv41/f$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/c0;->P(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lys2/e$j;Lv41/f$a;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lat2/c0;->H(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lys2/e$j;Lv41/f$a;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lys2/e$j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lat2/c0;->R(Lys2/e$j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lys2/e$j;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lat2/c0;->G(Lys2/e$j;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lys2/e$j;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lat2/c0;->B(Lys2/e$j;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Lys2/e$j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/c0;->A(Lkotlin/jvm/functions/Function1;Lys2/e$j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lys2/e$j;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lat2/c0;->E(Lys2/e$j;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lm91/u;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lat2/c0;->F(Lm91/u;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Lys2/e$j;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lat2/c0;->u(Lkotlin/jvm/functions/Function1;Lys2/e$j;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lws2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/c0;->x(Lws2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lys2/e$j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lat2/c0;->v(Lys2/e$j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lys2/e$j;Lv41/f$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lat2/c0;->I(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lys2/e$j;Lv41/f$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 51
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lys2/e$j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x2e2a1c02

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    move/from16 v29, v4

    and-int/lit8 v4, v29, 0x13

    const/16 v6, 0x12

    const/4 v8, 0x0

    if-eq v4, v6, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    move v4, v8

    :goto_3
    and-int/lit8 v10, v29, 0x1

    invoke-virtual {v3, v10, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_12

    const-wide/high16 v10, 0x4004000000000000L    # 2.5

    double-to-float v4, v10

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v4, v10

    int-to-float v5, v5

    mul-float/2addr v5, v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v4, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v12, v3, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v12, v3, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_5

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v3, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v3, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    move/from16 p2, v6

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    invoke-static {v12, v3, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v3, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    move v7, v4

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lys2/e$j;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v12, v3, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v3, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->c1()J

    move-result-wide v20

    invoke-virtual {v8, v3, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    move-object v8, v15

    new-instance v15, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v15, v9}, Lw3/k;-><init>(I)V

    sget v22, Lb91/a;->d:I

    shl-int/lit8 v27, v22, 0x12

    const v28, 0x2fdf8

    move/from16 v24, v7

    move-object/from16 v22, v8

    const-wide/16 v7, 0x0

    move/from16 v25, v9

    const/4 v9, 0x0

    move/from16 v26, v10

    const/4 v10, 0x0

    move-object/from16 v30, v11

    const/4 v11, 0x0

    move-object/from16 v31, v13

    move/from16 v32, v25

    move-object/from16 v25, v3

    move-object v3, v12

    const-wide/16 v12, 0x0

    move-object/from16 v33, v14

    const/4 v14, 0x0

    const/high16 v34, 0x3f800000    # 1.0f

    const/16 v35, 0x20

    const-wide/16 v16, 0x0

    const/16 v36, 0x0

    const/16 v18, 0x0

    const/16 v37, 0x1

    const/16 v19, 0x0

    move-object/from16 v38, v6

    move-wide/from16 v49, v20

    move-object/from16 v21, v5

    move-wide/from16 v5, v49

    const/16 v20, 0x0

    move-object/from16 v39, v21

    const/16 v21, 0x0

    move-object/from16 v40, v22

    const/16 v22, 0x0

    move/from16 v41, v24

    const/16 v24, 0x0

    move/from16 v42, v26

    const/16 v26, 0x30

    move-object/from16 v0, v30

    move-object/from16 v46, v31

    move/from16 v1, v32

    move-object/from16 v43, v33

    move-object/from16 v47, v38

    move-object/from16 v45, v39

    move-object/from16 v44, v40

    move/from16 v2, v42

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    int-to-float v1, v1

    invoke-static {v1, v2, v0, v3}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v4, "Save_Behaviors_Button"

    invoke-static {v1, v4}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->b()Lys2/b;

    move-result-object v4

    invoke-virtual {v4}, Lys2/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->b()Lys2/b;

    move-result-object v4

    invoke-virtual {v4}, Lys2/b;->b()Z

    move-result v4

    and-int/lit8 v5, v29, 0x70

    const/16 v6, 0x20

    if-ne v5, v6, :cond_8

    const/4 v8, 0x1

    :goto_5
    move-object/from16 v6, p0

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    goto :goto_5

    :goto_6
    invoke-virtual {v3, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_a

    if-ne v8, v10, :cond_9

    goto :goto_7

    :cond_9
    move-object/from16 v11, p1

    goto :goto_8

    :cond_a
    :goto_7
    new-instance v8, Lat2/z;

    const/4 v7, 0x0

    move-object/from16 v11, p1

    invoke-direct {v8, v11, v6, v7}, Lat2/z;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$j;I)V

    invoke-virtual {v3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    move-object/from16 v16, v8

    check-cast v16, Lc93/a;

    shl-int/lit8 v18, v41, 0x12

    const/16 v19, 0x0

    const/16 v20, 0x1fbc

    move v7, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v12, v8

    const/4 v8, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v48, v3

    move-object v3, v1

    move/from16 v1, v17

    move-object/from16 v17, v48

    move-object/from16 v48, v21

    invoke-static/range {v3 .. v20}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v17

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    invoke-static {v4, v2, v0, v3}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Ll0/m;->f:Ll0/h;

    sget-object v4, Lb2/e;->J:Lb2/l;

    const/4 v5, 0x6

    invoke-static {v2, v4, v3, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v6, v3, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-eqz v7, :cond_b

    move-object/from16 v7, v43

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v8, v44

    goto :goto_a

    :cond_b
    invoke-virtual {v3}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v3, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v45

    invoke-static {v3, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v3, Lp1/q;->S:Z

    if-nez v2, :cond_c

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    move-object/from16 v2, v46

    goto :goto_c

    :cond_d
    :goto_b
    move-object/from16 v2, v47

    goto :goto_d

    :goto_c
    invoke-static {v4, v3, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v3, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$j;->b()Lys2/b;

    move-result-object v0

    invoke-virtual {v0}, Lys2/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_e

    const v0, -0x63577550

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    :goto_e
    const/4 v2, 0x1

    goto :goto_13

    :cond_e
    const v2, -0x6357754f

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    const/16 v6, 0x20

    if-ne v1, v6, :cond_f

    const/4 v8, 0x1

    :goto_f
    move-object/from16 v1, p0

    goto :goto_10

    :cond_f
    const/4 v8, 0x0

    goto :goto_f

    :goto_10
    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_11

    move-object/from16 v13, v48

    if-ne v4, v13, :cond_10

    goto :goto_11

    :cond_10
    move-object/from16 v6, p1

    goto :goto_12

    :cond_11
    :goto_11
    new-instance v4, La20/g;

    const/16 v2, 0xf

    move-object/from16 v6, p1

    invoke-direct {v4, v2, v6, v1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    move-object v15, v4

    check-cast v15, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v17, v41, 0x6

    const/16 v18, 0x0

    const/16 v19, 0xffb

    move-object/from16 v25, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v5, v0

    move-object/from16 v16, v25

    move-object/from16 v0, p1

    invoke-static/range {v3 .. v19}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v16

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_13
    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_12
    move-object/from16 v49, v1

    move-object v1, v0

    move-object/from16 v0, v49

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_13

    new-instance v3, Lk;

    const/4 v4, 0x7

    move/from16 v5, p3

    invoke-direct {v3, v1, v0, v5, v4}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Lys2/e$j;)Ll83/a0;
    .locals 7

    new-instance v0, Lws2/i$h;

    invoke-virtual {p1}, Lys2/e$j;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lys2/e$j;->k()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v2

    invoke-virtual {p1}, Lys2/e$j;->j()Ljava/util/List;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lws2/i$h;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Lys2/e$j;Ljava/lang/Object;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lws2/i$c;

    invoke-virtual {p1}, Lys2/e$j;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lys2/e$j;->k()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lws2/i$c;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lys2/e$j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lat2/c0;->s(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lys2/e$j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v0, 0x90ad97e

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v9, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    :goto_2
    move/from16 v20, v0

    goto :goto_4

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_3

    :cond_4
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    goto :goto_2

    :goto_4
    and-int/lit8 v0, v20, 0x13

    const/16 v4, 0x12

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v0, v4, :cond_5

    move v0, v12

    goto :goto_5

    :cond_5
    move v0, v11

    :goto_5
    and-int/lit8 v4, v20, 0x1

    invoke-virtual {v6, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_6

    new-instance v0, Laq0/p;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, Laq0/p;-><init>(I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_7
    move-object v0, v3

    :goto_6
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_8

    invoke-static {v6}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v14, v2

    check-cast v14, Lbc3/c0;

    sget-object v2, Lg1/z3;->w:Lg1/z3;

    const/16 v7, 0xc06

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v2 .. v8}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v8

    move-object v15, v6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_9

    sget-object v2, Lat2/a$b;->a:Lat2/a$b;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v5, v2

    check-cast v5, Lp1/c1;

    new-instance v2, Lv41/f$a;

    invoke-direct {v2, v8}, Lv41/f$a;-><init>(Lg1/y3;)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-ne v3, v13, :cond_a

    new-instance v21, Lv41/g;

    invoke-virtual {v1}, Lys2/e$j;->c()Lkm0/e;

    move-result-object v3

    invoke-virtual {v3}, Lkm0/e;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v22

    new-instance v3, Ly71/g;

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-static {v6}, Lyb0/f;->a(Lx81/d;)I

    move-result v6

    invoke-direct {v3, v6, v4, v9, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v29, 0x7c

    const/16 v30, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v23, v3

    invoke-direct/range {v21 .. v30}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v21 .. v21}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v9, v3

    check-cast v9, Lp1/c1;

    invoke-virtual {v1}, Lys2/e$j;->c()Lkm0/e;

    move-result-object v3

    invoke-virtual {v3}, Lkm0/e;->e()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lys2/e$j;->c()Lkm0/e;

    move-result-object v6

    invoke-virtual {v6}, Lkm0/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    sget-object v6, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v15, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v15}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v6

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v15, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v7, v7, v16

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_b

    if-ne v10, v13, :cond_c

    :cond_b
    new-instance v10, Lat2/c0$a;

    invoke-direct {v10, v8, v6, v4}, Lat2/c0$a;-><init>(Lg1/y3;Lp1/t2;Lq83/d;)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lc93/m;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-static {v15, v10, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Lat2/c0;->M(Lp1/c1;)Lv41/g;

    move-result-object v10

    move-object/from16 v16, v10

    sget-object v10, Lny0/q$b;->f:Lny0/q$b;

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    invoke-virtual {v15, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_d

    if-ne v6, v13, :cond_e

    :cond_d
    new-instance v6, Lat2/s;

    const/4 v4, 0x1

    invoke-direct {v6, v14, v2, v4}, Lat2/s;-><init>(Lbc3/c0;Lv41/f$a;I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v18, v6

    check-cast v18, Lc93/a;

    move-object v6, v5

    move-object v5, v0

    new-instance v0, Lat2/a0;

    const/4 v7, 0x0

    move-object v4, v14

    invoke-direct/range {v0 .. v7}, Lat2/a0;-><init>(Ljava/lang/Object;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    move-object v3, v2

    move-object v2, v4

    const v1, 0x52861f10

    invoke-static {v1, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    new-instance v0, Lat2/b0;

    move-object/from16 v1, p0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v5

    move-object v5, v6

    move-object v6, v9

    invoke-direct/range {v0 .. v7}, Lat2/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v1, v0

    move-object/from16 v21, v2

    move-object v2, v3

    move-object v3, v4

    const v4, -0x15222034

    invoke-static {v4, v15, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    sget v4, Lv41/g;->h:I

    shl-int/lit8 v4, v4, 0x3

    const v5, 0xc00006

    or-int/2addr v4, v5

    sget v5, Lv41/f$a;->c:I

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v4, v5

    sget v5, Lny0/q$b;->g:I

    shl-int/lit8 v5, v5, 0x1b

    or-int/2addr v4, v5

    move-object/from16 v5, v18

    const/16 v18, 0x6000

    const/16 v19, 0x3d68

    move-object v6, v15

    move-object v15, v1

    move-object/from16 v1, v17

    move/from16 v17, v4

    const/4 v4, 0x0

    move-object v7, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v6

    const/4 v6, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    move-object/from16 v22, v9

    const/4 v9, 0x0

    move/from16 v23, v11

    const/4 v11, 0x0

    move/from16 v24, v12

    const/4 v12, 0x0

    move-object/from16 v25, v13

    const/4 v13, 0x0

    move-object/from16 v26, v8

    move-object v8, v14

    const/4 v14, 0x0

    move-object/from16 v31, v25

    move-object/from16 v0, v26

    invoke-static/range {v1 .. v19}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v16

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    and-int/lit8 v4, v20, 0x70

    const/16 v5, 0x20

    if-ne v4, v5, :cond_f

    const/4 v11, 0x1

    goto :goto_7

    :cond_f
    const/4 v11, 0x0

    :goto_7
    or-int/2addr v1, v11

    move-object/from16 v4, p0

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_10

    move-object/from16 v1, v31

    if-ne v5, v1, :cond_11

    :cond_10
    move-object v1, v0

    goto :goto_8

    :cond_11
    move-object v0, v5

    move-object/from16 v5, v21

    goto :goto_9

    :goto_8
    new-instance v0, La00/h;

    const/4 v6, 0x4

    move-object v5, v3

    move-object/from16 v3, v21

    invoke-direct/range {v0 .. v6}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v5, v3

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v0, Lc93/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v15, v1, v2}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v3, v5

    goto :goto_a

    :cond_12
    move-object v15, v6

    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, La01/i;

    const/4 v5, 0x3

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final x(Lws2/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lys2/e$j;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-virtual {p0}, Lys2/e$j;->c()Lkm0/e;

    move-result-object v2

    invoke-static/range {p5 .. p5}, Lat2/c0;->K(Lp1/c1;)Lat2/a;

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

    invoke-static/range {v2 .. v10}, Lat2/f1;->g(Lkm0/e;Lv41/f$a;Lat2/a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lys2/e$j;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    and-int/lit8 v0, p7, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    and-int/lit8 v4, p7, 0x1

    move-object/from16 v5, p6

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_a

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v11, v5, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_1

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v5, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    :cond_2
    invoke-static {v7, v5, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v11, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v1}, Lys2/e$j;->e()Lys2/f;

    move-result-object v4

    invoke-virtual {v4}, Lys2/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lys2/e$j;->e()Lys2/f;

    move-result-object v4

    invoke-virtual {v4}, Lys2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_4

    new-instance v4, Lo81/a;

    invoke-virtual {v1}, Lys2/e$j;->e()Lys2/f;

    move-result-object v7

    invoke-virtual {v7}, Lys2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct {v4, v7, v9, v3, v6}, Lo81/a;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v4

    goto :goto_2

    :cond_4
    move-object v13, v6

    :goto_2
    new-instance v14, Ly71/g;

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-static {v3}, Lih0/d0;->C(Lx81/d;)I

    move-result v3

    sget v4, Luv0/c;->E:I

    invoke-static {v5, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v14, v3, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/16 v27, 0x7ff8

    const/16 v28, 0x0

    const/4 v15, 0x0

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

    invoke-direct/range {v11 .. v28}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_5

    if-ne v4, v6, :cond_6

    :cond_5
    new-instance v4, Lat2/z;

    const/4 v3, 0x1

    invoke-direct {v4, v2, v1, v3}, Lat2/z;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$j;I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v13, v4

    check-cast v13, Lc93/a;

    sget v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v3, v3, 0x3

    or-int/lit8 v17, v3, 0x6

    const/16 v18, 0x34

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v5

    invoke-static/range {v10 .. v18}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v10

    move-object/from16 v10, v16

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-wide/high16 v3, 0x4004000000000000L    # 2.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v12, v3, v4

    int-to-float v3, v9

    mul-float v13, v3, v4

    const/4 v15, 0x0

    const/16 v16, 0x8

    move v14, v12

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    float-to-double v4, v0

    const-wide/16 v11, 0x0

    cmpl-double v4, v4, v11

    if-lez v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v0, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v3, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v3, "SetupBehaviorLazyColumnTag"

    invoke-static {v0, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    move-object/from16 v3, p2

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    move-object/from16 v4, p3

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_8

    if-ne v5, v6, :cond_9

    :cond_8
    new-instance v0, Lam2/b;

    const/4 v7, 0x1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v7}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :cond_9
    move-object/from16 v18, v5

    check-cast v18, Lkotlin/jvm/functions/Function1;

    const/16 v20, 0x0

    const/16 v21, 0x1fe

    move-object/from16 v16, v10

    move-object v10, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v10 .. v21}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v19

    invoke-static {v1, v2, v10, v9}, Lat2/c0;->s(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_a
    move-object v10, v5

    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
