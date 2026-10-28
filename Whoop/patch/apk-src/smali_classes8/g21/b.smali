.class public abstract Lg21/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aS\u0010\u000b\u001a\u00020\t2\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "",
        "icons",
        "initialSelectedIndex",
        "",
        "enabled",
        "Ll0/i;",
        "horizontalArrangement",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "selectedIconIndex",
        "d",
        "(Ljava/util/List;Ljava/lang/Integer;ZLl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "index",
        "Li2/x;",
        "h",
        "(ILandroidx/compose/runtime/Composer;I)J",
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
.method public static synthetic a(Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lg21/b;->e(Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;IZ)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lg21/b;->f(Lkotlin/jvm/functions/Function1;IZ)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;Ljava/lang/Integer;ZLl0/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lg21/b;->g(Ljava/util/List;Ljava/lang/Integer;ZLl0/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/util/List;Ljava/lang/Integer;ZLl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            "Z",
            "Ll0/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "selectedIconIndex"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p5

    check-cast v13, Lp1/q;

    const v0, 0x4546c8df

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p7, 0x1

    if-nez v0, :cond_0

    move-object/from16 v0, p0

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_0
    move-object/from16 v0, p0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_2
    move-object/from16 v0, p0

    move v2, v6

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :goto_3
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_6

    move/from16 v8, p2

    invoke-virtual {v13, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :goto_5
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v2, v2, 0xc00

    :cond_9
    move-object/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-virtual {v13, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v2, v11

    :goto_7
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_d

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/16 v11, 0x4000

    goto :goto_8

    :cond_c
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v2, v11

    :cond_d
    and-int/lit16 v11, v2, 0x2493

    const/16 v12, 0x2492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v11, v12, :cond_e

    move v11, v15

    goto :goto_9

    :cond_e
    move v11, v14

    :goto_9
    and-int/lit8 v12, v2, 0x1

    invoke-virtual {v13, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_19

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v11, v6, 0x1

    if-eqz v11, :cond_11

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_f

    goto :goto_a

    :cond_f
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_10

    and-int/lit8 v2, v2, -0xf

    :cond_10
    move v1, v8

    move-object v8, v4

    goto :goto_c

    :cond_11
    :goto_a
    and-int/lit8 v11, p7, 0x1

    if-eqz v11, :cond_12

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/a;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v11, v0}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    and-int/lit8 v2, v2, -0xf

    :cond_12
    if-eqz v3, :cond_13

    const/4 v3, 0x0

    goto :goto_b

    :cond_13
    move-object v3, v4

    :goto_b
    if-eqz v7, :cond_14

    move v8, v15

    :cond_14
    if-eqz v9, :cond_15

    int-to-float v4, v15

    int-to-float v1, v1

    mul-float/2addr v4, v1

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    move-object v10, v1

    :cond_15
    move v1, v8

    move-object v8, v3

    :goto_c
    invoke-virtual {v13}, Lp1/q;->r()V

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_16

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_16
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_d
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v13, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_17

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_18

    :cond_17
    invoke-static {v4, v13, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    new-instance v3, Lg21/a;

    invoke-direct {v3, v0, v1, v5}, Lg21/a;-><init>(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V

    const v4, 0x6c1b4619

    invoke-static {v4, v13, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    and-int/lit8 v3, v2, 0x70

    const/high16 v4, 0x30000

    or-int/2addr v3, v4

    and-int/lit16 v2, v2, 0x1c00

    or-int v14, v3, v2

    move v2, v15

    const/16 v15, 0x14

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v15}, Lf31/c;->e(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ll0/i;Lb2/g;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move v3, v1

    move-object v2, v8

    move-object v4, v10

    move-object v1, v0

    goto :goto_e

    :cond_19
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v2, v4

    move v3, v8

    move-object v1, v0

    move-object v4, v10

    :goto_e
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1a

    new-instance v0, Lbf0/g;

    const/16 v8, 0x9

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final e(Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 18

    move-object/from16 v0, p2

    move/from16 v1, p4

    move-object/from16 v2, p5

    move/from16 v3, p7

    const-string v4, "$this$RadioGroup"

    move-object/from16 v5, p3

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "state"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v3, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_1

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit16 v3, v3, 0x180

    if-nez v3, :cond_3

    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x100

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v4, v3

    :cond_3
    and-int/lit16 v3, v4, 0x491

    const/16 v6, 0x490

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v3, v6, :cond_4

    move v3, v8

    goto :goto_3

    :cond_4
    move v3, v7

    :goto_3
    and-int/lit8 v6, v4, 0x1

    move-object/from16 v15, p6

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    new-instance v9, Ly71/g;

    move-object/from16 v3, p0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/4 v6, 0x2

    const/4 v10, 0x0

    invoke-direct {v9, v3, v10, v6, v10}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    shr-int/lit8 v3, v4, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v15, v3}, Lg21/b;->h(ILandroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-virtual {v2}, Lf31/a;->c()Z

    move-result v13

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v3, v4, 0x70

    if-ne v3, v5, :cond_5

    move v7, v8

    :cond_5
    or-int/2addr v2, v7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_7

    :cond_6
    new-instance v3, Ld21/d;

    const/4 v2, 0x5

    invoke-direct {v3, v0, v1, v2}, Ld21/d;-><init>(Lkotlin/jvm/functions/Function1;II)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v14, v3

    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v12, p1

    invoke-static/range {v9 .. v17}, Lny0/s;->c(Ly71/g;JZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_8
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;IZ)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ljava/util/List;Ljava/lang/Integer;ZLl0/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lg21/b;->d(Ljava/util/List;Ljava/lang/Integer;ZLl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(ILandroidx/compose/runtime/Composer;I)J
    .locals 2

    const/4 p2, 0x0

    const/4 v0, 0x6

    if-eqz p0, :cond_0

    check-cast p1, Lp1/q;

    const p0, -0xbb71098

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/b;->a:Lx81/b;

    invoke-virtual {p0, p1, v0}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object p0

    invoke-virtual {p0}, Ly81/a;->c()J

    move-result-wide v0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    check-cast p1, Lp1/q;

    const p0, -0xbb65ad5

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/b;->a:Lx81/b;

    invoke-virtual {p0, p1, v0}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object p0

    invoke-virtual {p0}, Ly81/a;->d()J

    move-result-wide v0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    :goto_0
    return-wide v0
.end method
