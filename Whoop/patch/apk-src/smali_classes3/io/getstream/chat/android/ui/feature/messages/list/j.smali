.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmDeleteMessageHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmFlagMessageHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ErrorEventHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnModeratedMessageLongClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/j;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfirmDeleteMessage(Lio/getstream/chat/android/models/Message;Lc93/a;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/j;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->N(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;Lc93/a;)V

    return-void
.end method

.method public onConfirmFlagMessage(Lio/getstream/chat/android/models/Message;Lc93/a;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/j;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->O(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;Lc93/a;)V

    return-void
.end method

.method public onErrorEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/j;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->j0(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;)V

    return-void
.end method

.method public onLastMessageRead()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/j;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->m(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V

    return-void
.end method

.method public onModeratedMessageLongClick(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/j;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->w0(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onReactionClick(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/j;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->j(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

    return-void
.end method

.method public onUserReactionClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/j;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->l0(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V

    return-void
.end method
