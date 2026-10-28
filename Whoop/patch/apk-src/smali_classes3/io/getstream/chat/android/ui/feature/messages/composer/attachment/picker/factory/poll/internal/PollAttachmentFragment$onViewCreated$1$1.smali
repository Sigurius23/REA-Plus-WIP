.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment$onViewCreated$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment$onViewCreated$1$1",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;",
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "createPollParams",
        "Ll83/a0;",
        "onCreatePoll",
        "(Lio/getstream/chat/android/models/CreatePollParams;)V",
        "onDismiss",
        "()V",
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
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment$onViewCreated$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreatePoll(Lio/getstream/chat/android/models/CreatePollParams;)V
    .locals 1

    const-string v0, "createPollParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment$onViewCreated$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;->access$getAttachmentsPickerTabListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onPollSubmitted(Lio/getstream/chat/android/models/CreatePollParams;)V

    :cond_0
    return-void
.end method

.method public final onDismiss()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment$onViewCreated$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;->access$getAttachmentsPickerTabListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/internal/PollAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onPollSubmitted(Lio/getstream/chat/android/models/CreatePollParams;)V

    :cond_0
    return-void
.end method
