.class public final Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0006R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;",
        "",
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "<init>",
        "(Lio/getstream/chat/android/models/Poll;)V",
        "Lio/getstream/chat/android/models/Poll;",
        "Lec3/p1;",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;",
        "_state",
        "Lec3/p1;",
        "Lec3/f2;",
        "state",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
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
.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final poll:Lio/getstream/chat/android/models/Poll;

.field private final state:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Poll;)V
    .locals 10

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->getWinner(Lio/getstream/chat/android/models/Poll;)Lio/getstream/chat/android/models/Option;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getOptions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/models/Option;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-static {v3, v5}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->getVotesUnlessAnonymous(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    const/4 v4, 0x5

    invoke-static {v3, v4}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v8

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Poll;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move v7, v3

    :goto_1
    move v3, v4

    goto :goto_2

    :cond_0
    move v7, v6

    goto :goto_1

    :goto_2
    new-instance v4, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    move v9, v6

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-le v7, v3, :cond_1

    const/4 v3, 0x1

    move v9, v3

    :cond_1
    invoke-direct/range {v4 .. v9}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;-><init>(Lio/getstream/chat/android/models/Option;ZILjava/util/List;Z)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;

    invoke-direct {p1, v1, v2}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;->_state:Lec3/p1;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;->state:Lec3/f2;

    return-void
.end method


# virtual methods
.method public final getState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;->state:Lec3/f2;

    return-object v0
.end method
