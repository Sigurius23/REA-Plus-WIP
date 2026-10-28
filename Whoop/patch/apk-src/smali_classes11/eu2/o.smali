.class public abstract Leu2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Leu2/p;",
        "workoutGroup",
        "Lj31/k;",
        "reorderableListState",
        "",
        "itemIndex",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Leu2/p;Lj31/k;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Leu2/o;->j(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Leu2/p;Landroidx/compose/ui/Modifier;Lo11/m$b;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Leu2/o;->i(Leu2/p;Landroidx/compose/ui/Modifier;Lo11/m$b;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;Lkotlin/jvm/functions/Function1;Leu2/p;Landroidx/compose/ui/Modifier;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Leu2/o;->g(Ljava/util/List;Lkotlin/jvm/functions/Function1;Leu2/p;Landroidx/compose/ui/Modifier;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm91/a;Lkotlin/jvm/functions/Function1;ILeu2/p;Landroidx/compose/ui/Modifier;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Leu2/o;->h(Lm91/a;Lkotlin/jvm/functions/Function1;ILeu2/p;Landroidx/compose/ui/Modifier;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Leu2/p;Lj31/k;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Leu2/o;->k(Landroidx/compose/ui/Modifier;Leu2/p;Lj31/k;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Leu2/p;Lj31/k;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Leu2/p;",
            "Lj31/k;",
            "Ljava/lang/Integer;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v1, "workoutGroup"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v1, 0x6fe75d4c

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_4
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_5

    or-int/lit16 v4, v4, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_8

    and-int/lit16 v8, v6, 0x200

    if-nez v8, :cond_6

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_3

    :cond_6
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_3
    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    :cond_8
    :goto_5
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_a

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x4000

    goto :goto_6

    :cond_9
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v4, v8

    :cond_a
    move v8, v4

    and-int/lit16 v4, v8, 0x2093

    const/16 v9, 0x2092

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v4, v9, :cond_b

    move v4, v11

    goto :goto_7

    :cond_b
    move v4, v10

    :goto_7
    and-int/lit8 v9, v8, 0x1

    invoke-virtual {v12, v9, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_11

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_c

    move v1, v7

    move-object v7, v4

    goto :goto_8

    :cond_c
    move v1, v7

    move-object v7, v3

    :goto_8
    const/4 v3, 0x0

    if-eqz v1, :cond_d

    move-object v15, v3

    goto :goto_9

    :cond_d
    move-object v15, v0

    :goto_9
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_e

    move-object/from16 v16, v3

    goto :goto_a

    :cond_e
    move-object/from16 v16, p3

    :goto_a
    invoke-virtual {v2}, Leu2/p;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v12, v10}, Lm91/c;->b(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v1

    if-eqz v15, :cond_f

    invoke-virtual {v2}, Leu2/p;->a()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {v4, v15}, Lj31/a;->a(Landroidx/compose/ui/Modifier;Lj31/m;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    :cond_f
    move v9, v8

    invoke-virtual {v2}, Leu2/p;->f()Z

    move-result v8

    if-eqz v15, :cond_10

    invoke-virtual {v2}, Leu2/p;->a()Z

    move-result v0

    if-eqz v0, :cond_10

    move v10, v11

    :cond_10
    new-instance v0, Lat2/r;

    const/16 v5, 0x8

    move-object v3, v2

    move-object/from16 v2, p4

    invoke-direct/range {v0 .. v5}, Lat2/r;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x55288722

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    and-int/lit8 v0, v9, 0xe

    or-int/lit16 v13, v0, 0x6000

    const/4 v14, 0x0

    move v9, v10

    move-object v10, v4

    invoke-static/range {v7 .. v14}, Lo11/s;->e(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v7

    move-object v3, v15

    move-object/from16 v4, v16

    goto :goto_b

    :cond_11
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object v1, v3

    move-object v3, v0

    :goto_b
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, La01/f;

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, La01/f;-><init>(Landroidx/compose/ui/Modifier;Leu2/p;Lj31/k;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final g(Ljava/util/List;Lkotlin/jvm/functions/Function1;Leu2/p;Landroidx/compose/ui/Modifier;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 19

    move-object/from16 v0, p4

    const-string v1, "$this$WorkoutGroupWrapper"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p6, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p6, v1

    move v10, v1

    goto :goto_1

    :cond_1
    move/from16 v10, p6

    :goto_1
    and-int/lit8 v1, v10, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    and-int/lit8 v2, v10, 0x1

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object/from16 v1, p0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move v15, v3

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v18, v15, 0x1

    if-ltz v15, :cond_3

    move-object v13, v1

    check-cast v13, Lm91/a;

    invoke-virtual {v13}, Lm91/a;->e()Ld0/q0;

    move-result-object v1

    sget-object v3, Lc0/c1;->a:Lc0/d1;

    new-instance v12, Lat2/t;

    move-object/from16 v14, p1

    move-object/from16 v16, p2

    move-object/from16 v17, p3

    invoke-direct/range {v12 .. v17}, Lat2/t;-><init>(Lm91/a;Lkotlin/jvm/functions/Function1;ILeu2/p;Landroidx/compose/ui/Modifier;)V

    const v2, -0x18dee8e2

    invoke-static {v2, v7, v12}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    and-int/lit8 v2, v10, 0xe

    const/high16 v4, 0x180000

    or-int v8, v2, v4

    const/16 v9, 0x1a

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/b;->d(Ll0/y;Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, p4

    move/from16 v15, v18

    goto :goto_3

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_4
    invoke-virtual {v7}, Lp1/q;->X()V

    :cond_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lm91/a;Lkotlin/jvm/functions/Function1;ILeu2/p;Landroidx/compose/ui/Modifier;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p7, "$this$AnimatedVisibility"

    invoke-static {p5, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/a;->d()Lm91/u;

    move-result-object p0

    check-cast p0, Lo11/m$b;

    move-object p5, p3

    new-instance p3, Ll;

    const/16 p7, 0x14

    invoke-direct {p3, p7, p5, p4}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p5, p6

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {p5, p2}, Lp1/q;->e(I)Z

    move-result p6

    or-int/2addr p4, p6

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p6

    if-nez p4, :cond_0

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne p6, p4, :cond_1

    :cond_0
    new-instance p6, Ld21/d;

    const/4 p4, 0x2

    invoke-direct {p6, p1, p2, p4}, Ld21/d;-><init>(Lkotlin/jvm/functions/Function1;II)V

    invoke-virtual {p5, p6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object p4, p6

    check-cast p4, Lkotlin/jvm/functions/Function1;

    sget p6, Lo11/m$b;->y:I

    const/4 p7, 0x2

    const/4 p2, 0x0

    move-object p1, p0

    invoke-static/range {p1 .. p7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Leu2/p;Landroidx/compose/ui/Modifier;Lo11/m$b;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string p4, "it"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const p2, 0x5fe361d1

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Leu2/p;->f()Z

    move-result p2

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz p2, :cond_0

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float p2, v1

    const/16 p4, 0x8

    int-to-float p4, p4

    mul-float v2, p2, p4

    const/4 v4, 0x0

    const/16 v5, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :cond_0
    invoke-virtual {p0}, Leu2/p;->f()Z

    move-result p0

    if-nez p0, :cond_1

    invoke-interface {v0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :cond_1
    const/4 p0, 0x0

    invoke-virtual {p3, p0}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "viewEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lr41/b;

    if-eqz v0, :cond_0

    new-instance v0, Leu2/l;

    check-cast p2, Lr41/b;

    invoke-virtual {p2}, Lr41/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lr41/b;->b()I

    move-result p2

    invoke-direct {v0, v1, p1, p2}, Leu2/l;-><init>(Ljava/lang/String;II)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lr41/d;

    if-eqz v0, :cond_1

    new-instance v0, Leu2/m;

    check-cast p2, Lr41/d;

    invoke-virtual {p2}, Lr41/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lr41/d;->b()I

    move-result p2

    invoke-direct {v0, v1, p1, p2}, Leu2/m;-><init>(Ljava/lang/String;II)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lr41/e;

    if-eqz v0, :cond_2

    new-instance v0, Leu2/n;

    check-cast p2, Lr41/e;

    invoke-virtual {p2}, Lr41/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lr41/e;->b()I

    move-result p2

    invoke-direct {v0, v1, p1, p2}, Leu2/n;-><init>(Ljava/lang/String;II)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    instance-of v0, p2, Lr41/a;

    if-eqz v0, :cond_3

    new-instance v0, Leu2/k;

    check-cast p2, Lr41/a;

    invoke-virtual {p2}, Lr41/a;->a()I

    move-result p2

    invoke-direct {v0, p1, p2}, Leu2/k;-><init>(II)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Leu2/p;Lj31/k;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Leu2/o;->f(Landroidx/compose/ui/Modifier;Leu2/p;Lj31/k;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
