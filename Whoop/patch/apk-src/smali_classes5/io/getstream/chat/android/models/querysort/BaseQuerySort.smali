.class public abstract Lio/getstream/chat/android/models/querysort/BaseQuerySort;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/querysort/QuerySorter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/querysort/QuerySorter<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J.\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\u0008\u0012\u0004\u0012\u00028\u0000`\u000f2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J.\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\u0008\u0012\u0004\u0012\u00028\u0000`\u000f2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u001a\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c0\u0007H\u0016J\u0008\u0010\u001e\u001a\u00020\u001fH\u0016J\u0008\u0010 \u001a\u00020\u001dH\u0016J\u0013\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R&\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00080\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR(\u0010\r\u001a\u0016\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u000ej\n\u0012\u0006\u0008\u0000\u0012\u00028\u0000`\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R.\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\u0008\u0012\u0004\u0012\u00028\u0000`\u000f*\u0008\u0012\u0004\u0012\u00028\u00000\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0012\u00a8\u0006$"
    }
    d2 = {
        "Lio/getstream/chat/android/models/querysort/BaseQuerySort;",
        "T",
        "",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "<init>",
        "()V",
        "sortSpecifications",
        "",
        "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;",
        "getSortSpecifications",
        "()Ljava/util/List;",
        "setSortSpecifications",
        "(Ljava/util/List;)V",
        "comparator",
        "Ljava/util/Comparator;",
        "Lkotlin/Comparator;",
        "getComparator",
        "()Ljava/util/Comparator;",
        "(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Ljava/util/Comparator;",
        "comparatorFromFieldSort",
        "firstSort",
        "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;",
        "sortDirection",
        "Lio/getstream/chat/android/models/querysort/SortDirection;",
        "comparatorFromNameAttribute",
        "name",
        "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;",
        "toDto",
        "",
        "",
        "hashCode",
        "",
        "toString",
        "equals",
        "",
        "other",
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


# instance fields
.field private sortSpecifications:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, p0, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->sortSpecifications:Ljava/util/List;

    return-void
.end method

.method private final getComparator(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Ljava/util/Comparator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;)",
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortAttribute()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object v0

    .line 9
    instance-of v1, v0, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortAttribute()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortDirection()Lio/getstream/chat/android/models/querysort/SortDirection;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->comparatorFromFieldSort(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1

    .line 10
    :cond_0
    instance-of v0, v0, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortAttribute()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortDirection()Lio/getstream/chat/android/models/querysort/SortDirection;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->comparatorFromNameAttribute(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1

    .line 12
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public abstract comparatorFromFieldSort(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;
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
.end method

.method public abstract comparatorFromNameAttribute(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;
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
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type io.getstream.chat.android.models.querysort.BaseQuerySort<*>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/getstream/chat/android/models/querysort/BaseQuerySort;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getSortSpecifications()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getSortSpecifications()Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getComparator()Ljava/util/Comparator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getSortSpecifications()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 4
    check-cast v2, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    .line 5
    invoke-direct {p0, v2}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getComparator(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Ljava/util/Comparator;

    move-result-object v2

    .line 6
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Lio/getstream/chat/android/models/querysort/internal/CompositeComparator;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/querysort/internal/CompositeComparator;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public getSortSpecifications()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->sortSpecifications:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getSortSpecifications()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public setSortSpecifications(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->sortSpecifications:Ljava/util/List;

    return-void
.end method

.method public toDto()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getSortSpecifications()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortAttribute()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ll83/k;

    const-string v5, "field"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortDirection()Lio/getstream/chat/android/models/querysort/SortDirection;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/querysort/SortDirection;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v5, "direction"

    invoke-direct {v3, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v3}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/querysort/BaseQuerySort;->getSortSpecifications()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
