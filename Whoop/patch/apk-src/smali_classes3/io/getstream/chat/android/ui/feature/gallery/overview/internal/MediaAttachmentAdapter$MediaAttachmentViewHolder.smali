.class public final Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MediaAttachmentViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u000c2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0017\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;",
        "mediaAttachmentClickListener",
        "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;)V",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
        "attachmentGalleryItem",
        "Ll83/a0;",
        "loadImage",
        "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V",
        "setupUserAvatar",
        "",
        "attachmentType",
        "setupPlayButton",
        "(Ljava/lang/String;)V",
        "setupPlayButtonIcon",
        "()V",
        "setupPlayButtonCard",
        "bind",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;",
        "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

.field private final mediaAttachmentClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;

.field private final style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaAttachmentClickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->mediaAttachmentClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->mediaContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance p2, Lb30/k3;

    const/16 p3, 0xb

    invoke-direct {p2, p0, p3}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->mediaAttachmentClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getBindingAdapterPosition()I

    move-result p0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;->onMediaAttachmentClick(I)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->loadImage$lambda$2(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)Ll83/a0;

    return-void
.end method

.method public static b(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->mediaAttachmentClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getBindingAdapterPosition()I

    move-result p0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;->onMediaAttachmentClick(I)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->loadImage$lambda$1(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;)Ll83/a0;

    return-void
.end method

.method private final loadImage(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V
    .locals 11

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getVideoThumbnailsEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v2

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_0

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getStreamCdnImageResizing()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    move-result-object v3

    invoke-static {v1, v3}, Lio/getstream/chat/android/ui/common/images/resizing/StringExtensionsKt;->applyStreamCdnImageResizingIfEnabled(Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    :goto_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->mediaImageView:Landroid/widget/ImageView;

    const-string v1, "mediaImageView"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getImagePlaceholder()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :cond_3
    move-object v5, v2

    new-instance v7, Lh02/n0;

    const/16 v0, 0x1c

    invoke-direct {v7, p0, v0}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    new-instance v8, Li01/d;

    const/16 v0, 0x11

    invoke-direct {v8, v0, p0, p1}, Li01/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v10}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    return-void
.end method

.method private static final loadImage$lambda$1(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;)Ll83/a0;
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->progressBar:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final loadImage$lambda$2(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)Ll83/a0;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->playButtonCardView:Landroidx/cardview/widget/CardView;

    const-string v1, "playButtonCardView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p1

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setupPlayButton(Ljava/lang/String;)V
    .locals 1

    const-string v0, "video"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->setupPlayButtonIcon()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->setupPlayButtonCard()V

    :cond_0
    return-void
.end method

.method private final setupPlayButtonCard()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->playButtonCardView:Landroidx/cardview/widget/CardView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getPlayVideoIconElevation()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getPlayVideoIconBackgroundColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getPlayVideoIconCornerRadius()F

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    return-void
.end method

.method private final setupPlayButtonIcon()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->playButtonImageView:Landroid/widget/ImageView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getPlayVideoButtonIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getPlayVideoIconTint()Ljava/lang/Integer;

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

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getPlayVideoIconPaddingStart()I

    move-result v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getPlayVideoIconPaddingTop()I

    move-result v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getPlayVideoIconPaddingEnd()I

    move-result v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getPlayVideoIconPaddingBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    return-void
.end method

.method private final setupUserAvatar(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V
    .locals 4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getShowUserAvatars()Z

    move-result v0

    const-string v1, "userAvatarCardView"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->userAvatarCardView:Landroidx/cardview/widget/CardView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->userAvatarCardView:Landroidx/cardview/widget/CardView;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V
    .locals 1

    const-string v0, "attachmentGalleryItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->setupUserAvatar(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->setupPlayButton(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->loadImage(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V

    return-void
.end method
