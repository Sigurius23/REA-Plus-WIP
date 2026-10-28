.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J%\u0010\u000b\u001a\u0010\u0012\u000c\u0012\n \n*\u0004\u0018\u00010\t0\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u000f\u001a\u00020\u00042\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0003J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%R\u0018\u0010\'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008#\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\"\u00105\u001a\u0010\u0012\u000c\u0012\n \n*\u0004\u0018\u000104040\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00106R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00106R\u0014\u0010;\u001a\u00020&8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:\u00a8\u0006="
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "setupViews",
        "",
        "allowMultiple",
        "Lj/d;",
        "Lj/m;",
        "kotlin.jvm.PlatformType",
        "registerVisualMediaPickerLauncher",
        "(Z)Lj/d;",
        "Lkotlin/Function0;",
        "onPermissionGranted",
        "checkCameraPermissions",
        "(Lc93/a;)V",
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
        "onDestroyView",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;",
        "attachmentsPickerTabListener",
        "setAttachmentsPickerTabListener",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "style",
        "setStyle",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "Lio/getstream/chat/android/ui/utils/PermissionChecker;",
        "permissionChecker",
        "Lio/getstream/chat/android/ui/utils/PermissionChecker;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;",
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;",
        "attachmentStorageHelper",
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;",
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;",
        "attachmentFilter",
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;",
        "Landroid/content/Intent;",
        "filePickerLauncher",
        "Lj/d;",
        "visualMediaPickerLauncher",
        "captureMedia",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;",
        "binding",
        "Companion",
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
.field private static final ARG_CAMERA_ATTACHMENTS_TAB_ENABLED:Ljava/lang/String; = "camera_attachments_tab_enabled"

.field private static final ARG_FILE_ATTACHMENTS_TAB_ENABLED:Ljava/lang/String; = "file_attachments_tab_enabled"

.field private static final ARG_POLL_ATTACHMENTS_TAB_ENABLED:Ljava/lang/String; = "poll_attachments_tab_enabled"

.field private static final ARG_VISUAL_MEDIA_ALLOW_MULTIPLE:Ljava/lang/String; = "visual_media_allow_multiple"

.field private static final ARG_VISUAL_MEDIA_ATTACHMENTS_TAB_ENABLED:Ljava/lang/String; = "visual_media_attachments_tab_enabled"

.field private static final ARG_VISUAL_MEDIA_TYPE:Ljava/lang/String; = "visual_media_type"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment$Companion;


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

.field private final attachmentFilter:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

.field private attachmentStorageHelper:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

.field private attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

.field private captureMedia:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field

.field private final filePickerLauncher:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field

.field private final permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

.field private style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

.field private visualMediaPickerLauncher:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/utils/PermissionChecker;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;-><init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentFilter:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;I)V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    const-string v1, "registerForActivityResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->filePickerLauncher:Lj/d;

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Lj/a;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->filePickerLauncher$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Lj/a;)V

    return-void
.end method

.method public static synthetic B(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/net/Uri;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->registerVisualMediaPickerLauncher$lambda$11(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->setupViews$lambda$9(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->setupViews$lambda$2(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic E(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->setupViews$lambda$3(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic F(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Ljava/io/File;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->setupViews$lambda$4(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Ljava/io/File;)V

    return-void
.end method

.method public static synthetic G(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->setupViews$lambda$7$lambda$6$lambda$5(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$getAttachmentsPickerTabListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    return-object p0
.end method

.method public static final synthetic access$setAttachmentsPickerTabListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    return-void
.end method

.method public static final synthetic access$setStyle$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    return-void
.end method

.method private final checkCameraPermissions(Lc93/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->isNeededToRequestForCameraPermissions(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lou1/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lou1/a;-><init>(I)V

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkCameraPermissions(Landroid/view/View;Lc93/a;Lc93/a;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final checkCameraPermissions$lambda$12()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final filePickerLauncher$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Lj/a;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lj/a;->x:Landroid/content/Intent;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentStorageHelper:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    if-eqz v1, :cond_1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->resolveMetadata(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsChanged(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    const-string p0, "attachmentStorageHelper"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    if-eqz p0, :cond_3

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsSubmitted()V

    :cond_3
    return-void
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final registerVisualMediaPickerLauncher(Z)Lj/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lj/d;"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance p1, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;-><init>(Ljava/lang/Object;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;I)V

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;

    invoke-direct {p1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;I)V

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method private static final registerVisualMediaPickerLauncher$lambda$10(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Ljava/util/List;)V
    .locals 1

    const-string v0, "uris"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentStorageHelper:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->resolveMetadata(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsChanged(Ljava/util/List;)V

    :cond_0
    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsSubmitted()V

    :cond_1
    return-void

    :cond_2
    const-string p0, "attachmentStorageHelper"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final registerVisualMediaPickerLauncher$lambda$11(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/net/Uri;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentStorageHelper:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->resolveMetadata(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsChanged(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const-string p0, "attachmentStorageHelper"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    if-eqz p0, :cond_2

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsSubmitted()V

    :cond_2
    return-void
.end method

.method private final setupViews()V
    .locals 9

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "file_attachments_tab_enabled"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x8

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonFiles:Landroidx/cardview/widget/CardView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->textFiles:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "visual_media_attachments_tab_enabled"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonMedia:Landroidx/cardview/widget/CardView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->textMedia:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "camera_attachments_tab_enabled"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonCapture:Landroidx/cardview/widget/CardView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->textCapture:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "poll_attachments_tab_enabled"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonPolls:Landroidx/cardview/widget/CardView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->textPoll:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonFiles:Landroidx/cardview/widget/CardView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "visual_media_allow_multiple"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->registerVisualMediaPickerLauncher(Z)Lj/d;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->visualMediaPickerLauncher:Lj/d;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonMedia:Landroidx/cardview/widget/CardView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lg/l;->getActivityResultRegistry()Lj/j;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v2, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;

    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment$Companion;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getPickerMediaMode()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    move-result-object v1

    invoke-virtual {v3, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment$Companion;->getMode$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;)Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;-><init>(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;Ljava/io/File;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/a;

    const/4 v3, 0x2

    invoke-direct {v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;I)V

    const-string v3, "capture_media_request_key"

    invoke-virtual {v0, v3, v2, v1}, Lj/j;->d(Ljava/lang/String;Lk/b;Lj/b;)Lj/i;

    move-result-object v1

    goto :goto_0

    :cond_4
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_0
    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->captureMedia:Lj/d;

    if-eqz v1, :cond_6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonCapture:Landroidx/cardview/widget/CardView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonPolls:Landroidx/cardview/widget/CardView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final setupViews$lambda$2(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "*/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentFilter:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->getSupportedMimeTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const-string v1, "android.intent.extra.MIME_TYPES"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.category.OPENABLE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->filePickerLauncher:Lj/d;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method

.method private static final setupViews$lambda$3(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->visualMediaPickerLauncher:Lj/d;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "visual_media_type"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.permissions.VisualMediaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/permissions/VisualMediaTypeKt;->toContractVisualMediaType(Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;)Lk/f;

    move-result-object p0

    invoke-static {p0}, Lse/g;->f(Lk/f;)Lj/m;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_0
    return-void
.end method

.method private static final setupViews$lambda$4(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Ljava/io/File;)V
    .locals 3

    if-nez p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;-><init>(Landroid/content/Context;Ljava/io/File;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsChanged(Ljava/util/List;)V

    :cond_1
    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    if-eqz p0, :cond_2

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsSubmitted()V

    :cond_2
    return-void
.end method

.method private static final setupViews$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V
    .locals 1

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->checkCameraPermissions(Lc93/a;)V

    return-void
.end method

.method private static final setupViews$lambda$7$lambda$6$lambda$5(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;)Ll83/a0;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->captureMedia:Lj/d;

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_0
    return-object v1
.end method

.method private static final setupViews$lambda$9(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getFragmentManager(Landroid/content/Context;)Landroidx/fragment/app/o1;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$Companion;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment$setupViews$5$1$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment$setupViews$5$1$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;)V

    const/4 p0, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$Companion;->newInstance$default(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$Companion;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;

    move-result-object p0

    const-string v0, "create_poll_dialog_fragment"

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic y(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->registerVisualMediaPickerLauncher$lambda$10(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->setupViews$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V

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

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentStorageHelper:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getStreamThemeInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroyView()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->visualMediaPickerLauncher:Lj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->captureMedia:Lj/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    if-nez p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->setupViews()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Landroidx/fragment/app/a;

    invoke-direct {p2, p1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    invoke-virtual {p2, p0}, Landroidx/fragment/app/a;->n(Landroidx/fragment/app/m0;)Landroidx/fragment/app/a;

    invoke-virtual {p2}, Landroidx/fragment/app/a;->j()I

    return-void
.end method

.method public final setAttachmentsPickerTabListener(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V
    .locals 1

    const-string v0, "attachmentsPickerTabListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->attachmentsPickerTabListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    return-void
.end method

.method public final setStyle(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    return-void
.end method
