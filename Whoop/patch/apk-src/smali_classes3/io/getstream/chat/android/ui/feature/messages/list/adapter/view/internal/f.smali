.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/f;->a:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/f;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/f;->a:I

    const/4 v1, 0x1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/f;->b:Landroid/view/View;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    invoke-static {v2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->k(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Landroid/view/View;)V

    return v1

    :pswitch_0
    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$Companion;

    invoke-virtual {v2}, Landroid/view/View;->performLongClick()Z

    return v1

    :pswitch_1
    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;

    invoke-static {v2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;->d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;Landroid/view/View;)V

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
