.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;I)V
    .locals 0

    .line 2
    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->y:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->a(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->a(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;Lio/getstream/chat/android/models/Attachment;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AudioRecordAttachmentPreviewFactory$AudioRecordAttachmentPreviewViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AudioRecordAttachmentPreviewFactory$AudioRecordAttachmentPreviewViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AudioRecordAttachmentPreviewFactory$AudioRecordAttachmentPreviewViewHolder;Lkotlin/jvm/functions/Function1;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
