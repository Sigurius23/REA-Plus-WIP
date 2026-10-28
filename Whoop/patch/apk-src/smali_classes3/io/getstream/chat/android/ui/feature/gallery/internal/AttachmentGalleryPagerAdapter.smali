.class public final Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;
.super Landroidx/viewpager2/adapter/i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0015R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;",
        "Landroidx/viewpager2/adapter/i;",
        "Landroidx/fragment/app/r0;",
        "fragmentActivity",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "mediaList",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "mediaClickListener",
        "<init>",
        "(Landroidx/fragment/app/r0;Ljava/util/List;Lc93/a;)V",
        "",
        "getItemCount",
        "()I",
        "position",
        "Landroidx/fragment/app/m0;",
        "createFragment",
        "(I)Landroidx/fragment/app/m0;",
        "getItem",
        "(I)Lio/getstream/chat/android/models/Attachment;",
        "Ljava/util/List;",
        "Lc93/a;",
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
.field private final mediaClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final mediaList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r0;Ljava/util/List;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/r0;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "fragmentActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaClickListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    invoke-virtual {p1}, Lg/l;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Landroidx/viewpager2/adapter/i;-><init>(Landroidx/fragment/app/o1;Landroidx/lifecycle/x;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;->mediaList:Ljava/util/List;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;->mediaClickListener:Lc93/a;

    return-void
.end method


# virtual methods
.method public final createFragment(I)Landroidx/fragment/app/m0;
    .locals 3

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;->getItem(I)Lio/getstream/chat/android/models/Attachment;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "image"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->Companion:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;->mediaClickListener:Lc93/a;

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment$Companion;->create(Ljava/lang/String;Lc93/a;)Landroidx/fragment/app/m0;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v1, "video"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->Companion:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;->mediaClickListener:Lc93/a;

    invoke-virtual {v0, v1, p1, v2}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;->create(Ljava/lang/String;Ljava/lang/String;Lc93/a;)Landroidx/fragment/app/m0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/Throwable;

    const-string v0, "Unsupported attachment type"

    invoke-direct {p1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getItem(I)Lio/getstream/chat/android/models/Attachment;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;->mediaList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    return-object p1
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;->mediaList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
