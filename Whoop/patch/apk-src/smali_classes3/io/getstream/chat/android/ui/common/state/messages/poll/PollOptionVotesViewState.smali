.class public final Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003JU\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010 \u001a\u00020\u00072\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0014R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0014R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0014\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;",
        "",
        "option",
        "Lio/getstream/chat/android/models/Option;",
        "voteCount",
        "",
        "isWinner",
        "",
        "isLoading",
        "results",
        "",
        "Lio/getstream/chat/android/models/Vote;",
        "canLoadMore",
        "isLoadingMore",
        "<init>",
        "(Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZ)V",
        "getOption",
        "()Lio/getstream/chat/android/models/Option;",
        "getVoteCount",
        "()I",
        "()Z",
        "getResults",
        "()Ljava/util/List;",
        "getCanLoadMore",
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

.field private final isLoadingMore:Z

.field private final isWinner:Z

.field private final option:Lio/getstream/chat/android/models/Option;

.field private final results:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation
.end field

.field private final voteCount:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Option;",
            "IZZ",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;ZZ)V"
        }
    .end annotation

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "results"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->option:Lio/getstream/chat/android/models/Option;

    .line 3
    iput p2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->voteCount:I

    .line 4
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isWinner:Z

    .line 5
    iput-boolean p4, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading:Z

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->results:Ljava/util/List;

    .line 7
    iput-boolean p6, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->canLoadMore:Z

    .line 8
    iput-boolean p7, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x1

    if-eqz p9, :cond_0

    move p4, v0

    :cond_0
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_1

    .line 9
    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_2

    move p6, v0

    :cond_2
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_3

    const/4 p7, 0x0

    :cond_3
    move p8, p7

    move p7, p6

    move-object p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 10
    invoke-direct/range {p1 .. p8}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;-><init>(Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->option:Lio/getstream/chat/android/models/Option;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->voteCount:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isWinner:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->results:Ljava/util/List;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->canLoadMore:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore:Z

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->copy(Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZ)Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Option;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->option:Lio/getstream/chat/android/models/Option;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->voteCount:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isWinner:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading:Z

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->results:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->canLoadMore:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZ)Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Option;",
            "IZZ",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;ZZ)",
            "Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;"
        }
    .end annotation

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "results"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;-><init>(Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZ)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->option:Lio/getstream/chat/android/models/Option;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->option:Lio/getstream/chat/android/models/Option;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->voteCount:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->voteCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isWinner:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isWinner:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->results:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->results:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->canLoadMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->canLoadMore:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCanLoadMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->canLoadMore:Z

    return v0
.end method

.method public final getOption()Lio/getstream/chat/android/models/Option;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->option:Lio/getstream/chat/android/models/Option;

    return-object v0
.end method

.method public final getResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->results:Ljava/util/List;

    return-object v0
.end method

.method public final getVoteCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->voteCount:I

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->option:Lio/getstream/chat/android/models/Option;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Option;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->voteCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isWinner:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->results:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->canLoadMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading:Z

    return v0
.end method

.method public final isLoadingMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore:Z

    return v0
.end method

.method public final isWinner()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isWinner:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->option:Lio/getstream/chat/android/models/Option;

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->voteCount:I

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isWinner:Z

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading:Z

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->results:Ljava/util/List;

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->canLoadMore:Z

    iget-boolean v6, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore:Z

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "PollOptionVotesViewState(option="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", voteCount="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isWinner="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isLoading="

    const-string v1, ", results="

    invoke-static {v7, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", canLoadMore="

    const-string v1, ", isLoadingMore="

    invoke-static {v0, v1, v7, v4, v5}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
