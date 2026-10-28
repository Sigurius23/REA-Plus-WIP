.class public final synthetic Lio/getstream/chat/android/ui/feature/gallery/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/b;->x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/b;->x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "asset_url"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/b;->x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "thumb_url"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/b;->x:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->z(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
