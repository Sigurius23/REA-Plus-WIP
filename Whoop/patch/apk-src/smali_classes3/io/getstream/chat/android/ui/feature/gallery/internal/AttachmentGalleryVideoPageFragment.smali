.class public final Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J\u000f\u0010\u0008\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0003J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008#\u0010\u0003R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u001b\u0010,\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u001d\u00105\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u0010)\u001a\u0004\u00083\u00104R\u001d\u00108\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00086\u0010)\u001a\u0004\u00087\u00104R\u001c\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u0004098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010>\u001a\u00020$8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010=\u00a8\u0006@"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "setupVideoThumbnail",
        "resetState",
        "setupPlayButton",
        "setupPlayButtonIcon",
        "setupPlayButtonCard",
        "setupOnPlayButtonClickedListener",
        "Lu8/j0;",
        "player",
        "setupPlayerView",
        "(Lu8/j0;)V",
        "createPlayer",
        "()Lu8/j0;",
        "Ll9/b0;",
        "createMediaSourceFactory",
        "()Ll9/b0;",
        "onStart",
        "onPause",
        "onStop",
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
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;",
        "style$delegate",
        "Ll83/h;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;",
        "style",
        "Lu8/j0;",
        "",
        "savedPlaybackPosition",
        "J",
        "",
        "thumbUrl$delegate",
        "getThumbUrl",
        "()Ljava/lang/String;",
        "thumbUrl",
        "assetUrl$delegate",
        "getAssetUrl",
        "assetUrl",
        "Lkotlin/Function0;",
        "imageClickListener",
        "Lc93/a;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;",
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
.field private static final ARG_ASSET_URL:Ljava/lang/String; = "asset_url"

.field private static final ARG_THUMB_URL:Ljava/lang/String; = "thumb_url"

.field private static final CONTROLLER_SHOW_TIMEOUT:I = 0x7d0

.field public static final Companion:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

.field private final assetUrl$delegate:Ll83/h;

.field private imageClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private player:Lu8/j0;

.field private savedPlaybackPosition:J

.field private final style$delegate:Ll83/h;

.field private final thumbUrl$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->Companion:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/internal/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/gallery/internal/b;-><init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->style$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/internal/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/gallery/internal/b;-><init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->thumbUrl$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/internal/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/gallery/internal/b;-><init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->assetUrl$delegate:Ll83/h;

    new-instance v0, Lou1/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lou1/a;-><init>(I)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->imageClickListener:Lc93/a;

    return-void
.end method

.method public static final synthetic access$get_binding$p(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    return-object p0
.end method

.method public static final synthetic access$setImageClickListener$p(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->imageClickListener:Lc93/a;

    return-void
.end method

.method private static final assetUrl_delegate$lambda$3(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "asset_url"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final createMediaSourceFactory()Ll9/b0;
    .locals 5

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getCdn()Lio/getstream/chat/android/client/cdn/CDN;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;->INSTANCE:Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "requireContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v0}, Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;->factory(Landroid/content/Context;Lio/getstream/chat/android/client/cdn/CDN;)Lz8/e;

    move-result-object v0

    new-instance v1, Ll9/p;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lpg3/o;

    const/16 v4, 0xa

    invoke-direct {v3, v2, v4}, Lpg3/o;-><init>(Landroid/content/Context;I)V

    invoke-direct {v1, v3}, Ll9/p;-><init>(Lz8/e;)V

    iput-object v0, v1, Ll9/p;->b:Lz8/e;

    iget-object v2, v1, Ll9/p;->a:Ll9/o;

    iget-object v3, v2, Ll9/o;->e:Ljava/lang/Object;

    check-cast v3, Lz8/e;

    if-eq v0, v3, :cond_0

    iput-object v0, v2, Ll9/o;->e:Ljava/lang/Object;

    iget-object v0, v2, Ll9/o;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, v2, Ll9/o;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-object v1
.end method

.method private final createPlayer()Lu8/j0;
    .locals 4

    new-instance v0, Lb9/p;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lb9/p;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->createMediaSourceFactory()Ll9/b0;

    move-result-object v1

    check-cast v1, Ll9/p;

    iget-boolean v2, v0, Lb9/p;->u:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lva3/g;->i(Z)V

    new-instance v2, Lb9/n;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lb9/n;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Lb9/p;->d:Lyr/i;

    invoke-virtual {v0}, Lb9/p;->a()Lb9/f0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$createPlayer$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$createPlayer$1;-><init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)V

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    invoke-virtual {v2, v1}, Lx8/i;->a(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getAssetUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->assetUrl$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->style$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    return-object v0
.end method

.method private final getThumbUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->thumbUrl$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final imageClickListener$lambda$4()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private final resetState()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->thumbnailImageView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playButtonCardView:Landroidx/cardview/widget/CardView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final setupOnPlayButtonClickedListener()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playButtonCardView:Landroidx/cardview/widget/CardView;

    new-instance v1, Lb30/k3;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final setupOnPlayButtonClickedListener$lambda$10(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playerView:Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->getPlayer()Lu8/j0;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, La2/a;

    const/4 v0, 0x1

    check-cast p1, Lb9/f0;

    invoke-virtual {p1, v0}, Lb9/f0;->z0(Z)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->thumbnailImageView:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playButtonCardView:Landroidx/cardview/widget/CardView;

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final setupPlayButton()V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->setupPlayButtonIcon()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->setupPlayButtonCard()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->setupOnPlayButtonClickedListener()V

    return-void
.end method

.method private final setupPlayButtonCard()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playButtonCardView:Landroidx/cardview/widget/CardView;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconElevation()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconBackgroundColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconCornerRadius()F

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    return-void
.end method

.method private final setupPlayButtonIcon()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playButtonImageView:Landroid/widget/ImageView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconWidth()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconHeight()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoButtonIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconTint()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconPaddingStart()I

    move-result v1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconPaddingTop()I

    move-result v2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconPaddingEnd()I

    move-result v3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getStyle()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->getViewMediaPlayVideoIconPaddingBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    return-void

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final setupPlayerView(Lu8/j0;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playerView:Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->setPlayer(Lu8/j0;)V

    const/16 p1, 0x7d0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->setControllerShowTimeoutMs(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->setControllerAutoShow(Z)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->setControllerHideOnTouch(Z)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->setShowPreviousButton(Z)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->setShowNextButton(Z)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->setShowBuffering(I)V

    return-void
.end method

.method private final setupVideoThumbnail()V
    .locals 9

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getVideoThumbnailsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->thumbnailImageView:Landroid/widget/ImageView;

    const-string v0, "thumbnailImageView"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getThumbUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    :cond_0
    return-void
.end method

.method private static final style_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle$Companion;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "requireContext(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object p0

    return-object p0
.end method

.method private static final thumbUrl_delegate$lambda$2(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "thumb_url"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->setupOnPlayButtonClickedListener$lambda$10(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->style_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    return-void
.end method

.method public final onPause()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onPause()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->player:Lu8/j0;

    if-eqz v0, :cond_0

    check-cast v0, La2/a;

    const/4 v1, 0x0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v1}, Lb9/f0;->z0(Z)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->resetState()V

    return-void
.end method

.method public final onStart()V
    .locals 8

    invoke-super {p0}, Landroidx/fragment/app/m0;->onStart()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->createPlayer()Lu8/j0;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->getAssetUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lu8/x;->a(Landroid/net/Uri;)Lu8/x;

    move-result-object v1

    iget-wide v5, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->savedPlaybackPosition:J

    move-object v2, v0

    check-cast v2, La2/a;

    invoke-static {v1}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v1

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->L0()V

    invoke-virtual {v2, v1}, Lb9/f0;->T(Lzr/w0;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2}, Lb9/f0;->L0()V

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v2 .. v7}, Lb9/f0;->x0(Ljava/util/List;IJZ)V

    move-object v1, v0

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->q0()V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->setupPlayerView(Lu8/j0;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->player:Lu8/j0;

    return-void
.end method

.method public final onStop()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onStop()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->player:Lu8/j0;

    if-eqz v0, :cond_0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->a0()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    iput-wide v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->savedPlaybackPosition:J

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playerView:Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->setPlayer(Lu8/j0;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->player:Lu8/j0;

    if-eqz v0, :cond_1

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->r0()V

    :cond_1
    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->player:Lu8/j0;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->setupVideoThumbnail()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->setupPlayButton()V

    return-void
.end method
