.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->setupPages()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\u000c\u001a\u00020\u00052\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "attachments",
        "Ll83/a0;",
        "onSelectedAttachmentsChanged",
        "(Ljava/util/List;)V",
        "onSelectedAttachmentsSubmitted",
        "()V",
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "createPollParams",
        "onPollSubmitted",
        "(Lio/getstream/chat/android/models/CreatePollParams;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPollSubmitted(Lio/getstream/chat/android/models/CreatePollParams;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->access$getPollSubmissionListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$PollSubmissionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$PollSubmissionListener;->onPollSubmitted(Lio/getstream/chat/android/models/CreatePollParams;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-virtual {p1}, Lpq/l;->dismiss()V

    return-void
.end method

.method public final onSelectedAttachmentsChanged(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->access$setSelectedAttachments$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;Ljava/util/List;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->access$getSelectedAttachments$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 v0, p1, 0x1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-static {v1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->access$setAttachButtonEnabled(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;Z)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->access$setUnselectedButtonsEnabled(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;Z)V

    return-void
.end method

.method public final onSelectedAttachmentsSubmitted()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->access$getAttachmentsSelectionListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$AttachmentsSelectionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-static {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->access$resolveSelectedAttachments(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$AttachmentsSelectionListener;->onAttachmentsSelected(Ljava/util/List;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-virtual {v0}, Lpq/l;->dismiss()V

    return-void
.end method
