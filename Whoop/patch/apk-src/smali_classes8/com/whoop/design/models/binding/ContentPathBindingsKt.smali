.class public final Lcom/whoop/design/models/binding/ContentPathBindingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a{\u0010\u0000\u001a\u0002H\u0001\"\u0004\u0008\u0000\u0010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u0008\u001a\u0002H\u00012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0016\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0018\u00010\n\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "overlayContentPathBindings",
        "T",
        "contentBinding",
        "",
        "",
        "propertyWireKey",
        "accumulatedState",
        "",
        "base",
        "serialize",
        "Lkotlin/Function1;",
        "Lkotlinx/serialization/json/JsonElement;",
        "deserialize",
        "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
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
.method public static final overlayContentPathBindings(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;TT;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    const-string v5, "propertyWireKey"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "accumulatedState"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_10

    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->camelToSnakeCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11, v6, v10}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-nez v12, :cond_2

    invoke-static {v11, v5, v10}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_1

    :cond_2
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v5, Lcom/whoop/design/models/binding/ContentPathBindingsKt$overlayContentPathBindings$$inlined$sortedBy$1;

    invoke-direct {v5}, Lcom/whoop/design/models/binding/ContentPathBindingsKt$overlayContentPathBindings$$inlined$sortedBy$1;-><init>()V

    invoke-static {v8, v5}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    goto/16 :goto_3

    :cond_4
    if-eqz v3, :cond_10

    if-nez v4, :cond_5

    goto/16 :goto_3

    :cond_5
    sget-object v6, Ltr2/n;->a:Ltr2/n$a;

    const-string v7, "JdslBinding"

    invoke-virtual {v6, v7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v6

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-nez v3, :cond_6

    goto/16 :goto_3

    :cond_6
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v7, v10

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v9, "\""

    if-eqz v8, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const/4 v12, 0x1

    new-array v13, v12, [C

    const/16 v14, 0x2e

    aput-char v14, v13, v10

    const/4 v14, 0x6

    invoke-static {v11, v13, v10, v14}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    invoke-static {v13, v12}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Ljava/lang/Iterable;

    instance-of v15, v14, Ljava/util/Collection;

    const-string v12, "\" path_key=\""

    if-eqz v15, :cond_7

    move-object v15, v14

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_7

    goto :goto_2

    :cond_7
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_9

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    if-nez v15, :cond_8

    const-string v8, "binding malformed: property=\""

    invoke-static {v8, v0, v12, v11, v9}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-array v9, v10, [Lqr2/a$a;

    invoke-interface {v6, v8, v9}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_1

    :cond_9
    :goto_2
    invoke-static {v8, v1}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_a

    const-string v13, "content_binding state absent: property=\""

    const-string v14, "\" reference=\""

    invoke-static {v13, v0, v12, v11, v14}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-static {v8, v9, v11}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v8

    new-array v9, v10, [Lqr2/a$a;

    invoke-interface {v6, v8, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_1

    :cond_a
    invoke-static {v14}, Lcom/whoop/design/models/binding/DotPathBindingsKt;->anyToJsonElement(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v9

    if-nez v9, :cond_b

    goto :goto_1

    :cond_b
    const/4 v12, 0x1

    invoke-static {v3, v13, v9, v12}, Lcom/whoop/design/models/binding/JsonPathSetterKt;->setNestedValue(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Z)Lkotlinx/serialization/json/JsonElement;

    move-result-object v9

    if-nez v9, :cond_c

    goto/16 :goto_1

    :cond_c
    const-string v3, " key="

    const-string v7, " -> applied"

    const-string v13, "content_binding path="

    invoke-static {v13, v11, v3, v8, v7}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v7, v10, [Lqr2/a$a;

    invoke-interface {v6, v3, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    move-object v3, v9

    move v7, v12

    goto/16 :goto_1

    :cond_d
    if-nez v7, :cond_e

    goto :goto_3

    :cond_e
    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_f

    const-string v1, "content_binding path decode failed: property=\""

    invoke-static {v1, v0, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v10, [Lqr2/a$a;

    invoke-interface {v6, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v2

    :cond_f
    return-object v1

    :cond_10
    :goto_3
    return-object v2
.end method
