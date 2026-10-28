.class public final Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0003\u00a8\u0006\t"
    }
    d2 = {
        "generatedBind",
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;",
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
.method public static final generatedBind(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;",
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
            "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;"
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
    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getRecommendationId()Ljava/lang/String;

    move-result-object v2

    const/16 v9, 0xa

    if-nez v2, :cond_4

    const/4 v4, 0x0

    :cond_3
    :goto_0
    move-object v5, v2

    goto :goto_5

    :cond_4
    instance-of v4, v2, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v4, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-nez v5, :cond_5

    const/4 v4, 0x0

    :cond_5
    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_3

    goto :goto_4

    :cond_6
    instance-of v4, v2, Ljava/util/List;

    if-eqz v4, :cond_b

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

    if-eqz v6, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v7, :cond_7

    move-object v7, v6

    check-cast v7, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_2

    :cond_7
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_9

    invoke-interface {v7, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v7

    if-nez v7, :cond_8

    goto :goto_3

    :cond_8
    move-object v6, v7

    :cond_9
    :goto_3
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_a
    move-object v4, v5

    check-cast v4, Ljava/lang/String;

    goto :goto_0

    :cond_b
    :goto_4
    move-object v4, v2

    goto :goto_0

    :goto_5
    const-string v2, "recommendationId"

    if-eqz v1, :cond_c

    invoke-static {v1, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :cond_c
    const/4 v6, 0x0

    :goto_6
    sget-object v11, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    sget-object v12, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    sget-object v13, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v14, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v15, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v16, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v7, "__archv2_blank_clears_field"

    if-eqz v6, :cond_18

    invoke-static {v6, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_1a

    invoke-static {v2, v6, v8}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v8}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Ljava/lang/String;

    if-eqz v6, :cond_d

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v4, 0x0

    goto/16 :goto_9

    :cond_d
    invoke-static {v8}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_f

    :catch_0
    :cond_e
    const/4 v4, 0x0

    goto/16 :goto_8

    :cond_f
    instance-of v6, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v6, :cond_10

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v8

    invoke-virtual {v8, v6, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :cond_10
    instance-of v6, v4, Ljava/lang/String;

    if-eqz v6, :cond_11

    goto/16 :goto_8

    :cond_11
    instance-of v8, v4, Ljava/lang/Number;

    if-eqz v8, :cond_17

    const-class v6, Ljava/lang/String;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_8

    :cond_12
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_8

    :cond_13
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_8

    :cond_14
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_15

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_8

    :cond_15
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_8

    :cond_16
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_8

    :cond_17
    if-eqz v6, :cond_e

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_1
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

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
    if-eqz v4, :cond_e

    :goto_8
    if-nez v4, :cond_1a

    move-object v4, v5

    goto :goto_9

    :cond_18
    if-nez v4, :cond_19

    goto :goto_9

    :cond_19
    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_1a
    :goto_9
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;

    move-object v5, v2

    move-object/from16 v10, p1

    move-object/from16 v3, p3

    move-object/from16 v19, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1b

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getRecommendationId()Ljava/lang/String;

    move-result-object v2

    :cond_1b
    move-object/from16 v21, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getStatus()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    move-result-object v1

    if-nez v1, :cond_1c

    const/4 v4, 0x0

    goto :goto_f

    :cond_1c
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_1e

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    if-nez v4, :cond_1d

    const/4 v2, 0x0

    :cond_1d
    check-cast v2, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    if-nez v2, :cond_24

    goto :goto_d

    :cond_1e
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_23

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_22

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_1f

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_b

    :cond_1f
    const/4 v6, 0x0

    :goto_b
    if-eqz v6, :cond_21

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_20

    goto :goto_c

    :cond_20
    move-object v5, v6

    :cond_21
    :goto_c
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_22
    move-object v2, v4

    check-cast v2, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    goto :goto_e

    :cond_23
    :goto_d
    move-object v2, v1

    :cond_24
    :goto_e
    move-object v4, v2

    :goto_f
    const-string v2, "status"

    if-eqz v10, :cond_25

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_10

    :cond_25
    const/4 v5, 0x0

    :goto_10
    if-eqz v5, :cond_33

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_32

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_26

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_26

    move-object/from16 v7, v19

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_27

    const/4 v4, 0x0

    goto/16 :goto_13

    :cond_26
    move-object/from16 v7, v19

    :cond_27
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_29

    :catch_2
    :cond_28
    const/4 v4, 0x0

    goto/16 :goto_12

    :cond_29
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_2a

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_2
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;->Companion:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_12

    :cond_2a
    instance-of v5, v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    if-eqz v5, :cond_2b

    goto/16 :goto_12

    :cond_2b
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_31

    const-class v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    goto/16 :goto_12

    :cond_2c
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    goto/16 :goto_12

    :cond_2d
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    goto :goto_12

    :cond_2e
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    goto :goto_12

    :cond_2f
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_30

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    goto :goto_12

    :cond_30
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_28

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    goto :goto_12

    :cond_31
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_28

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_3
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;->Companion:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_11

    :catch_3
    const/4 v4, 0x0

    :goto_11
    if-eqz v4, :cond_28

    :goto_12
    if-nez v4, :cond_35

    move-object v4, v1

    goto :goto_13

    :cond_32
    move-object/from16 v7, v19

    goto :goto_13

    :cond_33
    move-object/from16 v7, v19

    if-nez v4, :cond_34

    goto :goto_13

    :cond_34
    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_35
    :goto_13
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v31, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    if-nez v2, :cond_36

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getStatus()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    move-result-object v2

    :cond_36
    move-object/from16 v22, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getHeader()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-nez v1, :cond_37

    const/4 v4, 0x0

    goto :goto_19

    :cond_37
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_39

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/design/models/DesignSystemModel;

    if-nez v4, :cond_38

    const/4 v2, 0x0

    :cond_38
    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_3f

    goto :goto_17

    :cond_39
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_3e

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_3a

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_15

    :cond_3a
    const/4 v6, 0x0

    :goto_15
    if-eqz v6, :cond_3c

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_3b

    goto :goto_16

    :cond_3b
    move-object v5, v6

    :cond_3c
    :goto_16
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_3d
    move-object v2, v4

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_18

    :cond_3e
    :goto_17
    move-object v2, v1

    :cond_3f
    :goto_18
    move-object v4, v2

    :goto_19
    const-string v2, "header"

    if-eqz v10, :cond_40

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1a

    :cond_40
    const/4 v5, 0x0

    :goto_1a
    const-class v18, Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v5, :cond_4e

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4d

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_41

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_41

    move-object/from16 v7, v31

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_42

    const/4 v4, 0x0

    goto/16 :goto_1d

    :cond_41
    move-object/from16 v7, v31

    :cond_42
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_44

    :catch_4
    :cond_43
    const/4 v4, 0x0

    goto/16 :goto_1c

    :cond_44
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_45

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_4
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_1c

    :cond_45
    instance-of v5, v4, Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v5, :cond_46

    goto/16 :goto_1c

    :cond_46
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_4c

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_47

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto/16 :goto_1c

    :cond_47
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_48

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto/16 :goto_1c

    :cond_48
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_49

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_1c

    :cond_49
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4a

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_1c

    :cond_4a
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4b

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_1c

    :cond_4b
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_43

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_1c

    :cond_4c
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_43

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_5
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_1b

    :catch_5
    const/4 v4, 0x0

    :goto_1b
    if-eqz v4, :cond_43

    :goto_1c
    if-nez v4, :cond_50

    move-object v4, v1

    goto :goto_1d

    :cond_4d
    move-object/from16 v7, v31

    goto :goto_1d

    :cond_4e
    move-object/from16 v7, v31

    if-nez v4, :cond_4f

    goto :goto_1d

    :cond_4f
    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_50
    :goto_1d
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v32, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getBody()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_51

    const/4 v4, 0x0

    goto :goto_22

    :cond_51
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_53

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/util/List;

    if-nez v4, :cond_52

    const/4 v2, 0x0

    :cond_52
    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_58

    move-object v2, v1

    goto :goto_21

    :cond_53
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_57

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_54

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_1f

    :cond_54
    const/4 v6, 0x0

    :goto_1f
    if-eqz v6, :cond_56

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_55

    goto :goto_20

    :cond_55
    move-object v5, v6

    :cond_56
    :goto_20
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_57
    move-object v2, v4

    :cond_58
    :goto_21
    move-object v4, v2

    :goto_22
    const-string v2, "body"

    if-eqz v10, :cond_59

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_23

    :cond_59
    const/4 v5, 0x0

    :goto_23
    if-eqz v5, :cond_67

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_66

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_5a

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5a

    move-object/from16 v7, v32

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5b

    const/4 v4, 0x0

    goto/16 :goto_26

    :cond_5a
    move-object/from16 v7, v32

    :cond_5b
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_5d

    :catch_6
    :cond_5c
    const/4 v4, 0x0

    goto/16 :goto_25

    :cond_5d
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_5e

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_6
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    new-instance v6, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v5, v8}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-direct {v6, v5}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5, v6, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto/16 :goto_25

    :cond_5e
    instance-of v5, v4, Ljava/util/List;

    if-eqz v5, :cond_5f

    goto/16 :goto_25

    :cond_5f
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_65

    const-class v5, Ljava/util/List;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_60

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_25

    :cond_60
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_61

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_25

    :cond_61
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_62

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_25

    :cond_62
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_63

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_25

    :cond_63
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_64

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_25

    :cond_64
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_25

    :cond_65
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_5c

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_7
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    new-instance v6, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v5, v8}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-direct {v6, v5}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5, v6, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_24

    :catch_7
    const/4 v4, 0x0

    :goto_24
    if-eqz v4, :cond_5c

    :goto_25
    if-nez v4, :cond_69

    move-object v4, v1

    goto :goto_26

    :cond_66
    move-object/from16 v7, v32

    goto :goto_26

    :cond_67
    move-object/from16 v7, v32

    if-nez v4, :cond_68

    goto :goto_26

    :cond_68
    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_69
    :goto_26
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v33, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_6a

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getBody()Ljava/util/List;

    move-result-object v2

    :cond_6a
    move-object/from16 v24, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getCta()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-nez v1, :cond_6b

    const/4 v4, 0x0

    goto :goto_2c

    :cond_6b
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_6d

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/design/models/DesignSystemModel;

    if-nez v4, :cond_6c

    const/4 v2, 0x0

    :cond_6c
    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_73

    goto :goto_2a

    :cond_6d
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_72

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_27
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_71

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_6e

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_28

    :cond_6e
    const/4 v6, 0x0

    :goto_28
    if-eqz v6, :cond_70

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_6f

    goto :goto_29

    :cond_6f
    move-object v5, v6

    :cond_70
    :goto_29
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_71
    move-object v2, v4

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_2b

    :cond_72
    :goto_2a
    move-object v2, v1

    :cond_73
    :goto_2b
    move-object v4, v2

    :goto_2c
    const-string v2, "cta"

    if-eqz v10, :cond_74

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2d

    :cond_74
    const/4 v5, 0x0

    :goto_2d
    if-eqz v5, :cond_82

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_81

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_75

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_75

    move-object/from16 v7, v33

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_76

    const/4 v4, 0x0

    goto/16 :goto_30

    :cond_75
    move-object/from16 v7, v33

    :cond_76
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_78

    :catch_8
    :cond_77
    const/4 v4, 0x0

    goto/16 :goto_2f

    :cond_78
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_79

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_8
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto/16 :goto_2f

    :cond_79
    instance-of v5, v4, Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v5, :cond_7a

    goto/16 :goto_2f

    :cond_7a
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_80

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7b

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto/16 :goto_2f

    :cond_7b
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto/16 :goto_2f

    :cond_7c
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_2f

    :cond_7d
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_2f

    :cond_7e
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_2f

    :cond_7f
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_77

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_2f

    :cond_80
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_77

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_9
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_2e

    :catch_9
    const/4 v4, 0x0

    :goto_2e
    if-eqz v4, :cond_77

    :goto_2f
    if-nez v4, :cond_84

    move-object v4, v1

    goto :goto_30

    :cond_81
    move-object/from16 v7, v33

    goto :goto_30

    :cond_82
    move-object/from16 v7, v33

    if-nez v4, :cond_83

    goto :goto_30

    :cond_83
    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_84
    :goto_30
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v34, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_87

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Boolean;

    if-nez v4, :cond_85

    const/4 v2, 0x0

    :cond_85
    check-cast v2, Ljava/lang/Boolean;

    if-nez v2, :cond_86

    goto :goto_35

    :cond_86
    :goto_31
    move-object v4, v2

    goto :goto_36

    :cond_87
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_8c

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_32
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_88

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_33

    :cond_88
    const/4 v6, 0x0

    :goto_33
    if-eqz v6, :cond_8a

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_89

    goto :goto_34

    :cond_89
    move-object v5, v6

    :cond_8a
    :goto_34
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_32

    :cond_8b
    move-object v2, v4

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_31

    :cond_8c
    :goto_35
    move-object v4, v1

    :goto_36
    const-string v2, "isExpanded"

    if-eqz v10, :cond_8d

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_37

    :cond_8d
    const/4 v5, 0x0

    :goto_37
    const-class v18, Ljava/lang/Boolean;

    if-eqz v5, :cond_9b

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_9a

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_8e

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8e

    move-object/from16 v7, v34

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8f

    const/4 v4, 0x0

    goto/16 :goto_3a

    :cond_8e
    move-object/from16 v7, v34

    :cond_8f
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_91

    :catch_a
    :cond_90
    const/4 v4, 0x0

    goto/16 :goto_39

    :cond_91
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_92

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_a
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    goto/16 :goto_39

    :cond_92
    instance-of v5, v4, Ljava/lang/Boolean;

    if-eqz v5, :cond_93

    goto/16 :goto_39

    :cond_93
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_99

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_94

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto/16 :goto_39

    :cond_94
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_95

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto/16 :goto_39

    :cond_95
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_96

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_39

    :cond_96
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_97

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_39

    :cond_97
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_98

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_39

    :cond_98
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_90

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_39

    :cond_99
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_90

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_b
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_38

    :catch_b
    const/4 v4, 0x0

    :goto_38
    if-eqz v4, :cond_90

    :goto_39
    if-nez v4, :cond_9c

    move-object v4, v1

    goto :goto_3a

    :cond_9a
    move-object/from16 v7, v34

    goto :goto_3a

    :cond_9b
    move-object/from16 v7, v34

    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_9c
    :goto_3a
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v35, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_9d

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_3b
    move/from16 v26, v1

    goto :goto_3c

    :cond_9d
    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded()Z

    move-result v1

    goto :goto_3b

    :goto_3c
    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_a0

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Boolean;

    if-nez v4, :cond_9e

    const/4 v2, 0x0

    :cond_9e
    check-cast v2, Ljava/lang/Boolean;

    if-nez v2, :cond_9f

    goto :goto_41

    :cond_9f
    :goto_3d
    move-object v4, v2

    goto :goto_42

    :cond_a0
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_a5

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_a1

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_3f

    :cond_a1
    const/4 v6, 0x0

    :goto_3f
    if-eqz v6, :cond_a3

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_a2

    goto :goto_40

    :cond_a2
    move-object v5, v6

    :cond_a3
    :goto_40
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3e

    :cond_a4
    move-object v2, v4

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_3d

    :cond_a5
    :goto_41
    move-object v4, v1

    :goto_42
    const-string v2, "isSelected"

    if-eqz v10, :cond_a6

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_43

    :cond_a6
    const/4 v5, 0x0

    :goto_43
    if-eqz v5, :cond_b4

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_b3

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_a7

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_a7

    move-object/from16 v7, v35

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a8

    const/4 v4, 0x0

    goto/16 :goto_46

    :cond_a7
    move-object/from16 v7, v35

    :cond_a8
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_aa

    :catch_c
    :cond_a9
    const/4 v4, 0x0

    goto/16 :goto_45

    :cond_aa
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_ab

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_c
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    goto/16 :goto_45

    :cond_ab
    instance-of v5, v4, Ljava/lang/Boolean;

    if-eqz v5, :cond_ac

    goto/16 :goto_45

    :cond_ac
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_b2

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ad

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto/16 :goto_45

    :cond_ad
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ae

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto/16 :goto_45

    :cond_ae
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_af

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_45

    :cond_af
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b0

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_45

    :cond_b0
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_45

    :cond_b1
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a9

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_45

    :cond_b2
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_a9

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_d
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_44

    :catch_d
    const/4 v4, 0x0

    :goto_44
    if-eqz v4, :cond_a9

    :goto_45
    if-nez v4, :cond_b5

    move-object v4, v1

    goto :goto_46

    :cond_b3
    move-object/from16 v7, v35

    goto :goto_46

    :cond_b4
    move-object/from16 v7, v35

    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$32;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$32;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_b5
    :goto_46
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$33;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$33;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$34;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$34;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$35;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$35;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v36, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_b6

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_47
    move/from16 v27, v1

    goto :goto_48

    :cond_b6
    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected()Z

    move-result v1

    goto :goto_47

    :goto_48
    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getStyle()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    move-result-object v1

    if-nez v1, :cond_b7

    const/4 v4, 0x0

    goto :goto_4e

    :cond_b7
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_b9

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    if-nez v4, :cond_b8

    const/4 v2, 0x0

    :cond_b8
    check-cast v2, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    if-nez v2, :cond_bf

    goto :goto_4c

    :cond_b9
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_be

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_49
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_bd

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_ba

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_4a

    :cond_ba
    const/4 v6, 0x0

    :goto_4a
    if-eqz v6, :cond_bc

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_bb

    goto :goto_4b

    :cond_bb
    move-object v5, v6

    :cond_bc
    :goto_4b
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_49

    :cond_bd
    move-object v2, v4

    check-cast v2, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    goto :goto_4d

    :cond_be
    :goto_4c
    move-object v2, v1

    :cond_bf
    :goto_4d
    move-object v4, v2

    :goto_4e
    const-string v2, "style"

    if-eqz v10, :cond_c0

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_4f

    :cond_c0
    const/4 v5, 0x0

    :goto_4f
    if-eqz v5, :cond_ce

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_cd

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_c1

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c1

    move-object/from16 v7, v36

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c2

    const/4 v4, 0x0

    goto/16 :goto_52

    :cond_c1
    move-object/from16 v7, v36

    :cond_c2
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_c4

    :catch_e
    :cond_c3
    const/4 v4, 0x0

    goto/16 :goto_51

    :cond_c4
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_c5

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_e
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;->Companion:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    goto/16 :goto_51

    :cond_c5
    instance-of v5, v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    if-eqz v5, :cond_c6

    goto/16 :goto_51

    :cond_c6
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_cc

    const-class v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c7

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    goto/16 :goto_51

    :cond_c7
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c8

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    goto/16 :goto_51

    :cond_c8
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c9

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    goto :goto_51

    :cond_c9
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ca

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    goto :goto_51

    :cond_ca
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_cb

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    goto :goto_51

    :cond_cb
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    goto :goto_51

    :cond_cc
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_c3

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_f
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;->Companion:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle$Companion;->serializer()Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    check-cast v5, Lwc3/b;

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    goto :goto_50

    :catch_f
    const/4 v4, 0x0

    :goto_50
    if-eqz v4, :cond_c3

    :goto_51
    if-nez v4, :cond_d0

    move-object v4, v1

    goto :goto_52

    :cond_cd
    move-object/from16 v7, v36

    goto :goto_52

    :cond_ce
    move-object/from16 v7, v36

    if-nez v4, :cond_cf

    goto :goto_52

    :cond_cf
    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$36;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$36;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$37;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$37;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_d0
    :goto_52
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$38;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$38;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$39;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$39;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$40;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$40;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v37, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v28, v2

    check-cast v28, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getBindings()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_d1

    const/4 v4, 0x0

    goto :goto_58

    :cond_d1
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_d3

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/util/Map;

    if-nez v4, :cond_d2

    const/4 v2, 0x0

    :cond_d2
    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_d9

    goto :goto_56

    :cond_d3
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_d8

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_53
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_d4

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_54

    :cond_d4
    const/4 v6, 0x0

    :goto_54
    if-eqz v6, :cond_d6

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_d5

    goto :goto_55

    :cond_d5
    move-object v5, v6

    :cond_d6
    :goto_55
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_53

    :cond_d7
    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    goto :goto_57

    :cond_d8
    :goto_56
    move-object v2, v1

    :cond_d9
    :goto_57
    move-object v4, v2

    :goto_58
    const-string v2, "bindings"

    if-eqz v10, :cond_da

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_59

    :cond_da
    const/4 v5, 0x0

    :goto_59
    const-class v18, Ljava/util/Map;

    if-eqz v5, :cond_e8

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_e7

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_db

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_db

    move-object/from16 v7, v37

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_dc

    const/4 v4, 0x0

    goto/16 :goto_5c

    :cond_db
    move-object/from16 v7, v37

    :cond_dc
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_de

    :catch_10
    :cond_dd
    const/4 v4, 0x0

    goto/16 :goto_5b

    :cond_de
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_df

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_10
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v5, v6, v6}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    goto/16 :goto_5b

    :cond_df
    instance-of v5, v4, Ljava/util/Map;

    if-eqz v5, :cond_e0

    goto/16 :goto_5b

    :cond_e0
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_e6

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto/16 :goto_5b

    :cond_e1
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e2

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto/16 :goto_5b

    :cond_e2
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_5b

    :cond_e3
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_5b

    :cond_e4
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e5

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_5b

    :cond_e5
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_dd

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_5b

    :cond_e6
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_dd

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_11
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v5, v6, v6}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    goto :goto_5a

    :catch_11
    const/4 v4, 0x0

    :goto_5a
    if-eqz v4, :cond_dd

    :goto_5b
    if-nez v4, :cond_ea

    move-object v4, v1

    goto :goto_5c

    :cond_e7
    move-object/from16 v7, v37

    goto :goto_5c

    :cond_e8
    move-object/from16 v7, v37

    if-nez v4, :cond_e9

    goto :goto_5c

    :cond_e9
    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$41;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$41;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$42;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$42;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_ea
    :goto_5c
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$43;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$43;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$44;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$44;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$45;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$45;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v38, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v29, v2

    check-cast v29, Ljava/util/Map;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_eb

    const/4 v4, 0x0

    goto :goto_62

    :cond_eb
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_ed

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/util/Map;

    if-nez v4, :cond_ec

    const/4 v2, 0x0

    :cond_ec
    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_f3

    goto :goto_60

    :cond_ed
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_f2

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_ee

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_5e

    :cond_ee
    const/4 v6, 0x0

    :goto_5e
    if-eqz v6, :cond_f0

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_ef

    goto :goto_5f

    :cond_ef
    move-object v5, v6

    :cond_f0
    :goto_5f
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5d

    :cond_f1
    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    goto :goto_61

    :cond_f2
    :goto_60
    move-object v2, v1

    :cond_f3
    :goto_61
    move-object v4, v2

    :goto_62
    const-string v2, "aggregateBindings"

    if-eqz v10, :cond_f4

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_63

    :cond_f4
    const/4 v5, 0x0

    :goto_63
    if-eqz v5, :cond_101

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_103

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_f5

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_f5

    move-object/from16 v7, v38

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f5

    const/4 v4, 0x0

    goto/16 :goto_68

    :cond_f5
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_f7

    :catch_12
    :cond_f6
    const/4 v10, 0x0

    goto/16 :goto_66

    :cond_f7
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_f8

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_12
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v7, Lcom/whoop/design/models/binding/AggregateBinding;->Companion:Lcom/whoop/design/models/binding/AggregateBinding$Companion;

    invoke-virtual {v7}, Lcom/whoop/design/models/binding/AggregateBinding$Companion;->serializer()Lwc3/c;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v10
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_12

    goto/16 :goto_66

    :cond_f8
    instance-of v5, v4, Ljava/util/Map;

    if-eqz v5, :cond_f9

    :goto_64
    move-object v10, v4

    goto/16 :goto_66

    :cond_f9
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_ff

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_fa

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto/16 :goto_66

    :cond_fa
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_fb

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto/16 :goto_66

    :cond_fb
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_fc

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto/16 :goto_66

    :cond_fc
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_fd

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto :goto_66

    :cond_fd
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_fe

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto :goto_66

    :cond_fe
    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f6

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto :goto_66

    :cond_ff
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_f6

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_13
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v7, Lcom/whoop/design/models/binding/AggregateBinding;->Companion:Lcom/whoop/design/models/binding/AggregateBinding$Companion;

    invoke-virtual {v7}, Lcom/whoop/design/models/binding/AggregateBinding$Companion;->serializer()Lwc3/c;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_13

    goto :goto_65

    :catch_13
    const/4 v4, 0x0

    :goto_65
    if-eqz v4, :cond_f6

    goto/16 :goto_64

    :goto_66
    if-nez v10, :cond_100

    move-object v4, v1

    goto :goto_68

    :cond_100
    :goto_67
    move-object v4, v10

    goto :goto_68

    :cond_101
    if-nez v4, :cond_102

    goto :goto_68

    :cond_102
    sget-object v5, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$46;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$46;

    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$47;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$47;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_67

    :cond_103
    :goto_68
    sget-object v6, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$48;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$48;

    sget-object v7, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$49;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$49;

    sget-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$50;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$50;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v30, v1

    check-cast v30, Ljava/util/Map;

    new-instance v20, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    invoke-direct/range {v20 .. v30}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)V

    move-object/from16 v1, v20

    invoke-static {v1, v0}, Lcom/whoop/design/models/binding/ContentBindingResolverKt;->copyBindingsFrom(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    return-object v0
.end method

.method public static synthetic generatedBind$default(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    move-result-object p0

    return-object p0
.end method
