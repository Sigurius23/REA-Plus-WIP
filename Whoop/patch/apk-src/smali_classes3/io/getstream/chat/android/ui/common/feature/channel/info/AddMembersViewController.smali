.class public final Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 02\u00020\u0001:\u00010B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010%R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u001d\u0010,\u001a\u0008\u0012\u0004\u0012\u00020(0+8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/\u00a8\u00061"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;",
        "",
        "Lbc3/c0;",
        "scope",
        "",
        "resultLimit",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelState",
        "<init>",
        "(Lbc3/c0;ILio/getstream/chat/android/client/ChatClient;Lec3/l;)V",
        "",
        "query",
        "Ll83/a0;",
        "searchUsers",
        "(Ljava/lang/String;)V",
        "loadMore",
        "()V",
        "offset",
        "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;",
        "toSearchRequest",
        "(Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryUsersRequest;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction;",
        "action",
        "onViewAction",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction;)V",
        "Lbc3/c0;",
        "I",
        "Lio/getstream/chat/android/client/ChatClient;",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "channelMembers",
        "Lec3/l;",
        "Lbc3/k1;",
        "searchJob",
        "Lbc3/k1;",
        "loadMoreJob",
        "Lec3/p1;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;",
        "_state",
        "Lec3/p1;",
        "Lec3/f2;",
        "state",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
        "Companion",
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

.field private static final Companion:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$Companion;

.field private static final DEFAULT_RESULT_LIMIT:I = 0x1e

.field private static final TYPING_DEBOUNCE_TIMEOUT_MS:J = 0x12cL


# instance fields
.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final channelMembers:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private loadMoreJob:Lbc3/k1;

.field private final resultLimit:I

.field private final scope:Lbc3/c0;

.field private searchJob:Lbc3/k1;

.field private final state:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->Companion:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$Companion;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;ILio/getstream/chat/android/client/ChatClient;Lec3/l;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "I",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->scope:Lbc3/c0;

    .line 3
    iput p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->resultLimit:I

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 5
    new-instance p2, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$special$$inlined$flatMapLatest$1;

    const/4 p3, 0x3

    const/4 v0, 0x0

    .line 6
    invoke-direct {p2, p3, v0}, Ls83/i;-><init>(ILq83/d;)V

    .line 7
    invoke-static {p4, p2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p2

    .line 8
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->channelMembers:Lec3/l;

    .line 9
    new-instance v1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;-><init>(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->_state:Lec3/p1;

    .line 10
    invoke-static {p3}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p4

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->state:Lec3/f2;

    .line 11
    new-instance p4, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$special$$inlined$map$1;

    invoke-direct {p4, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$special$$inlined$map$1;-><init>(Lec3/l;)V

    .line 12
    invoke-static {p4}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p2

    .line 13
    new-instance p4, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;

    invoke-direct {p4, p0, v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Lq83/d;)V

    .line 14
    new-instance v1, Lec3/j1;

    invoke-direct {v1, p2, p4, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 15
    invoke-static {v1, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    .line 16
    new-instance p2, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$special$$inlined$map$2;

    invoke-direct {p2, p3}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$special$$inlined$map$2;-><init>(Lec3/l;)V

    const-wide/16 p3, 0x12c

    .line 17
    invoke-static {p2, p3, p4}, Lec3/v;->r(Lec3/l;J)Lec3/l;

    move-result-object p2

    .line 18
    invoke-static {p2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p2

    .line 19
    new-instance p3, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$4;

    invoke-direct {p3, p0, v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$4;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Lq83/d;)V

    .line 20
    new-instance p4, Lec3/j1;

    const/4 v0, 0x0

    invoke-direct {p4, p2, p3, v0}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 21
    invoke-static {p4, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;ILio/getstream/chat/android/client/ChatClient;Lec3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/16 p2, 0x1e

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    .line 22
    sget-object p3, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p3

    .line 23
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;-><init>(Lbc3/c0;ILio/getstream/chat/android/client/ChatClient;Lec3/l;)V

    return-void
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->_state:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$searchUsers(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->searchUsers(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$toSearchRequest(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryUsersRequest;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->toSearchRequest(Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryUsersRequest;

    move-result-object p0

    return-object p0
.end method

.method private final loadMore()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoading()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->isLoadingMore()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$loadMore$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$loadMore$1;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->loadMoreJob:Lbc3/k1;

    :cond_1
    :goto_0
    return-void
.end method

.method private final searchUsers(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->searchJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->loadMoreJob:Lbc3/k1;

    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->scope:Lbc3/c0;

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;

    invoke-direct {v2, p0, p1, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v1, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->searchJob:Lbc3/k1;

    return-void
.end method

.method private final toSearchRequest(Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryUsersRequest;
    .locals 8

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-string v1, "name"

    if-nez v0, :cond_0

    invoke-static {}, Lio/getstream/chat/android/models/Filters;->neutral()Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_0
    invoke-static {v1, p1}, Lio/getstream/chat/android/models/Filters;->autocomplete(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v0

    const-string v2, "id"

    invoke-static {v2, p1}, Lio/getstream/chat/android/models/Filters;->autocomplete(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    filled-new-array {v0, p1}, [Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/models/Filters;->or([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    goto :goto_0

    :goto_1
    new-instance v2, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;

    iget v5, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->resultLimit:I

    sget-object p1, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->ascByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v6

    const/4 v7, 0x1

    move v4, p2

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/client/api/models/QueryUsersRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Z)V

    return-object v2
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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->state:Lec3/f2;

    return-object v0
.end method

.method public final onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction;)V
    .locals 12

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$QueryChanged;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->_state:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move-object v4, p1

    check-cast v4, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$QueryChanged;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$QueryChanged;->getQuery()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0x3b

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$UserClick;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->_state:Lec3/p1;

    :cond_2
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move-object v4, p1

    check-cast v4, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$UserClick;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$UserClick;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->getSelectedUserIds()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->getSelectedUserIds()Ljava/util/Set;

    move-result-object v5

    invoke-static {v4, v5}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v4

    :goto_0
    move-object v8, v4

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->getSelectedUserIds()Ljava/util/Set;

    move-result-object v5

    invoke-static {v4, v5}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v4

    goto :goto_0

    :goto_1
    const/16 v10, 0x2f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_2
    return-void

    :cond_4
    instance-of p1, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$LoadMore;

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->loadMore()V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
