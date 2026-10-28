.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0008\u001a\u00020\t*\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment$Companion;",
        "",
        "<init>",
        "()V",
        "newInstance",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "mode",
        "Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;",
        "getMode$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;)Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;",
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
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMode$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;)Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;->PHOTO_AND_VIDEO:Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;->VIDEO:Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;

    return-object p1

    :cond_2
    sget-object p1, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;->PHOTO:Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;

    return-object p1
.end method

.method public final newInstance(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;-><init>()V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;->setStyle(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V

    return-object v0
.end method
