.class final Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->addChannelsState$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsStateLogic$addChannelsState$4$1"
    f = "QueryChannelsStateLogic.kt"
    l = {
        0xa7
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channel:Lio/getstream/chat/android/models/Channel;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;Lio/getstream/chat/android/models/Channel;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;",
            "Lio/getstream/chat/android/models/Channel;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->$channel:Lio/getstream/chat/android/models/Channel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->$channel:Lio/getstream/chat/android/models/Channel;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;Lio/getstream/chat/android/models/Channel;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->access$getLogicRegistry$p(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->$channel:Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->$channel:Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v4

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->$channel:Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    iput v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;->label:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/16 v12, 0x1c

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v4 .. v13}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->updateDataForChannel$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
