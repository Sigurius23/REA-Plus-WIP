.class final Lio/getstream/chat/android/client/ChatClient$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;-><init>(Lio/getstream/chat/android/client/api/ChatApiConfig;Lio/getstream/chat/android/client/api/ChatApi;Lio/getstream/chat/android/client/api2/mapping/DtoMapping;Lio/getstream/chat/android/client/notifications/ChatNotifications;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/TokenUtils;Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/UserScope;Lr23/d;Lio/getstream/chat/android/client/helpers/AppSettingManager;Lio/getstream/chat/android/client/socket/ChatSocket;Ljava/util/List;Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;Lio/getstream/chat/android/client/user/CurrentUserFetcher;Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;Lio/getstream/chat/android/client/audio/AudioPlayer;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lio/getstream/chat/android/client/cdn/CDN;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<EventT:",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        ">",
        "Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEvent(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;

    iget v1, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;-><init>(Lio/getstream/chat/android/client/ChatClient$2;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/ChatEvent;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/ChatClient;

    iget-object v5, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v5

    move-object v5, v2

    move v2, p1

    move-object p1, v7

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/ChatClient$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p2}, Lio/getstream/chat/android/client/ChatClient;->access$getEventMutex$p(Lio/getstream/chat/android/client/ChatClient;)Lmc3/a;

    move-result-object p2

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->label:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v5, v2

    move v2, v3

    :goto_1
    :try_start_1
    iput-object v6, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->L$2:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->I$1:I

    iput v4, v0, Lio/getstream/chat/android/client/ChatClient$2$onEvent$1;->label:I

    invoke-static {v5, p1, v0}, Lio/getstream/chat/android/client/ChatClient;->access$handleEvent(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object p1, p2

    :goto_3
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_4
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method
