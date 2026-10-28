.class final Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->requestMoreChannels()V
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
    c = "io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$requestMoreChannels$1"
    f = "ChannelListViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $nextPageRequest:Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->$nextPageRequest:Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->invokeSuspend$lambda$1(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private static final invokeSuspend$lambda$1(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ln23/e;)Ll83/a0;
    .locals 5

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getLogger(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not load more channels. Error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Cause: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, v1, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->$nextPageRequest:Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getChatClient$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->$nextPageRequest:Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient;->queryChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/c;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;I)V

    invoke-static {p1, v1}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
