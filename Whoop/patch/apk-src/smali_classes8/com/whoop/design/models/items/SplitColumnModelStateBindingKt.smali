.class public final Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0003\u00a8\u0006\t"
    }
    d2 = {
        "generatedBind",
        "Lcom/whoop/design/models/items/SplitColumnModel;",
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
.method public static final generatedBind(Lcom/whoop/design/models/items/SplitColumnModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SplitColumnModel;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/SplitColumnModel;",
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
            "Lcom/whoop/design/models/items/SplitColumnModel;"
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
    invoke-virtual {v0}, Lcom/whoop/design/models/items/SplitColumnModel;->getTopContent()Ljava/util/List;

    move-result-object v2

    const/16 v9, 0xa

    if-nez v2, :cond_4

    const/4 v4, 0x0

    :cond_3
    :goto_0
    move-object v5, v2

    goto :goto_4

    :cond_4
    instance-of v4, v2, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v4, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v4

    instance-of v5, v4, Ljava/util/List;

    if-nez v5, :cond_5

    const/4 v4, 0x0

    :cond_5
    check-cast v4, Ljava/util/List;

    if-nez v4, :cond_3

    move-object v4, v2

    goto :goto_0

    :cond_6
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

    goto :goto_0

    :goto_4
    const-string v2, "topContent"

    if-eqz v1, :cond_b

    invoke-static {v1, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_b
    const/4 v6, 0x0

    :goto_5
    const-class v11, Ljava/util/List;

    const-class v12, Lcom/whoop/design/models/DesignSystemModel;

    sget-object v13, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    sget-object v14, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    sget-object v15, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v16, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v17, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v18, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v7, "__archv2_blank_clears_field"

    if-eqz v6, :cond_18

    invoke-static {v6, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_17

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

    move-object v10, v1

    const/4 v4, 0x0

    goto/16 :goto_9

    :cond_c
    invoke-static {v8}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_e

    :catch_0
    :cond_d
    const/4 v4, 0x0

    goto/16 :goto_7

    :cond_e
    instance-of v6, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v6, :cond_f

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6}, Lad3/c;->e()Lcd3/f;

    move-result-object v6

    new-instance v8, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v6, v10}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v6

    invoke-direct {v8, v6}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v8, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :cond_f
    instance-of v6, v4, Ljava/util/List;

    if-eqz v6, :cond_10

    goto/16 :goto_7

    :cond_10
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_16

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_7

    :cond_11
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_7

    :cond_12
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_7

    :cond_13
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_7

    :cond_14
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_15

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_7

    :cond_15
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_7

    :cond_16
    instance-of v6, v4, Ljava/lang/String;

    if-eqz v6, :cond_d

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_1
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6}, Lad3/c;->e()Lcd3/f;

    move-result-object v6

    new-instance v8, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v6, v10}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v6

    invoke-direct {v8, v6}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v8, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_d

    :goto_7
    if-nez v4, :cond_17

    move-object v10, v1

    move-object v4, v5

    goto :goto_9

    :cond_17
    :goto_8
    move-object v10, v1

    goto :goto_9

    :cond_18
    if-nez v4, :cond_19

    goto :goto_8

    :cond_19
    sget-object v5, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;

    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_8

    :goto_9
    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;

    sget-object v8, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v21, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1a

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SplitColumnModel;->getTopContent()Ljava/util/List;

    move-result-object v2

    :cond_1a
    move-object/from16 v23, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SplitColumnModel;->getBottomContent()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1b

    const/4 v4, 0x0

    goto :goto_e

    :cond_1b
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_1d

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/util/List;

    if-nez v4, :cond_1c

    const/4 v2, 0x0

    :cond_1c
    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_22

    move-object v2, v1

    goto :goto_d

    :cond_1d
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

    if-eqz v5, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_1e

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_b

    :cond_1e
    const/4 v6, 0x0

    :goto_b
    if-eqz v6, :cond_20

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_1f

    goto :goto_c

    :cond_1f
    move-object v5, v6

    :cond_20
    :goto_c
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_21
    move-object v2, v4

    :cond_22
    :goto_d
    move-object v4, v2

    :goto_e
    const-string v2, "bottomContent"

    if-eqz v10, :cond_23

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_f

    :cond_23
    const/4 v5, 0x0

    :goto_f
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

    move-object/from16 v7, v21

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_25

    const/4 v4, 0x0

    goto/16 :goto_12

    :cond_24
    move-object/from16 v7, v21

    :cond_25
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_27

    :catch_2
    :cond_26
    const/4 v4, 0x0

    goto/16 :goto_11

    :cond_27
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_28

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_2
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    new-instance v6, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v5, v8}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-direct {v6, v5}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5, v6, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_11

    :cond_28
    instance-of v5, v4, Ljava/util/List;

    if-eqz v5, :cond_29

    goto/16 :goto_11

    :cond_29
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_2f

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2a

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_11

    :cond_2a
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2b

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_11

    :cond_2b
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_11

    :cond_2c
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_11

    :cond_2d
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_11

    :cond_2e
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_11

    :cond_2f
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_26

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_3
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    new-instance v6, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v5, v8}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-direct {v6, v5}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5, v6, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_10

    :catch_3
    const/4 v4, 0x0

    :goto_10
    if-eqz v4, :cond_26

    :goto_11
    if-nez v4, :cond_33

    move-object v4, v1

    goto :goto_12

    :cond_30
    move-object/from16 v7, v21

    goto :goto_12

    :cond_31
    move-object/from16 v7, v21

    if-nez v4, :cond_32

    goto :goto_12

    :cond_32
    sget-object v5, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;

    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_33
    :goto_12
    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;

    sget-object v8, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object v11, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_34

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SplitColumnModel;->getBottomContent()Ljava/util/List;

    move-result-object v2

    :cond_34
    move-object/from16 v24, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SplitColumnModel;->getTopChildPadding()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_35

    const/4 v4, 0x0

    goto :goto_18

    :cond_35
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_37

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Double;

    if-nez v4, :cond_36

    const/4 v2, 0x0

    :cond_36
    check-cast v2, Ljava/lang/Double;

    if-nez v2, :cond_3d

    goto :goto_16

    :cond_37
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_3c

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_38

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_14

    :cond_38
    const/4 v6, 0x0

    :goto_14
    if-eqz v6, :cond_3a

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_39

    goto :goto_15

    :cond_39
    move-object v5, v6

    :cond_3a
    :goto_15
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_3b
    move-object v2, v4

    check-cast v2, Ljava/lang/Double;

    goto :goto_17

    :cond_3c
    :goto_16
    move-object v2, v1

    :cond_3d
    :goto_17
    move-object v4, v2

    :goto_18
    const-string v2, "topChildPadding"

    if-eqz v10, :cond_3e

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_19

    :cond_3e
    const/4 v5, 0x0

    :goto_19
    const-class v12, Ljava/lang/Double;

    if-eqz v5, :cond_4a

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4c

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_3f

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3f

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3f

    const/4 v4, 0x0

    goto/16 :goto_1c

    :cond_3f
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_41

    :catch_4
    :cond_40
    const/4 v4, 0x0

    goto/16 :goto_1b

    :cond_41
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_42

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_4
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_1b

    :cond_42
    instance-of v5, v4, Ljava/lang/Double;

    if-eqz v5, :cond_43

    goto/16 :goto_1b

    :cond_43
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_49

    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_44

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto/16 :goto_1b

    :cond_44
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_45

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto/16 :goto_1b

    :cond_45
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_46

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    goto :goto_1b

    :cond_46
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_47

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_1b

    :cond_47
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_48

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_1b

    :cond_48
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_40

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_1b

    :cond_49
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_40

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_5
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_1a

    :catch_5
    const/4 v4, 0x0

    :goto_1a
    if-eqz v4, :cond_40

    :goto_1b
    if-nez v4, :cond_4c

    move-object v4, v1

    goto :goto_1c

    :cond_4a
    if-nez v4, :cond_4b

    goto :goto_1c

    :cond_4b
    sget-object v5, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;

    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_4c
    :goto_1c
    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;

    sget-object v7, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;

    sget-object v8, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Ljava/lang/Double;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SplitColumnModel;->getBottomChildPadding()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_4d

    const/4 v4, 0x0

    goto :goto_22

    :cond_4d
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_4f

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Double;

    if-nez v4, :cond_4e

    const/4 v2, 0x0

    :cond_4e
    check-cast v2, Ljava/lang/Double;

    if-nez v2, :cond_55

    goto :goto_20

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

    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_53

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_50

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_1e

    :cond_50
    const/4 v6, 0x0

    :goto_1e
    if-eqz v6, :cond_52

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_51

    goto :goto_1f

    :cond_51
    move-object v5, v6

    :cond_52
    :goto_1f
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_53
    move-object v2, v4

    check-cast v2, Ljava/lang/Double;

    goto :goto_21

    :cond_54
    :goto_20
    move-object v2, v1

    :cond_55
    :goto_21
    move-object v4, v2

    :goto_22
    const-string v2, "bottomChildPadding"

    if-eqz v10, :cond_56

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_23

    :cond_56
    const/4 v5, 0x0

    :goto_23
    if-eqz v5, :cond_62

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_64

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_57

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_57

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_57

    const/4 v4, 0x0

    goto/16 :goto_26

    :cond_57
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_59

    :catch_6
    :cond_58
    const/4 v4, 0x0

    goto/16 :goto_25

    :cond_59
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_5a

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_6
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto/16 :goto_25

    :cond_5a
    instance-of v5, v4, Ljava/lang/Double;

    if-eqz v5, :cond_5b

    goto/16 :goto_25

    :cond_5b
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_61

    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto/16 :goto_25

    :cond_5c
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto/16 :goto_25

    :cond_5d
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    goto :goto_25

    :cond_5e
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_25

    :cond_5f
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_60

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_25

    :cond_60
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_58

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_25

    :cond_61
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_58

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_7
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_24

    :catch_7
    const/4 v4, 0x0

    :goto_24
    if-eqz v4, :cond_58

    :goto_25
    if-nez v4, :cond_64

    move-object v4, v1

    goto :goto_26

    :cond_62
    if-nez v4, :cond_63

    goto :goto_26

    :cond_63
    sget-object v5, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;

    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_64
    :goto_26
    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;

    sget-object v7, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;

    sget-object v8, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Ljava/lang/Double;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SplitColumnModel;->getBindings()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_65

    const/4 v4, 0x0

    goto :goto_2c

    :cond_65
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_67

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/util/Map;

    if-nez v4, :cond_66

    const/4 v2, 0x0

    :cond_66
    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_6d

    goto :goto_2a

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

    :goto_27
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_68

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_28

    :cond_68
    const/4 v6, 0x0

    :goto_28
    if-eqz v6, :cond_6a

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_69

    goto :goto_29

    :cond_69
    move-object v5, v6

    :cond_6a
    :goto_29
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_6b
    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    goto :goto_2b

    :cond_6c
    :goto_2a
    move-object v2, v1

    :cond_6d
    :goto_2b
    move-object v4, v2

    :goto_2c
    const-string v2, "bindings"

    if-eqz v10, :cond_6e

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2d

    :cond_6e
    const/4 v5, 0x0

    :goto_2d
    const-class v12, Ljava/util/Map;

    if-eqz v5, :cond_7a

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_7c

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_6f

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6f

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6f

    const/4 v4, 0x0

    goto/16 :goto_30

    :cond_6f
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_71

    :catch_8
    :cond_70
    const/4 v4, 0x0

    goto/16 :goto_2f

    :cond_71
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_72

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_8
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
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto/16 :goto_2f

    :cond_72
    instance-of v5, v4, Ljava/util/Map;

    if-eqz v5, :cond_73

    goto/16 :goto_2f

    :cond_73
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_79

    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_74

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto/16 :goto_2f

    :cond_74
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_75

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto/16 :goto_2f

    :cond_75
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_76

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_2f

    :cond_76
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_77

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_2f

    :cond_77
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_78

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_2f

    :cond_78
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_70

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_2f

    :cond_79
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_70

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_9
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
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_2e

    :catch_9
    const/4 v4, 0x0

    :goto_2e
    if-eqz v4, :cond_70

    :goto_2f
    if-nez v4, :cond_7c

    move-object v4, v1

    goto :goto_30

    :cond_7a
    if-nez v4, :cond_7b

    goto :goto_30

    :cond_7b
    sget-object v5, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;

    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_7c
    :goto_30
    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;

    sget-object v7, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;

    sget-object v8, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v27, v2

    check-cast v27, Ljava/util/Map;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SplitColumnModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_7d

    const/4 v4, 0x0

    goto :goto_36

    :cond_7d
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_7f

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/util/Map;

    if-nez v4, :cond_7e

    const/4 v2, 0x0

    :cond_7e
    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_85

    goto :goto_34

    :cond_7f
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_84

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_31
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_83

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_80

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_32

    :cond_80
    const/4 v6, 0x0

    :goto_32
    if-eqz v6, :cond_82

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_81

    goto :goto_33

    :cond_81
    move-object v5, v6

    :cond_82
    :goto_33
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_31

    :cond_83
    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    goto :goto_35

    :cond_84
    :goto_34
    move-object v2, v1

    :cond_85
    :goto_35
    move-object v4, v2

    :goto_36
    const-string v2, "aggregateBindings"

    if-eqz v10, :cond_86

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_37

    :cond_86
    const/4 v5, 0x0

    :goto_37
    if-eqz v5, :cond_93

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_95

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_87

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_87

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_87

    const/4 v4, 0x0

    goto/16 :goto_3c

    :cond_87
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_89

    :catch_a
    :cond_88
    const/4 v10, 0x0

    goto/16 :goto_3a

    :cond_89
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_8a

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_a
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
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    goto/16 :goto_3a

    :cond_8a
    instance-of v5, v4, Ljava/util/Map;

    if-eqz v5, :cond_8b

    :goto_38
    move-object v10, v4

    goto/16 :goto_3a

    :cond_8b
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_91

    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto/16 :goto_3a

    :cond_8c
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto/16 :goto_3a

    :cond_8d
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto/16 :goto_3a

    :cond_8e
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto :goto_3a

    :cond_8f
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_90

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto :goto_3a

    :cond_90
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_88

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto :goto_3a

    :cond_91
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_88

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_b
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
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_39

    :catch_b
    const/4 v4, 0x0

    :goto_39
    if-eqz v4, :cond_88

    goto/16 :goto_38

    :goto_3a
    if-nez v10, :cond_92

    move-object v4, v1

    goto :goto_3c

    :cond_92
    :goto_3b
    move-object v4, v10

    goto :goto_3c

    :cond_93
    if-nez v4, :cond_94

    goto :goto_3c

    :cond_94
    sget-object v5, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;

    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_3b

    :cond_95
    :goto_3c
    sget-object v6, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;

    sget-object v7, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;

    sget-object v8, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;->INSTANCE:Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v28, v1

    check-cast v28, Ljava/util/Map;

    new-instance v22, Lcom/whoop/design/models/items/SplitColumnModel;

    invoke-direct/range {v22 .. v28}, Lcom/whoop/design/models/items/SplitColumnModel;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)V

    move-object/from16 v1, v22

    invoke-static {v1, v0}, Lcom/whoop/design/models/binding/ContentBindingResolverKt;->copyBindingsFrom(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/SplitColumnModel;

    return-object v0
.end method

.method public static synthetic generatedBind$default(Lcom/whoop/design/models/items/SplitColumnModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SplitColumnModel;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/models/items/SplitColumnModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/SplitColumnModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SplitColumnModel;

    move-result-object p0

    return-object p0
.end method
