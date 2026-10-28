.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field public final synthetic y:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->y:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAttachmentClick(Lio/getstream/chat/android/models/Attachment;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->y:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/models/Attachment;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->y:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;->d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/models/Attachment;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->y:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;->b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/models/Attachment;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
