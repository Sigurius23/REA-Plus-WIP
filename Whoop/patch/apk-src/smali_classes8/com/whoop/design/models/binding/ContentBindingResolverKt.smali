.class public final Lcom/whoop/design/models/binding/ContentBindingResolverKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001an\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\n\u0008\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u0001H\u0003H\u0086\u0008\u00a2\u0006\u0002\u0010\u000c\u001aX\u0010\r\u001a\u0004\u0018\u0001H\u0003\"\n\u0008\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u0001H\u0003H\u0081\u0008\u00a2\u0006\u0002\u0010\u000e\u001a!\u0010\u000f\u001a\u0002H\u0003\"\u0008\u0008\u0000\u0010\u0003*\u00020\u0010*\u0002H\u00032\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "BLANK_STATE_CLEARS_FIELD_KEY",
        "",
        "resolveBinding",
        "T",
        "",
        "contentBinding",
        "",
        "aggregateBindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "propertyName",
        "accumulatedState",
        "original",
        "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;",
        "resolveContentBinding",
        "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;",
        "copyBindingsFrom",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "source",
        "(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;",
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


# static fields
.field public static final BLANK_STATE_CLEARS_FIELD_KEY:Ljava/lang/String; = "__archv2_blank_clears_field"


# direct methods
.method public static final copyBindingsFrom(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/whoop/design/models/WithGeneratedBindings;",
            ">(TT;",
            "Lcom/whoop/design/models/WithGeneratedBindings;",
            ")TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/whoop/design/models/WithGeneratedBindings;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/whoop/design/models/WithGeneratedBindings;->setBindings(Ljava/util/Map;)V

    invoke-interface {p1}, Lcom/whoop/design/models/WithGeneratedBindings;->getAggregateBindings()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/whoop/design/models/WithGeneratedBindings;->setAggregateBindings(Ljava/util/Map;)V

    return-object p0
.end method

.method public static final resolveBinding(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;TT;)TT;"
        }
    .end annotation

    const-string p1, "propertyName"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "accumulatedState"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-nez p4, :cond_0

    move-object p4, p1

    goto :goto_3

    :cond_0
    instance-of v0, p4, Lcom/whoop/design/models/WithGeneratedBindings;

    if-nez v0, :cond_c

    instance-of v0, p4, Ljava/util/List;

    if-eqz v0, :cond_5

    check-cast p4, Ljava/lang/Iterable;

    new-instance p0, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p4, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p0, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    instance-of v0, p4, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v0, :cond_1

    move-object v0, p4

    check-cast v0, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_1

    :cond_1
    move-object v0, p1

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {v0, p3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object p4, v0

    :cond_3
    :goto_2
    invoke-interface {p0, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p1

    :cond_5
    :goto_3
    if-eqz p0, :cond_6

    invoke-static {p0, p2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_4

    :cond_6
    move-object p0, p1

    :goto_4
    if-eqz p0, :cond_9

    invoke-static {p0, p3}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p4

    if-eqz p4, :cond_a

    invoke-static {p2, p0, p4}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p4}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p2, p0, Ljava/lang/String;

    if-eqz p2, :cond_7

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_7

    const-string p0, "__archv2_blank_clears_field"

    invoke-interface {p3, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    :cond_7
    invoke-static {p4}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_a

    instance-of p2, p0, Lkotlinx/serialization/json/JsonElement;

    if-eqz p2, :cond_8

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object p0

    iget-object p0, p0, Lad3/c;->b:Lcd3/f;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p1

    :cond_9
    if-nez p4, :cond_b

    :catch_0
    :cond_a
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p1

    :cond_b
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p1

    :cond_c
    check-cast p4, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {p4, p3}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p1
.end method

.method public static final resolveContentBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
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
            ">;TT;)TT;"
        }
    .end annotation

    const-string v0, "propertyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accumulatedState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    move-object v1, v0

    goto :goto_3

    :cond_0
    instance-of v1, p3, Lcom/whoop/design/models/WithGeneratedBindings;

    if-nez v1, :cond_d

    instance-of v1, p3, Ljava/util/List;

    if-eqz v1, :cond_5

    check-cast p3, Ljava/lang/Iterable;

    new-instance p0, Ljava/util/ArrayList;

    const/16 p1, 0xa

    invoke-static {p3, p1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    instance-of v1, p3, Lcom/whoop/design/models/WithGeneratedBindings;

    if-eqz v1, :cond_1

    move-object v1, p3

    check-cast v1, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_3

    invoke-interface {v1, p2}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    move-object p3, v1

    :cond_3
    :goto_2
    invoke-interface {p0, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0

    :cond_5
    move-object v1, p3

    :goto_3
    if-eqz p0, :cond_6

    invoke-static {p0, p1}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_4

    :cond_6
    move-object p0, v0

    :goto_4
    if-eqz p0, :cond_a

    invoke-static {p0, p2}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-static {p1, p0, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->logContentBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/String;

    if-eqz p1, :cond_7

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_7

    const-string p0, "__archv2_blank_clears_field"

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    return-object v0

    :cond_7
    invoke-static {v2}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_8

    return-object p3

    :cond_8
    instance-of p1, p0, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_9

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object p0

    iget-object p0, p0, Lad3/c;->b:Lcd3/f;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p3

    :cond_9
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0

    :cond_a
    if-nez v1, :cond_c

    :cond_b
    return-object v1

    :cond_c
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0

    :cond_d
    check-cast p3, Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-interface {p3, p2}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0
.end method
