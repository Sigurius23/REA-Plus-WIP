.class public final synthetic Lr13/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;I)V
    .locals 0

    iput p2, p0, Lr13/a;->w:I

    iput-object p1, p0, Lr13/a;->x:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lr13/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lr13/a;->x:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/y;->dismiss()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lr13/a;->x:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;->A(Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lr13/a;->x:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;->C(Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lr13/a;->x:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;->B(Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;Landroid/view/View;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lr13/a;->x:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;->z(Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
