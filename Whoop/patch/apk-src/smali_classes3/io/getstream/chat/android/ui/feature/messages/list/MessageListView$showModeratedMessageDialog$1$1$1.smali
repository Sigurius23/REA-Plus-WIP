.class public final Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$showModeratedMessageDialog$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/dialog/ModeratedMessageDialogFragment$DialogSelectionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->showModeratedMessageDialog(Lio/getstream/chat/android/models/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/list/MessageListView$showModeratedMessageDialog$1$1$1",
        "Lio/getstream/chat/android/ui/feature/messages/dialog/ModeratedMessageDialogFragment$DialogSelectionHandler;",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;",
        "action",
        "Ll83/a0;",
        "onModeratedOptionSelected",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V",
        "stream-chat-android-ui-components_release"
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
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$showModeratedMessageDialog$1$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onModeratedOptionSelected(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$showModeratedMessageDialog$1$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getModeratedMessageOptionHandler$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;->onModeratedMessageOptionSelected(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V

    return-void
.end method
