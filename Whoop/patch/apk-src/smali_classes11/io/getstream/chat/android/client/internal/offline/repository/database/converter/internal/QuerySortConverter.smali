.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0008H\u0007J(\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u00070\u0006H\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0007R,\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\t\u0010\u0003\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;",
        "",
        "<init>",
        "()V",
        "adapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "",
        "",
        "getAdapter$annotations",
        "stringToObject",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "data",
        "parseQuerySort",
        "listOfSortSpec",
        "objectToString",
        "querySort",
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


# instance fields
.field private final adapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ConverterMoshiInstanceKt;->getMoshi()Lqx/l0;

    move-result-object v0

    sget-object v1, Lj93/d0;->c:Lj93/d0;

    const-class v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v1

    invoke-static {v1}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object v1

    const-class v2, Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v2

    invoke-static {v2}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/h0;->c(Lj93/d0;Lj93/d0;)Lj93/a0;

    move-result-object v1

    invoke-static {v1}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object v1

    const-class v2, Ljava/util/List;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/h0;->e(Ljava/lang/Class;Lj93/d0;)Lj93/a0;

    move-result-object v1

    invoke-static {v0, v1}, Lug/m;->m(Lqx/l0;Lj93/a0;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;->adapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method

.method private static synthetic getAdapter$annotations()V
    .locals 0

    return-void
.end method

.method private final parseQuerySort(Ljava/util/List;)Lio/getstream/chat/android/models/querysort/QuerySorter;
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
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {v0}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

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

    if-eqz v2, :cond_5

    const-string v5, "direction"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/Number;

    if-eqz v6, :cond_1

    move-object v4, v5

    check-cast v4, Ljava/lang/Number;

    :cond_1
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    sget-object v5, Lio/getstream/chat/android/models/querysort/SortDirection;->ASC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/querysort/SortDirection;->getValue()I

    move-result v5

    if-ne v4, v5, :cond_2

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->asc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v5, Lio/getstream/chat/android/models/querysort/SortDirection;->DESC:Lio/getstream/chat/android/models/querysort/SortDirection;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/querysort/SortDirection;->getValue()I

    move-result v5

    if-ne v4, v5, :cond_3

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->desc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v0

    goto :goto_0

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

    :cond_6
    return-object v0
.end method


# virtual methods
.method public final objectToString(Lio/getstream/chat/android/models/querysort/QuerySorter;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "querySort"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;->adapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-interface {p1}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final stringToObject(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;->adapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;->parseQuerySort(Ljava/util/List;)Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    return-object p1

    :cond_2
    :goto_0
    new-instance p1, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {p1}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    return-object p1

    :cond_3
    :goto_1
    new-instance p1, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {p1}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    return-object p1
.end method
