.class public final Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B5\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\rR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;",
        "",
        "canLoadMore",
        "",
        "results",
        "",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "isLoading",
        "nextDate",
        "Ljava/util/Date;",
        "<init>",
        "(ZLjava/util/List;ZLjava/util/Date;)V",
        "getCanLoadMore",
        "()Z",
        "getResults",
        "()Ljava/util/List;",
        "getNextDate",
        "()Ljava/util/Date;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final canLoadMore:Z

.field private final isLoading:Z

.field private final nextDate:Ljava/util/Date;

.field private final results:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;-><init>(ZLjava/util/List;ZLjava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/List;ZLjava/util/Date;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;Z",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->canLoadMore:Z

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->results:Ljava/util/List;

    .line 5
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->isLoading:Z

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->nextDate:Ljava/util/Date;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/List;ZLjava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x1

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 7
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 8
    new-instance p4, Ljava/util/Date;

    invoke-direct {p4}, Ljava/util/Date;-><init>()V

    .line 9
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;-><init>(ZLjava/util/List;ZLjava/util/Date;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;ZLjava/util/List;ZLjava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->canLoadMore:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->results:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->isLoading:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->nextDate:Ljava/util/Date;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->copy(ZLjava/util/List;ZLjava/util/Date;)Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->canLoadMore:Z

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->results:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->isLoading:Z

    return v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->nextDate:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(ZLjava/util/List;ZLjava/util/Date;)Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;Z",
            "Ljava/util/Date;",
            ")",
            "Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;-><init>(ZLjava/util/List;ZLjava/util/Date;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->canLoadMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->canLoadMore:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->results:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->results:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->isLoading:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->isLoading:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->nextDate:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->nextDate:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCanLoadMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->canLoadMore:Z

    return v0
.end method

.method public final getNextDate()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->nextDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->results:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->canLoadMore:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->results:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->isLoading:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->nextDate:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->isLoading:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->canLoadMore:Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->results:Ljava/util/List;

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->isLoading:Z

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->nextDate:Ljava/util/Date;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PinnedMessageListState(canLoadMore="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", results="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isLoading="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", nextDate="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
