.class public final Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0019\u001a5\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a3\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a/\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001aA\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0004\u0012\u00020\u00040\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a/\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0010\u001a\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001b\"\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u001b\"\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u001b\"\u0014\u0010%\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001b\"\u0014\u0010&\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008&\u0010\u001b\"\u0014\u0010\'\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u001b\"\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008(\u0010\u001b\"\u0014\u0010)\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008)\u0010\u001b\"\u0014\u0010*\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008*\u0010\u001b\u00a8\u0006+"
    }
    d2 = {
        "",
        "",
        "",
        "Ll83/k;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "",
        "toFilterDomainWithFields",
        "(Ljava/util/Map;)Ll83/k;",
        "map",
        "",
        "fields",
        "parseFilterMap",
        "(Ljava/util/Map;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;",
        "key",
        "value",
        "parseSingleEntry",
        "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;",
        "Lkotlin/Function1;",
        "",
        "factory",
        "parseLogicalOperator",
        "(Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/FilterObject;",
        "fieldName",
        "parseFieldFilter",
        "normalizeValue",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "KEY_EXIST",
        "Ljava/lang/String;",
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
.method public static synthetic a([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseSingleEntry$lambda$3([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseSingleEntry$lambda$2([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseSingleEntry$lambda$1([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method

.method private static final normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    double-to-long v3, v3

    long-to-double v3, v3

    cmpg-double v1, v1, v3

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    double-to-long v0, v0

    const-wide/32 v2, -0x80000000

    cmp-long p0, v2, v0

    if-gtz p0, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long p0, v0, v2

    if-gtz p0, :cond_0

    long-to-int p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_4

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :cond_2
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    return-object p0
.end method

.method private static final parseFieldFilter(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/FilterObject;"
        }
    .end annotation

    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    instance-of p2, p1, Ljava/util/Map;

    if-nez p2, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/models/Filters;->eq(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    return-object v0

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0xa

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v1, "$autocomplete"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto/16 :goto_6

    :cond_2
    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_3

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_3
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_4

    return-object v0

    :cond_4
    invoke-static {p0, p1}, Lio/getstream/chat/android/models/Filters;->autocomplete(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :sswitch_1
    const-string v1, "$exists"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto/16 :goto_6

    :cond_5
    instance-of p2, p1, Ljava/lang/Boolean;

    if-eqz p2, :cond_6

    check-cast p1, Ljava/lang/Boolean;

    goto :goto_1

    :cond_6
    move-object p1, v0

    :goto_1
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->exists(Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_7
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->notExists(Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_8
    if-nez p1, :cond_9

    return-object v0

    :cond_9
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :sswitch_2
    const-string v1, "$nin"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto/16 :goto_6

    :cond_a
    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_b

    check-cast p1, Ljava/util/Collection;

    goto :goto_2

    :cond_b
    move-object p1, v0

    :goto_2
    if-eqz p1, :cond_e

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_c

    return-object v0

    :cond_c
    invoke-static {v1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_d
    invoke-static {p0, p2}, Lio/getstream/chat/android/models/Filters;->nin(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_e
    return-object v0

    :sswitch_3
    const-string v1, "$lte"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_f

    goto/16 :goto_6

    :cond_f
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/models/Filters;->lessThanEquals(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :sswitch_4
    const-string v1, "$gte"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_10

    goto/16 :goto_6

    :cond_10
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/models/Filters;->greaterThanEquals(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :sswitch_5
    const-string v1, "$ne"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_11

    goto/16 :goto_6

    :cond_11
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/models/Filters;->ne(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :sswitch_6
    const-string v1, "$lt"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_12

    goto/16 :goto_6

    :cond_12
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/models/Filters;->lessThan(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :sswitch_7
    const-string v1, "$in"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_13

    goto :goto_6

    :cond_13
    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_14

    check-cast p1, Ljava/util/Collection;

    goto :goto_4

    :cond_14
    move-object p1, v0

    :goto_4
    if-eqz p1, :cond_17

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_15

    return-object v0

    :cond_15
    invoke-static {v1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_16
    invoke-static {p0, p2}, Lio/getstream/chat/android/models/Filters;->in(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_17
    return-object v0

    :sswitch_8
    const-string v1, "$gt"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_18

    goto :goto_6

    :cond_18
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/models/Filters;->greaterThan(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :sswitch_9
    const-string v1, "$eq"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_19

    goto :goto_6

    :cond_19
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/models/Filters;->eq(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :sswitch_a
    const-string v1, "$contains"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1a

    :goto_6
    return-object v0

    :cond_1a
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->normalizeValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/models/Filters;->contains(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

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

.method private static final parseFilterMap(Ljava/util/Map;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/FilterObject;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lio/getstream/chat/android/models/NeutralFilterObject;->INSTANCE:Lio/getstream/chat/android/models/NeutralFilterObject;

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_5

    const-string v0, "distinct"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "members"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_1

    check-cast p0, Ljava/util/Collection;

    goto :goto_0

    :cond_1
    move-object p0, v2

    :goto_0
    if-eqz p0, :cond_4

    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lio/getstream/chat/android/models/Filters;->distinct(Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v2

    :cond_5
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0, p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseSingleEntry(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_7
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3, p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseSingleEntry(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_9

    return-object v2

    :cond_9
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    if-ne p0, v1, :cond_a

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/FilterObject;

    return-object p0

    :cond_a
    const/4 p0, 0x0

    new-array p0, p0, [Lio/getstream/chat/android/models/FilterObject;

    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    array-length p1, p0

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->and([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method

.method private static final parseLogicalOperator(Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/FilterObject;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/models/FilterObject;"
        }
    .end annotation

    instance-of v0, p0, Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    return-object v1

    :cond_1
    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_3

    check-cast v2, Ljava/util/Map;

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_4

    invoke-static {v2, p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseFilterMap(Ljava/util/Map;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v2

    goto :goto_3

    :cond_4
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_6

    return-object v1

    :cond_6
    const/4 p0, 0x0

    new-array p0, p0, [Lio/getstream/chat/android/models/FilterObject;

    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/FilterObject;

    return-object p0
.end method

.method private static final parseSingleEntry(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/FilterObject;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x9507

    if-eq v0, v1, :cond_4

    const v1, 0x11d733

    if-eq v0, v1, :cond_2

    const v1, 0x12082d

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "$nor"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Lio/getstream/chat/android/client/api/state/a;

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-static {p1, p2, p0}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseLogicalOperator(Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_2
    const-string v0, "$and"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Lio/getstream/chat/android/client/api/state/a;

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-static {p1, p2, p0}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseLogicalOperator(Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_4
    const-string v0, "$or"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_0
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseFieldFilter(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, Lio/getstream/chat/android/client/api/state/a;

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-static {p1, p2, p0}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseLogicalOperator(Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method

.method private static final parseSingleEntry$lambda$1([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->and([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method

.method private static final parseSingleEntry$lambda$2([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->or([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method

.method private static final parseSingleEntry$lambda$3([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->nor([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method

.method public static final toFilterDomainWithFields(Ljava/util/Map;)Ll83/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ll83/k;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p0, v1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->parseFilterMap(Ljava/util/Map;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ll83/k;

    invoke-direct {v0, p0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
