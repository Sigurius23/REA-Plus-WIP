.class public abstract Low0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Low0/a;",
        "dialogState",
        "Lkotlin/Function1;",
        "Lcom/whoop/core/details/view/b;",
        "Ll83/a0;",
        "onEvent",
        "e",
        "(Low0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "core-details_release"
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
.method public static synthetic a(Low0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Low0/d;->i(Low0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Low0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Low0/d;->h(Lkotlin/jvm/functions/Function1;Low0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Low0/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Low0/d;->f(Low0/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Low0/a;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Low0/d;->g(Low0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Low0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Low0/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, -0x58cfe61

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

    if-eqz p0, :cond_5

    move v2, v3

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance p2, Loq1/c;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p0, p1}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x7abef062

    invoke-static {v0, v6, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6000

    const/16 v8, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v8}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lof2/d;

    const/4 v1, 0x6

    invoke-direct {v0, p0, p1, p3, v1}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final f(Low0/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_1

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v7

    :goto_2
    and-int/2addr v3, v6

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v2, :cond_7

    if-eqz v0, :cond_7

    const v2, -0x11c663f0

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Low0/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Low0/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Low0/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Low0/a;->b()Ly81/e;

    move-result-object v13

    invoke-virtual {v0}, Low0/a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_3

    if-ne v3, v4, :cond_4

    :cond_3
    new-instance v3, Low0/c;

    invoke-direct {v3, v0, v1}, Low0/c;-><init>(Low0/a;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v30, v3

    check-cast v30, Lc93/a;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    if-ne v3, v4, :cond_6

    :cond_5
    new-instance v3, Low0/c;

    invoke-direct {v3, v1, v0}, Low0/c;-><init>(Lkotlin/jvm/functions/Function1;Low0/a;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v32, v3

    check-cast v32, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v0, 0x3

    shl-int/lit8 v2, v0, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0x9

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x1b

    or-int v37, v1, v0

    const/16 v39, 0x0

    const v40, 0xebfedd1

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

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

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x180

    move-object/from16 v36, v5

    invoke-static/range {v8 .. v40}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    move-object v0, v5

    const v1, -0x11be1ebc    # -1.5000734E28f

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_8
    move-object v0, v5

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Low0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Low0/a;->e()Lcom/whoop/core/details/view/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Low0/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Low0/a;->c()Lcom/whoop/core/details/view/b;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Low0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Low0/d;->e(Low0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
