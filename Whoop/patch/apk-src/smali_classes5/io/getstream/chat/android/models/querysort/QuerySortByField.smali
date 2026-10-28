.class public final Lio/getstream/chat/android/models/querysort/QuerySortByField;
.super Lio/getstream/chat/android/models/querysort/BaseQuerySort;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        ">",
        "Lio/getstream/chat/android/models/querysort/BaseQuerySort<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u0018*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0018B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\u0008\u0012\u0004\u0012\u00028\u0000`\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J.\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\u0008\u0012\u0004\u0012\u00028\u0000`\u00082\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\u0008\u0012\u0004\u0012\u00028\u0000`\u0008*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u001c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u0011J\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u0011\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/models/querysort/QuerySortByField;",
        "T",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        "Lio/getstream/chat/android/models/querysort/BaseQuerySort;",
        "<init>",
        "()V",
        "comparatorFromFieldSort",
        "Ljava/util/Comparator;",
        "Lkotlin/Comparator;",
        "firstSort",
        "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;",
        "sortDirection",
        "Lio/getstream/chat/android/models/querysort/SortDirection;",
        "comparatorFromNameAttribute",
        "name",
        "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;",
        "comparator",
        "",
        "add",
        "sortSpecification",
        "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;",
        "asc",
        "fieldName",
        "desc",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->comparator$lambda$0(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;)I

    move-result p0

    return p0
.end method

.method private final add(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;)",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getSortSpecifications()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {p1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->setSortSpecifications(Ljava/util/List;)V

    return-object p0
.end method

.method public static final ascByName(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
            ">(",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    invoke-virtual {v0, p0, p1}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->ascByName(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p0

    return-object p0
.end method

.method public static final ascByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;"
        }
    .end annotation

    .line 2
    sget-object v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->ascByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p0

    return-object p0
.end method

.method private final comparator(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")",
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/models/querysort/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lio/getstream/chat/android/models/querysort/a;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/models/querysort/SortDirection;I)V

    return-object v0
.end method

.method private static final comparator$lambda$0(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;)I
    .locals 1

    invoke-interface {p2, p0}, Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;->getComparableField(Ljava/lang/String;)Ljava/lang/Comparable;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    invoke-interface {p3, p0}, Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;->getComparableField(Ljava/lang/String;)Ljava/lang/Comparable;

    move-result-object p0

    if-eqz p0, :cond_1

    move-object v0, p0

    :cond_1
    invoke-static {p2, v0, p1}, Lio/getstream/chat/android/models/querysort/internal/ComparationsKt;->compare(Ljava/lang/Comparable;Ljava/lang/Comparable;Lio/getstream/chat/android/models/querysort/SortDirection;)I

    move-result p0

    return p0
.end method

.method public static final descByName(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
            ">(",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    invoke-virtual {v0, p0, p1}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->descByName(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p0

    return-object p0
.end method

.method public static final descByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;"
        }
    .end annotation

    .line 2
    sget-object v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->descByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final asc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    new-instance v1, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;-><init>(Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/models/querysort/SortDirection;->ASC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->add(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p1

    return-object p1
.end method

.method public comparatorFromFieldSort(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute<",
            "TT;>;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")",
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "firstSort"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sortDirection"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "FieldSortAttribute can\'t be used with QuerySortByField"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public comparatorFromNameAttribute(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute<",
            "TT;>;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")",
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->comparator(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public final desc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    new-instance v1, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;-><init>(Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/models/querysort/SortDirection;->DESC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;-><init>(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->add(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p1

    return-object p1
.end method
