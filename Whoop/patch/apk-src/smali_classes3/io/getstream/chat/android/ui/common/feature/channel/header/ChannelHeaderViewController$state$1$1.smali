.class final Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;-><init>(Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\n"
    }
    d2 = {
        "<anonymous>",
        "Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Content;",
        "connectionState",
        "Lio/getstream/chat/android/models/ConnectionState;",
        "<unused var>",
        "Lio/getstream/chat/android/models/ChannelData;",
        ""
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
    c = "io.getstream.chat.android.ui.common.feature.channel.header.ChannelHeaderViewController$state$1$1"
    f = "ChannelHeaderViewController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $state:Lio/getstream/chat/android/client/channel/state/ChannelState;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;Lio/getstream/chat/android/client/channel/state/ChannelState;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;",
            "Lio/getstream/chat/android/client/channel/state/ChannelState;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->$state:Lio/getstream/chat/android/client/channel/state/ChannelState;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/models/ConnectionState;Lio/getstream/chat/android/models/ChannelData;IILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ConnectionState;",
            "Lio/getstream/chat/android/models/ChannelData;",
            "II",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Content;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p2, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;

    iget-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;

    iget-object p4, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->$state:Lio/getstream/chat/android/client/channel/state/ChannelState;

    invoke-direct {p2, p3, p4, p5}, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;Lio/getstream/chat/android/client/channel/state/ChannelState;Lq83/d;)V

    iput-object p1, p2, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->L$0:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 2
    move-object v1, p1

    check-cast v1, Lio/getstream/chat/android/models/ConnectionState;

    move-object v2, p2

    check-cast v2, Lio/getstream/chat/android/models/ChannelData;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result v3

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result v4

    move-object v5, p5

    check-cast v5, Lq83/d;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->invoke(Lio/getstream/chat/android/models/ConnectionState;Lio/getstream/chat/android/models/ChannelData;IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/ConnectionState;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->label:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Content;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;->access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$state$1$1;->$state:Lio/getstream/chat/android/client/channel/state/ChannelState;

    invoke-interface {v2}, Lio/getstream/chat/android/client/channel/state/ChannelState;->toChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Content;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/ConnectionState;Lio/getstream/chat/android/models/Channel;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
