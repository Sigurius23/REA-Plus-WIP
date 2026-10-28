.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReplyHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageEditHandler;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/a;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/a;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BackButtonPressed;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BackButtonPressed;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V

    return-void
.end method

.method public onMessageEdit(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/a;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->E(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onMessageReply(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/a;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->G(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onModeratedMessageOptionSelected(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/a;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->z(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/a;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->y(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
