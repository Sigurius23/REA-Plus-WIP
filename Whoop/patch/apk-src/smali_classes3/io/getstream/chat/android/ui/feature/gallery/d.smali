.class public final synthetic Lio/getstream/chat/android/ui/feature/gallery/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/gallery/d;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/d;->x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/d;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/d;->x:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity$Companion;

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mime_type"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity$Companion;

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity$Companion;

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity$Companion;

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
