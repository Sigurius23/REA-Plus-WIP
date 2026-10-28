.class public final Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ResultItem"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003JA\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0010\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;",
        "",
        "option",
        "Lio/getstream/chat/android/models/Option;",
        "isWinner",
        "",
        "voteCount",
        "",
        "votes",
        "",
        "Lio/getstream/chat/android/models/Vote;",
        "showAllButton",
        "<init>",
        "(Lio/getstream/chat/android/models/Option;ZILjava/util/List;Z)V",
        "getOption",
        "()Lio/getstream/chat/android/models/Option;",
        "()Z",
        "getVoteCount",
        "()I",
        "getVotes",
        "()Ljava/util/List;",
        "getShowAllButton",
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
.field private final isWinner:Z

.field private final option:Lio/getstream/chat/android/models/Option;

.field private final showAllButton:Z

.field private final voteCount:I

.field private final votes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Option;ZILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Option;",
            "ZI",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "votes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->option:Lio/getstream/chat/android/models/Option;

    .line 3
    iput-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->isWinner:Z

    .line 4
    iput p3, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->voteCount:I

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->votes:Ljava/util/List;

    .line 6
    iput-boolean p5, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->showAllButton:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Option;ZILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;-><init>(Lio/getstream/chat/android/models/Option;ZILjava/util/List;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Lio/getstream/chat/android/models/Option;ZILjava/util/List;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->option:Lio/getstream/chat/android/models/Option;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->isWinner:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->voteCount:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->votes:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->showAllButton:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->copy(Lio/getstream/chat/android/models/Option;ZILjava/util/List;Z)Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Option;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->option:Lio/getstream/chat/android/models/Option;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->isWinner:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->voteCount:I

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->votes:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->showAllButton:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Option;ZILjava/util/List;Z)Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Option;",
            "ZI",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;Z)",
            "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;"
        }
    .end annotation

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "votes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;-><init>(Lio/getstream/chat/android/models/Option;ZILjava/util/List;Z)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->option:Lio/getstream/chat/android/models/Option;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->option:Lio/getstream/chat/android/models/Option;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->isWinner:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->isWinner:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->voteCount:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->voteCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->votes:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->votes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->showAllButton:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->showAllButton:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getOption()Lio/getstream/chat/android/models/Option;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->option:Lio/getstream/chat/android/models/Option;

    return-object v0
.end method

.method public final getShowAllButton()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->showAllButton:Z

    return v0
.end method

.method public final getVoteCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->voteCount:I

    return v0
.end method

.method public final getVotes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->votes:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->option:Lio/getstream/chat/android/models/Option;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Option;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->isWinner:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->voteCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->votes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->showAllButton:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isWinner()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->isWinner:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->option:Lio/getstream/chat/android/models/Option;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->isWinner:Z

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->voteCount:I

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->votes:Ljava/util/List;

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->showAllButton:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ResultItem(option="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isWinner="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", voteCount="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", votes="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showAllButton="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
