.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserBlockHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$EndRegionReachedHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserUnblockHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPauseAudioRecordingAttachmentsHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUnpinHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$BottomEndRegionReachedHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$LastMessageReadHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageDeleteHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageMarkAsUnreadHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ThreadStartHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OpenThreadHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ToggleOriginalTextHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagePinHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$GiphySendHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageRetryHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReactionHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReplyHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReplyMessageClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBottomEndRegionReached(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->u(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ljava/lang/String;)V

    return-void
.end method

.method public onEndRegionReached()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    sget-object v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$EndRegionReached;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$EndRegionReached;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V

    return-void
.end method

.method public onLastMessageRead()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    sget-object v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$LastMessageRead;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$LastMessageRead;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V

    return-void
.end method

.method public onMessageDelete(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->k(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onMessageMarkAsUnread(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->p(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onMessagePin(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->d(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onMessageReaction(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->z(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

    return-void
.end method

.method public onMessageReply(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p2, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->a(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

    return-void
.end method

.method public onMessageRetry(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->s(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onMessageUnpin(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->o(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onOpenThread(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->F(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onPauseAudioRecordingAttachments()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->pauseAudioRecordingAttachments()V

    return-void
.end method

.method public onReplyClick(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->G(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onSendGiphy(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->v(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V

    return-void
.end method

.method public onStartThread(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->h(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onToggleOriginalText(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->q(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onUnreadLabelClick()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->w(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V

    return-void
.end method

.method public onUserBlocked(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->y(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onUserUnblocked(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/i;->w:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->f(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method
