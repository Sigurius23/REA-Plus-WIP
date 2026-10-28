.class public final Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0003\u00a8\u0006\t"
    }
    d2 = {
        "generatedBind",
        "Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;",
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
.method public static final generatedBind(Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;",
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
            "Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;"
        }
    .end annotation

    const-string v2, "<this>"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "accumulatedState"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;->getChild()Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    move-result-object v2

    const/4 v4, 0x0

    if-nez v2, :cond_4

    move-object v5, v4

    :cond_3
    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_4
    invoke-interface {v2, p3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    if-nez v6, :cond_5

    move-object v5, v4

    :cond_5
    check-cast v5, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    if-nez v5, :cond_3

    move-object v5, v2

    goto :goto_0

    :goto_1
    const-string v2, "child"

    if-eqz p1, :cond_6

    invoke-static {p1, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_6
    move-object v7, v4

    :goto_2
    if-eqz v7, :cond_12

    invoke-static {v7, p3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_13

    invoke-static {v2, v7, v1}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_7

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7

    const-string v5, "__archv2_blank_clears_field"

    invoke-interface {p3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto/16 :goto_6

    :cond_7
    invoke-static {v1}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_8

    goto/16 :goto_5

    :cond_8
    instance-of v5, v1, Lkotlinx/serialization/json/JsonElement;

    const-class v7, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    if-eqz v5, :cond_9

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    iget-object v5, v5, Lad3/c;->b:Lcd3/f;

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v5, v7}, Lvb/g;->f(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v7

    check-cast v5, Lwc3/b;

    invoke-virtual {v7, v5, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_5

    :cond_9
    instance-of v5, v1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    if-eqz v5, :cond_a

    :goto_3
    move-object v4, v1

    goto/16 :goto_5

    :cond_a
    instance-of v5, v1, Ljava/lang/Number;

    if-eqz v5, :cond_10

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    goto/16 :goto_5

    :cond_b
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    goto/16 :goto_5

    :cond_c
    sget-object v8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    goto/16 :goto_5

    :cond_d
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    goto :goto_5

    :cond_e
    sget-object v8, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->shortValue()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    goto :goto_5

    :cond_f
    sget-object v8, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    move-result v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    goto :goto_5

    :cond_10
    instance-of v5, v1, Ljava/lang/String;

    if-eqz v5, :cond_11

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    :try_start_1
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v5

    iget-object v5, v5, Lad3/c;->b:Lcd3/f;

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v5, v7}, Lvb/g;->f(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v7

    check-cast v5, Lwc3/b;

    invoke-virtual {v7, v5, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    move-object v1, v4

    :goto_4
    if-eqz v1, :cond_11

    goto/16 :goto_3

    :catch_1
    :cond_11
    :goto_5
    if-nez v4, :cond_15

    move-object v4, v6

    goto :goto_6

    :cond_12
    if-nez v5, :cond_14

    :cond_13
    move-object v4, v5

    goto :goto_6

    :cond_14
    move-object v4, v5

    sget-object v5, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$1;->INSTANCE:Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$1;

    sget-object v6, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$2;->INSTANCE:Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$2;

    move-object v1, p1

    move-object v3, p3

    invoke-static/range {v1 .. v6}, Lcom/whoop/design/models/binding/ContentPathBindingsKt;->overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    :cond_15
    :goto_6
    sget-object v6, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$3;->INSTANCE:Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$3;

    sget-object v7, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$4;->INSTANCE:Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$4;

    sget-object v8, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$5;->INSTANCE:Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$5;

    move-object v5, v2

    move-object v1, p2

    move-object v3, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    if-nez v1, :cond_16

    invoke-virtual {p0}, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;->getChild()Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    move-result-object v1

    :cond_16
    new-instance v2, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;

    invoke-direct {v2, v1}, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;-><init>(Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;)V

    invoke-static {v2, p0}, Lcom/whoop/design/models/binding/ContentBindingResolverKt;->copyBindingsFrom(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;

    return-object v0
.end method

.method public static synthetic generatedBind$default(Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixtureStateBindingKt;->generatedBind(Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;

    move-result-object p0

    return-object p0
.end method
