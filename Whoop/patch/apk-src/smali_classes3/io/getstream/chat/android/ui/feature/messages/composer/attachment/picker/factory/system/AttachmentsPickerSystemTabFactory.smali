.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0016R\u0014\u0010\u0008\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;",
        "",
        "mediaAttachmentsTabEnabled",
        "visualMediaAllowMultiple",
        "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;",
        "visualMediaType",
        "fileAttachmentsTabEnabled",
        "cameraAttachmentsTabEnabled",
        "pollAttachmentsTabEnabled",
        "<init>",
        "(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)V",
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
        "Z",
        "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;",
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


# instance fields
.field private final cameraAttachmentsTabEnabled:Z

.field private final fileAttachmentsTabEnabled:Z

.field private final mediaAttachmentsTabEnabled:Z

.field private final pollAttachmentsTabEnabled:Z

.field private final visualMediaAllowMultiple:Z

.field private final visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;


# direct methods
.method public constructor <init>(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)V
    .locals 1

    const-string v0, "visualMediaType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->mediaAttachmentsTabEnabled:Z

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->visualMediaAllowMultiple:Z

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->fileAttachmentsTabEnabled:Z

    iput-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->cameraAttachmentsTabEnabled:Z

    iput-boolean p6, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->pollAttachmentsTabEnabled:Z

    return-void
.end method


# virtual methods
.method public final createTabFragment(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)Landroidx/fragment/app/m0;
    .locals 8

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentsPickerTabListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment$Companion;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->mediaAttachmentsTabEnabled:Z

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->visualMediaAllowMultiple:Z

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->fileAttachmentsTabEnabled:Z

    iget-boolean v6, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->cameraAttachmentsTabEnabled:Z

    iget-boolean v7, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;->pollAttachmentsTabEnabled:Z

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;-><init>(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)V

    invoke-virtual {v0, p1, p2, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment$Companion;->newInstance(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;)Landroidx/fragment/app/m0;

    move-result-object p1

    return-object p1
.end method

.method public final createTabIcon(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getSubmitAttachmentsButtonIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method
