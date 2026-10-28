.class public final Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0003\u00a8\u0006\t"
    }
    d2 = {
        "generatedBind",
        "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
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
.method public static final generatedBind(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
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
            "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;"
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
    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTitle()Ljava/lang/String;

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
    const-string v2, "title"

    if-eqz v1, :cond_c

    invoke-static {v1, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :cond_c
    const/4 v6, 0x0

    :goto_6
    const-class v11, Ljava/lang/String;

    sget-object v12, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    sget-object v13, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    sget-object v14, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v15, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v16, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v17, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

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

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

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
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_8

    :cond_13
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_8

    :cond_14
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

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
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

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
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

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
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$1;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$2;

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_1a
    :goto_9
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$3;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$4;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$5;

    move-object v5, v2

    move-object/from16 v10, p1

    move-object/from16 v3, p3

    move-object/from16 v20, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1b

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    :cond_1b
    move-object/from16 v22, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getType()Ljava/lang/String;

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

    instance-of v4, v2, Ljava/lang/String;

    if-nez v4, :cond_1d

    const/4 v2, 0x0

    :cond_1d
    check-cast v2, Ljava/lang/String;

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

    check-cast v2, Ljava/lang/String;

    goto :goto_e

    :cond_23
    :goto_d
    move-object v2, v1

    :cond_24
    :goto_e
    move-object v4, v2

    :goto_f
    const-string v2, "type"

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

    move-object/from16 v7, v20

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_27

    const/4 v4, 0x0

    goto/16 :goto_13

    :cond_26
    move-object/from16 v7, v20

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

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_12

    :cond_2a
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_2b

    goto/16 :goto_12

    :cond_2b
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_31

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_12

    :cond_2c
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_12

    :cond_2d
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_12

    :cond_2e
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_12

    :cond_2f
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_30

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_12

    :cond_30
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_28

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_12

    :cond_31
    if-eqz v5, :cond_28

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_3
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

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
    move-object/from16 v7, v20

    goto :goto_13

    :cond_33
    move-object/from16 v7, v20

    if-nez v4, :cond_34

    goto :goto_13

    :cond_34
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$6;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$7;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_35
    :goto_13
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$8;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$9;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$10;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v32, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_36

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getType()Ljava/lang/String;

    move-result-object v2

    :cond_36
    move-object/from16 v23, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getItems()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_37

    const/4 v4, 0x0

    goto :goto_18

    :cond_37
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_39

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/util/List;

    if-nez v4, :cond_38

    const/4 v2, 0x0

    :cond_38
    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_3e

    move-object v2, v1

    goto :goto_17

    :cond_39
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

    :cond_3e
    :goto_17
    move-object v4, v2

    :goto_18
    const-string v2, "items"

    if-eqz v10, :cond_3f

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_19

    :cond_3f
    const/4 v5, 0x0

    :goto_19
    if-eqz v5, :cond_4d

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4c

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_40

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_40

    move-object/from16 v7, v32

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_41

    const/4 v4, 0x0

    goto/16 :goto_1c

    :cond_40
    move-object/from16 v7, v32

    :cond_41
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_43

    :catch_4
    :cond_42
    const/4 v4, 0x0

    goto/16 :goto_1b

    :cond_43
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    const-class v6, Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v5, :cond_44

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_4
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    new-instance v8, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-direct {v8, v5}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5, v8, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_1b

    :cond_44
    instance-of v5, v4, Ljava/util/List;

    if-eqz v5, :cond_45

    goto/16 :goto_1b

    :cond_45
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_4b

    const-class v5, Ljava/util/List;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_46

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_1b

    :cond_46
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_47

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_1b

    :cond_47
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_48

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto/16 :goto_1b

    :cond_48
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_49

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_1b

    :cond_49
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4a

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_1b

    :cond_4a
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_42

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_1b

    :cond_4b
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_42

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_5
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Lad3/c;->e()Lcd3/f;

    move-result-object v5

    new-instance v8, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-direct {v8, v5}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5, v8, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_1a

    :catch_5
    const/4 v4, 0x0

    :goto_1a
    if-eqz v4, :cond_42

    :goto_1b
    if-nez v4, :cond_4f

    move-object v4, v1

    goto :goto_1c

    :cond_4c
    move-object/from16 v7, v32

    goto :goto_1c

    :cond_4d
    move-object/from16 v7, v32

    if-nez v4, :cond_4e

    goto :goto_1c

    :cond_4e
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$11;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$12;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_4f
    :goto_1c
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$13;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$14;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$15;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v33, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_50

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    :cond_50
    move-object/from16 v24, v2

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getSpacingType()Ljava/lang/String;

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

    instance-of v4, v2, Ljava/lang/String;

    if-nez v4, :cond_52

    const/4 v2, 0x0

    :cond_52
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_59

    goto :goto_20

    :cond_53
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_58

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

    if-eqz v5, :cond_57

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_54

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_1e

    :cond_54
    const/4 v6, 0x0

    :goto_1e
    if-eqz v6, :cond_56

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_55

    goto :goto_1f

    :cond_55
    move-object v5, v6

    :cond_56
    :goto_1f
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_57
    move-object v2, v4

    check-cast v2, Ljava/lang/String;

    goto :goto_21

    :cond_58
    :goto_20
    move-object v2, v1

    :cond_59
    :goto_21
    move-object v4, v2

    :goto_22
    const-string v2, "spacingType"

    if-eqz v10, :cond_5a

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_23

    :cond_5a
    const/4 v5, 0x0

    :goto_23
    if-eqz v5, :cond_68

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_67

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_5b

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5b

    move-object/from16 v7, v33

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5c

    const/4 v4, 0x0

    goto/16 :goto_26

    :cond_5b
    move-object/from16 v7, v33

    :cond_5c
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_5e

    :catch_6
    :cond_5d
    const/4 v4, 0x0

    goto/16 :goto_25

    :cond_5e
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_5f

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

    goto/16 :goto_25

    :cond_5f
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_60

    goto/16 :goto_25

    :cond_60
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_66

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_61

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_25

    :cond_61
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_62

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_25

    :cond_62
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_63

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_25

    :cond_63
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_64

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_25

    :cond_64
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_65

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_25

    :cond_65
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_25

    :cond_66
    if-eqz v5, :cond_5d

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

    goto :goto_24

    :catch_7
    const/4 v4, 0x0

    :goto_24
    if-eqz v4, :cond_5d

    :goto_25
    if-nez v4, :cond_6a

    move-object v4, v1

    goto :goto_26

    :cond_67
    move-object/from16 v7, v33

    goto :goto_26

    :cond_68
    move-object/from16 v7, v33

    if-nez v4, :cond_69

    goto :goto_26

    :cond_69
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$16;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$17;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_6a
    :goto_26
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$18;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$19;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$20;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v34, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Ljava/lang/String;

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTitleTypography()Ljava/lang/String;

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

    instance-of v4, v2, Ljava/lang/String;

    if-nez v4, :cond_6c

    const/4 v2, 0x0

    :cond_6c
    check-cast v2, Ljava/lang/String;

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

    check-cast v2, Ljava/lang/String;

    goto :goto_2b

    :cond_72
    :goto_2a
    move-object v2, v1

    :cond_73
    :goto_2b
    move-object v4, v2

    :goto_2c
    const-string v2, "titleTypography"

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

    move-object/from16 v7, v34

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_76

    const/4 v4, 0x0

    goto/16 :goto_30

    :cond_75
    move-object/from16 v7, v34

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

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto/16 :goto_2f

    :cond_79
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_7a

    goto/16 :goto_2f

    :cond_7a
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_80

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7b

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_2f

    :cond_7b
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7c

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_2f

    :cond_7c
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7d

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_2f

    :cond_7d
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7e

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_2f

    :cond_7e
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7f

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_2f

    :cond_7f
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_77

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_2f

    :cond_80
    if-eqz v5, :cond_77

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
    move-object/from16 v7, v34

    goto :goto_30

    :cond_82
    move-object/from16 v7, v34

    if-nez v4, :cond_83

    goto :goto_30

    :cond_83
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$21;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$22;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_84
    :goto_30
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$23;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$24;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$25;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object/from16 v35, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Ljava/lang/String;

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getStyle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_85

    const/4 v4, 0x0

    goto :goto_36

    :cond_85
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_87

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-nez v4, :cond_86

    const/4 v2, 0x0

    :cond_86
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_8d

    goto :goto_34

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

    :goto_31
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_88

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_32

    :cond_88
    const/4 v6, 0x0

    :goto_32
    if-eqz v6, :cond_8a

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_89

    goto :goto_33

    :cond_89
    move-object v5, v6

    :cond_8a
    :goto_33
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_31

    :cond_8b
    move-object v2, v4

    check-cast v2, Ljava/lang/String;

    goto :goto_35

    :cond_8c
    :goto_34
    move-object v2, v1

    :cond_8d
    :goto_35
    move-object v4, v2

    :goto_36
    const-string v2, "style"

    if-eqz v10, :cond_8e

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_37

    :cond_8e
    const/4 v5, 0x0

    :goto_37
    if-eqz v5, :cond_9c

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_9b

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_8f

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8f

    move-object/from16 v7, v35

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_90

    const/4 v4, 0x0

    goto/16 :goto_3a

    :cond_8f
    move-object/from16 v7, v35

    :cond_90
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_92

    :catch_a
    :cond_91
    const/4 v4, 0x0

    goto/16 :goto_39

    :cond_92
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_93

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

    goto/16 :goto_39

    :cond_93
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_94

    goto/16 :goto_39

    :cond_94
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_9a

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_95

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_39

    :cond_95
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_96

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_39

    :cond_96
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_97

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_39

    :cond_97
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_98

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_39

    :cond_98
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_99

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_39

    :cond_99
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_91

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_39

    :cond_9a
    if-eqz v5, :cond_91

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

    goto :goto_38

    :catch_b
    const/4 v4, 0x0

    :goto_38
    if-eqz v4, :cond_91

    :goto_39
    if-nez v4, :cond_9e

    move-object v4, v1

    goto :goto_3a

    :cond_9b
    move-object/from16 v7, v35

    goto :goto_3a

    :cond_9c
    move-object/from16 v7, v35

    if-nez v4, :cond_9d

    goto :goto_3a

    :cond_9d
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$26;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$27;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_9e
    :goto_3a
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$28;

    move-object v1, v7

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$29;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$30;

    move-object v5, v2

    move-object/from16 v3, p3

    move-object v11, v1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v27, v2

    check-cast v27, Ljava/lang/String;

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getLeadingPadding()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_9f

    const/4 v4, 0x0

    goto :goto_40

    :cond_9f
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_a1

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Double;

    if-nez v4, :cond_a0

    const/4 v2, 0x0

    :cond_a0
    check-cast v2, Ljava/lang/Double;

    if-nez v2, :cond_a7

    goto :goto_3e

    :cond_a1
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_a6

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

    if-eqz v5, :cond_a5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_a2

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_3c

    :cond_a2
    const/4 v6, 0x0

    :goto_3c
    if-eqz v6, :cond_a4

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_a3

    goto :goto_3d

    :cond_a3
    move-object v5, v6

    :cond_a4
    :goto_3d
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3b

    :cond_a5
    move-object v2, v4

    check-cast v2, Ljava/lang/Double;

    goto :goto_3f

    :cond_a6
    :goto_3e
    move-object v2, v1

    :cond_a7
    :goto_3f
    move-object v4, v2

    :goto_40
    const-string v2, "leadingPadding"

    if-eqz v10, :cond_a8

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_41

    :cond_a8
    const/4 v5, 0x0

    :goto_41
    const-class v19, Ljava/lang/Double;

    if-eqz v5, :cond_b4

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_b6

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_a9

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_a9

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a9

    const/4 v4, 0x0

    goto/16 :goto_44

    :cond_a9
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_ab

    :catch_c
    :cond_aa
    const/4 v4, 0x0

    goto/16 :goto_43

    :cond_ab
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_ac

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_c
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    goto/16 :goto_43

    :cond_ac
    instance-of v5, v4, Ljava/lang/Double;

    if-eqz v5, :cond_ad

    goto/16 :goto_43

    :cond_ad
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_b3

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ae

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto/16 :goto_43

    :cond_ae
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_af

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto/16 :goto_43

    :cond_af
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b0

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    goto :goto_43

    :cond_b0
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_43

    :cond_b1
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b2

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_43

    :cond_b2
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_aa

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_43

    :cond_b3
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_aa

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_d
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_42

    :catch_d
    const/4 v4, 0x0

    :goto_42
    if-eqz v4, :cond_aa

    :goto_43
    if-nez v4, :cond_b6

    move-object v4, v1

    goto :goto_44

    :cond_b4
    if-nez v4, :cond_b5

    goto :goto_44

    :cond_b5
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$31;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$32;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$32;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_b6
    :goto_44
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$33;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$33;

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$34;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$34;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$35;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$35;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v28, v2

    check-cast v28, Ljava/lang/Double;

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTrailingPadding()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_b7

    const/4 v4, 0x0

    goto :goto_4a

    :cond_b7
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_b9

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Double;

    if-nez v4, :cond_b8

    const/4 v2, 0x0

    :cond_b8
    check-cast v2, Ljava/lang/Double;

    if-nez v2, :cond_bf

    goto :goto_48

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

    :goto_45
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_bd

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_ba

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_46

    :cond_ba
    const/4 v6, 0x0

    :goto_46
    if-eqz v6, :cond_bc

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_bb

    goto :goto_47

    :cond_bb
    move-object v5, v6

    :cond_bc
    :goto_47
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_45

    :cond_bd
    move-object v2, v4

    check-cast v2, Ljava/lang/Double;

    goto :goto_49

    :cond_be
    :goto_48
    move-object v2, v1

    :cond_bf
    :goto_49
    move-object v4, v2

    :goto_4a
    const-string v2, "trailingPadding"

    if-eqz v10, :cond_c0

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_4b

    :cond_c0
    const/4 v5, 0x0

    :goto_4b
    if-eqz v5, :cond_cc

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_ce

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_c1

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c1

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c1

    const/4 v4, 0x0

    goto/16 :goto_4e

    :cond_c1
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_c3

    :catch_e
    :cond_c2
    const/4 v4, 0x0

    goto/16 :goto_4d

    :cond_c3
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_c4

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    :try_start_e
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    goto/16 :goto_4d

    :cond_c4
    instance-of v5, v4, Ljava/lang/Double;

    if-eqz v5, :cond_c5

    goto/16 :goto_4d

    :cond_c5
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_cb

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c6

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto/16 :goto_4d

    :cond_c6
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c7

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto/16 :goto_4d

    :cond_c7
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c8

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    goto :goto_4d

    :cond_c8
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c9

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_4d

    :cond_c9
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ca

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_4d

    :cond_ca
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c2

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    goto :goto_4d

    :cond_cb
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_c2

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    :try_start_f
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    goto :goto_4c

    :catch_f
    const/4 v4, 0x0

    :goto_4c
    if-eqz v4, :cond_c2

    :goto_4d
    if-nez v4, :cond_ce

    move-object v4, v1

    goto :goto_4e

    :cond_cc
    if-nez v4, :cond_cd

    goto :goto_4e

    :cond_cd
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$36;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$36;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$37;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$37;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_ce
    :goto_4e
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$38;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$38;

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$39;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$39;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$40;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$40;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v29, v2

    check-cast v29, Ljava/lang/Double;

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getBindings()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_cf

    const/4 v4, 0x0

    goto :goto_54

    :cond_cf
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_d1

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/util/Map;

    if-nez v4, :cond_d0

    const/4 v2, 0x0

    :cond_d0
    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_d7

    goto :goto_52

    :cond_d1
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_d6

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_d2

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_50

    :cond_d2
    const/4 v6, 0x0

    :goto_50
    if-eqz v6, :cond_d4

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_d3

    goto :goto_51

    :cond_d3
    move-object v5, v6

    :cond_d4
    :goto_51
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4f

    :cond_d5
    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    goto :goto_53

    :cond_d6
    :goto_52
    move-object v2, v1

    :cond_d7
    :goto_53
    move-object v4, v2

    :goto_54
    const-string v2, "bindings"

    if-eqz v10, :cond_d8

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_55

    :cond_d8
    const/4 v5, 0x0

    :goto_55
    const-class v19, Ljava/util/Map;

    if-eqz v5, :cond_e4

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_e6

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_d9

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_d9

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d9

    const/4 v4, 0x0

    goto/16 :goto_58

    :cond_d9
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_db

    :catch_10
    :cond_da
    const/4 v4, 0x0

    goto/16 :goto_57

    :cond_db
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_dc

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

    goto/16 :goto_57

    :cond_dc
    instance-of v5, v4, Ljava/util/Map;

    if-eqz v5, :cond_dd

    goto/16 :goto_57

    :cond_dd
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_e3

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_de

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto/16 :goto_57

    :cond_de
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_df

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto/16 :goto_57

    :cond_df
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e0

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_57

    :cond_e0
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_57

    :cond_e1
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e2

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_57

    :cond_e2
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_da

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    goto :goto_57

    :cond_e3
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_da

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

    goto :goto_56

    :catch_11
    const/4 v4, 0x0

    :goto_56
    if-eqz v4, :cond_da

    :goto_57
    if-nez v4, :cond_e6

    move-object v4, v1

    goto :goto_58

    :cond_e4
    if-nez v4, :cond_e5

    goto :goto_58

    :cond_e5
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$41;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$41;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$42;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$42;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    :cond_e6
    :goto_58
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$43;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$43;

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$44;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$44;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$45;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$45;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v30, v2

    check-cast v30, Ljava/util/Map;

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_e7

    const/4 v4, 0x0

    goto :goto_5e

    :cond_e7
    instance-of v2, v1, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v2, :cond_e9

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {v2, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v2

    instance-of v4, v2, Ljava/util/Map;

    if-nez v4, :cond_e8

    const/4 v2, 0x0

    :cond_e8
    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_ef

    goto :goto_5c

    :cond_e9
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_ee

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_59
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_ed

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v6, :cond_ea

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_5a

    :cond_ea
    const/4 v6, 0x0

    :goto_5a
    if-eqz v6, :cond_ec

    invoke-interface {v6, v3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    if-nez v6, :cond_eb

    goto :goto_5b

    :cond_eb
    move-object v5, v6

    :cond_ec
    :goto_5b
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_59

    :cond_ed
    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    goto :goto_5d

    :cond_ee
    :goto_5c
    move-object v2, v1

    :cond_ef
    :goto_5d
    move-object v4, v2

    :goto_5e
    const-string v2, "aggregateBindings"

    if-eqz v10, :cond_f0

    invoke-static {v10, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_5f

    :cond_f0
    const/4 v5, 0x0

    :goto_5f
    if-eqz v5, :cond_fd

    invoke-static {v5, v3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_ff

    invoke-static {v2, v5, v6}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_f1

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_f1

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f1

    const/4 v4, 0x0

    goto/16 :goto_64

    :cond_f1
    invoke-static {v6}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_f3

    :catch_12
    :cond_f2
    const/4 v10, 0x0

    goto/16 :goto_62

    :cond_f3
    instance-of v5, v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_f4

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

    goto/16 :goto_62

    :cond_f4
    instance-of v5, v4, Ljava/util/Map;

    if-eqz v5, :cond_f5

    :goto_60
    move-object v10, v4

    goto/16 :goto_62

    :cond_f5
    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_fb

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f6

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto/16 :goto_62

    :cond_f6
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f7

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto/16 :goto_62

    :cond_f7
    invoke-static {v15}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f8

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto/16 :goto_62

    :cond_f8
    invoke-static {v14}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f9

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto :goto_62

    :cond_f9
    invoke-static {v13}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_fa

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->shortValue()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto :goto_62

    :cond_fa
    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f2

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    goto :goto_62

    :cond_fb
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_f2

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

    goto :goto_61

    :catch_13
    const/4 v4, 0x0

    :goto_61
    if-eqz v4, :cond_f2

    goto/16 :goto_60

    :goto_62
    if-nez v10, :cond_fc

    move-object v4, v1

    goto :goto_64

    :cond_fc
    :goto_63
    move-object v4, v10

    goto :goto_64

    :cond_fd
    if-nez v4, :cond_fe

    goto :goto_64

    :cond_fe
    sget-object v5, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$46;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$46;

    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$47;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$47;

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_63

    :cond_ff
    :goto_64
    sget-object v6, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$48;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$48;

    sget-object v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$49;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$49;

    sget-object v8, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$50;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt$generatedBind$$inlined$resolveBinding$50;

    move-object v5, v2

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v31, v1

    check-cast v31, Ljava/util/Map;

    new-instance v21, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    invoke-direct/range {v21 .. v31}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)V

    move-object/from16 v1, v21

    invoke-static {v1, v0}, Lcom/whoop/design/models/binding/ContentBindingResolverKt;->copyBindingsFrom(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    return-object v0
.end method

.method public static synthetic generatedBind$default(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    move-result-object p0

    return-object p0
.end method
