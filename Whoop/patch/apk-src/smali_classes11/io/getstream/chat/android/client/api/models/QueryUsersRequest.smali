.class public final Lio/getstream/chat/android/client/api/models/QueryUsersRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001B;\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003JA\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010)\u001a\u00020\u000b2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J\t\u0010,\u001a\u00020 H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR#\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010\u001f0\u001e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;",
        "",
        "filter",
        "Lio/getstream/chat/android/models/FilterObject;",
        "offset",
        "",
        "limit",
        "querySort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/User;",
        "presence",
        "",
        "<init>",
        "(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Z)V",
        "getFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "setFilter",
        "(Lio/getstream/chat/android/models/FilterObject;)V",
        "getOffset",
        "()I",
        "getLimit",
        "getQuerySort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "setQuerySort",
        "(Lio/getstream/chat/android/models/querysort/QuerySorter;)V",
        "getPresence",
        "()Z",
        "setPresence",
        "(Z)V",
        "sort",
        "",
        "",
        "",
        "getSort",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
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
.field private filter:Lio/getstream/chat/android/models/FilterObject;

.field private final limit:I

.field private final offset:I

.field private presence:Z

.field private querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private final sort:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;II)V
    .locals 9

    .line 1
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    .line 2
    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/User;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    .line 5
    iput p2, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->offset:I

    .line 6
    iput p3, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->limit:I

    .line 7
    iput-object p4, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    .line 8
    iput-boolean p5, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->presence:Z

    .line 9
    invoke-interface {p4}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->sort:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 10
    new-instance p4, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {p4}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v5, p5

    .line 11
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;ZILjava/lang/Object;)Lio/getstream/chat/android/client/api/models/QueryUsersRequest;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->offset:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->limit:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->presence:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->copy(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Z)Lio/getstream/chat/android/client/api/models/QueryUsersRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->offset:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->limit:I

    return v0
.end method

.method public final component4()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->presence:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Z)Lio/getstream/chat/android/client/api/models/QueryUsersRequest;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/User;",
            ">;Z)",
            "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Z)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->offset:I

    iget v3, p1, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->offset:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->limit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->presence:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->presence:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->limit:I

    return v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->offset:I

    return v0
.end method

.method public final getPresence()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->presence:Z

    return v0
.end method

.method public final getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final getSort()Ljava/util/List;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->offset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->presence:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final setFilter(Lio/getstream/chat/android/models/FilterObject;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-void
.end method

.method public final setPresence(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->presence:Z

    return-void
.end method

.method public final setQuerySort(Lio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget v1, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->offset:I

    iget v2, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->limit:I

    iget-object v3, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-boolean v4, p0, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;->presence:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "QueryUsersRequest(filter="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", offset="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", limit="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", querySort="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", presence="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
