.class public final Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001BQ\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003JS\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010%\u001a\u00020\u00062\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0011R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0018\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;",
        "",
        "oldestMessage",
        "Lio/getstream/chat/android/models/Message;",
        "newestMessage",
        "hasLoadedAllNextMessages",
        "",
        "hasLoadedAllPreviousMessages",
        "isLoadingNextMessages",
        "isLoadingPreviousMessages",
        "isLoadingMiddleMessages",
        "<init>",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZ)V",
        "getOldestMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "getNewestMessage",
        "getHasLoadedAllNextMessages",
        "()Z",
        "getHasLoadedAllPreviousMessages",
        "isLoadingMessages",
        "isJumpingToMessage",
        "oldestMessageAt",
        "Ljava/util/Date;",
        "getOldestMessageAt",
        "()Ljava/util/Date;",
        "newestMessageAt",
        "getNewestMessageAt",
        "isInWindow",
        "message",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final hasLoadedAllNextMessages:Z

.field private final hasLoadedAllPreviousMessages:Z

.field private final isLoadingMiddleMessages:Z

.field private final isLoadingNextMessages:Z

.field private final isLoadingPreviousMessages:Z

.field private final newestMessage:Lio/getstream/chat/android/models/Message;

.field private final oldestMessage:Lio/getstream/chat/android/models/Message;


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->oldestMessage:Lio/getstream/chat/android/models/Message;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->newestMessage:Lio/getstream/chat/android/models/Message;

    .line 5
    iput-boolean p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllNextMessages:Z

    .line 6
    iput-boolean p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllPreviousMessages:Z

    .line 7
    iput-boolean p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingNextMessages:Z

    .line 8
    iput-boolean p6, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages:Z

    .line 9
    iput-boolean p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingMiddleMessages:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move p8, v0

    :goto_0
    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZ)V

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->oldestMessage:Lio/getstream/chat/android/models/Message;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->newestMessage:Lio/getstream/chat/android/models/Message;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllNextMessages:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllPreviousMessages:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingNextMessages:Z

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingMiddleMessages:Z

    :cond_6
    move p9, p7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move p8, p6

    move p6, p4

    move-object p4, p2

    new-instance p2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move p7, p5

    move p5, p3

    move-object p3, p1

    invoke-direct/range {p2 .. p9}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZ)V

    return-object p2
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->oldestMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->newestMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllNextMessages:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllPreviousMessages:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingNextMessages:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingMiddleMessages:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZ)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;
    .locals 8

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->oldestMessage:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->oldestMessage:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->newestMessage:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->newestMessage:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllNextMessages:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllNextMessages:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllPreviousMessages:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllPreviousMessages:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingNextMessages:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingNextMessages:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingMiddleMessages:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingMiddleMessages:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getHasLoadedAllNextMessages()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllNextMessages:Z

    return v0
.end method

.method public final getHasLoadedAllPreviousMessages()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllPreviousMessages:Z

    return v0
.end method

.method public final getNewestMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->newestMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getNewestMessageAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->newestMessage:Lio/getstream/chat/android/models/Message;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getOldestMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->oldestMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getOldestMessageAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->oldestMessage:Lio/getstream/chat/android/models/Message;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->oldestMessage:Lio/getstream/chat/android/models/Message;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->newestMessage:Lio/getstream/chat/android/models/Message;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllNextMessages:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllPreviousMessages:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingNextMessages:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingMiddleMessages:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isInWindow(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->getOldestMessageAt()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->getOldestMessageAt()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v0

    if-ltz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->getNewestMessageAt()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->getNewestMessageAt()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p1

    if-gtz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final isJumpingToMessage()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllNextMessages:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isLoadingMessages()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingNextMessages:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingMiddleMessages:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isLoadingMiddleMessages()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingMiddleMessages:Z

    return v0
.end method

.method public final isLoadingNextMessages()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingNextMessages:Z

    return v0
.end method

.method public final isLoadingPreviousMessages()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->oldestMessage:Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->newestMessage:Lio/getstream/chat/android/models/Message;

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllNextMessages:Z

    iget-boolean v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->hasLoadedAllPreviousMessages:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingNextMessages:Z

    iget-boolean v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages:Z

    iget-boolean v6, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingMiddleMessages:Z

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "MessagesPaginationState(oldestMessage="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", newestMessage="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hasLoadedAllNextMessages="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hasLoadedAllPreviousMessages="

    const-string v1, ", isLoadingNextMessages="

    invoke-static {v7, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", isLoadingPreviousMessages="

    const-string v1, ", isLoadingMiddleMessages="

    invoke-static {v7, v4, v0, v5, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
