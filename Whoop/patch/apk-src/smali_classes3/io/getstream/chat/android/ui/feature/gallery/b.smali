.class public final synthetic Lio/getstream/chat/android/ui/feature/gallery/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/gallery/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/b;->x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/b;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/b;->x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "extra_key_initial_index"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {v2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->v(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-object v1

    :pswitch_1
    invoke-static {v2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->t(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
