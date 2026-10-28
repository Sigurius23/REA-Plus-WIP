.class public abstract Lgf1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a=\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a?\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\u001aE\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a?\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a\u00b2\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lef1/c$b;",
        "viewState",
        "",
        "exercisePath",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "s",
        "(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "n",
        "Lef1/c$c;",
        "currentTimeSegmentState",
        "",
        "selectedIndex",
        "D",
        "(Lef1/c$b;Lef1/c$c;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lo51/e;",
        "noDataGraphState",
        "z",
        "(Lef1/c$c;Lo51/e;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "modifiedState",
        "",
        "isScrubbing",
        "exercise-progress-mini-arch_release"
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
.method private static final A(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x7b75bdab

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const-string p2, "ExerciseProgressGraph"

    invoke-static {p0, p2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lef1/a$d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1, p2}, Lef1/a$d;-><init>(ILjava/lang/Object;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lef1/c$c;Lo51/e;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lgf1/g;->z(Lef1/c$c;Lo51/e;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lef1/c$b;Lef1/c$c;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lef1/c$b;",
            "Lef1/c$c;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v9, p6

    sget-object v0, Lb2/e;->w:Lb2/m;

    sget-object v4, Lb2/e;->J:Lb2/l;

    move-object/from16 v15, p5

    check-cast v15, Lp1/q;

    const v5, -0x160460f

    invoke-virtual {v15, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v9, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v9

    goto :goto_1

    :cond_1
    move v5, v9

    :goto_1
    and-int/lit8 v8, v9, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_3
    and-int/lit16 v8, v9, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    :cond_5
    and-int/lit16 v8, v9, 0xc00

    move-object/from16 v12, p3

    if-nez v8, :cond_7

    invoke-virtual {v15, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v5, v8

    :cond_7
    and-int/lit16 v8, v9, 0x6000

    if-nez v8, :cond_9

    move-object/from16 v8, p4

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/16 v14, 0x4000

    goto :goto_5

    :cond_8
    const/16 v14, 0x2000

    :goto_5
    or-int/2addr v5, v14

    :goto_6
    move v14, v5

    goto :goto_7

    :cond_9
    move-object/from16 v8, p4

    goto :goto_6

    :goto_7
    and-int/lit16 v5, v14, 0x2493

    const/16 v11, 0x2492

    const/4 v8, 0x0

    if-eq v5, v11, :cond_a

    const/4 v5, 0x1

    goto :goto_8

    :cond_a
    move v5, v8

    :goto_8
    and-int/lit8 v11, v14, 0x1

    invoke-virtual {v15, v11, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_2c

    invoke-static {}, Lgf1/b;->c()Lp1/t1;

    move-result-object v5

    invoke-virtual {v15, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lgf1/a;

    invoke-virtual {v2}, Lef1/c$c;->f()Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lv41/m;

    if-eqz v11, :cond_b

    invoke-virtual {v11}, Lv41/m;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    goto :goto_9

    :cond_b
    const/4 v11, 0x0

    :goto_9
    if-nez v11, :cond_c

    const v11, -0x227313c8

    invoke-virtual {v15, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    goto :goto_a

    :cond_c
    const v10, -0x227313c7

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v11, v15, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    :goto_a
    if-nez v10, :cond_d

    const-string v10, ""

    :cond_d
    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v11, 0x36

    invoke-static {v6, v4, v15, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v11, v15, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v15, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v24, La3/l;->a:La3/k;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v3, v15, Lp1/q;->S:Z

    if-eqz v3, :cond_e

    invoke-virtual {v15, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_e
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_b
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v15, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v15, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v25, v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    goto :goto_c

    :cond_f
    move-object/from16 v25, v10

    :goto_c
    invoke-static {v11, v15, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v15, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-static {v10, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    const/4 v1, 0x0

    invoke-static {v11, v13, v15, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v1, v15, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_11

    invoke-virtual {v15, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_11
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v15, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :cond_12
    invoke-static {v1, v15, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v15, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x108d2785

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lef1/c$c;->f()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv41/m;

    new-instance v3, Lv41/i;

    invoke-direct {v3}, Lv41/i;-><init>()V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v9, :cond_14

    new-instance v6, Lg40/y1;

    const/16 v8, 0x19

    invoke-direct {v6, v8}, Lg40/y1;-><init>(I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget v8, Lv41/m;->k:I

    or-int/lit8 v8, v8, 0x30

    sget v9, Lv41/i;->a:I

    shl-int/lit8 v9, v9, 0x6

    or-int/2addr v8, v9

    invoke-virtual {v3, v2, v6, v15, v8}, Lv41/i;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_e

    :cond_15
    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v10, v2

    const-wide/16 v12, 0x0

    cmpl-double v3, v10, v12

    if-lez v3, :cond_16

    goto :goto_f

    :cond_16
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v3, v2, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    new-instance v2, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v2, v4}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {v3, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->O:Lb2/k;

    const/16 v6, 0x36

    invoke-static {v3, v4, v15, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v15, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-eqz v10, :cond_17

    invoke-virtual {v15, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_17
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_10
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v15, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v15, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-nez v11, :cond_18

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_19

    :cond_18
    invoke-static {v4, v15, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v15, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0x2a

    int-to-float v2, v2

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v2, v11

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v12, 0x0

    invoke-static {v0, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object v12, v2

    iget-wide v1, v15, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v15, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 v20, v7

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-eqz v7, :cond_1a

    invoke-virtual {v15, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1a
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v15, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_1b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    :cond_1b
    invoke-static {v1, v15, v1, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v15, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lef1/c$b;->d()Lo51/f;

    move-result-object v4

    const v1, 0xe000

    if-nez v4, :cond_1d

    const v2, 0x69636d76

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v15, v12}, Lp1/q;->q(Z)V

    move/from16 p5, v1

    move v6, v11

    move v1, v12

    move v3, v14

    move-object/from16 v7, v20

    move-object/from16 v4, v25

    const/4 v2, 0x1

    const/16 v8, 0x100

    goto/16 :goto_18

    :cond_1d
    const/4 v12, 0x0

    const v2, 0x69636d77

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lo51/f;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v6, Lsz0/u0;

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct {v6, v3, v8, v7, v8}, Lsz0/u0;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_1e
    if-eqz p2, :cond_1f

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_13

    :cond_1f
    invoke-virtual {v4}, Lo51/f;->b()I

    move-result v2

    :goto_13
    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit16 v6, v14, 0x380

    const/16 v13, 0x100

    if-ne v6, v13, :cond_20

    const/4 v6, 0x1

    goto :goto_14

    :cond_20
    move v6, v12

    :goto_14
    or-int/2addr v3, v6

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    and-int v6, v14, v1

    const/16 v7, 0x4000

    if-ne v6, v7, :cond_21

    const/4 v6, 0x1

    goto :goto_15

    :cond_21
    move v6, v12

    :goto_15
    or-int/2addr v3, v6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_23

    if-ne v6, v9, :cond_22

    goto :goto_16

    :cond_22
    move/from16 v16, v7

    move/from16 v24, v12

    goto :goto_17

    :cond_23
    :goto_16
    new-instance v3, Lam2/s;

    const/16 v8, 0x15

    move-object v6, v5

    move/from16 v16, v7

    move/from16 v24, v12

    move-object/from16 v5, p2

    move-object/from16 v7, p4

    invoke-direct/range {v3 .. v8}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    move-object v5, v6

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v3

    :goto_17
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move/from16 v7, v16

    const/16 v16, 0x0

    const/16 v17, 0xc

    const/4 v12, 0x0

    move v3, v13

    const/4 v13, 0x0

    move/from16 p5, v1

    move v8, v3

    move v3, v14

    move-object/from16 v7, v20

    move/from16 v1, v24

    move-object/from16 v4, v25

    move-object v14, v6

    move v6, v11

    move v11, v2

    const/4 v2, 0x1

    invoke-static/range {v10 .. v17}, Lsz0/x0;->e(Ljava/util/List;ILandroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    mul-float v11, v6, v6

    invoke-static {v11, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v15, v10}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v10, 0x34

    int-to-float v10, v10

    mul-float/2addr v10, v6

    invoke-static {v10, v7}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v0, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v15, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_24

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_24
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_19
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v15, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v15, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-nez v10, :cond_25

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_26

    :cond_25
    invoke-static {v7, v15, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v15, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lef1/c$c;->c()Li11/f;

    move-result-object v0

    invoke-virtual {v0}, Li11/f;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lef1/c$c;->c()Li11/f;

    move-result-object v0

    invoke-virtual {v0}, Li11/f;->e()Z

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lef1/c$c;->c()Li11/f;

    move-result-object v0

    invoke-virtual {v0}, Li11/f;->h()Z

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lef1/c$c;->c()Li11/f;

    move-result-object v0

    invoke-virtual {v0}, Li11/f;->f()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lef1/c$c;->c()Li11/f;

    move-result-object v0

    invoke-virtual {v0}, Li11/f;->i()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, p1

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 v7, p0

    invoke-virtual {v15, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v6, v11

    and-int/lit16 v11, v3, 0x380

    if-ne v11, v8, :cond_27

    move v12, v2

    goto :goto_1a

    :cond_27
    move v12, v1

    :goto_1a
    or-int/2addr v6, v12

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    and-int v8, v3, p5

    const/16 v11, 0x4000

    if-ne v8, v11, :cond_28

    move v12, v2

    goto :goto_1b

    :cond_28
    move v12, v1

    :goto_1b
    or-int/2addr v6, v12

    and-int/lit16 v3, v3, 0x1c00

    const/16 v8, 0x800

    if-ne v3, v8, :cond_29

    move v12, v2

    goto :goto_1c

    :cond_29
    move v12, v1

    :goto_1c
    or-int v1, v6, v12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_2b

    if-ne v3, v9, :cond_2a

    goto :goto_1d

    :cond_2a
    move v9, v2

    goto :goto_1e

    :cond_2b
    :goto_1d
    new-instance v0, Lbm2/a0;

    const/4 v8, 0x6

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p4

    move v9, v2

    move-object v2, v7

    move-object/from16 v7, p3

    invoke-direct/range {v0 .. v8}, Lbm2/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :goto_1e
    move-object/from16 v22, v3

    check-cast v22, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v24, v0, 0x9

    const/16 v25, 0x0

    const/16 v26, 0xf07

    move-object/from16 v23, v15

    move v15, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v10 .. v26}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v23

    invoke-static {v15, v9, v9, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_1f

    :cond_2c
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_1f
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2d

    new-instance v0, Laq1/c;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Laq1/c;-><init>(Lef1/c$b;Lef1/c$c;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2d
    return-void
.end method

.method private static final E(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lo51/f;Ljava/lang/Integer;Lgf1/a;Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 1

    sget-object v0, Laf1/a;->a:Laf1/a;

    invoke-virtual {p2}, Lgf1/a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p0, p1, p4, p2}, Laf1/a;->d(Lo51/f;Ljava/lang/Integer;ILjava/lang/String;)Lef1/a$a$a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance p0, Lef1/a$c;

    invoke-direct {p0, p4}, Lef1/a$c;-><init>(I)V

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lef1/c$c;Lef1/c$b;Ljava/lang/Integer;Ljava/lang/String;Lgf1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;
    .locals 8

    const-string v0, "date"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Laf1/a;->a:Laf1/a;

    invoke-virtual {p0}, Lef1/c$c;->c()Li11/f;

    move-result-object v2

    invoke-virtual {p1}, Lef1/c$b;->d()Lo51/f;

    move-result-object v3

    invoke-virtual {p4}, Lgf1/a;->b()Ljava/lang/String;

    move-result-object v7

    move-object v4, p2

    move-object v6, p3

    move-object v5, p7

    invoke-virtual/range {v1 .. v7}, Laf1/a;->a(Li11/f;Lo51/f;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lef1/a$a$b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p5, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    instance-of p0, v5, Ljava/lang/String;

    if-eqz p0, :cond_1

    move-object p7, v5

    check-cast p7, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 p7, 0x0

    :goto_0
    if-eqz p7, :cond_2

    new-instance p0, Lef1/a$b;

    invoke-direct {p0, p6, p7}, Lef1/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p5, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lef1/c$b;Lef1/c$c;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lgf1/g;->D(Lef1/c$b;Lef1/c$c;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic I(Lp1/c1;Lef1/c$b;)V
    .locals 0

    invoke-static {p0, p1}, Lgf1/g;->u(Lp1/c1;Lef1/c$b;)V

    return-void
.end method

.method public static final synthetic J(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lgf1/g;->v(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lef1/c$c;Lef1/c$b;Ljava/lang/Integer;Ljava/lang/String;Lgf1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgf1/g;->G(Lef1/c$c;Lef1/c$b;Ljava/lang/Integer;Ljava/lang/String;Lgf1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lef1/c$c;Lo51/e;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lgf1/g;->C(Lef1/c$c;Lo51/e;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lgf1/g;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgf1/g;->r(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lo51/f;Ljava/lang/Integer;Lgf1/a;Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgf1/g;->F(Lo51/f;Ljava/lang/Integer;Lgf1/a;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgf1/g;->y(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lef1/d;Lef1/c$b;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lgf1/a;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgf1/g;->x(Lef1/d;Lef1/c$b;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lgf1/a;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lef1/c$b;Lef1/c$c;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgf1/g;->H(Lef1/c$b;Lef1/c$c;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgf1/g;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lgf1/g;->B(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lgf1/g;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lgf1/g;->A(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgf1/g;->E(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lef1/c$b;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v3, p2

    move/from16 v7, p5

    const-string v1, "viewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "exercisePath"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v1, 0x7f5ca3cc

    invoke-virtual {v11, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v7, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v4, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_3

    :cond_5
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_6
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_8

    or-int/lit16 v4, v4, 0xc00

    :cond_7
    move-object/from16 v6, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v6, v7, 0xc00

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_4

    :cond_9
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v4, v8

    :goto_5
    and-int/lit16 v8, v4, 0x493

    const/16 v9, 0x492

    const/4 v15, 0x0

    if-eq v8, v9, :cond_a

    const/4 v8, 0x1

    goto :goto_6

    :cond_a
    move v8, v15

    :goto_6
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v11, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1f

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_b

    move-object v9, v8

    goto :goto_7

    :cond_b
    move-object v9, v2

    :goto_7
    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_c

    new-instance v1, Lg40/y1;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lg40/y1;-><init>(I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v13, v1

    goto :goto_8

    :cond_d
    move-object v13, v6

    :goto_8
    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_e

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v11, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-nez v15, :cond_f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    invoke-static {v2, v11, v2, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lef1/c$b;->e()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_12

    invoke-virtual/range {p1 .. p1}, Lef1/c$b;->d()Lo51/f;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lo51/f;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_a

    :cond_11
    const/4 v2, 0x0

    :cond_12
    :goto_a
    invoke-virtual/range {p1 .. p1}, Lef1/c$b;->f()Ljava/util/Map;

    move-result-object v6

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v15

    goto :goto_b

    :cond_13
    const/4 v15, 0x0

    :goto_b
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v6, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lef1/c$c;

    if-nez v6, :cond_14

    const v0, -0x7c908e84

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move-object v1, v9

    move-object v6, v13

    const/4 v0, 0x1

    goto/16 :goto_10

    :cond_14
    const v15, -0x7c908e83

    invoke-virtual {v11, v15}, Lp1/q;->e0(I)V

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    move-object/from16 p0, v2

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    move-object/from16 p3, v6

    const/4 v6, 0x0

    invoke-static {v2, v3, v11, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_15

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v11, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_16
    invoke-static {v3, v11, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v11, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit16 v7, v4, 0x1c00

    const/16 v0, 0x800

    if-ne v7, v0, :cond_18

    const/4 v0, 0x1

    goto :goto_d

    :cond_18
    const/4 v0, 0x0

    :goto_d
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_19

    if-ne v1, v12, :cond_1a

    :cond_19
    new-instance v1, Lge0/c;

    const/4 v0, 0x4

    invoke-direct {v1, v13, v0}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v1, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v4, 0x3

    and-int/lit8 v0, v0, 0xe

    const/4 v14, 0x3

    shl-int/lit8 v2, v4, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int v6, v0, v2

    move-object/from16 v2, p0

    move-object/from16 v0, p1

    move-object/from16 v3, p2

    move-object v4, v1

    move-object v5, v11

    move-object/from16 v1, p3

    invoke-static/range {v0 .. v6}, Lgf1/g;->D(Lef1/c$b;Lef1/c$c;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v10, v2

    int-to-float v0, v14

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v0, v2

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v0, v9

    invoke-virtual/range {p1 .. p1}, Lef1/c$b;->c()Lo51/e;

    move-result-object v9

    sget v3, Lo51/e;->d:I

    shl-int/2addr v3, v14

    or-int/2addr v3, v7

    move-object v4, v12

    move-object v12, v11

    move-object v11, v13

    move v13, v3

    move-object v3, v8

    move-object v8, v1

    move-object v1, v0

    const/4 v0, 0x1

    invoke-static/range {v8 .. v13}, Lgf1/g;->z(Lef1/c$c;Lo51/e;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v6, v11

    move-object v11, v12

    invoke-virtual {v8}, Lef1/c$c;->g()Ls01/d;

    move-result-object v9

    if-nez v9, :cond_1b

    const v2, 0x68c07b15

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1b
    const v5, 0x68c07b16

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    int-to-float v5, v0

    mul-float/2addr v5, v2

    const/4 v2, 0x0

    invoke-static {v3, v2, v5, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v2, 0x800

    if-ne v7, v2, :cond_1c

    move v10, v0

    goto :goto_e

    :cond_1c
    const/4 v10, 0x0

    :goto_e
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v10, :cond_1d

    if-ne v2, v4, :cond_1e

    :cond_1d
    new-instance v2, Lge0/c;

    const/4 v3, 0x5

    invoke-direct {v2, v6, v3}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v2, Ls01/d;->h:I

    shl-int/2addr v2, v14

    or-int/lit8 v12, v2, 0x6

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Ls01/f;->k(Landroidx/compose/ui/Modifier;Ls01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v15, 0x0

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_11
    move-object v4, v6

    goto :goto_12

    :cond_1f
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v1, v2

    goto :goto_11

    :goto_12
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_20

    new-instance v0, Lgf1/d;

    const/4 v7, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lgf1/d;-><init>(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final o(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ls01/d;

    if-eqz v0, :cond_0

    check-cast p1, Ls01/d;

    invoke-virtual {p1}, Ls01/d;->c()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lgf1/g;->n(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lef1/c$b;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v9, p2

    move-object/from16 v4, p3

    move/from16 v10, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exercisePath"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0x31584c91

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v10, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v10

    :goto_1
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_3

    :cond_5
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_6
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_8

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x800

    goto :goto_4

    :cond_7
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v3, v5

    :cond_8
    move v12, v3

    and-int/lit16 v3, v12, 0x493

    const/16 v5, 0x492

    const/4 v7, 0x0

    if-eq v3, v5, :cond_9

    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    move v3, v7

    :goto_5
    and-int/lit8 v5, v12, 0x1

    invoke-virtual {v11, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_16

    if-eqz v0, :cond_a

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v14, v0

    goto :goto_6

    :cond_a
    move-object v14, v1

    :goto_6
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_b

    new-instance v0, Lef1/d;

    invoke-direct {v0}, Lef1/d;-><init>()V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Lef1/d;

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v11, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-static {}, Lgf1/b;->c()Lp1/t1;

    move-result-object v5

    invoke-virtual {v11, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lgf1/a;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    const/4 v15, 0x0

    if-ne v8, v1, :cond_c

    invoke-static {v15}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v1, :cond_d

    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v13, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_e

    new-instance v6, Lgf1/g$a;

    invoke-direct {v6, v13, v8, v15}, Lgf1/g$a;-><init>(Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v6, Lc93/m;

    invoke-static {v11, v6, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v15, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 p0, v8

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v16, v0

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-eqz v4, :cond_f

    invoke-virtual {v11, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v11, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v11, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    :cond_10
    invoke-static {v7, v11, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lgf1/g;->t(Lp1/c1;)Lef1/c$b;

    move-result-object v0

    if-nez v0, :cond_12

    move-object v15, v2

    goto :goto_8

    :cond_12
    move-object v15, v0

    :goto_8
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    and-int/lit16 v4, v12, 0x1c00

    const/16 v6, 0x800

    if-ne v4, v6, :cond_13

    const/4 v7, 0x1

    goto :goto_9

    :cond_13
    const/4 v7, 0x0

    :goto_9
    or-int/2addr v0, v7

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_14

    if-ne v4, v1, :cond_15

    :cond_14
    new-instance v0, Lbm2/a0;

    const/4 v8, 0x5

    move-object/from16 v6, p0

    move-object/from16 v4, p3

    move-object v7, v13

    move-object/from16 v1, v16

    invoke-direct/range {v0 .. v8}, Lbm2/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :cond_15
    move-object v3, v4

    check-cast v3, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v5, v12, 0x380

    const/4 v6, 0x1

    const/4 v0, 0x0

    move-object v2, v9

    move-object v4, v11

    move-object v1, v15

    invoke-static/range {v0 .. v6}, Lgf1/g;->n(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    move-object v1, v14

    goto :goto_a

    :cond_16
    move-object v4, v11

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lgf1/d;

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    move v5, v10

    invoke-direct/range {v0 .. v7}, Lgf1/d;-><init>(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final t(Lp1/c1;)Lef1/c$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lef1/c$b;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lef1/c$b;

    return-object p0
.end method

.method private static final u(Lp1/c1;Lef1/c$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lef1/c$b;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final v(Lp1/c1;)Z
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

.method private static final w(Lp1/c1;Z)V
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

.method private static final x(Lef1/d;Lef1/c$b;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lgf1/a;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 8

    const-string v0, "it"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p7, Lef1/a$d;

    if-eqz v0, :cond_3

    move-object v0, p7

    check-cast v0, Lef1/a$d;

    invoke-static {p5}, Lgf1/g;->t(Lp1/c1;)Lef1/c$b;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lef1/d;->a(Lef1/a$d;Lef1/c$b;Lef1/c$b;)Lef1/f;

    move-result-object p0

    invoke-virtual {v0}, Lef1/a$d;->a()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ld61/a;

    if-eqz v2, :cond_0

    check-cast v1, Ld61/a;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz p0, :cond_2

    instance-of p7, v1, Ld61/a$c;

    if-eqz p7, :cond_1

    invoke-static {v1}, Lef1/e;->a(Ld61/a;)Z

    move-result p7

    if-eqz p7, :cond_1

    invoke-static {v1, p2}, Laf1/d;->a(Ld61/a;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    sget-object v2, Laf1/a;->a:Laf1/a;

    invoke-virtual {v0}, Lef1/a$d;->b()I

    move-result v3

    invoke-virtual {p1}, Lef1/c$b;->d()Lo51/f;

    move-result-object v4

    invoke-virtual {p4}, Lgf1/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p4}, Lgf1/a;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v2 .. v7}, Laf1/a;->b(ILo51/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef1/a$a$c;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0}, Lef1/f;->b()Z

    move-result p1

    invoke-static {p6, p1}, Lgf1/g;->w(Lp1/c1;Z)V

    invoke-virtual {p0}, Lef1/f;->a()Lef1/c$b;

    move-result-object p0

    invoke-static {p5, p0}, Lgf1/g;->u(Lp1/c1;Lef1/c$b;)V

    goto :goto_1

    :cond_2
    invoke-interface {p3, p7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-interface {p3, p7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lgf1/g;->s(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lef1/c$c;Lo51/e;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lef1/c$c;",
            "Lo51/e;",
            "Ljava/lang/Integer;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x343bd7e1

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    move v6, v1

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_4

    and-int/lit8 v7, v5, 0x40

    if-nez v7, :cond_2

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_2
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v5, 0xc00

    const/16 v14, 0x800

    if-nez v7, :cond_8

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v14

    goto :goto_5

    :cond_7
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v6, v7

    :cond_8
    move v15, v6

    and-int/lit16 v6, v15, 0x493

    const/16 v7, 0x492

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_9

    move v6, v8

    goto :goto_6

    :cond_9
    move v6, v9

    :goto_6
    and-int/lit8 v7, v15, 0x1

    invoke-virtual {v10, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-virtual {v0}, Lef1/c$c;->d()Lm91/u;

    move-result-object v6

    invoke-virtual {v0}, Lef1/c$c;->e()Ljava/util/List;

    move-result-object v7

    instance-of v11, v6, Lj71/c;

    if-eqz v11, :cond_a

    move-object v11, v6

    check-cast v11, Lj71/c;

    goto :goto_7

    :cond_a
    const/4 v11, 0x0

    :goto_7
    if-eqz v11, :cond_e

    invoke-virtual {v11}, Lj71/c;->f()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_e

    check-cast v11, Ljava/lang/Iterable;

    instance-of v12, v11, Ljava/util/Collection;

    if-eqz v12, :cond_c

    move-object v12, v11

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_c

    :cond_b
    move v11, v8

    goto :goto_8

    :cond_c
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lj71/b;

    instance-of v12, v12, Lj71/b$d;

    if-nez v12, :cond_d

    :cond_e
    move v11, v9

    :goto_8
    if-eqz v6, :cond_f

    if-eqz v11, :cond_10

    :cond_f
    if-eqz v2, :cond_10

    move v11, v8

    goto :goto_9

    :cond_10
    move v11, v9

    :goto_9
    if-eqz v11, :cond_11

    const v1, -0x7ff12dae

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget v1, Lo51/e;->d:I

    invoke-static {v2, v10, v1}, Lo51/c;->s(Lo51/e;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_11

    :cond_11
    const v11, -0x7fefdd48

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    move-object v11, v7

    check-cast v11, Ljava/util/Collection;

    if-eqz v11, :cond_13

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_12

    goto :goto_a

    :cond_12
    move v11, v9

    goto :goto_b

    :cond_13
    :goto_a
    move v11, v8

    :goto_b
    sget-object v16, Lb2/t;->w:Lb2/t;

    if-nez v11, :cond_14

    const v11, -0x7fef8b2e

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    int-to-float v11, v8

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v18, v11, v12

    int-to-float v1, v1

    mul-float v20, v1, v12

    const/16 v21, 0x5

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    move/from16 v17, v9

    move-wide/from16 v22, v11

    move v12, v8

    move-wide/from16 v8, v22

    const/16 v11, 0x30

    move/from16 v18, v12

    const/4 v12, 0x0

    move-object v13, v7

    move-object v7, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v6

    move-object v6, v13

    move/from16 v13, v17

    invoke-static/range {v6 .. v12}, Ln21/c;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_14
    move v13, v9

    move-object/from16 v1, v16

    move-object/from16 v16, v6

    const v6, -0x7fec09ff    # -1.833124E-39f

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_c
    const/high16 v6, 0x3f800000    # 1.0f

    const v7, 0x3faaaaab

    if-eqz v16, :cond_1c

    const v8, -0x7feb3c80

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v13, v7}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_15

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_d
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    :cond_16
    invoke-static {v7, v10, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v8, Lgf1/e;

    const/4 v1, 0x0

    invoke-direct {v8, v1}, Lgf1/e;-><init>(I)V

    and-int/lit16 v1, v15, 0x1c00

    if-ne v1, v14, :cond_18

    const/4 v1, 0x1

    goto :goto_e

    :cond_18
    move v1, v13

    :goto_e
    and-int/lit16 v6, v15, 0x380

    const/16 v7, 0x100

    if-ne v6, v7, :cond_19

    const/4 v6, 0x1

    goto :goto_f

    :cond_19
    move v6, v13

    :goto_f
    or-int/2addr v1, v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_1a

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v6, v1, :cond_1b

    :cond_1a
    new-instance v6, Lgf1/f;

    const/4 v1, 0x0

    invoke-direct {v6, v4, v3, v1}, Lgf1/f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v9, v6

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v7, 0x0

    move-object/from16 v6, v16

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x1

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1c
    const v8, -0x7fe1ac3a

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v13, v7}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v6, 0x6

    invoke-static {v1, v10, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1e

    new-instance v0, Lg90/a;

    const/4 v6, 0x3

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Lg90/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method
