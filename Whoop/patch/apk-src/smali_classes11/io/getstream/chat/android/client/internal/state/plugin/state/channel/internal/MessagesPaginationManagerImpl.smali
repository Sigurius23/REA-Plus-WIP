.class public final Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J%\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0003R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "query",
        "Ll83/a0;",
        "begin",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
        "result",
        "end",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "setOldestMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "setNewestMessage",
        "",
        "hasLoadedAll",
        "setEndOfOlderMessages",
        "(Z)V",
        "setEndOfNewerMessages",
        "reset",
        "Lec3/p1;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;",
        "_state",
        "Lec3/p1;",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
        "state",
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
.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    return-void
.end method


# virtual methods
.method public final begin(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V
    .locals 11

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->filteringOlderMessages()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v9, 0x5f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringNewerMessages()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v9, 0x6f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringAroundIdMessages()Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 v9, 0x3b

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    goto :goto_0

    :cond_2
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    :cond_3
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    invoke-virtual {v1, v2, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-void
.end method

.method public final end(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Ln23/h;",
            ")V"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ln23/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    :cond_0
    move-object p1, v0

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_3

    :cond_1
    check-cast p2, Ln23/g;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    iget-object p2, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->filteringOlderMessages()Z

    move-result v0

    const/4 v3, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result p1

    if-ge p2, p1, :cond_2

    goto :goto_0

    :cond_2
    move v5, v3

    :goto_0
    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringNewerMessages()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result p1

    if-ge p2, p1, :cond_4

    move v3, v5

    :cond_4
    if-eqz v3, :cond_5

    const/4 v4, 0x0

    :cond_5
    const/16 v9, 0x9

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v11, v4

    move v4, v3

    move-object v3, v11

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringAroundIdMessages()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v3, v2

    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZ)V

    move-object p1, v2

    goto :goto_2

    :cond_7
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result p1

    if-ge p2, p1, :cond_8

    goto :goto_1

    :cond_8
    move v5, v3

    :goto_1
    const/16 v9, 0x70

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    :goto_2
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    :cond_9
    move-object v0, p2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_3
    return-void
.end method

.method public final getState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final reset()V
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setEndOfNewerMessages(Z)V
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    :goto_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    if-eqz p1, :cond_0

    const/4 v4, 0x0

    :goto_1
    move-object v5, v4

    goto :goto_2

    :cond_0
    invoke-virtual {v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->getNewestMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v4

    goto :goto_1

    :goto_2
    const/16 v11, 0x79

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v6, p1

    invoke-static/range {v3 .. v12}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    move p1, v6

    goto :goto_0
.end method

.method public final setEndOfOlderMessages(Z)V
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    :goto_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const/16 v11, 0x77

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v7, p1

    invoke-static/range {v3 .. v12}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move p1, v7

    goto :goto_0
.end method

.method public final setNewestMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    :goto_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const/16 v11, 0x7d

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, p1

    invoke-static/range {v3 .. v12}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move-object p1, v5

    goto :goto_0
.end method

.method public final setOldestMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;->_state:Lec3/p1;

    :goto_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const/16 v11, 0x7e

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v12}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->copy$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move-object p1, v4

    goto :goto_0
.end method
