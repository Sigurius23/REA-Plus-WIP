.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->enqueueSendMessage(Lio/getstream/chat/android/models/Message;Lo23/a;)V
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "Ll83/a0;",
        "<anonymous>",
        "(Ln23/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$enqueueSendMessage$2"
    f = "MessageComposerController.kt"
    l = {
        0x368
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field I$0:I

.field I$1:I

.field I$2:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->$channelType:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->$channelId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->$channelId:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$5:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$4:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$3:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$2:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->$channelType:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->$channelId:Ljava/lang/String;

    instance-of v5, v0, Ln23/g;

    if-eqz v5, :cond_2

    move-object v5, v0

    check-cast v5, Ln23/g;

    iget-object v5, v5, Ln23/g;->a:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getChannelState()Lec3/f2;

    move-result-object v6

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/client/channel/state/ChannelState;

    if-eqz v6, :cond_3

    invoke-interface {v6}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getChannelConfig()Lec3/f2;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Config;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Config;->getMarkMessagesPending()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v2, v4, v5}, Lio/getstream/chat/android/client/ChatClient;->markMessageRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$1:Ljava/lang/Object;

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$2:Ljava/lang/Object;

    iput-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$3:Ljava/lang/Object;

    iput-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$4:Ljava/lang/Object;

    iput-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->L$5:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->I$0:I

    iput v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->I$1:I

    iput v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->I$2:I

    iput v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;->label:I

    check-cast p1, Lo23/k;

    invoke-virtual {p1, p0}, Lo23/k;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_2
    instance-of p1, v0, Ln23/f;

    if-eqz p1, :cond_4

    :cond_3
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
