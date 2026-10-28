.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;",
        "",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "mutableState",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;)V",
        "",
        "isInsideSearch",
        "Ll83/a0;",
        "updateSearchState",
        "(Z)V",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "request",
        "noMoreMessages",
        "handleMessageBounds",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)V",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "Z",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private isInsideSearch:Z

.field private final mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;)V
    .locals 1

    const-string v0, "mutableState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    return-void
.end method

.method private final updateSearchState(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;->isInsideSearch:Z

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setInsideSearch(Z)V

    return-void
.end method


# virtual methods
.method public final handleMessageBounds(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)V
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;->isInsideSearch:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringAroundIdMessages()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;->updateSearchState(Z)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;->isInsideSearch:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringNewerMessages()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;->updateSearchState(Z)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringMessages()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;->updateSearchState(Z)V

    :cond_2
    return-void
.end method
