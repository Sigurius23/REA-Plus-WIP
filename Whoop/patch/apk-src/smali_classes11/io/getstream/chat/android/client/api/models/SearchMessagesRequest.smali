.class public final Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001BK\u0008\u0007\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003JX\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020(2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\tH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R%\u0010\u001a\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u001c\u0018\u00010\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006,"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;",
        "",
        "offset",
        "",
        "limit",
        "channelFilter",
        "Lio/getstream/chat/android/models/FilterObject;",
        "messageFilter",
        "next",
        "",
        "querySort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Message;",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)V",
        "getOffset",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getLimit",
        "getChannelFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "getMessageFilter",
        "getNext",
        "()Ljava/lang/String;",
        "getQuerySort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "sort",
        "",
        "",
        "getSort",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;",
        "equals",
        "",
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
.field private final channelFilter:Lio/getstream/chat/android/models/FilterObject;

.field private final limit:Ljava/lang/Integer;

.field private final messageFilter:Lio/getstream/chat/android/models/FilterObject;

.field private final next:Ljava/lang/String;

.field private final offset:Ljava/lang/Integer;

.field private final querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
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
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;)V
    .locals 10

    .line 1
    const-string v0, "channelFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFilter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;)V
    .locals 10

    .line 2
    const-string v0, "channelFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFilter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "channelFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFilter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->offset:Ljava/lang/Integer;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->limit:Ljava/lang/Integer;

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->channelFilter:Lio/getstream/chat/android/models/FilterObject;

    .line 7
    iput-object p4, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->messageFilter:Lio/getstream/chat/android/models/FilterObject;

    .line 8
    iput-object p5, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->next:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    if-eqz p6, :cond_0

    .line 10
    invoke-interface {p6}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->sort:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x10

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_1

    move-object p7, v0

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p7, p6

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p7}, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Object;)Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->offset:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->limit:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->channelFilter:Lio/getstream/chat/android/models/FilterObject;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->messageFilter:Lio/getstream/chat/android/models/FilterObject;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->next:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->offset:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->channelFilter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final component4()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->messageFilter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;"
        }
    .end annotation

    const-string v0, "channelFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFilter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->offset:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->offset:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->limit:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->limit:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->channelFilter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->channelFilter:Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->messageFilter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->messageFilter:Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->next:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->next:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object p1, p1, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getChannelFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->channelFilter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final getLimit()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessageFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->messageFilter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final getNext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final getOffset()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->offset:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->offset:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->limit:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->channelFilter:Lio/getstream/chat/android/models/FilterObject;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->messageFilter:Lio/getstream/chat/android/models/FilterObject;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->next:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->offset:Ljava/lang/Integer;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->limit:Ljava/lang/Integer;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->channelFilter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->messageFilter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v4, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->next:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    const-string v6, ", limit="

    const-string v7, ", channelFilter="

    const-string v8, "SearchMessagesRequest(offset="

    invoke-static {v8, v0, v6, v1, v7}, Lvl/b;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", next="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", querySort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
