.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$AttachmentsSelectionListener;
.implements Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$PollSubmissionListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/c;->a:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachmentsSelected(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/c;->a:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->f(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/util/List;)V

    return-void
.end method

.method public onPollSubmitted(Lio/getstream/chat/android/models/CreatePollParams;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/c;->a:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->P(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/CreatePollParams;)V

    return-void
.end method
