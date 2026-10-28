.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$LauncherRequestsKeys;,
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0003J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008 \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008!\u0010\u0003J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020&H\u0002\u00a2\u0006\u0004\u0008(\u0010)J!\u0010+\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020&2\u0008\u0008\u0002\u0010*\u001a\u00020&H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020&H\u0002\u00a2\u0006\u0004\u0008-\u0010)J\u000f\u0010.\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008/\u0010\u0003R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020&\u0018\u0001098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010<R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010BR\u001c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u001c0D8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0014\u0010I\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010H\u00a8\u0006L"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "style",
        "Ll83/a0;",
        "setStyle",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onResume",
        "onDestroyView",
        "onDetach",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;",
        "attachmentsPickerTabListener",
        "setAttachmentsPickerTabListener",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "attachmentMetaData",
        "updateFileAttachment",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V",
        "setupViews",
        "checkPermissions",
        "Lio/getstream/chat/android/ui/common/permissions/FilesAccess;",
        "access",
        "handleFilesAccessState",
        "(Lio/getstream/chat/android/ui/common/permissions/FilesAccess;)V",
        "",
        "show",
        "showRequestAudioAccessLabel",
        "(Z)V",
        "hasPartialAccess",
        "showRequestVisualMediaAccessLabel",
        "(ZZ)V",
        "showGrantPermissionsContainer",
        "setupResultListener",
        "populateAttachments",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;",
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;",
        "attachmentStorageHelper",
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;",
        "Lio/getstream/chat/android/ui/utils/PermissionChecker;",
        "permissionChecker",
        "Lio/getstream/chat/android/ui/utils/PermissionChecker;",
        "Lj/d;",
        "activityResultLauncher",
        "Lj/d;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;",
        "fileAttachmentsAdapter$delegate",
        "Ll83/h;",
        "getFileAttachmentsAdapter",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;",
        "fileAttachmentsAdapter",
        "",
        "selectedAttachments",
        "Ljava/util/Set;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;",
        "binding",
        "Companion",
        "LauncherRequestsKeys",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$Companion;


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

.field private activityResultLauncher:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field

.field private attachmentStorageHelper:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

.field private attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

.field private final fileAttachmentsAdapter$delegate:Ll83/h;

.field private final permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

.field private selectedAttachments:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation
.end field

.field private style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/utils/PermissionChecker;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->fileAttachmentsAdapter$delegate:Ll83/h;

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->selectedAttachments:Ljava/util/Set;

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupViews$lambda$9$lambda$3(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic B(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupViews$lambda$9$lambda$8$lambda$7(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)Ll83/a0;

    return-void
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupViews$lambda$9$lambda$6$lambda$5(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)Ll83/a0;

    return-void
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->fileAttachmentsAdapter_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupViews$lambda$9$lambda$6(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic F(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupResultListener$lambda$13(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic G(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupViews$lambda$9$lambda$4(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic H(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->fileAttachmentsAdapter_delegate$lambda$1$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$getAttachmentStorageHelper$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->attachmentStorageHelper:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    return-object p0
.end method

.method public static final synthetic access$getAttachmentsPickerTabListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    return-object p0
.end method

.method public static final access$getBinding(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final synthetic access$getFileAttachmentsAdapter(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->getFileAttachmentsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getStyle$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    return-object p0
.end method

.method private final checkPermissions()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/permissions/FilesAccessKt;->resolveFilesAccessState(Landroid/content/Context;)Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->handleFilesAccessState(Lio/getstream/chat/android/ui/common/permissions/FilesAccess;)V

    return-void
.end method

.method private static final fileAttachmentsAdapter_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v1, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;I)V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lkotlin/jvm/functions/Function1;)V

    return-object v0

    :cond_0
    const-string p0, "style"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final fileAttachmentsAdapter_delegate$lambda$1$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->updateFileAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getFileAttachmentsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->fileAttachmentsAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;

    return-object v0
.end method

.method private final handleFilesAccessState(Lio/getstream/chat/android/ui/common/permissions/FilesAccess;)V
    .locals 5

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-direct {p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->showGrantPermissionsContainer(Z)V

    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->showRequestAudioAccessLabel(Z)V

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v1, v1, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->showRequestVisualMediaAccessLabel$default(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;ZZILjava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->AUDIO_AND_FULL_VISUAL:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    if-eq p1, v0, :cond_2

    sget-object v3, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->AUDIO_AND_PARTIAL_VISUAL:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    if-eq p1, v3, :cond_2

    sget-object v3, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->AUDIO:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    if-ne p1, v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v1

    goto :goto_1

    :cond_2
    :goto_0
    move v3, v2

    :goto_1
    if-eq p1, v0, :cond_4

    sget-object v0, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->FULL_VISUAL:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_3

    :cond_4
    :goto_2
    move v0, v2

    :goto_3
    sget-object v4, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->AUDIO_AND_PARTIAL_VISUAL:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    if-eq p1, v4, :cond_6

    sget-object v4, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->PARTIAL_VISUAL:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    if-ne p1, v4, :cond_5

    goto :goto_4

    :cond_5
    move p1, v1

    goto :goto_5

    :cond_6
    :goto_4
    move p1, v2

    :goto_5
    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->showGrantPermissionsContainer(Z)V

    xor-int/lit8 v1, v3, 0x1

    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->showRequestAudioAccessLabel(Z)V

    xor-int/2addr v0, v2

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->showRequestVisualMediaAccessLabel(ZZ)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->populateAttachments()V

    return-void
.end method

.method private final populateAttachments()V
    .locals 5

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$populateAttachments$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$populateAttachments$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Lq83/d;)V

    const/4 v4, 0x2

    invoke-static {v0, v1, v3, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final setupResultListener()V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/l;->getActivityResultRegistry()Lj/j;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lio/getstream/chat/android/ui/common/contract/internal/SelectFilesContract;

    invoke-direct {v1}, Lio/getstream/chat/android/ui/common/contract/internal/SelectFilesContract;-><init>()V

    new-instance v2, Laq0/o;

    const/16 v3, 0x8

    invoke-direct {v2, p0, v3}, Laq0/o;-><init>(Ljava/lang/Object;I)V

    const-string v3, "select_files_request_key"

    invoke-virtual {v0, v3, v1, v2}, Lj/j;->d(Ljava/lang/String;Lk/b;Lj/b;)Lj/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->activityResultLauncher:Lj/d;

    return-void
.end method

.method private static final setupResultListener$lambda$13(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/List;)V
    .locals 4

    const-string v0, "uris"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;-><init>(Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Lq83/d;)V

    const/4 p0, 0x2

    invoke-static {v0, v1, v3, v2, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final setupViews()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->grantPermissionsInclude:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;->grantPermissionsImageView:Landroid/widget/ImageView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    const/4 v3, 0x0

    const-string v4, "style"

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessToFilesIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->grantPermissionsInclude:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;->grantPermissionsTextView:Landroid/widget/TextView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessToFilesButtonText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->grantPermissionsInclude:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;->grantPermissionsTextView:Landroid/widget/TextView;

    const-string v2, "grantPermissionsTextView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessButtonTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->grantPermissionsInclude:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;->grantPermissionsTextView:Landroid/widget/TextView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/c;

    const/4 v5, 0x0

    invoke-direct {v2, p0, v5}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->recentFilesRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->getFileAttachmentsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->fileManagerImageView:Landroid/widget/ImageView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getFileManagerIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->recentFilesTextView:Landroid/widget/TextView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getRecentFilesText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->recentFilesTextView:Landroid/widget/TextView;

    const-string v2, "recentFilesTextView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getRecentFilesTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->fileManagerImageView:Landroid/widget/ImageView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/c;

    const/4 v5, 0x1

    invoke-direct {v2, p0, v5}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->audioAccessTextView:Landroid/widget/TextView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessToAudioText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->audioAccessTextView:Landroid/widget/TextView;

    const-string v2, "audioAccessTextView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessToAudioTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->audioAccessImageView:Landroid/widget/ImageView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessToAudioIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->audioAccessImageView:Landroid/widget/ImageView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/c;

    const/4 v5, 0x2

    invoke-direct {v2, p0, v5}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->visualMediaAccessTextView:Landroid/widget/TextView;

    const-string v2, "visualMediaAccessTextView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessToVisualMediaTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->visualMediaAccessImageView:Landroid/widget/ImageView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessToVisualMediaIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->visualMediaAccessImageView:Landroid/widget/ImageView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/c;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_7
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_8
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_a
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method private static final setupViews$lambda$9$lambda$3(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;I)V

    invoke-virtual {p1, v0, v1}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkFilesPermissions(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final setupViews$lambda$9$lambda$3$lambda$2(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->checkPermissions()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setupViews$lambda$9$lambda$4(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->activityResultLauncher:Lj/d;

    if-eqz p0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_0
    return-void
.end method

.method private static final setupViews$lambda$9$lambda$6(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;I)V

    invoke-virtual {p1, v0, v1}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkAudioPermissions(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final setupViews$lambda$9$lambda$6$lambda$5(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->checkPermissions()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setupViews$lambda$9$lambda$8(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;I)V

    invoke-virtual {p1, v0, v1}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkVisualMediaPermissions(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final setupViews$lambda$9$lambda$8$lambda$7(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->checkPermissions()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final showGrantPermissionsContainer(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->grantPermissionsInclude:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;->grantPermissionsContainer:Landroid/widget/LinearLayout;

    const-string v1, "grantPermissionsContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method private final showRequestAudioAccessLabel(Z)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    if-eqz v0, :cond_2

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->audioAccessTextView:Landroid/widget/TextView;

    const-string v2, "audioAccessTextView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->audioAccessImageView:Landroid/widget/ImageView;

    const-string v1, "audioAccessImageView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    move v2, v3

    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method private final showRequestVisualMediaAccessLabel(ZZ)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    if-eqz v0, :cond_5

    const/4 v1, 0x0

    const-string v2, "style"

    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessToMoreVisualMediaText()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getAllowAccessToVisualMediaText()Ljava/lang/String;

    move-result-object p2

    :goto_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->visualMediaAccessTextView:Landroid/widget/TextView;

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->visualMediaAccessTextView:Landroid/widget/TextView;

    const-string v1, "visualMediaAccessTextView"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->visualMediaAccessImageView:Landroid/widget/ImageView;

    const-string v0, "visualMediaAccessImageView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    move v1, v2

    :cond_3
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    return-void
.end method

.method public static synthetic showRequestVisualMediaAccessLabel$default(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;ZZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->showRequestVisualMediaAccessLabel(ZZ)V

    return-void
.end method

.method private final updateFileAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSelected(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->selectedAttachments:Ljava/util/Set;

    invoke-static {p1, v0}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->selectedAttachments:Ljava/util/Set;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->getFileAttachmentsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->deselectAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSelected(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->selectedAttachments:Ljava/util/Set;

    invoke-static {p1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->selectedAttachments:Ljava/util/Set;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->getFileAttachmentsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->selectAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->selectedAttachments:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsChanged(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public static synthetic y(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupViews$lambda$9$lambda$3$lambda$2(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)Ll83/a0;

    return-void
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupViews$lambda$9$lambda$8(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string p1, "requireContext(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;-><init>(Landroid/content/Context;Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->attachmentStorageHelper:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getStreamThemeInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroyView()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->activityResultLauncher:Lj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    return-void
.end method

.method public final onDetach()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDetach()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->checkPermissions()V

    :cond_0
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupViews()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupResultListener()V

    :cond_0
    return-void
.end method

.method public final setAttachmentsPickerTabListener(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V
    .locals 1

    const-string v0, "attachmentsPickerTabListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    return-void
.end method

.method public final setStyle(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    return-void
.end method
