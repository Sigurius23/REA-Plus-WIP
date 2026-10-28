.class public final Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PaginationState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;",
        "",
        "loadingMore",
        "",
        "endOfChannels",
        "<init>",
        "(ZZ)V",
        "getLoadingMore",
        "()Z",
        "getEndOfChannels",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-chat-android-ui-components_release"
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
.field private final endOfChannels:Z

.field private final loadingMore:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->loadingMore:Z

    .line 4
    iput-boolean p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->endOfChannels:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;-><init>(ZZ)V

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->loadingMore:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->endOfChannels:Z

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;-><init>(ZZ)V

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->loadingMore:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->endOfChannels:Z

    return v0
.end method

.method public final copy(ZZ)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;-><init>(ZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->loadingMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->loadingMore:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->endOfChannels:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->endOfChannels:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getEndOfChannels()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->endOfChannels:Z

    return v0
.end method

.method public final getLoadingMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->loadingMore:Z

    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->loadingMore:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->endOfChannels:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->loadingMore:Z

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->endOfChannels:Z

    const-string v2, ", endOfChannels="

    const-string v3, ")"

    const-string v4, "PaginationState(loadingMore="

    invoke-static {v4, v2, v3, v0, v1}, Lr;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
