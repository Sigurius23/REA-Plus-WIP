.class public final Lcom/whoop/design/models/binding/AggregateBindingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a!\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001ae\u0010\u000f\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00072\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u000c\u001a\u00028\u00002\u0016\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014\u001a)\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a\u001d\u0010 \u001a\u00020\u00192\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!\u001a)\u0010$\u001a\u00020\u00122\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u0002\u00a2\u0006\u0004\u0008$\u0010%\u001a\'\u0010(\u001a\u00020\u00192\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e2\u0006\u0010\'\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008(\u0010)\u001a)\u0010*\u001a\u00020\u00122\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u0002\u00a2\u0006\u0004\u0008*\u0010%\u001a\u0019\u0010,\u001a\u0004\u0018\u00010\n2\u0006\u0010+\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008,\u0010-\u001a\u0013\u0010.\u001a\u00020\u0019*\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008.\u0010/\u001a)\u00100\u001a\u00020\u00122\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u0002\u00a2\u0006\u0004\u00080\u0010%\u001a%\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eH\u0002\u00a2\u0006\u0004\u00081\u00102\u001a\u0017\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u00084\u00105\u001a\u0019\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0001\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u00087\u00108\u001a+\u00109\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002H\u0002\u00a2\u0006\u0004\u00089\u0010\u0014\u001a\u0017\u0010:\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008:\u0010;\u001a\u0011\u0010<\u001a\u00020\u0003*\u00020\u0003\u00a2\u0006\u0004\u0008<\u0010=\"\u0014\u0010>\u001a\u00020\u00038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008>\u0010?\"\u0014\u0010@\u001a\u00020\u00038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008@\u0010?*@\u0010D\"\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u000c\u0008A\u0012\u0008\u0008B\u0012\u0004\u0008\t0C2\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u000c\u0008A\u0012\u0008\u0008B\u0012\u0004\u0008\t0C\u00a8\u0006E"
    }
    d2 = {
        "Lkotlinx/serialization/json/JsonObject;",
        "element",
        "",
        "",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "parseAggregateBindings",
        "(Lkotlinx/serialization/json/JsonObject;)Ljava/util/Map;",
        "T",
        "aggregateBindings",
        "propertyName",
        "",
        "accumulatedState",
        "base",
        "Lkotlin/Function1;",
        "coerce",
        "overlayAggregateBinding",
        "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "binding",
        "Lcom/whoop/design/models/binding/AggregateEvaluation;",
        "evaluateAggregateBinding",
        "(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;",
        "evaluateStringReplace",
        "template",
        "interpolateInlineBindings",
        "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;",
        "",
        "containsInlineBindingToken",
        "(Ljava/lang/String;)Z",
        "toBindingString",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "",
        "aggregate",
        "evaluateEmptiness",
        "(Ljava/util/List;)Z",
        "Lkotlinx/serialization/json/JsonElement;",
        "parameter",
        "evaluateContains",
        "(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/binding/AggregateEvaluation;",
        "list",
        "value",
        "aggregateListContains",
        "(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Z",
        "evaluateMapCount",
        "el",
        "jsonElementToBindingValue",
        "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;",
        "isTruthyJdslSelection",
        "(Ljava/lang/Object;)Z",
        "evaluateBuildCheckoutWithItems",
        "cartItemsFromAggregate",
        "(Ljava/util/List;)Ljava/util/List;",
        "obj",
        "isValidCheckoutLineItem",
        "(Lkotlinx/serialization/json/JsonObject;)Z",
        "",
        "jsonElementToPositiveInt",
        "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Integer;",
        "evaluatePostStates",
        "stateValueToJsonElement",
        "(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;",
        "camelToSnakeCase",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "INLINE_BINDING_TOKEN_START",
        "Ljava/lang/String;",
        "INLINE_BINDING_TOKEN_END",
        "Lwc3/i;",
        "with",
        "Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;",
        "AggregateBindings",
        "state-binding-annotations"
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
.field private static final INLINE_BINDING_TOKEN_END:Ljava/lang/String; = "}}"

.field private static final INLINE_BINDING_TOKEN_START:Ljava/lang/String; = "{{"


# direct methods
.method public static synthetic a(Lyb3/k;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->camelToSnakeCase$lambda$0(Lyb3/k;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final aggregateListContains(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlinx/serialization/json/JsonElement;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->stateValueToJsonElement(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    instance-of v1, v0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    invoke-static {v3}, Lcom/whoop/design/models/binding/AggregateBindingKt;->jsonElementToBindingValue(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v1, p1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->aggregateListContains(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static final camelToSnakeCase(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyb3/p;

    const-string v1, "([A-Z])"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lr61/h;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lr61/h;-><init>(I)V

    invoke-virtual {v0, p0, v1}, Lyb3/p;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final camelToSnakeCase$lambda$0(Lyb3/k;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lyb3/n;

    invoke-virtual {p0}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toLowerCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final cartItemsFromAggregate(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonObject;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_8

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    instance-of v0, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v0, :cond_6

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    instance-of v2, v1, Lkotlinx/serialization/json/JsonObject;

    if-eqz v2, :cond_3

    check-cast v1, Lkotlinx/serialization/json/JsonObject;

    goto :goto_1

    :cond_3
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->isValidCheckoutLineItem(Lkotlinx/serialization/json/JsonObject;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_2

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v0

    :cond_6
    instance-of v0, p0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_7

    move-object v0, p0

    check-cast v0, Lkotlinx/serialization/json/JsonObject;

    invoke-static {v0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->isValidCheckoutLineItem(Lkotlinx/serialization/json/JsonObject;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_7
    return-object v1

    :cond_8
    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_9
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lkotlinx/serialization/json/JsonObject;

    if-eqz v2, :cond_a

    check-cast v1, Lkotlinx/serialization/json/JsonObject;

    goto :goto_4

    :cond_a
    move-object v1, v3

    :goto_4
    if-eqz v1, :cond_b

    invoke-static {v1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->isValidCheckoutLineItem(Lkotlinx/serialization/json/JsonObject;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_5

    :cond_b
    move-object v1, v3

    :goto_5
    if-eqz v1, :cond_9

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_c
    return-object v0
.end method

.method public static final containsInlineBindingToken(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "{{"

    invoke-static {p0, v1, v0}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    return v1

    :cond_0
    return v0
.end method

.method public static final evaluateAggregateBinding(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/binding/AggregateEvaluation;"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/binding/AggregateBinding;->getStates()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, p1}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/binding/AggregateBinding;->getOperation()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-direct {p0, v1}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object p0

    :cond_2
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toLowerCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x1

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v2, "string_replace"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_2

    :cond_3
    invoke-static {p0, p1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluateStringReplace(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;

    move-result-object p0

    return-object p0

    :sswitch_1
    const-string p1, "map_count"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/design/models/binding/AggregateBinding;->getOperationParameter()Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluateMapCount(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/binding/AggregateEvaluation;

    move-result-object p0

    return-object p0

    :sswitch_2
    const-string v2, "post_states"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_2

    :cond_5
    invoke-static {p0, p1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluatePostStates(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;

    move-result-object p0

    return-object p0

    :sswitch_3
    const-string p1, "build_checkout_with_items"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_2

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/binding/AggregateBinding;->getOperationParameter()Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluateBuildCheckoutWithItems(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/binding/AggregateEvaluation;

    move-result-object p0

    return-object p0

    :sswitch_4
    const-string p0, "is_not_empty"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_2

    :cond_7
    new-instance p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-static {v1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluateEmptiness(Ljava/util/List;)Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object p0

    :sswitch_5
    const-string p0, "is_empty"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_2

    :cond_8
    new-instance p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-static {v1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluateEmptiness(Ljava/util/List;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object p0

    :sswitch_6
    const-string p0, "count"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_2

    :cond_9
    new-instance p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object p0

    :sswitch_7
    const-string p1, "and"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0}, Lcom/whoop/design/models/binding/AggregateBinding;->getStates()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-ne p1, p0, :cond_d

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_b

    goto :goto_1

    :cond_b
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->isTruthyJdslSelection(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    :cond_d
    const/4 v3, 0x0

    :cond_e
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    new-instance p1, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-direct {p1, p0}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object p1

    :sswitch_8
    const-string p0, "identity"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto :goto_2

    :cond_f
    new-instance p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-direct {p0, v1}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object p0

    :sswitch_9
    const-string p1, "contains"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    :goto_2
    new-instance p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-direct {p0, v1}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object p0

    :cond_10
    invoke-virtual {p0}, Lcom/whoop/design/models/binding/AggregateBinding;->getOperationParameter()Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluateContains(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/binding/AggregateEvaluation;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x21d289e1 -> :sswitch_9
        -0x8178f42 -> :sswitch_8
        0x179d7 -> :sswitch_7
        0x5a7510f -> :sswitch_6
        0x6a6edf8 -> :sswitch_5
        0x1216040c -> :sswitch_4
        0x1c58c04f -> :sswitch_3
        0x28ea3e81 -> :sswitch_2
        0x49f2e46c -> :sswitch_1
        0x75cd1886 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final evaluateBuildCheckoutWithItems(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/binding/AggregateEvaluation;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlinx/serialization/json/JsonElement;",
            ")",
            "Lcom/whoop/design/models/binding/AggregateEvaluation;"
        }
    .end annotation

    invoke-static {p0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->cartItemsFromAggregate(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object p0

    :cond_0
    instance-of v0, p1, Lkotlinx/serialization/json/JsonObject;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lkotlinx/serialization/json/JsonObject;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    new-instance p1, Lkotlinx/serialization/json/JsonObject;

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-direct {p1, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    :cond_2
    const-string v0, "path"

    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_d

    invoke-static {v2}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    invoke-static {v2}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    if-nez v2, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v3, "source"

    invoke-virtual {p1, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v4, :cond_5

    invoke-static {v4}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    invoke-static {v4}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_5
    move-object v4, v1

    :goto_2
    const-string v5, "method"

    invoke-virtual {p1, v5}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlinx/serialization/json/JsonElement;

    if-eqz v6, :cond_6

    invoke-static {v6}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v6

    invoke-static {v6}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_6
    move-object v6, v1

    :goto_3
    const-string v7, "payload"

    invoke-virtual {p1, v7}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v8, p1, Lkotlinx/serialization/json/JsonObject;

    if-eqz v8, :cond_7

    move-object v1, p1

    check-cast v1, Lkotlinx/serialization/json/JsonObject;

    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v9, "element"

    if-eqz v8, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkotlinx/serialization/json/JsonObject;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    new-instance p0, Lkotlinx/serialization/json/JsonArray;

    invoke-direct {p0, p1}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v8, "cart_items"

    invoke-interface {p1, v8, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_a

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_9
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    const-string v11, "key"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    goto :goto_5

    :cond_a
    new-instance p0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p0, p1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    invoke-interface {p1, v7, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v4, :cond_b

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    invoke-static {p0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    :cond_b
    if-eqz v6, :cond_c

    invoke-static {v6}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    invoke-static {p0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v5, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    :cond_c
    new-instance p0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p0, p1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v0, "CHECKOUT_WITH_ITEMS"

    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "screen"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    const-string v0, "parameters"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    new-instance p0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p0, p1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    new-instance p1, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-direct {p1, p0}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_d
    :goto_6
    sget-object p0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object p0
.end method

.method private static final evaluateContains(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/binding/AggregateEvaluation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlinx/serialization/json/JsonElement;",
            ")",
            "Lcom/whoop/design/models/binding/AggregateEvaluation;"
        }
    .end annotation

    if-eqz p1, :cond_1

    instance-of v0, p1, Lkotlinx/serialization/json/JsonNull;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-static {p0, p1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->aggregateListContains(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    :goto_0
    sget-object p0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object p0
.end method

.method private static final evaluateEmptiness(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lkotlinx/serialization/json/JsonArray;

    if-eqz v4, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x0

    if-eq p0, v0, :cond_3

    return v3

    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonArray;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    return v3

    :cond_5
    return v1
.end method

.method private static final evaluateMapCount(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/binding/AggregateEvaluation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlinx/serialization/json/JsonElement;",
            ")",
            "Lcom/whoop/design/models/binding/AggregateEvaluation;"
        }
    .end annotation

    instance-of v0, p1, Lkotlinx/serialization/json/JsonArray;

    if-nez v0, :cond_0

    sget-object p0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object p0

    :cond_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-static {p0, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    if-nez p0, :cond_1

    sget-object p0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object p0

    :cond_1
    sget-object p1, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    if-ne p0, p1, :cond_2

    sget-object p0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object p0

    :cond_2
    new-instance p1, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-static {p0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->jsonElementToBindingValue(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method private static final evaluatePostStates(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/binding/AggregateEvaluation;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/binding/AggregateBinding;->getOperationParameter()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/serialization/json/JsonObject;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object v0

    :cond_1
    const-string v1, "method"

    invoke-virtual {v0, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-eqz v3, :cond_18

    invoke-static {v3}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-static {v3}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_18

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_3

    goto/16 :goto_d

    :cond_3
    const-string v4, "path"

    invoke-virtual {v0, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_17

    invoke-static {v5}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v5

    invoke-static {v5}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_17

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_5

    goto/16 :goto_c

    :cond_5
    const-string v6, "key_map"

    invoke-virtual {v0, v6}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lkotlinx/serialization/json/JsonObject;

    if-eqz v7, :cond_6

    check-cast v6, Lkotlinx/serialization/json/JsonObject;

    goto :goto_3

    :cond_6
    const/4 v6, 0x0

    :goto_3
    const-string v7, "media"

    invoke-virtual {v0, v7}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lkotlinx/serialization/json/JsonObject;

    if-eqz v9, :cond_7

    check-cast v8, Lkotlinx/serialization/json/JsonObject;

    goto :goto_4

    :cond_7
    const/4 v8, 0x0

    :goto_4
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/binding/AggregateBinding;->getStates()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const/4 v13, 0x0

    const-string v14, "element"

    if-eqz v12, :cond_11

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v15, p1

    invoke-static {v12, v15}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v16

    if-nez v16, :cond_9

    :cond_8
    move-object/from16 v16, v3

    goto :goto_b

    :cond_9
    if-eqz v6, :cond_c

    invoke-virtual {v6, v12}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lkotlinx/serialization/json/JsonElement;

    if-eqz v17, :cond_c

    invoke-static/range {v17 .. v17}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_c

    invoke-static/range {v17 .. v17}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_a

    goto :goto_6

    :cond_a
    const/16 v17, 0x0

    :goto_6
    if-nez v17, :cond_b

    goto :goto_7

    :cond_b
    move-object/from16 v2, v17

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v2, 0x1

    new-array v2, v2, [C

    const/16 v18, 0x24

    aput-char v18, v2, v13

    invoke-static {v12, v2}, Lyb3/r;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v2

    :goto_8
    if-eqz v8, :cond_d

    invoke-virtual {v8, v12}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lkotlinx/serialization/json/JsonElement;

    goto :goto_9

    :cond_d
    const/4 v12, 0x0

    :goto_9
    instance-of v13, v12, Lkotlinx/serialization/json/JsonObject;

    if-eqz v13, :cond_e

    check-cast v12, Lkotlinx/serialization/json/JsonObject;

    goto :goto_a

    :cond_e
    const/4 v12, 0x0

    :goto_a
    if-nez v12, :cond_f

    invoke-interface {v9, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    :cond_f
    invoke-static/range {v16 .. v16}, Lcom/whoop/design/models/binding/AggregateBindingKt;->stateValueToJsonElement(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v13

    move-object/from16 v16, v3

    const-string v3, "key"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v10, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-eqz v12, :cond_10

    invoke-interface {v9, v2, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    :goto_b
    move-object/from16 v3, v16

    goto :goto_5

    :cond_11
    move-object/from16 v16, v3

    new-instance v2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v2, v10}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    new-instance v3, Lad3/z;

    invoke-direct {v3, v13}, Lad3/z;-><init>(I)V

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static/range {v16 .. v16}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v8

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    invoke-static {v5}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    const-string v1, "body"

    invoke-interface {v6, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    new-instance v1, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v1, v6}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    const-string v2, "request"

    invoke-virtual {v3, v2, v1}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    const-string v1, "completion_destination"

    invoke-virtual {v0, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_12

    invoke-virtual {v3, v1, v2}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_12
    const-string v1, "dismiss_event"

    invoke-virtual {v0, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_13

    invoke-virtual {v3, v1, v2}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_13
    const-string v1, "metric_event"

    invoke-virtual {v0, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_14

    invoke-virtual {v3, v1, v2}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_14
    invoke-interface {v9}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_15

    new-instance v1, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v1, v9}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3, v7, v1}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_15
    const-string v1, "refresh_after_action"

    invoke-virtual {v0, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_16

    invoke-virtual {v3, v1, v0}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_16
    invoke-virtual {v3}, Lad3/z;->e()Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v2, "UPDATE"

    invoke-static {v2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "type"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    const-string v2, "parameters"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v2, "action"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    new-instance v1, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-direct {v1, v0}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_17
    :goto_c
    sget-object v0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object v0

    :cond_18
    :goto_d
    sget-object v0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object v0
.end method

.method private static final evaluateStringReplace(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/binding/AggregateEvaluation;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/whoop/design/models/binding/AggregateBinding;->getOperationParameter()Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    instance-of v0, p0, Lkotlinx/serialization/json/JsonObject;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lkotlinx/serialization/json/JsonObject;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object p0

    :cond_1
    const-string v0, "string_to_replace"

    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_2

    move-object v1, p0

    check-cast v1, Lkotlinx/serialization/json/JsonPrimitive;

    :cond_2
    if-eqz v1, :cond_4

    invoke-static {v1}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-static {p0, p1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->interpolateInlineBindings(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    :goto_1
    sget-object p0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;->INSTANCE:Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    return-object p0
.end method

.method public static final interpolateInlineBindings(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "template"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_4

    const-string v3, "{{"

    const/4 v4, 0x4

    invoke-static {p0, v3, v2, v1, v4}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v3

    if-gez v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p0, v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v3, 0x2

    const-string v6, "}}"

    invoke-static {p0, v6, v5, v1, v4}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v4

    if-gez v4, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p0, v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    invoke-virtual {v0, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/whoop/design/models/binding/StateLookupKt;->resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lcom/whoop/design/models/binding/AggregateBindingKt;->toBindingString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_3

    const-string v2, ""

    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v4, 0x2

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final isTruthyJdslSelection(Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_0
    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    const-string v1, "true"

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v3

    :cond_2
    invoke-static {p0}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-ne p0, v2, :cond_3

    return v2

    :cond_3
    return v3

    :cond_4
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_5

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_5
    instance-of v0, p0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_6

    check-cast p0, Lkotlinx/serialization/json/JsonObject;

    const-string v0, "sku"

    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_6

    return v2

    :cond_6
    return v3
.end method

.method private static final isValidCheckoutLineItem(Lkotlinx/serialization/json/JsonObject;)Z
    .locals 3

    const-string v0, "sku"

    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-ne v0, v2, :cond_1

    const-string v0, "quantity"

    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    if-nez p0, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Lcom/whoop/design/models/binding/AggregateBindingKt;->jsonElementToPositiveInt(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-lez p0, :cond_1

    return v2

    :cond_1
    return v1
.end method

.method private static final jsonElementToBindingValue(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_4

    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p0}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of v0, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v0, :cond_5

    return-object p0

    :cond_5
    instance-of v0, p0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_6

    return-object p0

    :cond_6
    sget-object v0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    const/4 p0, 0x0

    return-object p0

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final jsonElementToPositiveInt(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Integer;
    .locals 4

    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    double-to-int p0, v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-lez v0, :cond_3

    return-object p0

    :cond_3
    return-object v1
.end method

.method public static final overlayAggregateBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 1
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
            "Lkotlin/jvm/functions/Function1;",
            ")TT;"
        }
    .end annotation

    const-string v0, "propertyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accumulatedState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coerce"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/binding/AggregateBinding;

    if-nez v0, :cond_2

    :cond_0
    if-eqz p0, :cond_1

    invoke-static {p1}, Lcom/whoop/design/models/binding/AggregateBindingKt;->camelToSnakeCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/binding/AggregateBinding;

    :goto_0
    move-object v0, p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v0, p2}, Lcom/whoop/design/models/binding/AggregateBindingKt;->evaluateAggregateBinding(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;

    move-result-object p0

    instance-of p1, p0, Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    instance-of p1, p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    if-eqz p1, :cond_7

    check-cast p0, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;

    invoke-virtual {p0}, Lcom/whoop/design/models/binding/AggregateEvaluation$Update;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p4, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_6

    instance-of p1, p0, Ljava/lang/Boolean;

    if-eqz p1, :cond_4

    return-object p0

    :cond_4
    instance-of p1, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz p1, :cond_5

    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_2
    return-object p3

    :cond_6
    return-object p1

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final parseAggregateBindings(Lkotlinx/serialization/json/JsonObject;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonObject;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    instance-of v3, v1, Lkotlinx/serialization/json/JsonObject;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v1, Lkotlinx/serialization/json/JsonObject;

    goto :goto_1

    :cond_0
    move-object v1, v4

    :goto_1
    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "states"

    invoke-virtual {v1, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lkotlinx/serialization/json/JsonArray;

    if-eqz v5, :cond_2

    check-cast v3, Lkotlinx/serialization/json/JsonArray;

    goto :goto_2

    :cond_2
    move-object v3, v4

    :goto_2
    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlinx/serialization/json/JsonElement;

    instance-of v7, v6, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v7, :cond_5

    check-cast v6, Lkotlinx/serialization/json/JsonPrimitive;

    goto :goto_4

    :cond_5
    move-object v6, v4

    :goto_4
    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_6
    move-object v6, v4

    :goto_5
    if-eqz v6, :cond_4

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    const-string v3, "operation"

    invoke-virtual {v1, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-eqz v3, :cond_8

    invoke-static {v3}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-static {v3}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_8
    move-object v3, v4

    :goto_6
    const-string v6, "operation_parameter"

    invoke-virtual {v1, v6}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_9

    instance-of v6, v1, Lkotlinx/serialization/json/JsonNull;

    if-nez v6, :cond_9

    move-object v4, v1

    :cond_9
    new-instance v1, Lcom/whoop/design/models/binding/AggregateBinding;

    invoke-direct {v1, v5, v3, v4}, Lcom/whoop/design/models/binding/AggregateBinding;-><init>(Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_a
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p0

    return-object p0
.end method

.method private static final stateValueToJsonElement(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
    .locals 1

    instance-of v0, p0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/Boolean;

    invoke-static {p0}, Lad3/m;->a(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/lang/Number;

    invoke-static {p0}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/lang/Number;

    invoke-static {p0}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/lang/Float;

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
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_6

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    return-object p0
.end method

.method private static final toBindingString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_1

    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {p0}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/Long;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
