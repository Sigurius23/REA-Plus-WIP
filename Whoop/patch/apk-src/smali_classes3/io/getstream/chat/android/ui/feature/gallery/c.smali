.class public final synthetic Lio/getstream/chat/android/ui/feature/gallery/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/gallery/c;->a:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/c;->b:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAttachmentOptionClick()V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/c;->b:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->s(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/c;->b:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->w(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/c;->b:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->o(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/c;->b:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->y(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
