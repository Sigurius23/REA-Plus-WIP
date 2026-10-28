.class public final Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BK\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0008H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0017J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JM\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u000eR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000e\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;",
        "",
        "isLoading",
        "",
        "results",
        "",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "nextPage",
        "",
        "canLoadMore",
        "isLoadingMore",
        "isRefreshing",
        "<init>",
        "(ZLjava/util/List;Ljava/lang/String;ZZZ)V",
        "()Z",
        "getResults",
        "()Ljava/util/List;",
        "getNextPage$stream_chat_android_ui_common_release",
        "()Ljava/lang/String;",
        "getCanLoadMore",
        "component1",
        "component2",
        "component3",
        "component3$stream_chat_android_ui_common_release",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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

.field private final isLoadingMore:Z

.field private final isRefreshing:Z

.field private final nextPage:Ljava/lang/String;

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

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;-><init>(ZLjava/util/List;Ljava/lang/String;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/List;Ljava/lang/String;ZZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;",
            "Ljava/lang/String;",
            "ZZZ)V"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoading:Z

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->results:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->nextPage:Ljava/lang/String;

    .line 6
    iput-boolean p4, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->canLoadMore:Z

    .line 7
    iput-boolean p5, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoadingMore:Z

    .line 8
    iput-boolean p6, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/List;Ljava/lang/String;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x1

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 9
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    const/4 v0, 0x0

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move p7, v0

    :goto_0
    move p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move p7, p6

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p7}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;-><init>(ZLjava/util/List;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;ZLjava/util/List;Ljava/lang/String;ZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoading:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->results:Ljava/util/List;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->nextPage:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->canLoadMore:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoadingMore:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing:Z

    :cond_5
    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->copy(ZLjava/util/List;Ljava/lang/String;ZZZ)Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoading:Z

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->results:Ljava/util/List;

    return-object v0
.end method

.method public final component3$stream_chat_android_ui_common_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->nextPage:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->canLoadMore:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoadingMore:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing:Z

    return v0
.end method

.method public final copy(ZLjava/util/List;Ljava/lang/String;ZZZ)Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;",
            "Ljava/lang/String;",
            "ZZZ)",
            "Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;-><init>(ZLjava/util/List;Ljava/lang/String;ZZZ)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoading:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoading:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->results:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->results:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->nextPage:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->nextPage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->canLoadMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->canLoadMore:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoadingMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoadingMore:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCanLoadMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->canLoadMore:Z

    return v0
.end method

.method public final getNextPage$stream_chat_android_ui_common_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->nextPage:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->results:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoading:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->results:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->nextPage:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->canLoadMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoadingMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoading:Z

    return v0
.end method

.method public final isLoadingMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoadingMore:Z

    return v0
.end method

.method public final isRefreshing()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoading:Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->results:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->nextPage:Ljava/lang/String;

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->canLoadMore:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoadingMore:Z

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "MentionListState(isLoading="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", results="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nextPage="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", canLoadMore="

    const-string v1, ", isLoadingMore="

    invoke-static {v6, v2, v0, v3, v1}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", isRefreshing="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
