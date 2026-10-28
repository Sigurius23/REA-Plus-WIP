.class public abstract Lno0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Llo0/b;",
        "viewState",
        "Lkotlin/Function1;",
        "Llo0/z;",
        "Ll83/a0;",
        "onEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "c",
        "(Llo0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "clinician-in-the-loop_release"
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
.method public static synthetic a(Ljava/lang/Object;Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p2, p1, p0}, Lno0/e;->d(Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llo0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lno0/e;->e(Llo0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Llo0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo0/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p0

    move-object/from16 v6, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x2844416b

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v2, v1, 0x30

    const/16 v3, 0x10

    const/16 v4, 0x20

    if-nez v2, :cond_3

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v4

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v15, 0x0

    if-eq v8, v9, :cond_7

    const/4 v8, 0x1

    goto :goto_5

    :cond_7
    move v8, v15

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v11, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_12

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_8

    move-object v2, v8

    goto :goto_6

    :cond_8
    move-object v2, v7

    :goto_6
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v9, 0xc

    int-to-float v9, v9

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v7, v9}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->a1()J

    move-result-wide v9

    sget-object v12, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v9, v10, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v3, v3

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v11, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    :cond_a
    invoke-static {v10, v11, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v11, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v7, 0x161e373

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Llo0/b;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    move v7, v15

    :goto_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v16, v7, 0x1

    if-ltz v7, :cond_10

    check-cast v9, Lm91/u;

    if-lez v7, :cond_c

    const v7, -0x4c8e1eae

    invoke-static {v11, v7, v8, v3, v11}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    :goto_9
    move-object v7, v8

    goto :goto_a

    :cond_c
    const v7, -0x4c8d0ca5

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_a
    invoke-static {}, Lmo0/b;->y()Lm91/p;

    move-result-object v8

    and-int/lit8 v10, v0, 0x70

    if-ne v10, v4, :cond_d

    const/4 v10, 0x1

    goto :goto_b

    :cond_d
    move v10, v15

    :goto_b
    invoke-virtual {v11, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_e

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v12, v10, :cond_f

    :cond_e
    new-instance v12, Lno0/d;

    const/4 v10, 0x0

    invoke-direct {v12, v10, v6, v9}, Lno0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v10, v12

    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v12, Lm91/p;->b:I

    shl-int/lit8 v12, v12, 0x3

    const/4 v13, 0x4

    move-object/from16 v17, v7

    move-object v7, v9

    const/4 v9, 0x0

    invoke-static/range {v7 .. v13}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move/from16 v7, v16

    move-object/from16 v8, v17

    goto :goto_8

    :cond_10
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_11
    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object v4, v2

    goto :goto_c

    :cond_12
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v4, v7

    :goto_c
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lm31/h;

    const/16 v3, 0xc

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llo0/z$e;

    invoke-direct {v0, p2, p1}, Llo0/z$e;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Llo0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lno0/e;->c(Llo0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
