.class public final synthetic Lio/getstream/chat/android/ui/feature/gallery/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/gallery/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/a;->x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/a;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/a;->x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->p(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V

    return-void

    :pswitch_0
    sget-object p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_1
    invoke-static {v1, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->r(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V

    return-void

    :pswitch_2
    invoke-static {v1, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->u(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
