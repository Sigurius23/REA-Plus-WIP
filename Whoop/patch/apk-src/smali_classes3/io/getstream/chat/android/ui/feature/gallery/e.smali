.class public final synthetic Lio/getstream/chat/android/ui/feature/gallery/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/gallery/e;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/e;->x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/e;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/e;->x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;

    packed-switch v0, :pswitch_data_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity$Companion;

    invoke-virtual {v1}, Lg/l;->onBackPressed()V

    return-void

    :pswitch_0
    invoke-static {v1, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;->o(Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
