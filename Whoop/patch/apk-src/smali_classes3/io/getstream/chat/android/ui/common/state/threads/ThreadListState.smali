.class public final Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003JA\u0010\u0018\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u000fR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000f\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;",
        "",
        "threads",
        "",
        "Lio/getstream/chat/android/models/Thread;",
        "isLoading",
        "",
        "isLoadingMore",
        "unseenThreadsCount",
        "",
        "loadingError",
        "<init>",
        "(Ljava/util/List;ZZIZ)V",
        "getThreads",
        "()Ljava/util/List;",
        "()Z",
        "getUnseenThreadsCount",
        "()I",
        "getLoadingError",
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
.field private final isLoading:Z

.field private final isLoadingMore:Z

.field private final loadingError:Z

.field private final threads:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation
.end field

.field private final unseenThreadsCount:I


# direct methods
.method public constructor <init>(Ljava/util/List;ZZIZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZZIZ)V"
        }
    .end annotation

    const-string v0, "threads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->threads:Ljava/util/List;

    .line 3
    iput-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading:Z

    .line 4
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore:Z

    .line 5
    iput p4, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->unseenThreadsCount:I

    .line 6
    iput-boolean p5, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->loadingError:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;-><init>(Ljava/util/List;ZZIZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;Ljava/util/List;ZZIZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->threads:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->unseenThreadsCount:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->loadingError:Z

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->copy(Ljava/util/List;ZZIZ)Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->threads:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->unseenThreadsCount:I

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->loadingError:Z

    return v0
.end method

.method public final copy(Ljava/util/List;ZZIZ)Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZZIZ)",
            "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;"
        }
    .end annotation

    const-string v0, "threads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;-><init>(Ljava/util/List;ZZIZ)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->threads:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->threads:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->unseenThreadsCount:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->unseenThreadsCount:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->loadingError:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->loadingError:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getLoadingError()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->loadingError:Z

    return v0
.end method

.method public final getThreads()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->threads:Ljava/util/List;

    return-object v0
.end method

.method public final getUnseenThreadsCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->unseenThreadsCount:I

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->threads:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->unseenThreadsCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->loadingError:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading:Z

    return v0
.end method

.method public final isLoadingMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->threads:Ljava/util/List;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore:Z

    iget v3, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->unseenThreadsCount:I

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->loadingError:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ThreadListState(threads="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isLoading="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLoadingMore="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", unseenThreadsCount="

    const-string v1, ", loadingError="

    invoke-static {v3, v0, v1, v5, v2}, Lr;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
