.class public final Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$AttachmentGalleryItemDiffCallback;,
        Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;,
        Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0017\u0018\u0019B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;",
        "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;",
        "mediaAttachmentClickListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;",
        "holder",
        "position",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;I)V",
        "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;",
        "MediaAttachmentViewHolder",
        "MediaAttachmentClickListener",
        "AttachmentGalleryItemDiffCallback",
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
.field private final mediaAttachmentClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;

.field private final style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaAttachmentClickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$AttachmentGalleryItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$AttachmentGalleryItemDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;->mediaAttachmentClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;

    return-void
.end method


# virtual methods
.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->bind(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    move-result-object p1

    .line 3
    new-instance p2, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;->mediaAttachmentClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;

    .line 5
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    .line 6
    invoke-direct {p2, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;)V

    return-object p2
.end method
