.class public abstract Lm50/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a7\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "key",
        "",
        "centimeters",
        "Lcom/whoop/domain/model/UnitSystem;",
        "unit",
        "Lcom/whoop/whoopaction/domain/models/StateUpdateAction;",
        "q",
        "(Ljava/lang/String;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;",
        "Lm50/d;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lm50/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "selectedUnit",
        "selectedCentimeters",
        "access_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm50/c;->i(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm50/c;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm50/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lm50/c;->j(Lm50/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p3, p0, p2, p4}, Lm50/c;->h(Lm50/d;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lm50/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm50/d;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move/from16 v6, p4

    const-string v0, "viewState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x32d91915

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v7, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v7

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v2, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v6, 0x30

    if-nez v2, :cond_2

    move-object/from16 v2, p1

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, p5, 0x4

    const/16 v15, 0x100

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v15

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/16 v33, 0x0

    if-eq v9, v10, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move/from16 v9, v33

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v12, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_25

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_9

    move-object v10, v9

    goto :goto_7

    :cond_9
    move-object v10, v2

    :goto_7
    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_a

    new-instance v1, Lm01/c;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lm01/c;-><init>(I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v2, v1

    goto :goto_8

    :cond_b
    move-object v2, v5

    :goto_8
    invoke-virtual {v3}, Lm50/d;->e()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v12, v1}, Lp1/q;->e(I)Z

    move-result v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_c

    if-ne v4, v13, :cond_d

    :cond_c
    invoke-virtual {v3}, Lm50/d;->e()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v1, v4

    check-cast v1, Lp1/c1;

    invoke-virtual {v3}, Lm50/d;->c()I

    move-result v4

    invoke-virtual {v12, v4}, Lp1/q;->e(I)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_e

    if-ne v5, v13, :cond_f

    :cond_e
    invoke-virtual {v3}, Lm50/d;->c()I

    move-result v4

    invoke-static {v4, v12}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v5

    :cond_f
    move-object v4, v5

    check-cast v4, Lp1/a1;

    invoke-virtual {v3}, Lm50/d;->j()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3}, Lm50/d;->e()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v14

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    invoke-virtual {v12, v14}, Lp1/q;->e(I)Z

    move-result v14

    or-int/2addr v5, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v5, :cond_10

    if-ne v14, v13, :cond_14

    :cond_10
    invoke-virtual {v3}, Lm50/d;->j()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move/from16 v14, v33

    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_12

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromString(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v11

    invoke-virtual {v3}, Lm50/d;->e()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v8

    if-ne v11, v8, :cond_11

    goto :goto_a

    :cond_11
    add-int/lit8 v14, v14, 0x1

    goto :goto_9

    :cond_12
    const/4 v14, -0x1

    :goto_a
    if-gez v14, :cond_13

    move/from16 v14, v33

    :cond_13
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v5, v11

    and-int/lit16 v11, v0, 0x380

    if-ne v11, v15, :cond_15

    const/4 v0, 0x1

    goto :goto_b

    :cond_15
    move/from16 v0, v33

    :goto_b
    or-int/2addr v0, v5

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_16

    if-ne v5, v13, :cond_17

    :cond_16
    new-instance v0, Lm50/c$a;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lm50/c$a;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lq83/d;)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :cond_17
    check-cast v5, Lc93/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v12, v5, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v14, 0x3

    const/4 v0, 0x0

    invoke-static {v5, v0, v14}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v7, v7

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v7, v14

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v15, Lb2/e;->M:Lb2/k;

    const/4 v0, 0x6

    invoke-static {v7, v15, v12, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move/from16 v18, v8

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_18

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_18
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v12, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v12, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    :cond_19
    invoke-static {v6, v12, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v12, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm50/d;->j()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;

    new-instance v6, Lsz0/u0;

    invoke-virtual {v5}, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;->getNameDisplay()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x2

    const/4 v15, 0x0

    invoke-direct {v6, v5, v15, v8, v15}, Lsz0/u0;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_1b
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    const/16 v5, 0x100

    if-ne v11, v5, :cond_1c

    const/4 v6, 0x1

    goto :goto_e

    :cond_1c
    move/from16 v6, v33

    :goto_e
    or-int/2addr v0, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_1d

    if-ne v6, v13, :cond_1e

    :cond_1d
    new-instance v6, Lm50/b;

    invoke-direct {v6, v3, v1, v2, v4}, Lm50/b;-><init>(Lm50/d;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/a1;)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v0, v13

    const/4 v13, 0x0

    move v8, v14

    const/16 v14, 0xc

    move-object v15, v9

    const/4 v9, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move/from16 p2, v11

    move-object v11, v6

    move/from16 v6, p2

    move-object/from16 p3, v2

    move-object v5, v15

    move-object/from16 p2, v16

    const/4 v2, 0x1

    move v15, v8

    move/from16 v8, v18

    invoke-static/range {v7 .. v14}, Lsz0/x0;->e(Ljava/util/List;ILandroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->N:Lb2/k;

    int-to-float v8, v2

    const/16 v9, 0x36

    invoke-static {v8, v15, v7, v12, v9}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_1f

    invoke-virtual {v12, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v12, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_20

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_21

    :cond_20
    invoke-static {v8, v12, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm50/d;->i()Ljava/lang/String;

    move-result-object v7

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v5, v12, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->s()Lb91/a;

    move-result-object v27

    invoke-virtual {v5, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v9

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v31, v5, 0x12

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v5, 0x100

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    new-instance v13, Lq01/b;

    invoke-static {v1}, Lm50/c;->k(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v14

    invoke-static {v4}, Lm50/c;->m(Lp1/a1;)I

    move-result v15

    invoke-virtual {v3}, Lm50/d;->h()Li93/j;

    move-result-object v16

    invoke-virtual {v3}, Lm50/d;->b()Li93/j;

    move-result-object v17

    invoke-virtual {v3}, Lm50/d;->g()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v3}, Lm50/d;->a()Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v13 .. v19}, Lq01/b;-><init>(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-ne v6, v5, :cond_22

    move/from16 v33, v2

    :cond_22
    or-int v5, v7, v33

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_24

    if-ne v6, v0, :cond_23

    goto :goto_10

    :cond_23
    move-object/from16 v5, p3

    goto :goto_11

    :cond_24
    :goto_10
    new-instance v6, Lm50/b;

    move-object/from16 v5, p3

    invoke-direct {v6, v5, v3, v4, v1}, Lm50/b;-><init>(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lp1/c1;)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    move-object v8, v6

    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v14, Lq01/b;->g:I

    const/16 v15, 0x3c

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x0

    move-object v7, v13

    move-object/from16 v13, v29

    invoke-static/range {v7 .. v15}, Lq01/a;->d(Lq01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    move-object/from16 v4, p2

    goto :goto_12

    :cond_25
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v4, v2

    :goto_12
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_26

    new-instance v0, Lm31/h;

    const/4 v3, 0x2

    move-object/from16 v6, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lcom/whoop/domain/model/UnitSystem;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lm50/d;",
            "Lp1/a1;",
            "Lcom/whoop/domain/model/UnitSystem;",
            ")V"
        }
    .end annotation

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    invoke-virtual {p1}, Lm50/d;->l()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lm50/d;->j()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;

    invoke-virtual {v5}, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromString(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v5

    if-ne v5, p3, :cond_0

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    check-cast v4, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    :cond_2
    invoke-virtual {p1}, Lm50/d;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lm50/c;->m(Lp1/a1;)I

    move-result p2

    invoke-static {v1, p2, p3}, Lm50/c;->q(Ljava/lang/String;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;->getState()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p2}, Ln83/f;->putAll(Ljava/util/Map;)V

    invoke-virtual {p1}, Lm50/d;->f()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk50/c;

    invoke-virtual {p2}, Lk50/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, p3}, Lk50/c;->b(Lcom/whoop/domain/model/UnitSystem;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    new-instance p2, Lcom/whoop/design/item/DesignItemInteraction;

    new-instance p3, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p3, p1, v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, p3, v2}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lm50/d;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/a1;I)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lm50/d;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;

    invoke-virtual {p4}, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromString(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-static {p1, p4}, Lm50/c;->l(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)V

    invoke-static {p2, p0, p3, p4}, Lm50/c;->f(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lcom/whoop/domain/model/UnitSystem;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p2, p4}, Lm50/c;->n(Lp1/a1;I)V

    new-instance p2, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p1}, Lm50/d;->k()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3}, Lm50/c;->k(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object p3

    invoke-static {p1, p4, p3}, Lm50/c;->q(Ljava/lang/String;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p1

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lm50/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lm50/c;->e(Lm50/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/domain/model/UnitSystem;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/UnitSystem;

    return-object p0
.end method

.method private static final l(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/domain/model/UnitSystem;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final m(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final n(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method public static final synthetic o(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lcom/whoop/domain/model/UnitSystem;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm50/c;->f(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lcom/whoop/domain/model/UnitSystem;)V

    return-void
.end method

.method public static final synthetic p(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;
    .locals 0

    invoke-static {p0}, Lm50/c;->k(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Ljava/lang/String;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;
    .locals 2

    new-instance v0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-static {p2}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Ld21/a;->a:Ld21/a;

    invoke-virtual {p2, p1}, Ld21/a;->a(I)I

    move-result p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    new-instance p2, Ll83/k;

    invoke-direct {p2, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    const/4 p1, 0x2

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
