.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemTransformer;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageFlagHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserBlockHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserUnblockHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$FlagMessageResultHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagePinHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageMarkAsUnreadHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUnpinHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$GiphySendHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageRetryHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReactionHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$EndRegionReachedHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$CustomActionHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReplyHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$AttachmentDownloadHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$BottomEndRegionReachedHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$LastMessageReadHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageEditHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserReactionClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageDeleteHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ThreadStartHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OpenThreadHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ToggleOriginalTextHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReplyMessageClickListener;


# virtual methods
.method public onAttachmentDownload(Lc93/a;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->r0(Lc93/a;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onBottomEndRegionReached(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->u(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onCustomAction(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)V
    .locals 0

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->V0(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onEndRegionReached()V
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->z0()V

    const/4 v0, 0x0

    throw v0
.end method

.method public onHandleResult(Ln23/h;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->W0(Ln23/h;)V

    return-void
.end method

.method public onLastMessageRead()V
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->q0()V

    const/4 v0, 0x0

    throw v0
.end method

.method public onMessageDelete(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->m0(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onMessageEdit(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->x(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onMessageFlag(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->Z(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onMessageMarkAsUnread(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->w(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onMessagePin(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->l(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onMessageReaction(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->R0(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onMessageReply(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->Y(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onMessageRetry(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->n0(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onMessageUnpin(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->D(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onModeratedMessageOptionSelected(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V
    .locals 0

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->s0(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onOpenThread(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->Q(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onReplyClick(Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->q(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onSendGiphy(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->i0(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onStartThread(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->p(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onThreadEntered(Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->K(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onToggleOriginalText(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->g0(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onUserBlocked(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->S(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onUserReactionClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)Z
    .locals 0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->b0(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onUserUnblocked(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->C0(Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public transform(Ljava/util/List;)Ljava/util/List;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->$$delegatedProperties:[Lj93/z;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
