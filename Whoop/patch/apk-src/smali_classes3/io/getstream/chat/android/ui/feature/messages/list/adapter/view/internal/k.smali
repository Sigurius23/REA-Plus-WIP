.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/k;->a:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/k;->b:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/k;->a:I

    const/4 v0, 0x1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/k;->b:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder$Companion;

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;->onAttachmentLongClick()V

    return v0

    :pswitch_0
    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->a:I

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;->onAttachmentLongClick()V

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
