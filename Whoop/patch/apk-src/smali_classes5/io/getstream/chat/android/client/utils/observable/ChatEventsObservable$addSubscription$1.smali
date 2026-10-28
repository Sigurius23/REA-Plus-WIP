.class final Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->addSubscription(Lio/getstream/chat/android/client/utils/observable/EventSubscription;)Lio/getstream/chat/android/client/utils/observable/Disposable;
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
    c = "io.getstream.chat.android.client.utils.observable.ChatEventsObservable$addSubscription$1"
    f = "ChatEventsObservable.kt"
    l = {
        0xbc
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $subscription:Lio/getstream/chat/android/client/utils/observable/EventSubscription;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/utils/observable/EventSubscription;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;",
            "Lio/getstream/chat/android/client/utils/observable/EventSubscription;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    iput-object p2, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->$subscription:Lio/getstream/chat/android/client/utils/observable/EventSubscription;

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

    new-instance p1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->$subscription:Lio/getstream/chat/android/client/utils/observable/EventSubscription;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;-><init>(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/utils/observable/EventSubscription;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/utils/observable/EventSubscription;

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    iget-object v2, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$getMutex$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lmc3/a;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    iget-object v3, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->$subscription:Lio/getstream/chat/android/client/utils/observable/EventSubscription;

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->L$2:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->I$0:I

    iput v2, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;->label:I

    invoke-interface {p1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v2, p1

    move-object v0, v3

    :goto_0
    const/4 p1, 0x0

    :try_start_0
    invoke-static {v1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$getSubscriptions$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$getChatSocket$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lio/getstream/chat/android/client/socket/ChatSocket;

    move-result-object v3

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$getEventsMapper$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/client/socket/ChatSocket;->addListener(Lio/getstream/chat/android/client/socket/SocketListener;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {v1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$getSubscriptions$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_2
    invoke-interface {v2, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method
