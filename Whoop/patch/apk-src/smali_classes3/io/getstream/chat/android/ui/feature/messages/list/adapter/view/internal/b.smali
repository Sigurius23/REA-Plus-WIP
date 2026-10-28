.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->w:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;->f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;Lio/getstream/chat/android/models/Attachment;Landroid/view/View;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;->h(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Landroid/view/View;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;->c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Landroid/view/View;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Landroid/view/View;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Landroid/view/View;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
