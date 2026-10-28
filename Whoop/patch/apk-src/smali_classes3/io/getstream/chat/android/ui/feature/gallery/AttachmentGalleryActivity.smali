.class public final Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;,
        Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDownloadOptionHandler;,
        Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;,
        Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;,
        Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentShowInChatOptionHandler;,
        Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 [2\u00020\u0001:\u0006\\]^_`[B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008-\u0010\u0003J\u0017\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002\u00a2\u0006\u0004\u00080\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R\u0016\u0010;\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0016\u0010=\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010<R\u0016\u0010>\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010<R\u0016\u0010?\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u001b\u0010F\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u00107\u001a\u0004\u0008D\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008H\u00107\u001a\u0004\u0008I\u0010JR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u001c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010RR\u0016\u0010S\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010<R\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010Z\u001a\u00020W8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010Y\u00a8\u0006a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onDestroy",
        "setupEdgeToEdge",
        "",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
        "attachmentGalleryItems",
        "setupGallery",
        "(Ljava/util/List;)V",
        "setupGalleryAdapter",
        "setupShareMediaButton",
        "shareMedia",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "shareImage",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "shareVideo",
        "toastFailedShare",
        "setupAttachmentActionsButton",
        "observePageChanges",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;",
        "result",
        "setResultAndFinish",
        "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;)V",
        "",
        "position",
        "onGalleryPageSelected",
        "(I)V",
        "Ljava/util/Date;",
        "createdAt",
        "",
        "getRelativeAttachmentDate",
        "(Ljava/util/Date;)Ljava/lang/String;",
        "setupGalleryOverviewButton",
        "enterFullScreenMode",
        "exitFullScreenMode",
        "setSharingInProgressUi",
        "setNoSharingInProgressUi",
        "obtainOptionsViewStyle",
        "",
        "isMine",
        "shouldShowOptionsButton",
        "(Z)Z",
        "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "replyOptionEnabled",
        "Z",
        "showInChatOptionEnabled",
        "saveMediaOptionEnabled",
        "deleteOptionEnabled",
        "Lbc3/k1;",
        "shareMediaJob",
        "Lbc3/k1;",
        "initialIndex$delegate",
        "getInitialIndex",
        "()I",
        "initialIndex",
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;",
        "viewModel$delegate",
        "getViewModel",
        "()Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;",
        "viewModel",
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;",
        "adapter",
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;",
        "Lio/getstream/chat/android/ui/utils/PermissionChecker;",
        "permissionChecker",
        "Lio/getstream/chat/android/ui/utils/PermissionChecker;",
        "Ljava/util/List;",
        "isFullScreen",
        "Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;",
        "handleSaveMedia",
        "Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;",
        "getAttachmentGalleryResultItem",
        "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;",
        "attachmentGalleryResultItem",
        "Companion",
        "AttachmentShowInChatOptionHandler",
        "AttachmentReplyOptionHandler",
        "AttachmentDownloadOptionHandler",
        "AttachmentDeleteOptionHandler",
        "AttachmentOptionResult",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;

.field public static final EXTRA_ATTACHMENT_OPTION_RESULT:Ljava/lang/String; = "extra_attachment_option_result"

.field private static final EXTRA_KEY_INITIAL_INDEX:Ljava/lang/String; = "extra_key_initial_index"


# instance fields
.field private adapter:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;

.field private attachmentGalleryItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
            ">;"
        }
    .end annotation
.end field

.field private binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

.field private deleteOptionEnabled:Z

.field private final handleSaveMedia:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;

.field private final initialIndex$delegate:Ll83/h;

.field private isFullScreen:Z

.field private final logger$delegate:Ll83/h;

.field private final permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

.field private replyOptionEnabled:Z

.field private saveMediaOptionEnabled:Z

.field private shareMediaJob:Lbc3/k1;

.field private showInChatOptionEnabled:Z

.field private final viewModel$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    const-string v0, "Chat:AttachmentGalleryActivity"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->logger$delegate:Ll83/h;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->replyOptionEnabled:Z

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->showInChatOptionEnabled:Z

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->saveMediaOptionEnabled:Z

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->deleteOptionEnabled:Z

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/gallery/b;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->initialIndex$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$special$$inlined$viewModels$default$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$special$$inlined$viewModels$default$1;-><init>(Lg/l;)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$special$$inlined$viewModels$default$2;-><init>(Lg/l;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$special$$inlined$viewModels$default$3;-><init>(Lc93/a;Lg/l;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->viewModel$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/utils/PermissionChecker;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->attachmentGalleryItems:Ljava/util/List;

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/gallery/c;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->handleSaveMedia:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;

    return-void
.end method

.method public static final synthetic access$onGalleryPageSelected(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->onGalleryPageSelected(I)V

    return-void
.end method

.method public static final synthetic access$setNoSharingInProgressUi(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setNoSharingInProgressUi()V

    return-void
.end method

.method public static final synthetic access$setupGallery(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupGallery(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$toastFailedShare(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->toastFailedShare()V

    return-void
.end method

.method public static final createIntent(Landroid/content/Context;I)Landroid/content/Intent;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;

    invoke-virtual {v0, p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;->createIntent(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method private final enterFullScreenMode()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->toolbar:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "toolbar"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->bottomBar:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v3, "bottomBar"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_black:I

    invoke-static {p0, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v1, Landroidx/constraintlayout/widget/p;

    invoke-direct {v1}, Landroidx/constraintlayout/widget/p;-><init>()V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    const-string v3, "galleryViewPager"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x3

    invoke-static {v1, v2, v4}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    invoke-static {v1, v2, v4}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x6

    invoke-static {v1, v2, v4}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x7

    invoke-static {v1, v2, v3}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/constraintlayout/widget/p;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final exitFullScreenMode()V
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_3

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->toolbar:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v4, "toolbar"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->bottomBar:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v5, "bottomBar"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_white_snow:I

    invoke-static {p0, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v5, Landroidx/constraintlayout/widget/p;

    invoke-direct {v5}, Landroidx/constraintlayout/widget/p;-><init>()V

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v6

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v3, :cond_2

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->toolbar:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v8

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x3

    invoke-virtual/range {v5 .. v10}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v6

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->bottomBar:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v8

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v7, 0x4

    invoke-virtual/range {v5 .. v10}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    const-string v4, "galleryViewPager"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    invoke-static {v5, v3, v6}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x7

    invoke-static {v5, v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroidx/constraintlayout/widget/p;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final getAttachmentGalleryResultItem()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->attachmentGalleryItems:Ljava/util/List;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getCid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine()Z

    move-result v6

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItemKt;->toAttachmentGalleryResultItem(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final getInitialIndex()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->initialIndex$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getRelativeAttachmentDate(Ljava/util/Date;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, 0x5265c00

    const/high16 v6, 0x40000

    invoke-static/range {v0 .. v6}, Landroid/text/format/DateUtils;->getRelativeTimeSpanString(JJJI)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toLowerCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "substring(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_attachment_gallery_date:I

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v2

    invoke-interface {v2, p1}, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->formatTime(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getViewModel()Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->viewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;

    return-object v0
.end method

.method private static final handleSaveMedia$lambda$10(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/gallery/b;

    const/4 v2, 0x1

    invoke-direct {v3, p0, v2}, Lio/getstream/chat/android/ui/feature/gallery/b;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkWriteStoragePermissions$default(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Lc93/a;Lc93/a;ILjava/lang/Object;)V

    return-void

    :cond_0
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final handleSaveMedia$lambda$10$lambda$9(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)Ll83/a0;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Download;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->getAttachmentGalleryResultItem()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Download;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setResultAndFinish(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final initialIndex_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)I
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v0, "extra_key_initial_index"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupAttachmentActionsButton$lambda$8$lambda$5(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-void
.end method

.method private final observePageChanges()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$observePageChanges$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$observePageChanges$1;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->b(Lhc/h;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->getInitialIndex()I

    move-result v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->onGalleryPageSelected(I)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final obtainOptionsViewStyle()V
    .locals 5

    :try_start_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView:[I

    sget v2, Lio/getstream/chat/android/ui/R$attr;->streamUiAttachmentGalleryOptionsStyle:I

    sget v3, Lio/getstream/chat/android/ui/R$style;->StreamUi_AttachmentGallery_Options:I

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    const-string v1, "obtainStyledAttributes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle$Companion;

    invoke-virtual {v1, p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getReplyOptionEnabled()Z

    move-result v2

    iput-boolean v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->replyOptionEnabled:Z

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getShowInChatOptionEnabled()Z

    move-result v2

    iput-boolean v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->showInChatOptionEnabled:Z

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getSaveMediaOptionEnabled()Z

    move-result v2

    iput-boolean v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->saveMediaOptionEnabled:Z

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getDeleteOptionEnabled()Z

    move-result v1

    iput-boolean v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->deleteOptionEnabled:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "Failed to obtain styles"

    invoke-interface {v1, v4, v3, v2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private static final onCreate$lambda$1(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private final onGalleryPageSelected(I)V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_4

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->mediaInformationTextView:Landroid/widget/TextView;

    sget v3, Lio/getstream/chat/android/ui/R$string;->stream_ui_attachment_gallery_count:I

    add-int/lit8 v4, p1, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->attachmentGalleryItems:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->attachmentGalleryItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->attachmentDateTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    invoke-direct {p0, v3}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->getRelativeAttachmentDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->userTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->attachmentActionsButton:Landroid/widget/ImageView;

    const-string v1, "attachmentActionsButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine()Z

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shouldShowOptionsButton(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic p(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupShareMediaButton$lambda$4(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic r(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupGalleryOverviewButton$lambda$14(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupAttachmentActionsButton$lambda$8$lambda$7(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-void
.end method

.method private final setNoSharingInProgressUi()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->progressBar:Landroid/widget/ProgressBar;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->shareMediaButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_share:I

    invoke-static {v2, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->mediaInformationTextView:Landroid/widget/TextView;

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_attachment_gallery_count:I

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->attachmentGalleryItems:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final setResultAndFinish(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "extra_attachment_option_result"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p1, -0x1

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private final setSharingInProgressUi()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    const-string v1, "binding"

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->mediaInformationTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_attachment_gallery_preview_preparing:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->progressBar:Landroid/widget/ProgressBar;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_clear:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_black:I

    invoke-static {v3, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v3, :cond_1

    iget-object v1, v3, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->shareMediaButton:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final setupAttachmentActionsButton()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->attachmentActionsButton:Landroid/widget/ImageView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/gallery/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final setupAttachmentActionsButton$lambda$8(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V
    .locals 6

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$Companion;

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/c;

    const/4 p1, 0x1

    invoke-direct {v1, p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/c;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/gallery/c;

    const/4 p1, 0x2

    invoke-direct {v3, p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/c;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/gallery/c;

    const/4 p1, 0x3

    invoke-direct {v2, p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/c;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->handleSaveMedia:Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->attachmentGalleryItems:Ljava/util/List;

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v5, :cond_0

    iget-object v5, v5, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v5}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v5

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine()Z

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$Companion;->newInstance(Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;Z)Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p0

    const-string v0, "AttachmentOptionsDialogFragment"

    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final setupAttachmentActionsButton$lambda$8$lambda$5(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$ShowInChat;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->getAttachmentGalleryResultItem()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$ShowInChat;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setResultAndFinish(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;)V

    return-void
.end method

.method private static final setupAttachmentActionsButton$lambda$8$lambda$6(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Delete;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->getAttachmentGalleryResultItem()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Delete;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setResultAndFinish(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;)V

    return-void
.end method

.method private static final setupAttachmentActionsButton$lambda$8$lambda$7(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->getAttachmentGalleryResultItem()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setResultAndFinish(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;)V

    return-void
.end method

.method private final setupEdgeToEdge()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->applyEdgeToEdgePadding(Landroid/view/View;I)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final setupGallery(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->attachmentGalleryItems:Ljava/util/List;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupGalleryAdapter()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupShareMediaButton()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupAttachmentActionsButton()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->obtainOptionsViewStyle()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->observePageChanges()V

    return-void
.end method

.method private final setupGalleryAdapter()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->attachmentGalleryItems:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/b;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lio/getstream/chat/android/ui/feature/gallery/b;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;

    invoke-direct {v2, p0, v1, v0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;-><init>(Landroidx/fragment/app/r0;Ljava/util/List;Lc93/a;)V

    iput-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->adapter:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    const/4 v1, 0x0

    const-string v3, "binding"

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->getInitialIndex()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->d(IZ)V

    return-void

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final setupGalleryAdapter$lambda$3(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)Ll83/a0;
    .locals 2

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->isFullScreen:Z

    xor-int/lit8 v1, v0, 0x1

    iput-boolean v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->isFullScreen:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->enterFullScreenMode()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->exitFullScreenMode()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setupGalleryOverviewButton()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryOverviewButton:Landroid/widget/ImageView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/gallery/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final setupGalleryOverviewButton$lambda$14(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$Companion;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;

    invoke-direct {p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->setMediaClickListener(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    return-void
.end method

.method private static final setupGalleryOverviewButton$lambda$14$lambda$13$lambda$12(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;I)Ll83/a0;
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Landroidx/viewpager2/widget/ViewPager2;->d(IZ)V

    invoke-virtual {p1}, Lpq/l;->dismiss()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private final setupShareMediaButton()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->shareMediaButton:Landroid/widget/ImageView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/gallery/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final setupShareMediaButton$lambda$4(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareMediaJob:Lbc3/k1;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lbc3/k1;->isCompleted()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareMediaJob:Lbc3/k1;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setNoSharingInProgressUi()V

    return-void

    :cond_2
    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setSharingInProgressUi()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareMedia()V

    return-void
.end method

.method private final shareImage(Lio/getstream/chat/android/models/Attachment;)V
    .locals 5

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareMediaJob:Lbc3/k1;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    sget-object v3, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v3}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v3

    new-instance v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;

    invoke-direct {v4, p0, v0, p1, v2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {v1, v3, v2, v4, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareMediaJob:Lbc3/k1;

    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->toastFailedShare()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setNoSharingInProgressUi()V

    return-void
.end method

.method private final shareMedia()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->adapter:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz v2, :cond_2

    iget-object v1, v2, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;->getItem(I)Lio/getstream/chat/android/models/Attachment;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "image"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareImage(Lio/getstream/chat/android/models/Attachment;)V

    return-void

    :cond_0
    const-string v2, "video"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareVideo(Lio/getstream/chat/android/models/Attachment;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->toastFailedShare()V

    return-void

    :cond_2
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final shareVideo(Lio/getstream/chat/android/models/Attachment;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareMediaJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v2, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;

    invoke-direct {v2, p0, p1, v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v1, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareMediaJob:Lbc3/k1;

    return-void
.end method

.method private final shouldShowOptionsButton(Z)Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->replyOptionEnabled:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->showInChatOptionEnabled:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->saveMediaOptionEnabled:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->deleteOptionEnabled:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic t(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupGalleryAdapter$lambda$3(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)Ll83/a0;

    return-void
.end method

.method private final toastFailedShare()V
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_attachment_gallery_share_error:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static synthetic u(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupAttachmentActionsButton$lambda$8(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->handleSaveMedia$lambda$10$lambda$9(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)Ll83/a0;

    return-void
.end method

.method public static synthetic w(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupAttachmentActionsButton$lambda$8$lambda$6(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-void
.end method

.method public static synthetic x(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupGalleryOverviewButton$lambda$14$lambda$13$lambda$12(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;I)Ll83/a0;

    return-void
.end method

.method public static synthetic y(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->handleSaveMedia$lambda$10(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->isInitialized()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getStreamThemeInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/m;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupEdgeToEdge()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->setupGalleryOverviewButton()V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->closeButton:Landroid/widget/ImageView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/gallery/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->getViewModel()Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;->getAttachmentGalleryItemsLiveData()Landroidx/lifecycle/p0;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$onCreate$2;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$onCreate$2;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v1, v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void

    :cond_1
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final onDestroy()V
    .locals 3

    invoke-super {p0}, Lm/m;->onDestroy()V

    new-instance v0, Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->clearCache(Landroid/content/Context;)Ln23/h;

    return-void
.end method
