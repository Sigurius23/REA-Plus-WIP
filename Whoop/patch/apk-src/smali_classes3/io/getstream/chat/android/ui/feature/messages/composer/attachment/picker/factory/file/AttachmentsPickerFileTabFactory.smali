.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/AttachmentsPickerFileTabFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/AttachmentsPickerFileTabFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "style",
        "Landroid/graphics/drawable/Drawable;",
        "createTabIcon",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Landroid/graphics/drawable/Drawable;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;",
        "attachmentsPickerTabListener",
        "Landroidx/fragment/app/m0;",
        "createTabFragment",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)Landroidx/fragment/app/m0;",
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
.method public final createTabFragment(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)Landroidx/fragment/app/m0;
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentsPickerTabListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$Companion;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$Companion;->newInstance(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    move-result-object p1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setAttachmentsPickerTabListener(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V

    return-object p1
.end method

.method public final createTabIcon(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getFileAttachmentsTabIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method
