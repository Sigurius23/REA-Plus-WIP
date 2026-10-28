.class public final Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0003\u00a8\u0006\t"
    }
    d2 = {
        "generatedBind",
        "Lcom/whoop/design/models/items/TriLabelSliderModel;",
        "contentBinding",
        "",
        "",
        "aggregateBindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "accumulatedState",
        "",
        "design-models_release"
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
.method public static final generatedBind(Lcom/whoop/design/models/items/TriLabelSliderModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/TriLabelSliderModel;
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/TriLabelSliderModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/items/TriLabelSliderModel;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p3

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "accumulatedState"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getLowerBound()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/design/models/WithGeneratedBindings;

    const/16 v9, 0xa

    if-eqz v4, :cond_5

    move-object v4, v2

    check-cast v4, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v4, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Float;

    if-nez v5, :cond_3

    const/4 v4, 0x0

    :cond_3
    check-cast v4, Ljava/lang/Float;

    if-nez v4, :cond_4

    goto :goto_4

    :cond_4
    :goto_0
    move-object v5, v2

    goto :goto_5

    :cond_5
    instance-of v4, v2, Ljava/util/List;

    if-eqz v4, :cond_a

    move-object v4, v2

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v7, :cond_6

    move-object v7, v6

    check-cast v7, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_2

    :cond_6
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_8

    invoke-interface {v7, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v7

    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    move-object v6, v7

    :cond_8
    :goto_3
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_9
    move-object v4, v5

    check-cast v4, Ljava/lang/Float;

    goto :goto_0

    :cond_a
    :goto_4
    move-object v4, v2

    move-object v5, v4

    :goto_5
    const-string v2, "lowerBound"

    if-eqz v1, :cond_b

    invoke-static {v1, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :cond_b
    const/4 v6, 0x0

    :goto_6
    const-class v11, Ljava/lang/Float;

    sget-object v12, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    sget-object v13, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    sget-object v14, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v15, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v16, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v17, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v7, "__archv2_blank_clears_field"

    if-eqz v6, :cond_17

    invoke-static {v6, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_18

    invoke-static {v2, v6, v8}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v8}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Ljava/lang/String;

    if-eqz v6, :cond_c

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/4 v4, 0x0

    goto/16 :goto_9

    :cond_c
    invoke-static {v8}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_e

    :catch_0
    :cond_d
    const/4 v4, 0x0

    goto/16 :goto_8

    :cond_e
    instance-of v6, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v6, :cond_f

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v8

    invoke-virtual {v8, v6, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :cond_f
    instance-of v6, v4, Ljava/lang/Float;

    if-eqz v6, :cond_10

    goto/16 :goto_8

    :cond_10
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_16

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_8

    :cond_11
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_8

    :cond_12
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_8

    :cond_13
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_8

    :cond_14
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_15

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_8

    :cond_15
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_8

    :cond_16
    instance-of v6, v4, Ljava/lang/String;

    if-eqz v6, :cond_d

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_1
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v8

    invoke-virtual {v8, v6, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_7

    :catch_1
    const/4 v4, 0x0

    :goto_7
    if-eqz v4, :cond_d

    :goto_8
    if-nez v4, :cond_18

    move-object v4, v5

    goto :goto_9

    :cond_17
    sget-object v5, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;

    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_18
    :goto_9
    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;

    sget-object v8, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;

    move-object v5, v2

    move-object/from16 v10, p1

    move-object/from16 v3, p3

    move-object/from16 v20, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    if-eqz v2, :cond_19

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_a
    move/from16 v22, v1

    goto :goto_b

    :cond_19
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getLowerBound()F

    move-result v1

    goto :goto_a

    :goto_b
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getCenterBound()Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_1a

    const/4 v4, 0x0

    goto :goto_11

    :cond_1a
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_1c

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Float;

    if-nez v4, :cond_1b

    const/4 v2, 0x0

    :cond_1b
    check-cast v2, Ljava/lang/Float;

    if-nez v2, :cond_22

    goto :goto_f

    :cond_1c
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_21

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_1d

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_d

    :cond_1d
    const/4 v6, 0x0

    :goto_d
    if-eqz v6, :cond_1f

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_1e

    goto :goto_e

    :cond_1e
    move-object v5, v6

    :cond_1f
    :goto_e
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_20
    move-object v2, v4

    check-cast v2, Ljava/lang/Float;

    goto :goto_10

    :cond_21
    :goto_f
    move-object v2, v1

    :cond_22
    :goto_10
    move-object v4, v2

    :goto_11
    const-string v2, "centerBound"

    if-eqz v10, :cond_23

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_12

    :cond_23
    const/4 v5, 0x0

    :goto_12
    if-eqz v5, :cond_31

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_30

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_24

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_24

    move-object/from16 v7, v20

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_25

    const/4 v4, 0x0

    goto/16 :goto_15

    :cond_24
    move-object/from16 v7, v20

    :cond_25
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_27

    :catch_2
    :cond_26
    const/4 v4, 0x0

    goto/16 :goto_14

    :cond_27
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_28

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_2
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_14

    :cond_28
    instance-of v5, v4, Ljava/lang/Float;

    if-eqz v5, :cond_29

    goto/16 :goto_14

    :cond_29
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_2f

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2a

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_14

    :cond_2a
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2b

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_14

    :cond_2b
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_14

    :cond_2c
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_14

    :cond_2d
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_14

    :cond_2e
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_14

    :cond_2f
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_26

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_3
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_13

    :catch_3
    const/4 v4, 0x0

    :goto_13
    if-eqz v4, :cond_26

    :goto_14
    if-nez v4, :cond_33

    move-object v4, v1

    goto :goto_15

    :cond_30
    move-object/from16 v7, v20

    goto :goto_15

    :cond_31
    move-object/from16 v7, v20

    if-nez v4, :cond_32

    goto :goto_15

    :cond_32
    sget-object v5, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;

    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_33
    :goto_15
    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;

    sget-object v8, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v31, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Ljava/lang/Float;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getUpperBound()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_36

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Float;

    if-nez v4, :cond_34

    const/4 v2, 0x0

    :cond_34
    check-cast v2, Ljava/lang/Float;

    if-nez v2, :cond_35

    goto :goto_1a

    :cond_35
    :goto_16
    move-object v4, v2

    goto :goto_1b

    :cond_36
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_3b

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_37

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_18

    :cond_37
    const/4 v6, 0x0

    :goto_18
    if-eqz v6, :cond_39

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_38

    goto :goto_19

    :cond_38
    move-object v5, v6

    :cond_39
    :goto_19
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_3a
    move-object v2, v4

    check-cast v2, Ljava/lang/Float;

    goto :goto_16

    :cond_3b
    :goto_1a
    move-object v4, v1

    :goto_1b
    const-string v2, "upperBound"

    if-eqz v10, :cond_3c

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1c

    :cond_3c
    const/4 v5, 0x0

    :goto_1c
    if-eqz v5, :cond_4a

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_49

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_3d

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3d

    move-object/from16 v7, v31

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3e

    const/4 v4, 0x0

    goto/16 :goto_1f

    :cond_3d
    move-object/from16 v7, v31

    :cond_3e
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_40

    :catch_4
    :cond_3f
    const/4 v4, 0x0

    goto/16 :goto_1e

    :cond_40
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_41

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_4
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_1e

    :cond_41
    instance-of v5, v4, Ljava/lang/Float;

    if-eqz v5, :cond_42

    goto/16 :goto_1e

    :cond_42
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_48

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_43

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_1e

    :cond_43
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_44

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_1e

    :cond_44
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_45

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_1e

    :cond_45
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_46

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_1e

    :cond_46
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_47

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_1e

    :cond_47
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_1e

    :cond_48
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_3f

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_5
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_1d

    :catch_5
    const/4 v4, 0x0

    :goto_1d
    if-eqz v4, :cond_3f

    :goto_1e
    if-nez v4, :cond_4b

    move-object v4, v1

    goto :goto_1f

    :cond_49
    move-object/from16 v7, v31

    goto :goto_1f

    :cond_4a
    move-object/from16 v7, v31

    sget-object v5, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;

    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_4b
    :goto_1f
    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;

    sget-object v8, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v32, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    if-eqz v2, :cond_4c

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_20
    move/from16 v24, v1

    goto :goto_21

    :cond_4c
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getUpperBound()F

    move-result v1

    goto :goto_20

    :goto_21
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getStartLabel()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4d

    const/4 v4, 0x0

    goto :goto_27

    :cond_4d
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_4f

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-nez v4, :cond_4e

    const/4 v2, 0x0

    :cond_4e
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_55

    goto :goto_25

    :cond_4f
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_54

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_22
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_53

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_50

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_23

    :cond_50
    const/4 v6, 0x0

    :goto_23
    if-eqz v6, :cond_52

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_51

    goto :goto_24

    :cond_51
    move-object v5, v6

    :cond_52
    :goto_24
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_22

    :cond_53
    move-object v2, v4

    check-cast v2, Ljava/lang/String;

    goto :goto_26

    :cond_54
    :goto_25
    move-object v2, v1

    :cond_55
    :goto_26
    move-object v4, v2

    :goto_27
    const-string v2, "startLabel"

    if-eqz v10, :cond_56

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_28

    :cond_56
    const/4 v5, 0x0

    :goto_28
    const-class v19, Ljava/lang/String;

    if-eqz v5, :cond_64

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_63

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_57

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_57

    move-object/from16 v7, v32

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_58

    const/4 v4, 0x0

    goto/16 :goto_2b

    :cond_57
    move-object/from16 v7, v32

    :cond_58
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_5a

    :catch_6
    :cond_59
    const/4 v4, 0x0

    goto/16 :goto_2a

    :cond_5a
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_5b

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_6
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto/16 :goto_2a

    :cond_5b
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_5c

    goto/16 :goto_2a

    :cond_5c
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_62

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_2a

    :cond_5d
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_2a

    :cond_5e
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_2a

    :cond_5f
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_60

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_2a

    :cond_60
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_61

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_2a

    :cond_61
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_59

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_2a

    :cond_62
    if-eqz v5, :cond_59

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_7
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_29

    :catch_7
    const/4 v4, 0x0

    :goto_29
    if-eqz v4, :cond_59

    :goto_2a
    if-nez v4, :cond_66

    move-object v4, v1

    goto :goto_2b

    :cond_63
    move-object/from16 v7, v32

    goto :goto_2b

    :cond_64
    move-object/from16 v7, v32

    if-nez v4, :cond_65

    goto :goto_2b

    :cond_65
    sget-object v5, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;

    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_66
    :goto_2b
    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;

    sget-object v8, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v33, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_67

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getStartLabel()Ljava/lang/String;

    move-result-object v2

    :cond_67
    move-object/from16 v25, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getCenterLabel()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_68

    const/4 v4, 0x0

    goto :goto_31

    :cond_68
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_6a

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-nez v4, :cond_69

    const/4 v2, 0x0

    :cond_69
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_70

    goto :goto_2f

    :cond_6a
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_6f

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_6b

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_2d

    :cond_6b
    const/4 v6, 0x0

    :goto_2d
    if-eqz v6, :cond_6d

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_6c

    goto :goto_2e

    :cond_6c
    move-object v5, v6

    :cond_6d
    :goto_2e
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2c

    :cond_6e
    move-object v2, v4

    check-cast v2, Ljava/lang/String;

    goto :goto_30

    :cond_6f
    :goto_2f
    move-object v2, v1

    :cond_70
    :goto_30
    move-object v4, v2

    :goto_31
    const-string v2, "centerLabel"

    if-eqz v10, :cond_71

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_32

    :cond_71
    const/4 v5, 0x0

    :goto_32
    if-eqz v5, :cond_7f

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_7e

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_72

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_72

    move-object/from16 v7, v33

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_73

    const/4 v4, 0x0

    goto/16 :goto_35

    :cond_72
    move-object/from16 v7, v33

    :cond_73
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_75

    :catch_8
    :cond_74
    const/4 v4, 0x0

    goto/16 :goto_34

    :cond_75
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_76

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_8
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto/16 :goto_34

    :cond_76
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_77

    goto/16 :goto_34

    :cond_77
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_7d

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_78

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_34

    :cond_78
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_79

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_34

    :cond_79
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7a

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_34

    :cond_7a
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7b

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_34

    :cond_7b
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_34

    :cond_7c
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_74

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_34

    :cond_7d
    if-eqz v5, :cond_74

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_9
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_33

    :catch_9
    const/4 v4, 0x0

    :goto_33
    if-eqz v4, :cond_74

    :goto_34
    if-nez v4, :cond_81

    move-object v4, v1

    goto :goto_35

    :cond_7e
    move-object/from16 v7, v33

    goto :goto_35

    :cond_7f
    move-object/from16 v7, v33

    if-nez v4, :cond_80

    goto :goto_35

    :cond_80
    sget-object v5, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;

    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_81
    :goto_35
    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;

    sget-object v8, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v34, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Ljava/lang/String;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getEndLabel()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_82

    const/4 v4, 0x0

    goto :goto_3b

    :cond_82
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_84

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-nez v4, :cond_83

    const/4 v2, 0x0

    :cond_83
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_8a

    goto :goto_39

    :cond_84
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_89

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_36
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_88

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_85

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_37

    :cond_85
    const/4 v6, 0x0

    :goto_37
    if-eqz v6, :cond_87

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_86

    goto :goto_38

    :cond_86
    move-object v5, v6

    :cond_87
    :goto_38
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_36

    :cond_88
    move-object v2, v4

    check-cast v2, Ljava/lang/String;

    goto :goto_3a

    :cond_89
    :goto_39
    move-object v2, v1

    :cond_8a
    :goto_3a
    move-object v4, v2

    :goto_3b
    const-string v2, "endLabel"

    if-eqz v10, :cond_8b

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_3c

    :cond_8b
    const/4 v5, 0x0

    :goto_3c
    if-eqz v5, :cond_99

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_98

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_8c

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8c

    move-object/from16 v7, v34

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8d

    const/4 v4, 0x0

    goto/16 :goto_3f

    :cond_8c
    move-object/from16 v7, v34

    :cond_8d
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_8f

    :catch_a
    :cond_8e
    const/4 v4, 0x0

    goto/16 :goto_3e

    :cond_8f
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_90

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_a
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    goto/16 :goto_3e

    :cond_90
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_91

    goto/16 :goto_3e

    :cond_91
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_97

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_92

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_3e

    :cond_92
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_93

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_3e

    :cond_93
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_94

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_3e

    :cond_94
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_95

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_3e

    :cond_95
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_96

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_3e

    :cond_96
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_3e

    :cond_97
    if-eqz v5, :cond_8e

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_b
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_3d

    :catch_b
    const/4 v4, 0x0

    :goto_3d
    if-eqz v4, :cond_8e

    :goto_3e
    if-nez v4, :cond_9b

    move-object v4, v1

    goto :goto_3f

    :cond_98
    move-object/from16 v7, v34

    goto :goto_3f

    :cond_99
    move-object/from16 v7, v34

    if-nez v4, :cond_9a

    goto :goto_3f

    :cond_9a
    sget-object v5, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;

    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_9b
    :goto_3f
    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;

    sget-object v8, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v35, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_9c

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getEndLabel()Ljava/lang/String;

    move-result-object v2

    :cond_9c
    move-object/from16 v27, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getSliderValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_9f

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Float;

    if-nez v4, :cond_9d

    const/4 v2, 0x0

    :cond_9d
    check-cast v2, Ljava/lang/Float;

    if-nez v2, :cond_9e

    goto :goto_44

    :cond_9e
    :goto_40
    move-object v4, v2

    goto :goto_45

    :cond_9f
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_a4

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_41
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_a0

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_42

    :cond_a0
    const/4 v6, 0x0

    :goto_42
    if-eqz v6, :cond_a2

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_a1

    goto :goto_43

    :cond_a1
    move-object v5, v6

    :cond_a2
    :goto_43
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_41

    :cond_a3
    move-object v2, v4

    check-cast v2, Ljava/lang/Float;

    goto :goto_40

    :cond_a4
    :goto_44
    move-object v4, v1

    :goto_45
    const-string v2, "sliderValue"

    if-eqz v10, :cond_a5

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_46

    :cond_a5
    const/4 v5, 0x0

    :goto_46
    if-eqz v5, :cond_b3

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_b2

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_a6

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_a6

    move-object/from16 v7, v35

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a7

    const/4 v4, 0x0

    goto/16 :goto_49

    :cond_a6
    move-object/from16 v7, v35

    :cond_a7
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_a9

    :catch_c
    :cond_a8
    const/4 v4, 0x0

    goto/16 :goto_48

    :cond_a9
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_aa

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_c
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    goto/16 :goto_48

    :cond_aa
    instance-of v5, v4, Ljava/lang/Float;

    if-eqz v5, :cond_ab

    goto/16 :goto_48

    :cond_ab
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_b1

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ac

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_48

    :cond_ac
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ad

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_48

    :cond_ad
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ae

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_48

    :cond_ae
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_af

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_48

    :cond_af
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b0

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_48

    :cond_b0
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a8

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_48

    :cond_b1
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_a8

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_d
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_47

    :catch_d
    const/4 v4, 0x0

    :goto_47
    if-eqz v4, :cond_a8

    :goto_48
    if-nez v4, :cond_b4

    move-object v4, v1

    goto :goto_49

    :cond_b2
    move-object/from16 v7, v35

    goto :goto_49

    :cond_b3
    move-object/from16 v7, v35

    sget-object v5, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;

    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$32;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$32;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_b4
    :goto_49
    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$33;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$33;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$34;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$34;

    sget-object v8, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$35;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$35;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object v11, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    if-eqz v2, :cond_b5

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_4a
    move/from16 v28, v1

    goto :goto_4b

    :cond_b5
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getSliderValue()F

    move-result v1

    goto :goto_4a

    :goto_4b
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBarThickness()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_b8

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Integer;

    if-nez v4, :cond_b6

    const/4 v2, 0x0

    :cond_b6
    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_b7

    goto :goto_50

    :cond_b7
    :goto_4c
    move-object v4, v2

    goto :goto_51

    :cond_b8
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_bd

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_bc

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_b9

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_4e

    :cond_b9
    const/4 v6, 0x0

    :goto_4e
    if-eqz v6, :cond_bb

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_ba

    goto :goto_4f

    :cond_ba
    move-object v5, v6

    :cond_bb
    :goto_4f
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4d

    :cond_bc
    move-object v2, v4

    check-cast v2, Ljava/lang/Integer;

    goto :goto_4c

    :cond_bd
    :goto_50
    move-object v4, v1

    :goto_51
    const-string v2, "barThickness"

    if-eqz v10, :cond_be

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_52

    :cond_be
    const/4 v5, 0x0

    :goto_52
    if-eqz v5, :cond_ca

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_cb

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_bf

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_bf

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_bf

    const/4 v4, 0x0

    goto/16 :goto_55

    :cond_bf
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_c1

    :catch_e
    :cond_c0
    const/4 v4, 0x0

    goto/16 :goto_54

    :cond_c1
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_c2

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_e
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    goto/16 :goto_54

    :cond_c2
    instance-of v5, v4, Ljava/lang/Integer;

    if-eqz v5, :cond_c3

    goto/16 :goto_54

    :cond_c3
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_c9

    const-class v5, Ljava/lang/Integer;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto/16 :goto_54

    :cond_c4
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c5

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto/16 :goto_54

    :cond_c5
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c6

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_54

    :cond_c6
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c7

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_54

    :cond_c7
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c8

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_54

    :cond_c8
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c0

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_54

    :cond_c9
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_c0

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_f
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    goto :goto_53

    :catch_f
    const/4 v4, 0x0

    :goto_53
    if-eqz v4, :cond_c0

    :goto_54
    if-nez v4, :cond_cb

    move-object v4, v1

    goto :goto_55

    :cond_ca
    sget-object v5, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$36;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$36;

    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$37;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$37;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_cb
    :goto_55
    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$38;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$38;

    sget-object v7, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$39;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$39;

    sget-object v8, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$40;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$40;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_cc

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_56
    move/from16 v29, v1

    goto :goto_57

    :cond_cc
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBarThickness()I

    move-result v1

    goto :goto_56

    :goto_57
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBarStyle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_cd

    const/4 v4, 0x0

    goto :goto_5d

    :cond_cd
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_cf

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-nez v4, :cond_ce

    const/4 v2, 0x0

    :cond_ce
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_d5

    goto :goto_5b

    :cond_cf
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_d4

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_58
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_d0

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_59

    :cond_d0
    const/4 v6, 0x0

    :goto_59
    if-eqz v6, :cond_d2

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_d1

    goto :goto_5a

    :cond_d1
    move-object v5, v6

    :cond_d2
    :goto_5a
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_58

    :cond_d3
    move-object v2, v4

    check-cast v2, Ljava/lang/String;

    goto :goto_5c

    :cond_d4
    :goto_5b
    move-object v2, v1

    :cond_d5
    :goto_5c
    move-object v4, v2

    :goto_5d
    const-string v2, "barStyle"

    if-eqz v10, :cond_d6

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_5e

    :cond_d6
    const/4 v5, 0x0

    :goto_5e
    if-eqz v5, :cond_e3

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_e5

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_d7

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_d7

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d7

    const/4 v4, 0x0

    goto/16 :goto_63

    :cond_d7
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_d9

    :catch_10
    :cond_d8
    const/4 v10, 0x0

    goto/16 :goto_61

    :cond_d9
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_da

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_10
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v10
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    goto/16 :goto_61

    :cond_da
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_db

    :goto_5f
    move-object v10, v4

    goto/16 :goto_61

    :cond_db
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_e1

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_dc

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/String;

    goto/16 :goto_61

    :cond_dc
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_dd

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/String;

    goto/16 :goto_61

    :cond_dd
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_de

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/String;

    goto :goto_61

    :cond_de
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_df

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/String;

    goto :goto_61

    :cond_df
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e0

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/String;

    goto :goto_61

    :cond_e0
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d8

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/String;

    goto :goto_61

    :cond_e1
    if-eqz v5, :cond_d8

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_11
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    goto :goto_60

    :catch_11
    const/4 v4, 0x0

    :goto_60
    if-eqz v4, :cond_d8

    goto/16 :goto_5f

    :goto_61
    if-nez v10, :cond_e2

    move-object v4, v1

    goto :goto_63

    :cond_e2
    :goto_62
    move-object v4, v10

    goto :goto_63

    :cond_e3
    if-nez v4, :cond_e4

    goto :goto_63

    :cond_e4
    sget-object v5, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$41;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$41;

    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$42;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$42;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_62

    :cond_e5
    :goto_63
    sget-object v6, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$43;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$43;

    sget-object v7, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$44;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$44;

    sget-object v8, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$45;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$45;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_e6

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBarStyle()Ljava/lang/String;

    move-result-object v1

    :cond_e6
    move-object/from16 v30, v1

    new-instance v21, Lcom/whoop/design/models/items/TriLabelSliderModel;

    invoke-direct/range {v21 .. v30}, Lcom/whoop/design/models/items/TriLabelSliderModel;-><init>(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)V

    move-object/from16 v1, v21

    invoke-static {v1, v0}, Lcom/whoop/design/models/binding/ContentBindingResolverKt;->copyBindingsFrom(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/TriLabelSliderModel;

    return-object v0
.end method

.method public static synthetic generatedBind$default(Lcom/whoop/design/models/items/TriLabelSliderModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/TriLabelSliderModel;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/TriLabelSliderModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/TriLabelSliderModel;

    move-result-object p0

    return-object p0
.end method
