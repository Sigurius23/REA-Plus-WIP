.class public final Lcom/whoop/design/models/binding/DotPathBindingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u00a5\u0001\u0010\u000f\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\u0008\u001a\u00028\u00002\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0018\u0008\u0002\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0018\u0008\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\n2\u0016\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u00a5\u0001\u0010\u0015\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0008\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00022\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00130\u00122\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00012\u0016\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n2\u0016\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\nH\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "T",
        "",
        "",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "propertyName",
        "",
        "accumulatedState",
        "base",
        "propertyWireKey",
        "Lkotlin/Function1;",
        "Lkotlinx/serialization/json/JsonElement;",
        "serialize",
        "deserialize",
        "coerce",
        "overlayAggregateBinding",
        "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "wholeFieldSpec",
        "",
        "Ll83/k;",
        "pathBindings",
        "mergeAggregateBindingProperty",
        "(Ljava/lang/Object;Ljava/lang/String;Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "value",
        "anyToJsonElement",
        "(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;",
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
.method public static synthetic a(Ll83/k;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->mergeAggregateBindingProperty$lambda$0(Ll83/k;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final anyToJsonElement(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
    .locals 3

    if-nez p0, :cond_0

    sget-object p0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    return-object p0

    :cond_0
    instance-of v0, p0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_1

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/lang/Boolean;

    invoke-static {p0}, Lad3/m;->a(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/lang/Number;

    invoke-static {p0}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_4

    check-cast p0, Ljava/lang/Number;

    invoke-static {p0}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_5

    check-cast p0, Ljava/lang/Number;

    invoke-static {p0}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_5
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_6

    check-cast p0, Ljava/lang/Number;

    invoke-static {p0}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_6
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_7

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_7
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_a

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->anyToJsonElement(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    if-nez v1, :cond_8

    sget-object v1, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    :cond_8
    const-string v2, "element"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_9
    new-instance p0, Lkotlinx/serialization/json/JsonArray;

    invoke-direct {p0, v0}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_a
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final mergeAggregateBindingProperty(Ljava/lang/Object;Ljava/lang/String;Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    const-string v8, "propertyWireKey"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "pathBindings"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "accumulatedState"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "coerce"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v2, :cond_0

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    goto/16 :goto_3

    :cond_0
    sget-object v8, Ltr2/n;->a:Ltr2/n$a;

    const-string v9, "JdslBinding"

    invoke-virtual {v8, v9}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v8

    const/4 v9, 0x6

    const/4 v10, 0x0

    if-eqz v2, :cond_1

    move-object v11, v3

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_1

    move-object v12, v3

    check-cast v12, Ljava/lang/Iterable;

    new-instance v11, Lr61/h;

    invoke-direct {v11, v9}, Lr61/h;-><init>(I)V

    const/16 v17, 0x1e

    const-string v13, ", "

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v11

    invoke-static/range {v12 .. v17}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v11

    const-string v12, "\" has both a whole-field spec and path specs ["

    const-string v13, "]; whole-field wins and path specs are ignored."

    const-string v14, "aggregate_bindings: property \""

    invoke-static {v14, v1, v12, v11, v13}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-array v12, v10, [Lqr2/a$a;

    invoke-interface {v8, v11, v12}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    if-eqz v2, :cond_7

    invoke-static {v2, v4}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluateAggregateBinding(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;

    move-result-object v3

    instance-of v4, v3, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    if-eqz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    instance-of v4, v3, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    if-eqz v4, :cond_6

    check-cast v3, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-virtual {v3}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v5, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_5

    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_3

    return-object v3

    :cond_3
    instance-of v4, v3, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v4, :cond_4

    move-object v4, v3

    check-cast v4, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {v4}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-static {v4}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/design/models/binding/AggregateBinding;->getOperation()Ljava/lang/String;

    move-result-object v2

    const-string v4, "\" op="

    const-string v5, " raw="

    const-string v6, "aggregate binding apply failed (coerce): property=\""

    invoke-static {v6, v1, v4, v2, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v8, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0

    :cond_5
    return-object v4

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    const-string v2, "\""

    if-eqz v6, :cond_13

    if-nez v7, :cond_8

    goto/16 :goto_4

    :cond_8
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlinx/serialization/json/JsonElement;

    if-nez v5, :cond_9

    const-string v3, "aggregate binding serialize returned null: property=\""

    invoke-static {v3, v1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v8, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0

    :cond_9
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v11, v5

    move v5, v10

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll83/k;

    iget-object v12, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/design/models/binding/AggregateBinding;

    const/4 v13, 0x1

    new-array v14, v13, [C

    const/16 v15, 0x2e

    aput-char v15, v14, v10

    invoke-static {v12, v14, v10, v9}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    invoke-static {v14, v13}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ljava/lang/Iterable;

    instance-of v9, v15, Ljava/util/Collection;

    move-object/from16 p2, v14

    const-string v14, "\" path_key=\""

    if-eqz v9, :cond_a

    move-object v9, v15

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_a

    goto :goto_1

    :cond_a
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    if-nez v15, :cond_b

    const-string v6, "aggregate binding malformed: property=\""

    invoke-static {v6, v1, v14, v12, v2}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v9, v10, [Lqr2/a$a;

    invoke-interface {v8, v6, v9}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :cond_c
    :goto_1
    invoke-static {v6, v4}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluateAggregateBinding(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;

    move-result-object v6

    instance-of v9, v6, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    if-eqz v9, :cond_d

    const-string v6, "aggregate binding NoUpdate: property=\""

    invoke-static {v6, v1, v14, v12, v2}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v9, v10, [Lqr2/a$a;

    invoke-interface {v8, v6, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :cond_d
    const-string v9, "null cannot be cast to non-null type com.whoop.design.models.binding.AggregateEvaluation.Update"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-virtual {v6}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->anyToJsonElement(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v6

    if-nez v6, :cond_e

    goto :goto_2

    :cond_e
    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v9, v14

    const/4 v14, 0x0

    move-object v13, v6

    move-object v6, v9

    move-object v9, v12

    move-object/from16 v12, p2

    invoke-static/range {v11 .. v16}, Lcom/whoop/design/models/binding/JsonPathSetterKt;->setNestedValue$default(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;ZILjava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v12

    if-nez v12, :cond_f

    const-string v12, "aggregate binding invalid path: property=\""

    invoke-static {v12, v1, v6, v9, v2}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v9, v10, [Lqr2/a$a;

    invoke-interface {v8, v6, v9}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_2
    const/4 v9, 0x6

    goto/16 :goto_0

    :cond_f
    move-object v11, v12

    const/4 v5, 0x1

    goto :goto_2

    :cond_10
    if-nez v5, :cond_11

    :goto_3
    return-object v0

    :cond_11
    invoke-interface {v7, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_12

    const-string v3, "aggregate binding decode failed: property=\""

    invoke-static {v3, v1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v8, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0

    :cond_12
    return-object v3

    :cond_13
    :goto_4
    const-string v3, "aggregate binding path bindings present but serialize/deserialize not provided: property=\""

    invoke-static {v3, v1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v8, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0
.end method

.method private static final mergeAggregateBindingProperty$lambda$0(Ll83/k;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ll83/k;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;TT;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")TT;"
        }
    .end annotation

    const-string v0, "propertyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accumulatedState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coerce"

    move-object/from16 v5, p7

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_c

    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "JdslBinding"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-interface/range {p0 .. p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/binding/AggregateBinding;

    if-nez v1, :cond_1

    invoke-static {p1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->camelToSnakeCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/binding/AggregateBinding;

    :cond_1
    move-object v2, v1

    if-nez p4, :cond_2

    move-object v1, p1

    goto :goto_0

    :cond_2
    move-object/from16 v1, p4

    :goto_0
    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->camelToSnakeCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10, v6, v9}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-nez v11, :cond_4

    invoke-static {v10, v3, v9}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_3

    :cond_4
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v7, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    new-instance v8, Ll83/k;

    invoke-direct {v8, v7, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    new-instance v3, Lcom/whoop/design/models/binding/DotPathBindingsKt$overlayAggregateBinding$$inlined$sortedBy$1;

    invoke-direct {v3}, Lcom/whoop/design/models/binding/DotPathBindingsKt$overlayAggregateBinding$$inlined$sortedBy$1;-><init>()V

    invoke-static {p0, v3}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/whoop/design/models/binding/AggregateBinding;->getStates()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v6, p0, Ljava/util/Collection;

    if-eqz v6, :cond_7

    move-object v6, p0

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_7

    move v6, v9

    goto :goto_4

    :cond_7
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move v6, v9

    :cond_8
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7, p2}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_8

    add-int/lit8 v6, v6, 0x1

    if-ltz v6, :cond_9

    goto :goto_3

    :cond_9
    invoke-static {}, Lwb3/f;->c0()V

    const/4 p0, 0x0

    throw p0

    :cond_a
    :goto_4
    invoke-virtual {v2}, Lcom/whoop/design/models/binding/AggregateBinding;->getStates()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-eq v6, p0, :cond_b

    invoke-virtual {v2}, Lcom/whoop/design/models/binding/AggregateBinding;->getOperation()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2}, Lcom/whoop/design/models/binding/AggregateBinding;->getStates()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    const-string v8, " op="

    const-string v10, " resolved="

    const-string v11, "aggregate_binding field="

    invoke-static {v11, p1, v8, p0, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, "/"

    const-string v8, " (some states missing)"

    invoke-static {p0, v6, p1, v7, v8}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array p1, v9, [Lqr2/a$a;

    invoke-interface {v0, p0, p1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_b
    move-object v4, p2

    move-object v0, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-static/range {v0 .. v7}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->mergeAggregateBindingProperty(Ljava/lang/Object;Ljava/lang/String;Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_c
    :goto_5
    return-object p3
.end method

.method public static synthetic overlayAggregateBinding$default(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p9, p8, 0x10

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_2

    move-object p6, v0

    :cond_2
    invoke-static/range {p0 .. p7}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
