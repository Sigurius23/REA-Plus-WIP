.class public final Lg1/j7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:Lg1/n7;

.field public final synthetic x:F


# direct methods
.method public constructor <init>(Lg1/n7;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/j7;->w:Lg1/n7;

    iput p2, p0, Lg1/j7;->x:F

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Ljava/util/Map;

    iget-object v3, v0, Lg1/j7;->w:Lg1/n7;

    iget-object v4, v3, Lg1/n7;->c:Lp1/k1;

    iget-object v5, v3, Lg1/n7;->a:Ld0/l;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v2}, Lj93/l0;->g(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    iget-object v6, v3, Lg1/n7;->e:Lp1/g1;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    iget-object v8, v3, Lg1/n7;->m:Lp1/k1;

    invoke-virtual {v8}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc93/m;

    iget-object v9, v3, Lg1/n7;->n:Lp1/g1;

    invoke-virtual {v9}, Lp1/g1;->x()F

    move-result v9

    check-cast v7, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_0
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v15, v12

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    move-result v15

    const-wide v16, 0x3f50624dd2f1a9fcL    # 0.001

    float-to-double v13, v15

    move-wide/from16 v18, v13

    float-to-double v13, v6

    add-double v13, v13, v16

    cmpg-double v13, v18, v13

    if-gtz v13, :cond_0

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-wide v16, 0x3f50624dd2f1a9fcL    # 0.001

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    const/4 v12, 0x0

    const/4 v14, 0x1

    if-eqz v11, :cond_2

    const/4 v11, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v15, v11

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    move-result v15

    invoke-static {v10}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v13

    if-gt v14, v13, :cond_4

    :goto_1
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v19

    check-cast v20, Ljava/lang/Number;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Number;->floatValue()F

    move-result v12

    invoke-static {v15, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v20

    if-gez v20, :cond_3

    move v15, v12

    move-object/from16 v11, v19

    :cond_3
    if-eq v14, v13, :cond_4

    add-int/lit8 v14, v14, 0x1

    const/4 v12, 0x0

    goto :goto_1

    :cond_4
    :goto_2
    check-cast v11, Ljava/lang/Float;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    float-to-double v13, v13

    move-wide/from16 v19, v13

    float-to-double v13, v6

    sub-double v13, v13, v16

    cmpl-double v13, v19, v13

    if-ltz v13, :cond_5

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_7

    move/from16 p1, v6

    const/4 v13, 0x0

    goto :goto_6

    :cond_7
    const/4 v7, 0x0

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v7, v12

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v10}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v13

    const/4 v14, 0x1

    if-gt v14, v13, :cond_a

    const/4 v14, 0x1

    :goto_4
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Ljava/lang/Number;

    move/from16 p1, v6

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {v7, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v16

    if-lez v16, :cond_8

    move v7, v6

    move-object v12, v15

    :cond_8
    if-eq v14, v13, :cond_9

    add-int/lit8 v14, v14, 0x1

    move/from16 v6, p1

    goto :goto_4

    :cond_9
    :goto_5
    move-object v13, v12

    goto :goto_6

    :cond_a
    move/from16 p1, v6

    goto :goto_5

    :goto_6
    check-cast v13, Ljava/lang/Float;

    if-nez v11, :cond_b

    invoke-static {v13}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    goto :goto_7

    :cond_b
    if-nez v13, :cond_c

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    goto :goto_7

    :cond_c
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Float;Ljava/lang/Float;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    goto :goto_7

    :cond_d
    filled-new-array {v11, v13}, [Ljava/lang/Float;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    if-eqz v7, :cond_13

    const/4 v14, 0x1

    if-eq v7, v14, :cond_12

    const/4 v7, 0x0

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    cmpg-float v10, v4, p1

    iget v11, v0, Lg1/j7;->x:F

    if-gtz v10, :cond_f

    cmpl-float v9, v11, v9

    if-ltz v9, :cond_e

    goto :goto_8

    :cond_e
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-interface {v8, v9, v10}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    cmpg-float v8, p1, v8

    if-gez v8, :cond_11

    goto :goto_9

    :cond_f
    neg-float v9, v9

    cmpg-float v9, v11, v9

    if-gtz v9, :cond_10

    goto :goto_9

    :cond_10
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-interface {v8, v9, v10}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    cmpl-float v8, p1, v8

    if-lez v8, :cond_14

    :cond_11
    :goto_8
    move v7, v6

    goto :goto_9

    :cond_12
    const/4 v7, 0x0

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v7

    goto :goto_9

    :cond_13
    move v7, v4

    :cond_14
    :goto_9
    new-instance v6, Ljava/lang/Float;

    invoke-direct {v6, v7}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_16

    iget-object v7, v3, Lg1/n7;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v7, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_16

    iget-object v4, v3, Lg1/n7;->j:Lch/i;

    new-instance v7, Lec3/f1;

    const/4 v8, 0x3

    invoke-direct {v7, v2, v3, v5, v8}, Lec3/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v7, v1}, Lch/i;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_15

    goto :goto_a

    :cond_15
    move-object v1, v6

    :goto_a
    if-ne v1, v2, :cond_17

    return-object v1

    :cond_16
    invoke-virtual {v3, v4, v5, v1}, Lg1/n7;->a(FLd0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_17

    return-object v1

    :cond_17
    return-object v6
.end method
