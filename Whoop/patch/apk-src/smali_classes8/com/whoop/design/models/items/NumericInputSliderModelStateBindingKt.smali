.class public final Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0003\u00a8\u0006\t"
    }
    d2 = {
        "generatedBind",
        "Lcom/whoop/design/models/items/NumericInputSliderModel;",
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
.method public static final generatedBind(Lcom/whoop/design/models/items/NumericInputSliderModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/NumericInputSliderModel;
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/NumericInputSliderModel;",
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
            "Lcom/whoop/design/models/items/NumericInputSliderModel;"
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
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getUpperBound()F

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
    const-string v2, "upperBound"

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
    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;

    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_18
    :goto_9
    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;

    sget-object v8, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;

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
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getUpperBound()F

    move-result v1

    goto :goto_a

    :goto_b
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getLowerBound()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_1c

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Float;

    if-nez v4, :cond_1a

    const/4 v2, 0x0

    :cond_1a
    check-cast v2, Ljava/lang/Float;

    if-nez v2, :cond_1b

    goto :goto_10

    :cond_1b
    :goto_c
    move-object v4, v2

    goto :goto_11

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

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_1d

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_e

    :cond_1d
    const/4 v6, 0x0

    :goto_e
    if-eqz v6, :cond_1f

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_1e

    goto :goto_f

    :cond_1e
    move-object v5, v6

    :cond_1f
    :goto_f
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_20
    move-object v2, v4

    check-cast v2, Ljava/lang/Float;

    goto :goto_c

    :cond_21
    :goto_10
    move-object v4, v1

    :goto_11
    const-string v2, "lowerBound"

    if-eqz v10, :cond_22

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_12

    :cond_22
    const/4 v5, 0x0

    :goto_12
    if-eqz v5, :cond_30

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2f

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_23

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_23

    move-object/from16 v7, v20

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    const/4 v4, 0x0

    goto/16 :goto_15

    :cond_23
    move-object/from16 v7, v20

    :cond_24
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_26

    :catch_2
    :cond_25
    const/4 v4, 0x0

    goto/16 :goto_14

    :cond_26
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_27

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

    :cond_27
    instance-of v5, v4, Ljava/lang/Float;

    if-eqz v5, :cond_28

    goto/16 :goto_14

    :cond_28
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_2e

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_29

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_14

    :cond_29
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2a

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_14

    :cond_2a
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2b

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_14

    :cond_2b
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_14

    :cond_2c
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_14

    :cond_2d
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_25

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_14

    :cond_2e
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_25

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
    if-eqz v4, :cond_25

    :goto_14
    if-nez v4, :cond_31

    move-object v4, v1

    goto :goto_15

    :cond_2f
    move-object/from16 v7, v20

    goto :goto_15

    :cond_30
    move-object/from16 v7, v20

    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;

    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_31
    :goto_15
    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;

    sget-object v8, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v31, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    if-eqz v2, :cond_32

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_16
    move/from16 v23, v1

    goto :goto_17

    :cond_32
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getLowerBound()F

    move-result v1

    goto :goto_16

    :goto_17
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getStepSize()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_35

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Integer;

    if-nez v4, :cond_33

    const/4 v2, 0x0

    :cond_33
    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_34

    goto :goto_1c

    :cond_34
    :goto_18
    move-object v4, v2

    goto :goto_1d

    :cond_35
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_3a

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_39

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_36

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_1a

    :cond_36
    const/4 v6, 0x0

    :goto_1a
    if-eqz v6, :cond_38

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_37

    goto :goto_1b

    :cond_37
    move-object v5, v6

    :cond_38
    :goto_1b
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_39
    move-object v2, v4

    check-cast v2, Ljava/lang/Integer;

    goto :goto_18

    :cond_3a
    :goto_1c
    move-object v4, v1

    :goto_1d
    const-string v2, "stepSize"

    if-eqz v10, :cond_3b

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1e

    :cond_3b
    const/4 v5, 0x0

    :goto_1e
    const-class v19, Ljava/lang/Integer;

    if-eqz v5, :cond_49

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_48

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_3c

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3c

    move-object/from16 v7, v31

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3d

    const/4 v4, 0x0

    goto/16 :goto_21

    :cond_3c
    move-object/from16 v7, v31

    :cond_3d
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_3f

    :catch_4
    :cond_3e
    const/4 v4, 0x0

    goto/16 :goto_20

    :cond_3f
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_40

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_4
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_20

    :cond_40
    instance-of v5, v4, Ljava/lang/Integer;

    if-eqz v5, :cond_41

    goto/16 :goto_20

    :cond_41
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_47

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_42

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto/16 :goto_20

    :cond_42
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_43

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto/16 :goto_20

    :cond_43
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_44

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_20

    :cond_44
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_45

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_20

    :cond_45
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_46

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_20

    :cond_46
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_20

    :cond_47
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_3e

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_5
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_1f

    :catch_5
    const/4 v4, 0x0

    :goto_1f
    if-eqz v4, :cond_3e

    :goto_20
    if-nez v4, :cond_4a

    move-object v4, v1

    goto :goto_21

    :cond_48
    move-object/from16 v7, v31

    goto :goto_21

    :cond_49
    move-object/from16 v7, v31

    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;

    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_4a
    :goto_21
    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;

    sget-object v8, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v32, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_4b

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_22
    move/from16 v24, v1

    goto :goto_23

    :cond_4b
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getStepSize()I

    move-result v1

    goto :goto_22

    :goto_23
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBarThickness()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_4e

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Integer;

    if-nez v4, :cond_4c

    const/4 v2, 0x0

    :cond_4c
    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_4d

    goto :goto_28

    :cond_4d
    :goto_24
    move-object v4, v2

    goto :goto_29

    :cond_4e
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_53

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_25
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_52

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_4f

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_26

    :cond_4f
    const/4 v6, 0x0

    :goto_26
    if-eqz v6, :cond_51

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_50

    goto :goto_27

    :cond_50
    move-object v5, v6

    :cond_51
    :goto_27
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_52
    move-object v2, v4

    check-cast v2, Ljava/lang/Integer;

    goto :goto_24

    :cond_53
    :goto_28
    move-object v4, v1

    :goto_29
    const-string v2, "barThickness"

    if-eqz v10, :cond_54

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2a

    :cond_54
    const/4 v5, 0x0

    :goto_2a
    if-eqz v5, :cond_62

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_61

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_55

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_55

    move-object/from16 v7, v32

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_56

    const/4 v4, 0x0

    goto/16 :goto_2d

    :cond_55
    move-object/from16 v7, v32

    :cond_56
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_58

    :catch_6
    :cond_57
    const/4 v4, 0x0

    goto/16 :goto_2c

    :cond_58
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_59

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_6
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto/16 :goto_2c

    :cond_59
    instance-of v5, v4, Ljava/lang/Integer;

    if-eqz v5, :cond_5a

    goto/16 :goto_2c

    :cond_5a
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_60

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5b

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto/16 :goto_2c

    :cond_5b
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto/16 :goto_2c

    :cond_5c
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_2c

    :cond_5d
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_2c

    :cond_5e
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_2c

    :cond_5f
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_57

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_2c

    :cond_60
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_57

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_7
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_2b

    :catch_7
    const/4 v4, 0x0

    :goto_2b
    if-eqz v4, :cond_57

    :goto_2c
    if-nez v4, :cond_63

    move-object v4, v1

    goto :goto_2d

    :cond_61
    move-object/from16 v7, v32

    goto :goto_2d

    :cond_62
    move-object/from16 v7, v32

    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;

    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_63
    :goto_2d
    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;

    sget-object v8, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v33, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_64

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_2e
    move/from16 v25, v1

    goto :goto_2f

    :cond_64
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBarThickness()I

    move-result v1

    goto :goto_2e

    :goto_2f
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBarColor()Ly81/f;

    move-result-object v1

    if-nez v1, :cond_65

    const/4 v4, 0x0

    goto :goto_35

    :cond_65
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_67

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ly81/f;

    if-nez v4, :cond_66

    const/4 v2, 0x0

    :cond_66
    check-cast v2, Ly81/f;

    if-nez v2, :cond_6d

    goto :goto_33

    :cond_67
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_6c

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_30
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_68

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_31

    :cond_68
    const/4 v6, 0x0

    :goto_31
    if-eqz v6, :cond_6a

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_69

    goto :goto_32

    :cond_69
    move-object v5, v6

    :cond_6a
    :goto_32
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_30

    :cond_6b
    move-object v2, v4

    check-cast v2, Ly81/f;

    goto :goto_34

    :cond_6c
    :goto_33
    move-object v2, v1

    :cond_6d
    :goto_34
    move-object v4, v2

    :goto_35
    const-string v2, "barColor"

    if-eqz v10, :cond_6e

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_36

    :cond_6e
    const/4 v5, 0x0

    :goto_36
    if-eqz v5, :cond_7c

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_7b

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_6f

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6f

    move-object/from16 v7, v33

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_70

    const/4 v4, 0x0

    goto/16 :goto_39

    :cond_6f
    move-object/from16 v7, v33

    :cond_70
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_72

    :catch_8
    :cond_71
    const/4 v4, 0x0

    goto/16 :goto_38

    :cond_72
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    const-string v6, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    if-eqz v5, :cond_73

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_8
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lkotlinx/serialization/internal/EnumSerializer;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v8

    invoke-direct {v5, v6, v8}, Lkotlinx/serialization/internal/EnumSerializer;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto/16 :goto_38

    :cond_73
    instance-of v5, v4, Ly81/f;

    if-eqz v5, :cond_74

    goto/16 :goto_38

    :cond_74
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_7a

    const-class v5, Ly81/f;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_75

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ly81/f;

    goto/16 :goto_38

    :cond_75
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_76

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ly81/f;

    goto/16 :goto_38

    :cond_76
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_77

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ly81/f;

    goto :goto_38

    :cond_77
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_78

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ly81/f;

    goto :goto_38

    :cond_78
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_79

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ly81/f;

    goto :goto_38

    :cond_79
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_71

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ly81/f;

    goto :goto_38

    :cond_7a
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_71

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_9
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lkotlinx/serialization/internal/EnumSerializer;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v8

    invoke-direct {v5, v6, v8}, Lkotlinx/serialization/internal/EnumSerializer;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_37

    :catch_9
    const/4 v4, 0x0

    :goto_37
    if-eqz v4, :cond_71

    :goto_38
    if-nez v4, :cond_7e

    move-object v4, v1

    goto :goto_39

    :cond_7b
    move-object/from16 v7, v33

    goto :goto_39

    :cond_7c
    move-object/from16 v7, v33

    if-nez v4, :cond_7d

    goto :goto_39

    :cond_7d
    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;

    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_7e
    :goto_39
    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;

    sget-object v8, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v34, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly81/f;

    if-nez v2, :cond_7f

    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBarColor()Ly81/f;

    move-result-object v2

    :cond_7f
    move-object/from16 v26, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getSliderValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_82

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Float;

    if-nez v4, :cond_80

    const/4 v2, 0x0

    :cond_80
    check-cast v2, Ljava/lang/Float;

    if-nez v2, :cond_81

    goto :goto_3e

    :cond_81
    :goto_3a
    move-object v4, v2

    goto :goto_3f

    :cond_82
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_87

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_86

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_83

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_3c

    :cond_83
    const/4 v6, 0x0

    :goto_3c
    if-eqz v6, :cond_85

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_84

    goto :goto_3d

    :cond_84
    move-object v5, v6

    :cond_85
    :goto_3d
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3b

    :cond_86
    move-object v2, v4

    check-cast v2, Ljava/lang/Float;

    goto :goto_3a

    :cond_87
    :goto_3e
    move-object v4, v1

    :goto_3f
    const-string v2, "sliderValue"

    if-eqz v10, :cond_88

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_40

    :cond_88
    const/4 v5, 0x0

    :goto_40
    if-eqz v5, :cond_96

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_95

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_89

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_89

    move-object/from16 v7, v34

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8a

    const/4 v4, 0x0

    goto/16 :goto_43

    :cond_89
    move-object/from16 v7, v34

    :cond_8a
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_8c

    :catch_a
    :cond_8b
    const/4 v4, 0x0

    goto/16 :goto_42

    :cond_8c
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_8d

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_a
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    goto/16 :goto_42

    :cond_8d
    instance-of v5, v4, Ljava/lang/Float;

    if-eqz v5, :cond_8e

    goto/16 :goto_42

    :cond_8e
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_94

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_42

    :cond_8f
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_90

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto/16 :goto_42

    :cond_90
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_91

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_42

    :cond_91
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_92

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_42

    :cond_92
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_93

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_42

    :cond_93
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8b

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    goto :goto_42

    :cond_94
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_8b

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_b
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_41

    :catch_b
    const/4 v4, 0x0

    :goto_41
    if-eqz v4, :cond_8b

    :goto_42
    if-nez v4, :cond_97

    move-object v4, v1

    goto :goto_43

    :cond_95
    move-object/from16 v7, v34

    goto :goto_43

    :cond_96
    move-object/from16 v7, v34

    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;

    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_97
    :goto_43
    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;

    sget-object v8, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object v11, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    if-eqz v2, :cond_98

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_44
    move/from16 v27, v1

    goto :goto_45

    :cond_98
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getSliderValue()F

    move-result v1

    goto :goto_44

    :goto_45
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getStartLabel()Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    move-result-object v1

    if-nez v1, :cond_99

    const/4 v4, 0x0

    goto :goto_4b

    :cond_99
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_9b

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    if-nez v4, :cond_9a

    const/4 v2, 0x0

    :cond_9a
    check-cast v2, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    if-nez v2, :cond_a1

    goto :goto_49

    :cond_9b
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_a0

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_46
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_9c

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_47

    :cond_9c
    const/4 v6, 0x0

    :goto_47
    if-eqz v6, :cond_9e

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_9d

    goto :goto_48

    :cond_9d
    move-object v5, v6

    :cond_9e
    :goto_48
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_46

    :cond_9f
    move-object v2, v4

    check-cast v2, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    goto :goto_4a

    :cond_a0
    :goto_49
    move-object v2, v1

    :cond_a1
    :goto_4a
    move-object v4, v2

    :goto_4b
    const-string v2, "startLabel"

    if-eqz v10, :cond_a2

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_4c

    :cond_a2
    const/4 v5, 0x0

    :goto_4c
    if-eqz v5, :cond_ae

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_b0

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_a3

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_a3

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a3

    const/4 v4, 0x0

    goto/16 :goto_4f

    :cond_a3
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_a5

    :catch_c
    :cond_a4
    const/4 v4, 0x0

    goto/16 :goto_4e

    :cond_a5
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_a6

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_c
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;->Companion:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    goto/16 :goto_4e

    :cond_a6
    instance-of v5, v4, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    if-eqz v5, :cond_a7

    goto/16 :goto_4e

    :cond_a7
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_ad

    const-class v5, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a8

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    goto/16 :goto_4e

    :cond_a8
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a9

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    goto/16 :goto_4e

    :cond_a9
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_aa

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    goto :goto_4e

    :cond_aa
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ab

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    goto :goto_4e

    :cond_ab
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ac

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    goto :goto_4e

    :cond_ac
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    goto :goto_4e

    :cond_ad
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_a4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_d
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;->Companion:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_4d

    :catch_d
    const/4 v4, 0x0

    :goto_4d
    if-eqz v4, :cond_a4

    :goto_4e
    if-nez v4, :cond_b0

    move-object v4, v1

    goto :goto_4f

    :cond_ae
    if-nez v4, :cond_af

    goto :goto_4f

    :cond_af
    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;

    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$32;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$32;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_b0
    :goto_4f
    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$33;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$33;

    sget-object v7, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$34;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$34;

    sget-object v8, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$35;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$35;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v28, v2

    check-cast v28, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getEndLabel()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    move-result-object v1

    if-nez v1, :cond_b1

    const/4 v4, 0x0

    goto :goto_55

    :cond_b1
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_b3

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    if-nez v4, :cond_b2

    const/4 v2, 0x0

    :cond_b2
    check-cast v2, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    if-nez v2, :cond_b9

    goto :goto_53

    :cond_b3
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_b8

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_50
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_b4

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_51

    :cond_b4
    const/4 v6, 0x0

    :goto_51
    if-eqz v6, :cond_b6

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_b5

    goto :goto_52

    :cond_b5
    move-object v5, v6

    :cond_b6
    :goto_52
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_50

    :cond_b7
    move-object v2, v4

    check-cast v2, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    goto :goto_54

    :cond_b8
    :goto_53
    move-object v2, v1

    :cond_b9
    :goto_54
    move-object v4, v2

    :goto_55
    const-string v2, "endLabel"

    if-eqz v10, :cond_ba

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_56

    :cond_ba
    const/4 v5, 0x0

    :goto_56
    if-eqz v5, :cond_c6

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_c8

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_bb

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_bb

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_bb

    const/4 v4, 0x0

    goto/16 :goto_59

    :cond_bb
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_bd

    :catch_e
    :cond_bc
    const/4 v4, 0x0

    goto/16 :goto_58

    :cond_bd
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_be

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_e
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;->Companion:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    goto/16 :goto_58

    :cond_be
    instance-of v5, v4, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    if-eqz v5, :cond_bf

    goto/16 :goto_58

    :cond_bf
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_c5

    const-class v5, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c0

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    goto/16 :goto_58

    :cond_c0
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    goto/16 :goto_58

    :cond_c1
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c2

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    goto :goto_58

    :cond_c2
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    goto :goto_58

    :cond_c3
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    goto :goto_58

    :cond_c4
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_bc

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    goto :goto_58

    :cond_c5
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_bc

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_f
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;->Companion:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    goto :goto_57

    :catch_f
    const/4 v4, 0x0

    :goto_57
    if-eqz v4, :cond_bc

    :goto_58
    if-nez v4, :cond_c8

    move-object v4, v1

    goto :goto_59

    :cond_c6
    if-nez v4, :cond_c7

    goto :goto_59

    :cond_c7
    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$36;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$36;

    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$37;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$37;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_c8
    :goto_59
    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$38;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$38;

    sget-object v7, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$39;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$39;

    sget-object v8, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$40;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$40;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v29, v2

    check-cast v29, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getPicker()Lcom/whoop/design/models/items/MultiWheelPickerModel;

    move-result-object v1

    if-nez v1, :cond_c9

    const/4 v4, 0x0

    goto :goto_5a

    :cond_c9
    invoke-interface {v1, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    if-nez v4, :cond_ca

    const/4 v2, 0x0

    :cond_ca
    check-cast v2, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    if-nez v2, :cond_cb

    move-object v2, v1

    :cond_cb
    move-object v4, v2

    :goto_5a
    const-string v2, "picker"

    if-eqz v10, :cond_cc

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_5b

    :cond_cc
    const/4 v5, 0x0

    :goto_5b
    if-eqz v5, :cond_d9

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_db

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_cd

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_cd

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_cd

    const/4 v4, 0x0

    goto/16 :goto_60

    :cond_cd
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_cf

    :catch_10
    :cond_ce
    const/4 v10, 0x0

    goto/16 :goto_5e

    :cond_cf
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_d0

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_10
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/MultiWheelPickerModel;->Companion:Lcom/whoop/design/models/items/MultiWheelPickerModel$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/MultiWheelPickerModel$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v10
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    goto/16 :goto_5e

    :cond_d0
    instance-of v5, v4, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    if-eqz v5, :cond_d1

    :goto_5c
    move-object v10, v4

    goto/16 :goto_5e

    :cond_d1
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_d7

    const-class v5, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d2

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    goto/16 :goto_5e

    :cond_d2
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    goto/16 :goto_5e

    :cond_d3
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    goto/16 :goto_5e

    :cond_d4
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d5

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    goto :goto_5e

    :cond_d5
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d6

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    goto :goto_5e

    :cond_d6
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_ce

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    goto :goto_5e

    :cond_d7
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_ce

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_11
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/MultiWheelPickerModel;->Companion:Lcom/whoop/design/models/items/MultiWheelPickerModel$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/MultiWheelPickerModel$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    goto :goto_5d

    :catch_11
    const/4 v4, 0x0

    :goto_5d
    if-eqz v4, :cond_ce

    goto/16 :goto_5c

    :goto_5e
    if-nez v10, :cond_d8

    move-object v4, v1

    goto :goto_60

    :cond_d8
    :goto_5f
    move-object v4, v10

    goto :goto_60

    :cond_d9
    if-nez v4, :cond_da

    goto :goto_60

    :cond_da
    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$41;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$41;

    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$42;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$42;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_5f

    :cond_db
    :goto_60
    sget-object v6, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$43;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$43;

    sget-object v7, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$44;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$44;

    sget-object v8, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$45;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$45;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v30, v1

    check-cast v30, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    new-instance v21, Lcom/whoop/design/models/items/NumericInputSliderModel;

    invoke-direct/range {v21 .. v30}, Lcom/whoop/design/models/items/NumericInputSliderModel;-><init>(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)V

    move-object/from16 v1, v21

    invoke-static {v1, v0}, Lcom/whoop/design/models/binding/ContentBindingResolverKt;->copyBindingsFrom(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/NumericInputSliderModel;

    return-object v0
.end method

.method public static synthetic generatedBind$default(Lcom/whoop/design/models/items/NumericInputSliderModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/NumericInputSliderModel;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/NumericInputSliderModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/NumericInputSliderModel;

    move-result-object p0

    return-object p0
.end method
