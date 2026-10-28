.class public final Lio/getstream/chat/android/client/parser/FilterObjectToMapKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000\"\u000e\u0010\u0005\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "toMap",
        "",
        "",
        "",
        "Lio/getstream/chat/android/models/FilterObject;",
        "KEY_EXIST",
        "KEY_CONTAINS",
        "KEY_AND",
        "KEY_OR",
        "KEY_NOR",
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
.method public static final toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;
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

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-static {v1}, Lio/getstream/chat/android/client/parser/FilterObjectToMapKt;->toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;

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

    invoke-static {v1}, Lio/getstream/chat/android/client/parser/FilterObjectToMapKt;->toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;

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

    invoke-static {v1}, Lio/getstream/chat/android/client/parser/FilterObjectToMapKt;->toMap(Lio/getstream/chat/android/models/FilterObject;)Ljava/util/Map;

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

    invoke-virtual {p0}, Lio/getstream/chat/android/models/EqualsFilterObject;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v0}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

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
