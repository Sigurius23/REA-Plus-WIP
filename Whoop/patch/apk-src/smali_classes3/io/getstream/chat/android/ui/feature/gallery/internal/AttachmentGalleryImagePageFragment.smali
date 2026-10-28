.class public final Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
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
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;",
        "",
        "imageUrl$delegate",
        "Ll83/h;",
        "getImageUrl",
        "()Ljava/lang/String;",
        "imageUrl",
        "Lkotlin/Function0;",
        "imageClickListener",
        "Lc93/a;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;",
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
.field private static final ARG_IMAGE_URL:Ljava/lang/String; = "image_url"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment$Companion;


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

.field private imageClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final imageUrl$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->Companion:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/internal/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/gallery/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->imageUrl$delegate:Ll83/h;

    new-instance v0, Lou1/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lou1/a;-><init>(I)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->imageClickListener:Lc93/a;

    return-void
.end method

.method public static A(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->imageClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$setImageClickListener$p(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->imageClickListener:Lc93/a;

    return-void
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->imageUrl$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final imageClickListener$lambda$1()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final imageUrl_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "image_url"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final onViewCreated$lambda$6$lambda$3(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;)Ll83/a0;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;->placeHolderImageView:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;->progressBar:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onViewCreated$lambda$6$lambda$4(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;)Ll83/a0;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;->placeHolderImageView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;->progressBar:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onViewCreated$lambda$6$lambda$5(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->imageClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic y(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->onViewCreated$lambda$6$lambda$3(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;)Ll83/a0;

    return-void
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->onViewCreated$lambda$6$lambda$4(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;)Ll83/a0;

    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryImageBinding;->photoView:Lio/getstream/photoview/PhotoView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lio/getstream/chat/android/ui/feature/gallery/internal/a;

    const/4 p1, 0x1

    invoke-direct {v4, p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;I)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/gallery/internal/a;

    const/4 p1, 0x2

    invoke-direct {v5, p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;I)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    new-instance p1, Lb30/k3;

    const/16 p2, 0x9

    invoke-direct {p1, p0, p2}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lio/getstream/photoview/PhotoView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
