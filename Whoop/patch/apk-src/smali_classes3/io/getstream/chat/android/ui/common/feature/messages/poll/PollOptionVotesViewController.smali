.class public final Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00110\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u001d\u00102\u001a\u0008\u0012\u0004\u0012\u00020.018\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u001a\u00107\u001a\u0008\u0012\u0004\u0012\u0002060\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u0010)R\u001d\u00109\u001a\u0008\u0012\u0004\u0012\u000206088\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\u00a8\u0006="
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;",
        "",
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "Lio/getstream/chat/android/models/Option;",
        "option",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/QueryPollVotesResult;",
        "fetchPollVotes",
        "(Lq83/d;)Ljava/lang/Object;",
        "result",
        "Ll83/a0;",
        "onSuccessResult",
        "(Lio/getstream/chat/android/models/QueryPollVotesResult;)V",
        "Ln23/e;",
        "error",
        "onFailureResult",
        "(Ln23/e;)V",
        "loadMore",
        "()V",
        "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;",
        "action",
        "onViewAction",
        "(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;)V",
        "Lio/getstream/chat/android/models/Poll;",
        "Lio/getstream/chat/android/models/Option;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lec3/o1;",
        "loadRequests",
        "Lec3/o1;",
        "",
        "nextPage",
        "Ljava/lang/String;",
        "Lec3/p1;",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;",
        "_state",
        "Lec3/p1;",
        "Lec3/f2;",
        "state",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
        "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent;",
        "_events",
        "Lec3/t1;",
        "events",
        "Lec3/t1;",
        "getEvents",
        "()Lec3/t1;",
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
.field private final _events:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final events:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final loadRequests:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private nextPage:Ljava/lang/String;

.field private final option:Lio/getstream/chat/android/models/Option;

.field private final poll:Lio/getstream/chat/android/models/Poll;

.field private final state:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v11, p4

    const-string v4, "poll"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "option"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "chatClient"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "scope"

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->poll:Lio/getstream/chat/android/models/Poll;

    .line 3
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->option:Lio/getstream/chat/android/models/Option;

    .line 4
    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 5
    const-string v3, "Chat:PollOptionVotesViewController"

    invoke-static {v0, v3}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->logger$delegate:Ll83/h;

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x5

    .line 6
    invoke-static {v12, v13, v14, v15}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->loadRequests:Lec3/o1;

    .line 7
    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    .line 8
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Poll;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_0

    :cond_0
    move v4, v12

    .line 9
    :goto_0
    invoke-static/range {p1 .. p1}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->getWinner(Lio/getstream/chat/android/models/Poll;)Lio/getstream/chat/android/models/Option;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/16 v9, 0x78

    const/4 v10, 0x0

    move-object v6, v3

    move v3, v4

    move v4, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v17, v16

    .line 10
    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;-><init>(Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->_state:Lec3/p1;

    .line 12
    invoke-static {v1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->state:Lec3/f2;

    .line 13
    invoke-static {v12, v13, v14, v15}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->_events:Lec3/o1;

    .line 14
    invoke-static {v1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->events:Lec3/t1;

    .line 15
    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$1;

    const/4 v2, 0x2

    .line 16
    invoke-direct {v1, v2, v14}, Ls83/i;-><init>(ILq83/d;)V

    .line 17
    new-instance v2, Lec3/a0;

    move-object/from16 v6, v17

    invoke-direct {v2, v1, v6}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 18
    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;

    invoke-direct {v1, v14, v0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;)V

    invoke-static {v2, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    .line 19
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$3;

    invoke-direct {v2, v0, v14}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$3;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;Lq83/d;)V

    .line 20
    new-instance v3, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v2, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 21
    invoke-static {v3, v11}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 22
    sget-object p3, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p3

    .line 23
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;-><init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic access$fetchPollVotes(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->fetchPollVotes(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onFailureResult(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;Ln23/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->onFailureResult(Ln23/e;)V

    return-void
.end method

.method public static final synthetic access$onSuccessResult(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;Lio/getstream/chat/android/models/QueryPollVotesResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->onSuccessResult(Lio/getstream/chat/android/models/QueryPollVotesResult;)V

    return-void
.end method

.method private final fetchPollVotes(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->option:Lio/getstream/chat/android/models/Option;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->nextPage:Ljava/lang/String;

    const-string v6, ", option: "

    const-string v7, ", limit: 25, next: "

    const-string v8, "[fetchPollVotes] Fetching votes for poll: "

    invoke-static {v8, v1, v6, v4, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->option:Lio/getstream/chat/android/models/Option;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "option_id"

    invoke-static {v1, v0}, Lio/getstream/chat/android/models/Filters;->eq(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v7

    new-instance v8, Ljava/lang/Integer;

    const/16 v0, 0x19

    invoke-direct {v8, v0}, Ljava/lang/Integer;-><init>(I)V

    iget-object v9, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->nextPage:Ljava/lang/String;

    sget-object v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    const-string v1, "created_at"

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->descByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v10

    invoke-virtual/range {v5 .. v10}, Lio/getstream/chat/android/client/ChatClient;->queryPollVotes(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final loadMore()V
    .locals 12

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->state:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading()Z

    move-result v0

    const/4 v11, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] still loading initial votes, cannot load more"

    invoke-interface {v0, v3, v2, v1, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->getCanLoadMore()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] no more votes to load"

    invoke-interface {v0, v3, v2, v1, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] already loading more votes"

    invoke-interface {v0, v3, v2, v1, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[loadMore] loading more votes"

    invoke-interface {v0, v4, v3, v2, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->_state:Lec3/p1;

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    move-result-object v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v11, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->loadRequests:Lec3/o1;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method private final onFailureResult(Ln23/e;)V
    .locals 12

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v1

    const-string v4, "[onFailureResult] error: "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->_events:Lec3/o1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent$LoadError;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent$LoadError;-><init>(Ln23/e;)V

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->_state:Lec3/p1;

    :cond_1
    move-object v0, p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    const/16 v10, 0x37

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void
.end method

.method private final onSuccessResult(Lio/getstream/chat/android/models/QueryPollVotesResult;)V
    .locals 13

    invoke-virtual {p1}, Lio/getstream/chat/android/models/QueryPollVotesResult;->getNext()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->nextPage:Ljava/lang/String;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/QueryPollVotesResult;->getVotes()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->nextPage:Ljava/lang/String;

    const-string v5, "[onSuccessResult] Fetched "

    const-string v6, " votes, next: "

    invoke-static {v1, v5, v6, v4}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->_state:Lec3/p1;

    :cond_1
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->getResults()Ljava/util/List;

    move-result-object v4

    goto :goto_0

    :cond_2
    sget-object v4, Lm83/y;->w:Lm83/y;

    :goto_0
    check-cast v4, Ljava/util/Collection;

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v4, v5}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v8

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->nextPage:Ljava/lang/String;

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    :goto_1
    move v9, v4

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    goto :goto_1

    :goto_2
    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v12}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void
.end method


# virtual methods
.method public final getEvents()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->events:Lec3/t1;

    return-object v0
.end method

.method public final getState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->state:Lec3/f2;

    return-object v0
.end method

.method public final onViewAction(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction$LoadMoreRequested;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction$LoadMoreRequested;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->loadMore()V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
