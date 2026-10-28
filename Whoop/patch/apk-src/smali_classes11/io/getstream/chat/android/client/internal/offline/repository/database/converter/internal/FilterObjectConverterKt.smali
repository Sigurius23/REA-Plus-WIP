.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010&\n\u0002\u0008\u0012\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0005H\u0002\u001a\u0018\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\u0001H\u0002\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "toFilterObject",
        "Lio/getstream/chat/android/models/FilterObject;",
        "",
        "",
        "",
        "",
        "toMap",
        "KEY_EXIST",
        "KEY_CONTAINS",
        "KEY_AND",
        "KEY_OR",
        "KEY_NOR",
        "KEY_EQUALS",
        "KEY_NOT_EQUALS",
        "KEY_GREATER_THAN",
        "KEY_GREATER_THAN_OR_EQUALS",
        "KEY_LESS_THAN",
        "KEY_LESS_THAN_OR_EQUALS",
        "KEY_IN",
        "KEY_NOT_IN",
        "KEY_AUTOCOMPLETE",
        "KEY_DISTINCT",
        "KEY_MEMBERS",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final KEY_AND:Ljava/lang/String; = "$and"

.field private static final KEY_AUTOCOMPLETE:Ljava/lang/String; = "$autocomplete"

.field private static final KEY_CONTAINS:Ljava/lang/String; = "$contains"

.field private static final KEY_DISTINCT:Ljava/lang/String; = "distinct"

.field private static final KEY_EQUALS:Ljava/lang/String; = "$eq"

.field private static final KEY_EXIST:Ljava/lang/String; = "$exists"

.field private static final KEY_GREATER_THAN:Ljava/lang/String; = "$gt"

.field private static final KEY_GREATER_THAN_OR_EQUALS:Ljava/lang/String; = "$gte"

.field private static final KEY_IN:Ljava/lang/String; = "$in"

.field private static final KEY_LESS_THAN:Ljava/lang/String; = "$lt"

.field private static final KEY_LESS_THAN_OR_EQUALS:Ljava/lang/String; = "$lte"

.field private static final KEY_MEMBERS:Ljava/lang/String; = "members"

.field private static final KEY_NOR:Ljava/lang/String; = "$nor"

.field private static final KEY_NOT_EQUALS:Ljava/lang/String; = "$ne"

.field private static final KEY_NOT_IN:Ljava/lang/String; = "$nin"

.field private static final KEY_OR:Ljava/lang/String; = "$or"


# direct methods
.method public static final synthetic access$toFilterObject(Ljava/util/Map;)Lio/getstream/chat/android/models/FilterObject;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;->toFilterObject(Ljava/util/Map;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;->toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final toFilterObject(Ljava/util/Map$Entry;)Lio/getstream/chat/android/models/FilterObject;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/FilterObject;"
        }
    .end annotation

    .line 13
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x9507

    const/4 v3, 0x0

    const/16 v4, 0xa

    const-string v5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>"

    if-eq v1, v2, :cond_6

    const v2, 0x11d733

    if-eq v1, v2, :cond_3

    const v2, 0x12082d

    if-eq v1, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v1, "$nor"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 14
    :cond_1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 17
    check-cast v1, Ljava/util/Map;

    .line 18
    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;->toFilterObject(Ljava/util/Map;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v1

    .line 19
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 20
    :cond_2
    new-array p0, v3, [Lio/getstream/chat/android/models/FilterObject;

    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    .line 21
    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->nor([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 22
    :cond_3
    const-string v1, "$and"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    .line 23
    :cond_4
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/Map;

    .line 27
    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;->toFilterObject(Ljava/util/Map;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v1

    .line 28
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 29
    :cond_5
    new-array p0, v3, [Lio/getstream/chat/android/models/FilterObject;

    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    .line 30
    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->and([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 31
    :cond_6
    const-string v1, "$or"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 32
    :goto_2
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 33
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v2, "$autocomplete"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 34
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->autocomplete(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 35
    :sswitch_1
    const-string v2, "$exists"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 36
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 37
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->exists(Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_7
    if-nez v0, :cond_8

    .line 38
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->notExists(Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 39
    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 40
    :sswitch_2
    const-string v2, "$nin"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 41
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->nin(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 42
    :sswitch_3
    const-string v2, "$lte"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 43
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->lessThanEquals(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 44
    :sswitch_4
    const-string v2, "$gte"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 45
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->greaterThanEquals(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 46
    :sswitch_5
    const-string v2, "$ne"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 47
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->ne(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 48
    :sswitch_6
    const-string v2, "$lt"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 49
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->lessThan(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 50
    :sswitch_7
    const-string v2, "$in"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 51
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->in(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 52
    :sswitch_8
    const-string v2, "$gt"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 53
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->greaterThan(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 54
    :sswitch_9
    const-string v2, "$eq"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 55
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->eq(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 56
    :sswitch_a
    const-string v2, "$contains"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 57
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->contains(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 58
    :cond_9
    :goto_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FilterObject can be create with this map `"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "`"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_a
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 62
    check-cast v1, Ljava/util/Map;

    .line 63
    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;->toFilterObject(Ljava/util/Map;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v1

    .line 64
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 65
    :cond_b
    new-array p0, v3, [Lio/getstream/chat/android/models/FilterObject;

    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    .line 66
    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->or([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4832edbd -> :sswitch_a
        0x93d0 -> :sswitch_9
        0x9411 -> :sswitch_8
        0x9449 -> :sswitch_7
        0x94ac -> :sswitch_6
        0x94db -> :sswitch_5
        0x11ee74 -> :sswitch_4
        0x120139 -> :sswitch_3
        0x12076f -> :sswitch_2
        0x23864980 -> :sswitch_1
        0x587ada0c -> :sswitch_0
    .end sparse-switch
.end method

.method private static final toFilterObject(Ljava/util/Map;)Lio/getstream/chat/android/models/FilterObject;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/FilterObject;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lio/getstream/chat/android/models/NeutralFilterObject;->INSTANCE:Lio/getstream/chat/android/models/NeutralFilterObject;

    return-object p0

    .line 2
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;->toFilterObject(Ljava/util/Map$Entry;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 3
    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    const-string v0, "distinct"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "members"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->distinct(Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    .line 5
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FilterObject can not be created with this map `"

    const-string v2, "`"

    .line 6
    invoke-static {v1, v2, p0}, Lnh3/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lio/getstream/chat/android/models/AndFilterObject;

    const/16 v1, 0xa

    if-eqz v0, :cond_1

    check-cast p0, Lio/getstream/chat/android/models/AndFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/AndFilterObject;->getFilterObjects()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;->toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Ll83/k;

    const-string v1, "$and"

    invoke-direct {p0, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lio/getstream/chat/android/models/OrFilterObject;

    if-eqz v0, :cond_3

    check-cast p0, Lio/getstream/chat/android/models/OrFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/OrFilterObject;->getFilterObjects()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;->toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p0, Ll83/k;

    const-string v1, "$or"

    invoke-direct {p0, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Lio/getstream/chat/android/models/NorFilterObject;

    if-eqz v0, :cond_5

    check-cast p0, Lio/getstream/chat/android/models/NorFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/NorFilterObject;->getFilterObjects()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverterKt;->toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance p0, Ll83/k;

    const-string v1, "$nor"

    invoke-direct {p0, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_5
    instance-of v0, p0, Lio/getstream/chat/android/models/ExistsFilterObject;

    const-string v1, "$exists"

    if-eqz v0, :cond_6

    check-cast p0, Lio/getstream/chat/android/models/ExistsFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ExistsFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_6
    instance-of v0, p0, Lio/getstream/chat/android/models/NotExistsFilterObject;

    if-eqz v0, :cond_7

    check-cast p0, Lio/getstream/chat/android/models/NotExistsFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/NotExistsFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_7
    instance-of v0, p0, Lio/getstream/chat/android/models/EqualsFilterObject;

    if-eqz v0, :cond_8

    check-cast p0, Lio/getstream/chat/android/models/EqualsFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/EqualsFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$eq"

    invoke-virtual {p0}, Lio/getstream/chat/android/models/EqualsFilterObject;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_8
    instance-of v0, p0, Lio/getstream/chat/android/models/NotEqualsFilterObject;

    if-eqz v0, :cond_9

    check-cast p0, Lio/getstream/chat/android/models/NotEqualsFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/NotEqualsFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$ne"

    invoke-virtual {p0}, Lio/getstream/chat/android/models/NotEqualsFilterObject;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_9
    instance-of v0, p0, Lio/getstream/chat/android/models/ContainsFilterObject;

    if-eqz v0, :cond_a

    check-cast p0, Lio/getstream/chat/android/models/ContainsFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ContainsFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$contains"

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ContainsFilterObject;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_a
    instance-of v0, p0, Lio/getstream/chat/android/models/GreaterThanFilterObject;

    if-eqz v0, :cond_b

    check-cast p0, Lio/getstream/chat/android/models/GreaterThanFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/GreaterThanFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$gt"

    invoke-virtual {p0}, Lio/getstream/chat/android/models/GreaterThanFilterObject;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_b
    instance-of v0, p0, Lio/getstream/chat/android/models/GreaterThanOrEqualsFilterObject;

    if-eqz v0, :cond_c

    check-cast p0, Lio/getstream/chat/android/models/GreaterThanOrEqualsFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/GreaterThanOrEqualsFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$gte"

    invoke-virtual {p0}, Lio/getstream/chat/android/models/GreaterThanOrEqualsFilterObject;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_c
    instance-of v0, p0, Lio/getstream/chat/android/models/LessThanFilterObject;

    if-eqz v0, :cond_d

    check-cast p0, Lio/getstream/chat/android/models/LessThanFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/LessThanFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$lt"

    invoke-virtual {p0}, Lio/getstream/chat/android/models/LessThanFilterObject;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_d
    instance-of v0, p0, Lio/getstream/chat/android/models/LessThanOrEqualsFilterObject;

    if-eqz v0, :cond_e

    check-cast p0, Lio/getstream/chat/android/models/LessThanOrEqualsFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/LessThanOrEqualsFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$lte"

    invoke-virtual {p0}, Lio/getstream/chat/android/models/LessThanOrEqualsFilterObject;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_e
    instance-of v0, p0, Lio/getstream/chat/android/models/InFilterObject;

    if-eqz v0, :cond_f

    check-cast p0, Lio/getstream/chat/android/models/InFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/InFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/InFilterObject;->getValues()Ljava/util/Set;

    move-result-object p0

    new-instance v1, Ll83/k;

    const-string v2, "$in"

    invoke-direct {v1, v2, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_f
    instance-of v0, p0, Lio/getstream/chat/android/models/NotInFilterObject;

    if-eqz v0, :cond_10

    check-cast p0, Lio/getstream/chat/android/models/NotInFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/NotInFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/NotInFilterObject;->getValues()Ljava/util/Set;

    move-result-object p0

    new-instance v1, Ll83/k;

    const-string v2, "$nin"

    invoke-direct {v1, v2, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_10
    instance-of v0, p0, Lio/getstream/chat/android/models/AutocompleteFilterObject;

    if-eqz v0, :cond_11

    check-cast p0, Lio/getstream/chat/android/models/AutocompleteFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/AutocompleteFilterObject;->getFieldName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$autocomplete"

    invoke-virtual {p0}, Lio/getstream/chat/android/models/AutocompleteFilterObject;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_11
    instance-of v0, p0, Lio/getstream/chat/android/models/DistinctFilterObject;

    if-eqz v0, :cond_12

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v1, Ll83/k;

    const-string v2, "distinct"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast p0, Lio/getstream/chat/android/models/DistinctFilterObject;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/DistinctFilterObject;->getMemberIds()Ljava/util/Set;

    move-result-object p0

    new-instance v0, Ll83/k;

    const-string v2, "members"

    invoke-direct {v0, v2, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v0}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_12
    instance-of p0, p0, Lio/getstream/chat/android/models/NeutralFilterObject;

    if-eqz p0, :cond_13

    sget-object p0, Lm83/z;->w:Lm83/z;

    return-object p0

    :cond_13
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
