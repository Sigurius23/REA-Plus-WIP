.class final Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract;
.super Lk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0011B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract;",
        "Lk/b;",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "input",
        "Landroid/content/Intent;",
        "createIntent",
        "(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;)Landroid/content/Intent;",
        "",
        "resultCode",
        "intent",
        "parseResult",
        "(ILandroid/content/Intent;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;",
        "Input",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;)Landroid/content/Intent;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;->getAttachmentIndex()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;->createIntent(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract;->createIntent(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p2, :cond_1

    .line 2
    const-string p1, "extra_attachment_option_result"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract;->parseResult(ILandroid/content/Intent;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;

    move-result-object p1

    return-object p1
.end method
