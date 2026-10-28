.class public abstract Lby1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aO\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "footerText",
        "policyCtaText",
        "",
        "policyCtaUrl",
        "Lkotlin/Function1;",
        "Lxx1/b;",
        "Ll83/a0;",
        "onNavigationEvent",
        "Lvx1/a;",
        "onAnalyticsEvent",
        "d",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "membership_release"
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lby1/d;->g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lby1/d;->f(Lcom/whoop/design/util/TextResource;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lby1/d;->e(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "footerText"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaText"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaUrl"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAnalyticsEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p5

    check-cast v15, Lp1/q;

    const v0, -0x2840f010

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v6, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v6, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_3

    :cond_3
    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_3
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_4

    :cond_4
    const/16 v7, 0x10

    :goto_4
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v6, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_7

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v8

    goto :goto_5

    :cond_6
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v6, 0xc00

    const/16 v9, 0x800

    if-nez v7, :cond_9

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    move v7, v9

    goto :goto_6

    :cond_8
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v0, v7

    :cond_9
    and-int/lit16 v7, v6, 0x6000

    const/16 v10, 0x4000

    if-nez v7, :cond_b

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    move v7, v10

    goto :goto_7

    :cond_a
    const/16 v7, 0x2000

    :goto_7
    or-int/2addr v0, v7

    :cond_b
    and-int/lit16 v7, v0, 0x2493

    const/16 v11, 0x2492

    const/16 v33, 0x0

    const/16 v34, 0x1

    if-eq v7, v11, :cond_c

    move/from16 v7, v34

    goto :goto_8

    :cond_c
    move/from16 v7, v33

    :goto_8
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v15, v11, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_12

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v11, v0, 0xe

    or-int/2addr v7, v11

    invoke-static {v1, v15, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v15, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    invoke-virtual {v11, v15, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v11

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v31, v13, 0x12

    const v32, 0x2fffa

    move v13, v8

    const/4 v8, 0x0

    move/from16 v16, v9

    move v14, v10

    move-wide v9, v11

    const-wide/16 v11, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v29, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    move/from16 v20, v17

    const-wide/16 v16, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    move/from16 v23, v21

    const-wide/16 v20, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v36, v28

    const/16 v28, 0x0

    move/from16 v37, v30

    const/16 v30, 0x0

    move/from16 v1, v35

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v29

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-static {v8, v8, v7}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v13

    const v7, 0xe000

    and-int/2addr v7, v0

    if-ne v7, v1, :cond_d

    move/from16 v1, v34

    goto :goto_9

    :cond_d
    move/from16 v1, v33

    :goto_9
    and-int/lit16 v7, v0, 0x1c00

    const/16 v8, 0x800

    if-ne v7, v8, :cond_e

    move/from16 v7, v34

    goto :goto_a

    :cond_e
    move/from16 v7, v33

    :goto_a
    or-int/2addr v1, v7

    and-int/lit16 v0, v0, 0x380

    const/16 v7, 0x100

    if-ne v0, v7, :cond_f

    move/from16 v33, v34

    :cond_f
    or-int v0, v1, v33

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_10

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_11

    :cond_10
    new-instance v1, Lby1/b;

    const/4 v0, 0x0

    invoke-direct {v1, v5, v4, v3, v0}, Lby1/b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v7, v1

    check-cast v7, Lc93/a;

    new-instance v0, Lby1/c;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lby1/c;-><init>(Lcom/whoop/design/util/TextResource;I)V

    const v1, -0x5b7017d3

    invoke-static {v1, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/high16 v16, 0x36000000

    const/16 v17, 0xfe

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v17}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v29, v15

    goto :goto_b

    :cond_12
    move-object/from16 v29, v15

    invoke-virtual/range {v29 .. v29}, Lp1/q;->X()V

    :goto_b
    invoke-virtual/range {v29 .. v29}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Laq1/c;

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Laq1/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    sget-object v0, Lvx1/a$b;->a:Lvx1/a$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lxx1/b$b;

    invoke-direct {p0, p2}, Lxx1/b$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 27

    const-string v0, "$this$TextButton"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object/from16 v1, p0

    invoke-static {v1, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->k()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v3

    sget-object v4, Li2/t;->b:Li2/s;

    const-wide v5, 0xff0093e7L

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v1, Li2/x;

    invoke-direct {v1, v5, v6}, Li2/x;-><init>(J)V

    const-wide v5, 0xff4c9bd9L

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    const-wide v5, 0xff66bcffL

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v8, Li2/x;

    invoke-direct {v8, v5, v6}, Li2/x;-><init>(J)V

    filled-new-array {v1, v7, v8}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-wide/16 v8, 0x0

    const/16 v10, 0xe

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v10}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v4

    const-wide/16 v9, 0x0

    const v11, 0x1fffffe

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Ll3/v0;->a(Ll3/v0;Li2/t;JLp3/r;Lp3/i;JI)Ll3/v0;

    move-result-object v22

    const/16 v25, 0x0

    const v26, 0xfffe

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

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

    const/16 v24, 0x0

    move-object/from16 v23, v2

    move-object v2, v0

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v23, v2

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lby1/d;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
