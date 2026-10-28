.class public abstract Lxq2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aA\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lxq2/s;",
        "state",
        "Lm91/p;",
        "itemViewFactory",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lxq2/s;Lm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "user-journey_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lxq2/s;Lm91/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lxq2/r;->e(Landroidx/compose/ui/Modifier;Lxq2/s;Lm91/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/r;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lxq2/s;Lm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lxq2/s;",
            "Lm91/p;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v5, p5

    const-string v1, "state"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v1, 0x819a299

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v5, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_7

    and-int/lit8 v6, p6, 0x4

    if-nez v6, :cond_6

    and-int/lit16 v6, v5, 0x200

    if-nez v6, :cond_5

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_5
    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_3
    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v4, v6

    :cond_7
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v4, v4, 0xc00

    :cond_8
    move-object/from16 v7, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_8

    move-object/from16 v7, p3

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_5

    :cond_a
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v4, v8

    :goto_6
    and-int/lit16 v8, v4, 0x493

    const/16 v9, 0x492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v8, v9, :cond_b

    move v8, v14

    goto :goto_7

    :cond_b
    move v8, v13

    :goto_7
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v8, v5, 0x1

    if-eqz v8, :cond_f

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lp1/q;->X()V

    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_d

    and-int/lit16 v4, v4, -0x381

    :cond_d
    move-object v1, v3

    :cond_e
    move-object v9, v7

    move-object v7, v0

    goto :goto_a

    :cond_f
    :goto_8
    if-eqz v1, :cond_10

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_9

    :cond_10
    move-object v1, v3

    :goto_9
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_11

    invoke-static {}, Lwq2/c;->b()Lm91/p;

    move-result-object v0

    and-int/lit16 v4, v4, -0x381

    :cond_11
    if-eqz v6, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v3, v6, :cond_12

    new-instance v3, Lxl0/b;

    const/4 v6, 0x6

    invoke-direct {v3, v6}, Lxl0/b;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v7, v0

    move-object v9, v3

    :goto_a
    invoke-virtual {v10}, Lp1/q;->r()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v3, 0x3

    int-to-float v6, v3

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v6, v8

    const/4 v8, 0x0

    invoke-static {v0, v8, v6, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Ll0/m;->f:Ll0/h;

    sget-object v8, Lb2/e;->K:Lb2/l;

    const/16 v11, 0x36

    invoke-static {v6, v8, v10, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_13

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_15

    :cond_14
    invoke-static {v8, v10, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x565f1314

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lxq2/s;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm91/u;

    sget v8, Lm91/p;->b:I

    shl-int/2addr v8, v3

    shr-int/lit8 v11, v4, 0x3

    and-int/lit8 v11, v11, 0x70

    or-int/2addr v8, v11

    and-int/lit16 v11, v4, 0x1c00

    or-int/2addr v11, v8

    const/4 v12, 0x4

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_c

    :cond_16
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object v3, v7

    move-object v4, v9

    goto :goto_d

    :cond_17
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v3

    move-object v4, v7

    move-object v3, v0

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Lw71/k;

    const/16 v7, 0x8

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lxq2/s;Lm91/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lxq2/r;->c(Landroidx/compose/ui/Modifier;Lxq2/s;Lm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
