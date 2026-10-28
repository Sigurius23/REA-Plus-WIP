.class public final Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;
.super Lpq/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J!\u0010\u0017\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010&\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;",
        "Lpq/l;",
        "<init>",
        "()V",
        "",
        "getTheme",
        "()I",
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
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "Lkotlin/Function1;",
        "listener",
        "setMediaClickListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;",
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;",
        "viewModel$delegate",
        "Ll83/h;",
        "getViewModel",
        "()Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;",
        "viewModel",
        "mediaClickListener",
        "Lkotlin/jvm/functions/Function1;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$Companion;


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;

.field private mediaClickListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final viewModel$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lpq/l;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$2;-><init>(Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const-class v1, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$3;-><init>(Ll83/h;)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$4;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$4;-><init>(Lc93/a;Ll83/h;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$5;

    invoke-direct {v4, p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/m0;Ll83/h;)V

    new-instance v0, Landroidx/lifecycle/y1;

    invoke-direct {v0, v1, v2, v4, v3}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->viewModel$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->mediaClickListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static A(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;I)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->mediaClickListener:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getViewModel()Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->viewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;

    return-object v0
.end method

.method private static final mediaClickListener$lambda$0(I)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onViewCreated$lambda$4$lambda$2(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lpq/l;->dismiss()V

    return-void
.end method

.method private static final onViewCreated$lambda$4$lambda$3(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;I)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->mediaClickListener:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getTheme()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/R$style;->StreamUiBottomSheetDialogTheme:I

    return v0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;

    invoke-super {p0}, Landroidx/fragment/app/y;->onDestroyView()V

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;->closeButton:Landroid/widget/ImageView;

    new-instance v0, Lb30/k3;

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;->mediaAttachmentGridView:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;

    new-instance v0, Lhn/p;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->setMediaClickListener(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->getViewModel()Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;->getAttachmentGalleryItemsLiveData()Landroidx/lifecycle/p0;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$onViewCreated$1$3;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMediaAttachmentBinding;->mediaAttachmentGridView:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$onViewCreated$1$3;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$sam$androidx_lifecycle_Observer$0;

    invoke-direct {p1, v1}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v0, p1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method public final setMediaClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->mediaClickListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method
