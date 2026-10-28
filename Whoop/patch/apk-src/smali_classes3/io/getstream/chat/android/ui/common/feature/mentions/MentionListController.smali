.class public final Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001aR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u001a\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u001d\u0010*\u001a\u0008\u0012\u0004\u0012\u00020&0)8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010$R\u001d\u00101\u001a\u0008\u0012\u0004\u0012\u00020.008\u0006\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;",
        "",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Message;",
        "sort",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/ChatClient;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/SearchMessagesResult;",
        "searchMentions",
        "(Lq83/d;)Ljava/lang/Object;",
        "result",
        "Ll83/a0;",
        "onSuccessResult",
        "(Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;",
        "Ln23/e;",
        "error",
        "onFailureResult",
        "(Ln23/e;)V",
        "loadMore",
        "()V",
        "refresh",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
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
        "Lec3/p1;",
        "Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;",
        "_state",
        "Lec3/p1;",
        "Lec3/f2;",
        "state",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
        "Lio/getstream/chat/android/ui/common/state/mentions/MentionListEvent;",
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

.field private final sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private final state:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/ChatClient;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lio/getstream/chat/android/client/ChatClient;",
            ")V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    .line 3
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 4
    const-string p2, "Chat:MentionListController"

    invoke-static {p0, p2}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->logger$delegate:Ll83/h;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x5

    .line 5
    invoke-static {p2, p3, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v2

    iput-object v2, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->loadRequests:Lec3/o1;

    .line 6
    new-instance v3, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    const/16 v10, 0x3f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;-><init>(ZLjava/util/List;Ljava/lang/String;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v3

    iput-object v3, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->_state:Lec3/p1;

    .line 7
    invoke-static {v3}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v3

    iput-object v3, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->state:Lec3/f2;

    .line 8
    invoke-static {p2, p3, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->_events:Lec3/o1;

    .line 9
    invoke-static {p2}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->events:Lec3/t1;

    .line 10
    new-instance p2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$1;

    const/4 p3, 0x2

    .line 11
    invoke-direct {p2, p3, v0}, Ls83/i;-><init>(ILq83/d;)V

    .line 12
    new-instance p3, Lec3/a0;

    invoke-direct {p3, p2, v2}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 13
    new-instance p2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$special$$inlined$flatMapLatest$1;

    invoke-direct {p2, v0, p0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;)V

    invoke-static {p3, p2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p2

    .line 14
    new-instance p3, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$3;

    invoke-direct {p3, p0, v0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$3;-><init>(Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;Lq83/d;)V

    .line 15
    new-instance v0, Lec3/j1;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 16
    invoke-static {v0, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 17
    sget-object p3, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p3

    .line 18
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;-><init>(Lbc3/c0;Lio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/ChatClient;)V

    return-void
.end method

.method public static final synthetic access$onFailureResult(Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;Ln23/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->onFailureResult(Ln23/e;)V

    return-void
.end method

.method public static final synthetic access$onSuccessResult(Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->onSuccessResult(Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$searchMentions(Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->searchMentions(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final onFailureResult(Ln23/e;)V
    .locals 12

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getLogger()Lb23/k;

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
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->_state:Lec3/p1;

    :cond_1
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->copy$default(Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;ZLjava/util/List;Ljava/lang/String;ZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->_events:Lec3/o1;

    new-instance v1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListEvent$Error;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListEvent$Error;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method private final onSuccessResult(Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SearchMessagesResult;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;

    iget v3, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;-><init>(Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->label:I

    const/16 v5, 0xa

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v7, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/SearchMessagesResult;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v3

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/SearchMessagesResult;->getMessages()Ljava/util/List;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/SearchMessagesResult;->getNext()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    const-string v12, "[onSuccessResult] messages: "

    const-string v13, ", next: "

    invoke-static {v9, v12, v13, v1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v11, v10, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v8, v0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v8}, Lio/getstream/chat/android/client/ChatClient;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v8

    move-object v9, v4

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iput-object v6, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->L$2:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController$onSuccessResult$1;->label:I

    invoke-virtual {v8, v10, v6, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    return-object v3

    :cond_5
    move-object v11, v1

    move-object v1, v2

    :goto_2
    check-cast v1, Ljava/util/List;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->_state:Lec3/p1;

    :goto_3
    move-object v3, v2

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v15

    move-object v8, v15

    check-cast v8, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    invoke-virtual {v8}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing()Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lm83/y;->w:Lm83/y;

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->getResults()Ljava/util/List;

    move-result-object v9

    :goto_4
    check-cast v9, Ljava/util/Collection;

    move-object v10, v4

    check-cast v10, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v10, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/getstream/chat/android/models/Message;

    move-object v14, v1

    check-cast v14, Ljava/lang/Iterable;

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v16

    check-cast v17, Lio/getstream/chat/android/models/Channel;

    invoke-virtual/range {v17 .. v17}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_7

    :cond_7
    const/16 v5, 0xa

    const/4 v6, 0x0

    goto :goto_6

    :cond_8
    const/16 v16, 0x0

    :goto_7
    move-object/from16 v5, v16

    check-cast v5, Lio/getstream/chat/android/models/Channel;

    new-instance v6, Lio/getstream/chat/android/ui/common/model/MessageResult;

    invoke-direct {v6, v13, v5}, Lio/getstream/chat/android/ui/common/model/MessageResult;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)V

    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v5, 0xa

    const/4 v6, 0x0

    goto :goto_5

    :cond_9
    invoke-static {v9, v12}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v10

    if-eqz v11, :cond_a

    move v12, v7

    goto :goto_8

    :cond_a
    const/4 v5, 0x0

    move v12, v5

    :goto_8
    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v8 .. v14}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->copy(ZLjava/util/List;Ljava/lang/String;ZZZ)Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    move-result-object v5

    invoke-virtual {v3, v15, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_b
    const/16 v5, 0xa

    const/4 v6, 0x0

    goto/16 :goto_3
.end method

.method private final searchMentions(Lq83/d;)Ljava/lang/Object;
    .locals 12
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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "members"

    invoke-static {v2, v1}, Lio/getstream/chat/android/models/Filters;->in(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v4

    const-string v1, "mentioned_users.id"

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/models/Filters;->contains(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v5

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->_state:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->getNextPage$stream_chat_android_ui_common_release()Ljava/lang/String;

    move-result-object v3

    const-string v8, "[searchMentions] currentUser: "

    const-string v9, ", limit: 30, nextPage: "

    invoke-static {v8, v0, v9, v3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v2, v7, v6, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    new-instance v7, Ljava/lang/Integer;

    const/16 v0, 0x1e

    invoke-direct {v7, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->getNextPage$stream_chat_android_ui_common_release()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v11}, Lio/getstream/chat/android/client/ChatClient;->searchMessages$default(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Object;)Lo23/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->events:Lec3/t1;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->state:Lec3/f2;

    return-object v0
.end method

.method public final loadMore()V
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->state:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->getCanLoadMore()Z

    move-result v0

    const/4 v10, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] no more mentions to load"

    invoke-interface {v0, v3, v2, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isLoadingMore()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] already loading more mentions"

    invoke-interface {v0, v3, v2, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->isRefreshing()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] already refreshing mentions"

    invoke-interface {v0, v3, v2, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[loadMore] no args"

    invoke-interface {v0, v4, v3, v2, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->_state:Lec3/p1;

    const/16 v8, 0x2f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;->copy$default(Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;ZLjava/util/List;Ljava/lang/String;ZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    move-result-object v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v10, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->loadRequests:Lec3/o1;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final refresh()V
    .locals 14

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[refresh] no args"

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->_state:Lec3/p1;

    new-instance v5, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;

    const/16 v12, 0x1e

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v13}, Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;-><init>(ZLjava/util/List;Ljava/lang/String;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v4, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->loadRequests:Lec3/o1;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method
