.class public abstract Lzc1/d3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/d3;->f(Lp1/c1;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/d3;->g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/d3;->e(Lp1/c1;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move/from16 v0, p1

    move-object/from16 v8, p0

    check-cast v8, Lp1/q;

    const v1, -0x6dc9574e

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_0

    move v1, v11

    goto :goto_0

    :cond_0
    move v1, v12

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v8, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const/high16 v13, 0x43160000    # 150.0f

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v1, v14, :cond_1

    invoke-static {v13, v8}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v1

    :cond_1
    move-object v15, v1

    check-cast v15, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_2

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-static {v1, v8}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v1

    :cond_2
    check-cast v1, Lp1/c1;

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v4, v11

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->N:Lb2/k;

    const/4 v5, 0x4

    int-to-float v5, v5

    const/16 v6, 0x36

    invoke-static {v5, v5, v4, v8, v6}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v8, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v5, v8, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Max Heart Rate: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v8, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    new-instance v4, Li93/e;

    const/high16 v5, 0x437a0000    # 250.0f

    invoke-direct {v4, v13, v5}, Li93/e;-><init>(FF)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v14, :cond_6

    new-instance v5, Lzc1/n0;

    const/16 v6, 0xb

    invoke-direct {v5, v6, v15}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v7, v5

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/high16 v9, 0x180000

    const/16 v10, 0x33

    move-object v5, v1

    const/4 v1, 0x0

    move-object v6, v3

    move v3, v2

    const/4 v2, 0x0

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 p0, v16

    move-object/from16 v11, v17

    invoke-static/range {v1 .. v10}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {p0 .. p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Current Heart Rate: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {p0 .. p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v3

    new-instance v4, Li93/e;

    const/4 v1, 0x0

    invoke-direct {v4, v1, v13}, Li93/e;-><init>(FF)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_7

    new-instance v1, Lzc1/n0;

    const/16 v2, 0xc

    move-object/from16 v13, p0

    invoke-direct {v1, v2, v13}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    move-object/from16 v13, p0

    :goto_2
    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/high16 v9, 0x180000

    const/16 v10, 0x33

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "HR Monitor: With Stat "

    const/4 v2, 0x6

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Ln71/d;

    new-instance v1, Ln71/f$a;

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    invoke-static {}, Ll31/j;->c()Ljava/util/List;

    move-result-object v5

    invoke-direct {v1, v3, v4, v5}, Ln71/f$a;-><init>(IILjava/util/List;)V

    new-instance v3, Ln71/e;

    const-string v4, "STAT TITLE"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-direct {v3, v5, v12, v6, v7}, Ln71/e;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0xc

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v1

    move-object/from16 v19, v3

    invoke-direct/range {v17 .. v23}, Ln71/d;-><init>(Ln71/f;Ln71/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    sget v3, Ln71/d;->e:I

    const/4 v5, 0x3

    shl-int/2addr v3, v5

    or-int/2addr v3, v2

    invoke-static {v11, v1, v8, v3, v12}, Ln71/c;->b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "HR Monitor: New Custom Hr Zones Stat"

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Ln71/d;

    new-instance v1, Ln71/f$a;

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    invoke-static {v9}, Le93/b;->X(F)I

    move-result v9

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    invoke-static {v10}, Le93/b;->X(F)I

    move-result v10

    invoke-static {}, Ll31/j;->c()Ljava/util/List;

    move-result-object v14

    invoke-direct {v1, v9, v10, v14}, Ln71/f$a;-><init>(IILjava/util/List;)V

    new-instance v9, Ln71/e;

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v9, v4, v12, v6, v7}, Ln71/e;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v1

    move-object/from16 v19, v9

    invoke-direct/range {v17 .. v23}, Ln71/d;-><init>(Ln71/f;Ln71/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    invoke-static {v11, v1, v8, v3, v12}, Ln71/c;->b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "HR Monitor: Without Stat "

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Ln71/d;

    new-instance v1, Ln71/f$a;

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {v6}, Le93/b;->X(F)I

    move-result v6

    invoke-static {}, Ll31/j;->c()Ljava/util/List;

    move-result-object v9

    invoke-direct {v1, v4, v6, v9}, Ln71/f$a;-><init>(IILjava/util/List;)V

    const/16 v22, 0xe

    const/16 v19, 0x0

    move-object/from16 v18, v1

    invoke-direct/range {v17 .. v23}, Ln71/d;-><init>(Ln71/f;Ln71/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    invoke-static {v11, v1, v8, v3, v12}, Ln71/c;->b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "HR Monitor: With Stat - Disconnected"

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Ln71/d;

    new-instance v1, Ln71/f$b;

    invoke-static {}, Ll31/j;->b()Ljava/util/List;

    move-result-object v4

    invoke-direct {v1, v4}, Ln71/f$b;-><init>(Ljava/util/List;)V

    new-instance v4, Ln71/e;

    invoke-direct {v4, v7, v12, v5, v7}, Ln71/e;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0xc

    move-object/from16 v18, v1

    move-object/from16 v19, v4

    invoke-direct/range {v17 .. v23}, Ln71/d;-><init>(Ln71/f;Ln71/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    invoke-static {v11, v1, v8, v3, v12}, Ln71/c;->b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "HR Monitor: Custom Hr zone state - Disconnected"

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Ln71/d;

    new-instance v1, Ln71/f$b;

    invoke-static {}, Ll31/j;->b()Ljava/util/List;

    move-result-object v4

    invoke-direct {v1, v4}, Ln71/f$b;-><init>(Ljava/util/List;)V

    new-instance v4, Ln71/e;

    invoke-direct {v4, v7, v12, v5, v7}, Ln71/e;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v1

    move-object/from16 v19, v4

    invoke-direct/range {v17 .. v23}, Ln71/d;-><init>(Ln71/f;Ln71/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    invoke-static {v11, v1, v8, v3, v12}, Ln71/c;->b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "HR Monitor: Without Stat - Disconnected"

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Ln71/d;

    new-instance v1, Ln71/f$b;

    invoke-static {}, Ll31/j;->b()Ljava/util/List;

    move-result-object v4

    invoke-direct {v1, v4}, Ln71/f$b;-><init>(Ljava/util/List;)V

    const/16 v22, 0xe

    const/16 v19, 0x0

    move-object/from16 v18, v1

    invoke-direct/range {v17 .. v23}, Ln71/d;-><init>(Ln71/f;Ln71/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    invoke-static {v11, v1, v8, v3, v12}, Ln71/c;->b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "HR Monitor: With Stat - No Icon"

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Ln71/d;

    new-instance v1, Ln71/f$a;

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v5}, Le93/b;->X(F)I

    move-result v5

    invoke-static {}, Ll31/j;->b()Ljava/util/List;

    move-result-object v6

    invoke-direct {v1, v4, v5, v6}, Ln71/f$a;-><init>(IILjava/util/List;)V

    new-instance v4, Ln71/e;

    const/4 v5, 0x1

    invoke-direct {v4, v7, v12, v5, v7}, Ln71/e;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0xc

    move-object/from16 v18, v1

    move-object/from16 v19, v4

    invoke-direct/range {v17 .. v23}, Ln71/d;-><init>(Ln71/f;Ln71/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    invoke-static {v11, v1, v8, v3, v12}, Ln71/c;->b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "HR Monitor: With Stat - No Icon - Disconnected"

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Ln71/d;

    new-instance v1, Ln71/f$b;

    invoke-static {}, Ll31/j;->b()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ln71/f$b;-><init>(Ljava/util/List;)V

    new-instance v2, Ln71/e;

    const-string v4, "NO DATA"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v2, v4, v12}, Ln71/e;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    invoke-direct/range {v17 .. v23}, Ln71/d;-><init>(Ln71/f;Ln71/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    invoke-static {v11, v1, v8, v3, v12}, Ln71/c;->b(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_8
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Lzc1/l2;

    const/16 v3, 0xf

    invoke-direct {v2, v0, v3}, Lzc1/l2;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final e(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/d3;->d(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
