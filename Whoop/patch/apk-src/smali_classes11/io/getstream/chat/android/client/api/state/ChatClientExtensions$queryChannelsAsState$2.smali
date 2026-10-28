.class final Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->queryChannelsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lbc3/c0;)Lec3/f2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lio/getstream/chat/android/client/api/state/QueryChannelsState;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$queryChannelsAsState$2"
    f = "ChatClientStateExtensions.kt"
    l = {
        0x8b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

.field final synthetic $coroutineScope:Lbc3/c0;

.field final synthetic $request:Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

.field final synthetic $this_queryChannelsAsState:Lio/getstream/chat/android/client/ChatClient;

.field label:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$this_queryChannelsAsState:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$coroutineScope:Lbc3/c0;

    iput-object p3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iput-object p4, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$this_queryChannelsAsState:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$coroutineScope:Lbc3/c0;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v4, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$this_queryChannelsAsState:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$coroutineScope:Lbc3/c0;

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/internal/state/extensions/internal/ChatClientKt;->requestsAsState(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->$chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    iput v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;->label:I

    invoke-virtual {p1, v1, v3, p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->queryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
