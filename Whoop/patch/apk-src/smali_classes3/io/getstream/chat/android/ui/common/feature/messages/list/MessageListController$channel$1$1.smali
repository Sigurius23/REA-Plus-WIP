.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;-><init>(Ljava/lang/String;Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;ZLjava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lec3/f2;ZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;ZLio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lio/getstream/chat/android/models/Channel;",
        "<unused var>",
        "Lio/getstream/chat/android/models/ChannelData;",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "",
        "Lio/getstream/chat/android/models/Message;"
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
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$channel$1$1"
    f = "MessageListController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $state:Lio/getstream/chat/android/client/channel/state/ChannelState;

.field label:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/channel/state/ChannelState;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/channel/state/ChannelState;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;->$state:Lio/getstream/chat/android/client/channel/state/ChannelState;

    const/4 p1, 0x6

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;IILjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelData;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;II",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;->$state:Lio/getstream/chat/android/client/channel/state/ChannelState;

    invoke-direct {p1, p2, p6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;-><init>(Lio/getstream/chat/android/client/channel/state/ChannelState;Lq83/d;)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 2
    move-object v1, p1

    check-cast v1, Lio/getstream/chat/android/models/ChannelData;

    move-object v2, p2

    check-cast v2, Ljava/util/List;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result v3

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result v4

    move-object v5, p5

    check-cast v5, Ljava/util/List;

    move-object v6, p6

    check-cast v6, Lq83/d;

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;->invoke(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;IILjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$1$1;->$state:Lio/getstream/chat/android/client/channel/state/ChannelState;

    invoke-interface {p1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->toChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
