.class public final Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$Companion;,
        Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 42\u00020\u0001:\u000254B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J(\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0007\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u0008J\u000f\u0010\u0019\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001aR\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R \u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060$0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001eR#\u0010&\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060$0\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010!\u001a\u0004\u0008\'\u0010#R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102\u00a8\u00066"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "<init>",
        "(Lio/getstream/chat/android/client/ChatClient;)V",
        "Ll83/a0;",
        "searchMessages",
        "()V",
        "Lio/getstream/chat/android/models/SearchMessagesResult;",
        "searchResult",
        "handleSearchMessageSuccess",
        "(Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;",
        "Ln23/e;",
        "streamError",
        "handleSearchMessagesError",
        "(Ln23/e;)V",
        "",
        "query",
        "next",
        "Ln23/h;",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "setQuery",
        "(Ljava/lang/String;)V",
        "loadMore",
        "onCleared",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Landroidx/lifecycle/u0;",
        "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;",
        "_state",
        "Landroidx/lifecycle/u0;",
        "Landroidx/lifecycle/p0;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/client/api/state/Event;",
        "_errorEvents",
        "errorEvents",
        "getErrorEvents",
        "Lbc3/c0;",
        "scope",
        "Lbc3/c0;",
        "Lbc3/k1;",
        "job",
        "Lbc3/k1;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Companion",
        "State",
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


# static fields
.field private static final Companion:Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$Companion;

.field private static final QUERY_LIMIT:I = 0x1e


# instance fields
.field private final _errorEvents:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final _state:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final errorEvents:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private job:Lbc3/k1;

.field private final logger$delegate:Ll83/h;

.field private final scope:Lbc3/c0;

.field private final state:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->Companion:Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;-><init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;)V
    .locals 9

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 5
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 6
    new-instance p1, Landroidx/lifecycle/u0;

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;-><init>(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    invoke-direct {p1, v0}, Landroidx/lifecycle/p0;-><init>(Ljava/lang/Object;)V

    .line 8
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_state:Landroidx/lifecycle/u0;

    .line 9
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->state:Landroidx/lifecycle/p0;

    .line 10
    new-instance p1, Landroidx/lifecycle/u0;

    .line 11
    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    .line 12
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_errorEvents:Landroidx/lifecycle/u0;

    .line 13
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->errorEvents:Landroidx/lifecycle/p0;

    .line 14
    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->scope:Lbc3/c0;

    .line 15
    const-string p1, "Chat:SearchViewModel"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 2
    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;-><init>(Lio/getstream/chat/android/client/ChatClient;)V

    return-void
.end method

.method public static final synthetic access$get_state$p(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;)Landroidx/lifecycle/u0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_state:Landroidx/lifecycle/u0;

    return-object p0
.end method

.method public static final synthetic access$handleSearchMessageSuccess(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->handleSearchMessageSuccess(Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleSearchMessagesError(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Ln23/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->handleSearchMessagesError(Ln23/e;)V

    return-void
.end method

.method public static final synthetic access$searchMessages(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->searchMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final handleSearchMessageSuccess(Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;
    .locals 17
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

    instance-of v2, v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;

    iget v3, v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;->label:I

    const/4 v5, 0x0

    const/16 v6, 0xa

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v7, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    iget-object v2, v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/SearchMessagesResult;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v3

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v8, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/SearchMessagesResult;->getMessages()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const-string v10, "Found messages: "

    invoke-static {v4, v10}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v9, v8, v4, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_state:Landroidx/lifecycle/u0;

    invoke-virtual {v1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    iget-object v4, v0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v4}, Lio/getstream/chat/android/client/ChatClient;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/SearchMessagesResult;->getMessages()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v8, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    move-object/from16 v10, p1

    iput-object v10, v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;->L$1:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$handleSearchMessageSuccess$1;->label:I

    invoke-virtual {v4, v9, v5, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    return-object v3

    :cond_5
    move-object v8, v1

    move-object v1, v2

    move-object v2, v10

    :goto_2
    check-cast v1, Ljava/util/List;

    iget-object v3, v0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_state:Landroidx/lifecycle/u0;

    invoke-virtual {v8}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->getResults()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/SearchMessagesResult;->getMessages()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/Message;

    move-object v11, v1

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_4

    :cond_7
    move-object v12, v5

    :goto_4
    check-cast v12, Lio/getstream/chat/android/models/Channel;

    new-instance v11, Lio/getstream/chat/android/ui/common/model/MessageResult;

    invoke-direct {v11, v9, v12}, Lio/getstream/chat/android/ui/common/model/MessageResult;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-static {v4, v10}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v2}, Lio/getstream/chat/android/models/SearchMessagesResult;->getNext()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_9

    goto :goto_5

    :cond_9
    const/4 v1, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    move v1, v7

    :goto_6
    xor-int/lit8 v10, v1, 0x1

    invoke-virtual {v2}, Lio/getstream/chat/android/models/SearchMessagesResult;->getNext()Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->copy$default(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method private final handleSearchMessagesError(Ln23/e;)V
    .locals 10

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Error searching messages: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_state:Landroidx/lifecycle/u0;

    invoke-virtual {p1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    const/16 v8, 0x27

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->copy$default(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_errorEvents:Landroidx/lifecycle/u0;

    new-instance v0, Lio/getstream/chat/android/client/api/state/Event;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api/state/Event;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final searchMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->getLogger()Lb23/k;

    move-result-object v0

    .line 3
    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    .line 4
    sget-object v2, Lb23/g;->y:Lb23/g;

    .line 5
    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    .line 6
    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    .line 8
    const-string v1, "Searching for \""

    const-string v4, "\" with next: "

    .line 9
    invoke-static {v1, p1, v4, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    .line 10
    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Lio/getstream/chat/android/models/User;

    .line 12
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 13
    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "members"

    invoke-static {v2, v0}, Lio/getstream/chat/android/models/Filters;->in(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v2

    .line 14
    const-string v0, "text"

    invoke-static {v0, p1}, Lio/getstream/chat/android/models/Filters;->autocomplete(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v3

    .line 15
    new-instance v5, Ljava/lang/Integer;

    const/16 p1, 0x1e

    invoke-direct {v5, p1}, Ljava/lang/Integer;-><init>(I)V

    const/16 v8, 0x24

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v6, p2

    .line 16
    invoke-static/range {v1 .. v9}, Lio/getstream/chat/android/client/ChatClient;->searchMessages$default(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    .line 17
    invoke-interface {p1, p3}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final searchMessages()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->job:Lbc3/k1;

    return-void
.end method


# virtual methods
.method public final getErrorEvents()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->errorEvents:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final loadMore()V
    .locals 10

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->job:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_state:Landroidx/lifecycle/u0;

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->getCanLoadMore()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_state:Landroidx/lifecycle/u0;

    const/16 v8, 0x2f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->copy$default(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->searchMessages()V

    :cond_1
    return-void
.end method

.method public final onCleared()V
    .locals 2

    invoke-super {p0}, Landroidx/lifecycle/w1;->onCleared()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->scope:Lbc3/c0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final setQuery(Ljava/lang/String;)V
    .locals 10

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->job:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sget-object v4, Lm83/y;->w:Lm83/y;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_state:Landroidx/lifecycle/u0;

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;-><init>(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_1
    move-object v2, p1

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->_state:Landroidx/lifecycle/u0;

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;-><init>(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->searchMessages()V

    return-void
.end method
