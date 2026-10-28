.class public final synthetic Lio/getstream/chat/android/ui/feature/gallery/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/a;->x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/a;->x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->z(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/a;->x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->y(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/a;->x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "image_url"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
