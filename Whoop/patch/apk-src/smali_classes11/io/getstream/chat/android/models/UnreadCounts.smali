.class public final Lio/getstream/chat/android/models/UnreadCounts;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001Ba\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\u000f\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\tH\u00c6\u0003J\u000f\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\tH\u00c6\u0003Jc\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\tH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0017\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/models/UnreadCounts;",
        "",
        "messagesCount",
        "",
        "threadsCount",
        "messagesCountByTeam",
        "",
        "",
        "channels",
        "",
        "Lio/getstream/chat/android/models/UnreadChannel;",
        "threads",
        "Lio/getstream/chat/android/models/UnreadThread;",
        "channelsByType",
        "Lio/getstream/chat/android/models/UnreadChannelByType;",
        "<init>",
        "(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "getMessagesCount",
        "()I",
        "getThreadsCount",
        "getMessagesCountByTeam",
        "()Ljava/util/Map;",
        "getChannels",
        "()Ljava/util/List;",
        "getThreads",
        "getChannelsByType",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final channels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannel;",
            ">;"
        }
    .end annotation
.end field

.field private final channelsByType:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannelByType;",
            ">;"
        }
    .end annotation
.end field

.field private final messagesCount:I

.field private final messagesCountByTeam:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final threads:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadThread;",
            ">;"
        }
    .end annotation
.end field

.field private final threadsCount:I


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/models/UnreadCounts;-><init>(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannel;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadThread;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannelByType;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messagesCountByTeam"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channels"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threads"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelsByType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCount:I

    .line 4
    iput p2, p0, Lio/getstream/chat/android/models/UnreadCounts;->threadsCount:I

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCountByTeam:Ljava/util/Map;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/models/UnreadCounts;->channels:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/models/UnreadCounts;->threads:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/models/UnreadCounts;->channelsByType:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 9
    sget-object p3, Lm83/z;->w:Lm83/z;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 10
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p8, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move-object p7, v0

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p7, p6

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p7}, Lio/getstream/chat/android/models/UnreadCounts;-><init>(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/UnreadCounts;IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/UnreadCounts;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCount:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lio/getstream/chat/android/models/UnreadCounts;->threadsCount:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCountByTeam:Ljava/util/Map;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/models/UnreadCounts;->channels:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/models/UnreadCounts;->threads:Ljava/util/List;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/models/UnreadCounts;->channelsByType:Ljava/util/List;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/chat/android/models/UnreadCounts;->copy(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lio/getstream/chat/android/models/UnreadCounts;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCount:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->threadsCount:I

    return v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCountByTeam:Ljava/util/Map;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->channels:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadThread;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->threads:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannelByType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->channelsByType:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lio/getstream/chat/android/models/UnreadCounts;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannel;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadThread;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannelByType;",
            ">;)",
            "Lio/getstream/chat/android/models/UnreadCounts;"
        }
    .end annotation

    const-string v0, "messagesCountByTeam"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channels"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threads"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelsByType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/UnreadCounts;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/models/UnreadCounts;-><init>(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/UnreadCounts;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/UnreadCounts;

    iget v1, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCount:I

    iget v3, p1, Lio/getstream/chat/android/models/UnreadCounts;->messagesCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/models/UnreadCounts;->threadsCount:I

    iget v3, p1, Lio/getstream/chat/android/models/UnreadCounts;->threadsCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCountByTeam:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/UnreadCounts;->messagesCountByTeam:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/UnreadCounts;->channels:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/UnreadCounts;->channels:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/UnreadCounts;->threads:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/UnreadCounts;->threads:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/models/UnreadCounts;->channelsByType:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/chat/android/models/UnreadCounts;->channelsByType:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getChannels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->channels:Ljava/util/List;

    return-object v0
.end method

.method public final getChannelsByType()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadChannelByType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->channelsByType:Ljava/util/List;

    return-object v0
.end method

.method public final getMessagesCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCount:I

    return v0
.end method

.method public final getMessagesCountByTeam()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCountByTeam:Ljava/util/Map;

    return-object v0
.end method

.method public final getThreads()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/UnreadThread;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->threads:Ljava/util/List;

    return-object v0
.end method

.method public final getThreadsCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->threadsCount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/models/UnreadCounts;->threadsCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCountByTeam:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/UnreadCounts;->channels:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/UnreadCounts;->threads:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/models/UnreadCounts;->channelsByType:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCount:I

    iget v1, p0, Lio/getstream/chat/android/models/UnreadCounts;->threadsCount:I

    iget-object v2, p0, Lio/getstream/chat/android/models/UnreadCounts;->messagesCountByTeam:Ljava/util/Map;

    iget-object v3, p0, Lio/getstream/chat/android/models/UnreadCounts;->channels:Ljava/util/List;

    iget-object v4, p0, Lio/getstream/chat/android/models/UnreadCounts;->threads:Ljava/util/List;

    iget-object v5, p0, Lio/getstream/chat/android/models/UnreadCounts;->channelsByType:Ljava/util/List;

    const-string v6, ", threadsCount="

    const-string v7, ", messagesCountByTeam="

    const-string v8, "UnreadCounts(messagesCount="

    invoke-static {v0, v1, v8, v6, v7}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threads="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channelsByType="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Lq63/c;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
