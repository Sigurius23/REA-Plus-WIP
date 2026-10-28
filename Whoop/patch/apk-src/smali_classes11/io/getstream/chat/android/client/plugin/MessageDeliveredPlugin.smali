.class public final Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/Plugin;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J&\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ6\u0010\u0013\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;",
        "Lio/getstream/chat/android/client/plugin/Plugin;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "<init>",
        "(Lio/getstream/chat/android/client/ChatClient;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;",
        "result",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "request",
        "Ll83/a0;",
        "onQueryChannelsResult",
        "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Channel;",
        "",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "onQueryChannelResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/receipts/MessageReceiptManager;",
        "messageReceiptManager$delegate",
        "Ll83/h;",
        "getMessageReceiptManager",
        "()Lio/getstream/chat/android/client/receipts/MessageReceiptManager;",
        "messageReceiptManager",
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
.field private final messageReceiptManager$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;-><init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;)V
    .locals 2

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lh02/n0;

    const/16 v1, 0x1a

    invoke-direct {v0, p1, v1}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;->messageReceiptManager$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;-><init>(Lio/getstream/chat/android/client/ChatClient;)V

    return-void
.end method

.method public static final synthetic access$getMessageReceiptManager(Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;)Lio/getstream/chat/android/client/receipts/MessageReceiptManager;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;->getMessageReceiptManager()Lio/getstream/chat/android/client/receipts/MessageReceiptManager;

    move-result-object p0

    return-object p0
.end method

.method private final getMessageReceiptManager()Lio/getstream/chat/android/client/receipts/MessageReceiptManager;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;->messageReceiptManager$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;

    return-object v0
.end method

.method private static final messageReceiptManager_delegate$lambda$0(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/receipts/MessageReceiptManager;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getMessageReceiptManager$stream_chat_android_client_release()Lio/getstream/chat/android/client/receipts/MessageReceiptManager;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final onQueryChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p5, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;

    if-eqz p2, :cond_0

    move-object p2, p5

    check-cast p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;

    iget p3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->label:I

    const/high16 v0, -0x80000000

    and-int v1, p3, v0

    if-eqz v1, :cond_0

    sub-int/2addr p3, v0

    iput p3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;

    invoke-direct {p2, p0, p5}, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;-><init>(Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;Lq83/d;)V

    :goto_0
    iget-object p3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->result:Ljava/lang/Object;

    sget-object p5, Lr83/a;->w:Lr83/a;

    iget v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->label:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$8:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$7:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_3

    move-object p3, p1

    check-cast p3, Ln23/g;

    iget-object p3, p3, Ln23/g;->a:Ljava/lang/Object;

    check-cast p3, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {p4}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->pagination()Ll83/k;

    move-result-object p4

    if-nez p4, :cond_4

    invoke-direct {p0}, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;->getMessageReceiptManager()Lio/getstream/chat/android/client/receipts/MessageReceiptManager;

    move-result-object p4

    invoke-static {p3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    const/4 v0, 0x0

    iput-object v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$3:Ljava/lang/Object;

    iput-object v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$4:Ljava/lang/Object;

    iput-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$5:Ljava/lang/Object;

    iput-object v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$6:Ljava/lang/Object;

    iput-object v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$7:Ljava/lang/Object;

    iput-object v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->L$8:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->I$0:I

    iput p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->I$1:I

    iput p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->I$2:I

    iput v1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelResult$1;->label:I

    invoke-virtual {p4, p3, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->markChannelsAsDelivered(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p5, :cond_4

    return-object p5

    :cond_3
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_5

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onQueryChannelsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p3, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;

    if-eqz p2, :cond_0

    move-object p2, p3

    check-cast p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;

    iget v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->label:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;-><init>(Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;Lq83/d;)V

    :goto_0
    iget-object p3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$6:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$5:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_3

    move-object p3, p1

    check-cast p3, Ln23/g;

    iget-object p3, p3, Ln23/g;->a:Ljava/lang/Object;

    check-cast p3, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-direct {p0}, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin;->getMessageReceiptManager()Lio/getstream/chat/android/client/receipts/MessageReceiptManager;

    move-result-object v1

    invoke-virtual {p3}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getChannels()Ljava/util/List;

    move-result-object p3

    const/4 v3, 0x0

    iput-object v3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$0:Ljava/lang/Object;

    iput-object v3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$1:Ljava/lang/Object;

    iput-object v3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$2:Ljava/lang/Object;

    iput-object p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$3:Ljava/lang/Object;

    iput-object v3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$4:Ljava/lang/Object;

    iput-object v3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$5:Ljava/lang/Object;

    iput-object v3, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->L$6:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->I$0:I

    iput p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->I$1:I

    iput p1, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->I$2:I

    iput v2, p2, Lio/getstream/chat/android/client/plugin/MessageDeliveredPlugin$onQueryChannelsResult$1;->label:I

    invoke-virtual {v1, p3, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->markChannelsAsDelivered(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_5

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
