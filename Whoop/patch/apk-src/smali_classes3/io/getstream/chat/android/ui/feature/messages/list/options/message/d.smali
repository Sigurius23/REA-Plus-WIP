.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;->w:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessageActionClick(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;->w:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->B(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    return-void
.end method

.method public onReactionClick(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;->w:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->E(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public onUserReactionClick(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;->w:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->z(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V

    return-void
.end method
