.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J-\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\u0018\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n0\tH\u0000\u00a2\u0006\u0002\u0008\u000cJ \u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\u0012\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000e0\tJ.\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortParser;",
        "T",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        "",
        "<init>",
        "()V",
        "fromRawInfo",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "specs",
        "",
        "",
        "",
        "fromRawInfo$stream_chat_android_client_release",
        "fromSpecifications",
        "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;",
        "createQuerySort",
        "Lio/getstream/chat/android/models/querysort/QuerySortByField;",
        "querySort",
        "fieldName",
        "direction",
        "",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createQuerySort(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;I)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TT;>;",
            "Ljava/lang/String;",
            "I)",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/models/querysort/SortDirection;->ASC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/querysort/SortDirection;->getValue()I

    move-result v0

    if-ne p3, v0, :cond_0

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->asc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lio/getstream/chat/android/models/querysort/SortDirection;->DESC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/querysort/SortDirection;->getValue()I

    move-result v0

    if-ne p3, v0, :cond_1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->desc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final fromRawInfo$stream_chat_android_client_release(Ljava/util/List;)Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;)",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "specs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {v0}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const-string v2, "field"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_0
    move-object v2, v4

    :goto_1
    const-string v3, "Cannot parse sortSpec to query sort\n"

    if-eqz v2, :cond_4

    const-string v5, "direction"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/Number;

    if-eqz v6, :cond_1

    move-object v4, v5

    check-cast v4, Ljava/lang/Number;

    :cond_1
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-direct {p0, v0, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortParser;->createQuerySort(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;I)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Cannot parse sortSpec to query sort: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-object v0
.end method

.method public final fromSpecifications(Ljava/util/List;)Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/querysort/internal/SortSpecification<",
            "TT;>;>;)",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "specs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {v0}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortAttribute()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/querysort/internal/SortAttribute;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/querysort/internal/SortSpecification;->getSortDirection()Lio/getstream/chat/android/models/querysort/SortDirection;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/querysort/SortDirection;->getValue()I

    move-result v3

    invoke-direct {p0, v0, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortParser;->createQuerySort(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;I)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Cannot parse sortSpec to query sort: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v0
.end method
