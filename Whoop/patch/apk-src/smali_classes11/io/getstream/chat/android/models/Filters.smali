.class public final Lio/getstream/chat/android/models/Filters;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0008\u000c\n\u0002\u0010 \n\u0002\u0010\u0004\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J!\u0010\u000c\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J)\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\u0019\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00080\u000e\"\u00020\u0008H\u0007\u00a2\u0006\u0002\u0010\u001aJ\u001e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u001bH\u0007J)\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\u0019\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u001c0\u000e\"\u00020\u001cH\u0007\u00a2\u0006\u0002\u0010\u001dJ)\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\u0019\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00080\u000e\"\u00020\u0008H\u0007\u00a2\u0006\u0002\u0010\u001aJ\u001e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u001bH\u0007J)\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\u0019\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u001c0\u000e\"\u00020\u001cH\u0007\u00a2\u0006\u0002\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0008H\u0007J\u0016\u0010 \u001a\u00020\u00052\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001bH\u0007\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/models/Filters;",
        "",
        "<init>",
        "()V",
        "neutral",
        "Lio/getstream/chat/android/models/FilterObject;",
        "exists",
        "fieldName",
        "",
        "notExists",
        "contains",
        "value",
        "and",
        "filters",
        "",
        "([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;",
        "or",
        "nor",
        "eq",
        "ne",
        "greaterThan",
        "greaterThanEquals",
        "lessThan",
        "lessThanEquals",
        "in",
        "values",
        "(Ljava/lang/String;[Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;",
        "",
        "",
        "(Ljava/lang/String;[Ljava/lang/Number;)Lio/getstream/chat/android/models/FilterObject;",
        "nin",
        "autocomplete",
        "distinct",
        "memberIds",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/models/Filters;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/Filters;

    invoke-direct {v0}, Lio/getstream/chat/android/models/Filters;-><init>()V

    sput-object v0, Lio/getstream/chat/android/models/Filters;->INSTANCE:Lio/getstream/chat/android/models/Filters;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final varargs and([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "filters"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/AndFilterObject;

    invoke-static {p0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/AndFilterObject;-><init>(Ljava/util/Set;)V

    return-object v0
.end method

.method public static final autocomplete(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/AutocompleteFilterObject;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/AutocompleteFilterObject;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final contains(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/ContainsFilterObject;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/ContainsFilterObject;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final distinct(Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/FilterObject;"
        }
    .end annotation

    const-string v0, "memberIds"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/DistinctFilterObject;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/DistinctFilterObject;-><init>(Ljava/util/Set;)V

    return-object v0
.end method

.method public static final eq(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/EqualsFilterObject;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/EqualsFilterObject;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final exists(Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/ExistsFilterObject;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/ExistsFilterObject;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final greaterThan(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/GreaterThanFilterObject;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/GreaterThanFilterObject;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final greaterThanEquals(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/GreaterThanOrEqualsFilterObject;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/GreaterThanOrEqualsFilterObject;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final in(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/FilterObject;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/getstream/chat/android/models/InFilterObject;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/InFilterObject;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public static final varargs in(Ljava/lang/String;[Ljava/lang/Number;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lio/getstream/chat/android/models/InFilterObject;

    invoke-static {p1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/InFilterObject;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public static final varargs in(Ljava/lang/String;[Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/models/InFilterObject;

    invoke-static {p1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/InFilterObject;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public static final lessThan(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/LessThanFilterObject;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/LessThanFilterObject;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final lessThanEquals(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/LessThanOrEqualsFilterObject;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/LessThanOrEqualsFilterObject;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final ne(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/NotEqualsFilterObject;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/NotEqualsFilterObject;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final neutral()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/NeutralFilterObject;->INSTANCE:Lio/getstream/chat/android/models/NeutralFilterObject;

    return-object v0
.end method

.method public static final nin(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/FilterObject;"
        }
    .end annotation

    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/getstream/chat/android/models/NotInFilterObject;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/NotInFilterObject;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public static final varargs nin(Ljava/lang/String;[Ljava/lang/Number;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lio/getstream/chat/android/models/NotInFilterObject;

    invoke-static {p1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/NotInFilterObject;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public static final varargs nin(Ljava/lang/String;[Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/models/NotInFilterObject;

    invoke-static {p1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/NotInFilterObject;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public static final varargs nor([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "filters"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/NorFilterObject;

    invoke-static {p0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/NorFilterObject;-><init>(Ljava/util/Set;)V

    return-object v0
.end method

.method public static final notExists(Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/NotExistsFilterObject;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/NotExistsFilterObject;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final varargs or([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "filters"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/OrFilterObject;

    invoke-static {p0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/OrFilterObject;-><init>(Ljava/util/Set;)V

    return-object v0
.end method
